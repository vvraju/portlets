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
 * This class is a wrapper for {@link ServiceRequestMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceRequestMaster
 * @generated
 */
public class ServiceRequestMasterWrapper implements ServiceRequestMaster,
	ModelWrapper<ServiceRequestMaster> {
	public ServiceRequestMasterWrapper(
		ServiceRequestMaster serviceRequestMaster) {
		_serviceRequestMaster = serviceRequestMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceRequestMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceRequestMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Type", getType());
		attributes.put("ContactId", getContactId());
		attributes.put("addressTypeId", getAddressTypeId());
		attributes.put("address", getAddress());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("MobileNo", getMobileNo());
		attributes.put("description", getDescription());
		attributes.put("startPreferedTime", getStartPreferedTime());
		attributes.put("endPreferedTime", getEndPreferedTime());
		attributes.put("PreferedDate", getPreferedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Id = (String)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Type = (String)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}

		String ContactId = (String)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String addressTypeId = (String)attributes.get("addressTypeId");

		if (addressTypeId != null) {
			setAddressTypeId(addressTypeId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Integer PolicyNo = (Integer)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		String MobileNo = (String)attributes.get("MobileNo");

		if (MobileNo != null) {
			setMobileNo(MobileNo);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date startPreferedTime = (Date)attributes.get("startPreferedTime");

		if (startPreferedTime != null) {
			setStartPreferedTime(startPreferedTime);
		}

		Date endPreferedTime = (Date)attributes.get("endPreferedTime");

		if (endPreferedTime != null) {
			setEndPreferedTime(endPreferedTime);
		}

		Date PreferedDate = (Date)attributes.get("PreferedDate");

		if (PreferedDate != null) {
			setPreferedDate(PreferedDate);
		}
	}

	/**
	* Returns the primary key of this service request master.
	*
	* @return the primary key of this service request master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _serviceRequestMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service request master.
	*
	* @param primaryKey the primary key of this service request master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_serviceRequestMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this service request master.
	*
	* @return the ID of this service request master
	*/
	@Override
	public java.lang.String getId() {
		return _serviceRequestMaster.getId();
	}

	/**
	* Sets the ID of this service request master.
	*
	* @param Id the ID of this service request master
	*/
	@Override
	public void setId(java.lang.String Id) {
		_serviceRequestMaster.setId(Id);
	}

	/**
	* Returns the type of this service request master.
	*
	* @return the type of this service request master
	*/
	@Override
	public java.lang.String getType() {
		return _serviceRequestMaster.getType();
	}

	/**
	* Sets the type of this service request master.
	*
	* @param Type the type of this service request master
	*/
	@Override
	public void setType(java.lang.String Type) {
		_serviceRequestMaster.setType(Type);
	}

	/**
	* Returns the contact ID of this service request master.
	*
	* @return the contact ID of this service request master
	*/
	@Override
	public java.lang.String getContactId() {
		return _serviceRequestMaster.getContactId();
	}

	/**
	* Sets the contact ID of this service request master.
	*
	* @param ContactId the contact ID of this service request master
	*/
	@Override
	public void setContactId(java.lang.String ContactId) {
		_serviceRequestMaster.setContactId(ContactId);
	}

	/**
	* Returns the address type ID of this service request master.
	*
	* @return the address type ID of this service request master
	*/
	@Override
	public java.lang.String getAddressTypeId() {
		return _serviceRequestMaster.getAddressTypeId();
	}

	/**
	* Sets the address type ID of this service request master.
	*
	* @param addressTypeId the address type ID of this service request master
	*/
	@Override
	public void setAddressTypeId(java.lang.String addressTypeId) {
		_serviceRequestMaster.setAddressTypeId(addressTypeId);
	}

	/**
	* Returns the address of this service request master.
	*
	* @return the address of this service request master
	*/
	@Override
	public java.lang.String getAddress() {
		return _serviceRequestMaster.getAddress();
	}

	/**
	* Sets the address of this service request master.
	*
	* @param address the address of this service request master
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_serviceRequestMaster.setAddress(address);
	}

	/**
	* Returns the policy no of this service request master.
	*
	* @return the policy no of this service request master
	*/
	@Override
	public int getPolicyNo() {
		return _serviceRequestMaster.getPolicyNo();
	}

	/**
	* Sets the policy no of this service request master.
	*
	* @param PolicyNo the policy no of this service request master
	*/
	@Override
	public void setPolicyNo(int PolicyNo) {
		_serviceRequestMaster.setPolicyNo(PolicyNo);
	}

	/**
	* Returns the mobile no of this service request master.
	*
	* @return the mobile no of this service request master
	*/
	@Override
	public java.lang.String getMobileNo() {
		return _serviceRequestMaster.getMobileNo();
	}

	/**
	* Sets the mobile no of this service request master.
	*
	* @param MobileNo the mobile no of this service request master
	*/
	@Override
	public void setMobileNo(java.lang.String MobileNo) {
		_serviceRequestMaster.setMobileNo(MobileNo);
	}

	/**
	* Returns the description of this service request master.
	*
	* @return the description of this service request master
	*/
	@Override
	public java.lang.String getDescription() {
		return _serviceRequestMaster.getDescription();
	}

	/**
	* Sets the description of this service request master.
	*
	* @param description the description of this service request master
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_serviceRequestMaster.setDescription(description);
	}

	/**
	* Returns the start prefered time of this service request master.
	*
	* @return the start prefered time of this service request master
	*/
	@Override
	public java.util.Date getStartPreferedTime() {
		return _serviceRequestMaster.getStartPreferedTime();
	}

	/**
	* Sets the start prefered time of this service request master.
	*
	* @param startPreferedTime the start prefered time of this service request master
	*/
	@Override
	public void setStartPreferedTime(java.util.Date startPreferedTime) {
		_serviceRequestMaster.setStartPreferedTime(startPreferedTime);
	}

	/**
	* Returns the end prefered time of this service request master.
	*
	* @return the end prefered time of this service request master
	*/
	@Override
	public java.util.Date getEndPreferedTime() {
		return _serviceRequestMaster.getEndPreferedTime();
	}

	/**
	* Sets the end prefered time of this service request master.
	*
	* @param endPreferedTime the end prefered time of this service request master
	*/
	@Override
	public void setEndPreferedTime(java.util.Date endPreferedTime) {
		_serviceRequestMaster.setEndPreferedTime(endPreferedTime);
	}

	/**
	* Returns the prefered date of this service request master.
	*
	* @return the prefered date of this service request master
	*/
	@Override
	public java.util.Date getPreferedDate() {
		return _serviceRequestMaster.getPreferedDate();
	}

	/**
	* Sets the prefered date of this service request master.
	*
	* @param PreferedDate the prefered date of this service request master
	*/
	@Override
	public void setPreferedDate(java.util.Date PreferedDate) {
		_serviceRequestMaster.setPreferedDate(PreferedDate);
	}

	@Override
	public boolean isNew() {
		return _serviceRequestMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceRequestMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceRequestMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceRequestMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceRequestMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceRequestMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceRequestMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceRequestMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceRequestMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceRequestMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceRequestMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceRequestMasterWrapper((ServiceRequestMaster)_serviceRequestMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.ServiceRequestMaster serviceRequestMaster) {
		return _serviceRequestMaster.compareTo(serviceRequestMaster);
	}

	@Override
	public int hashCode() {
		return _serviceRequestMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ServiceRequestMaster> toCacheModel() {
		return _serviceRequestMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ServiceRequestMaster toEscapedModel() {
		return new ServiceRequestMasterWrapper(_serviceRequestMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ServiceRequestMaster toUnescapedModel() {
		return new ServiceRequestMasterWrapper(_serviceRequestMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceRequestMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceRequestMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceRequestMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceRequestMasterWrapper)) {
			return false;
		}

		ServiceRequestMasterWrapper serviceRequestMasterWrapper = (ServiceRequestMasterWrapper)obj;

		if (Validator.equals(_serviceRequestMaster,
					serviceRequestMasterWrapper._serviceRequestMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceRequestMaster getWrappedServiceRequestMaster() {
		return _serviceRequestMaster;
	}

	@Override
	public ServiceRequestMaster getWrappedModel() {
		return _serviceRequestMaster;
	}

	@Override
	public void resetOriginalValues() {
		_serviceRequestMaster.resetOriginalValues();
	}

	private ServiceRequestMaster _serviceRequestMaster;
}