package com.yancy.support.pojo;

/**
 * WeiboHotThreads entity. @author MyEclipse Persistence Tools
 */

public class WeiboHotThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String threadId;
	private Integer comments;
	private Integer reposts;
	private Float sortValue;
	private Integer year;
	private Integer month;
	private Integer day;
	private Long createdAt;
	private String title;
	private String url;
	private String positiveTagsString;
	private String predictTagsString;
	private String topic;
	private String siteName;
	private String meida;
	private Integer siteId;
	private String repostTo;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboHotThreads() {
	}

	/** full constructor */
	public WeiboHotThreads(String scope, String threadId, Integer comments,
			Integer reposts, Float sortValue, Integer year, Integer month,
			Integer day, Long createdAt, String title, String url,
			String positiveTagsString, String predictTagsString, String topic,
			String siteName, String meida, Integer siteId, String repostTo,
			Integer version) {
		this.scope = scope;
		this.threadId = threadId;
		this.comments = comments;
		this.reposts = reposts;
		this.sortValue = sortValue;
		this.year = year;
		this.month = month;
		this.day = day;
		this.createdAt = createdAt;
		this.title = title;
		this.url = url;
		this.positiveTagsString = positiveTagsString;
		this.predictTagsString = predictTagsString;
		this.topic = topic;
		this.siteName = siteName;
		this.meida = meida;
		this.siteId = siteId;
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

	public Float getSortValue() {
		return this.sortValue;
	}

	public void setSortValue(Float sortValue) {
		this.sortValue = sortValue;
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

	public Long getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
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

	public String getPositiveTagsString() {
		return this.positiveTagsString;
	}

	public void setPositiveTagsString(String positiveTagsString) {
		this.positiveTagsString = positiveTagsString;
	}

	public String getPredictTagsString() {
		return this.predictTagsString;
	}

	public void setPredictTagsString(String predictTagsString) {
		this.predictTagsString = predictTagsString;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getMeida() {
		return this.meida;
	}

	public void setMeida(String meida) {
		this.meida = meida;
	}

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
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