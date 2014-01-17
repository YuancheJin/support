package com.yancy.support.pojo;

/**
 * FacebookAnalytics entity. @author MyEclipse Persistence Tools
 */

public class FacebookAnalytics implements java.io.Serializable {

	// Fields

	private FacebookAnalyticsId id;

	// Constructors

	/** default constructor */
	public FacebookAnalytics() {
	}

	/** full constructor */
	public FacebookAnalytics(FacebookAnalyticsId id) {
		this.id = id;
	}

	// Property accessors

	public FacebookAnalyticsId getId() {
		return this.id;
	}

	public void setId(FacebookAnalyticsId id) {
		this.id = id;
	}

}