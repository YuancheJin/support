package com.yancy.support.service;

import java.util.List;

import com.yancy.support.pojo.Analytics;

public interface CheckDataByMonthService {

	//public void startCheckDataByMonth(String userEmails,String email,int month,int year) throws Exception;

	public  void startCheckDataByMonth(String email,String userEmails,int year,int month,int day) throws Exception;
}
