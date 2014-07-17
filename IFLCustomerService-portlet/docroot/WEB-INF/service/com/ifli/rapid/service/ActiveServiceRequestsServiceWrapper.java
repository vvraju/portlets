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

package com.ifli.rapid.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ActiveServiceRequestsService}.
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsService
 * @generated
 */
public class ActiveServiceRequestsServiceWrapper
	implements ActiveServiceRequestsService,
		ServiceWrapper<ActiveServiceRequestsService> {
	public ActiveServiceRequestsServiceWrapper(
		ActiveServiceRequestsService activeServiceRequestsService) {
		_activeServiceRequestsService = activeServiceRequestsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _activeServiceRequestsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_activeServiceRequestsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _activeServiceRequestsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getFundSwitchDetails(
		java.lang.String srId) {
		return _activeServiceRequestsService.getFundSwitchDetails(srId);
	}

	@Override
	public java.lang.String updateFundSwitchData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateFundSwitchData(updateJson);
	}

	@Override
	public java.lang.String updateFS_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateFS_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getPRData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getPRData(srId);
	}

	@Override
	public java.lang.String updatePRData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updatePRData(updateJson);
	}

	@Override
	public java.lang.String updatePR_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updatePR_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getTUData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getTUData(srId);
	}

	@Override
	public java.lang.String updateTUData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateTUData(updateJson);
	}

	@Override
	public java.lang.String updateTU_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateTU_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getAUData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getAUData(srId);
	}

	@Override
	public java.lang.String updateAUData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateAUData(updateJson);
	}

	@Override
	public java.lang.String updateAU_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateAU_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getNCData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getNCData(srId);
	}

	@Override
	public java.lang.String updateNCData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateNCData(updateJson);
	}

	@Override
	public java.lang.String updateNC_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateNC_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getEPData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getEPData(srId);
	}

	@Override
	public java.lang.String updateEPData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateEPData(updateJson);
	}

	@Override
	public java.lang.String updateEP_PSDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateEP_PSDecision(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getDOBData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getDOBData(srId);
	}

	@Override
	public java.lang.String updateDOBCData(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateDOBCData(updateJson);
	}

	@Override
	public java.lang.String updateDOBCDecision(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateDOBCDecision(updateJson);
	}

	@Override
	public java.lang.String updateDOBCStatus(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateDOBCStatus(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getPRUSData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getPRUSData(srId);
	}

	@Override
	public java.lang.String updatePRUSStatus(java.lang.String updateJson) {
		return _activeServiceRequestsService.updatePRUSStatus(updateJson);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.String> getRNData(
		java.lang.String srId) {
		return _activeServiceRequestsService.getRNData(srId);
	}

	@Override
	public java.lang.String updateRNStatus(java.lang.String updateJson) {
		return _activeServiceRequestsService.updateRNStatus(updateJson);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ActiveServiceRequestsService getWrappedActiveServiceRequestsService() {
		return _activeServiceRequestsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedActiveServiceRequestsService(
		ActiveServiceRequestsService activeServiceRequestsService) {
		_activeServiceRequestsService = activeServiceRequestsService;
	}

	@Override
	public ActiveServiceRequestsService getWrappedService() {
		return _activeServiceRequestsService;
	}

	@Override
	public void setWrappedService(
		ActiveServiceRequestsService activeServiceRequestsService) {
		_activeServiceRequestsService = activeServiceRequestsService;
	}

	private ActiveServiceRequestsService _activeServiceRequestsService;
}