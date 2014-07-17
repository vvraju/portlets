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

import java.util.Date;

/**
 * The base model interface for the PolicyPremRedirectionDetails service. Represents a row in the &quot;policy_prem_redirection_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetails
 * @see com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl
 * @see com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl
 * @generated
 */
public interface PolicyPremRedirectionDetailsModel extends BaseModel<PolicyPremRedirectionDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a policy prem redirection details model instance should use the {@link PolicyPremRedirectionDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this policy prem redirection details.
	 *
	 * @return the primary key of this policy prem redirection details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this policy prem redirection details.
	 *
	 * @param primaryKey the primary key of this policy prem redirection details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details.
	 *
	 * @return the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details
	 */
	public int getPREM_REDIRECTION_ID();

	/**
	 * Sets the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details.
	 *
	 * @param PREM_REDIRECTION_ID the p r e m_ r e d i r e c t i o n_ i d of this policy prem redirection details
	 */
	public void setPREM_REDIRECTION_ID(int PREM_REDIRECTION_ID);

	/**
	 * Returns the p o l i c y_ i d of this policy prem redirection details.
	 *
	 * @return the p o l i c y_ i d of this policy prem redirection details
	 */
	@AutoEscape
	public String getPOLICY_ID();

	/**
	 * Sets the p o l i c y_ i d of this policy prem redirection details.
	 *
	 * @param POLICY_ID the p o l i c y_ i d of this policy prem redirection details
	 */
	public void setPOLICY_ID(String POLICY_ID);

	/**
	 * Returns the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details.
	 *
	 * @return the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details
	 */
	public int getTRANSACTION_AUDIT_ID();

	/**
	 * Sets the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details.
	 *
	 * @param TRANSACTION_AUDIT_ID the t r a n s a c t i o n_ a u d i t_ i d of this policy prem redirection details
	 */
	public void setTRANSACTION_AUDIT_ID(int TRANSACTION_AUDIT_ID);

	/**
	 * Returns the f u n d_ c o d e of this policy prem redirection details.
	 *
	 * @return the f u n d_ c o d e of this policy prem redirection details
	 */
	@AutoEscape
	public String getFUND_CODE();

	/**
	 * Sets the f u n d_ c o d e of this policy prem redirection details.
	 *
	 * @param FUND_CODE the f u n d_ c o d e of this policy prem redirection details
	 */
	public void setFUND_CODE(String FUND_CODE);

	/**
	 * Returns the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details.
	 *
	 * @return the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details
	 */
	public double getALLOCATION_PERCENTAGE();

	/**
	 * Sets the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details.
	 *
	 * @param ALLOCATION_PERCENTAGE the a l l o c a t i o n_ p e r c e n t a g e of this policy prem redirection details
	 */
	public void setALLOCATION_PERCENTAGE(double ALLOCATION_PERCENTAGE);

	/**
	 * Returns the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details.
	 *
	 * @return the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details
	 */
	@AutoEscape
	public String getSENT_TO_ODS_FLAG();

	/**
	 * Sets the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details.
	 *
	 * @param SENT_TO_ODS_FLAG the s e n t_ t o_ o d s_ f l a g of this policy prem redirection details
	 */
	public void setSENT_TO_ODS_FLAG(String SENT_TO_ODS_FLAG);

	/**
	 * Returns the i n s e r t e d_ d a t e of this policy prem redirection details.
	 *
	 * @return the i n s e r t e d_ d a t e of this policy prem redirection details
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this policy prem redirection details.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this policy prem redirection details
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this policy prem redirection details.
	 *
	 * @return the i n s e r t e d_ b y of this policy prem redirection details
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this policy prem redirection details.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this policy prem redirection details
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this policy prem redirection details.
	 *
	 * @return the u p d a t e d_ d a t e of this policy prem redirection details
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this policy prem redirection details.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this policy prem redirection details
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this policy prem redirection details.
	 *
	 * @return the u p d a t e d_ b y of this policy prem redirection details
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this policy prem redirection details.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this policy prem redirection details
	 */
	public void setUPDATED_BY(String UPDATED_BY);

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
	public int compareTo(
		PolicyPremRedirectionDetails policyPremRedirectionDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PolicyPremRedirectionDetails> toCacheModel();

	@Override
	public PolicyPremRedirectionDetails toEscapedModel();

	@Override
	public PolicyPremRedirectionDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}