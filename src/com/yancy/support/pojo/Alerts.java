package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Alerts entity. @author MyEclipse Persistence Tools
 */

public class Alerts implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer alertRuleId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp date;
	private Integer day;
	private Integer month;
	private Integer year;

	// Constructors

	/** default constructor */
	public Alerts() {
	}

	/** minimal constructor */
	public Alerts(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public Alerts(Integer alertRuleId, Timestamp createdAt,
			Timestamp updatedAt, Timestamp date, Integer day, Integer month,
			Integer year) {
		this.alertRuleId = alertRuleId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.date = date;
		this.day = day;
		this.month = month;
		this.year = year;
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

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}