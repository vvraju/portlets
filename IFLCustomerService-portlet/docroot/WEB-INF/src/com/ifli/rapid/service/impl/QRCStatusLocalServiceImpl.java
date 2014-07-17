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

import com.ifli.rapid.service.QRCStatusLocalServiceUtil;
import com.ifli.rapid.service.base.QRCStatusLocalServiceBaseImpl;
import com.ifli.rapid.service.persistence.QRCStatusUtil;

/**
 * The implementation of the q r c status local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifli.rapid.service.QRCStatusLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Prasad Khode
 * @see com.ifli.rapid.service.base.QRCStatusLocalServiceBaseImpl
 * @see com.ifli.rapid.service.QRCStatusLocalServiceUtil
 */
public class QRCStatusLocalServiceImpl extends QRCStatusLocalServiceBaseImpl {
	
	
	public   java.util.List<com.ifli.rapid.model.QRCStatus> findBySR_ID(
			int QRC_ASR_ID)
			throws com.liferay.portal.kernel.exception.SystemException {
			return QRCStatusUtil.findBySR_ID(QRC_ASR_ID);
		}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifli.rapid.service.QRCStatusLocalServiceUtil} to access the q r c status local service.
	 */
}