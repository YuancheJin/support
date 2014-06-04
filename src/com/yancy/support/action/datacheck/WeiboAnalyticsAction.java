package com.yancy.support.action.datacheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.WeiboAnalytics;
import com.yancy.support.pojo.WeiboAnalyticsId;
import com.yancy.support.service.WeiboService;
import com.yancy.support.util.DateUtil;

public class WeiboAnalyticsAction extends BaseAction {
	private WeiboService weiboService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	private int month=0;
	private int year=0;
	private int day=0;
	//out
	private List<WeiboAnalytics> weiboAnalyticsList;
	private List<WeiboAnalyticsId> weiboAnalyticsId;
	private String error;
	
	public String execute() throws Exception{
		error=null;
		try{
			//为了判断7天内的曲线趋势，所以选七天前的日期开始
			if(month==0||year==0||day==0){
				year=DateUtil.getTSDA(7)[0];
				month=DateUtil.getTSDA(7)[1];
				day=DateUtil.getTSDA(7)[2];
			}
			weiboAnalyticsList=weiboService.findAnalyticsByScope(scope, month, year, day);
			weiboAnalyticsId=new ArrayList<WeiboAnalyticsId>();
			for(Iterator<WeiboAnalytics> it=weiboAnalyticsList.iterator();it.hasNext();){
				weiboAnalyticsId.add(it.next().getId());
			}
		}catch(Exception e){
			error="没有数据，或查询出错！";
		}
		
		return Action.SUCCESS;
	}

	public void setWeiboService(WeiboService weiboService) {
		this.weiboService = weiboService;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public List<WeiboAnalytics> getWeiboAnalyticsList() {
		return weiboAnalyticsList;
	}

	public void setWeiboAnalyticsList(List<WeiboAnalytics> weiboAnalyticsList) {
		this.weiboAnalyticsList = weiboAnalyticsList;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public List<WeiboAnalyticsId> getWeiboAnalyticsId() {
		return weiboAnalyticsId;
	}

	public void setWeiboAnalyticsId(List<WeiboAnalyticsId> weiboAnalyticsId) {
		this.weiboAnalyticsId = weiboAnalyticsId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	

}
