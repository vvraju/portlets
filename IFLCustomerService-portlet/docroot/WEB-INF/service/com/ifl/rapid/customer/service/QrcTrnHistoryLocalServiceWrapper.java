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
 * Provides a wrapper for {@link QrcTrnHistoryLocalService}.
 *
 * @author Satya Kola
 * @see QrcTrnHistoryLocalService
 * @generated
 */
public class QrcTrnHistoryLocalServiceWrapper
	implements QrcTrnHistoryLocalService,
		ServiceWrapper<QrcTrnHistoryLocalService> {
	public QrcTrnHistoryLocalServiceWrapper(
		QrcTrnHistoryLocalService qrcTrnHistoryLocalService) {
		_qrcTrnHistoryLocalService = qrcTrnHistoryLocalService;
	}

	/**
	* Adds the qrc trn history to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory addQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.addQrcTrnHistory(qrcTrnHistory);
	}

	/**
	* Creates a new qrc trn history with the primary key. Does not add the qrc trn history to the database.
	*
	* @param HistoryId the primary key for the new qrc trn history
	* @return the new qrc trn history
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory createQrcTrnHistory(
		int HistoryId) {
		return _qrcTrnHistoryLocalService.createQrcTrnHistory(HistoryId);
	}

	/**
	* Deletes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history that was removed
	* @throws PortalException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory deleteQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.deleteQrcTrnHistory(HistoryId);
	}

	/**
	* Deletes the qrc trn history from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory deleteQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.deleteQrcTrnHistory(qrcTrnHistory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qrcTrnHistoryLocalService.dynamicQuery();
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
		return _qrcTrnHistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcTrnHistoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcTrnHistoryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qrcTrnHistoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qrcTrnHistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory fetchQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.fetchQrcTrnHistory(HistoryId);
	}

	/**
	* Returns the qrc trn history with the primary key.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history
	* @throws PortalException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory getQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.getQrcTrnHistory(HistoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qrc trn histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc trn histories
	* @param end the upper bound of the range of qrc trn histories (not inclusive)
	* @return the range of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> getQrcTrnHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.getQrcTrnHistories(start, end);
	}

	/**
	* Returns the number of qrc trn histories.
	*
	* @return the number of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQrcTrnHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.getQrcTrnHistoriesCount();
	}

	/**
	* Updates the qrc trn history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.QrcTrnHistory updateQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcTrnHistoryLocalService.updateQrcTrnHistory(qrcTrnHistory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qrcTrnHistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qrcTrnHistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qrcTrnHistoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QrcTrnHistoryLocalService getWrappedQrcTrnHistoryLocalService() {
		return _qrcTrnHistoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQrcTrnHistoryLocalService(
		QrcTrnHistoryLocalService qrcTrnHistoryLocalService) {
		_qrcTrnHistoryLocalService = qrcTrnHistoryLocalService;
	}

	@Override
	public QrcTrnHistoryLocalService getWrappedService() {
		return _qrcTrnHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		QrcTrnHistoryLocalService qrcTrnHistoryLocalService) {
		_qrcTrnHistoryLocalService = qrcTrnHistoryLocalService;
	}

	private QrcTrnHistoryLocalService _qrcTrnHistoryLocalService;
}