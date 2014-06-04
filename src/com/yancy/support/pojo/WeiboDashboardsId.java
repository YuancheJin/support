package com.yancy.support.pojo;

/**
 * WeiboDashboardsId entity. @author MyEclipse Persistence Tools
 */

public class WeiboDashboardsId implements java.io.Serializable {

	// Fields

	private String scope;
	private String period;
	private Integer newFollowers;
	private String newFollowersTrendPercentage;
	private Integer tweets;
	private String tweetsTrendPercentage;
	private Integer reposts;
	private String repostsTrendPercentage;
	private Integer comments;
	private String commentsTrendPercentage;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboDashboardsId() {
	}

	/** full constructor */
	public WeiboDashboardsId(String scope, String period, Integer newFollowers,
			String newFollowersTrendPercentage, Integer tweets,
			String tweetsTrendPercentage, Integer reposts,
			String repostsTrendPercentage, Integer comments,
			String commentsTrendPercentage, Integer version) {
		this.scope = scope;
		this.period = period;
		this.newFollowers = newFollowers;
		this.newFollowersTrendPercentage = newFollowersTrendPercentage;
		this.tweets = tweets;
		this.tweetsTrendPercentage = tweetsTrendPercentage;
		this.reposts = reposts;
		this.repostsTrendPercentage = repostsTrendPercentage;
		this.comments = comments;
		this.commentsTrendPercentage = commentsTrendPercentage;
		this.version = version;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getNewFollowers() {
		return this.newFollowers;
	}

	public void setNewFollowers(Integer newFollowers) {
		this.newFollowers = newFollowers;
	}

	public String getNewFollowersTrendPercentage() {
		return this.newFollowersTrendPercentage;
	}

	public void setNewFollowersTrendPercentage(
			String newFollowersTrendPercentage) {
		this.newFollowersTrendPercentage = newFollowersTrendPercentage;
	}

	public Integer getTweets() {
		return this.tweets;
	}

	public void setTweets(Integer tweets) {
		this.tweets = tweets;
	}

	public String getTweetsTrendPercentage() {
		return this.tweetsTrendPercentage;
	}

	public void setTweetsTrendPercentage(String tweetsTrendPercentage) {
		this.tweetsTrendPercentage = tweetsTrendPercentage;
	}

	public Integer getReposts() {
		return this.reposts;
	}

	public void setReposts(Integer reposts) {
		this.reposts = reposts;
	}

	public String getRepostsTrendPercentage() {
		return this.repostsTrendPercentage;
	}

	public void setRepostsTrendPercentage(String repostsTrendPercentage) {
		this.repostsTrendPercentage = repostsTrendPercentage;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public String getCommentsTrendPercentage() {
		return this.commentsTrendPercentage;
	}

	public void setCommentsTrendPercentage(String commentsTrendPercentage) {
		this.commentsTrendPercentage = commentsTrendPercentage;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeiboDashboardsId))
			return false;
		WeiboDashboardsId castOther = (WeiboDashboardsId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())))
				&& ((this.getNewFollowers() == castOther.getNewFollowers()) || (this
						.getNewFollowers() != null
						&& castOther.getNewFollowers() != null && this
						.getNewFollowers().equals(castOther.getNewFollowers())))
				&& ((this.getNewFollowersTrendPercentage() == castOther
						.getNewFollowersTrendPercentage()) || (this
						.getNewFollowersTrendPercentage() != null
						&& castOther.getNewFollowersTrendPercentage() != null && this
						.getNewFollowersTrendPercentage().equals(
								castOther.getNewFollowersTrendPercentage())))
				&& ((this.getTweets() == castOther.getTweets()) || (this
						.getTweets() != null
						&& castOther.getTweets() != null && this.getTweets()
						.equals(castOther.getTweets())))
				&& ((this.getTweetsTrendPercentage() == castOther
						.getTweetsTrendPercentage()) || (this
						.getTweetsTrendPercentage() != null
						&& castOther.getTweetsTrendPercentage() != null && this
						.getTweetsTrendPercentage().equals(
								castOther.getTweetsTrendPercentage())))
				&& ((this.getReposts() == castOther.getReposts()) || (this
						.getReposts() != null
						&& castOther.getReposts() != null && this.getReposts()
						.equals(castOther.getReposts())))
				&& ((this.getRepostsTrendPercentage() == castOther
						.getRepostsTrendPercentage()) || (this
						.getRepostsTrendPercentage() != null
						&& castOther.getRepostsTrendPercentage() != null && this
						.getRepostsTrendPercentage().equals(
								castOther.getRepostsTrendPercentage())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getCommentsTrendPercentage() == castOther
						.getCommentsTrendPercentage()) || (this
						.getCommentsTrendPercentage() != null
						&& castOther.getCommentsTrendPercentage() != null && this
						.getCommentsTrendPercentage().equals(
								castOther.getCommentsTrendPercentage())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion()
						.equals(castOther.getVersion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScope() == null ? 0 : this.getScope().hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		result = 37
				* result
				+ (getNewFollowers() == null ? 0 : this.getNewFollowers()
						.hashCode());
		result = 37
				* result
				+ (getNewFollowersTrendPercentage() == null ? 0 : this
						.getNewFollowersTrendPercentage().hashCode());
		result = 37 * result
				+ (getTweets() == null ? 0 : this.getTweets().hashCode());
		result = 37
				* result
				+ (getTweetsTrendPercentage() == null ? 0 : this
						.getTweetsTrendPercentage().hashCode());
		result = 37 * result
				+ (getReposts() == null ? 0 : this.getReposts().hashCode());
		result = 37
				* result
				+ (getRepostsTrendPercentage() == null ? 0 : this
						.getRepostsTrendPercentage().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37
				* result
				+ (getCommentsTrendPercentage() == null ? 0 : this
						.getCommentsTrendPercentage().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		return result;
	}

}