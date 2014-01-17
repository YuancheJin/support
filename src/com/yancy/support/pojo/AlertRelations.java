package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * AlertRelations entity. @author MyEclipse Persistence Tools
 */

public class AlertRelations implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ruleId;
	private Integer conditionId;
	private String relationType;
	private Integer leftId;
	private Integer rightId;
	private String leftType;
	private String rightType;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public AlertRelations() {
	}

	/** minimal constructor */
	public AlertRelations(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public AlertRelations(Integer ruleId, Integer conditionId,
			String relationType, Integer leftId, Integer rightId,
			String leftType, String rightType, Timestamp createdAt,
			Timestamp updatedAt) {
		this.ruleId = ruleId;
		this.conditionId = conditionId;
		this.relationType = relationType;
		this.leftId = leftId;
		this.rightId = rightId;
		this.leftType = leftType;
		this.rightType = rightType;
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

	public Integer getConditionId() {
		return this.conditionId;
	}

	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}

	public String getRelationType() {
		return this.relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public Integer getLeftId() {
		return this.leftId;
	}

	public void setLeftId(Integer leftId) {
		this.leftId = leftId;
	}

	public Integer getRightId() {
		return this.rightId;
	}

	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}

	public String getLeftType() {
		return this.leftType;
	}

	public void setLeftType(String leftType) {
		this.leftType = leftType;
	}

	public String getRightType() {
		return this.rightType;
	}

	public void setRightType(String rightType) {
		this.rightType = rightType;
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