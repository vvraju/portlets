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

import com.ifli.rapid.model.PremiumType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PremiumType in entity cache.
 *
 * @author Satya Kola
 * @see PremiumType
 * @generated
 */
public class PremiumTypeCacheModel implements CacheModel<PremiumType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Active=");
		sb.append(Active);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", Priority=");
		sb.append(Priority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PremiumType toEntityModel() {
		PremiumTypeImpl premiumTypeImpl = new PremiumTypeImpl();

		if (Id == null) {
			premiumTypeImpl.setId(StringPool.BLANK);
		}
		else {
			premiumTypeImpl.setId(Id);
		}

		if (Name == null) {
			premiumTypeImpl.setName(StringPool.BLANK);
		}
		else {
			premiumTypeImpl.setName(Name);
		}

		premiumTypeImpl.setActive(Active);

		if (CreatedBy == null) {
			premiumTypeImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			premiumTypeImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			premiumTypeImpl.setCreatedDate(null);
		}
		else {
			premiumTypeImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			premiumTypeImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			premiumTypeImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			premiumTypeImpl.setModifiedDate(null);
		}
		else {
			premiumTypeImpl.setModifiedDate(new Date(ModifiedDate));
		}

		premiumTypeImpl.setPriority(Priority);

		premiumTypeImpl.resetOriginalValues();

		return premiumTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readUTF();
		Name = objectInput.readUTF();
		Active = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (Id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Id);
		}

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		objectOutput.writeBoolean(Active);

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
		objectOutput.writeInt(Priority);
	}

	public String Id;
	public String Name;
	public boolean Active;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
}