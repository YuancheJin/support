package com.yancy.support.pojo;

/**
 * Exports entity. @author MyEclipse Persistence Tools
 */

public class Exports implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private Integer period;
	private Integer finished;
	private Integer total;
	private Integer error;
	private Boolean isRunning;

	// Constructors

	/** default constructor */
	public Exports() {
	}

	/** full constructor */
	public Exports(String scope, Integer period, Integer finished,
			Integer total, Integer error, Boolean isRunning) {
		this.scope = scope;
		this.period = period;
		this.finished = finished;
		this.total = total;
		this.error = error;
		this.isRunning = isRunning;
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getFinished() {
		return this.finished;
	}

	public void setFinished(Integer finished) {
		this.finished = finished;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getError() {
		return this.error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public Boolean getIsRunning() {
		return this.isRunning;
	}

	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}

}