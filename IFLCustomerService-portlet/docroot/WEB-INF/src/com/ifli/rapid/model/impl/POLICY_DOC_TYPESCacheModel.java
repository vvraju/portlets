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

import com.ifli.rapid.model.POLICY_DOC_TYPES;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing POLICY_DOC_TYPES in entity cache.
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPES
 * @generated
 */
public class POLICY_DOC_TYPESCacheModel implements CacheModel<POLICY_DOC_TYPES>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", DOC_NAME=");
		sb.append(DOC_NAME);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public POLICY_DOC_TYPES toEntityModel() {
		POLICY_DOC_TYPESImpl policy_doc_typesImpl = new POLICY_DOC_TYPESImpl();

		policy_doc_typesImpl.setID(ID);

		if (DOC_NAME == null) {
			policy_doc_typesImpl.setDOC_NAME(StringPool.BLANK);
		}
		else {
			policy_doc_typesImpl.setDOC_NAME(DOC_NAME);
		}

		policy_doc_typesImpl.resetOriginalValues();

		return policy_doc_typesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readInt();
		DOC_NAME = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ID);

		if (DOC_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOC_NAME);
		}
	}

	public int ID;
	public String DOC_NAME;
}