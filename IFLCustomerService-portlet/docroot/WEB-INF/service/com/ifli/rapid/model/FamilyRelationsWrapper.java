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
 * This class is a wrapper for {@link FamilyRelations}.
 * </p>
 *
 * @author Satya Kola
 * @see FamilyRelations
 * @generated
 */
public class FamilyRelationsWrapper implements FamilyRelations,
	ModelWrapper<FamilyRelations> {
	public FamilyRelationsWrapper(FamilyRelations familyRelations) {
		_familyRelations = familyRelations;
	}

	@Override
	public Class<?> getModelClass() {
		return FamilyRelations.class;
	}

	@Override
	public String getModelClassName() {
		return FamilyRelations.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RELATION_ID", getRELATION_ID());
		attributes.put("RELATION_NAME", getRELATION_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer RELATION_ID = (Integer)attributes.get("RELATION_ID");

		if (RELATION_ID != null) {
			setRELATION_ID(RELATION_ID);
		}

		String RELATION_NAME = (String)attributes.get("RELATION_NAME");

		if (RELATION_NAME != null) {
			setRELATION_NAME(RELATION_NAME);
		}
	}

	/**
	* Returns the primary key of this family relations.
	*
	* @return the primary key of this family relations
	*/
	@Override
	public int getPrimaryKey() {
		return _familyRelations.getPrimaryKey();
	}

	/**
	* Sets the primary key of this family relations.
	*
	* @param primaryKey the primary key of this family relations
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_familyRelations.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the r e l a t i o n_ i d of this family relations.
	*
	* @return the r e l a t i o n_ i d of this family relations
	*/
	@Override
	public int getRELATION_ID() {
		return _familyRelations.getRELATION_ID();
	}

	/**
	* Sets the r e l a t i o n_ i d of this family relations.
	*
	* @param RELATION_ID the r e l a t i o n_ i d of this family relations
	*/
	@Override
	public void setRELATION_ID(int RELATION_ID) {
		_familyRelations.setRELATION_ID(RELATION_ID);
	}

	/**
	* Returns the r e l a t i o n_ n a m e of this family relations.
	*
	* @return the r e l a t i o n_ n a m e of this family relations
	*/
	@Override
	public java.lang.String getRELATION_NAME() {
		return _familyRelations.getRELATION_NAME();
	}

	/**
	* Sets the r e l a t i o n_ n a m e of this family relations.
	*
	* @param RELATION_NAME the r e l a t i o n_ n a m e of this family relations
	*/
	@Override
	public void setRELATION_NAME(java.lang.String RELATION_NAME) {
		_familyRelations.setRELATION_NAME(RELATION_NAME);
	}

	@Override
	public boolean isNew() {
		return _familyRelations.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_familyRelations.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _familyRelations.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_familyRelations.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _familyRelations.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _familyRelations.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_familyRelations.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _familyRelations.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_familyRelations.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_familyRelations.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_familyRelations.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FamilyRelationsWrapper((FamilyRelations)_familyRelations.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.FamilyRelations familyRelations) {
		return _familyRelations.compareTo(familyRelations);
	}

	@Override
	public int hashCode() {
		return _familyRelations.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.FamilyRelations> toCacheModel() {
		return _familyRelations.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.FamilyRelations toEscapedModel() {
		return new FamilyRelationsWrapper(_familyRelations.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.FamilyRelations toUnescapedModel() {
		return new FamilyRelationsWrapper(_familyRelations.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _familyRelations.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _familyRelations.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_familyRelations.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FamilyRelationsWrapper)) {
			return false;
		}

		FamilyRelationsWrapper familyRelationsWrapper = (FamilyRelationsWrapper)obj;

		if (Validator.equals(_familyRelations,
					familyRelationsWrapper._familyRelations)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FamilyRelations getWrappedFamilyRelations() {
		return _familyRelations;
	}

	@Override
	public FamilyRelations getWrappedModel() {
		return _familyRelations;
	}

	@Override
	public void resetOriginalValues() {
		_familyRelations.resetOriginalValues();
	}

	private FamilyRelations _familyRelations;
}