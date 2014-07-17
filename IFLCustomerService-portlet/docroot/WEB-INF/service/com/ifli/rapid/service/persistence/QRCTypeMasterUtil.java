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

import com.ifli.rapid.model.QRCTypeMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the q r c type master service. This utility wraps {@link QRCTypeMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCTypeMasterPersistence
 * @see QRCTypeMasterPersistenceImpl
 * @generated
 */
public class QRCTypeMasterUtil {
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
	public static void clearCache(QRCTypeMaster qrcTypeMaster) {
		getPersistence().clearCache(qrcTypeMaster);
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
	public static List<QRCTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QRCTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QRCTypeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QRCTypeMaster update(QRCTypeMaster qrcTypeMaster)
		throws SystemException {
		return getPersistence().update(qrcTypeMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QRCTypeMaster update(QRCTypeMaster qrcTypeMaster,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qrcTypeMaster, serviceContext);
	}

	/**
	* Caches the q r c type master in the entity cache if it is enabled.
	*
	* @param qrcTypeMaster the q r c type master
	*/
	public static void cacheResult(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster) {
		getPersistence().cacheResult(qrcTypeMaster);
	}

	/**
	* Caches the q r c type masters in the entity cache if it is enabled.
	*
	* @param qrcTypeMasters the q r c type masters
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.QRCTypeMaster> qrcTypeMasters) {
		getPersistence().cacheResult(qrcTypeMasters);
	}

	/**
	* Creates a new q r c type master with the primary key. Does not add the q r c type master to the database.
	*
	* @param QRC_TYPE_ID the primary key for the new q r c type master
	* @return the new q r c type master
	*/
	public static com.ifli.rapid.model.QRCTypeMaster create(int QRC_TYPE_ID) {
		return getPersistence().create(QRC_TYPE_ID);
	}

	/**
	* Removes the q r c type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_TYPE_ID the primary key of the q r c type master
	* @return the q r c type master that was removed
	* @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster remove(int QRC_TYPE_ID)
		throws com.ifli.rapid.NoSuchQRCTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(QRC_TYPE_ID);
	}

	public static com.ifli.rapid.model.QRCTypeMaster updateImpl(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qrcTypeMaster);
	}

	/**
	* Returns the q r c type master with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCTypeMasterException} if it could not be found.
	*
	* @param QRC_TYPE_ID the primary key of the q r c type master
	* @return the q r c type master
	* @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster findByPrimaryKey(
		int QRC_TYPE_ID)
		throws com.ifli.rapid.NoSuchQRCTypeMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(QRC_TYPE_ID);
	}

	/**
	* Returns the q r c type master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QRC_TYPE_ID the primary key of the q r c type master
	* @return the q r c type master, or <code>null</code> if a q r c type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster fetchByPrimaryKey(
		int QRC_TYPE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(QRC_TYPE_ID);
	}

	/**
	* Returns all the q r c type masters.
	*
	* @return the q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.QRCTypeMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the q r c type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c type masters
	* @param end the upper bound of the range of q r c type masters (not inclusive)
	* @return the range of q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.QRCTypeMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the q r c type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c type masters
	* @param end the upper bound of the range of q r c type masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.QRCTypeMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the q r c type masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of q r c type masters.
	*
	* @return the number of q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QRCTypeMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QRCTypeMasterPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					QRCTypeMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(QRCTypeMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QRCTypeMasterPersistence persistence) {
	}

	private static QRCTypeMasterPersistence _persistence;
}