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

import com.ifli.rapid.model.ProofDocs;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProofDocs in entity cache.
 *
 * @author Satya Kola
 * @see ProofDocs
 * @generated
 */
public class ProofDocsCacheModel implements CacheModel<ProofDocs>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", DOC_TYPE=");
		sb.append(DOC_TYPE);
		sb.append(", DOC_NAME=");
		sb.append(DOC_NAME);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProofDocs toEntityModel() {
		ProofDocsImpl proofDocsImpl = new ProofDocsImpl();

		proofDocsImpl.setID(ID);

		if (DOC_TYPE == null) {
			proofDocsImpl.setDOC_TYPE(StringPool.BLANK);
		}
		else {
			proofDocsImpl.setDOC_TYPE(DOC_TYPE);
		}

		if (DOC_NAME == null) {
			proofDocsImpl.setDOC_NAME(StringPool.BLANK);
		}
		else {
			proofDocsImpl.setDOC_NAME(DOC_NAME);
		}

		proofDocsImpl.resetOriginalValues();

		return proofDocsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readLong();
		DOC_TYPE = objectInput.readUTF();
		DOC_NAME = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ID);

		if (DOC_TYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOC_TYPE);
		}

		if (DOC_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOC_NAME);
		}
	}

	public long ID;
	public String DOC_TYPE;
	public String DOC_NAME;
}