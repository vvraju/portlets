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

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.ClosedServiceRequests;
import com.ifli.rapid.service.ClosedServiceRequestsLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ClosedServiceRequests service. Represents a row in the &quot;QRC_CLOSED_SERVICE_REQS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ClosedServiceRequestsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ClosedServiceRequestsImpl
 * @see com.ifli.rapid.model.ClosedServiceRequests
 * @generated
 */
public abstract class ClosedServiceRequestsBaseImpl
	extends ClosedServiceRequestsModelImpl implements ClosedServiceRequests {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a closed service requests model instance should use the {@link ClosedServiceRequests} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ClosedServiceRequestsLocalServiceUtil.addClosedServiceRequests(this);
		}
		else {
			ClosedServiceRequestsLocalServiceUtil.updateClosedServiceRequests(this);
		}
	}
}