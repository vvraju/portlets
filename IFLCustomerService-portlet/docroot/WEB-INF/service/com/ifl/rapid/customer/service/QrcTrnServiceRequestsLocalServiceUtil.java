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
 * Provides the local service utility for QrcTrnServiceRequests. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.QrcTrnServiceRequestsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see QrcTrnServiceRequestsLocalService
 * @see com.ifl.rapid.customer.service.base.QrcTrnServiceRequestsLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.QrcTrnServiceRequestsLocalServiceImpl
 * @generated
 */
public class QrcTrnServiceRequestsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.QrcTrnServiceRequestsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qrc trn service requests to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnServiceRequests the qrc trn service requests
	* @return the qrc trn service requests that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests addQrcTrnServiceRequests(
		com.ifl.rapid.customer.model.QrcTrnServiceRequests qrcTrnServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQrcTrnServiceRequests(qrcTrnServiceRequests);
	}

	/**
	* Creates a new qrc trn service requests with the primary key. Does not add the qrc trn service requests to the database.
	*
	* @param ServiceRequestId the primary key for the new qrc trn service requests
	* @return the new qrc trn service requests
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests createQrcTrnServiceRequests(
		int ServiceRequestId) {
		return getService().createQrcTrnServiceRequests(ServiceRequestId);
	}

	/**
	* Deletes the qrc trn service requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ServiceRequestId the primary key of the qrc trn service requests
	* @return the qrc trn service requests that was removed
	* @throws PortalException if a qrc trn service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests deleteQrcTrnServiceRequests(
		int ServiceRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcTrnServiceRequests(ServiceRequestId);
	}

	/**
	* Deletes the qrc trn service requests from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnServiceRequests the qrc trn service requests
	* @return the qrc trn service requests that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests deleteQrcTrnServiceRequests(
		com.ifl.rapid.customer.model.QrcTrnServiceRequests qrcTrnServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcTrnServiceRequests(qrcTrnServiceRequests);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests fetchQrcTrnServiceRequests(
		int ServiceRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQrcTrnServiceRequests(ServiceRequestId);
	}

	/**
	* Returns the qrc trn service requests with the primary key.
	*
	* @param ServiceRequestId the primary key of the qrc trn service requests
	* @return the qrc trn service requests
	* @throws PortalException if a qrc trn service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests getQrcTrnServiceRequests(
		int ServiceRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnServiceRequests(ServiceRequestId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qrc trn service requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc trn service requestses
	* @param end the upper bound of the range of qrc trn service requestses (not inclusive)
	* @return the range of qrc trn service requestses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcTrnServiceRequests> getQrcTrnServiceRequestses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnServiceRequestses(start, end);
	}

	/**
	* Returns the number of qrc trn service requestses.
	*
	* @return the number of qrc trn service requestses
	* @throws SystemException if a system exception occurred
	*/
	public static int getQrcTrnServiceRequestsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcTrnServiceRequestsesCount();
	}

	/**
	* Updates the qrc trn service requests in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcTrnServiceRequests the qrc trn service requests
	* @return the qrc trn service requests that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnServiceRequests updateQrcTrnServiceRequests(
		com.ifl.rapid.customer.model.QrcTrnServiceRequests qrcTrnServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQrcTrnServiceRequests(qrcTrnServiceRequests);
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

	public static QrcTrnServiceRequestsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QrcTrnServiceRequestsLocalService.class.getName());

			if (invokableLocalService instanceof QrcTrnServiceRequestsLocalService) {
				_service = (QrcTrnServiceRequestsLocalService)invokableLocalService;
			}
			else {
				_service = new QrcTrnServiceRequestsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QrcTrnServiceRequestsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QrcTrnServiceRequestsLocalService service) {
	}

	private static QrcTrnServiceRequestsLocalService _service;
}