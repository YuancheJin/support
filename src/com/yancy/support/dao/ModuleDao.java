package com.yancy.support.dao;

import java.util.List;

import com.yancy.support.pojo.Modules;

public interface ModuleDao {

	public Modules findByName(String name) throws Exception;
	
	public String getScope(String name) throws Exception;
	
	public List<Modules> findAllModules() throws Exception;
	
	public List<Modules> findJoinByEmail(String email) throws Exception;
	public Modules findByScope(String scope) throws Exception ;
	
	
}
