package com.yancy.support.pojo;

/**
 * UserMessageMappings entity. @author MyEclipse Persistence Tools
 */

public class UserMessageMappings implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer snsId;
	private Integer snsMessageId;
	private String state;
	private String errMsg;
	private Integer userId;
	private String platform;

	// Constructors

	/** default constructor */
	public UserMessageMappings() {
	}

	/** full constructor */
	public UserMessageMappings(Integer snsId, Integer snsMessageId,
			String state, String errMsg, Integer userId, String platform) {
		this.snsId = snsId;
		this.snsMessageId = snsMessageId;
		this.state = state;
		this.errMsg = errMsg;
		this.userId = userId;
		this.platform = platform;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSnsId() {
		return this.snsId;
	}

	public void setSnsId(Integer snsId) {
		this.snsId = snsId;
	}

	public Integer getSnsMessageId() {
		return this.snsMessageId;
	}

	public void setSnsMessageId(Integer snsMessageId) {
		this.snsMessageId = snsMessageId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}