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

import com.ifl.rapid.customer.model.State;
import com.ifl.rapid.customer.service.StateLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Satya Kola
 * @generated
 */
public abstract class StateActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public StateActionableDynamicQuery() throws SystemException {
		setBaseLocalService(StateLocalServiceUtil.getService());
		setClass(State.class);

		setClassLoader(com.ifl.rapid.customer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("StateId");
	}
}