package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboDemographics entity. @author MyEclipse Persistence Tools
 */

public class WeiboDemographics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private Integer year;
	private Integer month;
	private Integer day;
	private Timestamp dateTime;
	private String dimension;
	private String behaviorType;
	private String propertyKey;
	private Integer propertyValue;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboDemographics() {
	}

	/** minimal constructor */
	public WeiboDemographics(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public WeiboDemographics(String scope, Integer year, Integer month,
			Integer day, Timestamp dateTime, String dimension,
			String behaviorType, String propertyKey, Integer propertyValue,
			Integer version) {
		this.scope = scope;
		this.year = year;
		this.month = month;
		this.day = day;
		this.dateTime = dateTime;
		this.dimension = dimension;
		this.behaviorType = behaviorType;
		this.propertyKey = propertyKey;
		this.propertyValue = propertyValue;
		this.version = version;
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

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getBehaviorType() {
		return this.behaviorType;
	}

	public void setBehaviorType(String behaviorType) {
		this.behaviorType = behaviorType;
	}

	public String getPropertyKey() {
		return this.propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public Integer getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(Integer propertyValue) {
		this.propertyValue = propertyValue;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}