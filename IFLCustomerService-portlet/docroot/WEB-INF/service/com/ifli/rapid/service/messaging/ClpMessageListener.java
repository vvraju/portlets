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

package com.ifli.rapid.service.messaging;

import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.ActiveServiceRequestsServiceUtil;
import com.ifli.rapid.service.AddressChangeReqDetailsLocalServiceUtil;
import com.ifli.rapid.service.AddressTypeLocalServiceUtil;
import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.service.ChequePaymentRequestLocalServiceUtil;
import com.ifli.rapid.service.CityDetailsLocalServiceUtil;
import com.ifli.rapid.service.ClosedServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.ConfirmDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerFamilyDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerLocalServiceUtil;
import com.ifli.rapid.service.CustomerMobileNumbersLocalServiceUtil;
import com.ifli.rapid.service.CustomerOtpLocalServiceUtil;
import com.ifli.rapid.service.FamilyRelationsLocalServiceUtil;
import com.ifli.rapid.service.FundMasterLocalServiceUtil;
import com.ifli.rapid.service.LocationDetailsLocalServiceUtil;
import com.ifli.rapid.service.NavHistoryLocalServiceUtil;
import com.ifli.rapid.service.POLICY_DOC_TYPESLocalServiceUtil;
import com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil;
import com.ifli.rapid.service.PaymentDetailsLocalServiceUtil;
import com.ifli.rapid.service.PaymentGatewayMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodTypeLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionTypesLocalServiceUtil;
import com.ifli.rapid.service.PaymentTransactionStatusMasterLocalServiceUtil;
import com.ifli.rapid.service.PincodeDetailsLocalServiceUtil;
import com.ifli.rapid.service.PolicyAddressLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundSwitchCounterLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundSwitchDetailsLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.service.PolicyPremPercentageLocalServiceUtil;
import com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalServiceUtil;
import com.ifli.rapid.service.PolicyTopupDetailsLocalServiceUtil;
import com.ifli.rapid.service.PremiumFrequencyMasterLocalServiceUtil;
import com.ifli.rapid.service.PremiumTypeLocalServiceUtil;
import com.ifli.rapid.service.ProductFundMappingLocalServiceUtil;
import com.ifli.rapid.service.ProofDocsLocalServiceUtil;
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.QRCTeamMasterLocalServiceUtil;
import com.ifli.rapid.service.QRCTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.QRCUserLocalServiceUtil;
import com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil;
import com.ifli.rapid.service.Recommended_ProductsLocalServiceUtil;
import com.ifli.rapid.service.ServiceMasterLocalServiceUtil;
import com.ifli.rapid.service.ServiceRequestMasterLocalServiceUtil;
import com.ifli.rapid.service.ServiceSubMasterLocalServiceUtil;
import com.ifli.rapid.service.StateDetailsLocalServiceUtil;
import com.ifli.rapid.service.TempCustomerAddressLocalServiceUtil;
import com.ifli.rapid.service.TempCustomerLocalServiceUtil;
import com.ifli.rapid.service.customerAddressLocalServiceUtil;
import com.ifli.rapid.service.customerMailIdsLocalServiceUtil;

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
			ActiveServiceRequestsLocalServiceUtil.clearService();

			ActiveServiceRequestsServiceUtil.clearService();
			AddressChangeReqDetailsLocalServiceUtil.clearService();

			AddressTypeLocalServiceUtil.clearService();

			BranchDetailsLocalServiceUtil.clearService();

			ChequePaymentRequestLocalServiceUtil.clearService();

			CityDetailsLocalServiceUtil.clearService();

			ClosedServiceRequestsLocalServiceUtil.clearService();

			ConfirmDetailsLocalServiceUtil.clearService();

			CustomerLocalServiceUtil.clearService();

			customerAddressLocalServiceUtil.clearService();

			CustomerFamilyDetailsLocalServiceUtil.clearService();

			customerMailIdsLocalServiceUtil.clearService();

			CustomerMobileNumbersLocalServiceUtil.clearService();

			CustomerOtpLocalServiceUtil.clearService();

			FamilyRelationsLocalServiceUtil.clearService();

			FundMasterLocalServiceUtil.clearService();

			LocationDetailsLocalServiceUtil.clearService();

			NavHistoryLocalServiceUtil.clearService();

			PaymentDetailsLocalServiceUtil.clearService();

			PaymentGatewayMasterLocalServiceUtil.clearService();

			PaymentMethodMasterLocalServiceUtil.clearService();

			PaymentMethodTypeLocalServiceUtil.clearService();

			PaymentOptionMasterLocalServiceUtil.clearService();

			PaymentOptionTypesLocalServiceUtil.clearService();

			PaymentTransactionStatusMasterLocalServiceUtil.clearService();

			PincodeDetailsLocalServiceUtil.clearService();

			POLICY_DOC_TYPESLocalServiceUtil.clearService();

			PolicyAddressLocalServiceUtil.clearService();

			PolicyFundLocalServiceUtil.clearService();

			PolicyFundSwitchCounterLocalServiceUtil.clearService();

			PolicyFundSwitchDetailsLocalServiceUtil.clearService();

			PolicyInfoLocalServiceUtil.clearService();

			PolicyPremPercentageLocalServiceUtil.clearService();

			PolicyPremRedirectionDetailsLocalServiceUtil.clearService();

			PolicyTopupDetailsLocalServiceUtil.clearService();

			PREMIUM_PAID_CERTIFICATELocalServiceUtil.clearService();

			PremiumFrequencyMasterLocalServiceUtil.clearService();

			PremiumTypeLocalServiceUtil.clearService();

			ProductFundMappingLocalServiceUtil.clearService();

			ProofDocsLocalServiceUtil.clearService();

			QRCStatusLocalServiceUtil.clearService();

			QRCSubTypeMasterLocalServiceUtil.clearService();

			QRCTeamMasterLocalServiceUtil.clearService();

			QRCTypeMasterLocalServiceUtil.clearService();

			QRCUserLocalServiceUtil.clearService();

			Recommended_ProductsLocalServiceUtil.clearService();

			RENEWAL_PREMIUMLocalServiceUtil.clearService();

			ServiceMasterLocalServiceUtil.clearService();

			ServiceRequestMasterLocalServiceUtil.clearService();

			ServiceSubMasterLocalServiceUtil.clearService();

			StateDetailsLocalServiceUtil.clearService();

			TempCustomerLocalServiceUtil.clearService();

			TempCustomerAddressLocalServiceUtil.clearService();
		}
	}
}