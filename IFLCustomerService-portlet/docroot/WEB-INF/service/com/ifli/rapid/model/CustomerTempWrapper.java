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
 * This class is a wrapper for {@link CustomerTemp}.
 * </p>
 *
 * @author Satya Kola
 * @see CustomerTemp
 * @generated
 */
public class CustomerTempWrapper implements CustomerTemp,
	ModelWrapper<CustomerTemp> {
	public CustomerTempWrapper(CustomerTemp customerTemp) {
		_customerTemp = customerTemp;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerTemp.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerTemp.class.getName();
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
		attributes.put("PRIMARY_ADDRESS_LINE_1", getPRIMARY_ADDRESS_LINE_1());
		attributes.put("PRIMARY_ADDRESS_LINE_2", getPRIMARY_ADDRESS_LINE_2());
		attributes.put("PRIMARY_ADDRESS_LINE_3", getPRIMARY_ADDRESS_LINE_3());
		attributes.put("PRIMARY_ADDRESS_CITY", getPRIMARY_ADDRESS_CITY());
		attributes.put("PRIMARY_ADDRESS_STATE", getPRIMARY_ADDRESS_STATE());
		attributes.put("PIMARY_ADDRESS_PINCODE", getPIMARY_ADDRESS_PINCODE());
		attributes.put("PHONE_NUMBER_1", getPHONE_NUMBER_1());
		attributes.put("PHONE_NUMBER_2", getPHONE_NUMBER_2());
		attributes.put("PHONE_NUMBER_3", getPHONE_NUMBER_3());
		attributes.put("LOGIN_NAME", getLOGIN_NAME());
		attributes.put("GENDER", getGENDER());
		attributes.put("MARITAL_STATUS", getMARITAL_STATUS());
		attributes.put("COUNTRY", getCOUNTRY());
		attributes.put("PRIMARY_ADDRESS_STATE_ID", getPRIMARY_ADDRESS_STATE_ID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

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

		Integer PIMARY_ADDRESS_PINCODE = (Integer)attributes.get(
				"PIMARY_ADDRESS_PINCODE");

		if (PIMARY_ADDRESS_PINCODE != null) {
			setPIMARY_ADDRESS_PINCODE(PIMARY_ADDRESS_PINCODE);
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
	}

	/**
	* Returns the primary key of this customer temp.
	*
	* @return the primary key of this customer temp
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _customerTemp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer temp.
	*
	* @param primaryKey the primary key of this customer temp
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_customerTemp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer temp.
	*
	* @return the c u s t o m e r_ i d of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_ID() {
		return _customerTemp.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer temp.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer temp
	*/
	@Override
	public void setCUSTOMER_ID(java.lang.String CUSTOMER_ID) {
		_customerTemp.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the c u s t o m e r_ s a l u t a t i o n of this customer temp.
	*
	* @return the c u s t o m e r_ s a l u t a t i o n of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_SALUTATION() {
		return _customerTemp.getCUSTOMER_SALUTATION();
	}

	/**
	* Sets the c u s t o m e r_ s a l u t a t i o n of this customer temp.
	*
	* @param CUSTOMER_SALUTATION the c u s t o m e r_ s a l u t a t i o n of this customer temp
	*/
	@Override
	public void setCUSTOMER_SALUTATION(java.lang.String CUSTOMER_SALUTATION) {
		_customerTemp.setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
	}

	/**
	* Returns the c u s t o m e r_ f i r s t_ n a m e of this customer temp.
	*
	* @return the c u s t o m e r_ f i r s t_ n a m e of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_FIRST_NAME() {
		return _customerTemp.getCUSTOMER_FIRST_NAME();
	}

	/**
	* Sets the c u s t o m e r_ f i r s t_ n a m e of this customer temp.
	*
	* @param CUSTOMER_FIRST_NAME the c u s t o m e r_ f i r s t_ n a m e of this customer temp
	*/
	@Override
	public void setCUSTOMER_FIRST_NAME(java.lang.String CUSTOMER_FIRST_NAME) {
		_customerTemp.setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
	}

	/**
	* Returns the c u s t o m e r_ l a s t_ n a m e of this customer temp.
	*
	* @return the c u s t o m e r_ l a s t_ n a m e of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_LAST_NAME() {
		return _customerTemp.getCUSTOMER_LAST_NAME();
	}

	/**
	* Sets the c u s t o m e r_ l a s t_ n a m e of this customer temp.
	*
	* @param CUSTOMER_LAST_NAME the c u s t o m e r_ l a s t_ n a m e of this customer temp
	*/
	@Override
	public void setCUSTOMER_LAST_NAME(java.lang.String CUSTOMER_LAST_NAME) {
		_customerTemp.setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
	}

	/**
	* Returns the c u s t o m e r_ m i d d l e_ n a m e of this customer temp.
	*
	* @return the c u s t o m e r_ m i d d l e_ n a m e of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_MIDDLE_NAME() {
		return _customerTemp.getCUSTOMER_MIDDLE_NAME();
	}

	/**
	* Sets the c u s t o m e r_ m i d d l e_ n a m e of this customer temp.
	*
	* @param CUSTOMER_MIDDLE_NAME the c u s t o m e r_ m i d d l e_ n a m e of this customer temp
	*/
	@Override
	public void setCUSTOMER_MIDDLE_NAME(java.lang.String CUSTOMER_MIDDLE_NAME) {
		_customerTemp.setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
	}

	/**
	* Returns the c u s t o m e r_ d a t e_ o f_ b i r t h of this customer temp.
	*
	* @return the c u s t o m e r_ d a t e_ o f_ b i r t h of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_DATE_OF_BIRTH() {
		return _customerTemp.getCUSTOMER_DATE_OF_BIRTH();
	}

	/**
	* Sets the c u s t o m e r_ d a t e_ o f_ b i r t h of this customer temp.
	*
	* @param CUSTOMER_DATE_OF_BIRTH the c u s t o m e r_ d a t e_ o f_ b i r t h of this customer temp
	*/
	@Override
	public void setCUSTOMER_DATE_OF_BIRTH(
		java.lang.String CUSTOMER_DATE_OF_BIRTH) {
		_customerTemp.setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
	}

	/**
	* Returns the c u s t o m e r_ e m a i l_ a d d r of this customer temp.
	*
	* @return the c u s t o m e r_ e m a i l_ a d d r of this customer temp
	*/
	@Override
	public java.lang.String getCUSTOMER_EMAIL_ADDR() {
		return _customerTemp.getCUSTOMER_EMAIL_ADDR();
	}

	/**
	* Sets the c u s t o m e r_ e m a i l_ a d d r of this customer temp.
	*
	* @param CUSTOMER_EMAIL_ADDR the c u s t o m e r_ e m a i l_ a d d r of this customer temp
	*/
	@Override
	public void setCUSTOMER_EMAIL_ADDR(java.lang.String CUSTOMER_EMAIL_ADDR) {
		_customerTemp.setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_1 of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_1 of this customer temp
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_1() {
		return _customerTemp.getPRIMARY_ADDRESS_LINE_1();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_1 of this customer temp.
	*
	* @param PRIMARY_ADDRESS_LINE_1 the p r i m a r y_ a d d r e s s_ l i n e_1 of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_1(
		java.lang.String PRIMARY_ADDRESS_LINE_1) {
		_customerTemp.setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_2 of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_2 of this customer temp
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_2() {
		return _customerTemp.getPRIMARY_ADDRESS_LINE_2();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_2 of this customer temp.
	*
	* @param PRIMARY_ADDRESS_LINE_2 the p r i m a r y_ a d d r e s s_ l i n e_2 of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_2(
		java.lang.String PRIMARY_ADDRESS_LINE_2) {
		_customerTemp.setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ l i n e_3 of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ l i n e_3 of this customer temp
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_LINE_3() {
		return _customerTemp.getPRIMARY_ADDRESS_LINE_3();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ l i n e_3 of this customer temp.
	*
	* @param PRIMARY_ADDRESS_LINE_3 the p r i m a r y_ a d d r e s s_ l i n e_3 of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_LINE_3(
		java.lang.String PRIMARY_ADDRESS_LINE_3) {
		_customerTemp.setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ c i t y of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ c i t y of this customer temp
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_CITY() {
		return _customerTemp.getPRIMARY_ADDRESS_CITY();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ c i t y of this customer temp.
	*
	* @param PRIMARY_ADDRESS_CITY the p r i m a r y_ a d d r e s s_ c i t y of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_CITY(java.lang.String PRIMARY_ADDRESS_CITY) {
		_customerTemp.setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ s t a t e of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ s t a t e of this customer temp
	*/
	@Override
	public java.lang.String getPRIMARY_ADDRESS_STATE() {
		return _customerTemp.getPRIMARY_ADDRESS_STATE();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ s t a t e of this customer temp.
	*
	* @param PRIMARY_ADDRESS_STATE the p r i m a r y_ a d d r e s s_ s t a t e of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_STATE(java.lang.String PRIMARY_ADDRESS_STATE) {
		_customerTemp.setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
	}

	/**
	* Returns the p i m a r y_ a d d r e s s_ p i n c o d e of this customer temp.
	*
	* @return the p i m a r y_ a d d r e s s_ p i n c o d e of this customer temp
	*/
	@Override
	public int getPIMARY_ADDRESS_PINCODE() {
		return _customerTemp.getPIMARY_ADDRESS_PINCODE();
	}

	/**
	* Sets the p i m a r y_ a d d r e s s_ p i n c o d e of this customer temp.
	*
	* @param PIMARY_ADDRESS_PINCODE the p i m a r y_ a d d r e s s_ p i n c o d e of this customer temp
	*/
	@Override
	public void setPIMARY_ADDRESS_PINCODE(int PIMARY_ADDRESS_PINCODE) {
		_customerTemp.setPIMARY_ADDRESS_PINCODE(PIMARY_ADDRESS_PINCODE);
	}

	/**
	* Returns the p h o n e_ n u m b e r_1 of this customer temp.
	*
	* @return the p h o n e_ n u m b e r_1 of this customer temp
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_1() {
		return _customerTemp.getPHONE_NUMBER_1();
	}

	/**
	* Sets the p h o n e_ n u m b e r_1 of this customer temp.
	*
	* @param PHONE_NUMBER_1 the p h o n e_ n u m b e r_1 of this customer temp
	*/
	@Override
	public void setPHONE_NUMBER_1(java.lang.String PHONE_NUMBER_1) {
		_customerTemp.setPHONE_NUMBER_1(PHONE_NUMBER_1);
	}

	/**
	* Returns the p h o n e_ n u m b e r_2 of this customer temp.
	*
	* @return the p h o n e_ n u m b e r_2 of this customer temp
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_2() {
		return _customerTemp.getPHONE_NUMBER_2();
	}

	/**
	* Sets the p h o n e_ n u m b e r_2 of this customer temp.
	*
	* @param PHONE_NUMBER_2 the p h o n e_ n u m b e r_2 of this customer temp
	*/
	@Override
	public void setPHONE_NUMBER_2(java.lang.String PHONE_NUMBER_2) {
		_customerTemp.setPHONE_NUMBER_2(PHONE_NUMBER_2);
	}

	/**
	* Returns the p h o n e_ n u m b e r_3 of this customer temp.
	*
	* @return the p h o n e_ n u m b e r_3 of this customer temp
	*/
	@Override
	public java.lang.String getPHONE_NUMBER_3() {
		return _customerTemp.getPHONE_NUMBER_3();
	}

	/**
	* Sets the p h o n e_ n u m b e r_3 of this customer temp.
	*
	* @param PHONE_NUMBER_3 the p h o n e_ n u m b e r_3 of this customer temp
	*/
	@Override
	public void setPHONE_NUMBER_3(java.lang.String PHONE_NUMBER_3) {
		_customerTemp.setPHONE_NUMBER_3(PHONE_NUMBER_3);
	}

	/**
	* Returns the l o g i n_ n a m e of this customer temp.
	*
	* @return the l o g i n_ n a m e of this customer temp
	*/
	@Override
	public java.lang.String getLOGIN_NAME() {
		return _customerTemp.getLOGIN_NAME();
	}

	/**
	* Sets the l o g i n_ n a m e of this customer temp.
	*
	* @param LOGIN_NAME the l o g i n_ n a m e of this customer temp
	*/
	@Override
	public void setLOGIN_NAME(java.lang.String LOGIN_NAME) {
		_customerTemp.setLOGIN_NAME(LOGIN_NAME);
	}

	/**
	* Returns the g e n d e r of this customer temp.
	*
	* @return the g e n d e r of this customer temp
	*/
	@Override
	public java.lang.String getGENDER() {
		return _customerTemp.getGENDER();
	}

	/**
	* Sets the g e n d e r of this customer temp.
	*
	* @param GENDER the g e n d e r of this customer temp
	*/
	@Override
	public void setGENDER(java.lang.String GENDER) {
		_customerTemp.setGENDER(GENDER);
	}

	/**
	* Returns the m a r i t a l_ s t a t u s of this customer temp.
	*
	* @return the m a r i t a l_ s t a t u s of this customer temp
	*/
	@Override
	public java.lang.String getMARITAL_STATUS() {
		return _customerTemp.getMARITAL_STATUS();
	}

	/**
	* Sets the m a r i t a l_ s t a t u s of this customer temp.
	*
	* @param MARITAL_STATUS the m a r i t a l_ s t a t u s of this customer temp
	*/
	@Override
	public void setMARITAL_STATUS(java.lang.String MARITAL_STATUS) {
		_customerTemp.setMARITAL_STATUS(MARITAL_STATUS);
	}

	/**
	* Returns the c o u n t r y of this customer temp.
	*
	* @return the c o u n t r y of this customer temp
	*/
	@Override
	public java.lang.String getCOUNTRY() {
		return _customerTemp.getCOUNTRY();
	}

	/**
	* Sets the c o u n t r y of this customer temp.
	*
	* @param COUNTRY the c o u n t r y of this customer temp
	*/
	@Override
	public void setCOUNTRY(java.lang.String COUNTRY) {
		_customerTemp.setCOUNTRY(COUNTRY);
	}

	/**
	* Returns the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this customer temp.
	*
	* @return the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this customer temp
	*/
	@Override
	public int getPRIMARY_ADDRESS_STATE_ID() {
		return _customerTemp.getPRIMARY_ADDRESS_STATE_ID();
	}

	/**
	* Sets the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this customer temp.
	*
	* @param PRIMARY_ADDRESS_STATE_ID the p r i m a r y_ a d d r e s s_ s t a t e_ i d of this customer temp
	*/
	@Override
	public void setPRIMARY_ADDRESS_STATE_ID(int PRIMARY_ADDRESS_STATE_ID) {
		_customerTemp.setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
	}

	@Override
	public boolean isNew() {
		return _customerTemp.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerTemp.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerTemp.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerTemp.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerTemp.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerTemp.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerTemp.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerTemp.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerTemp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerTemp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerTemp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerTempWrapper((CustomerTemp)_customerTemp.clone());
	}

	@Override
	public int compareTo(CustomerTemp customerTemp) {
		return _customerTemp.compareTo(customerTemp);
	}

	@Override
	public int hashCode() {
		return _customerTemp.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CustomerTemp> toCacheModel() {
		return _customerTemp.toCacheModel();
	}

	@Override
	public CustomerTemp toEscapedModel() {
		return new CustomerTempWrapper(_customerTemp.toEscapedModel());
	}

	@Override
	public CustomerTemp toUnescapedModel() {
		return new CustomerTempWrapper(_customerTemp.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerTemp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerTemp.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerTemp.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerTempWrapper)) {
			return false;
		}

		CustomerTempWrapper customerTempWrapper = (CustomerTempWrapper)obj;

		if (Validator.equals(_customerTemp, customerTempWrapper._customerTemp)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerTemp getWrappedCustomerTemp() {
		return _customerTemp;
	}

	@Override
	public CustomerTemp getWrappedModel() {
		return _customerTemp;
	}

	@Override
	public void resetOriginalValues() {
		_customerTemp.resetOriginalValues();
	}

	private CustomerTemp _customerTemp;
}