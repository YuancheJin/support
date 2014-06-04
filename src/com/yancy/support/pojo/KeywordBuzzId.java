package com.yancy.support.pojo;

/**
 * KeywordBuzzId entity. @author MyEclipse Persistence Tools
 */

public class KeywordBuzzId implements java.io.Serializable {

	// Fields

	private String scope;
	private String keyword;
	private Long date;
	private Integer volumeNodup;
	private Integer volumeDup;

	// Constructors

	/** default constructor */
	public KeywordBuzzId() {
	}

	/** minimal constructor */
	public KeywordBuzzId(Long date) {
		this.date = date;
	}

	/** full constructor */
	public KeywordBuzzId(String scope, String keyword, Long date,
			Integer volumeNodup, Integer volumeDup) {
		this.scope = scope;
		this.keyword = keyword;
		this.date = date;
		this.volumeNodup = volumeNodup;
		this.volumeDup = volumeDup;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getDate() {
		return this.date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Integer getVolumeNodup() {
		return this.volumeNodup;
	}

	public void setVolumeNodup(Integer volumeNodup) {
		this.volumeNodup = volumeNodup;
	}

	public Integer getVolumeDup() {
		return this.volumeDup;
	}

	public void setVolumeDup(Integer volumeDup) {
		this.volumeDup = volumeDup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KeywordBuzzId))
			return false;
		KeywordBuzzId castOther = (KeywordBuzzId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getKeyword() == castOther.getKeyword()) || (this
						.getKeyword() != null
						&& castOther.getKeyword() != null && this.getKeyword()
						.equals(castOther.getKeyword())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getVolumeNodup() == castOther.getVolumeNodup()) || (this
						.getVolumeNodup() != null
						&& castOther.getVolumeNodup() != null && this
						.getVolumeNodup().equals(castOther.getVolumeNodup())))
				&& ((this.getVolumeDup() == castOther.getVolumeDup()) || (this
						.getVolumeDup() != null
						&& castOther.getVolumeDup() != null && this
						.getVolumeDup().equals(castOther.getVolumeDup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScope() == null ? 0 : this.getScope().hashCode());
		result = 37 * result
				+ (getKeyword() == null ? 0 : this.getKeyword().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37
				* result
				+ (getVolumeNodup() == null ? 0 : this.getVolumeNodup()
						.hashCode());
		result = 37 * result
				+ (getVolumeDup() == null ? 0 : this.getVolumeDup().hashCode());
		return result;
	}

}