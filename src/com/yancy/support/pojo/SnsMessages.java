package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * SnsMessages entity. @author MyEclipse Persistence Tools
 */

public class SnsMessages implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;
	private Boolean delay;
	private Timestamp publishDate;
	private Integer publishYear;
	private Integer publishMonth;
	private Integer publishDay;
	private Integer publishHour;
	private Integer publishMinute;
	private String action;
	private String pic;
	private String platform;

	// Constructors

	/** default constructor */
	public SnsMessages() {
	}

	/** full constructor */
	public SnsMessages(String content, Boolean delay, Timestamp publishDate,
			Integer publishYear, Integer publishMonth, Integer publishDay,
			Integer publishHour, Integer publishMinute, String action,
			String pic, String platform) {
		this.content = content;
		this.delay = delay;
		this.publishDate = publishDate;
		this.publishYear = publishYear;
		this.publishMonth = publishMonth;
		this.publishDay = publishDay;
		this.publishHour = publishHour;
		this.publishMinute = publishMinute;
		this.action = action;
		this.pic = pic;
		this.platform = platform;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getDelay() {
		return this.delay;
	}

	public void setDelay(Boolean delay) {
		this.delay = delay;
	}

	public Timestamp getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getPublishYear() {
		return this.publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public Integer getPublishMonth() {
		return this.publishMonth;
	}

	public void setPublishMonth(Integer publishMonth) {
		this.publishMonth = publishMonth;
	}

	public Integer getPublishDay() {
		return this.publishDay;
	}

	public void setPublishDay(Integer publishDay) {
		this.publishDay = publishDay;
	}

	public Integer getPublishHour() {
		return this.publishHour;
	}

	public void setPublishHour(Integer publishHour) {
		this.publishHour = publishHour;
	}

	public Integer getPublishMinute() {
		return this.publishMinute;
	}

	public void setPublishMinute(Integer publishMinute) {
		this.publishMinute = publishMinute;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}