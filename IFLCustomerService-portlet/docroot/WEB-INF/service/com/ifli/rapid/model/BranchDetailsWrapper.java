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
 * This class is a wrapper for {@link BranchDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see BranchDetails
 * @generated
 */
public class BranchDetailsWrapper implements BranchDetails,
	ModelWrapper<BranchDetails> {
	public BranchDetailsWrapper(BranchDetails branchDetails) {
		_branchDetails = branchDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return BranchDetails.class;
	}

	@Override
	public String getModelClassName() {
		return BranchDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BRANCH_ID", getBRANCH_ID());
		attributes.put("LOCATION_ID", getLOCATION_ID());
		attributes.put("BRANCH_NAME", getBRANCH_NAME());
		attributes.put("BRANCH_OPENING_TIME", getBRANCH_OPENING_TIME());
		attributes.put("BRANCH_CLOSING_TIME", getBRANCH_CLOSING_TIME());
		attributes.put("ADDRESS_FIRST_LINE", getADDRESS_FIRST_LINE());
		attributes.put("ADDRESS_SECOND_LINE", getADDRESS_SECOND_LINE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("PIN", getPIN());
		attributes.put("PRIMARY_CONTACT_NO", getPRIMARY_CONTACT_NO());
		attributes.put("OTHER_CONTACT_NO", getOTHER_CONTACT_NO());
		attributes.put("FAX_NUMBER", getFAX_NUMBER());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());
		attributes.put("WORK_TIMINGS", getWORK_TIMINGS());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer BRANCH_ID = (Integer)attributes.get("BRANCH_ID");

		if (BRANCH_ID != null) {
			setBRANCH_ID(BRANCH_ID);
		}

		Integer LOCATION_ID = (Integer)attributes.get("LOCATION_ID");

		if (LOCATION_ID != null) {
			setLOCATION_ID(LOCATION_ID);
		}

		String BRANCH_NAME = (String)attributes.get("BRANCH_NAME");

		if (BRANCH_NAME != null) {
			setBRANCH_NAME(BRANCH_NAME);
		}

		String BRANCH_OPENING_TIME = (String)attributes.get(
				"BRANCH_OPENING_TIME");

		if (BRANCH_OPENING_TIME != null) {
			setBRANCH_OPENING_TIME(BRANCH_OPENING_TIME);
		}

		String BRANCH_CLOSING_TIME = (String)attributes.get(
				"BRANCH_CLOSING_TIME");

		if (BRANCH_CLOSING_TIME != null) {
			setBRANCH_CLOSING_TIME(BRANCH_CLOSING_TIME);
		}

		String ADDRESS_FIRST_LINE = (String)attributes.get("ADDRESS_FIRST_LINE");

		if (ADDRESS_FIRST_LINE != null) {
			setADDRESS_FIRST_LINE(ADDRESS_FIRST_LINE);
		}

		String ADDRESS_SECOND_LINE = (String)attributes.get(
				"ADDRESS_SECOND_LINE");

		if (ADDRESS_SECOND_LINE != null) {
			setADDRESS_SECOND_LINE(ADDRESS_SECOND_LINE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String PIN = (String)attributes.get("PIN");

		if (PIN != null) {
			setPIN(PIN);
		}

		String PRIMARY_CONTACT_NO = (String)attributes.get("PRIMARY_CONTACT_NO");

		if (PRIMARY_CONTACT_NO != null) {
			setPRIMARY_CONTACT_NO(PRIMARY_CONTACT_NO);
		}

		String OTHER_CONTACT_NO = (String)attributes.get("OTHER_CONTACT_NO");

		if (OTHER_CONTACT_NO != null) {
			setOTHER_CONTACT_NO(OTHER_CONTACT_NO);
		}

		String FAX_NUMBER = (String)attributes.get("FAX_NUMBER");

		if (FAX_NUMBER != null) {
			setFAX_NUMBER(FAX_NUMBER);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}

		String WORK_TIMINGS = (String)attributes.get("WORK_TIMINGS");

		if (WORK_TIMINGS != null) {
			setWORK_TIMINGS(WORK_TIMINGS);
		}
	}

	/**
	* Returns the primary key of this branch details.
	*
	* @return the primary key of this branch details
	*/
	@Override
	public int getPrimaryKey() {
		return _branchDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this branch details.
	*
	* @param primaryKey the primary key of this branch details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_branchDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the b r a n c h_ i d of this branch details.
	*
	* @return the b r a n c h_ i d of this branch details
	*/
	@Override
	public int getBRANCH_ID() {
		return _branchDetails.getBRANCH_ID();
	}

	/**
	* Sets the b r a n c h_ i d of this branch details.
	*
	* @param BRANCH_ID the b r a n c h_ i d of this branch details
	*/
	@Override
	public void setBRANCH_ID(int BRANCH_ID) {
		_branchDetails.setBRANCH_ID(BRANCH_ID);
	}

	/**
	* Returns the l o c a t i o n_ i d of this branch details.
	*
	* @return the l o c a t i o n_ i d of this branch details
	*/
	@Override
	public int getLOCATION_ID() {
		return _branchDetails.getLOCATION_ID();
	}

	/**
	* Sets the l o c a t i o n_ i d of this branch details.
	*
	* @param LOCATION_ID the l o c a t i o n_ i d of this branch details
	*/
	@Override
	public void setLOCATION_ID(int LOCATION_ID) {
		_branchDetails.setLOCATION_ID(LOCATION_ID);
	}

	/**
	* Returns the b r a n c h_ n a m e of this branch details.
	*
	* @return the b r a n c h_ n a m e of this branch details
	*/
	@Override
	public java.lang.String getBRANCH_NAME() {
		return _branchDetails.getBRANCH_NAME();
	}

	/**
	* Sets the b r a n c h_ n a m e of this branch details.
	*
	* @param BRANCH_NAME the b r a n c h_ n a m e of this branch details
	*/
	@Override
	public void setBRANCH_NAME(java.lang.String BRANCH_NAME) {
		_branchDetails.setBRANCH_NAME(BRANCH_NAME);
	}

	/**
	* Returns the b r a n c h_ o p e n i n g_ t i m e of this branch details.
	*
	* @return the b r a n c h_ o p e n i n g_ t i m e of this branch details
	*/
	@Override
	public java.lang.String getBRANCH_OPENING_TIME() {
		return _branchDetails.getBRANCH_OPENING_TIME();
	}

	/**
	* Sets the b r a n c h_ o p e n i n g_ t i m e of this branch details.
	*
	* @param BRANCH_OPENING_TIME the b r a n c h_ o p e n i n g_ t i m e of this branch details
	*/
	@Override
	public void setBRANCH_OPENING_TIME(java.lang.String BRANCH_OPENING_TIME) {
		_branchDetails.setBRANCH_OPENING_TIME(BRANCH_OPENING_TIME);
	}

	/**
	* Returns the b r a n c h_ c l o s i n g_ t i m e of this branch details.
	*
	* @return the b r a n c h_ c l o s i n g_ t i m e of this branch details
	*/
	@Override
	public java.lang.String getBRANCH_CLOSING_TIME() {
		return _branchDetails.getBRANCH_CLOSING_TIME();
	}

	/**
	* Sets the b r a n c h_ c l o s i n g_ t i m e of this branch details.
	*
	* @param BRANCH_CLOSING_TIME the b r a n c h_ c l o s i n g_ t i m e of this branch details
	*/
	@Override
	public void setBRANCH_CLOSING_TIME(java.lang.String BRANCH_CLOSING_TIME) {
		_branchDetails.setBRANCH_CLOSING_TIME(BRANCH_CLOSING_TIME);
	}

	/**
	* Returns the a d d r e s s_ f i r s t_ l i n e of this branch details.
	*
	* @return the a d d r e s s_ f i r s t_ l i n e of this branch details
	*/
	@Override
	public java.lang.String getADDRESS_FIRST_LINE() {
		return _branchDetails.getADDRESS_FIRST_LINE();
	}

	/**
	* Sets the a d d r e s s_ f i r s t_ l i n e of this branch details.
	*
	* @param ADDRESS_FIRST_LINE the a d d r e s s_ f i r s t_ l i n e of this branch details
	*/
	@Override
	public void setADDRESS_FIRST_LINE(java.lang.String ADDRESS_FIRST_LINE) {
		_branchDetails.setADDRESS_FIRST_LINE(ADDRESS_FIRST_LINE);
	}

	/**
	* Returns the a d d r e s s_ s e c o n d_ l i n e of this branch details.
	*
	* @return the a d d r e s s_ s e c o n d_ l i n e of this branch details
	*/
	@Override
	public java.lang.String getADDRESS_SECOND_LINE() {
		return _branchDetails.getADDRESS_SECOND_LINE();
	}

	/**
	* Sets the a d d r e s s_ s e c o n d_ l i n e of this branch details.
	*
	* @param ADDRESS_SECOND_LINE the a d d r e s s_ s e c o n d_ l i n e of this branch details
	*/
	@Override
	public void setADDRESS_SECOND_LINE(java.lang.String ADDRESS_SECOND_LINE) {
		_branchDetails.setADDRESS_SECOND_LINE(ADDRESS_SECOND_LINE);
	}

	/**
	* Returns the c i t y of this branch details.
	*
	* @return the c i t y of this branch details
	*/
	@Override
	public java.lang.String getCITY() {
		return _branchDetails.getCITY();
	}

	/**
	* Sets the c i t y of this branch details.
	*
	* @param CITY the c i t y of this branch details
	*/
	@Override
	public void setCITY(java.lang.String CITY) {
		_branchDetails.setCITY(CITY);
	}

	/**
	* Returns the s t a t e of this branch details.
	*
	* @return the s t a t e of this branch details
	*/
	@Override
	public java.lang.String getSTATE() {
		return _branchDetails.getSTATE();
	}

	/**
	* Sets the s t a t e of this branch details.
	*
	* @param STATE the s t a t e of this branch details
	*/
	@Override
	public void setSTATE(java.lang.String STATE) {
		_branchDetails.setSTATE(STATE);
	}

	/**
	* Returns the p i n of this branch details.
	*
	* @return the p i n of this branch details
	*/
	@Override
	public java.lang.String getPIN() {
		return _branchDetails.getPIN();
	}

	/**
	* Sets the p i n of this branch details.
	*
	* @param PIN the p i n of this branch details
	*/
	@Override
	public void setPIN(java.lang.String PIN) {
		_branchDetails.setPIN(PIN);
	}

	/**
	* Returns the p r i m a r y_ c o n t a c t_ n o of this branch details.
	*
	* @return the p r i m a r y_ c o n t a c t_ n o of this branch details
	*/
	@Override
	public java.lang.String getPRIMARY_CONTACT_NO() {
		return _branchDetails.getPRIMARY_CONTACT_NO();
	}

	/**
	* Sets the p r i m a r y_ c o n t a c t_ n o of this branch details.
	*
	* @param PRIMARY_CONTACT_NO the p r i m a r y_ c o n t a c t_ n o of this branch details
	*/
	@Override
	public void setPRIMARY_CONTACT_NO(java.lang.String PRIMARY_CONTACT_NO) {
		_branchDetails.setPRIMARY_CONTACT_NO(PRIMARY_CONTACT_NO);
	}

	/**
	* Returns the o t h e r_ c o n t a c t_ n o of this branch details.
	*
	* @return the o t h e r_ c o n t a c t_ n o of this branch details
	*/
	@Override
	public java.lang.String getOTHER_CONTACT_NO() {
		return _branchDetails.getOTHER_CONTACT_NO();
	}

	/**
	* Sets the o t h e r_ c o n t a c t_ n o of this branch details.
	*
	* @param OTHER_CONTACT_NO the o t h e r_ c o n t a c t_ n o of this branch details
	*/
	@Override
	public void setOTHER_CONTACT_NO(java.lang.String OTHER_CONTACT_NO) {
		_branchDetails.setOTHER_CONTACT_NO(OTHER_CONTACT_NO);
	}

	/**
	* Returns the f a x_ n u m b e r of this branch details.
	*
	* @return the f a x_ n u m b e r of this branch details
	*/
	@Override
	public java.lang.String getFAX_NUMBER() {
		return _branchDetails.getFAX_NUMBER();
	}

	/**
	* Sets the f a x_ n u m b e r of this branch details.
	*
	* @param FAX_NUMBER the f a x_ n u m b e r of this branch details
	*/
	@Override
	public void setFAX_NUMBER(java.lang.String FAX_NUMBER) {
		_branchDetails.setFAX_NUMBER(FAX_NUMBER);
	}

	/**
	* Returns the b r a n c h_ c o d e of this branch details.
	*
	* @return the b r a n c h_ c o d e of this branch details
	*/
	@Override
	public java.lang.String getBRANCH_CODE() {
		return _branchDetails.getBRANCH_CODE();
	}

	/**
	* Sets the b r a n c h_ c o d e of this branch details.
	*
	* @param BRANCH_CODE the b r a n c h_ c o d e of this branch details
	*/
	@Override
	public void setBRANCH_CODE(java.lang.String BRANCH_CODE) {
		_branchDetails.setBRANCH_CODE(BRANCH_CODE);
	}

	/**
	* Returns the w o r k_ t i m i n g s of this branch details.
	*
	* @return the w o r k_ t i m i n g s of this branch details
	*/
	@Override
	public java.lang.String getWORK_TIMINGS() {
		return _branchDetails.getWORK_TIMINGS();
	}

	/**
	* Sets the w o r k_ t i m i n g s of this branch details.
	*
	* @param WORK_TIMINGS the w o r k_ t i m i n g s of this branch details
	*/
	@Override
	public void setWORK_TIMINGS(java.lang.String WORK_TIMINGS) {
		_branchDetails.setWORK_TIMINGS(WORK_TIMINGS);
	}

	@Override
	public boolean isNew() {
		return _branchDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_branchDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _branchDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_branchDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _branchDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _branchDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_branchDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _branchDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_branchDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_branchDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_branchDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BranchDetailsWrapper((BranchDetails)_branchDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.BranchDetails branchDetails) {
		return _branchDetails.compareTo(branchDetails);
	}

	@Override
	public int hashCode() {
		return _branchDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.BranchDetails> toCacheModel() {
		return _branchDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.BranchDetails toEscapedModel() {
		return new BranchDetailsWrapper(_branchDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.BranchDetails toUnescapedModel() {
		return new BranchDetailsWrapper(_branchDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _branchDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _branchDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_branchDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BranchDetailsWrapper)) {
			return false;
		}

		BranchDetailsWrapper branchDetailsWrapper = (BranchDetailsWrapper)obj;

		if (Validator.equals(_branchDetails, branchDetailsWrapper._branchDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BranchDetails getWrappedBranchDetails() {
		return _branchDetails;
	}

	@Override
	public BranchDetails getWrappedModel() {
		return _branchDetails;
	}

	@Override
	public void resetOriginalValues() {
		_branchDetails.resetOriginalValues();
	}

	private BranchDetails _branchDetails;
}