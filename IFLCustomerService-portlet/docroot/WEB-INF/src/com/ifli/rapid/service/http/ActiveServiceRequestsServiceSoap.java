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

package com.ifli.rapid.service.http;

import com.ifli.rapid.service.ActiveServiceRequestsServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ifli.rapid.service.ActiveServiceRequestsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ifli.rapid.model.ActiveServiceRequestsSoap}.
 * If the method in the service utility returns a
 * {@link com.ifli.rapid.model.ActiveServiceRequests}, that is translated to a
 * {@link com.ifli.rapid.model.ActiveServiceRequestsSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsServiceHttp
 * @see com.ifli.rapid.model.ActiveServiceRequestsSoap
 * @see com.ifli.rapid.service.ActiveServiceRequestsServiceUtil
 * @generated
 */
public class ActiveServiceRequestsServiceSoap {
	public static java.lang.String updateFundSwitchData(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateFundSwitchData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateFS_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateFS_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updatePRData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updatePRData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updatePR_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updatePR_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateTUData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateTUData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateTU_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateTU_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateAUData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateAUData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateAU_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateAU_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateNCData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateNCData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateNC_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateNC_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateEPData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateEPData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateEP_PSDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateEP_PSDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateDOBCData(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateDOBCData(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateDOBCDecision(
		java.lang.String updateJson) throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateDOBCDecision(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateDOBCStatus(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateDOBCStatus(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updatePRUSStatus(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updatePRUSStatus(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String updateRNStatus(java.lang.String updateJson)
		throws RemoteException {
		try {
			java.lang.String returnValue = ActiveServiceRequestsServiceUtil.updateRNStatus(updateJson);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ActiveServiceRequestsServiceSoap.class);
}