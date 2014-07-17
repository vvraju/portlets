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

import com.ifli.rapid.model.AddressType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddressType in entity cache.
 *
 * @author Satya Kola
 * @see AddressType
 * @generated
 */
public class AddressTypeCacheModel implements CacheModel<AddressType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ADDRESS_TYPE_ID=");
		sb.append(ADDRESS_TYPE_ID);
		sb.append(", INSERTED_BY=");
		sb.append(INSERTED_BY);
		sb.append(", INSERTED_DATE=");
		sb.append(INSERTED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append(", ACTIVE_FLAG=");
		sb.append(ACTIVE_FLAG);
		sb.append(", ADDRESS_TYPE_DESC=");
		sb.append(ADDRESS_TYPE_DESC);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddressType toEntityModel() {
		AddressTypeImpl addressTypeImpl = new AddressTypeImpl();

		addressTypeImpl.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);

		if (INSERTED_BY == null) {
			addressTypeImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			addressTypeImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			addressTypeImpl.setINSERTED_DATE(null);
		}
		else {
			addressTypeImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (UPDATED_BY == null) {
			addressTypeImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			addressTypeImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			addressTypeImpl.setUPDATED_DATE(null);
		}
		else {
			addressTypeImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (ACTIVE_FLAG == null) {
			addressTypeImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			addressTypeImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		if (ADDRESS_TYPE_DESC == null) {
			addressTypeImpl.setADDRESS_TYPE_DESC(StringPool.BLANK);
		}
		else {
			addressTypeImpl.setADDRESS_TYPE_DESC(ADDRESS_TYPE_DESC);
		}

		addressTypeImpl.resetOriginalValues();

		return addressTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ADDRESS_TYPE_ID = objectInput.readInt();
		INSERTED_BY = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		ACTIVE_FLAG = objectInput.readUTF();
		ADDRESS_TYPE_DESC = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ADDRESS_TYPE_ID);

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

		if (ACTIVE_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ACTIVE_FLAG);
		}

		if (ADDRESS_TYPE_DESC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_TYPE_DESC);
		}
	}

	public int ADDRESS_TYPE_ID;
	public String INSERTED_BY;
	public long INSERTED_DATE;
	public String UPDATED_BY;
	public long UPDATED_DATE;
	public String ACTIVE_FLAG;
	public String ADDRESS_TYPE_DESC;
}