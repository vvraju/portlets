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

import com.ifli.rapid.model.ServiceMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ServiceMaster in entity cache.
 *
 * @author Satya Kola
 * @see ServiceMaster
 * @generated
 */
public class ServiceMasterCacheModel implements CacheModel<ServiceMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{SERVICE_MASTER_ID=");
		sb.append(SERVICE_MASTER_ID);
		sb.append(", SERVICE_MASTER_NAME=");
		sb.append(SERVICE_MASTER_NAME);
		sb.append(", SERVICE_MASTER_DESC=");
		sb.append(SERVICE_MASTER_DESC);
		sb.append(", ACTIVE_FLAG=");
		sb.append(ACTIVE_FLAG);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceMaster toEntityModel() {
		ServiceMasterImpl serviceMasterImpl = new ServiceMasterImpl();

		serviceMasterImpl.setSERVICE_MASTER_ID(SERVICE_MASTER_ID);

		if (SERVICE_MASTER_NAME == null) {
			serviceMasterImpl.setSERVICE_MASTER_NAME(StringPool.BLANK);
		}
		else {
			serviceMasterImpl.setSERVICE_MASTER_NAME(SERVICE_MASTER_NAME);
		}

		if (SERVICE_MASTER_DESC == null) {
			serviceMasterImpl.setSERVICE_MASTER_DESC(StringPool.BLANK);
		}
		else {
			serviceMasterImpl.setSERVICE_MASTER_DESC(SERVICE_MASTER_DESC);
		}

		if (ACTIVE_FLAG == null) {
			serviceMasterImpl.setACTIVE_FLAG(StringPool.BLANK);
		}
		else {
			serviceMasterImpl.setACTIVE_FLAG(ACTIVE_FLAG);
		}

		serviceMasterImpl.resetOriginalValues();

		return serviceMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SERVICE_MASTER_ID = objectInput.readInt();
		SERVICE_MASTER_NAME = objectInput.readUTF();
		SERVICE_MASTER_DESC = objectInput.readUTF();
		ACTIVE_FLAG = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(SERVICE_MASTER_ID);

		if (SERVICE_MASTER_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SERVICE_MASTER_NAME);
		}

		if (SERVICE_MASTER_DESC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SERVICE_MASTER_DESC);
		}

		if (ACTIVE_FLAG == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ACTIVE_FLAG);
		}
	}

	public int SERVICE_MASTER_ID;
	public String SERVICE_MASTER_NAME;
	public String SERVICE_MASTER_DESC;
	public String ACTIVE_FLAG;
}