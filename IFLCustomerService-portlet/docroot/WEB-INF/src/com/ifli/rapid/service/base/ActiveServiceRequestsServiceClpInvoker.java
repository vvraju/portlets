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

package com.ifli.rapid.service.base;

import com.ifli.rapid.service.ActiveServiceRequestsServiceUtil;

import java.util.Arrays;

/**
 * @author Satya Kola
 * @generated
 */
public class ActiveServiceRequestsServiceClpInvoker {
	public ActiveServiceRequestsServiceClpInvoker() {
		_methodName226 = "getBeanIdentifier";

		_methodParameterTypes226 = new String[] {  };

		_methodName227 = "setBeanIdentifier";

		_methodParameterTypes227 = new String[] { "java.lang.String" };

		_methodName232 = "getFundSwitchDetails";

		_methodParameterTypes232 = new String[] { "java.lang.String" };

		_methodName233 = "updateFundSwitchData";

		_methodParameterTypes233 = new String[] { "java.lang.String" };

		_methodName234 = "updateFS_PSDecision";

		_methodParameterTypes234 = new String[] { "java.lang.String" };

		_methodName235 = "getPRData";

		_methodParameterTypes235 = new String[] { "java.lang.String" };

		_methodName236 = "updatePRData";

		_methodParameterTypes236 = new String[] { "java.lang.String" };

		_methodName237 = "updatePR_PSDecision";

		_methodParameterTypes237 = new String[] { "java.lang.String" };

		_methodName238 = "getTUData";

		_methodParameterTypes238 = new String[] { "java.lang.String" };

		_methodName239 = "updateTUData";

		_methodParameterTypes239 = new String[] { "java.lang.String" };

		_methodName240 = "updateTU_PSDecision";

		_methodParameterTypes240 = new String[] { "java.lang.String" };

		_methodName241 = "getAUData";

		_methodParameterTypes241 = new String[] { "java.lang.String" };

		_methodName242 = "updateAUData";

		_methodParameterTypes242 = new String[] { "java.lang.String" };

		_methodName243 = "updateAU_PSDecision";

		_methodParameterTypes243 = new String[] { "java.lang.String" };

		_methodName244 = "getNCData";

		_methodParameterTypes244 = new String[] { "java.lang.String" };

		_methodName245 = "updateNCData";

		_methodParameterTypes245 = new String[] { "java.lang.String" };

		_methodName246 = "updateNC_PSDecision";

		_methodParameterTypes246 = new String[] { "java.lang.String" };

		_methodName247 = "getEPData";

		_methodParameterTypes247 = new String[] { "java.lang.String" };

		_methodName248 = "updateEPData";

		_methodParameterTypes248 = new String[] { "java.lang.String" };

		_methodName249 = "updateEP_PSDecision";

		_methodParameterTypes249 = new String[] { "java.lang.String" };

		_methodName250 = "getDOBData";

		_methodParameterTypes250 = new String[] { "java.lang.String" };

		_methodName251 = "updateDOBCData";

		_methodParameterTypes251 = new String[] { "java.lang.String" };

		_methodName252 = "updateDOBCDecision";

		_methodParameterTypes252 = new String[] { "java.lang.String" };

		_methodName253 = "updateDOBCStatus";

		_methodParameterTypes253 = new String[] { "java.lang.String" };

		_methodName254 = "getPRUSData";

		_methodParameterTypes254 = new String[] { "java.lang.String" };

		_methodName255 = "updatePRUSStatus";

		_methodParameterTypes255 = new String[] { "java.lang.String" };

		_methodName256 = "getRNData";

		_methodParameterTypes256 = new String[] { "java.lang.String" };

		_methodName257 = "updateRNStatus";

		_methodParameterTypes257 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName226.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes226, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getBeanIdentifier();
		}

