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

import com.ifli.rapid.model.FundMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FundMaster in entity cache.
 *
 * @author Satya Kola
 * @see FundMaster
 * @generated
 */
public class FundMasterCacheModel implements CacheModel<FundMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{FUND_ID=");
		sb.append(FUND_ID);
		sb.append(", FUND_NAME=");
		sb.append(FUND_NAME);
		sb.append(", FUND_CODE=");
		sb.append(FUND_CODE);
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
	public FundMaster toEntityModel() {
		FundMasterImpl fundMasterImpl = new FundMasterImpl();

		fundMasterImpl.setFUND_ID(FUND_ID);

		if (FUND_NAME == null) {
			fundMasterImpl.setFUND_NAME(StringPool.BLANK);
		}
		else {
			fundMasterImpl.setFUND_NAME(FUND_NAME);
		}

		if (FUND_CODE == null) {
			fundMasterImpl.setFUND_CODE(StringPool.BLANK);
		}
		else {
			fundMasterImpl.setFUND_CODE(FUND_CODE);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			fundMasterImpl.setINSERTED_DATE(null);
		}
		else {
			fundMasterImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			fundMasterImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			fundMasterImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			fundMasterImpl.setUPDATED_DATE(null);
		}
		else {
			fundMasterImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			fundMasterImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			fundMasterImpl.setUPDATED_BY(UPDATED_BY);
		}

		fundMasterImpl.resetOriginalValues();

		return fundMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FUND_ID = objectInput.readInt();
		FUND_NAME = objectInput.readUTF();
		FUND_CODE = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(FUND_ID);

		if (FUND_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_NAME);
		}

		if (FUND_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_CODE);
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

	public int FUND_ID;
	public String FUND_NAME;
	public String FUND_CODE;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
}