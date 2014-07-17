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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c r m_ trn_ phone service. This utility wraps {@link CRM_Trn_PhonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PhonePersistence
 * @see CRM_Trn_PhonePersistenceImpl
 * @generated
 */
public class CRM_Trn_PhoneUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CRM_Trn_Phone crm_Trn_Phone) {
		getPersistence().clearCache(crm_Trn_Phone);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CRM_Trn_Phone> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CRM_Trn_Phone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CRM_Trn_Phone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CRM_Trn_Phone update(CRM_Trn_Phone crm_Trn_Phone)
		throws SystemException {
		return getPersistence().update(crm_Trn_Phone);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CRM_Trn_Phone update(CRM_Trn_Phone crm_Trn_Phone,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(crm_Trn_Phone, serviceContext);
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
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactIdAndPhoneId(ContactId, PhoneId);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactIdAndPhoneId(ContactId, PhoneId);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactIdAndPhoneId(
		int ContactId, int PhoneId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactIdAndPhoneId(ContactId, PhoneId,
			retrieveFromCache);
	}

	/**
	* Removes the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone removeByContactIdAndPhoneId(
		int ContactId, int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByContactIdAndPhoneId(ContactId, PhoneId);
	}

	/**
	* Returns the number of c r m_ trn_ phones where ContactId = &#63; and PhoneId = &#63;.
	*
	* @param ContactId the contact ID
	* @param PhoneId the phone ID
	* @return the number of matching c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByContactIdAndPhoneId(ContactId, PhoneId);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactId(ContactId);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactId(
		int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactId(ContactId);
	}

	/**
	* Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByContactId(
		int ContactId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactId(ContactId, retrieveFromCache);
	}

	/**
	* Removes the c r m_ trn_ phone where ContactId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @return the c r m_ trn_ phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone removeByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByContactId(ContactId);
	}

	/**
	* Returns the number of c r m_ trn_ phones where ContactId = &#63;.
	*
	* @param ContactId the contact ID
	* @return the number of matching c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactId(int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByContactId(ContactId);
	}

	/**
	* Caches the c r m_ trn_ phone in the entity cache if it is enabled.
	*
	* @param crm_Trn_Phone the c r m_ trn_ phone
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone) {
		getPersistence().cacheResult(crm_Trn_Phone);
	}

	/**
	* Caches the c r m_ trn_ phones in the entity cache if it is enabled.
	*
	* @param crm_Trn_Phones the c r m_ trn_ phones
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> crm_Trn_Phones) {
		getPersistence().cacheResult(crm_Trn_Phones);
	}

	/**
	* Creates a new c r m_ trn_ phone with the primary key. Does not add the c r m_ trn_ phone to the database.
	*
	* @param PhoneId the primary key for the new c r m_ trn_ phone
	* @return the new c r m_ trn_ phone
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone create(int PhoneId) {
		return getPersistence().create(PhoneId);
	}

	/**
	* Removes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone remove(int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PhoneId);
	}

	public static com.ifl.rapid.customer.model.CRM_Trn_Phone updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(crm_Trn_Phone);
	}

	/**
	* Returns the c r m_ trn_ phone with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone findByPrimaryKey(
		int PhoneId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PhoneId);
	}

	/**
	* Returns the c r m_ trn_ phone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PhoneId the primary key of the c r m_ trn_ phone
	* @return the c r m_ trn_ phone, or <code>null</code> if a c r m_ trn_ phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Phone fetchByPrimaryKey(
		int PhoneId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PhoneId);
	}

	/**
	* Returns all the c r m_ trn_ phones.
	*
	* @return the c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Phone> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c r m_ trn_ phones from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c r m_ trn_ phones.
	*
	* @return the number of c r m_ trn_ phones
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CRM_Trn_PhonePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CRM_Trn_PhonePersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					CRM_Trn_PhonePersistence.class.getName());

			ReferenceRegistry.registerReference(CRM_Trn_PhoneUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CRM_Trn_PhonePersistence persistence) {
	}

	private static CRM_Trn_PhonePersistence _persistence;
}