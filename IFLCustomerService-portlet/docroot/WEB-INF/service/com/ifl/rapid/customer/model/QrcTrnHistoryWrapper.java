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
 * This class is a wrapper for {@link QrcTrnHistory}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnHistory
 * @generated
 */
public class QrcTrnHistoryWrapper implements QrcTrnHistory,
	ModelWrapper<QrcTrnHistory> {
	public QrcTrnHistoryWrapper(QrcTrnHistory qrcTrnHistory) {
		_qrcTrnHistory = qrcTrnHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnHistory.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("HistoryId", getHistoryId());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedContactId", getCreatedContactId());
		attributes.put("RequestType", getRequestType());
		attributes.put("ChangeRequestType", getChangeRequestType());
		attributes.put("PickupDate", getPickupDate());
		attributes.put("PickupTime", getPickupTime());
		attributes.put("XMLData", getXMLData());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("BranchId", getBranchId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer HistoryId = (Integer)attributes.get("HistoryId");

		if (HistoryId != null) {
			setHistoryId(HistoryId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer CreatedContactId = (Integer)attributes.get("CreatedContactId");

		if (CreatedContactId != null) {
			setCreatedContactId(CreatedContactId);
		}

		String RequestType = (String)attributes.get("RequestType");

		if (RequestType != null) {
			setRequestType(RequestType);
		}

		String ChangeRequestType = (String)attributes.get("ChangeRequestType");

		if (ChangeRequestType != null) {
			setChangeRequestType(ChangeRequestType);
		}

		Date PickupDate = (Date)attributes.get("PickupDate");

		if (PickupDate != null) {
			setPickupDate(PickupDate);
		}

		String PickupTime = (String)attributes.get("PickupTime");

		if (PickupTime != null) {
			setPickupTime(PickupTime);
		}

		String XMLData = (String)attributes.get("XMLData");

		if (XMLData != null) {
			setXMLData(XMLData);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		Integer BranchId = (Integer)attributes.get("BranchId");

		if (BranchId != null) {
			setBranchId(BranchId);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

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

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	/**
	* Returns the primary key of this qrc trn history.
	*
	* @return the primary key of this qrc trn history
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcTrnHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc trn history.
	*
	* @param primaryKey the primary key of this qrc trn history
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcTrnHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the history ID of this qrc trn history.
	*
	* @return the history ID of this qrc trn history
	*/
	@Override
	public int getHistoryId() {
		return _qrcTrnHistory.getHistoryId();
	}

	/**
	* Sets the history ID of this qrc trn history.
	*
	* @param HistoryId the history ID of this qrc trn history
	*/
	@Override
	public void setHistoryId(int HistoryId) {
		_qrcTrnHistory.setHistoryId(HistoryId);
	}

	/**
	* Returns the contact ID of this qrc trn history.
	*
	* @return the contact ID of this qrc trn history
	*/
	@Override
	public int getContactId() {
		return _qrcTrnHistory.getContactId();
	}

	/**
	* Sets the contact ID of this qrc trn history.
	*
	* @param ContactId the contact ID of this qrc trn history
	*/
	@Override
	public void setContactId(int ContactId) {
		_qrcTrnHistory.setContactId(ContactId);
	}

	/**
	* Returns the created contact ID of this qrc trn history.
	*
	* @return the created contact ID of this qrc trn history
	*/
	@Override
	public int getCreatedContactId() {
		return _qrcTrnHistory.getCreatedContactId();
	}

	/**
	* Sets the created contact ID of this qrc trn history.
	*
	* @param CreatedContactId the created contact ID of this qrc trn history
	*/
	@Override
	public void setCreatedContactId(int CreatedContactId) {
		_qrcTrnHistory.setCreatedContactId(CreatedContactId);
	}

	/**
	* Returns the request type of this qrc trn history.
	*
	* @return the request type of this qrc trn history
	*/
	@Override
	public java.lang.String getRequestType() {
		return _qrcTrnHistory.getRequestType();
	}

	/**
	* Sets the request type of this qrc trn history.
	*
	* @param RequestType the request type of this qrc trn history
	*/
	@Override
	public void setRequestType(java.lang.String RequestType) {
		_qrcTrnHistory.setRequestType(RequestType);
	}

	/**
	* Returns the change request type of this qrc trn history.
	*
	* @return the change request type of this qrc trn history
	*/
	@Override
	public java.lang.String getChangeRequestType() {
		return _qrcTrnHistory.getChangeRequestType();
	}

	/**
	* Sets the change request type of this qrc trn history.
	*
	* @param ChangeRequestType the change request type of this qrc trn history
	*/
	@Override
	public void setChangeRequestType(java.lang.String ChangeRequestType) {
		_qrcTrnHistory.setChangeRequestType(ChangeRequestType);
	}

	/**
	* Returns the pickup date of this qrc trn history.
	*
	* @return the pickup date of this qrc trn history
	*/
	@Override
	public java.util.Date getPickupDate() {
		return _qrcTrnHistory.getPickupDate();
	}

	/**
	* Sets the pickup date of this qrc trn history.
	*
	* @param PickupDate the pickup date of this qrc trn history
	*/
	@Override
	public void setPickupDate(java.util.Date PickupDate) {
		_qrcTrnHistory.setPickupDate(PickupDate);
	}

	/**
	* Returns the pickup time of this qrc trn history.
	*
	* @return the pickup time of this qrc trn history
	*/
	@Override
	public java.lang.String getPickupTime() {
		return _qrcTrnHistory.getPickupTime();
	}

	/**
	* Sets the pickup time of this qrc trn history.
	*
	* @param PickupTime the pickup time of this qrc trn history
	*/
	@Override
	public void setPickupTime(java.lang.String PickupTime) {
		_qrcTrnHistory.setPickupTime(PickupTime);
	}

	/**
	* Returns the x m l data of this qrc trn history.
	*
	* @return the x m l data of this qrc trn history
	*/
	@Override
	public java.lang.String getXMLData() {
		return _qrcTrnHistory.getXMLData();
	}

	/**
	* Sets the x m l data of this qrc trn history.
	*
	* @param XMLData the x m l data of this qrc trn history
	*/
	@Override
	public void setXMLData(java.lang.String XMLData) {
		_qrcTrnHistory.setXMLData(XMLData);
	}

	/**
	* Returns the address type ID of this qrc trn history.
	*
	* @return the address type ID of this qrc trn history
	*/
	@Override
	public int getAddressTypeId() {
		return _qrcTrnHistory.getAddressTypeId();
	}

	/**
	* Sets the address type ID of this qrc trn history.
	*
	* @param AddressTypeId the address type ID of this qrc trn history
	*/
	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_qrcTrnHistory.setAddressTypeId(AddressTypeId);
	}

	/**
	* Returns the branch ID of this qrc trn history.
	*
	* @return the branch ID of this qrc trn history
	*/
	@Override
	public int getBranchId() {
		return _qrcTrnHistory.getBranchId();
	}

	/**
	* Sets the branch ID of this qrc trn history.
	*
	* @param BranchId the branch ID of this qrc trn history
	*/
	@Override
	public void setBranchId(int BranchId) {
		_qrcTrnHistory.setBranchId(BranchId);
	}

	/**
	* Returns the is active of this qrc trn history.
	*
	* @return the is active of this qrc trn history
	*/
	@Override
	public int getIsActive() {
		return _qrcTrnHistory.getIsActive();
	}

	/**
	* Sets the is active of this qrc trn history.
	*
	* @param IsActive the is active of this qrc trn history
	*/
	@Override
	public void setIsActive(int IsActive) {
		_qrcTrnHistory.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this qrc trn history.
	*
	* @return the created by of this qrc trn history
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcTrnHistory.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc trn history.
	*
	* @param CreatedBy the created by of this qrc trn history
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcTrnHistory.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc trn history.
	*
	* @return the created date of this qrc trn history
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcTrnHistory.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc trn history.
	*
	* @param CreatedDate the created date of this qrc trn history
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcTrnHistory.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this qrc trn history.
	*
	* @return the modified date of this qrc trn history
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcTrnHistory.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc trn history.
	*
	* @param ModifiedDate the modified date of this qrc trn history
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcTrnHistory.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this qrc trn history.
	*
	* @return the modified by of this qrc trn history
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcTrnHistory.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc trn history.
	*
	* @param ModifiedBy the modified by of this qrc trn history
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcTrnHistory.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _qrcTrnHistory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcTrnHistory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcTrnHistory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcTrnHistory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcTrnHistory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcTrnHistory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcTrnHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcTrnHistory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcTrnHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcTrnHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcTrnHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcTrnHistoryWrapper((QrcTrnHistory)_qrcTrnHistory.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory) {
		return _qrcTrnHistory.compareTo(qrcTrnHistory);
	}

	@Override
	public int hashCode() {
		return _qrcTrnHistory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcTrnHistory> toCacheModel() {
		return _qrcTrnHistory.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory toEscapedModel() {
		return new QrcTrnHistoryWrapper(_qrcTrnHistory.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory toUnescapedModel() {
		return new QrcTrnHistoryWrapper(_qrcTrnHistory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcTrnHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcTrnHistory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcTrnHistory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcTrnHistoryWrapper)) {
			return false;
		}

		QrcTrnHistoryWrapper qrcTrnHistoryWrapper = (QrcTrnHistoryWrapper)obj;

		if (Validator.equals(_qrcTrnHistory, qrcTrnHistoryWrapper._qrcTrnHistory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcTrnHistory getWrappedQrcTrnHistory() {
		return _qrcTrnHistory;
	}

	@Override
	public QrcTrnHistory getWrappedModel() {
		return _qrcTrnHistory;
	}

	@Override
	public void resetOriginalValues() {
		_qrcTrnHistory.resetOriginalValues();
	}

	private QrcTrnHistory _qrcTrnHistory;
}