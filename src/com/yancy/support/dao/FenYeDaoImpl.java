package com.yancy.support.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.GenericValidator;

import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.BrandService;
import com.yancy.support.service.impl.BrandServiceImpl;
import com.yancy.support.vo.ErrorType;
import com.yancy.support.vo.HistoricalDataVo;


public class FenYeDaoImpl  {
	public FenYeDaoImpl(){}


	public List<HistoricalDataVo> findHistoricalDate()throws Exception{
		List values = new ArrayList();
		StringBuffer sql=new StringBuffer("select * from t_historical_data where 1=1 ");
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
			vo.setErrorMessage(rs.getString("errormessage"));
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
		StringBuffer sql=new StringBuffer("select * from t_historical_data where 1=1 ");
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
			vo.setErrorMessage(rs.getString("errormessage"));
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