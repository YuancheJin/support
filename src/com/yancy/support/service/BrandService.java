package com.yancy.support.service;

import java.util.List;

import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Dashboards;
import com.yancy.support.pojo.Modules;

public interface BrandService {

	public Integer findSolrNum(Modules module) throws Exception;
	
	public Integer findDynamoNum(Modules module) throws Exception;
	
	public Modules findModuleByName(String name) throws Exception;

	public String findScope(String name) throws Exception;
	
	public List<Dashboards> findDashboardByScope(String scope, Integer period)
			throws Exception;

	public List<Analytics> findAnalyticsByScope(String scope, Integer month,
			Integer year, Integer day) throws Exception;

	public Long findCountByScope(String scope) throws Exception;
	
	public Modules findModuleByScope(String scope) throws Exception;
}
