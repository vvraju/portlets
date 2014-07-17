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

package com.ifl.rapid.customer.service.messaging;

import com.ifl.rapid.customer.service.ApplyTrnApplicationFormLocalServiceUtil;
import com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil;
import com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalServiceUtil;
import com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_ContactLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_ContactServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil;
import com.ifl.rapid.customer.service.CityLocalServiceUtil;
import com.ifl.rapid.customer.service.ClpSerializer;
import com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil;
import com.ifl.rapid.customer.service.LocMstBranchLocationLocalServiceUtil;
import com.ifl.rapid.customer.service.LocMstLocationLocalServiceUtil;
import com.ifl.rapid.customer.service.PrdMstProductLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcMstRequestsLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcMstServicesLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcMstSubServicesLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnHistoryLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnOtpLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnServiceRequestsLocalServiceUtil;
import com.ifl.rapid.customer.service.StateLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Satya Kola
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ApplyTrnApplicationFormLocalServiceUtil.clearService();

			ApplyTrnQuoteDetailsLocalServiceUtil.clearService();

			CityLocalServiceUtil.clearService();

			Config_Mst_GenericMasterLocalServiceUtil.clearService();

			CRM_Trn_AddressLocalServiceUtil.clearService();

			CRM_Trn_ContactLocalServiceUtil.clearService();

			CRM_Trn_ContactServiceUtil.clearService();
			CRM_Trn_PhoneLocalServiceUtil.clearService();

			CRM_Trn_PolicyAddressLocalServiceUtil.clearService();

			CRMTrnContactCommunicationLocalServiceUtil.clearService();

			CRMTrnFamilyMemberLocalServiceUtil.clearService();

			LocMstBranchLocationLocalServiceUtil.clearService();

			LocMstLocationLocalServiceUtil.clearService();

			PrdMstProductLocalServiceUtil.clearService();

			QrcMstRequestsLocalServiceUtil.clearService();

			QrcMstServicesLocalServiceUtil.clearService();

			QrcMstSubServicesLocalServiceUtil.clearService();

			QrcTrnHistoryLocalServiceUtil.clearService();

			QrcTrnOtpLocalServiceUtil.clearService();

			QrcTrnServiceRequestsLocalServiceUtil.clearService();

			StateLocalServiceUtil.clearService();
		}
	}
}