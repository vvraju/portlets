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
 * Provides a wrapper for {@link PolicyTopupDetailsLocalService}.
 *
 * @author Satya Kola
 * @see PolicyTopupDetailsLocalService
 * @generated
 */
public class PolicyTopupDetailsLocalServiceWrapper
	implements PolicyTopupDetailsLocalService,
		ServiceWrapper<PolicyTopupDetailsLocalService> {
	public PolicyTopupDetailsLocalServiceWrapper(
		PolicyTopupDetailsLocalService policyTopupDetailsLocalService) {
		_policyTopupDetailsLocalService = policyTopupDetailsLocalService;
	}

	/**
	* Adds the policy topup details to the database. Also notifies the appropriate model listeners.
	*
	* @param policyTopupDetails the policy topup details
	* @return the policy topup details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails addPolicyTopupDetails(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.addPolicyTopupDetails(policyTopupDetails);
	}

	/**
	* Creates a new policy topup details with the primary key. Does not add the policy topup details to the database.
	*
	* @param TOPUP_ID the primary key for the new policy topup details
	* @return the new policy topup details
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails createPolicyTopupDetails(
		int TOPUP_ID) {
		return _policyTopupDetailsLocalService.createPolicyTopupDetails(TOPUP_ID);
	}

	/**
	* Deletes the policy topup details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details that was removed
	* @throws PortalException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails deletePolicyTopupDetails(
		int TOPUP_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.deletePolicyTopupDetails(TOPUP_ID);
	}

	/**
	* Deletes the policy topup details from the database. Also notifies the appropriate model listeners.
	*
	* @param policyTopupDetails the policy topup details
	* @return the policy topup details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails deletePolicyTopupDetails(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.deletePolicyTopupDetails(policyTopupDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyTopupDetailsLocalService.dynamicQuery();
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
		return _policyTopupDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyTopupDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyTopupDetailsLocalService.dynamicQuery(dynamicQuery,
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
		return _policyTopupDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _policyTopupDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyTopupDetails fetchPolicyTopupDetails(
		int TOPUP_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.fetchPolicyTopupDetails(TOPUP_ID);
	}

	/**
	* Returns the policy topup details with the primary key.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details
	* @throws PortalException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails getPolicyTopupDetails(
		int TOPUP_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.getPolicyTopupDetails(TOPUP_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy topup detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy topup detailses
	* @param end the upper bound of the range of policy topup detailses (not inclusive)
	* @return the range of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyTopupDetails> getPolicyTopupDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.getPolicyTopupDetailses(start,
			end);
	}

	/**
	* Returns the number of policy topup detailses.
	*
	* @return the number of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyTopupDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.getPolicyTopupDetailsesCount();
	}

	/**
	* Updates the policy topup details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyTopupDetails the policy topup details
	* @return the policy topup details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyTopupDetails updatePolicyTopupDetails(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyTopupDetailsLocalService.updatePolicyTopupDetails(policyTopupDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyTopupDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyTopupDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyTopupDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyTopupDetailsLocalService getWrappedPolicyTopupDetailsLocalService() {
		return _policyTopupDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyTopupDetailsLocalService(
		PolicyTopupDetailsLocalService policyTopupDetailsLocalService) {
		_policyTopupDetailsLocalService = policyTopupDetailsLocalService;
	}

	@Override
	public PolicyTopupDetailsLocalService getWrappedService() {
		return _policyTopupDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		PolicyTopupDetailsLocalService policyTopupDetailsLocalService) {
		_policyTopupDetailsLocalService = policyTopupDetailsLocalService;
	}

	private PolicyTopupDetailsLocalService _policyTopupDetailsLocalService;
}