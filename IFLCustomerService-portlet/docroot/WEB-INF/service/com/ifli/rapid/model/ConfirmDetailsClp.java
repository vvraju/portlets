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
import com.ifli.rapid.service.ConfirmDetailsLocalServiceUtil;

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
public class ConfirmDetailsClp extends BaseModelImpl<ConfirmDetails>
	implements ConfirmDetails {
	public ConfirmDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ConfirmDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ConfirmDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("Approval_Status", getApproval_Status());
		attributes.put("Comments", getComments());
		attributes.put("Sign_Flag", getSign_Flag());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String Approval_Status = (String)attributes.get("Approval_Status");

		if (Approval_Status != null) {
			setApproval_Status(Approval_Status);
		}

		String Comments = (String)attributes.get("Comments");

		if (Comments != null) {
			setComments(Comments);
		}

		String Sign_Flag = (String)attributes.get("Sign_Flag");

		if (Sign_Flag != null) {
			setSign_Flag(Sign_Flag);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_confirmDetailsRemoteModel, ID);
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

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_confirmDetailsRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproval_Status() {
		return _Approval_Status;
	}

	@Override
	public void setApproval_Status(String Approval_Status) {
		_Approval_Status = Approval_Status;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setApproval_Status",
						String.class);

				method.invoke(_confirmDetailsRemoteModel, Approval_Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _Comments;
	}

	@Override
	public void setComments(String Comments) {
		_Comments = Comments;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_confirmDetailsRemoteModel, Comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSign_Flag() {
		return _Sign_Flag;
	}

	@Override
	public void setSign_Flag(String Sign_Flag) {
		_Sign_Flag = Sign_Flag;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSign_Flag", String.class);

				method.invoke(_confirmDetailsRemoteModel, Sign_Flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_confirmDetailsRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_confirmDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _confirmDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_confirmDetailsRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConfirmDetailsRemoteModel() {
		return _confirmDetailsRemoteModel;
	}

	public void setConfirmDetailsRemoteModel(
		BaseModel<?> confirmDetailsRemoteModel) {
		_confirmDetailsRemoteModel = confirmDetailsRemoteModel;
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

		Class<?> remoteModelClass = _confirmDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_confirmDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConfirmDetailsLocalServiceUtil.addConfirmDetails(this);
		}
		else {
			ConfirmDetailsLocalServiceUtil.updateConfirmDetails(this);
		}
	}

	@Override
	public ConfirmDetails toEscapedModel() {
		return (ConfirmDetails)ProxyUtil.newProxyInstance(ConfirmDetails.class.getClassLoader(),
			new Class[] { ConfirmDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConfirmDetailsClp clone = new ConfirmDetailsClp();

		clone.setID(getID());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());
		clone.setApproval_Status(getApproval_Status());
		clone.setComments(getComments());
		clone.setSign_Flag(getSign_Flag());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());

		return clone;
	}

	@Override
	public int compareTo(ConfirmDetails confirmDetails) {
		int primaryKey = confirmDetails.getPrimaryKey();

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

		if (!(obj instanceof ConfirmDetailsClp)) {
			return false;
		}

		ConfirmDetailsClp confirmDetails = (ConfirmDetailsClp)obj;

		int primaryKey = confirmDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", Approval_Status=");
		sb.append(getApproval_Status());
		sb.append(", Comments=");
		sb.append(getComments());
		sb.append(", Sign_Flag=");
		sb.append(getSign_Flag());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ConfirmDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Approval_Status</column-name><column-value><![CDATA[");
		sb.append(getApproval_Status());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Sign_Flag</column-name><column-value><![CDATA[");
		sb.append(getSign_Flag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ID;
	private int _QRC_ASR_ID;
	private String _Approval_Status;
	private String _Comments;
	private String _Sign_Flag;
	private String _CreatedBy;
	private Date _CreatedDate;
	private BaseModel<?> _confirmDetailsRemoteModel;
}