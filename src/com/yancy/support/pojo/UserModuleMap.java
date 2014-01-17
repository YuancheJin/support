package com.yancy.support.pojo;

/**
 * UserModuleMap entity. @author MyEclipse Persistence Tools
 */

public class UserModuleMap implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private Integer userId;
	private Integer position;
	private Boolean isGroup;

	// Constructors

	/** default constructor */
	public UserModuleMap() {
	}

	/** minimal constructor */
	public UserModuleMap(String scope, Integer userId, Integer position) {
		this.scope = scope;
		this.userId = userId;
		this.position = position;
	}

	/** full constructor */
	public UserModuleMap(String scope, Integer userId, Integer position,
			Boolean isGroup) {
		this.scope = scope;
		this.userId = userId;
		this.position = position;
		this.isGroup = isGroup;
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Boolean getIsGroup() {
		return this.isGroup;
	}

	public void setIsGroup(Boolean isGroup) {
		this.isGroup = isGroup;
	}

}