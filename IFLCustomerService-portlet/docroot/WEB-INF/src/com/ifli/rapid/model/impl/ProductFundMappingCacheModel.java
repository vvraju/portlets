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

import com.ifli.rapid.model.ProductFundMapping;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProductFundMapping in entity cache.
 *
 * @author Satya Kola
 * @see ProductFundMapping
 * @generated
 */
public class ProductFundMappingCacheModel implements CacheModel<ProductFundMapping>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", PRODUCT_CODE=");
		sb.append(PRODUCT_CODE);
		sb.append(", FUND_CODE=");
		sb.append(FUND_CODE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductFundMapping toEntityModel() {
		ProductFundMappingImpl productFundMappingImpl = new ProductFundMappingImpl();

		productFundMappingImpl.setID(ID);

		if (PRODUCT_CODE == null) {
			productFundMappingImpl.setPRODUCT_CODE(StringPool.BLANK);
		}
		else {
			productFundMappingImpl.setPRODUCT_CODE(PRODUCT_CODE);
		}

		if (FUND_CODE == null) {
			productFundMappingImpl.setFUND_CODE(StringPool.BLANK);
		}
		else {
			productFundMappingImpl.setFUND_CODE(FUND_CODE);
		}

		productFundMappingImpl.resetOriginalValues();

		return productFundMappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readInt();
		PRODUCT_CODE = objectInput.readUTF();
		FUND_CODE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ID);

		if (PRODUCT_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRODUCT_CODE);
		}

		if (FUND_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FUND_CODE);
		}
	}

	public int ID;
	public String PRODUCT_CODE;
	public String FUND_CODE;
}