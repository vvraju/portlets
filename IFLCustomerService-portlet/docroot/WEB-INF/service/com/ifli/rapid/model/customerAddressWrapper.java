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
 * This class is a wrapper for {@link customerAddress}.
 * </p>
 *
 * @author Satya Kola
 * @see customerAddress
 * @generated
 */
public class customerAddressWrapper implements customerAddress,
	ModelWrapper<customerAddress> {
	public customerAddressWrapper(customerAddress customerAddress) {
		_customerAddress = customerAddress;
	}

	@Override
	public Class<?> getModelClass() {
		return customerAddress.class;
	}

	@Override
	public String getModelClassName() {
		return customerAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ADDRESS_ID", getCUSTOMER_ADDRESS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("ADDRESS_LINE_1", getADDRESS_LINE_1());
		attributes.put("ADDRESS_LINE_2", getADDRESS_LINE_2());
		attributes.put("ADDRESS_LINE_3", getADDRESS_LINE_3());
		attributes.put("CHANGE_REQUEST_TYPE", getCHANGE_REQUEST_TYPE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("PIN_CODE", getPIN_CODE());
		attributes.put("CHANGE_REQUEST_FOR", getCHANGE_REQUEST_FOR());
		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("ADDR_STATUS", getADDR_STATUS());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ADDRESS_ID = (Integer)attributes.get(
				"CUSTOMER_ADDRESS_ID");

		if (CUSTOMER_ADDRESS_ID != null) {
			setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String ADDRESS_LINE_1 = (String)attributes.get("ADDRESS_LINE_1");

		if (ADDRESS_LINE_1 != null) {
			setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		String ADDRESS_LINE_2 = (String)attributes.get("ADDRESS_LINE_2");

		if (ADDRESS_LINE_2 != null) {
			setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		String ADDRESS_LINE_3 = (String)attributes.get("ADDRESS_LINE_3");

		if (ADDRESS_LINE_3 != null) {
			setADDRESS_LINE_3(ADDRESS_LINE_3);
		}

		String CHANGE_REQUEST_TYPE = (String)attributes.get(
				"CHANGE_REQUEST_TYPE");

		if (CHANGE_REQUEST_TYPE != null) {
			setCHANGE_REQUEST_TYPE(CHANGE_REQUEST_TYPE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String PIN_CODE = (String)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}

		Integer CHANGE_REQUEST_FOR = (Integer)attributes.get(
				"CHANGE_REQUEST_FOR");

		if (CHANGE_REQUEST_FOR != null) {
			setCHANGE_REQUEST_FOR(CHANGE_REQUEST_FOR);
		}

		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		String ADDR_STATUS = (String)attributes.get("ADDR_STATUS");

		if (ADDR_STATUS != null) {
			setADDR_STATUS(ADDR_STATUS);
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
	* Returns the primary key of this customer address.
	*
	* @return the primary key of this customer address
	*/
	@Override
	public int getPrimaryKey() {
		return _customerAddress.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer address.
	*
	* @param primaryKey the primary key of this customer address
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customerAddress.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c u s t o m e r_ a d d r e s s_ i d of this customer address.
	*
	* @return the c u s t o m e r_ a d d r e s s_ i d of this customer address
	*/
	@Override
	public int getCUSTOMER_ADDRESS_ID() {
		return _customerAddress.getCUSTOMER_ADDRESS_ID();
	}

	/**
	* Sets the c u s t o m e r_ a d d r e s s_ i d of this customer address.
	*
	* @param CUSTOMER_ADDRESS_ID the c u s t o m e r_ a d d r e s s_ i d of this customer address
	*/
	@Override
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_customerAddress.setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer address.
	*
	* @return the c u s t o m e r_ i d of this customer address
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _customerAddress.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer address.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer address
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_customerAddress.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the a d d r e s s_ l i n e_1 of this customer address.
	*
	* @return the a d d r e s s_ l i n e_1 of this customer address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_1() {
		return _customerAddress.getADDRESS_LINE_1();
	}

	/**
	* Sets the a d d r e s s_ l i n e_1 of this customer address.
	*
	* @param ADDRESS_LINE_1 the a d d r e s s_ l i n e_1 of this customer address
	*/
	@Override
	public void setADDRESS_LINE_1(java.lang.String ADDRESS_LINE_1) {
		_customerAddress.setADDRESS_LINE_1(ADDRESS_LINE_1);
	}

	/**
	* Returns the a d d r e s s_ l i n e_2 of this customer address.
	*
	* @return the a d d r e s s_ l i n e_2 of this customer address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_2() {
		return _customerAddress.getADDRESS_LINE_2();
	}

	/**
	* Sets the a d d r e s s_ l i n e_2 of this customer address.
	*
	* @param ADDRESS_LINE_2 the a d d r e s s_ l i n e_2 of this customer address
	*/
	@Override
	public void setADDRESS_LINE_2(java.lang.String ADDRESS_LINE_2) {
		_customerAddress.setADDRESS_LINE_2(ADDRESS_LINE_2);
	}

	/**
	* Returns the a d d r e s s_ l i n e_3 of this customer address.
	*
	* @return the a d d r e s s_ l i n e_3 of this customer address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_3() {
		return _customerAddress.getADDRESS_LINE_3();
	}

	/**
	* Sets the a d d r e s s_ l i n e_3 of this customer address.
	*
	* @param ADDRESS_LINE_3 the a d d r e s s_ l i n e_3 of this customer address
	*/
	@Override
	public void setADDRESS_LINE_3(java.lang.String ADDRESS_LINE_3) {
		_customerAddress.setADDRESS_LINE_3(ADDRESS_LINE_3);
	}

	/**
	* Returns the c h a n g e_ r e q u e s t_ t y p e of this customer address.
	*
	* @return the c h a n g e_ r e q u e s t_ t y p e of this customer address
	*/
	@Override
	public java.lang.String getCHANGE_REQUEST_TYPE() {
		return _customerAddress.getCHANGE_REQUEST_TYPE();
	}

	/**
	* Sets the c h a n g e_ r e q u e s t_ t y p e of this customer address.
	*
	* @param CHANGE_REQUEST_TYPE the c h a n g e_ r e q u e s t_ t y p e of this customer address
	*/
	@Override
	public void setCHANGE_REQUEST_TYPE(java.lang.String CHANGE_REQUEST_TYPE) {
		_customerAddress.setCHANGE_REQUEST_TYPE(CHANGE_REQUEST_TYPE);
	}

	/**
	* Returns the c i t y of this customer address.
	*
	* @return the c i t y of this customer address
	*/
	@Override
	public java.lang.String getCITY() {
		return _customerAddress.getCITY();
	}

	/**
	* Sets the c i t y of this customer address.
	*
	* @param CITY the c i t y of this customer address
	*/
	@Override
	public void setCITY(java.lang.String CITY) {
		_customerAddress.setCITY(CITY);
	}

	/**
	* Returns the s t a t e of this customer address.
	*
	* @return the s t a t e of this customer address
	*/
	@Override
	public java.lang.String getSTATE() {
		return _customerAddress.getSTATE();
	}

	/**
	* Sets the s t a t e of this customer address.
	*
	* @param STATE the s t a t e of this customer address
	*/
	@Override
	public void setSTATE(java.lang.String STATE) {
		_customerAddress.setSTATE(STATE);
	}

	/**
	* Returns the c i t y_ i d of this customer address.
	*
	* @return the c i t y_ i d of this customer address
	*/
	@Override
	public int getCITY_ID() {
		return _customerAddress.getCITY_ID();
	}

	/**
	* Sets the c i t y_ i d of this customer address.
	*
	* @param CITY_ID the c i t y_ i d of this customer address
	*/
	@Override
	public void setCITY_ID(int CITY_ID) {
		_customerAddress.setCITY_ID(CITY_ID);
	}

	/**
	* Returns the s t a t e_ i d of this customer address.
	*
	* @return the s t a t e_ i d of this customer address
	*/
	@Override
	public int getSTATE_ID() {
		return _customerAddress.getSTATE_ID();
	}

	/**
	* Sets the s t a t e_ i d of this customer address.
	*
	* @param STATE_ID the s t a t e_ i d of this customer address
	*/
	@Override
	public void setSTATE_ID(int STATE_ID) {
		_customerAddress.setSTATE_ID(STATE_ID);
	}

	/**
	* Returns the p i n_ c o d e of this customer address.
	*
	* @return the p i n_ c o d e of this customer address
	*/
	@Override
	public java.lang.String getPIN_CODE() {
		return _customerAddress.getPIN_CODE();
	}

	/**
	* Sets the p i n_ c o d e of this customer address.
	*
	* @param PIN_CODE the p i n_ c o d e of this customer address
	*/
	@Override
	public void setPIN_CODE(java.lang.String PIN_CODE) {
		_customerAddress.setPIN_CODE(PIN_CODE);
	}

	/**
	* Returns the c h a n g e_ r e q u e s t_ f o r of this customer address.
	*
	* @return the c h a n g e_ r e q u e s t_ f o r of this customer address
	*/
	@Override
	public int getCHANGE_REQUEST_FOR() {
		return _customerAddress.getCHANGE_REQUEST_FOR();
	}

	/**
	* Sets the c h a n g e_ r e q u e s t_ f o r of this customer address.
	*
	* @param CHANGE_REQUEST_FOR the c h a n g e_ r e q u e s t_ f o r of this customer address
	*/
	@Override
	public void setCHANGE_REQUEST_FOR(int CHANGE_REQUEST_FOR) {
		_customerAddress.setCHANGE_REQUEST_FOR(CHANGE_REQUEST_FOR);
	}

	/**
	* Returns the a d d r e s s_ t y p e_ i d of this customer address.
	*
	* @return the a d d r e s s_ t y p e_ i d of this customer address
	*/
	@Override
	public int getADDRESS_TYPE_ID() {
		return _customerAddress.getADDRESS_TYPE_ID();
	}

	/**
	* Sets the a d d r e s s_ t y p e_ i d of this customer address.
	*
	* @param ADDRESS_TYPE_ID the a d d r e s s_ t y p e_ i d of this customer address
	*/
	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_customerAddress.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
	}

	/**
	* Returns the a d d r_ s t a t u s of this customer address.
	*
	* @return the a d d r_ s t a t u s of this customer address
	*/
	@Override
	public java.lang.String getADDR_STATUS() {
		return _customerAddress.getADDR_STATUS();
	}

	/**
	* Sets the a d d r_ s t a t u s of this customer address.
	*
	* @param ADDR_STATUS the a d d r_ s t a t u s of this customer address
	*/
	@Override
	public void setADDR_STATUS(java.lang.String ADDR_STATUS) {
		_customerAddress.setADDR_STATUS(ADDR_STATUS);
	}

	/**
	* Returns the i n s e r t e d_ b y of this customer address.
	*
	* @return the i n s e r t e d_ b y of this customer address
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _customerAddress.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this customer address.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this customer address
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_customerAddress.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this customer address.
	*
	* @return the i n s e r t e d_ d a t e of this customer address
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _customerAddress.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this customer address.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this customer address
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_customerAddress.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this customer address.
	*
	* @return the u p d a t e d_ b y of this customer address
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _customerAddress.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this customer address.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this customer address
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_customerAddress.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this customer address.
	*
	* @return the u p d a t e d_ d a t e of this customer address
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _customerAddress.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this customer address.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this customer address
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_customerAddress.setUPDATED_DATE(UPDATED_DATE);
	}

	@Override
	public boolean isNew() {
		return _customerAddress.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerAddress.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerAddress.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerAddress.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerAddress.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerAddress.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerAddress.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerAddress.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerAddress.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerAddress.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerAddress.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new customerAddressWrapper((customerAddress)_customerAddress.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.customerAddress customerAddress) {
		return _customerAddress.compareTo(customerAddress);
	}

	@Override
	public int hashCode() {
		return _customerAddress.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.customerAddress> toCacheModel() {
		return _customerAddress.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.customerAddress toEscapedModel() {
		return new customerAddressWrapper(_customerAddress.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.customerAddress toUnescapedModel() {
		return new customerAddressWrapper(_customerAddress.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerAddress.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerAddress.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerAddress.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customerAddressWrapper)) {
			return false;
		}

		customerAddressWrapper customerAddressWrapper = (customerAddressWrapper)obj;

		if (Validator.equals(_customerAddress,
					customerAddressWrapper._customerAddress)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public customerAddress getWrappedcustomerAddress() {
		return _customerAddress;
	}

	@Override
	public customerAddress getWrappedModel() {
		return _customerAddress;
	}

	@Override
	public void resetOriginalValues() {
		_customerAddress.resetOriginalValues();
	}

	private customerAddress _customerAddress;
}