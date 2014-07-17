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
 * This class is a wrapper for {@link PaymentOptionMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMaster
 * @generated
 */
public class PaymentOptionMasterWrapper implements PaymentOptionMaster,
	ModelWrapper<PaymentOptionMaster> {
	public PaymentOptionMasterWrapper(PaymentOptionMaster paymentOptionMaster) {
		_paymentOptionMaster = paymentOptionMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentOptionMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentOptionMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentOptionId", getPaymentOptionId());
		attributes.put("PaymentOptionKey", getPaymentOptionKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("PaymentOptionDesc", getPaymentOptionDesc());
		attributes.put("isProcessPayment", getIsProcessPayment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentOptionId = (String)attributes.get("PaymentOptionId");

		if (PaymentOptionId != null) {
			setPaymentOptionId(PaymentOptionId);
		}

		String PaymentOptionKey = (String)attributes.get("PaymentOptionKey");

		if (PaymentOptionKey != null) {
			setPaymentOptionKey(PaymentOptionKey);
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

		String PaymentOptionDesc = (String)attributes.get("PaymentOptionDesc");

		if (PaymentOptionDesc != null) {
			setPaymentOptionDesc(PaymentOptionDesc);
		}

		Boolean isProcessPayment = (Boolean)attributes.get("isProcessPayment");

		if (isProcessPayment != null) {
			setIsProcessPayment(isProcessPayment);
		}
	}

	/**
	* Returns the primary key of this payment option master.
	*
	* @return the primary key of this payment option master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _paymentOptionMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment option master.
	*
	* @param primaryKey the primary key of this payment option master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_paymentOptionMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment option ID of this payment option master.
	*
	* @return the payment option ID of this payment option master
	*/
	@Override
	public java.lang.String getPaymentOptionId() {
		return _paymentOptionMaster.getPaymentOptionId();
	}

	/**
	* Sets the payment option ID of this payment option master.
	*
	* @param PaymentOptionId the payment option ID of this payment option master
	*/
	@Override
	public void setPaymentOptionId(java.lang.String PaymentOptionId) {
		_paymentOptionMaster.setPaymentOptionId(PaymentOptionId);
	}

	/**
	* Returns the payment option key of this payment option master.
	*
	* @return the payment option key of this payment option master
	*/
	@Override
	public java.lang.String getPaymentOptionKey() {
		return _paymentOptionMaster.getPaymentOptionKey();
	}

	/**
	* Sets the payment option key of this payment option master.
	*
	* @param PaymentOptionKey the payment option key of this payment option master
	*/
	@Override
	public void setPaymentOptionKey(java.lang.String PaymentOptionKey) {
		_paymentOptionMaster.setPaymentOptionKey(PaymentOptionKey);
	}

	/**
	* Returns the is active of this payment option master.
	*
	* @return the is active of this payment option master
	*/
	@Override
	public boolean getIsActive() {
		return _paymentOptionMaster.getIsActive();
	}

	/**
	* Returns <code>true</code> if this payment option master is is active.
	*
	* @return <code>true</code> if this payment option master is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _paymentOptionMaster.isIsActive();
	}

	/**
	* Sets whether this payment option master is is active.
	*
	* @param IsActive the is active of this payment option master
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_paymentOptionMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this payment option master.
	*
	* @return the created by of this payment option master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentOptionMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this payment option master.
	*
	* @param CreatedBy the created by of this payment option master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentOptionMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment option master.
	*
	* @return the created date of this payment option master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentOptionMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this payment option master.
	*
	* @param CreatedDate the created date of this payment option master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentOptionMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment option master.
	*
	* @return the modified by of this payment option master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentOptionMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment option master.
	*
	* @param ModifiedBy the modified by of this payment option master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentOptionMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment option master.
	*
	* @return the modified date of this payment option master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentOptionMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment option master.
	*
	* @param ModifiedDate the modified date of this payment option master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentOptionMaster.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this payment option master.
	*
	* @return the priority of this payment option master
	*/
	@Override
	public int getPriority() {
		return _paymentOptionMaster.getPriority();
	}

	/**
	* Sets the priority of this payment option master.
	*
	* @param Priority the priority of this payment option master
	*/
	@Override
	public void setPriority(int Priority) {
		_paymentOptionMaster.setPriority(Priority);
	}

	/**
	* Returns the payment option desc of this payment option master.
	*
	* @return the payment option desc of this payment option master
	*/
	@Override
	public java.lang.String getPaymentOptionDesc() {
		return _paymentOptionMaster.getPaymentOptionDesc();
	}

	/**
	* Sets the payment option desc of this payment option master.
	*
	* @param PaymentOptionDesc the payment option desc of this payment option master
	*/
	@Override
	public void setPaymentOptionDesc(java.lang.String PaymentOptionDesc) {
		_paymentOptionMaster.setPaymentOptionDesc(PaymentOptionDesc);
	}

	/**
	* Returns the is process payment of this payment option master.
	*
	* @return the is process payment of this payment option master
	*/
	@Override
	public boolean getIsProcessPayment() {
		return _paymentOptionMaster.getIsProcessPayment();
	}

	/**
	* Returns <code>true</code> if this payment option master is is process payment.
	*
	* @return <code>true</code> if this payment option master is is process payment; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsProcessPayment() {
		return _paymentOptionMaster.isIsProcessPayment();
	}

	/**
	* Sets whether this payment option master is is process payment.
	*
	* @param isProcessPayment the is process payment of this payment option master
	*/
	@Override
	public void setIsProcessPayment(boolean isProcessPayment) {
		_paymentOptionMaster.setIsProcessPayment(isProcessPayment);
	}

	@Override
	public boolean isNew() {
		return _paymentOptionMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentOptionMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentOptionMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentOptionMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentOptionMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentOptionMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentOptionMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentOptionMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentOptionMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentOptionMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentOptionMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentOptionMasterWrapper((PaymentOptionMaster)_paymentOptionMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster) {
		return _paymentOptionMaster.compareTo(paymentOptionMaster);
	}

	@Override
	public int hashCode() {
		return _paymentOptionMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentOptionMaster> toCacheModel() {
		return _paymentOptionMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentOptionMaster toEscapedModel() {
		return new PaymentOptionMasterWrapper(_paymentOptionMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentOptionMaster toUnescapedModel() {
		return new PaymentOptionMasterWrapper(_paymentOptionMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentOptionMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentOptionMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentOptionMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentOptionMasterWrapper)) {
			return false;
		}

		PaymentOptionMasterWrapper paymentOptionMasterWrapper = (PaymentOptionMasterWrapper)obj;

		if (Validator.equals(_paymentOptionMaster,
					paymentOptionMasterWrapper._paymentOptionMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentOptionMaster getWrappedPaymentOptionMaster() {
		return _paymentOptionMaster;
	}

	@Override
	public PaymentOptionMaster getWrappedModel() {
		return _paymentOptionMaster;
	}

	@Override
	public void resetOriginalValues() {
		_paymentOptionMaster.resetOriginalValues();
	}

	private PaymentOptionMaster _paymentOptionMaster;
}