package com.yancy.support.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yancy.support.dao.ModuleDao;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Modules;

public class ModuleDaoImpl extends HibernateDaoSupport implements ModuleDao {
	
	

	@SuppressWarnings("unchecked")
	public Modules findByName(String name) throws Exception {
		try{
			String hql="from Modules m where m.name=?";
			List<Modules> list=this.getHibernateTemplate().find(hql,new Object[]{name});
			list.get(0);
			return list.get(0);
		}catch(Exception e){
			
		}
		return null;
		
		
//		Session session=super.getSession(true);  
//		String hql="from Modules m where m.name=?";
//		List<Modules> list=null;
//		try{
//			list=this.getHibernateTemplate().find(hql,new Object[]{name});
//			list.get(0);
//			return list.get(0);
//		}finally{
//			session.close();  
//		}
	}
	@SuppressWarnings("unchecked")
	public Modules findByScope(String scope) throws Exception {
		try{
			String hql="from Modules m where m.scope=?";
			List<Modules> list=this.getHibernateTemplate().find(hql,new Object[]{scope});
			list.get(0);
			return list.get(0);
		}catch(Exception e){
			
		}
		return null;
		
		
//		Session session=super.getSession(true);  
//		String hql="from Modules m where m.scope=?";
//		List<Modules> list=null;
//		try{
//			list=this.getHibernateTemplate().find(hql,new Object[]{scope});
//			list.get(0);
//			return list.get(0);
//		}finally{
//			session.close();  
//		}
		
	}

	@SuppressWarnings("unchecked")
	public String getScope(String name) throws Exception {
		try{
			String hql="select m from Modules m where m.name=? ";
			List<Modules> list=this.getHibernateTemplate().find(hql,new Object[]{name});
			Modules modules=list.get(0); 
			return modules.getScope();
		}catch(Exception e){
			
		}
		return null;
		
//		Session session=super.getSession(true);  
//		String hql="select m from Modules m where m.name=? ";
//		List<Modules> list=null;
//		try{
//			list=this.getHibernateTemplate().find(hql,new Object[]{name});
//			Modules modules=list.get(0); 
//			return modules.getScope();
//
//		}finally{
//			session.close();  
//		}
	}

	@SuppressWarnings("unchecked")
	public List<Modules> findAllModules() throws Exception {
		String hql="select m from Modules m";
		List<Modules> list=this.getHibernateTemplate().find(hql);
		return list;
	}

	
	@SuppressWarnings("unchecked")
	public List<Modules> findJoinByEmail(String email) throws Exception {
		
		try{
			System.out.println("userEmail is "+email);
			StringBuffer sql = new StringBuffer();
			sql.append("select * from modules m join user_module_map um " +
					"on m.scope=um.scope join users u on u.id=um.user_id and u.email='"+email+"'");	
			SQLQuery query = this.getSession().createSQLQuery(sql.toString());
			query.addEntity(Modules.class);
			List<Modules> list = query.list();
			return list;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		

		
	}
}
