package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * BuzzTopics entity. @author MyEclipse Persistence Tools
 */

public class BuzzTopics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String topic;
	private String period;
	private Integer mention;
	private Timestamp createdTime;

	// Constructors

	/** default constructor */
	public BuzzTopics() {
	}

	/** minimal constructor */
	public BuzzTopics(String scope, String topic) {
		this.scope = scope;
		this.topic = topic;
	}

	/** full constructor */
	public BuzzTopics(String scope, String topic, String period,
			Integer mention, Timestamp createdTime) {
		this.scope = scope;
		this.topic = topic;
		this.period = period;
		this.mention = mention;
		this.createdTime = createdTime;
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

}