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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for ActiveServiceRequests. This utility wraps
 * {@link com.ifli.rapid.service.impl.ActiveServiceRequestsServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsService
 * @see com.ifli.rapid.service.base.ActiveServiceRequestsServiceBaseImpl
 * @see com.ifli.rapid.service.impl.ActiveServiceRequestsServiceImpl
 * @generated
 */
public class ActiveServiceRequestsServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifli.rapid.service.impl.ActiveServiceRequestsServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.Map<java.lang.String, java.lang.String> getFundSwitchDetails(
		java.lang.String srId) {
		return getService().getFundSwitchDetails(srId);
	}

	public static java.lang.String updateFundSwitchData(
		java.lang.String updateJson) {
		return getService().updateFundSwitchData(updateJson);
	}

	public static java.lang.String updateFS_PSDecision(
		java.lang.String updateJson) {
		return getService().updateFS_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getPRData(
		java.lang.String srId) {
		return getService().getPRData(srId);
	}

	public static java.lang.String updatePRData(java.lang.String updateJson) {
		return getService().updatePRData(updateJson);
	}

	public static java.lang.String updatePR_PSDecision(
		java.lang.String updateJson) {
		return getService().updatePR_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getTUData(
		java.lang.String srId) {
		return getService().getTUData(srId);
	}

	public static java.lang.String updateTUData(java.lang.String updateJson) {
		return getService().updateTUData(updateJson);
	}

	public static java.lang.String updateTU_PSDecision(
		java.lang.String updateJson) {
		return getService().updateTU_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getAUData(
		java.lang.String srId) {
		return getService().getAUData(srId);
	}

	public static java.lang.String updateAUData(java.lang.String updateJson) {
		return getService().updateAUData(updateJson);
	}

	public static java.lang.String updateAU_PSDecision(
		java.lang.String updateJson) {
		return getService().updateAU_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getNCData(
		java.lang.String srId) {
		return getService().getNCData(srId);
	}

	public static java.lang.String updateNCData(java.lang.String updateJson) {
		return getService().updateNCData(updateJson);
	}

	public static java.lang.String updateNC_PSDecision(
		java.lang.String updateJson) {
		return getService().updateNC_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getEPData(
		java.lang.String srId) {
		return getService().getEPData(srId);
	}

	public static java.lang.String updateEPData(java.lang.String updateJson) {
		return getService().updateEPData(updateJson);
	}

	public static java.lang.String updateEP_PSDecision(
		java.lang.String updateJson) {
		return getService().updateEP_PSDecision(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getDOBData(
		java.lang.String srId) {
		return getService().getDOBData(srId);
	}

	public static java.lang.String updateDOBCData(java.lang.String updateJson) {
		return getService().updateDOBCData(updateJson);
	}

	public static java.lang.String updateDOBCDecision(
		java.lang.String updateJson) {
		return getService().updateDOBCDecision(updateJson);
	}

	public static java.lang.String updateDOBCStatus(java.lang.String updateJson) {
		return getService().updateDOBCStatus(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getPRUSData(
		java.lang.String srId) {
		return getService().getPRUSData(srId);
	}

	public static java.lang.String updatePRUSStatus(java.lang.String updateJson) {
		return getService().updatePRUSStatus(updateJson);
	}

	public static java.util.Map<java.lang.String, java.lang.String> getRNData(
		java.lang.String srId) {
		return getService().getRNData(srId);
	}

	public static java.lang.String updateRNStatus(java.lang.String updateJson) {
		return getService().updateRNStatus(updateJson);
	}

	public static void clearService() {
		_service = null;
	}

	public static ActiveServiceRequestsService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ActiveServiceRequestsService.class.getName());

			if (invokableService instanceof ActiveServiceRequestsService) {
				_service = (ActiveServiceRequestsService)invokableService;
			}
			else {
				_service = new ActiveServiceRequestsServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ActiveServiceRequestsServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ActiveServiceRequestsService service) {
	}

	private static ActiveServiceRequestsService _service;
}