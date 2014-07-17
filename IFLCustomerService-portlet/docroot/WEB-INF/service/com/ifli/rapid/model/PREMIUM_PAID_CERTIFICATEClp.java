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
import com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class PREMIUM_PAID_CERTIFICATEClp extends BaseModelImpl<PREMIUM_PAID_CERTIFICATE>
	implements PREMIUM_PAID_CERTIFICATE {
	public PREMIUM_PAID_CERTIFICATEClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PREMIUM_PAID_CERTIFICATE.class;
	}

	@Override
	public String getModelClassName() {
		return PREMIUM_PAID_CERTIFICATE.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("Financial_Year", getFinancial_Year());
		attributes.put("Generation_Date", getGeneration_Date());
		attributes.put("OwnerName", getOwnerName());
		attributes.put("Addrs1", getAddrs1());
		attributes.put("Addrs2", getAddrs2());
		attributes.put("Addrs3", getAddrs3());
		attributes.put("Addrs4", getAddrs4());
		attributes.put("Addrs5", getAddrs5());
		attributes.put("Postcode", getPostcode());
		attributes.put("MobilePhoneNo", getMobilePhoneNo());
		attributes.put("Email_ID", getEmail_ID());
		attributes.put("Client_ID", getClient_ID());
		attributes.put("Contract_Type_Desc", getContract_Type_Desc());
		attributes.put("ContrNo", getContrNo());
		attributes.put("Installment_Prem", getInstallment_Prem());
		attributes.put("Billing_Frequency", getBilling_Frequency());
		attributes.put("SumAssured", getSumAssured());
		attributes.put("Total_Pre_Paid", getTotal_Pre_Paid());
		attributes.put("Total_Pre_Due", getTotal_Pre_Due());
		attributes.put("Coverage", getCoverage());
		attributes.put("Fin_Year", getFin_Year());
		attributes.put("LETTERCTL", getLETTERCTL());
		attributes.put("LOCPATH", getLOCPATH());
		attributes.put("DOCIDNUM", getDOCIDNUM());
		attributes.put("status", getStatus());
		attributes.put("lastProcessedDate", getLastProcessedDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("GLCODE", getGLCODE());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ID = (Long)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String Financial_Year = (String)attributes.get("Financial_Year");

		if (Financial_Year != null) {
			setFinancial_Year(Financial_Year);
		}

		String Generation_Date = (String)attributes.get("Generation_Date");

		if (Generation_Date != null) {
			setGeneration_Date(Generation_Date);
		}

		String OwnerName = (String)attributes.get("OwnerName");

		if (OwnerName != null) {
			setOwnerName(OwnerName);
		}

		String Addrs1 = (String)attributes.get("Addrs1");

		if (Addrs1 != null) {
			setAddrs1(Addrs1);
		}

		String Addrs2 = (String)attributes.get("Addrs2");

		if (Addrs2 != null) {
			setAddrs2(Addrs2);
		}

		String Addrs3 = (String)attributes.get("Addrs3");

		if (Addrs3 != null) {
			setAddrs3(Addrs3);
		}

		String Addrs4 = (String)attributes.get("Addrs4");

		if (Addrs4 != null) {
			setAddrs4(Addrs4);
		}

		String Addrs5 = (String)attributes.get("Addrs5");

		if (Addrs5 != null) {
			setAddrs5(Addrs5);
		}

		String Postcode = (String)attributes.get("Postcode");

		if (Postcode != null) {
			setPostcode(Postcode);
		}

		String MobilePhoneNo = (String)attributes.get("MobilePhoneNo");

		if (MobilePhoneNo != null) {
			setMobilePhoneNo(MobilePhoneNo);
		}

		String Email_ID = (String)attributes.get("Email_ID");

		if (Email_ID != null) {
			setEmail_ID(Email_ID);
		}

		String Client_ID = (String)attributes.get("Client_ID");

		if (Client_ID != null) {
			setClient_ID(Client_ID);
		}

		String Contract_Type_Desc = (String)attributes.get("Contract_Type_Desc");

		if (Contract_Type_Desc != null) {
			setContract_Type_Desc(Contract_Type_Desc);
		}

		String ContrNo = (String)attributes.get("ContrNo");

		if (ContrNo != null) {
			setContrNo(ContrNo);
		}

		String Installment_Prem = (String)attributes.get("Installment_Prem");

		if (Installment_Prem != null) {
			setInstallment_Prem(Installment_Prem);
		}

		String Billing_Frequency = (String)attributes.get("Billing_Frequency");

		if (Billing_Frequency != null) {
			setBilling_Frequency(Billing_Frequency);
		}

		String SumAssured = (String)attributes.get("SumAssured");

		if (SumAssured != null) {
			setSumAssured(SumAssured);
		}

		String Total_Pre_Paid = (String)attributes.get("Total_Pre_Paid");

		if (Total_Pre_Paid != null) {
			setTotal_Pre_Paid(Total_Pre_Paid);
		}

		String Total_Pre_Due = (String)attributes.get("Total_Pre_Due");

		if (Total_Pre_Due != null) {
			setTotal_Pre_Due(Total_Pre_Due);
		}

		String Coverage = (String)attributes.get("Coverage");

		if (Coverage != null) {
			setCoverage(Coverage);
		}

		Integer Fin_Year = (Integer)attributes.get("Fin_Year");

		if (Fin_Year != null) {
			setFin_Year(Fin_Year);
		}

		String LETTERCTL = (String)attributes.get("LETTERCTL");

		if (LETTERCTL != null) {
			setLETTERCTL(LETTERCTL);
		}

		String LOCPATH = (String)attributes.get("LOCPATH");

		if (LOCPATH != null) {
			setLOCPATH(LOCPATH);
		}

		String DOCIDNUM = (String)attributes.get("DOCIDNUM");

		if (DOCIDNUM != null) {
			setDOCIDNUM(DOCIDNUM);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String lastProcessedDate = (String)attributes.get("lastProcessedDate");

		if (lastProcessedDate != null) {
			setLastProcessedDate(lastProcessedDate);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String GLCODE = (String)attributes.get("GLCODE");

		if (GLCODE != null) {
			setGLCODE(GLCODE);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}
	}

	@Override
	public long getID() {
		return _ID;
	}

	@Override
	public void setID(long ID) {
		_ID = ID;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setID", long.class);

				method.invoke(_premium_paid_certificateRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFinancial_Year() {
		return _Financial_Year;
	}

	@Override
	public void setFinancial_Year(String Financial_Year) {
		_Financial_Year = Financial_Year;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFinancial_Year",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Financial_Year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGeneration_Date() {
		return _Generation_Date;
	}

	@Override
	public void setGeneration_Date(String Generation_Date) {
		_Generation_Date = Generation_Date;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setGeneration_Date",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Generation_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOwnerName() {
		return _OwnerName;
	}

	@Override
	public void setOwnerName(String OwnerName) {
		_OwnerName = OwnerName;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerName", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, OwnerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs1() {
		return _Addrs1;
	}

	@Override
	public void setAddrs1(String Addrs1) {
		_Addrs1 = Addrs1;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs1", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Addrs1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs2() {
		return _Addrs2;
	}

	@Override
	public void setAddrs2(String Addrs2) {
		_Addrs2 = Addrs2;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs2", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Addrs2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs3() {
		return _Addrs3;
	}

	@Override
	public void setAddrs3(String Addrs3) {
		_Addrs3 = Addrs3;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs3", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Addrs3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs4() {
		return _Addrs4;
	}

	@Override
	public void setAddrs4(String Addrs4) {
		_Addrs4 = Addrs4;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs4", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Addrs4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs5() {
		return _Addrs5;
	}

	@Override
	public void setAddrs5(String Addrs5) {
		_Addrs5 = Addrs5;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs5", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Addrs5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPostcode() {
		return _Postcode;
	}

	@Override
	public void setPostcode(String Postcode) {
		_Postcode = Postcode;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setPostcode", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Postcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMobilePhoneNo() {
		return _MobilePhoneNo;
	}

	@Override
	public void setMobilePhoneNo(String MobilePhoneNo) {
		_MobilePhoneNo = MobilePhoneNo;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMobilePhoneNo", String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					MobilePhoneNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail_ID() {
		return _Email_ID;
	}

	@Override
	public void setEmail_ID(String Email_ID) {
		_Email_ID = Email_ID;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail_ID", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Email_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getClient_ID() {
		return _Client_ID;
	}

	@Override
	public void setClient_ID(String Client_ID) {
		_Client_ID = Client_ID;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setClient_ID", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Client_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContract_Type_Desc() {
		return _Contract_Type_Desc;
	}

	@Override
	public void setContract_Type_Desc(String Contract_Type_Desc) {
		_Contract_Type_Desc = Contract_Type_Desc;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setContract_Type_Desc",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Contract_Type_Desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContrNo() {
		return _ContrNo;
	}

	@Override
	public void setContrNo(String ContrNo) {
		_ContrNo = ContrNo;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setContrNo", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, ContrNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInstallment_Prem() {
		return _Installment_Prem;
	}

	@Override
	public void setInstallment_Prem(String Installment_Prem) {
		_Installment_Prem = Installment_Prem;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInstallment_Prem",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Installment_Prem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBilling_Frequency() {
		return _Billing_Frequency;
	}

	@Override
	public void setBilling_Frequency(String Billing_Frequency) {
		_Billing_Frequency = Billing_Frequency;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setBilling_Frequency",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Billing_Frequency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSumAssured() {
		return _SumAssured;
	}

	@Override
	public void setSumAssured(String SumAssured) {
		_SumAssured = SumAssured;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSumAssured", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, SumAssured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTotal_Pre_Paid() {
		return _Total_Pre_Paid;
	}

	@Override
	public void setTotal_Pre_Paid(String Total_Pre_Paid) {
		_Total_Pre_Paid = Total_Pre_Paid;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setTotal_Pre_Paid",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Total_Pre_Paid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTotal_Pre_Due() {
		return _Total_Pre_Due;
	}

	@Override
	public void setTotal_Pre_Due(String Total_Pre_Due) {
		_Total_Pre_Due = Total_Pre_Due;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setTotal_Pre_Due", String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					Total_Pre_Due);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoverage() {
		return _Coverage;
	}

	@Override
	public void setCoverage(String Coverage) {
		_Coverage = Coverage;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCoverage", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, Coverage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFin_Year() {
		return _Fin_Year;
	}

	@Override
	public void setFin_Year(int Fin_Year) {
		_Fin_Year = Fin_Year;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFin_Year", int.class);

				method.invoke(_premium_paid_certificateRemoteModel, Fin_Year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLETTERCTL() {
		return _LETTERCTL;
	}

	@Override
	public void setLETTERCTL(String LETTERCTL) {
		_LETTERCTL = LETTERCTL;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setLETTERCTL", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, LETTERCTL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLOCPATH() {
		return _LOCPATH;
	}

	@Override
	public void setLOCPATH(String LOCPATH) {
		_LOCPATH = LOCPATH;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCPATH", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, LOCPATH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDOCIDNUM() {
		return _DOCIDNUM;
	}

	@Override
	public void setDOCIDNUM(String DOCIDNUM) {
		_DOCIDNUM = DOCIDNUM;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDOCIDNUM", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, DOCIDNUM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastProcessedDate() {
		return _lastProcessedDate;
	}

	@Override
	public void setLastProcessedDate(String lastProcessedDate) {
		_lastProcessedDate = lastProcessedDate;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setLastProcessedDate",
						String.class);

				method.invoke(_premium_paid_certificateRemoteModel,
					lastProcessedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(String createDate) {
		_createDate = createDate;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGLCODE() {
		return _GLCODE;
	}

	@Override
	public void setGLCODE(String GLCODE) {
		_GLCODE = GLCODE;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setGLCODE", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, GLCODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	@Override
	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;

		if (_premium_paid_certificateRemoteModel != null) {
			try {
				Class<?> clazz = _premium_paid_certificateRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_CODE", String.class);

				method.invoke(_premium_paid_certificateRemoteModel, BRANCH_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPREMIUM_PAID_CERTIFICATERemoteModel() {
		return _premium_paid_certificateRemoteModel;
	}

	public void setPREMIUM_PAID_CERTIFICATERemoteModel(
		BaseModel<?> premium_paid_certificateRemoteModel) {
		_premium_paid_certificateRemoteModel = premium_paid_certificateRemoteModel;
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

		Class<?> remoteModelClass = _premium_paid_certificateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_premium_paid_certificateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PREMIUM_PAID_CERTIFICATELocalServiceUtil.addPREMIUM_PAID_CERTIFICATE(this);
		}
		else {
			PREMIUM_PAID_CERTIFICATELocalServiceUtil.updatePREMIUM_PAID_CERTIFICATE(this);
		}
	}

	@Override
	public PREMIUM_PAID_CERTIFICATE toEscapedModel() {
		return (PREMIUM_PAID_CERTIFICATE)ProxyUtil.newProxyInstance(PREMIUM_PAID_CERTIFICATE.class.getClassLoader(),
			new Class[] { PREMIUM_PAID_CERTIFICATE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PREMIUM_PAID_CERTIFICATEClp clone = new PREMIUM_PAID_CERTIFICATEClp();

		clone.setID(getID());
		clone.setFinancial_Year(getFinancial_Year());
		clone.setGeneration_Date(getGeneration_Date());
		clone.setOwnerName(getOwnerName());
		clone.setAddrs1(getAddrs1());
		clone.setAddrs2(getAddrs2());
		clone.setAddrs3(getAddrs3());
		clone.setAddrs4(getAddrs4());
		clone.setAddrs5(getAddrs5());
		clone.setPostcode(getPostcode());
		clone.setMobilePhoneNo(getMobilePhoneNo());
		clone.setEmail_ID(getEmail_ID());
		clone.setClient_ID(getClient_ID());
		clone.setContract_Type_Desc(getContract_Type_Desc());
		clone.setContrNo(getContrNo());
		clone.setInstallment_Prem(getInstallment_Prem());
		clone.setBilling_Frequency(getBilling_Frequency());
		clone.setSumAssured(getSumAssured());
		clone.setTotal_Pre_Paid(getTotal_Pre_Paid());
		clone.setTotal_Pre_Due(getTotal_Pre_Due());
		clone.setCoverage(getCoverage());
		clone.setFin_Year(getFin_Year());
		clone.setLETTERCTL(getLETTERCTL());
		clone.setLOCPATH(getLOCPATH());
		clone.setDOCIDNUM(getDOCIDNUM());
		clone.setStatus(getStatus());
		clone.setLastProcessedDate(getLastProcessedDate());
		clone.setCreateDate(getCreateDate());
		clone.setGLCODE(getGLCODE());
		clone.setBRANCH_CODE(getBRANCH_CODE());

		return clone;
	}

	@Override
	public int compareTo(PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		long primaryKey = premium_paid_certificate.getPrimaryKey();

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

		if (!(obj instanceof PREMIUM_PAID_CERTIFICATEClp)) {
			return false;
		}

		PREMIUM_PAID_CERTIFICATEClp premium_paid_certificate = (PREMIUM_PAID_CERTIFICATEClp)obj;

		long primaryKey = premium_paid_certificate.getPrimaryKey();

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
		StringBundler sb = new StringBundler(61);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", Financial_Year=");
		sb.append(getFinancial_Year());
		sb.append(", Generation_Date=");
		sb.append(getGeneration_Date());
		sb.append(", OwnerName=");
		sb.append(getOwnerName());
		sb.append(", Addrs1=");
		sb.append(getAddrs1());
		sb.append(", Addrs2=");
		sb.append(getAddrs2());
		sb.append(", Addrs3=");
		sb.append(getAddrs3());
		sb.append(", Addrs4=");
		sb.append(getAddrs4());
		sb.append(", Addrs5=");
		sb.append(getAddrs5());
		sb.append(", Postcode=");
		sb.append(getPostcode());
		sb.append(", MobilePhoneNo=");
		sb.append(getMobilePhoneNo());
		sb.append(", Email_ID=");
		sb.append(getEmail_ID());
		sb.append(", Client_ID=");
		sb.append(getClient_ID());
		sb.append(", Contract_Type_Desc=");
		sb.append(getContract_Type_Desc());
		sb.append(", ContrNo=");
		sb.append(getContrNo());
		sb.append(", Installment_Prem=");
		sb.append(getInstallment_Prem());
		sb.append(", Billing_Frequency=");
		sb.append(getBilling_Frequency());
		sb.append(", SumAssured=");
		sb.append(getSumAssured());
		sb.append(", Total_Pre_Paid=");
		sb.append(getTotal_Pre_Paid());
		sb.append(", Total_Pre_Due=");
		sb.append(getTotal_Pre_Due());
		sb.append(", Coverage=");
		sb.append(getCoverage());
		sb.append(", Fin_Year=");
		sb.append(getFin_Year());
		sb.append(", LETTERCTL=");
		sb.append(getLETTERCTL());
		sb.append(", LOCPATH=");
		sb.append(getLOCPATH());
		sb.append(", DOCIDNUM=");
		sb.append(getDOCIDNUM());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", lastProcessedDate=");
		sb.append(getLastProcessedDate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", GLCODE=");
		sb.append(getGLCODE());
		sb.append(", BRANCH_CODE=");
		sb.append(getBRANCH_CODE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(94);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Financial_Year</column-name><column-value><![CDATA[");
		sb.append(getFinancial_Year());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Generation_Date</column-name><column-value><![CDATA[");
		sb.append(getGeneration_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OwnerName</column-name><column-value><![CDATA[");
		sb.append(getOwnerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs1</column-name><column-value><![CDATA[");
		sb.append(getAddrs1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs2</column-name><column-value><![CDATA[");
		sb.append(getAddrs2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs3</column-name><column-value><![CDATA[");
		sb.append(getAddrs3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs4</column-name><column-value><![CDATA[");
		sb.append(getAddrs4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs5</column-name><column-value><![CDATA[");
		sb.append(getAddrs5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Postcode</column-name><column-value><![CDATA[");
		sb.append(getPostcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MobilePhoneNo</column-name><column-value><![CDATA[");
		sb.append(getMobilePhoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Email_ID</column-name><column-value><![CDATA[");
		sb.append(getEmail_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Client_ID</column-name><column-value><![CDATA[");
		sb.append(getClient_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Contract_Type_Desc</column-name><column-value><![CDATA[");
		sb.append(getContract_Type_Desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContrNo</column-name><column-value><![CDATA[");
		sb.append(getContrNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Installment_Prem</column-name><column-value><![CDATA[");
		sb.append(getInstallment_Prem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Billing_Frequency</column-name><column-value><![CDATA[");
		sb.append(getBilling_Frequency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SumAssured</column-name><column-value><![CDATA[");
		sb.append(getSumAssured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Total_Pre_Paid</column-name><column-value><![CDATA[");
		sb.append(getTotal_Pre_Paid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Total_Pre_Due</column-name><column-value><![CDATA[");
		sb.append(getTotal_Pre_Due());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Coverage</column-name><column-value><![CDATA[");
		sb.append(getCoverage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Fin_Year</column-name><column-value><![CDATA[");
		sb.append(getFin_Year());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LETTERCTL</column-name><column-value><![CDATA[");
		sb.append(getLETTERCTL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCPATH</column-name><column-value><![CDATA[");
		sb.append(getLOCPATH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOCIDNUM</column-name><column-value><![CDATA[");
		sb.append(getDOCIDNUM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastProcessedDate</column-name><column-value><![CDATA[");
		sb.append(getLastProcessedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GLCODE</column-name><column-value><![CDATA[");
		sb.append(getGLCODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CODE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CODE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ID;
	private String _Financial_Year;
	private String _Generation_Date;
	private String _OwnerName;
	private String _Addrs1;
	private String _Addrs2;
	private String _Addrs3;
	private String _Addrs4;
	private String _Addrs5;
	private String _Postcode;
	private String _MobilePhoneNo;
	private String _Email_ID;
	private String _Client_ID;
	private String _Contract_Type_Desc;
	private String _ContrNo;
	private String _Installment_Prem;
	private String _Billing_Frequency;
	private String _SumAssured;
	private String _Total_Pre_Paid;
	private String _Total_Pre_Due;
	private String _Coverage;
	private int _Fin_Year;
	private String _LETTERCTL;
	private String _LOCPATH;
	private String _DOCIDNUM;
	private String _status;
	private String _lastProcessedDate;
	private String _createDate;
	private String _GLCODE;
	private String _BRANCH_CODE;
	private BaseModel<?> _premium_paid_certificateRemoteModel;
}