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
 * Provides a wrapper for {@link PolicyInfoLocalService}.
 *
 * @author Satya Kola
 * @see PolicyInfoLocalService
 * @generated
 */
public class PolicyInfoLocalServiceWrapper implements PolicyInfoLocalService,
	ServiceWrapper<PolicyInfoLocalService> {
	public PolicyInfoLocalServiceWrapper(
		PolicyInfoLocalService policyInfoLocalService) {
		_policyInfoLocalService = policyInfoLocalService;
	}

	/**
	* Adds the policy info to the database. Also notifies the appropriate model listeners.
	*
	* @param policyInfo the policy info
	* @return the policy info that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo addPolicyInfo(
		com.ifli.rapid.model.PolicyInfo policyInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.addPolicyInfo(policyInfo);
	}

	/**
	* Creates a new policy info with the primary key. Does not add the policy info to the database.
	*
	* @param POLICY_ID the primary key for the new policy info
	* @return the new policy info
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo createPolicyInfo(
		java.lang.String POLICY_ID) {
		return _policyInfoLocalService.createPolicyInfo(POLICY_ID);
	}

	/**
	* Deletes the policy info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the policy info
	* @return the policy info that was removed
	* @throws PortalException if a policy info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo deletePolicyInfo(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.deletePolicyInfo(POLICY_ID);
	}

	/**
	* Deletes the policy info from the database. Also notifies the appropriate model listeners.
	*
	* @param policyInfo the policy info
	* @return the policy info that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo deletePolicyInfo(
		com.ifli.rapid.model.PolicyInfo policyInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.deletePolicyInfo(policyInfo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policyInfoLocalService.dynamicQuery();
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
		return _policyInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyInfoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _policyInfoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _policyInfoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _policyInfoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PolicyInfo fetchPolicyInfo(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.fetchPolicyInfo(POLICY_ID);
	}

	/**
	* Returns the policy info with the primary key.
	*
	* @param POLICY_ID the primary key of the policy info
	* @return the policy info
	* @throws PortalException if a policy info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo getPolicyInfo(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.getPolicyInfo(POLICY_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the policy infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy infos
	* @param end the upper bound of the range of policy infos (not inclusive)
	* @return the range of policy infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PolicyInfo> getPolicyInfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.getPolicyInfos(start, end);
	}

	/**
	* Returns the number of policy infos.
	*
	* @return the number of policy infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPolicyInfosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.getPolicyInfosCount();
	}

	/**
	* Updates the policy info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policyInfo the policy info
	* @return the policy info that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PolicyInfo updatePolicyInfo(
		com.ifli.rapid.model.PolicyInfo policyInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policyInfoLocalService.updatePolicyInfo(policyInfo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policyInfoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policyInfoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policyInfoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PolicyInfoLocalService getWrappedPolicyInfoLocalService() {
		return _policyInfoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPolicyInfoLocalService(
		PolicyInfoLocalService policyInfoLocalService) {
		_policyInfoLocalService = policyInfoLocalService;
	}

	@Override
	public PolicyInfoLocalService getWrappedService() {
		return _policyInfoLocalService;
	}

	@Override
	public void setWrappedService(PolicyInfoLocalService policyInfoLocalService) {
		_policyInfoLocalService = policyInfoLocalService;
	}

	private PolicyInfoLocalService _policyInfoLocalService;
}