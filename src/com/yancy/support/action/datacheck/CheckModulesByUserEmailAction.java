package com.yancy.support.action.datacheck;

import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Properties;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.CheckModulesService;

public class CheckModulesByUserEmailAction extends BaseAction implements Job {
	private CheckModulesService checkModulesService;
	private static final long serialVersionUID = 1L;
	//in
	private String userEmails;
	private String email;
	private String scope;
	//out
	public String execute() throws Exception{
		
		checkModulesService.startCheckModulesByUserName(userEmails, email);
		
		return Action.SUCCESS;
	}
	

	//定时器方法
		//public void execute(JobExecutionContext arg0) throws JobExecutionException {
			public void execute(JobExecutionContext arg0) throws JobExecutionException {
			
//			String modulesNames="retailer@wildfire.asia,imf@wildfire.asia";
//			String emails="kyuanche@qq.com";
			System.out.println("1成功触发 : ");
//			Properties prop = new Properties();
//			InputStream in = CheckModulesByUserEmailAction.class.getResourceAsStream("/time.properties");
			try {
//				prop.load(in);
//				String modulesNames = prop.getProperty("wildfire_email");
//				String emails = prop.getProperty("user_email");
				String modulesNames="";
				String emails="";
				ResultSet rs=JDBC.query(JDBC.getConnectionSupport(), "select * from t_setting");
				
				if(rs.next()){ //如果有数据
					modulesNames=rs.getString("wildfire_email");
					emails=rs.getString("user_email");
					System.out.println(modulesNames);
					System.out.println(emails);
				}
				//checkModulesService=new CheckModulesServiceImpl();
				
				ApplicationContext ac = new ClassPathXmlApplicationContext(  
		                new String[]{  
		                        "/applicationContext.xml"  
		                });  
				checkModulesService=(CheckModulesService)ac.getBean("checkModulesService");
				System.out.println(checkModulesService);
				checkModulesService.startCheckModulesByUserName(modulesNames,emails);
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
	public String getUserEmails() {
		return userEmails;
	}

	public void setUserEmails(String userEmails) {
		this.userEmails = userEmails;
	}


	public void setCheckModulesService(CheckModulesService checkModulesService) {
		this.checkModulesService = checkModulesService;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}	
}
