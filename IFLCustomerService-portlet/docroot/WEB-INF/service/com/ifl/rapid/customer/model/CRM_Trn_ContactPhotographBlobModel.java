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

package com.ifl.rapid.customer.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the Photograph column in CRM_Trn_Contact.
 *
 * @author Satya Kola
 * @see CRM_Trn_Contact
 * @generated
 */
public class CRM_Trn_ContactPhotographBlobModel {
	public CRM_Trn_ContactPhotographBlobModel() {
	}

	public CRM_Trn_ContactPhotographBlobModel(int ContactId) {
		_ContactId = ContactId;
	}

	public CRM_Trn_ContactPhotographBlobModel(int ContactId, Blob PhotographBlob) {
		_ContactId = ContactId;
		_PhotographBlob = PhotographBlob;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public Blob getPhotographBlob() {
		return _PhotographBlob;
	}

	public void setPhotographBlob(Blob PhotographBlob) {
		_PhotographBlob = PhotographBlob;
	}

	private int _ContactId;
	private Blob _PhotographBlob;
}