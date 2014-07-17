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

import com.ifli.rapid.model.StateDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing StateDetails in entity cache.
 *
 * @author Satya Kola
 * @see StateDetails
 * @generated
 */
public class StateDetailsCacheModel implements CacheModel<StateDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{STATE_ID=");
		sb.append(STATE_ID);
		sb.append(", STATE_NAME=");
		sb.append(STATE_NAME);
		sb.append(", STATE_CODE=");
		sb.append(STATE_CODE);
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
	public StateDetails toEntityModel() {
		StateDetailsImpl stateDetailsImpl = new StateDetailsImpl();

		stateDetailsImpl.setSTATE_ID(STATE_ID);

		if (STATE_NAME == null) {
			stateDetailsImpl.setSTATE_NAME(StringPool.BLANK);
		}
		else {
			stateDetailsImpl.setSTATE_NAME(STATE_NAME);
		}

		if (STATE_CODE == null) {
			stateDetailsImpl.setSTATE_CODE(StringPool.BLANK);
		}
		else {
			stateDetailsImpl.setSTATE_CODE(STATE_CODE);
		}

		if (BRANCH_FLAG == null) {
			stateDetailsImpl.setBRANCH_FLAG(StringPool.BLANK);
		}
		else {
			stateDetailsImpl.setBRANCH_FLAG(BRANCH_FLAG);
		}

		if (MEDICAL_CENTER_FLAG == null) {
			stateDetailsImpl.setMEDICAL_CENTER_FLAG(StringPool.BLANK);
		}
		else {
			stateDetailsImpl.setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
		}

		if (DROP_BOX_FLAG == null) {
			stateDetailsImpl.setDROP_BOX_FLAG(StringPool.BLANK);
		}
		else {
			stateDetailsImpl.setDROP_BOX_FLAG(DROP_BOX_FLAG);
		}

		stateDetailsImpl.resetOriginalValues();

		return stateDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		STATE_ID = objectInput.readInt();
		STATE_NAME = objectInput.readUTF();
		STATE_CODE = objectInput.readUTF();
		BRANCH_FLAG = objectInput.readUTF();
		MEDICAL_CENTER_FLAG = objectInput.readUTF();
		DROP_BOX_FLAG = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(STATE_ID);

		if (STATE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATE_NAME);
		}

		if (STATE_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATE_CODE);
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

	public int STATE_ID;
	public String STATE_NAME;
	public String STATE_CODE;
	public String BRANCH_FLAG;
	public String MEDICAL_CENTER_FLAG;
	public String DROP_BOX_FLAG;
}