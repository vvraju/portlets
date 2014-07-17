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
 * This class is a wrapper for {@link customerMailIds}.
 * </p>
 *
 * @author Satya Kola
 * @see customerMailIds
 * @generated
 */
public class customerMailIdsWrapper implements customerMailIds,
	ModelWrapper<customerMailIds> {
	public customerMailIdsWrapper(customerMailIds customerMailIds) {
		_customerMailIds = customerMailIds;
	}

	@Override
	public Class<?> getModelClass() {
		return customerMailIds.class;
	}

	@Override
	public String getModelClassName() {
		return customerMailIds.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("EMAIL_ID", getEMAIL_ID());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String EMAIL_ID = (String)attributes.get("EMAIL_ID");

		if (EMAIL_ID != null) {
			setEMAIL_ID(EMAIL_ID);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	/**
	* Returns the primary key of this customer mail IDs.
	*
	* @return the primary key of this customer mail IDs
	*/
	@Override
	public int getPrimaryKey() {
		return _customerMailIds.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer mail IDs.
	*
	* @param primaryKey the primary key of this customer mail IDs
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customerMailIds.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this customer mail IDs.
	*
	* @return the i d of this customer mail IDs
	*/
	@Override
	public int getID() {
		return _customerMailIds.getID();
	}

	/**
	* Sets the i d of this customer mail IDs.
	*
	* @param ID the i d of this customer mail IDs
	*/
	@Override
	public void setID(int ID) {
		_customerMailIds.setID(ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer mail IDs.
	*
	* @return the c u s t o m e r_ i d of this customer mail IDs
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _customerMailIds.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer mail IDs.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer mail IDs
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_customerMailIds.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the e m a i l_ i d of this customer mail IDs.
	*
	* @return the e m a i l_ i d of this customer mail IDs
	*/
	@Override
	public java.lang.String getEMAIL_ID() {
		return _customerMailIds.getEMAIL_ID();
	}

	/**
	* Sets the e m a i l_ i d of this customer mail IDs.
	*
	* @param EMAIL_ID the e m a i l_ i d of this customer mail IDs
	*/
	@Override
	public void setEMAIL_ID(java.lang.String EMAIL_ID) {
		_customerMailIds.setEMAIL_ID(EMAIL_ID);
	}

	/**
	* Returns the i n s e r t e d_ b y of this customer mail IDs.
	*
	* @return the i n s e r t e d_ b y of this customer mail IDs
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _customerMailIds.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this customer mail IDs.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this customer mail IDs
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_customerMailIds.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this customer mail IDs.
	*
	* @return the i n s e r t e d_ d a t e of this customer mail IDs
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _customerMailIds.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this customer mail IDs.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this customer mail IDs
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_customerMailIds.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this customer mail IDs.
	*
	* @return the u p d a t e d_ b y of this customer mail IDs
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _customerMailIds.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this customer mail IDs.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this customer mail IDs
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_customerMailIds.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this customer mail IDs.
	*
	* @return the u p d a t e d_ d a t e of this customer mail IDs
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _customerMailIds.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this customer mail IDs.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this customer mail IDs
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_customerMailIds.setUPDATED_DATE(UPDATED_DATE);
	}

	@Override
	public boolean isNew() {
		return _customerMailIds.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerMailIds.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerMailIds.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerMailIds.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerMailIds.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerMailIds.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerMailIds.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerMailIds.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerMailIds.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerMailIds.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerMailIds.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new customerMailIdsWrapper((customerMailIds)_customerMailIds.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.customerMailIds customerMailIds) {
		return _customerMailIds.compareTo(customerMailIds);
	}

	@Override
	public int hashCode() {
		return _customerMailIds.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.customerMailIds> toCacheModel() {
		return _customerMailIds.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.customerMailIds toEscapedModel() {
		return new customerMailIdsWrapper(_customerMailIds.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.customerMailIds toUnescapedModel() {
		return new customerMailIdsWrapper(_customerMailIds.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerMailIds.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerMailIds.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerMailIds.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customerMailIdsWrapper)) {
			return false;
		}

		customerMailIdsWrapper customerMailIdsWrapper = (customerMailIdsWrapper)obj;

		if (Validator.equals(_customerMailIds,
					customerMailIdsWrapper._customerMailIds)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public customerMailIds getWrappedcustomerMailIds() {
		return _customerMailIds;
	}

	@Override
	public customerMailIds getWrappedModel() {
		return _customerMailIds;
	}

	@Override
	public void resetOriginalValues() {
		_customerMailIds.resetOriginalValues();
	}

	private customerMailIds _customerMailIds;
}