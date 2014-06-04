package com.yancy.support.pojo;

/**
 * WeiboThreadsStatus entity. @author MyEclipse Persistence Tools
 */

public class WeiboThreadsStatus implements java.io.Serializable {

	// Fields

	private WeiboThreadsStatusId id;

	// Constructors

	/** default constructor */
	public WeiboThreadsStatus() {
	}

	/** full constructor */
	public WeiboThreadsStatus(WeiboThreadsStatusId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboThreadsStatusId getId() {
		return this.id;
	}

	public void setId(WeiboThreadsStatusId id) {
		this.id = id;
	}

}