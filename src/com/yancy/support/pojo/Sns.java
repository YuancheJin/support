package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * Sns entity. @author MyEclipse Persistence Tools
 */

public class Sns implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String accessToken;
	private String accessTokenSecret;
	private String source;
	private String refreshToken;
	private String sessionId;
	private String user;
	private String nick;
	private String profileImgPath;
	private String bigProfileImgPath;
	private String smallProfileImgPath;
	private Integer userId;
	private Boolean enable;
	private Integer expiresIn;
	private Integer expiresAt;
	private Integer competitor;
	private Integer accountType;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer runnerAccount;
	private Timestamp nextFollowersCollecting;
	private Short inFollowersQueue;
	private Timestamp nextTimelineCollecting;
	private Short inTimelineQueue;
	private String openid;

	// Constructors

	/** default constructor */
	public Sns() {
	}

	/** full constructor */
	public Sns(String username, String password, String accessToken,
			String accessTokenSecret, String source, String refreshToken,
			String sessionId, String user, String nick, String profileImgPath,
			String bigProfileImgPath, String smallProfileImgPath,
			Integer userId, Boolean enable, Integer expiresIn,
			Integer expiresAt, Integer competitor, Integer accountType,
			Timestamp createdAt, Timestamp updatedAt, Integer runnerAccount,
			Timestamp nextFollowersCollecting, Short inFollowersQueue,
			Timestamp nextTimelineCollecting, Short inTimelineQueue,
			String openid) {
		this.username = username;
		this.password = password;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
		this.source = source;
		this.refreshToken = refreshToken;
		this.sessionId = sessionId;
		this.user = user;
		this.nick = nick;
		this.profileImgPath = profileImgPath;
		this.bigProfileImgPath = bigProfileImgPath;
		this.smallProfileImgPath = smallProfileImgPath;
		this.userId = userId;
		this.enable = enable;
		this.expiresIn = expiresIn;
		this.expiresAt = expiresAt;
		this.competitor = competitor;
		this.accountType = accountType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.runnerAccount = runnerAccount;
		this.nextFollowersCollecting = nextFollowersCollecting;
		this.inFollowersQueue = inFollowersQueue;
		this.nextTimelineCollecting = nextTimelineCollecting;
		this.inTimelineQueue = inTimelineQueue;
		this.openid = openid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessTokenSecret() {
		return this.accessTokenSecret;
	}

	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getProfileImgPath() {
		return this.profileImgPath;
	}

	public void setProfileImgPath(String profileImgPath) {
		this.profileImgPath = profileImgPath;
	}

	public String getBigProfileImgPath() {
		return this.bigProfileImgPath;
	}

	public void setBigProfileImgPath(String bigProfileImgPath) {
		this.bigProfileImgPath = bigProfileImgPath;
	}

	public String getSmallProfileImgPath() {
		return this.smallProfileImgPath;
	}

	public void setSmallProfileImgPath(String smallProfileImgPath) {
		this.smallProfileImgPath = smallProfileImgPath;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Integer getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Integer getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Integer expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Integer getCompetitor() {
		return this.competitor;
	}

	public void setCompetitor(Integer competitor) {
		this.competitor = competitor;
	}

	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
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

	public Integer getRunnerAccount() {
		return this.runnerAccount;
	}

	public void setRunnerAccount(Integer runnerAccount) {
		this.runnerAccount = runnerAccount;
	}

	public Timestamp getNextFollowersCollecting() {
		return this.nextFollowersCollecting;
	}

	public void setNextFollowersCollecting(Timestamp nextFollowersCollecting) {
		this.nextFollowersCollecting = nextFollowersCollecting;
	}

	public Short getInFollowersQueue() {
		return this.inFollowersQueue;
	}

	public void setInFollowersQueue(Short inFollowersQueue) {
		this.inFollowersQueue = inFollowersQueue;
	}

	public Timestamp getNextTimelineCollecting() {
		return this.nextTimelineCollecting;
	}

	public void setNextTimelineCollecting(Timestamp nextTimelineCollecting) {
		this.nextTimelineCollecting = nextTimelineCollecting;
	}

	public Short getInTimelineQueue() {
		return this.inTimelineQueue;
	}

	public void setInTimelineQueue(Short inTimelineQueue) {
		this.inTimelineQueue = inTimelineQueue;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

}