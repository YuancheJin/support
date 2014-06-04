package com.yancy.support.action.datacheck;

import java.sql.ResultSet;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.util.QuartzManager;

public class TimeAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		
		
		String timeConfig="0 30 08 ? * *";
		ResultSet rs=JDBC.query(JDBC.getConnectionSupport(), "select * from t_setting");
		
		if(rs.next()){ //如果有数据
			String time=rs.getString("dailycheck_time");
			if(time!=null&&!"".equals(time)){
				timeConfig=time;
			}
			
		}
		
		System.out.println(timeConfig);
		
		QuartzManager.removeJob("1");
		QuartzManager.addJob("1","com.yancy.support.action.datacheck.CheckModulesByUserEmailAction", timeConfig);
		
		//QuartzManager.modifyJobTime("1", "0 43 01 ? * *");
		
		
		return Action.SUCCESS;
		
		
	}
}
