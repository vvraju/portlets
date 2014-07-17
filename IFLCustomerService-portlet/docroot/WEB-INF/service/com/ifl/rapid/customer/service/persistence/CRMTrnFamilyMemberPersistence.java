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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the c r m trn family member service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMemberPersistenceImpl
 * @see CRMTrnFamilyMemberUtil
 * @generated
 */
public interface CRMTrnFamilyMemberPersistence extends BasePersistence<CRMTrnFamilyMember> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CRMTrnFamilyMemberUtil} to access the c r m trn family member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the matching c r m trn family member
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember findByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByContactIdAndMemberId(
		int ContactId, int MemberId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the c r m trn family member where ContactId = &#63; and MemberId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the c r m trn family member that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember removeByContactIdAndMemberId(
		int ContactId, int MemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m trn family members where ContactId = &#63; and MemberId = &#63;.
	*
	* @param ContactId the contact ID
	* @param MemberId the member ID
	* @return the number of matching c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public int countByContactIdAndMemberId(int ContactId, int MemberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the c r m trn family member in the entity cache if it is enabled.
	*
	* @param crmTrnFamilyMember the c r m trn family member
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember);

	/**
	* Caches the c r m trn family members in the entity cache if it is enabled.
	*
	* @param crmTrnFamilyMembers the c r m trn family members
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> crmTrnFamilyMembers);

	/**
	* Creates a new c r m trn family member with the primary key. Does not add the c r m trn family member to the database.
	*
	* @param FamilyMemberId the primary key for the new c r m trn family member
	* @return the new c r m trn family member
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember create(
		int FamilyMemberId);

	/**
	* Removes the c r m trn family member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember remove(
		int FamilyMemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.CRMTrnFamilyMember updateImpl(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m trn family member with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember findByPrimaryKey(
		int FamilyMemberId)
		throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m trn family member with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FamilyMemberId the primary key of the c r m trn family member
	* @return the c r m trn family member, or <code>null</code> if a c r m trn family member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember fetchByPrimaryKey(
		int FamilyMemberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the c r m trn family members.
	*
	* @return the c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifl.rapid.customer.model.CRMTrnFamilyMember> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the c r m trn family members from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m trn family members.
	*
	* @return the number of c r m trn family members
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}