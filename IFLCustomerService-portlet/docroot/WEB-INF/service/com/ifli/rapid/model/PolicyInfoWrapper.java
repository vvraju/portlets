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
 * This class is a wrapper for {@link PolicyInfo}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyInfo
 * @generated
 */
public class PolicyInfoWrapper implements PolicyInfo, ModelWrapper<PolicyInfo> {
	public PolicyInfoWrapper(PolicyInfo policyInfo) {
		_policyInfo = policyInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyInfo.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("PRODUCT_ID", getPRODUCT_ID());
		attributes.put("POLICY_DATE", getPOLICY_DATE());
		attributes.put("NEXT_PREMIUM_DUEDATE", getNEXT_PREMIUM_DUEDATE());
		attributes.put("POLICY_HOLDER1_FIRST_NAME",
			getPOLICY_HOLDER1_FIRST_NAME());
		attributes.put("POLICY_HOLDER1_MIDDLE_NAME",
			getPOLICY_HOLDER1_MIDDLE_NAME());
		attributes.put("POLICY_HOLDER1_LAST_NAME", getPOLICY_HOLDER1_LAST_NAME());
		attributes.put("SUM_ASSURED", getSUM_ASSURED());
		attributes.put("POLICY_HOLDER2_FIRST_NAME",
			getPOLICY_HOLDER2_FIRST_NAME());
		attributes.put("POLICY_HOLDER2_MIDDLE_NAME",
			getPOLICY_HOLDER2_MIDDLE_NAME());
		attributes.put("POLICY_HOLDER2_LAST_NAME", getPOLICY_HOLDER2_LAST_NAME());
		attributes.put("CHILD_FIRST_NAME", getCHILD_FIRST_NAME());
		attributes.put("CHILD_DOB", getCHILD_DOB());
		attributes.put("CHILD_LAST_NAME", getCHILD_LAST_NAME());
		attributes.put("CURRENT_STATUS", getCURRENT_STATUS());
		attributes.put("PREMIUM_AMOUNT", getPREMIUM_AMOUNT());
		attributes.put("FREQUENCY", getFREQUENCY());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());
		attributes.put("LG_CODE", getLG_CODE());
		attributes.put("APPLICATION_NUMBER", getAPPLICATION_NUMBER());
		attributes.put("APPLICATION_DATE", getAPPLICATION_DATE());
		attributes.put("POLICY_HOLDER1_TITLE", getPOLICY_HOLDER1_TITLE());
		attributes.put("CRO_NAME", getCRO_NAME());
		attributes.put("CRO_NUMBER", getCRO_NUMBER());
		attributes.put("BRANCH_NAME", getBRANCH_NAME());
		attributes.put("PRODUCT_NAME", getPRODUCT_NAME());
		attributes.put("REQUIREMENT_FLAG", getREQUIREMENT_FLAG());
		attributes.put("TERM", getTERM());
		attributes.put("MATURITY_DATE", getMATURITY_DATE());
		attributes.put("AMOUNT_DEPOSITED", getAMOUNT_DEPOSITED());
		attributes.put("TOTAL_DUE_AMT", getTOTAL_DUE_AMT());
		attributes.put("CHANNEL_TYPE", getCHANNEL_TYPE());
		attributes.put("LIFE_ASSURED_NAME", getLIFE_ASSURED_NAME());
		attributes.put("LIFE_ASSURED_DOB", getLIFE_ASSURED_DOB());
		attributes.put("POLICY_HOLDER1_EMAIL", getPOLICY_HOLDER1_EMAIL());
		attributes.put("POLICY_HOLDER1_ADD1", getPOLICY_HOLDER1_ADD1());
		attributes.put("POLICY_HOLDER1_ADD2", getPOLICY_HOLDER1_ADD2());
		attributes.put("POLICY_HOLDER1_CONTACT1", getPOLICY_HOLDER1_CONTACT1());
		attributes.put("POLICY_HOLDER1_CONTACT2", getPOLICY_HOLDER1_CONTACT2());
		attributes.put("POLICY_HOLDER1_DOB", getPOLICY_HOLDER1_DOB());
		attributes.put("RISK_COMMENCEMENT_DATE", getRISK_COMMENCEMENT_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		Integer PRODUCT_ID = (Integer)attributes.get("PRODUCT_ID");

		if (PRODUCT_ID != null) {
			setPRODUCT_ID(PRODUCT_ID);
		}

		String POLICY_DATE = (String)attributes.get("POLICY_DATE");

		if (POLICY_DATE != null) {
			setPOLICY_DATE(POLICY_DATE);
		}

		String NEXT_PREMIUM_DUEDATE = (String)attributes.get(
				"NEXT_PREMIUM_DUEDATE");

		if (NEXT_PREMIUM_DUEDATE != null) {
			setNEXT_PREMIUM_DUEDATE(NEXT_PREMIUM_DUEDATE);
		}

		String POLICY_HOLDER1_FIRST_NAME = (String)attributes.get(
				"POLICY_HOLDER1_FIRST_NAME");

		if (POLICY_HOLDER1_FIRST_NAME != null) {
			setPOLICY_HOLDER1_FIRST_NAME(POLICY_HOLDER1_FIRST_NAME);
		}

		String POLICY_HOLDER1_MIDDLE_NAME = (String)attributes.get(
				"POLICY_HOLDER1_MIDDLE_NAME");

		if (POLICY_HOLDER1_MIDDLE_NAME != null) {
			setPOLICY_HOLDER1_MIDDLE_NAME(POLICY_HOLDER1_MIDDLE_NAME);
		}

		String POLICY_HOLDER1_LAST_NAME = (String)attributes.get(
				"POLICY_HOLDER1_LAST_NAME");

		if (POLICY_HOLDER1_LAST_NAME != null) {
			setPOLICY_HOLDER1_LAST_NAME(POLICY_HOLDER1_LAST_NAME);
		}

		Double SUM_ASSURED = (Double)attributes.get("SUM_ASSURED");

		if (SUM_ASSURED != null) {
			setSUM_ASSURED(SUM_ASSURED);
		}

		String POLICY_HOLDER2_FIRST_NAME = (String)attributes.get(
				"POLICY_HOLDER2_FIRST_NAME");

		if (POLICY_HOLDER2_FIRST_NAME != null) {
			setPOLICY_HOLDER2_FIRST_NAME(POLICY_HOLDER2_FIRST_NAME);
		}

		String POLICY_HOLDER2_MIDDLE_NAME = (String)attributes.get(
				"POLICY_HOLDER2_MIDDLE_NAME");

		if (POLICY_HOLDER2_MIDDLE_NAME != null) {
			setPOLICY_HOLDER2_MIDDLE_NAME(POLICY_HOLDER2_MIDDLE_NAME);
		}

		String POLICY_HOLDER2_LAST_NAME = (String)attributes.get(
				"POLICY_HOLDER2_LAST_NAME");

		if (POLICY_HOLDER2_LAST_NAME != null) {
			setPOLICY_HOLDER2_LAST_NAME(POLICY_HOLDER2_LAST_NAME);
		}

		String CHILD_FIRST_NAME = (String)attributes.get("CHILD_FIRST_NAME");

		if (CHILD_FIRST_NAME != null) {
			setCHILD_FIRST_NAME(CHILD_FIRST_NAME);
		}

		String CHILD_DOB = (String)attributes.get("CHILD_DOB");

		if (CHILD_DOB != null) {
			setCHILD_DOB(CHILD_DOB);
		}

		String CHILD_LAST_NAME = (String)attributes.get("CHILD_LAST_NAME");

		if (CHILD_LAST_NAME != null) {
			setCHILD_LAST_NAME(CHILD_LAST_NAME);
		}

		String CURRENT_STATUS = (String)attributes.get("CURRENT_STATUS");

		if (CURRENT_STATUS != null) {
			setCURRENT_STATUS(CURRENT_STATUS);
		}

		Integer PREMIUM_AMOUNT = (Integer)attributes.get("PREMIUM_AMOUNT");

		if (PREMIUM_AMOUNT != null) {
			setPREMIUM_AMOUNT(PREMIUM_AMOUNT);
		}

		String FREQUENCY = (String)attributes.get("FREQUENCY");

		if (FREQUENCY != null) {
			setFREQUENCY(FREQUENCY);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}

		String LG_CODE = (String)attributes.get("LG_CODE");

		if (LG_CODE != null) {
			setLG_CODE(LG_CODE);
		}

		String APPLICATION_NUMBER = (String)attributes.get("APPLICATION_NUMBER");

		if (APPLICATION_NUMBER != null) {
			setAPPLICATION_NUMBER(APPLICATION_NUMBER);
		}

		String APPLICATION_DATE = (String)attributes.get("APPLICATION_DATE");

		if (APPLICATION_DATE != null) {
			setAPPLICATION_DATE(APPLICATION_DATE);
		}

		String POLICY_HOLDER1_TITLE = (String)attributes.get(
				"POLICY_HOLDER1_TITLE");

		if (POLICY_HOLDER1_TITLE != null) {
			setPOLICY_HOLDER1_TITLE(POLICY_HOLDER1_TITLE);
		}

		String CRO_NAME = (String)attributes.get("CRO_NAME");

		if (CRO_NAME != null) {
			setCRO_NAME(CRO_NAME);
		}

		String CRO_NUMBER = (String)attributes.get("CRO_NUMBER");

		if (CRO_NUMBER != null) {
			setCRO_NUMBER(CRO_NUMBER);
		}

		String BRANCH_NAME = (String)attributes.get("BRANCH_NAME");

		if (BRANCH_NAME != null) {
			setBRANCH_NAME(BRANCH_NAME);
		}

		String PRODUCT_NAME = (String)attributes.get("PRODUCT_NAME");

		if (PRODUCT_NAME != null) {
			setPRODUCT_NAME(PRODUCT_NAME);
		}

		String REQUIREMENT_FLAG = (String)attributes.get("REQUIREMENT_FLAG");

		if (REQUIREMENT_FLAG != null) {
			setREQUIREMENT_FLAG(REQUIREMENT_FLAG);
		}

		Integer TERM = (Integer)attributes.get("TERM");

		if (TERM != null) {
			setTERM(TERM);
		}

		Date MATURITY_DATE = (Date)attributes.get("MATURITY_DATE");

		if (MATURITY_DATE != null) {
			setMATURITY_DATE(MATURITY_DATE);
		}

		Double AMOUNT_DEPOSITED = (Double)attributes.get("AMOUNT_DEPOSITED");

		if (AMOUNT_DEPOSITED != null) {
			setAMOUNT_DEPOSITED(AMOUNT_DEPOSITED);
		}

		Double TOTAL_DUE_AMT = (Double)attributes.get("TOTAL_DUE_AMT");

		if (TOTAL_DUE_AMT != null) {
			setTOTAL_DUE_AMT(TOTAL_DUE_AMT);
		}

		String CHANNEL_TYPE = (String)attributes.get("CHANNEL_TYPE");

		if (CHANNEL_TYPE != null) {
			setCHANNEL_TYPE(CHANNEL_TYPE);
		}

		String LIFE_ASSURED_NAME = (String)attributes.get("LIFE_ASSURED_NAME");

		if (LIFE_ASSURED_NAME != null) {
			setLIFE_ASSURED_NAME(LIFE_ASSURED_NAME);
		}

		Date LIFE_ASSURED_DOB = (Date)attributes.get("LIFE_ASSURED_DOB");

		if (LIFE_ASSURED_DOB != null) {
			setLIFE_ASSURED_DOB(LIFE_ASSURED_DOB);
		}

		String POLICY_HOLDER1_EMAIL = (String)attributes.get(
				"POLICY_HOLDER1_EMAIL");

		if (POLICY_HOLDER1_EMAIL != null) {
			setPOLICY_HOLDER1_EMAIL(POLICY_HOLDER1_EMAIL);
		}

		String POLICY_HOLDER1_ADD1 = (String)attributes.get(
				"POLICY_HOLDER1_ADD1");

		if (POLICY_HOLDER1_ADD1 != null) {
			setPOLICY_HOLDER1_ADD1(POLICY_HOLDER1_ADD1);
		}

		String POLICY_HOLDER1_ADD2 = (String)attributes.get(
				"POLICY_HOLDER1_ADD2");

		if (POLICY_HOLDER1_ADD2 != null) {
			setPOLICY_HOLDER1_ADD2(POLICY_HOLDER1_ADD2);
		}

		String POLICY_HOLDER1_CONTACT1 = (String)attributes.get(
				"POLICY_HOLDER1_CONTACT1");

		if (POLICY_HOLDER1_CONTACT1 != null) {
			setPOLICY_HOLDER1_CONTACT1(POLICY_HOLDER1_CONTACT1);
		}

		String POLICY_HOLDER1_CONTACT2 = (String)attributes.get(
				"POLICY_HOLDER1_CONTACT2");

		if (POLICY_HOLDER1_CONTACT2 != null) {
			setPOLICY_HOLDER1_CONTACT2(POLICY_HOLDER1_CONTACT2);
		}

		String POLICY_HOLDER1_DOB = (String)attributes.get("POLICY_HOLDER1_DOB");

		if (POLICY_HOLDER1_DOB != null) {
			setPOLICY_HOLDER1_DOB(POLICY_HOLDER1_DOB);
		}

		Date RISK_COMMENCEMENT_DATE = (Date)attributes.get(
				"RISK_COMMENCEMENT_DATE");

		if (RISK_COMMENCEMENT_DATE != null) {
			setRISK_COMMENCEMENT_DATE(RISK_COMMENCEMENT_DATE);
		}
	}

