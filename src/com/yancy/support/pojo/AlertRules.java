package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * AlertRules entity. @author MyEclipse Persistence Tools
 */

public class AlertRules implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer userId;
	private String scope;
	private String site;
	private String topic;
	private String period;
	private Boolean singleThread;
	private Boolean sendEmail;
	private Boolean enable;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer level;
	private Boolean filtered;

	// Constructors

	/** default constructor */
	public AlertRules() {
	}

	/** minimal constructor */
	public AlertRules(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public AlertRules(String name, Integer userId, String scope, String site,
			String topic, String period, Boolean singleThread,
			Boolean sendEmail, Boolean enable, Timestamp createdAt,
			Timestamp updatedAt, Integer level, Boolean filtered) {
		this.name = name;
		this.userId = userId;
		this.scope = scope;
		this.site = site;
		this.topic = topic;
		this.period = period;
		this.singleThread = singleThread;
		this.sendEmail = sendEmail;
		this.enable = enable;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.level = level;
		this.filtered = filtered;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Boolean getSingleThread() {
		return this.singleThread;
	}

	public void setSingleThread(Boolean singleThread) {
		this.singleThread = singleThread;
	}

	public Boolean getSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Boolean getFiltered() {
		return this.filtered;
	}

	public void setFiltered(Boolean filtered) {
		this.filtered = filtered;
	}

}