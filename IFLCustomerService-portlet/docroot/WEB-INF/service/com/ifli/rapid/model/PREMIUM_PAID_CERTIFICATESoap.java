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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATESoap implements Serializable {
	public static PREMIUM_PAID_CERTIFICATESoap toSoapModel(
		PREMIUM_PAID_CERTIFICATE model) {
		PREMIUM_PAID_CERTIFICATESoap soapModel = new PREMIUM_PAID_CERTIFICATESoap();

		soapModel.setID(model.getID());
		soapModel.setFinancial_Year(model.getFinancial_Year());
		soapModel.setGeneration_Date(model.getGeneration_Date());
		soapModel.setOwnerName(model.getOwnerName());
		soapModel.setAddrs1(model.getAddrs1());
		soapModel.setAddrs2(model.getAddrs2());
		soapModel.setAddrs3(model.getAddrs3());
		soapModel.setAddrs4(model.getAddrs4());
		soapModel.setAddrs5(model.getAddrs5());
		soapModel.setPostcode(model.getPostcode());
		soapModel.setMobilePhoneNo(model.getMobilePhoneNo());
		soapModel.setEmail_ID(model.getEmail_ID());
		soapModel.setClient_ID(model.getClient_ID());
		soapModel.setContract_Type_Desc(model.getContract_Type_Desc());
		soapModel.setContrNo(model.getContrNo());
		soapModel.setInstallment_Prem(model.getInstallment_Prem());
		soapModel.setBilling_Frequency(model.getBilling_Frequency());
		soapModel.setSumAssured(model.getSumAssured());
		soapModel.setTotal_Pre_Paid(model.getTotal_Pre_Paid());
		soapModel.setTotal_Pre_Due(model.getTotal_Pre_Due());
		soapModel.setCoverage(model.getCoverage());
		soapModel.setFin_Year(model.getFin_Year());
		soapModel.setLETTERCTL(model.getLETTERCTL());
		soapModel.setLOCPATH(model.getLOCPATH());
		soapModel.setDOCIDNUM(model.getDOCIDNUM());
		soapModel.setStatus(model.getStatus());
		soapModel.setLastProcessedDate(model.getLastProcessedDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setGLCODE(model.getGLCODE());
		soapModel.setBRANCH_CODE(model.getBRANCH_CODE());

		return soapModel;
	}

	public static PREMIUM_PAID_CERTIFICATESoap[] toSoapModels(
		PREMIUM_PAID_CERTIFICATE[] models) {
		PREMIUM_PAID_CERTIFICATESoap[] soapModels = new PREMIUM_PAID_CERTIFICATESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PREMIUM_PAID_CERTIFICATESoap[][] toSoapModels(
		PREMIUM_PAID_CERTIFICATE[][] models) {
		PREMIUM_PAID_CERTIFICATESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PREMIUM_PAID_CERTIFICATESoap[models.length][models[0].length];
		}
		else {
			soapModels = new PREMIUM_PAID_CERTIFICATESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PREMIUM_PAID_CERTIFICATESoap[] toSoapModels(
		List<PREMIUM_PAID_CERTIFICATE> models) {
		List<PREMIUM_PAID_CERTIFICATESoap> soapModels = new ArrayList<PREMIUM_PAID_CERTIFICATESoap>(models.size());

		for (PREMIUM_PAID_CERTIFICATE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PREMIUM_PAID_CERTIFICATESoap[soapModels.size()]);
	}

	public PREMIUM_PAID_CERTIFICATESoap() {
	}

	public long getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(long pk) {
		setID(pk);
	}

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public String getFinancial_Year() {
		return _Financial_Year;
	}

	public void setFinancial_Year(String Financial_Year) {
		_Financial_Year = Financial_Year;
	}

	public String getGeneration_Date() {
		return _Generation_Date;
	}

	public void setGeneration_Date(String Generation_Date) {
		_Generation_Date = Generation_Date;
	}

	public String getOwnerName() {
		return _OwnerName;
	}

	public void setOwnerName(String OwnerName) {
		_OwnerName = OwnerName;
	}

	public String getAddrs1() {
		return _Addrs1;
	}

	public void setAddrs1(String Addrs1) {
		_Addrs1 = Addrs1;
	}

	public String getAddrs2() {
		return _Addrs2;
	}

	public void setAddrs2(String Addrs2) {
		_Addrs2 = Addrs2;
	}

	public String getAddrs3() {
		return _Addrs3;
	}

	public void setAddrs3(String Addrs3) {
		_Addrs3 = Addrs3;
	}

	public String getAddrs4() {
		return _Addrs4;
	}

	public void setAddrs4(String Addrs4) {
		_Addrs4 = Addrs4;
	}

	public String getAddrs5() {
		return _Addrs5;
	}

	public void setAddrs5(String Addrs5) {
		_Addrs5 = Addrs5;
	}

	public String getPostcode() {
		return _Postcode;
	}

	public void setPostcode(String Postcode) {
		_Postcode = Postcode;
	}

	public String getMobilePhoneNo() {
		return _MobilePhoneNo;
	}

	public void setMobilePhoneNo(String MobilePhoneNo) {
		_MobilePhoneNo = MobilePhoneNo;
	}

	public String getEmail_ID() {
		return _Email_ID;
	}

	public void setEmail_ID(String Email_ID) {
		_Email_ID = Email_ID;
	}

	public String getClient_ID() {
		return _Client_ID;
	}

	public void setClient_ID(String Client_ID) {
		_Client_ID = Client_ID;
	}

	public String getContract_Type_Desc() {
		return _Contract_Type_Desc;
	}

	public void setContract_Type_Desc(String Contract_Type_Desc) {
		_Contract_Type_Desc = Contract_Type_Desc;
	}

	public String getContrNo() {
		return _ContrNo;
	}

	public void setContrNo(String ContrNo) {
		_ContrNo = ContrNo;
	}

	public String getInstallment_Prem() {
		return _Installment_Prem;
	}

	public void setInstallment_Prem(String Installment_Prem) {
		_Installment_Prem = Installment_Prem;
	}

	public String getBilling_Frequency() {
		return _Billing_Frequency;
	}

	public void setBilling_Frequency(String Billing_Frequency) {
		_Billing_Frequency = Billing_Frequency;
	}

	public String getSumAssured() {
		return _SumAssured;
	}

	public void setSumAssured(String SumAssured) {
		_SumAssured = SumAssured;
	}

	public String getTotal_Pre_Paid() {
		return _Total_Pre_Paid;
	}

	public void setTotal_Pre_Paid(String Total_Pre_Paid) {
		_Total_Pre_Paid = Total_Pre_Paid;
	}

	public String getTotal_Pre_Due() {
		return _Total_Pre_Due;
	}

	public void setTotal_Pre_Due(String Total_Pre_Due) {
		_Total_Pre_Due = Total_Pre_Due;
	}

	public String getCoverage() {
		return _Coverage;
	}

	public void setCoverage(String Coverage) {
		_Coverage = Coverage;
	}

	public int getFin_Year() {
		return _Fin_Year;
	}

	public void setFin_Year(int Fin_Year) {
		_Fin_Year = Fin_Year;
	}

	public String getLETTERCTL() {
		return _LETTERCTL;
	}

	public void setLETTERCTL(String LETTERCTL) {
		_LETTERCTL = LETTERCTL;
	}

	public String getLOCPATH() {
		return _LOCPATH;
	}

	public void setLOCPATH(String LOCPATH) {
		_LOCPATH = LOCPATH;
	}

	public String getDOCIDNUM() {
		return _DOCIDNUM;
	}

	public void setDOCIDNUM(String DOCIDNUM) {
		_DOCIDNUM = DOCIDNUM;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getLastProcessedDate() {
		return _lastProcessedDate;
	}

	public void setLastProcessedDate(String lastProcessedDate) {
		_lastProcessedDate = lastProcessedDate;
	}

	public String getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(String createDate) {
		_createDate = createDate;
	}

	public String getGLCODE() {
		return _GLCODE;
	}

	public void setGLCODE(String GLCODE) {
		_GLCODE = GLCODE;
	}

	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;
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
}