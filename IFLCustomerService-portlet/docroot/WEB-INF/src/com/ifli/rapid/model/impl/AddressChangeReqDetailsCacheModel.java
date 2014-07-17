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

import com.ifli.rapid.model.AddressChangeReqDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddressChangeReqDetails in entity cache.
 *
 * @author Satya Kola
 * @see AddressChangeReqDetails
 * @generated
 */
public class AddressChangeReqDetailsCacheModel implements CacheModel<AddressChangeReqDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{ADDR_CHANGE_DETAILS_ID=");
		sb.append(ADDR_CHANGE_DETAILS_ID);
		sb.append(", REQUEST_SUBMIT_TYPE=");
		sb.append(REQUEST_SUBMIT_TYPE);
		sb.append(", SERVICE_REQUEST_ID=");
		sb.append(SERVICE_REQUEST_ID);
		sb.append(", SUB_TYPE=");
		sb.append(SUB_TYPE);
		sb.append(", ADDRESS_TYPE_ID=");
		sb.append(ADDRESS_TYPE_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", SUBMIT_AT_BRANCH=");
		sb.append(SUBMIT_AT_BRANCH);
		sb.append(", PICKUP_DATE=");
		sb.append(PICKUP_DATE);
		sb.append(", PICKUP_TIME=");
		sb.append(PICKUP_TIME);
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
	public AddressChangeReqDetails toEntityModel() {
		AddressChangeReqDetailsImpl addressChangeReqDetailsImpl = new AddressChangeReqDetailsImpl();

		addressChangeReqDetailsImpl.setADDR_CHANGE_DETAILS_ID(ADDR_CHANGE_DETAILS_ID);

		if (REQUEST_SUBMIT_TYPE == null) {
			addressChangeReqDetailsImpl.setREQUEST_SUBMIT_TYPE(StringPool.BLANK);
		}
		else {
			addressChangeReqDetailsImpl.setREQUEST_SUBMIT_TYPE(REQUEST_SUBMIT_TYPE);
		}

		addressChangeReqDetailsImpl.setSERVICE_REQUEST_ID(SERVICE_REQUEST_ID);
		addressChangeReqDetailsImpl.setSUB_TYPE(SUB_TYPE);
		addressChangeReqDetailsImpl.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		addressChangeReqDetailsImpl.setCUSTOMER_ID(CUSTOMER_ID);
		addressChangeReqDetailsImpl.setSUBMIT_AT_BRANCH(SUBMIT_AT_BRANCH);

		if (PICKUP_DATE == Long.MIN_VALUE) {
			addressChangeReqDetailsImpl.setPICKUP_DATE(null);
		}
		else {
			addressChangeReqDetailsImpl.setPICKUP_DATE(new Date(PICKUP_DATE));
		}

		if (PICKUP_TIME == null) {
			addressChangeReqDetailsImpl.setPICKUP_TIME(StringPool.BLANK);
		}
		else {
			addressChangeReqDetailsImpl.setPICKUP_TIME(PICKUP_TIME);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			addressChangeReqDetailsImpl.setINSERTED_DATE(null);
		}
		else {
			addressChangeReqDetailsImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			addressChangeReqDetailsImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			addressChangeReqDetailsImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			addressChangeReqDetailsImpl.setUPDATED_DATE(null);
		}
		else {
			addressChangeReqDetailsImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			addressChangeReqDetailsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			addressChangeReqDetailsImpl.setUPDATED_BY(UPDATED_BY);
		}

		addressChangeReqDetailsImpl.resetOriginalValues();

		return addressChangeReqDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ADDR_CHANGE_DETAILS_ID = objectInput.readInt();
		REQUEST_SUBMIT_TYPE = objectInput.readUTF();
		SERVICE_REQUEST_ID = objectInput.readInt();
		SUB_TYPE = objectInput.readInt();
		ADDRESS_TYPE_ID = objectInput.readInt();
		CUSTOMER_ID = objectInput.readInt();
		SUBMIT_AT_BRANCH = objectInput.readInt();
		PICKUP_DATE = objectInput.readLong();
		PICKUP_TIME = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ADDR_CHANGE_DETAILS_ID);

		if (REQUEST_SUBMIT_TYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(REQUEST_SUBMIT_TYPE);
		}

		objectOutput.writeInt(SERVICE_REQUEST_ID);
		objectOutput.writeInt(SUB_TYPE);
		objectOutput.writeInt(ADDRESS_TYPE_ID);
		objectOutput.writeInt(CUSTOMER_ID);
		objectOutput.writeInt(SUBMIT_AT_BRANCH);
		objectOutput.writeLong(PICKUP_DATE);

		if (PICKUP_TIME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PICKUP_TIME);
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

	public int ADDR_CHANGE_DETAILS_ID;
	public String REQUEST_SUBMIT_TYPE;
	public int SERVICE_REQUEST_ID;
	public int SUB_TYPE;
	public int ADDRESS_TYPE_ID;
	public int CUSTOMER_ID;
	public int SUBMIT_AT_BRANCH;
	public long PICKUP_DATE;
	public String PICKUP_TIME;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}