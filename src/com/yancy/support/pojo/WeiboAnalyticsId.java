package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboAnalyticsId entity. @author MyEclipse Persistence Tools
 */

public class WeiboAnalyticsId implements java.io.Serializable {

	// Fields

	private String scope;
	private String topic;
	private Integer day;
	private Integer month;
	private Integer year;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Float netSentiment;
	private String media;
	private Timestamp createdTime;
	private Timestamp dateTime;
	private String siteId;
	private Integer tweets;
	private Integer reposts;
	private Integer comments;
	private Integer newFollowers;
	private Integer newVerifiedFollowers;
	private Integer newMasterFollowers;
	private Integer activeFollowers;
	private Integer buzz;
	private Integer followersCount;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboAnalyticsId() {
	}

	/** minimal constructor */
	public WeiboAnalyticsId(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public WeiboAnalyticsId(String scope, String topic, Integer day,
			Integer month, Integer year, Integer positive, Integer negative,
			Integer neutral, Float netSentiment, String media,
			Timestamp createdTime, Timestamp dateTime, String siteId,
			Integer tweets, Integer reposts, Integer comments,
			Integer newFollowers, Integer newVerifiedFollowers,
			Integer newMasterFollowers, Integer activeFollowers, Integer buzz,
			Integer followersCount, Integer version) {
		this.scope = scope;
		this.topic = topic;
		this.day = day;
		this.month = month;
		this.year = year;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.netSentiment = netSentiment;
		this.media = media;
		this.createdTime = createdTime;
		this.dateTime = dateTime;
		this.siteId = siteId;
		this.tweets = tweets;
		this.reposts = reposts;
		this.comments = comments;
		this.newFollowers = newFollowers;
		this.newVerifiedFollowers = newVerifiedFollowers;
		this.newMasterFollowers = newMasterFollowers;
		this.activeFollowers = activeFollowers;
		this.buzz = buzz;
		this.followersCount = followersCount;
		this.version = version;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
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

	public Float getNetSentiment() {
		return this.netSentiment;
	}

	public void setNetSentiment(Float netSentiment) {
		this.netSentiment = netSentiment;
	}

	public String getMedia() {
		return this.media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public Integer getTweets() {
		return this.tweets;
	}

	public void setTweets(Integer tweets) {
		this.tweets = tweets;
	}

	public Integer getReposts() {
		return this.reposts;
	}

	public void setReposts(Integer reposts) {
		this.reposts = reposts;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getNewFollowers() {
		return this.newFollowers;
	}

	public void setNewFollowers(Integer newFollowers) {
		this.newFollowers = newFollowers;
	}

	public Integer getNewVerifiedFollowers() {
		return this.newVerifiedFollowers;
	}

	public void setNewVerifiedFollowers(Integer newVerifiedFollowers) {
		this.newVerifiedFollowers = newVerifiedFollowers;
	}

	public Integer getNewMasterFollowers() {
		return this.newMasterFollowers;
	}

	public void setNewMasterFollowers(Integer newMasterFollowers) {
		this.newMasterFollowers = newMasterFollowers;
	}

	public Integer getActiveFollowers() {
		return this.activeFollowers;
	}

	public void setActiveFollowers(Integer activeFollowers) {
		this.activeFollowers = activeFollowers;
	}

	public Integer getBuzz() {
		return this.buzz;
	}

	public void setBuzz(Integer buzz) {
		this.buzz = buzz;
	}

	public Integer getFollowersCount() {
		return this.followersCount;
	}

	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
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
		if (!(other instanceof WeiboAnalyticsId))
			return false;
		WeiboAnalyticsId castOther = (WeiboAnalyticsId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getTopic() == castOther.getTopic()) || (this
						.getTopic() != null
						&& castOther.getTopic() != null && this.getTopic()
						.equals(castOther.getTopic())))
				&& ((this.getDay() == castOther.getDay()) || (this.getDay() != null
						&& castOther.getDay() != null && this.getDay().equals(
						castOther.getDay())))
				&& ((this.getMonth() == castOther.getMonth()) || (this
						.getMonth() != null
						&& castOther.getMonth() != null && this.getMonth()
						.equals(castOther.getMonth())))
				&& ((this.getYear() == castOther.getYear()) || (this.getYear() != null
						&& castOther.getYear() != null && this.getYear()
						.equals(castOther.getYear())))
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
				&& ((this.getNetSentiment() == castOther.getNetSentiment()) || (this
						.getNetSentiment() != null
						&& castOther.getNetSentiment() != null && this
						.getNetSentiment().equals(castOther.getNetSentiment())))
				&& ((this.getMedia() == castOther.getMedia()) || (this
						.getMedia() != null
						&& castOther.getMedia() != null && this.getMedia()
						.equals(castOther.getMedia())))
				&& ((this.getCreatedTime() == castOther.getCreatedTime()) || (this
						.getCreatedTime() != null
						&& castOther.getCreatedTime() != null && this
						.getCreatedTime().equals(castOther.getCreatedTime())))
				&& ((this.getDateTime() == castOther.getDateTime()) || (this
						.getDateTime() != null
						&& castOther.getDateTime() != null && this
						.getDateTime().equals(castOther.getDateTime())))
				&& ((this.getSiteId() == castOther.getSiteId()) || (this
						.getSiteId() != null
						&& castOther.getSiteId() != null && this.getSiteId()
						.equals(castOther.getSiteId())))
				&& ((this.getTweets() == castOther.getTweets()) || (this
						.getTweets() != null
						&& castOther.getTweets() != null && this.getTweets()
						.equals(castOther.getTweets())))
				&& ((this.getReposts() == castOther.getReposts()) || (this
						.getReposts() != null
						&& castOther.getReposts() != null && this.getReposts()
						.equals(castOther.getReposts())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getNewFollowers() == castOther.getNewFollowers()) || (this
						.getNewFollowers() != null
						&& castOther.getNewFollowers() != null && this
						.getNewFollowers().equals(castOther.getNewFollowers())))
				&& ((this.getNewVerifiedFollowers() == castOther
						.getNewVerifiedFollowers()) || (this
						.getNewVerifiedFollowers() != null
						&& castOther.getNewVerifiedFollowers() != null && this
						.getNewVerifiedFollowers().equals(
								castOther.getNewVerifiedFollowers())))
				&& ((this.getNewMasterFollowers() == castOther
						.getNewMasterFollowers()) || (this
						.getNewMasterFollowers() != null
						&& castOther.getNewMasterFollowers() != null && this
						.getNewMasterFollowers().equals(
								castOther.getNewMasterFollowers())))
				&& ((this.getActiveFollowers() == castOther
						.getActiveFollowers()) || (this.getActiveFollowers() != null
						&& castOther.getActiveFollowers() != null && this
						.getActiveFollowers().equals(
								castOther.getActiveFollowers())))
				&& ((this.getBuzz() == castOther.getBuzz()) || (this.getBuzz() != null
						&& castOther.getBuzz() != null && this.getBuzz()
						.equals(castOther.getBuzz())))
				&& ((this.getFollowersCount() == castOther.getFollowersCount()) || (this
						.getFollowersCount() != null
						&& castOther.getFollowersCount() != null && this
						.getFollowersCount().equals(
								castOther.getFollowersCount())))
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
				+ (getTopic() == null ? 0 : this.getTopic().hashCode());
		result = 37 * result
				+ (getDay() == null ? 0 : this.getDay().hashCode());
		result = 37 * result
				+ (getMonth() == null ? 0 : this.getMonth().hashCode());
		result = 37 * result
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result
				+ (getPositive() == null ? 0 : this.getPositive().hashCode());
		result = 37 * result
				+ (getNegative() == null ? 0 : this.getNegative().hashCode());
		result = 37 * result
				+ (getNeutral() == null ? 0 : this.getNeutral().hashCode());
		result = 37
				* result
				+ (getNetSentiment() == null ? 0 : this.getNetSentiment()
						.hashCode());
		result = 37 * result
				+ (getMedia() == null ? 0 : this.getMedia().hashCode());
		result = 37
				* result
				+ (getCreatedTime() == null ? 0 : this.getCreatedTime()
						.hashCode());
		result = 37 * result
				+ (getDateTime() == null ? 0 : this.getDateTime().hashCode());
		result = 37 * result
				+ (getSiteId() == null ? 0 : this.getSiteId().hashCode());
		result = 37 * result
				+ (getTweets() == null ? 0 : this.getTweets().hashCode());
		result = 37 * result
				+ (getReposts() == null ? 0 : this.getReposts().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37
				* result
				+ (getNewFollowers() == null ? 0 : this.getNewFollowers()
						.hashCode());
		result = 37
				* result
				+ (getNewVerifiedFollowers() == null ? 0 : this
						.getNewVerifiedFollowers().hashCode());
		result = 37
				* result
				+ (getNewMasterFollowers() == null ? 0 : this
						.getNewMasterFollowers().hashCode());
		result = 37
				* result
				+ (getActiveFollowers() == null ? 0 : this.getActiveFollowers()
						.hashCode());
		result = 37 * result
				+ (getBuzz() == null ? 0 : this.getBuzz().hashCode());
		result = 37
				* result
				+ (getFollowersCount() == null ? 0 : this.getFollowersCount()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		return result;
	}

}