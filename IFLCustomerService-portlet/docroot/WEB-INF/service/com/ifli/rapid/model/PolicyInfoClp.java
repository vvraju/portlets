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

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class PolicyInfoClp extends BaseModelImpl<PolicyInfo>
	implements PolicyInfo {
	public PolicyInfoClp() {
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
	public String getPrimaryKey() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPOLICY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@Override
	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	@Override
	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_policyInfoRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPRODUCT_ID() {
		return _PRODUCT_ID;
	}

	@Override
	public void setPRODUCT_ID(int PRODUCT_ID) {
		_PRODUCT_ID = PRODUCT_ID;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_ID", int.class);

				method.invoke(_policyInfoRemoteModel, PRODUCT_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_DATE() {
		return _POLICY_DATE;
	}

	@Override
	public void setPOLICY_DATE(String POLICY_DATE) {
		_POLICY_DATE = POLICY_DATE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_DATE", String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNEXT_PREMIUM_DUEDATE() {
		return _NEXT_PREMIUM_DUEDATE;
	}

	@Override
	public void setNEXT_PREMIUM_DUEDATE(String NEXT_PREMIUM_DUEDATE) {
		_NEXT_PREMIUM_DUEDATE = NEXT_PREMIUM_DUEDATE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setNEXT_PREMIUM_DUEDATE",
						String.class);

				method.invoke(_policyInfoRemoteModel, NEXT_PREMIUM_DUEDATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_FIRST_NAME() {
		return _POLICY_HOLDER1_FIRST_NAME;
	}

	@Override
	public void setPOLICY_HOLDER1_FIRST_NAME(String POLICY_HOLDER1_FIRST_NAME) {
		_POLICY_HOLDER1_FIRST_NAME = POLICY_HOLDER1_FIRST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_FIRST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_FIRST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_MIDDLE_NAME() {
		return _POLICY_HOLDER1_MIDDLE_NAME;
	}

	@Override
	public void setPOLICY_HOLDER1_MIDDLE_NAME(String POLICY_HOLDER1_MIDDLE_NAME) {
		_POLICY_HOLDER1_MIDDLE_NAME = POLICY_HOLDER1_MIDDLE_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_MIDDLE_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_MIDDLE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_LAST_NAME() {
		return _POLICY_HOLDER1_LAST_NAME;
	}

	@Override
	public void setPOLICY_HOLDER1_LAST_NAME(String POLICY_HOLDER1_LAST_NAME) {
		_POLICY_HOLDER1_LAST_NAME = POLICY_HOLDER1_LAST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_LAST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_LAST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSUM_ASSURED() {
		return _SUM_ASSURED;
	}

	@Override
	public void setSUM_ASSURED(double SUM_ASSURED) {
		_SUM_ASSURED = SUM_ASSURED;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setSUM_ASSURED", double.class);

				method.invoke(_policyInfoRemoteModel, SUM_ASSURED);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER2_FIRST_NAME() {
		return _POLICY_HOLDER2_FIRST_NAME;
	}

	@Override
	public void setPOLICY_HOLDER2_FIRST_NAME(String POLICY_HOLDER2_FIRST_NAME) {
		_POLICY_HOLDER2_FIRST_NAME = POLICY_HOLDER2_FIRST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER2_FIRST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER2_FIRST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER2_MIDDLE_NAME() {
		return _POLICY_HOLDER2_MIDDLE_NAME;
	}

	@Override
	public void setPOLICY_HOLDER2_MIDDLE_NAME(String POLICY_HOLDER2_MIDDLE_NAME) {
		_POLICY_HOLDER2_MIDDLE_NAME = POLICY_HOLDER2_MIDDLE_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER2_MIDDLE_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER2_MIDDLE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER2_LAST_NAME() {
		return _POLICY_HOLDER2_LAST_NAME;
	}

	@Override
	public void setPOLICY_HOLDER2_LAST_NAME(String POLICY_HOLDER2_LAST_NAME) {
		_POLICY_HOLDER2_LAST_NAME = POLICY_HOLDER2_LAST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER2_LAST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER2_LAST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCHILD_FIRST_NAME() {
		return _CHILD_FIRST_NAME;
	}

	@Override
	public void setCHILD_FIRST_NAME(String CHILD_FIRST_NAME) {
		_CHILD_FIRST_NAME = CHILD_FIRST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCHILD_FIRST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, CHILD_FIRST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCHILD_DOB() {
		return _CHILD_DOB;
	}

	@Override
	public void setCHILD_DOB(String CHILD_DOB) {
		_CHILD_DOB = CHILD_DOB;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCHILD_DOB", String.class);

				method.invoke(_policyInfoRemoteModel, CHILD_DOB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCHILD_LAST_NAME() {
		return _CHILD_LAST_NAME;
	}

	@Override
	public void setCHILD_LAST_NAME(String CHILD_LAST_NAME) {
		_CHILD_LAST_NAME = CHILD_LAST_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCHILD_LAST_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, CHILD_LAST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCURRENT_STATUS() {
		return _CURRENT_STATUS;
	}

	@Override
	public void setCURRENT_STATUS(String CURRENT_STATUS) {
		_CURRENT_STATUS = CURRENT_STATUS;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCURRENT_STATUS",
						String.class);

				method.invoke(_policyInfoRemoteModel, CURRENT_STATUS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPREMIUM_AMOUNT() {
		return _PREMIUM_AMOUNT;
	}

	@Override
	public void setPREMIUM_AMOUNT(int PREMIUM_AMOUNT) {
		_PREMIUM_AMOUNT = PREMIUM_AMOUNT;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPREMIUM_AMOUNT", int.class);

				method.invoke(_policyInfoRemoteModel, PREMIUM_AMOUNT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFREQUENCY() {
		return _FREQUENCY;
	}

	@Override
	public void setFREQUENCY(String FREQUENCY) {
		_FREQUENCY = FREQUENCY;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setFREQUENCY", String.class);

				method.invoke(_policyInfoRemoteModel, FREQUENCY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	@Override
	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_CODE", String.class);

				method.invoke(_policyInfoRemoteModel, BRANCH_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLG_CODE() {
		return _LG_CODE;
	}

	@Override
	public void setLG_CODE(String LG_CODE) {
		_LG_CODE = LG_CODE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setLG_CODE", String.class);

				method.invoke(_policyInfoRemoteModel, LG_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAPPLICATION_NUMBER() {
		return _APPLICATION_NUMBER;
	}

	@Override
	public void setAPPLICATION_NUMBER(String APPLICATION_NUMBER) {
		_APPLICATION_NUMBER = APPLICATION_NUMBER;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setAPPLICATION_NUMBER",
						String.class);

				method.invoke(_policyInfoRemoteModel, APPLICATION_NUMBER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAPPLICATION_DATE() {
		return _APPLICATION_DATE;
	}

	@Override
	public void setAPPLICATION_DATE(String APPLICATION_DATE) {
		_APPLICATION_DATE = APPLICATION_DATE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setAPPLICATION_DATE",
						String.class);

				method.invoke(_policyInfoRemoteModel, APPLICATION_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_TITLE() {
		return _POLICY_HOLDER1_TITLE;
	}

	@Override
	public void setPOLICY_HOLDER1_TITLE(String POLICY_HOLDER1_TITLE) {
		_POLICY_HOLDER1_TITLE = POLICY_HOLDER1_TITLE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_TITLE",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_TITLE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCRO_NAME() {
		return _CRO_NAME;
	}

	@Override
	public void setCRO_NAME(String CRO_NAME) {
		_CRO_NAME = CRO_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCRO_NAME", String.class);

				method.invoke(_policyInfoRemoteModel, CRO_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCRO_NUMBER() {
		return _CRO_NUMBER;
	}

	@Override
	public void setCRO_NUMBER(String CRO_NUMBER) {
		_CRO_NUMBER = CRO_NUMBER;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCRO_NUMBER", String.class);

				method.invoke(_policyInfoRemoteModel, CRO_NUMBER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	@Override
	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_NAME", String.class);

				method.invoke(_policyInfoRemoteModel, BRANCH_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	@Override
	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_NAME", String.class);

				method.invoke(_policyInfoRemoteModel, PRODUCT_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getREQUIREMENT_FLAG() {
		return _REQUIREMENT_FLAG;
	}

	@Override
	public void setREQUIREMENT_FLAG(String REQUIREMENT_FLAG) {
		_REQUIREMENT_FLAG = REQUIREMENT_FLAG;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setREQUIREMENT_FLAG",
						String.class);

				method.invoke(_policyInfoRemoteModel, REQUIREMENT_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTERM() {
		return _TERM;
	}

	@Override
	public void setTERM(int TERM) {
		_TERM = TERM;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setTERM", int.class);

				method.invoke(_policyInfoRemoteModel, TERM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMATURITY_DATE() {
		return _MATURITY_DATE;
	}

	@Override
	public void setMATURITY_DATE(Date MATURITY_DATE) {
		_MATURITY_DATE = MATURITY_DATE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setMATURITY_DATE", Date.class);

				method.invoke(_policyInfoRemoteModel, MATURITY_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAMOUNT_DEPOSITED() {
		return _AMOUNT_DEPOSITED;
	}

	@Override
	public void setAMOUNT_DEPOSITED(double AMOUNT_DEPOSITED) {
		_AMOUNT_DEPOSITED = AMOUNT_DEPOSITED;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setAMOUNT_DEPOSITED",
						double.class);

				method.invoke(_policyInfoRemoteModel, AMOUNT_DEPOSITED);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTOTAL_DUE_AMT() {
		return _TOTAL_DUE_AMT;
	}

	@Override
	public void setTOTAL_DUE_AMT(double TOTAL_DUE_AMT) {
		_TOTAL_DUE_AMT = TOTAL_DUE_AMT;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setTOTAL_DUE_AMT", double.class);

				method.invoke(_policyInfoRemoteModel, TOTAL_DUE_AMT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCHANNEL_TYPE() {
		return _CHANNEL_TYPE;
	}

	@Override
	public void setCHANNEL_TYPE(String CHANNEL_TYPE) {
		_CHANNEL_TYPE = CHANNEL_TYPE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCHANNEL_TYPE", String.class);

				method.invoke(_policyInfoRemoteModel, CHANNEL_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLIFE_ASSURED_NAME() {
		return _LIFE_ASSURED_NAME;
	}

	@Override
	public void setLIFE_ASSURED_NAME(String LIFE_ASSURED_NAME) {
		_LIFE_ASSURED_NAME = LIFE_ASSURED_NAME;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setLIFE_ASSURED_NAME",
						String.class);

				method.invoke(_policyInfoRemoteModel, LIFE_ASSURED_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLIFE_ASSURED_DOB() {
		return _LIFE_ASSURED_DOB;
	}

	@Override
	public void setLIFE_ASSURED_DOB(Date LIFE_ASSURED_DOB) {
		_LIFE_ASSURED_DOB = LIFE_ASSURED_DOB;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setLIFE_ASSURED_DOB",
						Date.class);

				method.invoke(_policyInfoRemoteModel, LIFE_ASSURED_DOB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_EMAIL() {
		return _POLICY_HOLDER1_EMAIL;
	}

	@Override
	public void setPOLICY_HOLDER1_EMAIL(String POLICY_HOLDER1_EMAIL) {
		_POLICY_HOLDER1_EMAIL = POLICY_HOLDER1_EMAIL;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_EMAIL",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_EMAIL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_ADD1() {
		return _POLICY_HOLDER1_ADD1;
	}

	@Override
	public void setPOLICY_HOLDER1_ADD1(String POLICY_HOLDER1_ADD1) {
		_POLICY_HOLDER1_ADD1 = POLICY_HOLDER1_ADD1;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_ADD1",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_ADD1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_ADD2() {
		return _POLICY_HOLDER1_ADD2;
	}

	@Override
	public void setPOLICY_HOLDER1_ADD2(String POLICY_HOLDER1_ADD2) {
		_POLICY_HOLDER1_ADD2 = POLICY_HOLDER1_ADD2;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_ADD2",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_ADD2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_CONTACT1() {
		return _POLICY_HOLDER1_CONTACT1;
	}

	@Override
	public void setPOLICY_HOLDER1_CONTACT1(String POLICY_HOLDER1_CONTACT1) {
		_POLICY_HOLDER1_CONTACT1 = POLICY_HOLDER1_CONTACT1;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_CONTACT1",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_CONTACT1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_CONTACT2() {
		return _POLICY_HOLDER1_CONTACT2;
	}

	@Override
	public void setPOLICY_HOLDER1_CONTACT2(String POLICY_HOLDER1_CONTACT2) {
		_POLICY_HOLDER1_CONTACT2 = POLICY_HOLDER1_CONTACT2;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_CONTACT2",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_CONTACT2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_HOLDER1_DOB() {
		return _POLICY_HOLDER1_DOB;
	}

	@Override
	public void setPOLICY_HOLDER1_DOB(String POLICY_HOLDER1_DOB) {
		_POLICY_HOLDER1_DOB = POLICY_HOLDER1_DOB;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_HOLDER1_DOB",
						String.class);

				method.invoke(_policyInfoRemoteModel, POLICY_HOLDER1_DOB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRISK_COMMENCEMENT_DATE() {
		return _RISK_COMMENCEMENT_DATE;
	}

	@Override
	public void setRISK_COMMENCEMENT_DATE(Date RISK_COMMENCEMENT_DATE) {
		_RISK_COMMENCEMENT_DATE = RISK_COMMENCEMENT_DATE;

		if (_policyInfoRemoteModel != null) {
			try {
				Class<?> clazz = _policyInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setRISK_COMMENCEMENT_DATE",
						Date.class);

				method.invoke(_policyInfoRemoteModel, RISK_COMMENCEMENT_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyInfoRemoteModel() {
		return _policyInfoRemoteModel;
	}

	public void setPolicyInfoRemoteModel(BaseModel<?> policyInfoRemoteModel) {
		_policyInfoRemoteModel = policyInfoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _policyInfoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_policyInfoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyInfoLocalServiceUtil.addPolicyInfo(this);
		}
		else {
			PolicyInfoLocalServiceUtil.updatePolicyInfo(this);
		}
	}

	@Override
	public PolicyInfo toEscapedModel() {
		return (PolicyInfo)ProxyUtil.newProxyInstance(PolicyInfo.class.getClassLoader(),
			new Class[] { PolicyInfo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyInfoClp clone = new PolicyInfoClp();

		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setPRODUCT_ID(getPRODUCT_ID());
		clone.setPOLICY_DATE(getPOLICY_DATE());
		clone.setNEXT_PREMIUM_DUEDATE(getNEXT_PREMIUM_DUEDATE());
		clone.setPOLICY_HOLDER1_FIRST_NAME(getPOLICY_HOLDER1_FIRST_NAME());
		clone.setPOLICY_HOLDER1_MIDDLE_NAME(getPOLICY_HOLDER1_MIDDLE_NAME());
		clone.setPOLICY_HOLDER1_LAST_NAME(getPOLICY_HOLDER1_LAST_NAME());
		clone.setSUM_ASSURED(getSUM_ASSURED());
		clone.setPOLICY_HOLDER2_FIRST_NAME(getPOLICY_HOLDER2_FIRST_NAME());
		clone.setPOLICY_HOLDER2_MIDDLE_NAME(getPOLICY_HOLDER2_MIDDLE_NAME());
		clone.setPOLICY_HOLDER2_LAST_NAME(getPOLICY_HOLDER2_LAST_NAME());
		clone.setCHILD_FIRST_NAME(getCHILD_FIRST_NAME());
		clone.setCHILD_DOB(getCHILD_DOB());
		clone.setCHILD_LAST_NAME(getCHILD_LAST_NAME());
		clone.setCURRENT_STATUS(getCURRENT_STATUS());
		clone.setPREMIUM_AMOUNT(getPREMIUM_AMOUNT());
		clone.setFREQUENCY(getFREQUENCY());
		clone.setBRANCH_CODE(getBRANCH_CODE());
		clone.setLG_CODE(getLG_CODE());
		clone.setAPPLICATION_NUMBER(getAPPLICATION_NUMBER());
		clone.setAPPLICATION_DATE(getAPPLICATION_DATE());
		clone.setPOLICY_HOLDER1_TITLE(getPOLICY_HOLDER1_TITLE());
		clone.setCRO_NAME(getCRO_NAME());
		clone.setCRO_NUMBER(getCRO_NUMBER());
		clone.setBRANCH_NAME(getBRANCH_NAME());
		clone.setPRODUCT_NAME(getPRODUCT_NAME());
		clone.setREQUIREMENT_FLAG(getREQUIREMENT_FLAG());
		clone.setTERM(getTERM());
		clone.setMATURITY_DATE(getMATURITY_DATE());
		clone.setAMOUNT_DEPOSITED(getAMOUNT_DEPOSITED());
		clone.setTOTAL_DUE_AMT(getTOTAL_DUE_AMT());
		clone.setCHANNEL_TYPE(getCHANNEL_TYPE());
		clone.setLIFE_ASSURED_NAME(getLIFE_ASSURED_NAME());
		clone.setLIFE_ASSURED_DOB(getLIFE_ASSURED_DOB());
		clone.setPOLICY_HOLDER1_EMAIL(getPOLICY_HOLDER1_EMAIL());
		clone.setPOLICY_HOLDER1_ADD1(getPOLICY_HOLDER1_ADD1());
		clone.setPOLICY_HOLDER1_ADD2(getPOLICY_HOLDER1_ADD2());
		clone.setPOLICY_HOLDER1_CONTACT1(getPOLICY_HOLDER1_CONTACT1());
		clone.setPOLICY_HOLDER1_CONTACT2(getPOLICY_HOLDER1_CONTACT2());
		clone.setPOLICY_HOLDER1_DOB(getPOLICY_HOLDER1_DOB());
		clone.setRISK_COMMENCEMENT_DATE(getRISK_COMMENCEMENT_DATE());

		return clone;
	}

	@Override
	public int compareTo(PolicyInfo policyInfo) {
		String primaryKey = policyInfo.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyInfoClp)) {
			return false;
		}

		PolicyInfoClp policyInfo = (PolicyInfoClp)obj;

		String primaryKey = policyInfo.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", PRODUCT_ID=");
		sb.append(getPRODUCT_ID());
		sb.append(", POLICY_DATE=");
		sb.append(getPOLICY_DATE());
		sb.append(", NEXT_PREMIUM_DUEDATE=");
		sb.append(getNEXT_PREMIUM_DUEDATE());
		sb.append(", POLICY_HOLDER1_FIRST_NAME=");
		sb.append(getPOLICY_HOLDER1_FIRST_NAME());
		sb.append(", POLICY_HOLDER1_MIDDLE_NAME=");
		sb.append(getPOLICY_HOLDER1_MIDDLE_NAME());
		sb.append(", POLICY_HOLDER1_LAST_NAME=");
		sb.append(getPOLICY_HOLDER1_LAST_NAME());
		sb.append(", SUM_ASSURED=");
		sb.append(getSUM_ASSURED());
		sb.append(", POLICY_HOLDER2_FIRST_NAME=");
		sb.append(getPOLICY_HOLDER2_FIRST_NAME());
		sb.append(", POLICY_HOLDER2_MIDDLE_NAME=");
		sb.append(getPOLICY_HOLDER2_MIDDLE_NAME());
		sb.append(", POLICY_HOLDER2_LAST_NAME=");
		sb.append(getPOLICY_HOLDER2_LAST_NAME());
		sb.append(", CHILD_FIRST_NAME=");
		sb.append(getCHILD_FIRST_NAME());
		sb.append(", CHILD_DOB=");
		sb.append(getCHILD_DOB());
		sb.append(", CHILD_LAST_NAME=");
		sb.append(getCHILD_LAST_NAME());
		sb.append(", CURRENT_STATUS=");
		sb.append(getCURRENT_STATUS());
		sb.append(", PREMIUM_AMOUNT=");
		sb.append(getPREMIUM_AMOUNT());
		sb.append(", FREQUENCY=");
		sb.append(getFREQUENCY());
		sb.append(", BRANCH_CODE=");
		sb.append(getBRANCH_CODE());
		sb.append(", LG_CODE=");
		sb.append(getLG_CODE());
		sb.append(", APPLICATION_NUMBER=");
		sb.append(getAPPLICATION_NUMBER());
		sb.append(", APPLICATION_DATE=");
		sb.append(getAPPLICATION_DATE());
		sb.append(", POLICY_HOLDER1_TITLE=");
		sb.append(getPOLICY_HOLDER1_TITLE());
		sb.append(", CRO_NAME=");
		sb.append(getCRO_NAME());
		sb.append(", CRO_NUMBER=");
		sb.append(getCRO_NUMBER());
		sb.append(", BRANCH_NAME=");
		sb.append(getBRANCH_NAME());
		sb.append(", PRODUCT_NAME=");
		sb.append(getPRODUCT_NAME());
		sb.append(", REQUIREMENT_FLAG=");
		sb.append(getREQUIREMENT_FLAG());
		sb.append(", TERM=");
		sb.append(getTERM());
		sb.append(", MATURITY_DATE=");
		sb.append(getMATURITY_DATE());
		sb.append(", AMOUNT_DEPOSITED=");
		sb.append(getAMOUNT_DEPOSITED());
		sb.append(", TOTAL_DUE_AMT=");
		sb.append(getTOTAL_DUE_AMT());
		sb.append(", CHANNEL_TYPE=");
		sb.append(getCHANNEL_TYPE());
		sb.append(", LIFE_ASSURED_NAME=");
		sb.append(getLIFE_ASSURED_NAME());
		sb.append(", LIFE_ASSURED_DOB=");
		sb.append(getLIFE_ASSURED_DOB());
		sb.append(", POLICY_HOLDER1_EMAIL=");
		sb.append(getPOLICY_HOLDER1_EMAIL());
		sb.append(", POLICY_HOLDER1_ADD1=");
		sb.append(getPOLICY_HOLDER1_ADD1());
		sb.append(", POLICY_HOLDER1_ADD2=");
		sb.append(getPOLICY_HOLDER1_ADD2());
		sb.append(", POLICY_HOLDER1_CONTACT1=");
		sb.append(getPOLICY_HOLDER1_CONTACT1());
		sb.append(", POLICY_HOLDER1_CONTACT2=");
		sb.append(getPOLICY_HOLDER1_CONTACT2());
		sb.append(", POLICY_HOLDER1_DOB=");
		sb.append(getPOLICY_HOLDER1_DOB());
		sb.append(", RISK_COMMENCEMENT_DATE=");
		sb.append(getRISK_COMMENCEMENT_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(130);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRODUCT_ID</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_DATE</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NEXT_PREMIUM_DUEDATE</column-name><column-value><![CDATA[");
		sb.append(getNEXT_PREMIUM_DUEDATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_FIRST_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_FIRST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_MIDDLE_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_MIDDLE_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_LAST_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_LAST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUM_ASSURED</column-name><column-value><![CDATA[");
		sb.append(getSUM_ASSURED());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER2_FIRST_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER2_FIRST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER2_MIDDLE_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER2_MIDDLE_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER2_LAST_NAME</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER2_LAST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHILD_FIRST_NAME</column-name><column-value><![CDATA[");
		sb.append(getCHILD_FIRST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHILD_DOB</column-name><column-value><![CDATA[");
		sb.append(getCHILD_DOB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHILD_LAST_NAME</column-name><column-value><![CDATA[");
		sb.append(getCHILD_LAST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CURRENT_STATUS</column-name><column-value><![CDATA[");
		sb.append(getCURRENT_STATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PREMIUM_AMOUNT</column-name><column-value><![CDATA[");
		sb.append(getPREMIUM_AMOUNT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FREQUENCY</column-name><column-value><![CDATA[");
		sb.append(getFREQUENCY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CODE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LG_CODE</column-name><column-value><![CDATA[");
		sb.append(getLG_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>APPLICATION_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getAPPLICATION_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>APPLICATION_DATE</column-name><column-value><![CDATA[");
		sb.append(getAPPLICATION_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_TITLE</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_TITLE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CRO_NAME</column-name><column-value><![CDATA[");
		sb.append(getCRO_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CRO_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getCRO_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_NAME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRODUCT_NAME</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQUIREMENT_FLAG</column-name><column-value><![CDATA[");
		sb.append(getREQUIREMENT_FLAG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TERM</column-name><column-value><![CDATA[");
		sb.append(getTERM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MATURITY_DATE</column-name><column-value><![CDATA[");
		sb.append(getMATURITY_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AMOUNT_DEPOSITED</column-name><column-value><![CDATA[");
		sb.append(getAMOUNT_DEPOSITED());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TOTAL_DUE_AMT</column-name><column-value><![CDATA[");
		sb.append(getTOTAL_DUE_AMT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHANNEL_TYPE</column-name><column-value><![CDATA[");
		sb.append(getCHANNEL_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LIFE_ASSURED_NAME</column-name><column-value><![CDATA[");
		sb.append(getLIFE_ASSURED_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LIFE_ASSURED_DOB</column-name><column-value><![CDATA[");
		sb.append(getLIFE_ASSURED_DOB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_EMAIL</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_EMAIL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_ADD1</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_ADD1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_ADD2</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_ADD2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_CONTACT1</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_CONTACT1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_CONTACT2</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_CONTACT2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_HOLDER1_DOB</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_HOLDER1_DOB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RISK_COMMENCEMENT_DATE</column-name><column-value><![CDATA[");
		sb.append(getRISK_COMMENCEMENT_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _POLICY_ID;
	private int _CUSTOMER_ID;
	private int _PRODUCT_ID;
	private String _POLICY_DATE;
	private String _NEXT_PREMIUM_DUEDATE;
	private String _POLICY_HOLDER1_FIRST_NAME;
	private String _POLICY_HOLDER1_MIDDLE_NAME;
	private String _POLICY_HOLDER1_LAST_NAME;
	private double _SUM_ASSURED;
	private String _POLICY_HOLDER2_FIRST_NAME;
	private String _POLICY_HOLDER2_MIDDLE_NAME;
	private String _POLICY_HOLDER2_LAST_NAME;
	private String _CHILD_FIRST_NAME;
	private String _CHILD_DOB;
	private String _CHILD_LAST_NAME;
	private String _CURRENT_STATUS;
	private int _PREMIUM_AMOUNT;
	private String _FREQUENCY;
	private String _BRANCH_CODE;
	private String _LG_CODE;
	private String _APPLICATION_NUMBER;
	private String _APPLICATION_DATE;
	private String _POLICY_HOLDER1_TITLE;
	private String _CRO_NAME;
	private String _CRO_NUMBER;
	private String _BRANCH_NAME;
	private String _PRODUCT_NAME;
	private String _REQUIREMENT_FLAG;
	private int _TERM;
	private Date _MATURITY_DATE;
	private double _AMOUNT_DEPOSITED;
	private double _TOTAL_DUE_AMT;
	private String _CHANNEL_TYPE;
	private String _LIFE_ASSURED_NAME;
	private Date _LIFE_ASSURED_DOB;
	private String _POLICY_HOLDER1_EMAIL;
	private String _POLICY_HOLDER1_ADD1;
	private String _POLICY_HOLDER1_ADD2;
	private String _POLICY_HOLDER1_CONTACT1;
	private String _POLICY_HOLDER1_CONTACT2;
	private String _POLICY_HOLDER1_DOB;
	private Date _RISK_COMMENCEMENT_DATE;
	private BaseModel<?> _policyInfoRemoteModel;
}