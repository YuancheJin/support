package com.yancy.support.pojo;

/**
 * WeiboKolCuserFollowersResultsId entity. @author MyEclipse Persistence Tools
 */

public class WeiboKolCuserFollowersResultsId implements java.io.Serializable {

	// Fields

	private String cuserId;
	private Integer count;
	private Integer influence;
	private String zombie;
	private Integer interactiveCount;
	private Double spammer;
	private String human;
	private Integer newVerified;
	private String gender;
	private String verified;
	private String followers;
	private String location;
	private String zombies;
	private String genderCond;
	private String verifiedCond;
	private String period;
	private String followerCond;
	private String locationCond;
	private Integer version;

	// Constructors

	/** default constructor */
	public WeiboKolCuserFollowersResultsId() {
	}

	/** full constructor */
	public WeiboKolCuserFollowersResultsId(String cuserId, Integer count,
			Integer influence, String zombie, Integer interactiveCount,
			Double spammer, String human, Integer newVerified, String gender,
			String verified, String followers, String location, String zombies,
			String genderCond, String verifiedCond, String period,
			String followerCond, String locationCond, Integer version) {
		this.cuserId = cuserId;
		this.count = count;
		this.influence = influence;
		this.zombie = zombie;
		this.interactiveCount = interactiveCount;
		this.spammer = spammer;
		this.human = human;
		this.newVerified = newVerified;
		this.gender = gender;
		this.verified = verified;
		this.followers = followers;
		this.location = location;
		this.zombies = zombies;
		this.genderCond = genderCond;
		this.verifiedCond = verifiedCond;
		this.period = period;
		this.followerCond = followerCond;
		this.locationCond = locationCond;
		this.version = version;
	}

	// Property accessors

	public String getCuserId() {
		return this.cuserId;
	}

