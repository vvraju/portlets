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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the RENEWAL_PREMIUM service. Represents a row in the &quot;HPRMRCP1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUM
 * @see com.ifli.rapid.model.impl.RENEWAL_PREMIUMImpl
 * @see com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl
 * @generated
 */
public interface RENEWAL_PREMIUMModel extends BaseModel<RENEWAL_PREMIUM> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a r e n e w a l_ p r e m i u m model instance should use the {@link RENEWAL_PREMIUM} interface instead.
	 */

	/**
	 * Returns the primary key of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the primary key of this r e n e w a l_ p r e m i u m
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this r e n e w a l_ p r e m i u m.
	 *
	 * @param primaryKey the primary key of this r e n e w a l_ p r e m i u m
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the i d_old of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the i d_old of this r e n e w a l_ p r e m i u m
	 */
	public long getID_old();

	/**
	 * Sets the i d_old of this r e n e w a l_ p r e m i u m.
	 *
	 * @param ID_old the i d_old of this r e n e w a l_ p r e m i u m
	 */
	public void setID_old(long ID_old);

	/**
	 * Returns the l e t t e r c t of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the l e t t e r c t of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getLETTERCT();

	/**
	 * Sets the l e t t e r c t of this r e n e w a l_ p r e m i u m.
	 *
	 * @param LETTERCT the l e t t e r c t of this r e n e w a l_ p r e m i u m
	 */
	public void setLETTERCT(String LETTERCT);

	/**
	 * Returns the l o c p a t h of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the l o c p a t h of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getLOCPATH();

	/**
	 * Sets the l o c p a t h of this r e n e w a l_ p r e m i u m.
	 *
	 * @param LOCPATH the l o c p a t h of this r e n e w a l_ p r e m i u m
	 */
	public void setLOCPATH(String LOCPATH);

	/**
	 * Returns the d o c i d n u m of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the d o c i d n u m of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getDOCIDNUM();

	/**
	 * Sets the d o c i d n u m of this r e n e w a l_ p r e m i u m.
	 *
	 * @param DOCIDNUM the d o c i d n u m of this r e n e w a l_ p r e m i u m
	 */
	public void setDOCIDNUM(String DOCIDNUM);

	/**
	 * Returns the c l n t n u m of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the c l n t n u m of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCLNTNUM();

	/**
	 * Sets the c l n t n u m of this r e n e w a l_ p r e m i u m.
	 *
	 * @param CLNTNUM the c l n t n u m of this r e n e w a l_ p r e m i u m
	 */
	public void setCLNTNUM(String CLNTNUM);

	/**
	 * Returns the owner name of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the owner name of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getOwnerName();

	/**
	 * Sets the owner name of this r e n e w a l_ p r e m i u m.
	 *
	 * @param OwnerName the owner name of this r e n e w a l_ p r e m i u m
	 */
	public void setOwnerName(String OwnerName);

	/**
	 * Returns the addrs5 of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the addrs5 of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAddrs5();

	/**
	 * Sets the addrs5 of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Addrs5 the addrs5 of this r e n e w a l_ p r e m i u m
	 */
	public void setAddrs5(String Addrs5);

	/**
	 * Returns the postcode of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the postcode of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getPostcode();

	/**
	 * Sets the postcode of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Postcode the postcode of this r e n e w a l_ p r e m i u m
	 */
	public void setPostcode(String Postcode);

	/**
	 * Returns the document_ number of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the document_ number of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getDocument_Number();

	/**
	 * Sets the document_ number of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Document_Number the document_ number of this r e n e w a l_ p r e m i u m
	 */
	public void setDocument_Number(String Document_Number);

	/**
	 * Returns the contr no of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the contr no of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getContrNo();

	/**
	 * Sets the contr no of this r e n e w a l_ p r e m i u m.
	 *
	 * @param ContrNo the contr no of this r e n e w a l_ p r e m i u m
	 */
	public void setContrNo(String ContrNo);

	/**
	 * Returns the next_ premium_due_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the next_ premium_due_ date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getNext_Premium_due_Date();

	/**
	 * Sets the next_ premium_due_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Next_Premium_due_Date the next_ premium_due_ date of this r e n e w a l_ p r e m i u m
	 */
	public void setNext_Premium_due_Date(String Next_Premium_due_Date);

	/**
	 * Returns the total_ premium of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the total_ premium of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getTotal_Premium();

	/**
	 * Sets the total_ premium of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Total_Premium the total_ premium of this r e n e w a l_ p r e m i u m
	 */
	public void setTotal_Premium(String Total_Premium);

	/**
	 * Returns the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getMainCovr_Risk_Cess_Term();

	/**
	 * Sets the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m.
	 *
	 * @param MainCovr_Risk_Cess_Term the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m
	 */
	public void setMainCovr_Risk_Cess_Term(String MainCovr_Risk_Cess_Term);

	/**
	 * Returns the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getMainCovr_Prem_Cess_Term();

	/**
	 * Sets the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m.
	 *
	 * @param MainCovr_Prem_Cess_Term the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m
	 */
	public void setMainCovr_Prem_Cess_Term(String MainCovr_Prem_Cess_Term);

	/**
	 * Returns the contract_ commencement_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the contract_ commencement_ date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getContract_Commencement_Date();

	/**
	 * Sets the contract_ commencement_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Contract_Commencement_Date the contract_ commencement_ date of this r e n e w a l_ p r e m i u m
	 */
	public void setContract_Commencement_Date(String Contract_Commencement_Date);

	/**
	 * Returns the billing_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the billing_ date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getBilling_Date();

	/**
	 * Sets the billing_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Billing_Date the billing_ date of this r e n e w a l_ p r e m i u m
	 */
	public void setBilling_Date(String Billing_Date);

	/**
	 * Returns the payment_ desc of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the payment_ desc of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getPayment_Desc();

	/**
	 * Sets the payment_ desc of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Payment_Desc the payment_ desc of this r e n e w a l_ p r e m i u m
	 */
	public void setPayment_Desc(String Payment_Desc);

	/**
	 * Returns the receipt_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the receipt_ date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getReceipt_Date();

	/**
	 * Sets the receipt_ date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Receipt_Date the receipt_ date of this r e n e w a l_ p r e m i u m
	 */
	public void setReceipt_Date(String Receipt_Date);

	/**
	 * Returns the payment_ mode of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the payment_ mode of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getPayment_Mode();

	/**
	 * Sets the payment_ mode of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Payment_Mode the payment_ mode of this r e n e w a l_ p r e m i u m
	 */
	public void setPayment_Mode(String Payment_Mode);

	/**
	 * Returns the payment_ description of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the payment_ description of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getPayment_Description();

	/**
	 * Sets the payment_ description of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Payment_Description the payment_ description of this r e n e w a l_ p r e m i u m
	 */
	public void setPayment_Description(String Payment_Description);

	/**
	 * Returns the receipt_ amount of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the receipt_ amount of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getReceipt_Amount();

	/**
	 * Sets the receipt_ amount of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Receipt_Amount the receipt_ amount of this r e n e w a l_ p r e m i u m
	 */
	public void setReceipt_Amount(String Receipt_Amount);

	/**
	 * Returns the contract_ type of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the contract_ type of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getContract_Type();

	/**
	 * Sets the contract_ type of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Contract_Type the contract_ type of this r e n e w a l_ p r e m i u m
	 */
	public void setContract_Type(String Contract_Type);

	/**
	 * Returns the contract_ type_ desc of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the contract_ type_ desc of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getContract_Type_Desc();

	/**
	 * Sets the contract_ type_ desc of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Contract_Type_Desc the contract_ type_ desc of this r e n e w a l_ p r e m i u m
	 */
	public void setContract_Type_Desc(String Contract_Type_Desc);

	/**
	 * Returns the current_ bill_ frequency of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the current_ bill_ frequency of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCurrent_Bill_Frequency();

	/**
	 * Sets the current_ bill_ frequency of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Current_Bill_Frequency the current_ bill_ frequency of this r e n e w a l_ p r e m i u m
	 */
	public void setCurrent_Bill_Frequency(String Current_Bill_Frequency);

	/**
	 * Returns the suspense_ amount of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the suspense_ amount of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getSuspense_Amount();

	/**
	 * Sets the suspense_ amount of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Suspense_Amount the suspense_ amount of this r e n e w a l_ p r e m i u m
	 */
	public void setSuspense_Amount(String Suspense_Amount);

	/**
	 * Returns the footer_ details of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the footer_ details of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getFooter_Details();

	/**
	 * Sets the footer_ details of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Footer_Details the footer_ details of this r e n e w a l_ p r e m i u m
	 */
	public void setFooter_Details(String Footer_Details);

	/**
	 * Returns the addrs1 of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the addrs1 of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAddrs1();

	/**
	 * Sets the addrs1 of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Addrs1 the addrs1 of this r e n e w a l_ p r e m i u m
	 */
	public void setAddrs1(String Addrs1);

	/**
	 * Returns the addrs2 of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the addrs2 of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAddrs2();

	/**
	 * Sets the addrs2 of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Addrs2 the addrs2 of this r e n e w a l_ p r e m i u m
	 */
	public void setAddrs2(String Addrs2);

	/**
	 * Returns the addrs3 of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the addrs3 of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAddrs3();

	/**
	 * Sets the addrs3 of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Addrs3 the addrs3 of this r e n e w a l_ p r e m i u m
	 */
	public void setAddrs3(String Addrs3);

	/**
	 * Returns the addrs4 of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the addrs4 of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAddrs4();

	/**
	 * Sets the addrs4 of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Addrs4 the addrs4 of this r e n e w a l_ p r e m i u m
	 */
	public void setAddrs4(String Addrs4);

	/**
	 * Returns the temp_ rcptno of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the temp_ rcptno of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getTemp_Rcptno();

	/**
	 * Sets the temp_ rcptno of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Temp_Rcptno the temp_ rcptno of this r e n e w a l_ p r e m i u m
	 */
	public void setTemp_Rcptno(String Temp_Rcptno);

	/**
	 * Returns the life_ name of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the life_ name of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getLife_Name();

	/**
	 * Sets the life_ name of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Life_Name the life_ name of this r e n e w a l_ p r e m i u m
	 */
	public void setLife_Name(String Life_Name);

	/**
	 * Returns the c a m p a i g n of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the c a m p a i g n of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCAMPAIGN();

	/**
	 * Sets the c a m p a i g n of this r e n e w a l_ p r e m i u m.
	 *
	 * @param CAMPAIGN the c a m p a i g n of this r e n e w a l_ p r e m i u m
	 */
	public void setCAMPAIGN(String CAMPAIGN);

	/**
	 * Returns the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAgent_Bank_Branch_Code();

	/**
	 * Sets the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Agent_Bank_Branch_Code the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m
	 */
	public void setAgent_Bank_Branch_Code(String Agent_Bank_Branch_Code);

	/**
	 * Returns the agent_ branch_name of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the agent_ branch_name of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAgent_Branch_name();

	/**
	 * Sets the agent_ branch_name of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Agent_Branch_name the agent_ branch_name of this r e n e w a l_ p r e m i u m
	 */
	public void setAgent_Branch_name(String Agent_Branch_name);

	/**
	 * Returns the agent_ bank_name of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the agent_ bank_name of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getAgent_Bank_name();

	/**
	 * Sets the agent_ bank_name of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Agent_Bank_name the agent_ bank_name of this r e n e w a l_ p r e m i u m
	 */
	public void setAgent_Bank_name(String Agent_Bank_name);

	/**
	 * Returns the mobile_phone of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the mobile_phone of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getMobile_phone();

	/**
	 * Sets the mobile_phone of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Mobile_phone the mobile_phone of this r e n e w a l_ p r e m i u m
	 */
	public void setMobile_phone(String Mobile_phone);

	/**
	 * Returns the email_id of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the email_id of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getEmail_id();

	/**
	 * Sets the email_id of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Email_id the email_id of this r e n e w a l_ p r e m i u m
	 */
	public void setEmail_id(String Email_id);

	/**
	 * Returns the create date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the create date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCreateDate();

	/**
	 * Sets the create date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param CreateDate the create date of this r e n e w a l_ p r e m i u m
	 */
	public void setCreateDate(String CreateDate);

	/**
	 * Returns the batch mode of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the batch mode of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getBatchMode();

	/**
	 * Sets the batch mode of this r e n e w a l_ p r e m i u m.
	 *
	 * @param BatchMode the batch mode of this r e n e w a l_ p r e m i u m
	 */
	public void setBatchMode(String BatchMode);

	/**
	 * Returns the status of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the status of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Status the status of this r e n e w a l_ p r e m i u m
	 */
	public void setStatus(String Status);

	/**
	 * Returns the last processed date of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the last processed date of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getLastProcessedDate();

	/**
	 * Sets the last processed date of this r e n e w a l_ p r e m i u m.
	 *
	 * @param LastProcessedDate the last processed date of this r e n e w a l_ p r e m i u m
	 */
	public void setLastProcessedDate(String LastProcessedDate);

	/**
	 * Returns the mobile phone no of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the mobile phone no of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getMobilePhoneNo();

	/**
	 * Sets the mobile phone no of this r e n e w a l_ p r e m i u m.
	 *
	 * @param MobilePhoneNo the mobile phone no of this r e n e w a l_ p r e m i u m
	 */
	public void setMobilePhoneNo(String MobilePhoneNo);

	/**
	 * Returns the cheque_ number of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the cheque_ number of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCheque_Number();

	/**
	 * Sets the cheque_ number of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Cheque_Number the cheque_ number of this r e n e w a l_ p r e m i u m
	 */
	public void setCheque_Number(String Cheque_Number);

	/**
	 * Returns the bank_ name of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the bank_ name of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getBank_Name();

	/**
	 * Sets the bank_ name of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Bank_Name the bank_ name of this r e n e w a l_ p r e m i u m
	 */
	public void setBank_Name(String Bank_Name);

	/**
	 * Returns the email addr of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the email addr of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getEmailAddr();

	/**
	 * Sets the email addr of this r e n e w a l_ p r e m i u m.
	 *
	 * @param EmailAddr the email addr of this r e n e w a l_ p r e m i u m
	 */
	public void setEmailAddr(String EmailAddr);

	/**
	 * Returns the i d of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the i d of this r e n e w a l_ p r e m i u m
	 */
	public int getID();

	/**
	 * Sets the i d of this r e n e w a l_ p r e m i u m.
	 *
	 * @param ID the i d of this r e n e w a l_ p r e m i u m
	 */
	public void setID(int ID);

	/**
	 * Returns the b d m of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the b d m of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getBDM();

	/**
	 * Sets the b d m of this r e n e w a l_ p r e m i u m.
	 *
	 * @param BDM the b d m of this r e n e w a l_ p r e m i u m
	 */
	public void setBDM(String BDM);

	/**
	 * Returns the term of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the term of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getTerm();

	/**
	 * Sets the term of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Term the term of this r e n e w a l_ p r e m i u m
	 */
	public void setTerm(String Term);

	/**
	 * Returns the campaign_ code of this r e n e w a l_ p r e m i u m.
	 *
	 * @return the campaign_ code of this r e n e w a l_ p r e m i u m
	 */
	@AutoEscape
	public String getCampaign_Code();

	/**
	 * Sets the campaign_ code of this r e n e w a l_ p r e m i u m.
	 *
	 * @param Campaign_Code the campaign_ code of this r e n e w a l_ p r e m i u m
	 */
	public void setCampaign_Code(String Campaign_Code);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RENEWAL_PREMIUM renewal_premium);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RENEWAL_PREMIUM> toCacheModel();

	@Override
	public RENEWAL_PREMIUM toEscapedModel();

	@Override
	public RENEWAL_PREMIUM toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}