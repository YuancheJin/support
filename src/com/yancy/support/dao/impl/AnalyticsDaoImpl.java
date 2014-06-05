package com.yancy.support.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.AnalyticsDao;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.util.DateUtil;

public class AnalyticsDaoImpl extends HibernateDaoSupport implements AnalyticsDao{

	@SuppressWarnings("unchecked")
	public List<Analytics> findByScope(String scope, Integer month, Integer year,
			Integer day) throws Exception {
		
		
		Session session=super.getSession(true);  
		//String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' or 'weibo' and a.version=0";
		String hql1="",hql2="";
		int month_=DateUtil.getTSDA(0)[1];
		if(month_>month){
			hql1="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.version=0";
			hql2="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.topic = 'all' and a.version=0";
			List<Analytics> list1=null;
			List<Analytics> list2=null;
			try{
				list1=this.getHibernateTemplate().find(hql1,new Object[]{scope,month,year,day});
				list2=this.getHibernateTemplate().find(hql2,new Object[]{scope,month_,year});
			}finally{
				session.close();  
			}
			list1.addAll(list2);
			return list1;
		}else{
			hql1="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.version=0";
			List<Analytics> list=null;
			try{
				list=this.getHibernateTemplate().find(hql1,new Object[]{scope,month,year,day});
			}finally{
				session.close();  
			}
			return list;
		}
//		hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.version=0";
		
	}
	
	public static void main(String[] args){
		
	}

	@SuppressWarnings("unchecked")
	public List<Analytics> findByScopeMonth(String scope, Integer month,
			Integer year, Integer day) throws Exception {

		
		Session session=super.getSession(true);  
		//String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' or 'weibo' and a.version=0";
		String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day =? and a.topic = 'all' and a.media = 'all'  and a.version=0";
		List<Analytics> list=null;
		try{
			list=this.getHibernateTemplate().find(hql,new Object[]{scope,month,year,day});
		}finally{
			session.close();  
		}
		return list;
	}
	
	



	
}
