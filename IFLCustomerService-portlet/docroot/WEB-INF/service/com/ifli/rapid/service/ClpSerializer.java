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

package com.ifli.rapid.service;

import com.ifli.rapid.model.ActiveServiceRequestsClp;
import com.ifli.rapid.model.AddressChangeReqDetailsClp;
import com.ifli.rapid.model.AddressTypeClp;
import com.ifli.rapid.model.BranchDetailsClp;
import com.ifli.rapid.model.ChequePaymentRequestClp;
import com.ifli.rapid.model.CityDetailsClp;
import com.ifli.rapid.model.ClosedServiceRequestsClp;
import com.ifli.rapid.model.ConfirmDetailsClp;
import com.ifli.rapid.model.CustomerClp;
import com.ifli.rapid.model.CustomerFamilyDetailsClp;
import com.ifli.rapid.model.CustomerMobileNumbersClp;
import com.ifli.rapid.model.CustomerOtpClp;
import com.ifli.rapid.model.FamilyRelationsClp;
import com.ifli.rapid.model.FundMasterClp;
import com.ifli.rapid.model.LocationDetailsClp;
import com.ifli.rapid.model.NavHistoryClp;
import com.ifli.rapid.model.POLICY_DOC_TYPESClp;
import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATEClp;
import com.ifli.rapid.model.PaymentDetailsClp;
import com.ifli.rapid.model.PaymentGatewayMasterClp;
import com.ifli.rapid.model.PaymentMethodMasterClp;
import com.ifli.rapid.model.PaymentMethodTypeClp;
import com.ifli.rapid.model.PaymentOptionMasterClp;
import com.ifli.rapid.model.PaymentOptionTypesClp;
import com.ifli.rapid.model.PaymentTransactionStatusMasterClp;
import com.ifli.rapid.model.PincodeDetailsClp;
import com.ifli.rapid.model.PolicyAddressClp;
import com.ifli.rapid.model.PolicyFundClp;
import com.ifli.rapid.model.PolicyFundSwitchCounterClp;
import com.ifli.rapid.model.PolicyFundSwitchDetailsClp;
import com.ifli.rapid.model.PolicyInfoClp;
import com.ifli.rapid.model.PolicyPremPercentageClp;
import com.ifli.rapid.model.PolicyPremRedirectionDetailsClp;
import com.ifli.rapid.model.PolicyTopupDetailsClp;
import com.ifli.rapid.model.PremiumFrequencyMasterClp;
import com.ifli.rapid.model.PremiumTypeClp;
import com.ifli.rapid.model.ProductFundMappingClp;
import com.ifli.rapid.model.ProofDocsClp;
import com.ifli.rapid.model.QRCStatusClp;
import com.ifli.rapid.model.QRCSubTypeMasterClp;
import com.ifli.rapid.model.QRCTeamMasterClp;
import com.ifli.rapid.model.QRCTypeMasterClp;
import com.ifli.rapid.model.QRCUserClp;
import com.ifli.rapid.model.RENEWAL_PREMIUMClp;
import com.ifli.rapid.model.Recommended_ProductsClp;
import com.ifli.rapid.model.ServiceMasterClp;
import com.ifli.rapid.model.ServiceRequestMasterClp;
import com.ifli.rapid.model.ServiceSubMasterClp;
import com.ifli.rapid.model.StateDetailsClp;
import com.ifli.rapid.model.TempCustomerAddressClp;
import com.ifli.rapid.model.TempCustomerClp;
import com.ifli.rapid.model.customerAddressClp;
import com.ifli.rapid.model.customerMailIdsClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Satya Kola
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"IFLCustomerService-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"IFLCustomerService-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "IFLCustomerService-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ActiveServiceRequestsClp.class.getName())) {
			return translateInputActiveServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(AddressChangeReqDetailsClp.class.getName())) {
			return translateInputAddressChangeReqDetails(oldModel);
		}

		if (oldModelClassName.equals(AddressTypeClp.class.getName())) {
			return translateInputAddressType(oldModel);
		}

		if (oldModelClassName.equals(BranchDetailsClp.class.getName())) {
			return translateInputBranchDetails(oldModel);
		}

		if (oldModelClassName.equals(ChequePaymentRequestClp.class.getName())) {
			return translateInputChequePaymentRequest(oldModel);
		}

		if (oldModelClassName.equals(CityDetailsClp.class.getName())) {
			return translateInputCityDetails(oldModel);
		}

		if (oldModelClassName.equals(ClosedServiceRequestsClp.class.getName())) {
			return translateInputClosedServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(ConfirmDetailsClp.class.getName())) {
			return translateInputConfirmDetails(oldModel);
		}

		if (oldModelClassName.equals(CustomerClp.class.getName())) {
			return translateInputCustomer(oldModel);
		}

		if (oldModelClassName.equals(customerAddressClp.class.getName())) {
			return translateInputcustomerAddress(oldModel);
		}

		if (oldModelClassName.equals(CustomerFamilyDetailsClp.class.getName())) {
			return translateInputCustomerFamilyDetails(oldModel);
		}

		if (oldModelClassName.equals(customerMailIdsClp.class.getName())) {
			return translateInputcustomerMailIds(oldModel);
		}

		if (oldModelClassName.equals(CustomerMobileNumbersClp.class.getName())) {
			return translateInputCustomerMobileNumbers(oldModel);
		}

		if (oldModelClassName.equals(CustomerOtpClp.class.getName())) {
			return translateInputCustomerOtp(oldModel);
		}

		if (oldModelClassName.equals(FamilyRelationsClp.class.getName())) {
			return translateInputFamilyRelations(oldModel);
		}

		if (oldModelClassName.equals(FundMasterClp.class.getName())) {
			return translateInputFundMaster(oldModel);
		}

		if (oldModelClassName.equals(LocationDetailsClp.class.getName())) {
			return translateInputLocationDetails(oldModel);
		}

		if (oldModelClassName.equals(NavHistoryClp.class.getName())) {
			return translateInputNavHistory(oldModel);
		}

		if (oldModelClassName.equals(PaymentDetailsClp.class.getName())) {
			return translateInputPaymentDetails(oldModel);
		}

		if (oldModelClassName.equals(PaymentGatewayMasterClp.class.getName())) {
			return translateInputPaymentGatewayMaster(oldModel);
		}

		if (oldModelClassName.equals(PaymentMethodMasterClp.class.getName())) {
			return translateInputPaymentMethodMaster(oldModel);
		}

		if (oldModelClassName.equals(PaymentMethodTypeClp.class.getName())) {
			return translateInputPaymentMethodType(oldModel);
		}

		if (oldModelClassName.equals(PaymentOptionMasterClp.class.getName())) {
			return translateInputPaymentOptionMaster(oldModel);
		}

		if (oldModelClassName.equals(PaymentOptionTypesClp.class.getName())) {
			return translateInputPaymentOptionTypes(oldModel);
		}

		if (oldModelClassName.equals(
					PaymentTransactionStatusMasterClp.class.getName())) {
			return translateInputPaymentTransactionStatusMaster(oldModel);
		}

		if (oldModelClassName.equals(PincodeDetailsClp.class.getName())) {
			return translateInputPincodeDetails(oldModel);
		}

		if (oldModelClassName.equals(POLICY_DOC_TYPESClp.class.getName())) {
			return translateInputPOLICY_DOC_TYPES(oldModel);
		}

		if (oldModelClassName.equals(PolicyAddressClp.class.getName())) {
			return translateInputPolicyAddress(oldModel);
		}

		if (oldModelClassName.equals(PolicyFundClp.class.getName())) {
			return translateInputPolicyFund(oldModel);
		}

		if (oldModelClassName.equals(PolicyFundSwitchCounterClp.class.getName())) {
			return translateInputPolicyFundSwitchCounter(oldModel);
		}

		if (oldModelClassName.equals(PolicyFundSwitchDetailsClp.class.getName())) {
			return translateInputPolicyFundSwitchDetails(oldModel);
		}

		if (oldModelClassName.equals(PolicyInfoClp.class.getName())) {
			return translateInputPolicyInfo(oldModel);
		}

		if (oldModelClassName.equals(PolicyPremPercentageClp.class.getName())) {
			return translateInputPolicyPremPercentage(oldModel);
		}

		if (oldModelClassName.equals(
					PolicyPremRedirectionDetailsClp.class.getName())) {
			return translateInputPolicyPremRedirectionDetails(oldModel);
		}

		if (oldModelClassName.equals(PolicyTopupDetailsClp.class.getName())) {
			return translateInputPolicyTopupDetails(oldModel);
		}

		if (oldModelClassName.equals(
					PREMIUM_PAID_CERTIFICATEClp.class.getName())) {
			return translateInputPREMIUM_PAID_CERTIFICATE(oldModel);
		}

		if (oldModelClassName.equals(PremiumFrequencyMasterClp.class.getName())) {
			return translateInputPremiumFrequencyMaster(oldModel);
		}

		if (oldModelClassName.equals(PremiumTypeClp.class.getName())) {
			return translateInputPremiumType(oldModel);
		}

		if (oldModelClassName.equals(ProductFundMappingClp.class.getName())) {
			return translateInputProductFundMapping(oldModel);
		}

		if (oldModelClassName.equals(ProofDocsClp.class.getName())) {
			return translateInputProofDocs(oldModel);
		}

		if (oldModelClassName.equals(QRCStatusClp.class.getName())) {
			return translateInputQRCStatus(oldModel);
		}

		if (oldModelClassName.equals(QRCSubTypeMasterClp.class.getName())) {
			return translateInputQRCSubTypeMaster(oldModel);
		}

		if (oldModelClassName.equals(QRCTeamMasterClp.class.getName())) {
			return translateInputQRCTeamMaster(oldModel);
		}

		if (oldModelClassName.equals(QRCTypeMasterClp.class.getName())) {
			return translateInputQRCTypeMaster(oldModel);
		}

		if (oldModelClassName.equals(QRCUserClp.class.getName())) {
			return translateInputQRCUser(oldModel);
		}

		if (oldModelClassName.equals(Recommended_ProductsClp.class.getName())) {
			return translateInputRecommended_Products(oldModel);
		}

		if (oldModelClassName.equals(RENEWAL_PREMIUMClp.class.getName())) {
			return translateInputRENEWAL_PREMIUM(oldModel);
		}

		if (oldModelClassName.equals(ServiceMasterClp.class.getName())) {
			return translateInputServiceMaster(oldModel);
		}

		if (oldModelClassName.equals(ServiceRequestMasterClp.class.getName())) {
			return translateInputServiceRequestMaster(oldModel);
		}

		if (oldModelClassName.equals(ServiceSubMasterClp.class.getName())) {
			return translateInputServiceSubMaster(oldModel);
		}

		if (oldModelClassName.equals(StateDetailsClp.class.getName())) {
			return translateInputStateDetails(oldModel);
		}

		if (oldModelClassName.equals(TempCustomerClp.class.getName())) {
			return translateInputTempCustomer(oldModel);
		}

		if (oldModelClassName.equals(TempCustomerAddressClp.class.getName())) {
			return translateInputTempCustomerAddress(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputActiveServiceRequests(
		BaseModel<?> oldModel) {
		ActiveServiceRequestsClp oldClpModel = (ActiveServiceRequestsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActiveServiceRequestsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAddressChangeReqDetails(
		BaseModel<?> oldModel) {
		AddressChangeReqDetailsClp oldClpModel = (AddressChangeReqDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAddressChangeReqDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAddressType(BaseModel<?> oldModel) {
		AddressTypeClp oldClpModel = (AddressTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAddressTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputBranchDetails(BaseModel<?> oldModel) {
		BranchDetailsClp oldClpModel = (BranchDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBranchDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputChequePaymentRequest(
		BaseModel<?> oldModel) {
		ChequePaymentRequestClp oldClpModel = (ChequePaymentRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getChequePaymentRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCityDetails(BaseModel<?> oldModel) {
		CityDetailsClp oldClpModel = (CityDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCityDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputClosedServiceRequests(
		BaseModel<?> oldModel) {
		ClosedServiceRequestsClp oldClpModel = (ClosedServiceRequestsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getClosedServiceRequestsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConfirmDetails(BaseModel<?> oldModel) {
		ConfirmDetailsClp oldClpModel = (ConfirmDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConfirmDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCustomer(BaseModel<?> oldModel) {
		CustomerClp oldClpModel = (CustomerClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCustomerRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcustomerAddress(BaseModel<?> oldModel) {
		customerAddressClp oldClpModel = (customerAddressClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcustomerAddressRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCustomerFamilyDetails(
		BaseModel<?> oldModel) {
		CustomerFamilyDetailsClp oldClpModel = (CustomerFamilyDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCustomerFamilyDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcustomerMailIds(BaseModel<?> oldModel) {
		customerMailIdsClp oldClpModel = (customerMailIdsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcustomerMailIdsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCustomerMobileNumbers(
		BaseModel<?> oldModel) {
		CustomerMobileNumbersClp oldClpModel = (CustomerMobileNumbersClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCustomerMobileNumbersRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCustomerOtp(BaseModel<?> oldModel) {
		CustomerOtpClp oldClpModel = (CustomerOtpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCustomerOtpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFamilyRelations(BaseModel<?> oldModel) {
		FamilyRelationsClp oldClpModel = (FamilyRelationsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFamilyRelationsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFundMaster(BaseModel<?> oldModel) {
		FundMasterClp oldClpModel = (FundMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFundMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLocationDetails(BaseModel<?> oldModel) {
		LocationDetailsClp oldClpModel = (LocationDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLocationDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNavHistory(BaseModel<?> oldModel) {
		NavHistoryClp oldClpModel = (NavHistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNavHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentDetails(BaseModel<?> oldModel) {
		PaymentDetailsClp oldClpModel = (PaymentDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentGatewayMaster(
		BaseModel<?> oldModel) {
		PaymentGatewayMasterClp oldClpModel = (PaymentGatewayMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentGatewayMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentMethodMaster(
		BaseModel<?> oldModel) {
		PaymentMethodMasterClp oldClpModel = (PaymentMethodMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentMethodMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentMethodType(BaseModel<?> oldModel) {
		PaymentMethodTypeClp oldClpModel = (PaymentMethodTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentMethodTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentOptionMaster(
		BaseModel<?> oldModel) {
		PaymentOptionMasterClp oldClpModel = (PaymentOptionMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentOptionMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentOptionTypes(BaseModel<?> oldModel) {
		PaymentOptionTypesClp oldClpModel = (PaymentOptionTypesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentOptionTypesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentTransactionStatusMaster(
		BaseModel<?> oldModel) {
		PaymentTransactionStatusMasterClp oldClpModel = (PaymentTransactionStatusMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentTransactionStatusMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPincodeDetails(BaseModel<?> oldModel) {
		PincodeDetailsClp oldClpModel = (PincodeDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPincodeDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPOLICY_DOC_TYPES(BaseModel<?> oldModel) {
		POLICY_DOC_TYPESClp oldClpModel = (POLICY_DOC_TYPESClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPOLICY_DOC_TYPESRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyAddress(BaseModel<?> oldModel) {
		PolicyAddressClp oldClpModel = (PolicyAddressClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyAddressRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyFund(BaseModel<?> oldModel) {
		PolicyFundClp oldClpModel = (PolicyFundClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyFundRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyFundSwitchCounter(
		BaseModel<?> oldModel) {
		PolicyFundSwitchCounterClp oldClpModel = (PolicyFundSwitchCounterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyFundSwitchCounterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyFundSwitchDetails(
		BaseModel<?> oldModel) {
		PolicyFundSwitchDetailsClp oldClpModel = (PolicyFundSwitchDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyFundSwitchDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyInfo(BaseModel<?> oldModel) {
		PolicyInfoClp oldClpModel = (PolicyInfoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyInfoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyPremPercentage(
		BaseModel<?> oldModel) {
		PolicyPremPercentageClp oldClpModel = (PolicyPremPercentageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyPremPercentageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyPremRedirectionDetails(
		BaseModel<?> oldModel) {
		PolicyPremRedirectionDetailsClp oldClpModel = (PolicyPremRedirectionDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyPremRedirectionDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPolicyTopupDetails(BaseModel<?> oldModel) {
		PolicyTopupDetailsClp oldClpModel = (PolicyTopupDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPolicyTopupDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPREMIUM_PAID_CERTIFICATE(
		BaseModel<?> oldModel) {
		PREMIUM_PAID_CERTIFICATEClp oldClpModel = (PREMIUM_PAID_CERTIFICATEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPREMIUM_PAID_CERTIFICATERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPremiumFrequencyMaster(
		BaseModel<?> oldModel) {
		PremiumFrequencyMasterClp oldClpModel = (PremiumFrequencyMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPremiumFrequencyMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPremiumType(BaseModel<?> oldModel) {
		PremiumTypeClp oldClpModel = (PremiumTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPremiumTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProductFundMapping(BaseModel<?> oldModel) {
		ProductFundMappingClp oldClpModel = (ProductFundMappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProductFundMappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProofDocs(BaseModel<?> oldModel) {
		ProofDocsClp oldClpModel = (ProofDocsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProofDocsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQRCStatus(BaseModel<?> oldModel) {
		QRCStatusClp oldClpModel = (QRCStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQRCStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQRCSubTypeMaster(BaseModel<?> oldModel) {
		QRCSubTypeMasterClp oldClpModel = (QRCSubTypeMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQRCSubTypeMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQRCTeamMaster(BaseModel<?> oldModel) {
		QRCTeamMasterClp oldClpModel = (QRCTeamMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQRCTeamMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQRCTypeMaster(BaseModel<?> oldModel) {
		QRCTypeMasterClp oldClpModel = (QRCTypeMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQRCTypeMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQRCUser(BaseModel<?> oldModel) {
		QRCUserClp oldClpModel = (QRCUserClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQRCUserRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRecommended_Products(
		BaseModel<?> oldModel) {
		Recommended_ProductsClp oldClpModel = (Recommended_ProductsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRecommended_ProductsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRENEWAL_PREMIUM(BaseModel<?> oldModel) {
		RENEWAL_PREMIUMClp oldClpModel = (RENEWAL_PREMIUMClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRENEWAL_PREMIUMRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputServiceMaster(BaseModel<?> oldModel) {
		ServiceMasterClp oldClpModel = (ServiceMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getServiceMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputServiceRequestMaster(
		BaseModel<?> oldModel) {
		ServiceRequestMasterClp oldClpModel = (ServiceRequestMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getServiceRequestMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputServiceSubMaster(BaseModel<?> oldModel) {
		ServiceSubMasterClp oldClpModel = (ServiceSubMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getServiceSubMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStateDetails(BaseModel<?> oldModel) {
		StateDetailsClp oldClpModel = (StateDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStateDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCustomer(BaseModel<?> oldModel) {
		TempCustomerClp oldClpModel = (TempCustomerClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCustomerRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCustomerAddress(
		BaseModel<?> oldModel) {
		TempCustomerAddressClp oldClpModel = (TempCustomerAddressClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCustomerAddressRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ActiveServiceRequestsImpl")) {
			return translateOutputActiveServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.AddressChangeReqDetailsImpl")) {
			return translateOutputAddressChangeReqDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.AddressTypeImpl")) {
			return translateOutputAddressType(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.BranchDetailsImpl")) {
			return translateOutputBranchDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ChequePaymentRequestImpl")) {
			return translateOutputChequePaymentRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.CityDetailsImpl")) {
			return translateOutputCityDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ClosedServiceRequestsImpl")) {
			return translateOutputClosedServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ConfirmDetailsImpl")) {
			return translateOutputConfirmDetails(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.CustomerImpl")) {
			return translateOutputCustomer(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.customerAddressImpl")) {
			return translateOutputcustomerAddress(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.CustomerFamilyDetailsImpl")) {
			return translateOutputCustomerFamilyDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.customerMailIdsImpl")) {
			return translateOutputcustomerMailIds(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.CustomerMobileNumbersImpl")) {
			return translateOutputCustomerMobileNumbers(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.CustomerOtpImpl")) {
			return translateOutputCustomerOtp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.FamilyRelationsImpl")) {
			return translateOutputFamilyRelations(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.FundMasterImpl")) {
			return translateOutputFundMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.LocationDetailsImpl")) {
			return translateOutputLocationDetails(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.NavHistoryImpl")) {
			return translateOutputNavHistory(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentDetailsImpl")) {
			return translateOutputPaymentDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentGatewayMasterImpl")) {
			return translateOutputPaymentGatewayMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentMethodMasterImpl")) {
			return translateOutputPaymentMethodMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentMethodTypeImpl")) {
			return translateOutputPaymentMethodType(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentOptionMasterImpl")) {
			return translateOutputPaymentOptionMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentOptionTypesImpl")) {
			return translateOutputPaymentOptionTypes(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PaymentTransactionStatusMasterImpl")) {
			return translateOutputPaymentTransactionStatusMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PincodeDetailsImpl")) {
			return translateOutputPincodeDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.POLICY_DOC_TYPESImpl")) {
			return translateOutputPOLICY_DOC_TYPES(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyAddressImpl")) {
			return translateOutputPolicyAddress(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.PolicyFundImpl")) {
			return translateOutputPolicyFund(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyFundSwitchCounterImpl")) {
			return translateOutputPolicyFundSwitchCounter(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl")) {
			return translateOutputPolicyFundSwitchDetails(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.PolicyInfoImpl")) {
			return translateOutputPolicyInfo(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyPremPercentageImpl")) {
			return translateOutputPolicyPremPercentage(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl")) {
			return translateOutputPolicyPremRedirectionDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PolicyTopupDetailsImpl")) {
			return translateOutputPolicyTopupDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEImpl")) {
			return translateOutputPREMIUM_PAID_CERTIFICATE(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PremiumFrequencyMasterImpl")) {
			return translateOutputPremiumFrequencyMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.PremiumTypeImpl")) {
			return translateOutputPremiumType(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ProductFundMappingImpl")) {
			return translateOutputProductFundMapping(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.ProofDocsImpl")) {
			return translateOutputProofDocs(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.QRCStatusImpl")) {
			return translateOutputQRCStatus(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.QRCSubTypeMasterImpl")) {
			return translateOutputQRCSubTypeMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.QRCTeamMasterImpl")) {
			return translateOutputQRCTeamMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.QRCTypeMasterImpl")) {
			return translateOutputQRCTypeMaster(oldModel);
		}

		if (oldModelClassName.equals("com.ifli.rapid.model.impl.QRCUserImpl")) {
			return translateOutputQRCUser(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.Recommended_ProductsImpl")) {
			return translateOutputRecommended_Products(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.RENEWAL_PREMIUMImpl")) {
			return translateOutputRENEWAL_PREMIUM(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ServiceMasterImpl")) {
			return translateOutputServiceMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ServiceRequestMasterImpl")) {
			return translateOutputServiceRequestMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.ServiceSubMasterImpl")) {
			return translateOutputServiceSubMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.StateDetailsImpl")) {
			return translateOutputStateDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.TempCustomerImpl")) {
			return translateOutputTempCustomer(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifli.rapid.model.impl.TempCustomerAddressImpl")) {
			return translateOutputTempCustomerAddress(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchActiveServiceRequestsException")) {
			return new com.ifli.rapid.NoSuchActiveServiceRequestsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchAddressChangeReqDetailsException")) {
			return new com.ifli.rapid.NoSuchAddressChangeReqDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchAddressTypeException")) {
			return new com.ifli.rapid.NoSuchAddressTypeException();
		}

		if (className.equals("com.ifli.rapid.NoSuchBranchDetailsException")) {
			return new com.ifli.rapid.NoSuchBranchDetailsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchChequePaymentRequestException")) {
			return new com.ifli.rapid.NoSuchChequePaymentRequestException();
		}

		if (className.equals("com.ifli.rapid.NoSuchCityDetailsException")) {
			return new com.ifli.rapid.NoSuchCityDetailsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchClosedServiceRequestsException")) {
			return new com.ifli.rapid.NoSuchClosedServiceRequestsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchConfirmDetailsException")) {
			return new com.ifli.rapid.NoSuchConfirmDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchCustomerException")) {
			return new com.ifli.rapid.NoSuchCustomerException();
		}

		if (className.equals("com.ifli.rapid.NoSuchcustomerAddressException")) {
			return new com.ifli.rapid.NoSuchcustomerAddressException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchCustomerFamilyDetailsException")) {
			return new com.ifli.rapid.NoSuchCustomerFamilyDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchcustomerMailIdsException")) {
			return new com.ifli.rapid.NoSuchcustomerMailIdsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchCustomerMobileNumbersException")) {
			return new com.ifli.rapid.NoSuchCustomerMobileNumbersException();
		}

		if (className.equals("com.ifli.rapid.NoSuchCustomerOtpException")) {
			return new com.ifli.rapid.NoSuchCustomerOtpException();
		}

		if (className.equals("com.ifli.rapid.NoSuchFamilyRelationsException")) {
			return new com.ifli.rapid.NoSuchFamilyRelationsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchFundMasterException")) {
			return new com.ifli.rapid.NoSuchFundMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchLocationDetailsException")) {
			return new com.ifli.rapid.NoSuchLocationDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchNavHistoryException")) {
			return new com.ifli.rapid.NoSuchNavHistoryException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPaymentDetailsException")) {
			return new com.ifli.rapid.NoSuchPaymentDetailsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPaymentGatewayMasterException")) {
			return new com.ifli.rapid.NoSuchPaymentGatewayMasterException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPaymentMethodMasterException")) {
			return new com.ifli.rapid.NoSuchPaymentMethodMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPaymentMethodTypeException")) {
			return new com.ifli.rapid.NoSuchPaymentMethodTypeException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPaymentOptionMasterException")) {
			return new com.ifli.rapid.NoSuchPaymentOptionMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPaymentOptionTypesException")) {
			return new com.ifli.rapid.NoSuchPaymentOptionTypesException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException")) {
			return new com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPincodeDetailsException")) {
			return new com.ifli.rapid.NoSuchPincodeDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException")) {
			return new com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPolicyAddressException")) {
			return new com.ifli.rapid.NoSuchPolicyAddressException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPolicyFundException")) {
			return new com.ifli.rapid.NoSuchPolicyFundException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPolicyFundSwitchCounterException")) {
			return new com.ifli.rapid.NoSuchPolicyFundSwitchCounterException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException")) {
			return new com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPolicyInfoException")) {
			return new com.ifli.rapid.NoSuchPolicyInfoException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPolicyPremPercentageException")) {
			return new com.ifli.rapid.NoSuchPolicyPremPercentageException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException")) {
			return new com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPolicyTopupDetailsException")) {
			return new com.ifli.rapid.NoSuchPolicyTopupDetailsException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException")) {
			return new com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchPremiumFrequencyMasterException")) {
			return new com.ifli.rapid.NoSuchPremiumFrequencyMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchPremiumTypeException")) {
			return new com.ifli.rapid.NoSuchPremiumTypeException();
		}

		if (className.equals("com.ifli.rapid.NoSuchProductFundMappingException")) {
			return new com.ifli.rapid.NoSuchProductFundMappingException();
		}

		if (className.equals("com.ifli.rapid.NoSuchProofDocsException")) {
			return new com.ifli.rapid.NoSuchProofDocsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchQRCStatusException")) {
			return new com.ifli.rapid.NoSuchQRCStatusException();
		}

		if (className.equals("com.ifli.rapid.NoSuchQRCSubTypeMasterException")) {
			return new com.ifli.rapid.NoSuchQRCSubTypeMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchQRCTeamMasterException")) {
			return new com.ifli.rapid.NoSuchQRCTeamMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchQRCTypeMasterException")) {
			return new com.ifli.rapid.NoSuchQRCTypeMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchQRCUserException")) {
			return new com.ifli.rapid.NoSuchQRCUserException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchRecommended_ProductsException")) {
			return new com.ifli.rapid.NoSuchRecommended_ProductsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchRENEWAL_PREMIUMException")) {
			return new com.ifli.rapid.NoSuchRENEWAL_PREMIUMException();
		}

		if (className.equals("com.ifli.rapid.NoSuchServiceMasterException")) {
			return new com.ifli.rapid.NoSuchServiceMasterException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchServiceRequestMasterException")) {
			return new com.ifli.rapid.NoSuchServiceRequestMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchServiceSubMasterException")) {
			return new com.ifli.rapid.NoSuchServiceSubMasterException();
		}

		if (className.equals("com.ifli.rapid.NoSuchStateDetailsException")) {
			return new com.ifli.rapid.NoSuchStateDetailsException();
		}

		if (className.equals("com.ifli.rapid.NoSuchTempCustomerException")) {
			return new com.ifli.rapid.NoSuchTempCustomerException();
		}

		if (className.equals(
					"com.ifli.rapid.NoSuchTempCustomerAddressException")) {
			return new com.ifli.rapid.NoSuchTempCustomerAddressException();
		}

		return throwable;
	}

	public static Object translateOutputActiveServiceRequests(
		BaseModel<?> oldModel) {
		ActiveServiceRequestsClp newModel = new ActiveServiceRequestsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActiveServiceRequestsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAddressChangeReqDetails(
		BaseModel<?> oldModel) {
		AddressChangeReqDetailsClp newModel = new AddressChangeReqDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAddressChangeReqDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAddressType(BaseModel<?> oldModel) {
		AddressTypeClp newModel = new AddressTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAddressTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputBranchDetails(BaseModel<?> oldModel) {
		BranchDetailsClp newModel = new BranchDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBranchDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputChequePaymentRequest(
		BaseModel<?> oldModel) {
		ChequePaymentRequestClp newModel = new ChequePaymentRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setChequePaymentRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCityDetails(BaseModel<?> oldModel) {
		CityDetailsClp newModel = new CityDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCityDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputClosedServiceRequests(
		BaseModel<?> oldModel) {
		ClosedServiceRequestsClp newModel = new ClosedServiceRequestsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setClosedServiceRequestsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConfirmDetails(BaseModel<?> oldModel) {
		ConfirmDetailsClp newModel = new ConfirmDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConfirmDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCustomer(BaseModel<?> oldModel) {
		CustomerClp newModel = new CustomerClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCustomerRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcustomerAddress(BaseModel<?> oldModel) {
		customerAddressClp newModel = new customerAddressClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcustomerAddressRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCustomerFamilyDetails(
		BaseModel<?> oldModel) {
		CustomerFamilyDetailsClp newModel = new CustomerFamilyDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCustomerFamilyDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcustomerMailIds(BaseModel<?> oldModel) {
		customerMailIdsClp newModel = new customerMailIdsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcustomerMailIdsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCustomerMobileNumbers(
		BaseModel<?> oldModel) {
		CustomerMobileNumbersClp newModel = new CustomerMobileNumbersClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCustomerMobileNumbersRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCustomerOtp(BaseModel<?> oldModel) {
		CustomerOtpClp newModel = new CustomerOtpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCustomerOtpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFamilyRelations(BaseModel<?> oldModel) {
		FamilyRelationsClp newModel = new FamilyRelationsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFamilyRelationsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFundMaster(BaseModel<?> oldModel) {
		FundMasterClp newModel = new FundMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFundMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLocationDetails(BaseModel<?> oldModel) {
		LocationDetailsClp newModel = new LocationDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLocationDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNavHistory(BaseModel<?> oldModel) {
		NavHistoryClp newModel = new NavHistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNavHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentDetails(BaseModel<?> oldModel) {
		PaymentDetailsClp newModel = new PaymentDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentGatewayMaster(
		BaseModel<?> oldModel) {
		PaymentGatewayMasterClp newModel = new PaymentGatewayMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentGatewayMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentMethodMaster(
		BaseModel<?> oldModel) {
		PaymentMethodMasterClp newModel = new PaymentMethodMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentMethodMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentMethodType(BaseModel<?> oldModel) {
		PaymentMethodTypeClp newModel = new PaymentMethodTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentMethodTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentOptionMaster(
		BaseModel<?> oldModel) {
		PaymentOptionMasterClp newModel = new PaymentOptionMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentOptionMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentOptionTypes(
		BaseModel<?> oldModel) {
		PaymentOptionTypesClp newModel = new PaymentOptionTypesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentOptionTypesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentTransactionStatusMaster(
		BaseModel<?> oldModel) {
		PaymentTransactionStatusMasterClp newModel = new PaymentTransactionStatusMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentTransactionStatusMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPincodeDetails(BaseModel<?> oldModel) {
		PincodeDetailsClp newModel = new PincodeDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPincodeDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPOLICY_DOC_TYPES(BaseModel<?> oldModel) {
		POLICY_DOC_TYPESClp newModel = new POLICY_DOC_TYPESClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPOLICY_DOC_TYPESRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyAddress(BaseModel<?> oldModel) {
		PolicyAddressClp newModel = new PolicyAddressClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyAddressRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyFund(BaseModel<?> oldModel) {
		PolicyFundClp newModel = new PolicyFundClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyFundRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyFundSwitchCounter(
		BaseModel<?> oldModel) {
		PolicyFundSwitchCounterClp newModel = new PolicyFundSwitchCounterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyFundSwitchCounterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyFundSwitchDetails(
		BaseModel<?> oldModel) {
		PolicyFundSwitchDetailsClp newModel = new PolicyFundSwitchDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyFundSwitchDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyInfo(BaseModel<?> oldModel) {
		PolicyInfoClp newModel = new PolicyInfoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyInfoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyPremPercentage(
		BaseModel<?> oldModel) {
		PolicyPremPercentageClp newModel = new PolicyPremPercentageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyPremPercentageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyPremRedirectionDetails(
		BaseModel<?> oldModel) {
		PolicyPremRedirectionDetailsClp newModel = new PolicyPremRedirectionDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyPremRedirectionDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPolicyTopupDetails(
		BaseModel<?> oldModel) {
		PolicyTopupDetailsClp newModel = new PolicyTopupDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPolicyTopupDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPREMIUM_PAID_CERTIFICATE(
		BaseModel<?> oldModel) {
		PREMIUM_PAID_CERTIFICATEClp newModel = new PREMIUM_PAID_CERTIFICATEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPREMIUM_PAID_CERTIFICATERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPremiumFrequencyMaster(
		BaseModel<?> oldModel) {
		PremiumFrequencyMasterClp newModel = new PremiumFrequencyMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPremiumFrequencyMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPremiumType(BaseModel<?> oldModel) {
		PremiumTypeClp newModel = new PremiumTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPremiumTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProductFundMapping(
		BaseModel<?> oldModel) {
		ProductFundMappingClp newModel = new ProductFundMappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProductFundMappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProofDocs(BaseModel<?> oldModel) {
		ProofDocsClp newModel = new ProofDocsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProofDocsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQRCStatus(BaseModel<?> oldModel) {
		QRCStatusClp newModel = new QRCStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQRCStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQRCSubTypeMaster(BaseModel<?> oldModel) {
		QRCSubTypeMasterClp newModel = new QRCSubTypeMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQRCSubTypeMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQRCTeamMaster(BaseModel<?> oldModel) {
		QRCTeamMasterClp newModel = new QRCTeamMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQRCTeamMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQRCTypeMaster(BaseModel<?> oldModel) {
		QRCTypeMasterClp newModel = new QRCTypeMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQRCTypeMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQRCUser(BaseModel<?> oldModel) {
		QRCUserClp newModel = new QRCUserClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQRCUserRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRecommended_Products(
		BaseModel<?> oldModel) {
		Recommended_ProductsClp newModel = new Recommended_ProductsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRecommended_ProductsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRENEWAL_PREMIUM(BaseModel<?> oldModel) {
		RENEWAL_PREMIUMClp newModel = new RENEWAL_PREMIUMClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRENEWAL_PREMIUMRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputServiceMaster(BaseModel<?> oldModel) {
		ServiceMasterClp newModel = new ServiceMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setServiceMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputServiceRequestMaster(
		BaseModel<?> oldModel) {
		ServiceRequestMasterClp newModel = new ServiceRequestMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setServiceRequestMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputServiceSubMaster(BaseModel<?> oldModel) {
		ServiceSubMasterClp newModel = new ServiceSubMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setServiceSubMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStateDetails(BaseModel<?> oldModel) {
		StateDetailsClp newModel = new StateDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStateDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCustomer(BaseModel<?> oldModel) {
		TempCustomerClp newModel = new TempCustomerClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCustomerRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCustomerAddress(
		BaseModel<?> oldModel) {
		TempCustomerAddressClp newModel = new TempCustomerAddressClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCustomerAddressRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}