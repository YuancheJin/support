package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboHourlyAnalytics entity. @author MyEclipse Persistence Tools
 */

public class WeiboHourlyAnalytics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String topic;
	private Integer hour;
	private Integer day;
	private Integer month;
	private Integer year;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Float netSentiment;
	private String media;
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
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public WeiboHourlyAnalytics() {
	}

	/** minimal constructor */
	public WeiboHourlyAnalytics(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public WeiboHourlyAnalytics(String scope, String topic, Integer hour,
			Integer day, Integer month, Integer year, Integer positive,
			Integer negative, Integer neutral, Float netSentiment,
			String media, Timestamp dateTime, String siteId, Integer tweets,
			Integer reposts, Integer comments, Integer newFollowers,
			Integer newVerifiedFollowers, Integer newMasterFollowers,
			Integer activeFollowers, Integer buzz, Integer followersCount,
			Timestamp createdAt, Timestamp updatedAt) {
		this.scope = scope;
		this.topic = topic;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.netSentiment = netSentiment;
		this.media = media;
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
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
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

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}