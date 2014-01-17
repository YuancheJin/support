package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.Modules;
import com.yancy.support.service.BrandService;

public class GetScopeAction extends BaseAction{
	private BrandService brandService;
	
	private static final long serialVersionUID = 1L;
	//in
	private String moduleName;
	//out
	private String scope;
	private String error;
	public String execute() throws Exception{
		error=null;
		try{
			Modules modules=brandService.findModuleByName(moduleName);
			scope=modules.getScope();
			if("brand".equals(modules.getModuleType())){
				return Action.SUCCESS;
			}
			else if("weibo".equals(modules.getModuleType())){
				return "weibo";
			}else{
				return Action.SUCCESS; //暂时只处理 brand 以及weibo
			}
		}catch(Exception e){
			error="找不到以这个名字命名的module！";
			return Action.SUCCESS;
		}
		
		
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
