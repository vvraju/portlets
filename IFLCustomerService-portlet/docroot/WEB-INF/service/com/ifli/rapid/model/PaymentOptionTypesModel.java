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
 * The base model interface for the PaymentOptionTypes service. Represents a row in the &quot;PaymentOptionTypes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PaymentOptionTypesImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionTypes
 * @see com.ifli.rapid.model.impl.PaymentOptionTypesImpl
 * @see com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl
 * @generated
 */
public interface PaymentOptionTypesModel extends BaseModel<PaymentOptionTypes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment option types model instance should use the {@link PaymentOptionTypes} interface instead.
	 */

	/**
	 * Returns the primary key of this payment option types.
	 *
	 * @return the primary key of this payment option types
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this payment option types.
	 *
	 * @param primaryKey the primary key of this payment option types
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the payment option types ID of this payment option types.
	 *
	 * @return the payment option types ID of this payment option types
	 */
	@AutoEscape
	public String getPaymentOptionTypesId();

	/**
	 * Sets the payment option types ID of this payment option types.
	 *
	 * @param PaymentOptionTypesId the payment option types ID of this payment option types
	 */
	public void setPaymentOptionTypesId(String PaymentOptionTypesId);

	/**
	 * Returns the payment option ID of this payment option types.
	 *
	 * @return the payment option ID of this payment option types
	 */
	@AutoEscape
	public String getPaymentOptionId();

	/**
	 * Sets the payment option ID of this payment option types.
	 *
	 * @param PaymentOptionId the payment option ID of this payment option types
	 */
	public void setPaymentOptionId(String PaymentOptionId);

	/**
	 * Returns the option types key of this payment option types.
	 *
	 * @return the option types key of this payment option types
	 */
	@AutoEscape
	public String getOptionTypesKey();

	/**
	 * Sets the option types key of this payment option types.
	 *
	 * @param OptionTypesKey the option types key of this payment option types
	 */
	public void setOptionTypesKey(String OptionTypesKey);

	/**
	 * Returns the is active of this payment option types.
	 *
	 * @return the is active of this payment option types
	 */
	public boolean getIsActive();

	/**
	 * Returns <code>true</code> if this payment option types is is active.
	 *
	 * @return <code>true</code> if this payment option types is is active; <code>false</code> otherwise
	 */
	public boolean isIsActive();

	/**
	 * Sets whether this payment option types is is active.
	 *
	 * @param IsActive the is active of this payment option types
	 */
	public void setIsActive(boolean IsActive);

	/**
	 * Returns the created by of this payment option types.
	 *
	 * @return the created by of this payment option types
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this payment option types.
	 *
	 * @param CreatedBy the created by of this payment option types
	 */
	public void setCreatedBy(String CreatedBy);

	/**
	 * Returns the created date of this payment option types.
	 *
	 * @return the created date of this payment option types
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this payment option types.
	 *
	 * @param CreatedDate the created date of this payment option types
	 */
	public void setCreatedDate(Date CreatedDate);

	/**
	 * Returns the modified by of this payment option types.
	 *
	 * @return the modified by of this payment option types
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this payment option types.
	 *
	 * @param ModifiedBy the modified by of this payment option types
	 */
	public void setModifiedBy(String ModifiedBy);

	/**
	 * Returns the modified date of this payment option types.
	 *
	 * @return the modified date of this payment option types
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this payment option types.
	 *
	 * @param ModifiedDate the modified date of this payment option types
	 */
	public void setModifiedDate(Date ModifiedDate);

	/**
	 * Returns the priority of this payment option types.
	 *
	 * @return the priority of this payment option types
	 */
	public int getPriority();

	/**
	 * Sets the priority of this payment option types.
	 *
	 * @param Priority the priority of this payment option types
	 */
	public void setPriority(int Priority);

	/**
	 * Returns the payment option type desc of this payment option types.
	 *
	 * @return the payment option type desc of this payment option types
	 */
	@AutoEscape
	public String getPaymentOptionTypeDesc();

	/**
	 * Sets the payment option type desc of this payment option types.
	 *
	 * @param PaymentOptionTypeDesc the payment option type desc of this payment option types
	 */
	public void setPaymentOptionTypeDesc(String PaymentOptionTypeDesc);

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
	public int compareTo(PaymentOptionTypes paymentOptionTypes);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PaymentOptionTypes> toCacheModel();

	@Override
	public PaymentOptionTypes toEscapedModel();

	@Override
	public PaymentOptionTypes toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}