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
 * Provides a wrapper for {@link QRCSubTypeMasterLocalService}.
 *
 * @author Satya Kola
 * @see QRCSubTypeMasterLocalService
 * @generated
 */
public class QRCSubTypeMasterLocalServiceWrapper
	implements QRCSubTypeMasterLocalService,
		ServiceWrapper<QRCSubTypeMasterLocalService> {
	public QRCSubTypeMasterLocalServiceWrapper(
		QRCSubTypeMasterLocalService qrcSubTypeMasterLocalService) {
		_qrcSubTypeMasterLocalService = qrcSubTypeMasterLocalService;
	}

	/**
	* Adds the q r c sub type master to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcSubTypeMaster the q r c sub type master
	* @return the q r c sub type master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster addQRCSubTypeMaster(
		com.ifli.rapid.model.QRCSubTypeMaster qrcSubTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.addQRCSubTypeMaster(qrcSubTypeMaster);
	}

	/**
	* Creates a new q r c sub type master with the primary key. Does not add the q r c sub type master to the database.
	*
	* @param QRC_SUB_TYPE_ID the primary key for the new q r c sub type master
	* @return the new q r c sub type master
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster createQRCSubTypeMaster(
		int QRC_SUB_TYPE_ID) {
		return _qrcSubTypeMasterLocalService.createQRCSubTypeMaster(QRC_SUB_TYPE_ID);
	}

	/**
	* Deletes the q r c sub type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_SUB_TYPE_ID the primary key of the q r c sub type master
	* @return the q r c sub type master that was removed
	* @throws PortalException if a q r c sub type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster deleteQRCSubTypeMaster(
		int QRC_SUB_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.deleteQRCSubTypeMaster(QRC_SUB_TYPE_ID);
	}

	/**
	* Deletes the q r c sub type master from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcSubTypeMaster the q r c sub type master
	* @return the q r c sub type master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster deleteQRCSubTypeMaster(
		com.ifli.rapid.model.QRCSubTypeMaster qrcSubTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.deleteQRCSubTypeMaster(qrcSubTypeMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qrcSubTypeMasterLocalService.dynamicQuery();
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
		return _qrcSubTypeMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcSubTypeMasterLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qrcSubTypeMasterLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qrcSubTypeMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qrcSubTypeMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster fetchQRCSubTypeMaster(
		int QRC_SUB_TYPE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.fetchQRCSubTypeMaster(QRC_SUB_TYPE_ID);
	}

	/**
	* Returns the q r c sub type master with the primary key.
	*
	* @param QRC_SUB_TYPE_ID the primary key of the q r c sub type master
	* @return the q r c sub type master
	* @throws PortalException if a q r c sub type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster getQRCSubTypeMaster(
		int QRC_SUB_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.getQRCSubTypeMaster(QRC_SUB_TYPE_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the q r c sub type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c sub type masters
	* @param end the upper bound of the range of q r c sub type masters (not inclusive)
	* @return the range of q r c sub type masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.QRCSubTypeMaster> getQRCSubTypeMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.getQRCSubTypeMasters(start, end);
	}

	/**
	* Returns the number of q r c sub type masters.
	*
	* @return the number of q r c sub type masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQRCSubTypeMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.getQRCSubTypeMastersCount();
	}

	/**
	* Updates the q r c sub type master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcSubTypeMaster the q r c sub type master
	* @return the q r c sub type master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.QRCSubTypeMaster updateQRCSubTypeMaster(
		com.ifli.rapid.model.QRCSubTypeMaster qrcSubTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qrcSubTypeMasterLocalService.updateQRCSubTypeMaster(qrcSubTypeMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qrcSubTypeMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qrcSubTypeMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qrcSubTypeMasterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QRCSubTypeMasterLocalService getWrappedQRCSubTypeMasterLocalService() {
		return _qrcSubTypeMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQRCSubTypeMasterLocalService(
		QRCSubTypeMasterLocalService qrcSubTypeMasterLocalService) {
		_qrcSubTypeMasterLocalService = qrcSubTypeMasterLocalService;
	}

	@Override
	public QRCSubTypeMasterLocalService getWrappedService() {
		return _qrcSubTypeMasterLocalService;
	}

	@Override
	public void setWrappedService(
		QRCSubTypeMasterLocalService qrcSubTypeMasterLocalService) {
		_qrcSubTypeMasterLocalService = qrcSubTypeMasterLocalService;
	}

	private QRCSubTypeMasterLocalService _qrcSubTypeMasterLocalService;
}