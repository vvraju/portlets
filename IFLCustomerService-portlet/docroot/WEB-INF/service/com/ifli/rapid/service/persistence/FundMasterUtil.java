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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the fund master service. This utility wraps {@link FundMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see FundMasterPersistence
 * @see FundMasterPersistenceImpl
 * @generated
 */
public class FundMasterUtil {
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
	public static void clearCache(FundMaster fundMaster) {
		getPersistence().clearCache(fundMaster);
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
	public static List<FundMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FundMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FundMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FundMaster update(FundMaster fundMaster)
		throws SystemException {
		return getPersistence().update(fundMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FundMaster update(FundMaster fundMaster,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(fundMaster, serviceContext);
	}

	/**
	* Returns the fund master where FUND_CODE = &#63; or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the matching fund master
	* @throws com.ifli.rapid.NoSuchFundMasterException if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster findByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster fetchByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster fetchByFUND_CODE(
		java.lang.String FUND_CODE, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFUND_CODE(FUND_CODE, retrieveFromCache);
	}

	/**
	* Removes the fund master where FUND_CODE = &#63; from the database.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the fund master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster removeByFUND_CODE(
		java.lang.String FUND_CODE)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the number of fund masters where FUND_CODE = &#63;.
	*
	* @param FUND_CODE the f u n d_ c o d e
	* @return the number of matching fund masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFUND_CODE(java.lang.String FUND_CODE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFUND_CODE(FUND_CODE);
	}

	/**
	* Caches the fund master in the entity cache if it is enabled.
	*
	* @param fundMaster the fund master
	*/
	public static void cacheResult(com.ifli.rapid.model.FundMaster fundMaster) {
		getPersistence().cacheResult(fundMaster);
	}

	/**
	* Caches the fund masters in the entity cache if it is enabled.
	*
	* @param fundMasters the fund masters
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.FundMaster> fundMasters) {
		getPersistence().cacheResult(fundMasters);
	}

	/**
	* Creates a new fund master with the primary key. Does not add the fund master to the database.
	*
	* @param FUND_ID the primary key for the new fund master
	* @return the new fund master
	*/
	public static com.ifli.rapid.model.FundMaster create(int FUND_ID) {
		return getPersistence().create(FUND_ID);
	}

	/**
	* Removes the fund master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master that was removed
	* @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster remove(int FUND_ID)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(FUND_ID);
	}

	public static com.ifli.rapid.model.FundMaster updateImpl(
		com.ifli.rapid.model.FundMaster fundMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fundMaster);
	}

	/**
	* Returns the fund master with the primary key or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master
	* @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster findByPrimaryKey(int FUND_ID)
		throws com.ifli.rapid.NoSuchFundMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(FUND_ID);
	}

	/**
	* Returns the fund master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FUND_ID the primary key of the fund master
	* @return the fund master, or <code>null</code> if a fund master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.FundMaster fetchByPrimaryKey(int FUND_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(FUND_ID);
	}

	/**
	* Returns all the fund masters.
	*
	* @return the fund masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.FundMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ifli.rapid.model.FundMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ifli.rapid.model.FundMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the fund masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fund masters.
	*
	* @return the number of fund masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FundMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FundMasterPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					FundMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(FundMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FundMasterPersistence persistence) {
	}

	private static FundMasterPersistence _persistence;
}