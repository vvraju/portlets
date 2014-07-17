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
 * Provides the local service utility for PaymentOptionMaster. This utility wraps
 * {@link com.ifli.rapid.service.impl.PaymentOptionMasterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see PaymentOptionMasterLocalService
 * @see com.ifli.rapid.service.base.PaymentOptionMasterLocalServiceBaseImpl
 * @see com.ifli.rapid.service.impl.PaymentOptionMasterLocalServiceImpl
 * @generated
 */
public class PaymentOptionMasterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifli.rapid.service.impl.PaymentOptionMasterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the payment option master to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentOptionMaster the payment option master
	* @return the payment option master that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster addPaymentOptionMaster(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPaymentOptionMaster(paymentOptionMaster);
	}

	/**
	* Creates a new payment option master with the primary key. Does not add the payment option master to the database.
	*
	* @param PaymentOptionId the primary key for the new payment option master
	* @return the new payment option master
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster createPaymentOptionMaster(
		java.lang.String PaymentOptionId) {
		return getService().createPaymentOptionMaster(PaymentOptionId);
	}

	/**
	* Deletes the payment option master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master that was removed
	* @throws PortalException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster deletePaymentOptionMaster(
		java.lang.String PaymentOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentOptionMaster(PaymentOptionId);
	}

	/**
	* Deletes the payment option master from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentOptionMaster the payment option master
	* @return the payment option master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster deletePaymentOptionMaster(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentOptionMaster(paymentOptionMaster);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifli.rapid.model.PaymentOptionMaster fetchPaymentOptionMaster(
		java.lang.String PaymentOptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPaymentOptionMaster(PaymentOptionId);
	}

	/**
	* Returns the payment option master with the primary key.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master
	* @throws PortalException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster getPaymentOptionMaster(
		java.lang.String PaymentOptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentOptionMaster(PaymentOptionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment option masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option masters
	* @param end the upper bound of the range of payment option masters (not inclusive)
	* @return the range of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionMaster> getPaymentOptionMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentOptionMasters(start, end);
	}

	/**
	* Returns the number of payment option masters.
	*
	* @return the number of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static int getPaymentOptionMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentOptionMastersCount();
	}

	/**
	* Updates the payment option master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentOptionMaster the payment option master
	* @return the payment option master that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster updatePaymentOptionMaster(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePaymentOptionMaster(paymentOptionMaster);
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

	public static PaymentOptionMasterLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PaymentOptionMasterLocalService.class.getName());

			if (invokableLocalService instanceof PaymentOptionMasterLocalService) {
				_service = (PaymentOptionMasterLocalService)invokableLocalService;
			}
			else {
				_service = new PaymentOptionMasterLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PaymentOptionMasterLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PaymentOptionMasterLocalService service) {
	}

	private static PaymentOptionMasterLocalService _service;
}