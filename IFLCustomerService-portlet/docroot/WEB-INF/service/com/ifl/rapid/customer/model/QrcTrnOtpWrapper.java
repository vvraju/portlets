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
 * This class is a wrapper for {@link QrcTrnOtp}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnOtp
 * @generated
 */
public class QrcTrnOtpWrapper implements QrcTrnOtp, ModelWrapper<QrcTrnOtp> {
	public QrcTrnOtpWrapper(QrcTrnOtp qrcTrnOtp) {
		_qrcTrnOtp = qrcTrnOtp;
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnOtp.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnOtp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Otp_Id", getOtp_Id());
		attributes.put("Otp", getOtp());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer Otp_Id = (Integer)attributes.get("Otp_Id");

		if (Otp_Id != null) {
			setOtp_Id(Otp_Id);
		}

		String Otp = (String)attributes.get("Otp");

		if (Otp != null) {
			setOtp(Otp);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
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
	* Returns the primary key of this qrc trn otp.
	*
	* @return the primary key of this qrc trn otp
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcTrnOtp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc trn otp.
	*
	* @param primaryKey the primary key of this qrc trn otp
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcTrnOtp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the otp_ ID of this qrc trn otp.
	*
	* @return the otp_ ID of this qrc trn otp
	*/
	@Override
	public int getOtp_Id() {
		return _qrcTrnOtp.getOtp_Id();
	}

	/**
	* Sets the otp_ ID of this qrc trn otp.
	*
	* @param Otp_Id the otp_ ID of this qrc trn otp
	*/
	@Override
	public void setOtp_Id(int Otp_Id) {
		_qrcTrnOtp.setOtp_Id(Otp_Id);
	}

	/**
	* Returns the otp of this qrc trn otp.
	*
	* @return the otp of this qrc trn otp
	*/
	@Override
	public java.lang.String getOtp() {
		return _qrcTrnOtp.getOtp();
	}

	/**
	* Sets the otp of this qrc trn otp.
	*
	* @param Otp the otp of this qrc trn otp
	*/
	@Override
	public void setOtp(java.lang.String Otp) {
		_qrcTrnOtp.setOtp(Otp);
	}

	/**
	* Returns the contact ID of this qrc trn otp.
	*
	* @return the contact ID of this qrc trn otp
	*/
	@Override
	public int getContactId() {
		return _qrcTrnOtp.getContactId();
	}

	/**
	* Sets the contact ID of this qrc trn otp.
	*
	* @param ContactId the contact ID of this qrc trn otp
	*/
	@Override
	public void setContactId(int ContactId) {
		_qrcTrnOtp.setContactId(ContactId);
	}

	/**
	* Returns the created by of this qrc trn otp.
	*
	* @return the created by of this qrc trn otp
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcTrnOtp.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc trn otp.
	*
	* @param CreatedBy the created by of this qrc trn otp
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcTrnOtp.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc trn otp.
	*
	* @return the created date of this qrc trn otp
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcTrnOtp.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc trn otp.
	*
	* @param CreatedDate the created date of this qrc trn otp
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcTrnOtp.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this qrc trn otp.
	*
	* @return the modified by of this qrc trn otp
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcTrnOtp.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc trn otp.
	*
	* @param ModifiedBy the modified by of this qrc trn otp
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcTrnOtp.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this qrc trn otp.
	*
	* @return the modified date of this qrc trn otp
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcTrnOtp.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc trn otp.
	*
	* @param ModifiedDate the modified date of this qrc trn otp
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcTrnOtp.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this qrc trn otp.
	*
	* @return the is active of this qrc trn otp
	*/
	@Override
	public java.lang.String getIsActive() {
		return _qrcTrnOtp.getIsActive();
	}

	/**
	* Sets the is active of this qrc trn otp.
	*
	* @param IsActive the is active of this qrc trn otp
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_qrcTrnOtp.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _qrcTrnOtp.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcTrnOtp.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcTrnOtp.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcTrnOtp.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcTrnOtp.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcTrnOtp.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcTrnOtp.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcTrnOtp.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcTrnOtp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcTrnOtp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcTrnOtp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcTrnOtpWrapper((QrcTrnOtp)_qrcTrnOtp.clone());
	}

	@Override
	public int compareTo(com.ifl.rapid.customer.model.QrcTrnOtp qrcTrnOtp) {
		return _qrcTrnOtp.compareTo(qrcTrnOtp);
	}

	@Override
	public int hashCode() {
		return _qrcTrnOtp.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcTrnOtp> toCacheModel() {
		return _qrcTrnOtp.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnOtp toEscapedModel() {
		return new QrcTrnOtpWrapper(_qrcTrnOtp.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnOtp toUnescapedModel() {
		return new QrcTrnOtpWrapper(_qrcTrnOtp.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcTrnOtp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcTrnOtp.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcTrnOtp.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcTrnOtpWrapper)) {
			return false;
		}

		QrcTrnOtpWrapper qrcTrnOtpWrapper = (QrcTrnOtpWrapper)obj;

		if (Validator.equals(_qrcTrnOtp, qrcTrnOtpWrapper._qrcTrnOtp)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcTrnOtp getWrappedQrcTrnOtp() {
		return _qrcTrnOtp;
	}

	@Override
	public QrcTrnOtp getWrappedModel() {
		return _qrcTrnOtp;
	}

	@Override
	public void resetOriginalValues() {
		_qrcTrnOtp.resetOriginalValues();
	}

	private QrcTrnOtp _qrcTrnOtp;
}