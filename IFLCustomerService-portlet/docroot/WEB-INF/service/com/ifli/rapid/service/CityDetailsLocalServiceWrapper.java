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
 * Provides a wrapper for {@link CityDetailsLocalService}.
 *
 * @author Satya Kola
 * @see CityDetailsLocalService
 * @generated
 */
public class CityDetailsLocalServiceWrapper implements CityDetailsLocalService,
	ServiceWrapper<CityDetailsLocalService> {
	public CityDetailsLocalServiceWrapper(
		CityDetailsLocalService cityDetailsLocalService) {
		_cityDetailsLocalService = cityDetailsLocalService;
	}

	/**
	* Adds the city details to the database. Also notifies the appropriate model listeners.
	*
	* @param cityDetails the city details
	* @return the city details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CityDetails addCityDetails(
		com.ifli.rapid.model.CityDetails cityDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.addCityDetails(cityDetails);
	}

	/**
	* Creates a new city details with the primary key. Does not add the city details to the database.
	*
	* @param CITY_ID the primary key for the new city details
	* @return the new city details
	*/
	@Override
	public com.ifli.rapid.model.CityDetails createCityDetails(int CITY_ID) {
		return _cityDetailsLocalService.createCityDetails(CITY_ID);
	}

	/**
	* Deletes the city details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CITY_ID the primary key of the city details
	* @return the city details that was removed
	* @throws PortalException if a city details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CityDetails deleteCityDetails(int CITY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.deleteCityDetails(CITY_ID);
	}

	/**
	* Deletes the city details from the database. Also notifies the appropriate model listeners.
	*
	* @param cityDetails the city details
	* @return the city details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CityDetails deleteCityDetails(
		com.ifli.rapid.model.CityDetails cityDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.deleteCityDetails(cityDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cityDetailsLocalService.dynamicQuery();
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
		return _cityDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cityDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cityDetailsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _cityDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cityDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.CityDetails fetchCityDetails(int CITY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.fetchCityDetails(CITY_ID);
	}

	/**
	* Returns the city details with the primary key.
	*
	* @param CITY_ID the primary key of the city details
	* @return the city details
	* @throws PortalException if a city details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CityDetails getCityDetails(int CITY_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.getCityDetails(CITY_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the city detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of city detailses
	* @param end the upper bound of the range of city detailses (not inclusive)
	* @return the range of city detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.CityDetails> getCityDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.getCityDetailses(start, end);
	}

	/**
	* Returns the number of city detailses.
	*
	* @return the number of city detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCityDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.getCityDetailsesCount();
	}

	/**
	* Updates the city details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cityDetails the city details
	* @return the city details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CityDetails updateCityDetails(
		com.ifli.rapid.model.CityDetails cityDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cityDetailsLocalService.updateCityDetails(cityDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cityDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cityDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cityDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CityDetailsLocalService getWrappedCityDetailsLocalService() {
		return _cityDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCityDetailsLocalService(
		CityDetailsLocalService cityDetailsLocalService) {
		_cityDetailsLocalService = cityDetailsLocalService;
	}

	@Override
	public CityDetailsLocalService getWrappedService() {
		return _cityDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		CityDetailsLocalService cityDetailsLocalService) {
		_cityDetailsLocalService = cityDetailsLocalService;
	}

	private CityDetailsLocalService _cityDetailsLocalService;
}