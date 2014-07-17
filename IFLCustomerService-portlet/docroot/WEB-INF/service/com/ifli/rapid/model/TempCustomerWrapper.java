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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempCustomer}.
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomer
 * @generated
 */
public class TempCustomerWrapper implements TempCustomer,
	ModelWrapper<TempCustomer> {
	public TempCustomerWrapper(TempCustomer tempCustomer) {
		_tempCustomer = tempCustomer;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCustomer.class;
	}

	@Override
	public String getModelClassName() {
		return TempCustomer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUSTOMER_SALUTATION", getCUSTOMER_SALUTATION());
		attributes.put("CUSTOMER_FIRST_NAME", getCUSTOMER_FIRST_NAME());
		attributes.put("CUSTOMER_LAST_NAME", getCUSTOMER_LAST_NAME());
		attributes.put("CUSTOMER_MIDDLE_NAME", getCUSTOMER_MIDDLE_NAME());
		attributes.put("CUSTOMER_DATE_OF_BIRTH", getCUSTOMER_DATE_OF_BIRTH());
		attributes.put("CUSTOMER_EMAIL_ADDR", getCUSTOMER_EMAIL_ADDR());
		attributes.put("OFFICE_NAME", getOFFICE_NAME());
		attributes.put("DESIGNATION", getDESIGNATION());
		attributes.put("DEPARTMENT", getDEPARTMENT());
		attributes.put("PRIMARY_ADDRESS_LINE_1", getPRIMARY_ADDRESS_LINE_1());
		attributes.put("PRIMARY_ADDRESS_LINE_2", getPRIMARY_ADDRESS_LINE_2());
		attributes.put("PRIMARY_ADDRESS_LINE_3", getPRIMARY_ADDRESS_LINE_3());
		attributes.put("PRIMARY_ADDRESS_CITY", getPRIMARY_ADDRESS_CITY());
		attributes.put("PRIMARY_ADDRESS_STATE", getPRIMARY_ADDRESS_STATE());
		attributes.put("PRIMARY_ADDRESS_PINCODE", getPRIMARY_ADDRESS_PINCODE());
		attributes.put("PHONE_NUMBER_1", getPHONE_NUMBER_1());
		attributes.put("PHONE_NUMBER_2", getPHONE_NUMBER_2());
		attributes.put("PHONE_NUMBER_3", getPHONE_NUMBER_3());
		attributes.put("LOGIN_NAME", getLOGIN_NAME());
		attributes.put("GENDER", getGENDER());
		attributes.put("MARITAL_STATUS", getMARITAL_STATUS());
		attributes.put("COUNTRY", getCOUNTRY());
		attributes.put("PRIMARY_ADDRESS_STATE_ID", getPRIMARY_ADDRESS_STATE_ID());
		attributes.put("PRIMARY_ADDRESS_CITY_ID", getPRIMARY_ADDRESS_CITY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("PANCARD", getPANCARD());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String CUSTOMER_SALUTATION = (String)attributes.get(
				"CUSTOMER_SALUTATION");

		if (CUSTOMER_SALUTATION != null) {
			setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
		}

		String CUSTOMER_FIRST_NAME = (String)attributes.get(
				"CUSTOMER_FIRST_NAME");

		if (CUSTOMER_FIRST_NAME != null) {
			setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
		}

		String CUSTOMER_LAST_NAME = (String)attributes.get("CUSTOMER_LAST_NAME");

		if (CUSTOMER_LAST_NAME != null) {
			setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
		}

		String CUSTOMER_MIDDLE_NAME = (String)attributes.get(
				"CUSTOMER_MIDDLE_NAME");

		if (CUSTOMER_MIDDLE_NAME != null) {
			setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
		}

		String CUSTOMER_DATE_OF_BIRTH = (String)attributes.get(
				"CUSTOMER_DATE_OF_BIRTH");

		if (CUSTOMER_DATE_OF_BIRTH != null) {
			setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
		}

		String CUSTOMER_EMAIL_ADDR = (String)attributes.get(
				"CUSTOMER_EMAIL_ADDR");

		if (CUSTOMER_EMAIL_ADDR != null) {
			setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
		}

		String OFFICE_NAME = (String)attributes.get("OFFICE_NAME");

		if (OFFICE_NAME != null) {
			setOFFICE_NAME(OFFICE_NAME);
		}

		String DESIGNATION = (String)attributes.get("DESIGNATION");

		if (DESIGNATION != null) {
			setDESIGNATION(DESIGNATION);
		}

		String DEPARTMENT = (String)attributes.get("DEPARTMENT");

		if (DEPARTMENT != null) {
			setDEPARTMENT(DEPARTMENT);
		}

		String PRIMARY_ADDRESS_LINE_1 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_1");

		if (PRIMARY_ADDRESS_LINE_1 != null) {
			setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
		}

		String PRIMARY_ADDRESS_LINE_2 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_2");

		if (PRIMARY_ADDRESS_LINE_2 != null) {
			setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
		}

		String PRIMARY_ADDRESS_LINE_3 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_3");

		if (PRIMARY_ADDRESS_LINE_3 != null) {
			setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
		}

		String PRIMARY_ADDRESS_CITY = (String)attributes.get(
				"PRIMARY_ADDRESS_CITY");

		if (PRIMARY_ADDRESS_CITY != null) {
			setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
		}

		String PRIMARY_ADDRESS_STATE = (String)attributes.get(
				"PRIMARY_ADDRESS_STATE");

		if (PRIMARY_ADDRESS_STATE != null) {
			setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
		}

		String PRIMARY_ADDRESS_PINCODE = (String)attributes.get(
				"PRIMARY_ADDRESS_PINCODE");

		if (PRIMARY_ADDRESS_PINCODE != null) {
			setPRIMARY_ADDRESS_PINCODE(PRIMARY_ADDRESS_PINCODE);
		}

		String PHONE_NUMBER_1 = (String)attributes.get("PHONE_NUMBER_1");

		if (PHONE_NUMBER_1 != null) {
			setPHONE_NUMBER_1(PHONE_NUMBER_1);
		}

		String PHONE_NUMBER_2 = (String)attributes.get("PHONE_NUMBER_2");

		if (PHONE_NUMBER_2 != null) {
			setPHONE_NUMBER_2(PHONE_NUMBER_2);
		}

		String PHONE_NUMBER_3 = (String)attributes.get("PHONE_NUMBER_3");

		if (PHONE_NUMBER_3 != null) {
			setPHONE_NUMBER_3(PHONE_NUMBER_3);
		}

		String LOGIN_NAME = (String)attributes.get("LOGIN_NAME");

		if (LOGIN_NAME != null) {
			setLOGIN_NAME(LOGIN_NAME);
		}

		String GENDER = (String)attributes.get("GENDER");

		if (GENDER != null) {
			setGENDER(GENDER);
		}

		String MARITAL_STATUS = (String)attributes.get("MARITAL_STATUS");

		if (MARITAL_STATUS != null) {
			setMARITAL_STATUS(MARITAL_STATUS);
		}

		String COUNTRY = (String)attributes.get("COUNTRY");

		if (COUNTRY != null) {
			setCOUNTRY(COUNTRY);
		}

		Integer PRIMARY_ADDRESS_STATE_ID = (Integer)attributes.get(
				"PRIMARY_ADDRESS_STATE_ID");

		if (PRIMARY_ADDRESS_STATE_ID != null) {
			setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
		}

		Integer PRIMARY_ADDRESS_CITY_ID = (Integer)attributes.get(
				"PRIMARY_ADDRESS_CITY_ID");

		if (PRIMARY_ADDRESS_CITY_ID != null) {
			setPRIMARY_ADDRESS_CITY_ID(PRIMARY_ADDRESS_CITY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String PANCARD = (String)attributes.get("PANCARD");

		if (PANCARD != null) {
			setPANCARD(PANCARD);
		}
	}

	/**
	* Returns the primary key of this temp customer.
	*
	* @return the primary key of this temp customer
	*/
	@Override
	public int getPrimaryKey() {
		return _tempCustomer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp customer.
	*
	* @param primaryKey the primary key of this temp customer
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_tempCustomer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c u s t o m e r_ i d of this temp customer.
	*
	* @return the c u s t o m e r_ i d of this temp customer
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _tempCustomer.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this temp customer.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this temp customer
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_tempCustomer.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the c u s t o m e r_ s a l u t a t i o n of this temp customer.
	*
	* @return the c u s t o m e r_ s a l u t a t i o n of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_SALUTATION() {
		return _tempCustomer.getCUSTOMER_SALUTATION();
	}

	/**
	* Sets the c u s t o m e r_ s a l u t a t i o n of this temp customer.
	*
	* @param CUSTOMER_SALUTATION the c u s t o m e r_ s a l u t a t i o n of this temp customer
	*/
	@Override
	public void setCUSTOMER_SALUTATION(java.lang.String CUSTOMER_SALUTATION) {
		_tempCustomer.setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
	}

	/**
	* Returns the c u s t o m e r_ f i r s t_ n a m e of this temp customer.
	*
	* @return the c u s t o m e r_ f i r s t_ n a m e of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_FIRST_NAME() {
		return _tempCustomer.getCUSTOMER_FIRST_NAME();
	}

	/**
	* Sets the c u s t o m e r_ f i r s t_ n a m e of this temp customer.
	*
	* @param CUSTOMER_FIRST_NAME the c u s t o m e r_ f i r s t_ n a m e of this temp customer
	*/
	@Override
	public void setCUSTOMER_FIRST_NAME(java.lang.String CUSTOMER_FIRST_NAME) {
		_tempCustomer.setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
	}

	/**
	* Returns the c u s t o m e r_ l a s t_ n a m e of this temp customer.
	*
	* @return the c u s t o m e r_ l a s t_ n a m e of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_LAST_NAME() {
		return _tempCustomer.getCUSTOMER_LAST_NAME();
	}

	/**
	* Sets the c u s t o m e r_ l a s t_ n a m e of this temp customer.
	*
	* @param CUSTOMER_LAST_NAME the c u s t o m e r_ l a s t_ n a m e of this temp customer
	*/
	@Override
	public void setCUSTOMER_LAST_NAME(java.lang.String CUSTOMER_LAST_NAME) {
		_tempCustomer.setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
	}

	/**
	* Returns the c u s t o m e r_ m i d d l e_ n a m e of this temp customer.
	*
	* @return the c u s t o m e r_ m i d d l e_ n a m e of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_MIDDLE_NAME() {
		return _tempCustomer.getCUSTOMER_MIDDLE_NAME();
	}

	/**
	* Sets the c u s t o m e r_ m i d d l e_ n a m e of this temp customer.
	*
	* @param CUSTOMER_MIDDLE_NAME the c u s t o m e r_ m i d d l e_ n a m e of this temp customer
	*/
	@Override
	public void setCUSTOMER_MIDDLE_NAME(java.lang.String CUSTOMER_MIDDLE_NAME) {
		_tempCustomer.setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
	}

	/**
	* Returns the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer.
	*
	* @return the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_DATE_OF_BIRTH() {
		return _tempCustomer.getCUSTOMER_DATE_OF_BIRTH();
	}

	/**
	* Sets the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer.
	*
	* @param CUSTOMER_DATE_OF_BIRTH the c u s t o m e r_ d a t e_ o f_ b i r t h of this temp customer
	*/
	@Override
	public void setCUSTOMER_DATE_OF_BIRTH(
		java.lang.String CUSTOMER_DATE_OF_BIRTH) {
		_tempCustomer.setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
	}

	/**
	* Returns the c u s t o m e r_ e m a i l_ a d d r of this temp customer.
	*
	* @return the c u s t o m e r_ e m a i l_ a d d r of this temp customer
	*/
	@Override
	public java.lang.String getCUSTOMER_EMAIL_ADDR() {
		return _tempCustomer.getCUSTOMER_EMAIL_ADDR();
	}

	/**
	* Sets the c u s t o m e r_ e m a i l_ a d d r of this temp customer.
	*
	* @param CUSTOMER_EMAIL_ADDR the c u s t o m e r_ e m a i l_ a d d r of this temp customer
	*/
	@Override
	public void setCUSTOMER_EMAIL_ADDR(java.lang.String CUSTOMER_EMAIL_ADDR) {
		_tempCustomer.setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
	}

	/**
	* Returns the o f f i c e_ n a m e of this temp customer.
	*
	* @return the o f f i c e_ n a m e of this temp customer
	*/
	@Override
	public java.lang.String getOFFICE_NAME() {
		return _tempCustomer.getOFFICE_NAME();
	}

	/**
	* Sets the o f f i c e_ n a m e of this temp customer.
	*
	* @param OFFICE_NAME the o f f i c e_ n a m e of this temp customer
	*/
	@Override
	public void setOFFICE_NAME(java.lang.String OFFICE_NAME) {
		_tempCustomer.setOFFICE_NAME(OFFICE_NAME);
	}

	/**
	* Returns the d e s i g n a t i o n of this temp customer.
	*
	* @return the d e s i g n a t i o n of this temp customer
	*/
	@Override
	public java.lang.String getDESIGNATION() {
		return _tempCustomer.getDESIGNATION();
	}

	/**
	* Sets the d e s i g n a t i o n of this temp customer.
	*
	* @param DESIGNATION the d e s i g n a t i o n of this temp customer
	*/
	@Override
	public void setDESIGNATION(java.lang.String DESIGNATION) {
		_tempCustomer.setDESIGNATION(DESIGNATION);
	}

	/**
	* Returns the d e p a r t m e n t of this temp customer.
	*
	* @return the d e p a r t m e n t of this temp customer
	*/
	@Override
	public java.lang.String getDEPARTMENT() {
		return _tempCustomer.getDEPARTMENT();
	}

	/**
	* Sets the d e p a r t m e n t of this temp customer.
	*
	* @param DEPARTMENT the d e p a r t m e n t of this temp customer
	*/
	@Override
	public void setDEPARTMENT(java.lang.String DEPARTMENT) {
		_tempCustomer.setDEPARTMENT(DEPARTMENT);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_1() {
		return _tempCustomer.getPRIMARY_ADDRESS_LINE_1();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer.
	*
	* @param PRIMARY_ADDRESS_LINE_1 the p r i m a r y_ a d d r e s s_ l i n e_1 of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_1(
		java.lang.String PRIMARY_ADDRESS_LINE_1) {
		_tempCustomer.setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_2() {
		return _tempCustomer.getPRIMARY_ADDRESS_LINE_2();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer.
	*
	* @param PRIMARY_ADDRESS_LINE_2 the p r i m a r y_ a d d r e s s_ l i n e_2 of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_2(
		java.lang.String PRIMARY_ADDRESS_LINE_2) {
		_tempCustomer.setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_3() {
		return _tempCustomer.getPRIMARY_ADDRESS_LINE_3();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer.
	*
	* @param PRIMARY_ADDRESS_LINE_3 the p r i m a r y_ a d d r e s s_ l i n e_3 of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_3(
		java.lang.String PRIMARY_ADDRESS_LINE_3) {
		_tempCustomer.setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ c i t y of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ c i t y of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_CITY() {
		return _tempCustomer.getPRIMARY_ADDRESS_CITY();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ c i t y of this temp customer.
	*
	* @param PRIMARY_ADDRESS_CITY the p r i m a r y_ a d d r e s s_ c i t y of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_CITY(java.lang.String PRIMARY_ADDRESS_CITY) {
		_tempCustomer.setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_STATE() {
		return _tempCustomer.getPRIMARY_ADDRESS_STATE();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer.
	*
	* @param PRIMARY_ADDRESS_STATE the p r i m a r y_ a d d r e s s_ s t a t e of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_STATE(java.lang.String PRIMARY_ADDRESS_STATE) {
		_tempCustomer.setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_PINCODE() {
		return _tempCustomer.getPRIMARY_ADDRESS_PINCODE();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer.
	*
	* @param PRIMARY_ADDRESS_PINCODE the p r i m a r y_ a d d r e s s_ p i n c o d e of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_PINCODE(
		java.lang.String PRIMARY_ADDRESS_PINCODE) {
		_tempCustomer.setPRIMARY_ADDRESS_PINCODE(PRIMARY_ADDRESS_PINCODE);
	}

	/**
	* Returns the p h o n e_ n u m b e r_1 of this temp customer.
	*
	* @return the p h o n e_ n u m b e r_1 of this temp customer
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_1() {
		return _tempCustomer.getPHONE_NUMBER_1();
	}

	/**
	* Sets the p h o n e_ n u m b e r_1 of this temp customer.
	*
	* @param PHONE_NUMBER_1 the p h o n e_ n u m b e r_1 of this temp customer
	*/
	@Override
	public void setPHONE_NUMBER_1(java.lang.String PHONE_NUMBER_1) {
		_tempCustomer.setPHONE_NUMBER_1(PHONE_NUMBER_1);
	}

	/**
	* Returns the p h o n e_ n u m b e r_2 of this temp customer.
	*
	* @return the p h o n e_ n u m b e r_2 of this temp customer
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_2() {
		return _tempCustomer.getPHONE_NUMBER_2();
	}

	/**
	* Sets the p h o n e_ n u m b e r_2 of this temp customer.
	*
	* @param PHONE_NUMBER_2 the p h o n e_ n u m b e r_2 of this temp customer
	*/
	@Override
	public void setPHONE_NUMBER_2(java.lang.String PHONE_NUMBER_2) {
		_tempCustomer.setPHONE_NUMBER_2(PHONE_NUMBER_2);
	}

	/**
	* Returns the p h o n e_ n u m b e r_3 of this temp customer.
	*
	* @return the p h o n e_ n u m b e r_3 of this temp customer
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_3() {
		return _tempCustomer.getPHONE_NUMBER_3();
	}

	/**
	* Sets the p h o n e_ n u m b e r_3 of this temp customer.
	*
	* @param PHONE_NUMBER_3 the p h o n e_ n u m b e r_3 of this temp customer
	*/
	@Override
	public void setPHONE_NUMBER_3(java.lang.String PHONE_NUMBER_3) {
		_tempCustomer.setPHONE_NUMBER_3(PHONE_NUMBER_3);
	}

	/**
	* Returns the l o g i n_ n a m e of this temp customer.
	*
	* @return the l o g i n_ n a m e of this temp customer
	*/
	@Override
	public java.lang.String getLOGIN_NAME() {
		return _tempCustomer.getLOGIN_NAME();
	}

	/**
	* Sets the l o g i n_ n a m e of this temp customer.
	*
	* @param LOGIN_NAME the l o g i n_ n a m e of this temp customer
	*/
	@Override
	public void setLOGIN_NAME(java.lang.String LOGIN_NAME) {
		_tempCustomer.setLOGIN_NAME(LOGIN_NAME);
	}

	/**
	* Returns the g e n d e r of this temp customer.
	*
	* @return the g e n d e r of this temp customer
	*/
	@Override
	public java.lang.String getGENDER() {
		return _tempCustomer.getGENDER();
	}

	/**
	* Sets the g e n d e r of this temp customer.
	*
	* @param GENDER the g e n d e r of this temp customer
	*/
	@Override
	public void setGENDER(java.lang.String GENDER) {
		_tempCustomer.setGENDER(GENDER);
	}

	/**
	* Returns the m a r i t a l_ s t a t u s of this temp customer.
	*
	* @return the m a r i t a l_ s t a t u s of this temp customer
	*/
	@Override
	public java.lang.String getMARITAL_STATUS() {
		return _tempCustomer.getMARITAL_STATUS();
	}

	/**
	* Sets the m a r i t a l_ s t a t u s of this temp customer.
	*
	* @param MARITAL_STATUS the m a r i t a l_ s t a t u s of this temp customer
	*/
	@Override
	public void setMARITAL_STATUS(java.lang.String MARITAL_STATUS) {
		_tempCustomer.setMARITAL_STATUS(MARITAL_STATUS);
	}

	/**
	* Returns the c o u n t r y of this temp customer.
	*
	* @return the c o u n t r y of this temp customer
	*/
	@Override
	public java.lang.String getCOUNTRY() {
		return _tempCustomer.getCOUNTRY();
	}

	/**
	* Sets the c o u n t r y of this temp customer.
	*
	* @param COUNTRY the c o u n t r y of this temp customer
	*/
	@Override
	public void setCOUNTRY(java.lang.String COUNTRY) {
		_tempCustomer.setCOUNTRY(COUNTRY);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer
	*/
	@Override
	public int getPRIMARY_ADDRESS_STATE_ID() {
		return _tempCustomer.getPRIMARY_ADDRESS_STATE_ID();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer.
	*
	* @param PRIMARY_ADDRESS_STATE_ID the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_STATE_ID(int PRIMARY_ADDRESS_STATE_ID) {
		_tempCustomer.setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer.
	*
	* @return the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer
	*/
	@Override
	public int getPRIMARY_ADDRESS_CITY_ID() {
		return _tempCustomer.getPRIMARY_ADDRESS_CITY_ID();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer.
	*
	* @param PRIMARY_ADDRESS_CITY_ID the p r i m a r y_ a d d r e s s_ c i t y_ i d of this temp customer
	*/
	@Override
	public void setPRIMARY_ADDRESS_CITY_ID(int PRIMARY_ADDRESS_CITY_ID) {
		_tempCustomer.setPRIMARY_ADDRESS_CITY_ID(PRIMARY_ADDRESS_CITY_ID);
	}

	/**
	* Returns the q r c_ a s r_ i d of this temp customer.
	*
	* @return the q r c_ a s r_ i d of this temp customer
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _tempCustomer.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this temp customer.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this temp customer
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_tempCustomer.setQRC_ASR_ID(QRC_ASR_ID);
	}

	/**
	* Returns the p a n c a r d of this temp customer.
	*
	* @return the p a n c a r d of this temp customer
	*/
	@Override
	public java.lang.String getPANCARD() {
		return _tempCustomer.getPANCARD();
	}

	/**
	* Sets the p a n c a r d of this temp customer.
	*
	* @param PANCARD the p a n c a r d of this temp customer
	*/
	@Override
	public void setPANCARD(java.lang.String PANCARD) {
		_tempCustomer.setPANCARD(PANCARD);
	}

	@Override
	public boolean isNew() {
		return _tempCustomer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCustomer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCustomer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCustomer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCustomer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCustomer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCustomer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCustomer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCustomer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCustomer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCustomer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCustomerWrapper((TempCustomer)_tempCustomer.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.TempCustomer tempCustomer) {
		return _tempCustomer.compareTo(tempCustomer);
	}

	@Override
	public int hashCode() {
		return _tempCustomer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.TempCustomer> toCacheModel() {
		return _tempCustomer.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.TempCustomer toEscapedModel() {
		return new TempCustomerWrapper(_tempCustomer.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.TempCustomer toUnescapedModel() {
		return new TempCustomerWrapper(_tempCustomer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCustomer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCustomer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCustomer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCustomerWrapper)) {
			return false;
		}

		TempCustomerWrapper tempCustomerWrapper = (TempCustomerWrapper)obj;

		if (Validator.equals(_tempCustomer, tempCustomerWrapper._tempCustomer)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCustomer getWrappedTempCustomer() {
		return _tempCustomer;
	}

	@Override
	public TempCustomer getWrappedModel() {
		return _tempCustomer;
	}

	@Override
	public void resetOriginalValues() {
		_tempCustomer.resetOriginalValues();
	}

	private TempCustomer _tempCustomer;
}