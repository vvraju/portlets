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
 * Provides a wrapper for {@link RenewalDetailsLocalService}.
 *
 * @author Satya Kola
 * @see RenewalDetailsLocalService
 * @generated
 */
public class RenewalDetailsLocalServiceWrapper
	implements RenewalDetailsLocalService,
		ServiceWrapper<RenewalDetailsLocalService> {
	public RenewalDetailsLocalServiceWrapper(
		RenewalDetailsLocalService renewalDetailsLocalService) {
		_renewalDetailsLocalService = renewalDetailsLocalService;
	}

	/**
	* Adds the renewal details to the database. Also notifies the appropriate model listeners.
	*
	* @param renewalDetails the renewal details
	* @return the renewal details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails addRenewalDetails(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.addRenewalDetails(renewalDetails);
	}

	/**
	* Creates a new renewal details with the primary key. Does not add the renewal details to the database.
	*
	* @param POLICY_ID the primary key for the new renewal details
	* @return the new renewal details
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails createRenewalDetails(
		long POLICY_ID) {
		return _renewalDetailsLocalService.createRenewalDetails(POLICY_ID);
	}

	/**
	* Deletes the renewal details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details that was removed
	* @throws PortalException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails deleteRenewalDetails(
		long POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.deleteRenewalDetails(POLICY_ID);
	}

	/**
	* Deletes the renewal details from the database. Also notifies the appropriate model listeners.
	*
	* @param renewalDetails the renewal details
	* @return the renewal details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails deleteRenewalDetails(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.deleteRenewalDetails(renewalDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _renewalDetailsLocalService.dynamicQuery();
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
		return _renewalDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _renewalDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _renewalDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _renewalDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _renewalDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.RenewalDetails fetchRenewalDetails(
		long POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.fetchRenewalDetails(POLICY_ID);
	}

	/**
	* Returns the renewal details with the primary key.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details
	* @throws PortalException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails getRenewalDetails(long POLICY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.getRenewalDetails(POLICY_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the renewal detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of renewal detailses
	* @param end the upper bound of the range of renewal detailses (not inclusive)
	* @return the range of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.RenewalDetails> getRenewalDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.getRenewalDetailses(start, end);
	}

	/**
	* Returns the number of renewal detailses.
	*
	* @return the number of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRenewalDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.getRenewalDetailsesCount();
	}

	/**
	* Updates the renewal details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param renewalDetails the renewal details
	* @return the renewal details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.RenewalDetails updateRenewalDetails(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _renewalDetailsLocalService.updateRenewalDetails(renewalDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _renewalDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_renewalDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _renewalDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RenewalDetailsLocalService getWrappedRenewalDetailsLocalService() {
		return _renewalDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRenewalDetailsLocalService(
		RenewalDetailsLocalService renewalDetailsLocalService) {
		_renewalDetailsLocalService = renewalDetailsLocalService;
	}

	@Override
	public RenewalDetailsLocalService getWrappedService() {
		return _renewalDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		RenewalDetailsLocalService renewalDetailsLocalService) {
		_renewalDetailsLocalService = renewalDetailsLocalService;
	}

	private RenewalDetailsLocalService _renewalDetailsLocalService;
}