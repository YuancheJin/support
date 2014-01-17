package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Reports entity. @author MyEclipse Persistence Tools
 */

public class Reports implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer reportDefinitionId;
	private Timestamp startTime;
	private Timestamp endTime;
	private String path;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public Reports() {
	}

	/** minimal constructor */
	public Reports(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public Reports(Integer userId, Integer reportDefinitionId,
			Timestamp startTime, Timestamp endTime, String path,
			Timestamp createdAt, Timestamp updatedAt) {
		this.userId = userId;
		this.reportDefinitionId = reportDefinitionId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.path = path;
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getReportDefinitionId() {
		return this.reportDefinitionId;
	}

	public void setReportDefinitionId(Integer reportDefinitionId) {
		this.reportDefinitionId = reportDefinitionId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
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