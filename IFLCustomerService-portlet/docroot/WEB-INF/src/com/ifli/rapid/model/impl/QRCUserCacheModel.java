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

import com.ifli.rapid.model.QRCUser;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QRCUser in entity cache.
 *
 * @author Satya Kola
 * @see QRCUser
 * @generated
 */
public class QRCUserCacheModel implements CacheModel<QRCUser>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{QRC_USER_ID=");
		sb.append(QRC_USER_ID);
		sb.append(", USER_NAME=");
		sb.append(USER_NAME);
		sb.append(", TEAM_ID=");
		sb.append(TEAM_ID);
		sb.append(", USER_DETAILS=");
		sb.append(USER_DETAILS);
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
	public QRCUser toEntityModel() {
		QRCUserImpl qrcUserImpl = new QRCUserImpl();

		qrcUserImpl.setQRC_USER_ID(QRC_USER_ID);

		if (USER_NAME == null) {
			qrcUserImpl.setUSER_NAME(StringPool.BLANK);
		}
		else {
			qrcUserImpl.setUSER_NAME(USER_NAME);
		}

		qrcUserImpl.setTEAM_ID(TEAM_ID);
		qrcUserImpl.setUSER_DETAILS(USER_DETAILS);

		if (ACTIVE_FLAG == null) {
			qrcUserImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			qrcUserImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			qrcUserImpl.setINSERTED_DATE(null);
		}
		else {
			qrcUserImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (INSERTED_BY == null) {
			qrcUserImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			qrcUserImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			qrcUserImpl.setUPDATED_DATE(null);
		}
		else {
			qrcUserImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (UPDATED_BY == null) {
			qrcUserImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			qrcUserImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (DELETED_DATE == Long.MIN_VALUE) {
			qrcUserImpl.setDELETED_DATE(null);
		}
		else {
			qrcUserImpl.setDELETED_DATE(new Date(DELETED_DATE));
		}

		if (DELETED_BY == null) {
			qrcUserImpl.setDELETED_BY(StringPool.BLANK);
		}
		else {
			qrcUserImpl.setDELETED_BY(DELETED_BY);
		}

		qrcUserImpl.resetOriginalValues();

		return qrcUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QRC_USER_ID = objectInput.readInt();
		USER_NAME = objectInput.readUTF();
		TEAM_ID = objectInput.readInt();
		USER_DETAILS = objectInput.readInt();
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
		objectOutput.writeInt(QRC_USER_ID);

		if (USER_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(USER_NAME);
		}

		objectOutput.writeInt(TEAM_ID);
		objectOutput.writeInt(USER_DETAILS);

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

	public int QRC_USER_ID;
	public String USER_NAME;
	public int TEAM_ID;
	public int USER_DETAILS;
	public String ACTIVE_FLAG;
	public long INSERTED_DATE;
	public String INSERTED_BY;
	public long UPDATED_DATE;
	public String UPDATED_BY;
	public long DELETED_DATE;
	public String DELETED_BY;
}