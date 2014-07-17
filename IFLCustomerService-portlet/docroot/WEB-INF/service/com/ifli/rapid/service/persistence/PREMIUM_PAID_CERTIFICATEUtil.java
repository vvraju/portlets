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

import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the p r e m i u m_ p a i d_ c e r t i f i c a t e service. This utility wraps {@link PREMIUM_PAID_CERTIFICATEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATEPersistence
 * @see PREMIUM_PAID_CERTIFICATEPersistenceImpl
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATEUtil {
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
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		getPersistence().clearCache(premium_paid_certificate);
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
	public static List<PREMIUM_PAID_CERTIFICATE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PREMIUM_PAID_CERTIFICATE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PREMIUM_PAID_CERTIFICATE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PREMIUM_PAID_CERTIFICATE update(
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate)
		throws SystemException {
		return getPersistence().update(premium_paid_certificate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PREMIUM_PAID_CERTIFICATE update(
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(premium_paid_certificate, serviceContext);
	}

	/**
	* Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @return the matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPolicyAndYear(ContrNo, Financial_Year);
	}

	/**
	* Returns a range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	* @return the range of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndYear(ContrNo, Financial_Year, start, end);
	}

	/**
	* Returns an ordered range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndYear(ContrNo, Financial_Year, start, end,
			orderByComparator);
	}

	/**
	* Returns the first p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_First(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndYear_First(ContrNo, Financial_Year,
			orderByComparator);
	}

	/**
	* Returns the first p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_First(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPolicyAndYear_First(ContrNo, Financial_Year,
			orderByComparator);
	}

	/**
	* Returns the last p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_Last(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndYear_Last(ContrNo, Financial_Year,
			orderByComparator);
	}

	/**
	* Returns the last p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_Last(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPolicyAndYear_Last(ContrNo, Financial_Year,
			orderByComparator);
	}

	/**
	* Returns the p r e m i u m_ p a i d_ c e r t i f i c a t es before and after the current p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ID the primary key of the current p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE[] findByPolicyAndYear_PrevAndNext(
		long ID, java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndYear_PrevAndNext(ID, ContrNo,
			Financial_Year, orderByComparator);
	}

	/**
	* Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63; from the database.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPolicyAndYear(java.lang.String ContrNo,
		java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPolicyAndYear(ContrNo, Financial_Year);
	}

	/**
	* Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @return the number of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPolicyAndYear(java.lang.String ContrNo,
		java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPolicyAndYear(ContrNo, Financial_Year);
	}

	/**
	* Caches the p r e m i u m_ p a i d_ c e r t i f i c a t e in the entity cache if it is enabled.
	*
	* @param premium_paid_certificate the p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		getPersistence().cacheResult(premium_paid_certificate);
	}

	/**
	* Caches the p r e m i u m_ p a i d_ c e r t i f i c a t es in the entity cache if it is enabled.
	*
	* @param premium_paid_certificates the p r e m i u m_ p a i d_ c e r t i f i c a t es
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> premium_paid_certificates) {
		getPersistence().cacheResult(premium_paid_certificates);
	}

	/**
	* Creates a new p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key. Does not add the p r e m i u m_ p a i d_ c e r t i f i c a t e to the database.
	*
	* @param ID the primary key for the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE create(long ID) {
		return getPersistence().create(ID);
	}

	/**
	* Removes the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e that was removed
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE remove(long ID)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID);
	}

	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE updateImpl(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(premium_paid_certificate);
	}

	/**
	* Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or throws a {@link com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException} if it could not be found.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPrimaryKey(
		long ID)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID);
	}

	/**
	* Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPrimaryKey(
		long ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID);
	}

	/**
	* Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	* @return the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* @return the number of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PREMIUM_PAID_CERTIFICATEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PREMIUM_PAID_CERTIFICATEPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PREMIUM_PAID_CERTIFICATEPersistence.class.getName());

			ReferenceRegistry.registerReference(PREMIUM_PAID_CERTIFICATEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PREMIUM_PAID_CERTIFICATEPersistence persistence) {
	}

	private static PREMIUM_PAID_CERTIFICATEPersistence _persistence;
}