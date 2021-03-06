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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link POLICY_DOC_TYPESLocalService}.
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPESLocalService
 * @generated
 */
public class POLICY_DOC_TYPESLocalServiceWrapper
	implements POLICY_DOC_TYPESLocalService,
		ServiceWrapper<POLICY_DOC_TYPESLocalService> {
	public POLICY_DOC_TYPESLocalServiceWrapper(
		POLICY_DOC_TYPESLocalService policy_doc_typesLocalService) {
		_policy_doc_typesLocalService = policy_doc_typesLocalService;
	}

	/**
	* Adds the p o l i c y_ d o c_ t y p e s to the database. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES addPOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.addPOLICY_DOC_TYPES(policy_doc_types);
	}

	/**
	* Creates a new p o l i c y_ d o c_ t y p e s with the primary key. Does not add the p o l i c y_ d o c_ t y p e s to the database.
	*
	* @param ID the primary key for the new p o l i c y_ d o c_ t y p e s
	* @return the new p o l i c y_ d o c_ t y p e s
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES createPOLICY_DOC_TYPES(int ID) {
		return _policy_doc_typesLocalService.createPOLICY_DOC_TYPES(ID);
	}

	/**
	* Deletes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws PortalException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES deletePOLICY_DOC_TYPES(int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.deletePOLICY_DOC_TYPES(ID);
	}

	/**
	* Deletes the p o l i c y_ d o c_ t y p e s from the database. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES deletePOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.deletePOLICY_DOC_TYPES(policy_doc_types);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _policy_doc_typesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES fetchPOLICY_DOC_TYPES(int ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.fetchPOLICY_DOC_TYPES(ID);
	}

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s
	* @throws PortalException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES getPOLICY_DOC_TYPES(int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.getPOLICY_DOC_TYPES(ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> getPOLICY_DOC_TYPESs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.getPOLICY_DOC_TYPESs(start, end);
	}

	/**
	* Returns the number of p o l i c y_ d o c_ t y p e ses.
	*
	* @return the number of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPOLICY_DOC_TYPESsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.getPOLICY_DOC_TYPESsCount();
	}

	/**
	* Updates the p o l i c y_ d o c_ t y p e s in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.POLICY_DOC_TYPES updatePOLICY_DOC_TYPES(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _policy_doc_typesLocalService.updatePOLICY_DOC_TYPES(policy_doc_types);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _policy_doc_typesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_policy_doc_typesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _policy_doc_typesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public POLICY_DOC_TYPESLocalService getWrappedPOLICY_DOC_TYPESLocalService() {
		return _policy_doc_typesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPOLICY_DOC_TYPESLocalService(
		POLICY_DOC_TYPESLocalService policy_doc_typesLocalService) {
		_policy_doc_typesLocalService = policy_doc_typesLocalService;
	}

	@Override
	public POLICY_DOC_TYPESLocalService getWrappedService() {
		return _policy_doc_typesLocalService;
	}

	@Override
	public void setWrappedService(
		POLICY_DOC_TYPESLocalService policy_doc_typesLocalService) {
		_policy_doc_typesLocalService = policy_doc_typesLocalService;
	}

	private POLICY_DOC_TYPESLocalService _policy_doc_typesLocalService;
}