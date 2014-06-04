package com.yancy.support.dao.redshift;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.nutz.dao.Chain;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;


public class RedShiftBasicDao<T> {

	protected Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public RedShiftBasicDao() {
		super();
        entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected Dao getDao(){
		return getDao(3);
	}
	
	private Dao getDao(int i){
		try {
			System.out.println(1);
			return new NutDao(Redshift.getDataSource(Redshift.DataBase.REDSHIFTWEIBO));
			
		} catch (Exception e) {
			System.out.println(2);
			if(i > 0){
				return getDao(--i);
			}else{
				return null;
			}

		}
	}
	
	public List<T> queryAll(){
		return (List<T>) getDao().query(entityClass, null);
	}
	
	public List<T> queryByCond(String[] condAttrs, String[] condOps, Object[] condValues){
		return (List<T>) getDao().query(entityClass, buildCond(condAttrs, condOps, condValues));
	}

    public List<T> query(Condition condition) {
        return (List<T>) getDao().query(entityClass, condition);
    }
	
	public List<T> queryBySql(String sql){
		return (List<T>) getDao().query(entityClass, Cnd.wrap(sql));
	}
	
	public void clearByCond(String[] condAttrs, String[] condOps, Object[] condValues){
		getDao().clear(entityClass, buildCond(condAttrs, condOps, condValues));
	}
	
	public int countByCond(String[] condAttrs, String[] condOps, Object[] condValues){
		return getDao().count(entityClass, buildCond(condAttrs, condOps, condValues));
	}

	public void clearAll(){
		getDao().clear(entityClass,null);
	}
	
	public void update(T model){
		getDao().update(model);
	}
	
	public void updateByCond(String attr[],Object value[],String[] condAttrs, String[] condOps, Object[] condValues){
		getDao().update(entityClass, buildUpdate(attr, value), buildCond(condAttrs, condOps, condValues));
	}
	
	public void updateAll(String attr[],Object value[]){
		getDao().update(entityClass, buildUpdate(attr, value), null);
	}
	
	public T fetch(int id){
		return (T) getDao().fetch(entityClass,id);
	}

    public void insert(T t){
        getDao().insert(t);
    }
    
    public void batchInsert(List<T> ts){
    	if(ts==null || ts.isEmpty()){
    		return;
    	}
    	Dao dao = getDao();
    	for (T t : ts) {
    		dao.fastInsert(t);
		}
    }

    public void execute(String sql){
    	getDao().execute(Sqls.create(sql));
    }

    public List<Map> executeQuery(String sql,Map<String,Object> params){
    	Sql sqlObject = Sqls.create(sql);
    	if(params!=null){
    		for (Entry<String,Object> entry : params.entrySet()) {
    			sqlObject.params().set(entry.getKey(), entry.getValue());
			}
    	}

    	final String[] selects = buildSelect(sql);
    	sqlObject.setCallback(new SqlCallback() {

    		@Override
            public Object invoke(Connection conn, ResultSet rs, Sql s) throws SQLException {
                List<Map<String,Object>> list = new LinkedList<Map<String,Object>>();
                while (rs.next()){
                	Map<String,Object> map = new HashMap<String,Object>();
                	for (String select : selects) {
                		map.put(select, rs.getObject(select));
					}
                	list.add(map);
                }
                return list;
            }

    	});
    	getDao().execute(sqlObject);
    	return sqlObject.getList(Map.class);
    }

    public List<Map> executeQueryWithKeyValue(String sql, Map<String, Object> params, final String key, final String value){
        Sql sqlObject = Sqls.create(sql);
        if(params!=null){
            for (Entry<String,Object> entry : params.entrySet()) {
                sqlObject.params().set(entry.getKey(), entry.getValue());
            }
        }
        sqlObject.setCallback(new SqlCallback() {

            @Override
            public Object invoke(Connection conn, ResultSet rs, Sql s) throws SQLException {
                List<Map<String,Object>> list = new LinkedList<Map<String,Object>>();
                Map<String,Object> map = new HashMap<String,Object>();
                while (rs.next()){
                    map.put((String) rs.getObject(key), rs.getObject(value));
                }
                list.add(map);
                return list;
            }

        });
        getDao().execute(sqlObject);
        return sqlObject.getList(Map.class);
    }
    
    private String[] buildSelect(String sql){
    	String select = sql.toLowerCase().split("select")[1].split("from")[0];
    	List<String> selects = new ArrayList<String>();
    	StringBuilder s = new StringBuilder("");
    	int count = 0;
    	for (int i = 0; i < select.length(); i++) {
			char c = select.charAt(i);
			if(c == '('){
				count ++;
			}else if (c == ')'){
				count --;
			}else{
				if(count == 0){
					if(c == ',' || i == select.length() - 1){
						if(c != ','){
							s.append(c);
						}
						if(s.indexOf("as ")>-1){
							selects.add(s.toString().split("as ")[1].trim());
						}else{
							if(s.indexOf(".")>-1){
								selects.add(s.toString().split("\\.")[1].trim());
							}else{
								selects.add(s.toString().trim());
							}
						}
						s = new StringBuilder();
					}else{
						s.append(c);
					}
				}
			}
			
		}
		return selects.toArray(new String[selects.size()]);
    }
    
	private Cnd buildCond(String[] attrs, String[] ops, Object[] values){
		Cnd cnd = null;
		for (int i = 0; i < attrs.length; i++) {
			if(cnd == null){
				cnd = Cnd.where(attrs[i], ops[i], values[i]);
			}else{
				cnd = cnd.and(attrs[i], ops[i], values[i]);
			}
		}
		return cnd;
	}
	
	private Chain buildUpdate(String attr[],Object value[]){
		Chain chain = null;
		for (int i = 0; i < attr.length; i++) {
			if(chain == null){
				chain = Chain.make(attr[i], value[i]);
			}else{
				chain = chain.add(attr[i], value[i]);
			}
		}
		return chain;
	}
	
}
