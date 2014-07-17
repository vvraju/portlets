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

import com.ifli.rapid.model.BranchDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BranchDetails in entity cache.
 *
 * @author Satya Kola
 * @see BranchDetails
 * @generated
 */
public class BranchDetailsCacheModel implements CacheModel<BranchDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{BRANCH_ID=");
		sb.append(BRANCH_ID);
		sb.append(", LOCATION_ID=");
		sb.append(LOCATION_ID);
		sb.append(", BRANCH_NAME=");
		sb.append(BRANCH_NAME);
		sb.append(", BRANCH_OPENING_TIME=");
		sb.append(BRANCH_OPENING_TIME);
		sb.append(", BRANCH_CLOSING_TIME=");
		sb.append(BRANCH_CLOSING_TIME);
		sb.append(", ADDRESS_FIRST_LINE=");
		sb.append(ADDRESS_FIRST_LINE);
		sb.append(", ADDRESS_SECOND_LINE=");
		sb.append(ADDRESS_SECOND_LINE);
		sb.append(", CITY=");
		sb.append(CITY);
		sb.append(", STATE=");
		sb.append(STATE);
		sb.append(", PIN=");
		sb.append(PIN);
		sb.append(", PRIMARY_CONTACT_NO=");
		sb.append(PRIMARY_CONTACT_NO);
		sb.append(", OTHER_CONTACT_NO=");
		sb.append(OTHER_CONTACT_NO);
		sb.append(", FAX_NUMBER=");
		sb.append(FAX_NUMBER);
		sb.append(", BRANCH_CODE=");
		sb.append(BRANCH_CODE);
		sb.append(", WORK_TIMINGS=");
		sb.append(WORK_TIMINGS);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BranchDetails toEntityModel() {
		BranchDetailsImpl branchDetailsImpl = new BranchDetailsImpl();

		branchDetailsImpl.setBRANCH_ID(BRANCH_ID);
		branchDetailsImpl.setLOCATION_ID(LOCATION_ID);

		if (BRANCH_NAME == null) {
			branchDetailsImpl.setBRANCH_NAME(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setBRANCH_NAME(BRANCH_NAME);
		}

		if (BRANCH_OPENING_TIME == null) {
			branchDetailsImpl.setBRANCH_OPENING_TIME(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setBRANCH_OPENING_TIME(BRANCH_OPENING_TIME);
		}

		if (BRANCH_CLOSING_TIME == null) {
			branchDetailsImpl.setBRANCH_CLOSING_TIME(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setBRANCH_CLOSING_TIME(BRANCH_CLOSING_TIME);
		}

		if (ADDRESS_FIRST_LINE == null) {
			branchDetailsImpl.setADDRESS_FIRST_LINE(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setADDRESS_FIRST_LINE(ADDRESS_FIRST_LINE);
		}

		if (ADDRESS_SECOND_LINE == null) {
			branchDetailsImpl.setADDRESS_SECOND_LINE(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setADDRESS_SECOND_LINE(ADDRESS_SECOND_LINE);
		}

		if (CITY == null) {
			branchDetailsImpl.setCITY(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setCITY(CITY);
		}

		if (STATE == null) {
			branchDetailsImpl.setSTATE(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setSTATE(STATE);
		}

		if (PIN == null) {
			branchDetailsImpl.setPIN(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setPIN(PIN);
		}

		if (PRIMARY_CONTACT_NO == null) {
			branchDetailsImpl.setPRIMARY_CONTACT_NO(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setPRIMARY_CONTACT_NO(PRIMARY_CONTACT_NO);
		}

		if (OTHER_CONTACT_NO == null) {
			branchDetailsImpl.setOTHER_CONTACT_NO(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setOTHER_CONTACT_NO(OTHER_CONTACT_NO);
		}

		if (FAX_NUMBER == null) {
			branchDetailsImpl.setFAX_NUMBER(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setFAX_NUMBER(FAX_NUMBER);
		}

		if (BRANCH_CODE == null) {
			branchDetailsImpl.setBRANCH_CODE(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setBRANCH_CODE(BRANCH_CODE);
		}

		if (WORK_TIMINGS == null) {
			branchDetailsImpl.setWORK_TIMINGS(StringPool.BLANK);
		}
		else {
			branchDetailsImpl.setWORK_TIMINGS(WORK_TIMINGS);
		}

		branchDetailsImpl.resetOriginalValues();

		return branchDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		BRANCH_ID = objectInput.readInt();
		LOCATION_ID = objectInput.readInt();
		BRANCH_NAME = objectInput.readUTF();
		BRANCH_OPENING_TIME = objectInput.readUTF();
		BRANCH_CLOSING_TIME = objectInput.readUTF();
		ADDRESS_FIRST_LINE = objectInput.readUTF();
		ADDRESS_SECOND_LINE = objectInput.readUTF();
		CITY = objectInput.readUTF();
		STATE = objectInput.readUTF();
		PIN = objectInput.readUTF();
		PRIMARY_CONTACT_NO = objectInput.readUTF();
		OTHER_CONTACT_NO = objectInput.readUTF();
		FAX_NUMBER = objectInput.readUTF();
		BRANCH_CODE = objectInput.readUTF();
		WORK_TIMINGS = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(BRANCH_ID);
		objectOutput.writeInt(LOCATION_ID);

		if (BRANCH_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_NAME);
		}

		if (BRANCH_OPENING_TIME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_OPENING_TIME);
		}

		if (BRANCH_CLOSING_TIME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_CLOSING_TIME);
		}

		if (ADDRESS_FIRST_LINE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_FIRST_LINE);
		}

		if (ADDRESS_SECOND_LINE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS_SECOND_LINE);
		}

		if (CITY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CITY);
		}

		if (STATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATE);
		}

		if (PIN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PIN);
		}

		if (PRIMARY_CONTACT_NO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_CONTACT_NO);
		}

		if (OTHER_CONTACT_NO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OTHER_CONTACT_NO);
		}

		if (FAX_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FAX_NUMBER);
		}

		if (BRANCH_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_CODE);
		}

		if (WORK_TIMINGS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(WORK_TIMINGS);
		}
	}

	public int BRANCH_ID;
	public int LOCATION_ID;
	public String BRANCH_NAME;
	public String BRANCH_OPENING_TIME;
	public String BRANCH_CLOSING_TIME;
	public String ADDRESS_FIRST_LINE;
	public String ADDRESS_SECOND_LINE;
	public String CITY;
	public String STATE;
	public String PIN;
	public String PRIMARY_CONTACT_NO;
	public String OTHER_CONTACT_NO;
	public String FAX_NUMBER;
	public String BRANCH_CODE;
	public String WORK_TIMINGS;
}