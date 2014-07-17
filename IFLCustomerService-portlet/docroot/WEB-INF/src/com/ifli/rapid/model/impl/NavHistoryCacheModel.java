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

import com.ifli.rapid.model.NavHistory;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NavHistory in entity cache.
 *
 * @author Satya Kola
 * @see NavHistory
 * @generated
 */
public class NavHistoryCacheModel implements CacheModel<NavHistory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{NAV_HISTORY_ID=");
		sb.append(NAV_HISTORY_ID);
		sb.append(", DATE=");
		sb.append(DATE);
		sb.append(", NAV=");
		sb.append(NAV);
		sb.append(", SALE_PRICE=");
		sb.append(SALE_PRICE);
		sb.append(", PURCHASE_PRICE=");
		sb.append(PURCHASE_PRICE);
		sb.append(", FUND_CODE=");
		sb.append(FUND_CODE);
		sb.append(", FUND_NAME=");
		sb.append(FUND_NAME);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NavHistory toEntityModel() {
		NavHistoryImpl navHistoryImpl = new NavHistoryImpl();

		navHistoryImpl.setNAV_HISTORY_ID(NAV_HISTORY_ID);

		if (DATE == Long.MIN_VALUE) {
			navHistoryImpl.setDATE(null);
		}
		else {
			navHistoryImpl.setDATE(new Date(DATE));
		}

		navHistoryImpl.setNAV(NAV);
		navHistoryImpl.setSALE_PRICE(SALE_PRICE);
		navHistoryImpl.setPURCHASE_PRICE(PURCHASE_PRICE);

		if (FUND_CODE == null) {
			navHistoryImpl.setFUND_CODE(StringPool.BLANK);
		}
		else {
			navHistoryImpl.setFUND_CODE(FUND_CODE);
		}

		if (FUND_NAME == null) {
			navHistoryImpl.setFUND_NAME(StringPool.BLANK);
		}
		else {
			navHistoryImpl.setFUND_NAME(FUND_NAME);
		}

		navHistoryImpl.resetOriginalValues();

		return navHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		NAV_HISTORY_ID = objectInput.readLong();
		DATE = objectInput.readLong();
		NAV = objectInput.readDouble();
		SALE_PRICE = objectInput.readDouble();
		PURCHASE_PRICE = objectInput.readDouble();
		FUND_CODE = objectInput.readUTF();
		FUND_NAME = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(NAV_HISTORY_ID);
		objectOutput.writeLong(DATE);
		objectOutput.writeDouble(NAV);
		objectOutput.writeDouble(SALE_PRICE);
		objectOutput.writeDouble(PURCHASE_PRICE);

		if (FUND_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_CODE);
		}

		if (FUND_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_NAME);
		}
	}

	public long NAV_HISTORY_ID;
	public long DATE;
	public double NAV;
	public double SALE_PRICE;
	public double PURCHASE_PRICE;
	public String FUND_CODE;
	public String FUND_NAME;
}