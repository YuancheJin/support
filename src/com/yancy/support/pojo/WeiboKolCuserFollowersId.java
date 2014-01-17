package com.yancy.support.pojo;

/**
 * WeiboKolCuserFollowersId entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolCuserFollowersId implements java.io.Serializable {

	// Fields

	private String cuserId;
	private String userId;
	private String period;
	private String city;
	private String province;
	private String gender;
	private Integer followersCount;
	private Integer tweetsCount;
	private Integer verifiedType;
	private Integer influence;
	private Double zombieScore;
	private Integer interactive;
	private String userName;

	// Constructors

	/** default constructor */
	public WeiboKolCuserFollowersId() {
	}

	/** full constructor */
	public WeiboKolCuserFollowersId(String cuserId, String userId,
			String period, String city, String province, String gender,
			Integer followersCount, Integer tweetsCount, Integer verifiedType,
			Integer influence, Double zombieScore, Integer interactive,
			String userName) {
		this.cuserId = cuserId;
		this.userId = userId;
		this.period = period;
		this.city = city;
		this.province = province;
		this.gender = gender;
		this.followersCount = followersCount;
		this.tweetsCount = tweetsCount;
		this.verifiedType = verifiedType;
		this.influence = influence;
		this.zombieScore = zombieScore;
		this.interactive = interactive;
		this.userName = userName;
	}

	// Property accessors

	public String getCuserId() {
		return this.cuserId;
	}

	public void setCuserId(String cuserId) {
		this.cuserId = cuserId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getFollowersCount() {
		return this.followersCount;
	}

	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	public Integer getTweetsCount() {
		return this.tweetsCount;
	}

	public void setTweetsCount(Integer tweetsCount) {
		this.tweetsCount = tweetsCount;
	}

	public Integer getVerifiedType() {
		return this.verifiedType;
	}

	public void setVerifiedType(Integer verifiedType) {
		this.verifiedType = verifiedType;
	}

	public Integer getInfluence() {
		return this.influence;
	}

	public void setInfluence(Integer influence) {
		this.influence = influence;
	}

	public Double getZombieScore() {
		return this.zombieScore;
	}

	public void setZombieScore(Double zombieScore) {
		this.zombieScore = zombieScore;
	}

	public Integer getInteractive() {
		return this.interactive;
	}

	public void setInteractive(Integer interactive) {
		this.interactive = interactive;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeiboKolCuserFollowersId))
			return false;
		WeiboKolCuserFollowersId castOther = (WeiboKolCuserFollowersId) other;

		return ((this.getCuserId() == castOther.getCuserId()) || (this
				.getCuserId() != null
				&& castOther.getCuserId() != null && this.getCuserId().equals(
				castOther.getCuserId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId()
						.equals(castOther.getUserId())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null
						&& castOther.getCity() != null && this.getCity()
						.equals(castOther.getCity())))
				&& ((this.getProvince() == castOther.getProvince()) || (this
						.getProvince() != null
						&& castOther.getProvince() != null && this
						.getProvince().equals(castOther.getProvince())))
				&& ((this.getGender() == castOther.getGender()) || (this
						.getGender() != null
						&& castOther.getGender() != null && this.getGender()
						.equals(castOther.getGender())))
				&& ((this.getFollowersCount() == castOther.getFollowersCount()) || (this
						.getFollowersCount() != null
						&& castOther.getFollowersCount() != null && this
						.getFollowersCount().equals(
								castOther.getFollowersCount())))
				&& ((this.getTweetsCount() == castOther.getTweetsCount()) || (this
						.getTweetsCount() != null
						&& castOther.getTweetsCount() != null && this
						.getTweetsCount().equals(castOther.getTweetsCount())))
				&& ((this.getVerifiedType() == castOther.getVerifiedType()) || (this
						.getVerifiedType() != null
						&& castOther.getVerifiedType() != null && this
						.getVerifiedType().equals(castOther.getVerifiedType())))
				&& ((this.getInfluence() == castOther.getInfluence()) || (this
						.getInfluence() != null
						&& castOther.getInfluence() != null && this
						.getInfluence().equals(castOther.getInfluence())))
				&& ((this.getZombieScore() == castOther.getZombieScore()) || (this
						.getZombieScore() != null
						&& castOther.getZombieScore() != null && this
						.getZombieScore().equals(castOther.getZombieScore())))
				&& ((this.getInteractive() == castOther.getInteractive()) || (this
						.getInteractive() != null
						&& castOther.getInteractive() != null && this
						.getInteractive().equals(castOther.getInteractive())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCuserId() == null ? 0 : this.getCuserId().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		result = 37 * result
				+ (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result
				+ (getProvince() == null ? 0 : this.getProvince().hashCode());
		result = 37 * result
				+ (getGender() == null ? 0 : this.getGender().hashCode());
		result = 37
				* result
				+ (getFollowersCount() == null ? 0 : this.getFollowersCount()
						.hashCode());
		result = 37
				* result
				+ (getTweetsCount() == null ? 0 : this.getTweetsCount()
						.hashCode());
		result = 37
				* result
				+ (getVerifiedType() == null ? 0 : this.getVerifiedType()
						.hashCode());
		result = 37 * result
				+ (getInfluence() == null ? 0 : this.getInfluence().hashCode());
		result = 37
				* result
				+ (getZombieScore() == null ? 0 : this.getZombieScore()
						.hashCode());
		result = 37
				* result
				+ (getInteractive() == null ? 0 : this.getInteractive()
						.hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		return result;
	}

}