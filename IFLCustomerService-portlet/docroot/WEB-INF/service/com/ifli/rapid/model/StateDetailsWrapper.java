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
 * This class is a wrapper for {@link StateDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see StateDetails
 * @generated
 */
public class StateDetailsWrapper implements StateDetails,
	ModelWrapper<StateDetails> {
	public StateDetailsWrapper(StateDetails stateDetails) {
		_stateDetails = stateDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return StateDetails.class;
	}

	@Override
	public String getModelClassName() {
		return StateDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("STATE_NAME", getSTATE_NAME());
		attributes.put("STATE_CODE", getSTATE_CODE());
		attributes.put("BRANCH_FLAG", getBRANCH_FLAG());
		attributes.put("MEDICAL_CENTER_FLAG", getMEDICAL_CENTER_FLAG());
		attributes.put("DROP_BOX_FLAG", getDROP_BOX_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String STATE_NAME = (String)attributes.get("STATE_NAME");

		if (STATE_NAME != null) {
			setSTATE_NAME(STATE_NAME);
		}

		String STATE_CODE = (String)attributes.get("STATE_CODE");

		if (STATE_CODE != null) {
			setSTATE_CODE(STATE_CODE);
		}

		String BRANCH_FLAG = (String)attributes.get("BRANCH_FLAG");

		if (BRANCH_FLAG != null) {
			setBRANCH_FLAG(BRANCH_FLAG);
		}

		String MEDICAL_CENTER_FLAG = (String)attributes.get(
				"MEDICAL_CENTER_FLAG");

		if (MEDICAL_CENTER_FLAG != null) {
			setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
		}

		String DROP_BOX_FLAG = (String)attributes.get("DROP_BOX_FLAG");

		if (DROP_BOX_FLAG != null) {
			setDROP_BOX_FLAG(DROP_BOX_FLAG);
		}
	}

	/**
	* Returns the primary key of this state details.
	*
	* @return the primary key of this state details
	*/
	@Override
	public int getPrimaryKey() {
		return _stateDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this state details.
	*
	* @param primaryKey the primary key of this state details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_stateDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the s t a t e_ i d of this state details.
	*
	* @return the s t a t e_ i d of this state details
	*/
	@Override
	public int getSTATE_ID() {
		return _stateDetails.getSTATE_ID();
	}

	/**
	* Sets the s t a t e_ i d of this state details.
	*
	* @param STATE_ID the s t a t e_ i d of this state details
	*/
	@Override
	public void setSTATE_ID(int STATE_ID) {
		_stateDetails.setSTATE_ID(STATE_ID);
	}

	/**
	* Returns the s t a t e_ n a m e of this state details.
	*
	* @return the s t a t e_ n a m e of this state details
	*/
	@Override
	public java.lang.String getSTATE_NAME() {
		return _stateDetails.getSTATE_NAME();
	}

	/**
	* Sets the s t a t e_ n a m e of this state details.
	*
	* @param STATE_NAME the s t a t e_ n a m e of this state details
	*/
	@Override
	public void setSTATE_NAME(java.lang.String STATE_NAME) {
		_stateDetails.setSTATE_NAME(STATE_NAME);
	}

	/**
	* Returns the s t a t e_ c o d e of this state details.
	*
	* @return the s t a t e_ c o d e of this state details
	*/
	@Override
	public java.lang.String getSTATE_CODE() {
		return _stateDetails.getSTATE_CODE();
	}

	/**
	* Sets the s t a t e_ c o d e of this state details.
	*
	* @param STATE_CODE the s t a t e_ c o d e of this state details
	*/
	@Override
	public void setSTATE_CODE(java.lang.String STATE_CODE) {
		_stateDetails.setSTATE_CODE(STATE_CODE);
	}

	/**
	* Returns the b r a n c h_ f l a g of this state details.
	*
	* @return the b r a n c h_ f l a g of this state details
	*/
	@Override
	public java.lang.String getBRANCH_FLAG() {
		return _stateDetails.getBRANCH_FLAG();
	}

	/**
	* Sets the b r a n c h_ f l a g of this state details.
	*
	* @param BRANCH_FLAG the b r a n c h_ f l a g of this state details
	*/
	@Override
	public void setBRANCH_FLAG(java.lang.String BRANCH_FLAG) {
		_stateDetails.setBRANCH_FLAG(BRANCH_FLAG);
	}

	/**
	* Returns the m e d i c a l_ c e n t e r_ f l a g of this state details.
	*
	* @return the m e d i c a l_ c e n t e r_ f l a g of this state details
	*/
	@Override
	public java.lang.String getMEDICAL_CENTER_FLAG() {
		return _stateDetails.getMEDICAL_CENTER_FLAG();
	}

	/**
	* Sets the m e d i c a l_ c e n t e r_ f l a g of this state details.
	*
	* @param MEDICAL_CENTER_FLAG the m e d i c a l_ c e n t e r_ f l a g of this state details
	*/
	@Override
	public void setMEDICAL_CENTER_FLAG(java.lang.String MEDICAL_CENTER_FLAG) {
		_stateDetails.setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
	}

	/**
	* Returns the d r o p_ b o x_ f l a g of this state details.
	*
	* @return the d r o p_ b o x_ f l a g of this state details
	*/
	@Override
	public java.lang.String getDROP_BOX_FLAG() {
		return _stateDetails.getDROP_BOX_FLAG();
	}

	/**
	* Sets the d r o p_ b o x_ f l a g of this state details.
	*
	* @param DROP_BOX_FLAG the d r o p_ b o x_ f l a g of this state details
	*/
	@Override
	public void setDROP_BOX_FLAG(java.lang.String DROP_BOX_FLAG) {
		_stateDetails.setDROP_BOX_FLAG(DROP_BOX_FLAG);
	}

	@Override
	public boolean isNew() {
		return _stateDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_stateDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _stateDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_stateDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _stateDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _stateDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_stateDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _stateDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_stateDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_stateDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_stateDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StateDetailsWrapper((StateDetails)_stateDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.StateDetails stateDetails) {
		return _stateDetails.compareTo(stateDetails);
	}

	@Override
	public int hashCode() {
		return _stateDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.StateDetails> toCacheModel() {
		return _stateDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.StateDetails toEscapedModel() {
		return new StateDetailsWrapper(_stateDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.StateDetails toUnescapedModel() {
		return new StateDetailsWrapper(_stateDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _stateDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _stateDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_stateDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StateDetailsWrapper)) {
			return false;
		}

		StateDetailsWrapper stateDetailsWrapper = (StateDetailsWrapper)obj;

		if (Validator.equals(_stateDetails, stateDetailsWrapper._stateDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StateDetails getWrappedStateDetails() {
		return _stateDetails;
	}

	@Override
	public StateDetails getWrappedModel() {
		return _stateDetails;
	}

	@Override
	public void resetOriginalValues() {
		_stateDetails.resetOriginalValues();
	}

	private StateDetails _stateDetails;
}