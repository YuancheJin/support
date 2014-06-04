package com.yancy.support.pojo;

/**
 * FacebookDashboardsId entity. @author MyEclipse Persistence Tools
 */

public class FacebookDashboardsId implements java.io.Serializable {

	// Fields

	private String scope;
	private Integer period;
	private Integer newFriends;
	private String newFriendsTrendPercentage;
	private Integer posts;
	private String postsTrendPercentage;
	private Integer likes;
	private String likesTrendPercentage;
	private Integer comments;
	private String commentsTrendPercentage;
	private Integer shares;
	private String sharesTrendPercentage;
	private Integer version;

	// Constructors

	/** default constructor */
	public FacebookDashboardsId() {
	}

	/** full constructor */
	public FacebookDashboardsId(String scope, Integer period,
			Integer newFriends, String newFriendsTrendPercentage,
			Integer posts, String postsTrendPercentage, Integer likes,
			String likesTrendPercentage, Integer comments,
			String commentsTrendPercentage, Integer shares,
			String sharesTrendPercentage, Integer version) {
		this.scope = scope;
		this.period = period;
		this.newFriends = newFriends;
		this.newFriendsTrendPercentage = newFriendsTrendPercentage;
		this.posts = posts;
		this.postsTrendPercentage = postsTrendPercentage;
		this.likes = likes;
		this.likesTrendPercentage = likesTrendPercentage;
		this.comments = comments;
		this.commentsTrendPercentage = commentsTrendPercentage;
		this.shares = shares;
		this.sharesTrendPercentage = sharesTrendPercentage;
		this.version = version;
	}

	// Property accessors

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getNewFriends() {
		return this.newFriends;
	}

	public void setNewFriends(Integer newFriends) {
		this.newFriends = newFriends;
	}

	public String getNewFriendsTrendPercentage() {
		return this.newFriendsTrendPercentage;
	}

	public void setNewFriendsTrendPercentage(String newFriendsTrendPercentage) {
		this.newFriendsTrendPercentage = newFriendsTrendPercentage;
	}

	public Integer getPosts() {
		return this.posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public String getPostsTrendPercentage() {
		return this.postsTrendPercentage;
	}

	public void setPostsTrendPercentage(String postsTrendPercentage) {
		this.postsTrendPercentage = postsTrendPercentage;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String getLikesTrendPercentage() {
		return this.likesTrendPercentage;
	}

	public void setLikesTrendPercentage(String likesTrendPercentage) {
		this.likesTrendPercentage = likesTrendPercentage;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public String getCommentsTrendPercentage() {
		return this.commentsTrendPercentage;
	}

	public void setCommentsTrendPercentage(String commentsTrendPercentage) {
		this.commentsTrendPercentage = commentsTrendPercentage;
	}

	public Integer getShares() {
		return this.shares;
	}

	public void setShares(Integer shares) {
		this.shares = shares;
	}

	public String getSharesTrendPercentage() {
		return this.sharesTrendPercentage;
	}

	public void setSharesTrendPercentage(String sharesTrendPercentage) {
		this.sharesTrendPercentage = sharesTrendPercentage;
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
		if (!(other instanceof FacebookDashboardsId))
			return false;
		FacebookDashboardsId castOther = (FacebookDashboardsId) other;

		return ((this.getScope() == castOther.getScope()) || (this.getScope() != null
				&& castOther.getScope() != null && this.getScope().equals(
				castOther.getScope())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())))
				&& ((this.getNewFriends() == castOther.getNewFriends()) || (this
						.getNewFriends() != null
						&& castOther.getNewFriends() != null && this
						.getNewFriends().equals(castOther.getNewFriends())))
				&& ((this.getNewFriendsTrendPercentage() == castOther
						.getNewFriendsTrendPercentage()) || (this
						.getNewFriendsTrendPercentage() != null
						&& castOther.getNewFriendsTrendPercentage() != null && this
						.getNewFriendsTrendPercentage().equals(
								castOther.getNewFriendsTrendPercentage())))
				&& ((this.getPosts() == castOther.getPosts()) || (this
						.getPosts() != null
						&& castOther.getPosts() != null && this.getPosts()
						.equals(castOther.getPosts())))
				&& ((this.getPostsTrendPercentage() == castOther
						.getPostsTrendPercentage()) || (this
						.getPostsTrendPercentage() != null
						&& castOther.getPostsTrendPercentage() != null && this
						.getPostsTrendPercentage().equals(
								castOther.getPostsTrendPercentage())))
				&& ((this.getLikes() == castOther.getLikes()) || (this
						.getLikes() != null
						&& castOther.getLikes() != null && this.getLikes()
						.equals(castOther.getLikes())))
				&& ((this.getLikesTrendPercentage() == castOther
						.getLikesTrendPercentage()) || (this
						.getLikesTrendPercentage() != null
						&& castOther.getLikesTrendPercentage() != null && this
						.getLikesTrendPercentage().equals(
								castOther.getLikesTrendPercentage())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())))
				&& ((this.getCommentsTrendPercentage() == castOther
						.getCommentsTrendPercentage()) || (this
						.getCommentsTrendPercentage() != null
						&& castOther.getCommentsTrendPercentage() != null && this
						.getCommentsTrendPercentage().equals(
								castOther.getCommentsTrendPercentage())))
				&& ((this.getShares() == castOther.getShares()) || (this
						.getShares() != null
						&& castOther.getShares() != null && this.getShares()
						.equals(castOther.getShares())))
				&& ((this.getSharesTrendPercentage() == castOther
						.getSharesTrendPercentage()) || (this
						.getSharesTrendPercentage() != null
						&& castOther.getSharesTrendPercentage() != null && this
						.getSharesTrendPercentage().equals(
								castOther.getSharesTrendPercentage())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion()
						.equals(castOther.getVersion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScope() == null ? 0 : this.getScope().hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		result = 37
				* result
				+ (getNewFriends() == null ? 0 : this.getNewFriends()
						.hashCode());
		result = 37
				* result
				+ (getNewFriendsTrendPercentage() == null ? 0 : this
						.getNewFriendsTrendPercentage().hashCode());
		result = 37 * result
				+ (getPosts() == null ? 0 : this.getPosts().hashCode());
		result = 37
				* result
				+ (getPostsTrendPercentage() == null ? 0 : this
						.getPostsTrendPercentage().hashCode());
		result = 37 * result
				+ (getLikes() == null ? 0 : this.getLikes().hashCode());
		result = 37
				* result
				+ (getLikesTrendPercentage() == null ? 0 : this
						.getLikesTrendPercentage().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		result = 37
				* result
				+ (getCommentsTrendPercentage() == null ? 0 : this
						.getCommentsTrendPercentage().hashCode());
		result = 37 * result
				+ (getShares() == null ? 0 : this.getShares().hashCode());
		result = 37
				* result
				+ (getSharesTrendPercentage() == null ? 0 : this
						.getSharesTrendPercentage().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		return result;
	}

}