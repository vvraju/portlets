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
 * This class is a wrapper for {@link PolicyTopupDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyTopupDetails
 * @generated
 */
public class PolicyTopupDetailsWrapper implements PolicyTopupDetails,
	ModelWrapper<PolicyTopupDetails> {
	public PolicyTopupDetailsWrapper(PolicyTopupDetails policyTopupDetails) {
		_policyTopupDetails = policyTopupDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyTopupDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyTopupDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TOPUP_ID", getTOPUP_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_VALUE", getFUND_VALUE());
		attributes.put("TOPUP_VALUE", getTOPUP_VALUE());
		attributes.put("TOT_VALUE", getTOT_VALUE());
		attributes.put("TOPUP_PERCENTAGE", getTOPUP_PERCENTAGE());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer TOPUP_ID = (Integer)attributes.get("TOPUP_ID");

		if (TOPUP_ID != null) {
			setTOPUP_ID(TOPUP_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Double FUND_VALUE = (Double)attributes.get("FUND_VALUE");

		if (FUND_VALUE != null) {
			setFUND_VALUE(FUND_VALUE);
		}

		Double TOPUP_VALUE = (Double)attributes.get("TOPUP_VALUE");

		if (TOPUP_VALUE != null) {
			setTOPUP_VALUE(TOPUP_VALUE);
		}

		Double TOT_VALUE = (Double)attributes.get("TOT_VALUE");

		if (TOT_VALUE != null) {
			setTOT_VALUE(TOT_VALUE);
		}

		Double TOPUP_PERCENTAGE = (Double)attributes.get("TOPUP_PERCENTAGE");

		if (TOPUP_PERCENTAGE != null) {
			setTOPUP_PERCENTAGE(TOPUP_PERCENTAGE);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}
	}

	/**
	* Returns the primary key of this policy topup details.
	*
	* @return the primary key of this policy topup details
	*/
	@Override
	public int getPrimaryKey() {
		return _policyTopupDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy topup details.
	*
	* @param primaryKey the primary key of this policy topup details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyTopupDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the t o p u p_ i d of this policy topup details.
	*
	* @return the t o p u p_ i d of this policy topup details
	*/
	@Override
	public int getTOPUP_ID() {
		return _policyTopupDetails.getTOPUP_ID();
	}

	/**
	* Sets the t o p u p_ i d of this policy topup details.
	*
	* @param TOPUP_ID the t o p u p_ i d of this policy topup details
	*/
	@Override
	public void setTOPUP_ID(int TOPUP_ID) {
		_policyTopupDetails.setTOPUP_ID(TOPUP_ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy topup details.
	*
	* @return the p o l i c y_ i d of this policy topup details
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyTopupDetails.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy topup details.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy topup details
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyTopupDetails.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the q r c_ a s r_ i d of this policy topup details.
	*
	* @return the q r c_ a s r_ i d of this policy topup details
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _policyTopupDetails.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this policy topup details.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this policy topup details
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_policyTopupDetails.setQRC_ASR_ID(QRC_ASR_ID);
	}

	/**
	* Returns the f u n d_ i d of this policy topup details.
	*
	* @return the f u n d_ i d of this policy topup details
	*/
	@Override
	public int getFUND_ID() {
		return _policyTopupDetails.getFUND_ID();
	}

	/**
	* Sets the f u n d_ i d of this policy topup details.
	*
	* @param FUND_ID the f u n d_ i d of this policy topup details
	*/
	@Override
	public void setFUND_ID(int FUND_ID) {
		_policyTopupDetails.setFUND_ID(FUND_ID);
	}

	/**
	* Returns the f u n d_ v a l u e of this policy topup details.
	*
	* @return the f u n d_ v a l u e of this policy topup details
	*/
	@Override
	public double getFUND_VALUE() {
		return _policyTopupDetails.getFUND_VALUE();
	}

	/**
	* Sets the f u n d_ v a l u e of this policy topup details.
	*
	* @param FUND_VALUE the f u n d_ v a l u e of this policy topup details
	*/
	@Override
	public void setFUND_VALUE(double FUND_VALUE) {
		_policyTopupDetails.setFUND_VALUE(FUND_VALUE);
	}

	/**
	* Returns the t o p u p_ v a l u e of this policy topup details.
	*
	* @return the t o p u p_ v a l u e of this policy topup details
	*/
	@Override
	public double getTOPUP_VALUE() {
		return _policyTopupDetails.getTOPUP_VALUE();
	}

	/**
	* Sets the t o p u p_ v a l u e of this policy topup details.
	*
	* @param TOPUP_VALUE the t o p u p_ v a l u e of this policy topup details
	*/
	@Override
	public void setTOPUP_VALUE(double TOPUP_VALUE) {
		_policyTopupDetails.setTOPUP_VALUE(TOPUP_VALUE);
	}

	/**
	* Returns the t o t_ v a l u e of this policy topup details.
	*
	* @return the t o t_ v a l u e of this policy topup details
	*/
	@Override
	public double getTOT_VALUE() {
		return _policyTopupDetails.getTOT_VALUE();
	}

	/**
	* Sets the t o t_ v a l u e of this policy topup details.
	*
	* @param TOT_VALUE the t o t_ v a l u e of this policy topup details
	*/
	@Override
	public void setTOT_VALUE(double TOT_VALUE) {
		_policyTopupDetails.setTOT_VALUE(TOT_VALUE);
	}

	/**
	* Returns the t o p u p_ p e r c e n t a g e of this policy topup details.
	*
	* @return the t o p u p_ p e r c e n t a g e of this policy topup details
	*/
	@Override
	public double getTOPUP_PERCENTAGE() {
		return _policyTopupDetails.getTOPUP_PERCENTAGE();
	}

	/**
	* Sets the t o p u p_ p e r c e n t a g e of this policy topup details.
	*
	* @param TOPUP_PERCENTAGE the t o p u p_ p e r c e n t a g e of this policy topup details
	*/
	@Override
	public void setTOPUP_PERCENTAGE(double TOPUP_PERCENTAGE) {
		_policyTopupDetails.setTOPUP_PERCENTAGE(TOPUP_PERCENTAGE);
	}

	/**
	* Returns the created by of this policy topup details.
	*
	* @return the created by of this policy topup details
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _policyTopupDetails.getCreatedBy();
	}

	/**
	* Sets the created by of this policy topup details.
	*
	* @param CreatedBy the created by of this policy topup details
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_policyTopupDetails.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this policy topup details.
	*
	* @return the created date of this policy topup details
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _policyTopupDetails.getCreatedDate();
	}

	/**
	* Sets the created date of this policy topup details.
	*
	* @param CreatedDate the created date of this policy topup details
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_policyTopupDetails.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this policy topup details.
	*
	* @return the modified by of this policy topup details
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _policyTopupDetails.getModifiedBy();
	}

	/**
	* Sets the modified by of this policy topup details.
	*
	* @param ModifiedBy the modified by of this policy topup details
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_policyTopupDetails.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this policy topup details.
	*
	* @return the modified date of this policy topup details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _policyTopupDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this policy topup details.
	*
	* @param ModifiedDate the modified date of this policy topup details
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_policyTopupDetails.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _policyTopupDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyTopupDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyTopupDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyTopupDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyTopupDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyTopupDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyTopupDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyTopupDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyTopupDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyTopupDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyTopupDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyTopupDetailsWrapper((PolicyTopupDetails)_policyTopupDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails) {
		return _policyTopupDetails.compareTo(policyTopupDetails);
	}

	@Override
	public int hashCode() {
		return _policyTopupDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyTopupDetails> toCacheModel() {
		return _policyTopupDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyTopupDetails toEscapedModel() {
		return new PolicyTopupDetailsWrapper(_policyTopupDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyTopupDetails toUnescapedModel() {
		return new PolicyTopupDetailsWrapper(_policyTopupDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyTopupDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyTopupDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyTopupDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyTopupDetailsWrapper)) {
			return false;
		}

		PolicyTopupDetailsWrapper policyTopupDetailsWrapper = (PolicyTopupDetailsWrapper)obj;

		if (Validator.equals(_policyTopupDetails,
					policyTopupDetailsWrapper._policyTopupDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyTopupDetails getWrappedPolicyTopupDetails() {
		return _policyTopupDetails;
	}

	@Override
	public PolicyTopupDetails getWrappedModel() {
		return _policyTopupDetails;
	}

	@Override
	public void resetOriginalValues() {
		_policyTopupDetails.resetOriginalValues();
	}

	private PolicyTopupDetails _policyTopupDetails;
}