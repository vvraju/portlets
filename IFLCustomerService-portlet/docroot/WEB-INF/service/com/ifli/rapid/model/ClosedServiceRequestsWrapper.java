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
 * This class is a wrapper for {@link ClosedServiceRequests}.
 * </p>
 *
 * @author Satya Kola
 * @see ClosedServiceRequests
 * @generated
 */
public class ClosedServiceRequestsWrapper implements ClosedServiceRequests,
	ModelWrapper<ClosedServiceRequests> {
	public ClosedServiceRequestsWrapper(
		ClosedServiceRequests closedServiceRequests) {
		_closedServiceRequests = closedServiceRequests;
	}

	@Override
	public Class<?> getModelClass() {
		return ClosedServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return ClosedServiceRequests.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_CSR_ID", getQRC_CSR_ID());
		attributes.put("TYPE_ID", getTYPE_ID());
		attributes.put("ASSIGNED_TO", getASSIGNED_TO());
		attributes.put("HANDLED_BY", getHANDLED_BY());
		attributes.put("STATUS_ID", getSTATUS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("customerSRNumber", getCustomerSRNumber());
		attributes.put("ADDITIONAL_DATA_XML", getADDITIONAL_DATA_XML());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_CSR_ID = (Integer)attributes.get("QRC_CSR_ID");

		if (QRC_CSR_ID != null) {
			setQRC_CSR_ID(QRC_CSR_ID);
		}

		Integer TYPE_ID = (Integer)attributes.get("TYPE_ID");

		if (TYPE_ID != null) {
			setTYPE_ID(TYPE_ID);
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

		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String customerSRNumber = (String)attributes.get("customerSRNumber");

		if (customerSRNumber != null) {
			setCustomerSRNumber(customerSRNumber);
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
	* Returns the primary key of this closed service requests.
	*
	* @return the primary key of this closed service requests
	*/
	@Override
	public int getPrimaryKey() {
		return _closedServiceRequests.getPrimaryKey();
	}

	/**
	* Sets the primary key of this closed service requests.
	*
	* @param primaryKey the primary key of this closed service requests
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_closedServiceRequests.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ c s r_ i d of this closed service requests.
	*
	* @return the q r c_ c s r_ i d of this closed service requests
	*/
	@Override
	public int getQRC_CSR_ID() {
		return _closedServiceRequests.getQRC_CSR_ID();
	}

	/**
	* Sets the q r c_ c s r_ i d of this closed service requests.
	*
	* @param QRC_CSR_ID the q r c_ c s r_ i d of this closed service requests
	*/
	@Override
	public void setQRC_CSR_ID(int QRC_CSR_ID) {
		_closedServiceRequests.setQRC_CSR_ID(QRC_CSR_ID);
	}

	/**
	* Returns the t y p e_ i d of this closed service requests.
	*
	* @return the t y p e_ i d of this closed service requests
	*/
	@Override
	public int getTYPE_ID() {
		return _closedServiceRequests.getTYPE_ID();
	}

	/**
	* Sets the t y p e_ i d of this closed service requests.
	*
	* @param TYPE_ID the t y p e_ i d of this closed service requests
	*/
	@Override
	public void setTYPE_ID(int TYPE_ID) {
		_closedServiceRequests.setTYPE_ID(TYPE_ID);
	}

	/**
	* Returns the a s s i g n e d_ t o of this closed service requests.
	*
	* @return the a s s i g n e d_ t o of this closed service requests
	*/
	@Override
	public int getASSIGNED_TO() {
		return _closedServiceRequests.getASSIGNED_TO();
	}

	/**
	* Sets the a s s i g n e d_ t o of this closed service requests.
	*
	* @param ASSIGNED_TO the a s s i g n e d_ t o of this closed service requests
	*/
	@Override
	public void setASSIGNED_TO(int ASSIGNED_TO) {
		_closedServiceRequests.setASSIGNED_TO(ASSIGNED_TO);
	}

	/**
	* Returns the h a n d l e d_ b y of this closed service requests.
	*
	* @return the h a n d l e d_ b y of this closed service requests
	*/
	@Override
	public int getHANDLED_BY() {
		return _closedServiceRequests.getHANDLED_BY();
	}

	/**
	* Sets the h a n d l e d_ b y of this closed service requests.
	*
	* @param HANDLED_BY the h a n d l e d_ b y of this closed service requests
	*/
	@Override
	public void setHANDLED_BY(int HANDLED_BY) {
		_closedServiceRequests.setHANDLED_BY(HANDLED_BY);
	}

	/**
	* Returns the s t a t u s_ i d of this closed service requests.
	*
	* @return the s t a t u s_ i d of this closed service requests
	*/
	@Override
	public int getSTATUS_ID() {
		return _closedServiceRequests.getSTATUS_ID();
	}

	/**
	* Sets the s t a t u s_ i d of this closed service requests.
	*
	* @param STATUS_ID the s t a t u s_ i d of this closed service requests
	*/
	@Override
	public void setSTATUS_ID(int STATUS_ID) {
		_closedServiceRequests.setSTATUS_ID(STATUS_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this closed service requests.
	*
	* @return the c u s t o m e r_ i d of this closed service requests
	*/
	@Override
	public java.lang.String getCUSTOMER_ID() {
		return _closedServiceRequests.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this closed service requests.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this closed service requests
	*/
	@Override
	public void setCUSTOMER_ID(java.lang.String CUSTOMER_ID) {
		_closedServiceRequests.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the customer s r number of this closed service requests.
	*
	* @return the customer s r number of this closed service requests
	*/
	@Override
	public java.lang.String getCustomerSRNumber() {
		return _closedServiceRequests.getCustomerSRNumber();
	}

	/**
	* Sets the customer s r number of this closed service requests.
	*
	* @param customerSRNumber the customer s r number of this closed service requests
	*/
	@Override
	public void setCustomerSRNumber(java.lang.String customerSRNumber) {
		_closedServiceRequests.setCustomerSRNumber(customerSRNumber);
	}

	/**
	* Returns the a d d i t i o n a l_ d a t a_ x m l of this closed service requests.
	*
	* @return the a d d i t i o n a l_ d a t a_ x m l of this closed service requests
	*/
	@Override
	public java.lang.String getADDITIONAL_DATA_XML() {
		return _closedServiceRequests.getADDITIONAL_DATA_XML();
	}

	/**
	* Sets the a d d i t i o n a l_ d a t a_ x m l of this closed service requests.
	*
	* @param ADDITIONAL_DATA_XML the a d d i t i o n a l_ d a t a_ x m l of this closed service requests
	*/
	@Override
	public void setADDITIONAL_DATA_XML(java.lang.String ADDITIONAL_DATA_XML) {
		_closedServiceRequests.setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this closed service requests.
	*
	* @return the i n s e r t e d_ d a t e of this closed service requests
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _closedServiceRequests.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this closed service requests.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this closed service requests
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_closedServiceRequests.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this closed service requests.
	*
	* @return the i n s e r t e d_ b y of this closed service requests
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _closedServiceRequests.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this closed service requests.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this closed service requests
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_closedServiceRequests.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this closed service requests.
	*
	* @return the u p d a t e d_ d a t e of this closed service requests
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _closedServiceRequests.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this closed service requests.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this closed service requests
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_closedServiceRequests.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this closed service requests.
	*
	* @return the u p d a t e d_ b y of this closed service requests
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _closedServiceRequests.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this closed service requests.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this closed service requests
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_closedServiceRequests.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _closedServiceRequests.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_closedServiceRequests.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _closedServiceRequests.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_closedServiceRequests.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _closedServiceRequests.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _closedServiceRequests.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_closedServiceRequests.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _closedServiceRequests.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_closedServiceRequests.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_closedServiceRequests.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_closedServiceRequests.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ClosedServiceRequestsWrapper((ClosedServiceRequests)_closedServiceRequests.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.ClosedServiceRequests closedServiceRequests) {
		return _closedServiceRequests.compareTo(closedServiceRequests);
	}

	@Override
	public int hashCode() {
		return _closedServiceRequests.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ClosedServiceRequests> toCacheModel() {
		return _closedServiceRequests.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ClosedServiceRequests toEscapedModel() {
		return new ClosedServiceRequestsWrapper(_closedServiceRequests.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ClosedServiceRequests toUnescapedModel() {
		return new ClosedServiceRequestsWrapper(_closedServiceRequests.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _closedServiceRequests.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _closedServiceRequests.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_closedServiceRequests.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClosedServiceRequestsWrapper)) {
			return false;
		}

		ClosedServiceRequestsWrapper closedServiceRequestsWrapper = (ClosedServiceRequestsWrapper)obj;

		if (Validator.equals(_closedServiceRequests,
					closedServiceRequestsWrapper._closedServiceRequests)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ClosedServiceRequests getWrappedClosedServiceRequests() {
		return _closedServiceRequests;
	}

	@Override
	public ClosedServiceRequests getWrappedModel() {
		return _closedServiceRequests;
	}

	@Override
	public void resetOriginalValues() {
		_closedServiceRequests.resetOriginalValues();
	}

	private ClosedServiceRequests _closedServiceRequests;
}