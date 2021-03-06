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
 * The base model interface for the TempCustomer service. Represents a row in the &quot;temp_customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.TempCustomerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.TempCustomerImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomer
 * @see com.ifli.rapid.model.impl.TempCustomerImpl
 * @see com.ifli.rapid.model.impl.TempCustomerModelImpl
 * @generated
 */
public interface TempCustomerModel extends BaseModel<TempCustomer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp customer model instance should use the {@link TempCustomer} interface instead.
	 */

	/**
	 * Returns the primary key of this temp customer.
	 *
	 * @return the primary key of this temp customer
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this temp customer.
	 *
	 * @param primaryKey the primary key of this temp customer
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the c u s t o m e r_ i d of this temp customer.
	 *
	 * @return the c u s t o m e r_ i d of this temp customer
	 */
	public int getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this temp customer.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this temp customer
	 */
	public void setCUSTOMER_ID(int CUSTOMER_ID);

	/**
	 * Returns the c u s t o m e r_ s a l u t a t i o n of this temp customer.
	 *
	 * @return the c u s t o m e r_ s a l u t a t i o n of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_SALUTATION();

	/**
	 * Sets the c u s t o m e r_ s a l u t a t i o n of this temp customer.
	 *
	 * @param CUSTOMER_SALUTATION the c u s t o m e r_ s a l u t a t i o n of this temp customer
	 */
	public void setCUSTOMER_SALUTATION(String CUSTOMER_SALUTATION);

	/**
	 * Returns the c u s t o m e r_ f i r s t_ n a m e of this temp customer.
	 *
	 * @return the c u s t o m e r_ f i r s t_ n a m e of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_FIRST_NAME();

	/**
	 * Sets the c u s t o m e r_ f i r s t_ n a m e of this temp customer.
	 *
	 * @param CUSTOMER_FIRST_NAME the c u s t o m e r_ f i r s t_ n a m e of this temp customer
	 */
	public void setCUSTOMER_FIRST_NAME(String CUSTOMER_FIRST_NAME);

	/**
	 * Returns the c u s t o m e r_ l a s t_ n a m e of this temp customer.
	 *
	 * @return the c u s t o m e r_ l a s t_ n a m e of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_LAST_NAME();

	/**
	 * Sets the c u s t o m e r_ l a s t_ n a m e of this temp customer.
	 *
	 * @param CUSTOMER_LAST_NAME the c u s t o m e r_ l a s t_ n a m e of this temp customer
	 */
	public void setCUSTOMER_LAST_NAME(String CUSTOMER_LAST_NAME);

	/**
	 * Returns the c u s t o m e r_ m i d d l e_ n a m e of this temp customer.
	 *
	 * @return the c u s t o m e r_ m i d d l e_ n a m e of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_MIDDLE_NAME();

	/**
	 * Sets the c u s t o m e r_ m i d d l e_ n a m e of this temp customer.
	 *
	 * @param CUSTOMER_MIDDLE_NAME the c u s t o m e r_ m i d d l e_ n a m e of this temp customer
	 */
	public void setCUSTOMER_MIDDLE_NAME(String CUSTOMER_MIDDLE_NAME);

	/**
	 * Returns the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer.
	 *
	 * @return the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_DATE_OF_BIRTH();

	/**
	 * Sets the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer.
	 *
	 * @param CUSTOMER_DATE_OF_BIRTH the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer
	 */
	public void setCUSTOMER_DATE_OF_BIRTH(String CUSTOMER_DATE_OF_BIRTH);

	/**
	 * Returns the c u s t o m e r_ e m a i l_ a d d r of this temp customer.
	 *
	 * @return the c u s t o m e r_ e m a i l_ a d d r of this temp customer
	 */
	@AutoEscape
	public String getCUSTOMER_EMAIL_ADDR();

	/**
	 * Sets the c u s t o m e r_ e m a i l_ a d d r of this temp customer.
	 *
	 * @param CUSTOMER_EMAIL_ADDR the c u s t o m e r_ e m a i l_ a d d r of this temp customer
	 */
	public void setCUSTOMER_EMAIL_ADDR(String CUSTOMER_EMAIL_ADDR);

	/**
	 * Returns the o f f i c e_ n a m e of this temp customer.
	 *
	 * @return the o f f i c e_ n a m e of this temp customer
	 */
	@AutoEscape
	public String getOFFICE_NAME();

	/**
	 * Sets the o f f i c e_ n a m e of this temp customer.
	 *
	 * @param OFFICE_NAME the o f f i c e_ n a m e of this temp customer
	 */
	public void setOFFICE_NAME(String OFFICE_NAME);

	/**
	 * Returns the d e s i g n a t i o n of this temp customer.
	 *
	 * @return the d e s i g n a t i o n of this temp customer
	 */
	@AutoEscape
	public String getDESIGNATION();

	/**
	 * Sets the d e s i g n a t i o n of this temp customer.
	 *
	 * @param DESIGNATION the d e s i g n a t i o n of this temp customer
	 */
	public void setDESIGNATION(String DESIGNATION);

	/**
	 * Returns the d e p a r t m e n t of this temp customer.
	 *
	 * @return the d e p a r t m e n t of this temp customer
	 */
	@AutoEscape
	public String getDEPARTMENT();

	/**
	 * Sets the d e p a r t m e n t of this temp customer.
	 *
	 * @param DEPARTMENT the d e p a r t m e n t of this temp customer
	 */
	public void setDEPARTMENT(String DEPARTMENT);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_LINE_1();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_LINE_1 the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer
	 */
	public void setPRIMARY_ADDRESS_LINE_1(String PRIMARY_ADDRESS_LINE_1);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_LINE_2();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_LINE_2 the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer
	 */
	public void setPRIMARY_ADDRESS_LINE_2(String PRIMARY_ADDRESS_LINE_2);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_LINE_3();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_LINE_3 the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer
	 */
	public void setPRIMARY_ADDRESS_LINE_3(String PRIMARY_ADDRESS_LINE_3);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ c i t y of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ c i t y of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_CITY();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ c i t y of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_CITY the p r i m a r y_ a d d r e s s_ c i t y of this temp customer
	 */
	public void setPRIMARY_ADDRESS_CITY(String PRIMARY_ADDRESS_CITY);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_STATE();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_STATE the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer
	 */
	public void setPRIMARY_ADDRESS_STATE(String PRIMARY_ADDRESS_STATE);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer
	 */
	@AutoEscape
	public String getPRIMARY_ADDRESS_PINCODE();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_PINCODE the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer
	 */
	public void setPRIMARY_ADDRESS_PINCODE(String PRIMARY_ADDRESS_PINCODE);

	/**
	 * Returns the p h o n e_ n u m b e r_1 of this temp customer.
	 *
	 * @return the p h o n e_ n u m b e r_1 of this temp customer
	 */
	@AutoEscape
	public String getPHONE_NUMBER_1();

	/**
	 * Sets the p h o n e_ n u m b e r_1 of this temp customer.
	 *
	 * @param PHONE_NUMBER_1 the p h o n e_ n u m b e r_1 of this temp customer
	 */
	public void setPHONE_NUMBER_1(String PHONE_NUMBER_1);

	/**
	 * Returns the p h o n e_ n u m b e r_2 of this temp customer.
	 *
	 * @return the p h o n e_ n u m b e r_2 of this temp customer
	 */
	@AutoEscape
	public String getPHONE_NUMBER_2();

	/**
	 * Sets the p h o n e_ n u m b e r_2 of this temp customer.
	 *
	 * @param PHONE_NUMBER_2 the p h o n e_ n u m b e r_2 of this temp customer
	 */
	public void setPHONE_NUMBER_2(String PHONE_NUMBER_2);

	/**
	 * Returns the p h o n e_ n u m b e r_3 of this temp customer.
	 *
	 * @return the p h o n e_ n u m b e r_3 of this temp customer
	 */
	@AutoEscape
	public String getPHONE_NUMBER_3();

	/**
	 * Sets the p h o n e_ n u m b e r_3 of this temp customer.
	 *
	 * @param PHONE_NUMBER_3 the p h o n e_ n u m b e r_3 of this temp customer
	 */
	public void setPHONE_NUMBER_3(String PHONE_NUMBER_3);

	/**
	 * Returns the l o g i n_ n a m e of this temp customer.
	 *
	 * @return the l o g i n_ n a m e of this temp customer
	 */
	@AutoEscape
	public String getLOGIN_NAME();

	/**
	 * Sets the l o g i n_ n a m e of this temp customer.
	 *
	 * @param LOGIN_NAME the l o g i n_ n a m e of this temp customer
	 */
	public void setLOGIN_NAME(String LOGIN_NAME);

	/**
	 * Returns the g e n d e r of this temp customer.
	 *
	 * @return the g e n d e r of this temp customer
	 */
	@AutoEscape
	public String getGENDER();

	/**
	 * Sets the g e n d e r of this temp customer.
	 *
	 * @param GENDER the g e n d e r of this temp customer
	 */
	public void setGENDER(String GENDER);

	/**
	 * Returns the m a r i t a l_ s t a t u s of this temp customer.
	 *
	 * @return the m a r i t a l_ s t a t u s of this temp customer
	 */
	@AutoEscape
	public String getMARITAL_STATUS();

	/**
	 * Sets the m a r i t a l_ s t a t u s of this temp customer.
	 *
	 * @param MARITAL_STATUS the m a r i t a l_ s t a t u s of this temp customer
	 */
	public void setMARITAL_STATUS(String MARITAL_STATUS);

	/**
	 * Returns the c o u n t r y of this temp customer.
	 *
	 * @return the c o u n t r y of this temp customer
	 */
	@AutoEscape
	public String getCOUNTRY();

	/**
	 * Sets the c o u n t r y of this temp customer.
	 *
	 * @param COUNTRY the c o u n t r y of this temp customer
	 */
	public void setCOUNTRY(String COUNTRY);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer
	 */
	public int getPRIMARY_ADDRESS_STATE_ID();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_STATE_ID the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer
	 */
	public void setPRIMARY_ADDRESS_STATE_ID(int PRIMARY_ADDRESS_STATE_ID);

	/**
	 * Returns the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer.
	 *
	 * @return the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer
	 */
	public int getPRIMARY_ADDRESS_CITY_ID();

	/**
	 * Sets the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer.
	 *
	 * @param PRIMARY_ADDRESS_CITY_ID the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer
	 */
	public void setPRIMARY_ADDRESS_CITY_ID(int PRIMARY_ADDRESS_CITY_ID);

	/**
	 * Returns the q r c_ a s r_ i d of this temp customer.
	 *
	 * @return the q r c_ a s r_ i d of this temp customer
	 */
	public int getQRC_ASR_ID();

	/**
	 * Sets the q r c_ a s r_ i d of this temp customer.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d of this temp customer
	 */
	public void setQRC_ASR_ID(int QRC_ASR_ID);

	/**
	 * Returns the p a n c a r d of this temp customer.
	 *
	 * @return the p a n c a r d of this temp customer
	 */
	@AutoEscape
	public String getPANCARD();

	/**
	 * Sets the p a n c a r d of this temp customer.
	 *
	 * @param PANCARD the p a n c a r d of this temp customer
	 */
	public void setPANCARD(String PANCARD);

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
	public int compareTo(TempCustomer tempCustomer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempCustomer> toCacheModel();

	@Override
	public TempCustomer toEscapedModel();

	@Override
	public TempCustomer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}