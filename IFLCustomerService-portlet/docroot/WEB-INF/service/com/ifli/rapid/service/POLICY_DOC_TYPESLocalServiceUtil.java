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
 * Provides the local service utility for POLICY_DOC_TYPES. This utility wraps
 * {@link com.ifli.rapid.service.impl.POLICY_DOC_TYPESLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPESLocalService
 * @see com.ifli.rapid.service.base.POLICY_DOC_TYPESLocalServiceBaseImpl
 * @see com.ifli.rapid.service.impl.POLICY_DOC_TYPESLocalServiceImpl
 * @generated
 */
public class POLICY_DOC_TYPESLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifli.rapid.service.impl.POLICY_DOC_TYPESLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the p o l i c y_ d o c_ t y p e s to the database. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES addPOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPOLICY_DOC_TYPES(policy_doc_types);
	}

	/**
	* Creates a new p o l i c y_ d o c_ t y p e s with the primary key. Does not add the p o l i c y_ d o c_ t y p e s to the database.
	*
	* @param ID the primary key for the new p o l i c y_ d o c_ t y p e s
	* @return the new p o l i c y_ d o c_ t y p e s
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES createPOLICY_DOC_TYPES(
		int ID) {
		return getService().createPOLICY_DOC_TYPES(ID);
	}

	/**
	* Deletes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws PortalException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES deletePOLICY_DOC_TYPES(
		int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePOLICY_DOC_TYPES(ID);
	}

	/**
	* Deletes the p o l i c y_ d o c_ t y p e s from the database. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES deletePOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePOLICY_DOC_TYPES(policy_doc_types);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifli.rapid.model.POLICY_DOC_TYPES fetchPOLICY_DOC_TYPES(
		int ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPOLICY_DOC_TYPES(ID);
	}

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s
	* @throws PortalException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES getPOLICY_DOC_TYPES(
		int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPOLICY_DOC_TYPES(ID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the p o l i c y_ d o c_ t y p e ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	* @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	* @return the range of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> getPOLICY_DOC_TYPESs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPOLICY_DOC_TYPESs(start, end);
	}

	/**
	* Returns the number of p o l i c y_ d o c_ t y p e ses.
	*
	* @return the number of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static int getPOLICY_DOC_TYPESsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPOLICY_DOC_TYPESsCount();
	}

	/**
	* Updates the p o l i c y_ d o c_ t y p e s in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES updatePOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePOLICY_DOC_TYPES(policy_doc_types);
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

	public static POLICY_DOC_TYPESLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					POLICY_DOC_TYPESLocalService.class.getName());

			if (invokableLocalService instanceof POLICY_DOC_TYPESLocalService) {
				_service = (POLICY_DOC_TYPESLocalService)invokableLocalService;
			}
			else {
				_service = new POLICY_DOC_TYPESLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(POLICY_DOC_TYPESLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(POLICY_DOC_TYPESLocalService service) {
	}

	private static POLICY_DOC_TYPESLocalService _service;
}