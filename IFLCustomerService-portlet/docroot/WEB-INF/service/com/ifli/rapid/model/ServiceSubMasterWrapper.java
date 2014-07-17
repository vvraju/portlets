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
 * This class is a wrapper for {@link ServiceSubMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceSubMaster
 * @generated
 */
public class ServiceSubMasterWrapper implements ServiceSubMaster,
	ModelWrapper<ServiceSubMaster> {
	public ServiceSubMasterWrapper(ServiceSubMaster serviceSubMaster) {
		_serviceSubMaster = serviceSubMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceSubMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceSubMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SUBMASTER_ID", getSUBMASTER_ID());
		attributes.put("SUBMASTER_NAME", getSUBMASTER_NAME());
		attributes.put("SUBMASTER_URL", getSUBMASTER_URL());
		attributes.put("SERVICE_MASTER_ID", getSERVICE_MASTER_ID());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SUBMASTER_ID = (Integer)attributes.get("SUBMASTER_ID");

		if (SUBMASTER_ID != null) {
			setSUBMASTER_ID(SUBMASTER_ID);
		}

		String SUBMASTER_NAME = (String)attributes.get("SUBMASTER_NAME");

		if (SUBMASTER_NAME != null) {
			setSUBMASTER_NAME(SUBMASTER_NAME);
		}

		String SUBMASTER_URL = (String)attributes.get("SUBMASTER_URL");

		if (SUBMASTER_URL != null) {
			setSUBMASTER_URL(SUBMASTER_URL);
		}

		Integer SERVICE_MASTER_ID = (Integer)attributes.get("SERVICE_MASTER_ID");

		if (SERVICE_MASTER_ID != null) {
			setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}
	}

	/**
	* Returns the primary key of this service sub master.
	*
	* @return the primary key of this service sub master
	*/
	@Override
	public int getPrimaryKey() {
		return _serviceSubMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service sub master.
	*
	* @param primaryKey the primary key of this service sub master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_serviceSubMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the s u b m a s t e r_ i d of this service sub master.
	*
	* @return the s u b m a s t e r_ i d of this service sub master
	*/
	@Override
	public int getSUBMASTER_ID() {
		return _serviceSubMaster.getSUBMASTER_ID();
	}

	/**
	* Sets the s u b m a s t e r_ i d of this service sub master.
	*
	* @param SUBMASTER_ID the s u b m a s t e r_ i d of this service sub master
	*/
	@Override
	public void setSUBMASTER_ID(int SUBMASTER_ID) {
		_serviceSubMaster.setSUBMASTER_ID(SUBMASTER_ID);
	}

	/**
	* Returns the s u b m a s t e r_ n a m e of this service sub master.
	*
	* @return the s u b m a s t e r_ n a m e of this service sub master
	*/
	@Override
	public java.lang.String getSUBMASTER_NAME() {
		return _serviceSubMaster.getSUBMASTER_NAME();
	}

	/**
	* Sets the s u b m a s t e r_ n a m e of this service sub master.
	*
	* @param SUBMASTER_NAME the s u b m a s t e r_ n a m e of this service sub master
	*/
	@Override
	public void setSUBMASTER_NAME(java.lang.String SUBMASTER_NAME) {
		_serviceSubMaster.setSUBMASTER_NAME(SUBMASTER_NAME);
	}

	/**
	* Returns the s u b m a s t e r_ u r l of this service sub master.
	*
	* @return the s u b m a s t e r_ u r l of this service sub master
	*/
	@Override
	public java.lang.String getSUBMASTER_URL() {
		return _serviceSubMaster.getSUBMASTER_URL();
	}

	/**
	* Sets the s u b m a s t e r_ u r l of this service sub master.
	*
	* @param SUBMASTER_URL the s u b m a s t e r_ u r l of this service sub master
	*/
	@Override
	public void setSUBMASTER_URL(java.lang.String SUBMASTER_URL) {
		_serviceSubMaster.setSUBMASTER_URL(SUBMASTER_URL);
	}

	/**
	* Returns the s e r v i c e_ m a s t e r_ i d of this service sub master.
	*
	* @return the s e r v i c e_ m a s t e r_ i d of this service sub master
	*/
	@Override
	public int getSERVICE_MASTER_ID() {
		return _serviceSubMaster.getSERVICE_MASTER_ID();
	}

	/**
	* Sets the s e r v i c e_ m a s t e r_ i d of this service sub master.
	*
	* @param SERVICE_MASTER_ID the s e r v i c e_ m a s t e r_ i d of this service sub master
	*/
	@Override
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_serviceSubMaster.setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
	}

	/**
	* Returns the a c t i v e_ f l a g of this service sub master.
	*
	* @return the a c t i v e_ f l a g of this service sub master
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _serviceSubMaster.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this service sub master.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this service sub master
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_serviceSubMaster.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	@Override
	public boolean isNew() {
		return _serviceSubMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceSubMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceSubMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceSubMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceSubMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceSubMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceSubMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceSubMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceSubMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceSubMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceSubMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceSubMasterWrapper((ServiceSubMaster)_serviceSubMaster.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.ServiceSubMaster serviceSubMaster) {
		return _serviceSubMaster.compareTo(serviceSubMaster);
	}

	@Override
	public int hashCode() {
		return _serviceSubMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ServiceSubMaster> toCacheModel() {
		return _serviceSubMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ServiceSubMaster toEscapedModel() {
		return new ServiceSubMasterWrapper(_serviceSubMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ServiceSubMaster toUnescapedModel() {
		return new ServiceSubMasterWrapper(_serviceSubMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceSubMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceSubMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceSubMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceSubMasterWrapper)) {
			return false;
		}

		ServiceSubMasterWrapper serviceSubMasterWrapper = (ServiceSubMasterWrapper)obj;

		if (Validator.equals(_serviceSubMaster,
					serviceSubMasterWrapper._serviceSubMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceSubMaster getWrappedServiceSubMaster() {
		return _serviceSubMaster;
	}

	@Override
	public ServiceSubMaster getWrappedModel() {
		return _serviceSubMaster;
	}

	@Override
	public void resetOriginalValues() {
		_serviceSubMaster.resetOriginalValues();
	}

	private ServiceSubMaster _serviceSubMaster;
}