package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * SnsCollector entity. @author MyEclipse Persistence Tools
 */

public class SnsCollector implements java.io.Serializable {

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
	private String display1;
	private Integer memberId;
	private Boolean enable;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer expiresIn;
	private Integer expiresAt;
	private String display2;
	private Integer runnerAccount;
	private Timestamp nextFollowersCollecting;
	private Boolean inFollowersQueue;
	private Timestamp nextTimelineCollecting;
	private Boolean inTimelineQueue;

	// Constructors

	/** default constructor */
	public SnsCollector() {
	}

	/** minimal constructor */
	public SnsCollector(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public SnsCollector(String username, String password, String accessToken,
			String accessTokenSecret, String source, String refreshToken,
			String sessionId, String user, String nick, String profileImgPath,
			String bigProfileImgPath, String smallProfileImgPath,
			String display1, Integer memberId, Boolean enable,
			Timestamp createdAt, Timestamp updatedAt, Integer expiresIn,
			Integer expiresAt, String display2, Integer runnerAccount,
			Timestamp nextFollowersCollecting, Boolean inFollowersQueue,
			Timestamp nextTimelineCollecting, Boolean inTimelineQueue) {
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
		this.display1 = display1;
		this.memberId = memberId;
		this.enable = enable;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.expiresIn = expiresIn;
		this.expiresAt = expiresAt;
		this.display2 = display2;
		this.runnerAccount = runnerAccount;
		this.nextFollowersCollecting = nextFollowersCollecting;
		this.inFollowersQueue = inFollowersQueue;
		this.nextTimelineCollecting = nextTimelineCollecting;
		this.inTimelineQueue = inTimelineQueue;
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

	public String getDisplay1() {
		return this.display1;
	}

	public void setDisplay1(String display1) {
		this.display1 = display1;
	}

	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
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

	public String getDisplay2() {
		return this.display2;
	}

	public void setDisplay2(String display2) {
		this.display2 = display2;
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

	public Boolean getInFollowersQueue() {
		return this.inFollowersQueue;
	}

	public void setInFollowersQueue(Boolean inFollowersQueue) {
		this.inFollowersQueue = inFollowersQueue;
	}

	public Timestamp getNextTimelineCollecting() {
		return this.nextTimelineCollecting;
	}

	public void setNextTimelineCollecting(Timestamp nextTimelineCollecting) {
		this.nextTimelineCollecting = nextTimelineCollecting;
	}

	public Boolean getInTimelineQueue() {
		return this.inTimelineQueue;
	}

	public void setInTimelineQueue(Boolean inTimelineQueue) {
		this.inTimelineQueue = inTimelineQueue;
	}

}