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

import com.ifl.rapid.customer.model.City;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing City in entity cache.
 *
 * @author Satya Kola
 * @see City
 * @generated
 */
public class CityCacheModel implements CacheModel<City>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{CityId=");
		sb.append(CityId);
		sb.append(", CityCode=");
		sb.append(CityCode);
		sb.append(", CityName=");
		sb.append(CityName);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", StateId=");
		sb.append(StateId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public City toEntityModel() {
		CityImpl cityImpl = new CityImpl();

		cityImpl.setCityId(CityId);

		if (CityCode == null) {
			cityImpl.setCityCode(StringPool.BLANK);
		}
		else {
			cityImpl.setCityCode(CityCode);
		}

		if (CityName == null) {
			cityImpl.setCityName(StringPool.BLANK);
		}
		else {
			cityImpl.setCityName(CityName);
		}

		cityImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			cityImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			cityImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			cityImpl.setCreatedDate(null);
		}
		else {
			cityImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			cityImpl.setModifiedDate(null);
		}
		else {
			cityImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			cityImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			cityImpl.setModifiedBy(ModifiedBy);
		}

		cityImpl.setStateId(StateId);

		cityImpl.resetOriginalValues();

		return cityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CityId = objectInput.readInt();
		CityCode = objectInput.readUTF();
		CityName = objectInput.readUTF();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		StateId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CityId);

		if (CityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CityCode);
		}

		if (CityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CityName);
		}

		objectOutput.writeInt(IsActive);

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);
		objectOutput.writeLong(ModifiedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		objectOutput.writeInt(StateId);
	}

	public int CityId;
	public String CityCode;
	public String CityName;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
	public int StateId;
}