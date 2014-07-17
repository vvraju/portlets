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

import com.ifli.rapid.model.PolicyFundSwitchDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PolicyFundSwitchDetails in entity cache.
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetails
 * @generated
 */
public class PolicyFundSwitchDetailsCacheModel implements CacheModel<PolicyFundSwitchDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{FUND_SWITCH_ID=");
		sb.append(FUND_SWITCH_ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append(", FUND_FROM=");
		sb.append(FUND_FROM);
		sb.append(", FUND_TO=");
		sb.append(FUND_TO);
		sb.append(", PRECENTAGE_OF_UNITS=");
		sb.append(PRECENTAGE_OF_UNITS);
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
	public PolicyFundSwitchDetails toEntityModel() {
		PolicyFundSwitchDetailsImpl policyFundSwitchDetailsImpl = new PolicyFundSwitchDetailsImpl();

		policyFundSwitchDetailsImpl.setFUND_SWITCH_ID(FUND_SWITCH_ID);

		if (POLICY_ID == null) {
			policyFundSwitchDetailsImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyFundSwitchDetailsImpl.setPOLICY_ID(POLICY_ID);
		}

		policyFundSwitchDetailsImpl.setQRC_ASR_ID(QRC_ASR_ID);

		if (FUND_FROM == null) {
			policyFundSwitchDetailsImpl.setFUND_FROM(StringPool.BLANK);
		}
		else {
			policyFundSwitchDetailsImpl.setFUND_FROM(FUND_FROM);
		}

		if (FUND_TO == null) {
			policyFundSwitchDetailsImpl.setFUND_TO(StringPool.BLANK);
		}
		else {
			policyFundSwitchDetailsImpl.setFUND_TO(FUND_TO);
		}

		policyFundSwitchDetailsImpl.setPRECENTAGE_OF_UNITS(PRECENTAGE_OF_UNITS);

		if (INSERTED_DATE == Long.MIN_VALUE) {
			policyFundSwitchDetailsImpl.setINSERTED_DATE(null);
		}
		else {
			policyFundSwitchDetailsImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			policyFundSwitchDetailsImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			policyFundSwitchDetailsImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			policyFundSwitchDetailsImpl.setUPDATED_DATE(null);
		}
		else {
			policyFundSwitchDetailsImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			policyFundSwitchDetailsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			policyFundSwitchDetailsImpl.setUPDATED_BY(UPDATED_BY);
		}

		policyFundSwitchDetailsImpl.resetOriginalValues();

		return policyFundSwitchDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FUND_SWITCH_ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		QRC_ASR_ID = objectInput.readInt();
		FUND_FROM = objectInput.readUTF();
		FUND_TO = objectInput.readUTF();
		PRECENTAGE_OF_UNITS = objectInput.readDouble();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(FUND_SWITCH_ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(QRC_ASR_ID);

		if (FUND_FROM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_FROM);
		}

		if (FUND_TO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_TO);
		}

		objectOutput.writeDouble(PRECENTAGE_OF_UNITS);
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

	public int FUND_SWITCH_ID;
	public String POLICY_ID;
	public int QRC_ASR_ID;
	public String FUND_FROM;
	public String FUND_TO;
	public double PRECENTAGE_OF_UNITS;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}