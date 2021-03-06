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
 * Provides a wrapper for {@link ClosedServiceRequestsLocalService}.
 *
 * @author Satya Kola
 * @see ClosedServiceRequestsLocalService
 * @generated
 */
public class ClosedServiceRequestsLocalServiceWrapper
	implements ClosedServiceRequestsLocalService,
		ServiceWrapper<ClosedServiceRequestsLocalService> {
	public ClosedServiceRequestsLocalServiceWrapper(
		ClosedServiceRequestsLocalService closedServiceRequestsLocalService) {
		_closedServiceRequestsLocalService = closedServiceRequestsLocalService;
	}

	/**
	* Adds the closed service requests to the database. Also notifies the appropriate model listeners.
	*
	* @param closedServiceRequests the closed service requests
	* @return the closed service requests that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests addClosedServiceRequests(
		com.ifli.rapid.model.ClosedServiceRequests closedServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.addClosedServiceRequests(closedServiceRequests);
	}

	/**
	* Creates a new closed service requests with the primary key. Does not add the closed service requests to the database.
	*
	* @param QRC_CSR_ID the primary key for the new closed service requests
	* @return the new closed service requests
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests createClosedServiceRequests(
		int QRC_CSR_ID) {
		return _closedServiceRequestsLocalService.createClosedServiceRequests(QRC_CSR_ID);
	}

	/**
	* Deletes the closed service requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_CSR_ID the primary key of the closed service requests
	* @return the closed service requests that was removed
	* @throws PortalException if a closed service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests deleteClosedServiceRequests(
		int QRC_CSR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.deleteClosedServiceRequests(QRC_CSR_ID);
	}

	/**
	* Deletes the closed service requests from the database. Also notifies the appropriate model listeners.
	*
	* @param closedServiceRequests the closed service requests
	* @return the closed service requests that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests deleteClosedServiceRequests(
		com.ifli.rapid.model.ClosedServiceRequests closedServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.deleteClosedServiceRequests(closedServiceRequests);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _closedServiceRequestsLocalService.dynamicQuery();
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
		return _closedServiceRequestsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _closedServiceRequestsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _closedServiceRequestsLocalService.dynamicQuery(dynamicQuery,
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
		return _closedServiceRequestsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _closedServiceRequestsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.ClosedServiceRequests fetchClosedServiceRequests(
		int QRC_CSR_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.fetchClosedServiceRequests(QRC_CSR_ID);
	}

	/**
	* Returns the closed service requests with the primary key.
	*
	* @param QRC_CSR_ID the primary key of the closed service requests
	* @return the closed service requests
	* @throws PortalException if a closed service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests getClosedServiceRequests(
		int QRC_CSR_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.getClosedServiceRequests(QRC_CSR_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the closed service requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of closed service requestses
	* @param end the upper bound of the range of closed service requestses (not inclusive)
	* @return the range of closed service requestses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.ClosedServiceRequests> getClosedServiceRequestses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.getClosedServiceRequestses(start,
			end);
	}

	/**
	* Returns the number of closed service requestses.
	*
	* @return the number of closed service requestses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getClosedServiceRequestsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.getClosedServiceRequestsesCount();
	}

	/**
	* Updates the closed service requests in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param closedServiceRequests the closed service requests
	* @return the closed service requests that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ClosedServiceRequests updateClosedServiceRequests(
		com.ifli.rapid.model.ClosedServiceRequests closedServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _closedServiceRequestsLocalService.updateClosedServiceRequests(closedServiceRequests);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _closedServiceRequestsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_closedServiceRequestsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _closedServiceRequestsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ClosedServiceRequestsLocalService getWrappedClosedServiceRequestsLocalService() {
		return _closedServiceRequestsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedClosedServiceRequestsLocalService(
		ClosedServiceRequestsLocalService closedServiceRequestsLocalService) {
		_closedServiceRequestsLocalService = closedServiceRequestsLocalService;
	}

	@Override
	public ClosedServiceRequestsLocalService getWrappedService() {
		return _closedServiceRequestsLocalService;
	}

	@Override
	public void setWrappedService(
		ClosedServiceRequestsLocalService closedServiceRequestsLocalService) {
		_closedServiceRequestsLocalService = closedServiceRequestsLocalService;
	}

	private ClosedServiceRequestsLocalService _closedServiceRequestsLocalService;
}