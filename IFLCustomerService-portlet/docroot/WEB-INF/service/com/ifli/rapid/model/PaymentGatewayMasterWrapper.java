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
 * This class is a wrapper for {@link PaymentGatewayMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentGatewayMaster
 * @generated
 */
public class PaymentGatewayMasterWrapper implements PaymentGatewayMaster,
	ModelWrapper<PaymentGatewayMaster> {
	public PaymentGatewayMasterWrapper(
		PaymentGatewayMaster paymentGatewayMaster) {
		_paymentGatewayMaster = paymentGatewayMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentGatewayMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentGatewayMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GatewayID", getGatewayID());
		attributes.put("GatewayDescription", getGatewayDescription());
		attributes.put("GatewayKey", getGatewayKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("ItemCode", getItemCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String GatewayID = (String)attributes.get("GatewayID");

		if (GatewayID != null) {
			setGatewayID(GatewayID);
		}

		String GatewayDescription = (String)attributes.get("GatewayDescription");

		if (GatewayDescription != null) {
			setGatewayDescription(GatewayDescription);
		}

		String GatewayKey = (String)attributes.get("GatewayKey");

		if (GatewayKey != null) {
			setGatewayKey(GatewayKey);
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

		String ItemCode = (String)attributes.get("ItemCode");

		if (ItemCode != null) {
			setItemCode(ItemCode);
		}
	}

	/**
	* Returns the primary key of this payment gateway master.
	*
	* @return the primary key of this payment gateway master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _paymentGatewayMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment gateway master.
	*
	* @param primaryKey the primary key of this payment gateway master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_paymentGatewayMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the gateway i d of this payment gateway master.
	*
	* @return the gateway i d of this payment gateway master
	*/
	@Override
	public java.lang.String getGatewayID() {
		return _paymentGatewayMaster.getGatewayID();
	}

	/**
	* Sets the gateway i d of this payment gateway master.
	*
	* @param GatewayID the gateway i d of this payment gateway master
	*/
	@Override
	public void setGatewayID(java.lang.String GatewayID) {
		_paymentGatewayMaster.setGatewayID(GatewayID);
	}

	/**
	* Returns the gateway description of this payment gateway master.
	*
	* @return the gateway description of this payment gateway master
	*/
	@Override
	public java.lang.String getGatewayDescription() {
		return _paymentGatewayMaster.getGatewayDescription();
	}

	/**
	* Sets the gateway description of this payment gateway master.
	*
	* @param GatewayDescription the gateway description of this payment gateway master
	*/
	@Override
	public void setGatewayDescription(java.lang.String GatewayDescription) {
		_paymentGatewayMaster.setGatewayDescription(GatewayDescription);
	}

	/**
	* Returns the gateway key of this payment gateway master.
	*
	* @return the gateway key of this payment gateway master
	*/
	@Override
	public java.lang.String getGatewayKey() {
		return _paymentGatewayMaster.getGatewayKey();
	}

	/**
	* Sets the gateway key of this payment gateway master.
	*
	* @param GatewayKey the gateway key of this payment gateway master
	*/
	@Override
	public void setGatewayKey(java.lang.String GatewayKey) {
		_paymentGatewayMaster.setGatewayKey(GatewayKey);
	}

	/**
	* Returns the is active of this payment gateway master.
	*
	* @return the is active of this payment gateway master
	*/
	@Override
	public boolean getIsActive() {
		return _paymentGatewayMaster.getIsActive();
	}

	/**
	* Returns <code>true</code> if this payment gateway master is is active.
	*
	* @return <code>true</code> if this payment gateway master is is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActive() {
		return _paymentGatewayMaster.isIsActive();
	}

	/**
	* Sets whether this payment gateway master is is active.
	*
	* @param IsActive the is active of this payment gateway master
	*/
	@Override
	public void setIsActive(boolean IsActive) {
		_paymentGatewayMaster.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this payment gateway master.
	*
	* @return the created by of this payment gateway master
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentGatewayMaster.getCreatedBy();
	}

	/**
	* Sets the created by of this payment gateway master.
	*
	* @param CreatedBy the created by of this payment gateway master
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentGatewayMaster.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment gateway master.
	*
	* @return the created date of this payment gateway master
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentGatewayMaster.getCreatedDate();
	}

	/**
	* Sets the created date of this payment gateway master.
	*
	* @param CreatedDate the created date of this payment gateway master
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentGatewayMaster.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment gateway master.
	*
	* @return the modified by of this payment gateway master
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentGatewayMaster.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment gateway master.
	*
	* @param ModifiedBy the modified by of this payment gateway master
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentGatewayMaster.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment gateway master.
	*
	* @return the modified date of this payment gateway master
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentGatewayMaster.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment gateway master.
	*
	* @param ModifiedDate the modified date of this payment gateway master
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentGatewayMaster.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the priority of this payment gateway master.
	*
	* @return the priority of this payment gateway master
	*/
	@Override
	public int getPriority() {
		return _paymentGatewayMaster.getPriority();
	}

	/**
	* Sets the priority of this payment gateway master.
	*
	* @param Priority the priority of this payment gateway master
	*/
	@Override
	public void setPriority(int Priority) {
		_paymentGatewayMaster.setPriority(Priority);
	}

	/**
	* Returns the item code of this payment gateway master.
	*
	* @return the item code of this payment gateway master
	*/
	@Override
	public java.lang.String getItemCode() {
		return _paymentGatewayMaster.getItemCode();
	}

	/**
	* Sets the item code of this payment gateway master.
	*
	* @param ItemCode the item code of this payment gateway master
	*/
	@Override
	public void setItemCode(java.lang.String ItemCode) {
		_paymentGatewayMaster.setItemCode(ItemCode);
	}

	@Override
	public boolean isNew() {
		return _paymentGatewayMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentGatewayMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentGatewayMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentGatewayMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentGatewayMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentGatewayMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentGatewayMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentGatewayMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentGatewayMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentGatewayMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentGatewayMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentGatewayMasterWrapper((PaymentGatewayMaster)_paymentGatewayMaster.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster) {
		return _paymentGatewayMaster.compareTo(paymentGatewayMaster);
	}

	@Override
	public int hashCode() {
		return _paymentGatewayMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentGatewayMaster> toCacheModel() {
		return _paymentGatewayMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster toEscapedModel() {
		return new PaymentGatewayMasterWrapper(_paymentGatewayMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster toUnescapedModel() {
		return new PaymentGatewayMasterWrapper(_paymentGatewayMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentGatewayMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentGatewayMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentGatewayMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentGatewayMasterWrapper)) {
			return false;
		}

		PaymentGatewayMasterWrapper paymentGatewayMasterWrapper = (PaymentGatewayMasterWrapper)obj;

		if (Validator.equals(_paymentGatewayMaster,
					paymentGatewayMasterWrapper._paymentGatewayMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentGatewayMaster getWrappedPaymentGatewayMaster() {
		return _paymentGatewayMaster;
	}

	@Override
	public PaymentGatewayMaster getWrappedModel() {
		return _paymentGatewayMaster;
	}

	@Override
	public void resetOriginalValues() {
		_paymentGatewayMaster.resetOriginalValues();
	}

	private PaymentGatewayMaster _paymentGatewayMaster;
}