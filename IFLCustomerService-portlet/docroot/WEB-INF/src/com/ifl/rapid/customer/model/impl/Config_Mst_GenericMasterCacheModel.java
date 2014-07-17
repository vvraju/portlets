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

import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Config_Mst_GenericMaster in entity cache.
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMaster
 * @generated
 */
public class Config_Mst_GenericMasterCacheModel implements CacheModel<Config_Mst_GenericMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{GenericMasterId=");
		sb.append(GenericMasterId);
		sb.append(", MasterType=");
		sb.append(MasterType);
		sb.append(", MasterId=");
		sb.append(MasterId);
		sb.append(", MasterKey=");
		sb.append(MasterKey);
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
		sb.append(", Description=");
		sb.append(Description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Config_Mst_GenericMaster toEntityModel() {
		Config_Mst_GenericMasterImpl config_Mst_GenericMasterImpl = new Config_Mst_GenericMasterImpl();

		config_Mst_GenericMasterImpl.setGenericMasterId(GenericMasterId);

		if (MasterType == null) {
			config_Mst_GenericMasterImpl.setMasterType(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setMasterType(MasterType);
		}

		config_Mst_GenericMasterImpl.setMasterId(MasterId);

		if (MasterKey == null) {
			config_Mst_GenericMasterImpl.setMasterKey(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setMasterKey(MasterKey);
		}

		if (IsActive == null) {
			config_Mst_GenericMasterImpl.setIsActive(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setIsActive(IsActive);
		}

		if (CreatedBy == null) {
			config_Mst_GenericMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			config_Mst_GenericMasterImpl.setCreatedDate(null);
		}
		else {
			config_Mst_GenericMasterImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			config_Mst_GenericMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			config_Mst_GenericMasterImpl.setModifiedDate(null);
		}
		else {
			config_Mst_GenericMasterImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (Description == null) {
			config_Mst_GenericMasterImpl.setDescription(StringPool.BLANK);
		}
		else {
			config_Mst_GenericMasterImpl.setDescription(Description);
		}

		config_Mst_GenericMasterImpl.resetOriginalValues();

		return config_Mst_GenericMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		GenericMasterId = objectInput.readInt();
		MasterType = objectInput.readUTF();
		MasterId = objectInput.readInt();
		MasterKey = objectInput.readUTF();
		IsActive = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(GenericMasterId);

		if (MasterType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MasterType);
		}

		objectOutput.writeInt(MasterId);

		if (MasterKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MasterKey);
		}

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
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

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}
	}

	public int GenericMasterId;
	public String MasterType;
	public int MasterId;
	public String MasterKey;
	public String IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String Description;
}