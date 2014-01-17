package com.yancy.support.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.yancy.support.dao.ModuleDao;
import com.yancy.support.pojo.Modules;

public class ModuleDaoImpl extends HibernateDaoSupport implements ModuleDao {

	@SuppressWarnings("unchecked")
	public Modules findByName(String name) throws Exception {
		try{
			String hql="from Modules m where m.name=?";
			List<Modules> list=this.getHibernateTemplate().find(hql,new Object[]{name});
			list.get(0);
			return list.get(0);
		}catch(Exception e){
			
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public String getScope(String name) throws Exception {
		try{
			String hql="select m from Modules m where m.name=? ";
			List<Modules> list=this.getHibernateTemplate().find(hql,new Object[]{name});
			Modules modules=list.get(0); 
			return modules.getScope();
		}catch(Exception e){
			
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Modules> findAllModules() throws Exception {
		String hql="select m from Modules m";
		List<Modules> list=this.getHibernateTemplate().find(hql);
		return list;
	}
}
