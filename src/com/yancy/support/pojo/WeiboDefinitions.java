package com.yancy.support.pojo;

/**
 * WeiboDefinitions entity. @author MyEclipse Persistence Tools
 */

public class WeiboDefinitions implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String expression;
	private String topic;

	// Constructors

	/** default constructor */
	public WeiboDefinitions() {
	}

	/** full constructor */
	public WeiboDefinitions(String scope, String expression, String topic) {
		this.scope = scope;
		this.expression = expression;
		this.topic = topic;
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

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}