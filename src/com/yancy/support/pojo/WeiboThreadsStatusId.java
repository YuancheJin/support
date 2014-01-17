package com.yancy.support.pojo;

/**
 * WeiboThreadsStatusId entity. @author MyEclipse Persistence Tools
 */

public class WeiboThreadsStatusId implements java.io.Serializable {

	// Fields

	private String scope;
	private Long finishedAt;

	// Constructors

	/** default constructor */
	public WeiboThreadsStatusId() {
	}

	/** minimal constructor */
	public WeiboThreadsStatusId(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public WeiboThreadsStatusId(String scope, Long finishedAt) {
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
		if (!(other instanceof WeiboThreadsStatusId))
			return false;
		WeiboThreadsStatusId castOther = (WeiboThreadsStatusId) other;

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