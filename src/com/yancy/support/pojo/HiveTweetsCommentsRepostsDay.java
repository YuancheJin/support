package com.yancy.support.pojo;

/**
 * HiveTweetsCommentsRepostsDay entity. @author MyEclipse Persistence Tools
 */

public class HiveTweetsCommentsRepostsDay implements java.io.Serializable {

	// Fields

	private HiveTweetsCommentsRepostsDayId id;

	// Constructors

	/** default constructor */
	public HiveTweetsCommentsRepostsDay() {
	}

	/** full constructor */
	public HiveTweetsCommentsRepostsDay(HiveTweetsCommentsRepostsDayId id) {
		this.id = id;
	}

	// Property accessors

	public HiveTweetsCommentsRepostsDayId getId() {
		return this.id;
	}

	public void setId(HiveTweetsCommentsRepostsDayId id) {
		this.id = id;
	}

}