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

import com.ifli.rapid.model.QRCStatus;
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the QRCStatus service. Represents a row in the &quot;QRC_Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QRCStatusImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCStatusImpl
 * @see com.ifli.rapid.model.QRCStatus
 * @generated
 */
public abstract class QRCStatusBaseImpl extends QRCStatusModelImpl
	implements QRCStatus {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q r c status model instance should use the {@link QRCStatus} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCStatusLocalServiceUtil.addQRCStatus(this);
		}
		else {
			QRCStatusLocalServiceUtil.updateQRCStatus(this);
		}
	}
}