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

import com.ifli.rapid.model.PaymentMethodType;
import com.ifli.rapid.service.PaymentMethodTypeLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PaymentMethodType service. Represents a row in the &quot;PaymentMethodType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentMethodTypeImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodTypeImpl
 * @see com.ifli.rapid.model.PaymentMethodType
 * @generated
 */
public abstract class PaymentMethodTypeBaseImpl
	extends PaymentMethodTypeModelImpl implements PaymentMethodType {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment method type model instance should use the {@link PaymentMethodType} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentMethodTypeLocalServiceUtil.addPaymentMethodType(this);
		}
		else {
			PaymentMethodTypeLocalServiceUtil.updatePaymentMethodType(this);
		}
	}
}