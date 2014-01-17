package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Topics entity. @author MyEclipse Persistence Tools
 */

public class Topics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String topic;
	private String period;
	private Integer mention;
	private Timestamp createdTime;
	private Boolean filtered;
	private Integer version;
	private Float percent;

	// Constructors

	/** default constructor */
	public Topics() {
	}

	/** minimal constructor */
	public Topics(String scope, String topic) {
		this.scope = scope;
		this.topic = topic;
	}

	/** full constructor */
	public Topics(String scope, String topic, String period, Integer mention,
			Timestamp createdTime, Boolean filtered, Integer version,
			Float percent) {
		this.scope = scope;
		this.topic = topic;
		this.period = period;
		this.mention = mention;
		this.createdTime = createdTime;
		this.filtered = filtered;
		this.version = version;
		this.percent = percent;
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

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getMention() {
		return this.mention;
	}

	public void setMention(Integer mention) {
		this.mention = mention;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Boolean getFiltered() {
		return this.filtered;
	}

	public void setFiltered(Boolean filtered) {
		this.filtered = filtered;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Float getPercent() {
		return this.percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

}