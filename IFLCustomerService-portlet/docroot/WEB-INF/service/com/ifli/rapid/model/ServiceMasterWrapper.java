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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ServiceMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceMaster
 * @generated
 */
public class ServiceMasterWrapper implements ServiceMaster,
	ModelWrapper<ServiceMaster> {
	public ServiceMasterWrapper(ServiceMaster serviceMaster) {
		_serviceMaster = serviceMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SERVICE_MASTER_ID", getSERVICE_MASTER_ID());
		attributes.put("SERVICE_MASTER_NAME", getSERVICE_MASTER_NAME());
		attributes.put("SERVICE_MASTER_DESC", getSERVICE_MASTER_DESC());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SERVICE_MASTER_ID = (Integer)attributes.get("SERVICE_MASTER_ID");

		if (SERVICE_MASTER_ID != null) {
			setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
		}

		String SERVICE_MASTER_NAME = (String)attributes.get(
				"SERVICE_MASTER_NAME");

		if (SERVICE_MASTER_NAME != null) {
			setSERVICE_MASTER_NAME(SERVICE_MASTER_NAME);
		}

		String SERVICE_MASTER_DESC = (String)attributes.get(
				"SERVICE_MASTER_DESC");

		if (SERVICE_MASTER_DESC != null) {
			setSERVICE_MASTER_DESC(SERVICE_MASTER_DESC);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}
	}

	/**
	* Returns the primary key of this service master.
	*
	* @return the primary key of this service master
	*/
	@Override
	public int getPrimaryKey() {
		return _serviceMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service master.
	*
	* @param primaryKey the primary key of this service master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_serviceMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the s e r v i c e_ m a s t e r_ i d of this service master.
	*
	* @return the s e r v i c e_ m a s t e r_ i d of this service master
	*/
	@Override
	public int getSERVICE_MASTER_ID() {
		return _serviceMaster.getSERVICE_MASTER_ID();
	}

	/**
	* Sets the s e r v i c e_ m a s t e r_ i d of this service master.
	*
	* @param SERVICE_MASTER_ID the s e r v i c e_ m a s t e r_ i d of this service master
	*/
	@Override
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_serviceMaster.setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
	}

	/**
	* Returns the s e r v i c e_ m a s t e r_ n a m e of this service master.
	*
	* @return the s e r v i c e_ m a s t e r_ n a m e of this service master
	*/
	@Override
	public java.lang.String getSERVICE_MASTER_NAME() {
		return _serviceMaster.getSERVICE_MASTER_NAME();
	}

	/**
	* Sets the s e r v i c e_ m a s t e r_ n a m e of this service master.
	*
	* @param SERVICE_MASTER_NAME the s e r v i c e_ m a s t e r_ n a m e of this service master
	*/
	@Override
	public void setSERVICE_MASTER_NAME(java.lang.String SERVICE_MASTER_NAME) {
		_serviceMaster.setSERVICE_MASTER_NAME(SERVICE_MASTER_NAME);
	}

	/**
	* Returns the s e r v i c e_ m a s t e r_ d e s c of this service master.
	*
	* @return the s e r v i c e_ m a s t e r_ d e s c of this service master
	*/
	@Override
	public java.lang.String getSERVICE_MASTER_DESC() {
		return _serviceMaster.getSERVICE_MASTER_DESC();
	}

	/**
	* Sets the s e r v i c e_ m a s t e r_ d e s c of this service master.
	*
	* @param SERVICE_MASTER_DESC the s e r v i c e_ m a s t e r_ d e s c of this service master
	*/
	@Override
	public void setSERVICE_MASTER_DESC(java.lang.String SERVICE_MASTER_DESC) {
		_serviceMaster.setSERVICE_MASTER_DESC(SERVICE_MASTER_DESC);
	}

	/**
	* Returns the a c t i v e_ f l a g of this service master.
	*
	* @return the a c t i v e_ f l a g of this service master
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _serviceMaster.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this service master.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this service master
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_serviceMaster.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	@Override
	public boolean isNew() {
		return _serviceMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceMasterWrapper((ServiceMaster)_serviceMaster.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.ServiceMaster serviceMaster) {
		return _serviceMaster.compareTo(serviceMaster);
	}

	@Override
	public int hashCode() {
		return _serviceMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ServiceMaster> toCacheModel() {
		return _serviceMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ServiceMaster toEscapedModel() {
		return new ServiceMasterWrapper(_serviceMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ServiceMaster toUnescapedModel() {
		return new ServiceMasterWrapper(_serviceMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceMasterWrapper)) {
			return false;
		}

		ServiceMasterWrapper serviceMasterWrapper = (ServiceMasterWrapper)obj;

		if (Validator.equals(_serviceMaster, serviceMasterWrapper._serviceMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceMaster getWrappedServiceMaster() {
		return _serviceMaster;
	}

	@Override
	public ServiceMaster getWrappedModel() {
		return _serviceMaster;
	}

	@Override
	public void resetOriginalValues() {
		_serviceMaster.resetOriginalValues();
	}

	private ServiceMaster _serviceMaster;
}