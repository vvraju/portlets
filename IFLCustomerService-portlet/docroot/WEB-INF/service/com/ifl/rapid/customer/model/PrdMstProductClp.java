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

package com.ifl.rapid.customer.model;

import com.ifl.rapid.customer.service.ClpSerializer;
import com.ifl.rapid.customer.service.PrdMstProductLocalServiceUtil;

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
public class PrdMstProductClp extends BaseModelImpl<PrdMstProduct>
	implements PrdMstProduct {
	public PrdMstProductClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PrdMstProduct.class;
	}

	@Override
	public String getModelClassName() {
		return PrdMstProduct.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _ProductId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setProductId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ProductId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ProductId", getProductId());
		attributes.put("ProductKey", getProductKey());
		attributes.put("DisplayOrder", getDisplayOrder());
		attributes.put("RenewalDuration", getRenewalDuration());
		attributes.put("ShortTermDuration", getShortTermDuration());
		attributes.put("MinPlanTerm", getMinPlanTerm());
		attributes.put("MaxPlanTerm", getMaxPlanTerm());
		attributes.put("MinSumAssured", getMinSumAssured());
		attributes.put("MaxSumAssured", getMaxSumAssured());
		attributes.put("IsRegularPremium", getIsRegularPremium());
		attributes.put("IsLimitedPremium", getIsLimitedPremium());
		attributes.put("IsSinglePremium", getIsSinglePremium());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String ProductId = (String)attributes.get("ProductId");

		if (ProductId != null) {
			setProductId(ProductId);
		}

		String ProductKey = (String)attributes.get("ProductKey");

		if (ProductKey != null) {
			setProductKey(ProductKey);
		}

		Integer DisplayOrder = (Integer)attributes.get("DisplayOrder");

		if (DisplayOrder != null) {
			setDisplayOrder(DisplayOrder);
		}

		Integer RenewalDuration = (Integer)attributes.get("RenewalDuration");

		if (RenewalDuration != null) {
			setRenewalDuration(RenewalDuration);
		}

		Integer ShortTermDuration = (Integer)attributes.get("ShortTermDuration");

		if (ShortTermDuration != null) {
			setShortTermDuration(ShortTermDuration);
		}

		Integer MinPlanTerm = (Integer)attributes.get("MinPlanTerm");

		if (MinPlanTerm != null) {
			setMinPlanTerm(MinPlanTerm);
		}

		Integer MaxPlanTerm = (Integer)attributes.get("MaxPlanTerm");

		if (MaxPlanTerm != null) {
			setMaxPlanTerm(MaxPlanTerm);
		}

		Integer MinSumAssured = (Integer)attributes.get("MinSumAssured");

		if (MinSumAssured != null) {
			setMinSumAssured(MinSumAssured);
		}

		Integer MaxSumAssured = (Integer)attributes.get("MaxSumAssured");

		if (MaxSumAssured != null) {
			setMaxSumAssured(MaxSumAssured);
		}

		Integer IsRegularPremium = (Integer)attributes.get("IsRegularPremium");

		if (IsRegularPremium != null) {
			setIsRegularPremium(IsRegularPremium);
		}

		Integer IsLimitedPremium = (Integer)attributes.get("IsLimitedPremium");

		if (IsLimitedPremium != null) {
			setIsLimitedPremium(IsLimitedPremium);
		}

		Integer IsSinglePremium = (Integer)attributes.get("IsSinglePremium");

		if (IsSinglePremium != null) {
			setIsSinglePremium(IsSinglePremium);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	@Override
	public String getProductId() {
		return _ProductId;
	}

	@Override
	public void setProductId(String ProductId) {
		_ProductId = ProductId;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", String.class);

				method.invoke(_prdMstProductRemoteModel, ProductId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductKey() {
		return _ProductKey;
	}

	@Override
	public void setProductKey(String ProductKey) {
		_ProductKey = ProductKey;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setProductKey", String.class);

				method.invoke(_prdMstProductRemoteModel, ProductKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDisplayOrder() {
		return _DisplayOrder;
	}

	@Override
	public void setDisplayOrder(int DisplayOrder) {
		_DisplayOrder = DisplayOrder;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setDisplayOrder", int.class);

				method.invoke(_prdMstProductRemoteModel, DisplayOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRenewalDuration() {
		return _RenewalDuration;
	}

	@Override
	public void setRenewalDuration(int RenewalDuration) {
		_RenewalDuration = RenewalDuration;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setRenewalDuration", int.class);

				method.invoke(_prdMstProductRemoteModel, RenewalDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShortTermDuration() {
		return _ShortTermDuration;
	}

	@Override
	public void setShortTermDuration(int ShortTermDuration) {
		_ShortTermDuration = ShortTermDuration;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setShortTermDuration",
						int.class);

				method.invoke(_prdMstProductRemoteModel, ShortTermDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMinPlanTerm() {
		return _MinPlanTerm;
	}

	@Override
	public void setMinPlanTerm(int MinPlanTerm) {
		_MinPlanTerm = MinPlanTerm;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setMinPlanTerm", int.class);

				method.invoke(_prdMstProductRemoteModel, MinPlanTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaxPlanTerm() {
		return _MaxPlanTerm;
	}

	@Override
	public void setMaxPlanTerm(int MaxPlanTerm) {
		_MaxPlanTerm = MaxPlanTerm;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setMaxPlanTerm", int.class);

				method.invoke(_prdMstProductRemoteModel, MaxPlanTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMinSumAssured() {
		return _MinSumAssured;
	}

	@Override
	public void setMinSumAssured(int MinSumAssured) {
		_MinSumAssured = MinSumAssured;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setMinSumAssured", int.class);

				method.invoke(_prdMstProductRemoteModel, MinSumAssured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMaxSumAssured() {
		return _MaxSumAssured;
	}

	@Override
	public void setMaxSumAssured(int MaxSumAssured) {
		_MaxSumAssured = MaxSumAssured;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setMaxSumAssured", int.class);

				method.invoke(_prdMstProductRemoteModel, MaxSumAssured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsRegularPremium() {
		return _IsRegularPremium;
	}

	@Override
	public void setIsRegularPremium(int IsRegularPremium) {
		_IsRegularPremium = IsRegularPremium;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setIsRegularPremium", int.class);

				method.invoke(_prdMstProductRemoteModel, IsRegularPremium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsLimitedPremium() {
		return _IsLimitedPremium;
	}

	@Override
	public void setIsLimitedPremium(int IsLimitedPremium) {
		_IsLimitedPremium = IsLimitedPremium;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLimitedPremium", int.class);

				method.invoke(_prdMstProductRemoteModel, IsLimitedPremium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsSinglePremium() {
		return _IsSinglePremium;
	}

	@Override
	public void setIsSinglePremium(int IsSinglePremium) {
		_IsSinglePremium = IsSinglePremium;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setIsSinglePremium", int.class);

				method.invoke(_prdMstProductRemoteModel, IsSinglePremium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
		_IsActive = IsActive;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_prdMstProductRemoteModel, IsActive);
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

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_prdMstProductRemoteModel, CreatedBy);
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

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_prdMstProductRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_prdMstProductRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_prdMstProductRemoteModel != null) {
			try {
				Class<?> clazz = _prdMstProductRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_prdMstProductRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPrdMstProductRemoteModel() {
		return _prdMstProductRemoteModel;
	}

	public void setPrdMstProductRemoteModel(
		BaseModel<?> prdMstProductRemoteModel) {
		_prdMstProductRemoteModel = prdMstProductRemoteModel;
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

		Class<?> remoteModelClass = _prdMstProductRemoteModel.getClass();

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

		Object returnValue = method.invoke(_prdMstProductRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PrdMstProductLocalServiceUtil.addPrdMstProduct(this);
		}
		else {
			PrdMstProductLocalServiceUtil.updatePrdMstProduct(this);
		}
	}

	@Override
	public PrdMstProduct toEscapedModel() {
		return (PrdMstProduct)ProxyUtil.newProxyInstance(PrdMstProduct.class.getClassLoader(),
			new Class[] { PrdMstProduct.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PrdMstProductClp clone = new PrdMstProductClp();

		clone.setProductId(getProductId());
		clone.setProductKey(getProductKey());
		clone.setDisplayOrder(getDisplayOrder());
		clone.setRenewalDuration(getRenewalDuration());
		clone.setShortTermDuration(getShortTermDuration());
		clone.setMinPlanTerm(getMinPlanTerm());
		clone.setMaxPlanTerm(getMaxPlanTerm());
		clone.setMinSumAssured(getMinSumAssured());
		clone.setMaxSumAssured(getMaxSumAssured());
		clone.setIsRegularPremium(getIsRegularPremium());
		clone.setIsLimitedPremium(getIsLimitedPremium());
		clone.setIsSinglePremium(getIsSinglePremium());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(PrdMstProduct prdMstProduct) {
		String primaryKey = prdMstProduct.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrdMstProductClp)) {
			return false;
		}

		PrdMstProductClp prdMstProduct = (PrdMstProductClp)obj;

		String primaryKey = prdMstProduct.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{ProductId=");
		sb.append(getProductId());
		sb.append(", ProductKey=");
		sb.append(getProductKey());
		sb.append(", DisplayOrder=");
		sb.append(getDisplayOrder());
		sb.append(", RenewalDuration=");
		sb.append(getRenewalDuration());
		sb.append(", ShortTermDuration=");
		sb.append(getShortTermDuration());
		sb.append(", MinPlanTerm=");
		sb.append(getMinPlanTerm());
		sb.append(", MaxPlanTerm=");
		sb.append(getMaxPlanTerm());
		sb.append(", MinSumAssured=");
		sb.append(getMinSumAssured());
		sb.append(", MaxSumAssured=");
		sb.append(getMaxSumAssured());
		sb.append(", IsRegularPremium=");
		sb.append(getIsRegularPremium());
		sb.append(", IsLimitedPremium=");
		sb.append(getIsLimitedPremium());
		sb.append(", IsSinglePremium=");
		sb.append(getIsSinglePremium());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.PrdMstProduct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ProductId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProductKey</column-name><column-value><![CDATA[");
		sb.append(getProductKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DisplayOrder</column-name><column-value><![CDATA[");
		sb.append(getDisplayOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RenewalDuration</column-name><column-value><![CDATA[");
		sb.append(getRenewalDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ShortTermDuration</column-name><column-value><![CDATA[");
		sb.append(getShortTermDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MinPlanTerm</column-name><column-value><![CDATA[");
		sb.append(getMinPlanTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaxPlanTerm</column-name><column-value><![CDATA[");
		sb.append(getMaxPlanTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MinSumAssured</column-name><column-value><![CDATA[");
		sb.append(getMinSumAssured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaxSumAssured</column-name><column-value><![CDATA[");
		sb.append(getMaxSumAssured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsRegularPremium</column-name><column-value><![CDATA[");
		sb.append(getIsRegularPremium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsLimitedPremium</column-name><column-value><![CDATA[");
		sb.append(getIsLimitedPremium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsSinglePremium</column-name><column-value><![CDATA[");
		sb.append(getIsSinglePremium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _ProductId;
	private String _ProductKey;
	private int _DisplayOrder;
	private int _RenewalDuration;
	private int _ShortTermDuration;
	private int _MinPlanTerm;
	private int _MaxPlanTerm;
	private int _MinSumAssured;
	private int _MaxSumAssured;
	private int _IsRegularPremium;
	private int _IsLimitedPremium;
	private int _IsSinglePremium;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private BaseModel<?> _prdMstProductRemoteModel;
}