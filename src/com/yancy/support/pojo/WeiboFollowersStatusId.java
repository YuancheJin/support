package com.yancy.support.pojo;

/**
 * WeiboFollowersStatusId entity. @author MyEclipse Persistence Tools
 */

public class WeiboFollowersStatusId implements java.io.Serializable {

	// Fields

	private String scope;
	private Long finishedAt;

	// Constructors

	/** default constructor */
	public WeiboFollowersStatusId() {
	}

	/** minimal constructor */
	public WeiboFollowersStatusId(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public WeiboFollowersStatusId(String scope, Long finishedAt) {
		this.scope = scope;
		this.finishedAt = finishedAt;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Long getFinishedAt() {
		return this.finishedAt;
	}

	public void setFinishedAt(Long finishedAt) {
		this.finishedAt = finishedAt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeiboFollowersStatusId))
			return false;
		WeiboFollowersStatusId castOther = (WeiboFollowersStatusId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getFinishedAt() == castOther.getFinishedAt()) || (this
						.getFinishedAt() != null
						&& castOther.getFinishedAt() != null && this
						.getFinishedAt().equals(castOther.getFinishedAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScope() == null ? 0 : this.getScope().hashCode());
		result = 37
				* result
				+ (getFinishedAt() == null ? 0 : this.getFinishedAt()
						.hashCode());
		return result;
	}

}