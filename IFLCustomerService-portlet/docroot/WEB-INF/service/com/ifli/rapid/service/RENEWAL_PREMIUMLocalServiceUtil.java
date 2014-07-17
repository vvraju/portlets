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
 * Provides the local service utility for RENEWAL_PREMIUM. This utility wraps
 * {@link com.ifli.rapid.service.impl.RENEWAL_PREMIUMLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUMLocalService
 * @see com.ifli.rapid.service.base.RENEWAL_PREMIUMLocalServiceBaseImpl
 * @see com.ifli.rapid.service.impl.RENEWAL_PREMIUMLocalServiceImpl
 * @generated
 */
public class RENEWAL_PREMIUMLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifli.rapid.service.impl.RENEWAL_PREMIUMLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the r e n e w a l_ p r e m i u m to the database. Also notifies the appropriate model listeners.
	*
	* @param renewal_premium the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM addRENEWAL_PREMIUM(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRENEWAL_PREMIUM(renewal_premium);
	}

	/**
	* Creates a new r e n e w a l_ p r e m i u m with the primary key. Does not add the r e n e w a l_ p r e m i u m to the database.
	*
	* @param ID_old the primary key for the new r e n e w a l_ p r e m i u m
	* @return the new r e n e w a l_ p r e m i u m
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM createRENEWAL_PREMIUM(
		long ID_old) {
		return getService().createRENEWAL_PREMIUM(ID_old);
	}

	/**
	* Deletes the r e n e w a l_ p r e m i u m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was removed
	* @throws PortalException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM deleteRENEWAL_PREMIUM(
		long ID_old)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRENEWAL_PREMIUM(ID_old);
	}

	/**
	* Deletes the r e n e w a l_ p r e m i u m from the database. Also notifies the appropriate model listeners.
	*
	* @param renewal_premium the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM deleteRENEWAL_PREMIUM(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRENEWAL_PREMIUM(renewal_premium);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifli.rapid.model.RENEWAL_PREMIUM fetchRENEWAL_PREMIUM(
		long ID_old) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRENEWAL_PREMIUM(ID_old);
	}

	/**
	* Returns the r e n e w a l_ p r e m i u m with the primary key.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m
	* @throws PortalException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM getRENEWAL_PREMIUM(
		long ID_old)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRENEWAL_PREMIUM(ID_old);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the r e n e w a l_ p r e m i u ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r e n e w a l_ p r e m i u ms
	* @param end the upper bound of the range of r e n e w a l_ p r e m i u ms (not inclusive)
	* @return the range of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> getRENEWAL_PREMIUMs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRENEWAL_PREMIUMs(start, end);
	}

	/**
	* Returns the number of r e n e w a l_ p r e m i u ms.
	*
	* @return the number of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static int getRENEWAL_PREMIUMsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRENEWAL_PREMIUMsCount();
	}

	/**
	* Updates the r e n e w a l_ p r e m i u m in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param renewal_premium the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM updateRENEWAL_PREMIUM(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRENEWAL_PREMIUM(renewal_premium);
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

	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByPolicyAndReceipt_Date(ContrNo, Receipt_Date);
	}

	public static void clearService() {
		_service = null;
	}

	public static RENEWAL_PREMIUMLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RENEWAL_PREMIUMLocalService.class.getName());

			if (invokableLocalService instanceof RENEWAL_PREMIUMLocalService) {
				_service = (RENEWAL_PREMIUMLocalService)invokableLocalService;
			}
			else {
				_service = new RENEWAL_PREMIUMLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RENEWAL_PREMIUMLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RENEWAL_PREMIUMLocalService service) {
	}

	private static RENEWAL_PREMIUMLocalService _service;
}