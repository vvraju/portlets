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
 * Provides a wrapper for {@link CRM_Trn_ContactService}.
 *
 * @author Satya Kola
 * @see CRM_Trn_ContactService
 * @generated
 */
public class CRM_Trn_ContactServiceWrapper implements CRM_Trn_ContactService,
	ServiceWrapper<CRM_Trn_ContactService> {
	public CRM_Trn_ContactServiceWrapper(
		CRM_Trn_ContactService crm_Trn_ContactService) {
		_crm_Trn_ContactService = crm_Trn_ContactService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _crm_Trn_ContactService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_crm_Trn_ContactService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _crm_Trn_ContactService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CRM_Trn_ContactService getWrappedCRM_Trn_ContactService() {
		return _crm_Trn_ContactService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCRM_Trn_ContactService(
		CRM_Trn_ContactService crm_Trn_ContactService) {
		_crm_Trn_ContactService = crm_Trn_ContactService;
	}

	@Override
	public CRM_Trn_ContactService getWrappedService() {
		return _crm_Trn_ContactService;
	}

	@Override
	public void setWrappedService(CRM_Trn_ContactService crm_Trn_ContactService) {
		_crm_Trn_ContactService = crm_Trn_ContactService;
	}

	private CRM_Trn_ContactService _crm_Trn_ContactService;
}