		if (_methodName227.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes227, parameterTypes)) {
			ActiveServiceRequestsServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName232.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes232, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getFundSwitchDetails((java.lang.String)arguments[0]);
		}

		if (_methodName233.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes233, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateFundSwitchData((java.lang.String)arguments[0]);
		}

		if (_methodName234.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes234, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateFS_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName235.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes235, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getPRData((java.lang.String)arguments[0]);
		}

		if (_methodName236.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes236, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updatePRData((java.lang.String)arguments[0]);
		}

		if (_methodName237.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes237, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updatePR_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName238.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes238, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getTUData((java.lang.String)arguments[0]);
		}

		if (_methodName239.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes239, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateTUData((java.lang.String)arguments[0]);
		}

		if (_methodName240.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes240, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateTU_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName241.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes241, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getAUData((java.lang.String)arguments[0]);
		}

		if (_methodName242.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes242, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateAUData((java.lang.String)arguments[0]);
		}

		if (_methodName243.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes243, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateAU_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName244.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes244, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getNCData((java.lang.String)arguments[0]);
		}

		if (_methodName245.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes245, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateNCData((java.lang.String)arguments[0]);
		}

		if (_methodName246.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes246, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateNC_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName247.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes247, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getEPData((java.lang.String)arguments[0]);
		}

		if (_methodName248.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes248, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateEPData((java.lang.String)arguments[0]);
		}

		if (_methodName249.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes249, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateEP_PSDecision((java.lang.String)arguments[0]);
		}

		if (_methodName250.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes250, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getDOBData((java.lang.String)arguments[0]);
		}

		if (_methodName251.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes251, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateDOBCData((java.lang.String)arguments[0]);
		}

		if (_methodName252.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes252, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateDOBCDecision((java.lang.String)arguments[0]);
		}

		if (_methodName253.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes253, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateDOBCStatus((java.lang.String)arguments[0]);
		}

		if (_methodName254.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes254, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getPRUSData((java.lang.String)arguments[0]);
		}

		if (_methodName255.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes255, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updatePRUSStatus((java.lang.String)arguments[0]);
		}

		if (_methodName256.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes256, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.getRNData((java.lang.String)arguments[0]);
		}

		if (_methodName257.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes257, parameterTypes)) {
			return ActiveServiceRequestsServiceUtil.updateRNStatus((java.lang.String)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName226;
	private String[] _methodParameterTypes226;
	private String _methodName227;
	private String[] _methodParameterTypes227;
	private String _methodName232;
	private String[] _methodParameterTypes232;
	private String _methodName233;
	private String[] _methodParameterTypes233;
	private String _methodName234;
	private String[] _methodParameterTypes234;
	private String _methodName235;
	private String[] _methodParameterTypes235;
	private String _methodName236;
	private String[] _methodParameterTypes236;
	private String _methodName237;
	private String[] _methodParameterTypes237;
	private String _methodName238;
	private String[] _methodParameterTypes238;
	private String _methodName239;
	private String[] _methodParameterTypes239;
	private String _methodName240;
	private String[] _methodParameterTypes240;
	private String _methodName241;
	private String[] _methodParameterTypes241;
	private String _methodName242;
	private String[] _methodParameterTypes242;
	private String _methodName243;
	private String[] _methodParameterTypes243;
	private String _methodName244;
	private String[] _methodParameterTypes244;
	private String _methodName245;
	private String[] _methodParameterTypes245;
	private String _methodName246;
	private String[] _methodParameterTypes246;
	private String _methodName247;
	private String[] _methodParameterTypes247;
	private String _methodName248;
	private String[] _methodParameterTypes248;
	private String _methodName249;
	private String[] _methodParameterTypes249;
	private String _methodName250;
	private String[] _methodParameterTypes250;
	private String _methodName251;
	private String[] _methodParameterTypes251;
	private String _methodName252;
	private String[] _methodParameterTypes252;
	private String _methodName253;
	private String[] _methodParameterTypes253;
	private String _methodName254;
	private String[] _methodParameterTypes254;
	private String _methodName255;
	private String[] _methodParameterTypes255;
	private String _methodName256;
	private String[] _methodParameterTypes256;
	private String _methodName257;
	private String[] _methodParameterTypes257;
}