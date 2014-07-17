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

import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the QRCSubTypeMaster service. Represents a row in the &quot;QRC_SUBTYPE_MASTER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QRCSubTypeMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCSubTypeMasterImpl
 * @see com.ifli.rapid.model.QRCSubTypeMaster
 * @generated
 */
public abstract class QRCSubTypeMasterBaseImpl extends QRCSubTypeMasterModelImpl
	implements QRCSubTypeMaster {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q r c sub type master model instance should use the {@link QRCSubTypeMaster} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCSubTypeMasterLocalServiceUtil.addQRCSubTypeMaster(this);
		}
		else {
			QRCSubTypeMasterLocalServiceUtil.updateQRCSubTypeMaster(this);
		}
	}
}