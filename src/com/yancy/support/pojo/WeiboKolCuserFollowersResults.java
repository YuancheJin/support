package com.yancy.support.pojo;

/**
 * WeiboKolCuserFollowersResults entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolCuserFollowersResults implements java.io.Serializable {

	// Fields

	private WeiboKolCuserFollowersResultsId id;

	// Constructors

	/** default constructor */
	public WeiboKolCuserFollowersResults() {
	}

	/** full constructor */
	public WeiboKolCuserFollowersResults(WeiboKolCuserFollowersResultsId id) {
		this.id = id;
	}

	// Property accessors

	public WeiboKolCuserFollowersResultsId getId() {
		return this.id;
	}

	public void setId(WeiboKolCuserFollowersResultsId id) {
		this.id = id;
	}

}