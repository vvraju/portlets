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

import com.ifli.rapid.NoSuchServiceMasterException;
import com.ifli.rapid.model.ServiceMaster;
import com.ifli.rapid.model.impl.ServiceMasterImpl;
import com.ifli.rapid.model.impl.ServiceMasterModelImpl;

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
 * The persistence implementation for the service master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceMasterPersistence
 * @see ServiceMasterUtil
 * @generated
 */
public class ServiceMasterPersistenceImpl extends BasePersistenceImpl<ServiceMaster>
	implements ServiceMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceMasterUtil} to access the service master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceMasterImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServiceMasterPersistenceImpl() {
		setModelClass(ServiceMaster.class);
	}

	/**
	 * Caches the service master in the entity cache if it is enabled.
	 *
	 * @param serviceMaster the service master
	 */
	@Override
	public void cacheResult(ServiceMaster serviceMaster) {
		EntityCacheUtil.putResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterImpl.class, serviceMaster.getPrimaryKey(),
			serviceMaster);

		serviceMaster.resetOriginalValues();
	}

	/**
	 * Caches the service masters in the entity cache if it is enabled.
	 *
	 * @param serviceMasters the service masters
	 */
	@Override
	public void cacheResult(List<ServiceMaster> serviceMasters) {
		for (ServiceMaster serviceMaster : serviceMasters) {
			if (EntityCacheUtil.getResult(
						ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceMasterImpl.class, serviceMaster.getPrimaryKey()) == null) {
				cacheResult(serviceMaster);
			}
			else {
				serviceMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceMaster serviceMaster) {
		EntityCacheUtil.removeResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterImpl.class, serviceMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceMaster> serviceMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceMaster serviceMaster : serviceMasters) {
			EntityCacheUtil.removeResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceMasterImpl.class, serviceMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service master with the primary key. Does not add the service master to the database.
	 *
	 * @param SERVICE_MASTER_ID the primary key for the new service master
	 * @return the new service master
	 */
	@Override
	public ServiceMaster create(int SERVICE_MASTER_ID) {
		ServiceMaster serviceMaster = new ServiceMasterImpl();

		serviceMaster.setNew(true);
		serviceMaster.setPrimaryKey(SERVICE_MASTER_ID);

		return serviceMaster;
	}

	/**
	 * Removes the service master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SERVICE_MASTER_ID the primary key of the service master
	 * @return the service master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster remove(int SERVICE_MASTER_ID)
		throws NoSuchServiceMasterException, SystemException {
		return remove((Serializable)SERVICE_MASTER_ID);
	}

	/**
	 * Removes the service master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service master
	 * @return the service master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster remove(Serializable primaryKey)
		throws NoSuchServiceMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceMaster serviceMaster = (ServiceMaster)session.get(ServiceMasterImpl.class,
					primaryKey);

			if (serviceMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceMaster);
		}
		catch (NoSuchServiceMasterException nsee) {
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
	protected ServiceMaster removeImpl(ServiceMaster serviceMaster)
		throws SystemException {
		serviceMaster = toUnwrappedModel(serviceMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceMaster)) {
				serviceMaster = (ServiceMaster)session.get(ServiceMasterImpl.class,
						serviceMaster.getPrimaryKeyObj());
			}

			if (serviceMaster != null) {
				session.delete(serviceMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceMaster != null) {
			clearCache(serviceMaster);
		}

		return serviceMaster;
	}

	@Override
	public ServiceMaster updateImpl(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws SystemException {
		serviceMaster = toUnwrappedModel(serviceMaster);

		boolean isNew = serviceMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceMaster.isNew()) {
				session.save(serviceMaster);

				serviceMaster.setNew(false);
			}
			else {
				session.merge(serviceMaster);
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

		EntityCacheUtil.putResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceMasterImpl.class, serviceMaster.getPrimaryKey(),
			serviceMaster);

		return serviceMaster;
	}

	protected ServiceMaster toUnwrappedModel(ServiceMaster serviceMaster) {
		if (serviceMaster instanceof ServiceMasterImpl) {
			return serviceMaster;
		}

		ServiceMasterImpl serviceMasterImpl = new ServiceMasterImpl();

		serviceMasterImpl.setNew(serviceMaster.isNew());
		serviceMasterImpl.setPrimaryKey(serviceMaster.getPrimaryKey());

		serviceMasterImpl.setSERVICE_MASTER_ID(serviceMaster.getSERVICE_MASTER_ID());
		serviceMasterImpl.setSERVICE_MASTER_NAME(serviceMaster.getSERVICE_MASTER_NAME());
		serviceMasterImpl.setSERVICE_MASTER_DESC(serviceMaster.getSERVICE_MASTER_DESC());
		serviceMasterImpl.setACTIVE_FLAG(serviceMaster.getACTIVE_FLAG());

		return serviceMasterImpl;
	}

	/**
	 * Returns the service master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service master
	 * @return the service master
	 * @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceMasterException, SystemException {
		ServiceMaster serviceMaster = fetchByPrimaryKey(primaryKey);

		if (serviceMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceMaster;
	}

	/**
	 * Returns the service master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceMasterException} if it could not be found.
	 *
	 * @param SERVICE_MASTER_ID the primary key of the service master
	 * @return the service master
	 * @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster findByPrimaryKey(int SERVICE_MASTER_ID)
		throws NoSuchServiceMasterException, SystemException {
		return findByPrimaryKey((Serializable)SERVICE_MASTER_ID);
	}

	/**
	 * Returns the service master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service master
	 * @return the service master, or <code>null</code> if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceMaster serviceMaster = (ServiceMaster)EntityCacheUtil.getResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceMasterImpl.class, primaryKey);

		if (serviceMaster == _nullServiceMaster) {
			return null;
		}

		if (serviceMaster == null) {
			Session session = null;

			try {
				session = openSession();

				serviceMaster = (ServiceMaster)session.get(ServiceMasterImpl.class,
						primaryKey);

				if (serviceMaster != null) {
					cacheResult(serviceMaster);
				}
				else {
					EntityCacheUtil.putResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceMasterImpl.class, primaryKey, _nullServiceMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceMasterModelImpl.ENTITY_CACHE_ENABLED,
					ServiceMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceMaster;
	}

	/**
	 * Returns the service master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SERVICE_MASTER_ID the primary key of the service master
	 * @return the service master, or <code>null</code> if a service master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceMaster fetchByPrimaryKey(int SERVICE_MASTER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)SERVICE_MASTER_ID);
	}

	/**
	 * Returns all the service masters.
	 *
	 * @return the service masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service masters
	 * @param end the upper bound of the range of service masters (not inclusive)
	 * @return the range of service masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service masters
	 * @param end the upper bound of the range of service masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceMaster> findAll(int start, int end,
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

		List<ServiceMaster> list = (List<ServiceMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEMASTER;

				if (pagination) {
					sql = sql.concat(ServiceMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceMaster>(list);
				}
				else {
					list = (List<ServiceMaster>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the service masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceMaster serviceMaster : findAll()) {
			remove(serviceMaster);
		}
	}

	/**
	 * Returns the number of service masters.
	 *
	 * @return the number of service masters
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEMASTER);

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
	 * Initializes the service master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ServiceMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceMaster>> listenersList = new ArrayList<ModelListener<ServiceMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEMASTER = "SELECT serviceMaster FROM ServiceMaster serviceMaster";
	private static final String _SQL_COUNT_SERVICEMASTER = "SELECT COUNT(serviceMaster) FROM ServiceMaster serviceMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServiceMasterPersistenceImpl.class);
	private static ServiceMaster _nullServiceMaster = new ServiceMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceMaster> toCacheModel() {
				return _nullServiceMasterCacheModel;
			}
		};

	private static CacheModel<ServiceMaster> _nullServiceMasterCacheModel = new CacheModel<ServiceMaster>() {
			@Override
			public ServiceMaster toEntityModel() {
				return _nullServiceMaster;
			}
		};
}