	/**
	* Returns the primary key of this policy info.
	*
	* @return the primary key of this policy info
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _policyInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this policy info.
	*
	* @param primaryKey the primary key of this policy info
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_policyInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p o l i c y_ i d of this policy info.
	*
	* @return the p o l i c y_ i d of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_ID() {
		return _policyInfo.getPOLICY_ID();
	}

	/**
	* Sets the p o l i c y_ i d of this policy info.
	*
	* @param POLICY_ID the p o l i c y_ i d of this policy info
	*/
	@Override
	public void setPOLICY_ID(java.lang.String POLICY_ID) {
		_policyInfo.setPOLICY_ID(POLICY_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this policy info.
	*
	* @return the c u s t o m e r_ i d of this policy info
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _policyInfo.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this policy info.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this policy info
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_policyInfo.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the p r o d u c t_ i d of this policy info.
	*
	* @return the p r o d u c t_ i d of this policy info
	*/
	@Override
	public int getPRODUCT_ID() {
		return _policyInfo.getPRODUCT_ID();
	}

	/**
	* Sets the p r o d u c t_ i d of this policy info.
	*
	* @param PRODUCT_ID the p r o d u c t_ i d of this policy info
	*/
	@Override
	public void setPRODUCT_ID(int PRODUCT_ID) {
		_policyInfo.setPRODUCT_ID(PRODUCT_ID);
	}

	/**
	* Returns the p o l i c y_ d a t e of this policy info.
	*
	* @return the p o l i c y_ d a t e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_DATE() {
		return _policyInfo.getPOLICY_DATE();
	}

	/**
	* Sets the p o l i c y_ d a t e of this policy info.
	*
	* @param POLICY_DATE the p o l i c y_ d a t e of this policy info
	*/
	@Override
	public void setPOLICY_DATE(java.lang.String POLICY_DATE) {
		_policyInfo.setPOLICY_DATE(POLICY_DATE);
	}

	/**
	* Returns the n e x t_ p r e m i u m_ d u e d a t e of this policy info.
	*
	* @return the n e x t_ p r e m i u m_ d u e d a t e of this policy info
	*/
	@Override
	public java.lang.String getNEXT_PREMIUM_DUEDATE() {
		return _policyInfo.getNEXT_PREMIUM_DUEDATE();
	}

	/**
	* Sets the n e x t_ p r e m i u m_ d u e d a t e of this policy info.
	*
	* @param NEXT_PREMIUM_DUEDATE the n e x t_ p r e m i u m_ d u e d a t e of this policy info
	*/
	@Override
	public void setNEXT_PREMIUM_DUEDATE(java.lang.String NEXT_PREMIUM_DUEDATE) {
		_policyInfo.setNEXT_PREMIUM_DUEDATE(NEXT_PREMIUM_DUEDATE);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ f i r s t_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_FIRST_NAME() {
		return _policyInfo.getPOLICY_HOLDER1_FIRST_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ f i r s t_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER1_FIRST_NAME the p o l i c y_ h o l d e r1_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_FIRST_NAME(
		java.lang.String POLICY_HOLDER1_FIRST_NAME) {
		_policyInfo.setPOLICY_HOLDER1_FIRST_NAME(POLICY_HOLDER1_FIRST_NAME);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ m i d d l e_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ m i d d l e_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_MIDDLE_NAME() {
		return _policyInfo.getPOLICY_HOLDER1_MIDDLE_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ m i d d l e_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER1_MIDDLE_NAME the p o l i c y_ h o l d e r1_ m i d d l e_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_MIDDLE_NAME(
		java.lang.String POLICY_HOLDER1_MIDDLE_NAME) {
		_policyInfo.setPOLICY_HOLDER1_MIDDLE_NAME(POLICY_HOLDER1_MIDDLE_NAME);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ l a s t_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ l a s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_LAST_NAME() {
		return _policyInfo.getPOLICY_HOLDER1_LAST_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ l a s t_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER1_LAST_NAME the p o l i c y_ h o l d e r1_ l a s t_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_LAST_NAME(
		java.lang.String POLICY_HOLDER1_LAST_NAME) {
		_policyInfo.setPOLICY_HOLDER1_LAST_NAME(POLICY_HOLDER1_LAST_NAME);
	}

	/**
	* Returns the s u m_ a s s u r e d of this policy info.
	*
	* @return the s u m_ a s s u r e d of this policy info
	*/
	@Override
	public double getSUM_ASSURED() {
		return _policyInfo.getSUM_ASSURED();
	}

	/**
	* Sets the s u m_ a s s u r e d of this policy info.
	*
	* @param SUM_ASSURED the s u m_ a s s u r e d of this policy info
	*/
	@Override
	public void setSUM_ASSURED(double SUM_ASSURED) {
		_policyInfo.setSUM_ASSURED(SUM_ASSURED);
	}

	/**
	* Returns the p o l i c y_ h o l d e r2_ f i r s t_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r2_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER2_FIRST_NAME() {
		return _policyInfo.getPOLICY_HOLDER2_FIRST_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r2_ f i r s t_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER2_FIRST_NAME the p o l i c y_ h o l d e r2_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER2_FIRST_NAME(
		java.lang.String POLICY_HOLDER2_FIRST_NAME) {
		_policyInfo.setPOLICY_HOLDER2_FIRST_NAME(POLICY_HOLDER2_FIRST_NAME);
	}

	/**
	* Returns the p o l i c y_ h o l d e r2_ m i d d l e_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r2_ m i d d l e_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER2_MIDDLE_NAME() {
		return _policyInfo.getPOLICY_HOLDER2_MIDDLE_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r2_ m i d d l e_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER2_MIDDLE_NAME the p o l i c y_ h o l d e r2_ m i d d l e_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER2_MIDDLE_NAME(
		java.lang.String POLICY_HOLDER2_MIDDLE_NAME) {
		_policyInfo.setPOLICY_HOLDER2_MIDDLE_NAME(POLICY_HOLDER2_MIDDLE_NAME);
	}

	/**
	* Returns the p o l i c y_ h o l d e r2_ l a s t_ n a m e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r2_ l a s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER2_LAST_NAME() {
		return _policyInfo.getPOLICY_HOLDER2_LAST_NAME();
	}

	/**
	* Sets the p o l i c y_ h o l d e r2_ l a s t_ n a m e of this policy info.
	*
	* @param POLICY_HOLDER2_LAST_NAME the p o l i c y_ h o l d e r2_ l a s t_ n a m e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER2_LAST_NAME(
		java.lang.String POLICY_HOLDER2_LAST_NAME) {
		_policyInfo.setPOLICY_HOLDER2_LAST_NAME(POLICY_HOLDER2_LAST_NAME);
	}

	/**
	* Returns the c h i l d_ f i r s t_ n a m e of this policy info.
	*
	* @return the c h i l d_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getCHILD_FIRST_NAME() {
		return _policyInfo.getCHILD_FIRST_NAME();
	}

	/**
	* Sets the c h i l d_ f i r s t_ n a m e of this policy info.
	*
	* @param CHILD_FIRST_NAME the c h i l d_ f i r s t_ n a m e of this policy info
	*/
	@Override
	public void setCHILD_FIRST_NAME(java.lang.String CHILD_FIRST_NAME) {
		_policyInfo.setCHILD_FIRST_NAME(CHILD_FIRST_NAME);
	}

	/**
	* Returns the c h i l d_ d o b of this policy info.
	*
	* @return the c h i l d_ d o b of this policy info
	*/
	@Override
	public java.lang.String getCHILD_DOB() {
		return _policyInfo.getCHILD_DOB();
	}

	/**
	* Sets the c h i l d_ d o b of this policy info.
	*
	* @param CHILD_DOB the c h i l d_ d o b of this policy info
	*/
	@Override
	public void setCHILD_DOB(java.lang.String CHILD_DOB) {
		_policyInfo.setCHILD_DOB(CHILD_DOB);
	}

	/**
	* Returns the c h i l d_ l a s t_ n a m e of this policy info.
	*
	* @return the c h i l d_ l a s t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getCHILD_LAST_NAME() {
		return _policyInfo.getCHILD_LAST_NAME();
	}

	/**
	* Sets the c h i l d_ l a s t_ n a m e of this policy info.
	*
	* @param CHILD_LAST_NAME the c h i l d_ l a s t_ n a m e of this policy info
	*/
	@Override
	public void setCHILD_LAST_NAME(java.lang.String CHILD_LAST_NAME) {
		_policyInfo.setCHILD_LAST_NAME(CHILD_LAST_NAME);
	}

	/**
	* Returns the c u r r e n t_ s t a t u s of this policy info.
	*
	* @return the c u r r e n t_ s t a t u s of this policy info
	*/
	@Override
	public java.lang.String getCURRENT_STATUS() {
		return _policyInfo.getCURRENT_STATUS();
	}

	/**
	* Sets the c u r r e n t_ s t a t u s of this policy info.
	*
	* @param CURRENT_STATUS the c u r r e n t_ s t a t u s of this policy info
	*/
	@Override
	public void setCURRENT_STATUS(java.lang.String CURRENT_STATUS) {
		_policyInfo.setCURRENT_STATUS(CURRENT_STATUS);
	}

	/**
	* Returns the p r e m i u m_ a m o u n t of this policy info.
	*
	* @return the p r e m i u m_ a m o u n t of this policy info
	*/
	@Override
	public int getPREMIUM_AMOUNT() {
		return _policyInfo.getPREMIUM_AMOUNT();
	}

	/**
	* Sets the p r e m i u m_ a m o u n t of this policy info.
	*
	* @param PREMIUM_AMOUNT the p r e m i u m_ a m o u n t of this policy info
	*/
	@Override
	public void setPREMIUM_AMOUNT(int PREMIUM_AMOUNT) {
		_policyInfo.setPREMIUM_AMOUNT(PREMIUM_AMOUNT);
	}

	/**
	* Returns the f r e q u e n c y of this policy info.
	*
	* @return the f r e q u e n c y of this policy info
	*/
	@Override
	public java.lang.String getFREQUENCY() {
		return _policyInfo.getFREQUENCY();
	}

	/**
	* Sets the f r e q u e n c y of this policy info.
	*
	* @param FREQUENCY the f r e q u e n c y of this policy info
	*/
	@Override
	public void setFREQUENCY(java.lang.String FREQUENCY) {
		_policyInfo.setFREQUENCY(FREQUENCY);
	}

	/**
	* Returns the b r a n c h_ c o d e of this policy info.
	*
	* @return the b r a n c h_ c o d e of this policy info
	*/
	@Override
	public java.lang.String getBRANCH_CODE() {
		return _policyInfo.getBRANCH_CODE();
	}

	/**
	* Sets the b r a n c h_ c o d e of this policy info.
	*
	* @param BRANCH_CODE the b r a n c h_ c o d e of this policy info
	*/
	@Override
	public void setBRANCH_CODE(java.lang.String BRANCH_CODE) {
		_policyInfo.setBRANCH_CODE(BRANCH_CODE);
	}

	/**
	* Returns the l g_ c o d e of this policy info.
	*
	* @return the l g_ c o d e of this policy info
	*/
	@Override
	public java.lang.String getLG_CODE() {
		return _policyInfo.getLG_CODE();
	}

	/**
	* Sets the l g_ c o d e of this policy info.
	*
	* @param LG_CODE the l g_ c o d e of this policy info
	*/
	@Override
	public void setLG_CODE(java.lang.String LG_CODE) {
		_policyInfo.setLG_CODE(LG_CODE);
	}

	/**
	* Returns the a p p l i c a t i o n_ n u m b e r of this policy info.
	*
	* @return the a p p l i c a t i o n_ n u m b e r of this policy info
	*/
	@Override
	public java.lang.String getAPPLICATION_NUMBER() {
		return _policyInfo.getAPPLICATION_NUMBER();
	}

	/**
	* Sets the a p p l i c a t i o n_ n u m b e r of this policy info.
	*
	* @param APPLICATION_NUMBER the a p p l i c a t i o n_ n u m b e r of this policy info
	*/
	@Override
	public void setAPPLICATION_NUMBER(java.lang.String APPLICATION_NUMBER) {
		_policyInfo.setAPPLICATION_NUMBER(APPLICATION_NUMBER);
	}

	/**
	* Returns the a p p l i c a t i o n_ d a t e of this policy info.
	*
	* @return the a p p l i c a t i o n_ d a t e of this policy info
	*/
	@Override
	public java.lang.String getAPPLICATION_DATE() {
		return _policyInfo.getAPPLICATION_DATE();
	}

	/**
	* Sets the a p p l i c a t i o n_ d a t e of this policy info.
	*
	* @param APPLICATION_DATE the a p p l i c a t i o n_ d a t e of this policy info
	*/
	@Override
	public void setAPPLICATION_DATE(java.lang.String APPLICATION_DATE) {
		_policyInfo.setAPPLICATION_DATE(APPLICATION_DATE);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ t i t l e of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ t i t l e of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_TITLE() {
		return _policyInfo.getPOLICY_HOLDER1_TITLE();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ t i t l e of this policy info.
	*
	* @param POLICY_HOLDER1_TITLE the p o l i c y_ h o l d e r1_ t i t l e of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_TITLE(java.lang.String POLICY_HOLDER1_TITLE) {
		_policyInfo.setPOLICY_HOLDER1_TITLE(POLICY_HOLDER1_TITLE);
	}

	/**
	* Returns the c r o_ n a m e of this policy info.
	*
	* @return the c r o_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getCRO_NAME() {
		return _policyInfo.getCRO_NAME();
	}

	/**
	* Sets the c r o_ n a m e of this policy info.
	*
	* @param CRO_NAME the c r o_ n a m e of this policy info
	*/
	@Override
	public void setCRO_NAME(java.lang.String CRO_NAME) {
		_policyInfo.setCRO_NAME(CRO_NAME);
	}

	/**
	* Returns the c r o_ n u m b e r of this policy info.
	*
	* @return the c r o_ n u m b e r of this policy info
	*/
	@Override
	public java.lang.String getCRO_NUMBER() {
		return _policyInfo.getCRO_NUMBER();
	}

	/**
	* Sets the c r o_ n u m b e r of this policy info.
	*
	* @param CRO_NUMBER the c r o_ n u m b e r of this policy info
	*/
	@Override
	public void setCRO_NUMBER(java.lang.String CRO_NUMBER) {
		_policyInfo.setCRO_NUMBER(CRO_NUMBER);
	}

	/**
	* Returns the b r a n c h_ n a m e of this policy info.
	*
	* @return the b r a n c h_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getBRANCH_NAME() {
		return _policyInfo.getBRANCH_NAME();
	}

	/**
	* Sets the b r a n c h_ n a m e of this policy info.
	*
	* @param BRANCH_NAME the b r a n c h_ n a m e of this policy info
	*/
	@Override
	public void setBRANCH_NAME(java.lang.String BRANCH_NAME) {
		_policyInfo.setBRANCH_NAME(BRANCH_NAME);
	}

	/**
	* Returns the p r o d u c t_ n a m e of this policy info.
	*
	* @return the p r o d u c t_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getPRODUCT_NAME() {
		return _policyInfo.getPRODUCT_NAME();
	}

	/**
	* Sets the p r o d u c t_ n a m e of this policy info.
	*
	* @param PRODUCT_NAME the p r o d u c t_ n a m e of this policy info
	*/
	@Override
	public void setPRODUCT_NAME(java.lang.String PRODUCT_NAME) {
		_policyInfo.setPRODUCT_NAME(PRODUCT_NAME);
	}

	/**
	* Returns the r e q u i r e m e n t_ f l a g of this policy info.
	*
	* @return the r e q u i r e m e n t_ f l a g of this policy info
	*/
	@Override
	public java.lang.String getREQUIREMENT_FLAG() {
		return _policyInfo.getREQUIREMENT_FLAG();
	}

	/**
	* Sets the r e q u i r e m e n t_ f l a g of this policy info.
	*
	* @param REQUIREMENT_FLAG the r e q u i r e m e n t_ f l a g of this policy info
	*/
	@Override
	public void setREQUIREMENT_FLAG(java.lang.String REQUIREMENT_FLAG) {
		_policyInfo.setREQUIREMENT_FLAG(REQUIREMENT_FLAG);
	}

	/**
	* Returns the t e r m of this policy info.
	*
	* @return the t e r m of this policy info
	*/
	@Override
	public int getTERM() {
		return _policyInfo.getTERM();
	}

	/**
	* Sets the t e r m of this policy info.
	*
	* @param TERM the t e r m of this policy info
	*/
	@Override
	public void setTERM(int TERM) {
		_policyInfo.setTERM(TERM);
	}

	/**
	* Returns the m a t u r i t y_ d a t e of this policy info.
	*
	* @return the m a t u r i t y_ d a t e of this policy info
	*/
	@Override
	public java.util.Date getMATURITY_DATE() {
		return _policyInfo.getMATURITY_DATE();
	}

	/**
	* Sets the m a t u r i t y_ d a t e of this policy info.
	*
	* @param MATURITY_DATE the m a t u r i t y_ d a t e of this policy info
	*/
	@Override
	public void setMATURITY_DATE(java.util.Date MATURITY_DATE) {
		_policyInfo.setMATURITY_DATE(MATURITY_DATE);
	}

	/**
	* Returns the a m o u n t_ d e p o s i t e d of this policy info.
	*
	* @return the a m o u n t_ d e p o s i t e d of this policy info
	*/
	@Override
	public double getAMOUNT_DEPOSITED() {
		return _policyInfo.getAMOUNT_DEPOSITED();
	}

	/**
	* Sets the a m o u n t_ d e p o s i t e d of this policy info.
	*
	* @param AMOUNT_DEPOSITED the a m o u n t_ d e p o s i t e d of this policy info
	*/
	@Override
	public void setAMOUNT_DEPOSITED(double AMOUNT_DEPOSITED) {
		_policyInfo.setAMOUNT_DEPOSITED(AMOUNT_DEPOSITED);
	}

	/**
	* Returns the t o t a l_ d u e_ a m t of this policy info.
	*
	* @return the t o t a l_ d u e_ a m t of this policy info
	*/
	@Override
	public double getTOTAL_DUE_AMT() {
		return _policyInfo.getTOTAL_DUE_AMT();
	}

	/**
	* Sets the t o t a l_ d u e_ a m t of this policy info.
	*
	* @param TOTAL_DUE_AMT the t o t a l_ d u e_ a m t of this policy info
	*/
	@Override
	public void setTOTAL_DUE_AMT(double TOTAL_DUE_AMT) {
		_policyInfo.setTOTAL_DUE_AMT(TOTAL_DUE_AMT);
	}

	/**
	* Returns the c h a n n e l_ t y p e of this policy info.
	*
	* @return the c h a n n e l_ t y p e of this policy info
	*/
	@Override
	public java.lang.String getCHANNEL_TYPE() {
		return _policyInfo.getCHANNEL_TYPE();
	}

	/**
	* Sets the c h a n n e l_ t y p e of this policy info.
	*
	* @param CHANNEL_TYPE the c h a n n e l_ t y p e of this policy info
	*/
	@Override
	public void setCHANNEL_TYPE(java.lang.String CHANNEL_TYPE) {
		_policyInfo.setCHANNEL_TYPE(CHANNEL_TYPE);
	}

	/**
	* Returns the l i f e_ a s s u r e d_ n a m e of this policy info.
	*
	* @return the l i f e_ a s s u r e d_ n a m e of this policy info
	*/
	@Override
	public java.lang.String getLIFE_ASSURED_NAME() {
		return _policyInfo.getLIFE_ASSURED_NAME();
	}

	/**
	* Sets the l i f e_ a s s u r e d_ n a m e of this policy info.
	*
	* @param LIFE_ASSURED_NAME the l i f e_ a s s u r e d_ n a m e of this policy info
	*/
	@Override
	public void setLIFE_ASSURED_NAME(java.lang.String LIFE_ASSURED_NAME) {
		_policyInfo.setLIFE_ASSURED_NAME(LIFE_ASSURED_NAME);
	}

	/**
	* Returns the l i f e_ a s s u r e d_ d o b of this policy info.
	*
	* @return the l i f e_ a s s u r e d_ d o b of this policy info
	*/
	@Override
	public java.util.Date getLIFE_ASSURED_DOB() {
		return _policyInfo.getLIFE_ASSURED_DOB();
	}

	/**
	* Sets the l i f e_ a s s u r e d_ d o b of this policy info.
	*
	* @param LIFE_ASSURED_DOB the l i f e_ a s s u r e d_ d o b of this policy info
	*/
	@Override
	public void setLIFE_ASSURED_DOB(java.util.Date LIFE_ASSURED_DOB) {
		_policyInfo.setLIFE_ASSURED_DOB(LIFE_ASSURED_DOB);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ e m a i l of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ e m a i l of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_EMAIL() {
		return _policyInfo.getPOLICY_HOLDER1_EMAIL();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ e m a i l of this policy info.
	*
	* @param POLICY_HOLDER1_EMAIL the p o l i c y_ h o l d e r1_ e m a i l of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_EMAIL(java.lang.String POLICY_HOLDER1_EMAIL) {
		_policyInfo.setPOLICY_HOLDER1_EMAIL(POLICY_HOLDER1_EMAIL);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ a d d1 of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ a d d1 of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_ADD1() {
		return _policyInfo.getPOLICY_HOLDER1_ADD1();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ a d d1 of this policy info.
	*
	* @param POLICY_HOLDER1_ADD1 the p o l i c y_ h o l d e r1_ a d d1 of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_ADD1(java.lang.String POLICY_HOLDER1_ADD1) {
		_policyInfo.setPOLICY_HOLDER1_ADD1(POLICY_HOLDER1_ADD1);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ a d d2 of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ a d d2 of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_ADD2() {
		return _policyInfo.getPOLICY_HOLDER1_ADD2();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ a d d2 of this policy info.
	*
	* @param POLICY_HOLDER1_ADD2 the p o l i c y_ h o l d e r1_ a d d2 of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_ADD2(java.lang.String POLICY_HOLDER1_ADD2) {
		_policyInfo.setPOLICY_HOLDER1_ADD2(POLICY_HOLDER1_ADD2);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ c o n t a c t1 of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ c o n t a c t1 of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_CONTACT1() {
		return _policyInfo.getPOLICY_HOLDER1_CONTACT1();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ c o n t a c t1 of this policy info.
	*
	* @param POLICY_HOLDER1_CONTACT1 the p o l i c y_ h o l d e r1_ c o n t a c t1 of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_CONTACT1(
		java.lang.String POLICY_HOLDER1_CONTACT1) {
		_policyInfo.setPOLICY_HOLDER1_CONTACT1(POLICY_HOLDER1_CONTACT1);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ c o n t a c t2 of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ c o n t a c t2 of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_CONTACT2() {
		return _policyInfo.getPOLICY_HOLDER1_CONTACT2();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ c o n t a c t2 of this policy info.
	*
	* @param POLICY_HOLDER1_CONTACT2 the p o l i c y_ h o l d e r1_ c o n t a c t2 of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_CONTACT2(
		java.lang.String POLICY_HOLDER1_CONTACT2) {
		_policyInfo.setPOLICY_HOLDER1_CONTACT2(POLICY_HOLDER1_CONTACT2);
	}

	/**
	* Returns the p o l i c y_ h o l d e r1_ d o b of this policy info.
	*
	* @return the p o l i c y_ h o l d e r1_ d o b of this policy info
	*/
	@Override
	public java.lang.String getPOLICY_HOLDER1_DOB() {
		return _policyInfo.getPOLICY_HOLDER1_DOB();
	}

	/**
	* Sets the p o l i c y_ h o l d e r1_ d o b of this policy info.
	*
	* @param POLICY_HOLDER1_DOB the p o l i c y_ h o l d e r1_ d o b of this policy info
	*/
	@Override
	public void setPOLICY_HOLDER1_DOB(java.lang.String POLICY_HOLDER1_DOB) {
		_policyInfo.setPOLICY_HOLDER1_DOB(POLICY_HOLDER1_DOB);
	}

	/**
	* Returns the r i s k_ c o m m e n c e m e n t_ d a t e of this policy info.
	*
	* @return the r i s k_ c o m m e n c e m e n t_ d a t e of this policy info
	*/
	@Override
	public java.util.Date getRISK_COMMENCEMENT_DATE() {
		return _policyInfo.getRISK_COMMENCEMENT_DATE();
	}

	/**
	* Sets the r i s k_ c o m m e n c e m e n t_ d a t e of this policy info.
	*
	* @param RISK_COMMENCEMENT_DATE the r i s k_ c o m m e n c e m e n t_ d a t e of this policy info
	*/
	@Override
	public void setRISK_COMMENCEMENT_DATE(java.util.Date RISK_COMMENCEMENT_DATE) {
		_policyInfo.setRISK_COMMENCEMENT_DATE(RISK_COMMENCEMENT_DATE);
	}

	@Override
	public boolean isNew() {
		return _policyInfo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_policyInfo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _policyInfo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_policyInfo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _policyInfo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _policyInfo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_policyInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _policyInfo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_policyInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_policyInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_policyInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PolicyInfoWrapper((PolicyInfo)_policyInfo.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PolicyInfo policyInfo) {
		return _policyInfo.compareTo(policyInfo);
	}

	@Override
	public int hashCode() {
		return _policyInfo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PolicyInfo> toCacheModel() {
		return _policyInfo.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PolicyInfo toEscapedModel() {
		return new PolicyInfoWrapper(_policyInfo.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PolicyInfo toUnescapedModel() {
		return new PolicyInfoWrapper(_policyInfo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _policyInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _policyInfo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_policyInfo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyInfoWrapper)) {
			return false;
		}

		PolicyInfoWrapper policyInfoWrapper = (PolicyInfoWrapper)obj;

		if (Validator.equals(_policyInfo, policyInfoWrapper._policyInfo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PolicyInfo getWrappedPolicyInfo() {
		return _policyInfo;
	}

	@Override
	public PolicyInfo getWrappedModel() {
		return _policyInfo;
	}

	@Override
	public void resetOriginalValues() {
		_policyInfo.resetOriginalValues();
	}

	private PolicyInfo _policyInfo;
}