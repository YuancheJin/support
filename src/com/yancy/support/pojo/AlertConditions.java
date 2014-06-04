package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * AlertConditions entity. @author MyEclipse Persistence Tools
 */

public class AlertConditions implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ruleId;
	private String key;
	private Integer value;
	private String operator;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public AlertConditions() {
	}

	/** minimal constructor */
	public AlertConditions(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public AlertConditions(Integer ruleId, String key, Integer value,
			String operator, Timestamp createdAt, Timestamp updatedAt) {
		this.ruleId = ruleId;
		this.key = key;
		this.value = value;
		this.operator = operator;
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

	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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