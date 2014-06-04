package com.yancy.support.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.DashboardDao;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Dashboards;

public class DashboardDaoImpl extends HibernateDaoSupport implements DashboardDao {

	@SuppressWarnings("unchecked")
	public List<Dashboards> findByScope(String scope, Integer period)
			throws Exception {
//		System.err.println(scope);
//		System.err.println(period);
//		String hql="select d  from Dashboards d where d.scope =?  and d.period!='today' and d.version=0";
//		List<Dashboards> list=this.getHibernateTemplate().find(hql,new Object[]{scope});
//		return list;
		
		
		
		
		Session session=super.getSession(true);  
		//String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' or 'weibo' and a.version=0";
		String hql="select d  from Dashboards d where d.scope =?  and d.period!='today' and d.version=0";
		List<Dashboards> list=null;
		try{
			list=this.getHibernateTemplate().find(hql,new Object[]{scope});
		}finally{
			session.close();  
		}
		return list;

	}

}
