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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QrcTrnHistory. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.QrcTrnHistoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see QrcTrnHistoryLocalService
 * @see com.ifl.rapid.customer.service.base.QrcTrnHistoryLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.QrcTrnHistoryLocalServiceImpl
 * @generated
 */
public class QrcTrnHistoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.QrcTrnHistoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qrc trn history to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory addQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQrcTrnHistory(qrcTrnHistory);
	}

	/**
	* Creates a new qrc trn history with the primary key. Does not add the qrc trn history to the database.
	*
	* @param HistoryId the primary key for the new qrc trn history
	* @return the new qrc trn history
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory createQrcTrnHistory(
		int HistoryId) {
		return getService().createQrcTrnHistory(HistoryId);
	}

	/**
	* Deletes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history that was removed
	* @throws PortalException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory deleteQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcTrnHistory(HistoryId);
	}

	/**
	* Deletes the qrc trn history from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory deleteQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcTrnHistory(qrcTrnHistory);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ifl.rapid.customer.model.QrcTrnHistory fetchQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQrcTrnHistory(HistoryId);
	}

	/**
	* Returns the qrc trn history with the primary key.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history
	* @throws PortalException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory getQrcTrnHistory(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnHistory(HistoryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> getQrcTrnHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnHistories(start, end);
	}

	/**
	* Returns the number of qrc trn histories.
	*
	* @return the number of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public static int getQrcTrnHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnHistoriesCount();
	}

	/**
	* Updates the qrc trn history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnHistory the qrc trn history
	* @return the qrc trn history that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory updateQrcTrnHistory(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQrcTrnHistory(qrcTrnHistory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static QrcTrnHistoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QrcTrnHistoryLocalService.class.getName());

			if (invokableLocalService instanceof QrcTrnHistoryLocalService) {
				_service = (QrcTrnHistoryLocalService)invokableLocalService;
			}
			else {
				_service = new QrcTrnHistoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QrcTrnHistoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QrcTrnHistoryLocalService service) {
	}

	private static QrcTrnHistoryLocalService _service;
}