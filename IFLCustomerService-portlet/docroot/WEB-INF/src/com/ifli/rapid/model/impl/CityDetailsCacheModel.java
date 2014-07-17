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

import com.ifli.rapid.model.CityDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CityDetails in entity cache.
 *
 * @author Satya Kola
 * @see CityDetails
 * @generated
 */
public class CityDetailsCacheModel implements CacheModel<CityDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{CITY_ID=");
		sb.append(CITY_ID);
		sb.append(", CITY_CODE=");
		sb.append(CITY_CODE);
		sb.append(", CITY_NAME=");
		sb.append(CITY_NAME);
		sb.append(", STATE_ID=");
		sb.append(STATE_ID);
		sb.append(", IS_ACTIVE=");
		sb.append(IS_ACTIVE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CityDetails toEntityModel() {
		CityDetailsImpl cityDetailsImpl = new CityDetailsImpl();

		cityDetailsImpl.setCITY_ID(CITY_ID);

		if (CITY_CODE == null) {
			cityDetailsImpl.setCITY_CODE(StringPool.BLANK);
		}
		else {
			cityDetailsImpl.setCITY_CODE(CITY_CODE);
		}

		if (CITY_NAME == null) {
			cityDetailsImpl.setCITY_NAME(StringPool.BLANK);
		}
		else {
			cityDetailsImpl.setCITY_NAME(CITY_NAME);
		}

		cityDetailsImpl.setSTATE_ID(STATE_ID);

		if (IS_ACTIVE == null) {
			cityDetailsImpl.setIS_ACTIVE(StringPool.BLANK);
		}
		else {
			cityDetailsImpl.setIS_ACTIVE(IS_ACTIVE);
		}

		cityDetailsImpl.resetOriginalValues();

		return cityDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CITY_ID = objectInput.readInt();
		CITY_CODE = objectInput.readUTF();
		CITY_NAME = objectInput.readUTF();
		STATE_ID = objectInput.readInt();
		IS_ACTIVE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CITY_ID);

		if (CITY_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CITY_CODE);
		}

		if (CITY_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CITY_NAME);
		}

		objectOutput.writeInt(STATE_ID);

		if (IS_ACTIVE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IS_ACTIVE);
		}
	}

	public int CITY_ID;
	public String CITY_CODE;
	public String CITY_NAME;
	public int STATE_ID;
	public String IS_ACTIVE;
}