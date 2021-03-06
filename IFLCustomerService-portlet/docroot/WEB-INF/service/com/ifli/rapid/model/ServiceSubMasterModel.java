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
 * The base model interface for the ServiceSubMaster service. Represents a row in the &quot;service_submaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.ServiceSubMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceSubMaster
 * @see com.ifli.rapid.model.impl.ServiceSubMasterImpl
 * @see com.ifli.rapid.model.impl.ServiceSubMasterModelImpl
 * @generated
 */
public interface ServiceSubMasterModel extends BaseModel<ServiceSubMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service sub master model instance should use the {@link ServiceSubMaster} interface instead.
	 */

	/**
	 * Returns the primary key of this service sub master.
	 *
	 * @return the primary key of this service sub master
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this service sub master.
	 *
	 * @param primaryKey the primary key of this service sub master
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the s u b m a s t e r_ i d of this service sub master.
	 *
	 * @return the s u b m a s t e r_ i d of this service sub master
	 */
	public int getSUBMASTER_ID();

	/**
	 * Sets the s u b m a s t e r_ i d of this service sub master.
	 *
	 * @param SUBMASTER_ID the s u b m a s t e r_ i d of this service sub master
	 */
	public void setSUBMASTER_ID(int SUBMASTER_ID);

	/**
	 * Returns the s u b m a s t e r_ n a m e of this service sub master.
	 *
	 * @return the s u b m a s t e r_ n a m e of this service sub master
	 */
	@AutoEscape
	public String getSUBMASTER_NAME();

	/**
	 * Sets the s u b m a s t e r_ n a m e of this service sub master.
	 *
	 * @param SUBMASTER_NAME the s u b m a s t e r_ n a m e of this service sub master
	 */
	public void setSUBMASTER_NAME(String SUBMASTER_NAME);

	/**
	 * Returns the s u b m a s t e r_ u r l of this service sub master.
	 *
	 * @return the s u b m a s t e r_ u r l of this service sub master
	 */
	@AutoEscape
	public String getSUBMASTER_URL();

	/**
	 * Sets the s u b m a s t e r_ u r l of this service sub master.
	 *
	 * @param SUBMASTER_URL the s u b m a s t e r_ u r l of this service sub master
	 */
	public void setSUBMASTER_URL(String SUBMASTER_URL);

	/**
	 * Returns the s e r v i c e_ m a s t e r_ i d of this service sub master.
	 *
	 * @return the s e r v i c e_ m a s t e r_ i d of this service sub master
	 */
	public int getSERVICE_MASTER_ID();

	/**
	 * Sets the s e r v i c e_ m a s t e r_ i d of this service sub master.
	 *
	 * @param SERVICE_MASTER_ID the s e r v i c e_ m a s t e r_ i d of this service sub master
	 */
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID);

	/**
	 * Returns the a c t i v e_ f l a g of this service sub master.
	 *
	 * @return the a c t i v e_ f l a g of this service sub master
	 */
	@AutoEscape
	public String getACTIVE_FLAG();

	/**
	 * Sets the a c t i v e_ f l a g of this service sub master.
	 *
	 * @param ACTIVE_FLAG the a c t i v e_ f l a g of this service sub master
	 */
	public void setACTIVE_FLAG(String ACTIVE_FLAG);

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
	public int compareTo(ServiceSubMaster serviceSubMaster);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ServiceSubMaster> toCacheModel();

	@Override
	public ServiceSubMaster toEscapedModel();

	@Override
	public ServiceSubMaster toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}