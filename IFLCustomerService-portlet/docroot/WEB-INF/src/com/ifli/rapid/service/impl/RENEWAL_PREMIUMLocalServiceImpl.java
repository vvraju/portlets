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

import com.ifli.rapid.service.base.RENEWAL_PREMIUMLocalServiceBaseImpl;
import com.ifli.rapid.service.persistence.RENEWAL_PREMIUMUtil;

/**
 * The implementation of the r e n e w a l_ p r e m i u m local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifli.rapid.service.RENEWAL_PREMIUMLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifli.rapid.service.base.RENEWAL_PREMIUMLocalServiceBaseImpl
 * @see com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil
 */
public class RENEWAL_PREMIUMLocalServiceImpl
	extends RENEWAL_PREMIUMLocalServiceBaseImpl {
	
	public  java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
			java.lang.String ContrNo, java.lang.String Receipt_Date)
			throws com.liferay.portal.kernel.exception.SystemException {
			return RENEWAL_PREMIUMUtil.findByPolicyAndReceipt_Date(ContrNo, Receipt_Date);
		}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil} to access the r e n e w a l_ p r e m i u m local service.
	 */
}