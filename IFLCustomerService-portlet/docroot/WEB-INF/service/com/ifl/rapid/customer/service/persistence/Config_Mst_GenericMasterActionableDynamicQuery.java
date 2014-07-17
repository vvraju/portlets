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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;
import com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Satya Kola
 * @generated
 */
public abstract class Config_Mst_GenericMasterActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public Config_Mst_GenericMasterActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(Config_Mst_GenericMasterLocalServiceUtil.getService());
		setClass(Config_Mst_GenericMaster.class);

		setClassLoader(com.ifl.rapid.customer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("GenericMasterId");
	}
}