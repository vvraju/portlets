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
import com.ifli.rapid.service.TempCustomerAddressLocalServiceUtil;

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
public class TempCustomerAddressClp extends BaseModelImpl<TempCustomerAddress>
	implements TempCustomerAddress {
	public TempCustomerAddressClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempCustomerAddress.class;
	}

	@Override
	public String getModelClassName() {
		return TempCustomerAddress.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCUSTOMER_ADDRESS_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ADDRESS_ID", getCUSTOMER_ADDRESS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("ADDRESS_LINE_1", getADDRESS_LINE_1());
		attributes.put("ADDRESS_LINE_2", getADDRESS_LINE_2());
		attributes.put("ADDRESS_LINE_3", getADDRESS_LINE_3());
		attributes.put("CHANGE_REQUEST_TYPE", getCHANGE_REQUEST_TYPE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("PIN_CODE", getPIN_CODE());
		attributes.put("CHANGE_REQUEST_FOR", getCHANGE_REQUEST_FOR());
		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("ADDR_STATUS", getADDR_STATUS());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ADDRESS_ID = (Integer)attributes.get(
				"CUSTOMER_ADDRESS_ID");

		if (CUSTOMER_ADDRESS_ID != null) {
			setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String ADDRESS_LINE_1 = (String)attributes.get("ADDRESS_LINE_1");

		if (ADDRESS_LINE_1 != null) {
			setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		String ADDRESS_LINE_2 = (String)attributes.get("ADDRESS_LINE_2");

		if (ADDRESS_LINE_2 != null) {
			setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		String ADDRESS_LINE_3 = (String)attributes.get("ADDRESS_LINE_3");

		if (ADDRESS_LINE_3 != null) {
			setADDRESS_LINE_3(ADDRESS_LINE_3);
		}

		String CHANGE_REQUEST_TYPE = (String)attributes.get(
				"CHANGE_REQUEST_TYPE");

		if (CHANGE_REQUEST_TYPE != null) {
			setCHANGE_REQUEST_TYPE(CHANGE_REQUEST_TYPE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String PIN_CODE = (String)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}

		Integer CHANGE_REQUEST_FOR = (Integer)attributes.get(
				"CHANGE_REQUEST_FOR");

		if (CHANGE_REQUEST_FOR != null) {
			setCHANGE_REQUEST_FOR(CHANGE_REQUEST_FOR);
		}

		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		String ADDR_STATUS = (String)attributes.get("ADDR_STATUS");

		if (ADDR_STATUS != null) {
			setADDR_STATUS(ADDR_STATUS);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}
	}

	@Override
	public int getCUSTOMER_ADDRESS_ID() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_CUSTOMER_ADDRESS_ID = CUSTOMER_ADDRESS_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ADDRESS_ID",
						int.class);

				method.invoke(_tempCustomerAddressRemoteModel,
					CUSTOMER_ADDRESS_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_tempCustomerAddressRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_1() {
		return _ADDRESS_LINE_1;
	}

	@Override
	public void setADDRESS_LINE_1(String ADDRESS_LINE_1) {
		_ADDRESS_LINE_1 = ADDRESS_LINE_1;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_1",
						String.class);

				method.invoke(_tempCustomerAddressRemoteModel, ADDRESS_LINE_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_2() {
		return _ADDRESS_LINE_2;
	}

	@Override
	public void setADDRESS_LINE_2(String ADDRESS_LINE_2) {
		_ADDRESS_LINE_2 = ADDRESS_LINE_2;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_2",
						String.class);

				method.invoke(_tempCustomerAddressRemoteModel, ADDRESS_LINE_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_3() {
		return _ADDRESS_LINE_3;
	}

	@Override
	public void setADDRESS_LINE_3(String ADDRESS_LINE_3) {
		_ADDRESS_LINE_3 = ADDRESS_LINE_3;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_3",
						String.class);

				method.invoke(_tempCustomerAddressRemoteModel, ADDRESS_LINE_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCHANGE_REQUEST_TYPE() {
		return _CHANGE_REQUEST_TYPE;
	}

	@Override
	public void setCHANGE_REQUEST_TYPE(String CHANGE_REQUEST_TYPE) {
		_CHANGE_REQUEST_TYPE = CHANGE_REQUEST_TYPE;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCHANGE_REQUEST_TYPE",
						String.class);

				method.invoke(_tempCustomerAddressRemoteModel,
					CHANGE_REQUEST_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCITY() {
		return _CITY;
	}

	@Override
	public void setCITY(String CITY) {
		_CITY = CITY;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, CITY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATE() {
		return _STATE;
	}

	@Override
	public void setSTATE(String STATE) {
		_STATE = STATE;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCITY_ID() {
		return _CITY_ID;
	}

	@Override
	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_ID", int.class);

				method.invoke(_tempCustomerAddressRemoteModel, CITY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSTATE_ID() {
		return _STATE_ID;
	}

	@Override
	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_ID", int.class);

				method.invoke(_tempCustomerAddressRemoteModel, STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPIN_CODE() {
		return _PIN_CODE;
	}

	@Override
	public void setPIN_CODE(String PIN_CODE) {
		_PIN_CODE = PIN_CODE;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPIN_CODE", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, PIN_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCHANGE_REQUEST_FOR() {
		return _CHANGE_REQUEST_FOR;
	}

	@Override
	public void setCHANGE_REQUEST_FOR(int CHANGE_REQUEST_FOR) {
		_CHANGE_REQUEST_FOR = CHANGE_REQUEST_FOR;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCHANGE_REQUEST_FOR",
						int.class);

				method.invoke(_tempCustomerAddressRemoteModel,
					CHANGE_REQUEST_FOR);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_TYPE_ID", int.class);

				method.invoke(_tempCustomerAddressRemoteModel, ADDRESS_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDR_STATUS() {
		return _ADDR_STATUS;
	}

	@Override
	public void setADDR_STATUS(String ADDR_STATUS) {
		_ADDR_STATUS = ADDR_STATUS;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDR_STATUS", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, ADDR_STATUS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	@Override
	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, INSERTED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	@Override
	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_tempCustomerAddressRemoteModel, INSERTED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	@Override
	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_tempCustomerAddressRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	@Override
	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_tempCustomerAddressRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;

		if (_tempCustomerAddressRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_tempCustomerAddressRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempCustomerAddressRemoteModel() {
		return _tempCustomerAddressRemoteModel;
	}

	public void setTempCustomerAddressRemoteModel(
		BaseModel<?> tempCustomerAddressRemoteModel) {
		_tempCustomerAddressRemoteModel = tempCustomerAddressRemoteModel;
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

		Class<?> remoteModelClass = _tempCustomerAddressRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempCustomerAddressRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCustomerAddressLocalServiceUtil.addTempCustomerAddress(this);
		}
		else {
			TempCustomerAddressLocalServiceUtil.updateTempCustomerAddress(this);
		}
	}

	@Override
	public TempCustomerAddress toEscapedModel() {
		return (TempCustomerAddress)ProxyUtil.newProxyInstance(TempCustomerAddress.class.getClassLoader(),
			new Class[] { TempCustomerAddress.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCustomerAddressClp clone = new TempCustomerAddressClp();

		clone.setCUSTOMER_ADDRESS_ID(getCUSTOMER_ADDRESS_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setADDRESS_LINE_1(getADDRESS_LINE_1());
		clone.setADDRESS_LINE_2(getADDRESS_LINE_2());
		clone.setADDRESS_LINE_3(getADDRESS_LINE_3());
		clone.setCHANGE_REQUEST_TYPE(getCHANGE_REQUEST_TYPE());
		clone.setCITY(getCITY());
		clone.setSTATE(getSTATE());
		clone.setCITY_ID(getCITY_ID());
		clone.setSTATE_ID(getSTATE_ID());
		clone.setPIN_CODE(getPIN_CODE());
		clone.setCHANGE_REQUEST_FOR(getCHANGE_REQUEST_FOR());
		clone.setADDRESS_TYPE_ID(getADDRESS_TYPE_ID());
		clone.setADDR_STATUS(getADDR_STATUS());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());

		return clone;
	}

	@Override
	public int compareTo(TempCustomerAddress tempCustomerAddress) {
		int primaryKey = tempCustomerAddress.getPrimaryKey();

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

		if (!(obj instanceof TempCustomerAddressClp)) {
			return false;
		}

		TempCustomerAddressClp tempCustomerAddress = (TempCustomerAddressClp)obj;

		int primaryKey = tempCustomerAddress.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{CUSTOMER_ADDRESS_ID=");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", ADDRESS_LINE_1=");
		sb.append(getADDRESS_LINE_1());
		sb.append(", ADDRESS_LINE_2=");
		sb.append(getADDRESS_LINE_2());
		sb.append(", ADDRESS_LINE_3=");
		sb.append(getADDRESS_LINE_3());
		sb.append(", CHANGE_REQUEST_TYPE=");
		sb.append(getCHANGE_REQUEST_TYPE());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", CITY_ID=");
		sb.append(getCITY_ID());
		sb.append(", STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", PIN_CODE=");
		sb.append(getPIN_CODE());
		sb.append(", CHANGE_REQUEST_FOR=");
		sb.append(getCHANGE_REQUEST_FOR());
		sb.append(", ADDRESS_TYPE_ID=");
		sb.append(getADDRESS_TYPE_ID());
		sb.append(", ADDR_STATUS=");
		sb.append(getADDR_STATUS());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.TempCustomerAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CUSTOMER_ADDRESS_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_1</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_2</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_3</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHANGE_REQUEST_TYPE</column-name><column-value><![CDATA[");
		sb.append(getCHANGE_REQUEST_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY</column-name><column-value><![CDATA[");
		sb.append(getCITY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE</column-name><column-value><![CDATA[");
		sb.append(getSTATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY_ID</column-name><column-value><![CDATA[");
		sb.append(getCITY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PIN_CODE</column-name><column-value><![CDATA[");
		sb.append(getPIN_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHANGE_REQUEST_FOR</column-name><column-value><![CDATA[");
		sb.append(getCHANGE_REQUEST_FOR());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDR_STATUS</column-name><column-value><![CDATA[");
		sb.append(getADDR_STATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _CUSTOMER_ADDRESS_ID;
	private int _CUSTOMER_ID;
	private String _ADDRESS_LINE_1;
	private String _ADDRESS_LINE_2;
	private String _ADDRESS_LINE_3;
	private String _CHANGE_REQUEST_TYPE;
	private String _CITY;
	private String _STATE;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _PIN_CODE;
	private int _CHANGE_REQUEST_FOR;
	private int _ADDRESS_TYPE_ID;
	private String _ADDR_STATUS;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private int _QRC_ASR_ID;
	private BaseModel<?> _tempCustomerAddressRemoteModel;
}