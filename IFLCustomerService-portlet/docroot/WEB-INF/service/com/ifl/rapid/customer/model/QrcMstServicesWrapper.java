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
 * This class is a wrapper for {@link QrcMstServices}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstServices
 * @generated
 */
public class QrcMstServicesWrapper implements QrcMstServices,
	ModelWrapper<QrcMstServices> {
	public QrcMstServicesWrapper(QrcMstServices qrcMstServices) {
		_qrcMstServices = qrcMstServices;
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstServices.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstServices.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ServiceId", getServiceId());
		attributes.put("ServiceName", getServiceName());
		attributes.put("Description", getDescription());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ServiceId = (Integer)attributes.get("ServiceId");

		if (ServiceId != null) {
			setServiceId(ServiceId);
		}

		String ServiceName = (String)attributes.get("ServiceName");

		if (ServiceName != null) {
			setServiceName(ServiceName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
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

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}
	}

	/**
	* Returns the primary key of this qrc mst services.
	*
	* @return the primary key of this qrc mst services
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcMstServices.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc mst services.
	*
	* @param primaryKey the primary key of this qrc mst services
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcMstServices.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the service ID of this qrc mst services.
	*
	* @return the service ID of this qrc mst services
	*/
	@Override
	public int getServiceId() {
		return _qrcMstServices.getServiceId();
	}

	/**
	* Sets the service ID of this qrc mst services.
	*
	* @param ServiceId the service ID of this qrc mst services
	*/
	@Override
	public void setServiceId(int ServiceId) {
		_qrcMstServices.setServiceId(ServiceId);
	}

	/**
	* Returns the service name of this qrc mst services.
	*
	* @return the service name of this qrc mst services
	*/
	@Override
	public java.lang.String getServiceName() {
		return _qrcMstServices.getServiceName();
	}

	/**
	* Sets the service name of this qrc mst services.
	*
	* @param ServiceName the service name of this qrc mst services
	*/
	@Override
	public void setServiceName(java.lang.String ServiceName) {
		_qrcMstServices.setServiceName(ServiceName);
	}

	/**
	* Returns the description of this qrc mst services.
	*
	* @return the description of this qrc mst services
	*/
	@Override
	public java.lang.String getDescription() {
		return _qrcMstServices.getDescription();
	}

	/**
	* Sets the description of this qrc mst services.
	*
	* @param Description the description of this qrc mst services
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_qrcMstServices.setDescription(Description);
	}

	/**
	* Returns the created by of this qrc mst services.
	*
	* @return the created by of this qrc mst services
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcMstServices.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc mst services.
	*
	* @param CreatedBy the created by of this qrc mst services
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcMstServices.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc mst services.
	*
	* @return the created date of this qrc mst services
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcMstServices.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc mst services.
	*
	* @param CreatedDate the created date of this qrc mst services
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcMstServices.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this qrc mst services.
	*
	* @return the modified by of this qrc mst services
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcMstServices.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc mst services.
	*
	* @param ModifiedBy the modified by of this qrc mst services
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcMstServices.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this qrc mst services.
	*
	* @return the modified date of this qrc mst services
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcMstServices.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc mst services.
	*
	* @param ModifiedDate the modified date of this qrc mst services
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcMstServices.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this qrc mst services.
	*
	* @return the is active of this qrc mst services
	*/
	@Override
	public java.lang.String getIsActive() {
		return _qrcMstServices.getIsActive();
	}

	/**
	* Sets the is active of this qrc mst services.
	*
	* @param IsActive the is active of this qrc mst services
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_qrcMstServices.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _qrcMstServices.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcMstServices.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcMstServices.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcMstServices.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcMstServices.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcMstServices.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcMstServices.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcMstServices.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcMstServices.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcMstServices.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcMstServices.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcMstServicesWrapper((QrcMstServices)_qrcMstServices.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.QrcMstServices qrcMstServices) {
		return _qrcMstServices.compareTo(qrcMstServices);
	}

	@Override
	public int hashCode() {
		return _qrcMstServices.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcMstServices> toCacheModel() {
		return _qrcMstServices.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstServices toEscapedModel() {
		return new QrcMstServicesWrapper(_qrcMstServices.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstServices toUnescapedModel() {
		return new QrcMstServicesWrapper(_qrcMstServices.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcMstServices.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcMstServices.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcMstServices.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcMstServicesWrapper)) {
			return false;
		}

		QrcMstServicesWrapper qrcMstServicesWrapper = (QrcMstServicesWrapper)obj;

		if (Validator.equals(_qrcMstServices,
					qrcMstServicesWrapper._qrcMstServices)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcMstServices getWrappedQrcMstServices() {
		return _qrcMstServices;
	}

	@Override
	public QrcMstServices getWrappedModel() {
		return _qrcMstServices;
	}

	@Override
	public void resetOriginalValues() {
		_qrcMstServices.resetOriginalValues();
	}

	private QrcMstServices _qrcMstServices;
}