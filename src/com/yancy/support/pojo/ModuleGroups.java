package com.yancy.support.pojo;

/**
 * ModuleGroups entity. @author MyEclipse Persistence Tools
 */

public class ModuleGroups implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String groupType;
	private String description;

	// Constructors

	/** default constructor */
	public ModuleGroups() {
	}

	/** full constructor */
	public ModuleGroups(String name, String groupType, String description) {
		this.name = name;
		this.groupType = groupType;
		this.description = description;
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

	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}