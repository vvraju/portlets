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

import com.ifli.rapid.model.PolicyPremRedirectionDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PolicyPremRedirectionDetails in entity cache.
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetails
 * @generated
 */
public class PolicyPremRedirectionDetailsCacheModel implements CacheModel<PolicyPremRedirectionDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{PREM_REDIRECTION_ID=");
		sb.append(PREM_REDIRECTION_ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", TRANSACTION_AUDIT_ID=");
		sb.append(TRANSACTION_AUDIT_ID);
		sb.append(", FUND_CODE=");
		sb.append(FUND_CODE);
		sb.append(", ALLOCATION_PERCENTAGE=");
		sb.append(ALLOCATION_PERCENTAGE);
		sb.append(", SENT_TO_ODS_FLAG=");
		sb.append(SENT_TO_ODS_FLAG);
		sb.append(", INSERTED_DATE=");
		sb.append(INSERTED_DATE);
		sb.append(", INSERTED_BY=");
		sb.append(INSERTED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyPremRedirectionDetails toEntityModel() {
		PolicyPremRedirectionDetailsImpl policyPremRedirectionDetailsImpl = new PolicyPremRedirectionDetailsImpl();

		policyPremRedirectionDetailsImpl.setPREM_REDIRECTION_ID(PREM_REDIRECTION_ID);

		if (POLICY_ID == null) {
			policyPremRedirectionDetailsImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyPremRedirectionDetailsImpl.setPOLICY_ID(POLICY_ID);
		}

		policyPremRedirectionDetailsImpl.setTRANSACTION_AUDIT_ID(TRANSACTION_AUDIT_ID);

		if (FUND_CODE == null) {
			policyPremRedirectionDetailsImpl.setFUND_CODE(StringPool.BLANK);
		}
		else {
			policyPremRedirectionDetailsImpl.setFUND_CODE(FUND_CODE);
		}

		policyPremRedirectionDetailsImpl.setALLOCATION_PERCENTAGE(ALLOCATION_PERCENTAGE);

		if (SENT_TO_ODS_FLAG == null) {
			policyPremRedirectionDetailsImpl.setSENT_TO_ODS_FLAG(StringPool.BLANK);
		}
		else {
			policyPremRedirectionDetailsImpl.setSENT_TO_ODS_FLAG(SENT_TO_ODS_FLAG);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			policyPremRedirectionDetailsImpl.setINSERTED_DATE(null);
		}
		else {
			policyPremRedirectionDetailsImpl.setINSERTED_DATE(new Date(
					INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			policyPremRedirectionDetailsImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			policyPremRedirectionDetailsImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			policyPremRedirectionDetailsImpl.setUPDATED_DATE(null);
		}
		else {
			policyPremRedirectionDetailsImpl.setUPDATED_DATE(new Date(
					UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			policyPremRedirectionDetailsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			policyPremRedirectionDetailsImpl.setUPDATED_BY(UPDATED_BY);
		}

		policyPremRedirectionDetailsImpl.resetOriginalValues();

		return policyPremRedirectionDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PREM_REDIRECTION_ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		TRANSACTION_AUDIT_ID = objectInput.readInt();
		FUND_CODE = objectInput.readUTF();
		ALLOCATION_PERCENTAGE = objectInput.readDouble();
		SENT_TO_ODS_FLAG = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PREM_REDIRECTION_ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(TRANSACTION_AUDIT_ID);

		if (FUND_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_CODE);
		}

		objectOutput.writeDouble(ALLOCATION_PERCENTAGE);

		if (SENT_TO_ODS_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SENT_TO_ODS_FLAG);
		}

		objectOutput.writeLong(INSERTED_DATE);

		if (INSERTED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INSERTED_BY);
		}

		objectOutput.writeLong(UPDATED_DATE);

		if (UPDATED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPDATED_BY);
		}
	}

	public int PREM_REDIRECTION_ID;
	public String POLICY_ID;
	public int TRANSACTION_AUDIT_ID;
	public String FUND_CODE;
	public double ALLOCATION_PERCENTAGE;
	public String SENT_TO_ODS_FLAG;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}