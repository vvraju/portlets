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
 * The base model interface for the ServiceRequestMaster service. Represents a row in the &quot;ServiceRequestMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.ServiceRequestMasterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.ServiceRequestMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceRequestMaster
 * @see com.ifli.rapid.model.impl.ServiceRequestMasterImpl
 * @see com.ifli.rapid.model.impl.ServiceRequestMasterModelImpl
 * @generated
 */
public interface ServiceRequestMasterModel extends BaseModel<ServiceRequestMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service request master model instance should use the {@link ServiceRequestMaster} interface instead.
	 */

	/**
	 * Returns the primary key of this service request master.
	 *
	 * @return the primary key of this service request master
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this service request master.
	 *
	 * @param primaryKey the primary key of this service request master
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the ID of this service request master.
	 *
	 * @return the ID of this service request master
	 */
	@AutoEscape
	public String getId();

	/**
	 * Sets the ID of this service request master.
	 *
	 * @param Id the ID of this service request master
	 */
	public void setId(String Id);

	/**
	 * Returns the type of this service request master.
	 *
	 * @return the type of this service request master
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this service request master.
	 *
	 * @param Type the type of this service request master
	 */
	public void setType(String Type);

	/**
	 * Returns the contact ID of this service request master.
	 *
	 * @return the contact ID of this service request master
	 */
	@AutoEscape
	public String getContactId();

	/**
	 * Sets the contact ID of this service request master.
	 *
	 * @param ContactId the contact ID of this service request master
	 */
	public void setContactId(String ContactId);

	/**
	 * Returns the address type ID of this service request master.
	 *
	 * @return the address type ID of this service request master
	 */
	@AutoEscape
	public String getAddressTypeId();

	/**
	 * Sets the address type ID of this service request master.
	 *
	 * @param addressTypeId the address type ID of this service request master
	 */
	public void setAddressTypeId(String addressTypeId);

	/**
	 * Returns the address of this service request master.
	 *
	 * @return the address of this service request master
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this service request master.
	 *
	 * @param address the address of this service request master
	 */
	public void setAddress(String address);

	/**
	 * Returns the policy no of this service request master.
	 *
	 * @return the policy no of this service request master
	 */
	public int getPolicyNo();

	/**
	 * Sets the policy no of this service request master.
	 *
	 * @param PolicyNo the policy no of this service request master
	 */
	public void setPolicyNo(int PolicyNo);

	/**
	 * Returns the mobile no of this service request master.
	 *
	 * @return the mobile no of this service request master
	 */
	@AutoEscape
	public String getMobileNo();

	/**
	 * Sets the mobile no of this service request master.
	 *
	 * @param MobileNo the mobile no of this service request master
	 */
	public void setMobileNo(String MobileNo);

	/**
	 * Returns the description of this service request master.
	 *
	 * @return the description of this service request master
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this service request master.
	 *
	 * @param description the description of this service request master
	 */
	public void setDescription(String description);

	/**
	 * Returns the start prefered time of this service request master.
	 *
	 * @return the start prefered time of this service request master
	 */
	public Date getStartPreferedTime();

	/**
	 * Sets the start prefered time of this service request master.
	 *
	 * @param startPreferedTime the start prefered time of this service request master
	 */
	public void setStartPreferedTime(Date startPreferedTime);

	/**
	 * Returns the end prefered time of this service request master.
	 *
	 * @return the end prefered time of this service request master
	 */
	public Date getEndPreferedTime();

	/**
	 * Sets the end prefered time of this service request master.
	 *
	 * @param endPreferedTime the end prefered time of this service request master
	 */
	public void setEndPreferedTime(Date endPreferedTime);

	/**
	 * Returns the prefered date of this service request master.
	 *
	 * @return the prefered date of this service request master
	 */
	public Date getPreferedDate();

	/**
	 * Sets the prefered date of this service request master.
	 *
	 * @param PreferedDate the prefered date of this service request master
	 */
	public void setPreferedDate(Date PreferedDate);

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
	public int compareTo(ServiceRequestMaster serviceRequestMaster);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ServiceRequestMaster> toCacheModel();

	@Override
	public ServiceRequestMaster toEscapedModel();

	@Override
	public ServiceRequestMaster toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}