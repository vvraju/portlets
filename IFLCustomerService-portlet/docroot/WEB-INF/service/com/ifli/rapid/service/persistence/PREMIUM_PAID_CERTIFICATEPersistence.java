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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the p r e m i u m_ p a i d_ c e r t i f i c a t e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATEPersistenceImpl
 * @see PREMIUM_PAID_CERTIFICATEUtil
 * @generated
 */
public interface PREMIUM_PAID_CERTIFICATEPersistence extends BasePersistence<PREMIUM_PAID_CERTIFICATE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PREMIUM_PAID_CERTIFICATEUtil} to access the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @return the matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(
		java.lang.String ContrNo, java.lang.String Financial_Year, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_First(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_First(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_Last(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_Last(
		java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE[] findByPolicyAndYear_PrevAndNext(
		long ID, java.lang.String ContrNo, java.lang.String Financial_Year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63; from the database.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPolicyAndYear(java.lang.String ContrNo,
		java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	*
	* @param ContrNo the contr no
	* @param Financial_Year the financial_ year
	* @return the number of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public int countByPolicyAndYear(java.lang.String ContrNo,
		java.lang.String Financial_Year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the p r e m i u m_ p a i d_ c e r t i f i c a t e in the entity cache if it is enabled.
	*
	* @param premium_paid_certificate the p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	public void cacheResult(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate);

	/**
	* Caches the p r e m i u m_ p a i d_ c e r t i f i c a t es in the entity cache if it is enabled.
	*
	* @param premium_paid_certificates the p r e m i u m_ p a i d_ c e r t i f i c a t es
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> premium_paid_certificates);

	/**
	* Creates a new p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key. Does not add the p r e m i u m_ p a i d_ c e r t i f i c a t e to the database.
	*
	* @param ID the primary key for the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE create(long ID);

	/**
	* Removes the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e that was removed
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE remove(long ID)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE updateImpl(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or throws a {@link com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException} if it could not be found.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE findByPrimaryKey(
		long ID)
		throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE fetchByPrimaryKey(
		long ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* @return the p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es.
	*
	* @return the number of p r e m i u m_ p a i d_ c e r t i f i c a t es
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}