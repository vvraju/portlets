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
 * Provides the local service utility for QrcMstSubServices. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.QrcMstSubServicesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see QrcMstSubServicesLocalService
 * @see com.ifl.rapid.customer.service.base.QrcMstSubServicesLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.QrcMstSubServicesLocalServiceImpl
 * @generated
 */
public class QrcMstSubServicesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.QrcMstSubServicesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qrc mst sub services to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcMstSubServices the qrc mst sub services
	* @return the qrc mst sub services that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices addQrcMstSubServices(
		com.ifl.rapid.customer.model.QrcMstSubServices qrcMstSubServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQrcMstSubServices(qrcMstSubServices);
	}

	/**
	* Creates a new qrc mst sub services with the primary key. Does not add the qrc mst sub services to the database.
	*
	* @param SubServiceId the primary key for the new qrc mst sub services
	* @return the new qrc mst sub services
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices createQrcMstSubServices(
		int SubServiceId) {
		return getService().createQrcMstSubServices(SubServiceId);
	}

	/**
	* Deletes the qrc mst sub services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SubServiceId the primary key of the qrc mst sub services
	* @return the qrc mst sub services that was removed
	* @throws PortalException if a qrc mst sub services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices deleteQrcMstSubServices(
		int SubServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcMstSubServices(SubServiceId);
	}

	/**
	* Deletes the qrc mst sub services from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcMstSubServices the qrc mst sub services
	* @return the qrc mst sub services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices deleteQrcMstSubServices(
		com.ifl.rapid.customer.model.QrcMstSubServices qrcMstSubServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQrcMstSubServices(qrcMstSubServices);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifl.rapid.customer.model.QrcMstSubServices fetchQrcMstSubServices(
		int SubServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQrcMstSubServices(SubServiceId);
	}

	/**
	* Returns the qrc mst sub services with the primary key.
	*
	* @param SubServiceId the primary key of the qrc mst sub services
	* @return the qrc mst sub services
	* @throws PortalException if a qrc mst sub services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices getQrcMstSubServices(
		int SubServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcMstSubServices(SubServiceId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qrc mst sub serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst sub serviceses
	* @param end the upper bound of the range of qrc mst sub serviceses (not inclusive)
	* @return the range of qrc mst sub serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcMstSubServices> getQrcMstSubServiceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcMstSubServiceses(start, end);
	}

	/**
	* Returns the number of qrc mst sub serviceses.
	*
	* @return the number of qrc mst sub serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int getQrcMstSubServicesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQrcMstSubServicesesCount();
	}

	/**
	* Updates the qrc mst sub services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcMstSubServices the qrc mst sub services
	* @return the qrc mst sub services that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstSubServices updateQrcMstSubServices(
		com.ifl.rapid.customer.model.QrcMstSubServices qrcMstSubServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQrcMstSubServices(qrcMstSubServices);
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

	public static QrcMstSubServicesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QrcMstSubServicesLocalService.class.getName());

			if (invokableLocalService instanceof QrcMstSubServicesLocalService) {
				_service = (QrcMstSubServicesLocalService)invokableLocalService;
			}
			else {
				_service = new QrcMstSubServicesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QrcMstSubServicesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QrcMstSubServicesLocalService service) {
	}

	private static QrcMstSubServicesLocalService _service;
}