package com.yancy.support.pojo;

/**
 * WeiboCuserFollowerTracker entity. @author MyEclipse Persistence Tools
 */

public class WeiboCuserFollowerTracker implements java.io.Serializable {

	// Fields

	private WeiboCuserFollowerTrackerId id;

	// Constructors

	/** default constructor */
	public WeiboCuserFollowerTracker() {
	}

	/** full constructor */
	public WeiboCuserFollowerTracker(WeiboCuserFollowerTrackerId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboCuserFollowerTrackerId getId() {
		return this.id;
	}

	public void setId(WeiboCuserFollowerTrackerId id) {
		this.id = id;
	}

}