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

import com.ifli.rapid.model.PremiumFrequencyMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PremiumFrequencyMaster in entity cache.
 *
 * @author Satya Kola
 * @see PremiumFrequencyMaster
 * @generated
 */
public class PremiumFrequencyMasterCacheModel implements CacheModel<PremiumFrequencyMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PremiumFrequencyId=");
		sb.append(PremiumFrequencyId);
		sb.append(", PremiumFrequencyDescription=");
		sb.append(PremiumFrequencyDescription);
		sb.append(", IsActive=");
		sb.append(IsActive);
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
	public PremiumFrequencyMaster toEntityModel() {
		PremiumFrequencyMasterImpl premiumFrequencyMasterImpl = new PremiumFrequencyMasterImpl();

		if (PremiumFrequencyId == null) {
			premiumFrequencyMasterImpl.setPremiumFrequencyId(StringPool.BLANK);
		}
		else {
			premiumFrequencyMasterImpl.setPremiumFrequencyId(PremiumFrequencyId);
		}

		if (PremiumFrequencyDescription == null) {
			premiumFrequencyMasterImpl.setPremiumFrequencyDescription(StringPool.BLANK);
		}
		else {
			premiumFrequencyMasterImpl.setPremiumFrequencyDescription(PremiumFrequencyDescription);
		}

		premiumFrequencyMasterImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			premiumFrequencyMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			premiumFrequencyMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			premiumFrequencyMasterImpl.setCreatedDate(null);
		}
		else {
			premiumFrequencyMasterImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			premiumFrequencyMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			premiumFrequencyMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			premiumFrequencyMasterImpl.setModifiedDate(null);
		}
		else {
			premiumFrequencyMasterImpl.setModifiedDate(new Date(ModifiedDate));
		}

		premiumFrequencyMasterImpl.setPriority(Priority);

		premiumFrequencyMasterImpl.resetOriginalValues();

		return premiumFrequencyMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PremiumFrequencyId = objectInput.readUTF();
		PremiumFrequencyDescription = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (PremiumFrequencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PremiumFrequencyId);
		}

		if (PremiumFrequencyDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PremiumFrequencyDescription);
		}

		objectOutput.writeBoolean(IsActive);

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

	public String PremiumFrequencyId;
	public String PremiumFrequencyDescription;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
}