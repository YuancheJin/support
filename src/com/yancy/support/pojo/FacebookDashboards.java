package com.yancy.support.pojo;

/**
 * FacebookDashboards entity. @author MyEclipse Persistence Tools
 */

public class FacebookDashboards implements java.io.Serializable {

	// Fields

	private FacebookDashboardsId id;

	// Constructors

	/** default constructor */
	public FacebookDashboards() {
	}

	/** full constructor */
	public FacebookDashboards(FacebookDashboardsId id) {
		this.id = id;
	}

	// Property accessors

	public FacebookDashboardsId getId() {
		return this.id;
	}

	public void setId(FacebookDashboardsId id) {
		this.id = id;
	}

}