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
 * This class is a wrapper for {@link PolicyFund}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFund
 * @generated
 */
public class PolicyFundWrapper implements PolicyFund, ModelWrapper<PolicyFund> {
	public PolicyFundWrapper(PolicyFund policyFund) {
		_policyFund = policyFund;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFund.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFund.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_FUND_ID", getPOLICY_FUND_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_UNITS", getFUND_UNITS());
		attributes.put("NAV", getNAV());
		attributes.put("TOTAL_FUND", getTOTAL_FUND());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer POLICY_FUND_ID = (Integer)attributes.get("POLICY_FUND_ID");

		if (POLICY_FUND_ID != null) {
			setPOLICY_FUND_ID(POLICY_FUND_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Double FUND_UNITS = (Double)attributes.get("FUND_UNITS");

		if (FUND_UNITS != null) {
			setFUND_UNITS(FUND_UNITS);
		}

		Double NAV = (Double)attributes.get("NAV");

		if (NAV != null) {
			setNAV(NAV);
		}

		Double TOTAL_FUND = (Double)attributes.get("TOTAL_FUND");

		if (TOTAL_FUND != null) {
			setTOTAL_FUND(TOTAL_FUND);
		}
	}

	/**
	* Returns the primary key of this policy fund.
	*
	* @return the primary key of this policy fund
	*/
	@Override
	public int getPrimaryKey() {
		return _policyFund.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy fund.
	*
	* @param primaryKey the primary key of this policy fund
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyFund.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p o l i c y_ f u n d_ i d of this policy fund.
	*
	* @return the p o l i c y_ f u n d_ i d of this policy fund
	*/
	@Override
	public int getPOLICY_FUND_ID() {
		return _policyFund.getPOLICY_FUND_ID();
	}

	/**
	* Sets the p o l i c y_ f u n d_ i d of this policy fund.
	*
	* @param POLICY_FUND_ID the p o l i c y_ f u n d_ i d of this policy fund
	*/
	@Override
	public void setPOLICY_FUND_ID(int POLICY_FUND_ID) {
		_policyFund.setPOLICY_FUND_ID(POLICY_FUND_ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy fund.
	*
	* @return the p o l i c y_ i d of this policy fund
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyFund.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy fund.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy fund
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyFund.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the f u n d_ i d of this policy fund.
	*
	* @return the f u n d_ i d of this policy fund
	*/
	@Override
	public int getFUND_ID() {
		return _policyFund.getFUND_ID();
	}

	/**
	* Sets the f u n d_ i d of this policy fund.
	*
	* @param FUND_ID the f u n d_ i d of this policy fund
	*/
	@Override
	public void setFUND_ID(int FUND_ID) {
		_policyFund.setFUND_ID(FUND_ID);
	}

	/**
	* Returns the f u n d_ u n i t s of this policy fund.
	*
	* @return the f u n d_ u n i t s of this policy fund
	*/
	@Override
	public double getFUND_UNITS() {
		return _policyFund.getFUND_UNITS();
	}

	/**
	* Sets the f u n d_ u n i t s of this policy fund.
	*
	* @param FUND_UNITS the f u n d_ u n i t s of this policy fund
	*/
	@Override
	public void setFUND_UNITS(double FUND_UNITS) {
		_policyFund.setFUND_UNITS(FUND_UNITS);
	}

	/**
	* Returns the n a v of this policy fund.
	*
	* @return the n a v of this policy fund
	*/
	@Override
	public double getNAV() {
		return _policyFund.getNAV();
	}

	/**
	* Sets the n a v of this policy fund.
	*
	* @param NAV the n a v of this policy fund
	*/
	@Override
	public void setNAV(double NAV) {
		_policyFund.setNAV(NAV);
	}

	/**
	* Returns the t o t a l_ f u n d of this policy fund.
	*
	* @return the t o t a l_ f u n d of this policy fund
	*/
	@Override
	public double getTOTAL_FUND() {
		return _policyFund.getTOTAL_FUND();
	}

	/**
	* Sets the t o t a l_ f u n d of this policy fund.
	*
	* @param TOTAL_FUND the t o t a l_ f u n d of this policy fund
	*/
	@Override
	public void setTOTAL_FUND(double TOTAL_FUND) {
		_policyFund.setTOTAL_FUND(TOTAL_FUND);
	}

	@Override
	public boolean isNew() {
		return _policyFund.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyFund.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyFund.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyFund.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyFund.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyFund.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyFund.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyFund.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyFund.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyFund.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyFund.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyFundWrapper((PolicyFund)_policyFund.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PolicyFund policyFund) {
		return _policyFund.compareTo(policyFund);
	}

	@Override
	public int hashCode() {
		return _policyFund.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyFund> toCacheModel() {
		return _policyFund.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyFund toEscapedModel() {
		return new PolicyFundWrapper(_policyFund.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyFund toUnescapedModel() {
		return new PolicyFundWrapper(_policyFund.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyFund.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyFund.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyFund.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyFundWrapper)) {
			return false;
		}

		PolicyFundWrapper policyFundWrapper = (PolicyFundWrapper)obj;

		if (Validator.equals(_policyFund, policyFundWrapper._policyFund)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyFund getWrappedPolicyFund() {
		return _policyFund;
	}

	@Override
	public PolicyFund getWrappedModel() {
		return _policyFund;
	}

	@Override
	public void resetOriginalValues() {
		_policyFund.resetOriginalValues();
	}

	private PolicyFund _policyFund;
}