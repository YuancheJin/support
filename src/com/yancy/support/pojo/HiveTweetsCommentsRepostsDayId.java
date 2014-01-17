package com.yancy.support.pojo;

/**
 * HiveTweetsCommentsRepostsDayId entity. @author MyEclipse Persistence Tools
 */

public class HiveTweetsCommentsRepostsDayId implements java.io.Serializable {

	// Fields

	private String cuserId;
	private String tagsString;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Integer year;
	private Integer month;
	private Integer day;
	private Integer tweets;
	private Integer comments;
	private Integer reposts;

	// Constructors

	/** default constructor */
	public HiveTweetsCommentsRepostsDayId() {
	}

	/** full constructor */
	public HiveTweetsCommentsRepostsDayId(String cuserId, String tagsString,
			Integer positive, Integer negative, Integer neutral, Integer year,
			Integer month, Integer day, Integer tweets, Integer comments,
			Integer reposts) {
		this.cuserId = cuserId;
		this.tagsString = tagsString;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.year = year;
		this.month = month;
		this.day = day;
		this.tweets = tweets;
		this.comments = comments;
		this.reposts = reposts;
	}

	// Property accessors

	public String getCuserId() {
		return this.cuserId;
	}

	public void setCuserId(String cuserId) {
		this.cuserId = cuserId;
	}

	public String getTagsString() {
		return this.tagsString;
	}

	public void setTagsString(String tagsString) {
		this.tagsString = tagsString;
	}

	public Integer getPositive() {
		return this.positive;
	}

	public void setPositive(Integer positive) {
		this.positive = positive;
	}

	public Integer getNegative() {
		return this.negative;
	}

	public void setNegative(Integer negative) {
		this.negative = negative;
	}

	public Integer getNeutral() {
		return this.neutral;
	}

	public void setNeutral(Integer neutral) {
		this.neutral = neutral;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getTweets() {
		return this.tweets;
	}

	public void setTweets(Integer tweets) {
		this.tweets = tweets;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getReposts() {
		return this.reposts;
	}

	public void setReposts(Integer reposts) {
		this.reposts = reposts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HiveTweetsCommentsRepostsDayId))
			return false;
		HiveTweetsCommentsRepostsDayId castOther = (HiveTweetsCommentsRepostsDayId) other;

		return ((this.getCuserId() == castOther.getCuserId()) || (this
				.getCuserId() != null
				&& castOther.getCuserId() != null && this.getCuserId().equals(
				castOther.getCuserId())))
				&& ((this.getTagsString() == castOther.getTagsString()) || (this
						.getTagsString() != null
						&& castOther.getTagsString() != null && this
						.getTagsString().equals(castOther.getTagsString())))
				&& ((this.getPositive() == castOther.getPositive()) || (this
						.getPositive() != null
						&& castOther.getPositive() != null && this
						.getPositive().equals(castOther.getPositive())))
				&& ((this.getNegative() == castOther.getNegative()) || (this
						.getNegative() != null
						&& castOther.getNegative() != null && this
						.getNegative().equals(castOther.getNegative())))
				&& ((this.getNeutral() == castOther.getNeutral()) || (this
						.getNeutral() != null
						&& castOther.getNeutral() != null && this.getNeutral()
						.equals(castOther.getNeutral())))
				&& ((this.getYear() == castOther.getYear()) || (this.getYear() != null
						&& castOther.getYear() != null && this.getYear()
						.equals(castOther.getYear())))
				&& ((this.getMonth() == castOther.getMonth()) || (this
						.getMonth() != null
						&& castOther.getMonth() != null && this.getMonth()
						.equals(castOther.getMonth())))
				&& ((this.getDay() == castOther.getDay()) || (this.getDay() != null
						&& castOther.getDay() != null && this.getDay().equals(
						castOther.getDay())))
				&& ((this.getTweets() == castOther.getTweets()) || (this
						.getTweets() != null
						&& castOther.getTweets() != null && this.getTweets()
						.equals(castOther.getTweets())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getReposts() == castOther.getReposts()) || (this
						.getReposts() != null
						&& castOther.getReposts() != null && this.getReposts()
						.equals(castOther.getReposts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCuserId() == null ? 0 : this.getCuserId().hashCode());
		result = 37
				* result
				+ (getTagsString() == null ? 0 : this.getTagsString()
						.hashCode());
		result = 37 * result
				+ (getPositive() == null ? 0 : this.getPositive().hashCode());
		result = 37 * result
				+ (getNegative() == null ? 0 : this.getNegative().hashCode());
		result = 37 * result
				+ (getNeutral() == null ? 0 : this.getNeutral().hashCode());
		result = 37 * result
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result
				+ (getMonth() == null ? 0 : this.getMonth().hashCode());
		result = 37 * result
				+ (getDay() == null ? 0 : this.getDay().hashCode());
		result = 37 * result
				+ (getTweets() == null ? 0 : this.getTweets().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37 * result
				+ (getReposts() == null ? 0 : this.getReposts().hashCode());
		return result;
	}

}