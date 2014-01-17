package com.yancy.support.pojo;

/**
 * WeiboKolInteractionResult entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolInteractionResult implements java.io.Serializable {

	// Fields

	private WeiboKolInteractionResultId id;

	// Constructors

	/** default constructor */
	public WeiboKolInteractionResult() {
	}

	/** full constructor */
	public WeiboKolInteractionResult(WeiboKolInteractionResultId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboKolInteractionResultId getId() {
		return this.id;
	}

	public void setId(WeiboKolInteractionResultId id) {
		this.id = id;
	}

}