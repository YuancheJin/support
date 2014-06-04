package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * ChartTypesId entity. @author MyEclipse Persistence Tools
 */

public class ChartTypesId implements java.io.Serializable {

	// Fields

	private String name;
	private Integer row;
	private Integer col;
	private String label;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String period;

	// Constructors

	/** default constructor */
	public ChartTypesId() {
	}

	/** minimal constructor */
	public ChartTypesId(Timestamp createdAt, Timestamp updatedAt) {
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/** full constructor */
	public ChartTypesId(String name, Integer row, Integer col, String label,
			Timestamp createdAt, Timestamp updatedAt, String period) {
		this.name = name;
		this.row = row;
		this.col = col;
		this.label = label;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.period = period;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRow() {
		return this.row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getCol() {
		return this.col;
	}

	public void setCol(Integer col) {
		this.col = col;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChartTypesId))
			return false;
		ChartTypesId castOther = (ChartTypesId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getRow() == castOther.getRow()) || (this.getRow() != null
						&& castOther.getRow() != null && this.getRow().equals(
						castOther.getRow())))
				&& ((this.getCol() == castOther.getCol()) || (this.getCol() != null
						&& castOther.getCol() != null && this.getCol().equals(
						castOther.getCol())))
				&& ((this.getLabel() == castOther.getLabel()) || (this
						.getLabel() != null
						&& castOther.getLabel() != null && this.getLabel()
						.equals(castOther.getLabel())))
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this
						.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this
						.getCreatedAt().equals(castOther.getCreatedAt())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this
						.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this
						.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getPeriod() == castOther.getPeriod()) || (this
						.getPeriod() != null
						&& castOther.getPeriod() != null && this.getPeriod()
						.equals(castOther.getPeriod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getRow() == null ? 0 : this.getRow().hashCode());
		result = 37 * result
				+ (getCol() == null ? 0 : this.getCol().hashCode());
		result = 37 * result
				+ (getLabel() == null ? 0 : this.getLabel().hashCode());
		result = 37 * result
				+ (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		result = 37 * result
				+ (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result
				+ (getPeriod() == null ? 0 : this.getPeriod().hashCode());
		return result;
	}

}