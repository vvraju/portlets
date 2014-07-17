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
 * This class is a wrapper for {@link PremiumFrequencyMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see PremiumFrequencyMaster
 * @generated
 */
public class PremiumFrequencyMasterWrapper implements PremiumFrequencyMaster,
	ModelWrapper<PremiumFrequencyMaster> {
	public PremiumFrequencyMasterWrapper(
		PremiumFrequencyMaster premiumFrequencyMaster) {
		_premiumFrequencyMaster = premiumFrequencyMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return PremiumFrequencyMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PremiumFrequencyMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PremiumFrequencyId", getPremiumFrequencyId());
		attributes.put("PremiumFrequencyDescription",
			getPremiumFrequencyDescription());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PremiumFrequencyId = (String)attributes.get("PremiumFrequencyId");

		if (PremiumFrequencyId != null) {
			setPremiumFrequencyId(PremiumFrequencyId);
		}

		String PremiumFrequencyDescription = (String)attributes.get(
				"PremiumFrequencyDescription");

		if (PremiumFrequencyDescription != null) {
			setPremiumFrequencyDescription(PremiumFrequencyDescription);
		}

		Boolean IsActive = (Boolean)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
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
	* Returns the primary key of this premium frequency master.
	*
	* @return the primary key of this premium frequency master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _premiumFrequencyMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this premium frequency master.
	*
	* @param primaryKey the primary key of this premium frequency master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_premiumFrequencyMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the premium frequency ID of this premium frequency master.
	*
	* @return the premium frequency ID of this premium frequency master
	*/
	@Override
	public java.lang.String getPremiumFrequencyId() {
		return _premiumFrequencyMaster.getPremiumFrequencyId();
	}

	/**
	* Sets the premium frequency ID of this premium frequency master.
	*
	* @param PremiumFrequencyId the premium frequency ID of this premium frequency master
	*/
	@Override
	public void setPremiumFrequencyId(java.lang.String PremiumFrequencyId) {
		_premiumFrequencyMaster.setPremiumFrequencyId(PremiumFrequencyId);
	}

	/**
	* Returns the premium frequency description of this premium frequency master.
	*
	* @return the premium frequency description of this premium frequency master
	*/
	@Override
	public java.lang.String getPremiumFrequencyDescription() {
		return _premiumFrequencyMaster.getPremiumFrequencyDescription();
	}

	/**
	* Sets the premium frequency description of this premium frequency master.
	*
	* @param PremiumFrequencyDescription the premium frequency description of this premium frequency master
	*/
	@Override
	public void setPremiumFrequencyDescription(
		java.lang.String PremiumFrequencyDescription) {
		_premiumFrequencyMaster.setPremiumFrequencyDescription(PremiumFrequencyDescription);
	}

	/**
	* Returns the is active of this premium frequency master.
	*
	* @return the is active of this premium frequency master
	*/
	@Override
	public boolean getIsActive() {
		return _premiumFrequencyMaster.getIsActive();
	}

	/**
	* Returns <code>true</code> if this premium frequency master is is active.
	*
	* @return <code>true</code> if this premium frequency master is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _premiumFrequencyMaster.isIsActive();
	}

	/**
	* Sets whether this premium frequency master is is active.
	*
	* @param IsActive the is active of this premium frequency master
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_premiumFrequencyMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this premium frequency master.
	*
	* @return the created by of this premium frequency master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _premiumFrequencyMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this premium frequency master.
	*
	* @param CreatedBy the created by of this premium frequency master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_premiumFrequencyMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this premium frequency master.
	*
	* @return the created date of this premium frequency master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _premiumFrequencyMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this premium frequency master.
	*
	* @param CreatedDate the created date of this premium frequency master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_premiumFrequencyMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this premium frequency master.
	*
	* @return the modified by of this premium frequency master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _premiumFrequencyMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this premium frequency master.
	*
	* @param ModifiedBy the modified by of this premium frequency master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_premiumFrequencyMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this premium frequency master.
	*
	* @return the modified date of this premium frequency master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _premiumFrequencyMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this premium frequency master.
	*
	* @param ModifiedDate the modified date of this premium frequency master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_premiumFrequencyMaster.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this premium frequency master.
	*
	* @return the priority of this premium frequency master
	*/
	@Override
	public int getPriority() {
		return _premiumFrequencyMaster.getPriority();
	}

	/**
	* Sets the priority of this premium frequency master.
	*
	* @param Priority the priority of this premium frequency master
	*/
	@Override
	public void setPriority(int Priority) {
		_premiumFrequencyMaster.setPriority(Priority);
	}

	@Override
	public boolean isNew() {
		return _premiumFrequencyMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_premiumFrequencyMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _premiumFrequencyMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_premiumFrequencyMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _premiumFrequencyMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _premiumFrequencyMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_premiumFrequencyMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _premiumFrequencyMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_premiumFrequencyMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_premiumFrequencyMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_premiumFrequencyMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PremiumFrequencyMasterWrapper((PremiumFrequencyMaster)_premiumFrequencyMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster) {
		return _premiumFrequencyMaster.compareTo(premiumFrequencyMaster);
	}

	@Override
	public int hashCode() {
		return _premiumFrequencyMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PremiumFrequencyMaster> toCacheModel() {
		return _premiumFrequencyMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster toEscapedModel() {
		return new PremiumFrequencyMasterWrapper(_premiumFrequencyMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster toUnescapedModel() {
		return new PremiumFrequencyMasterWrapper(_premiumFrequencyMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _premiumFrequencyMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _premiumFrequencyMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_premiumFrequencyMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PremiumFrequencyMasterWrapper)) {
			return false;
		}

		PremiumFrequencyMasterWrapper premiumFrequencyMasterWrapper = (PremiumFrequencyMasterWrapper)obj;

		if (Validator.equals(_premiumFrequencyMaster,
					premiumFrequencyMasterWrapper._premiumFrequencyMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PremiumFrequencyMaster getWrappedPremiumFrequencyMaster() {
		return _premiumFrequencyMaster;
	}

	@Override
	public PremiumFrequencyMaster getWrappedModel() {
		return _premiumFrequencyMaster;
	}

	@Override
	public void resetOriginalValues() {
		_premiumFrequencyMaster.resetOriginalValues();
	}

	private PremiumFrequencyMaster _premiumFrequencyMaster;
}