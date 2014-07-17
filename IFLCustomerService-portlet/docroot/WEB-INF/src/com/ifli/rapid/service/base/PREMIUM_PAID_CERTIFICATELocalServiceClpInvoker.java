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

import com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil;

import java.util.Arrays;

/**
 * @author Satya Kola
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATELocalServiceClpInvoker {
	public PREMIUM_PAID_CERTIFICATELocalServiceClpInvoker() {
		_methodName0 = "addPREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes0 = new String[] {
				"com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE"
			};

		_methodName1 = "createPREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletePREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes3 = new String[] {
				"com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchPREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getPREMIUM_PAID_CERTIFICATEs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getPREMIUM_PAID_CERTIFICATEsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updatePREMIUM_PAID_CERTIFICATE";

		_methodParameterTypes15 = new String[] {
				"com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE"
			};

		_methodName242 = "getBeanIdentifier";

		_methodParameterTypes242 = new String[] {  };

		_methodName243 = "setBeanIdentifier";

		_methodParameterTypes243 = new String[] { "java.lang.String" };

		_methodName248 = "findByPolicyAndYear";

		_methodParameterTypes248 = new String[] {
				"java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.addPREMIUM_PAID_CERTIFICATE((com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.createPREMIUM_PAID_CERTIFICATE(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.deletePREMIUM_PAID_CERTIFICATE(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.deletePREMIUM_PAID_CERTIFICATE((com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.fetchPREMIUM_PAID_CERTIFICATE(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.getPREMIUM_PAID_CERTIFICATE(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.getPREMIUM_PAID_CERTIFICATEs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.getPREMIUM_PAID_CERTIFICATEsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.updatePREMIUM_PAID_CERTIFICATE((com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE)arguments[0]);
		}

		if (_methodName242.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes242, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName243.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes243, parameterTypes)) {
			PREMIUM_PAID_CERTIFICATELocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName248.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes248, parameterTypes)) {
			return PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName242;
	private String[] _methodParameterTypes242;
	private String _methodName243;
	private String[] _methodParameterTypes243;
	private String _methodName248;
	private String[] _methodParameterTypes248;
}