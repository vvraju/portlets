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
 * Provides a wrapper for {@link ServiceMasterLocalService}.
 *
 * @author Satya Kola
 * @see ServiceMasterLocalService
 * @generated
 */
public class ServiceMasterLocalServiceWrapper
	implements ServiceMasterLocalService,
		ServiceWrapper<ServiceMasterLocalService> {
	public ServiceMasterLocalServiceWrapper(
		ServiceMasterLocalService serviceMasterLocalService) {
		_serviceMasterLocalService = serviceMasterLocalService;
	}

	/**
	* Adds the service master to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceMaster the service master
	* @return the service master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster addServiceMaster(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.addServiceMaster(serviceMaster);
	}

	/**
	* Creates a new service master with the primary key. Does not add the service master to the database.
	*
	* @param SERVICE_MASTER_ID the primary key for the new service master
	* @return the new service master
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster createServiceMaster(
		int SERVICE_MASTER_ID) {
		return _serviceMasterLocalService.createServiceMaster(SERVICE_MASTER_ID);
	}

	/**
	* Deletes the service master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master that was removed
	* @throws PortalException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster deleteServiceMaster(
		int SERVICE_MASTER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.deleteServiceMaster(SERVICE_MASTER_ID);
	}

	/**
	* Deletes the service master from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceMaster the service master
	* @return the service master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster deleteServiceMaster(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.deleteServiceMaster(serviceMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceMasterLocalService.dynamicQuery();
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
		return _serviceMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceMasterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceMasterLocalService.dynamicQuery(dynamicQuery, start,
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
		return _serviceMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.ServiceMaster fetchServiceMaster(
		int SERVICE_MASTER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.fetchServiceMaster(SERVICE_MASTER_ID);
	}

	/**
	* Returns the service master with the primary key.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master
	* @throws PortalException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster getServiceMaster(
		int SERVICE_MASTER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.getServiceMaster(SERVICE_MASTER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service masters
	* @param end the upper bound of the range of service masters (not inclusive)
	* @return the range of service masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.ServiceMaster> getServiceMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.getServiceMasters(start, end);
	}

	/**
	* Returns the number of service masters.
	*
	* @return the number of service masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.getServiceMastersCount();
	}

	/**
	* Updates the service master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceMaster the service master
	* @return the service master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceMaster updateServiceMaster(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceMasterLocalService.updateServiceMaster(serviceMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _serviceMasterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceMasterLocalService getWrappedServiceMasterLocalService() {
		return _serviceMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceMasterLocalService(
		ServiceMasterLocalService serviceMasterLocalService) {
		_serviceMasterLocalService = serviceMasterLocalService;
	}

	@Override
	public ServiceMasterLocalService getWrappedService() {
		return _serviceMasterLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceMasterLocalService serviceMasterLocalService) {
		_serviceMasterLocalService = serviceMasterLocalService;
	}

	private ServiceMasterLocalService _serviceMasterLocalService;
}