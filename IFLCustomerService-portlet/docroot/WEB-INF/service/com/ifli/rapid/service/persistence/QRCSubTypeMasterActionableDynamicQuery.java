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

package com.ifli.rapid.service.persistence;

import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Satya Kola
 * @generated
 */
public abstract class QRCSubTypeMasterActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public QRCSubTypeMasterActionableDynamicQuery() throws SystemException {
		setBaseLocalService(QRCSubTypeMasterLocalServiceUtil.getService());
		setClass(QRCSubTypeMaster.class);

		setClassLoader(com.ifli.rapid.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("QRC_SUB_TYPE_ID");
	}
}