package com.yancy.support.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.DashboardDao;
import com.yancy.support.pojo.Dashboards;

public class DashboardDaoImpl extends HibernateDaoSupport implements DashboardDao {

	@SuppressWarnings("unchecked")
	public List<Dashboards> findByScope(String scope, Integer period)
			throws Exception {
		System.err.println(scope);
		System.err.println(period);
		String hql="select d  from Dashboards d where d.scope =?  and d.period=? and d.version=0";
		List<Dashboards> list=this.getHibernateTemplate().find(hql,new Object[]{scope,String.valueOf(period)});
		return list;

	}

}
