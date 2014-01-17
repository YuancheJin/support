package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.WeiboService;

public class WeiboThreadsAction extends BaseAction {

	private WeiboService weiboService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	//out
	private Long numCount;
	private String error;
	
	public String execute() throws Exception{
		error=null;
		try{
			numCount=weiboService.findCountByScope(scope);
		}catch(Exception e){
			error="没有数据，或查询出错！";
		}
		
		return Action.SUCCESS;
	}
	public void setWeiboService(WeiboService weiboService) {
		
		this.weiboService = weiboService;
		
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Long getNumCount() {
		return numCount;
	}

	public void setNumCount(Long numCount) {
		this.numCount = numCount;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
