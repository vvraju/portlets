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

import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;
import com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PREMIUM_PAID_CERTIFICATE service. Represents a row in the &quot;PREMIUM_PAID_CERTIFICATE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PREMIUM_PAID_CERTIFICATEImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATEImpl
 * @see com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE
 * @generated
 */
public abstract class PREMIUM_PAID_CERTIFICATEBaseImpl
	extends PREMIUM_PAID_CERTIFICATEModelImpl
	implements PREMIUM_PAID_CERTIFICATE {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a p r e m i u m_ p a i d_ c e r t i f i c a t e model instance should use the {@link PREMIUM_PAID_CERTIFICATE} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PREMIUM_PAID_CERTIFICATELocalServiceUtil.addPREMIUM_PAID_CERTIFICATE(this);
		}
		else {
			PREMIUM_PAID_CERTIFICATELocalServiceUtil.updatePREMIUM_PAID_CERTIFICATE(this);
		}
	}
}