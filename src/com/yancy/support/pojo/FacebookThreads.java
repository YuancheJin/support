package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * FacebookThreads entity. @author MyEclipse Persistence Tools
 */

public class FacebookThreads implements java.io.Serializable {

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
	private Integer period;
	private Long comments;
	private Long commentsInRange;
	private Timestamp updated;
	private Long commentsTimeLast;
	private Integer version;

	// Constructors

	/** default constructor */
	public FacebookThreads() {
	}

	/** full constructor */
	public FacebookThreads(String threadId, String scope, String topic,
			Integer siteId, String siteName, String media, Timestamp dateTime,
			String title, String url, Integer period, Long comments,
			Long commentsInRange, Timestamp updated, Long commentsTimeLast,
			Integer version) {
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
		this.commentsInRange = commentsInRange;
		this.updated = updated;
		this.commentsTimeLast = commentsTimeLast;
		this.version = version;
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Long getComments() {
		return this.comments;
	}

	public void setComments(Long comments) {
		this.comments = comments;
	}

	public Long getCommentsInRange() {
		return this.commentsInRange;
	}

	public void setCommentsInRange(Long commentsInRange) {
		this.commentsInRange = commentsInRange;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public Long getCommentsTimeLast() {
		return this.commentsTimeLast;
	}

	public void setCommentsTimeLast(Long commentsTimeLast) {
		this.commentsTimeLast = commentsTimeLast;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}