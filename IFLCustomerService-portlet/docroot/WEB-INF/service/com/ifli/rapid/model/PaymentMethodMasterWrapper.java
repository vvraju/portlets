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
 * This class is a wrapper for {@link PaymentMethodMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodMaster
 * @generated
 */
public class PaymentMethodMasterWrapper implements PaymentMethodMaster,
	ModelWrapper<PaymentMethodMaster> {
	public PaymentMethodMasterWrapper(PaymentMethodMaster paymentMethodMaster) {
		_paymentMethodMaster = paymentMethodMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentMethodMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentMethodMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentMethodID", getPaymentMethodID());
		attributes.put("PaymentMethodKey", getPaymentMethodKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentMethodID = (String)attributes.get("PaymentMethodID");

		if (PaymentMethodID != null) {
			setPaymentMethodID(PaymentMethodID);
		}

		String PaymentMethodKey = (String)attributes.get("PaymentMethodKey");

		if (PaymentMethodKey != null) {
			setPaymentMethodKey(PaymentMethodKey);
		}

		Boolean IsActive = (Boolean)attributes.get("IsActive");

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

		Integer Priority = (Integer)attributes.get("Priority");

		if (Priority != null) {
			setPriority(Priority);
		}
	}

	/**
	* Returns the primary key of this payment method master.
	*
	* @return the primary key of this payment method master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _paymentMethodMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment method master.
	*
	* @param primaryKey the primary key of this payment method master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_paymentMethodMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment method i d of this payment method master.
	*
	* @return the payment method i d of this payment method master
	*/
	@Override
	public java.lang.String getPaymentMethodID() {
		return _paymentMethodMaster.getPaymentMethodID();
	}

	/**
	* Sets the payment method i d of this payment method master.
	*
	* @param PaymentMethodID the payment method i d of this payment method master
	*/
	@Override
	public void setPaymentMethodID(java.lang.String PaymentMethodID) {
		_paymentMethodMaster.setPaymentMethodID(PaymentMethodID);
	}

	/**
	* Returns the payment method key of this payment method master.
	*
	* @return the payment method key of this payment method master
	*/
	@Override
	public java.lang.String getPaymentMethodKey() {
		return _paymentMethodMaster.getPaymentMethodKey();
	}

	/**
	* Sets the payment method key of this payment method master.
	*
	* @param PaymentMethodKey the payment method key of this payment method master
	*/
	@Override
	public void setPaymentMethodKey(java.lang.String PaymentMethodKey) {
		_paymentMethodMaster.setPaymentMethodKey(PaymentMethodKey);
	}

	/**
	* Returns the is active of this payment method master.
	*
	* @return the is active of this payment method master
	*/
	@Override
	public boolean getIsActive() {
		return _paymentMethodMaster.getIsActive();
	}

	/**
	* Returns <code>true</code> if this payment method master is is active.
	*
	* @return <code>true</code> if this payment method master is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _paymentMethodMaster.isIsActive();
	}

	/**
	* Sets whether this payment method master is is active.
	*
	* @param IsActive the is active of this payment method master
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_paymentMethodMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this payment method master.
	*
	* @return the created by of this payment method master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentMethodMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this payment method master.
	*
	* @param CreatedBy the created by of this payment method master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentMethodMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment method master.
	*
	* @return the created date of this payment method master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentMethodMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this payment method master.
	*
	* @param CreatedDate the created date of this payment method master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentMethodMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment method master.
	*
	* @return the modified by of this payment method master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentMethodMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment method master.
	*
	* @param ModifiedBy the modified by of this payment method master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentMethodMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment method master.
	*
	* @return the modified date of this payment method master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentMethodMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment method master.
	*
	* @param ModifiedDate the modified date of this payment method master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentMethodMaster.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this payment method master.
	*
	* @return the priority of this payment method master
	*/
	@Override
	public int getPriority() {
		return _paymentMethodMaster.getPriority();
	}

	/**
	* Sets the priority of this payment method master.
	*
	* @param Priority the priority of this payment method master
	*/
	@Override
	public void setPriority(int Priority) {
		_paymentMethodMaster.setPriority(Priority);
	}

	@Override
	public boolean isNew() {
		return _paymentMethodMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentMethodMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentMethodMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentMethodMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentMethodMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentMethodMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentMethodMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentMethodMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentMethodMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentMethodMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentMethodMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentMethodMasterWrapper((PaymentMethodMaster)_paymentMethodMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentMethodMaster paymentMethodMaster) {
		return _paymentMethodMaster.compareTo(paymentMethodMaster);
	}

	@Override
	public int hashCode() {
		return _paymentMethodMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentMethodMaster> toCacheModel() {
		return _paymentMethodMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentMethodMaster toEscapedModel() {
		return new PaymentMethodMasterWrapper(_paymentMethodMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentMethodMaster toUnescapedModel() {
		return new PaymentMethodMasterWrapper(_paymentMethodMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentMethodMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentMethodMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentMethodMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentMethodMasterWrapper)) {
			return false;
		}

		PaymentMethodMasterWrapper paymentMethodMasterWrapper = (PaymentMethodMasterWrapper)obj;

		if (Validator.equals(_paymentMethodMaster,
					paymentMethodMasterWrapper._paymentMethodMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentMethodMaster getWrappedPaymentMethodMaster() {
		return _paymentMethodMaster;
	}

	@Override
	public PaymentMethodMaster getWrappedModel() {
		return _paymentMethodMaster;
	}

	@Override
	public void resetOriginalValues() {
		_paymentMethodMaster.resetOriginalValues();
	}

	private PaymentMethodMaster _paymentMethodMaster;
}