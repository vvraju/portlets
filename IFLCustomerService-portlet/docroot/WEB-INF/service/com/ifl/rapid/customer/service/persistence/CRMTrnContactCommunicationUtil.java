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

import com.ifl.rapid.customer.model.CRMTrnContactCommunication;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c r m trn contact communication service. This utility wraps {@link CRMTrnContactCommunicationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunicationPersistence
 * @see CRMTrnContactCommunicationPersistenceImpl
 * @generated
 */
public class CRMTrnContactCommunicationUtil {
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
	public static void clearCache(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		getPersistence().clearCache(crmTrnContactCommunication);
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
	public static List<CRMTrnContactCommunication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CRMTrnContactCommunication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CRMTrnContactCommunication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CRMTrnContactCommunication update(
		CRMTrnContactCommunication crmTrnContactCommunication)
		throws SystemException {
		return getPersistence().update(crmTrnContactCommunication);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CRMTrnContactCommunication update(
		CRMTrnContactCommunication crmTrnContactCommunication,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(crmTrnContactCommunication, serviceContext);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the matching c r m trn contact communication
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication fetchByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication fetchByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium, retrieveFromCache);
	}

	/**
	* Removes the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the c r m trn contact communication that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication removeByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium);
	}

	/**
	* Returns the number of c r m trn contact communications where ContactId = &#63; and CommunicationMedium = &#63;.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the number of matching c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactIdAndCommunicationMedium(int ContactId,
		int CommunicationMedium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching c r m trn contact communication
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactId(ContactId);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication fetchByContactId(
		int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactId(ContactId);
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication fetchByContactId(
		int ContactId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactId(ContactId, retrieveFromCache);
	}

	/**
	* Removes the c r m trn contact communication where ContactId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @return the c r m trn contact communication that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication removeByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByContactId(ContactId);
	}

	/**
	* Returns the number of c r m trn contact communications where ContactId = &#63;.
	*
	* @param ContactId the contact ID
	* @return the number of matching c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactId(int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByContactId(ContactId);
	}

	/**
	* Caches the c r m trn contact communication in the entity cache if it is enabled.
	*
	* @param crmTrnContactCommunication the c r m trn contact communication
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.CRMTrnContactCommunication crmTrnContactCommunication) {
		getPersistence().cacheResult(crmTrnContactCommunication);
	}

	/**
	* Caches the c r m trn contact communications in the entity cache if it is enabled.
	*
	* @param crmTrnContactCommunications the c r m trn contact communications
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRMTrnContactCommunication> crmTrnContactCommunications) {
		getPersistence().cacheResult(crmTrnContactCommunications);
	}

	/**
	* Creates a new c r m trn contact communication with the primary key. Does not add the c r m trn contact communication to the database.
	*
	* @param ContactCommunicationId the primary key for the new c r m trn contact communication
	* @return the new c r m trn contact communication
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication create(
		int ContactCommunicationId) {
		return getPersistence().create(ContactCommunicationId);
	}

	/**
	* Removes the c r m trn contact communication with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ContactCommunicationId the primary key of the c r m trn contact communication
	* @return the c r m trn contact communication that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication remove(
		int ContactCommunicationId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ContactCommunicationId);
	}

	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication updateImpl(
		com.ifl.rapid.customer.model.CRMTrnContactCommunication crmTrnContactCommunication)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(crmTrnContactCommunication);
	}

	/**
	* Returns the c r m trn contact communication with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	*
	* @param ContactCommunicationId the primary key of the c r m trn contact communication
	* @return the c r m trn contact communication
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication findByPrimaryKey(
		int ContactCommunicationId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ContactCommunicationId);
	}

	/**
	* Returns the c r m trn contact communication with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ContactCommunicationId the primary key of the c r m trn contact communication
	* @return the c r m trn contact communication, or <code>null</code> if a c r m trn contact communication with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnContactCommunication fetchByPrimaryKey(
		int ContactCommunicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ContactCommunicationId);
	}

	/**
	* Returns all the c r m trn contact communications.
	*
	* @return the c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnContactCommunication> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c r m trn contact communications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m trn contact communications
	* @param end the upper bound of the range of c r m trn contact communications (not inclusive)
	* @return the range of c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnContactCommunication> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c r m trn contact communications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m trn contact communications
	* @param end the upper bound of the range of c r m trn contact communications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnContactCommunication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c r m trn contact communications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c r m trn contact communications.
	*
	* @return the number of c r m trn contact communications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CRMTrnContactCommunicationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CRMTrnContactCommunicationPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					CRMTrnContactCommunicationPersistence.class.getName());

			ReferenceRegistry.registerReference(CRMTrnContactCommunicationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		CRMTrnContactCommunicationPersistence persistence) {
	}

	private static CRMTrnContactCommunicationPersistence _persistence;
}