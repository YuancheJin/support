package com.yancy.support.action.datacheck;

import java.util.List;
import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.service.BrandService;
import com.yancy.support.util.DateUtil;

public class AnalyticsAction extends BaseAction {
	private BrandService brandService;
	private static final long serialVersionUID = 1L;
	//in
	private String scope;
	private int month=0;
	private int year=0;
	private int day=0;
	//out
	private List<Analytics> analyticsList;
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
			analyticsList=brandService.findAnalyticsByScope(scope, month, year, day);
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
	public List<Analytics> getAnalyticsList() {
		return analyticsList;
	}
	public void setAnalyticsList(List<Analytics> analyticsList) {
		this.analyticsList = analyticsList;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
