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

import com.ifl.rapid.customer.model.PrdMstProduct;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PrdMstProduct in entity cache.
 *
 * @author Satya Kola
 * @see PrdMstProduct
 * @generated
 */
public class PrdMstProductCacheModel implements CacheModel<PrdMstProduct>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{ProductId=");
		sb.append(ProductId);
		sb.append(", ProductKey=");
		sb.append(ProductKey);
		sb.append(", DisplayOrder=");
		sb.append(DisplayOrder);
		sb.append(", RenewalDuration=");
		sb.append(RenewalDuration);
		sb.append(", ShortTermDuration=");
		sb.append(ShortTermDuration);
		sb.append(", MinPlanTerm=");
		sb.append(MinPlanTerm);
		sb.append(", MaxPlanTerm=");
		sb.append(MaxPlanTerm);
		sb.append(", MinSumAssured=");
		sb.append(MinSumAssured);
		sb.append(", MaxSumAssured=");
		sb.append(MaxSumAssured);
		sb.append(", IsRegularPremium=");
		sb.append(IsRegularPremium);
		sb.append(", IsLimitedPremium=");
		sb.append(IsLimitedPremium);
		sb.append(", IsSinglePremium=");
		sb.append(IsSinglePremium);
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
	public PrdMstProduct toEntityModel() {
		PrdMstProductImpl prdMstProductImpl = new PrdMstProductImpl();

		if (ProductId == null) {
			prdMstProductImpl.setProductId(StringPool.BLANK);
		}
		else {
			prdMstProductImpl.setProductId(ProductId);
		}

		if (ProductKey == null) {
			prdMstProductImpl.setProductKey(StringPool.BLANK);
		}
		else {
			prdMstProductImpl.setProductKey(ProductKey);
		}

		prdMstProductImpl.setDisplayOrder(DisplayOrder);
		prdMstProductImpl.setRenewalDuration(RenewalDuration);
		prdMstProductImpl.setShortTermDuration(ShortTermDuration);
		prdMstProductImpl.setMinPlanTerm(MinPlanTerm);
		prdMstProductImpl.setMaxPlanTerm(MaxPlanTerm);
		prdMstProductImpl.setMinSumAssured(MinSumAssured);
		prdMstProductImpl.setMaxSumAssured(MaxSumAssured);
		prdMstProductImpl.setIsRegularPremium(IsRegularPremium);
		prdMstProductImpl.setIsLimitedPremium(IsLimitedPremium);
		prdMstProductImpl.setIsSinglePremium(IsSinglePremium);
		prdMstProductImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			prdMstProductImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			prdMstProductImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			prdMstProductImpl.setCreatedDate(null);
		}
		else {
			prdMstProductImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			prdMstProductImpl.setModifiedDate(null);
		}
		else {
			prdMstProductImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			prdMstProductImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			prdMstProductImpl.setModifiedBy(ModifiedBy);
		}

		prdMstProductImpl.resetOriginalValues();

		return prdMstProductImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ProductId = objectInput.readUTF();
		ProductKey = objectInput.readUTF();
		DisplayOrder = objectInput.readInt();
		RenewalDuration = objectInput.readInt();
		ShortTermDuration = objectInput.readInt();
		MinPlanTerm = objectInput.readInt();
		MaxPlanTerm = objectInput.readInt();
		MinSumAssured = objectInput.readInt();
		MaxSumAssured = objectInput.readInt();
		IsRegularPremium = objectInput.readInt();
		IsLimitedPremium = objectInput.readInt();
		IsSinglePremium = objectInput.readInt();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (ProductId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProductId);
		}

		if (ProductKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProductKey);
		}

		objectOutput.writeInt(DisplayOrder);
		objectOutput.writeInt(RenewalDuration);
		objectOutput.writeInt(ShortTermDuration);
		objectOutput.writeInt(MinPlanTerm);
		objectOutput.writeInt(MaxPlanTerm);
		objectOutput.writeInt(MinSumAssured);
		objectOutput.writeInt(MaxSumAssured);
		objectOutput.writeInt(IsRegularPremium);
		objectOutput.writeInt(IsLimitedPremium);
		objectOutput.writeInt(IsSinglePremium);
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

	public String ProductId;
	public String ProductKey;
	public int DisplayOrder;
	public int RenewalDuration;
	public int ShortTermDuration;
	public int MinPlanTerm;
	public int MaxPlanTerm;
	public int MinSumAssured;
	public int MaxSumAssured;
	public int IsRegularPremium;
	public int IsLimitedPremium;
	public int IsSinglePremium;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}