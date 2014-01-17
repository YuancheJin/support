package com.yancy.support.pojo;

/**
 * WeiboFollowersStatus entity. @author MyEclipse Persistence Tools
 */

public class WeiboFollowersStatus implements java.io.Serializable {

	// Fields

	private WeiboFollowersStatusId id;

	// Constructors

	/** default constructor */
	public WeiboFollowersStatus() {
	}

	/** full constructor */
	public WeiboFollowersStatus(WeiboFollowersStatusId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboFollowersStatusId getId() {
		return this.id;
	}

	public void setId(WeiboFollowersStatusId id) {
		this.id = id;
	}

}