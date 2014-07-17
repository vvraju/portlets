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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.model.CRM_Trn_Phone;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the c r m_ trn_ phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PhonePersistenceImpl
 * @see CRM_Trn_PhoneUtil
 * @generated
 */
public interface CRM_Trn_PhonePersistence extends BasePersistence<CRM_Trn_Phone> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CRM_Trn_PhoneUtil} to access the c r m_ trn_ phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

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

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactIdAndPhoneId(
		int ContactId, int PhoneId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone removeByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ phones where ContactId = &#63; and PhoneId = &#63;.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the number of matching c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public int countByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactId(
		int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactId(
		int ContactId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the c r m_ trn_ phone where ContactId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone removeByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ phones where ContactId = &#63;.
	*
	* @param ContactId the contact ID
	* @return the number of matching c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public int countByContactId(int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the c r m_ trn_ phone in the entity cache if it is enabled.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone);

	/**
	* Caches the c r m_ trn_ phones in the entity cache if it is enabled.
	*
	* @param crm_Trn_Phones the c r m_ trn_ phones
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> crm_Trn_Phones);

	/**
	* Creates a new c r m_ trn_ phone with the primary key. Does not add the c r m_ trn_ phone to the database.
	*
	* @param PhoneId the primary key for the new c r m_ trn_ phone
	* @return the new c r m_ trn_ phone
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone create(int PhoneId);

	/**
	* Removes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone remove(int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.CRM_Trn_Phone updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone findByPrimaryKey(
		int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ phone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone, or <code>null</code> if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByPrimaryKey(
		int PhoneId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the c r m_ trn_ phones.
	*
	* @return the c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the c r m_ trn_ phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ phones
	* @param end the upper bound of the range of c r m_ trn_ phones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the c r m_ trn_ phones from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ phones.
	*
	* @return the number of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}