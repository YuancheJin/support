package com.yancy.support.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.WeiboDashboardDao;
import com.yancy.support.pojo.WeiboDashboards;

public class WeiboDashboardDaoImpl extends HibernateDaoSupport implements WeiboDashboardDao {

	@SuppressWarnings("unchecked")
	public List<WeiboDashboards> findByScope(String scope, Integer period)
			throws Exception {
		String hql="select d  from WeiboDashboards d where d.id.scope =?  and d.id.period=? and d.id.version=0";
		List<WeiboDashboards> list=this.getHibernateTemplate().find(hql,new Object[]{scope,String.valueOf(period)});
		return list;
	}

}
