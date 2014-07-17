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

import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the apply trn quote details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetailsPersistenceImpl
 * @see ApplyTrnQuoteDetailsUtil
 * @generated
 */
public interface ApplyTrnQuoteDetailsPersistence extends BasePersistence<ApplyTrnQuoteDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplyTrnQuoteDetailsUtil} to access the apply trn quote details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the apply trn quote details where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching apply trn quote details
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a matching apply trn quote details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn quote details where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ContactId the contact ID
	* @return the matching apply trn quote details, or <code>null</code> if a matching apply trn quote details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails fetchByContactId(
		int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn quote details where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ContactId the contact ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching apply trn quote details, or <code>null</code> if a matching apply trn quote details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails fetchByContactId(
		int ContactId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the apply trn quote details where ContactId = &#63; from the database.
	*
	* @param ContactId the contact ID
	* @return the apply trn quote details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails removeByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apply trn quote detailses where ContactId = &#63;.
	*
	* @param ContactId the contact ID
	* @return the number of matching apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByContactId(int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the apply trn quote details in the entity cache if it is enabled.
	*
	* @param applyTrnQuoteDetails the apply trn quote details
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails);

	/**
	* Caches the apply trn quote detailses in the entity cache if it is enabled.
	*
	* @param applyTrnQuoteDetailses the apply trn quote detailses
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> applyTrnQuoteDetailses);

	/**
	* Creates a new apply trn quote details with the primary key. Does not add the apply trn quote details to the database.
	*
	* @param QuoteId the primary key for the new apply trn quote details
	* @return the new apply trn quote details
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails create(
		java.lang.String QuoteId);

	/**
	* Removes the apply trn quote details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QuoteId the primary key of the apply trn quote details
	* @return the apply trn quote details that was removed
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails remove(
		java.lang.String QuoteId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails updateImpl(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn quote details with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException} if it could not be found.
	*
	* @param QuoteId the primary key of the apply trn quote details
	* @return the apply trn quote details
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails findByPrimaryKey(
		java.lang.String QuoteId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn quote details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QuoteId the primary key of the apply trn quote details
	* @return the apply trn quote details, or <code>null</code> if a apply trn quote details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails fetchByPrimaryKey(
		java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apply trn quote detailses.
	*
	* @return the apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apply trn quote detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apply trn quote detailses
	* @param end the upper bound of the range of apply trn quote detailses (not inclusive)
	* @return the range of apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apply trn quote detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apply trn quote detailses
	* @param end the upper bound of the range of apply trn quote detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the apply trn quote detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apply trn quote detailses.
	*
	* @return the number of apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}