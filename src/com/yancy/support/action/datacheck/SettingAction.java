package com.yancy.support.action.datacheck;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;

public class SettingAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	//in
	private String wildfire_email;
	private String user_email;
	private String dailycheck_time;
	
	private int status=0;
	//out
	public String execute() throws Exception{
		
		if(null==wildfire_email||"".equals(wildfire_email)||"null".equals(wildfire_email)){
			System.out.println(1111);
			Connection connection=JDBC.getConnectionSupport();
			ResultSet rs=JDBC.query(connection, "select * from t_setting");
			if(rs.next()){ //如果有数据
				wildfire_email=rs.getString("wildfire_email");
				user_email=rs.getString("user_email");
				dailycheck_time=rs.getString("dailycheck_time");
				System.out.println(wildfire_email);
				System.out.println(user_email);
				System.out.println(dailycheck_time);
			}
			connection.close();
		}else{
			JDBC.update(JDBC.getConnectionSupport(), "update t_setting set wildfire_email='"+wildfire_email+"',user_email='"+user_email+"' ,dailycheck_time='"+dailycheck_time+"' where id=1");
		}
//		System.out.println("status = "+status);
//		if(status==0){  //查询操作
//			Connection connection=JDBC.getConnectionSupport();
//			ResultSet rs=JDBC.query(connection, "select * from t_setting");
//			if(rs.next()){ //如果有数据
//				wildfire_email=rs.getString("wildfire_email");
//				user_email=rs.getString("user_email");
//				dailycheck_time=rs.getString("dailycheck_time");
//				System.out.println(wildfire_email);
//				System.out.println(user_email);
//				System.out.println(dailycheck_time);
//			}
//			connection.close();
//		}
//		else if(status==1){   //更新操作
//			JDBC.update(JDBC.getConnectionSupport(), "update t_setting set wildfire_email='"+wildfire_email+"',user_email='"+user_email+"' ,dailycheck_time='"+dailycheck_time+"' where id=1");
//		}
		return Action.SUCCESS;
	}
	public String getWildfire_email() {
		return wildfire_email;
	}
	public void setWildfire_email(String wildfire_email) {
		this.wildfire_email = wildfire_email;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getDailycheck_time() {
		return dailycheck_time;
	}
	public void setDailycheck_time(String dailycheck_time) {
		this.dailycheck_time = dailycheck_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
