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

import com.ifli.rapid.model.ClosedServiceRequests;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ClosedServiceRequests in entity cache.
 *
 * @author Satya Kola
 * @see ClosedServiceRequests
 * @generated
 */
public class ClosedServiceRequestsCacheModel implements CacheModel<ClosedServiceRequests>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{QRC_CSR_ID=");
		sb.append(QRC_CSR_ID);
		sb.append(", TYPE_ID=");
		sb.append(TYPE_ID);
		sb.append(", ASSIGNED_TO=");
		sb.append(ASSIGNED_TO);
		sb.append(", HANDLED_BY=");
		sb.append(HANDLED_BY);
		sb.append(", STATUS_ID=");
		sb.append(STATUS_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", customerSRNumber=");
		sb.append(customerSRNumber);
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
	public ClosedServiceRequests toEntityModel() {
		ClosedServiceRequestsImpl closedServiceRequestsImpl = new ClosedServiceRequestsImpl();

		closedServiceRequestsImpl.setQRC_CSR_ID(QRC_CSR_ID);
		closedServiceRequestsImpl.setTYPE_ID(TYPE_ID);
		closedServiceRequestsImpl.setASSIGNED_TO(ASSIGNED_TO);
		closedServiceRequestsImpl.setHANDLED_BY(HANDLED_BY);
		closedServiceRequestsImpl.setSTATUS_ID(STATUS_ID);

		if (CUSTOMER_ID == null) {
			closedServiceRequestsImpl.setCUSTOMER_ID(StringPool.BLANK);
		}
		else {
			closedServiceRequestsImpl.setCUSTOMER_ID(CUSTOMER_ID);
		}

		if (customerSRNumber == null) {
			closedServiceRequestsImpl.setCustomerSRNumber(StringPool.BLANK);
		}
		else {
			closedServiceRequestsImpl.setCustomerSRNumber(customerSRNumber);
		}

		if (ADDITIONAL_DATA_XML == null) {
			closedServiceRequestsImpl.setADDITIONAL_DATA_XML(StringPool.BLANK);
		}
		else {
			closedServiceRequestsImpl.setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			closedServiceRequestsImpl.setINSERTED_DATE(null);
		}
		else {
			closedServiceRequestsImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			closedServiceRequestsImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			closedServiceRequestsImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			closedServiceRequestsImpl.setUPDATED_DATE(null);
		}
		else {
			closedServiceRequestsImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			closedServiceRequestsImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			closedServiceRequestsImpl.setUPDATED_BY(UPDATED_BY);
		}

		closedServiceRequestsImpl.resetOriginalValues();

		return closedServiceRequestsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QRC_CSR_ID = objectInput.readInt();
		TYPE_ID = objectInput.readInt();
		ASSIGNED_TO = objectInput.readInt();
		HANDLED_BY = objectInput.readInt();
		STATUS_ID = objectInput.readInt();
		CUSTOMER_ID = objectInput.readUTF();
		customerSRNumber = objectInput.readUTF();
		ADDITIONAL_DATA_XML = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(QRC_CSR_ID);
		objectOutput.writeInt(TYPE_ID);
		objectOutput.writeInt(ASSIGNED_TO);
		objectOutput.writeInt(HANDLED_BY);
		objectOutput.writeInt(STATUS_ID);

		if (CUSTOMER_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_ID);
		}

		if (customerSRNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerSRNumber);
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

	public int QRC_CSR_ID;
	public int TYPE_ID;
	public int ASSIGNED_TO;
	public int HANDLED_BY;
	public int STATUS_ID;
	public String CUSTOMER_ID;
	public String customerSRNumber;
	public String ADDITIONAL_DATA_XML;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}