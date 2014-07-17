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
 * This class is a wrapper for {@link PolicyPremPercentage}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremPercentage
 * @generated
 */
public class PolicyPremPercentageWrapper implements PolicyPremPercentage,
	ModelWrapper<PolicyPremPercentage> {
	public PolicyPremPercentageWrapper(
		PolicyPremPercentage policyPremPercentage) {
		_policyPremPercentage = policyPremPercentage;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyPremPercentage.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyPremPercentage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PREM_PERCENTAGE_ID", getPREM_PERCENTAGE_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_PERCENTAGE", getFUND_PERCENTAGE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PREM_PERCENTAGE_ID = (Integer)attributes.get(
				"PREM_PERCENTAGE_ID");

		if (PREM_PERCENTAGE_ID != null) {
			setPREM_PERCENTAGE_ID(PREM_PERCENTAGE_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Integer FUND_PERCENTAGE = (Integer)attributes.get("FUND_PERCENTAGE");

		if (FUND_PERCENTAGE != null) {
			setFUND_PERCENTAGE(FUND_PERCENTAGE);
		}
	}

	/**
	* Returns the primary key of this policy prem percentage.
	*
	* @return the primary key of this policy prem percentage
	*/
	@Override
	public int getPrimaryKey() {
		return _policyPremPercentage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy prem percentage.
	*
	* @param primaryKey the primary key of this policy prem percentage
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyPremPercentage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p r e m_ p e r c e n t a g e_ i d of this policy prem percentage.
	*
	* @return the p r e m_ p e r c e n t a g e_ i d of this policy prem percentage
	*/
	@Override
	public int getPREM_PERCENTAGE_ID() {
		return _policyPremPercentage.getPREM_PERCENTAGE_ID();
	}

	/**
	* Sets the p r e m_ p e r c e n t a g e_ i d of this policy prem percentage.
	*
	* @param PREM_PERCENTAGE_ID the p r e m_ p e r c e n t a g e_ i d of this policy prem percentage
	*/
	@Override
	public void setPREM_PERCENTAGE_ID(int PREM_PERCENTAGE_ID) {
		_policyPremPercentage.setPREM_PERCENTAGE_ID(PREM_PERCENTAGE_ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy prem percentage.
	*
	* @return the p o l i c y_ i d of this policy prem percentage
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyPremPercentage.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy prem percentage.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy prem percentage
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyPremPercentage.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the f u n d_ i d of this policy prem percentage.
	*
	* @return the f u n d_ i d of this policy prem percentage
	*/
	@Override
	public int getFUND_ID() {
		return _policyPremPercentage.getFUND_ID();
	}

	/**
	* Sets the f u n d_ i d of this policy prem percentage.
	*
	* @param FUND_ID the f u n d_ i d of this policy prem percentage
	*/
	@Override
	public void setFUND_ID(int FUND_ID) {
		_policyPremPercentage.setFUND_ID(FUND_ID);
	}

	/**
	* Returns the f u n d_ p e r c e n t a g e of this policy prem percentage.
	*
	* @return the f u n d_ p e r c e n t a g e of this policy prem percentage
	*/
	@Override
	public int getFUND_PERCENTAGE() {
		return _policyPremPercentage.getFUND_PERCENTAGE();
	}

	/**
	* Sets the f u n d_ p e r c e n t a g e of this policy prem percentage.
	*
	* @param FUND_PERCENTAGE the f u n d_ p e r c e n t a g e of this policy prem percentage
	*/
	@Override
	public void setFUND_PERCENTAGE(int FUND_PERCENTAGE) {
		_policyPremPercentage.setFUND_PERCENTAGE(FUND_PERCENTAGE);
	}

	@Override
	public boolean isNew() {
		return _policyPremPercentage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyPremPercentage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyPremPercentage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyPremPercentage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyPremPercentage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyPremPercentage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyPremPercentage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyPremPercentage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyPremPercentage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyPremPercentage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyPremPercentage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyPremPercentageWrapper((PolicyPremPercentage)_policyPremPercentage.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PolicyPremPercentage policyPremPercentage) {
		return _policyPremPercentage.compareTo(policyPremPercentage);
	}

	@Override
	public int hashCode() {
		return _policyPremPercentage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyPremPercentage> toCacheModel() {
		return _policyPremPercentage.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyPremPercentage toEscapedModel() {
		return new PolicyPremPercentageWrapper(_policyPremPercentage.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyPremPercentage toUnescapedModel() {
		return new PolicyPremPercentageWrapper(_policyPremPercentage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyPremPercentage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyPremPercentage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyPremPercentage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyPremPercentageWrapper)) {
			return false;
		}

		PolicyPremPercentageWrapper policyPremPercentageWrapper = (PolicyPremPercentageWrapper)obj;

		if (Validator.equals(_policyPremPercentage,
					policyPremPercentageWrapper._policyPremPercentage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyPremPercentage getWrappedPolicyPremPercentage() {
		return _policyPremPercentage;
	}

	@Override
	public PolicyPremPercentage getWrappedModel() {
		return _policyPremPercentage;
	}

	@Override
	public void resetOriginalValues() {
		_policyPremPercentage.resetOriginalValues();
	}

	private PolicyPremPercentage _policyPremPercentage;
}