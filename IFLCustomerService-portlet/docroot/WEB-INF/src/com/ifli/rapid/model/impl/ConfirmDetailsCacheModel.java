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

import com.ifli.rapid.model.ConfirmDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConfirmDetails in entity cache.
 *
 * @author Satya Kola
 * @see ConfirmDetails
 * @generated
 */
public class ConfirmDetailsCacheModel implements CacheModel<ConfirmDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append(", Approval_Status=");
		sb.append(Approval_Status);
		sb.append(", Comments=");
		sb.append(Comments);
		sb.append(", Sign_Flag=");
		sb.append(Sign_Flag);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConfirmDetails toEntityModel() {
		ConfirmDetailsImpl confirmDetailsImpl = new ConfirmDetailsImpl();

		confirmDetailsImpl.setID(ID);
		confirmDetailsImpl.setQRC_ASR_ID(QRC_ASR_ID);

		if (Approval_Status == null) {
			confirmDetailsImpl.setApproval_Status(StringPool.BLANK);
		}
		else {
			confirmDetailsImpl.setApproval_Status(Approval_Status);
		}

		if (Comments == null) {
			confirmDetailsImpl.setComments(StringPool.BLANK);
		}
		else {
			confirmDetailsImpl.setComments(Comments);
		}

		if (Sign_Flag == null) {
			confirmDetailsImpl.setSign_Flag(StringPool.BLANK);
		}
		else {
			confirmDetailsImpl.setSign_Flag(Sign_Flag);
		}

		if (CreatedBy == null) {
			confirmDetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			confirmDetailsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			confirmDetailsImpl.setCreatedDate(null);
		}
		else {
			confirmDetailsImpl.setCreatedDate(new Date(CreatedDate));
		}

		confirmDetailsImpl.resetOriginalValues();

		return confirmDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readInt();
		QRC_ASR_ID = objectInput.readInt();
		Approval_Status = objectInput.readUTF();
		Comments = objectInput.readUTF();
		Sign_Flag = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ID);
		objectOutput.writeInt(QRC_ASR_ID);

		if (Approval_Status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Approval_Status);
		}

		if (Comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Comments);
		}

		if (Sign_Flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Sign_Flag);
		}

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);
	}

	public int ID;
	public int QRC_ASR_ID;
	public String Approval_Status;
	public String Comments;
	public String Sign_Flag;
	public String CreatedBy;
	public long CreatedDate;
}