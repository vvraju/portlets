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
 * This class is a wrapper for {@link POLICY_DOC_TYPES}.
 * </p>
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPES
 * @generated
 */
public class POLICY_DOC_TYPESWrapper implements POLICY_DOC_TYPES,
	ModelWrapper<POLICY_DOC_TYPES> {
	public POLICY_DOC_TYPESWrapper(POLICY_DOC_TYPES policy_doc_types) {
		_policy_doc_types = policy_doc_types;
	}

	@Override
	public Class<?> getModelClass() {
		return POLICY_DOC_TYPES.class;
	}

	@Override
	public String getModelClassName() {
		return POLICY_DOC_TYPES.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("DOC_NAME", getDOC_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String DOC_NAME = (String)attributes.get("DOC_NAME");

		if (DOC_NAME != null) {
			setDOC_NAME(DOC_NAME);
		}
	}

	/**
	* Returns the primary key of this p o l i c y_ d o c_ t y p e s.
	*
	* @return the primary key of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public int getPrimaryKey() {
		return _policy_doc_types.getPrimaryKey();
	}

	/**
	* Sets the primary key of this p o l i c y_ d o c_ t y p e s.
	*
	* @param primaryKey the primary key of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_policy_doc_types.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this p o l i c y_ d o c_ t y p e s.
	*
	* @return the i d of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public int getID() {
		return _policy_doc_types.getID();
	}

	/**
	* Sets the i d of this p o l i c y_ d o c_ t y p e s.
	*
	* @param ID the i d of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public void setID(int ID) {
		_policy_doc_types.setID(ID);
	}

	/**
	* Returns the d o c_ n a m e of this p o l i c y_ d o c_ t y p e s.
	*
	* @return the d o c_ n a m e of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public java.lang.String getDOC_NAME() {
		return _policy_doc_types.getDOC_NAME();
	}

	/**
	* Sets the d o c_ n a m e of this p o l i c y_ d o c_ t y p e s.
	*
	* @param DOC_NAME the d o c_ n a m e of this p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public void setDOC_NAME(java.lang.String DOC_NAME) {
		_policy_doc_types.setDOC_NAME(DOC_NAME);
	}

	@Override
	public boolean isNew() {
		return _policy_doc_types.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policy_doc_types.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policy_doc_types.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policy_doc_types.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policy_doc_types.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policy_doc_types.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policy_doc_types.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policy_doc_types.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policy_doc_types.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policy_doc_types.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policy_doc_types.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new POLICY_DOC_TYPESWrapper((POLICY_DOC_TYPES)_policy_doc_types.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types) {
		return _policy_doc_types.compareTo(policy_doc_types);
	}

	@Override
	public int hashCode() {
		return _policy_doc_types.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.POLICY_DOC_TYPES> toCacheModel() {
		return _policy_doc_types.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES toEscapedModel() {
		return new POLICY_DOC_TYPESWrapper(_policy_doc_types.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES toUnescapedModel() {
		return new POLICY_DOC_TYPESWrapper(_policy_doc_types.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policy_doc_types.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policy_doc_types.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policy_doc_types.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof POLICY_DOC_TYPESWrapper)) {
			return false;
		}

		POLICY_DOC_TYPESWrapper policy_doc_typesWrapper = (POLICY_DOC_TYPESWrapper)obj;

		if (Validator.equals(_policy_doc_types,
					policy_doc_typesWrapper._policy_doc_types)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public POLICY_DOC_TYPES getWrappedPOLICY_DOC_TYPES() {
		return _policy_doc_types;
	}

	@Override
	public POLICY_DOC_TYPES getWrappedModel() {
		return _policy_doc_types;
	}

	@Override
	public void resetOriginalValues() {
		_policy_doc_types.resetOriginalValues();
	}

	private POLICY_DOC_TYPES _policy_doc_types;
}