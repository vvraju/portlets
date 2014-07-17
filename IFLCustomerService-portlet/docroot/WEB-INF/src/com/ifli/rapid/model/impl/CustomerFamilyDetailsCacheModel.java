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

import com.ifli.rapid.model.CustomerFamilyDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerFamilyDetails in entity cache.
 *
 * @author Satya Kola
 * @see CustomerFamilyDetails
 * @generated
 */
public class CustomerFamilyDetailsCacheModel implements CacheModel<CustomerFamilyDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{CUSTOMER_FAMILY_ID=");
		sb.append(CUSTOMER_FAMILY_ID);
		sb.append(", PERSON_NAME=");
		sb.append(PERSON_NAME);
		sb.append(", RELATION=");
		sb.append(RELATION);
		sb.append(", DEPENDENT=");
		sb.append(DEPENDENT);
		sb.append(", AGE=");
		sb.append(AGE);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", ADDED_BY=");
		sb.append(ADDED_BY);
		sb.append(", ADDED_DATE=");
		sb.append(ADDED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerFamilyDetails toEntityModel() {
		CustomerFamilyDetailsImpl customerFamilyDetailsImpl = new CustomerFamilyDetailsImpl();

		customerFamilyDetailsImpl.setCUSTOMER_FAMILY_ID(CUSTOMER_FAMILY_ID);

		if (PERSON_NAME == null) {
			customerFamilyDetailsImpl.setPERSON_NAME(StringPool.BLANK);
		}
		else {
			customerFamilyDetailsImpl.setPERSON_NAME(PERSON_NAME);
		}

		if (RELATION == null) {
			customerFamilyDetailsImpl.setRELATION(StringPool.BLANK);
		}
		else {
			customerFamilyDetailsImpl.setRELATION(RELATION);
		}

		if (DEPENDENT == null) {
			customerFamilyDetailsImpl.setDEPENDENT(StringPool.BLANK);
		}
		else {
			customerFamilyDetailsImpl.setDEPENDENT(DEPENDENT);
		}

		customerFamilyDetailsImpl.setAGE(AGE);
		customerFamilyDetailsImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (ADDED_BY == null) {
			customerFamilyDetailsImpl.setADDED_BY(StringPool.BLANK);
		}
		else {
			customerFamilyDetailsImpl.setADDED_BY(ADDED_BY);
		}

		if (ADDED_DATE == Long.MIN_VALUE) {
			customerFamilyDetailsImpl.setADDED_DATE(null);
		}
		else {
			customerFamilyDetailsImpl.setADDED_DATE(new Date(ADDED_DATE));
		}

		if (UPDATED_BY == null) {
			customerFamilyDetailsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			customerFamilyDetailsImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			customerFamilyDetailsImpl.setUPDATED_DATE(null);
		}
		else {
			customerFamilyDetailsImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		customerFamilyDetailsImpl.resetOriginalValues();

		return customerFamilyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CUSTOMER_FAMILY_ID = objectInput.readInt();
		PERSON_NAME = objectInput.readUTF();
		RELATION = objectInput.readUTF();
		DEPENDENT = objectInput.readUTF();
		AGE = objectInput.readInt();
		CUSTOMER_ID = objectInput.readInt();
		ADDED_BY = objectInput.readUTF();
		ADDED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CUSTOMER_FAMILY_ID);

		if (PERSON_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PERSON_NAME);
		}

		if (RELATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RELATION);
		}

		if (DEPENDENT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DEPENDENT);
		}

		objectOutput.writeInt(AGE);
		objectOutput.writeInt(CUSTOMER_ID);

		if (ADDED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDED_BY);
		}

		objectOutput.writeLong(ADDED_DATE);

		if (UPDATED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPDATED_BY);
		}

		objectOutput.writeLong(UPDATED_DATE);
	}

	public int CUSTOMER_FAMILY_ID;
	public String PERSON_NAME;
	public String RELATION;
	public String DEPENDENT;
	public int AGE;
	public int CUSTOMER_ID;
	public String ADDED_BY;
	public long ADDED_DATE;
	public String UPDATED_BY;
	public long UPDATED_DATE;
}