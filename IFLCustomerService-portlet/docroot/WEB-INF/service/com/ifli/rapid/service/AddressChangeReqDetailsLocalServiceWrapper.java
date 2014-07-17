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
 * Provides a wrapper for {@link AddressChangeReqDetailsLocalService}.
 *
 * @author Satya Kola
 * @see AddressChangeReqDetailsLocalService
 * @generated
 */
public class AddressChangeReqDetailsLocalServiceWrapper
	implements AddressChangeReqDetailsLocalService,
		ServiceWrapper<AddressChangeReqDetailsLocalService> {
	public AddressChangeReqDetailsLocalServiceWrapper(
		AddressChangeReqDetailsLocalService addressChangeReqDetailsLocalService) {
		_addressChangeReqDetailsLocalService = addressChangeReqDetailsLocalService;
	}

	/**
	* Adds the address change req details to the database. Also notifies the appropriate model listeners.
	*
	* @param addressChangeReqDetails the address change req details
	* @return the address change req details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails addAddressChangeReqDetails(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.addAddressChangeReqDetails(addressChangeReqDetails);
	}

	/**
	* Creates a new address change req details with the primary key. Does not add the address change req details to the database.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key for the new address change req details
	* @return the new address change req details
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails createAddressChangeReqDetails(
		int ADDR_CHANGE_DETAILS_ID) {
		return _addressChangeReqDetailsLocalService.createAddressChangeReqDetails(ADDR_CHANGE_DETAILS_ID);
	}

	/**
	* Deletes the address change req details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	* @return the address change req details that was removed
	* @throws PortalException if a address change req details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails deleteAddressChangeReqDetails(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.deleteAddressChangeReqDetails(ADDR_CHANGE_DETAILS_ID);
	}

	/**
	* Deletes the address change req details from the database. Also notifies the appropriate model listeners.
	*
	* @param addressChangeReqDetails the address change req details
	* @return the address change req details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails deleteAddressChangeReqDetails(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.deleteAddressChangeReqDetails(addressChangeReqDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addressChangeReqDetailsLocalService.dynamicQuery();
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
		return _addressChangeReqDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressChangeReqDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressChangeReqDetailsLocalService.dynamicQuery(dynamicQuery,
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
		return _addressChangeReqDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _addressChangeReqDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails fetchAddressChangeReqDetails(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.fetchAddressChangeReqDetails(ADDR_CHANGE_DETAILS_ID);
	}

	/**
	* Returns the address change req details with the primary key.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	* @return the address change req details
	* @throws PortalException if a address change req details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails getAddressChangeReqDetails(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.getAddressChangeReqDetails(ADDR_CHANGE_DETAILS_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the address change req detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address change req detailses
	* @param end the upper bound of the range of address change req detailses (not inclusive)
	* @return the range of address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.AddressChangeReqDetails> getAddressChangeReqDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.getAddressChangeReqDetailses(start,
			end);
	}

	/**
	* Returns the number of address change req detailses.
	*
	* @return the number of address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAddressChangeReqDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.getAddressChangeReqDetailsesCount();
	}

	/**
	* Updates the address change req details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param addressChangeReqDetails the address change req details
	* @return the address change req details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails updateAddressChangeReqDetails(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressChangeReqDetailsLocalService.updateAddressChangeReqDetails(addressChangeReqDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _addressChangeReqDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_addressChangeReqDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _addressChangeReqDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AddressChangeReqDetailsLocalService getWrappedAddressChangeReqDetailsLocalService() {
		return _addressChangeReqDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAddressChangeReqDetailsLocalService(
		AddressChangeReqDetailsLocalService addressChangeReqDetailsLocalService) {
		_addressChangeReqDetailsLocalService = addressChangeReqDetailsLocalService;
	}

	@Override
	public AddressChangeReqDetailsLocalService getWrappedService() {
		return _addressChangeReqDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AddressChangeReqDetailsLocalService addressChangeReqDetailsLocalService) {
		_addressChangeReqDetailsLocalService = addressChangeReqDetailsLocalService;
	}

	private AddressChangeReqDetailsLocalService _addressChangeReqDetailsLocalService;
}