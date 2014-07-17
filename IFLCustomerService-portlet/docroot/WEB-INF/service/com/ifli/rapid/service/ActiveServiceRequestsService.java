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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for ActiveServiceRequests. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsServiceUtil
 * @see com.ifli.rapid.service.base.ActiveServiceRequestsServiceBaseImpl
 * @see com.ifli.rapid.service.impl.ActiveServiceRequestsServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ActiveServiceRequestsService extends BaseService,
	InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActiveServiceRequestsServiceUtil} to access the active service requests remote service. Add custom service methods to {@link com.ifli.rapid.service.impl.ActiveServiceRequestsServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getFundSwitchDetails(
		java.lang.String srId);

	public java.lang.String updateFundSwitchData(java.lang.String updateJson);

	public java.lang.String updateFS_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getPRData(
		java.lang.String srId);

	public java.lang.String updatePRData(java.lang.String updateJson);

	public java.lang.String updatePR_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getTUData(
		java.lang.String srId);

	public java.lang.String updateTUData(java.lang.String updateJson);

	public java.lang.String updateTU_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getAUData(
		java.lang.String srId);

	public java.lang.String updateAUData(java.lang.String updateJson);

	public java.lang.String updateAU_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getNCData(
		java.lang.String srId);

	public java.lang.String updateNCData(java.lang.String updateJson);

	public java.lang.String updateNC_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getEPData(
		java.lang.String srId);

	public java.lang.String updateEPData(java.lang.String updateJson);

	public java.lang.String updateEP_PSDecision(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getDOBData(
		java.lang.String srId);

	public java.lang.String updateDOBCData(java.lang.String updateJson);

	public java.lang.String updateDOBCDecision(java.lang.String updateJson);

	public java.lang.String updateDOBCStatus(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getPRUSData(
		java.lang.String srId);

	public java.lang.String updatePRUSStatus(java.lang.String updateJson);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Map<java.lang.String, java.lang.String> getRNData(
		java.lang.String srId);

	public java.lang.String updateRNStatus(java.lang.String updateJson);
}