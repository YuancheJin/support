package com.yancy.support.pojo;

/**
 * ModuleTopicMap entity. @author MyEclipse Persistence Tools
 */

public class ModuleTopicMap implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String topic;
	private String ch;
	private String en;
	private Integer display;

	// Constructors

	/** default constructor */
	public ModuleTopicMap() {
	}

	/** full constructor */
	public ModuleTopicMap(String scope, String topic, String ch, String en,
			Integer display) {
		this.scope = scope;
		this.topic = topic;
		this.ch = ch;
		this.en = en;
		this.display = display;
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

	public String getCh() {
		return this.ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public String getEn() {
		return this.en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

}