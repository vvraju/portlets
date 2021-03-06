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

import com.ifli.rapid.model.POLICY_DOC_TYPES;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the p o l i c y_ d o c_ t y p e s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPESPersistenceImpl
 * @see POLICY_DOC_TYPESUtil
 * @generated
 */
public interface POLICY_DOC_TYPESPersistence extends BasePersistence<POLICY_DOC_TYPES> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link POLICY_DOC_TYPESUtil} to access the p o l i c y_ d o c_ t y p e s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the p o l i c y_ d o c_ t y p e s in the entity cache if it is enabled.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	*/
	public void cacheResult(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types);

	/**
	* Caches the p o l i c y_ d o c_ t y p e ses in the entity cache if it is enabled.
	*
	* @param policy_doc_typeses the p o l i c y_ d o c_ t y p e ses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> policy_doc_typeses);

	/**
	* Creates a new p o l i c y_ d o c_ t y p e s with the primary key. Does not add the p o l i c y_ d o c_ t y p e s to the database.
	*
	* @param ID the primary key for the new p o l i c y_ d o c_ t y p e s
	* @return the new p o l i c y_ d o c_ t y p e s
	*/
	public com.ifli.rapid.model.POLICY_DOC_TYPES create(int ID);

	/**
	* Removes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.POLICY_DOC_TYPES remove(int ID)
		throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.POLICY_DOC_TYPES updateImpl(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key or throws a {@link com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException} if it could not be found.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s
	* @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.POLICY_DOC_TYPES findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s, or <code>null</code> if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.POLICY_DOC_TYPES fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p o l i c y_ d o c_ t y p e ses.
	*
	* @return the p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p o l i c y_ d o c_ t y p e ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	* @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	* @return the range of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p o l i c y_ d o c_ t y p e ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	* @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the p o l i c y_ d o c_ t y p e ses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p o l i c y_ d o c_ t y p e ses.
	*
	* @return the number of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}