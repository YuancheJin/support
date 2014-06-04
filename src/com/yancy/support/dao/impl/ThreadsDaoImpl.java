package com.yancy.support.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.ThreadsDao;
import com.yancy.support.pojo.Threads;


public class ThreadsDaoImpl extends HibernateDaoSupport implements ThreadsDao {

	public Long findCountByScope(String scope) throws Exception {
		
//		String hql="select count(id) from Threads t where t.scope=? and t.period=1 and t.version=0";
//
//		return (Long)this.getHibernateTemplate().find(hql.toString(),new Object[]{scope}).get(0);
		
		
		
		Session session=super.getSession(true);  
		//String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' or 'weibo' and a.version=0";
		String hql="select count(id) from Threads t where t.scope=? and t.period=1 and t.version=0";
		List<Threads> list=null;
		try{
			return (Long)this.getHibernateTemplate().find(hql.toString(),new Object[]{scope}).get(0);
		}finally{
			session.close();  
		}
		
		

	}

}
