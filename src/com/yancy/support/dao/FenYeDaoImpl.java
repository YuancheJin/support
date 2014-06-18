package com.yancy.support.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.util.DateTest;
import com.yancy.support.util.DateUtil;
import com.yancy.support.vo.ErrorMessage;
import com.yancy.support.vo.HistoricalDataVo;


public class FenYeDaoImpl  {
	public FenYeDaoImpl(){}

	public  List<ErrorMessage>  getNewErrorMessage(String errormessage){
		ArrayList<ErrorMessage> list=new ArrayList<ErrorMessage>();
		String[] messageArray=errormessage.split(";");
		for(String str:messageArray){
			if(!"".equals(str)){
				ErrorMessage errorMessage=new ErrorMessage();
				if(str.equals("Ππ从未正常跑过")||str.equals("Ππ数据正在跑")||str.equals("Ππ跑数据出错")||str.equals("Ππyesterday 为 X月X日")||str.equals("Ππoverview和analytics数据不一致")||str.equals("Ππthreads列表和analytics数据不一致")
						||str.equals("ΠπSolr/RS连接请求超时")||str.equals("Ππredshift连接请求超时")||str.equals("Ππ其他catch的异常")){
					errorMessage.setId(1);
					errorMessage.setErrorMessage(str);
				}else{
					errorMessage.setId(2);
					errorMessage.setErrorMessage(str);
				}
				list.add(errorMessage);
			}
		}
		
		return list;
	}
	public static void main(String[] args) throws Exception{
		int yeary=DateUtil.getTSDA(3)[0];
		int monthm=DateUtil.getTSDA(3)[1];
		int dayd=DateUtil.getTSDA(3)[2];
		String time=yeary+"-"+monthm+"-"+dayd+" 00:00:00";
		System.out.println(time);
		List values = new ArrayList();
		StringBuffer sql=new StringBuffer("select * from t_historical_data where date>='"+time+"' order by date desc ");
		Connection connection=JDBC.getConnectionSupport();
		ResultSet rs=JDBC.query(connection, sql.toString());
		int x=0;
		while(rs.next()){
			x++;
		}
//		System.out.println(before3Day);
		System.out.println(x);
	}
	public List<HistoricalDataVo> findHistoricalDate()throws Exception{
		
//		int yeary=DateUtil.getTSDA(0)[0];
//		int monthm=DateUtil.getTSDA(0)[1];
//		int dayd=DateUtil.getTSDA(0)[2];
//		System.out.println("year="+yeary+" month="+monthm+" day="+dayd);	
//		//删除30天前的数据
//		Date before3Day=DateTest.getDate(dayd+"-"+monthm+"-"+yeary,3);
		int yeary=DateUtil.getTSDA(3)[0];
		int monthm=DateUtil.getTSDA(3)[1];
		int dayd=DateUtil.getTSDA(3)[2];
		String time=yeary+"-"+monthm+"-"+dayd+" 00:00:00";
		System.out.println(time);
		
		List values = new ArrayList();
		StringBuffer sql=new StringBuffer("select * from t_historical_data where date>='"+time+"' order by date desc ");
		Connection connection=JDBC.getConnectionSupport();
		ResultSet rs=JDBC.query(connection, sql.toString());
		while (rs.next()) { // 判断是否还有下一个数据
			HistoricalDataVo vo=new HistoricalDataVo();
			
			vo.setDate(rs.getTimestamp("date"));
			vo.setDynamoNum(rs.getInt("dynamoNum"));
			vo.setName(rs.getString("name"));
			vo.setOnlynum(rs.getInt("onlynum"));
			
			String parent=rs.getString("parent");
			if("".equals(parent)||null==parent||"null".equals(parent)){
				vo.setParent(rs.getString("scope"));
			}else{
				vo.setParent(parent);
			}
			vo.setScope(rs.getString("scope"));
			vo.setSolrNum(rs.getInt("solrNum"));
			vo.setStatus(rs.getInt("status"));
			vo.setThreadNum(rs.getInt("threadNum"));
			vo.setType(rs.getString("type"));
			vo.setErrorMessage(getNewErrorMessage(rs.getString("errormessage")));
			vo.setCheckDate(rs.getTimestamp("checkdate"));
			vo.setYear(rs.getInt("year"));
			vo.setMonth(rs.getInt("month"));
			vo.setDay(rs.getInt("day"));
			
			
			double needTime=0;
			if(vo.getOnlynum()==1){
				needTime=(double)(vo.getSolrNum()+vo.getDynamoNum())/500;
			}else{
				needTime=(double)(vo.getSolrNum())/500;
			}
			
			
			vo.setNeedTime(needTime);
			
			values.add(vo);

		}
		connection.close();
		return values;
		
	}
	
