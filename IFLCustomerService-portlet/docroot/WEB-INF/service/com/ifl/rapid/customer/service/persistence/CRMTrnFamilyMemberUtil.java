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

import com.ifl.rapid.customer.model.CRMTrnFamilyMember;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c r m trn family member service. This utility wraps {@link CRMTrnFamilyMemberPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMemberPersistence
 * @see CRMTrnFamilyMemberPersistenceImpl
 * @generated
 */
public class CRMTrnFamilyMemberUtil {
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
	public static void clearCache(CRMTrnFamilyMember crmTrnFamilyMember) {
		getPersistence().clearCache(crmTrnFamilyMember);
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
	public static List<CRMTrnFamilyMember> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CRMTrnFamilyMember> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CRMTrnFamilyMember> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CRMTrnFamilyMember update(
		CRMTrnFamilyMember crmTrnFamilyMember) throws SystemException {
		return getPersistence().update(crmTrnFamilyMember);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CRMTrnFamilyMember update(
		CRMTrnFamilyMember crmTrnFamilyMember, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(crmTrnFamilyMember, serviceContext);
	}

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the matching c r m trn family member
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember findByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactIdAndMemberId(ContactId, MemberId);
	}

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByContactIdAndMemberId(ContactId, MemberId);
	}

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByContactIdAndMemberId(
		int ContactId, int MemberId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactIdAndMemberId(ContactId, MemberId,
			retrieveFromCache);
	}

	/**
	* Removes the c r m trn family member where ContactId = &#63; and MemberId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the c r m trn family member that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember removeByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByContactIdAndMemberId(ContactId, MemberId);
	}

	/**
	* Returns the number of c r m trn family members where ContactId = &#63; and MemberId = &#63;.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the number of matching c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactIdAndMemberId(int ContactId, int MemberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByContactIdAndMemberId(ContactId, MemberId);
	}

	/**
	* Caches the c r m trn family member in the entity cache if it is enabled.
	*
	* @param crmTrnFamilyMember the c r m trn family member
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember) {
		getPersistence().cacheResult(crmTrnFamilyMember);
	}

	/**
	* Caches the c r m trn family members in the entity cache if it is enabled.
	*
	* @param crmTrnFamilyMembers the c r m trn family members
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> crmTrnFamilyMembers) {
		getPersistence().cacheResult(crmTrnFamilyMembers);
	}

	/**
	* Creates a new c r m trn family member with the primary key. Does not add the c r m trn family member to the database.
	*
	* @param FamilyMemberId the primary key for the new c r m trn family member
	* @return the new c r m trn family member
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember create(
		int FamilyMemberId) {
		return getPersistence().create(FamilyMemberId);
	}

	/**
	* Removes the c r m trn family member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember remove(
		int FamilyMemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(FamilyMemberId);
	}

	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember updateImpl(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(crmTrnFamilyMember);
	}

	/**
	* Returns the c r m trn family member with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember findByPrimaryKey(
		int FamilyMemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(FamilyMemberId);
	}

	/**
	* Returns the c r m trn family member with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member, or <code>null</code> if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByPrimaryKey(
		int FamilyMemberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(FamilyMemberId);
	}

	/**
	* Returns all the c r m trn family members.
	*
	* @return the c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c r m trn family members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m trn family members
	* @param end the upper bound of the range of c r m trn family members (not inclusive)
	* @return the range of c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c r m trn family members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m trn family members
	* @param end the upper bound of the range of c r m trn family members (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c r m trn family members from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c r m trn family members.
	*
	* @return the number of c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CRMTrnFamilyMemberPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CRMTrnFamilyMemberPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					CRMTrnFamilyMemberPersistence.class.getName());

			ReferenceRegistry.registerReference(CRMTrnFamilyMemberUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CRMTrnFamilyMemberPersistence persistence) {
	}

	private static CRMTrnFamilyMemberPersistence _persistence;
}