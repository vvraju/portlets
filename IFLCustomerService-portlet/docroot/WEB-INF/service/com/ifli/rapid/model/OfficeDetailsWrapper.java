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
 * This class is a wrapper for {@link OfficeDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see OfficeDetails
 * @generated
 */
public class OfficeDetailsWrapper implements OfficeDetails,
	ModelWrapper<OfficeDetails> {
	public OfficeDetailsWrapper(OfficeDetails officeDetails) {
		_officeDetails = officeDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return OfficeDetails.class;
	}

	@Override
	public String getModelClassName() {
		return OfficeDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("OFFICE_ID", getOFFICE_ID());
		attributes.put("OFFICE_NAME", getOFFICE_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer OFFICE_ID = (Integer)attributes.get("OFFICE_ID");

		if (OFFICE_ID != null) {
			setOFFICE_ID(OFFICE_ID);
		}

		String OFFICE_NAME = (String)attributes.get("OFFICE_NAME");

		if (OFFICE_NAME != null) {
			setOFFICE_NAME(OFFICE_NAME);
		}
	}

	/**
	* Returns the primary key of this office details.
	*
	* @return the primary key of this office details
	*/
	@Override
	public int getPrimaryKey() {
		return _officeDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this office details.
	*
	* @param primaryKey the primary key of this office details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_officeDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the o f f i c e_ i d of this office details.
	*
	* @return the o f f i c e_ i d of this office details
	*/
	@Override
	public int getOFFICE_ID() {
		return _officeDetails.getOFFICE_ID();
	}

	/**
	* Sets the o f f i c e_ i d of this office details.
	*
	* @param OFFICE_ID the o f f i c e_ i d of this office details
	*/
	@Override
	public void setOFFICE_ID(int OFFICE_ID) {
		_officeDetails.setOFFICE_ID(OFFICE_ID);
	}

	/**
	* Returns the o f f i c e_ n a m e of this office details.
	*
	* @return the o f f i c e_ n a m e of this office details
	*/
	@Override
	public java.lang.String getOFFICE_NAME() {
		return _officeDetails.getOFFICE_NAME();
	}

	/**
	* Sets the o f f i c e_ n a m e of this office details.
	*
	* @param OFFICE_NAME the o f f i c e_ n a m e of this office details
	*/
	@Override
	public void setOFFICE_NAME(java.lang.String OFFICE_NAME) {
		_officeDetails.setOFFICE_NAME(OFFICE_NAME);
	}

	@Override
	public boolean isNew() {
		return _officeDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_officeDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _officeDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_officeDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _officeDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _officeDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_officeDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _officeDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_officeDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_officeDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_officeDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OfficeDetailsWrapper((OfficeDetails)_officeDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.OfficeDetails officeDetails) {
		return _officeDetails.compareTo(officeDetails);
	}

	@Override
	public int hashCode() {
		return _officeDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.OfficeDetails> toCacheModel() {
		return _officeDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.OfficeDetails toEscapedModel() {
		return new OfficeDetailsWrapper(_officeDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.OfficeDetails toUnescapedModel() {
		return new OfficeDetailsWrapper(_officeDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _officeDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _officeDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_officeDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfficeDetailsWrapper)) {
			return false;
		}

		OfficeDetailsWrapper officeDetailsWrapper = (OfficeDetailsWrapper)obj;

		if (Validator.equals(_officeDetails, officeDetailsWrapper._officeDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OfficeDetails getWrappedOfficeDetails() {
		return _officeDetails;
	}

	@Override
	public OfficeDetails getWrappedModel() {
		return _officeDetails;
	}

	@Override
	public void resetOriginalValues() {
		_officeDetails.resetOriginalValues();
	}

	private OfficeDetails _officeDetails;
}