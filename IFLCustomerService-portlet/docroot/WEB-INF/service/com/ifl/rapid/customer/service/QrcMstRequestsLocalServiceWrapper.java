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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QrcMstRequestsLocalService}.
 *
 * @author Satya Kola
 * @see QrcMstRequestsLocalService
 * @generated
 */
public class QrcMstRequestsLocalServiceWrapper
	implements QrcMstRequestsLocalService,
		ServiceWrapper<QrcMstRequestsLocalService> {
	public QrcMstRequestsLocalServiceWrapper(
		QrcMstRequestsLocalService qrcMstRequestsLocalService) {
		_qrcMstRequestsLocalService = qrcMstRequestsLocalService;
	}

	/**
	* Adds the qrc mst requests to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcMstRequests the qrc mst requests
	* @return the qrc mst requests that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests addQrcMstRequests(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.addQrcMstRequests(qrcMstRequests);
	}

	/**
	* Creates a new qrc mst requests with the primary key. Does not add the qrc mst requests to the database.
	*
	* @param RequestId the primary key for the new qrc mst requests
	* @return the new qrc mst requests
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests createQrcMstRequests(
		int RequestId) {
		return _qrcMstRequestsLocalService.createQrcMstRequests(RequestId);
	}

	/**
	* Deletes the qrc mst requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RequestId the primary key of the qrc mst requests
	* @return the qrc mst requests that was removed
	* @throws PortalException if a qrc mst requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests deleteQrcMstRequests(
		int RequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.deleteQrcMstRequests(RequestId);
	}

	/**
	* Deletes the qrc mst requests from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcMstRequests the qrc mst requests
	* @return the qrc mst requests that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests deleteQrcMstRequests(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.deleteQrcMstRequests(qrcMstRequests);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qrcMstRequestsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests fetchQrcMstRequests(
		int RequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.fetchQrcMstRequests(RequestId);
	}

	/**
	* Returns the qrc mst requests with the primary key.
	*
	* @param RequestId the primary key of the qrc mst requests
	* @return the qrc mst requests
	* @throws PortalException if a qrc mst requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests getQrcMstRequests(
		int RequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.getQrcMstRequests(RequestId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qrc mst requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst requestses
	* @param end the upper bound of the range of qrc mst requestses (not inclusive)
	* @return the range of qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifl.rapid.customer.model.QrcMstRequests> getQrcMstRequestses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.getQrcMstRequestses(start, end);
	}

	/**
	* Returns the number of qrc mst requestses.
	*
	* @return the number of qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQrcMstRequestsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.getQrcMstRequestsesCount();
	}

	/**
	* Updates the qrc mst requests in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcMstRequests the qrc mst requests
	* @return the qrc mst requests that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcMstRequests updateQrcMstRequests(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcMstRequestsLocalService.updateQrcMstRequests(qrcMstRequests);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qrcMstRequestsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qrcMstRequestsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qrcMstRequestsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QrcMstRequestsLocalService getWrappedQrcMstRequestsLocalService() {
		return _qrcMstRequestsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQrcMstRequestsLocalService(
		QrcMstRequestsLocalService qrcMstRequestsLocalService) {
		_qrcMstRequestsLocalService = qrcMstRequestsLocalService;
	}

	@Override
	public QrcMstRequestsLocalService getWrappedService() {
		return _qrcMstRequestsLocalService;
	}

	@Override
	public void setWrappedService(
		QrcMstRequestsLocalService qrcMstRequestsLocalService) {
		_qrcMstRequestsLocalService = qrcMstRequestsLocalService;
	}

	private QrcMstRequestsLocalService _qrcMstRequestsLocalService;
}