package com.yancy.support.service;

import java.util.Map;

public interface IapService {

	public Map<String,Integer> getIapReport(int year,int month,int day,int year_,int month_,int day_) throws Exception;
	
	public boolean saveIapReport(Map<String,Integer> map)throws Exception;
	
	
	
}
