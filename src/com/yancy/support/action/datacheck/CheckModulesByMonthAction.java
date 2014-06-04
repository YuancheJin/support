package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.CheckDataByMonthService;
import com.yancy.support.service.impl.CheckDataByMonthServiceImpl;

public class CheckModulesByMonthAction extends BaseAction {

	private CheckDataByMonthService checkDataService;
	private static final long serialVersionUID = 1L;
	//in
	private String userEmails; //接收邮件的邮箱
	private String email; //待检查的客户邮箱
	private int month;
	private int year;
	private int day;
	public String execute() throws Exception{
		
		checkDataService.startCheckDataByMonth(email,userEmails,year,month,day);
		return Action.SUCCESS;
	}
	

	public String getUserEmails() {
		return userEmails;
	}
	public void setUserEmails(String userEmails) {
		this.userEmails = userEmails;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}



	public void setCheckDataService(CheckDataByMonthService checkDataService) {
		this.checkDataService = checkDataService;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}

	






	
	
}
