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

import com.ifl.rapid.customer.service.base.CRM_Trn_PhoneLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRM_Trn_PhoneUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m_ trn_ phone local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_PhoneLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil
 */
public class CRM_Trn_PhoneLocalServiceImpl
	extends CRM_Trn_PhoneLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil} to access the c r m_ trn_ phone local service.
	 */
	
	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the matching c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return CRM_Trn_PhoneUtil.findByContactIdAndPhoneId(ContactId, PhoneId);
	}
	
	
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactId(int ContactId)
			throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
				com.liferay.portal.kernel.exception.SystemException {
			return CRM_Trn_PhoneUtil.findByContactId(ContactId);
		}
}