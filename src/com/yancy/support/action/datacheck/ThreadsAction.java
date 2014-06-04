package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.BrandService;

public class ThreadsAction extends BaseAction{
	private BrandService brandService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	//out
	private Long threadsCount;
	private String error;
	
	public String execute() throws Exception{
		error=null;
		try{
			threadsCount=brandService.findCountByScope(scope);
		}catch(Exception e){
			error="没有数据，或查询出错！";
		}
		
		return Action.SUCCESS;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Long getThreadsCount() {
		return threadsCount;
	}

	public void setThreadsCount(Long threadsCount) {
		this.threadsCount = threadsCount;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
