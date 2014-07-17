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

import com.ifli.rapid.model.PolicyFundSwitchDetails;
import com.ifli.rapid.service.PolicyFundSwitchDetailsLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Satya Kola
 * @generated
 */
public abstract class PolicyFundSwitchDetailsActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PolicyFundSwitchDetailsActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(PolicyFundSwitchDetailsLocalServiceUtil.getService());
		setClass(PolicyFundSwitchDetails.class);

		setClassLoader(com.ifli.rapid.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("FUND_SWITCH_ID");
	}
}