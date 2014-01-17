package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * WeiboTodayThreads entity. @author MyEclipse Persistence Tools
 */

public class WeiboTodayThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String threadId;
	private String scope;
	private String topic;
	private String siteId;
	private String siteName;
	private String media;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String title;
	private String url;
	private Integer comments;
	private Integer reposts;

	// Constructors

	/** default constructor */
	public WeiboTodayThreads() {
	}

	/** minimal constructor */
	public WeiboTodayThreads(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public WeiboTodayThreads(String threadId, String scope, String topic,
			String siteId, String siteName, String media, Timestamp createdAt,
			Timestamp updatedAt, String title, String url, Integer comments,
			Integer reposts) {
		this.threadId = threadId;
		this.scope = scope;
		this.topic = topic;
		this.siteId = siteId;
		this.siteName = siteName;
		this.media = media;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.title = title;
		this.url = url;
		this.comments = comments;
		this.reposts = reposts;
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

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
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

}