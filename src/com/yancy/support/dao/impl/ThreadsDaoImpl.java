package com.yancy.support.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.ThreadsDao;


public class ThreadsDaoImpl extends HibernateDaoSupport implements ThreadsDao {

	public Long findCountByScope(String scope) throws Exception {
		
		String hql="select count(id) from Threads t where t.scope=? and t.period=1 and t.version=0";

		return (Long)this.getHibernateTemplate().find(hql.toString(),new Object[]{scope}).get(0);

	}

}
