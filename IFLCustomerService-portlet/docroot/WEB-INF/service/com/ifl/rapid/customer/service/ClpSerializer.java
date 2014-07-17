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

package com.ifl.rapid.customer.service;

import com.ifl.rapid.customer.model.ApplyTrnApplicationFormClp;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetailsClp;
import com.ifl.rapid.customer.model.CRMTrnContactCommunicationClp;
import com.ifl.rapid.customer.model.CRMTrnFamilyMemberClp;
import com.ifl.rapid.customer.model.CRM_Trn_AddressClp;
import com.ifl.rapid.customer.model.CRM_Trn_ContactClp;
import com.ifl.rapid.customer.model.CRM_Trn_PhoneClp;
import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddressClp;
import com.ifl.rapid.customer.model.CityClp;
import com.ifl.rapid.customer.model.Config_Mst_GenericMasterClp;
import com.ifl.rapid.customer.model.LocMstBranchLocationClp;
import com.ifl.rapid.customer.model.LocMstLocationClp;
import com.ifl.rapid.customer.model.PrdMstProductClp;
import com.ifl.rapid.customer.model.QrcMstRequestsClp;
import com.ifl.rapid.customer.model.QrcMstServicesClp;
import com.ifl.rapid.customer.model.QrcMstSubServicesClp;
import com.ifl.rapid.customer.model.QrcTrnHistoryClp;
import com.ifl.rapid.customer.model.QrcTrnOtpClp;
import com.ifl.rapid.customer.model.QrcTrnServiceRequestsClp;
import com.ifl.rapid.customer.model.StateClp;

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

		if (oldModelClassName.equals(ApplyTrnApplicationFormClp.class.getName())) {
			return translateInputApplyTrnApplicationForm(oldModel);
		}

		if (oldModelClassName.equals(ApplyTrnQuoteDetailsClp.class.getName())) {
			return translateInputApplyTrnQuoteDetails(oldModel);
		}

		if (oldModelClassName.equals(CityClp.class.getName())) {
			return translateInputCity(oldModel);
		}

		if (oldModelClassName.equals(
					Config_Mst_GenericMasterClp.class.getName())) {
			return translateInputConfig_Mst_GenericMaster(oldModel);
		}

		if (oldModelClassName.equals(CRM_Trn_AddressClp.class.getName())) {
			return translateInputCRM_Trn_Address(oldModel);
		}

		if (oldModelClassName.equals(CRM_Trn_ContactClp.class.getName())) {
			return translateInputCRM_Trn_Contact(oldModel);
		}

		if (oldModelClassName.equals(CRM_Trn_PhoneClp.class.getName())) {
			return translateInputCRM_Trn_Phone(oldModel);
		}

		if (oldModelClassName.equals(CRM_Trn_PolicyAddressClp.class.getName())) {
			return translateInputCRM_Trn_PolicyAddress(oldModel);
		}

		if (oldModelClassName.equals(
					CRMTrnContactCommunicationClp.class.getName())) {
			return translateInputCRMTrnContactCommunication(oldModel);
		}

		if (oldModelClassName.equals(CRMTrnFamilyMemberClp.class.getName())) {
			return translateInputCRMTrnFamilyMember(oldModel);
		}

		if (oldModelClassName.equals(LocMstBranchLocationClp.class.getName())) {
			return translateInputLocMstBranchLocation(oldModel);
		}

		if (oldModelClassName.equals(LocMstLocationClp.class.getName())) {
			return translateInputLocMstLocation(oldModel);
		}

		if (oldModelClassName.equals(PrdMstProductClp.class.getName())) {
			return translateInputPrdMstProduct(oldModel);
		}

		if (oldModelClassName.equals(QrcMstRequestsClp.class.getName())) {
			return translateInputQrcMstRequests(oldModel);
		}

		if (oldModelClassName.equals(QrcMstServicesClp.class.getName())) {
			return translateInputQrcMstServices(oldModel);
		}

		if (oldModelClassName.equals(QrcMstSubServicesClp.class.getName())) {
			return translateInputQrcMstSubServices(oldModel);
		}

		if (oldModelClassName.equals(QrcTrnHistoryClp.class.getName())) {
			return translateInputQrcTrnHistory(oldModel);
		}

		if (oldModelClassName.equals(QrcTrnOtpClp.class.getName())) {
			return translateInputQrcTrnOtp(oldModel);
		}

		if (oldModelClassName.equals(QrcTrnServiceRequestsClp.class.getName())) {
			return translateInputQrcTrnServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(StateClp.class.getName())) {
			return translateInputState(oldModel);
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

	public static Object translateInputApplyTrnApplicationForm(
		BaseModel<?> oldModel) {
		ApplyTrnApplicationFormClp oldClpModel = (ApplyTrnApplicationFormClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getApplyTrnApplicationFormRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputApplyTrnQuoteDetails(
		BaseModel<?> oldModel) {
		ApplyTrnQuoteDetailsClp oldClpModel = (ApplyTrnQuoteDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getApplyTrnQuoteDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCity(BaseModel<?> oldModel) {
		CityClp oldClpModel = (CityClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCityRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConfig_Mst_GenericMaster(
		BaseModel<?> oldModel) {
		Config_Mst_GenericMasterClp oldClpModel = (Config_Mst_GenericMasterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConfig_Mst_GenericMasterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRM_Trn_Address(BaseModel<?> oldModel) {
		CRM_Trn_AddressClp oldClpModel = (CRM_Trn_AddressClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRM_Trn_AddressRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRM_Trn_Contact(BaseModel<?> oldModel) {
		CRM_Trn_ContactClp oldClpModel = (CRM_Trn_ContactClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRM_Trn_ContactRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRM_Trn_Phone(BaseModel<?> oldModel) {
		CRM_Trn_PhoneClp oldClpModel = (CRM_Trn_PhoneClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRM_Trn_PhoneRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRM_Trn_PolicyAddress(
		BaseModel<?> oldModel) {
		CRM_Trn_PolicyAddressClp oldClpModel = (CRM_Trn_PolicyAddressClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRM_Trn_PolicyAddressRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRMTrnContactCommunication(
		BaseModel<?> oldModel) {
		CRMTrnContactCommunicationClp oldClpModel = (CRMTrnContactCommunicationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRMTrnContactCommunicationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCRMTrnFamilyMember(BaseModel<?> oldModel) {
		CRMTrnFamilyMemberClp oldClpModel = (CRMTrnFamilyMemberClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCRMTrnFamilyMemberRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLocMstBranchLocation(
		BaseModel<?> oldModel) {
		LocMstBranchLocationClp oldClpModel = (LocMstBranchLocationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLocMstBranchLocationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLocMstLocation(BaseModel<?> oldModel) {
		LocMstLocationClp oldClpModel = (LocMstLocationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLocMstLocationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPrdMstProduct(BaseModel<?> oldModel) {
		PrdMstProductClp oldClpModel = (PrdMstProductClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPrdMstProductRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcMstRequests(BaseModel<?> oldModel) {
		QrcMstRequestsClp oldClpModel = (QrcMstRequestsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcMstRequestsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcMstServices(BaseModel<?> oldModel) {
		QrcMstServicesClp oldClpModel = (QrcMstServicesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcMstServicesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcMstSubServices(BaseModel<?> oldModel) {
		QrcMstSubServicesClp oldClpModel = (QrcMstSubServicesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcMstSubServicesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcTrnHistory(BaseModel<?> oldModel) {
		QrcTrnHistoryClp oldClpModel = (QrcTrnHistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcTrnHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcTrnOtp(BaseModel<?> oldModel) {
		QrcTrnOtpClp oldClpModel = (QrcTrnOtpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcTrnOtpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQrcTrnServiceRequests(
		BaseModel<?> oldModel) {
		QrcTrnServiceRequestsClp oldClpModel = (QrcTrnServiceRequestsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQrcTrnServiceRequestsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputState(BaseModel<?> oldModel) {
		StateClp oldClpModel = (StateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStateRemoteModel();

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
					"com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormImpl")) {
			return translateOutputApplyTrnApplicationForm(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsImpl")) {
			return translateOutputApplyTrnQuoteDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CityImpl")) {
			return translateOutputCity(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterImpl")) {
			return translateOutputConfig_Mst_GenericMaster(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRM_Trn_AddressImpl")) {
			return translateOutputCRM_Trn_Address(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRM_Trn_ContactImpl")) {
			return translateOutputCRM_Trn_Contact(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneImpl")) {
			return translateOutputCRM_Trn_Phone(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressImpl")) {
			return translateOutputCRM_Trn_PolicyAddress(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationImpl")) {
			return translateOutputCRMTrnContactCommunication(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberImpl")) {
			return translateOutputCRMTrnFamilyMember(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.LocMstBranchLocationImpl")) {
			return translateOutputLocMstBranchLocation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.LocMstLocationImpl")) {
			return translateOutputLocMstLocation(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.PrdMstProductImpl")) {
			return translateOutputPrdMstProduct(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcMstRequestsImpl")) {
			return translateOutputQrcMstRequests(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcMstServicesImpl")) {
			return translateOutputQrcMstServices(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcMstSubServicesImpl")) {
			return translateOutputQrcMstSubServices(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcTrnHistoryImpl")) {
			return translateOutputQrcTrnHistory(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcTrnOtpImpl")) {
			return translateOutputQrcTrnOtp(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsImpl")) {
			return translateOutputQrcTrnServiceRequests(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ifl.rapid.customer.model.impl.StateImpl")) {
			return translateOutputState(oldModel);
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
					"com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException")) {
			return new com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException")) {
			return new com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException();
		}

		if (className.equals("com.ifl.rapid.customer.NoSuchCityException")) {
			return new com.ifl.rapid.customer.NoSuchCityException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException")) {
			return new com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException")) {
			return new com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException")) {
			return new com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException")) {
			return new com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException")) {
			return new com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException")) {
			return new com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException")) {
			return new com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchLocMstBranchLocationException")) {
			return new com.ifl.rapid.customer.NoSuchLocMstBranchLocationException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchLocMstLocationException")) {
			return new com.ifl.rapid.customer.NoSuchLocMstLocationException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchPrdMstProductException")) {
			return new com.ifl.rapid.customer.NoSuchPrdMstProductException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchQrcMstRequestsException")) {
			return new com.ifl.rapid.customer.NoSuchQrcMstRequestsException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchQrcMstServicesException")) {
			return new com.ifl.rapid.customer.NoSuchQrcMstServicesException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchQrcMstSubServicesException")) {
			return new com.ifl.rapid.customer.NoSuchQrcMstSubServicesException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchQrcTrnHistoryException")) {
			return new com.ifl.rapid.customer.NoSuchQrcTrnHistoryException();
		}

		if (className.equals("com.ifl.rapid.customer.NoSuchQrcTrnOtpException")) {
			return new com.ifl.rapid.customer.NoSuchQrcTrnOtpException();
		}

		if (className.equals(
					"com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException")) {
			return new com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException();
		}

		if (className.equals("com.ifl.rapid.customer.NoSuchStateException")) {
			return new com.ifl.rapid.customer.NoSuchStateException();
		}

		return throwable;
	}

	public static Object translateOutputApplyTrnApplicationForm(
		BaseModel<?> oldModel) {
		ApplyTrnApplicationFormClp newModel = new ApplyTrnApplicationFormClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setApplyTrnApplicationFormRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputApplyTrnQuoteDetails(
		BaseModel<?> oldModel) {
		ApplyTrnQuoteDetailsClp newModel = new ApplyTrnQuoteDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setApplyTrnQuoteDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCity(BaseModel<?> oldModel) {
		CityClp newModel = new CityClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCityRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConfig_Mst_GenericMaster(
		BaseModel<?> oldModel) {
		Config_Mst_GenericMasterClp newModel = new Config_Mst_GenericMasterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConfig_Mst_GenericMasterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRM_Trn_Address(BaseModel<?> oldModel) {
		CRM_Trn_AddressClp newModel = new CRM_Trn_AddressClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRM_Trn_AddressRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRM_Trn_Contact(BaseModel<?> oldModel) {
		CRM_Trn_ContactClp newModel = new CRM_Trn_ContactClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRM_Trn_ContactRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRM_Trn_Phone(BaseModel<?> oldModel) {
		CRM_Trn_PhoneClp newModel = new CRM_Trn_PhoneClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRM_Trn_PhoneRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRM_Trn_PolicyAddress(
		BaseModel<?> oldModel) {
		CRM_Trn_PolicyAddressClp newModel = new CRM_Trn_PolicyAddressClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRM_Trn_PolicyAddressRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRMTrnContactCommunication(
		BaseModel<?> oldModel) {
		CRMTrnContactCommunicationClp newModel = new CRMTrnContactCommunicationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRMTrnContactCommunicationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCRMTrnFamilyMember(
		BaseModel<?> oldModel) {
		CRMTrnFamilyMemberClp newModel = new CRMTrnFamilyMemberClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCRMTrnFamilyMemberRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLocMstBranchLocation(
		BaseModel<?> oldModel) {
		LocMstBranchLocationClp newModel = new LocMstBranchLocationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLocMstBranchLocationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLocMstLocation(BaseModel<?> oldModel) {
		LocMstLocationClp newModel = new LocMstLocationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLocMstLocationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPrdMstProduct(BaseModel<?> oldModel) {
		PrdMstProductClp newModel = new PrdMstProductClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPrdMstProductRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcMstRequests(BaseModel<?> oldModel) {
		QrcMstRequestsClp newModel = new QrcMstRequestsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcMstRequestsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcMstServices(BaseModel<?> oldModel) {
		QrcMstServicesClp newModel = new QrcMstServicesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcMstServicesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcMstSubServices(BaseModel<?> oldModel) {
		QrcMstSubServicesClp newModel = new QrcMstSubServicesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcMstSubServicesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcTrnHistory(BaseModel<?> oldModel) {
		QrcTrnHistoryClp newModel = new QrcTrnHistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcTrnHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcTrnOtp(BaseModel<?> oldModel) {
		QrcTrnOtpClp newModel = new QrcTrnOtpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcTrnOtpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQrcTrnServiceRequests(
		BaseModel<?> oldModel) {
		QrcTrnServiceRequestsClp newModel = new QrcTrnServiceRequestsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQrcTrnServiceRequestsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputState(BaseModel<?> oldModel) {
		StateClp newModel = new StateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStateRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}