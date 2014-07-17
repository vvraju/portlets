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
 * Provides a wrapper for {@link AddressTypeLocalService}.
 *
 * @author Satya Kola
 * @see AddressTypeLocalService
 * @generated
 */
public class AddressTypeLocalServiceWrapper implements AddressTypeLocalService,
	ServiceWrapper<AddressTypeLocalService> {
	public AddressTypeLocalServiceWrapper(
		AddressTypeLocalService addressTypeLocalService) {
		_addressTypeLocalService = addressTypeLocalService;
	}

	/**
	* Adds the address type to the database. Also notifies the appropriate model listeners.
	*
	* @param addressType the address type
	* @return the address type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressType addAddressType(
		com.ifli.rapid.model.AddressType addressType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.addAddressType(addressType);
	}

	/**
	* Creates a new address type with the primary key. Does not add the address type to the database.
	*
	* @param ADDRESS_TYPE_ID the primary key for the new address type
	* @return the new address type
	*/
	@Override
	public com.ifli.rapid.model.AddressType createAddressType(
		int ADDRESS_TYPE_ID) {
		return _addressTypeLocalService.createAddressType(ADDRESS_TYPE_ID);
	}

	/**
	* Deletes the address type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ADDRESS_TYPE_ID the primary key of the address type
	* @return the address type that was removed
	* @throws PortalException if a address type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressType deleteAddressType(
		int ADDRESS_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.deleteAddressType(ADDRESS_TYPE_ID);
	}

	/**
	* Deletes the address type from the database. Also notifies the appropriate model listeners.
	*
	* @param addressType the address type
	* @return the address type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressType deleteAddressType(
		com.ifli.rapid.model.AddressType addressType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.deleteAddressType(addressType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addressTypeLocalService.dynamicQuery();
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
		return _addressTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressTypeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _addressTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _addressTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.AddressType fetchAddressType(
		int ADDRESS_TYPE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.fetchAddressType(ADDRESS_TYPE_ID);
	}

	/**
	* Returns the address type with the primary key.
	*
	* @param ADDRESS_TYPE_ID the primary key of the address type
	* @return the address type
	* @throws PortalException if a address type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressType getAddressType(int ADDRESS_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.getAddressType(ADDRESS_TYPE_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the address types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address types
	* @param end the upper bound of the range of address types (not inclusive)
	* @return the range of address types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.AddressType> getAddressTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.getAddressTypes(start, end);
	}

	/**
	* Returns the number of address types.
	*
	* @return the number of address types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAddressTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.getAddressTypesCount();
	}

	/**
	* Updates the address type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param addressType the address type
	* @return the address type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressType updateAddressType(
		com.ifli.rapid.model.AddressType addressType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressTypeLocalService.updateAddressType(addressType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _addressTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_addressTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _addressTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AddressTypeLocalService getWrappedAddressTypeLocalService() {
		return _addressTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAddressTypeLocalService(
		AddressTypeLocalService addressTypeLocalService) {
		_addressTypeLocalService = addressTypeLocalService;
	}

	@Override
	public AddressTypeLocalService getWrappedService() {
		return _addressTypeLocalService;
	}

	@Override
	public void setWrappedService(
		AddressTypeLocalService addressTypeLocalService) {
		_addressTypeLocalService = addressTypeLocalService;
	}

	private AddressTypeLocalService _addressTypeLocalService;
}