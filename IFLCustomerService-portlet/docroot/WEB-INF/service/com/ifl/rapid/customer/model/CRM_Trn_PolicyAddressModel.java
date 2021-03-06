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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CRM_Trn_PolicyAddress service. Represents a row in the &quot;CRM_Trn_PolicyAddress&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddress
 * @see com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressImpl
 * @see com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl
 * @generated
 */
public interface CRM_Trn_PolicyAddressModel extends BaseModel<CRM_Trn_PolicyAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a c r m_ trn_ policy address model instance should use the {@link CRM_Trn_PolicyAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this c r m_ trn_ policy address.
	 *
	 * @return the primary key of this c r m_ trn_ policy address
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this c r m_ trn_ policy address.
	 *
	 * @param primaryKey the primary key of this c r m_ trn_ policy address
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the policy address ID of this c r m_ trn_ policy address.
	 *
	 * @return the policy address ID of this c r m_ trn_ policy address
	 */
	public int getPolicyAddressId();

	/**
	 * Sets the policy address ID of this c r m_ trn_ policy address.
	 *
	 * @param PolicyAddressId the policy address ID of this c r m_ trn_ policy address
	 */
	public void setPolicyAddressId(int PolicyAddressId);

	/**
	 * Returns the contact ID of this c r m_ trn_ policy address.
	 *
	 * @return the contact ID of this c r m_ trn_ policy address
	 */
	public int getContactId();

	/**
	 * Sets the contact ID of this c r m_ trn_ policy address.
	 *
	 * @param ContactId the contact ID of this c r m_ trn_ policy address
	 */
	public void setContactId(int ContactId);

	/**
	 * Returns the policy no of this c r m_ trn_ policy address.
	 *
	 * @return the policy no of this c r m_ trn_ policy address
	 */
	@AutoEscape
	public String getPolicyNo();

	/**
	 * Sets the policy no of this c r m_ trn_ policy address.
	 *
	 * @param PolicyNo the policy no of this c r m_ trn_ policy address
	 */
	public void setPolicyNo(String PolicyNo);

	/**
	 * Returns the address ID of this c r m_ trn_ policy address.
	 *
	 * @return the address ID of this c r m_ trn_ policy address
	 */
	public int getAddressId();

	/**
	 * Sets the address ID of this c r m_ trn_ policy address.
	 *
	 * @param AddressId the address ID of this c r m_ trn_ policy address
	 */
	public void setAddressId(int AddressId);

	/**
	 * Returns the is active of this c r m_ trn_ policy address.
	 *
	 * @return the is active of this c r m_ trn_ policy address
	 */
	@AutoEscape
	public String getIsActive();

	/**
	 * Sets the is active of this c r m_ trn_ policy address.
	 *
	 * @param IsActive the is active of this c r m_ trn_ policy address
	 */
	public void setIsActive(String IsActive);

	/**
	 * Returns the created by of this c r m_ trn_ policy address.
	 *
	 * @return the created by of this c r m_ trn_ policy address
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this c r m_ trn_ policy address.
	 *
	 * @param CreatedBy the created by of this c r m_ trn_ policy address
	 */
	public void setCreatedBy(String CreatedBy);

	/**
	 * Returns the created date of this c r m_ trn_ policy address.
	 *
	 * @return the created date of this c r m_ trn_ policy address
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this c r m_ trn_ policy address.
	 *
	 * @param CreatedDate the created date of this c r m_ trn_ policy address
	 */
	public void setCreatedDate(Date CreatedDate);

	/**
	 * Returns the modified by of this c r m_ trn_ policy address.
	 *
	 * @return the modified by of this c r m_ trn_ policy address
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this c r m_ trn_ policy address.
	 *
	 * @param ModifiedBy the modified by of this c r m_ trn_ policy address
	 */
	public void setModifiedBy(String ModifiedBy);

	/**
	 * Returns the modified date of this c r m_ trn_ policy address.
	 *
	 * @return the modified date of this c r m_ trn_ policy address
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this c r m_ trn_ policy address.
	 *
	 * @param ModifiedDate the modified date of this c r m_ trn_ policy address
	 */
	public void setModifiedDate(Date ModifiedDate);

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
	public int compareTo(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CRM_Trn_PolicyAddress> toCacheModel();

	@Override
	public CRM_Trn_PolicyAddress toEscapedModel();

	@Override
	public CRM_Trn_PolicyAddress toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}