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

import com.ifli.rapid.model.CustomerMobileNumbers;
import com.ifli.rapid.service.CustomerMobileNumbersLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CustomerMobileNumbers service. Represents a row in the &quot;customer_mobile_numbers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomerMobileNumbersImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CustomerMobileNumbersImpl
 * @see com.ifli.rapid.model.CustomerMobileNumbers
 * @generated
 */
public abstract class CustomerMobileNumbersBaseImpl
	extends CustomerMobileNumbersModelImpl implements CustomerMobileNumbers {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customer mobile numbers model instance should use the {@link CustomerMobileNumbers} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerMobileNumbersLocalServiceUtil.addCustomerMobileNumbers(this);
		}
		else {
			CustomerMobileNumbersLocalServiceUtil.updateCustomerMobileNumbers(this);
		}
	}
}