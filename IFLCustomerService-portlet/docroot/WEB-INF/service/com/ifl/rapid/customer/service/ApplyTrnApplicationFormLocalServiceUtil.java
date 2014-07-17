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
 * Provides the local service utility for ApplyTrnApplicationForm. This utility wraps
 * {@link com.ifl.rapid.customer.service.impl.ApplyTrnApplicationFormLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationFormLocalService
 * @see com.ifl.rapid.customer.service.base.ApplyTrnApplicationFormLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.ApplyTrnApplicationFormLocalServiceImpl
 * @generated
 */
public class ApplyTrnApplicationFormLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.ApplyTrnApplicationFormLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the apply trn application form to the database. Also notifies the appropriate model listeners.
	*
	* @param applyTrnApplicationForm the apply trn application form
	* @return the apply trn application form that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm addApplyTrnApplicationForm(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addApplyTrnApplicationForm(applyTrnApplicationForm);
	}

	/**
	* Creates a new apply trn application form with the primary key. Does not add the apply trn application form to the database.
	*
	* @param ApplicationFormId the primary key for the new apply trn application form
	* @return the new apply trn application form
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm createApplyTrnApplicationForm(
		java.lang.String ApplicationFormId) {
		return getService().createApplyTrnApplicationForm(ApplicationFormId);
	}

	/**
	* Deletes the apply trn application form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ApplicationFormId the primary key of the apply trn application form
	* @return the apply trn application form that was removed
	* @throws PortalException if a apply trn application form with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm deleteApplyTrnApplicationForm(
		java.lang.String ApplicationFormId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteApplyTrnApplicationForm(ApplicationFormId);
	}

	/**
	* Deletes the apply trn application form from the database. Also notifies the appropriate model listeners.
	*
	* @param applyTrnApplicationForm the apply trn application form
	* @return the apply trn application form that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm deleteApplyTrnApplicationForm(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteApplyTrnApplicationForm(applyTrnApplicationForm);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm fetchApplyTrnApplicationForm(
		java.lang.String ApplicationFormId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchApplyTrnApplicationForm(ApplicationFormId);
	}

	/**
	* Returns the apply trn application form with the primary key.
	*
	* @param ApplicationFormId the primary key of the apply trn application form
	* @return the apply trn application form
	* @throws PortalException if a apply trn application form with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm getApplyTrnApplicationForm(
		java.lang.String ApplicationFormId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplyTrnApplicationForm(ApplicationFormId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the apply trn application forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apply trn application forms
	* @param end the upper bound of the range of apply trn application forms (not inclusive)
	* @return the range of apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> getApplyTrnApplicationForms(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplyTrnApplicationForms(start, end);
	}

	/**
	* Returns the number of apply trn application forms.
	*
	* @return the number of apply trn application forms
	* @throws SystemException if a system exception occurred
	*/
	public static int getApplyTrnApplicationFormsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplyTrnApplicationFormsCount();
	}

	/**
	* Updates the apply trn application form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param applyTrnApplicationForm the apply trn application form
	* @return the apply trn application form that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm updateApplyTrnApplicationForm(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateApplyTrnApplicationForm(applyTrnApplicationForm);
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
	* Returns the apply trn application form where QuoteId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException} if it could not be found.
	*
	* @param QuoteId the quote ID
	* @return the matching apply trn application form
	* @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a matching apply trn application form could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.ApplyTrnApplicationForm findByQuoteId(
		java.lang.String QuoteId)
		throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByQuoteId(QuoteId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ApplyTrnApplicationFormLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ApplyTrnApplicationFormLocalService.class.getName());

			if (invokableLocalService instanceof ApplyTrnApplicationFormLocalService) {
				_service = (ApplyTrnApplicationFormLocalService)invokableLocalService;
			}
			else {
				_service = new ApplyTrnApplicationFormLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ApplyTrnApplicationFormLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ApplyTrnApplicationFormLocalService service) {
	}

	private static ApplyTrnApplicationFormLocalService _service;
}