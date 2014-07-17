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

package com.ifli.rapid.model;

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.NavHistoryLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class NavHistoryClp extends BaseModelImpl<NavHistory>
	implements NavHistory {
	public NavHistoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NavHistory.class;
	}

	@Override
	public String getModelClassName() {
		return NavHistory.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _NAV_HISTORY_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNAV_HISTORY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _NAV_HISTORY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NAV_HISTORY_ID", getNAV_HISTORY_ID());
		attributes.put("DATE", getDATE());
		attributes.put("NAV", getNAV());
		attributes.put("SALE_PRICE", getSALE_PRICE());
		attributes.put("PURCHASE_PRICE", getPURCHASE_PRICE());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("FUND_NAME", getFUND_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NAV_HISTORY_ID = (Long)attributes.get("NAV_HISTORY_ID");

		if (NAV_HISTORY_ID != null) {
			setNAV_HISTORY_ID(NAV_HISTORY_ID);
		}

		Date DATE = (Date)attributes.get("DATE");

		if (DATE != null) {
			setDATE(DATE);
		}

		Double NAV = (Double)attributes.get("NAV");

		if (NAV != null) {
			setNAV(NAV);
		}

		Double SALE_PRICE = (Double)attributes.get("SALE_PRICE");

		if (SALE_PRICE != null) {
			setSALE_PRICE(SALE_PRICE);
		}

		Double PURCHASE_PRICE = (Double)attributes.get("PURCHASE_PRICE");

		if (PURCHASE_PRICE != null) {
			setPURCHASE_PRICE(PURCHASE_PRICE);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		String FUND_NAME = (String)attributes.get("FUND_NAME");

		if (FUND_NAME != null) {
			setFUND_NAME(FUND_NAME);
		}
	}

	@Override
	public long getNAV_HISTORY_ID() {
		return _NAV_HISTORY_ID;
	}

	@Override
	public void setNAV_HISTORY_ID(long NAV_HISTORY_ID) {
		_NAV_HISTORY_ID = NAV_HISTORY_ID;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setNAV_HISTORY_ID", long.class);

				method.invoke(_navHistoryRemoteModel, NAV_HISTORY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDATE() {
		return _DATE;
	}

	@Override
	public void setDATE(Date DATE) {
		_DATE = DATE;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setDATE", Date.class);

				method.invoke(_navHistoryRemoteModel, DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getNAV() {
		return _NAV;
	}

	@Override
	public void setNAV(double NAV) {
		_NAV = NAV;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setNAV", double.class);

				method.invoke(_navHistoryRemoteModel, NAV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSALE_PRICE() {
		return _SALE_PRICE;
	}

	@Override
	public void setSALE_PRICE(double SALE_PRICE) {
		_SALE_PRICE = SALE_PRICE;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setSALE_PRICE", double.class);

				method.invoke(_navHistoryRemoteModel, SALE_PRICE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPURCHASE_PRICE() {
		return _PURCHASE_PRICE;
	}

	@Override
	public void setPURCHASE_PRICE(double PURCHASE_PRICE) {
		_PURCHASE_PRICE = PURCHASE_PRICE;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPURCHASE_PRICE",
						double.class);

				method.invoke(_navHistoryRemoteModel, PURCHASE_PRICE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	@Override
	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_CODE", String.class);

				method.invoke(_navHistoryRemoteModel, FUND_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_NAME() {
		return _FUND_NAME;
	}

	@Override
	public void setFUND_NAME(String FUND_NAME) {
		_FUND_NAME = FUND_NAME;

		if (_navHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _navHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_NAME", String.class);

				method.invoke(_navHistoryRemoteModel, FUND_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNavHistoryRemoteModel() {
		return _navHistoryRemoteModel;
	}

	public void setNavHistoryRemoteModel(BaseModel<?> navHistoryRemoteModel) {
		_navHistoryRemoteModel = navHistoryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _navHistoryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_navHistoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NavHistoryLocalServiceUtil.addNavHistory(this);
		}
		else {
			NavHistoryLocalServiceUtil.updateNavHistory(this);
		}
	}

	@Override
	public NavHistory toEscapedModel() {
		return (NavHistory)ProxyUtil.newProxyInstance(NavHistory.class.getClassLoader(),
			new Class[] { NavHistory.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NavHistoryClp clone = new NavHistoryClp();

		clone.setNAV_HISTORY_ID(getNAV_HISTORY_ID());
		clone.setDATE(getDATE());
		clone.setNAV(getNAV());
		clone.setSALE_PRICE(getSALE_PRICE());
		clone.setPURCHASE_PRICE(getPURCHASE_PRICE());
		clone.setFUND_CODE(getFUND_CODE());
		clone.setFUND_NAME(getFUND_NAME());

		return clone;
	}

	@Override
	public int compareTo(NavHistory navHistory) {
		long primaryKey = navHistory.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NavHistoryClp)) {
			return false;
		}

		NavHistoryClp navHistory = (NavHistoryClp)obj;

		long primaryKey = navHistory.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{NAV_HISTORY_ID=");
		sb.append(getNAV_HISTORY_ID());
		sb.append(", DATE=");
		sb.append(getDATE());
		sb.append(", NAV=");
		sb.append(getNAV());
		sb.append(", SALE_PRICE=");
		sb.append(getSALE_PRICE());
		sb.append(", PURCHASE_PRICE=");
		sb.append(getPURCHASE_PRICE());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append(", FUND_NAME=");
		sb.append(getFUND_NAME());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.NavHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>NAV_HISTORY_ID</column-name><column-value><![CDATA[");
		sb.append(getNAV_HISTORY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATE</column-name><column-value><![CDATA[");
		sb.append(getDATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NAV</column-name><column-value><![CDATA[");
		sb.append(getNAV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SALE_PRICE</column-name><column-value><![CDATA[");
		sb.append(getSALE_PRICE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PURCHASE_PRICE</column-name><column-value><![CDATA[");
		sb.append(getPURCHASE_PRICE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_NAME</column-name><column-value><![CDATA[");
		sb.append(getFUND_NAME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _NAV_HISTORY_ID;
	private Date _DATE;
	private double _NAV;
	private double _SALE_PRICE;
	private double _PURCHASE_PRICE;
	private String _FUND_CODE;
	private String _FUND_NAME;
	private BaseModel<?> _navHistoryRemoteModel;
}