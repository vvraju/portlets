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

package com.ifl.rapid.customer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CRM_Trn_PolicyAddressLocalService}.
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddressLocalService
 * @generated
 */
public class CRM_Trn_PolicyAddressLocalServiceWrapper
	implements CRM_Trn_PolicyAddressLocalService,
		ServiceWrapper<CRM_Trn_PolicyAddressLocalService> {
	public CRM_Trn_PolicyAddressLocalServiceWrapper(
		CRM_Trn_PolicyAddressLocalService crm_Trn_PolicyAddressLocalService) {
		_crm_Trn_PolicyAddressLocalService = crm_Trn_PolicyAddressLocalService;
	}

	/**
	* Adds the c r m_ trn_ policy address to the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress addCRM_Trn_PolicyAddress(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.addCRM_Trn_PolicyAddress(crm_Trn_PolicyAddress);
	}

	/**
	* Creates a new c r m_ trn_ policy address with the primary key. Does not add the c r m_ trn_ policy address to the database.
	*
	* @param PolicyAddressId the primary key for the new c r m_ trn_ policy address
	* @return the new c r m_ trn_ policy address
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress createCRM_Trn_PolicyAddress(
		int PolicyAddressId) {
		return _crm_Trn_PolicyAddressLocalService.createCRM_Trn_PolicyAddress(PolicyAddressId);
	}

	/**
	* Deletes the c r m_ trn_ policy address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was removed
	* @throws PortalException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress deleteCRM_Trn_PolicyAddress(
		int PolicyAddressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.deleteCRM_Trn_PolicyAddress(PolicyAddressId);
	}

	/**
	* Deletes the c r m_ trn_ policy address from the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress deleteCRM_Trn_PolicyAddress(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.deleteCRM_Trn_PolicyAddress(crm_Trn_PolicyAddress);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crm_Trn_PolicyAddressLocalService.dynamicQuery();
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
		return _crm_Trn_PolicyAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crm_Trn_PolicyAddressLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crm_Trn_PolicyAddressLocalService.dynamicQuery(dynamicQuery,
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
		return _crm_Trn_PolicyAddressLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crm_Trn_PolicyAddressLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchCRM_Trn_PolicyAddress(
		int PolicyAddressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.fetchCRM_Trn_PolicyAddress(PolicyAddressId);
	}

	/**
	* Returns the c r m_ trn_ policy address with the primary key.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address
	* @throws PortalException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress getCRM_Trn_PolicyAddress(
		int PolicyAddressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.getCRM_Trn_PolicyAddress(PolicyAddressId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the c r m_ trn_ policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ policy addresses
	* @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	* @return the range of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> getCRM_Trn_PolicyAddresses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.getCRM_Trn_PolicyAddresses(start,
			end);
	}

	/**
	* Returns the number of c r m_ trn_ policy addresses.
	*
	* @return the number of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCRM_Trn_PolicyAddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.getCRM_Trn_PolicyAddressesCount();
	}

	/**
	* Updates the c r m_ trn_ policy address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress updateCRM_Trn_PolicyAddress(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.updateCRM_Trn_PolicyAddress(crm_Trn_PolicyAddress);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _crm_Trn_PolicyAddressLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_crm_Trn_PolicyAddressLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _crm_Trn_PolicyAddressLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPolicyNo(
		java.lang.String PolicyNo)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PolicyAddressLocalService.findByPolicyNo(PolicyNo);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CRM_Trn_PolicyAddressLocalService getWrappedCRM_Trn_PolicyAddressLocalService() {
		return _crm_Trn_PolicyAddressLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCRM_Trn_PolicyAddressLocalService(
		CRM_Trn_PolicyAddressLocalService crm_Trn_PolicyAddressLocalService) {
		_crm_Trn_PolicyAddressLocalService = crm_Trn_PolicyAddressLocalService;
	}

	@Override
	public CRM_Trn_PolicyAddressLocalService getWrappedService() {
		return _crm_Trn_PolicyAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CRM_Trn_PolicyAddressLocalService crm_Trn_PolicyAddressLocalService) {
		_crm_Trn_PolicyAddressLocalService = crm_Trn_PolicyAddressLocalService;
	}

	private CRM_Trn_PolicyAddressLocalService _crm_Trn_PolicyAddressLocalService;
}