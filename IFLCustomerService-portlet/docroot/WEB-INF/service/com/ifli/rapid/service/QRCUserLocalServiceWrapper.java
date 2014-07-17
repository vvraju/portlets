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

package com.ifli.rapid.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QRCUserLocalService}.
 *
 * @author Satya Kola
 * @see QRCUserLocalService
 * @generated
 */
public class QRCUserLocalServiceWrapper implements QRCUserLocalService,
	ServiceWrapper<QRCUserLocalService> {
	public QRCUserLocalServiceWrapper(QRCUserLocalService qrcUserLocalService) {
		_qrcUserLocalService = qrcUserLocalService;
	}

	/**
	* Adds the q r c user to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcUser the q r c user
	* @return the q r c user that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCUser addQRCUser(
		com.ifli.rapid.model.QRCUser qrcUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.addQRCUser(qrcUser);
	}

	/**
	* Creates a new q r c user with the primary key. Does not add the q r c user to the database.
	*
	* @param QRC_USER_ID the primary key for the new q r c user
	* @return the new q r c user
	*/
	@Override
	public com.ifli.rapid.model.QRCUser createQRCUser(int QRC_USER_ID) {
		return _qrcUserLocalService.createQRCUser(QRC_USER_ID);
	}

	/**
	* Deletes the q r c user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_USER_ID the primary key of the q r c user
	* @return the q r c user that was removed
	* @throws PortalException if a q r c user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCUser deleteQRCUser(int QRC_USER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.deleteQRCUser(QRC_USER_ID);
	}

	/**
	* Deletes the q r c user from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcUser the q r c user
	* @return the q r c user that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCUser deleteQRCUser(
		com.ifli.rapid.model.QRCUser qrcUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.deleteQRCUser(qrcUser);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qrcUserLocalService.dynamicQuery();
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
		return _qrcUserLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcUserLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcUserLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _qrcUserLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qrcUserLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ifli.rapid.model.QRCUser fetchQRCUser(int QRC_USER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.fetchQRCUser(QRC_USER_ID);
	}

	/**
	* Returns the q r c user with the primary key.
	*
	* @param QRC_USER_ID the primary key of the q r c user
	* @return the q r c user
	* @throws PortalException if a q r c user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCUser getQRCUser(int QRC_USER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.getQRCUser(QRC_USER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the q r c users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c users
	* @param end the upper bound of the range of q r c users (not inclusive)
	* @return the range of q r c users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.QRCUser> getQRCUsers(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.getQRCUsers(start, end);
	}

	/**
	* Returns the number of q r c users.
	*
	* @return the number of q r c users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQRCUsersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.getQRCUsersCount();
	}

	/**
	* Updates the q r c user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcUser the q r c user
	* @return the q r c user that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCUser updateQRCUser(
		com.ifli.rapid.model.QRCUser qrcUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcUserLocalService.updateQRCUser(qrcUser);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qrcUserLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qrcUserLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qrcUserLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QRCUserLocalService getWrappedQRCUserLocalService() {
		return _qrcUserLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQRCUserLocalService(
		QRCUserLocalService qrcUserLocalService) {
		_qrcUserLocalService = qrcUserLocalService;
	}

	@Override
	public QRCUserLocalService getWrappedService() {
		return _qrcUserLocalService;
	}

	@Override
	public void setWrappedService(QRCUserLocalService qrcUserLocalService) {
		_qrcUserLocalService = qrcUserLocalService;
	}

	private QRCUserLocalService _qrcUserLocalService;
}