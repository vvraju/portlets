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

import com.ifl.rapid.customer.model.LocMstLocation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LocMstLocation in entity cache.
 *
 * @author Satya Kola
 * @see LocMstLocation
 * @generated
 */
public class LocMstLocationCacheModel implements CacheModel<LocMstLocation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{LocationId=");
		sb.append(LocationId);
		sb.append(", StateId=");
		sb.append(StateId);
		sb.append(", CityId=");
		sb.append(CityId);
		sb.append(", PinCode=");
		sb.append(PinCode);
		sb.append(", AreaName=");
		sb.append(AreaName);
		sb.append(", Latitude=");
		sb.append(Latitude);
		sb.append(", Longitude=");
		sb.append(Longitude);
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
	public LocMstLocation toEntityModel() {
		LocMstLocationImpl locMstLocationImpl = new LocMstLocationImpl();

		locMstLocationImpl.setLocationId(LocationId);
		locMstLocationImpl.setStateId(StateId);
		locMstLocationImpl.setCityId(CityId);
		locMstLocationImpl.setPinCode(PinCode);

		if (AreaName == null) {
			locMstLocationImpl.setAreaName(StringPool.BLANK);
		}
		else {
			locMstLocationImpl.setAreaName(AreaName);
		}

		locMstLocationImpl.setLatitude(Latitude);
		locMstLocationImpl.setLongitude(Longitude);

		if (CreatedBy == null) {
			locMstLocationImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			locMstLocationImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			locMstLocationImpl.setCreatedDate(null);
		}
		else {
			locMstLocationImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			locMstLocationImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			locMstLocationImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			locMstLocationImpl.setModifiedDate(null);
		}
		else {
			locMstLocationImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			locMstLocationImpl.setIsActive(StringPool.BLANK);
		}
		else {
			locMstLocationImpl.setIsActive(IsActive);
		}

		locMstLocationImpl.resetOriginalValues();

		return locMstLocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		LocationId = objectInput.readInt();
		StateId = objectInput.readInt();
		CityId = objectInput.readInt();
		PinCode = objectInput.readInt();
		AreaName = objectInput.readUTF();
		Latitude = objectInput.readDouble();
		Longitude = objectInput.readDouble();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(LocationId);
		objectOutput.writeInt(StateId);
		objectOutput.writeInt(CityId);
		objectOutput.writeInt(PinCode);

		if (AreaName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AreaName);
		}

		objectOutput.writeDouble(Latitude);
		objectOutput.writeDouble(Longitude);

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

	public int LocationId;
	public int StateId;
	public int CityId;
	public int PinCode;
	public String AreaName;
	public double Latitude;
	public double Longitude;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}