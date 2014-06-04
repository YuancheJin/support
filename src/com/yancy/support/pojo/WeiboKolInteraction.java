package com.yancy.support.pojo;

/**
 * WeiboKolInteraction entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolInteraction implements java.io.Serializable {

	// Fields

	private WeiboKolInteractionId id;

	// Constructors

	/** default constructor */
	public WeiboKolInteraction() {
	}

	/** full constructor */
	public WeiboKolInteraction(WeiboKolInteractionId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboKolInteractionId getId() {
		return this.id;
	}

	public void setId(WeiboKolInteractionId id) {
		this.id = id;
	}

}