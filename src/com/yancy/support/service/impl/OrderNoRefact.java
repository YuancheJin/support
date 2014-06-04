package com.yancy.support.service.impl;

import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Properties;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.yancy.support.action.datacheck.CheckModulesByUserEmailAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.CheckModulesService;


public class OrderNoRefact extends QuartzJobBean {
	private static BeanFactory factory = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		CheckModulesService checkModulesService = (CheckModulesService) factory
				.getBean("checkModulesService");
		
		System.out.println("成功触发 : ");
		Properties prop = new Properties();
		InputStream in = CheckModulesByUserEmailAction.class.getResourceAsStream("/time.properties");
		try {
			prop.load(in);
//			String modulesNames = prop.getProperty("wildfire_email");
//			String emails = prop.getProperty("user_email");
			
			String modulesNames ="";
			String emails ="";
			
			
			ResultSet rs=JDBC.query(JDBC.getConnectionSupport(), "select * from t_setting");
			
			if(rs.next()){ //如果有数据
				modulesNames=rs.getString("wildfire_email");
				emails=rs.getString("user_email");
				System.out.println(modulesNames);
				System.out.println(emails);
			}
			checkModulesService.startCheckModulesByUserName(modulesNames,emails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}