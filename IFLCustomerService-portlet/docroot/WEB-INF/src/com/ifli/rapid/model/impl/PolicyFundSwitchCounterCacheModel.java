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

import com.ifli.rapid.model.PolicyFundSwitchCounter;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PolicyFundSwitchCounter in entity cache.
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounter
 * @generated
 */
public class PolicyFundSwitchCounterCacheModel implements CacheModel<PolicyFundSwitchCounter>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", FUND_SWITCH_COUNTER=");
		sb.append(FUND_SWITCH_COUNTER);
		sb.append(", FUND_SWITCH_YEAR=");
		sb.append(FUND_SWITCH_YEAR);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyFundSwitchCounter toEntityModel() {
		PolicyFundSwitchCounterImpl policyFundSwitchCounterImpl = new PolicyFundSwitchCounterImpl();

		if (POLICY_ID == null) {
			policyFundSwitchCounterImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyFundSwitchCounterImpl.setPOLICY_ID(POLICY_ID);
		}

		policyFundSwitchCounterImpl.setFUND_SWITCH_COUNTER(FUND_SWITCH_COUNTER);

		if (FUND_SWITCH_YEAR == Long.MIN_VALUE) {
			policyFundSwitchCounterImpl.setFUND_SWITCH_YEAR(null);
		}
		else {
			policyFundSwitchCounterImpl.setFUND_SWITCH_YEAR(new Date(
					FUND_SWITCH_YEAR));
		}

		policyFundSwitchCounterImpl.resetOriginalValues();

		return policyFundSwitchCounterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		POLICY_ID = objectInput.readUTF();
		FUND_SWITCH_COUNTER = objectInput.readInt();
		FUND_SWITCH_YEAR = objectInput.readLong();
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

		objectOutput.writeInt(FUND_SWITCH_COUNTER);
		objectOutput.writeLong(FUND_SWITCH_YEAR);
	}

	public String POLICY_ID;
	public int FUND_SWITCH_COUNTER;
	public long FUND_SWITCH_YEAR;
}