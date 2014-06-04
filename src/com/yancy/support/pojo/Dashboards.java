package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Dashboards entity. @author MyEclipse Persistence Tools
 */

public class Dashboards implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private Timestamp createdTime;
	private String period;
	private Integer positive;
	private Integer negative;
	private Integer neutral;
	private Integer threads;
	private Integer posts;
	private Float sov;
	private String sovTrend;
	private String threadsTrend;
	private String postsTrend;
	private String sentimentTrend;
	private Boolean filtered;
	private Boolean includeBuzz;
	private Integer version;

	// Constructors

	/** default constructor */
	public Dashboards() {
	}

	/** minimal constructor */
	public Dashboards(String scope) {
		this.scope = scope;
	}

	/** full constructor */
	public Dashboards(String scope, Timestamp createdTime, String period,
			Integer positive, Integer negative, Integer neutral,
			Integer threads, Integer posts, Float sov, String sovTrend,
			String threadsTrend, String postsTrend, String sentimentTrend,
			Boolean filtered, Boolean includeBuzz, Integer version) {
		this.scope = scope;
		this.createdTime = createdTime;
		this.period = period;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.threads = threads;
		this.posts = posts;
		this.sov = sov;
		this.sovTrend = sovTrend;
		this.threadsTrend = threadsTrend;
		this.postsTrend = postsTrend;
		this.sentimentTrend = sentimentTrend;
		this.filtered = filtered;
		this.includeBuzz = includeBuzz;
		this.version = version;
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

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
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

	public Integer getThreads() {
		return this.threads;
	}

	public void setThreads(Integer threads) {
		this.threads = threads;
	}

	public Integer getPosts() {
		return this.posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public Float getSov() {
		return this.sov;
	}

	public void setSov(Float sov) {
		this.sov = sov;
	}

	public String getSovTrend() {
		return this.sovTrend;
	}

	public void setSovTrend(String sovTrend) {
		this.sovTrend = sovTrend;
	}

	public String getThreadsTrend() {
		return this.threadsTrend;
	}

	public void setThreadsTrend(String threadsTrend) {
		this.threadsTrend = threadsTrend;
	}

	public String getPostsTrend() {
		return this.postsTrend;
	}

	public void setPostsTrend(String postsTrend) {
		this.postsTrend = postsTrend;
	}

	public String getSentimentTrend() {
		return this.sentimentTrend;
	}

	public void setSentimentTrend(String sentimentTrend) {
		this.sentimentTrend = sentimentTrend;
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

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}