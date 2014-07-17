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

import com.ifli.rapid.model.TempCustomerAddress;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempCustomerAddress in entity cache.
 *
 * @author Satya Kola
 * @see TempCustomerAddress
 * @generated
 */
public class TempCustomerAddressCacheModel implements CacheModel<TempCustomerAddress>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{CUSTOMER_ADDRESS_ID=");
		sb.append(CUSTOMER_ADDRESS_ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", ADDRESS_LINE_1=");
		sb.append(ADDRESS_LINE_1);
		sb.append(", ADDRESS_LINE_2=");
		sb.append(ADDRESS_LINE_2);
		sb.append(", ADDRESS_LINE_3=");
		sb.append(ADDRESS_LINE_3);
		sb.append(", CHANGE_REQUEST_TYPE=");
		sb.append(CHANGE_REQUEST_TYPE);
		sb.append(", CITY=");
		sb.append(CITY);
		sb.append(", STATE=");
		sb.append(STATE);
		sb.append(", CITY_ID=");
		sb.append(CITY_ID);
		sb.append(", STATE_ID=");
		sb.append(STATE_ID);
		sb.append(", PIN_CODE=");
		sb.append(PIN_CODE);
		sb.append(", CHANGE_REQUEST_FOR=");
		sb.append(CHANGE_REQUEST_FOR);
		sb.append(", ADDRESS_TYPE_ID=");
		sb.append(ADDRESS_TYPE_ID);
		sb.append(", ADDR_STATUS=");
		sb.append(ADDR_STATUS);
		sb.append(", INSERTED_BY=");
		sb.append(INSERTED_BY);
		sb.append(", INSERTED_DATE=");
		sb.append(INSERTED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempCustomerAddress toEntityModel() {
		TempCustomerAddressImpl tempCustomerAddressImpl = new TempCustomerAddressImpl();

		tempCustomerAddressImpl.setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		tempCustomerAddressImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (ADDRESS_LINE_1 == null) {
			tempCustomerAddressImpl.setADDRESS_LINE_1(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		if (ADDRESS_LINE_2 == null) {
			tempCustomerAddressImpl.setADDRESS_LINE_2(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		if (ADDRESS_LINE_3 == null) {
			tempCustomerAddressImpl.setADDRESS_LINE_3(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setADDRESS_LINE_3(ADDRESS_LINE_3);
		}

		if (CHANGE_REQUEST_TYPE == null) {
			tempCustomerAddressImpl.setCHANGE_REQUEST_TYPE(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setCHANGE_REQUEST_TYPE(CHANGE_REQUEST_TYPE);
		}

		if (CITY == null) {
			tempCustomerAddressImpl.setCITY(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setCITY(CITY);
		}

		if (STATE == null) {
			tempCustomerAddressImpl.setSTATE(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setSTATE(STATE);
		}

		tempCustomerAddressImpl.setCITY_ID(CITY_ID);
		tempCustomerAddressImpl.setSTATE_ID(STATE_ID);

		if (PIN_CODE == null) {
			tempCustomerAddressImpl.setPIN_CODE(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setPIN_CODE(PIN_CODE);
		}

		tempCustomerAddressImpl.setCHANGE_REQUEST_FOR(CHANGE_REQUEST_FOR);
		tempCustomerAddressImpl.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);

		if (ADDR_STATUS == null) {
			tempCustomerAddressImpl.setADDR_STATUS(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setADDR_STATUS(ADDR_STATUS);
		}

		if (INSERTED_BY == null) {
			tempCustomerAddressImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			tempCustomerAddressImpl.setINSERTED_DATE(null);
		}
		else {
			tempCustomerAddressImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (UPDATED_BY == null) {
			tempCustomerAddressImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			tempCustomerAddressImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			tempCustomerAddressImpl.setUPDATED_DATE(null);
		}
		else {
			tempCustomerAddressImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		tempCustomerAddressImpl.setQRC_ASR_ID(QRC_ASR_ID);

		tempCustomerAddressImpl.resetOriginalValues();

		return tempCustomerAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CUSTOMER_ADDRESS_ID = objectInput.readInt();
		CUSTOMER_ID = objectInput.readInt();
		ADDRESS_LINE_1 = objectInput.readUTF();
		ADDRESS_LINE_2 = objectInput.readUTF();
		ADDRESS_LINE_3 = objectInput.readUTF();
		CHANGE_REQUEST_TYPE = objectInput.readUTF();
		CITY = objectInput.readUTF();
		STATE = objectInput.readUTF();
		CITY_ID = objectInput.readInt();
		STATE_ID = objectInput.readInt();
		PIN_CODE = objectInput.readUTF();
		CHANGE_REQUEST_FOR = objectInput.readInt();
		ADDRESS_TYPE_ID = objectInput.readInt();
		ADDR_STATUS = objectInput.readUTF();
		INSERTED_BY = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		QRC_ASR_ID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CUSTOMER_ADDRESS_ID);
		objectOutput.writeInt(CUSTOMER_ID);

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

		if (CHANGE_REQUEST_TYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CHANGE_REQUEST_TYPE);
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

		objectOutput.writeInt(CITY_ID);
		objectOutput.writeInt(STATE_ID);

		if (PIN_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PIN_CODE);
		}

		objectOutput.writeInt(CHANGE_REQUEST_FOR);
		objectOutput.writeInt(ADDRESS_TYPE_ID);

		if (ADDR_STATUS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDR_STATUS);
		}

		if (INSERTED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INSERTED_BY);
		}

		objectOutput.writeLong(INSERTED_DATE);

		if (UPDATED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPDATED_BY);
		}

		objectOutput.writeLong(UPDATED_DATE);
		objectOutput.writeInt(QRC_ASR_ID);
	}

	public int CUSTOMER_ADDRESS_ID;
	public int CUSTOMER_ID;
	public String ADDRESS_LINE_1;
	public String ADDRESS_LINE_2;
	public String ADDRESS_LINE_3;
	public String CHANGE_REQUEST_TYPE;
	public String CITY;
	public String STATE;
	public int CITY_ID;
	public int STATE_ID;
	public String PIN_CODE;
	public int CHANGE_REQUEST_FOR;
	public int ADDRESS_TYPE_ID;
	public String ADDR_STATUS;
	public String INSERTED_BY;
	public long INSERTED_DATE;
	public String UPDATED_BY;
	public long UPDATED_DATE;
	public int QRC_ASR_ID;
}