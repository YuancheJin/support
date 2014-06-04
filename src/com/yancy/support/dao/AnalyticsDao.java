package com.yancy.support.dao;

import java.util.List;

import com.yancy.support.pojo.Analytics;

public interface AnalyticsDao {

	public List<Analytics> findByScope(String scope,Integer month,Integer year,Integer day) throws Exception;

	public List<Analytics> findByScopeMonth(String scope,Integer month,Integer year,Integer day) throws Exception;
	
}
