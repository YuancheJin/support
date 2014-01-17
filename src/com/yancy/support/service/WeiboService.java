package com.yancy.support.service;

import java.util.List;

import com.yancy.support.pojo.Modules;
import com.yancy.support.pojo.WeiboAnalytics;
import com.yancy.support.pojo.WeiboDashboards;

public interface WeiboService {
public Modules findModuleByName(String name) throws Exception;
	
	public List<WeiboDashboards> findDashboardByScope(String scope,Integer period) throws Exception;
	
	public List<WeiboAnalytics> findAnalyticsByScope(String scope, Integer month, Integer year,
			Integer day) throws Exception;
	
	public Long findCountByScope(String scope) throws Exception;
}
