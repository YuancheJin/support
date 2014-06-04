package com.yancy.support.dao;

import java.util.List;

import com.yancy.support.pojo.WeiboAnalytics;

public interface WeiboAnalyticsDao {
	
	public List<WeiboAnalytics> findByScope(String scope,Integer month,Integer year,Integer day) throws Exception;

}
