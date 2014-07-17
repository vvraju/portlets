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

import com.ifli.rapid.model.OfficeDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the office details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see OfficeDetailsPersistenceImpl
 * @see OfficeDetailsUtil
 * @generated
 */
public interface OfficeDetailsPersistence extends BasePersistence<OfficeDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfficeDetailsUtil} to access the office details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the office details in the entity cache if it is enabled.
	*
	* @param officeDetails the office details
	*/
	public void cacheResult(com.ifli.rapid.model.OfficeDetails officeDetails);

	/**
	* Caches the office detailses in the entity cache if it is enabled.
	*
	* @param officeDetailses the office detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.OfficeDetails> officeDetailses);

	/**
	* Creates a new office details with the primary key. Does not add the office details to the database.
	*
	* @param OFFICE_ID the primary key for the new office details
	* @return the new office details
	*/
	public com.ifli.rapid.model.OfficeDetails create(int OFFICE_ID);

	/**
	* Removes the office details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details that was removed
	* @throws com.ifli.rapid.NoSuchOfficeDetailsException if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.OfficeDetails remove(int OFFICE_ID)
		throws com.ifli.rapid.NoSuchOfficeDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.OfficeDetails updateImpl(
		com.ifli.rapid.model.OfficeDetails officeDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the office details with the primary key or throws a {@link com.ifli.rapid.NoSuchOfficeDetailsException} if it could not be found.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details
	* @throws com.ifli.rapid.NoSuchOfficeDetailsException if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.OfficeDetails findByPrimaryKey(int OFFICE_ID)
		throws com.ifli.rapid.NoSuchOfficeDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the office details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details, or <code>null</code> if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.OfficeDetails fetchByPrimaryKey(int OFFICE_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the office detailses.
	*
	* @return the office detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.OfficeDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the office detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.OfficeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of office detailses
	* @param end the upper bound of the range of office detailses (not inclusive)
	* @return the range of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.OfficeDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the office detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.OfficeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of office detailses
	* @param end the upper bound of the range of office detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.OfficeDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the office detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of office detailses.
	*
	* @return the number of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}