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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.CRMTrnContactCommunication;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRMTrnContactCommunication in entity cache.
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunication
 * @generated
 */
public class CRMTrnContactCommunicationCacheModel implements CacheModel<CRMTrnContactCommunication>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ContactCommunicationId=");
		sb.append(ContactCommunicationId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", CommunicationMedium=");
		sb.append(CommunicationMedium);
		sb.append(", CommunicationMediumId=");
		sb.append(CommunicationMediumId);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CRMTrnContactCommunication toEntityModel() {
		CRMTrnContactCommunicationImpl crmTrnContactCommunicationImpl = new CRMTrnContactCommunicationImpl();

		crmTrnContactCommunicationImpl.setContactCommunicationId(ContactCommunicationId);
		crmTrnContactCommunicationImpl.setContactId(ContactId);
		crmTrnContactCommunicationImpl.setCommunicationMedium(CommunicationMedium);

		if (CommunicationMediumId == null) {
			crmTrnContactCommunicationImpl.setCommunicationMediumId(StringPool.BLANK);
		}
		else {
			crmTrnContactCommunicationImpl.setCommunicationMediumId(CommunicationMediumId);
		}

		if (CreatedBy == null) {
			crmTrnContactCommunicationImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crmTrnContactCommunicationImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crmTrnContactCommunicationImpl.setCreatedDate(null);
		}
		else {
			crmTrnContactCommunicationImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crmTrnContactCommunicationImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crmTrnContactCommunicationImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crmTrnContactCommunicationImpl.setModifiedDate(null);
		}
		else {
			crmTrnContactCommunicationImpl.setModifiedDate(new Date(
					ModifiedDate));
		}

		if (IsActive == null) {
			crmTrnContactCommunicationImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crmTrnContactCommunicationImpl.setIsActive(IsActive);
		}

		crmTrnContactCommunicationImpl.resetOriginalValues();

		return crmTrnContactCommunicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ContactCommunicationId = objectInput.readInt();
		ContactId = objectInput.readInt();
		CommunicationMedium = objectInput.readInt();
		CommunicationMediumId = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ContactCommunicationId);
		objectOutput.writeInt(ContactId);
		objectOutput.writeInt(CommunicationMedium);

		if (CommunicationMediumId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CommunicationMediumId);
		}

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		objectOutput.writeLong(ModifiedDate);

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
		}
	}

	public int ContactCommunicationId;
	public int ContactId;
	public int CommunicationMedium;
	public String CommunicationMediumId;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}