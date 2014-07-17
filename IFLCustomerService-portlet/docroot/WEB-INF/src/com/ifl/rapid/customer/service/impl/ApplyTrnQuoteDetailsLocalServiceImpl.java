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

import com.ifl.rapid.customer.service.base.ApplyTrnQuoteDetailsLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.ApplyTrnQuoteDetailsUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the apply trn quote details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.ApplyTrnQuoteDetailsLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil
 */
public class ApplyTrnQuoteDetailsLocalServiceImpl
	extends ApplyTrnQuoteDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil} to access the apply trn quote details local service.
	 */
	
	
	/**
	* Returns the apply trn quote details where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching apply trn quote details
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a matching apply trn quote details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public  com.ifl.rapid.customer.model.ApplyTrnQuoteDetails findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return ApplyTrnQuoteDetailsUtil.findByContactId(ContactId);
	}
}