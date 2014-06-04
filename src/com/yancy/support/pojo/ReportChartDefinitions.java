package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * ReportChartDefinitions entity. @author MyEclipse Persistence Tools
 */

public class ReportChartDefinitions implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer reportDefinitionId;
	private Integer position;
	private String chartTypeName;
	private String scopes;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public ReportChartDefinitions() {
	}

	/** minimal constructor */
	public ReportChartDefinitions(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public ReportChartDefinitions(Integer reportDefinitionId, Integer position,
			String chartTypeName, String scopes, Timestamp createdAt,
			Timestamp updatedAt) {
		this.reportDefinitionId = reportDefinitionId;
		this.position = position;
		this.chartTypeName = chartTypeName;
		this.scopes = scopes;
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

	public Integer getReportDefinitionId() {
		return this.reportDefinitionId;
	}

	public void setReportDefinitionId(Integer reportDefinitionId) {
		this.reportDefinitionId = reportDefinitionId;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getChartTypeName() {
		return this.chartTypeName;
	}

	public void setChartTypeName(String chartTypeName) {
		this.chartTypeName = chartTypeName;
	}

	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
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