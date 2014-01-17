package com.yancy.support.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.WeiboThreadDao;

public class WeiboThreadDaoImpl extends HibernateDaoSupport implements  WeiboThreadDao{

	public Long findCountByScope(String scope) throws Exception {
		
		String hql="select count(id) from WeiboThreads t where t.scope=? and t.period=1 and t.version=0";

		return (Long)this.getHibernateTemplate().find(hql.toString(),new Object[]{scope}).get(0);

	}	
}
