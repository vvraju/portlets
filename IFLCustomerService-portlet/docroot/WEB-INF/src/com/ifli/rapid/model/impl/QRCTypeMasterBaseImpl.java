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

import com.ifli.rapid.model.QRCTypeMaster;
import com.ifli.rapid.service.QRCTypeMasterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the QRCTypeMaster service. Represents a row in the &quot;QRC_TYPE_MASTER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QRCTypeMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCTypeMasterImpl
 * @see com.ifli.rapid.model.QRCTypeMaster
 * @generated
 */
public abstract class QRCTypeMasterBaseImpl extends QRCTypeMasterModelImpl
	implements QRCTypeMaster {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q r c type master model instance should use the {@link QRCTypeMaster} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCTypeMasterLocalServiceUtil.addQRCTypeMaster(this);
		}
		else {
			QRCTypeMasterLocalServiceUtil.updateQRCTypeMaster(this);
		}
	}
}