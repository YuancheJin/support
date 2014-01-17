package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * ModuleCategories entity. @author MyEclipse Persistence Tools
 */

public class ModuleCategories implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer parentId;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public ModuleCategories() {
	}

	/** minimal constructor */
	public ModuleCategories(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public ModuleCategories(String name, Integer parentId, Timestamp createdAt,
			Timestamp updatedAt) {
		this.name = name;
		this.parentId = parentId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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