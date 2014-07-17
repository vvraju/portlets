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

import com.ifli.rapid.model.ActiveServiceRequests;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActiveServiceRequests in entity cache.
 *
 * @author Satya Kola
 * @see ActiveServiceRequests
 * @generated
 */
public class ActiveServiceRequestsCacheModel implements CacheModel<ActiveServiceRequests>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append(", TYPE_ID=");
		sb.append(TYPE_ID);
		sb.append(", SUB_TYPE_ID=");
		sb.append(SUB_TYPE_ID);
		sb.append(", ASSIGNED_TO=");
		sb.append(ASSIGNED_TO);
		sb.append(", HANDLED_BY=");
		sb.append(HANDLED_BY);
		sb.append(", STATUS_ID=");
		sb.append(STATUS_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", CUST_SR_NUMBER=");
		sb.append(CUST_SR_NUMBER);
		sb.append(", ADDITIONAL_DATA_XML=");
		sb.append(ADDITIONAL_DATA_XML);
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
	public ActiveServiceRequests toEntityModel() {
		ActiveServiceRequestsImpl activeServiceRequestsImpl = new ActiveServiceRequestsImpl();

		activeServiceRequestsImpl.setQRC_ASR_ID(QRC_ASR_ID);
		activeServiceRequestsImpl.setTYPE_ID(TYPE_ID);
		activeServiceRequestsImpl.setSUB_TYPE_ID(SUB_TYPE_ID);
		activeServiceRequestsImpl.setASSIGNED_TO(ASSIGNED_TO);
		activeServiceRequestsImpl.setHANDLED_BY(HANDLED_BY);
		activeServiceRequestsImpl.setSTATUS_ID(STATUS_ID);
		activeServiceRequestsImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (CUST_SR_NUMBER == null) {
			activeServiceRequestsImpl.setCUST_SR_NUMBER(StringPool.BLANK);
		}
		else {
			activeServiceRequestsImpl.setCUST_SR_NUMBER(CUST_SR_NUMBER);
		}

		if (ADDITIONAL_DATA_XML == null) {
			activeServiceRequestsImpl.setADDITIONAL_DATA_XML(StringPool.BLANK);
		}
		else {
			activeServiceRequestsImpl.setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			activeServiceRequestsImpl.setINSERTED_DATE(null);
		}
		else {
			activeServiceRequestsImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			activeServiceRequestsImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			activeServiceRequestsImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			activeServiceRequestsImpl.setUPDATED_DATE(null);
		}
		else {
			activeServiceRequestsImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			activeServiceRequestsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			activeServiceRequestsImpl.setUPDATED_BY(UPDATED_BY);
		}

		activeServiceRequestsImpl.resetOriginalValues();

		return activeServiceRequestsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QRC_ASR_ID = objectInput.readInt();
		TYPE_ID = objectInput.readInt();
		SUB_TYPE_ID = objectInput.readInt();
		ASSIGNED_TO = objectInput.readInt();
		HANDLED_BY = objectInput.readInt();
		STATUS_ID = objectInput.readInt();
		CUSTOMER_ID = objectInput.readInt();
		CUST_SR_NUMBER = objectInput.readUTF();
		ADDITIONAL_DATA_XML = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(QRC_ASR_ID);
		objectOutput.writeInt(TYPE_ID);
		objectOutput.writeInt(SUB_TYPE_ID);
		objectOutput.writeInt(ASSIGNED_TO);
		objectOutput.writeInt(HANDLED_BY);
		objectOutput.writeInt(STATUS_ID);
		objectOutput.writeInt(CUSTOMER_ID);

		if (CUST_SR_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUST_SR_NUMBER);
		}

		if (ADDITIONAL_DATA_XML == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDITIONAL_DATA_XML);
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

	public int QRC_ASR_ID;
	public int TYPE_ID;
	public int SUB_TYPE_ID;
	public int ASSIGNED_TO;
	public int HANDLED_BY;
	public int STATUS_ID;
	public int CUSTOMER_ID;
	public String CUST_SR_NUMBER;
	public String ADDITIONAL_DATA_XML;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}