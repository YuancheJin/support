package com.yancy.support.action.datacheck;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.Dashboards;
import com.yancy.support.service.BrandService;

public class DashboardAction extends BaseAction {
	private BrandService brandService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	private int period=1;
	//out
	private List<Dashboards> dashboardsList;
	private String error;
	public String execute() throws Exception{
		error=null;
		try{
			dashboardsList=brandService.findDashboardByScope(scope, period);
		}catch(Exception e){
			error="没有数据，或查询出错！";
		}
		
		return Action.SUCCESS;
		
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
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public List<Dashboards> getDashboardsList() {
		return dashboardsList;
	}
	public void setDashboardsList(List<Dashboards> dashboardsList) {
		this.dashboardsList = dashboardsList;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
}
