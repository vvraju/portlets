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

import com.ifli.rapid.model.PolicyTopupDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PolicyTopupDetails in entity cache.
 *
 * @author Satya Kola
 * @see PolicyTopupDetails
 * @generated
 */
public class PolicyTopupDetailsCacheModel implements CacheModel<PolicyTopupDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{TOPUP_ID=");
		sb.append(TOPUP_ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append(", FUND_ID=");
		sb.append(FUND_ID);
		sb.append(", FUND_VALUE=");
		sb.append(FUND_VALUE);
		sb.append(", TOPUP_VALUE=");
		sb.append(TOPUP_VALUE);
		sb.append(", TOT_VALUE=");
		sb.append(TOT_VALUE);
		sb.append(", TOPUP_PERCENTAGE=");
		sb.append(TOPUP_PERCENTAGE);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyTopupDetails toEntityModel() {
		PolicyTopupDetailsImpl policyTopupDetailsImpl = new PolicyTopupDetailsImpl();

		policyTopupDetailsImpl.setTOPUP_ID(TOPUP_ID);

		if (POLICY_ID == null) {
			policyTopupDetailsImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyTopupDetailsImpl.setPOLICY_ID(POLICY_ID);
		}

		policyTopupDetailsImpl.setQRC_ASR_ID(QRC_ASR_ID);
		policyTopupDetailsImpl.setFUND_ID(FUND_ID);
		policyTopupDetailsImpl.setFUND_VALUE(FUND_VALUE);
		policyTopupDetailsImpl.setTOPUP_VALUE(TOPUP_VALUE);
		policyTopupDetailsImpl.setTOT_VALUE(TOT_VALUE);
		policyTopupDetailsImpl.setTOPUP_PERCENTAGE(TOPUP_PERCENTAGE);

		if (CreatedBy == null) {
			policyTopupDetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			policyTopupDetailsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			policyTopupDetailsImpl.setCreatedDate(null);
		}
		else {
			policyTopupDetailsImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			policyTopupDetailsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			policyTopupDetailsImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			policyTopupDetailsImpl.setModifiedDate(null);
		}
		else {
			policyTopupDetailsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		policyTopupDetailsImpl.resetOriginalValues();

		return policyTopupDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TOPUP_ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		QRC_ASR_ID = objectInput.readInt();
		FUND_ID = objectInput.readInt();
		FUND_VALUE = objectInput.readDouble();
		TOPUP_VALUE = objectInput.readDouble();
		TOT_VALUE = objectInput.readDouble();
		TOPUP_PERCENTAGE = objectInput.readDouble();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(TOPUP_ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(QRC_ASR_ID);
		objectOutput.writeInt(FUND_ID);
		objectOutput.writeDouble(FUND_VALUE);
		objectOutput.writeDouble(TOPUP_VALUE);
		objectOutput.writeDouble(TOT_VALUE);
		objectOutput.writeDouble(TOPUP_PERCENTAGE);

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		objectOutput.writeLong(ModifiedDate);
	}

	public int TOPUP_ID;
	public String POLICY_ID;
	public int QRC_ASR_ID;
	public int FUND_ID;
	public double FUND_VALUE;
	public double TOPUP_VALUE;
	public double TOT_VALUE;
	public double TOPUP_PERCENTAGE;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}