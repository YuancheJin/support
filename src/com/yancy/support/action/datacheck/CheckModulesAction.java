package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.CheckModulesService;

public class CheckModulesAction extends BaseAction{

	private CheckModulesService checkModulesService;
	private static final long serialVersionUID = 1L;
	//in
	private String modulesNames;
	private String email;
	//out
	public String execute() throws Exception{

		
		checkModulesService.startCheckModules(modulesNames,email);
		return Action.SUCCESS;
	}
	public String getModulesNames() {
		return modulesNames;
	}
	public void setModulesNames(String modulesNames) {
		this.modulesNames = modulesNames;
	}
	public void setCheckModulesService(CheckModulesService checkModulesService) {
		this.checkModulesService = checkModulesService;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
