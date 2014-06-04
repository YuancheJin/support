package com.yancy.support.pojo;

/**
 * WeiboCuserFollowerTrackerId entity. @author MyEclipse Persistence Tools
 */

public class WeiboCuserFollowerTrackerId implements java.io.Serializable {

	// Fields

	private String cuserId;
	private String period;
	private Integer followersCount;
	private Integer friendsCount;
	private Double spamRate;

	// Constructors

	/** default constructor */
	public WeiboCuserFollowerTrackerId() {
	}

	/** full constructor */
	public WeiboCuserFollowerTrackerId(String cuserId, String period,
			Integer followersCount, Integer friendsCount, Double spamRate) {
		this.cuserId = cuserId;
		this.period = period;
		this.followersCount = followersCount;
		this.friendsCount = friendsCount;
		this.spamRate = spamRate;
	}

	// Property accessors

	public String getCuserId() {
		return this.cuserId;
	}

	public void setCuserId(String cuserId) {
		this.cuserId = cuserId;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getFollowersCount() {
		return this.followersCount;
	}

	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	public Integer getFriendsCount() {
		return this.friendsCount;
	}

	public void setFriendsCount(Integer friendsCount) {
		this.friendsCount = friendsCount;
	}

	public Double getSpamRate() {
		return this.spamRate;
	}

	public void setSpamRate(Double spamRate) {
		this.spamRate = spamRate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeiboCuserFollowerTrackerId))
			return false;
		WeiboCuserFollowerTrackerId castOther = (WeiboCuserFollowerTrackerId) other;

		return ((this.getCuserId() == castOther.getCuserId()) || (this
				.getCuserId() != null
				&& castOther.getCuserId() != null && this.getCuserId().equals(
				castOther.getCuserId())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())))
				&& ((this.getFollowersCount() == castOther.getFollowersCount()) || (this
						.getFollowersCount() != null
						&& castOther.getFollowersCount() != null && this
						.getFollowersCount().equals(
								castOther.getFollowersCount())))
				&& ((this.getFriendsCount() == castOther.getFriendsCount()) || (this
						.getFriendsCount() != null
						&& castOther.getFriendsCount() != null && this
						.getFriendsCount().equals(castOther.getFriendsCount())))
				&& ((this.getSpamRate() == castOther.getSpamRate()) || (this
						.getSpamRate() != null
						&& castOther.getSpamRate() != null && this
						.getSpamRate().equals(castOther.getSpamRate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCuserId() == null ? 0 : this.getCuserId().hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		result = 37
				* result
				+ (getFollowersCount() == null ? 0 : this.getFollowersCount()
						.hashCode());
		result = 37
				* result
				+ (getFriendsCount() == null ? 0 : this.getFriendsCount()
						.hashCode());
		result = 37 * result
				+ (getSpamRate() == null ? 0 : this.getSpamRate().hashCode());
		return result;
	}

}