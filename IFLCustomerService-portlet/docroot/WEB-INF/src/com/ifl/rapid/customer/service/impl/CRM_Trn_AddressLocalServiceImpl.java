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

import com.ifl.rapid.customer.service.base.CRM_Trn_AddressLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRM_Trn_AddressUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m_ trn_ address local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRM_Trn_AddressLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_AddressLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil
 */
public class CRM_Trn_AddressLocalServiceImpl
	extends CRM_Trn_AddressLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil} to access the c r m_ trn_ address local service.
	 */
	
	/**
	* Returns the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; and AddressTypeId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException} if it could not be found.
	*
	* @param AddressId the address ID
	* @param ContactId the contact ID
	* @param AddressTypeId the address type ID
	* @return the matching c r m_ trn_ address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a matching c r m_ trn_ address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public  com.ifl.rapid.customer.model.CRM_Trn_Address findByContactIdAndAddressTypeId(int ContactId, int AddressTypeId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return CRM_Trn_AddressUtil.findByContactIdAndAddressTypeId(ContactId,AddressTypeId);
	}
	
	public  com.ifl.rapid.customer.model.CRM_Trn_Address findByAddressIdAndContactId(int AddressId, int ContactId)
			throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException,
				com.liferay.portal.kernel.exception.SystemException {
			return CRM_Trn_AddressUtil.findByAddressIdAndContactId(AddressId,ContactId);
		}
	
	

	
}