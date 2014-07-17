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
 * This class is a wrapper for {@link PolicyFundSwitchCounter}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounter
 * @generated
 */
public class PolicyFundSwitchCounterWrapper implements PolicyFundSwitchCounter,
	ModelWrapper<PolicyFundSwitchCounter> {
	public PolicyFundSwitchCounterWrapper(
		PolicyFundSwitchCounter policyFundSwitchCounter) {
		_policyFundSwitchCounter = policyFundSwitchCounter;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFundSwitchCounter.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFundSwitchCounter.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_SWITCH_COUNTER", getFUND_SWITCH_COUNTER());
		attributes.put("FUND_SWITCH_YEAR", getFUND_SWITCH_YEAR());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_SWITCH_COUNTER = (Integer)attributes.get(
				"FUND_SWITCH_COUNTER");

		if (FUND_SWITCH_COUNTER != null) {
			setFUND_SWITCH_COUNTER(FUND_SWITCH_COUNTER);
		}

		Date FUND_SWITCH_YEAR = (Date)attributes.get("FUND_SWITCH_YEAR");

		if (FUND_SWITCH_YEAR != null) {
			setFUND_SWITCH_YEAR(FUND_SWITCH_YEAR);
		}
	}

	/**
	* Returns the primary key of this policy fund switch counter.
	*
	* @return the primary key of this policy fund switch counter
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _policyFundSwitchCounter.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy fund switch counter.
	*
	* @param primaryKey the primary key of this policy fund switch counter
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_policyFundSwitchCounter.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p o l i c y_ i d of this policy fund switch counter.
	*
	* @return the p o l i c y_ i d of this policy fund switch counter
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyFundSwitchCounter.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy fund switch counter.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy fund switch counter
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyFundSwitchCounter.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the f u n d_ s w i t c h_ c o u n t e r of this policy fund switch counter.
	*
	* @return the f u n d_ s w i t c h_ c o u n t e r of this policy fund switch counter
	*/
	@Override
	public int getFUND_SWITCH_COUNTER() {
		return _policyFundSwitchCounter.getFUND_SWITCH_COUNTER();
	}

	/**
	* Sets the f u n d_ s w i t c h_ c o u n t e r of this policy fund switch counter.
	*
	* @param FUND_SWITCH_COUNTER the f u n d_ s w i t c h_ c o u n t e r of this policy fund switch counter
	*/
	@Override
	public void setFUND_SWITCH_COUNTER(int FUND_SWITCH_COUNTER) {
		_policyFundSwitchCounter.setFUND_SWITCH_COUNTER(FUND_SWITCH_COUNTER);
	}

	/**
	* Returns the f u n d_ s w i t c h_ y e a r of this policy fund switch counter.
	*
	* @return the f u n d_ s w i t c h_ y e a r of this policy fund switch counter
	*/
	@Override
	public java.util.Date getFUND_SWITCH_YEAR() {
		return _policyFundSwitchCounter.getFUND_SWITCH_YEAR();
	}

	/**
	* Sets the f u n d_ s w i t c h_ y e a r of this policy fund switch counter.
	*
	* @param FUND_SWITCH_YEAR the f u n d_ s w i t c h_ y e a r of this policy fund switch counter
	*/
	@Override
	public void setFUND_SWITCH_YEAR(java.util.Date FUND_SWITCH_YEAR) {
		_policyFundSwitchCounter.setFUND_SWITCH_YEAR(FUND_SWITCH_YEAR);
	}

	@Override
	public boolean isNew() {
		return _policyFundSwitchCounter.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyFundSwitchCounter.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyFundSwitchCounter.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyFundSwitchCounter.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyFundSwitchCounter.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyFundSwitchCounter.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyFundSwitchCounter.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyFundSwitchCounter.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyFundSwitchCounter.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyFundSwitchCounter.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyFundSwitchCounter.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyFundSwitchCounterWrapper((PolicyFundSwitchCounter)_policyFundSwitchCounter.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter) {
		return _policyFundSwitchCounter.compareTo(policyFundSwitchCounter);
	}

	@Override
	public int hashCode() {
		return _policyFundSwitchCounter.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyFundSwitchCounter> toCacheModel() {
		return _policyFundSwitchCounter.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter toEscapedModel() {
		return new PolicyFundSwitchCounterWrapper(_policyFundSwitchCounter.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter toUnescapedModel() {
		return new PolicyFundSwitchCounterWrapper(_policyFundSwitchCounter.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyFundSwitchCounter.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyFundSwitchCounter.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyFundSwitchCounter.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyFundSwitchCounterWrapper)) {
			return false;
		}

		PolicyFundSwitchCounterWrapper policyFundSwitchCounterWrapper = (PolicyFundSwitchCounterWrapper)obj;

		if (Validator.equals(_policyFundSwitchCounter,
					policyFundSwitchCounterWrapper._policyFundSwitchCounter)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyFundSwitchCounter getWrappedPolicyFundSwitchCounter() {
		return _policyFundSwitchCounter;
	}

	@Override
	public PolicyFundSwitchCounter getWrappedModel() {
		return _policyFundSwitchCounter;
	}

	@Override
	public void resetOriginalValues() {
		_policyFundSwitchCounter.resetOriginalValues();
	}

	private PolicyFundSwitchCounter _policyFundSwitchCounter;
}