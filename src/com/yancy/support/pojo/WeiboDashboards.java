package com.yancy.support.pojo;

/**
 * WeiboDashboards entity. @author MyEclipse Persistence Tools
 */

public class WeiboDashboards implements java.io.Serializable {

	// Fields

	private WeiboDashboardsId id;

	// Constructors

	/** default constructor */
	public WeiboDashboards() {
	}

	/** full constructor */
	public WeiboDashboards(WeiboDashboardsId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboDashboardsId getId() {
		return this.id;
	}

	public void setId(WeiboDashboardsId id) {
		this.id = id;
	}

}