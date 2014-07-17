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
 * Provides a wrapper for {@link CRM_Trn_PhoneLocalService}.
 *
 * @author Satya Kola
 * @see CRM_Trn_PhoneLocalService
 * @generated
 */
public class CRM_Trn_PhoneLocalServiceWrapper
	implements CRM_Trn_PhoneLocalService,
		ServiceWrapper<CRM_Trn_PhoneLocalService> {
	public CRM_Trn_PhoneLocalServiceWrapper(
		CRM_Trn_PhoneLocalService crm_Trn_PhoneLocalService) {
		_crm_Trn_PhoneLocalService = crm_Trn_PhoneLocalService;
	}

	/**
	* Adds the c r m_ trn_ phone to the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone addCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.addCRM_Trn_Phone(crm_Trn_Phone);
	}

	/**
	* Creates a new c r m_ trn_ phone with the primary key. Does not add the c r m_ trn_ phone to the database.
	*
	* @param PhoneId the primary key for the new c r m_ trn_ phone
	* @return the new c r m_ trn_ phone
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone createCRM_Trn_Phone(
		int PhoneId) {
		return _crm_Trn_PhoneLocalService.createCRM_Trn_Phone(PhoneId);
	}

	/**
	* Deletes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws PortalException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone deleteCRM_Trn_Phone(
		int PhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.deleteCRM_Trn_Phone(PhoneId);
	}

	/**
	* Deletes the c r m_ trn_ phone from the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone deleteCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.deleteCRM_Trn_Phone(crm_Trn_Phone);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crm_Trn_PhoneLocalService.dynamicQuery();
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
		return _crm_Trn_PhoneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crm_Trn_PhoneLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _crm_Trn_PhoneLocalService.dynamicQuery(dynamicQuery, start,
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
		return _crm_Trn_PhoneLocalService.dynamicQueryCount(dynamicQuery);
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
		return _crm_Trn_PhoneLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchCRM_Trn_Phone(
		int PhoneId) throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.fetchCRM_Trn_Phone(PhoneId);
	}

	/**
	* Returns the c r m_ trn_ phone with the primary key.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone
	* @throws PortalException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone getCRM_Trn_Phone(
		int PhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.getCRM_Trn_Phone(PhoneId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the c r m_ trn_ phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ phones
	* @param end the upper bound of the range of c r m_ trn_ phones (not inclusive)
	* @return the range of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> getCRM_Trn_Phones(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.getCRM_Trn_Phones(start, end);
	}

	/**
	* Returns the number of c r m_ trn_ phones.
	*
	* @return the number of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCRM_Trn_PhonesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.getCRM_Trn_PhonesCount();
	}

	/**
	* Updates the c r m_ trn_ phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone updateCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.updateCRM_Trn_Phone(crm_Trn_Phone);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _crm_Trn_PhoneLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_crm_Trn_PhoneLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _crm_Trn_PhoneLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the matching c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.findByContactIdAndPhoneId(ContactId,
			PhoneId);
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crm_Trn_PhoneLocalService.findByContactId(ContactId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CRM_Trn_PhoneLocalService getWrappedCRM_Trn_PhoneLocalService() {
		return _crm_Trn_PhoneLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCRM_Trn_PhoneLocalService(
		CRM_Trn_PhoneLocalService crm_Trn_PhoneLocalService) {
		_crm_Trn_PhoneLocalService = crm_Trn_PhoneLocalService;
	}

	@Override
	public CRM_Trn_PhoneLocalService getWrappedService() {
		return _crm_Trn_PhoneLocalService;
	}

	@Override
	public void setWrappedService(
		CRM_Trn_PhoneLocalService crm_Trn_PhoneLocalService) {
		_crm_Trn_PhoneLocalService = crm_Trn_PhoneLocalService;
	}

	private CRM_Trn_PhoneLocalService _crm_Trn_PhoneLocalService;
}