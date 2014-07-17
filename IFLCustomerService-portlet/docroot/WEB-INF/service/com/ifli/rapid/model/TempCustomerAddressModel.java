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
 * The base model interface for the TempCustomerAddress service. Represents a row in the &quot;temp_customer_address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.TempCustomerAddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerAddress
 * @see com.ifli.rapid.model.impl.TempCustomerAddressImpl
 * @see com.ifli.rapid.model.impl.TempCustomerAddressModelImpl
 * @generated
 */
public interface TempCustomerAddressModel extends BaseModel<TempCustomerAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp customer address model instance should use the {@link TempCustomerAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this temp customer address.
	 *
	 * @return the primary key of this temp customer address
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this temp customer address.
	 *
	 * @param primaryKey the primary key of this temp customer address
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the c u s t o m e r_ a d d r e s s_ i d of this temp customer address.
	 *
	 * @return the c u s t o m e r_ a d d r e s s_ i d of this temp customer address
	 */
	public int getCUSTOMER_ADDRESS_ID();

	/**
	 * Sets the c u s t o m e r_ a d d r e s s_ i d of this temp customer address.
	 *
	 * @param CUSTOMER_ADDRESS_ID the c u s t o m e r_ a d d r e s s_ i d of this temp customer address
	 */
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID);

	/**
	 * Returns the c u s t o m e r_ i d of this temp customer address.
	 *
	 * @return the c u s t o m e r_ i d of this temp customer address
	 */
	public int getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this temp customer address.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this temp customer address
	 */
	public void setCUSTOMER_ID(int CUSTOMER_ID);

	/**
	 * Returns the a d d r e s s_ l i n e_1 of this temp customer address.
	 *
	 * @return the a d d r e s s_ l i n e_1 of this temp customer address
	 */
	@AutoEscape
	public String getADDRESS_LINE_1();

	/**
	 * Sets the a d d r e s s_ l i n e_1 of this temp customer address.
	 *
	 * @param ADDRESS_LINE_1 the a d d r e s s_ l i n e_1 of this temp customer address
	 */
	public void setADDRESS_LINE_1(String ADDRESS_LINE_1);

	/**
	 * Returns the a d d r e s s_ l i n e_2 of this temp customer address.
	 *
	 * @return the a d d r e s s_ l i n e_2 of this temp customer address
	 */
	@AutoEscape
	public String getADDRESS_LINE_2();

	/**
	 * Sets the a d d r e s s_ l i n e_2 of this temp customer address.
	 *
	 * @param ADDRESS_LINE_2 the a d d r e s s_ l i n e_2 of this temp customer address
	 */
	public void setADDRESS_LINE_2(String ADDRESS_LINE_2);

	/**
	 * Returns the a d d r e s s_ l i n e_3 of this temp customer address.
	 *
	 * @return the a d d r e s s_ l i n e_3 of this temp customer address
	 */
	@AutoEscape
	public String getADDRESS_LINE_3();

	/**
	 * Sets the a d d r e s s_ l i n e_3 of this temp customer address.
	 *
	 * @param ADDRESS_LINE_3 the a d d r e s s_ l i n e_3 of this temp customer address
	 */
	public void setADDRESS_LINE_3(String ADDRESS_LINE_3);

	/**
	 * Returns the c h a n g e_ r e q u e s t_ t y p e of this temp customer address.
	 *
	 * @return the c h a n g e_ r e q u e s t_ t y p e of this temp customer address
	 */
	@AutoEscape
	public String getCHANGE_REQUEST_TYPE();

	/**
	 * Sets the c h a n g e_ r e q u e s t_ t y p e of this temp customer address.
	 *
	 * @param CHANGE_REQUEST_TYPE the c h a n g e_ r e q u e s t_ t y p e of this temp customer address
	 */
	public void setCHANGE_REQUEST_TYPE(String CHANGE_REQUEST_TYPE);

	/**
	 * Returns the c i t y of this temp customer address.
	 *
	 * @return the c i t y of this temp customer address
	 */
	@AutoEscape
	public String getCITY();

	/**
	 * Sets the c i t y of this temp customer address.
	 *
	 * @param CITY the c i t y of this temp customer address
	 */
	public void setCITY(String CITY);

	/**
	 * Returns the s t a t e of this temp customer address.
	 *
	 * @return the s t a t e of this temp customer address
	 */
	@AutoEscape
	public String getSTATE();

	/**
	 * Sets the s t a t e of this temp customer address.
	 *
	 * @param STATE the s t a t e of this temp customer address
	 */
	public void setSTATE(String STATE);

	/**
	 * Returns the c i t y_ i d of this temp customer address.
	 *
	 * @return the c i t y_ i d of this temp customer address
	 */
	public int getCITY_ID();

	/**
	 * Sets the c i t y_ i d of this temp customer address.
	 *
	 * @param CITY_ID the c i t y_ i d of this temp customer address
	 */
	public void setCITY_ID(int CITY_ID);

	/**
	 * Returns the s t a t e_ i d of this temp customer address.
	 *
	 * @return the s t a t e_ i d of this temp customer address
	 */
	public int getSTATE_ID();

	/**
	 * Sets the s t a t e_ i d of this temp customer address.
	 *
	 * @param STATE_ID the s t a t e_ i d of this temp customer address
	 */
	public void setSTATE_ID(int STATE_ID);

	/**
	 * Returns the p i n_ c o d e of this temp customer address.
	 *
	 * @return the p i n_ c o d e of this temp customer address
	 */
	@AutoEscape
	public String getPIN_CODE();

	/**
	 * Sets the p i n_ c o d e of this temp customer address.
	 *
	 * @param PIN_CODE the p i n_ c o d e of this temp customer address
	 */
	public void setPIN_CODE(String PIN_CODE);

	/**
	 * Returns the c h a n g e_ r e q u e s t_ f o r of this temp customer address.
	 *
	 * @return the c h a n g e_ r e q u e s t_ f o r of this temp customer address
	 */
	public int getCHANGE_REQUEST_FOR();

	/**
	 * Sets the c h a n g e_ r e q u e s t_ f o r of this temp customer address.
	 *
	 * @param CHANGE_REQUEST_FOR the c h a n g e_ r e q u e s t_ f o r of this temp customer address
	 */
	public void setCHANGE_REQUEST_FOR(int CHANGE_REQUEST_FOR);

	/**
	 * Returns the a d d r e s s_ t y p e_ i d of this temp customer address.
	 *
	 * @return the a d d r e s s_ t y p e_ i d of this temp customer address
	 */
	public int getADDRESS_TYPE_ID();

	/**
	 * Sets the a d d r e s s_ t y p e_ i d of this temp customer address.
	 *
	 * @param ADDRESS_TYPE_ID the a d d r e s s_ t y p e_ i d of this temp customer address
	 */
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID);

	/**
	 * Returns the a d d r_ s t a t u s of this temp customer address.
	 *
	 * @return the a d d r_ s t a t u s of this temp customer address
	 */
	@AutoEscape
	public String getADDR_STATUS();

	/**
	 * Sets the a d d r_ s t a t u s of this temp customer address.
	 *
	 * @param ADDR_STATUS the a d d r_ s t a t u s of this temp customer address
	 */
	public void setADDR_STATUS(String ADDR_STATUS);

	/**
	 * Returns the i n s e r t e d_ b y of this temp customer address.
	 *
	 * @return the i n s e r t e d_ b y of this temp customer address
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this temp customer address.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this temp customer address
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the i n s e r t e d_ d a t e of this temp customer address.
	 *
	 * @return the i n s e r t e d_ d a t e of this temp customer address
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this temp customer address.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this temp customer address
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this temp customer address.
	 *
	 * @return the u p d a t e d_ b y of this temp customer address
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this temp customer address.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this temp customer address
	 */
	public void setUPDATED_BY(String UPDATED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this temp customer address.
	 *
	 * @return the u p d a t e d_ d a t e of this temp customer address
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this temp customer address.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this temp customer address
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the q r c_ a s r_ i d of this temp customer address.
	 *
	 * @return the q r c_ a s r_ i d of this temp customer address
	 */
	public int getQRC_ASR_ID();

	/**
	 * Sets the q r c_ a s r_ i d of this temp customer address.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d of this temp customer address
	 */
	public void setQRC_ASR_ID(int QRC_ASR_ID);

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
	public int compareTo(TempCustomerAddress tempCustomerAddress);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempCustomerAddress> toCacheModel();

	@Override
	public TempCustomerAddress toEscapedModel();

	@Override
	public TempCustomerAddress toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}