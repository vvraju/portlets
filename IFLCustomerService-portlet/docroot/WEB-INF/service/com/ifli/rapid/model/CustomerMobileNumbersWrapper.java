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
 * This class is a wrapper for {@link CustomerMobileNumbers}.
 * </p>
 *
 * @author Satya Kola
 * @see CustomerMobileNumbers
 * @generated
 */
public class CustomerMobileNumbersWrapper implements CustomerMobileNumbers,
	ModelWrapper<CustomerMobileNumbers> {
	public CustomerMobileNumbersWrapper(
		CustomerMobileNumbers customerMobileNumbers) {
		_customerMobileNumbers = customerMobileNumbers;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerMobileNumbers.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerMobileNumbers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("MOBILE_NUMBER", getMOBILE_NUMBER());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String MOBILE_NUMBER = (String)attributes.get("MOBILE_NUMBER");

		if (MOBILE_NUMBER != null) {
			setMOBILE_NUMBER(MOBILE_NUMBER);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	/**
	* Returns the primary key of this customer mobile numbers.
	*
	* @return the primary key of this customer mobile numbers
	*/
	@Override
	public int getPrimaryKey() {
		return _customerMobileNumbers.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer mobile numbers.
	*
	* @param primaryKey the primary key of this customer mobile numbers
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customerMobileNumbers.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this customer mobile numbers.
	*
	* @return the i d of this customer mobile numbers
	*/
	@Override
	public int getID() {
		return _customerMobileNumbers.getID();
	}

	/**
	* Sets the i d of this customer mobile numbers.
	*
	* @param ID the i d of this customer mobile numbers
	*/
	@Override
	public void setID(int ID) {
		_customerMobileNumbers.setID(ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer mobile numbers.
	*
	* @return the c u s t o m e r_ i d of this customer mobile numbers
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _customerMobileNumbers.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer mobile numbers.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer mobile numbers
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_customerMobileNumbers.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the m o b i l e_ n u m b e r of this customer mobile numbers.
	*
	* @return the m o b i l e_ n u m b e r of this customer mobile numbers
	*/
	@Override
	public java.lang.String getMOBILE_NUMBER() {
		return _customerMobileNumbers.getMOBILE_NUMBER();
	}

	/**
	* Sets the m o b i l e_ n u m b e r of this customer mobile numbers.
	*
	* @param MOBILE_NUMBER the m o b i l e_ n u m b e r of this customer mobile numbers
	*/
	@Override
	public void setMOBILE_NUMBER(java.lang.String MOBILE_NUMBER) {
		_customerMobileNumbers.setMOBILE_NUMBER(MOBILE_NUMBER);
	}

	/**
	* Returns the i n s e r t e d_ b y of this customer mobile numbers.
	*
	* @return the i n s e r t e d_ b y of this customer mobile numbers
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _customerMobileNumbers.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this customer mobile numbers.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this customer mobile numbers
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_customerMobileNumbers.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this customer mobile numbers.
	*
	* @return the i n s e r t e d_ d a t e of this customer mobile numbers
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _customerMobileNumbers.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this customer mobile numbers.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this customer mobile numbers
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_customerMobileNumbers.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this customer mobile numbers.
	*
	* @return the u p d a t e d_ b y of this customer mobile numbers
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _customerMobileNumbers.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this customer mobile numbers.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this customer mobile numbers
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_customerMobileNumbers.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this customer mobile numbers.
	*
	* @return the u p d a t e d_ d a t e of this customer mobile numbers
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _customerMobileNumbers.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this customer mobile numbers.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this customer mobile numbers
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_customerMobileNumbers.setUPDATED_DATE(UPDATED_DATE);
	}

	@Override
	public boolean isNew() {
		return _customerMobileNumbers.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerMobileNumbers.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerMobileNumbers.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerMobileNumbers.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerMobileNumbers.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerMobileNumbers.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerMobileNumbers.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerMobileNumbers.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerMobileNumbers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerMobileNumbers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerMobileNumbers.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerMobileNumbersWrapper((CustomerMobileNumbers)_customerMobileNumbers.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers) {
		return _customerMobileNumbers.compareTo(customerMobileNumbers);
	}

	@Override
	public int hashCode() {
		return _customerMobileNumbers.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.CustomerMobileNumbers> toCacheModel() {
		return _customerMobileNumbers.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers toEscapedModel() {
		return new CustomerMobileNumbersWrapper(_customerMobileNumbers.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers toUnescapedModel() {
		return new CustomerMobileNumbersWrapper(_customerMobileNumbers.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerMobileNumbers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerMobileNumbers.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerMobileNumbers.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerMobileNumbersWrapper)) {
			return false;
		}

		CustomerMobileNumbersWrapper customerMobileNumbersWrapper = (CustomerMobileNumbersWrapper)obj;

		if (Validator.equals(_customerMobileNumbers,
					customerMobileNumbersWrapper._customerMobileNumbers)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerMobileNumbers getWrappedCustomerMobileNumbers() {
		return _customerMobileNumbers;
	}

	@Override
	public CustomerMobileNumbers getWrappedModel() {
		return _customerMobileNumbers;
	}

	@Override
	public void resetOriginalValues() {
		_customerMobileNumbers.resetOriginalValues();
	}

	private CustomerMobileNumbers _customerMobileNumbers;
}