	public List<HistoricalDataVo> findHistoricalDate(String scope, Timestamp date, int type,
			int firstResult, int maxResult)  throws Exception{
		
		
		
		List values = new ArrayList();
		StringBuffer sql=new StringBuffer("select * from t_historical_data where 1=1 order by date desc");
		if(!"".equals(scope)&&null!=scope)
			sql.append("and scope='"+scope+"' ");
		if(!"".equals(date)&&null!=date)
			sql.append("and date='"+date+"' ");
		if(type!=0)
			sql.append("and error_type_id like '%"+type+"%' ");
		
		sql.append("order by date desc ");
		sql.append("limit "+firstResult+","+maxResult+" ");
		System.out.println(sql.toString());
		Connection connection=JDBC.getConnectionSupport();
		ResultSet rs=JDBC.query(connection, sql.toString());
		
		while (rs.next()) { // 判断是否还有下一个数据
			HistoricalDataVo vo=new HistoricalDataVo();
			
			vo.setDate(rs.getTimestamp("date"));
			vo.setDynamoNum(rs.getInt("dynamoNum"));
			vo.setName(rs.getString("name"));
			vo.setOnlynum(rs.getInt("onlynum"));
			
			String parent=rs.getString("parent");
			if("".equals(parent)||null==parent||"null".equals(parent)){
				vo.setParent(rs.getString("scope"));
			}else{
				vo.setParent(parent);
			}
			vo.setScope(rs.getString("scope"));
			vo.setSolrNum(rs.getInt("solrNum"));
			vo.setStatus(rs.getInt("status"));
			vo.setThreadNum(rs.getInt("threadNum"));
			vo.setType(rs.getString("type"));
			vo.setErrorMessage(getNewErrorMessage(rs.getString("errormessage")));
			vo.setCheckDate(rs.getTimestamp("checkdate"));
			vo.setYear(rs.getInt("year"));
			vo.setMonth(rs.getInt("month"));
			vo.setDay(rs.getInt("day"));
			
			
			double needTime=0;
			if(vo.getOnlynum()==1){
				needTime=(double)(vo.getSolrNum()+vo.getDynamoNum())/500;
			}else{
				needTime=(double)(vo.getSolrNum())/500;
			}
			
			
			vo.setNeedTime(needTime);
			
			values.add(vo);

		}
		connection.close();
		return values;
		
	}

	public long findHistoricalDateCount(String scope, Timestamp date, int type)  throws Exception{
		long row=0;
		StringBuffer sql=new StringBuffer("select * from t_historical_data where 1=1 ");
		if(!"".equals(scope)&&null!=scope)
			sql.append("and scope='"+scope+"' ");
		if(!"".equals(date)&&null!=date)
			sql.append("and date='"+date+"' ");
		if(type!=0)
			sql.append("and error_type_id like '%"+type+"%' ");

		System.out.println(sql.toString());
		Connection connection=JDBC.getConnectionSupport();
		ResultSet rs=JDBC.query(connection, sql.toString());

		try {
			while(rs.next()){
				row++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connection.close();
		return row;
}
}