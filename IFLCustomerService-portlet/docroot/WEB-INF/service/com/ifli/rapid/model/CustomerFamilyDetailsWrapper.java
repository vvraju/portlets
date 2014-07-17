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
 * This class is a wrapper for {@link CustomerFamilyDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see CustomerFamilyDetails
 * @generated
 */
public class CustomerFamilyDetailsWrapper implements CustomerFamilyDetails,
	ModelWrapper<CustomerFamilyDetails> {
	public CustomerFamilyDetailsWrapper(
		CustomerFamilyDetails customerFamilyDetails) {
		_customerFamilyDetails = customerFamilyDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerFamilyDetails.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerFamilyDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_FAMILY_ID", getCUSTOMER_FAMILY_ID());
		attributes.put("PERSON_NAME", getPERSON_NAME());
		attributes.put("RELATION", getRELATION());
		attributes.put("DEPENDENT", getDEPENDENT());
		attributes.put("AGE", getAGE());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("ADDED_BY", getADDED_BY());
		attributes.put("ADDED_DATE", getADDED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_FAMILY_ID = (Integer)attributes.get(
				"CUSTOMER_FAMILY_ID");

		if (CUSTOMER_FAMILY_ID != null) {
			setCUSTOMER_FAMILY_ID(CUSTOMER_FAMILY_ID);
		}

		String PERSON_NAME = (String)attributes.get("PERSON_NAME");

		if (PERSON_NAME != null) {
			setPERSON_NAME(PERSON_NAME);
		}

		String RELATION = (String)attributes.get("RELATION");

		if (RELATION != null) {
			setRELATION(RELATION);
		}

		String DEPENDENT = (String)attributes.get("DEPENDENT");

		if (DEPENDENT != null) {
			setDEPENDENT(DEPENDENT);
		}

		Integer AGE = (Integer)attributes.get("AGE");

		if (AGE != null) {
			setAGE(AGE);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String ADDED_BY = (String)attributes.get("ADDED_BY");

		if (ADDED_BY != null) {
			setADDED_BY(ADDED_BY);
		}

		Date ADDED_DATE = (Date)attributes.get("ADDED_DATE");

		if (ADDED_DATE != null) {
			setADDED_DATE(ADDED_DATE);
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
	* Returns the primary key of this customer family details.
	*
	* @return the primary key of this customer family details
	*/
	@Override
	public int getPrimaryKey() {
		return _customerFamilyDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer family details.
	*
	* @param primaryKey the primary key of this customer family details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customerFamilyDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c u s t o m e r_ f a m i l y_ i d of this customer family details.
	*
	* @return the c u s t o m e r_ f a m i l y_ i d of this customer family details
	*/
	@Override
	public int getCUSTOMER_FAMILY_ID() {
		return _customerFamilyDetails.getCUSTOMER_FAMILY_ID();
	}

	/**
	* Sets the c u s t o m e r_ f a m i l y_ i d of this customer family details.
	*
	* @param CUSTOMER_FAMILY_ID the c u s t o m e r_ f a m i l y_ i d of this customer family details
	*/
	@Override
	public void setCUSTOMER_FAMILY_ID(int CUSTOMER_FAMILY_ID) {
		_customerFamilyDetails.setCUSTOMER_FAMILY_ID(CUSTOMER_FAMILY_ID);
	}

	/**
	* Returns the p e r s o n_ n a m e of this customer family details.
	*
	* @return the p e r s o n_ n a m e of this customer family details
	*/
	@Override
	public java.lang.String getPERSON_NAME() {
		return _customerFamilyDetails.getPERSON_NAME();
	}

	/**
	* Sets the p e r s o n_ n a m e of this customer family details.
	*
	* @param PERSON_NAME the p e r s o n_ n a m e of this customer family details
	*/
	@Override
	public void setPERSON_NAME(java.lang.String PERSON_NAME) {
		_customerFamilyDetails.setPERSON_NAME(PERSON_NAME);
	}

	/**
	* Returns the r e l a t i o n of this customer family details.
	*
	* @return the r e l a t i o n of this customer family details
	*/
	@Override
	public java.lang.String getRELATION() {
		return _customerFamilyDetails.getRELATION();
	}

	/**
	* Sets the r e l a t i o n of this customer family details.
	*
	* @param RELATION the r e l a t i o n of this customer family details
	*/
	@Override
	public void setRELATION(java.lang.String RELATION) {
		_customerFamilyDetails.setRELATION(RELATION);
	}

	/**
	* Returns the d e p e n d e n t of this customer family details.
	*
	* @return the d e p e n d e n t of this customer family details
	*/
	@Override
	public java.lang.String getDEPENDENT() {
		return _customerFamilyDetails.getDEPENDENT();
	}

	/**
	* Sets the d e p e n d e n t of this customer family details.
	*
	* @param DEPENDENT the d e p e n d e n t of this customer family details
	*/
	@Override
	public void setDEPENDENT(java.lang.String DEPENDENT) {
		_customerFamilyDetails.setDEPENDENT(DEPENDENT);
	}

	/**
	* Returns the a g e of this customer family details.
	*
	* @return the a g e of this customer family details
	*/
	@Override
	public int getAGE() {
		return _customerFamilyDetails.getAGE();
	}

	/**
	* Sets the a g e of this customer family details.
	*
	* @param AGE the a g e of this customer family details
	*/
	@Override
	public void setAGE(int AGE) {
		_customerFamilyDetails.setAGE(AGE);
	}

	/**
	* Returns the c u s t o m e r_ i d of this customer family details.
	*
	* @return the c u s t o m e r_ i d of this customer family details
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _customerFamilyDetails.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this customer family details.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this customer family details
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_customerFamilyDetails.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the a d d e d_ b y of this customer family details.
	*
	* @return the a d d e d_ b y of this customer family details
	*/
	@Override
	public java.lang.String getADDED_BY() {
		return _customerFamilyDetails.getADDED_BY();
	}

	/**
	* Sets the a d d e d_ b y of this customer family details.
	*
	* @param ADDED_BY the a d d e d_ b y of this customer family details
	*/
	@Override
	public void setADDED_BY(java.lang.String ADDED_BY) {
		_customerFamilyDetails.setADDED_BY(ADDED_BY);
	}

	/**
	* Returns the a d d e d_ d a t e of this customer family details.
	*
	* @return the a d d e d_ d a t e of this customer family details
	*/
	@Override
	public java.util.Date getADDED_DATE() {
		return _customerFamilyDetails.getADDED_DATE();
	}

	/**
	* Sets the a d d e d_ d a t e of this customer family details.
	*
	* @param ADDED_DATE the a d d e d_ d a t e of this customer family details
	*/
	@Override
	public void setADDED_DATE(java.util.Date ADDED_DATE) {
		_customerFamilyDetails.setADDED_DATE(ADDED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this customer family details.
	*
	* @return the u p d a t e d_ b y of this customer family details
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _customerFamilyDetails.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this customer family details.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this customer family details
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_customerFamilyDetails.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this customer family details.
	*
	* @return the u p d a t e d_ d a t e of this customer family details
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _customerFamilyDetails.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this customer family details.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this customer family details
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_customerFamilyDetails.setUPDATED_DATE(UPDATED_DATE);
	}

	@Override
	public boolean isNew() {
		return _customerFamilyDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerFamilyDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerFamilyDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerFamilyDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerFamilyDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerFamilyDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerFamilyDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerFamilyDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerFamilyDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerFamilyDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerFamilyDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerFamilyDetailsWrapper((CustomerFamilyDetails)_customerFamilyDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.CustomerFamilyDetails customerFamilyDetails) {
		return _customerFamilyDetails.compareTo(customerFamilyDetails);
	}

	@Override
	public int hashCode() {
		return _customerFamilyDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.CustomerFamilyDetails> toCacheModel() {
		return _customerFamilyDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.CustomerFamilyDetails toEscapedModel() {
		return new CustomerFamilyDetailsWrapper(_customerFamilyDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.CustomerFamilyDetails toUnescapedModel() {
		return new CustomerFamilyDetailsWrapper(_customerFamilyDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerFamilyDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerFamilyDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerFamilyDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerFamilyDetailsWrapper)) {
			return false;
		}

		CustomerFamilyDetailsWrapper customerFamilyDetailsWrapper = (CustomerFamilyDetailsWrapper)obj;

		if (Validator.equals(_customerFamilyDetails,
					customerFamilyDetailsWrapper._customerFamilyDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerFamilyDetails getWrappedCustomerFamilyDetails() {
		return _customerFamilyDetails;
	}

	@Override
	public CustomerFamilyDetails getWrappedModel() {
		return _customerFamilyDetails;
	}

	@Override
	public void resetOriginalValues() {
		_customerFamilyDetails.resetOriginalValues();
	}

	private CustomerFamilyDetails _customerFamilyDetails;
}