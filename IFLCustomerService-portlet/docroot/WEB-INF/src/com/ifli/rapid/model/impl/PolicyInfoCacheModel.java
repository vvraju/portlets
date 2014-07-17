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

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.PolicyInfo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PolicyInfo in entity cache.
 *
 * @author Satya Kola
 * @see PolicyInfo
 * @generated
 */
public class PolicyInfoCacheModel implements CacheModel<PolicyInfo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", PRODUCT_ID=");
		sb.append(PRODUCT_ID);
		sb.append(", POLICY_DATE=");
		sb.append(POLICY_DATE);
		sb.append(", NEXT_PREMIUM_DUEDATE=");
		sb.append(NEXT_PREMIUM_DUEDATE);
		sb.append(", POLICY_HOLDER1_FIRST_NAME=");
		sb.append(POLICY_HOLDER1_FIRST_NAME);
		sb.append(", POLICY_HOLDER1_MIDDLE_NAME=");
		sb.append(POLICY_HOLDER1_MIDDLE_NAME);
		sb.append(", POLICY_HOLDER1_LAST_NAME=");
		sb.append(POLICY_HOLDER1_LAST_NAME);
		sb.append(", SUM_ASSURED=");
		sb.append(SUM_ASSURED);
		sb.append(", POLICY_HOLDER2_FIRST_NAME=");
		sb.append(POLICY_HOLDER2_FIRST_NAME);
		sb.append(", POLICY_HOLDER2_MIDDLE_NAME=");
		sb.append(POLICY_HOLDER2_MIDDLE_NAME);
		sb.append(", POLICY_HOLDER2_LAST_NAME=");
		sb.append(POLICY_HOLDER2_LAST_NAME);
		sb.append(", CHILD_FIRST_NAME=");
		sb.append(CHILD_FIRST_NAME);
		sb.append(", CHILD_DOB=");
		sb.append(CHILD_DOB);
		sb.append(", CHILD_LAST_NAME=");
		sb.append(CHILD_LAST_NAME);
		sb.append(", CURRENT_STATUS=");
		sb.append(CURRENT_STATUS);
		sb.append(", PREMIUM_AMOUNT=");
		sb.append(PREMIUM_AMOUNT);
		sb.append(", FREQUENCY=");
		sb.append(FREQUENCY);
		sb.append(", BRANCH_CODE=");
		sb.append(BRANCH_CODE);
		sb.append(", LG_CODE=");
		sb.append(LG_CODE);
		sb.append(", APPLICATION_NUMBER=");
		sb.append(APPLICATION_NUMBER);
		sb.append(", APPLICATION_DATE=");
		sb.append(APPLICATION_DATE);
		sb.append(", POLICY_HOLDER1_TITLE=");
		sb.append(POLICY_HOLDER1_TITLE);
		sb.append(", CRO_NAME=");
		sb.append(CRO_NAME);
		sb.append(", CRO_NUMBER=");
		sb.append(CRO_NUMBER);
		sb.append(", BRANCH_NAME=");
		sb.append(BRANCH_NAME);
		sb.append(", PRODUCT_NAME=");
		sb.append(PRODUCT_NAME);
		sb.append(", REQUIREMENT_FLAG=");
		sb.append(REQUIREMENT_FLAG);
		sb.append(", TERM=");
		sb.append(TERM);
		sb.append(", MATURITY_DATE=");
		sb.append(MATURITY_DATE);
		sb.append(", AMOUNT_DEPOSITED=");
		sb.append(AMOUNT_DEPOSITED);
		sb.append(", TOTAL_DUE_AMT=");
		sb.append(TOTAL_DUE_AMT);
		sb.append(", CHANNEL_TYPE=");
		sb.append(CHANNEL_TYPE);
		sb.append(", LIFE_ASSURED_NAME=");
		sb.append(LIFE_ASSURED_NAME);
		sb.append(", LIFE_ASSURED_DOB=");
		sb.append(LIFE_ASSURED_DOB);
		sb.append(", POLICY_HOLDER1_EMAIL=");
		sb.append(POLICY_HOLDER1_EMAIL);
		sb.append(", POLICY_HOLDER1_ADD1=");
		sb.append(POLICY_HOLDER1_ADD1);
		sb.append(", POLICY_HOLDER1_ADD2=");
		sb.append(POLICY_HOLDER1_ADD2);
		sb.append(", POLICY_HOLDER1_CONTACT1=");
		sb.append(POLICY_HOLDER1_CONTACT1);
		sb.append(", POLICY_HOLDER1_CONTACT2=");
		sb.append(POLICY_HOLDER1_CONTACT2);
		sb.append(", POLICY_HOLDER1_DOB=");
		sb.append(POLICY_HOLDER1_DOB);
		sb.append(", RISK_COMMENCEMENT_DATE=");
		sb.append(RISK_COMMENCEMENT_DATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyInfo toEntityModel() {
		PolicyInfoImpl policyInfoImpl = new PolicyInfoImpl();

		if (POLICY_ID == null) {
			policyInfoImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_ID(POLICY_ID);
		}

		policyInfoImpl.setCUSTOMER_ID(CUSTOMER_ID);
		policyInfoImpl.setPRODUCT_ID(PRODUCT_ID);

		if (POLICY_DATE == null) {
			policyInfoImpl.setPOLICY_DATE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_DATE(POLICY_DATE);
		}

		if (NEXT_PREMIUM_DUEDATE == null) {
			policyInfoImpl.setNEXT_PREMIUM_DUEDATE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setNEXT_PREMIUM_DUEDATE(NEXT_PREMIUM_DUEDATE);
		}

		if (POLICY_HOLDER1_FIRST_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER1_FIRST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_FIRST_NAME(POLICY_HOLDER1_FIRST_NAME);
		}

		if (POLICY_HOLDER1_MIDDLE_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER1_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_MIDDLE_NAME(POLICY_HOLDER1_MIDDLE_NAME);
		}

		if (POLICY_HOLDER1_LAST_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER1_LAST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_LAST_NAME(POLICY_HOLDER1_LAST_NAME);
		}

		policyInfoImpl.setSUM_ASSURED(SUM_ASSURED);

		if (POLICY_HOLDER2_FIRST_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER2_FIRST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER2_FIRST_NAME(POLICY_HOLDER2_FIRST_NAME);
		}

		if (POLICY_HOLDER2_MIDDLE_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER2_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER2_MIDDLE_NAME(POLICY_HOLDER2_MIDDLE_NAME);
		}

		if (POLICY_HOLDER2_LAST_NAME == null) {
			policyInfoImpl.setPOLICY_HOLDER2_LAST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER2_LAST_NAME(POLICY_HOLDER2_LAST_NAME);
		}

		if (CHILD_FIRST_NAME == null) {
			policyInfoImpl.setCHILD_FIRST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCHILD_FIRST_NAME(CHILD_FIRST_NAME);
		}

		if (CHILD_DOB == null) {
			policyInfoImpl.setCHILD_DOB(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCHILD_DOB(CHILD_DOB);
		}

		if (CHILD_LAST_NAME == null) {
			policyInfoImpl.setCHILD_LAST_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCHILD_LAST_NAME(CHILD_LAST_NAME);
		}

		if (CURRENT_STATUS == null) {
			policyInfoImpl.setCURRENT_STATUS(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCURRENT_STATUS(CURRENT_STATUS);
		}

		policyInfoImpl.setPREMIUM_AMOUNT(PREMIUM_AMOUNT);

		if (FREQUENCY == null) {
			policyInfoImpl.setFREQUENCY(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setFREQUENCY(FREQUENCY);
		}

		if (BRANCH_CODE == null) {
			policyInfoImpl.setBRANCH_CODE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setBRANCH_CODE(BRANCH_CODE);
		}

		if (LG_CODE == null) {
			policyInfoImpl.setLG_CODE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setLG_CODE(LG_CODE);
		}

		if (APPLICATION_NUMBER == null) {
			policyInfoImpl.setAPPLICATION_NUMBER(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setAPPLICATION_NUMBER(APPLICATION_NUMBER);
		}

		if (APPLICATION_DATE == null) {
			policyInfoImpl.setAPPLICATION_DATE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setAPPLICATION_DATE(APPLICATION_DATE);
		}

		if (POLICY_HOLDER1_TITLE == null) {
			policyInfoImpl.setPOLICY_HOLDER1_TITLE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_TITLE(POLICY_HOLDER1_TITLE);
		}

		if (CRO_NAME == null) {
			policyInfoImpl.setCRO_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCRO_NAME(CRO_NAME);
		}

		if (CRO_NUMBER == null) {
			policyInfoImpl.setCRO_NUMBER(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCRO_NUMBER(CRO_NUMBER);
		}

		if (BRANCH_NAME == null) {
			policyInfoImpl.setBRANCH_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setBRANCH_NAME(BRANCH_NAME);
		}

		if (PRODUCT_NAME == null) {
			policyInfoImpl.setPRODUCT_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPRODUCT_NAME(PRODUCT_NAME);
		}

		if (REQUIREMENT_FLAG == null) {
			policyInfoImpl.setREQUIREMENT_FLAG(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setREQUIREMENT_FLAG(REQUIREMENT_FLAG);
		}

		policyInfoImpl.setTERM(TERM);

		if (MATURITY_DATE == Long.MIN_VALUE) {
			policyInfoImpl.setMATURITY_DATE(null);
		}
		else {
			policyInfoImpl.setMATURITY_DATE(new Date(MATURITY_DATE));
		}

		policyInfoImpl.setAMOUNT_DEPOSITED(AMOUNT_DEPOSITED);
		policyInfoImpl.setTOTAL_DUE_AMT(TOTAL_DUE_AMT);

		if (CHANNEL_TYPE == null) {
			policyInfoImpl.setCHANNEL_TYPE(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setCHANNEL_TYPE(CHANNEL_TYPE);
		}

		if (LIFE_ASSURED_NAME == null) {
			policyInfoImpl.setLIFE_ASSURED_NAME(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setLIFE_ASSURED_NAME(LIFE_ASSURED_NAME);
		}

		if (LIFE_ASSURED_DOB == Long.MIN_VALUE) {
			policyInfoImpl.setLIFE_ASSURED_DOB(null);
		}
		else {
			policyInfoImpl.setLIFE_ASSURED_DOB(new Date(LIFE_ASSURED_DOB));
		}

		if (POLICY_HOLDER1_EMAIL == null) {
			policyInfoImpl.setPOLICY_HOLDER1_EMAIL(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_EMAIL(POLICY_HOLDER1_EMAIL);
		}

		if (POLICY_HOLDER1_ADD1 == null) {
			policyInfoImpl.setPOLICY_HOLDER1_ADD1(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_ADD1(POLICY_HOLDER1_ADD1);
		}

		if (POLICY_HOLDER1_ADD2 == null) {
			policyInfoImpl.setPOLICY_HOLDER1_ADD2(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_ADD2(POLICY_HOLDER1_ADD2);
		}

		if (POLICY_HOLDER1_CONTACT1 == null) {
			policyInfoImpl.setPOLICY_HOLDER1_CONTACT1(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_CONTACT1(POLICY_HOLDER1_CONTACT1);
		}

		if (POLICY_HOLDER1_CONTACT2 == null) {
			policyInfoImpl.setPOLICY_HOLDER1_CONTACT2(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_CONTACT2(POLICY_HOLDER1_CONTACT2);
		}

		if (POLICY_HOLDER1_DOB == null) {
			policyInfoImpl.setPOLICY_HOLDER1_DOB(StringPool.BLANK);
		}
		else {
			policyInfoImpl.setPOLICY_HOLDER1_DOB(POLICY_HOLDER1_DOB);
		}

		if (RISK_COMMENCEMENT_DATE == Long.MIN_VALUE) {
			policyInfoImpl.setRISK_COMMENCEMENT_DATE(null);
		}
		else {
			policyInfoImpl.setRISK_COMMENCEMENT_DATE(new Date(
					RISK_COMMENCEMENT_DATE));
		}

		policyInfoImpl.resetOriginalValues();

		return policyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		POLICY_ID = objectInput.readUTF();
		CUSTOMER_ID = objectInput.readInt();
		PRODUCT_ID = objectInput.readInt();
		POLICY_DATE = objectInput.readUTF();
		NEXT_PREMIUM_DUEDATE = objectInput.readUTF();
		POLICY_HOLDER1_FIRST_NAME = objectInput.readUTF();
		POLICY_HOLDER1_MIDDLE_NAME = objectInput.readUTF();
		POLICY_HOLDER1_LAST_NAME = objectInput.readUTF();
		SUM_ASSURED = objectInput.readDouble();
		POLICY_HOLDER2_FIRST_NAME = objectInput.readUTF();
		POLICY_HOLDER2_MIDDLE_NAME = objectInput.readUTF();
		POLICY_HOLDER2_LAST_NAME = objectInput.readUTF();
		CHILD_FIRST_NAME = objectInput.readUTF();
		CHILD_DOB = objectInput.readUTF();
		CHILD_LAST_NAME = objectInput.readUTF();
		CURRENT_STATUS = objectInput.readUTF();
		PREMIUM_AMOUNT = objectInput.readInt();
		FREQUENCY = objectInput.readUTF();
		BRANCH_CODE = objectInput.readUTF();
		LG_CODE = objectInput.readUTF();
		APPLICATION_NUMBER = objectInput.readUTF();
		APPLICATION_DATE = objectInput.readUTF();
		POLICY_HOLDER1_TITLE = objectInput.readUTF();
		CRO_NAME = objectInput.readUTF();
		CRO_NUMBER = objectInput.readUTF();
		BRANCH_NAME = objectInput.readUTF();
		PRODUCT_NAME = objectInput.readUTF();
		REQUIREMENT_FLAG = objectInput.readUTF();
		TERM = objectInput.readInt();
		MATURITY_DATE = objectInput.readLong();
		AMOUNT_DEPOSITED = objectInput.readDouble();
		TOTAL_DUE_AMT = objectInput.readDouble();
		CHANNEL_TYPE = objectInput.readUTF();
		LIFE_ASSURED_NAME = objectInput.readUTF();
		LIFE_ASSURED_DOB = objectInput.readLong();
		POLICY_HOLDER1_EMAIL = objectInput.readUTF();
		POLICY_HOLDER1_ADD1 = objectInput.readUTF();
		POLICY_HOLDER1_ADD2 = objectInput.readUTF();
		POLICY_HOLDER1_CONTACT1 = objectInput.readUTF();
		POLICY_HOLDER1_CONTACT2 = objectInput.readUTF();
		POLICY_HOLDER1_DOB = objectInput.readUTF();
		RISK_COMMENCEMENT_DATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(CUSTOMER_ID);
		objectOutput.writeInt(PRODUCT_ID);

		if (POLICY_DATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_DATE);
		}

		if (NEXT_PREMIUM_DUEDATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NEXT_PREMIUM_DUEDATE);
		}

		if (POLICY_HOLDER1_FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_FIRST_NAME);
		}

		if (POLICY_HOLDER1_MIDDLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_MIDDLE_NAME);
		}

		if (POLICY_HOLDER1_LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_LAST_NAME);
		}

		objectOutput.writeDouble(SUM_ASSURED);

		if (POLICY_HOLDER2_FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER2_FIRST_NAME);
		}

		if (POLICY_HOLDER2_MIDDLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER2_MIDDLE_NAME);
		}

		if (POLICY_HOLDER2_LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER2_LAST_NAME);
		}

		if (CHILD_FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CHILD_FIRST_NAME);
		}

		if (CHILD_DOB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CHILD_DOB);
		}

		if (CHILD_LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CHILD_LAST_NAME);
		}

		if (CURRENT_STATUS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CURRENT_STATUS);
		}

		objectOutput.writeInt(PREMIUM_AMOUNT);

		if (FREQUENCY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FREQUENCY);
		}

		if (BRANCH_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_CODE);
		}

		if (LG_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LG_CODE);
		}

		if (APPLICATION_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(APPLICATION_NUMBER);
		}

		if (APPLICATION_DATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(APPLICATION_DATE);
		}

		if (POLICY_HOLDER1_TITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_TITLE);
		}

		if (CRO_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CRO_NAME);
		}

		if (CRO_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CRO_NUMBER);
		}

		if (BRANCH_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_NAME);
		}

		if (PRODUCT_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRODUCT_NAME);
		}

		if (REQUIREMENT_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(REQUIREMENT_FLAG);
		}

		objectOutput.writeInt(TERM);
		objectOutput.writeLong(MATURITY_DATE);
		objectOutput.writeDouble(AMOUNT_DEPOSITED);
		objectOutput.writeDouble(TOTAL_DUE_AMT);

		if (CHANNEL_TYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CHANNEL_TYPE);
		}

		if (LIFE_ASSURED_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LIFE_ASSURED_NAME);
		}

		objectOutput.writeLong(LIFE_ASSURED_DOB);

		if (POLICY_HOLDER1_EMAIL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_EMAIL);
		}

		if (POLICY_HOLDER1_ADD1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_ADD1);
		}

		if (POLICY_HOLDER1_ADD2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_ADD2);
		}

		if (POLICY_HOLDER1_CONTACT1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_CONTACT1);
		}

		if (POLICY_HOLDER1_CONTACT2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_CONTACT2);
		}

		if (POLICY_HOLDER1_DOB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_HOLDER1_DOB);
		}

		objectOutput.writeLong(RISK_COMMENCEMENT_DATE);
	}

	public String POLICY_ID;
	public int CUSTOMER_ID;
	public int PRODUCT_ID;
	public String POLICY_DATE;
	public String NEXT_PREMIUM_DUEDATE;
	public String POLICY_HOLDER1_FIRST_NAME;
	public String POLICY_HOLDER1_MIDDLE_NAME;
	public String POLICY_HOLDER1_LAST_NAME;
	public double SUM_ASSURED;
	public String POLICY_HOLDER2_FIRST_NAME;
	public String POLICY_HOLDER2_MIDDLE_NAME;
	public String POLICY_HOLDER2_LAST_NAME;
	public String CHILD_FIRST_NAME;
	public String CHILD_DOB;
	public String CHILD_LAST_NAME;
	public String CURRENT_STATUS;
	public int PREMIUM_AMOUNT;
	public String FREQUENCY;
	public String BRANCH_CODE;
	public String LG_CODE;
	public String APPLICATION_NUMBER;
	public String APPLICATION_DATE;
	public String POLICY_HOLDER1_TITLE;
	public String CRO_NAME;
	public String CRO_NUMBER;
	public String BRANCH_NAME;
	public String PRODUCT_NAME;
	public String REQUIREMENT_FLAG;
	public int TERM;
	public long MATURITY_DATE;
	public double AMOUNT_DEPOSITED;
	public double TOTAL_DUE_AMT;
	public String CHANNEL_TYPE;
	public String LIFE_ASSURED_NAME;
	public long LIFE_ASSURED_DOB;
	public String POLICY_HOLDER1_EMAIL;
	public String POLICY_HOLDER1_ADD1;
	public String POLICY_HOLDER1_ADD2;
	public String POLICY_HOLDER1_CONTACT1;
	public String POLICY_HOLDER1_CONTACT2;
	public String POLICY_HOLDER1_DOB;
	public long RISK_COMMENCEMENT_DATE;
}