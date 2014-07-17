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

import com.ifl.rapid.customer.service.ApplyTrnApplicationFormLocalServiceUtil;
import com.ifl.rapid.customer.service.ClpSerializer;

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
public class ApplyTrnApplicationFormClp extends BaseModelImpl<ApplyTrnApplicationForm>
	implements ApplyTrnApplicationForm {
	public ApplyTrnApplicationFormClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ApplyTrnApplicationForm.class;
	}

	@Override
	public String getModelClassName() {
		return ApplyTrnApplicationForm.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _ApplicationFormId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setApplicationFormId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ApplicationFormId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ApplicationFormId", getApplicationFormId());
		attributes.put("QuoteId", getQuoteId());
		attributes.put("ApplicationRefNo", getApplicationRefNo());
		attributes.put("SeqGenerator", getSeqGenerator());
		attributes.put("LTRFFormRefNo", getLTRFFormRefNo());
		attributes.put("PremiumAmount", getPremiumAmount());
		attributes.put("IsMedicalRequired", getIsMedicalRequired());
		attributes.put("ShortPremium", getShortPremium());
		attributes.put("PremiumDueDate", getPremiumDueDate());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("PolicyElapsedDate", getPolicyElapsedDate());
		attributes.put("PolicyIssueDate", getPolicyIssueDate());
		attributes.put("Status", getStatus());
		attributes.put("Completion", getCompletion());
		attributes.put("IsLapsed", getIsLapsed());
		attributes.put("NextPremiumDueDate", getNextPremiumDueDate());
		attributes.put("PolicyStatus", getPolicyStatus());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String ApplicationFormId = (String)attributes.get("ApplicationFormId");

		if (ApplicationFormId != null) {
			setApplicationFormId(ApplicationFormId);
		}

		String QuoteId = (String)attributes.get("QuoteId");

		if (QuoteId != null) {
			setQuoteId(QuoteId);
		}

		String ApplicationRefNo = (String)attributes.get("ApplicationRefNo");

		if (ApplicationRefNo != null) {
			setApplicationRefNo(ApplicationRefNo);
		}

		Integer SeqGenerator = (Integer)attributes.get("SeqGenerator");

		if (SeqGenerator != null) {
			setSeqGenerator(SeqGenerator);
		}

		String LTRFFormRefNo = (String)attributes.get("LTRFFormRefNo");

		if (LTRFFormRefNo != null) {
			setLTRFFormRefNo(LTRFFormRefNo);
		}

		Double PremiumAmount = (Double)attributes.get("PremiumAmount");

		if (PremiumAmount != null) {
			setPremiumAmount(PremiumAmount);
		}

		Integer IsMedicalRequired = (Integer)attributes.get("IsMedicalRequired");

		if (IsMedicalRequired != null) {
			setIsMedicalRequired(IsMedicalRequired);
		}

		Double ShortPremium = (Double)attributes.get("ShortPremium");

		if (ShortPremium != null) {
			setShortPremium(ShortPremium);
		}

		Date PremiumDueDate = (Date)attributes.get("PremiumDueDate");

		if (PremiumDueDate != null) {
			setPremiumDueDate(PremiumDueDate);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		Date PolicyElapsedDate = (Date)attributes.get("PolicyElapsedDate");

		if (PolicyElapsedDate != null) {
			setPolicyElapsedDate(PolicyElapsedDate);
		}

		Date PolicyIssueDate = (Date)attributes.get("PolicyIssueDate");

		if (PolicyIssueDate != null) {
			setPolicyIssueDate(PolicyIssueDate);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Integer Completion = (Integer)attributes.get("Completion");

		if (Completion != null) {
			setCompletion(Completion);
		}

		Integer IsLapsed = (Integer)attributes.get("IsLapsed");

		if (IsLapsed != null) {
			setIsLapsed(IsLapsed);
		}

		Date NextPremiumDueDate = (Date)attributes.get("NextPremiumDueDate");

		if (NextPremiumDueDate != null) {
			setNextPremiumDueDate(NextPremiumDueDate);
		}

		String PolicyStatus = (String)attributes.get("PolicyStatus");

		if (PolicyStatus != null) {
			setPolicyStatus(PolicyStatus);
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
	public String getApplicationFormId() {
		return _ApplicationFormId;
	}

	@Override
	public void setApplicationFormId(String ApplicationFormId) {
		_ApplicationFormId = ApplicationFormId;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationFormId",
						String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					ApplicationFormId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuoteId() {
		return _QuoteId;
	}

	@Override
	public void setQuoteId(String QuoteId) {
		_QuoteId = QuoteId;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setQuoteId", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, QuoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationRefNo() {
		return _ApplicationRefNo;
	}

	@Override
	public void setApplicationRefNo(String ApplicationRefNo) {
		_ApplicationRefNo = ApplicationRefNo;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationRefNo",
						String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					ApplicationRefNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSeqGenerator() {
		return _SeqGenerator;
	}

	@Override
	public void setSeqGenerator(int SeqGenerator) {
		_SeqGenerator = SeqGenerator;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setSeqGenerator", int.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, SeqGenerator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLTRFFormRefNo() {
		return _LTRFFormRefNo;
	}

	@Override
	public void setLTRFFormRefNo(String LTRFFormRefNo) {
		_LTRFFormRefNo = LTRFFormRefNo;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setLTRFFormRefNo", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, LTRFFormRefNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumAmount", double.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, PremiumAmount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsMedicalRequired() {
		return _IsMedicalRequired;
	}

	@Override
	public void setIsMedicalRequired(int IsMedicalRequired) {
		_IsMedicalRequired = IsMedicalRequired;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setIsMedicalRequired",
						int.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					IsMedicalRequired);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getShortPremium() {
		return _ShortPremium;
	}

	@Override
	public void setShortPremium(double ShortPremium) {
		_ShortPremium = ShortPremium;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setShortPremium", double.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, ShortPremium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPremiumDueDate() {
		return _PremiumDueDate;
	}

	@Override
	public void setPremiumDueDate(Date PremiumDueDate) {
		_PremiumDueDate = PremiumDueDate;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumDueDate", Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					PremiumDueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPolicyNo() {
		return _PolicyNo;
	}

	@Override
	public void setPolicyNo(String PolicyNo) {
		_PolicyNo = PolicyNo;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyNo", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, PolicyNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPolicyElapsedDate() {
		return _PolicyElapsedDate;
	}

	@Override
	public void setPolicyElapsedDate(Date PolicyElapsedDate) {
		_PolicyElapsedDate = PolicyElapsedDate;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyElapsedDate",
						Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					PolicyElapsedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPolicyIssueDate() {
		return _PolicyIssueDate;
	}

	@Override
	public void setPolicyIssueDate(Date PolicyIssueDate) {
		_PolicyIssueDate = PolicyIssueDate;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyIssueDate", Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					PolicyIssueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(String Status) {
		_Status = Status;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCompletion() {
		return _Completion;
	}

	@Override
	public void setCompletion(int Completion) {
		_Completion = Completion;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setCompletion", int.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, Completion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsLapsed() {
		return _IsLapsed;
	}

	@Override
	public void setIsLapsed(int IsLapsed) {
		_IsLapsed = IsLapsed;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLapsed", int.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, IsLapsed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNextPremiumDueDate() {
		return _NextPremiumDueDate;
	}

	@Override
	public void setNextPremiumDueDate(Date NextPremiumDueDate) {
		_NextPremiumDueDate = NextPremiumDueDate;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setNextPremiumDueDate",
						Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel,
					NextPremiumDueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPolicyStatus() {
		return _PolicyStatus;
	}

	@Override
	public void setPolicyStatus(String PolicyStatus) {
		_PolicyStatus = PolicyStatus;

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyStatus", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, PolicyStatus);
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

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, IsActive);
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

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, CreatedBy);
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

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, CreatedDate);
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

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, ModifiedDate);
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

		if (_applyTrnApplicationFormRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnApplicationFormRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_applyTrnApplicationFormRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApplyTrnApplicationFormRemoteModel() {
		return _applyTrnApplicationFormRemoteModel;
	}

	public void setApplyTrnApplicationFormRemoteModel(
		BaseModel<?> applyTrnApplicationFormRemoteModel) {
		_applyTrnApplicationFormRemoteModel = applyTrnApplicationFormRemoteModel;
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

		Class<?> remoteModelClass = _applyTrnApplicationFormRemoteModel.getClass();

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

		Object returnValue = method.invoke(_applyTrnApplicationFormRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplyTrnApplicationFormLocalServiceUtil.addApplyTrnApplicationForm(this);
		}
		else {
			ApplyTrnApplicationFormLocalServiceUtil.updateApplyTrnApplicationForm(this);
		}
	}

	@Override
	public ApplyTrnApplicationForm toEscapedModel() {
		return (ApplyTrnApplicationForm)ProxyUtil.newProxyInstance(ApplyTrnApplicationForm.class.getClassLoader(),
			new Class[] { ApplyTrnApplicationForm.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApplyTrnApplicationFormClp clone = new ApplyTrnApplicationFormClp();

		clone.setApplicationFormId(getApplicationFormId());
		clone.setQuoteId(getQuoteId());
		clone.setApplicationRefNo(getApplicationRefNo());
		clone.setSeqGenerator(getSeqGenerator());
		clone.setLTRFFormRefNo(getLTRFFormRefNo());
		clone.setPremiumAmount(getPremiumAmount());
		clone.setIsMedicalRequired(getIsMedicalRequired());
		clone.setShortPremium(getShortPremium());
		clone.setPremiumDueDate(getPremiumDueDate());
		clone.setPolicyNo(getPolicyNo());
		clone.setPolicyElapsedDate(getPolicyElapsedDate());
		clone.setPolicyIssueDate(getPolicyIssueDate());
		clone.setStatus(getStatus());
		clone.setCompletion(getCompletion());
		clone.setIsLapsed(getIsLapsed());
		clone.setNextPremiumDueDate(getNextPremiumDueDate());
		clone.setPolicyStatus(getPolicyStatus());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(ApplyTrnApplicationForm applyTrnApplicationForm) {
		String primaryKey = applyTrnApplicationForm.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyTrnApplicationFormClp)) {
			return false;
		}

		ApplyTrnApplicationFormClp applyTrnApplicationForm = (ApplyTrnApplicationFormClp)obj;

		String primaryKey = applyTrnApplicationForm.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{ApplicationFormId=");
		sb.append(getApplicationFormId());
		sb.append(", QuoteId=");
		sb.append(getQuoteId());
		sb.append(", ApplicationRefNo=");
		sb.append(getApplicationRefNo());
		sb.append(", SeqGenerator=");
		sb.append(getSeqGenerator());
		sb.append(", LTRFFormRefNo=");
		sb.append(getLTRFFormRefNo());
		sb.append(", PremiumAmount=");
		sb.append(getPremiumAmount());
		sb.append(", IsMedicalRequired=");
		sb.append(getIsMedicalRequired());
		sb.append(", ShortPremium=");
		sb.append(getShortPremium());
		sb.append(", PremiumDueDate=");
		sb.append(getPremiumDueDate());
		sb.append(", PolicyNo=");
		sb.append(getPolicyNo());
		sb.append(", PolicyElapsedDate=");
		sb.append(getPolicyElapsedDate());
		sb.append(", PolicyIssueDate=");
		sb.append(getPolicyIssueDate());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append(", Completion=");
		sb.append(getCompletion());
		sb.append(", IsLapsed=");
		sb.append(getIsLapsed());
		sb.append(", NextPremiumDueDate=");
		sb.append(getNextPremiumDueDate());
		sb.append(", PolicyStatus=");
		sb.append(getPolicyStatus());
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
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.ApplyTrnApplicationForm");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ApplicationFormId</column-name><column-value><![CDATA[");
		sb.append(getApplicationFormId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QuoteId</column-name><column-value><![CDATA[");
		sb.append(getQuoteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ApplicationRefNo</column-name><column-value><![CDATA[");
		sb.append(getApplicationRefNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SeqGenerator</column-name><column-value><![CDATA[");
		sb.append(getSeqGenerator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LTRFFormRefNo</column-name><column-value><![CDATA[");
		sb.append(getLTRFFormRefNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumAmount</column-name><column-value><![CDATA[");
		sb.append(getPremiumAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsMedicalRequired</column-name><column-value><![CDATA[");
		sb.append(getIsMedicalRequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ShortPremium</column-name><column-value><![CDATA[");
		sb.append(getShortPremium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumDueDate</column-name><column-value><![CDATA[");
		sb.append(getPremiumDueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyNo</column-name><column-value><![CDATA[");
		sb.append(getPolicyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyElapsedDate</column-name><column-value><![CDATA[");
		sb.append(getPolicyElapsedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyIssueDate</column-name><column-value><![CDATA[");
		sb.append(getPolicyIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Completion</column-name><column-value><![CDATA[");
		sb.append(getCompletion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsLapsed</column-name><column-value><![CDATA[");
		sb.append(getIsLapsed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NextPremiumDueDate</column-name><column-value><![CDATA[");
		sb.append(getNextPremiumDueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyStatus</column-name><column-value><![CDATA[");
		sb.append(getPolicyStatus());
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

	private String _ApplicationFormId;
	private String _QuoteId;
	private String _ApplicationRefNo;
	private int _SeqGenerator;
	private String _LTRFFormRefNo;
	private double _PremiumAmount;
	private int _IsMedicalRequired;
	private double _ShortPremium;
	private Date _PremiumDueDate;
	private String _PolicyNo;
	private Date _PolicyElapsedDate;
	private Date _PolicyIssueDate;
	private String _Status;
	private int _Completion;
	private int _IsLapsed;
	private Date _NextPremiumDueDate;
	private String _PolicyStatus;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private BaseModel<?> _applyTrnApplicationFormRemoteModel;
}