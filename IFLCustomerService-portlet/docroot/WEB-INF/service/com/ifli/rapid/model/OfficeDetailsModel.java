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
 * The base model interface for the OfficeDetails service. Represents a row in the &quot;office_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.OfficeDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.OfficeDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see OfficeDetails
 * @see com.ifli.rapid.model.impl.OfficeDetailsImpl
 * @see com.ifli.rapid.model.impl.OfficeDetailsModelImpl
 * @generated
 */
public interface OfficeDetailsModel extends BaseModel<OfficeDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a office details model instance should use the {@link OfficeDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this office details.
	 *
	 * @return the primary key of this office details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this office details.
	 *
	 * @param primaryKey the primary key of this office details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the o f f i c e_ i d of this office details.
	 *
	 * @return the o f f i c e_ i d of this office details
	 */
	public int getOFFICE_ID();

	/**
	 * Sets the o f f i c e_ i d of this office details.
	 *
	 * @param OFFICE_ID the o f f i c e_ i d of this office details
	 */
	public void setOFFICE_ID(int OFFICE_ID);

	/**
	 * Returns the o f f i c e_ n a m e of this office details.
	 *
	 * @return the o f f i c e_ n a m e of this office details
	 */
	@AutoEscape
	public String getOFFICE_NAME();

	/**
	 * Sets the o f f i c e_ n a m e of this office details.
	 *
	 * @param OFFICE_NAME the o f f i c e_ n a m e of this office details
	 */
	public void setOFFICE_NAME(String OFFICE_NAME);

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
	public int compareTo(OfficeDetails officeDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OfficeDetails> toCacheModel();

	@Override
	public OfficeDetails toEscapedModel();

	@Override
	public OfficeDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}