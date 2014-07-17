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

package com.ifli.rapid.service.persistence;

import com.ifli.rapid.model.FundMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the fund master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see FundMasterPersistenceImpl
 * @see FundMasterUtil
 * @generated
 */
public interface FundMasterPersistence extends BasePersistence<FundMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FundMasterUtil} to access the fund master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the fund master where FUND_CODE = &#63; or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the matching fund master
	* @throws com.ifli.rapid.NoSuchFundMasterException if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster findByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster fetchByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster fetchByFUND_CODE(
		java.lang.String FUND_CODE, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the fund master where FUND_CODE = &#63; from the database.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the fund master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster removeByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fund masters where FUND_CODE = &#63;.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the number of matching fund masters
	* @throws SystemException if a system exception occurred
	*/
	public int countByFUND_CODE(java.lang.String FUND_CODE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the fund master in the entity cache if it is enabled.
	*
	* @param fundMaster the fund master
	*/
	public void cacheResult(com.ifli.rapid.model.FundMaster fundMaster);

	/**
	* Caches the fund masters in the entity cache if it is enabled.
	*
	* @param fundMasters the fund masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.FundMaster> fundMasters);

	/**
	* Creates a new fund master with the primary key. Does not add the fund master to the database.
	*
	* @param FUND_ID the primary key for the new fund master
	* @return the new fund master
	*/
	public com.ifli.rapid.model.FundMaster create(int FUND_ID);

	/**
	* Removes the fund master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master that was removed
	* @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster remove(int FUND_ID)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.FundMaster updateImpl(
		com.ifli.rapid.model.FundMaster fundMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fund master with the primary key or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master
	* @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster findByPrimaryKey(int FUND_ID)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the fund master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master, or <code>null</code> if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.FundMaster fetchByPrimaryKey(int FUND_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the fund masters.
	*
	* @return the fund masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.FundMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the fund masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FundMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fund masters
	* @param end the upper bound of the range of fund masters (not inclusive)
	* @return the range of fund masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.FundMaster> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the fund masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FundMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fund masters
	* @param end the upper bound of the range of fund masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fund masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.FundMaster> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the fund masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of fund masters.
	*
	* @return the number of fund masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}