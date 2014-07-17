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
 * Provides a wrapper for {@link PolicyPremRedirectionDetailsLocalService}.
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetailsLocalService
 * @generated
 */
public class PolicyPremRedirectionDetailsLocalServiceWrapper
	implements PolicyPremRedirectionDetailsLocalService,
		ServiceWrapper<PolicyPremRedirectionDetailsLocalService> {
	public PolicyPremRedirectionDetailsLocalServiceWrapper(
		PolicyPremRedirectionDetailsLocalService policyPremRedirectionDetailsLocalService) {
		_policyPremRedirectionDetailsLocalService = policyPremRedirectionDetailsLocalService;
	}

	/**
	* Adds the policy prem redirection details to the database. Also notifies the appropriate model listeners.
	*
	* @param policyPremRedirectionDetails the policy prem redirection details
	* @return the policy prem redirection details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails addPolicyPremRedirectionDetails(
		com.ifli.rapid.model.PolicyPremRedirectionDetails policyPremRedirectionDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.addPolicyPremRedirectionDetails(policyPremRedirectionDetails);
	}

	/**
	* Creates a new policy prem redirection details with the primary key. Does not add the policy prem redirection details to the database.
	*
	* @param PREM_REDIRECTION_ID the primary key for the new policy prem redirection details
	* @return the new policy prem redirection details
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails createPolicyPremRedirectionDetails(
		int PREM_REDIRECTION_ID) {
		return _policyPremRedirectionDetailsLocalService.createPolicyPremRedirectionDetails(PREM_REDIRECTION_ID);
	}

	/**
	* Deletes the policy prem redirection details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PREM_REDIRECTION_ID the primary key of the policy prem redirection details
	* @return the policy prem redirection details that was removed
	* @throws PortalException if a policy prem redirection details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails deletePolicyPremRedirectionDetails(
		int PREM_REDIRECTION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.deletePolicyPremRedirectionDetails(PREM_REDIRECTION_ID);
	}

	/**
	* Deletes the policy prem redirection details from the database. Also notifies the appropriate model listeners.
	*
	* @param policyPremRedirectionDetails the policy prem redirection details
	* @return the policy prem redirection details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails deletePolicyPremRedirectionDetails(
		com.ifli.rapid.model.PolicyPremRedirectionDetails policyPremRedirectionDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.deletePolicyPremRedirectionDetails(policyPremRedirectionDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyPremRedirectionDetailsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails fetchPolicyPremRedirectionDetails(
		int PREM_REDIRECTION_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.fetchPolicyPremRedirectionDetails(PREM_REDIRECTION_ID);
	}

	/**
	* Returns the policy prem redirection details with the primary key.
	*
	* @param PREM_REDIRECTION_ID the primary key of the policy prem redirection details
	* @return the policy prem redirection details
	* @throws PortalException if a policy prem redirection details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails getPolicyPremRedirectionDetails(
		int PREM_REDIRECTION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.getPolicyPremRedirectionDetails(PREM_REDIRECTION_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy prem redirection detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy prem redirection detailses
	* @param end the upper bound of the range of policy prem redirection detailses (not inclusive)
	* @return the range of policy prem redirection detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyPremRedirectionDetails> getPolicyPremRedirectionDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.getPolicyPremRedirectionDetailses(start,
			end);
	}

	/**
	* Returns the number of policy prem redirection detailses.
	*
	* @return the number of policy prem redirection detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyPremRedirectionDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.getPolicyPremRedirectionDetailsesCount();
	}

	/**
	* Updates the policy prem redirection details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyPremRedirectionDetails the policy prem redirection details
	* @return the policy prem redirection details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyPremRedirectionDetails updatePolicyPremRedirectionDetails(
		com.ifli.rapid.model.PolicyPremRedirectionDetails policyPremRedirectionDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyPremRedirectionDetailsLocalService.updatePolicyPremRedirectionDetails(policyPremRedirectionDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyPremRedirectionDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyPremRedirectionDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyPremRedirectionDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyPremRedirectionDetailsLocalService getWrappedPolicyPremRedirectionDetailsLocalService() {
		return _policyPremRedirectionDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyPremRedirectionDetailsLocalService(
		PolicyPremRedirectionDetailsLocalService policyPremRedirectionDetailsLocalService) {
		_policyPremRedirectionDetailsLocalService = policyPremRedirectionDetailsLocalService;
	}

	@Override
	public PolicyPremRedirectionDetailsLocalService getWrappedService() {
		return _policyPremRedirectionDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		PolicyPremRedirectionDetailsLocalService policyPremRedirectionDetailsLocalService) {
		_policyPremRedirectionDetailsLocalService = policyPremRedirectionDetailsLocalService;
	}

	private PolicyPremRedirectionDetailsLocalService _policyPremRedirectionDetailsLocalService;
}