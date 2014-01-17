package com.yancy.support.pojo;

/**
 * FacebookThreadsStatus entity. @author MyEclipse Persistence Tools
 */

public class FacebookThreadsStatus implements java.io.Serializable {

	// Fields

	private FacebookThreadsStatusId id;

	// Constructors

	/** default constructor */
	public FacebookThreadsStatus() {
	}

	/** full constructor */
	public FacebookThreadsStatus(FacebookThreadsStatusId id) {
		this.id = id;
	}

	// Property accessors

	public FacebookThreadsStatusId getId() {
		return this.id;
	}

	public void setId(FacebookThreadsStatusId id) {
		this.id = id;
	}

}