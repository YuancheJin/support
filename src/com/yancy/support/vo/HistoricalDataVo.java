package com.yancy.support.vo;

import java.sql.Timestamp;
import java.util.List;

public class HistoricalDataVo {


	private int id;
	private Timestamp date;
	private int onlynum; 
	private int threadNum;//
	private int solrNum;//
	private int dynamoNum;//
	private String scope;
	private String name;
	private String type;
	private String parent;
	private int status;
	private int rerun;//
	private int ok;//
	
	private Timestamp checkDate;
	private String errorTypeId;
	private boolean ase=true;
	private int pageIndex=1;
	private int recheck;
	private int year;
	private int month;
	private int day;
	
	private double needTime;
	
	private List<ErrorMessage> errorMessage;//
	
	
	
	
	
	
	
	public double getNeedTime() {
		return needTime;
	}
	public void setNeedTime(double needTime) {
		this.needTime = needTime;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getRecheck() {
		return recheck;
	}
	public void setRecheck(int recheck) {
		this.recheck = recheck;
	}
	public Timestamp getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}
	public String getErrorTypeId() {
		return errorTypeId;
	}
	public void setErrorTypeId(String errorTypeId) {
		this.errorTypeId = errorTypeId;
	}
	public boolean isAse() {
		return ase;
	}
	public void setAse(boolean ase) {
		this.ase = ase;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getOnlynum() {
		return onlynum;
	}
	public void setOnlynum(int onlynum) {
		this.onlynum = onlynum;
	}
	public int getThreadNum() {
		return threadNum;
	}
	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}
	public int getSolrNum() {
		return solrNum;
	}
	public void setSolrNum(int solrNum) {
		this.solrNum = solrNum;
	}
	public int getDynamoNum() {
		return dynamoNum;
	}
	public void setDynamoNum(int dynamoNum) {
		this.dynamoNum = dynamoNum;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRerun() {
		return rerun;
	}
	public void setRerun(int rerun) {
		this.rerun = rerun;
	}
	public int getOk() {
		return ok;
	}
	public void setOk(int ok) {
		this.ok = ok;
	}
	public List<ErrorMessage> getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(List<ErrorMessage> errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
