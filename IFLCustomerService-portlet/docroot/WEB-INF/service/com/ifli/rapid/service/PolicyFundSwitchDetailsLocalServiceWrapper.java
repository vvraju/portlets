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
 * Provides a wrapper for {@link PolicyFundSwitchDetailsLocalService}.
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetailsLocalService
 * @generated
 */
public class PolicyFundSwitchDetailsLocalServiceWrapper
	implements PolicyFundSwitchDetailsLocalService,
		ServiceWrapper<PolicyFundSwitchDetailsLocalService> {
	public PolicyFundSwitchDetailsLocalServiceWrapper(
		PolicyFundSwitchDetailsLocalService policyFundSwitchDetailsLocalService) {
		_policyFundSwitchDetailsLocalService = policyFundSwitchDetailsLocalService;
	}

	/**
	* Adds the policy fund switch details to the database. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchDetails the policy fund switch details
	* @return the policy fund switch details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails addPolicyFundSwitchDetails(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.addPolicyFundSwitchDetails(policyFundSwitchDetails);
	}

	/**
	* Creates a new policy fund switch details with the primary key. Does not add the policy fund switch details to the database.
	*
	* @param FUND_SWITCH_ID the primary key for the new policy fund switch details
	* @return the new policy fund switch details
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails createPolicyFundSwitchDetails(
		int FUND_SWITCH_ID) {
		return _policyFundSwitchDetailsLocalService.createPolicyFundSwitchDetails(FUND_SWITCH_ID);
	}

	/**
	* Deletes the policy fund switch details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FUND_SWITCH_ID the primary key of the policy fund switch details
	* @return the policy fund switch details that was removed
	* @throws PortalException if a policy fund switch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails deletePolicyFundSwitchDetails(
		int FUND_SWITCH_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.deletePolicyFundSwitchDetails(FUND_SWITCH_ID);
	}

	/**
	* Deletes the policy fund switch details from the database. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchDetails the policy fund switch details
	* @return the policy fund switch details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails deletePolicyFundSwitchDetails(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.deletePolicyFundSwitchDetails(policyFundSwitchDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyFundSwitchDetailsLocalService.dynamicQuery();
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
		return _policyFundSwitchDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundSwitchDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyFundSwitchDetailsLocalService.dynamicQuery(dynamicQuery,
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
		return _policyFundSwitchDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _policyFundSwitchDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails fetchPolicyFundSwitchDetails(
		int FUND_SWITCH_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.fetchPolicyFundSwitchDetails(FUND_SWITCH_ID);
	}

	/**
	* Returns the policy fund switch details with the primary key.
	*
	* @param FUND_SWITCH_ID the primary key of the policy fund switch details
	* @return the policy fund switch details
	* @throws PortalException if a policy fund switch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails getPolicyFundSwitchDetails(
		int FUND_SWITCH_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.getPolicyFundSwitchDetails(FUND_SWITCH_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy fund switch detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch detailses
	* @param end the upper bound of the range of policy fund switch detailses (not inclusive)
	* @return the range of policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyFundSwitchDetails> getPolicyFundSwitchDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.getPolicyFundSwitchDetailses(start,
			end);
	}

	/**
	* Returns the number of policy fund switch detailses.
	*
	* @return the number of policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyFundSwitchDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.getPolicyFundSwitchDetailsesCount();
	}

	/**
	* Updates the policy fund switch details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyFundSwitchDetails the policy fund switch details
	* @return the policy fund switch details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyFundSwitchDetails updatePolicyFundSwitchDetails(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyFundSwitchDetailsLocalService.updatePolicyFundSwitchDetails(policyFundSwitchDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyFundSwitchDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyFundSwitchDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyFundSwitchDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyFundSwitchDetailsLocalService getWrappedPolicyFundSwitchDetailsLocalService() {
		return _policyFundSwitchDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyFundSwitchDetailsLocalService(
		PolicyFundSwitchDetailsLocalService policyFundSwitchDetailsLocalService) {
		_policyFundSwitchDetailsLocalService = policyFundSwitchDetailsLocalService;
	}

	@Override
	public PolicyFundSwitchDetailsLocalService getWrappedService() {
		return _policyFundSwitchDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		PolicyFundSwitchDetailsLocalService policyFundSwitchDetailsLocalService) {
		_policyFundSwitchDetailsLocalService = policyFundSwitchDetailsLocalService;
	}

	private PolicyFundSwitchDetailsLocalService _policyFundSwitchDetailsLocalService;
}