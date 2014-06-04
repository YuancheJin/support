package com.yancy.support.pojo;

/**
 * AlertGroupMappings entity. @author MyEclipse Persistence Tools
 */

public class AlertGroupMappings implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer alertRuleId;
	private Integer moduleGroupId;

	// Constructors

	/** default constructor */
	public AlertGroupMappings() {
	}

	/** minimal constructor */
	public AlertGroupMappings(Integer alertRuleId) {
		this.alertRuleId = alertRuleId;
	}

	/** full constructor */
	public AlertGroupMappings(Integer alertRuleId, Integer moduleGroupId) {
		this.alertRuleId = alertRuleId;
		this.moduleGroupId = moduleGroupId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAlertRuleId() {
		return this.alertRuleId;
	}

	public void setAlertRuleId(Integer alertRuleId) {
		this.alertRuleId = alertRuleId;
	}

	public Integer getModuleGroupId() {
		return this.moduleGroupId;
	}

	public void setModuleGroupId(Integer moduleGroupId) {
		this.moduleGroupId = moduleGroupId;
	}

}