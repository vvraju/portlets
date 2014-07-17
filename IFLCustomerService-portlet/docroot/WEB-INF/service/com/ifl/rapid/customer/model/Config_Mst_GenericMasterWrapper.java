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

package com.ifl.rapid.customer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Config_Mst_GenericMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMaster
 * @generated
 */
public class Config_Mst_GenericMasterWrapper implements Config_Mst_GenericMaster,
	ModelWrapper<Config_Mst_GenericMaster> {
	public Config_Mst_GenericMasterWrapper(
		Config_Mst_GenericMaster config_Mst_GenericMaster) {
		_config_Mst_GenericMaster = config_Mst_GenericMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return Config_Mst_GenericMaster.class;
	}

	@Override
	public String getModelClassName() {
		return Config_Mst_GenericMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GenericMasterId", getGenericMasterId());
		attributes.put("MasterType", getMasterType());
		attributes.put("MasterId", getMasterId());
		attributes.put("MasterKey", getMasterKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer GenericMasterId = (Integer)attributes.get("GenericMasterId");

		if (GenericMasterId != null) {
			setGenericMasterId(GenericMasterId);
		}

		String MasterType = (String)attributes.get("MasterType");

		if (MasterType != null) {
			setMasterType(MasterType);
		}

		Integer MasterId = (Integer)attributes.get("MasterId");

		if (MasterId != null) {
			setMasterId(MasterId);
		}

		String MasterKey = (String)attributes.get("MasterKey");

		if (MasterKey != null) {
			setMasterKey(MasterKey);
		}

		String IsActive = (String)attributes.get("IsActive");

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

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	/**
	* Returns the primary key of this config_ mst_ generic master.
	*
	* @return the primary key of this config_ mst_ generic master
	*/
	@Override
	public int getPrimaryKey() {
		return _config_Mst_GenericMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this config_ mst_ generic master.
	*
	* @param primaryKey the primary key of this config_ mst_ generic master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_config_Mst_GenericMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the generic master ID of this config_ mst_ generic master.
	*
	* @return the generic master ID of this config_ mst_ generic master
	*/
	@Override
	public int getGenericMasterId() {
		return _config_Mst_GenericMaster.getGenericMasterId();
	}

	/**
	* Sets the generic master ID of this config_ mst_ generic master.
	*
	* @param GenericMasterId the generic master ID of this config_ mst_ generic master
	*/
	@Override
	public void setGenericMasterId(int GenericMasterId) {
		_config_Mst_GenericMaster.setGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the master type of this config_ mst_ generic master.
	*
	* @return the master type of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getMasterType() {
		return _config_Mst_GenericMaster.getMasterType();
	}

	/**
	* Sets the master type of this config_ mst_ generic master.
	*
	* @param MasterType the master type of this config_ mst_ generic master
	*/
	@Override
	public void setMasterType(java.lang.String MasterType) {
		_config_Mst_GenericMaster.setMasterType(MasterType);
	}

	/**
	* Returns the master ID of this config_ mst_ generic master.
	*
	* @return the master ID of this config_ mst_ generic master
	*/
	@Override
	public int getMasterId() {
		return _config_Mst_GenericMaster.getMasterId();
	}

	/**
	* Sets the master ID of this config_ mst_ generic master.
	*
	* @param MasterId the master ID of this config_ mst_ generic master
	*/
	@Override
	public void setMasterId(int MasterId) {
		_config_Mst_GenericMaster.setMasterId(MasterId);
	}

	/**
	* Returns the master key of this config_ mst_ generic master.
	*
	* @return the master key of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getMasterKey() {
		return _config_Mst_GenericMaster.getMasterKey();
	}

	/**
	* Sets the master key of this config_ mst_ generic master.
	*
	* @param MasterKey the master key of this config_ mst_ generic master
	*/
	@Override
	public void setMasterKey(java.lang.String MasterKey) {
		_config_Mst_GenericMaster.setMasterKey(MasterKey);
	}

	/**
	* Returns the is active of this config_ mst_ generic master.
	*
	* @return the is active of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getIsActive() {
		return _config_Mst_GenericMaster.getIsActive();
	}

	/**
	* Sets the is active of this config_ mst_ generic master.
	*
	* @param IsActive the is active of this config_ mst_ generic master
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_config_Mst_GenericMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this config_ mst_ generic master.
	*
	* @return the created by of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _config_Mst_GenericMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this config_ mst_ generic master.
	*
	* @param CreatedBy the created by of this config_ mst_ generic master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_config_Mst_GenericMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this config_ mst_ generic master.
	*
	* @return the created date of this config_ mst_ generic master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _config_Mst_GenericMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this config_ mst_ generic master.
	*
	* @param CreatedDate the created date of this config_ mst_ generic master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_config_Mst_GenericMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this config_ mst_ generic master.
	*
	* @return the modified by of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _config_Mst_GenericMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this config_ mst_ generic master.
	*
	* @param ModifiedBy the modified by of this config_ mst_ generic master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_config_Mst_GenericMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this config_ mst_ generic master.
	*
	* @return the modified date of this config_ mst_ generic master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _config_Mst_GenericMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this config_ mst_ generic master.
	*
	* @param ModifiedDate the modified date of this config_ mst_ generic master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_config_Mst_GenericMaster.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the description of this config_ mst_ generic master.
	*
	* @return the description of this config_ mst_ generic master
	*/
	@Override
	public java.lang.String getDescription() {
		return _config_Mst_GenericMaster.getDescription();
	}

	/**
	* Sets the description of this config_ mst_ generic master.
	*
	* @param Description the description of this config_ mst_ generic master
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_config_Mst_GenericMaster.setDescription(Description);
	}

	@Override
	public boolean isNew() {
		return _config_Mst_GenericMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_config_Mst_GenericMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _config_Mst_GenericMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_config_Mst_GenericMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _config_Mst_GenericMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _config_Mst_GenericMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_config_Mst_GenericMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _config_Mst_GenericMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_config_Mst_GenericMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_config_Mst_GenericMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_config_Mst_GenericMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Config_Mst_GenericMasterWrapper((Config_Mst_GenericMaster)_config_Mst_GenericMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster) {
		return _config_Mst_GenericMaster.compareTo(config_Mst_GenericMaster);
	}

	@Override
	public int hashCode() {
		return _config_Mst_GenericMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> toCacheModel() {
		return _config_Mst_GenericMaster.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster toEscapedModel() {
		return new Config_Mst_GenericMasterWrapper(_config_Mst_GenericMaster.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster toUnescapedModel() {
		return new Config_Mst_GenericMasterWrapper(_config_Mst_GenericMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _config_Mst_GenericMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _config_Mst_GenericMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_config_Mst_GenericMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Config_Mst_GenericMasterWrapper)) {
			return false;
		}

		Config_Mst_GenericMasterWrapper config_Mst_GenericMasterWrapper = (Config_Mst_GenericMasterWrapper)obj;

		if (Validator.equals(_config_Mst_GenericMaster,
					config_Mst_GenericMasterWrapper._config_Mst_GenericMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Config_Mst_GenericMaster getWrappedConfig_Mst_GenericMaster() {
		return _config_Mst_GenericMaster;
	}

	@Override
	public Config_Mst_GenericMaster getWrappedModel() {
		return _config_Mst_GenericMaster;
	}

	@Override
	public void resetOriginalValues() {
		_config_Mst_GenericMaster.resetOriginalValues();
	}

	private Config_Mst_GenericMaster _config_Mst_GenericMaster;
}