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
 * Provides the local service utility for CRM_Trn_Contact. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.CRM_Trn_ContactLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see CRM_Trn_ContactLocalService
 * @see com.ifl.rapid.customer.service.base.CRM_Trn_ContactLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.CRM_Trn_ContactLocalServiceImpl
 * @generated
 */
public class CRM_Trn_ContactLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.CRM_Trn_ContactLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the c r m_ trn_ contact to the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Contact the c r m_ trn_ contact
	* @return the c r m_ trn_ contact that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact addCRM_Trn_Contact(
		com.ifl.rapid.customer.model.CRM_Trn_Contact crm_Trn_Contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCRM_Trn_Contact(crm_Trn_Contact);
	}

	/**
	* Creates a new c r m_ trn_ contact with the primary key. Does not add the c r m_ trn_ contact to the database.
	*
	* @param ContactId the primary key for the new c r m_ trn_ contact
	* @return the new c r m_ trn_ contact
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact createCRM_Trn_Contact(
		int ContactId) {
		return getService().createCRM_Trn_Contact(ContactId);
	}

	/**
	* Deletes the c r m_ trn_ contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ContactId the primary key of the c r m_ trn_ contact
	* @return the c r m_ trn_ contact that was removed
	* @throws PortalException if a c r m_ trn_ contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact deleteCRM_Trn_Contact(
		int ContactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCRM_Trn_Contact(ContactId);
	}

	/**
	* Deletes the c r m_ trn_ contact from the database. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Contact the c r m_ trn_ contact
	* @return the c r m_ trn_ contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact deleteCRM_Trn_Contact(
		com.ifl.rapid.customer.model.CRM_Trn_Contact crm_Trn_Contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCRM_Trn_Contact(crm_Trn_Contact);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifl.rapid.customer.model.CRM_Trn_Contact fetchCRM_Trn_Contact(
		int ContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCRM_Trn_Contact(ContactId);
	}

	/**
	* Returns the c r m_ trn_ contact with the primary key.
	*
	* @param ContactId the primary key of the c r m_ trn_ contact
	* @return the c r m_ trn_ contact
	* @throws PortalException if a c r m_ trn_ contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact getCRM_Trn_Contact(
		int ContactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_Contact(ContactId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the c r m_ trn_ contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ contacts
	* @param end the upper bound of the range of c r m_ trn_ contacts (not inclusive)
	* @return the range of c r m_ trn_ contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_Contact> getCRM_Trn_Contacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_Contacts(start, end);
	}

	/**
	* Returns the number of c r m_ trn_ contacts.
	*
	* @return the number of c r m_ trn_ contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int getCRM_Trn_ContactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCRM_Trn_ContactsCount();
	}

	/**
	* Updates the c r m_ trn_ contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crm_Trn_Contact the c r m_ trn_ contact
	* @return the c r m_ trn_ contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact updateCRM_Trn_Contact(
		com.ifl.rapid.customer.model.CRM_Trn_Contact crm_Trn_Contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCRM_Trn_Contact(crm_Trn_Contact);
	}

	public static com.ifl.rapid.customer.model.CRM_Trn_ContactPhotographBlobModel getPhotographBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPhotographBlobModel(primaryKey);
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
	* Returns the c r m_ trn_ contact where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @return the matching c r m_ trn_ contact
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a matching c r m_ trn_ contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_Contact findByContactId(
		int ContactId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByContactId(ContactId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CRM_Trn_ContactLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CRM_Trn_ContactLocalService.class.getName());

			if (invokableLocalService instanceof CRM_Trn_ContactLocalService) {
				_service = (CRM_Trn_ContactLocalService)invokableLocalService;
			}
			else {
				_service = new CRM_Trn_ContactLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CRM_Trn_ContactLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CRM_Trn_ContactLocalService service) {
	}

	private static CRM_Trn_ContactLocalService _service;
}