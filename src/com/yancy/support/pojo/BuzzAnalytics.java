package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * BuzzAnalytics entity. @author MyEclipse Persistence Tools
 */

public class BuzzAnalytics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String topic;
	private Integer posts;
	private Integer threads;
	private Integer day;
	private Integer month;
	private Integer year;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Float sov;
	private Float netSentiment;
	private String media;
	private Timestamp createdTime;
	private Timestamp date;
	private String siteId;
	private Boolean filtered;
	private Boolean includeBuzz;

	// Constructors

	/** default constructor */
	public BuzzAnalytics() {
	}

	/** minimal constructor */
	public BuzzAnalytics(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public BuzzAnalytics(String scope, String topic, Integer posts,
			Integer threads, Integer day, Integer month, Integer year,
			Integer positive, Integer negative, Integer neutral, Float sov,
			Float netSentiment, String media, Timestamp createdTime,
			Timestamp date, String siteId, Boolean filtered, Boolean includeBuzz) {
		this.scope = scope;
		this.topic = topic;
		this.posts = posts;
		this.threads = threads;
		this.day = day;
		this.month = month;
		this.year = year;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.sov = sov;
		this.netSentiment = netSentiment;
		this.media = media;
		this.createdTime = createdTime;
		this.date = date;
		this.siteId = siteId;
		this.filtered = filtered;
		this.includeBuzz = includeBuzz;
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

	public Integer getPosts() {
		return this.posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public Integer getThreads() {
		return this.threads;
	}

	public void setThreads(Integer threads) {
		this.threads = threads;
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

	public Float getSov() {
		return this.sov;
	}

	public void setSov(Float sov) {
		this.sov = sov;
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

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public Boolean getFiltered() {
		return this.filtered;
	}

	public void setFiltered(Boolean filtered) {
		this.filtered = filtered;
	}

	public Boolean getIncludeBuzz() {
		return this.includeBuzz;
	}

	public void setIncludeBuzz(Boolean includeBuzz) {
		this.includeBuzz = includeBuzz;
	}

}