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

import com.ifli.rapid.model.OfficeDetails;
import com.ifli.rapid.service.OfficeDetailsLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the OfficeDetails service. Represents a row in the &quot;office_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OfficeDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see OfficeDetailsImpl
 * @see com.ifli.rapid.model.OfficeDetails
 * @generated
 */
public abstract class OfficeDetailsBaseImpl extends OfficeDetailsModelImpl
	implements OfficeDetails {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a office details model instance should use the {@link OfficeDetails} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OfficeDetailsLocalServiceUtil.addOfficeDetails(this);
		}
		else {
			OfficeDetailsLocalServiceUtil.updateOfficeDetails(this);
		}
	}
}