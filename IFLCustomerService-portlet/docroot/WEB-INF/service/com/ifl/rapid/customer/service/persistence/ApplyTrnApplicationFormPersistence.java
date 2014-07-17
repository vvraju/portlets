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

import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the apply trn application form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationFormPersistenceImpl
 * @see ApplyTrnApplicationFormUtil
 * @generated
 */
public interface ApplyTrnApplicationFormPersistence extends BasePersistence<ApplyTrnApplicationForm> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplyTrnApplicationFormUtil} to access the apply trn application form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the apply trn application form where QuoteId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException} if it could not be found.
	*
	* @param QuoteId the quote ID
	* @return the matching apply trn application form
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a matching apply trn application form could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm findByQuoteId(
		java.lang.String QuoteId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn application form where QuoteId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param QuoteId the quote ID
	* @return the matching apply trn application form, or <code>null</code> if a matching apply trn application form could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm fetchByQuoteId(
		java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn application form where QuoteId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param QuoteId the quote ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching apply trn application form, or <code>null</code> if a matching apply trn application form could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm fetchByQuoteId(
		java.lang.String QuoteId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the apply trn application form where QuoteId = &#63; from the database.
	*
	* @param QuoteId the quote ID
	* @return the apply trn application form that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm removeByQuoteId(
		java.lang.String QuoteId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apply trn application forms where QuoteId = &#63;.
	*
	* @param QuoteId the quote ID
	* @return the number of matching apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuoteId(java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the apply trn application form in the entity cache if it is enabled.
	*
	* @param applyTrnApplicationForm the apply trn application form
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm);

	/**
	* Caches the apply trn application forms in the entity cache if it is enabled.
	*
	* @param applyTrnApplicationForms the apply trn application forms
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> applyTrnApplicationForms);

	/**
	* Creates a new apply trn application form with the primary key. Does not add the apply trn application form to the database.
	*
	* @param ApplicationFormId the primary key for the new apply trn application form
	* @return the new apply trn application form
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm create(
		java.lang.String ApplicationFormId);

	/**
	* Removes the apply trn application form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ApplicationFormId the primary key of the apply trn application form
	* @return the apply trn application form that was removed
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm remove(
		java.lang.String ApplicationFormId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm updateImpl(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn application form with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException} if it could not be found.
	*
	* @param ApplicationFormId the primary key of the apply trn application form
	* @return the apply trn application form
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm findByPrimaryKey(
		java.lang.String ApplicationFormId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn application form with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ApplicationFormId the primary key of the apply trn application form
	* @return the apply trn application form, or <code>null</code> if a apply trn application form with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm fetchByPrimaryKey(
		java.lang.String ApplicationFormId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apply trn application forms.
	*
	* @return the apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apply trn application forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apply trn application forms
	* @param end the upper bound of the range of apply trn application forms (not inclusive)
	* @return the range of apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apply trn application forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apply trn application forms
	* @param end the upper bound of the range of apply trn application forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the apply trn application forms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apply trn application forms.
	*
	* @return the number of apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}