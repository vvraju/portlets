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
 * This class is a wrapper for {@link CustomerOtp}.
 * </p>
 *
 * @author Satya Kola
 * @see CustomerOtp
 * @generated
 */
public class CustomerOtpWrapper implements CustomerOtp,
	ModelWrapper<CustomerOtp> {
	public CustomerOtpWrapper(CustomerOtp customerOtp) {
		_customerOtp = customerOtp;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerOtp.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerOtp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("EMAIL_OTP", getEMAIL_OTP());
		attributes.put("PHONE_OTP", getPHONE_OTP());
		attributes.put("STATUS", getSTATUS());
		attributes.put("ADDED_DATE", getADDED_DATE());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String EMAIL_OTP = (String)attributes.get("EMAIL_OTP");

		if (EMAIL_OTP != null) {
			setEMAIL_OTP(EMAIL_OTP);
		}

		String PHONE_OTP = (String)attributes.get("PHONE_OTP");

		if (PHONE_OTP != null) {
			setPHONE_OTP(PHONE_OTP);
		}

		String STATUS = (String)attributes.get("STATUS");

		if (STATUS != null) {
			setSTATUS(STATUS);
		}

		Date ADDED_DATE = (Date)attributes.get("ADDED_DATE");

		if (ADDED_DATE != null) {
			setADDED_DATE(ADDED_DATE);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	/**
	* Returns the primary key of this customer otp.
	*
	* @return the primary key of this customer otp
	*/
	@Override
	public int getPrimaryKey() {
		return _customerOtp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer otp.
	*
	* @param primaryKey the primary key of this customer otp
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customerOtp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer otp.
	*
	* @return the c u s t o m e r_ i d of this customer otp
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _customerOtp.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer otp.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer otp
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_customerOtp.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the e m a i l_ o t p of this customer otp.
	*
	* @return the e m a i l_ o t p of this customer otp
	*/
	@Override
	public java.lang.String getEMAIL_OTP() {
		return _customerOtp.getEMAIL_OTP();
	}

	/**
	* Sets the e m a i l_ o t p of this customer otp.
	*
	* @param EMAIL_OTP the e m a i l_ o t p of this customer otp
	*/
	@Override
	public void setEMAIL_OTP(java.lang.String EMAIL_OTP) {
		_customerOtp.setEMAIL_OTP(EMAIL_OTP);
	}

	/**
	* Returns the p h o n e_ o t p of this customer otp.
	*
	* @return the p h o n e_ o t p of this customer otp
	*/
	@Override
	public java.lang.String getPHONE_OTP() {
		return _customerOtp.getPHONE_OTP();
	}

	/**
	* Sets the p h o n e_ o t p of this customer otp.
	*
	* @param PHONE_OTP the p h o n e_ o t p of this customer otp
	*/
	@Override
	public void setPHONE_OTP(java.lang.String PHONE_OTP) {
		_customerOtp.setPHONE_OTP(PHONE_OTP);
	}

	/**
	* Returns the s t a t u s of this customer otp.
	*
	* @return the s t a t u s of this customer otp
	*/
	@Override
	public java.lang.String getSTATUS() {
		return _customerOtp.getSTATUS();
	}

	/**
	* Sets the s t a t u s of this customer otp.
	*
	* @param STATUS the s t a t u s of this customer otp
	*/
	@Override
	public void setSTATUS(java.lang.String STATUS) {
		_customerOtp.setSTATUS(STATUS);
	}

	/**
	* Returns the a d d e d_ d a t e of this customer otp.
	*
	* @return the a d d e d_ d a t e of this customer otp
	*/
	@Override
	public java.util.Date getADDED_DATE() {
		return _customerOtp.getADDED_DATE();
	}

	/**
	* Sets the a d d e d_ d a t e of this customer otp.
	*
	* @param ADDED_DATE the a d d e d_ d a t e of this customer otp
	*/
	@Override
	public void setADDED_DATE(java.util.Date ADDED_DATE) {
		_customerOtp.setADDED_DATE(ADDED_DATE);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this customer otp.
	*
	* @return the u p d a t e d_ d a t e of this customer otp
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _customerOtp.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this customer otp.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this customer otp
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_customerOtp.setUPDATED_DATE(UPDATED_DATE);
	}

	@Override
	public boolean isNew() {
		return _customerOtp.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerOtp.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerOtp.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerOtp.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerOtp.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerOtp.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerOtp.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerOtp.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerOtp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerOtp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerOtp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerOtpWrapper((CustomerOtp)_customerOtp.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.CustomerOtp customerOtp) {
		return _customerOtp.compareTo(customerOtp);
	}

	@Override
	public int hashCode() {
		return _customerOtp.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.CustomerOtp> toCacheModel() {
		return _customerOtp.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.CustomerOtp toEscapedModel() {
		return new CustomerOtpWrapper(_customerOtp.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.CustomerOtp toUnescapedModel() {
		return new CustomerOtpWrapper(_customerOtp.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerOtp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerOtp.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerOtp.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerOtpWrapper)) {
			return false;
		}

		CustomerOtpWrapper customerOtpWrapper = (CustomerOtpWrapper)obj;

		if (Validator.equals(_customerOtp, customerOtpWrapper._customerOtp)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerOtp getWrappedCustomerOtp() {
		return _customerOtp;
	}

	@Override
	public CustomerOtp getWrappedModel() {
		return _customerOtp;
	}

	@Override
	public void resetOriginalValues() {
		_customerOtp.resetOriginalValues();
	}

	private CustomerOtp _customerOtp;
}