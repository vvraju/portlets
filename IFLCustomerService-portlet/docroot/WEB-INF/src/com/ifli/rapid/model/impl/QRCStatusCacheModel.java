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

import com.ifli.rapid.model.QRCStatus;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QRCStatus in entity cache.
 *
 * @author Satya Kola
 * @see QRCStatus
 * @generated
 */
public class QRCStatusCacheModel implements CacheModel<QRCStatus>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{QRC_STATUS_ID=");
		sb.append(QRC_STATUS_ID);
		sb.append(", STATUS_DESC=");
		sb.append(STATUS_DESC);
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
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QRCStatus toEntityModel() {
		QRCStatusImpl qrcStatusImpl = new QRCStatusImpl();

		qrcStatusImpl.setQRC_STATUS_ID(QRC_STATUS_ID);

		if (STATUS_DESC == null) {
			qrcStatusImpl.setSTATUS_DESC(StringPool.BLANK);
		}
		else {
			qrcStatusImpl.setSTATUS_DESC(STATUS_DESC);
		}

		if (ACTIVE_FLAG == null) {
			qrcStatusImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			qrcStatusImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			qrcStatusImpl.setINSERTED_DATE(null);
		}
		else {
			qrcStatusImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			qrcStatusImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			qrcStatusImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			qrcStatusImpl.setUPDATED_DATE(null);
		}
		else {
			qrcStatusImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			qrcStatusImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			qrcStatusImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (DELETED_DATE == Long.MIN_VALUE) {
			qrcStatusImpl.setDELETED_DATE(null);
		}
		else {
			qrcStatusImpl.setDELETED_DATE(new Date(DELETED_DATE));
		}

		if (DELETED_BY == null) {
			qrcStatusImpl.setDELETED_BY(StringPool.BLANK);
		}
		else {
			qrcStatusImpl.setDELETED_BY(DELETED_BY);
		}

		qrcStatusImpl.setQRC_ASR_ID(QRC_ASR_ID);

		qrcStatusImpl.resetOriginalValues();

		return qrcStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QRC_STATUS_ID = objectInput.readInt();
		STATUS_DESC = objectInput.readUTF();
		ACTIVE_FLAG = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		INSERTED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		DELETED_DATE = objectInput.readLong();
		DELETED_BY = objectInput.readUTF();
		QRC_ASR_ID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(QRC_STATUS_ID);

		if (STATUS_DESC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATUS_DESC);
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

		objectOutput.writeInt(QRC_ASR_ID);
	}

	public int QRC_STATUS_ID;
	public String STATUS_DESC;
	public String ACTIVE_FLAG;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
	public long DELETED_DATE;
	public String DELETED_BY;
	public int QRC_ASR_ID;
}