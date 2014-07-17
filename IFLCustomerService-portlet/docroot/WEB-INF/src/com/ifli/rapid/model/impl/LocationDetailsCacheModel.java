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

import com.ifli.rapid.model.LocationDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LocationDetails in entity cache.
 *
 * @author Satya Kola
 * @see LocationDetails
 * @generated
 */
public class LocationDetailsCacheModel implements CacheModel<LocationDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{LOCATION_ID=");
		sb.append(LOCATION_ID);
		sb.append(", LOCATION_NAME=");
		sb.append(LOCATION_NAME);
		sb.append(", CITY_ID=");
		sb.append(CITY_ID);
		sb.append(", STATE_ID=");
		sb.append(STATE_ID);
		sb.append(", LATITUDE=");
		sb.append(LATITUDE);
		sb.append(", LONGITUDE=");
		sb.append(LONGITUDE);
		sb.append(", BRANCH_FLAG=");
		sb.append(BRANCH_FLAG);
		sb.append(", MEDICAL_CENTER_FLAG=");
		sb.append(MEDICAL_CENTER_FLAG);
		sb.append(", DROP_BOX_FLAG=");
		sb.append(DROP_BOX_FLAG);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LocationDetails toEntityModel() {
		LocationDetailsImpl locationDetailsImpl = new LocationDetailsImpl();

		locationDetailsImpl.setLOCATION_ID(LOCATION_ID);

		if (LOCATION_NAME == null) {
			locationDetailsImpl.setLOCATION_NAME(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setLOCATION_NAME(LOCATION_NAME);
		}

		locationDetailsImpl.setCITY_ID(CITY_ID);
		locationDetailsImpl.setSTATE_ID(STATE_ID);

		if (LATITUDE == null) {
			locationDetailsImpl.setLATITUDE(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setLATITUDE(LATITUDE);
		}

		if (LONGITUDE == null) {
			locationDetailsImpl.setLONGITUDE(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setLONGITUDE(LONGITUDE);
		}

		if (BRANCH_FLAG == null) {
			locationDetailsImpl.setBRANCH_FLAG(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setBRANCH_FLAG(BRANCH_FLAG);
		}

		if (MEDICAL_CENTER_FLAG == null) {
			locationDetailsImpl.setMEDICAL_CENTER_FLAG(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
		}

		if (DROP_BOX_FLAG == null) {
			locationDetailsImpl.setDROP_BOX_FLAG(StringPool.BLANK);
		}
		else {
			locationDetailsImpl.setDROP_BOX_FLAG(DROP_BOX_FLAG);
		}

		locationDetailsImpl.resetOriginalValues();

		return locationDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		LOCATION_ID = objectInput.readInt();
		LOCATION_NAME = objectInput.readUTF();
		CITY_ID = objectInput.readInt();
		STATE_ID = objectInput.readInt();
		LATITUDE = objectInput.readUTF();
		LONGITUDE = objectInput.readUTF();
		BRANCH_FLAG = objectInput.readUTF();
		MEDICAL_CENTER_FLAG = objectInput.readUTF();
		DROP_BOX_FLAG = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(LOCATION_ID);

		if (LOCATION_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LOCATION_NAME);
		}

		objectOutput.writeInt(CITY_ID);
		objectOutput.writeInt(STATE_ID);

		if (LATITUDE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LATITUDE);
		}

		if (LONGITUDE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LONGITUDE);
		}

		if (BRANCH_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_FLAG);
		}

		if (MEDICAL_CENTER_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MEDICAL_CENTER_FLAG);
		}

		if (DROP_BOX_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DROP_BOX_FLAG);
		}
	}

	public int LOCATION_ID;
	public String LOCATION_NAME;
	public int CITY_ID;
	public int STATE_ID;
	public String LATITUDE;
	public String LONGITUDE;
	public String BRANCH_FLAG;
	public String MEDICAL_CENTER_FLAG;
	public String DROP_BOX_FLAG;
}