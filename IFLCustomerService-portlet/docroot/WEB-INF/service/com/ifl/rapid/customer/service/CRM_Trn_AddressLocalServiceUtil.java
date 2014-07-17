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
 * Provides the local service utility for CRM_Trn_Address. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.CRM_Trn_AddressLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see CRM_Trn_AddressLocalService
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_AddressLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.CRM_Trn_AddressLocalServiceImpl
 * @generated
 */
public class CRM_Trn_AddressLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.CRM_Trn_AddressLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the c r m_ trn_ address to the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Address the c r m_ trn_ address
	* @return the c r m_ trn_ address that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address addCRM_Trn_Address(
		com.ifl.rapid.customer.model.CRM_Trn_Address crm_Trn_Address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCRM_Trn_Address(crm_Trn_Address);
	}

	/**
	* Creates a new c r m_ trn_ address with the primary key. Does not add the c r m_ trn_ address to the database.
	*
	* @param AddressId the primary key for the new c r m_ trn_ address
	* @return the new c r m_ trn_ address
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address createCRM_Trn_Address(
		int AddressId) {
		return getService().createCRM_Trn_Address(AddressId);
	}

	/**
	* Deletes the c r m_ trn_ address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param AddressId the primary key of the c r m_ trn_ address
	* @return the c r m_ trn_ address that was removed
	* @throws PortalException if a c r m_ trn_ address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address deleteCRM_Trn_Address(
		int AddressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCRM_Trn_Address(AddressId);
	}

	/**
	* Deletes the c r m_ trn_ address from the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Address the c r m_ trn_ address
	* @return the c r m_ trn_ address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address deleteCRM_Trn_Address(
		com.ifl.rapid.customer.model.CRM_Trn_Address crm_Trn_Address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCRM_Trn_Address(crm_Trn_Address);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifl.rapid.customer.model.CRM_Trn_Address fetchCRM_Trn_Address(
		int AddressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCRM_Trn_Address(AddressId);
	}

	/**
	* Returns the c r m_ trn_ address with the primary key.
	*
	* @param AddressId the primary key of the c r m_ trn_ address
	* @return the c r m_ trn_ address
	* @throws PortalException if a c r m_ trn_ address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address getCRM_Trn_Address(
		int AddressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_Address(AddressId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the c r m_ trn_ addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ addresses
	* @param end the upper bound of the range of c r m_ trn_ addresses (not inclusive)
	* @return the range of c r m_ trn_ addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Address> getCRM_Trn_Addresses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_Addresses(start, end);
	}

	/**
	* Returns the number of c r m_ trn_ addresses.
	*
	* @return the number of c r m_ trn_ addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int getCRM_Trn_AddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_AddressesCount();
	}

	/**
	* Updates the c r m_ trn_ address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Address the c r m_ trn_ address
	* @return the c r m_ trn_ address that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address updateCRM_Trn_Address(
		com.ifl.rapid.customer.model.CRM_Trn_Address crm_Trn_Address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCRM_Trn_Address(crm_Trn_Address);
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

	/**
	* Returns the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; and AddressTypeId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException} if it could not be found.
	*
	* @param AddressId the address ID
	* @param ContactId the contact ID
	* @param AddressTypeId the address type ID
	* @return the matching c r m_ trn_ address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a matching c r m_ trn_ address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Address findByContactIdAndAddressTypeId(
		int ContactId, int AddressTypeId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByContactIdAndAddressTypeId(ContactId, AddressTypeId);
	}

	public static com.ifl.rapid.customer.model.CRM_Trn_Address findByAddressIdAndContactId(
		int AddressId, int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAddressIdAndContactId(AddressId, ContactId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CRM_Trn_AddressLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CRM_Trn_AddressLocalService.class.getName());

			if (invokableLocalService instanceof CRM_Trn_AddressLocalService) {
				_service = (CRM_Trn_AddressLocalService)invokableLocalService;
			}
			else {
				_service = new CRM_Trn_AddressLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CRM_Trn_AddressLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CRM_Trn_AddressLocalService service) {
	}

	private static CRM_Trn_AddressLocalService _service;
}