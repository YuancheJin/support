package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Modules entity. @author MyEclipse Persistence Tools
 */

public class Modules implements java.io.Serializable {

	// Fields

	private String scope;
	private String expression;
	private String parent;
	private String description;
	private Float price;
	private String moduleType;
	private String name;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Timestamp lastBasicTime;
	private Timestamp currentBasicTime;
	private Timestamp nextBasicTime;
	private Timestamp lastThreadTime;
	private Timestamp currentThreadTime;
	private Timestamp nextThreadTime;
	private Boolean enable;
	private Boolean onlynum;
	private String buzzKeyword;
	private Double relevanceFloor;
	private String highlights;
	private String relevanceTag;
	private Timestamp startAt;
	private Timestamp lastBuzzTime;
	private Timestamp currentBuzzTime;
	private Timestamp nextBuzzTime;
	private Long todayTimestamp;
	private String sites;
	private Integer moduleCategoryId;
	private String antiSites;
	private Integer status;
	private Integer priority;
	private String instance;
	private String errorLog;
	private Timestamp errorDate;

	// Constructors

	/** default constructor */
	public Modules() {
	}

	/** full constructor */
	public Modules(String expression, String parent, String description,
			Float price, String moduleType, String name, Timestamp createdTime,
			Timestamp updatedTime, Timestamp lastBasicTime,
			Timestamp currentBasicTime, Timestamp nextBasicTime,
			Timestamp lastThreadTime, Timestamp currentThreadTime,
			Timestamp nextThreadTime, Boolean enable, Boolean onlynum,
			String buzzKeyword, Double relevanceFloor, String highlights,
			String relevanceTag, Timestamp startAt, Timestamp lastBuzzTime,
			Timestamp currentBuzzTime, Timestamp nextBuzzTime,
			Long todayTimestamp, String sites, Integer moduleCategoryId,
			String antiSites, Integer status, Integer priority,
			String instance, String errorLog, Timestamp errorDate) {
		this.expression = expression;
		this.parent = parent;
		this.description = description;
		this.price = price;
		this.moduleType = moduleType;
		this.name = name;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.lastBasicTime = lastBasicTime;
		this.currentBasicTime = currentBasicTime;
		this.nextBasicTime = nextBasicTime;
		this.lastThreadTime = lastThreadTime;
		this.currentThreadTime = currentThreadTime;
		this.nextThreadTime = nextThreadTime;
		this.enable = enable;
		this.onlynum = onlynum;
		this.buzzKeyword = buzzKeyword;
		this.relevanceFloor = relevanceFloor;
		this.highlights = highlights;
		this.relevanceTag = relevanceTag;
		this.startAt = startAt;
		this.lastBuzzTime = lastBuzzTime;
		this.currentBuzzTime = currentBuzzTime;
		this.nextBuzzTime = nextBuzzTime;
		this.todayTimestamp = todayTimestamp;
		this.sites = sites;
		this.moduleCategoryId = moduleCategoryId;
		this.antiSites = antiSites;
		this.status = status;
		this.priority = priority;
		this.instance = instance;
		this.errorLog = errorLog;
		this.errorDate = errorDate;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getParent() {
		return this.parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getModuleType() {
		return this.moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Timestamp getLastBasicTime() {
		return this.lastBasicTime;
	}

	public void setLastBasicTime(Timestamp lastBasicTime) {
		this.lastBasicTime = lastBasicTime;
	}

	public Timestamp getCurrentBasicTime() {
		return this.currentBasicTime;
	}

	public void setCurrentBasicTime(Timestamp currentBasicTime) {
		this.currentBasicTime = currentBasicTime;
	}

	public Timestamp getNextBasicTime() {
		return this.nextBasicTime;
	}

	public void setNextBasicTime(Timestamp nextBasicTime) {
		this.nextBasicTime = nextBasicTime;
	}

	public Timestamp getLastThreadTime() {
		return this.lastThreadTime;
	}

	public void setLastThreadTime(Timestamp lastThreadTime) {
		this.lastThreadTime = lastThreadTime;
	}

	public Timestamp getCurrentThreadTime() {
		return this.currentThreadTime;
	}

	public void setCurrentThreadTime(Timestamp currentThreadTime) {
		this.currentThreadTime = currentThreadTime;
	}

	public Timestamp getNextThreadTime() {
		return this.nextThreadTime;
	}

	public void setNextThreadTime(Timestamp nextThreadTime) {
		this.nextThreadTime = nextThreadTime;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getOnlynum() {
		return this.onlynum;
	}

	public void setOnlynum(Boolean onlynum) {
		this.onlynum = onlynum;
	}

	public String getBuzzKeyword() {
		return this.buzzKeyword;
	}

	public void setBuzzKeyword(String buzzKeyword) {
		this.buzzKeyword = buzzKeyword;
	}

	public Double getRelevanceFloor() {
		return this.relevanceFloor;
	}

	public void setRelevanceFloor(Double relevanceFloor) {
		this.relevanceFloor = relevanceFloor;
	}

	public String getHighlights() {
		return this.highlights;
	}

	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}

	public String getRelevanceTag() {
		return this.relevanceTag;
	}

	public void setRelevanceTag(String relevanceTag) {
		this.relevanceTag = relevanceTag;
	}

	public Timestamp getStartAt() {
		return this.startAt;
	}

	public void setStartAt(Timestamp startAt) {
		this.startAt = startAt;
	}

	public Timestamp getLastBuzzTime() {
		return this.lastBuzzTime;
	}

	public void setLastBuzzTime(Timestamp lastBuzzTime) {
		this.lastBuzzTime = lastBuzzTime;
	}

	public Timestamp getCurrentBuzzTime() {
		return this.currentBuzzTime;
	}

	public void setCurrentBuzzTime(Timestamp currentBuzzTime) {
		this.currentBuzzTime = currentBuzzTime;
	}

	public Timestamp getNextBuzzTime() {
		return this.nextBuzzTime;
	}

	public void setNextBuzzTime(Timestamp nextBuzzTime) {
		this.nextBuzzTime = nextBuzzTime;
	}

	public Long getTodayTimestamp() {
		return this.todayTimestamp;
	}

	public void setTodayTimestamp(Long todayTimestamp) {
		this.todayTimestamp = todayTimestamp;
	}

	public String getSites() {
		return this.sites;
	}

	public void setSites(String sites) {
		this.sites = sites;
	}

	public Integer getModuleCategoryId() {
		return this.moduleCategoryId;
	}

	public void setModuleCategoryId(Integer moduleCategoryId) {
		this.moduleCategoryId = moduleCategoryId;
	}

	public String getAntiSites() {
		return this.antiSites;
	}

	public void setAntiSites(String antiSites) {
		this.antiSites = antiSites;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getErrorLog() {
		return this.errorLog;
	}

	public void setErrorLog(String errorLog) {
		this.errorLog = errorLog;
	}

	public Timestamp getErrorDate() {
		return this.errorDate;
	}

	public void setErrorDate(Timestamp errorDate) {
		this.errorDate = errorDate;
	}

}