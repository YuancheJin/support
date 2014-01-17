package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * TodayThreads entity. @author MyEclipse Persistence Tools
 */

public class TodayThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String threadId;
	private String scope;
	private String topic;
	private Integer siteId;
	private String siteName;
	private String media;
	private Timestamp date;
	private String title;
	private String url;
	private String period;
	private Long posts;
	private Long postsInRange;
	private Long positive;
	private Long negative;
	private Long neutral;
	private Long positiveInRange;
	private Long negativeInRange;
	private Long neutralInRange;
	private Integer year;
	private Integer month;
	private Integer day;
	private Integer hour;
	private Integer minute;
	private Double relevance;
	private Integer reposts;
	private Integer comments;
	private Timestamp updated;
	private Boolean filtered;
	private String repostTo;
	private Integer version;

	// Constructors

	/** default constructor */
	public TodayThreads() {
	}

	/** full constructor */
	public TodayThreads(String threadId, String scope, String topic,
			Integer siteId, String siteName, String media, Timestamp date,
			String title, String url, String period, Long posts,
			Long postsInRange, Long positive, Long negative, Long neutral,
			Long positiveInRange, Long negativeInRange, Long neutralInRange,
			Integer year, Integer month, Integer day, Integer hour,
			Integer minute, Double relevance, Integer reposts,
			Integer comments, Timestamp updated, Boolean filtered,
			String repostTo, Integer version) {
		this.threadId = threadId;
		this.scope = scope;
		this.topic = topic;
		this.siteId = siteId;
		this.siteName = siteName;
		this.media = media;
		this.date = date;
		this.title = title;
		this.url = url;
		this.period = period;
		this.posts = posts;
		this.postsInRange = postsInRange;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.positiveInRange = positiveInRange;
		this.negativeInRange = negativeInRange;
		this.neutralInRange = neutralInRange;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.relevance = relevance;
		this.reposts = reposts;
		this.comments = comments;
		this.updated = updated;
		this.filtered = filtered;
		this.repostTo = repostTo;
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getPosts() {
		return this.posts;
	}

	public void setPosts(Long posts) {
		this.posts = posts;
	}

	public Long getPostsInRange() {
		return this.postsInRange;
	}

	public void setPostsInRange(Long postsInRange) {
		this.postsInRange = postsInRange;
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

	public Long getPositiveInRange() {
		return this.positiveInRange;
	}

	public void setPositiveInRange(Long positiveInRange) {
		this.positiveInRange = positiveInRange;
	}

	public Long getNegativeInRange() {
		return this.negativeInRange;
	}

	public void setNegativeInRange(Long negativeInRange) {
		this.negativeInRange = negativeInRange;
	}

	public Long getNeutralInRange() {
		return this.neutralInRange;
	}

	public void setNeutralInRange(Long neutralInRange) {
		this.neutralInRange = neutralInRange;
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

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Double getRelevance() {
		return this.relevance;
	}

	public void setRelevance(Double relevance) {
		this.relevance = relevance;
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

	public Boolean getFiltered() {
		return this.filtered;
	}

	public void setFiltered(Boolean filtered) {
		this.filtered = filtered;
	}

	public String getRepostTo() {
		return this.repostTo;
	}

	public void setRepostTo(String repostTo) {
		this.repostTo = repostTo;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}