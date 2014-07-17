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
 * Provides a wrapper for {@link LocationDetailsLocalService}.
 *
 * @author Satya Kola
 * @see LocationDetailsLocalService
 * @generated
 */
public class LocationDetailsLocalServiceWrapper
	implements LocationDetailsLocalService,
		ServiceWrapper<LocationDetailsLocalService> {
	public LocationDetailsLocalServiceWrapper(
		LocationDetailsLocalService locationDetailsLocalService) {
		_locationDetailsLocalService = locationDetailsLocalService;
	}

	/**
	* Adds the location details to the database. Also notifies the appropriate model listeners.
	*
	* @param locationDetails the location details
	* @return the location details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails addLocationDetails(
		com.ifli.rapid.model.LocationDetails locationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.addLocationDetails(locationDetails);
	}

	/**
	* Creates a new location details with the primary key. Does not add the location details to the database.
	*
	* @param LOCATION_ID the primary key for the new location details
	* @return the new location details
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails createLocationDetails(
		int LOCATION_ID) {
		return _locationDetailsLocalService.createLocationDetails(LOCATION_ID);
	}

	/**
	* Deletes the location details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LOCATION_ID the primary key of the location details
	* @return the location details that was removed
	* @throws PortalException if a location details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails deleteLocationDetails(
		int LOCATION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.deleteLocationDetails(LOCATION_ID);
	}

	/**
	* Deletes the location details from the database. Also notifies the appropriate model listeners.
	*
	* @param locationDetails the location details
	* @return the location details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails deleteLocationDetails(
		com.ifli.rapid.model.LocationDetails locationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.deleteLocationDetails(locationDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _locationDetailsLocalService.dynamicQuery();
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
		return _locationDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _locationDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _locationDetailsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _locationDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _locationDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.LocationDetails fetchLocationDetails(
		int LOCATION_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.fetchLocationDetails(LOCATION_ID);
	}

	/**
	* Returns the location details with the primary key.
	*
	* @param LOCATION_ID the primary key of the location details
	* @return the location details
	* @throws PortalException if a location details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails getLocationDetails(
		int LOCATION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.getLocationDetails(LOCATION_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the location detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of location detailses
	* @param end the upper bound of the range of location detailses (not inclusive)
	* @return the range of location detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.LocationDetails> getLocationDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.getLocationDetailses(start, end);
	}

	/**
	* Returns the number of location detailses.
	*
	* @return the number of location detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLocationDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.getLocationDetailsesCount();
	}

	/**
	* Updates the location details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param locationDetails the location details
	* @return the location details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.LocationDetails updateLocationDetails(
		com.ifli.rapid.model.LocationDetails locationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationDetailsLocalService.updateLocationDetails(locationDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _locationDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_locationDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _locationDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LocationDetailsLocalService getWrappedLocationDetailsLocalService() {
		return _locationDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLocationDetailsLocalService(
		LocationDetailsLocalService locationDetailsLocalService) {
		_locationDetailsLocalService = locationDetailsLocalService;
	}

	@Override
	public LocationDetailsLocalService getWrappedService() {
		return _locationDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		LocationDetailsLocalService locationDetailsLocalService) {
		_locationDetailsLocalService = locationDetailsLocalService;
	}

	private LocationDetailsLocalService _locationDetailsLocalService;
}