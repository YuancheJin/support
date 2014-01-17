package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboBuzzOverTime entity. @author MyEclipse Persistence Tools
 */

public class WeiboBuzzOverTime implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String keyword;
	private Integer year;
	private Integer month;
	private Integer day;
	private Timestamp dateTime;
	private Integer buzzNum;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboBuzzOverTime() {
	}

	/** full constructor */
	public WeiboBuzzOverTime(String scope, String keyword, Integer year,
			Integer month, Integer day, Timestamp dateTime, Integer buzzNum,
			Integer version) {
		this.scope = scope;
		this.keyword = keyword;
		this.year = year;
		this.month = month;
		this.day = day;
		this.dateTime = dateTime;
		this.buzzNum = buzzNum;
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
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

	public Integer getBuzzNum() {
		return this.buzzNum;
	}

	public void setBuzzNum(Integer buzzNum) {
		this.buzzNum = buzzNum;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}