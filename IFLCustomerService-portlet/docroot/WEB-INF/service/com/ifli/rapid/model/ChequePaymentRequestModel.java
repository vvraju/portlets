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
 * The base model interface for the ChequePaymentRequest service. Represents a row in the &quot;ChequePaymentRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.ChequePaymentRequestImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ChequePaymentRequest
 * @see com.ifli.rapid.model.impl.ChequePaymentRequestImpl
 * @see com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl
 * @generated
 */
public interface ChequePaymentRequestModel extends BaseModel<ChequePaymentRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cheque payment request model instance should use the {@link ChequePaymentRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this cheque payment request.
	 *
	 * @return the primary key of this cheque payment request
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this cheque payment request.
	 *
	 * @param primaryKey the primary key of this cheque payment request
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the service request i d of this cheque payment request.
	 *
	 * @return the service request i d of this cheque payment request
	 */
	@AutoEscape
	public String getServiceRequestID();

	/**
	 * Sets the service request i d of this cheque payment request.
	 *
	 * @param ServiceRequestID the service request i d of this cheque payment request
	 */
	public void setServiceRequestID(String ServiceRequestID);

	/**
	 * Returns the service request master ID of this cheque payment request.
	 *
	 * @return the service request master ID of this cheque payment request
	 */
	@AutoEscape
	public String getServiceRequestMasterId();

	/**
	 * Sets the service request master ID of this cheque payment request.
	 *
	 * @param ServiceRequestMasterId the service request master ID of this cheque payment request
	 */
	public void setServiceRequestMasterId(String ServiceRequestMasterId);

	/**
	 * Returns the description of this cheque payment request.
	 *
	 * @return the description of this cheque payment request
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this cheque payment request.
	 *
	 * @param description the description of this cheque payment request
	 */
	public void setDescription(String description);

	/**
	 * Returns the contact ID of this cheque payment request.
	 *
	 * @return the contact ID of this cheque payment request
	 */
	@AutoEscape
	public String getContactId();

	/**
	 * Sets the contact ID of this cheque payment request.
	 *
	 * @param contactId the contact ID of this cheque payment request
	 */
	public void setContactId(String contactId);

	/**
	 * Returns the start prefered time of this cheque payment request.
	 *
	 * @return the start prefered time of this cheque payment request
	 */
	public Date getStartPreferedTime();

	/**
	 * Sets the start prefered time of this cheque payment request.
	 *
	 * @param startPreferedTime the start prefered time of this cheque payment request
	 */
	public void setStartPreferedTime(Date startPreferedTime);

	/**
	 * Returns the end prefered time of this cheque payment request.
	 *
	 * @return the end prefered time of this cheque payment request
	 */
	public Date getEndPreferedTime();

	/**
	 * Sets the end prefered time of this cheque payment request.
	 *
	 * @param endPreferedTime the end prefered time of this cheque payment request
	 */
	public void setEndPreferedTime(Date endPreferedTime);

	/**
	 * Returns the prefered date of this cheque payment request.
	 *
	 * @return the prefered date of this cheque payment request
	 */
	public Date getPreferedDate();

	/**
	 * Sets the prefered date of this cheque payment request.
	 *
	 * @param PreferedDate the prefered date of this cheque payment request
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
	public int compareTo(ChequePaymentRequest chequePaymentRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ChequePaymentRequest> toCacheModel();

	@Override
	public ChequePaymentRequest toEscapedModel();

	@Override
	public ChequePaymentRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}