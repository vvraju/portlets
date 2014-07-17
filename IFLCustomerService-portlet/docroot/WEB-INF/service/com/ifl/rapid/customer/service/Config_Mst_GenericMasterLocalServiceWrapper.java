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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Config_Mst_GenericMasterLocalService}.
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterLocalService
 * @generated
 */
public class Config_Mst_GenericMasterLocalServiceWrapper
	implements Config_Mst_GenericMasterLocalService,
		ServiceWrapper<Config_Mst_GenericMasterLocalService> {
	public Config_Mst_GenericMasterLocalServiceWrapper(
		Config_Mst_GenericMasterLocalService config_Mst_GenericMasterLocalService) {
		_config_Mst_GenericMasterLocalService = config_Mst_GenericMasterLocalService;
	}

	/**
	* Adds the config_ mst_ generic master to the database. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster addConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.addConfig_Mst_GenericMaster(config_Mst_GenericMaster);
	}

	/**
	* Creates a new config_ mst_ generic master with the primary key. Does not add the config_ mst_ generic master to the database.
	*
	* @param GenericMasterId the primary key for the new config_ mst_ generic master
	* @return the new config_ mst_ generic master
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster createConfig_Mst_GenericMaster(
		int GenericMasterId) {
		return _config_Mst_GenericMasterLocalService.createConfig_Mst_GenericMaster(GenericMasterId);
	}

	/**
	* Deletes the config_ mst_ generic master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master that was removed
	* @throws PortalException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster deleteConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.deleteConfig_Mst_GenericMaster(GenericMasterId);
	}

	/**
	* Deletes the config_ mst_ generic master from the database. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster deleteConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.deleteConfig_Mst_GenericMaster(config_Mst_GenericMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _config_Mst_GenericMasterLocalService.dynamicQuery();
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
		return _config_Mst_GenericMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _config_Mst_GenericMasterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _config_Mst_GenericMasterLocalService.dynamicQuery(dynamicQuery,
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
		return _config_Mst_GenericMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _config_Mst_GenericMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.fetchConfig_Mst_GenericMaster(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master with the primary key.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master
	* @throws PortalException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster getConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.getConfig_Mst_GenericMaster(GenericMasterId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the config_ mst_ generic masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of config_ mst_ generic masters
	* @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	* @return the range of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> getConfig_Mst_GenericMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.getConfig_Mst_GenericMasters(start,
			end);
	}

	/**
	* Returns the number of config_ mst_ generic masters.
	*
	* @return the number of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConfig_Mst_GenericMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.getConfig_Mst_GenericMastersCount();
	}

	/**
	* Updates the config_ mst_ generic master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster updateConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.updateConfig_Mst_GenericMaster(config_Mst_GenericMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _config_Mst_GenericMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_config_Mst_GenericMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _config_Mst_GenericMasterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param GenericMasterId the generic master ID
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByGenericMasterId(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.findByGenericMasterId(GenericMasterId);
	}

	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.findByMasterTypeAndMasterKey(MasterType,
			MasterKey);
	}

	@Override
	public java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findByMasterType(
		java.lang.String MasterType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _config_Mst_GenericMasterLocalService.findByMasterType(MasterType);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Config_Mst_GenericMasterLocalService getWrappedConfig_Mst_GenericMasterLocalService() {
		return _config_Mst_GenericMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConfig_Mst_GenericMasterLocalService(
		Config_Mst_GenericMasterLocalService config_Mst_GenericMasterLocalService) {
		_config_Mst_GenericMasterLocalService = config_Mst_GenericMasterLocalService;
	}

	@Override
	public Config_Mst_GenericMasterLocalService getWrappedService() {
		return _config_Mst_GenericMasterLocalService;
	}

	@Override
	public void setWrappedService(
		Config_Mst_GenericMasterLocalService config_Mst_GenericMasterLocalService) {
		_config_Mst_GenericMasterLocalService = config_Mst_GenericMasterLocalService;
	}

	private Config_Mst_GenericMasterLocalService _config_Mst_GenericMasterLocalService;
}