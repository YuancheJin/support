package com.yancy.support.service.impl;

import java.util.List;

import com.yancy.support.dao.AnalyticsDao;
import com.yancy.support.dao.DashboardDao;
import com.yancy.support.dao.ModuleDao;
import com.yancy.support.dao.ThreadsDao;
import com.yancy.support.dao.dynamo.DynamoDBService;
import com.yancy.support.dao.solr.SolrService;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Dashboards;
import com.yancy.support.pojo.Modules;
import com.yancy.support.service.BrandService;
import com.yancy.support.util.DateUtil;

public class BrandServiceImpl implements BrandService{
	private ModuleDao moduleDao;
	private DashboardDao dashboardDao;
	private AnalyticsDao analyticsDao;
	private ThreadsDao threadsDao;
	
	public Modules findModuleByName(String name) throws Exception{
		return moduleDao.findByName(name);
	}
	public String findScope(String name) throws Exception {
		// TODO Auto-generated method stub
		return moduleDao.getScope(name);
	}
	public List<Dashboards> findDashboardByScope(String scope,Integer period) throws Exception{
		return dashboardDao.findByScope(scope, period);
	}
	
	public List<Analytics> findAnalyticsByScope(String scope, Integer month, Integer year,
			Integer day) throws Exception{
		return analyticsDao.findByScope(scope, month, year, day);
	}
	
	public Long findCountByScope(String scope) throws Exception {
		
		return threadsDao.findCountByScope(scope);
	}
	public Integer findDynamoNum(Modules module) throws Exception {

		DynamoDBService dms=new DynamoDBService();
		int n=dms.queryBuzzDistributionByDay(module, DateUtil.getTSDA(0)[0], DateUtil.getTSDA(0)[1], DateUtil.getTSDA(0)[2]);
		
		return n;
	}
	public Integer findSolrNum(Modules module) throws Exception {
		
		SolrService solrService=new SolrService();
		int n=solrService.getSolrByDay(module.getExpression(), module.getSites(), DateUtil.getTSDA(1)[0], DateUtil.getTSDA(1)[1], DateUtil.getTSDA(1)[2]);
		return n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setModuleDao(ModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}
	public void setDashboardDao(DashboardDao dashboardDao) {
		this.dashboardDao = dashboardDao;
	}
	public void setAnalyticsDao(AnalyticsDao analyticsDao) {
		this.analyticsDao = analyticsDao;
	}
	public void setThreadsDao(ThreadsDao threadsDao) {
		this.threadsDao = threadsDao;
	}



	
}
