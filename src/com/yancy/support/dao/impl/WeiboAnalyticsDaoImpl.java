package com.yancy.support.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.WeiboAnalyticsDao;
import com.yancy.support.pojo.WeiboAnalytics;

public class WeiboAnalyticsDaoImpl extends HibernateDaoSupport implements WeiboAnalyticsDao{

	@SuppressWarnings({ "unchecked" })
	public List<WeiboAnalytics> findByScope(String scope, Integer month,
			Integer year, Integer day) throws Exception {


		String hql="select a from WeiboAnalytics a where a.id.scope =? and a.id.month=? and a.id.year  =? and a.id.day >=? and  a.id.media = 'weibo'  and a.id.version=0";
		List<WeiboAnalytics> list=this.getHibernateTemplate().find(hql,new Object[]{scope,month,year,day});
		return list;
	}

}
