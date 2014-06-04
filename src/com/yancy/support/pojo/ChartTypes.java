package com.yancy.support.pojo;

/**
 * ChartTypes entity. @author MyEclipse Persistence Tools
 */

public class ChartTypes implements java.io.Serializable {

	// Fields

	private ChartTypesId id;

	// Constructors

	/** default constructor */
	public ChartTypes() {
	}

	/** full constructor */
	public ChartTypes(ChartTypesId id) {
		this.id = id;
	}

	// Property accessors

	public ChartTypesId getId() {
		return this.id;
	}

	public void setId(ChartTypesId id) {
		this.id = id;
	}

}