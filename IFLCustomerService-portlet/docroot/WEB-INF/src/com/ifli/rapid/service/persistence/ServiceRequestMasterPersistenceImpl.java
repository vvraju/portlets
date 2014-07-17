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

package com.ifli.rapid.service.persistence;

import com.ifli.rapid.NoSuchServiceRequestMasterException;
import com.ifli.rapid.model.ServiceRequestMaster;
import com.ifli.rapid.model.impl.ServiceRequestMasterImpl;
import com.ifli.rapid.model.impl.ServiceRequestMasterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the service request master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceRequestMasterPersistence
 * @see ServiceRequestMasterUtil
 * @generated
 */
public class ServiceRequestMasterPersistenceImpl extends BasePersistenceImpl<ServiceRequestMaster>
	implements ServiceRequestMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceRequestMasterUtil} to access the service request master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceRequestMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceRequestMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceRequestMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServiceRequestMasterPersistenceImpl() {
		setModelClass(ServiceRequestMaster.class);
	}

	/**
	 * Caches the service request master in the entity cache if it is enabled.
	 *
	 * @param serviceRequestMaster the service request master
	 */
	@Override
	public void cacheResult(ServiceRequestMaster serviceRequestMaster) {
		EntityCacheUtil.putResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterImpl.class,
			serviceRequestMaster.getPrimaryKey(), serviceRequestMaster);

		serviceRequestMaster.resetOriginalValues();
	}

	/**
	 * Caches the service request masters in the entity cache if it is enabled.
	 *
	 * @param serviceRequestMasters the service request masters
	 */
	@Override
	public void cacheResult(List<ServiceRequestMaster> serviceRequestMasters) {
		for (ServiceRequestMaster serviceRequestMaster : serviceRequestMasters) {
			if (EntityCacheUtil.getResult(
						ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceRequestMasterImpl.class,
						serviceRequestMaster.getPrimaryKey()) == null) {
				cacheResult(serviceRequestMaster);
			}
			else {
				serviceRequestMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service request masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceRequestMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceRequestMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service request master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceRequestMaster serviceRequestMaster) {
		EntityCacheUtil.removeResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterImpl.class, serviceRequestMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceRequestMaster> serviceRequestMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceRequestMaster serviceRequestMaster : serviceRequestMasters) {
			EntityCacheUtil.removeResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceRequestMasterImpl.class,
				serviceRequestMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service request master with the primary key. Does not add the service request master to the database.
	 *
	 * @param Id the primary key for the new service request master
	 * @return the new service request master
	 */
	@Override
	public ServiceRequestMaster create(String Id) {
		ServiceRequestMaster serviceRequestMaster = new ServiceRequestMasterImpl();

		serviceRequestMaster.setNew(true);
		serviceRequestMaster.setPrimaryKey(Id);

		return serviceRequestMaster;
	}

	/**
	 * Removes the service request master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the service request master
	 * @return the service request master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceRequestMasterException if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster remove(String Id)
		throws NoSuchServiceRequestMasterException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the service request master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service request master
	 * @return the service request master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceRequestMasterException if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster remove(Serializable primaryKey)
		throws NoSuchServiceRequestMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceRequestMaster serviceRequestMaster = (ServiceRequestMaster)session.get(ServiceRequestMasterImpl.class,
					primaryKey);

			if (serviceRequestMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceRequestMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceRequestMaster);
		}
		catch (NoSuchServiceRequestMasterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ServiceRequestMaster removeImpl(
		ServiceRequestMaster serviceRequestMaster) throws SystemException {
		serviceRequestMaster = toUnwrappedModel(serviceRequestMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceRequestMaster)) {
				serviceRequestMaster = (ServiceRequestMaster)session.get(ServiceRequestMasterImpl.class,
						serviceRequestMaster.getPrimaryKeyObj());
			}

			if (serviceRequestMaster != null) {
				session.delete(serviceRequestMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceRequestMaster != null) {
			clearCache(serviceRequestMaster);
		}

		return serviceRequestMaster;
	}

	@Override
	public ServiceRequestMaster updateImpl(
		com.ifli.rapid.model.ServiceRequestMaster serviceRequestMaster)
		throws SystemException {
		serviceRequestMaster = toUnwrappedModel(serviceRequestMaster);

		boolean isNew = serviceRequestMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceRequestMaster.isNew()) {
				session.save(serviceRequestMaster);

				serviceRequestMaster.setNew(false);
			}
			else {
				session.merge(serviceRequestMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRequestMasterImpl.class,
			serviceRequestMaster.getPrimaryKey(), serviceRequestMaster);

		return serviceRequestMaster;
	}

	protected ServiceRequestMaster toUnwrappedModel(
		ServiceRequestMaster serviceRequestMaster) {
		if (serviceRequestMaster instanceof ServiceRequestMasterImpl) {
			return serviceRequestMaster;
		}

		ServiceRequestMasterImpl serviceRequestMasterImpl = new ServiceRequestMasterImpl();

		serviceRequestMasterImpl.setNew(serviceRequestMaster.isNew());
		serviceRequestMasterImpl.setPrimaryKey(serviceRequestMaster.getPrimaryKey());

		serviceRequestMasterImpl.setId(serviceRequestMaster.getId());
		serviceRequestMasterImpl.setType(serviceRequestMaster.getType());
		serviceRequestMasterImpl.setContactId(serviceRequestMaster.getContactId());
		serviceRequestMasterImpl.setAddressTypeId(serviceRequestMaster.getAddressTypeId());
		serviceRequestMasterImpl.setAddress(serviceRequestMaster.getAddress());
		serviceRequestMasterImpl.setPolicyNo(serviceRequestMaster.getPolicyNo());
		serviceRequestMasterImpl.setMobileNo(serviceRequestMaster.getMobileNo());
		serviceRequestMasterImpl.setDescription(serviceRequestMaster.getDescription());
		serviceRequestMasterImpl.setStartPreferedTime(serviceRequestMaster.getStartPreferedTime());
		serviceRequestMasterImpl.setEndPreferedTime(serviceRequestMaster.getEndPreferedTime());
		serviceRequestMasterImpl.setPreferedDate(serviceRequestMaster.getPreferedDate());

		return serviceRequestMasterImpl;
	}

	/**
	 * Returns the service request master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service request master
	 * @return the service request master
	 * @throws com.ifli.rapid.NoSuchServiceRequestMasterException if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceRequestMasterException, SystemException {
		ServiceRequestMaster serviceRequestMaster = fetchByPrimaryKey(primaryKey);

		if (serviceRequestMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceRequestMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceRequestMaster;
	}

	/**
	 * Returns the service request master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceRequestMasterException} if it could not be found.
	 *
	 * @param Id the primary key of the service request master
	 * @return the service request master
	 * @throws com.ifli.rapid.NoSuchServiceRequestMasterException if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster findByPrimaryKey(String Id)
		throws NoSuchServiceRequestMasterException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the service request master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service request master
	 * @return the service request master, or <code>null</code> if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceRequestMaster serviceRequestMaster = (ServiceRequestMaster)EntityCacheUtil.getResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceRequestMasterImpl.class, primaryKey);

		if (serviceRequestMaster == _nullServiceRequestMaster) {
			return null;
		}

		if (serviceRequestMaster == null) {
			Session session = null;

			try {
				session = openSession();

				serviceRequestMaster = (ServiceRequestMaster)session.get(ServiceRequestMasterImpl.class,
						primaryKey);

				if (serviceRequestMaster != null) {
					cacheResult(serviceRequestMaster);
				}
				else {
					EntityCacheUtil.putResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceRequestMasterImpl.class, primaryKey,
						_nullServiceRequestMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceRequestMasterModelImpl.ENTITY_CACHE_ENABLED,
					ServiceRequestMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceRequestMaster;
	}

	/**
	 * Returns the service request master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the service request master
	 * @return the service request master, or <code>null</code> if a service request master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRequestMaster fetchByPrimaryKey(String Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the service request masters.
	 *
	 * @return the service request masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceRequestMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service request masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceRequestMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service request masters
	 * @param end the upper bound of the range of service request masters (not inclusive)
	 * @return the range of service request masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceRequestMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service request masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceRequestMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service request masters
	 * @param end the upper bound of the range of service request masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service request masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceRequestMaster> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ServiceRequestMaster> list = (List<ServiceRequestMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEREQUESTMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEREQUESTMASTER;

				if (pagination) {
					sql = sql.concat(ServiceRequestMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceRequestMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceRequestMaster>(list);
				}
				else {
					list = (List<ServiceRequestMaster>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the service request masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceRequestMaster serviceRequestMaster : findAll()) {
			remove(serviceRequestMaster);
		}
	}

	/**
	 * Returns the number of service request masters.
	 *
	 * @return the number of service request masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICEREQUESTMASTER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the service request master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ServiceRequestMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceRequestMaster>> listenersList = new ArrayList<ModelListener<ServiceRequestMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceRequestMaster>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ServiceRequestMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEREQUESTMASTER = "SELECT serviceRequestMaster FROM ServiceRequestMaster serviceRequestMaster";
	private static final String _SQL_COUNT_SERVICEREQUESTMASTER = "SELECT COUNT(serviceRequestMaster) FROM ServiceRequestMaster serviceRequestMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceRequestMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceRequestMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServiceRequestMasterPersistenceImpl.class);
	private static ServiceRequestMaster _nullServiceRequestMaster = new ServiceRequestMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceRequestMaster> toCacheModel() {
				return _nullServiceRequestMasterCacheModel;
			}
		};

	private static CacheModel<ServiceRequestMaster> _nullServiceRequestMasterCacheModel =
		new CacheModel<ServiceRequestMaster>() {
			@Override
			public ServiceRequestMaster toEntityModel() {
				return _nullServiceRequestMaster;
			}
		};
}