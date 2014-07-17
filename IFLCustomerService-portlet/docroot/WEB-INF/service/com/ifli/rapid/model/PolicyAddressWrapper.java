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
 * This class is a wrapper for {@link PolicyAddress}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyAddress
 * @generated
 */
public class PolicyAddressWrapper implements PolicyAddress,
	ModelWrapper<PolicyAddress> {
	public PolicyAddressWrapper(PolicyAddress policyAddress) {
		_policyAddress = policyAddress;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUSTOMER_ADDRESS_ID", getCUSTOMER_ADDRESS_ID());
		attributes.put("PINCODE", getPINCODE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("ADDRESS_LINE_1", getADDRESS_LINE_1());
		attributes.put("ADDRESS_LINE_2", getADDRESS_LINE_2());
		attributes.put("ADDRESS_LINE_3", getADDRESS_LINE_3());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		Integer CUSTOMER_ADDRESS_ID = (Integer)attributes.get(
				"CUSTOMER_ADDRESS_ID");

		if (CUSTOMER_ADDRESS_ID != null) {
			setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		}

		String PINCODE = (String)attributes.get("PINCODE");

		if (PINCODE != null) {
			setPINCODE(PINCODE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
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
	}

	/**
	* Returns the primary key of this policy address.
	*
	* @return the primary key of this policy address
	*/
	@Override
	public int getPrimaryKey() {
		return _policyAddress.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy address.
	*
	* @param primaryKey the primary key of this policy address
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyAddress.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this policy address.
	*
	* @return the i d of this policy address
	*/
	@Override
	public int getID() {
		return _policyAddress.getID();
	}

	/**
	* Sets the i d of this policy address.
	*
	* @param ID the i d of this policy address
	*/
	@Override
	public void setID(int ID) {
		_policyAddress.setID(ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy address.
	*
	* @return the p o l i c y_ i d of this policy address
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyAddress.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy address.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy address
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyAddress.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this policy address.
	*
	* @return the c u s t o m e r_ i d of this policy address
	*/
	@Override
	public java.lang.String getCUSTOMER_ID() {
		return _policyAddress.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this policy address.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this policy address
	*/
	@Override
	public void setCUSTOMER_ID(java.lang.String CUSTOMER_ID) {
		_policyAddress.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the c u s t o m e r_ a d d r e s s_ i d of this policy address.
	*
	* @return the c u s t o m e r_ a d d r e s s_ i d of this policy address
	*/
	@Override
	public int getCUSTOMER_ADDRESS_ID() {
		return _policyAddress.getCUSTOMER_ADDRESS_ID();
	}

	/**
	* Sets the c u s t o m e r_ a d d r e s s_ i d of this policy address.
	*
	* @param CUSTOMER_ADDRESS_ID the c u s t o m e r_ a d d r e s s_ i d of this policy address
	*/
	@Override
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_policyAddress.setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Returns the p i n c o d e of this policy address.
	*
	* @return the p i n c o d e of this policy address
	*/
	@Override
	public java.lang.String getPINCODE() {
		return _policyAddress.getPINCODE();
	}

	/**
	* Sets the p i n c o d e of this policy address.
	*
	* @param PINCODE the p i n c o d e of this policy address
	*/
	@Override
	public void setPINCODE(java.lang.String PINCODE) {
		_policyAddress.setPINCODE(PINCODE);
	}

	/**
	* Returns the c i t y of this policy address.
	*
	* @return the c i t y of this policy address
	*/
	@Override
	public java.lang.String getCITY() {
		return _policyAddress.getCITY();
	}

	/**
	* Sets the c i t y of this policy address.
	*
	* @param CITY the c i t y of this policy address
	*/
	@Override
	public void setCITY(java.lang.String CITY) {
		_policyAddress.setCITY(CITY);
	}

	/**
	* Returns the s t a t e of this policy address.
	*
	* @return the s t a t e of this policy address
	*/
	@Override
	public java.lang.String getSTATE() {
		return _policyAddress.getSTATE();
	}

	/**
	* Sets the s t a t e of this policy address.
	*
	* @param STATE the s t a t e of this policy address
	*/
	@Override
	public void setSTATE(java.lang.String STATE) {
		_policyAddress.setSTATE(STATE);
	}

	/**
	* Returns the a d d r e s s_ l i n e_1 of this policy address.
	*
	* @return the a d d r e s s_ l i n e_1 of this policy address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_1() {
		return _policyAddress.getADDRESS_LINE_1();
	}

	/**
	* Sets the a d d r e s s_ l i n e_1 of this policy address.
	*
	* @param ADDRESS_LINE_1 the a d d r e s s_ l i n e_1 of this policy address
	*/
	@Override
	public void setADDRESS_LINE_1(java.lang.String ADDRESS_LINE_1) {
		_policyAddress.setADDRESS_LINE_1(ADDRESS_LINE_1);
	}

	/**
	* Returns the a d d r e s s_ l i n e_2 of this policy address.
	*
	* @return the a d d r e s s_ l i n e_2 of this policy address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_2() {
		return _policyAddress.getADDRESS_LINE_2();
	}

	/**
	* Sets the a d d r e s s_ l i n e_2 of this policy address.
	*
	* @param ADDRESS_LINE_2 the a d d r e s s_ l i n e_2 of this policy address
	*/
	@Override
	public void setADDRESS_LINE_2(java.lang.String ADDRESS_LINE_2) {
		_policyAddress.setADDRESS_LINE_2(ADDRESS_LINE_2);
	}

	/**
	* Returns the a d d r e s s_ l i n e_3 of this policy address.
	*
	* @return the a d d r e s s_ l i n e_3 of this policy address
	*/
	@Override
	public java.lang.String getADDRESS_LINE_3() {
		return _policyAddress.getADDRESS_LINE_3();
	}

	/**
	* Sets the a d d r e s s_ l i n e_3 of this policy address.
	*
	* @param ADDRESS_LINE_3 the a d d r e s s_ l i n e_3 of this policy address
	*/
	@Override
	public void setADDRESS_LINE_3(java.lang.String ADDRESS_LINE_3) {
		_policyAddress.setADDRESS_LINE_3(ADDRESS_LINE_3);
	}

	@Override
	public boolean isNew() {
		return _policyAddress.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyAddress.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyAddress.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyAddress.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyAddress.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyAddress.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyAddress.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyAddress.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyAddress.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyAddress.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyAddress.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyAddressWrapper((PolicyAddress)_policyAddress.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PolicyAddress policyAddress) {
		return _policyAddress.compareTo(policyAddress);
	}

	@Override
	public int hashCode() {
		return _policyAddress.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyAddress> toCacheModel() {
		return _policyAddress.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyAddress toEscapedModel() {
		return new PolicyAddressWrapper(_policyAddress.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyAddress toUnescapedModel() {
		return new PolicyAddressWrapper(_policyAddress.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyAddress.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyAddress.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyAddress.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyAddressWrapper)) {
			return false;
		}

		PolicyAddressWrapper policyAddressWrapper = (PolicyAddressWrapper)obj;

		if (Validator.equals(_policyAddress, policyAddressWrapper._policyAddress)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyAddress getWrappedPolicyAddress() {
		return _policyAddress;
	}

	@Override
	public PolicyAddress getWrappedModel() {
		return _policyAddress;
	}

	@Override
	public void resetOriginalValues() {
		_policyAddress.resetOriginalValues();
	}

	private PolicyAddress _policyAddress;
}