package com.yancy.support.pojo;

/**
 * KeywordBuzz entity. @author MyEclipse Persistence Tools
 */

public class KeywordBuzz implements java.io.Serializable {

	// Fields

	private KeywordBuzzId id;

	// Constructors

	/** default constructor */
	public KeywordBuzz() {
	}

	/** full constructor */
	public KeywordBuzz(KeywordBuzzId id) {
		this.id = id;
	}

	// Property accessors

	public KeywordBuzzId getId() {
		return this.id;
	}

	public void setId(KeywordBuzzId id) {
		this.id = id;
	}

}