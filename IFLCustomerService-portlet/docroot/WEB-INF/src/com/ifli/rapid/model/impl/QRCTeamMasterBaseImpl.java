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

import com.ifli.rapid.model.QRCTeamMaster;
import com.ifli.rapid.service.QRCTeamMasterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the QRCTeamMaster service. Represents a row in the &quot;QRC_TEAM_MASTER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QRCTeamMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCTeamMasterImpl
 * @see com.ifli.rapid.model.QRCTeamMaster
 * @generated
 */
public abstract class QRCTeamMasterBaseImpl extends QRCTeamMasterModelImpl
	implements QRCTeamMaster {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q r c team master model instance should use the {@link QRCTeamMaster} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCTeamMasterLocalServiceUtil.addQRCTeamMaster(this);
		}
		else {
			QRCTeamMasterLocalServiceUtil.updateQRCTeamMaster(this);
		}
	}
}