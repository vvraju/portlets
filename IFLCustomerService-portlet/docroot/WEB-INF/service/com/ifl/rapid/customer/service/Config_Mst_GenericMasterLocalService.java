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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Config_Mst_GenericMaster. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterLocalServiceUtil
 * @see com.ifl.rapid.customer.service.base.Config_Mst_GenericMasterLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.impl.Config_Mst_GenericMasterLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface Config_Mst_GenericMasterLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Config_Mst_GenericMasterLocalServiceUtil} to access the config_ mst_ generic master local service. Add custom service methods to {@link com.ifl.rapid.customer.service.impl.Config_Mst_GenericMasterLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the config_ mst_ generic master to the database. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster addConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new config_ mst_ generic master with the primary key. Does not add the config_ mst_ generic master to the database.
	*
	* @param GenericMasterId the primary key for the new config_ mst_ generic master
	* @return the new config_ mst_ generic master
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster createConfig_Mst_GenericMaster(
		int GenericMasterId);

	/**
	* Deletes the config_ mst_ generic master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master that was removed
	* @throws PortalException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster deleteConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the config_ mst_ generic master from the database. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster deleteConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster fetchConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the config_ mst_ generic master with the primary key.
	*
	* @param GenericMasterId the primary key of the config_ mst_ generic master
	* @return the config_ mst_ generic master
	* @throws PortalException if a config_ mst_ generic master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster getConfig_Mst_GenericMaster(
		int GenericMasterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> getConfig_Mst_GenericMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of config_ mst_ generic masters.
	*
	* @return the number of config_ mst_ generic masters
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getConfig_Mst_GenericMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the config_ mst_ generic master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param config_Mst_GenericMaster the config_ mst_ generic master
	* @return the config_ mst_ generic master that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster updateConfig_Mst_GenericMaster(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param GenericMasterId the generic master ID
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByGenericMasterId(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.ifl.rapid.customer.model.Config_Mst_GenericMaster> findByMasterType(
		java.lang.String MasterType)
		throws com.liferay.portal.kernel.exception.SystemException;
}