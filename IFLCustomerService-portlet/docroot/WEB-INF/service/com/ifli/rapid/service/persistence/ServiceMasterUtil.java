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

import com.ifli.rapid.model.ServiceMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service master service. This utility wraps {@link ServiceMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceMasterPersistence
 * @see ServiceMasterPersistenceImpl
 * @generated
 */
public class ServiceMasterUtil {
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
	public static void clearCache(ServiceMaster serviceMaster) {
		getPersistence().clearCache(serviceMaster);
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
	public static List<ServiceMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServiceMaster update(ServiceMaster serviceMaster)
		throws SystemException {
		return getPersistence().update(serviceMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServiceMaster update(ServiceMaster serviceMaster,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceMaster, serviceContext);
	}

	/**
	* Caches the service master in the entity cache if it is enabled.
	*
	* @param serviceMaster the service master
	*/
	public static void cacheResult(
		com.ifli.rapid.model.ServiceMaster serviceMaster) {
		getPersistence().cacheResult(serviceMaster);
	}

	/**
	* Caches the service masters in the entity cache if it is enabled.
	*
	* @param serviceMasters the service masters
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.ServiceMaster> serviceMasters) {
		getPersistence().cacheResult(serviceMasters);
	}

	/**
	* Creates a new service master with the primary key. Does not add the service master to the database.
	*
	* @param SERVICE_MASTER_ID the primary key for the new service master
	* @return the new service master
	*/
	public static com.ifli.rapid.model.ServiceMaster create(
		int SERVICE_MASTER_ID) {
		return getPersistence().create(SERVICE_MASTER_ID);
	}

	/**
	* Removes the service master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master that was removed
	* @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ServiceMaster remove(
		int SERVICE_MASTER_ID)
		throws com.ifli.rapid.NoSuchServiceMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(SERVICE_MASTER_ID);
	}

	public static com.ifli.rapid.model.ServiceMaster updateImpl(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceMaster);
	}

	/**
	* Returns the service master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceMasterException} if it could not be found.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master
	* @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ServiceMaster findByPrimaryKey(
		int SERVICE_MASTER_ID)
		throws com.ifli.rapid.NoSuchServiceMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(SERVICE_MASTER_ID);
	}

	/**
	* Returns the service master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master, or <code>null</code> if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ServiceMaster fetchByPrimaryKey(
		int SERVICE_MASTER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(SERVICE_MASTER_ID);
	}

	/**
	* Returns all the service masters.
	*
	* @return the service masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ServiceMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service masters
	* @param end the upper bound of the range of service masters (not inclusive)
	* @return the range of service masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ServiceMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service masters
	* @param end the upper bound of the range of service masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ServiceMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service masters.
	*
	* @return the number of service masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceMasterPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					ServiceMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServiceMasterPersistence persistence) {
	}

	private static ServiceMasterPersistence _persistence;
}