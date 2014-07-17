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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.CRM_Trn_Phone;
import com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CRM_Trn_Phone service. Represents a row in the &quot;CRM_Trn_Phone&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRM_Trn_PhoneImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PhoneImpl
 * @see com.ifl.rapid.customer.model.CRM_Trn_Phone
 * @generated
 */
public abstract class CRM_Trn_PhoneBaseImpl extends CRM_Trn_PhoneModelImpl
	implements CRM_Trn_Phone {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c r m_ trn_ phone model instance should use the {@link CRM_Trn_Phone} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRM_Trn_PhoneLocalServiceUtil.addCRM_Trn_Phone(this);
		}
		else {
			CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(this);
		}
	}
}