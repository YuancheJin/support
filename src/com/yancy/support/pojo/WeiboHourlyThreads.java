package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboHourlyThreads entity. @author MyEclipse Persistence Tools
 */

public class WeiboHourlyThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String threadId;
	private String scope;
	private String topic;
	private Integer siteId;
	private String siteName;
	private String media;
	private Timestamp dateTime;
	private String title;
	private String url;
	private String period;
	private Integer comments;
	private Integer reposts;
	private Integer commentsInRange;
	private Integer repostsInRange;
	private Integer commentsTimeLast;
	private String repostTo;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public WeiboHourlyThreads() {
	}

	/** minimal constructor */
	public WeiboHourlyThreads(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public WeiboHourlyThreads(String threadId, String scope, String topic,
			Integer siteId, String siteName, String media, Timestamp dateTime,
			String title, String url, String period, Integer comments,
			Integer reposts, Integer commentsInRange, Integer repostsInRange,
			Integer commentsTimeLast, String repostTo, Timestamp createdAt,
			Timestamp updatedAt) {
		this.threadId = threadId;
		this.scope = scope;
		this.topic = topic;
		this.siteId = siteId;
		this.siteName = siteName;
		this.media = media;
		this.dateTime = dateTime;
		this.title = title;
		this.url = url;
		this.period = period;
		this.comments = comments;
		this.reposts = reposts;
		this.commentsInRange = commentsInRange;
		this.repostsInRange = repostsInRange;
		this.commentsTimeLast = commentsTimeLast;
		this.repostTo = repostTo;
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

	public String getThreadId() {
		return this.threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
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

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
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

	public Integer getCommentsInRange() {
		return this.commentsInRange;
	}

	public void setCommentsInRange(Integer commentsInRange) {
		this.commentsInRange = commentsInRange;
	}

	public Integer getRepostsInRange() {
		return this.repostsInRange;
	}

	public void setRepostsInRange(Integer repostsInRange) {
		this.repostsInRange = repostsInRange;
	}

	public Integer getCommentsTimeLast() {
		return this.commentsTimeLast;
	}

	public void setCommentsTimeLast(Integer commentsTimeLast) {
		this.commentsTimeLast = commentsTimeLast;
	}

	public String getRepostTo() {
		return this.repostTo;
	}

	public void setRepostTo(String repostTo) {
		this.repostTo = repostTo;
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