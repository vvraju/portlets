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
 * This class is a wrapper for {@link ProofDocs}.
 * </p>
 *
 * @author Satya Kola
 * @see ProofDocs
 * @generated
 */
public class ProofDocsWrapper implements ProofDocs, ModelWrapper<ProofDocs> {
	public ProofDocsWrapper(ProofDocs proofDocs) {
		_proofDocs = proofDocs;
	}

	@Override
	public Class<?> getModelClass() {
		return ProofDocs.class;
	}

	@Override
	public String getModelClassName() {
		return ProofDocs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("DOC_TYPE", getDOC_TYPE());
		attributes.put("DOC_NAME", getDOC_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ID = (Long)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String DOC_TYPE = (String)attributes.get("DOC_TYPE");

		if (DOC_TYPE != null) {
			setDOC_TYPE(DOC_TYPE);
		}

		String DOC_NAME = (String)attributes.get("DOC_NAME");

		if (DOC_NAME != null) {
			setDOC_NAME(DOC_NAME);
		}
	}

	/**
	* Returns the primary key of this proof docs.
	*
	* @return the primary key of this proof docs
	*/
	@Override
	public long getPrimaryKey() {
		return _proofDocs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this proof docs.
	*
	* @param primaryKey the primary key of this proof docs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_proofDocs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this proof docs.
	*
	* @return the i d of this proof docs
	*/
	@Override
	public long getID() {
		return _proofDocs.getID();
	}

	/**
	* Sets the i d of this proof docs.
	*
	* @param ID the i d of this proof docs
	*/
	@Override
	public void setID(long ID) {
		_proofDocs.setID(ID);
	}

	/**
	* Returns the d o c_ t y p e of this proof docs.
	*
	* @return the d o c_ t y p e of this proof docs
	*/
	@Override
	public java.lang.String getDOC_TYPE() {
		return _proofDocs.getDOC_TYPE();
	}

	/**
	* Sets the d o c_ t y p e of this proof docs.
	*
	* @param DOC_TYPE the d o c_ t y p e of this proof docs
	*/
	@Override
	public void setDOC_TYPE(java.lang.String DOC_TYPE) {
		_proofDocs.setDOC_TYPE(DOC_TYPE);
	}

	/**
	* Returns the d o c_ n a m e of this proof docs.
	*
	* @return the d o c_ n a m e of this proof docs
	*/
	@Override
	public java.lang.String getDOC_NAME() {
		return _proofDocs.getDOC_NAME();
	}

	/**
	* Sets the d o c_ n a m e of this proof docs.
	*
	* @param DOC_NAME the d o c_ n a m e of this proof docs
	*/
	@Override
	public void setDOC_NAME(java.lang.String DOC_NAME) {
		_proofDocs.setDOC_NAME(DOC_NAME);
	}

	@Override
	public boolean isNew() {
		return _proofDocs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_proofDocs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _proofDocs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_proofDocs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _proofDocs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _proofDocs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_proofDocs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _proofDocs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_proofDocs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_proofDocs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_proofDocs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProofDocsWrapper((ProofDocs)_proofDocs.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.ProofDocs proofDocs) {
		return _proofDocs.compareTo(proofDocs);
	}

	@Override
	public int hashCode() {
		return _proofDocs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ProofDocs> toCacheModel() {
		return _proofDocs.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ProofDocs toEscapedModel() {
		return new ProofDocsWrapper(_proofDocs.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ProofDocs toUnescapedModel() {
		return new ProofDocsWrapper(_proofDocs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _proofDocs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _proofDocs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_proofDocs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProofDocsWrapper)) {
			return false;
		}

		ProofDocsWrapper proofDocsWrapper = (ProofDocsWrapper)obj;

		if (Validator.equals(_proofDocs, proofDocsWrapper._proofDocs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProofDocs getWrappedProofDocs() {
		return _proofDocs;
	}

	@Override
	public ProofDocs getWrappedModel() {
		return _proofDocs;
	}

	@Override
	public void resetOriginalValues() {
		_proofDocs.resetOriginalValues();
	}

	private ProofDocs _proofDocs;
}