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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentOptionMaster service. Represents a row in the &quot;PaymentOptionMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PaymentOptionMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMaster
 * @see com.ifli.rapid.model.impl.PaymentOptionMasterImpl
 * @see com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl
 * @generated
 */
public interface PaymentOptionMasterModel extends BaseModel<PaymentOptionMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment option master model instance should use the {@link PaymentOptionMaster} interface instead.
	 */

	/**
	 * Returns the primary key of this payment option master.
	 *
	 * @return the primary key of this payment option master
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this payment option master.
	 *
	 * @param primaryKey the primary key of this payment option master
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the payment option ID of this payment option master.
	 *
	 * @return the payment option ID of this payment option master
	 */
	@AutoEscape
	public String getPaymentOptionId();

	/**
	 * Sets the payment option ID of this payment option master.
	 *
	 * @param PaymentOptionId the payment option ID of this payment option master
	 */
	public void setPaymentOptionId(String PaymentOptionId);

	/**
	 * Returns the payment option key of this payment option master.
	 *
	 * @return the payment option key of this payment option master
	 */
	@AutoEscape
	public String getPaymentOptionKey();

	/**
	 * Sets the payment option key of this payment option master.
	 *
	 * @param PaymentOptionKey the payment option key of this payment option master
	 */
	public void setPaymentOptionKey(String PaymentOptionKey);

	/**
	 * Returns the is active of this payment option master.
	 *
	 * @return the is active of this payment option master
	 */
	public boolean getIsActive();

	/**
	 * Returns <code>true</code> if this payment option master is is active.
	 *
	 * @return <code>true</code> if this payment option master is is active; <code>false</code> otherwise
	 */
	public boolean isIsActive();

	/**
	 * Sets whether this payment option master is is active.
	 *
	 * @param IsActive the is active of this payment option master
	 */
	public void setIsActive(boolean IsActive);

	/**
	 * Returns the created by of this payment option master.
	 *
	 * @return the created by of this payment option master
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this payment option master.
	 *
	 * @param CreatedBy the created by of this payment option master
	 */
	public void setCreatedBy(String CreatedBy);

	/**
	 * Returns the created date of this payment option master.
	 *
	 * @return the created date of this payment option master
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this payment option master.
	 *
	 * @param CreatedDate the created date of this payment option master
	 */
	public void setCreatedDate(Date CreatedDate);

	/**
	 * Returns the modified by of this payment option master.
	 *
	 * @return the modified by of this payment option master
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this payment option master.
	 *
	 * @param ModifiedBy the modified by of this payment option master
	 */
	public void setModifiedBy(String ModifiedBy);

	/**
	 * Returns the modified date of this payment option master.
	 *
	 * @return the modified date of this payment option master
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this payment option master.
	 *
	 * @param ModifiedDate the modified date of this payment option master
	 */
	public void setModifiedDate(Date ModifiedDate);

	/**
	 * Returns the priority of this payment option master.
	 *
	 * @return the priority of this payment option master
	 */
	public int getPriority();

	/**
	 * Sets the priority of this payment option master.
	 *
	 * @param Priority the priority of this payment option master
	 */
	public void setPriority(int Priority);

	/**
	 * Returns the payment option desc of this payment option master.
	 *
	 * @return the payment option desc of this payment option master
	 */
	@AutoEscape
	public String getPaymentOptionDesc();

	/**
	 * Sets the payment option desc of this payment option master.
	 *
	 * @param PaymentOptionDesc the payment option desc of this payment option master
	 */
	public void setPaymentOptionDesc(String PaymentOptionDesc);

	/**
	 * Returns the is process payment of this payment option master.
	 *
	 * @return the is process payment of this payment option master
	 */
	public boolean getIsProcessPayment();

	/**
	 * Returns <code>true</code> if this payment option master is is process payment.
	 *
	 * @return <code>true</code> if this payment option master is is process payment; <code>false</code> otherwise
	 */
	public boolean isIsProcessPayment();

	/**
	 * Sets whether this payment option master is is process payment.
	 *
	 * @param isProcessPayment the is process payment of this payment option master
	 */
	public void setIsProcessPayment(boolean isProcessPayment);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(PaymentOptionMaster paymentOptionMaster);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PaymentOptionMaster> toCacheModel();

	@Override
	public PaymentOptionMaster toEscapedModel();

	@Override
	public PaymentOptionMaster toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}