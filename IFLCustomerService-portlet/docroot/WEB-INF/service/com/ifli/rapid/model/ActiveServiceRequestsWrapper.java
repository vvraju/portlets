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
 * This class is a wrapper for {@link ActiveServiceRequests}.
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequests
 * @generated
 */
public class ActiveServiceRequestsWrapper implements ActiveServiceRequests,
	ModelWrapper<ActiveServiceRequests> {
	public ActiveServiceRequestsWrapper(
		ActiveServiceRequests activeServiceRequests) {
		_activeServiceRequests = activeServiceRequests;
	}

	@Override
	public Class<?> getModelClass() {
		return ActiveServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return ActiveServiceRequests.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("TYPE_ID", getTYPE_ID());
		attributes.put("SUB_TYPE_ID", getSUB_TYPE_ID());
		attributes.put("ASSIGNED_TO", getASSIGNED_TO());
		attributes.put("HANDLED_BY", getHANDLED_BY());
		attributes.put("STATUS_ID", getSTATUS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUST_SR_NUMBER", getCUST_SR_NUMBER());
		attributes.put("ADDITIONAL_DATA_XML", getADDITIONAL_DATA_XML());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		Integer TYPE_ID = (Integer)attributes.get("TYPE_ID");

		if (TYPE_ID != null) {
			setTYPE_ID(TYPE_ID);
		}

		Integer SUB_TYPE_ID = (Integer)attributes.get("SUB_TYPE_ID");

		if (SUB_TYPE_ID != null) {
			setSUB_TYPE_ID(SUB_TYPE_ID);
		}

		Integer ASSIGNED_TO = (Integer)attributes.get("ASSIGNED_TO");

		if (ASSIGNED_TO != null) {
			setASSIGNED_TO(ASSIGNED_TO);
		}

		Integer HANDLED_BY = (Integer)attributes.get("HANDLED_BY");

		if (HANDLED_BY != null) {
			setHANDLED_BY(HANDLED_BY);
		}

		Integer STATUS_ID = (Integer)attributes.get("STATUS_ID");

		if (STATUS_ID != null) {
			setSTATUS_ID(STATUS_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String CUST_SR_NUMBER = (String)attributes.get("CUST_SR_NUMBER");

		if (CUST_SR_NUMBER != null) {
			setCUST_SR_NUMBER(CUST_SR_NUMBER);
		}

		String ADDITIONAL_DATA_XML = (String)attributes.get(
				"ADDITIONAL_DATA_XML");

		if (ADDITIONAL_DATA_XML != null) {
			setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
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
	* Returns the primary key of this active service requests.
	*
	* @return the primary key of this active service requests
	*/
	@Override
	public int getPrimaryKey() {
		return _activeServiceRequests.getPrimaryKey();
	}

	/**
	* Sets the primary key of this active service requests.
	*
	* @param primaryKey the primary key of this active service requests
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_activeServiceRequests.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ a s r_ i d of this active service requests.
	*
	* @return the q r c_ a s r_ i d of this active service requests
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _activeServiceRequests.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this active service requests.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this active service requests
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_activeServiceRequests.setQRC_ASR_ID(QRC_ASR_ID);
	}

	/**
	* Returns the t y p e_ i d of this active service requests.
	*
	* @return the t y p e_ i d of this active service requests
	*/
	@Override
	public int getTYPE_ID() {
		return _activeServiceRequests.getTYPE_ID();
	}

	/**
	* Sets the t y p e_ i d of this active service requests.
	*
	* @param TYPE_ID the t y p e_ i d of this active service requests
	*/
	@Override
	public void setTYPE_ID(int TYPE_ID) {
		_activeServiceRequests.setTYPE_ID(TYPE_ID);
	}

	/**
	* Returns the s u b_ t y p e_ i d of this active service requests.
	*
	* @return the s u b_ t y p e_ i d of this active service requests
	*/
	@Override
	public int getSUB_TYPE_ID() {
		return _activeServiceRequests.getSUB_TYPE_ID();
	}

	/**
	* Sets the s u b_ t y p e_ i d of this active service requests.
	*
	* @param SUB_TYPE_ID the s u b_ t y p e_ i d of this active service requests
	*/
	@Override
	public void setSUB_TYPE_ID(int SUB_TYPE_ID) {
		_activeServiceRequests.setSUB_TYPE_ID(SUB_TYPE_ID);
	}

	/**
	* Returns the a s s i g n e d_ t o of this active service requests.
	*
	* @return the a s s i g n e d_ t o of this active service requests
	*/
	@Override
	public int getASSIGNED_TO() {
		return _activeServiceRequests.getASSIGNED_TO();
	}

	/**
	* Sets the a s s i g n e d_ t o of this active service requests.
	*
	* @param ASSIGNED_TO the a s s i g n e d_ t o of this active service requests
	*/
	@Override
	public void setASSIGNED_TO(int ASSIGNED_TO) {
		_activeServiceRequests.setASSIGNED_TO(ASSIGNED_TO);
	}

	/**
	* Returns the h a n d l e d_ b y of this active service requests.
	*
	* @return the h a n d l e d_ b y of this active service requests
	*/
	@Override
	public int getHANDLED_BY() {
		return _activeServiceRequests.getHANDLED_BY();
	}

	/**
	* Sets the h a n d l e d_ b y of this active service requests.
	*
	* @param HANDLED_BY the h a n d l e d_ b y of this active service requests
	*/
	@Override
	public void setHANDLED_BY(int HANDLED_BY) {
		_activeServiceRequests.setHANDLED_BY(HANDLED_BY);
	}

	/**
	* Returns the s t a t u s_ i d of this active service requests.
	*
	* @return the s t a t u s_ i d of this active service requests
	*/
	@Override
	public int getSTATUS_ID() {
		return _activeServiceRequests.getSTATUS_ID();
	}

	/**
	* Sets the s t a t u s_ i d of this active service requests.
	*
	* @param STATUS_ID the s t a t u s_ i d of this active service requests
	*/
	@Override
	public void setSTATUS_ID(int STATUS_ID) {
		_activeServiceRequests.setSTATUS_ID(STATUS_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this active service requests.
	*
	* @return the c u s t o m e r_ i d of this active service requests
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _activeServiceRequests.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this active service requests.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this active service requests
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_activeServiceRequests.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the c u s t_ s r_ n u m b e r of this active service requests.
	*
	* @return the c u s t_ s r_ n u m b e r of this active service requests
	*/
	@Override
	public java.lang.String getCUST_SR_NUMBER() {
		return _activeServiceRequests.getCUST_SR_NUMBER();
	}

	/**
	* Sets the c u s t_ s r_ n u m b e r of this active service requests.
	*
	* @param CUST_SR_NUMBER the c u s t_ s r_ n u m b e r of this active service requests
	*/
	@Override
	public void setCUST_SR_NUMBER(java.lang.String CUST_SR_NUMBER) {
		_activeServiceRequests.setCUST_SR_NUMBER(CUST_SR_NUMBER);
	}

	/**
	* Returns the a d d i t i o n a l_ d a t a_ x m l of this active service requests.
	*
	* @return the a d d i t i o n a l_ d a t a_ x m l of this active service requests
	*/
	@Override
	public java.lang.String getADDITIONAL_DATA_XML() {
		return _activeServiceRequests.getADDITIONAL_DATA_XML();
	}

	/**
	* Sets the a d d i t i o n a l_ d a t a_ x m l of this active service requests.
	*
	* @param ADDITIONAL_DATA_XML the a d d i t i o n a l_ d a t a_ x m l of this active service requests
	*/
	@Override
	public void setADDITIONAL_DATA_XML(java.lang.String ADDITIONAL_DATA_XML) {
		_activeServiceRequests.setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this active service requests.
	*
	* @return the i n s e r t e d_ d a t e of this active service requests
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _activeServiceRequests.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this active service requests.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this active service requests
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_activeServiceRequests.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this active service requests.
	*
	* @return the i n s e r t e d_ b y of this active service requests
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _activeServiceRequests.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this active service requests.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this active service requests
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_activeServiceRequests.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this active service requests.
	*
	* @return the u p d a t e d_ d a t e of this active service requests
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _activeServiceRequests.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this active service requests.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this active service requests
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_activeServiceRequests.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this active service requests.
	*
	* @return the u p d a t e d_ b y of this active service requests
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _activeServiceRequests.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this active service requests.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this active service requests
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_activeServiceRequests.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _activeServiceRequests.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_activeServiceRequests.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _activeServiceRequests.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_activeServiceRequests.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _activeServiceRequests.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _activeServiceRequests.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_activeServiceRequests.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _activeServiceRequests.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_activeServiceRequests.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_activeServiceRequests.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_activeServiceRequests.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActiveServiceRequestsWrapper((ActiveServiceRequests)_activeServiceRequests.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests) {
		return _activeServiceRequests.compareTo(activeServiceRequests);
	}

	@Override
	public int hashCode() {
		return _activeServiceRequests.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ActiveServiceRequests> toCacheModel() {
		return _activeServiceRequests.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ActiveServiceRequests toEscapedModel() {
		return new ActiveServiceRequestsWrapper(_activeServiceRequests.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ActiveServiceRequests toUnescapedModel() {
		return new ActiveServiceRequestsWrapper(_activeServiceRequests.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _activeServiceRequests.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _activeServiceRequests.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_activeServiceRequests.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActiveServiceRequestsWrapper)) {
			return false;
		}

		ActiveServiceRequestsWrapper activeServiceRequestsWrapper = (ActiveServiceRequestsWrapper)obj;

		if (Validator.equals(_activeServiceRequests,
					activeServiceRequestsWrapper._activeServiceRequests)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActiveServiceRequests getWrappedActiveServiceRequests() {
		return _activeServiceRequests;
	}

	@Override
	public ActiveServiceRequests getWrappedModel() {
		return _activeServiceRequests;
	}

	@Override
	public void resetOriginalValues() {
		_activeServiceRequests.resetOriginalValues();
	}

	private ActiveServiceRequests _activeServiceRequests;
}