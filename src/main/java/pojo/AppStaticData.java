/**
 * Copyright (c) 1999 - 2016, Mtel, All rights reserved
 *
 *  File name   : AppStaticData.java
 *  Create Date : 2016年8月17日
 *  Author      : @author andrew
 */
package pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

// TODO: Auto-generated Javadoc
/**
 * The Class AppStaticData.
 */
@Entity
@Table(name = "AppStaticData")
public class AppStaticData {

	/** The id. */
	private Integer		id;
	
	/** The static data category. */
	private String		staticDataCategory;
	
	/** The static data type. */
	private String		staticDataType;
	
	/** The static data value. */
	private String		staticDataValue;
	
	/** The description. */
	private String      description;
	
	/** The cms display type. */
	private String      cmsDisplayType;
	/** The status. */
	private Boolean		status;
	
	/** The is delete. */
	private Boolean		isDelete;
	
	/** The create date. */
	private Timestamp	createDate;
	
	/** The created by. */
	private Integer		createdBy;
	
	/** The update date. */
	private Timestamp	updateDate;
	
	/** The updated by. */
	private Integer		updatedBy;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the static data category.
	 *
	 * @return the static data category
	 */
	@Column(name = "staticDataCategory")
	public String getStaticDataCategory() {
		return staticDataCategory;
	}

	/**
	 * Sets the static data category.
	 *
	 * @param staticDataCategory the new static data category
	 */
	public void setStaticDataCategory(String staticDataCategory) {
		this.staticDataCategory = staticDataCategory;
	}

	/**
	 * Gets the static data type.
	 *
	 * @return the static data type
	 */
	@Column(name = "staticDataType")
	public String getStaticDataType() {
		return staticDataType;
	}

	/**
	 * Sets the static data type.
	 *
	 * @param staticDataType the new static data type
	 */
	public void setStaticDataType(String staticDataType) {
		this.staticDataType = staticDataType;
	}

	/**
	 * Gets the static data value.
	 *
	 * @return the static data value
	 */
	@Column(name = "staticDataValue")
	public String getStaticDataValue() {
		return staticDataValue;
	}

	/**
	 * Sets the static data value.
	 *
	 * @param staticDataValue the new static data value
	 */
	public void setStaticDataValue(String staticDataValue) {
		this.staticDataValue = staticDataValue;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getStatus()
	 */
	@Column(name = "status")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public Boolean getStatus() {
		return status;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setStatus(java.lang.Boolean)
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getIsDelete()
	 */
	@Column(name = "isDelete")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public Boolean getIsDelete() {
		return isDelete;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setIsDelete(java.lang.Boolean)
	 */
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getCreateDate()
	 */
	@Column(name = "createDate")
	public Timestamp getCreateDate() {
		return createDate;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setCreateDate(java.sql.Timestamp)
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getCreatedBy()
	 */
	@Column(name = "createdBy")
	public Integer getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setCreatedBy(java.lang.Integer)
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getUpdateDate()
	 */
	@Column(name = "updateDate")
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setUpdateDate(java.sql.Timestamp)
	 */
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#getUpdatedBy()
	 */
	@Column(name = "updatedBy")
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/* (non-Javadoc)
	 * @see com.mtel.emcv.pojo.BaseEntityInterface#setUpdatedBy(java.lang.Integer)
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * Gets the cms display type.
	 *
	 * @return the cms display type
	 */
	@Column(name = "cmsDisplayType")
	public String getCmsDisplayType() {
		return cmsDisplayType;
	}

	/**
	 * Sets the cms display type.
	 *
	 * @param cmsDisplayType the new cms display type
	 */
	public void setCmsDisplayType(String cmsDisplayType) {
		this.cmsDisplayType = cmsDisplayType;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
