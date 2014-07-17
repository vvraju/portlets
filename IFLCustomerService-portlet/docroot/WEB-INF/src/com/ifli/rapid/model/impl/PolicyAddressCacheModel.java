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

import com.ifli.rapid.model.PolicyAddress;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PolicyAddress in entity cache.
 *
 * @author Satya Kola
 * @see PolicyAddress
 * @generated
 */
public class PolicyAddressCacheModel implements CacheModel<PolicyAddress>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", CUSTOMER_ADDRESS_ID=");
		sb.append(CUSTOMER_ADDRESS_ID);
		sb.append(", PINCODE=");
		sb.append(PINCODE);
		sb.append(", CITY=");
		sb.append(CITY);
		sb.append(", STATE=");
		sb.append(STATE);
		sb.append(", ADDRESS_LINE_1=");
		sb.append(ADDRESS_LINE_1);
		sb.append(", ADDRESS_LINE_2=");
		sb.append(ADDRESS_LINE_2);
		sb.append(", ADDRESS_LINE_3=");
		sb.append(ADDRESS_LINE_3);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PolicyAddress toEntityModel() {
		PolicyAddressImpl policyAddressImpl = new PolicyAddressImpl();

		policyAddressImpl.setID(ID);

		if (POLICY_ID == null) {
			policyAddressImpl.setPOLICY_ID(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setPOLICY_ID(POLICY_ID);
		}

		if (CUSTOMER_ID == null) {
			policyAddressImpl.setCUSTOMER_ID(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setCUSTOMER_ID(CUSTOMER_ID);
		}

		policyAddressImpl.setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);

		if (PINCODE == null) {
			policyAddressImpl.setPINCODE(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setPINCODE(PINCODE);
		}

		if (CITY == null) {
			policyAddressImpl.setCITY(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setCITY(CITY);
		}

		if (STATE == null) {
			policyAddressImpl.setSTATE(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setSTATE(STATE);
		}

		if (ADDRESS_LINE_1 == null) {
			policyAddressImpl.setADDRESS_LINE_1(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		if (ADDRESS_LINE_2 == null) {
			policyAddressImpl.setADDRESS_LINE_2(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		if (ADDRESS_LINE_3 == null) {
			policyAddressImpl.setADDRESS_LINE_3(StringPool.BLANK);
		}
		else {
			policyAddressImpl.setADDRESS_LINE_3(ADDRESS_LINE_3);
		}

		policyAddressImpl.resetOriginalValues();

		return policyAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readInt();
		POLICY_ID = objectInput.readUTF();
		CUSTOMER_ID = objectInput.readUTF();
		CUSTOMER_ADDRESS_ID = objectInput.readInt();
		PINCODE = objectInput.readUTF();
		CITY = objectInput.readUTF();
		STATE = objectInput.readUTF();
		ADDRESS_LINE_1 = objectInput.readUTF();
		ADDRESS_LINE_2 = objectInput.readUTF();
		ADDRESS_LINE_3 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ID);

		if (POLICY_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_ID);
		}

		if (CUSTOMER_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_ID);
		}

		objectOutput.writeInt(CUSTOMER_ADDRESS_ID);

		if (PINCODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PINCODE);
		}

		if (CITY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CITY);
		}

		if (STATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATE);
		}

		if (ADDRESS_LINE_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_LINE_1);
		}

		if (ADDRESS_LINE_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_LINE_2);
		}

		if (ADDRESS_LINE_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_LINE_3);
		}
	}

	public int ID;
	public String POLICY_ID;
	public String CUSTOMER_ID;
	public int CUSTOMER_ADDRESS_ID;
	public String PINCODE;
	public String CITY;
	public String STATE;
	public String ADDRESS_LINE_1;
	public String ADDRESS_LINE_2;
	public String ADDRESS_LINE_3;
}