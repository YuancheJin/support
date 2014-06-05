package com.yancy.support.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.HistoricalDataService;
import com.yancy.support.vo.ErrorMessage;
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
			
			vo.setRecheck(rs.getInt("recheck"));
			vo.setYear(rs.getInt("year"));
			vo.setYear(rs.getInt("month"));
			vo.setYear(rs.getInt("day"));
//			vo.setErrorMessage(rs.getString("errormessage"));
			vo.setErrorMessage(getNewErrorMessage(rs.getString("errormessage")));
			list.add(vo);

		}
		connection.close();
		return list;

	}
	public  List<ErrorMessage>  getNewErrorMessage(String errormessage){
		ArrayList<ErrorMessage> list=new ArrayList<ErrorMessage>();
		String[] messageArray=errormessage.split(";");
		for(String str:messageArray){
			if(!"".equals(str)){
				ErrorMessage errorMessage=new ErrorMessage();
				if(str.equals("从未正常跑过")||str.equals("数据正在跑")||str.equals("跑数据出错")||str.equals("yesterday 为 X月X日")||str.equals("overview和analytics数据不一致")||str.equals("threads列表和analytics数据不一致")
						||str.equals("RDS数据库连接超时")||str.equals("Solr/RS连接请求超时")||str.equals("其他catch的异常")){
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
//	public static void main(String[] args) throws Exception{
//		String str="从未正常跑过;RDS数据库连接超时;其他;";
//		List<ErrorMessage> list=getNewErrorMessage(str);
//		for(ErrorMessage errorMessage:list){
//			System.out.println(errorMessage.getId());
//			System.out.println(errorMessage.getErrorMessage());
//			;
//			;
//		}
//	}
}