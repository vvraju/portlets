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

import com.ifli.rapid.model.FamilyRelations;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FamilyRelations in entity cache.
 *
 * @author Satya Kola
 * @see FamilyRelations
 * @generated
 */
public class FamilyRelationsCacheModel implements CacheModel<FamilyRelations>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{RELATION_ID=");
		sb.append(RELATION_ID);
		sb.append(", RELATION_NAME=");
		sb.append(RELATION_NAME);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FamilyRelations toEntityModel() {
		FamilyRelationsImpl familyRelationsImpl = new FamilyRelationsImpl();

		familyRelationsImpl.setRELATION_ID(RELATION_ID);

		if (RELATION_NAME == null) {
			familyRelationsImpl.setRELATION_NAME(StringPool.BLANK);
		}
		else {
			familyRelationsImpl.setRELATION_NAME(RELATION_NAME);
		}

		familyRelationsImpl.resetOriginalValues();

		return familyRelationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		RELATION_ID = objectInput.readInt();
		RELATION_NAME = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(RELATION_ID);

		if (RELATION_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RELATION_NAME);
		}
	}

	public int RELATION_ID;
	public String RELATION_NAME;
}