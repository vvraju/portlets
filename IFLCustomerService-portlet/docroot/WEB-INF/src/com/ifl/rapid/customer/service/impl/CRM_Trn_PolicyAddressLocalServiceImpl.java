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

import com.ifl.rapid.customer.service.base.CRM_Trn_PolicyAddressLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.CRM_Trn_PolicyAddressUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the c r m_ trn_ policy address local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_PolicyAddressLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil
 */
public class CRM_Trn_PolicyAddressLocalServiceImpl
	extends CRM_Trn_PolicyAddressLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil} to access the c r m_ trn_ policy address local service.
	 */
	
	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPolicyNo(
			String PolicyNo)
			throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
				com.liferay.portal.kernel.exception.SystemException {
			return CRM_Trn_PolicyAddressUtil.findByPolicyNo(PolicyNo);
		}
}