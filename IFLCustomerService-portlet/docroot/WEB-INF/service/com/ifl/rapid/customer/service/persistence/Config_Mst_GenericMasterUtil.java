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

import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the config_ mst_ generic master service. This utility wraps {@link Config_Mst_GenericMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterPersistence
 * @see Config_Mst_GenericMasterPersistenceImpl
 * @generated
 */
public class Config_Mst_GenericMasterUtil {
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
		Config_Mst_GenericMaster config_Mst_GenericMaster) {
		getPersistence().clearCache(config_Mst_GenericMaster);
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
	public static List<Config_Mst_GenericMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Config_Mst_GenericMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Config_Mst_GenericMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Config_Mst_GenericMaster update(
		Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws SystemException {
		return getPersistence().update(config_Mst_GenericMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Config_Mst_GenericMaster update(
		Config_Mst_GenericMaster config_Mst_GenericMaster,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(config_Mst_GenericMaster, serviceContext);
	}

	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param GenericMasterId the generic master ID
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByGenericMasterId(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param GenericMasterId the generic master ID
	* @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByGenericMasterId(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param GenericMasterId the generic master ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByGenericMasterId(
		int GenericMasterId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGenericMasterId(GenericMasterId, retrieveFromCache);
	}

	/**
	* Removes the config_ mst_ generic master where GenericMasterId = &#63; from the database.
	*
	* @param GenericMasterId the generic master ID
	* @return the config_ mst_ generic master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster removeByGenericMasterId(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the number of config_ mst_ generic masters where GenericMasterId = &#63;.
	*
	* @param GenericMasterId the generic master ID
	* @return the number of matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGenericMasterId(int GenericMasterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMasterTypeAndMasterKey(MasterType, MasterKey);
	}

	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMasterTypeAndMasterKey(MasterType, MasterKey);
	}

	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMasterTypeAndMasterKey(MasterType, MasterKey,
			retrieveFromCache);
	}

	/**
	* Removes the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; from the database.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the config_ mst_ generic master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster removeByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByMasterTypeAndMasterKey(MasterType, MasterKey);
	}

	/**
	* Returns the number of config_ mst_ generic masters where MasterType = &#63; and MasterKey = &#63;.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the number of matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMasterTypeAndMasterKey(MasterType, MasterKey);
	}

	/**
	* Returns all the config_ mst_ generic masters where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @return the matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findByMasterType(
		java.lang.String MasterType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMasterType(MasterType);
	}

	/**
	* Returns a range of all the config_ mst_ generic masters where MasterType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param MasterType the master type
	* @param start the lower bound of the range of config_ mst_ generic masters
	* @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	* @return the range of matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findByMasterType(
		java.lang.String MasterType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMasterType(MasterType, start, end);
	}

	/**
	* Returns an ordered range of all the config_ mst_ generic masters where MasterType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param MasterType the master type
	* @param start the lower bound of the range of config_ mst_ generic masters
	* @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findByMasterType(
		java.lang.String MasterType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMasterType(MasterType, start, end, orderByComparator);
	}

	/**
	* Returns the first config_ mst_ generic master in the ordered set where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterType_First(
		java.lang.String MasterType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMasterType_First(MasterType, orderByComparator);
	}

	/**
	* Returns the first config_ mst_ generic master in the ordered set where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByMasterType_First(
		java.lang.String MasterType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMasterType_First(MasterType, orderByComparator);
	}

	/**
	* Returns the last config_ mst_ generic master in the ordered set where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterType_Last(
		java.lang.String MasterType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMasterType_Last(MasterType, orderByComparator);
	}

	/**
	* Returns the last config_ mst_ generic master in the ordered set where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByMasterType_Last(
		java.lang.String MasterType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMasterType_Last(MasterType, orderByComparator);
	}

	/**
	* Returns the config_ mst_ generic masters before and after the current config_ mst_ generic master in the ordered set where MasterType = &#63;.
	*
	* @param GenericMasterId the primary key of the current config_ mst_ generic master
	* @param MasterType the master type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster[] findByMasterType_PrevAndNext(
		int GenericMasterId, java.lang.String MasterType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMasterType_PrevAndNext(GenericMasterId, MasterType,
			orderByComparator);
	}

	/**
	* Removes all the config_ mst_ generic masters where MasterType = &#63; from the database.
	*
	* @param MasterType the master type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMasterType(java.lang.String MasterType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMasterType(MasterType);
	}

	/**
	* Returns the number of config_ mst_ generic masters where MasterType = &#63;.
	*
	* @param MasterType the master type
	* @return the number of matching config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMasterType(java.lang.String MasterType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMasterType(MasterType);
	}

	/**
	* Caches the config_ mst_ generic master in the entity cache if it is enabled.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster) {
		getPersistence().cacheResult(config_Mst_GenericMaster);
	}

	/**
	* Caches the config_ mst_ generic masters in the entity cache if it is enabled.
	*
	* @param config_Mst_GenericMasters the config_ mst_ generic masters
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> config_Mst_GenericMasters) {
		getPersistence().cacheResult(config_Mst_GenericMasters);
	}

	/**
	* Creates a new config_ mst_ generic master with the primary key. Does not add the config_ mst_ generic master to the database.
	*
	* @param GenericMasterId the primary key for the new config_ mst_ generic master
	* @return the new config_ mst_ generic master
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster create(
		int GenericMasterId) {
		return getPersistence().create(GenericMasterId);
	}

	/**
	* Removes the config_ mst_ generic master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master that was removed
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster remove(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(GenericMasterId);
	}

	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster updateImpl(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(config_Mst_GenericMaster);
	}

	/**
	* Returns the config_ mst_ generic master with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByPrimaryKey(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master, or <code>null</code> if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchByPrimaryKey(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(GenericMasterId);
	}

	/**
	* Returns all the config_ mst_ generic masters.
	*
	* @return the config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the config_ mst_ generic masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of config_ mst_ generic masters
	* @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	* @return the range of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the config_ mst_ generic masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of config_ mst_ generic masters
	* @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the config_ mst_ generic masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of config_ mst_ generic masters.
	*
	* @return the number of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Config_Mst_GenericMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Config_Mst_GenericMasterPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					Config_Mst_GenericMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(Config_Mst_GenericMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Config_Mst_GenericMasterPersistence persistence) {
	}

	private static Config_Mst_GenericMasterPersistence _persistence;
}