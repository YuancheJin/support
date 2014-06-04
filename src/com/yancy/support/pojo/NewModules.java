package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * NewModules entity. @author MyEclipse Persistence Tools
 */

public class NewModules implements java.io.Serializable {

	// Fields

	private Integer id;
	private String newTags;
	private String userId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String snsIds;
	private String modules;
	private Integer price;

	// Constructors

	/** default constructor */
	public NewModules() {
	}

	/** minimal constructor */
	public NewModules(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public NewModules(String newTags, String userId, Timestamp createdAt,
			Timestamp updatedAt, String snsIds, String modules, Integer price) {
		this.newTags = newTags;
		this.userId = userId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.snsIds = snsIds;
		this.modules = modules;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNewTags() {
		return this.newTags;
	}

	public void setNewTags(String newTags) {
		this.newTags = newTags;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getSnsIds() {
		return this.snsIds;
	}

	public void setSnsIds(String snsIds) {
		this.snsIds = snsIds;
	}

	public String getModules() {
		return this.modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}