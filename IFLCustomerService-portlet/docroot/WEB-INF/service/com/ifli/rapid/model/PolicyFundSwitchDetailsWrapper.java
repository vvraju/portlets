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
 * This class is a wrapper for {@link PolicyFundSwitchDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetails
 * @generated
 */
public class PolicyFundSwitchDetailsWrapper implements PolicyFundSwitchDetails,
	ModelWrapper<PolicyFundSwitchDetails> {
	public PolicyFundSwitchDetailsWrapper(
		PolicyFundSwitchDetails policyFundSwitchDetails) {
		_policyFundSwitchDetails = policyFundSwitchDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFundSwitchDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFundSwitchDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FUND_SWITCH_ID", getFUND_SWITCH_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("FUND_FROM", getFUND_FROM());
		attributes.put("FUND_TO", getFUND_TO());
		attributes.put("PRECENTAGE_OF_UNITS", getPRECENTAGE_OF_UNITS());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FUND_SWITCH_ID = (Integer)attributes.get("FUND_SWITCH_ID");

		if (FUND_SWITCH_ID != null) {
			setFUND_SWITCH_ID(FUND_SWITCH_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String FUND_FROM = (String)attributes.get("FUND_FROM");

		if (FUND_FROM != null) {
			setFUND_FROM(FUND_FROM);
		}

		String FUND_TO = (String)attributes.get("FUND_TO");

		if (FUND_TO != null) {
			setFUND_TO(FUND_TO);
		}

		Double PRECENTAGE_OF_UNITS = (Double)attributes.get(
				"PRECENTAGE_OF_UNITS");

		if (PRECENTAGE_OF_UNITS != null) {
			setPRECENTAGE_OF_UNITS(PRECENTAGE_OF_UNITS);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}
	}

	/**
	* Returns the primary key of this policy fund switch details.
	*
	* @return the primary key of this policy fund switch details
	*/
	@Override
	public int getPrimaryKey() {
		return _policyFundSwitchDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy fund switch details.
	*
	* @param primaryKey the primary key of this policy fund switch details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyFundSwitchDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the f u n d_ s w i t c h_ i d of this policy fund switch details.
	*
	* @return the f u n d_ s w i t c h_ i d of this policy fund switch details
	*/
	@Override
	public int getFUND_SWITCH_ID() {
		return _policyFundSwitchDetails.getFUND_SWITCH_ID();
	}

	/**
	* Sets the f u n d_ s w i t c h_ i d of this policy fund switch details.
	*
	* @param FUND_SWITCH_ID the f u n d_ s w i t c h_ i d of this policy fund switch details
	*/
	@Override
	public void setFUND_SWITCH_ID(int FUND_SWITCH_ID) {
		_policyFundSwitchDetails.setFUND_SWITCH_ID(FUND_SWITCH_ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy fund switch details.
	*
	* @return the p o l i c y_ i d of this policy fund switch details
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyFundSwitchDetails.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy fund switch details.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy fund switch details
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyFundSwitchDetails.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the q r c_ a s r_ i d of this policy fund switch details.
	*
	* @return the q r c_ a s r_ i d of this policy fund switch details
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _policyFundSwitchDetails.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this policy fund switch details.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this policy fund switch details
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_policyFundSwitchDetails.setQRC_ASR_ID(QRC_ASR_ID);
	}

	/**
	* Returns the f u n d_ f r o m of this policy fund switch details.
	*
	* @return the f u n d_ f r o m of this policy fund switch details
	*/
	@Override
	public java.lang.String getFUND_FROM() {
		return _policyFundSwitchDetails.getFUND_FROM();
	}

	/**
	* Sets the f u n d_ f r o m of this policy fund switch details.
	*
	* @param FUND_FROM the f u n d_ f r o m of this policy fund switch details
	*/
	@Override
	public void setFUND_FROM(java.lang.String FUND_FROM) {
		_policyFundSwitchDetails.setFUND_FROM(FUND_FROM);
	}

	/**
	* Returns the f u n d_ t o of this policy fund switch details.
	*
	* @return the f u n d_ t o of this policy fund switch details
	*/
	@Override
	public java.lang.String getFUND_TO() {
		return _policyFundSwitchDetails.getFUND_TO();
	}

	/**
	* Sets the f u n d_ t o of this policy fund switch details.
	*
	* @param FUND_TO the f u n d_ t o of this policy fund switch details
	*/
	@Override
	public void setFUND_TO(java.lang.String FUND_TO) {
		_policyFundSwitchDetails.setFUND_TO(FUND_TO);
	}

	/**
	* Returns the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details.
	*
	* @return the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details
	*/
	@Override
	public double getPRECENTAGE_OF_UNITS() {
		return _policyFundSwitchDetails.getPRECENTAGE_OF_UNITS();
	}

	/**
	* Sets the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details.
	*
	* @param PRECENTAGE_OF_UNITS the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details
	*/
	@Override
	public void setPRECENTAGE_OF_UNITS(double PRECENTAGE_OF_UNITS) {
		_policyFundSwitchDetails.setPRECENTAGE_OF_UNITS(PRECENTAGE_OF_UNITS);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this policy fund switch details.
	*
	* @return the i n s e r t e d_ d a t e of this policy fund switch details
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _policyFundSwitchDetails.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this policy fund switch details.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this policy fund switch details
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_policyFundSwitchDetails.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this policy fund switch details.
	*
	* @return the i n s e r t e d_ b y of this policy fund switch details
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _policyFundSwitchDetails.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this policy fund switch details.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this policy fund switch details
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_policyFundSwitchDetails.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this policy fund switch details.
	*
	* @return the u p d a t e d_ d a t e of this policy fund switch details
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _policyFundSwitchDetails.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this policy fund switch details.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this policy fund switch details
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_policyFundSwitchDetails.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this policy fund switch details.
	*
	* @return the u p d a t e d_ b y of this policy fund switch details
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _policyFundSwitchDetails.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this policy fund switch details.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this policy fund switch details
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_policyFundSwitchDetails.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _policyFundSwitchDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyFundSwitchDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyFundSwitchDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyFundSwitchDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyFundSwitchDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyFundSwitchDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyFundSwitchDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyFundSwitchDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyFundSwitchDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyFundSwitchDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyFundSwitchDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyFundSwitchDetailsWrapper((PolicyFundSwitchDetails)_policyFundSwitchDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails) {
		return _policyFundSwitchDetails.compareTo(policyFundSwitchDetails);
	}

	@Override
	public int hashCode() {
		return _policyFundSwitchDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyFundSwitchDetails> toCacheModel() {
		return _policyFundSwitchDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails toEscapedModel() {
		return new PolicyFundSwitchDetailsWrapper(_policyFundSwitchDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails toUnescapedModel() {
		return new PolicyFundSwitchDetailsWrapper(_policyFundSwitchDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyFundSwitchDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyFundSwitchDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyFundSwitchDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyFundSwitchDetailsWrapper)) {
			return false;
		}

		PolicyFundSwitchDetailsWrapper policyFundSwitchDetailsWrapper = (PolicyFundSwitchDetailsWrapper)obj;

		if (Validator.equals(_policyFundSwitchDetails,
					policyFundSwitchDetailsWrapper._policyFundSwitchDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyFundSwitchDetails getWrappedPolicyFundSwitchDetails() {
		return _policyFundSwitchDetails;
	}

	@Override
	public PolicyFundSwitchDetails getWrappedModel() {
		return _policyFundSwitchDetails;
	}

	@Override
	public void resetOriginalValues() {
		_policyFundSwitchDetails.resetOriginalValues();
	}

	private PolicyFundSwitchDetails _policyFundSwitchDetails;
}