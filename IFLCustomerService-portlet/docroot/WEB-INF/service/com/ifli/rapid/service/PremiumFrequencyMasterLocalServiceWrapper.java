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
 * Provides a wrapper for {@link PremiumFrequencyMasterLocalService}.
 *
 * @author Satya Kola
 * @see PremiumFrequencyMasterLocalService
 * @generated
 */
public class PremiumFrequencyMasterLocalServiceWrapper
	implements PremiumFrequencyMasterLocalService,
		ServiceWrapper<PremiumFrequencyMasterLocalService> {
	public PremiumFrequencyMasterLocalServiceWrapper(
		PremiumFrequencyMasterLocalService premiumFrequencyMasterLocalService) {
		_premiumFrequencyMasterLocalService = premiumFrequencyMasterLocalService;
	}

	/**
	* Adds the premium frequency master to the database. Also notifies the appropriate model listeners.
	*
	* @param premiumFrequencyMaster the premium frequency master
	* @return the premium frequency master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster addPremiumFrequencyMaster(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.addPremiumFrequencyMaster(premiumFrequencyMaster);
	}

	/**
	* Creates a new premium frequency master with the primary key. Does not add the premium frequency master to the database.
	*
	* @param PremiumFrequencyId the primary key for the new premium frequency master
	* @return the new premium frequency master
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster createPremiumFrequencyMaster(
		java.lang.String PremiumFrequencyId) {
		return _premiumFrequencyMasterLocalService.createPremiumFrequencyMaster(PremiumFrequencyId);
	}

	/**
	* Deletes the premium frequency master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PremiumFrequencyId the primary key of the premium frequency master
	* @return the premium frequency master that was removed
	* @throws PortalException if a premium frequency master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster deletePremiumFrequencyMaster(
		java.lang.String PremiumFrequencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.deletePremiumFrequencyMaster(PremiumFrequencyId);
	}

	/**
	* Deletes the premium frequency master from the database. Also notifies the appropriate model listeners.
	*
	* @param premiumFrequencyMaster the premium frequency master
	* @return the premium frequency master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster deletePremiumFrequencyMaster(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.deletePremiumFrequencyMaster(premiumFrequencyMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _premiumFrequencyMasterLocalService.dynamicQuery();
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
		return _premiumFrequencyMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _premiumFrequencyMasterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _premiumFrequencyMasterLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _premiumFrequencyMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _premiumFrequencyMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster fetchPremiumFrequencyMaster(
		java.lang.String PremiumFrequencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.fetchPremiumFrequencyMaster(PremiumFrequencyId);
	}

	/**
	* Returns the premium frequency master with the primary key.
	*
	* @param PremiumFrequencyId the primary key of the premium frequency master
	* @return the premium frequency master
	* @throws PortalException if a premium frequency master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster getPremiumFrequencyMaster(
		java.lang.String PremiumFrequencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.getPremiumFrequencyMaster(PremiumFrequencyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the premium frequency masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of premium frequency masters
	* @param end the upper bound of the range of premium frequency masters (not inclusive)
	* @return the range of premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PremiumFrequencyMaster> getPremiumFrequencyMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.getPremiumFrequencyMasters(start,
			end);
	}

	/**
	* Returns the number of premium frequency masters.
	*
	* @return the number of premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPremiumFrequencyMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.getPremiumFrequencyMastersCount();
	}

	/**
	* Updates the premium frequency master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param premiumFrequencyMaster the premium frequency master
	* @return the premium frequency master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PremiumFrequencyMaster updatePremiumFrequencyMaster(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _premiumFrequencyMasterLocalService.updatePremiumFrequencyMaster(premiumFrequencyMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _premiumFrequencyMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_premiumFrequencyMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _premiumFrequencyMasterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PremiumFrequencyMasterLocalService getWrappedPremiumFrequencyMasterLocalService() {
		return _premiumFrequencyMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPremiumFrequencyMasterLocalService(
		PremiumFrequencyMasterLocalService premiumFrequencyMasterLocalService) {
		_premiumFrequencyMasterLocalService = premiumFrequencyMasterLocalService;
	}

	@Override
	public PremiumFrequencyMasterLocalService getWrappedService() {
		return _premiumFrequencyMasterLocalService;
	}

	@Override
	public void setWrappedService(
		PremiumFrequencyMasterLocalService premiumFrequencyMasterLocalService) {
		_premiumFrequencyMasterLocalService = premiumFrequencyMasterLocalService;
	}

	private PremiumFrequencyMasterLocalService _premiumFrequencyMasterLocalService;
}