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
 * Provides a wrapper for {@link ServiceSubMasterLocalService}.
 *
 * @author Satya Kola
 * @see ServiceSubMasterLocalService
 * @generated
 */
public class ServiceSubMasterLocalServiceWrapper
	implements ServiceSubMasterLocalService,
		ServiceWrapper<ServiceSubMasterLocalService> {
	public ServiceSubMasterLocalServiceWrapper(
		ServiceSubMasterLocalService serviceSubMasterLocalService) {
		_serviceSubMasterLocalService = serviceSubMasterLocalService;
	}

	/**
	* Adds the service sub master to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceSubMaster the service sub master
	* @return the service sub master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster addServiceSubMaster(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.addServiceSubMaster(serviceSubMaster);
	}

	/**
	* Creates a new service sub master with the primary key. Does not add the service sub master to the database.
	*
	* @param SUBMASTER_ID the primary key for the new service sub master
	* @return the new service sub master
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster createServiceSubMaster(
		int SUBMASTER_ID) {
		return _serviceSubMasterLocalService.createServiceSubMaster(SUBMASTER_ID);
	}

	/**
	* Deletes the service sub master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SUBMASTER_ID the primary key of the service sub master
	* @return the service sub master that was removed
	* @throws PortalException if a service sub master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster deleteServiceSubMaster(
		int SUBMASTER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.deleteServiceSubMaster(SUBMASTER_ID);
	}

	/**
	* Deletes the service sub master from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceSubMaster the service sub master
	* @return the service sub master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster deleteServiceSubMaster(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.deleteServiceSubMaster(serviceSubMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceSubMasterLocalService.dynamicQuery();
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
		return _serviceSubMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceSubMasterLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceSubMasterLocalService.dynamicQuery(dynamicQuery, start,
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
		return _serviceSubMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceSubMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.ServiceSubMaster fetchServiceSubMaster(
		int SUBMASTER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.fetchServiceSubMaster(SUBMASTER_ID);
	}

	/**
	* Returns the service sub master with the primary key.
	*
	* @param SUBMASTER_ID the primary key of the service sub master
	* @return the service sub master
	* @throws PortalException if a service sub master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster getServiceSubMaster(
		int SUBMASTER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.getServiceSubMaster(SUBMASTER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service sub masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service sub masters
	* @param end the upper bound of the range of service sub masters (not inclusive)
	* @return the range of service sub masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.ServiceSubMaster> getServiceSubMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.getServiceSubMasters(start, end);
	}

	/**
	* Returns the number of service sub masters.
	*
	* @return the number of service sub masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceSubMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.getServiceSubMastersCount();
	}

	/**
	* Updates the service sub master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceSubMaster the service sub master
	* @return the service sub master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ServiceSubMaster updateServiceSubMaster(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceSubMasterLocalService.updateServiceSubMaster(serviceSubMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceSubMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceSubMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _serviceSubMasterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceSubMasterLocalService getWrappedServiceSubMasterLocalService() {
		return _serviceSubMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceSubMasterLocalService(
		ServiceSubMasterLocalService serviceSubMasterLocalService) {
		_serviceSubMasterLocalService = serviceSubMasterLocalService;
	}

	@Override
	public ServiceSubMasterLocalService getWrappedService() {
		return _serviceSubMasterLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceSubMasterLocalService serviceSubMasterLocalService) {
		_serviceSubMasterLocalService = serviceSubMasterLocalService;
	}

	private ServiceSubMasterLocalService _serviceSubMasterLocalService;
}