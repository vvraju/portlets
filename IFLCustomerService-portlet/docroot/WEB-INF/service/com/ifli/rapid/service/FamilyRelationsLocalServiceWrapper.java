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
 * Provides a wrapper for {@link FamilyRelationsLocalService}.
 *
 * @author Satya Kola
 * @see FamilyRelationsLocalService
 * @generated
 */
public class FamilyRelationsLocalServiceWrapper
	implements FamilyRelationsLocalService,
		ServiceWrapper<FamilyRelationsLocalService> {
	public FamilyRelationsLocalServiceWrapper(
		FamilyRelationsLocalService familyRelationsLocalService) {
		_familyRelationsLocalService = familyRelationsLocalService;
	}

	/**
	* Adds the family relations to the database. Also notifies the appropriate model listeners.
	*
	* @param familyRelations the family relations
	* @return the family relations that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations addFamilyRelations(
		com.ifli.rapid.model.FamilyRelations familyRelations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.addFamilyRelations(familyRelations);
	}

	/**
	* Creates a new family relations with the primary key. Does not add the family relations to the database.
	*
	* @param RELATION_ID the primary key for the new family relations
	* @return the new family relations
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations createFamilyRelations(
		int RELATION_ID) {
		return _familyRelationsLocalService.createFamilyRelations(RELATION_ID);
	}

	/**
	* Deletes the family relations with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RELATION_ID the primary key of the family relations
	* @return the family relations that was removed
	* @throws PortalException if a family relations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations deleteFamilyRelations(
		int RELATION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.deleteFamilyRelations(RELATION_ID);
	}

	/**
	* Deletes the family relations from the database. Also notifies the appropriate model listeners.
	*
	* @param familyRelations the family relations
	* @return the family relations that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations deleteFamilyRelations(
		com.ifli.rapid.model.FamilyRelations familyRelations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.deleteFamilyRelations(familyRelations);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _familyRelationsLocalService.dynamicQuery();
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
		return _familyRelationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FamilyRelationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _familyRelationsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FamilyRelationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _familyRelationsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _familyRelationsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _familyRelationsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.FamilyRelations fetchFamilyRelations(
		int RELATION_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.fetchFamilyRelations(RELATION_ID);
	}

	/**
	* Returns the family relations with the primary key.
	*
	* @param RELATION_ID the primary key of the family relations
	* @return the family relations
	* @throws PortalException if a family relations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations getFamilyRelations(
		int RELATION_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.getFamilyRelations(RELATION_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the family relationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FamilyRelationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of family relationses
	* @param end the upper bound of the range of family relationses (not inclusive)
	* @return the range of family relationses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.FamilyRelations> getFamilyRelationses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.getFamilyRelationses(start, end);
	}

	/**
	* Returns the number of family relationses.
	*
	* @return the number of family relationses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFamilyRelationsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.getFamilyRelationsesCount();
	}

	/**
	* Updates the family relations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param familyRelations the family relations
	* @return the family relations that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.FamilyRelations updateFamilyRelations(
		com.ifli.rapid.model.FamilyRelations familyRelations)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _familyRelationsLocalService.updateFamilyRelations(familyRelations);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _familyRelationsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_familyRelationsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _familyRelationsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FamilyRelationsLocalService getWrappedFamilyRelationsLocalService() {
		return _familyRelationsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFamilyRelationsLocalService(
		FamilyRelationsLocalService familyRelationsLocalService) {
		_familyRelationsLocalService = familyRelationsLocalService;
	}

	@Override
	public FamilyRelationsLocalService getWrappedService() {
		return _familyRelationsLocalService;
	}

	@Override
	public void setWrappedService(
		FamilyRelationsLocalService familyRelationsLocalService) {
		_familyRelationsLocalService = familyRelationsLocalService;
	}

	private FamilyRelationsLocalService _familyRelationsLocalService;
}