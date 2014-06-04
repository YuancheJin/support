package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * FacebookAnalyticsId entity. @author MyEclipse Persistence Tools
 */

public class FacebookAnalyticsId implements java.io.Serializable {

	// Fields

	private String scope;
	private String topic;
	private Integer year;
	private Integer month;
	private Integer day;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Float netSentiment;
	private String media;
	private Timestamp createdTime;
	private Timestamp dateTime;
	private String siteId;
	private Integer posts;
	private Integer comments;
	private Integer newFriends;
	private Integer activeFollowers;
	private Integer buzz;
	private Integer friendsCount;
	private Integer version;

	// Constructors

	/** default constructor */
	public FacebookAnalyticsId() {
	}

	/** minimal constructor */
	public FacebookAnalyticsId(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public FacebookAnalyticsId(String scope, String topic, Integer year,
			Integer month, Integer day, Integer positive, Integer negative,
			Integer neutral, Float netSentiment, String media,
			Timestamp createdTime, Timestamp dateTime, String siteId,
			Integer posts, Integer comments, Integer newFriends,
			Integer activeFollowers, Integer buzz, Integer friendsCount,
			Integer version) {
		this.scope = scope;
		this.topic = topic;
		this.year = year;
		this.month = month;
		this.day = day;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.netSentiment = netSentiment;
		this.media = media;
		this.createdTime = createdTime;
		this.dateTime = dateTime;
		this.siteId = siteId;
		this.posts = posts;
		this.comments = comments;
		this.newFriends = newFriends;
		this.activeFollowers = activeFollowers;
		this.buzz = buzz;
		this.friendsCount = friendsCount;
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

	public Integer getPosts() {
		return this.posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getNewFriends() {
		return this.newFriends;
	}

	public void setNewFriends(Integer newFriends) {
		this.newFriends = newFriends;
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

	public Integer getFriendsCount() {
		return this.friendsCount;
	}

	public void setFriendsCount(Integer friendsCount) {
		this.friendsCount = friendsCount;
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
		if (!(other instanceof FacebookAnalyticsId))
			return false;
		FacebookAnalyticsId castOther = (FacebookAnalyticsId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getTopic() == castOther.getTopic()) || (this
						.getTopic() != null
						&& castOther.getTopic() != null && this.getTopic()
						.equals(castOther.getTopic())))
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
				&& ((this.getPosts() == castOther.getPosts()) || (this
						.getPosts() != null
						&& castOther.getPosts() != null && this.getPosts()
						.equals(castOther.getPosts())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getNewFriends() == castOther.getNewFriends()) || (this
						.getNewFriends() != null
						&& castOther.getNewFriends() != null && this
						.getNewFriends().equals(castOther.getNewFriends())))
				&& ((this.getActiveFollowers() == castOther
						.getActiveFollowers()) || (this.getActiveFollowers() != null
						&& castOther.getActiveFollowers() != null && this
						.getActiveFollowers().equals(
								castOther.getActiveFollowers())))
				&& ((this.getBuzz() == castOther.getBuzz()) || (this.getBuzz() != null
						&& castOther.getBuzz() != null && this.getBuzz()
						.equals(castOther.getBuzz())))
				&& ((this.getFriendsCount() == castOther.getFriendsCount()) || (this
						.getFriendsCount() != null
						&& castOther.getFriendsCount() != null && this
						.getFriendsCount().equals(castOther.getFriendsCount())))
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
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result
				+ (getMonth() == null ? 0 : this.getMonth().hashCode());
		result = 37 * result
				+ (getDay() == null ? 0 : this.getDay().hashCode());
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
				+ (getPosts() == null ? 0 : this.getPosts().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37
				* result
				+ (getNewFriends() == null ? 0 : this.getNewFriends()
						.hashCode());
		result = 37
				* result
				+ (getActiveFollowers() == null ? 0 : this.getActiveFollowers()
						.hashCode());
		result = 37 * result
				+ (getBuzz() == null ? 0 : this.getBuzz().hashCode());
		result = 37
				* result
				+ (getFriendsCount() == null ? 0 : this.getFriendsCount()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		return result;
	}

}