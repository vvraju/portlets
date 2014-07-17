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
 * This class is a wrapper for {@link PolicyPremRedirectionDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetails
 * @generated
 */
public class PolicyPremRedirectionDetailsWrapper
	implements PolicyPremRedirectionDetails,
		ModelWrapper<PolicyPremRedirectionDetails> {
	public PolicyPremRedirectionDetailsWrapper(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		_policyPremRedirectionDetails = policyPremRedirectionDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyPremRedirectionDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyPremRedirectionDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PREM_REDIRECTION_ID", getPREM_REDIRECTION_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("TRANSACTION_AUDIT_ID", getTRANSACTION_AUDIT_ID());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("ALLOCATION_PERCENTAGE", getALLOCATION_PERCENTAGE());
		attributes.put("SENT_TO_ODS_FLAG", getSENT_TO_ODS_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PREM_REDIRECTION_ID = (Integer)attributes.get(
				"PREM_REDIRECTION_ID");

		if (PREM_REDIRECTION_ID != null) {
			setPREM_REDIRECTION_ID(PREM_REDIRECTION_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer TRANSACTION_AUDIT_ID = (Integer)attributes.get(
				"TRANSACTION_AUDIT_ID");

		if (TRANSACTION_AUDIT_ID != null) {
			setTRANSACTION_AUDIT_ID(TRANSACTION_AUDIT_ID);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		Double ALLOCATION_PERCENTAGE = (Double)attributes.get(
				"ALLOCATION_PERCENTAGE");

		if (ALLOCATION_PERCENTAGE != null) {
			setALLOCATION_PERCENTAGE(ALLOCATION_PERCENTAGE);
		}

		String SENT_TO_ODS_FLAG = (String)attributes.get("SENT_TO_ODS_FLAG");

		if (SENT_TO_ODS_FLAG != null) {
			setSENT_TO_ODS_FLAG(SENT_TO_ODS_FLAG);
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
	* Returns the primary key of this policy prem redirection details.
	*
	* @return the primary key of this policy prem redirection details
	*/
	@Override
	public int getPrimaryKey() {
		return _policyPremRedirectionDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy prem redirection details.
	*
	* @param primaryKey the primary key of this policy prem redirection details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policyPremRedirectionDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details.
	*
	* @return the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details
	*/
	@Override
	public int getPREM_REDIRECTION_ID() {
		return _policyPremRedirectionDetails.getPREM_REDIRECTION_ID();
	}

	/**
	* Sets the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details.
	*
	* @param PREM_REDIRECTION_ID the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details
	*/
	@Override
	public void setPREM_REDIRECTION_ID(int PREM_REDIRECTION_ID) {
		_policyPremRedirectionDetails.setPREM_REDIRECTION_ID(PREM_REDIRECTION_ID);
	}

	/**
	* Returns the p o l i c y_ i d of this policy prem redirection details.
	*
	* @return the p o l i c y_ i d of this policy prem redirection details
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyPremRedirectionDetails.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy prem redirection details.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy prem redirection details
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyPremRedirectionDetails.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details.
	*
	* @return the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details
	*/
	@Override
	public int getTRANSACTION_AUDIT_ID() {
		return _policyPremRedirectionDetails.getTRANSACTION_AUDIT_ID();
	}

	/**
	* Sets the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details.
	*
	* @param TRANSACTION_AUDIT_ID the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details
	*/
	@Override
	public void setTRANSACTION_AUDIT_ID(int TRANSACTION_AUDIT_ID) {
		_policyPremRedirectionDetails.setTRANSACTION_AUDIT_ID(TRANSACTION_AUDIT_ID);
	}

	/**
	* Returns the f u n d_ c o d e of this policy prem redirection details.
	*
	* @return the f u n d_ c o d e of this policy prem redirection details
	*/
	@Override
	public java.lang.String getFUND_CODE() {
		return _policyPremRedirectionDetails.getFUND_CODE();
	}

	/**
	* Sets the f u n d_ c o d e of this policy prem redirection details.
	*
	* @param FUND_CODE the f u n d_ c o d e of this policy prem redirection details
	*/
	@Override
	public void setFUND_CODE(java.lang.String FUND_CODE) {
		_policyPremRedirectionDetails.setFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details.
	*
	* @return the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details
	*/
	@Override
	public double getALLOCATION_PERCENTAGE() {
		return _policyPremRedirectionDetails.getALLOCATION_PERCENTAGE();
	}

	/**
	* Sets the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details.
	*
	* @param ALLOCATION_PERCENTAGE the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details
	*/
	@Override
	public void setALLOCATION_PERCENTAGE(double ALLOCATION_PERCENTAGE) {
		_policyPremRedirectionDetails.setALLOCATION_PERCENTAGE(ALLOCATION_PERCENTAGE);
	}

	/**
	* Returns the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details.
	*
	* @return the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details
	*/
	@Override
	public java.lang.String getSENT_TO_ODS_FLAG() {
		return _policyPremRedirectionDetails.getSENT_TO_ODS_FLAG();
	}

	/**
	* Sets the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details.
	*
	* @param SENT_TO_ODS_FLAG the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details
	*/
	@Override
	public void setSENT_TO_ODS_FLAG(java.lang.String SENT_TO_ODS_FLAG) {
		_policyPremRedirectionDetails.setSENT_TO_ODS_FLAG(SENT_TO_ODS_FLAG);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this policy prem redirection details.
	*
	* @return the i n s e r t e d_ d a t e of this policy prem redirection details
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _policyPremRedirectionDetails.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this policy prem redirection details.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this policy prem redirection details
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_policyPremRedirectionDetails.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this policy prem redirection details.
	*
	* @return the i n s e r t e d_ b y of this policy prem redirection details
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _policyPremRedirectionDetails.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this policy prem redirection details.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this policy prem redirection details
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_policyPremRedirectionDetails.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this policy prem redirection details.
	*
	* @return the u p d a t e d_ d a t e of this policy prem redirection details
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _policyPremRedirectionDetails.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this policy prem redirection details.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this policy prem redirection details
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_policyPremRedirectionDetails.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this policy prem redirection details.
	*
	* @return the u p d a t e d_ b y of this policy prem redirection details
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _policyPremRedirectionDetails.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this policy prem redirection details.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this policy prem redirection details
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_policyPremRedirectionDetails.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _policyPremRedirectionDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyPremRedirectionDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyPremRedirectionDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyPremRedirectionDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyPremRedirectionDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyPremRedirectionDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyPremRedirectionDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyPremRedirectionDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyPremRedirectionDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyPremRedirectionDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyPremRedirectionDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyPremRedirectionDetailsWrapper((PolicyPremRedirectionDetails)_policyPremRedirectionDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		return _policyPremRedirectionDetails.compareTo(policyPremRedirectionDetails);
	}

	@Override
	public int hashCode() {
		return _policyPremRedirectionDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyPremRedirectionDetails> toCacheModel() {
		return _policyPremRedirectionDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails toEscapedModel() {
		return new PolicyPremRedirectionDetailsWrapper(_policyPremRedirectionDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails toUnescapedModel() {
		return new PolicyPremRedirectionDetailsWrapper(_policyPremRedirectionDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyPremRedirectionDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyPremRedirectionDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyPremRedirectionDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyPremRedirectionDetailsWrapper)) {
			return false;
		}

		PolicyPremRedirectionDetailsWrapper policyPremRedirectionDetailsWrapper = (PolicyPremRedirectionDetailsWrapper)obj;

		if (Validator.equals(_policyPremRedirectionDetails,
					policyPremRedirectionDetailsWrapper._policyPremRedirectionDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyPremRedirectionDetails getWrappedPolicyPremRedirectionDetails() {
		return _policyPremRedirectionDetails;
	}

	@Override
	public PolicyPremRedirectionDetails getWrappedModel() {
		return _policyPremRedirectionDetails;
	}

	@Override
	public void resetOriginalValues() {
		_policyPremRedirectionDetails.resetOriginalValues();
	}

	private PolicyPremRedirectionDetails _policyPremRedirectionDetails;
}