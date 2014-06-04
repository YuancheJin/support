package com.yancy.support.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.HistoricalDataService;
import com.yancy.support.vo.HistoricalDataVo;

public class HistoricalDataServiceImpl implements HistoricalDataService {

	public List<HistoricalDataVo> getHistoricalData() throws Exception {
		List<HistoricalDataVo> list = new ArrayList<HistoricalDataVo>();
		Connection connection=JDBC.getConnectionSupport();
		ResultSet rs = JDBC.query(connection,
				"select * from t_historical_data where ok=0  order by date desc");
		while (rs.next()) { // 判断是否还有下一个数据
			HistoricalDataVo vo=new HistoricalDataVo();
			
			vo.setDate(rs.getTimestamp("date"));
			vo.setDynamoNum(rs.getInt("dynamoNum"));
			vo.setName(rs.getString("name"));
			vo.setOk(rs.getInt("ok"));
			vo.setOnlynum(rs.getInt("onlynum"));
			String parent=rs.getString("parent");
			vo.setScope(rs.getString("scope"));
			if("".equals(parent)||null==parent||"null".equals(parent)){
				System.out.println(111);
				vo.setParent(vo.getScope());
			}else{
				vo.setParent(parent);
			}
			vo.setRerun(rs.getInt("rerun"));
			vo.setSolrNum(rs.getInt("solrNum"));
			vo.setStatus(rs.getInt("status"));
			vo.setThreadNum(rs.getInt("threadNum"));
			vo.setType(rs.getString("type"));
			vo.setErrorMessage(rs.getString("errormessage"));
			vo.setRecheck(rs.getInt("recheck"));
			vo.setYear(rs.getInt("year"));
			vo.setYear(rs.getInt("month"));
			vo.setYear(rs.getInt("day"));
			System.out.println("~~~~~~~~~~~~~~~~~ recheck is "+vo.getRecheck());
			list.add(vo);

		}
		connection.close();
		return list;

	}
	public static void main(String[] args) throws Exception{
		HistoricalDataServiceImpl h=new HistoricalDataServiceImpl();
		h.getHistoricalData();
	}
}