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

/**
 * The base model interface for the PolicyAddress service. Represents a row in the &quot;policy_address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PolicyAddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyAddress
 * @see com.ifli.rapid.model.impl.PolicyAddressImpl
 * @see com.ifli.rapid.model.impl.PolicyAddressModelImpl
 * @generated
 */
public interface PolicyAddressModel extends BaseModel<PolicyAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a policy address model instance should use the {@link PolicyAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this policy address.
	 *
	 * @return the primary key of this policy address
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this policy address.
	 *
	 * @param primaryKey the primary key of this policy address
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the i d of this policy address.
	 *
	 * @return the i d of this policy address
	 */
	public int getID();

	/**
	 * Sets the i d of this policy address.
	 *
	 * @param ID the i d of this policy address
	 */
	public void setID(int ID);

	/**
	 * Returns the p o l i c y_ i d of this policy address.
	 *
	 * @return the p o l i c y_ i d of this policy address
	 */
	@AutoEscape
	public String getPOLICY_ID();

	/**
	 * Sets the p o l i c y_ i d of this policy address.
	 *
	 * @param POLICY_ID the p o l i c y_ i d of this policy address
	 */
	public void setPOLICY_ID(String POLICY_ID);

	/**
	 * Returns the c u s t o m e r_ i d of this policy address.
	 *
	 * @return the c u s t o m e r_ i d of this policy address
	 */
	@AutoEscape
	public String getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this policy address.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this policy address
	 */
	public void setCUSTOMER_ID(String CUSTOMER_ID);

	/**
	 * Returns the c u s t o m e r_ a d d r e s s_ i d of this policy address.
	 *
	 * @return the c u s t o m e r_ a d d r e s s_ i d of this policy address
	 */
	public int getCUSTOMER_ADDRESS_ID();

	/**
	 * Sets the c u s t o m e r_ a d d r e s s_ i d of this policy address.
	 *
	 * @param CUSTOMER_ADDRESS_ID the c u s t o m e r_ a d d r e s s_ i d of this policy address
	 */
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID);

	/**
	 * Returns the p i n c o d e of this policy address.
	 *
	 * @return the p i n c o d e of this policy address
	 */
	@AutoEscape
	public String getPINCODE();

	/**
	 * Sets the p i n c o d e of this policy address.
	 *
	 * @param PINCODE the p i n c o d e of this policy address
	 */
	public void setPINCODE(String PINCODE);

	/**
	 * Returns the c i t y of this policy address.
	 *
	 * @return the c i t y of this policy address
	 */
	@AutoEscape
	public String getCITY();

	/**
	 * Sets the c i t y of this policy address.
	 *
	 * @param CITY the c i t y of this policy address
	 */
	public void setCITY(String CITY);

	/**
	 * Returns the s t a t e of this policy address.
	 *
	 * @return the s t a t e of this policy address
	 */
	@AutoEscape
	public String getSTATE();

	/**
	 * Sets the s t a t e of this policy address.
	 *
	 * @param STATE the s t a t e of this policy address
	 */
	public void setSTATE(String STATE);

	/**
	 * Returns the a d d r e s s_ l i n e_1 of this policy address.
	 *
	 * @return the a d d r e s s_ l i n e_1 of this policy address
	 */
	@AutoEscape
	public String getADDRESS_LINE_1();

	/**
	 * Sets the a d d r e s s_ l i n e_1 of this policy address.
	 *
	 * @param ADDRESS_LINE_1 the a d d r e s s_ l i n e_1 of this policy address
	 */
	public void setADDRESS_LINE_1(String ADDRESS_LINE_1);

	/**
	 * Returns the a d d r e s s_ l i n e_2 of this policy address.
	 *
	 * @return the a d d r e s s_ l i n e_2 of this policy address
	 */
	@AutoEscape
	public String getADDRESS_LINE_2();

	/**
	 * Sets the a d d r e s s_ l i n e_2 of this policy address.
	 *
	 * @param ADDRESS_LINE_2 the a d d r e s s_ l i n e_2 of this policy address
	 */
	public void setADDRESS_LINE_2(String ADDRESS_LINE_2);

	/**
	 * Returns the a d d r e s s_ l i n e_3 of this policy address.
	 *
	 * @return the a d d r e s s_ l i n e_3 of this policy address
	 */
	@AutoEscape
	public String getADDRESS_LINE_3();

	/**
	 * Sets the a d d r e s s_ l i n e_3 of this policy address.
	 *
	 * @param ADDRESS_LINE_3 the a d d r e s s_ l i n e_3 of this policy address
	 */
	public void setADDRESS_LINE_3(String ADDRESS_LINE_3);

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
	public int compareTo(PolicyAddress policyAddress);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PolicyAddress> toCacheModel();

	@Override
	public PolicyAddress toEscapedModel();

	@Override
	public PolicyAddress toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}