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

import com.ifli.rapid.model.PolicyFund;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PolicyFund in entity cache.
 *
 * @author Satya Kola
 * @see PolicyFund
 * @generated
 */
public class PolicyFundCacheModel implements CacheModel<PolicyFund>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{POLICY_FUND_ID=");
		sb.append(POLICY_FUND_ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", FUND_ID=");
		sb.append(FUND_ID);
		sb.append(", FUND_UNITS=");
		sb.append(FUND_UNITS);
		sb.append(", NAV=");
		sb.append(NAV);
		sb.append(", TOTAL_FUND=");
		sb.append(TOTAL_FUND);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyFund toEntityModel() {
		PolicyFundImpl policyFundImpl = new PolicyFundImpl();

		policyFundImpl.setPOLICY_FUND_ID(POLICY_FUND_ID);

		if (POLICY_ID == null) {
			policyFundImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyFundImpl.setPOLICY_ID(POLICY_ID);
		}

		policyFundImpl.setFUND_ID(FUND_ID);
		policyFundImpl.setFUND_UNITS(FUND_UNITS);
		policyFundImpl.setNAV(NAV);
		policyFundImpl.setTOTAL_FUND(TOTAL_FUND);

		policyFundImpl.resetOriginalValues();

		return policyFundImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		POLICY_FUND_ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		FUND_ID = objectInput.readInt();
		FUND_UNITS = objectInput.readDouble();
		NAV = objectInput.readDouble();
		TOTAL_FUND = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(POLICY_FUND_ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(FUND_ID);
		objectOutput.writeDouble(FUND_UNITS);
		objectOutput.writeDouble(NAV);
		objectOutput.writeDouble(TOTAL_FUND);
	}

	public int POLICY_FUND_ID;
	public String POLICY_ID;
	public int FUND_ID;
	public double FUND_UNITS;
	public double NAV;
	public double TOTAL_FUND;
}