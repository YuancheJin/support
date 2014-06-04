package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * HourlyThreads entity. @author MyEclipse Persistence Tools
 */

public class HourlyThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String threadId;
	private String topic;
	private Integer siteId;
	private String siteName;
	private String media;
	private Timestamp date;
	private String title;
	private String url;
	private Long posts;
	private Long positive;
	private Long negative;
	private Long neutral;
	private Integer reposts;
	private Integer comments;
	private Timestamp updated;
	private String repostTo;
	private Timestamp ymd;

	// Constructors

	/** default constructor */
	public HourlyThreads() {
	}

	/** full constructor */
	public HourlyThreads(String scope, String threadId, String topic,
			Integer siteId, String siteName, String media, Timestamp date,
			String title, String url, Long posts, Long positive, Long negative,
			Long neutral, Integer reposts, Integer comments, Timestamp updated,
			String repostTo, Timestamp ymd) {
		this.scope = scope;
		this.threadId = threadId;
		this.topic = topic;
		this.siteId = siteId;
		this.siteName = siteName;
		this.media = media;
		this.date = date;
		this.title = title;
		this.url = url;
		this.posts = posts;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.reposts = reposts;
		this.comments = comments;
		this.updated = updated;
		this.repostTo = repostTo;
		this.ymd = ymd;
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

	public String getThreadId() {
		return this.threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
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

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
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

	public Long getPosts() {
		return this.posts;
	}

	public void setPosts(Long posts) {
		this.posts = posts;
	}

	public Long getPositive() {
		return this.positive;
	}

	public void setPositive(Long positive) {
		this.positive = positive;
	}

	public Long getNegative() {
		return this.negative;
	}

	public void setNegative(Long negative) {
		this.negative = negative;
	}

	public Long getNeutral() {
		return this.neutral;
	}

	public void setNeutral(Long neutral) {
		this.neutral = neutral;
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

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getRepostTo() {
		return this.repostTo;
	}

	public void setRepostTo(String repostTo) {
		this.repostTo = repostTo;
	}

	public Timestamp getYmd() {
		return this.ymd;
	}

	public void setYmd(Timestamp ymd) {
		this.ymd = ymd;
	}

}