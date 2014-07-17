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
 * This class is a wrapper for {@link PaymentTransactionStatusMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMaster
 * @generated
 */
public class PaymentTransactionStatusMasterWrapper
	implements PaymentTransactionStatusMaster,
		ModelWrapper<PaymentTransactionStatusMaster> {
	public PaymentTransactionStatusMasterWrapper(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		_paymentTransactionStatusMaster = paymentTransactionStatusMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentTransactionStatusMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentTransactionStatusMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TransactionStatusID", getTransactionStatusID());
		attributes.put("StatusCode", getStatusCode());
		attributes.put("StatusName", getStatusName());
		attributes.put("StatusDesc", getStatusDesc());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer TransactionStatusID = (Integer)attributes.get(
				"TransactionStatusID");

		if (TransactionStatusID != null) {
			setTransactionStatusID(TransactionStatusID);
		}

		Integer StatusCode = (Integer)attributes.get("StatusCode");

		if (StatusCode != null) {
			setStatusCode(StatusCode);
		}

		String StatusName = (String)attributes.get("StatusName");

		if (StatusName != null) {
			setStatusName(StatusName);
		}

		String StatusDesc = (String)attributes.get("StatusDesc");

		if (StatusDesc != null) {
			setStatusDesc(StatusDesc);
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
	}

	/**
	* Returns the primary key of this payment transaction status master.
	*
	* @return the primary key of this payment transaction status master
	*/
	@Override
	public int getPrimaryKey() {
		return _paymentTransactionStatusMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment transaction status master.
	*
	* @param primaryKey the primary key of this payment transaction status master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_paymentTransactionStatusMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the transaction status i d of this payment transaction status master.
	*
	* @return the transaction status i d of this payment transaction status master
	*/
	@Override
	public int getTransactionStatusID() {
		return _paymentTransactionStatusMaster.getTransactionStatusID();
	}

	/**
	* Sets the transaction status i d of this payment transaction status master.
	*
	* @param TransactionStatusID the transaction status i d of this payment transaction status master
	*/
	@Override
	public void setTransactionStatusID(int TransactionStatusID) {
		_paymentTransactionStatusMaster.setTransactionStatusID(TransactionStatusID);
	}

	/**
	* Returns the status code of this payment transaction status master.
	*
	* @return the status code of this payment transaction status master
	*/
	@Override
	public int getStatusCode() {
		return _paymentTransactionStatusMaster.getStatusCode();
	}

	/**
	* Sets the status code of this payment transaction status master.
	*
	* @param StatusCode the status code of this payment transaction status master
	*/
	@Override
	public void setStatusCode(int StatusCode) {
		_paymentTransactionStatusMaster.setStatusCode(StatusCode);
	}

	/**
	* Returns the status name of this payment transaction status master.
	*
	* @return the status name of this payment transaction status master
	*/
	@Override
	public java.lang.String getStatusName() {
		return _paymentTransactionStatusMaster.getStatusName();
	}

	/**
	* Sets the status name of this payment transaction status master.
	*
	* @param StatusName the status name of this payment transaction status master
	*/
	@Override
	public void setStatusName(java.lang.String StatusName) {
		_paymentTransactionStatusMaster.setStatusName(StatusName);
	}

	/**
	* Returns the status desc of this payment transaction status master.
	*
	* @return the status desc of this payment transaction status master
	*/
	@Override
	public java.lang.String getStatusDesc() {
		return _paymentTransactionStatusMaster.getStatusDesc();
	}

	/**
	* Sets the status desc of this payment transaction status master.
	*
	* @param StatusDesc the status desc of this payment transaction status master
	*/
	@Override
	public void setStatusDesc(java.lang.String StatusDesc) {
		_paymentTransactionStatusMaster.setStatusDesc(StatusDesc);
	}

	/**
	* Returns the is active of this payment transaction status master.
	*
	* @return the is active of this payment transaction status master
	*/
	@Override
	public boolean getIsActive() {
		return _paymentTransactionStatusMaster.getIsActive();
	}

	/**
	* Returns <code>true</code> if this payment transaction status master is is active.
	*
	* @return <code>true</code> if this payment transaction status master is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _paymentTransactionStatusMaster.isIsActive();
	}

	/**
	* Sets whether this payment transaction status master is is active.
	*
	* @param IsActive the is active of this payment transaction status master
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_paymentTransactionStatusMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this payment transaction status master.
	*
	* @return the created by of this payment transaction status master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentTransactionStatusMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this payment transaction status master.
	*
	* @param CreatedBy the created by of this payment transaction status master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentTransactionStatusMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment transaction status master.
	*
	* @return the created date of this payment transaction status master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentTransactionStatusMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this payment transaction status master.
	*
	* @param CreatedDate the created date of this payment transaction status master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentTransactionStatusMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment transaction status master.
	*
	* @return the modified by of this payment transaction status master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentTransactionStatusMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment transaction status master.
	*
	* @param ModifiedBy the modified by of this payment transaction status master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentTransactionStatusMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment transaction status master.
	*
	* @return the modified date of this payment transaction status master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentTransactionStatusMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment transaction status master.
	*
	* @param ModifiedDate the modified date of this payment transaction status master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentTransactionStatusMaster.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _paymentTransactionStatusMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentTransactionStatusMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentTransactionStatusMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentTransactionStatusMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentTransactionStatusMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentTransactionStatusMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentTransactionStatusMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentTransactionStatusMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentTransactionStatusMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentTransactionStatusMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentTransactionStatusMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentTransactionStatusMasterWrapper((PaymentTransactionStatusMaster)_paymentTransactionStatusMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		return _paymentTransactionStatusMaster.compareTo(paymentTransactionStatusMaster);
	}

	@Override
	public int hashCode() {
		return _paymentTransactionStatusMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentTransactionStatusMaster> toCacheModel() {
		return _paymentTransactionStatusMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster toEscapedModel() {
		return new PaymentTransactionStatusMasterWrapper(_paymentTransactionStatusMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster toUnescapedModel() {
		return new PaymentTransactionStatusMasterWrapper(_paymentTransactionStatusMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentTransactionStatusMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentTransactionStatusMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentTransactionStatusMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentTransactionStatusMasterWrapper)) {
			return false;
		}

		PaymentTransactionStatusMasterWrapper paymentTransactionStatusMasterWrapper =
			(PaymentTransactionStatusMasterWrapper)obj;

		if (Validator.equals(_paymentTransactionStatusMaster,
					paymentTransactionStatusMasterWrapper._paymentTransactionStatusMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentTransactionStatusMaster getWrappedPaymentTransactionStatusMaster() {
		return _paymentTransactionStatusMaster;
	}

	@Override
	public PaymentTransactionStatusMaster getWrappedModel() {
		return _paymentTransactionStatusMaster;
	}

	@Override
	public void resetOriginalValues() {
		_paymentTransactionStatusMaster.resetOriginalValues();
	}

	private PaymentTransactionStatusMaster _paymentTransactionStatusMaster;
}