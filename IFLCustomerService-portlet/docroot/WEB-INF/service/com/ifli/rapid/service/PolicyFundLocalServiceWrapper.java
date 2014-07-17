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
 * Provides a wrapper for {@link PolicyFundLocalService}.
 *
 * @author Satya Kola
 * @see PolicyFundLocalService
 * @generated
 */
public class PolicyFundLocalServiceWrapper implements PolicyFundLocalService,
	ServiceWrapper<PolicyFundLocalService> {
	public PolicyFundLocalServiceWrapper(
		PolicyFundLocalService policyFundLocalService) {
		_policyFundLocalService = policyFundLocalService;
	}

	/**
	* Adds the policy fund to the database. Also notifies the appropriate model listeners.
	*
	* @param policyFund the policy fund
	* @return the policy fund that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund addPolicyFund(
		com.ifli.rapid.model.PolicyFund policyFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.addPolicyFund(policyFund);
	}

	/**
	* Creates a new policy fund with the primary key. Does not add the policy fund to the database.
	*
	* @param POLICY_FUND_ID the primary key for the new policy fund
	* @return the new policy fund
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund createPolicyFund(int POLICY_FUND_ID) {
		return _policyFundLocalService.createPolicyFund(POLICY_FUND_ID);
	}

	/**
	* Deletes the policy fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_FUND_ID the primary key of the policy fund
	* @return the policy fund that was removed
	* @throws PortalException if a policy fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund deletePolicyFund(int POLICY_FUND_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.deletePolicyFund(POLICY_FUND_ID);
	}

	/**
	* Deletes the policy fund from the database. Also notifies the appropriate model listeners.
	*
	* @param policyFund the policy fund
	* @return the policy fund that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund deletePolicyFund(
		com.ifli.rapid.model.PolicyFund policyFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.deletePolicyFund(policyFund);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyFundLocalService.dynamicQuery();
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
		return _policyFundLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _policyFundLocalService.dynamicQueryCount(dynamicQuery);
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
		return _policyFundLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyFund fetchPolicyFund(int POLICY_FUND_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.fetchPolicyFund(POLICY_FUND_ID);
	}

	/**
	* Returns the policy fund with the primary key.
	*
	* @param POLICY_FUND_ID the primary key of the policy fund
	* @return the policy fund
	* @throws PortalException if a policy fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund getPolicyFund(int POLICY_FUND_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.getPolicyFund(POLICY_FUND_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy funds
	* @param end the upper bound of the range of policy funds (not inclusive)
	* @return the range of policy funds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyFund> getPolicyFunds(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.getPolicyFunds(start, end);
	}

	/**
	* Returns the number of policy funds.
	*
	* @return the number of policy funds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyFundsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.getPolicyFundsCount();
	}

	/**
	* Updates the policy fund in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyFund the policy fund
	* @return the policy fund that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFund updatePolicyFund(
		com.ifli.rapid.model.PolicyFund policyFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundLocalService.updatePolicyFund(policyFund);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyFundLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyFundLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyFundLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyFundLocalService getWrappedPolicyFundLocalService() {
		return _policyFundLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyFundLocalService(
		PolicyFundLocalService policyFundLocalService) {
		_policyFundLocalService = policyFundLocalService;
	}

	@Override
	public PolicyFundLocalService getWrappedService() {
		return _policyFundLocalService;
	}

	@Override
	public void setWrappedService(PolicyFundLocalService policyFundLocalService) {
		_policyFundLocalService = policyFundLocalService;
	}

	private PolicyFundLocalService _policyFundLocalService;
}