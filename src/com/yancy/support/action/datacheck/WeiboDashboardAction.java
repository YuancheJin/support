package com.yancy.support.action.datacheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.WeiboDashboards;
import com.yancy.support.pojo.WeiboDashboardsId;
import com.yancy.support.service.WeiboService;

public class WeiboDashboardAction extends BaseAction {

	private WeiboService weiboService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	private Integer period=1;
	//out
	
	private List<WeiboDashboards> weiboDashboard;
	private List<WeiboDashboardsId> weiboDashboardId;
	private String error;
	public String execute() throws Exception{
		error=null;
		try{
			weiboDashboard=weiboService.findDashboardByScope(scope, period);
			weiboDashboardId=new ArrayList<WeiboDashboardsId>();
			//System.out.println(weiboDashboard);
			for(Iterator<WeiboDashboards> it=weiboDashboard.iterator();it.hasNext();){
				weiboDashboardId.add(it.next().getId());
			}
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

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public List<WeiboDashboards> getWeiboDashboard() {
		return weiboDashboard;
	}

	public void setWeiboDashboard(List<WeiboDashboards> weiboDashboard) {
		this.weiboDashboard = weiboDashboard;
	}

	public List<WeiboDashboardsId> getWeiboDashboardId() {
		return weiboDashboardId;
	}

	public void setWeiboDashboardId(List<WeiboDashboardsId> weiboDashboardId) {
		this.weiboDashboardId = weiboDashboardId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
}
