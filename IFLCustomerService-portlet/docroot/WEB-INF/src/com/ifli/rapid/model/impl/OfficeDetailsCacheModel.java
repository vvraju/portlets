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

import com.ifli.rapid.model.OfficeDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OfficeDetails in entity cache.
 *
 * @author Satya Kola
 * @see OfficeDetails
 * @generated
 */
public class OfficeDetailsCacheModel implements CacheModel<OfficeDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{OFFICE_ID=");
		sb.append(OFFICE_ID);
		sb.append(", OFFICE_NAME=");
		sb.append(OFFICE_NAME);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OfficeDetails toEntityModel() {
		OfficeDetailsImpl officeDetailsImpl = new OfficeDetailsImpl();

		officeDetailsImpl.setOFFICE_ID(OFFICE_ID);

		if (OFFICE_NAME == null) {
			officeDetailsImpl.setOFFICE_NAME(StringPool.BLANK);
		}
		else {
			officeDetailsImpl.setOFFICE_NAME(OFFICE_NAME);
		}

		officeDetailsImpl.resetOriginalValues();

		return officeDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		OFFICE_ID = objectInput.readInt();
		OFFICE_NAME = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(OFFICE_ID);

		if (OFFICE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OFFICE_NAME);
		}
	}

	public int OFFICE_ID;
	public String OFFICE_NAME;
}