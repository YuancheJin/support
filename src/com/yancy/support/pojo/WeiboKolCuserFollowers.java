package com.yancy.support.pojo;

/**
 * WeiboKolCuserFollowers entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolCuserFollowers implements java.io.Serializable {

	// Fields

	private WeiboKolCuserFollowersId id;

	// Constructors

	/** default constructor */
	public WeiboKolCuserFollowers() {
	}

	/** full constructor */
	public WeiboKolCuserFollowers(WeiboKolCuserFollowersId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboKolCuserFollowersId getId() {
		return this.id;
	}

	public void setId(WeiboKolCuserFollowersId id) {
		this.id = id;
	}

}