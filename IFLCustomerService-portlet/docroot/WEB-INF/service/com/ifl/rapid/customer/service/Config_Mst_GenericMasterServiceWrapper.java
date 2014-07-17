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

package com.ifl.rapid.customer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Config_Mst_GenericMasterService}.
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterService
 * @generated
 */
public class Config_Mst_GenericMasterServiceWrapper
	implements Config_Mst_GenericMasterService,
		ServiceWrapper<Config_Mst_GenericMasterService> {
	public Config_Mst_GenericMasterServiceWrapper(
		Config_Mst_GenericMasterService config_Mst_GenericMasterService) {
		_config_Mst_GenericMasterService = config_Mst_GenericMasterService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _config_Mst_GenericMasterService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_config_Mst_GenericMasterService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _config_Mst_GenericMasterService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ifli.rapid.model.FamilyRelations> getAllFamilyRelations() {
		return _config_Mst_GenericMasterService.getAllFamilyRelations();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Config_Mst_GenericMasterService getWrappedConfig_Mst_GenericMasterService() {
		return _config_Mst_GenericMasterService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConfig_Mst_GenericMasterService(
		Config_Mst_GenericMasterService config_Mst_GenericMasterService) {
		_config_Mst_GenericMasterService = config_Mst_GenericMasterService;
	}

	@Override
	public Config_Mst_GenericMasterService getWrappedService() {
		return _config_Mst_GenericMasterService;
	}

	@Override
	public void setWrappedService(
		Config_Mst_GenericMasterService config_Mst_GenericMasterService) {
		_config_Mst_GenericMasterService = config_Mst_GenericMasterService;
	}

	private Config_Mst_GenericMasterService _config_Mst_GenericMasterService;
}