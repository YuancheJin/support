package com.yancy.support.service.impl;

import java.util.List;

import com.yancy.support.dao.ModuleDao;
import com.yancy.support.dao.WeiboAnalyticsDao;
import com.yancy.support.dao.WeiboDashboardDao;
import com.yancy.support.dao.WeiboThreadDao;
import com.yancy.support.pojo.Modules;
import com.yancy.support.pojo.WeiboAnalytics;
import com.yancy.support.pojo.WeiboDashboards;
import com.yancy.support.service.WeiboService;

public class WeiboServiceImpl implements WeiboService {
	private ModuleDao moduleDao;
	private WeiboDashboardDao weiboDashboardDao;
	private WeiboAnalyticsDao weiboAnalyticsDao;
	private WeiboThreadDao weiboThreadDao;
	
	public List<WeiboAnalytics> findAnalyticsByScope(String scope, Integer month,
			Integer year, Integer day) throws Exception {
		
		return weiboAnalyticsDao.findByScope(scope, month, year, day) ;
	}

	public Long findCountByScope(String scope) throws Exception {
		
		return weiboThreadDao.findCountByScope(scope);
	}

	public List<WeiboDashboards> findDashboardByScope(String scope, Integer period)
			throws Exception {
		
		return weiboDashboardDao.findByScope(scope, period);
	}

	public Modules findModuleByName(String name) throws Exception {
		
		return moduleDao.findByName(name);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setModuleDao(ModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	public void setWeiboDashboardDao(WeiboDashboardDao weiboDashboardDao) {
		this.weiboDashboardDao = weiboDashboardDao;
	}

	public void setWeiboAnalyticsDao(WeiboAnalyticsDao weiboAnalyticsDao) {
		this.weiboAnalyticsDao = weiboAnalyticsDao;
	}

	public void setWeiboThreadDao(WeiboThreadDao weiboThreadDao) {
		this.weiboThreadDao = weiboThreadDao;
	}




	
	
	
}
