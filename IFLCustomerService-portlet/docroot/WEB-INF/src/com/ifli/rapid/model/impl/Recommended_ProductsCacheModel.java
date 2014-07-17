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

import com.ifli.rapid.model.Recommended_Products;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Recommended_Products in entity cache.
 *
 * @author Satya Kola
 * @see Recommended_Products
 * @generated
 */
public class Recommended_ProductsCacheModel implements CacheModel<Recommended_Products>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{PRODUCT_ID=");
		sb.append(PRODUCT_ID);
		sb.append(", PRODUCT_NAME=");
		sb.append(PRODUCT_NAME);
		sb.append(", IMG_URL=");
		sb.append(IMG_URL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Recommended_Products toEntityModel() {
		Recommended_ProductsImpl recommended_ProductsImpl = new Recommended_ProductsImpl();

		recommended_ProductsImpl.setPRODUCT_ID(PRODUCT_ID);

		if (PRODUCT_NAME == null) {
			recommended_ProductsImpl.setPRODUCT_NAME(StringPool.BLANK);
		}
		else {
			recommended_ProductsImpl.setPRODUCT_NAME(PRODUCT_NAME);
		}

		if (IMG_URL == null) {
			recommended_ProductsImpl.setIMG_URL(StringPool.BLANK);
		}
		else {
			recommended_ProductsImpl.setIMG_URL(IMG_URL);
		}

		recommended_ProductsImpl.resetOriginalValues();

		return recommended_ProductsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PRODUCT_ID = objectInput.readInt();
		PRODUCT_NAME = objectInput.readUTF();
		IMG_URL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PRODUCT_ID);

		if (PRODUCT_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRODUCT_NAME);
		}

		if (IMG_URL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IMG_URL);
		}
	}

	public int PRODUCT_ID;
	public String PRODUCT_NAME;
	public String IMG_URL;
}