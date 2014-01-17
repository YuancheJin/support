package com.yancy.support.pojo;

/**
 * ModuleGroupMappings entity. @author MyEclipse Persistence Tools
 */

public class ModuleGroupMappings implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private Integer moduleGroupId;

	// Constructors

	/** default constructor */
	public ModuleGroupMappings() {
	}

	/** minimal constructor */
	public ModuleGroupMappings(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public ModuleGroupMappings(String scope, Integer moduleGroupId) {
		this.scope = scope;
		this.moduleGroupId = moduleGroupId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getModuleGroupId() {
		return this.moduleGroupId;
	}

	public void setModuleGroupId(Integer moduleGroupId) {
		this.moduleGroupId = moduleGroupId;
	}

}