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

import com.ifli.rapid.model.ServiceSubMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ServiceSubMaster in entity cache.
 *
 * @author Satya Kola
 * @see ServiceSubMaster
 * @generated
 */
public class ServiceSubMasterCacheModel implements CacheModel<ServiceSubMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{SUBMASTER_ID=");
		sb.append(SUBMASTER_ID);
		sb.append(", SUBMASTER_NAME=");
		sb.append(SUBMASTER_NAME);
		sb.append(", SUBMASTER_URL=");
		sb.append(SUBMASTER_URL);
		sb.append(", SERVICE_MASTER_ID=");
		sb.append(SERVICE_MASTER_ID);
		sb.append(", ACTIVE_FLAG=");
		sb.append(ACTIVE_FLAG);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceSubMaster toEntityModel() {
		ServiceSubMasterImpl serviceSubMasterImpl = new ServiceSubMasterImpl();

		serviceSubMasterImpl.setSUBMASTER_ID(SUBMASTER_ID);

		if (SUBMASTER_NAME == null) {
			serviceSubMasterImpl.setSUBMASTER_NAME(StringPool.BLANK);
		}
		else {
			serviceSubMasterImpl.setSUBMASTER_NAME(SUBMASTER_NAME);
		}

		if (SUBMASTER_URL == null) {
			serviceSubMasterImpl.setSUBMASTER_URL(StringPool.BLANK);
		}
		else {
			serviceSubMasterImpl.setSUBMASTER_URL(SUBMASTER_URL);
		}

		serviceSubMasterImpl.setSERVICE_MASTER_ID(SERVICE_MASTER_ID);

		if (ACTIVE_FLAG == null) {
			serviceSubMasterImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			serviceSubMasterImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		serviceSubMasterImpl.resetOriginalValues();

		return serviceSubMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SUBMASTER_ID = objectInput.readInt();
		SUBMASTER_NAME = objectInput.readUTF();
		SUBMASTER_URL = objectInput.readUTF();
		SERVICE_MASTER_ID = objectInput.readInt();
		ACTIVE_FLAG = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(SUBMASTER_ID);

		if (SUBMASTER_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SUBMASTER_NAME);
		}

		if (SUBMASTER_URL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SUBMASTER_URL);
		}

		objectOutput.writeInt(SERVICE_MASTER_ID);

		if (ACTIVE_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ACTIVE_FLAG);
		}
	}

	public int SUBMASTER_ID;
	public String SUBMASTER_NAME;
	public String SUBMASTER_URL;
	public int SERVICE_MASTER_ID;
	public String ACTIVE_FLAG;
}