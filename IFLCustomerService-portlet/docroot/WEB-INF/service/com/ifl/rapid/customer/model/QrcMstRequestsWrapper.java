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
 * This class is a wrapper for {@link QrcMstRequests}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstRequests
 * @generated
 */
public class QrcMstRequestsWrapper implements QrcMstRequests,
	ModelWrapper<QrcMstRequests> {
	public QrcMstRequestsWrapper(QrcMstRequests qrcMstRequests) {
		_qrcMstRequests = qrcMstRequests;
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstRequests.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstRequests.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RequestId", getRequestId());
		attributes.put("Category", getCategory());
		attributes.put("CallType", getCallType());
		attributes.put("CallSubType", getCallSubType());
		attributes.put("Keyword", getKeyword());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer RequestId = (Integer)attributes.get("RequestId");

		if (RequestId != null) {
			setRequestId(RequestId);
		}

		String Category = (String)attributes.get("Category");

		if (Category != null) {
			setCategory(Category);
		}

		String CallType = (String)attributes.get("CallType");

		if (CallType != null) {
			setCallType(CallType);
		}

		String CallSubType = (String)attributes.get("CallSubType");

		if (CallSubType != null) {
			setCallSubType(CallSubType);
		}

		String Keyword = (String)attributes.get("Keyword");

		if (Keyword != null) {
			setKeyword(Keyword);
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
	* Returns the primary key of this qrc mst requests.
	*
	* @return the primary key of this qrc mst requests
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcMstRequests.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc mst requests.
	*
	* @param primaryKey the primary key of this qrc mst requests
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcMstRequests.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the request ID of this qrc mst requests.
	*
	* @return the request ID of this qrc mst requests
	*/
	@Override
	public int getRequestId() {
		return _qrcMstRequests.getRequestId();
	}

	/**
	* Sets the request ID of this qrc mst requests.
	*
	* @param RequestId the request ID of this qrc mst requests
	*/
	@Override
	public void setRequestId(int RequestId) {
		_qrcMstRequests.setRequestId(RequestId);
	}

	/**
	* Returns the category of this qrc mst requests.
	*
	* @return the category of this qrc mst requests
	*/
	@Override
	public java.lang.String getCategory() {
		return _qrcMstRequests.getCategory();
	}

	/**
	* Sets the category of this qrc mst requests.
	*
	* @param Category the category of this qrc mst requests
	*/
	@Override
	public void setCategory(java.lang.String Category) {
		_qrcMstRequests.setCategory(Category);
	}

	/**
	* Returns the call type of this qrc mst requests.
	*
	* @return the call type of this qrc mst requests
	*/
	@Override
	public java.lang.String getCallType() {
		return _qrcMstRequests.getCallType();
	}

	/**
	* Sets the call type of this qrc mst requests.
	*
	* @param CallType the call type of this qrc mst requests
	*/
	@Override
	public void setCallType(java.lang.String CallType) {
		_qrcMstRequests.setCallType(CallType);
	}

	/**
	* Returns the call sub type of this qrc mst requests.
	*
	* @return the call sub type of this qrc mst requests
	*/
	@Override
	public java.lang.String getCallSubType() {
		return _qrcMstRequests.getCallSubType();
	}

	/**
	* Sets the call sub type of this qrc mst requests.
	*
	* @param CallSubType the call sub type of this qrc mst requests
	*/
	@Override
	public void setCallSubType(java.lang.String CallSubType) {
		_qrcMstRequests.setCallSubType(CallSubType);
	}

	/**
	* Returns the keyword of this qrc mst requests.
	*
	* @return the keyword of this qrc mst requests
	*/
	@Override
	public java.lang.String getKeyword() {
		return _qrcMstRequests.getKeyword();
	}

	/**
	* Sets the keyword of this qrc mst requests.
	*
	* @param Keyword the keyword of this qrc mst requests
	*/
	@Override
	public void setKeyword(java.lang.String Keyword) {
		_qrcMstRequests.setKeyword(Keyword);
	}

	/**
	* Returns the is active of this qrc mst requests.
	*
	* @return the is active of this qrc mst requests
	*/
	@Override
	public int getIsActive() {
		return _qrcMstRequests.getIsActive();
	}

	/**
	* Sets the is active of this qrc mst requests.
	*
	* @param IsActive the is active of this qrc mst requests
	*/
	@Override
	public void setIsActive(int IsActive) {
		_qrcMstRequests.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this qrc mst requests.
	*
	* @return the created by of this qrc mst requests
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcMstRequests.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc mst requests.
	*
	* @param CreatedBy the created by of this qrc mst requests
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcMstRequests.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc mst requests.
	*
	* @return the created date of this qrc mst requests
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcMstRequests.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc mst requests.
	*
	* @param CreatedDate the created date of this qrc mst requests
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcMstRequests.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this qrc mst requests.
	*
	* @return the modified date of this qrc mst requests
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcMstRequests.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc mst requests.
	*
	* @param ModifiedDate the modified date of this qrc mst requests
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcMstRequests.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this qrc mst requests.
	*
	* @return the modified by of this qrc mst requests
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcMstRequests.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc mst requests.
	*
	* @param ModifiedBy the modified by of this qrc mst requests
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcMstRequests.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _qrcMstRequests.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcMstRequests.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcMstRequests.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcMstRequests.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcMstRequests.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcMstRequests.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcMstRequests.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcMstRequests.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcMstRequests.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcMstRequests.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcMstRequests.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcMstRequestsWrapper((QrcMstRequests)_qrcMstRequests.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests) {
		return _qrcMstRequests.compareTo(qrcMstRequests);
	}

	@Override
	public int hashCode() {
		return _qrcMstRequests.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcMstRequests> toCacheModel() {
		return _qrcMstRequests.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests toEscapedModel() {
		return new QrcMstRequestsWrapper(_qrcMstRequests.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests toUnescapedModel() {
		return new QrcMstRequestsWrapper(_qrcMstRequests.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcMstRequests.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcMstRequests.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcMstRequests.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcMstRequestsWrapper)) {
			return false;
		}

		QrcMstRequestsWrapper qrcMstRequestsWrapper = (QrcMstRequestsWrapper)obj;

		if (Validator.equals(_qrcMstRequests,
					qrcMstRequestsWrapper._qrcMstRequests)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcMstRequests getWrappedQrcMstRequests() {
		return _qrcMstRequests;
	}

	@Override
	public QrcMstRequests getWrappedModel() {
		return _qrcMstRequests;
	}

	@Override
	public void resetOriginalValues() {
		_qrcMstRequests.resetOriginalValues();
	}

	private QrcMstRequests _qrcMstRequests;
}