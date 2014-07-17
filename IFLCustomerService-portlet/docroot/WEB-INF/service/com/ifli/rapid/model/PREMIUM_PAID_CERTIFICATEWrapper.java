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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PREMIUM_PAID_CERTIFICATE}.
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATE
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATEWrapper implements PREMIUM_PAID_CERTIFICATE,
	ModelWrapper<PREMIUM_PAID_CERTIFICATE> {
	public PREMIUM_PAID_CERTIFICATEWrapper(
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		_premium_paid_certificate = premium_paid_certificate;
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

	/**
	* Returns the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public long getPrimaryKey() {
		return _premium_paid_certificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param primaryKey the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_premium_paid_certificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public long getID() {
		return _premium_paid_certificate.getID();
	}

	/**
	* Sets the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param ID the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setID(long ID) {
		_premium_paid_certificate.setID(ID);
	}

	/**
	* Returns the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getFinancial_Year() {
		return _premium_paid_certificate.getFinancial_Year();
	}

	/**
	* Sets the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Financial_Year the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setFinancial_Year(java.lang.String Financial_Year) {
		_premium_paid_certificate.setFinancial_Year(Financial_Year);
	}

	/**
	* Returns the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getGeneration_Date() {
		return _premium_paid_certificate.getGeneration_Date();
	}

	/**
	* Sets the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Generation_Date the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setGeneration_Date(java.lang.String Generation_Date) {
		_premium_paid_certificate.setGeneration_Date(Generation_Date);
	}

	/**
	* Returns the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getOwnerName() {
		return _premium_paid_certificate.getOwnerName();
	}

	/**
	* Sets the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param OwnerName the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setOwnerName(java.lang.String OwnerName) {
		_premium_paid_certificate.setOwnerName(OwnerName);
	}

	/**
	* Returns the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getAddrs1() {
		return _premium_paid_certificate.getAddrs1();
	}

	/**
	* Sets the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Addrs1 the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setAddrs1(java.lang.String Addrs1) {
		_premium_paid_certificate.setAddrs1(Addrs1);
	}

	/**
	* Returns the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getAddrs2() {
		return _premium_paid_certificate.getAddrs2();
	}

	/**
	* Sets the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Addrs2 the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setAddrs2(java.lang.String Addrs2) {
		_premium_paid_certificate.setAddrs2(Addrs2);
	}

	/**
	* Returns the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getAddrs3() {
		return _premium_paid_certificate.getAddrs3();
	}

	/**
	* Sets the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Addrs3 the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setAddrs3(java.lang.String Addrs3) {
		_premium_paid_certificate.setAddrs3(Addrs3);
	}

	/**
	* Returns the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getAddrs4() {
		return _premium_paid_certificate.getAddrs4();
	}

	/**
	* Sets the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Addrs4 the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setAddrs4(java.lang.String Addrs4) {
		_premium_paid_certificate.setAddrs4(Addrs4);
	}

	/**
	* Returns the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getAddrs5() {
		return _premium_paid_certificate.getAddrs5();
	}

	/**
	* Sets the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Addrs5 the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setAddrs5(java.lang.String Addrs5) {
		_premium_paid_certificate.setAddrs5(Addrs5);
	}

	/**
	* Returns the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getPostcode() {
		return _premium_paid_certificate.getPostcode();
	}

	/**
	* Sets the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Postcode the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setPostcode(java.lang.String Postcode) {
		_premium_paid_certificate.setPostcode(Postcode);
	}

	/**
	* Returns the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getMobilePhoneNo() {
		return _premium_paid_certificate.getMobilePhoneNo();
	}

	/**
	* Sets the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param MobilePhoneNo the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setMobilePhoneNo(java.lang.String MobilePhoneNo) {
		_premium_paid_certificate.setMobilePhoneNo(MobilePhoneNo);
	}

	/**
	* Returns the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getEmail_ID() {
		return _premium_paid_certificate.getEmail_ID();
	}

	/**
	* Sets the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Email_ID the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setEmail_ID(java.lang.String Email_ID) {
		_premium_paid_certificate.setEmail_ID(Email_ID);
	}

	/**
	* Returns the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getClient_ID() {
		return _premium_paid_certificate.getClient_ID();
	}

	/**
	* Sets the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Client_ID the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setClient_ID(java.lang.String Client_ID) {
		_premium_paid_certificate.setClient_ID(Client_ID);
	}

	/**
	* Returns the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getContract_Type_Desc() {
		return _premium_paid_certificate.getContract_Type_Desc();
	}

	/**
	* Sets the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Contract_Type_Desc the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setContract_Type_Desc(java.lang.String Contract_Type_Desc) {
		_premium_paid_certificate.setContract_Type_Desc(Contract_Type_Desc);
	}

	/**
	* Returns the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getContrNo() {
		return _premium_paid_certificate.getContrNo();
	}

	/**
	* Sets the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param ContrNo the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setContrNo(java.lang.String ContrNo) {
		_premium_paid_certificate.setContrNo(ContrNo);
	}

	/**
	* Returns the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getInstallment_Prem() {
		return _premium_paid_certificate.getInstallment_Prem();
	}

	/**
	* Sets the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Installment_Prem the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setInstallment_Prem(java.lang.String Installment_Prem) {
		_premium_paid_certificate.setInstallment_Prem(Installment_Prem);
	}

	/**
	* Returns the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getBilling_Frequency() {
		return _premium_paid_certificate.getBilling_Frequency();
	}

	/**
	* Sets the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Billing_Frequency the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setBilling_Frequency(java.lang.String Billing_Frequency) {
		_premium_paid_certificate.setBilling_Frequency(Billing_Frequency);
	}

	/**
	* Returns the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getSumAssured() {
		return _premium_paid_certificate.getSumAssured();
	}

	/**
	* Sets the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param SumAssured the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setSumAssured(java.lang.String SumAssured) {
		_premium_paid_certificate.setSumAssured(SumAssured);
	}

	/**
	* Returns the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getTotal_Pre_Paid() {
		return _premium_paid_certificate.getTotal_Pre_Paid();
	}

	/**
	* Sets the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Total_Pre_Paid the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setTotal_Pre_Paid(java.lang.String Total_Pre_Paid) {
		_premium_paid_certificate.setTotal_Pre_Paid(Total_Pre_Paid);
	}

	/**
	* Returns the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getTotal_Pre_Due() {
		return _premium_paid_certificate.getTotal_Pre_Due();
	}

	/**
	* Sets the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Total_Pre_Due the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setTotal_Pre_Due(java.lang.String Total_Pre_Due) {
		_premium_paid_certificate.setTotal_Pre_Due(Total_Pre_Due);
	}

	/**
	* Returns the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getCoverage() {
		return _premium_paid_certificate.getCoverage();
	}

	/**
	* Sets the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Coverage the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setCoverage(java.lang.String Coverage) {
		_premium_paid_certificate.setCoverage(Coverage);
	}

	/**
	* Returns the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public int getFin_Year() {
		return _premium_paid_certificate.getFin_Year();
	}

	/**
	* Sets the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param Fin_Year the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setFin_Year(int Fin_Year) {
		_premium_paid_certificate.setFin_Year(Fin_Year);
	}

	/**
	* Returns the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getLETTERCTL() {
		return _premium_paid_certificate.getLETTERCTL();
	}

	/**
	* Sets the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param LETTERCTL the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setLETTERCTL(java.lang.String LETTERCTL) {
		_premium_paid_certificate.setLETTERCTL(LETTERCTL);
	}

	/**
	* Returns the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getLOCPATH() {
		return _premium_paid_certificate.getLOCPATH();
	}

	/**
	* Sets the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param LOCPATH the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setLOCPATH(java.lang.String LOCPATH) {
		_premium_paid_certificate.setLOCPATH(LOCPATH);
	}

	/**
	* Returns the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getDOCIDNUM() {
		return _premium_paid_certificate.getDOCIDNUM();
	}

	/**
	* Sets the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param DOCIDNUM the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setDOCIDNUM(java.lang.String DOCIDNUM) {
		_premium_paid_certificate.setDOCIDNUM(DOCIDNUM);
	}

	/**
	* Returns the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getStatus() {
		return _premium_paid_certificate.getStatus();
	}

	/**
	* Sets the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param status the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_premium_paid_certificate.setStatus(status);
	}

	/**
	* Returns the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getLastProcessedDate() {
		return _premium_paid_certificate.getLastProcessedDate();
	}

	/**
	* Sets the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param lastProcessedDate the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setLastProcessedDate(java.lang.String lastProcessedDate) {
		_premium_paid_certificate.setLastProcessedDate(lastProcessedDate);
	}

	/**
	* Returns the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getCreateDate() {
		return _premium_paid_certificate.getCreateDate();
	}

	/**
	* Sets the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param createDate the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setCreateDate(java.lang.String createDate) {
		_premium_paid_certificate.setCreateDate(createDate);
	}

	/**
	* Returns the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getGLCODE() {
		return _premium_paid_certificate.getGLCODE();
	}

	/**
	* Sets the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param GLCODE the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setGLCODE(java.lang.String GLCODE) {
		_premium_paid_certificate.setGLCODE(GLCODE);
	}

	/**
	* Returns the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @return the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public java.lang.String getBRANCH_CODE() {
		return _premium_paid_certificate.getBRANCH_CODE();
	}

	/**
	* Sets the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	*
	* @param BRANCH_CODE the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	@Override
	public void setBRANCH_CODE(java.lang.String BRANCH_CODE) {
		_premium_paid_certificate.setBRANCH_CODE(BRANCH_CODE);
	}

	@Override
	public boolean isNew() {
		return _premium_paid_certificate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_premium_paid_certificate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _premium_paid_certificate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_premium_paid_certificate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _premium_paid_certificate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _premium_paid_certificate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_premium_paid_certificate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _premium_paid_certificate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_premium_paid_certificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_premium_paid_certificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_premium_paid_certificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PREMIUM_PAID_CERTIFICATEWrapper((PREMIUM_PAID_CERTIFICATE)_premium_paid_certificate.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		return _premium_paid_certificate.compareTo(premium_paid_certificate);
	}

	@Override
	public int hashCode() {
		return _premium_paid_certificate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> toCacheModel() {
		return _premium_paid_certificate.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE toEscapedModel() {
		return new PREMIUM_PAID_CERTIFICATEWrapper(_premium_paid_certificate.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE toUnescapedModel() {
		return new PREMIUM_PAID_CERTIFICATEWrapper(_premium_paid_certificate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _premium_paid_certificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _premium_paid_certificate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_premium_paid_certificate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PREMIUM_PAID_CERTIFICATEWrapper)) {
			return false;
		}

		PREMIUM_PAID_CERTIFICATEWrapper premium_paid_certificateWrapper = (PREMIUM_PAID_CERTIFICATEWrapper)obj;

		if (Validator.equals(_premium_paid_certificate,
					premium_paid_certificateWrapper._premium_paid_certificate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PREMIUM_PAID_CERTIFICATE getWrappedPREMIUM_PAID_CERTIFICATE() {
		return _premium_paid_certificate;
	}

	@Override
	public PREMIUM_PAID_CERTIFICATE getWrappedModel() {
		return _premium_paid_certificate;
	}

	@Override
	public void resetOriginalValues() {
		_premium_paid_certificate.resetOriginalValues();
	}

	private PREMIUM_PAID_CERTIFICATE _premium_paid_certificate;
}