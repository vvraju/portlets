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

import com.ifli.rapid.model.PincodeDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PincodeDetails in entity cache.
 *
 * @author Satya Kola
 * @see PincodeDetails
 * @generated
 */
public class PincodeDetailsCacheModel implements CacheModel<PincodeDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{PIN_ID=");
		sb.append(PIN_ID);
		sb.append(", CITY_ID=");
		sb.append(CITY_ID);
		sb.append(", STATE_ID=");
		sb.append(STATE_ID);
		sb.append(", PIN_CODE=");
		sb.append(PIN_CODE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PincodeDetails toEntityModel() {
		PincodeDetailsImpl pincodeDetailsImpl = new PincodeDetailsImpl();

		pincodeDetailsImpl.setPIN_ID(PIN_ID);
		pincodeDetailsImpl.setCITY_ID(CITY_ID);
		pincodeDetailsImpl.setSTATE_ID(STATE_ID);

		if (PIN_CODE == null) {
			pincodeDetailsImpl.setPIN_CODE(StringPool.BLANK);
		}
		else {
			pincodeDetailsImpl.setPIN_CODE(PIN_CODE);
		}

		pincodeDetailsImpl.resetOriginalValues();

		return pincodeDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PIN_ID = objectInput.readInt();
		CITY_ID = objectInput.readInt();
		STATE_ID = objectInput.readInt();
		PIN_CODE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PIN_ID);
		objectOutput.writeInt(CITY_ID);
		objectOutput.writeInt(STATE_ID);

		if (PIN_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PIN_CODE);
		}
	}

	public int PIN_ID;
	public int CITY_ID;
	public int STATE_ID;
	public String PIN_CODE;
}