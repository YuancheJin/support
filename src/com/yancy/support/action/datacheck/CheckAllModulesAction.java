package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.CheckModulesService;

public class CheckAllModulesAction extends BaseAction {

	private CheckModulesService checkModulesService;
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{

		checkModulesService.startCheckAllModules();
		return Action.SUCCESS;
	}

	public void setCheckModulesService(CheckModulesService checkModulesService) {
		this.checkModulesService = checkModulesService;
	}
	
	
}
