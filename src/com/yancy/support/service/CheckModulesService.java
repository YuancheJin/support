package com.yancy.support.service;

public interface CheckModulesService {

	public void startCheckModules(String modulesNames,String email,String scope) throws Exception;

//	public void startCheckAllModules() throws Exception;
	public void startCheckModulesByUserName(String userEmails,String email) throws Exception;
//	public void reRunErrorModules(String modules) throws Exception;
	
}