	public void setCuserId(String cuserId) {
		this.cuserId = cuserId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getInfluence() {
		return this.influence;
	}

	public void setInfluence(Integer influence) {
		this.influence = influence;
	}

	public String getZombie() {
		return this.zombie;
	}

	public void setZombie(String zombie) {
		this.zombie = zombie;
	}

	public Integer getInteractiveCount() {
		return this.interactiveCount;
	}

	public void setInteractiveCount(Integer interactiveCount) {
		this.interactiveCount = interactiveCount;
	}

	public Double getSpammer() {
		return this.spammer;
	}

	public void setSpammer(Double spammer) {
		this.spammer = spammer;
	}

	public String getHuman() {
		return this.human;
	}

	public void setHuman(String human) {
		this.human = human;
	}

	public Integer getNewVerified() {
		return this.newVerified;
	}

	public void setNewVerified(Integer newVerified) {
		this.newVerified = newVerified;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVerified() {
		return this.verified;
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}

	public String getFollowers() {
		return this.followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getZombies() {
		return this.zombies;
	}

	public void setZombies(String zombies) {
		this.zombies = zombies;
	}

	public String getGenderCond() {
		return this.genderCond;
	}

	public void setGenderCond(String genderCond) {
		this.genderCond = genderCond;
	}

	public String getVerifiedCond() {
		return this.verifiedCond;
	}

	public void setVerifiedCond(String verifiedCond) {
		this.verifiedCond = verifiedCond;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getFollowerCond() {
		return this.followerCond;
	}

	public void setFollowerCond(String followerCond) {
		this.followerCond = followerCond;
	}

	public String getLocationCond() {
		return this.locationCond;
	}

	public void setLocationCond(String locationCond) {
		this.locationCond = locationCond;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeiboKolCuserFollowersResultsId))
			return false;
		WeiboKolCuserFollowersResultsId castOther = (WeiboKolCuserFollowersResultsId) other;

		return ((this.getCuserId() == castOther.getCuserId()) || (this
				.getCuserId() != null
				&& castOther.getCuserId() != null && this.getCuserId().equals(
				castOther.getCuserId())))
				&& ((this.getCount() == castOther.getCount()) || (this
						.getCount() != null
						&& castOther.getCount() != null && this.getCount()
						.equals(castOther.getCount())))
				&& ((this.getInfluence() == castOther.getInfluence()) || (this
						.getInfluence() != null
						&& castOther.getInfluence() != null && this
						.getInfluence().equals(castOther.getInfluence())))
				&& ((this.getZombie() == castOther.getZombie()) || (this
						.getZombie() != null
						&& castOther.getZombie() != null && this.getZombie()
						.equals(castOther.getZombie())))
				&& ((this.getInteractiveCount() == castOther
						.getInteractiveCount()) || (this.getInteractiveCount() != null
						&& castOther.getInteractiveCount() != null && this
						.getInteractiveCount().equals(
								castOther.getInteractiveCount())))
				&& ((this.getSpammer() == castOther.getSpammer()) || (this
						.getSpammer() != null
						&& castOther.getSpammer() != null && this.getSpammer()
						.equals(castOther.getSpammer())))
				&& ((this.getHuman() == castOther.getHuman()) || (this
						.getHuman() != null
						&& castOther.getHuman() != null && this.getHuman()
						.equals(castOther.getHuman())))
				&& ((this.getNewVerified() == castOther.getNewVerified()) || (this
						.getNewVerified() != null
						&& castOther.getNewVerified() != null && this
						.getNewVerified().equals(castOther.getNewVerified())))
				&& ((this.getGender() == castOther.getGender()) || (this
						.getGender() != null
						&& castOther.getGender() != null && this.getGender()
						.equals(castOther.getGender())))
				&& ((this.getVerified() == castOther.getVerified()) || (this
						.getVerified() != null
						&& castOther.getVerified() != null && this
						.getVerified().equals(castOther.getVerified())))
				&& ((this.getFollowers() == castOther.getFollowers()) || (this
						.getFollowers() != null
						&& castOther.getFollowers() != null && this
						.getFollowers().equals(castOther.getFollowers())))
				&& ((this.getLocation() == castOther.getLocation()) || (this
						.getLocation() != null
						&& castOther.getLocation() != null && this
						.getLocation().equals(castOther.getLocation())))
				&& ((this.getZombies() == castOther.getZombies()) || (this
						.getZombies() != null
						&& castOther.getZombies() != null && this.getZombies()
						.equals(castOther.getZombies())))
				&& ((this.getGenderCond() == castOther.getGenderCond()) || (this
						.getGenderCond() != null
						&& castOther.getGenderCond() != null && this
						.getGenderCond().equals(castOther.getGenderCond())))
				&& ((this.getVerifiedCond() == castOther.getVerifiedCond()) || (this
						.getVerifiedCond() != null
						&& castOther.getVerifiedCond() != null && this
						.getVerifiedCond().equals(castOther.getVerifiedCond())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())))
				&& ((this.getFollowerCond() == castOther.getFollowerCond()) || (this
						.getFollowerCond() != null
						&& castOther.getFollowerCond() != null && this
						.getFollowerCond().equals(castOther.getFollowerCond())))
				&& ((this.getLocationCond() == castOther.getLocationCond()) || (this
						.getLocationCond() != null
						&& castOther.getLocationCond() != null && this
						.getLocationCond().equals(castOther.getLocationCond())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion()
						.equals(castOther.getVersion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCuserId() == null ? 0 : this.getCuserId().hashCode());
		result = 37 * result
				+ (getCount() == null ? 0 : this.getCount().hashCode());
		result = 37 * result
				+ (getInfluence() == null ? 0 : this.getInfluence().hashCode());
		result = 37 * result
				+ (getZombie() == null ? 0 : this.getZombie().hashCode());
		result = 37
				* result
				+ (getInteractiveCount() == null ? 0 : this
						.getInteractiveCount().hashCode());
		result = 37 * result
				+ (getSpammer() == null ? 0 : this.getSpammer().hashCode());
		result = 37 * result
				+ (getHuman() == null ? 0 : this.getHuman().hashCode());
		result = 37
				* result
				+ (getNewVerified() == null ? 0 : this.getNewVerified()
						.hashCode());
		result = 37 * result
				+ (getGender() == null ? 0 : this.getGender().hashCode());
		result = 37 * result
				+ (getVerified() == null ? 0 : this.getVerified().hashCode());
		result = 37 * result
				+ (getFollowers() == null ? 0 : this.getFollowers().hashCode());
		result = 37 * result
				+ (getLocation() == null ? 0 : this.getLocation().hashCode());
		result = 37 * result
				+ (getZombies() == null ? 0 : this.getZombies().hashCode());
		result = 37
				* result
				+ (getGenderCond() == null ? 0 : this.getGenderCond()
						.hashCode());
		result = 37
				* result
				+ (getVerifiedCond() == null ? 0 : this.getVerifiedCond()
						.hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		result = 37
				* result
				+ (getFollowerCond() == null ? 0 : this.getFollowerCond()
						.hashCode());
		result = 37
				* result
				+ (getLocationCond() == null ? 0 : this.getLocationCond()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		return result;
	}

}