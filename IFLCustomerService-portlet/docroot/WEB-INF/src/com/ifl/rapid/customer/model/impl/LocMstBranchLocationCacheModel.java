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

import com.ifl.rapid.customer.model.LocMstBranchLocation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LocMstBranchLocation in entity cache.
 *
 * @author Satya Kola
 * @see LocMstBranchLocation
 * @generated
 */
public class LocMstBranchLocationCacheModel implements CacheModel<LocMstBranchLocation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{BranchId=");
		sb.append(BranchId);
		sb.append(", BranchName=");
		sb.append(BranchName);
		sb.append(", BranchOpeningTime=");
		sb.append(BranchOpeningTime);
		sb.append(", BranchClosingTime=");
		sb.append(BranchClosingTime);
		sb.append(", AddressFirstLine=");
		sb.append(AddressFirstLine);
		sb.append(", AddressSecondLine=");
		sb.append(AddressSecondLine);
		sb.append(", PrimaryContactNo=");
		sb.append(PrimaryContactNo);
		sb.append(", OtherContactNo=");
		sb.append(OtherContactNo);
		sb.append(", FaxNumber=");
		sb.append(FaxNumber);
		sb.append(", LocationId=");
		sb.append(LocationId);
		sb.append(", LocationId_old=");
		sb.append(LocationId_old);
		sb.append(", Longitude=");
		sb.append(Longitude);
		sb.append(", Latitude=");
		sb.append(Latitude);
		sb.append(", BranchCode=");
		sb.append(BranchCode);
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
	public LocMstBranchLocation toEntityModel() {
		LocMstBranchLocationImpl locMstBranchLocationImpl = new LocMstBranchLocationImpl();

		locMstBranchLocationImpl.setBranchId(BranchId);

		if (BranchName == null) {
			locMstBranchLocationImpl.setBranchName(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setBranchName(BranchName);
		}

		if (BranchOpeningTime == null) {
			locMstBranchLocationImpl.setBranchOpeningTime(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setBranchOpeningTime(BranchOpeningTime);
		}

		if (BranchClosingTime == null) {
			locMstBranchLocationImpl.setBranchClosingTime(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setBranchClosingTime(BranchClosingTime);
		}

		if (AddressFirstLine == null) {
			locMstBranchLocationImpl.setAddressFirstLine(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setAddressFirstLine(AddressFirstLine);
		}

		if (AddressSecondLine == null) {
			locMstBranchLocationImpl.setAddressSecondLine(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setAddressSecondLine(AddressSecondLine);
		}

		if (PrimaryContactNo == null) {
			locMstBranchLocationImpl.setPrimaryContactNo(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setPrimaryContactNo(PrimaryContactNo);
		}

		if (OtherContactNo == null) {
			locMstBranchLocationImpl.setOtherContactNo(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setOtherContactNo(OtherContactNo);
		}

		if (FaxNumber == null) {
			locMstBranchLocationImpl.setFaxNumber(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setFaxNumber(FaxNumber);
		}

		locMstBranchLocationImpl.setLocationId(LocationId);

		if (LocationId_old == null) {
			locMstBranchLocationImpl.setLocationId_old(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setLocationId_old(LocationId_old);
		}

		locMstBranchLocationImpl.setLongitude(Longitude);
		locMstBranchLocationImpl.setLatitude(Latitude);

		if (BranchCode == null) {
			locMstBranchLocationImpl.setBranchCode(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setBranchCode(BranchCode);
		}

		if (CreatedBy == null) {
			locMstBranchLocationImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			locMstBranchLocationImpl.setCreatedDate(null);
		}
		else {
			locMstBranchLocationImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			locMstBranchLocationImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			locMstBranchLocationImpl.setModifiedDate(null);
		}
		else {
			locMstBranchLocationImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			locMstBranchLocationImpl.setIsActive(StringPool.BLANK);
		}
		else {
			locMstBranchLocationImpl.setIsActive(IsActive);
		}

		locMstBranchLocationImpl.resetOriginalValues();

		return locMstBranchLocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		BranchId = objectInput.readInt();
		BranchName = objectInput.readUTF();
		BranchOpeningTime = objectInput.readUTF();
		BranchClosingTime = objectInput.readUTF();
		AddressFirstLine = objectInput.readUTF();
		AddressSecondLine = objectInput.readUTF();
		PrimaryContactNo = objectInput.readUTF();
		OtherContactNo = objectInput.readUTF();
		FaxNumber = objectInput.readUTF();
		LocationId = objectInput.readInt();
		LocationId_old = objectInput.readUTF();
		Longitude = objectInput.readDouble();
		Latitude = objectInput.readDouble();
		BranchCode = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(BranchId);

		if (BranchName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BranchName);
		}

		if (BranchOpeningTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BranchOpeningTime);
		}

		if (BranchClosingTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BranchClosingTime);
		}

		if (AddressFirstLine == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AddressFirstLine);
		}

		if (AddressSecondLine == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AddressSecondLine);
		}

		if (PrimaryContactNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PrimaryContactNo);
		}

		if (OtherContactNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OtherContactNo);
		}

		if (FaxNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FaxNumber);
		}

		objectOutput.writeInt(LocationId);

		if (LocationId_old == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LocationId_old);
		}

		objectOutput.writeDouble(Longitude);
		objectOutput.writeDouble(Latitude);

		if (BranchCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BranchCode);
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

	public int BranchId;
	public String BranchName;
	public String BranchOpeningTime;
	public String BranchClosingTime;
	public String AddressFirstLine;
	public String AddressSecondLine;
	public String PrimaryContactNo;
	public String OtherContactNo;
	public String FaxNumber;
	public int LocationId;
	public String LocationId_old;
	public double Longitude;
	public double Latitude;
	public String BranchCode;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}