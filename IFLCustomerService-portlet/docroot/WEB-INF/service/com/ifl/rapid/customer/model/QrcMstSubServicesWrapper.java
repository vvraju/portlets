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
 * This class is a wrapper for {@link QrcMstSubServices}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstSubServices
 * @generated
 */
public class QrcMstSubServicesWrapper implements QrcMstSubServices,
	ModelWrapper<QrcMstSubServices> {
	public QrcMstSubServicesWrapper(QrcMstSubServices qrcMstSubServices) {
		_qrcMstSubServices = qrcMstSubServices;
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstSubServices.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstSubServices.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SubServiceId", getSubServiceId());
		attributes.put("SubServiceName", getSubServiceName());
		attributes.put("SubServiceUrl", getSubServiceUrl());
		attributes.put("ServiceId", getServiceId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SubServiceId = (Integer)attributes.get("SubServiceId");

		if (SubServiceId != null) {
			setSubServiceId(SubServiceId);
		}

		String SubServiceName = (String)attributes.get("SubServiceName");

		if (SubServiceName != null) {
			setSubServiceName(SubServiceName);
		}

		String SubServiceUrl = (String)attributes.get("SubServiceUrl");

		if (SubServiceUrl != null) {
			setSubServiceUrl(SubServiceUrl);
		}

		Integer ServiceId = (Integer)attributes.get("ServiceId");

		if (ServiceId != null) {
			setServiceId(ServiceId);
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
	}

	/**
	* Returns the primary key of this qrc mst sub services.
	*
	* @return the primary key of this qrc mst sub services
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcMstSubServices.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc mst sub services.
	*
	* @param primaryKey the primary key of this qrc mst sub services
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcMstSubServices.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sub service ID of this qrc mst sub services.
	*
	* @return the sub service ID of this qrc mst sub services
	*/
	@Override
	public int getSubServiceId() {
		return _qrcMstSubServices.getSubServiceId();
	}

	/**
	* Sets the sub service ID of this qrc mst sub services.
	*
	* @param SubServiceId the sub service ID of this qrc mst sub services
	*/
	@Override
	public void setSubServiceId(int SubServiceId) {
		_qrcMstSubServices.setSubServiceId(SubServiceId);
	}

	/**
	* Returns the sub service name of this qrc mst sub services.
	*
	* @return the sub service name of this qrc mst sub services
	*/
	@Override
	public java.lang.String getSubServiceName() {
		return _qrcMstSubServices.getSubServiceName();
	}

	/**
	* Sets the sub service name of this qrc mst sub services.
	*
	* @param SubServiceName the sub service name of this qrc mst sub services
	*/
	@Override
	public void setSubServiceName(java.lang.String SubServiceName) {
		_qrcMstSubServices.setSubServiceName(SubServiceName);
	}

	/**
	* Returns the sub service url of this qrc mst sub services.
	*
	* @return the sub service url of this qrc mst sub services
	*/
	@Override
	public java.lang.String getSubServiceUrl() {
		return _qrcMstSubServices.getSubServiceUrl();
	}

	/**
	* Sets the sub service url of this qrc mst sub services.
	*
	* @param SubServiceUrl the sub service url of this qrc mst sub services
	*/
	@Override
	public void setSubServiceUrl(java.lang.String SubServiceUrl) {
		_qrcMstSubServices.setSubServiceUrl(SubServiceUrl);
	}

	/**
	* Returns the service ID of this qrc mst sub services.
	*
	* @return the service ID of this qrc mst sub services
	*/
	@Override
	public int getServiceId() {
		return _qrcMstSubServices.getServiceId();
	}

	/**
	* Sets the service ID of this qrc mst sub services.
	*
	* @param ServiceId the service ID of this qrc mst sub services
	*/
	@Override
	public void setServiceId(int ServiceId) {
		_qrcMstSubServices.setServiceId(ServiceId);
	}

	/**
	* Returns the is active of this qrc mst sub services.
	*
	* @return the is active of this qrc mst sub services
	*/
	@Override
	public java.lang.String getIsActive() {
		return _qrcMstSubServices.getIsActive();
	}

	/**
	* Sets the is active of this qrc mst sub services.
	*
	* @param IsActive the is active of this qrc mst sub services
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_qrcMstSubServices.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this qrc mst sub services.
	*
	* @return the created by of this qrc mst sub services
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcMstSubServices.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc mst sub services.
	*
	* @param CreatedBy the created by of this qrc mst sub services
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcMstSubServices.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc mst sub services.
	*
	* @return the created date of this qrc mst sub services
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcMstSubServices.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc mst sub services.
	*
	* @param CreatedDate the created date of this qrc mst sub services
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcMstSubServices.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this qrc mst sub services.
	*
	* @return the modified by of this qrc mst sub services
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcMstSubServices.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc mst sub services.
	*
	* @param ModifiedBy the modified by of this qrc mst sub services
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcMstSubServices.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this qrc mst sub services.
	*
	* @return the modified date of this qrc mst sub services
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcMstSubServices.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc mst sub services.
	*
	* @param ModifiedDate the modified date of this qrc mst sub services
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcMstSubServices.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _qrcMstSubServices.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcMstSubServices.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcMstSubServices.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcMstSubServices.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcMstSubServices.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcMstSubServices.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcMstSubServices.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcMstSubServices.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcMstSubServices.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcMstSubServices.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcMstSubServices.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcMstSubServicesWrapper((QrcMstSubServices)_qrcMstSubServices.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.QrcMstSubServices qrcMstSubServices) {
		return _qrcMstSubServices.compareTo(qrcMstSubServices);
	}

	@Override
	public int hashCode() {
		return _qrcMstSubServices.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcMstSubServices> toCacheModel() {
		return _qrcMstSubServices.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstSubServices toEscapedModel() {
		return new QrcMstSubServicesWrapper(_qrcMstSubServices.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstSubServices toUnescapedModel() {
		return new QrcMstSubServicesWrapper(_qrcMstSubServices.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcMstSubServices.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcMstSubServices.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcMstSubServices.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcMstSubServicesWrapper)) {
			return false;
		}

		QrcMstSubServicesWrapper qrcMstSubServicesWrapper = (QrcMstSubServicesWrapper)obj;

		if (Validator.equals(_qrcMstSubServices,
					qrcMstSubServicesWrapper._qrcMstSubServices)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcMstSubServices getWrappedQrcMstSubServices() {
		return _qrcMstSubServices;
	}

	@Override
	public QrcMstSubServices getWrappedModel() {
		return _qrcMstSubServices;
	}

	@Override
	public void resetOriginalValues() {
		_qrcMstSubServices.resetOriginalValues();
	}

	private QrcMstSubServices _qrcMstSubServices;
}