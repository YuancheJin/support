package com.yancy.support.action.datacheck;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.vo.ChartData;

public class HistoricalChartAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	//output json
	private boolean ok=false;
	private List<ChartData> list=new ArrayList<ChartData>();
	private Map<String,Integer> map=new HashMap<String,Integer>();
	public static void main(String[] args) throws Exception{
		
		for(int i=3;i<=17;i++){
			Connection connection=JDBC.getConnectionSupport();
			String sql_="select id from (select id from t_historical_data where year=2014 and month=6 and day="+i+" group by scope having count(scope)>1 ) as a";
			ResultSet rs_=JDBC.query(connection, sql_);
			while(rs_.next()){
				int id=rs_.getInt("id");
				String sql_2="delete from t_historical_data where id="+id;
				Connection connection_=JDBC.getConnectionSupport();
				JDBC.delete(connection_,sql_2);
				connection_.close();
			}
		}
		
		
	}
	public String execute() throws Exception{
		
		Connection connection=JDBC.getConnectionSupport();
		
		
		
		StringBuffer sql=new StringBuffer("select count(*) sum ,year,month,day from t_historical_data where 1=1 group by year+month+day");
		
		ResultSet rs=JDBC.query(connection, sql.toString());
//		List<ChartData> list=new ArrayList<ChartData>();
		while (rs.next()) {
			ChartData chartData=new ChartData();
			int sum=rs.getInt("sum");
			int year=rs.getInt("year");
			int month=rs.getInt("month");
			int day=rs.getInt("day");
			map.put(year+"."+month+"."+day,sum);
			chartData.setDate(year+"."+month+"."+day);
			chartData.setSum(sum);
			list.add(chartData);
			
			
		}
		
		connection.close();
		
//		for(ChartData data: list){
//			System.out.println(data.getDate());
//			System.out.println(data.getSum());
//		}
		
		return Action.SUCCESS;
	}
	public List<ChartData> getList() {
		return list;
	}
	public void setList(List<ChartData> list) {
		this.list = list;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
}
