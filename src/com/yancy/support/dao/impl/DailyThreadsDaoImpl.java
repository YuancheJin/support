package com.yancy.support.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yancy.support.dao.DailyThreadsDao;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.DailyThreads;
import com.yancy.support.util.DateUtil;

public class DailyThreadsDaoImpl extends HibernateDaoSupport implements DailyThreadsDao {

	@Override
	public String[] findTopicFromDailyThreads(String scope) throws Exception {


//		String hql="select d  from DailyThreads d where d.scope=? and d.date>=? GROUP BY topic";
//		
//		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//		int year=DateUtil.getTSDA(1)[0];
//		int month=DateUtil.getTSDA(1)[1];
//		int day=DateUtil.getTSDA(1)[2];
//		Date myDate1 = dateFormat1.parse(year+"-"+month+"-"+day);
//		//System.out.println(myDate1);
//		List<DailyThreads> list=this.getHibernateTemplate().find(hql,new Object[]{scope,myDate1});
//		Set<String> hashList=new HashSet<String>();
//		for(DailyThreads d:list){
//			hashList.add(d.getTopic());
//		}
//		String[] str=new String[hashList.size()]; int i=0;
//		for(String s:hashList){
//			str[i]=s;
//			i++;
//		}
//		return str;
		
		Session session=super.getSession(true);  
		//String hql="select a from Analytics a where a.scope =? and a.month=? and a.year  =? and a.day >=? and a.topic = 'all' and a.media = 'all' or 'weibo' and a.version=0";
		String hql="select d  from DailyThreads d where d.scope=? and d.date>=? GROUP BY topic";
		List<DailyThreads> list=null;
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		int year=DateUtil.getTSDA(1)[0];
		int month=DateUtil.getTSDA(1)[1];
		int day=DateUtil.getTSDA(1)[2];
		Date myDate1 = dateFormat1.parse(year+"-"+month+"-"+day);
		String[] str=null;
		try{
			list=this.getHibernateTemplate().find(hql,new Object[]{scope,myDate1});
			Set<String> hashList=new HashSet<String>();
			for(DailyThreads d:list){
				hashList.add(d.getTopic());
			}
			str=new String[hashList.size()]; int i=0;
			for(String s:hashList){
				str[i]=s;
				i++;
			}
		}finally{
			session.close();  
		}
		return str;
	}
	public static void main(String[] args) throws Exception{
		
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		int year=DateUtil.getTSDA(1)[0];
		int month=DateUtil.getTSDA(1)[1];
		int day=DateUtil.getTSDA(1)[2];
		Date myDate1 = dateFormat1.parse(year+"-"+month+"-"+day);
		System.out.println(myDate1);
	}
	
}
