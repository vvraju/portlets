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

import com.ifl.rapid.customer.model.State;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing State in entity cache.
 *
 * @author Satya Kola
 * @see State
 * @generated
 */
public class StateCacheModel implements CacheModel<State>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{StateId=");
		sb.append(StateId);
		sb.append(", StateCode=");
		sb.append(StateCode);
		sb.append(", StateName=");
		sb.append(StateName);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public State toEntityModel() {
		StateImpl stateImpl = new StateImpl();

		stateImpl.setStateId(StateId);

		if (StateCode == null) {
			stateImpl.setStateCode(StringPool.BLANK);
		}
		else {
			stateImpl.setStateCode(StateCode);
		}

		if (StateName == null) {
			stateImpl.setStateName(StringPool.BLANK);
		}
		else {
			stateImpl.setStateName(StateName);
		}

		stateImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			stateImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			stateImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			stateImpl.setCreatedDate(null);
		}
		else {
			stateImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			stateImpl.setModifiedDate(null);
		}
		else {
			stateImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			stateImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			stateImpl.setModifiedBy(ModifiedBy);
		}

		stateImpl.resetOriginalValues();

		return stateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		StateId = objectInput.readInt();
		StateCode = objectInput.readUTF();
		StateName = objectInput.readUTF();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(StateId);

		if (StateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(StateCode);
		}

		if (StateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(StateName);
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
	}

	public int StateId;
	public String StateCode;
	public String StateName;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}