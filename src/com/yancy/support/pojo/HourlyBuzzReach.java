package com.yancy.support.pojo;

/**
 * HourlyBuzzReach entity. @author MyEclipse Persistence Tools
 */

public class HourlyBuzzReach implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String dateTime;
	private Integer g0;
	private Integer g1;
	private Integer g2;

	// Constructors

	/** default constructor */
	public HourlyBuzzReach() {
	}

	/** full constructor */
	public HourlyBuzzReach(String scope, String dateTime, Integer g0,
			Integer g1, Integer g2) {
		this.scope = scope;
		this.dateTime = dateTime;
		this.g0 = g0;
		this.g1 = g1;
		this.g2 = g2;
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

	public String getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getG0() {
		return this.g0;
	}

	public void setG0(Integer g0) {
		this.g0 = g0;
	}

	public Integer getG1() {
		return this.g1;
	}

	public void setG1(Integer g1) {
		this.g1 = g1;
	}

	public Integer getG2() {
		return this.g2;
	}

	public void setG2(Integer g2) {
		this.g2 = g2;
	}

}