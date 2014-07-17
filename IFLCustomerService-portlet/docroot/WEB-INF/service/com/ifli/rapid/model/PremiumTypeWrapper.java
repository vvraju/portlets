/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.ifli.rapid.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PremiumType}.
 * </p>
 *
 * @author Satya Kola
 * @see PremiumType
 * @generated
 */
public class PremiumTypeWrapper implements PremiumType,
	ModelWrapper<PremiumType> {
	public PremiumTypeWrapper(PremiumType premiumType) {
		_premiumType = premiumType;
	}

	@Override
	public Class<?> getModelClass() {
		return PremiumType.class;
	}

	@Override
	public String getModelClassName() {
		return PremiumType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("Active", getActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Id = (String)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		Boolean Active = (Boolean)attributes.get("Active");

		if (Active != null) {
			setActive(Active);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		Integer Priority = (Integer)attributes.get("Priority");

		if (Priority != null) {
			setPriority(Priority);
		}
	}

	/**
	* Returns the primary key of this premium type.
	*
	* @return the primary key of this premium type
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _premiumType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this premium type.
	*
	* @param primaryKey the primary key of this premium type
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_premiumType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this premium type.
	*
	* @return the ID of this premium type
	*/
	@Override
	public java.lang.String getId() {
		return _premiumType.getId();
	}

	/**
	* Sets the ID of this premium type.
	*
	* @param Id the ID of this premium type
	*/
	@Override
	public void setId(java.lang.String Id) {
		_premiumType.setId(Id);
	}

	/**
	* Returns the name of this premium type.
	*
	* @return the name of this premium type
	*/
	@Override
	public java.lang.String getName() {
		return _premiumType.getName();
	}

	/**
	* Sets the name of this premium type.
	*
	* @param Name the name of this premium type
	*/
	@Override
	public void setName(java.lang.String Name) {
		_premiumType.setName(Name);
	}

	/**
	* Returns the active of this premium type.
	*
	* @return the active of this premium type
	*/
	@Override
	public boolean getActive() {
		return _premiumType.getActive();
	}

	/**
	* Returns <code>true</code> if this premium type is active.
	*
	* @return <code>true</code> if this premium type is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _premiumType.isActive();
	}

	/**
	* Sets whether this premium type is active.
	*
	* @param Active the active of this premium type
	*/
	@Override
	public void setActive(boolean Active) {
		_premiumType.setActive(Active);
	}

	/**
	* Returns the created by of this premium type.
	*
	* @return the created by of this premium type
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _premiumType.getCreatedBy();
	}

	/**
	* Sets the created by of this premium type.
	*
	* @param CreatedBy the created by of this premium type
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_premiumType.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this premium type.
	*
	* @return the created date of this premium type
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _premiumType.getCreatedDate();
	}

	/**
	* Sets the created date of this premium type.
	*
	* @param CreatedDate the created date of this premium type
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_premiumType.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this premium type.
	*
	* @return the modified by of this premium type
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _premiumType.getModifiedBy();
	}

	/**
	* Sets the modified by of this premium type.
	*
	* @param ModifiedBy the modified by of this premium type
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_premiumType.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this premium type.
	*
	* @return the modified date of this premium type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _premiumType.getModifiedDate();
	}

	/**
	* Sets the modified date of this premium type.
	*
	* @param ModifiedDate the modified date of this premium type
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_premiumType.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this premium type.
	*
	* @return the priority of this premium type
	*/
	@Override
	public int getPriority() {
		return _premiumType.getPriority();
	}

	/**
	* Sets the priority of this premium type.
	*
	* @param Priority the priority of this premium type
	*/
	@Override
	public void setPriority(int Priority) {
		_premiumType.setPriority(Priority);
	}

	@Override
	public boolean isNew() {
		return _premiumType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_premiumType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _premiumType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_premiumType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _premiumType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _premiumType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_premiumType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _premiumType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_premiumType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_premiumType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_premiumType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PremiumTypeWrapper((PremiumType)_premiumType.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PremiumType premiumType) {
		return _premiumType.compareTo(premiumType);
	}

	@Override
	public int hashCode() {
		return _premiumType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PremiumType> toCacheModel() {
		return _premiumType.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PremiumType toEscapedModel() {
		return new PremiumTypeWrapper(_premiumType.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PremiumType toUnescapedModel() {
		return new PremiumTypeWrapper(_premiumType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _premiumType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _premiumType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_premiumType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PremiumTypeWrapper)) {
			return false;
		}

		PremiumTypeWrapper premiumTypeWrapper = (PremiumTypeWrapper)obj;

		if (Validator.equals(_premiumType, premiumTypeWrapper._premiumType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PremiumType getWrappedPremiumType() {
		return _premiumType;
	}

	@Override
	public PremiumType getWrappedModel() {
		return _premiumType;
	}

	@Override
	public void resetOriginalValues() {
		_premiumType.resetOriginalValues();
	}

	private PremiumType _premiumType;
}