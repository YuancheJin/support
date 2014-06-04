package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * ReportDefinitions entity. @author MyEclipse Persistence Tools
 */

public class ReportDefinitions implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String template;
	private String interval;
	private Timestamp startTime;
	private String title;
	private String logo;
	private String reportType;
	private Integer enable;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String period;
	private String email;
	private String scope;

	// Constructors

	/** default constructor */
	public ReportDefinitions() {
	}

	/** minimal constructor */
	public ReportDefinitions(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public ReportDefinitions(Integer userId, String template, String interval,
			Timestamp startTime, String title, String logo, String reportType,
			Integer enable, Timestamp createdAt, Timestamp updatedAt,
			String period, String email, String scope) {
		this.userId = userId;
		this.template = template;
		this.interval = interval;
		this.startTime = startTime;
		this.title = title;
		this.logo = logo;
		this.reportType = reportType;
		this.enable = enable;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.period = period;
		this.email = email;
		this.scope = scope;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}