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
 * This class is a wrapper for {@link PaymentMethodType}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodType
 * @generated
 */
public class PaymentMethodTypeWrapper implements PaymentMethodType,
	ModelWrapper<PaymentMethodType> {
	public PaymentMethodTypeWrapper(PaymentMethodType paymentMethodType) {
		_paymentMethodType = paymentMethodType;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentMethodType.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentMethodType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("PaymentMethodID", getPaymentMethodID());
		attributes.put("GatewayID", getGatewayID());
		attributes.put("TypeKey", getTypeKey());
		attributes.put("Description", getDescription());
		attributes.put("BankId", getBankId());
		attributes.put("Active", getActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Id = (String)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String PaymentMethodID = (String)attributes.get("PaymentMethodID");

		if (PaymentMethodID != null) {
			setPaymentMethodID(PaymentMethodID);
		}

		String GatewayID = (String)attributes.get("GatewayID");

		if (GatewayID != null) {
			setGatewayID(GatewayID);
		}

		String TypeKey = (String)attributes.get("TypeKey");

		if (TypeKey != null) {
			setTypeKey(TypeKey);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String BankId = (String)attributes.get("BankId");

		if (BankId != null) {
			setBankId(BankId);
		}

		Boolean Active = (Boolean)attributes.get("Active");

		if (Active != null) {
			setActive(Active);
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

		String Type = (String)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}
	}

	/**
	* Returns the primary key of this payment method type.
	*
	* @return the primary key of this payment method type
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _paymentMethodType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment method type.
	*
	* @param primaryKey the primary key of this payment method type
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_paymentMethodType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this payment method type.
	*
	* @return the ID of this payment method type
	*/
	@Override
	public java.lang.String getId() {
		return _paymentMethodType.getId();
	}

	/**
	* Sets the ID of this payment method type.
	*
	* @param Id the ID of this payment method type
	*/
	@Override
	public void setId(java.lang.String Id) {
		_paymentMethodType.setId(Id);
	}

	/**
	* Returns the payment method i d of this payment method type.
	*
	* @return the payment method i d of this payment method type
	*/
	@Override
	public java.lang.String getPaymentMethodID() {
		return _paymentMethodType.getPaymentMethodID();
	}

	/**
	* Sets the payment method i d of this payment method type.
	*
	* @param PaymentMethodID the payment method i d of this payment method type
	*/
	@Override
	public void setPaymentMethodID(java.lang.String PaymentMethodID) {
		_paymentMethodType.setPaymentMethodID(PaymentMethodID);
	}

	/**
	* Returns the gateway i d of this payment method type.
	*
	* @return the gateway i d of this payment method type
	*/
	@Override
	public java.lang.String getGatewayID() {
		return _paymentMethodType.getGatewayID();
	}

	/**
	* Sets the gateway i d of this payment method type.
	*
	* @param GatewayID the gateway i d of this payment method type
	*/
	@Override
	public void setGatewayID(java.lang.String GatewayID) {
		_paymentMethodType.setGatewayID(GatewayID);
	}

	/**
	* Returns the type key of this payment method type.
	*
	* @return the type key of this payment method type
	*/
	@Override
	public java.lang.String getTypeKey() {
		return _paymentMethodType.getTypeKey();
	}

	/**
	* Sets the type key of this payment method type.
	*
	* @param TypeKey the type key of this payment method type
	*/
	@Override
	public void setTypeKey(java.lang.String TypeKey) {
		_paymentMethodType.setTypeKey(TypeKey);
	}

	/**
	* Returns the description of this payment method type.
	*
	* @return the description of this payment method type
	*/
	@Override
	public java.lang.String getDescription() {
		return _paymentMethodType.getDescription();
	}

	/**
	* Sets the description of this payment method type.
	*
	* @param Description the description of this payment method type
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_paymentMethodType.setDescription(Description);
	}

	/**
	* Returns the bank ID of this payment method type.
	*
	* @return the bank ID of this payment method type
	*/
	@Override
	public java.lang.String getBankId() {
		return _paymentMethodType.getBankId();
	}

	/**
	* Sets the bank ID of this payment method type.
	*
	* @param BankId the bank ID of this payment method type
	*/
	@Override
	public void setBankId(java.lang.String BankId) {
		_paymentMethodType.setBankId(BankId);
	}

	/**
	* Returns the active of this payment method type.
	*
	* @return the active of this payment method type
	*/
	@Override
	public boolean getActive() {
		return _paymentMethodType.getActive();
	}

	/**
	* Returns <code>true</code> if this payment method type is active.
	*
	* @return <code>true</code> if this payment method type is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _paymentMethodType.isActive();
	}

	/**
	* Sets whether this payment method type is active.
	*
	* @param Active the active of this payment method type
	*/
	@Override
	public void setActive(boolean Active) {
		_paymentMethodType.setActive(Active);
	}

	/**
	* Returns the created by of this payment method type.
	*
	* @return the created by of this payment method type
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentMethodType.getCreatedBy();
	}

	/**
	* Sets the created by of this payment method type.
	*
	* @param CreatedBy the created by of this payment method type
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentMethodType.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment method type.
	*
	* @return the created date of this payment method type
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentMethodType.getCreatedDate();
	}

	/**
	* Sets the created date of this payment method type.
	*
	* @param CreatedDate the created date of this payment method type
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentMethodType.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment method type.
	*
	* @return the modified by of this payment method type
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentMethodType.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment method type.
	*
	* @param ModifiedBy the modified by of this payment method type
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentMethodType.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment method type.
	*
	* @return the modified date of this payment method type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentMethodType.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment method type.
	*
	* @param ModifiedDate the modified date of this payment method type
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentMethodType.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the type of this payment method type.
	*
	* @return the type of this payment method type
	*/
	@Override
	public java.lang.String getType() {
		return _paymentMethodType.getType();
	}

	/**
	* Sets the type of this payment method type.
	*
	* @param Type the type of this payment method type
	*/
	@Override
	public void setType(java.lang.String Type) {
		_paymentMethodType.setType(Type);
	}

	@Override
	public boolean isNew() {
		return _paymentMethodType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentMethodType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentMethodType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentMethodType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentMethodType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentMethodType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentMethodType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentMethodType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentMethodType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentMethodType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentMethodType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentMethodTypeWrapper((PaymentMethodType)_paymentMethodType.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentMethodType paymentMethodType) {
		return _paymentMethodType.compareTo(paymentMethodType);
	}

	@Override
	public int hashCode() {
		return _paymentMethodType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentMethodType> toCacheModel() {
		return _paymentMethodType.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentMethodType toEscapedModel() {
		return new PaymentMethodTypeWrapper(_paymentMethodType.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentMethodType toUnescapedModel() {
		return new PaymentMethodTypeWrapper(_paymentMethodType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentMethodType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentMethodType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentMethodType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentMethodTypeWrapper)) {
			return false;
		}

		PaymentMethodTypeWrapper paymentMethodTypeWrapper = (PaymentMethodTypeWrapper)obj;

		if (Validator.equals(_paymentMethodType,
					paymentMethodTypeWrapper._paymentMethodType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentMethodType getWrappedPaymentMethodType() {
		return _paymentMethodType;
	}

	@Override
	public PaymentMethodType getWrappedModel() {
		return _paymentMethodType;
	}

	@Override
	public void resetOriginalValues() {
		_paymentMethodType.resetOriginalValues();
	}

	private PaymentMethodType _paymentMethodType;
}