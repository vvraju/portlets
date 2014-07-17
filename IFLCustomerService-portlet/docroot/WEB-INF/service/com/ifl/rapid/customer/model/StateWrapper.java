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

package com.ifl.rapid.customer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link State}.
 * </p>
 *
 * @author Satya Kola
 * @see State
 * @generated
 */
public class StateWrapper implements State, ModelWrapper<State> {
	public StateWrapper(State state) {
		_state = state;
	}

	@Override
	public Class<?> getModelClass() {
		return State.class;
	}

	@Override
	public String getModelClassName() {
		return State.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("StateId", getStateId());
		attributes.put("StateCode", getStateCode());
		attributes.put("StateName", getStateName());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		String StateCode = (String)attributes.get("StateCode");

		if (StateCode != null) {
			setStateCode(StateCode);
		}

		String StateName = (String)attributes.get("StateName");

		if (StateName != null) {
			setStateName(StateName);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	/**
	* Returns the primary key of this state.
	*
	* @return the primary key of this state
	*/
	@Override
	public int getPrimaryKey() {
		return _state.getPrimaryKey();
	}

	/**
	* Sets the primary key of this state.
	*
	* @param primaryKey the primary key of this state
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_state.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the state ID of this state.
	*
	* @return the state ID of this state
	*/
	@Override
	public int getStateId() {
		return _state.getStateId();
	}

	/**
	* Sets the state ID of this state.
	*
	* @param StateId the state ID of this state
	*/
	@Override
	public void setStateId(int StateId) {
		_state.setStateId(StateId);
	}

	/**
	* Returns the state code of this state.
	*
	* @return the state code of this state
	*/
	@Override
	public java.lang.String getStateCode() {
		return _state.getStateCode();
	}

	/**
	* Sets the state code of this state.
	*
	* @param StateCode the state code of this state
	*/
	@Override
	public void setStateCode(java.lang.String StateCode) {
		_state.setStateCode(StateCode);
	}

	/**
	* Returns the state name of this state.
	*
	* @return the state name of this state
	*/
	@Override
	public java.lang.String getStateName() {
		return _state.getStateName();
	}

	/**
	* Sets the state name of this state.
	*
	* @param StateName the state name of this state
	*/
	@Override
	public void setStateName(java.lang.String StateName) {
		_state.setStateName(StateName);
	}

	/**
	* Returns the is active of this state.
	*
	* @return the is active of this state
	*/
	@Override
	public int getIsActive() {
		return _state.getIsActive();
	}

	/**
	* Sets the is active of this state.
	*
	* @param IsActive the is active of this state
	*/
	@Override
	public void setIsActive(int IsActive) {
		_state.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this state.
	*
	* @return the created by of this state
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _state.getCreatedBy();
	}

	/**
	* Sets the created by of this state.
	*
	* @param CreatedBy the created by of this state
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_state.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this state.
	*
	* @return the created date of this state
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _state.getCreatedDate();
	}

	/**
	* Sets the created date of this state.
	*
	* @param CreatedDate the created date of this state
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_state.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this state.
	*
	* @return the modified date of this state
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _state.getModifiedDate();
	}

	/**
	* Sets the modified date of this state.
	*
	* @param ModifiedDate the modified date of this state
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_state.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this state.
	*
	* @return the modified by of this state
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _state.getModifiedBy();
	}

	/**
	* Sets the modified by of this state.
	*
	* @param ModifiedBy the modified by of this state
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_state.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _state.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_state.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _state.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_state.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _state.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _state.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_state.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _state.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_state.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_state.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_state.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StateWrapper((State)_state.clone());
	}

	@Override
	public int compareTo(com.ifl.rapid.customer.model.State state) {
		return _state.compareTo(state);
	}

	@Override
	public int hashCode() {
		return _state.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.State> toCacheModel() {
		return _state.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.State toEscapedModel() {
		return new StateWrapper(_state.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.State toUnescapedModel() {
		return new StateWrapper(_state.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _state.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _state.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_state.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StateWrapper)) {
			return false;
		}

		StateWrapper stateWrapper = (StateWrapper)obj;

		if (Validator.equals(_state, stateWrapper._state)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public State getWrappedState() {
		return _state;
	}

	@Override
	public State getWrappedModel() {
		return _state;
	}

	@Override
	public void resetOriginalValues() {
		_state.resetOriginalValues();
	}

	private State _state;
}