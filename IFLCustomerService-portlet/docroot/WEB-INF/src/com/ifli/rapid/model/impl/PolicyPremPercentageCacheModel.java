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

import com.ifli.rapid.model.PolicyPremPercentage;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PolicyPremPercentage in entity cache.
 *
 * @author Satya Kola
 * @see PolicyPremPercentage
 * @generated
 */
public class PolicyPremPercentageCacheModel implements CacheModel<PolicyPremPercentage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{PREM_PERCENTAGE_ID=");
		sb.append(PREM_PERCENTAGE_ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", FUND_ID=");
		sb.append(FUND_ID);
		sb.append(", FUND_PERCENTAGE=");
		sb.append(FUND_PERCENTAGE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyPremPercentage toEntityModel() {
		PolicyPremPercentageImpl policyPremPercentageImpl = new PolicyPremPercentageImpl();

		policyPremPercentageImpl.setPREM_PERCENTAGE_ID(PREM_PERCENTAGE_ID);

		if (POLICY_ID == null) {
			policyPremPercentageImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyPremPercentageImpl.setPOLICY_ID(POLICY_ID);
		}

		policyPremPercentageImpl.setFUND_ID(FUND_ID);
		policyPremPercentageImpl.setFUND_PERCENTAGE(FUND_PERCENTAGE);

		policyPremPercentageImpl.resetOriginalValues();

		return policyPremPercentageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PREM_PERCENTAGE_ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		FUND_ID = objectInput.readInt();
		FUND_PERCENTAGE = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PREM_PERCENTAGE_ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		objectOutput.writeInt(FUND_ID);
		objectOutput.writeInt(FUND_PERCENTAGE);
	}

	public int PREM_PERCENTAGE_ID;
	public String POLICY_ID;
	public int FUND_ID;
	public int FUND_PERCENTAGE;
}