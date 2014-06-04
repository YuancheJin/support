package com.yancy.support.pojo;

/**
 * WeiboAnalytics entity. @author MyEclipse Persistence Tools
 */

public class WeiboAnalytics implements java.io.Serializable {

	// Fields

	private WeiboAnalyticsId id;

	// Constructors

	/** default constructor */
	public WeiboAnalytics() {
	}

	/** full constructor */
	public WeiboAnalytics(WeiboAnalyticsId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboAnalyticsId getId() {
		return this.id;
	}

	public void setId(WeiboAnalyticsId id) {
		this.id = id;
	}

}