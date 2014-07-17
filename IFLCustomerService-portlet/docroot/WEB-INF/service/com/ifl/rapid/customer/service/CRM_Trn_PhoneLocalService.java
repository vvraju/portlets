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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for CRM_Trn_Phone. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Satya Kola
 * @see CRM_Trn_PhoneLocalServiceUtil
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_PhoneLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.CRM_Trn_PhoneLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CRM_Trn_PhoneLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CRM_Trn_PhoneLocalServiceUtil} to access the c r m_ trn_ phone local service. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.CRM_Trn_PhoneLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the c r m_ trn_ phone to the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone addCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new c r m_ trn_ phone with the primary key. Does not add the c r m_ trn_ phone to the database.
	*
	* @param PhoneId the primary key for the new c r m_ trn_ phone
	* @return the new c r m_ trn_ phone
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone createCRM_Trn_Phone(
		int PhoneId);

	/**
	* Deletes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws PortalException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone deleteCRM_Trn_Phone(
		int PhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the c r m_ trn_ phone from the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone deleteCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchCRM_Trn_Phone(
		int PhoneId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone with the primary key.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone
	* @throws PortalException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.CRM_Trn_Phone getCRM_Trn_Phone(
		int PhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> getCRM_Trn_Phones(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ phones.
	*
	* @return the number of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCRM_Trn_PhonesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the c r m_ trn_ phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone updateCRM_Trn_Phone(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the matching c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;
}