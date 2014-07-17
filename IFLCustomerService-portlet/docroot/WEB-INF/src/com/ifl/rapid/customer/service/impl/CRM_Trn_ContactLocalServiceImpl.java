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

import com.ifl.rapid.customer.service.base.CRM_Trn_ContactLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRM_Trn_ContactUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m_ trn_ contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRM_Trn_ContactLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_ContactLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRM_Trn_ContactLocalServiceUtil
 */
public class CRM_Trn_ContactLocalServiceImpl
	extends CRM_Trn_ContactLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRM_Trn_ContactLocalServiceUtil} to access the c r m_ trn_ contact local service.
	 */
	
	/**
	* Returns the c r m_ trn_ contact where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ contact
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a matching c r m_ trn_ contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Contact findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException,
			com.liferay.portal.kernel.exception.SystemException {
		return CRM_Trn_ContactUtil.findByContactId(ContactId);
	}
}