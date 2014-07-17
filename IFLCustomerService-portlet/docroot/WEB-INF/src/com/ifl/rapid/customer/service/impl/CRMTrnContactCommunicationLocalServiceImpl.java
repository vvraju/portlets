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

package com.ifl.rapid.customer.service.impl;

import com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException;
import com.ifl.rapid.customer.model.CRMTrnContactCommunication;
import com.ifl.rapid.customer.service.base.CRMTrnContactCommunicationLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRMTrnContactCommunicationUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m trn contact communication local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRMTrnContactCommunicationLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalServiceUtil
 */
public class CRMTrnContactCommunicationLocalServiceImpl
	extends CRMTrnContactCommunicationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalServiceUtil} to access the c r m trn contact communication local service.
	 */
	
	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
			String ContactId, String CommunicationMedium)
			throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CRMTrnContactCommunication findByContactId(int ContactId)
			throws NoSuchCRMTrnContactCommunicationException, SystemException {
		return CRMTrnContactCommunicationUtil.findByContactId(ContactId);
	}
}