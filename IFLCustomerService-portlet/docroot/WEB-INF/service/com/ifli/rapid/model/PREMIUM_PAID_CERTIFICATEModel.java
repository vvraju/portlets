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
 * The base model interface for the PREMIUM_PAID_CERTIFICATE service. Represents a row in the &quot;PREMIUM_PAID_CERTIFICATE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATE
 * @see com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEImpl
 * @see com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl
 * @generated
 */
public interface PREMIUM_PAID_CERTIFICATEModel extends BaseModel<PREMIUM_PAID_CERTIFICATE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a p r e m i u m_ p a i d_ c e r t i f i c a t e model instance should use the {@link PREMIUM_PAID_CERTIFICATE} interface instead.
	 */

	/**
	 * Returns the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param primaryKey the primary key of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public long getID();

	/**
	 * Sets the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param ID the i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setID(long ID);

	/**
	 * Returns the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getFinancial_Year();

	/**
	 * Sets the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Financial_Year the financial_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setFinancial_Year(String Financial_Year);

	/**
	 * Returns the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getGeneration_Date();

	/**
	 * Sets the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Generation_Date the generation_ date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setGeneration_Date(String Generation_Date);

	/**
	 * Returns the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getOwnerName();

	/**
	 * Sets the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param OwnerName the owner name of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setOwnerName(String OwnerName);

	/**
	 * Returns the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getAddrs1();

	/**
	 * Sets the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Addrs1 the addrs1 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setAddrs1(String Addrs1);

	/**
	 * Returns the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getAddrs2();

	/**
	 * Sets the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Addrs2 the addrs2 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setAddrs2(String Addrs2);

	/**
	 * Returns the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getAddrs3();

	/**
	 * Sets the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Addrs3 the addrs3 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setAddrs3(String Addrs3);

	/**
	 * Returns the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getAddrs4();

	/**
	 * Sets the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Addrs4 the addrs4 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setAddrs4(String Addrs4);

	/**
	 * Returns the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getAddrs5();

	/**
	 * Sets the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Addrs5 the addrs5 of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setAddrs5(String Addrs5);

	/**
	 * Returns the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getPostcode();

	/**
	 * Sets the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Postcode the postcode of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setPostcode(String Postcode);

	/**
	 * Returns the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getMobilePhoneNo();

	/**
	 * Sets the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param MobilePhoneNo the mobile phone no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setMobilePhoneNo(String MobilePhoneNo);

	/**
	 * Returns the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getEmail_ID();

	/**
	 * Sets the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Email_ID the email_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setEmail_ID(String Email_ID);

	/**
	 * Returns the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getClient_ID();

	/**
	 * Sets the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Client_ID the client_ i d of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setClient_ID(String Client_ID);

	/**
	 * Returns the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getContract_Type_Desc();

	/**
	 * Sets the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Contract_Type_Desc the contract_ type_ desc of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setContract_Type_Desc(String Contract_Type_Desc);

	/**
	 * Returns the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getContrNo();

	/**
	 * Sets the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param ContrNo the contr no of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setContrNo(String ContrNo);

	/**
	 * Returns the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getInstallment_Prem();

	/**
	 * Sets the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Installment_Prem the installment_ prem of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setInstallment_Prem(String Installment_Prem);

	/**
	 * Returns the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getBilling_Frequency();

	/**
	 * Sets the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Billing_Frequency the billing_ frequency of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setBilling_Frequency(String Billing_Frequency);

	/**
	 * Returns the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getSumAssured();

	/**
	 * Sets the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param SumAssured the sum assured of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setSumAssured(String SumAssured);

	/**
	 * Returns the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getTotal_Pre_Paid();

	/**
	 * Sets the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Total_Pre_Paid the total_ pre_ paid of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setTotal_Pre_Paid(String Total_Pre_Paid);

	/**
	 * Returns the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getTotal_Pre_Due();

	/**
	 * Sets the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Total_Pre_Due the total_ pre_ due of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setTotal_Pre_Due(String Total_Pre_Due);

	/**
	 * Returns the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getCoverage();

	/**
	 * Sets the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Coverage the coverage of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setCoverage(String Coverage);

	/**
	 * Returns the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public int getFin_Year();

	/**
	 * Sets the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param Fin_Year the fin_ year of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setFin_Year(int Fin_Year);

	/**
	 * Returns the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getLETTERCTL();

	/**
	 * Sets the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param LETTERCTL the l e t t e r c t l of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setLETTERCTL(String LETTERCTL);

	/**
	 * Returns the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getLOCPATH();

	/**
	 * Sets the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param LOCPATH the l o c p a t h of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setLOCPATH(String LOCPATH);

	/**
	 * Returns the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getDOCIDNUM();

	/**
	 * Sets the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param DOCIDNUM the d o c i d n u m of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setDOCIDNUM(String DOCIDNUM);

	/**
	 * Returns the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param status the status of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setStatus(String status);

	/**
	 * Returns the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getLastProcessedDate();

	/**
	 * Sets the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param lastProcessedDate the last processed date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setLastProcessedDate(String lastProcessedDate);

	/**
	 * Returns the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getCreateDate();

	/**
	 * Sets the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param createDate the create date of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setCreateDate(String createDate);

	/**
	 * Returns the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getGLCODE();

	/**
	 * Sets the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param GLCODE the g l c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setGLCODE(String GLCODE);

	/**
	 * Returns the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @return the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@AutoEscape
	public String getBRANCH_CODE();

	/**
	 * Sets the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * @param BRANCH_CODE the b r a n c h_ c o d e of this p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	public void setBRANCH_CODE(String BRANCH_CODE);

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
	public int compareTo(PREMIUM_PAID_CERTIFICATE premium_paid_certificate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PREMIUM_PAID_CERTIFICATE> toCacheModel();

	@Override
	public PREMIUM_PAID_CERTIFICATE toEscapedModel();

	@Override
	public PREMIUM_PAID_CERTIFICATE toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}