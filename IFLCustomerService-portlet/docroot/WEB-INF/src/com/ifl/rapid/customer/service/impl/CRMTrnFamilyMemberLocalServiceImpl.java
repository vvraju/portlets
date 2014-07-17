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

import com.ifl.rapid.customer.service.base.CRMTrnFamilyMemberLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRMTrnFamilyMemberUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m trn family member local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRMTrnFamilyMemberLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil
 */
public class CRMTrnFamilyMemberLocalServiceImpl
	extends CRMTrnFamilyMemberLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil} to access the c r m trn family member local service.
	 */
	
	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the matching c r m trn family member
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public  com.ifl.rapid.customer.model.CRMTrnFamilyMember findByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException {
		return CRMTrnFamilyMemberUtil.findByContactIdAndMemberId(ContactId, MemberId);
	}
}