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
 * This class is a wrapper for {@link RenewalDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see RenewalDetails
 * @generated
 */
public class RenewalDetailsWrapper implements RenewalDetails,
	ModelWrapper<RenewalDetails> {
	public RenewalDetailsWrapper(RenewalDetails renewalDetails) {
		_renewalDetails = renewalDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return RenewalDetails.class;
	}

	@Override
	public String getModelClassName() {
		return RenewalDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("EMAIL_ID", getEMAIL_ID());
		attributes.put("MOBILE_NUMBER", getMOBILE_NUMBER());
		attributes.put("POLICY_STATUS", getPOLICY_STATUS());
		attributes.put("PRODUCT_NAME", getPRODUCT_NAME());
		attributes.put("DATE", getDATE());
		attributes.put("POLICY_EXPIRY_DATE", getPOLICY_EXPIRY_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long POLICY_ID = (Long)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		String EMAIL_ID = (String)attributes.get("EMAIL_ID");

		if (EMAIL_ID != null) {
			setEMAIL_ID(EMAIL_ID);
		}

		String MOBILE_NUMBER = (String)attributes.get("MOBILE_NUMBER");

		if (MOBILE_NUMBER != null) {
			setMOBILE_NUMBER(MOBILE_NUMBER);
		}

		String POLICY_STATUS = (String)attributes.get("POLICY_STATUS");

		if (POLICY_STATUS != null) {
			setPOLICY_STATUS(POLICY_STATUS);
		}

		String PRODUCT_NAME = (String)attributes.get("PRODUCT_NAME");

		if (PRODUCT_NAME != null) {
			setPRODUCT_NAME(PRODUCT_NAME);
		}

		Date DATE = (Date)attributes.get("DATE");

		if (DATE != null) {
			setDATE(DATE);
		}

		Date POLICY_EXPIRY_DATE = (Date)attributes.get("POLICY_EXPIRY_DATE");

		if (POLICY_EXPIRY_DATE != null) {
			setPOLICY_EXPIRY_DATE(POLICY_EXPIRY_DATE);
		}
	}

	/**
	* Returns the primary key of this renewal details.
	*
	* @return the primary key of this renewal details
	*/
	@Override
	public long getPrimaryKey() {
		return _renewalDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this renewal details.
	*
	* @param primaryKey the primary key of this renewal details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_renewalDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p o l i c y_ i d of this renewal details.
	*
	* @return the p o l i c y_ i d of this renewal details
	*/
	@Override
	public long getPOLICY_ID() {
		return _renewalDetails.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this renewal details.
	*
	* @param POLICY_ID the p o l i c y_ i d of this renewal details
	*/
	@Override
	public void setPOLICY_ID(long POLICY_ID) {
		_renewalDetails.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the e m a i l_ i d of this renewal details.
	*
	* @return the e m a i l_ i d of this renewal details
	*/
	@Override
	public java.lang.String getEMAIL_ID() {
		return _renewalDetails.getEMAIL_ID();
	}

	/**
	* Sets the e m a i l_ i d of this renewal details.
	*
	* @param EMAIL_ID the e m a i l_ i d of this renewal details
	*/
	@Override
	public void setEMAIL_ID(java.lang.String EMAIL_ID) {
		_renewalDetails.setEMAIL_ID(EMAIL_ID);
	}

	/**
	* Returns the m o b i l e_ n u m b e r of this renewal details.
	*
	* @return the m o b i l e_ n u m b e r of this renewal details
	*/
	@Override
	public java.lang.String getMOBILE_NUMBER() {
		return _renewalDetails.getMOBILE_NUMBER();
	}

	/**
	* Sets the m o b i l e_ n u m b e r of this renewal details.
	*
	* @param MOBILE_NUMBER the m o b i l e_ n u m b e r of this renewal details
	*/
	@Override
	public void setMOBILE_NUMBER(java.lang.String MOBILE_NUMBER) {
		_renewalDetails.setMOBILE_NUMBER(MOBILE_NUMBER);
	}

	/**
	* Returns the p o l i c y_ s t a t u s of this renewal details.
	*
	* @return the p o l i c y_ s t a t u s of this renewal details
	*/
	@Override
	public java.lang.String getPOLICY_STATUS() {
		return _renewalDetails.getPOLICY_STATUS();
	}

	/**
	* Sets the p o l i c y_ s t a t u s of this renewal details.
	*
	* @param POLICY_STATUS the p o l i c y_ s t a t u s of this renewal details
	*/
	@Override
	public void setPOLICY_STATUS(java.lang.String POLICY_STATUS) {
		_renewalDetails.setPOLICY_STATUS(POLICY_STATUS);
	}

	/**
	* Returns the p r o d u c t_ n a m e of this renewal details.
	*
	* @return the p r o d u c t_ n a m e of this renewal details
	*/
	@Override
	public java.lang.String getPRODUCT_NAME() {
		return _renewalDetails.getPRODUCT_NAME();
	}

	/**
	* Sets the p r o d u c t_ n a m e of this renewal details.
	*
	* @param PRODUCT_NAME the p r o d u c t_ n a m e of this renewal details
	*/
	@Override
	public void setPRODUCT_NAME(java.lang.String PRODUCT_NAME) {
		_renewalDetails.setPRODUCT_NAME(PRODUCT_NAME);
	}

	/**
	* Returns the d a t e of this renewal details.
	*
	* @return the d a t e of this renewal details
	*/
	@Override
	public java.util.Date getDATE() {
		return _renewalDetails.getDATE();
	}

	/**
	* Sets the d a t e of this renewal details.
	*
	* @param DATE the d a t e of this renewal details
	*/
	@Override
	public void setDATE(java.util.Date DATE) {
		_renewalDetails.setDATE(DATE);
	}

	/**
	* Returns the p o l i c y_ e x p i r y_ d a t e of this renewal details.
	*
	* @return the p o l i c y_ e x p i r y_ d a t e of this renewal details
	*/
	@Override
	public java.util.Date getPOLICY_EXPIRY_DATE() {
		return _renewalDetails.getPOLICY_EXPIRY_DATE();
	}

	/**
	* Sets the p o l i c y_ e x p i r y_ d a t e of this renewal details.
	*
	* @param POLICY_EXPIRY_DATE the p o l i c y_ e x p i r y_ d a t e of this renewal details
	*/
	@Override
	public void setPOLICY_EXPIRY_DATE(java.util.Date POLICY_EXPIRY_DATE) {
		_renewalDetails.setPOLICY_EXPIRY_DATE(POLICY_EXPIRY_DATE);
	}

	@Override
	public boolean isNew() {
		return _renewalDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_renewalDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _renewalDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_renewalDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _renewalDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _renewalDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_renewalDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _renewalDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_renewalDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_renewalDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_renewalDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RenewalDetailsWrapper((RenewalDetails)_renewalDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.RenewalDetails renewalDetails) {
		return _renewalDetails.compareTo(renewalDetails);
	}

	@Override
	public int hashCode() {
		return _renewalDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.RenewalDetails> toCacheModel() {
		return _renewalDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.RenewalDetails toEscapedModel() {
		return new RenewalDetailsWrapper(_renewalDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.RenewalDetails toUnescapedModel() {
		return new RenewalDetailsWrapper(_renewalDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _renewalDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _renewalDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_renewalDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RenewalDetailsWrapper)) {
			return false;
		}

		RenewalDetailsWrapper renewalDetailsWrapper = (RenewalDetailsWrapper)obj;

		if (Validator.equals(_renewalDetails,
					renewalDetailsWrapper._renewalDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RenewalDetails getWrappedRenewalDetails() {
		return _renewalDetails;
	}

	@Override
	public RenewalDetails getWrappedModel() {
		return _renewalDetails;
	}

	@Override
	public void resetOriginalValues() {
		_renewalDetails.resetOriginalValues();
	}

	private RenewalDetails _renewalDetails;
}