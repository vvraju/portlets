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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QRCTypeMaster. This utility wraps
 * {@link com.ifli.rapid.service.impl.QRCTypeMasterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see QRCTypeMasterLocalService
 * @see com.ifli.rapid.service.base.QRCTypeMasterLocalServiceBaseImpl
 * @see com.ifli.rapid.service.impl.QRCTypeMasterLocalServiceImpl
 * @generated
 */
public class QRCTypeMasterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifli.rapid.service.impl.QRCTypeMasterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the q r c type master to the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTypeMaster the q r c type master
	* @return the q r c type master that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster addQRCTypeMaster(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQRCTypeMaster(qrcTypeMaster);
	}

	/**
	* Creates a new q r c type master with the primary key. Does not add the q r c type master to the database.
	*
	* @param QRC_TYPE_ID the primary key for the new q r c type master
	* @return the new q r c type master
	*/
	public static com.ifli.rapid.model.QRCTypeMaster createQRCTypeMaster(
		int QRC_TYPE_ID) {
		return getService().createQRCTypeMaster(QRC_TYPE_ID);
	}

	/**
	* Deletes the q r c type master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_TYPE_ID the primary key of the q r c type master
	* @return the q r c type master that was removed
	* @throws PortalException if a q r c type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster deleteQRCTypeMaster(
		int QRC_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQRCTypeMaster(QRC_TYPE_ID);
	}

	/**
	* Deletes the q r c type master from the database. Also notifies the appropriate model listeners.
	*
	* @param qrcTypeMaster the q r c type master
	* @return the q r c type master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster deleteQRCTypeMaster(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQRCTypeMaster(qrcTypeMaster);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifli.rapid.model.QRCTypeMaster fetchQRCTypeMaster(
		int QRC_TYPE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQRCTypeMaster(QRC_TYPE_ID);
	}

	/**
	* Returns the q r c type master with the primary key.
	*
	* @param QRC_TYPE_ID the primary key of the q r c type master
	* @return the q r c type master
	* @throws PortalException if a q r c type master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster getQRCTypeMaster(
		int QRC_TYPE_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQRCTypeMaster(QRC_TYPE_ID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the q r c type masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c type masters
	* @param end the upper bound of the range of q r c type masters (not inclusive)
	* @return the range of q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.QRCTypeMaster> getQRCTypeMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQRCTypeMasters(start, end);
	}

	/**
	* Returns the number of q r c type masters.
	*
	* @return the number of q r c type masters
	* @throws SystemException if a system exception occurred
	*/
	public static int getQRCTypeMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQRCTypeMastersCount();
	}

	/**
	* Updates the q r c type master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qrcTypeMaster the q r c type master
	* @return the q r c type master that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.QRCTypeMaster updateQRCTypeMaster(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQRCTypeMaster(qrcTypeMaster);
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

	public static QRCTypeMasterLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QRCTypeMasterLocalService.class.getName());

			if (invokableLocalService instanceof QRCTypeMasterLocalService) {
				_service = (QRCTypeMasterLocalService)invokableLocalService;
			}
			else {
				_service = new QRCTypeMasterLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QRCTypeMasterLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QRCTypeMasterLocalService service) {
	}

	private static QRCTypeMasterLocalService _service;
}