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
 * Provides a wrapper for {@link PolicyFundSwitchCounterLocalService}.
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounterLocalService
 * @generated
 */
public class PolicyFundSwitchCounterLocalServiceWrapper
	implements PolicyFundSwitchCounterLocalService,
		ServiceWrapper<PolicyFundSwitchCounterLocalService> {
	public PolicyFundSwitchCounterLocalServiceWrapper(
		PolicyFundSwitchCounterLocalService policyFundSwitchCounterLocalService) {
		_policyFundSwitchCounterLocalService = policyFundSwitchCounterLocalService;
	}

	/**
	* Adds the policy fund switch counter to the database. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchCounter the policy fund switch counter
	* @return the policy fund switch counter that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter addPolicyFundSwitchCounter(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.addPolicyFundSwitchCounter(policyFundSwitchCounter);
	}

	/**
	* Creates a new policy fund switch counter with the primary key. Does not add the policy fund switch counter to the database.
	*
	* @param POLICY_ID the primary key for the new policy fund switch counter
	* @return the new policy fund switch counter
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter createPolicyFundSwitchCounter(
		java.lang.String POLICY_ID) {
		return _policyFundSwitchCounterLocalService.createPolicyFundSwitchCounter(POLICY_ID);
	}

	/**
	* Deletes the policy fund switch counter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the policy fund switch counter
	* @return the policy fund switch counter that was removed
	* @throws PortalException if a policy fund switch counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter deletePolicyFundSwitchCounter(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.deletePolicyFundSwitchCounter(POLICY_ID);
	}

	/**
	* Deletes the policy fund switch counter from the database. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchCounter the policy fund switch counter
	* @return the policy fund switch counter that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter deletePolicyFundSwitchCounter(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.deletePolicyFundSwitchCounter(policyFundSwitchCounter);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyFundSwitchCounterLocalService.dynamicQuery();
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
		return _policyFundSwitchCounterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundSwitchCounterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundSwitchCounterLocalService.dynamicQuery(dynamicQuery,
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
		return _policyFundSwitchCounterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _policyFundSwitchCounterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter fetchPolicyFundSwitchCounter(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.fetchPolicyFundSwitchCounter(POLICY_ID);
	}

	/**
	* Returns the policy fund switch counter with the primary key.
	*
	* @param POLICY_ID the primary key of the policy fund switch counter
	* @return the policy fund switch counter
	* @throws PortalException if a policy fund switch counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter getPolicyFundSwitchCounter(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.getPolicyFundSwitchCounter(POLICY_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy fund switch counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch counters
	* @param end the upper bound of the range of policy fund switch counters (not inclusive)
	* @return the range of policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyFundSwitchCounter> getPolicyFundSwitchCounters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.getPolicyFundSwitchCounters(start,
			end);
	}

	/**
	* Returns the number of policy fund switch counters.
	*
	* @return the number of policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyFundSwitchCountersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.getPolicyFundSwitchCountersCount();
	}

	/**
	* Updates the policy fund switch counter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchCounter the policy fund switch counter
	* @return the policy fund switch counter that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchCounter updatePolicyFundSwitchCounter(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchCounterLocalService.updatePolicyFundSwitchCounter(policyFundSwitchCounter);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyFundSwitchCounterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyFundSwitchCounterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyFundSwitchCounterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyFundSwitchCounterLocalService getWrappedPolicyFundSwitchCounterLocalService() {
		return _policyFundSwitchCounterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyFundSwitchCounterLocalService(
		PolicyFundSwitchCounterLocalService policyFundSwitchCounterLocalService) {
		_policyFundSwitchCounterLocalService = policyFundSwitchCounterLocalService;
	}

	@Override
	public PolicyFundSwitchCounterLocalService getWrappedService() {
		return _policyFundSwitchCounterLocalService;
	}

	@Override
	public void setWrappedService(
		PolicyFundSwitchCounterLocalService policyFundSwitchCounterLocalService) {
		_policyFundSwitchCounterLocalService = policyFundSwitchCounterLocalService;
	}

	private PolicyFundSwitchCounterLocalService _policyFundSwitchCounterLocalService;
}