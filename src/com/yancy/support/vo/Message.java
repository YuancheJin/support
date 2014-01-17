package com.yancy.support.vo;

import java.util.List;

import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Dashboards;
import com.yancy.support.pojo.Modules;

public class Message {

	private Modules modules;
	private Long threads;
	private List<Dashboards> dashboardsList;
	private List<Analytics> analyticsList;
	private StringBuffer message;
	private Integer solrNum;
	private Integer dynamoDbNum;
	
	public Modules getModules() {
		return modules;
	}
	public void setModules(Modules modules) {
		this.modules = modules;
	}
	public Long getThreads() {
		return threads;
	}
	public void setThreads(Long threads) {
		this.threads = threads;
	}
	public List<Dashboards> getDashboardsList() {
		return dashboardsList;
	}
	public void setDashboardsList(List<Dashboards> dashboardsList) {
		this.dashboardsList = dashboardsList;
	}
	public List<Analytics> getAnalyticsList() {
		return analyticsList;
	}
	public void setAnalyticsList(List<Analytics> analyticsList) {
		this.analyticsList = analyticsList;
	}
	public StringBuffer getMessage() {
		return message;
	}
	public void setMessage(StringBuffer message) {
		this.message = message;
	}
	public Integer getSolrNum() {
		return solrNum;
	}
	public void setSolrNum(Integer solrNum) {
		this.solrNum = solrNum;
	}
	public Integer getDynamoDbNum() {
		return dynamoDbNum;
	}
	public void setDynamoDbNum(Integer dynamoDbNum) {
		this.dynamoDbNum = dynamoDbNum;
	}
	
	
	
}
