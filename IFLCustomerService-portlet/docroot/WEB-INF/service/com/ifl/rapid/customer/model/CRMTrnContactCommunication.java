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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the CRMTrnContactCommunication service. Represents a row in the &quot;CRM_Trn_ContactCommunication&quot; database table, with each column mapped to a property of this class.
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunicationModel
 * @see com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationImpl
 * @see com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl
 * @generated
 */
public interface CRMTrnContactCommunication
	extends CRMTrnContactCommunicationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the matching c r m trn contact communication
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException;
}