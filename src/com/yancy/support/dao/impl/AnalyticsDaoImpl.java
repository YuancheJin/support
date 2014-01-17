package com.yancy.support.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.AnalyticsDao;
import com.yancy.support.pojo.Analytics;

public class AnalyticsDaoImpl extends HibernateDaoSupport implements AnalyticsDao{

	@SuppressWarnings("unchecked")
	public List<Analytics> findByScope(String scope, Integer month, Integer year,
			Integer day) throws Exception {
		String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' and a.filtered = 0  and a.version=0";
		List<Analytics> list=this.getHibernateTemplate().find(hql,new Object[]{scope,month,year,day});
		return list;
	}

	
}
