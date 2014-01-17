package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * AlertDetails entity. @author MyEclipse Persistence Tools
 */

public class AlertDetails implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer alertConditionId;
	private Integer alertId;
	private String threadId;
	private String realValue;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public AlertDetails() {
	}

	/** minimal constructor */
	public AlertDetails(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public AlertDetails(Integer alertConditionId, Integer alertId,
			String threadId, String realValue, Timestamp createdAt,
			Timestamp updatedAt) {
		this.alertConditionId = alertConditionId;
		this.alertId = alertId;
		this.threadId = threadId;
		this.realValue = realValue;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAlertConditionId() {
		return this.alertConditionId;
	}

	public void setAlertConditionId(Integer alertConditionId) {
		this.alertConditionId = alertConditionId;
	}

	public Integer getAlertId() {
		return this.alertId;
	}

	public void setAlertId(Integer alertId) {
		this.alertId = alertId;
	}

	public String getThreadId() {
		return this.threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public String getRealValue() {
		return this.realValue;
	}

	public void setRealValue(String realValue) {
		this.realValue = realValue;
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

}