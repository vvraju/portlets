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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Config_Mst_GenericMaster. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.Config_Mst_GenericMasterServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterService
 * @see com.ifl.rapid.customer.service.base.Config_Mst_GenericMasterServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.Config_Mst_GenericMasterServiceImpl
 * @generated
 */
public class Config_Mst_GenericMasterServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.Config_Mst_GenericMasterServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ifli.rapid.model.FamilyRelations> getAllFamilyRelations() {
		return getService().getAllFamilyRelations();
	}

	public static void clearService() {
		_service = null;
	}

	public static Config_Mst_GenericMasterService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					Config_Mst_GenericMasterService.class.getName());

			if (invokableService instanceof Config_Mst_GenericMasterService) {
				_service = (Config_Mst_GenericMasterService)invokableService;
			}
			else {
				_service = new Config_Mst_GenericMasterServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(Config_Mst_GenericMasterServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(Config_Mst_GenericMasterService service) {
	}

	private static Config_Mst_GenericMasterService _service;
}