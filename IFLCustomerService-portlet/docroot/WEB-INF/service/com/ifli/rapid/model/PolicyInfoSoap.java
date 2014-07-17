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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class PolicyInfoSoap implements Serializable {
	public static PolicyInfoSoap toSoapModel(PolicyInfo model) {
		PolicyInfoSoap soapModel = new PolicyInfoSoap();

		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setPRODUCT_ID(model.getPRODUCT_ID());
		soapModel.setPOLICY_DATE(model.getPOLICY_DATE());
		soapModel.setNEXT_PREMIUM_DUEDATE(model.getNEXT_PREMIUM_DUEDATE());
		soapModel.setPOLICY_HOLDER1_FIRST_NAME(model.getPOLICY_HOLDER1_FIRST_NAME());
		soapModel.setPOLICY_HOLDER1_MIDDLE_NAME(model.getPOLICY_HOLDER1_MIDDLE_NAME());
		soapModel.setPOLICY_HOLDER1_LAST_NAME(model.getPOLICY_HOLDER1_LAST_NAME());
		soapModel.setSUM_ASSURED(model.getSUM_ASSURED());
		soapModel.setPOLICY_HOLDER2_FIRST_NAME(model.getPOLICY_HOLDER2_FIRST_NAME());
		soapModel.setPOLICY_HOLDER2_MIDDLE_NAME(model.getPOLICY_HOLDER2_MIDDLE_NAME());
		soapModel.setPOLICY_HOLDER2_LAST_NAME(model.getPOLICY_HOLDER2_LAST_NAME());
		soapModel.setCHILD_FIRST_NAME(model.getCHILD_FIRST_NAME());
		soapModel.setCHILD_DOB(model.getCHILD_DOB());
		soapModel.setCHILD_LAST_NAME(model.getCHILD_LAST_NAME());
		soapModel.setCURRENT_STATUS(model.getCURRENT_STATUS());
		soapModel.setPREMIUM_AMOUNT(model.getPREMIUM_AMOUNT());
		soapModel.setFREQUENCY(model.getFREQUENCY());
		soapModel.setBRANCH_CODE(model.getBRANCH_CODE());
		soapModel.setLG_CODE(model.getLG_CODE());
		soapModel.setAPPLICATION_NUMBER(model.getAPPLICATION_NUMBER());
		soapModel.setAPPLICATION_DATE(model.getAPPLICATION_DATE());
		soapModel.setPOLICY_HOLDER1_TITLE(model.getPOLICY_HOLDER1_TITLE());
		soapModel.setCRO_NAME(model.getCRO_NAME());
		soapModel.setCRO_NUMBER(model.getCRO_NUMBER());
		soapModel.setBRANCH_NAME(model.getBRANCH_NAME());
		soapModel.setPRODUCT_NAME(model.getPRODUCT_NAME());
		soapModel.setREQUIREMENT_FLAG(model.getREQUIREMENT_FLAG());
		soapModel.setTERM(model.getTERM());
		soapModel.setMATURITY_DATE(model.getMATURITY_DATE());
		soapModel.setAMOUNT_DEPOSITED(model.getAMOUNT_DEPOSITED());
		soapModel.setTOTAL_DUE_AMT(model.getTOTAL_DUE_AMT());
		soapModel.setCHANNEL_TYPE(model.getCHANNEL_TYPE());
		soapModel.setLIFE_ASSURED_NAME(model.getLIFE_ASSURED_NAME());
		soapModel.setLIFE_ASSURED_DOB(model.getLIFE_ASSURED_DOB());
		soapModel.setPOLICY_HOLDER1_EMAIL(model.getPOLICY_HOLDER1_EMAIL());
		soapModel.setPOLICY_HOLDER1_ADD1(model.getPOLICY_HOLDER1_ADD1());
		soapModel.setPOLICY_HOLDER1_ADD2(model.getPOLICY_HOLDER1_ADD2());
		soapModel.setPOLICY_HOLDER1_CONTACT1(model.getPOLICY_HOLDER1_CONTACT1());
		soapModel.setPOLICY_HOLDER1_CONTACT2(model.getPOLICY_HOLDER1_CONTACT2());
		soapModel.setPOLICY_HOLDER1_DOB(model.getPOLICY_HOLDER1_DOB());
		soapModel.setRISK_COMMENCEMENT_DATE(model.getRISK_COMMENCEMENT_DATE());

		return soapModel;
	}

	public static PolicyInfoSoap[] toSoapModels(PolicyInfo[] models) {
		PolicyInfoSoap[] soapModels = new PolicyInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyInfoSoap[][] toSoapModels(PolicyInfo[][] models) {
		PolicyInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyInfoSoap[] toSoapModels(List<PolicyInfo> models) {
		List<PolicyInfoSoap> soapModels = new ArrayList<PolicyInfoSoap>(models.size());

		for (PolicyInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyInfoSoap[soapModels.size()]);
	}

	public PolicyInfoSoap() {
	}

	public String getPrimaryKey() {
		return _POLICY_ID;
	}

	public void setPrimaryKey(String pk) {
		setPOLICY_ID(pk);
	}

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public int getPRODUCT_ID() {
		return _PRODUCT_ID;
	}

	public void setPRODUCT_ID(int PRODUCT_ID) {
		_PRODUCT_ID = PRODUCT_ID;
	}

	public String getPOLICY_DATE() {
		return _POLICY_DATE;
	}

	public void setPOLICY_DATE(String POLICY_DATE) {
		_POLICY_DATE = POLICY_DATE;
	}

	public String getNEXT_PREMIUM_DUEDATE() {
		return _NEXT_PREMIUM_DUEDATE;
	}

	public void setNEXT_PREMIUM_DUEDATE(String NEXT_PREMIUM_DUEDATE) {
		_NEXT_PREMIUM_DUEDATE = NEXT_PREMIUM_DUEDATE;
	}

	public String getPOLICY_HOLDER1_FIRST_NAME() {
		return _POLICY_HOLDER1_FIRST_NAME;
	}

	public void setPOLICY_HOLDER1_FIRST_NAME(String POLICY_HOLDER1_FIRST_NAME) {
		_POLICY_HOLDER1_FIRST_NAME = POLICY_HOLDER1_FIRST_NAME;
	}

	public String getPOLICY_HOLDER1_MIDDLE_NAME() {
		return _POLICY_HOLDER1_MIDDLE_NAME;
	}

	public void setPOLICY_HOLDER1_MIDDLE_NAME(String POLICY_HOLDER1_MIDDLE_NAME) {
		_POLICY_HOLDER1_MIDDLE_NAME = POLICY_HOLDER1_MIDDLE_NAME;
	}

	public String getPOLICY_HOLDER1_LAST_NAME() {
		return _POLICY_HOLDER1_LAST_NAME;
	}

	public void setPOLICY_HOLDER1_LAST_NAME(String POLICY_HOLDER1_LAST_NAME) {
		_POLICY_HOLDER1_LAST_NAME = POLICY_HOLDER1_LAST_NAME;
	}

	public double getSUM_ASSURED() {
		return _SUM_ASSURED;
	}

	public void setSUM_ASSURED(double SUM_ASSURED) {
		_SUM_ASSURED = SUM_ASSURED;
	}

	public String getPOLICY_HOLDER2_FIRST_NAME() {
		return _POLICY_HOLDER2_FIRST_NAME;
	}

	public void setPOLICY_HOLDER2_FIRST_NAME(String POLICY_HOLDER2_FIRST_NAME) {
		_POLICY_HOLDER2_FIRST_NAME = POLICY_HOLDER2_FIRST_NAME;
	}

	public String getPOLICY_HOLDER2_MIDDLE_NAME() {
		return _POLICY_HOLDER2_MIDDLE_NAME;
	}

	public void setPOLICY_HOLDER2_MIDDLE_NAME(String POLICY_HOLDER2_MIDDLE_NAME) {
		_POLICY_HOLDER2_MIDDLE_NAME = POLICY_HOLDER2_MIDDLE_NAME;
	}

	public String getPOLICY_HOLDER2_LAST_NAME() {
		return _POLICY_HOLDER2_LAST_NAME;
	}

	public void setPOLICY_HOLDER2_LAST_NAME(String POLICY_HOLDER2_LAST_NAME) {
		_POLICY_HOLDER2_LAST_NAME = POLICY_HOLDER2_LAST_NAME;
	}

	public String getCHILD_FIRST_NAME() {
		return _CHILD_FIRST_NAME;
	}

	public void setCHILD_FIRST_NAME(String CHILD_FIRST_NAME) {
		_CHILD_FIRST_NAME = CHILD_FIRST_NAME;
	}

	public String getCHILD_DOB() {
		return _CHILD_DOB;
	}

	public void setCHILD_DOB(String CHILD_DOB) {
		_CHILD_DOB = CHILD_DOB;
	}

	public String getCHILD_LAST_NAME() {
		return _CHILD_LAST_NAME;
	}

	public void setCHILD_LAST_NAME(String CHILD_LAST_NAME) {
		_CHILD_LAST_NAME = CHILD_LAST_NAME;
	}

	public String getCURRENT_STATUS() {
		return _CURRENT_STATUS;
	}

	public void setCURRENT_STATUS(String CURRENT_STATUS) {
		_CURRENT_STATUS = CURRENT_STATUS;
	}

	public int getPREMIUM_AMOUNT() {
		return _PREMIUM_AMOUNT;
	}

	public void setPREMIUM_AMOUNT(int PREMIUM_AMOUNT) {
		_PREMIUM_AMOUNT = PREMIUM_AMOUNT;
	}

	public String getFREQUENCY() {
		return _FREQUENCY;
	}

	public void setFREQUENCY(String FREQUENCY) {
		_FREQUENCY = FREQUENCY;
	}

	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;
	}

	public String getLG_CODE() {
		return _LG_CODE;
	}

	public void setLG_CODE(String LG_CODE) {
		_LG_CODE = LG_CODE;
	}

	public String getAPPLICATION_NUMBER() {
		return _APPLICATION_NUMBER;
	}

	public void setAPPLICATION_NUMBER(String APPLICATION_NUMBER) {
		_APPLICATION_NUMBER = APPLICATION_NUMBER;
	}

	public String getAPPLICATION_DATE() {
		return _APPLICATION_DATE;
	}

	public void setAPPLICATION_DATE(String APPLICATION_DATE) {
		_APPLICATION_DATE = APPLICATION_DATE;
	}

	public String getPOLICY_HOLDER1_TITLE() {
		return _POLICY_HOLDER1_TITLE;
	}

	public void setPOLICY_HOLDER1_TITLE(String POLICY_HOLDER1_TITLE) {
		_POLICY_HOLDER1_TITLE = POLICY_HOLDER1_TITLE;
	}

	public String getCRO_NAME() {
		return _CRO_NAME;
	}

	public void setCRO_NAME(String CRO_NAME) {
		_CRO_NAME = CRO_NAME;
	}

	public String getCRO_NUMBER() {
		return _CRO_NUMBER;
	}

	public void setCRO_NUMBER(String CRO_NUMBER) {
		_CRO_NUMBER = CRO_NUMBER;
	}

	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;
	}

	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;
	}

	public String getREQUIREMENT_FLAG() {
		return _REQUIREMENT_FLAG;
	}

	public void setREQUIREMENT_FLAG(String REQUIREMENT_FLAG) {
		_REQUIREMENT_FLAG = REQUIREMENT_FLAG;
	}

	public int getTERM() {
		return _TERM;
	}

	public void setTERM(int TERM) {
		_TERM = TERM;
	}

	public Date getMATURITY_DATE() {
		return _MATURITY_DATE;
	}

	public void setMATURITY_DATE(Date MATURITY_DATE) {
		_MATURITY_DATE = MATURITY_DATE;
	}

	public double getAMOUNT_DEPOSITED() {
		return _AMOUNT_DEPOSITED;
	}

	public void setAMOUNT_DEPOSITED(double AMOUNT_DEPOSITED) {
		_AMOUNT_DEPOSITED = AMOUNT_DEPOSITED;
	}

	public double getTOTAL_DUE_AMT() {
		return _TOTAL_DUE_AMT;
	}

	public void setTOTAL_DUE_AMT(double TOTAL_DUE_AMT) {
		_TOTAL_DUE_AMT = TOTAL_DUE_AMT;
	}

	public String getCHANNEL_TYPE() {
		return _CHANNEL_TYPE;
	}

	public void setCHANNEL_TYPE(String CHANNEL_TYPE) {
		_CHANNEL_TYPE = CHANNEL_TYPE;
	}

	public String getLIFE_ASSURED_NAME() {
		return _LIFE_ASSURED_NAME;
	}

	public void setLIFE_ASSURED_NAME(String LIFE_ASSURED_NAME) {
		_LIFE_ASSURED_NAME = LIFE_ASSURED_NAME;
	}

	public Date getLIFE_ASSURED_DOB() {
		return _LIFE_ASSURED_DOB;
	}

	public void setLIFE_ASSURED_DOB(Date LIFE_ASSURED_DOB) {
		_LIFE_ASSURED_DOB = LIFE_ASSURED_DOB;
	}

	public String getPOLICY_HOLDER1_EMAIL() {
		return _POLICY_HOLDER1_EMAIL;
	}

	public void setPOLICY_HOLDER1_EMAIL(String POLICY_HOLDER1_EMAIL) {
		_POLICY_HOLDER1_EMAIL = POLICY_HOLDER1_EMAIL;
	}

	public String getPOLICY_HOLDER1_ADD1() {
		return _POLICY_HOLDER1_ADD1;
	}

	public void setPOLICY_HOLDER1_ADD1(String POLICY_HOLDER1_ADD1) {
		_POLICY_HOLDER1_ADD1 = POLICY_HOLDER1_ADD1;
	}

	public String getPOLICY_HOLDER1_ADD2() {
		return _POLICY_HOLDER1_ADD2;
	}

	public void setPOLICY_HOLDER1_ADD2(String POLICY_HOLDER1_ADD2) {
		_POLICY_HOLDER1_ADD2 = POLICY_HOLDER1_ADD2;
	}

	public String getPOLICY_HOLDER1_CONTACT1() {
		return _POLICY_HOLDER1_CONTACT1;
	}

	public void setPOLICY_HOLDER1_CONTACT1(String POLICY_HOLDER1_CONTACT1) {
		_POLICY_HOLDER1_CONTACT1 = POLICY_HOLDER1_CONTACT1;
	}

	public String getPOLICY_HOLDER1_CONTACT2() {
		return _POLICY_HOLDER1_CONTACT2;
	}

	public void setPOLICY_HOLDER1_CONTACT2(String POLICY_HOLDER1_CONTACT2) {
		_POLICY_HOLDER1_CONTACT2 = POLICY_HOLDER1_CONTACT2;
	}

	public String getPOLICY_HOLDER1_DOB() {
		return _POLICY_HOLDER1_DOB;
	}

	public void setPOLICY_HOLDER1_DOB(String POLICY_HOLDER1_DOB) {
		_POLICY_HOLDER1_DOB = POLICY_HOLDER1_DOB;
	}

	public Date getRISK_COMMENCEMENT_DATE() {
		return _RISK_COMMENCEMENT_DATE;
	}

	public void setRISK_COMMENCEMENT_DATE(Date RISK_COMMENCEMENT_DATE) {
		_RISK_COMMENCEMENT_DATE = RISK_COMMENCEMENT_DATE;
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
}