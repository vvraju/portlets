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

package com.ifl.rapid.customer.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for ApplyTrnQuoteDetails. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetailsLocalServiceUtil
 * @see com.ifl.rapid.customer.service.base.ApplyTrnQuoteDetailsLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.ApplyTrnQuoteDetailsLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ApplyTrnQuoteDetailsLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplyTrnQuoteDetailsLocalServiceUtil} to access the apply trn quote details local service. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.ApplyTrnQuoteDetailsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the apply trn quote details to the database. Also notifies the appropriate model listeners.
	*
	* @param applyTrnQuoteDetails the apply trn quote details
	* @return the apply trn quote details that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails addApplyTrnQuoteDetails(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new apply trn quote details with the primary key. Does not add the apply trn quote details to the database.
	*
	* @param QuoteId the primary key for the new apply trn quote details
	* @return the new apply trn quote details
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails createApplyTrnQuoteDetails(
		java.lang.String QuoteId);

	/**
	* Deletes the apply trn quote details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QuoteId the primary key of the apply trn quote details
	* @return the apply trn quote details that was removed
	* @throws PortalException if a apply trn quote details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails deleteApplyTrnQuoteDetails(
		java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the apply trn quote details from the database. Also notifies the appropriate model listeners.
	*
	* @param applyTrnQuoteDetails the apply trn quote details
	* @return the apply trn quote details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails deleteApplyTrnQuoteDetails(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails fetchApplyTrnQuoteDetails(
		java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply trn quote details with the primary key.
	*
	* @param QuoteId the primary key of the apply trn quote details
	* @return the apply trn quote details
	* @throws PortalException if a apply trn quote details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails getApplyTrnQuoteDetails(
		java.lang.String QuoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> getApplyTrnQuoteDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apply trn quote detailses.
	*
	* @return the number of apply trn quote detailses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getApplyTrnQuoteDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the apply trn quote details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param applyTrnQuoteDetails the apply trn quote details
	* @return the apply trn quote details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails updateApplyTrnQuoteDetails(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

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
}