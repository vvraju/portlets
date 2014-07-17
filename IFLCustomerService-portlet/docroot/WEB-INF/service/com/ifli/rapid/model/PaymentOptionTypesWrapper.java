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
 * This class is a wrapper for {@link PaymentOptionTypes}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionTypes
 * @generated
 */
public class PaymentOptionTypesWrapper implements PaymentOptionTypes,
	ModelWrapper<PaymentOptionTypes> {
	public PaymentOptionTypesWrapper(PaymentOptionTypes paymentOptionTypes) {
		_paymentOptionTypes = paymentOptionTypes;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentOptionTypes.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentOptionTypes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentOptionTypesId", getPaymentOptionTypesId());
		attributes.put("PaymentOptionId", getPaymentOptionId());
		attributes.put("OptionTypesKey", getOptionTypesKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("PaymentOptionTypeDesc", getPaymentOptionTypeDesc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentOptionTypesId = (String)attributes.get(
				"PaymentOptionTypesId");

		if (PaymentOptionTypesId != null) {
			setPaymentOptionTypesId(PaymentOptionTypesId);
		}

		String PaymentOptionId = (String)attributes.get("PaymentOptionId");

		if (PaymentOptionId != null) {
			setPaymentOptionId(PaymentOptionId);
		}

		String OptionTypesKey = (String)attributes.get("OptionTypesKey");

		if (OptionTypesKey != null) {
			setOptionTypesKey(OptionTypesKey);
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

		String PaymentOptionTypeDesc = (String)attributes.get(
				"PaymentOptionTypeDesc");

		if (PaymentOptionTypeDesc != null) {
			setPaymentOptionTypeDesc(PaymentOptionTypeDesc);
		}
	}

	/**
	* Returns the primary key of this payment option types.
	*
	* @return the primary key of this payment option types
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _paymentOptionTypes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment option types.
	*
	* @param primaryKey the primary key of this payment option types
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_paymentOptionTypes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment option types ID of this payment option types.
	*
	* @return the payment option types ID of this payment option types
	*/
	@Override
	public java.lang.String getPaymentOptionTypesId() {
		return _paymentOptionTypes.getPaymentOptionTypesId();
	}

	/**
	* Sets the payment option types ID of this payment option types.
	*
	* @param PaymentOptionTypesId the payment option types ID of this payment option types
	*/
	@Override
	public void setPaymentOptionTypesId(java.lang.String PaymentOptionTypesId) {
		_paymentOptionTypes.setPaymentOptionTypesId(PaymentOptionTypesId);
	}

	/**
	* Returns the payment option ID of this payment option types.
	*
	* @return the payment option ID of this payment option types
	*/
	@Override
	public java.lang.String getPaymentOptionId() {
		return _paymentOptionTypes.getPaymentOptionId();
	}

	/**
	* Sets the payment option ID of this payment option types.
	*
	* @param PaymentOptionId the payment option ID of this payment option types
	*/
	@Override
	public void setPaymentOptionId(java.lang.String PaymentOptionId) {
		_paymentOptionTypes.setPaymentOptionId(PaymentOptionId);
	}

	/**
	* Returns the option types key of this payment option types.
	*
	* @return the option types key of this payment option types
	*/
	@Override
	public java.lang.String getOptionTypesKey() {
		return _paymentOptionTypes.getOptionTypesKey();
	}

	/**
	* Sets the option types key of this payment option types.
	*
	* @param OptionTypesKey the option types key of this payment option types
	*/
	@Override
	public void setOptionTypesKey(java.lang.String OptionTypesKey) {
		_paymentOptionTypes.setOptionTypesKey(OptionTypesKey);
	}

	/**
	* Returns the is active of this payment option types.
	*
	* @return the is active of this payment option types
	*/
	@Override
	public boolean getIsActive() {
		return _paymentOptionTypes.getIsActive();
	}

	/**
	* Returns <code>true</code> if this payment option types is is active.
	*
	* @return <code>true</code> if this payment option types is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _paymentOptionTypes.isIsActive();
	}

	/**
	* Sets whether this payment option types is is active.
	*
	* @param IsActive the is active of this payment option types
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_paymentOptionTypes.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this payment option types.
	*
	* @return the created by of this payment option types
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentOptionTypes.getCreatedBy();
	}

	/**
	* Sets the created by of this payment option types.
	*
	* @param CreatedBy the created by of this payment option types
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentOptionTypes.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment option types.
	*
	* @return the created date of this payment option types
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentOptionTypes.getCreatedDate();
	}

	/**
	* Sets the created date of this payment option types.
	*
	* @param CreatedDate the created date of this payment option types
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentOptionTypes.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment option types.
	*
	* @return the modified by of this payment option types
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentOptionTypes.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment option types.
	*
	* @param ModifiedBy the modified by of this payment option types
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentOptionTypes.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment option types.
	*
	* @return the modified date of this payment option types
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentOptionTypes.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment option types.
	*
	* @param ModifiedDate the modified date of this payment option types
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentOptionTypes.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this payment option types.
	*
	* @return the priority of this payment option types
	*/
	@Override
	public int getPriority() {
		return _paymentOptionTypes.getPriority();
	}

	/**
	* Sets the priority of this payment option types.
	*
	* @param Priority the priority of this payment option types
	*/
	@Override
	public void setPriority(int Priority) {
		_paymentOptionTypes.setPriority(Priority);
	}

	/**
	* Returns the payment option type desc of this payment option types.
	*
	* @return the payment option type desc of this payment option types
	*/
	@Override
	public java.lang.String getPaymentOptionTypeDesc() {
		return _paymentOptionTypes.getPaymentOptionTypeDesc();
	}

	/**
	* Sets the payment option type desc of this payment option types.
	*
	* @param PaymentOptionTypeDesc the payment option type desc of this payment option types
	*/
	@Override
	public void setPaymentOptionTypeDesc(java.lang.String PaymentOptionTypeDesc) {
		_paymentOptionTypes.setPaymentOptionTypeDesc(PaymentOptionTypeDesc);
	}

	@Override
	public boolean isNew() {
		return _paymentOptionTypes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentOptionTypes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentOptionTypes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentOptionTypes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentOptionTypes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentOptionTypes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentOptionTypes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentOptionTypes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentOptionTypes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentOptionTypes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentOptionTypes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentOptionTypesWrapper((PaymentOptionTypes)_paymentOptionTypes.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes) {
		return _paymentOptionTypes.compareTo(paymentOptionTypes);
	}

	@Override
	public int hashCode() {
		return _paymentOptionTypes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentOptionTypes> toCacheModel() {
		return _paymentOptionTypes.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentOptionTypes toEscapedModel() {
		return new PaymentOptionTypesWrapper(_paymentOptionTypes.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentOptionTypes toUnescapedModel() {
		return new PaymentOptionTypesWrapper(_paymentOptionTypes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentOptionTypes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentOptionTypes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentOptionTypes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentOptionTypesWrapper)) {
			return false;
		}

		PaymentOptionTypesWrapper paymentOptionTypesWrapper = (PaymentOptionTypesWrapper)obj;

		if (Validator.equals(_paymentOptionTypes,
					paymentOptionTypesWrapper._paymentOptionTypes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentOptionTypes getWrappedPaymentOptionTypes() {
		return _paymentOptionTypes;
	}

	@Override
	public PaymentOptionTypes getWrappedModel() {
		return _paymentOptionTypes;
	}

	@Override
	public void resetOriginalValues() {
		_paymentOptionTypes.resetOriginalValues();
	}

	private PaymentOptionTypes _paymentOptionTypes;
}