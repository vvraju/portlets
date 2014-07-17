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

package com.ifli.rapid.service.impl;

import com.ifli.rapid.service.base.PREMIUM_PAID_CERTIFICATELocalServiceBaseImpl;
import com.ifli.rapid.service.persistence.PREMIUM_PAID_CERTIFICATEUtil;

/**
 * The implementation of the p r e m i u m_ p a i d_ c e r t i f i c a t e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifli.rapid.service.base.PREMIUM_PAID_CERTIFICATELocalServiceBaseImpl
 * @see com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil
 */
public class PREMIUM_PAID_CERTIFICATELocalServiceImpl
	extends PREMIUM_PAID_CERTIFICATELocalServiceBaseImpl {
	
	public  java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
			java.lang.String ContrNo, java.lang.String Financial_Year)
			throws com.liferay.portal.kernel.exception.SystemException {
			return PREMIUM_PAID_CERTIFICATEUtil.findByPolicyAndYear(ContrNo, Financial_Year);
		}

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil} to access the p r e m i u m_ p a i d_ c e r t i f i c a t e local service.
	 */
}