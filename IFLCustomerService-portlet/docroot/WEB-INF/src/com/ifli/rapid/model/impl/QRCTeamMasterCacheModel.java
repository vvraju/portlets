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

import com.ifli.rapid.model.QRCTeamMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QRCTeamMaster in entity cache.
 *
 * @author Satya Kola
 * @see QRCTeamMaster
 * @generated
 */
public class QRCTeamMasterCacheModel implements CacheModel<QRCTeamMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{QRC_TM_ID=");
		sb.append(QRC_TM_ID);
		sb.append(", TM_DESC=");
		sb.append(TM_DESC);
		sb.append(", ACTIVE_FLAG=");
		sb.append(ACTIVE_FLAG);
		sb.append(", INSERTED_DATE=");
		sb.append(INSERTED_DATE);
		sb.append(", INSERTED_BY=");
		sb.append(INSERTED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", DELETED_DATE=");
		sb.append(DELETED_DATE);
		sb.append(", DELETED_BY=");
		sb.append(DELETED_BY);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QRCTeamMaster toEntityModel() {
		QRCTeamMasterImpl qrcTeamMasterImpl = new QRCTeamMasterImpl();

		qrcTeamMasterImpl.setQRC_TM_ID(QRC_TM_ID);

		if (TM_DESC == null) {
			qrcTeamMasterImpl.setTM_DESC(StringPool.BLANK);
		}
		else {
			qrcTeamMasterImpl.setTM_DESC(TM_DESC);
		}

		if (ACTIVE_FLAG == null) {
			qrcTeamMasterImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			qrcTeamMasterImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			qrcTeamMasterImpl.setINSERTED_DATE(null);
		}
		else {
			qrcTeamMasterImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			qrcTeamMasterImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			qrcTeamMasterImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			qrcTeamMasterImpl.setUPDATED_DATE(null);
		}
		else {
			qrcTeamMasterImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			qrcTeamMasterImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			qrcTeamMasterImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (DELETED_DATE == Long.MIN_VALUE) {
			qrcTeamMasterImpl.setDELETED_DATE(null);
		}
		else {
			qrcTeamMasterImpl.setDELETED_DATE(new Date(DELETED_DATE));
		}

		if (DELETED_BY == null) {
			qrcTeamMasterImpl.setDELETED_BY(StringPool.BLANK);
		}
		else {
			qrcTeamMasterImpl.setDELETED_BY(DELETED_BY);
		}

		qrcTeamMasterImpl.resetOriginalValues();

		return qrcTeamMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QRC_TM_ID = objectInput.readInt();
		TM_DESC = objectInput.readUTF();
		ACTIVE_FLAG = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		DELETED_DATE = objectInput.readLong();
		DELETED_BY = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(QRC_TM_ID);

		if (TM_DESC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TM_DESC);
		}

		if (ACTIVE_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ACTIVE_FLAG);
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

		objectOutput.writeLong(DELETED_DATE);

		if (DELETED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DELETED_BY);
		}
	}

	public int QRC_TM_ID;
	public String TM_DESC;
	public String ACTIVE_FLAG;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
	public long DELETED_DATE;
	public String DELETED_BY;
}