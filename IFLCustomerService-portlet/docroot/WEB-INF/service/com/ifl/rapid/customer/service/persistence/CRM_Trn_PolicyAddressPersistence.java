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

import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the c r m_ trn_ policy address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddressPersistenceImpl
 * @see CRM_Trn_PolicyAddressUtil
 * @generated
 */
public interface CRM_Trn_PolicyAddressPersistence extends BasePersistence<CRM_Trn_PolicyAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CRM_Trn_PolicyAddressUtil} to access the c r m_ trn_ policy address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPolicyNo(
		java.lang.String PolicyNo)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPolicyNo(
		java.lang.String PolicyNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param PolicyNo the policy no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPolicyNo(
		java.lang.String PolicyNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the c r m_ trn_ policy address where PolicyNo = &#63; from the database.
	*
	* @param PolicyNo the policy no
	* @return the c r m_ trn_ policy address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress removeByPolicyNo(
		java.lang.String PolicyNo)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ policy addresses where PolicyNo = &#63;.
	*
	* @param PolicyNo the policy no
	* @return the number of matching c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countByPolicyNo(java.lang.String PolicyNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the c r m_ trn_ policy address in the entity cache if it is enabled.
	*
	* @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress);

	/**
	* Caches the c r m_ trn_ policy addresses in the entity cache if it is enabled.
	*
	* @param crm_Trn_PolicyAddresses the c r m_ trn_ policy addresses
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> crm_Trn_PolicyAddresses);

	/**
	* Creates a new c r m_ trn_ policy address with the primary key. Does not add the c r m_ trn_ policy address to the database.
	*
	* @param PolicyAddressId the primary key for the new c r m_ trn_ policy address
	* @return the new c r m_ trn_ policy address
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress create(
		int PolicyAddressId);

	/**
	* Removes the c r m_ trn_ policy address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress remove(
		int PolicyAddressId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ policy address with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPrimaryKey(
		int PolicyAddressId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c r m_ trn_ policy address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address, or <code>null</code> if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPrimaryKey(
		int PolicyAddressId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the c r m_ trn_ policy addresses.
	*
	* @return the c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the c r m_ trn_ policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ policy addresses
	* @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the c r m_ trn_ policy addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c r m_ trn_ policy addresses.
	*
	* @return the number of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}