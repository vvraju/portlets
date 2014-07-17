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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.NoSuchQrcMstSubServicesException;
import com.ifl.rapid.customer.model.QrcMstSubServices;
import com.ifl.rapid.customer.model.impl.QrcMstSubServicesImpl;
import com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl;

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
 * The persistence implementation for the qrc mst sub services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstSubServicesPersistence
 * @see QrcMstSubServicesUtil
 * @generated
 */
public class QrcMstSubServicesPersistenceImpl extends BasePersistenceImpl<QrcMstSubServices>
	implements QrcMstSubServicesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcMstSubServicesUtil} to access the qrc mst sub services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcMstSubServicesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesModelImpl.FINDER_CACHE_ENABLED,
			QrcMstSubServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesModelImpl.FINDER_CACHE_ENABLED,
			QrcMstSubServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcMstSubServicesPersistenceImpl() {
		setModelClass(QrcMstSubServices.class);
	}

	/**
	 * Caches the qrc mst sub services in the entity cache if it is enabled.
	 *
	 * @param qrcMstSubServices the qrc mst sub services
	 */
	@Override
	public void cacheResult(QrcMstSubServices qrcMstSubServices) {
		EntityCacheUtil.putResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesImpl.class, qrcMstSubServices.getPrimaryKey(),
			qrcMstSubServices);

		qrcMstSubServices.resetOriginalValues();
	}

	/**
	 * Caches the qrc mst sub serviceses in the entity cache if it is enabled.
	 *
	 * @param qrcMstSubServiceses the qrc mst sub serviceses
	 */
	@Override
	public void cacheResult(List<QrcMstSubServices> qrcMstSubServiceses) {
		for (QrcMstSubServices qrcMstSubServices : qrcMstSubServiceses) {
			if (EntityCacheUtil.getResult(
						QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstSubServicesImpl.class,
						qrcMstSubServices.getPrimaryKey()) == null) {
				cacheResult(qrcMstSubServices);
			}
			else {
				qrcMstSubServices.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc mst sub serviceses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcMstSubServicesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcMstSubServicesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc mst sub services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcMstSubServices qrcMstSubServices) {
		EntityCacheUtil.removeResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesImpl.class, qrcMstSubServices.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcMstSubServices> qrcMstSubServiceses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcMstSubServices qrcMstSubServices : qrcMstSubServiceses) {
			EntityCacheUtil.removeResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstSubServicesImpl.class, qrcMstSubServices.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc mst sub services with the primary key. Does not add the qrc mst sub services to the database.
	 *
	 * @param SubServiceId the primary key for the new qrc mst sub services
	 * @return the new qrc mst sub services
	 */
	@Override
	public QrcMstSubServices create(int SubServiceId) {
		QrcMstSubServices qrcMstSubServices = new QrcMstSubServicesImpl();

		qrcMstSubServices.setNew(true);
		qrcMstSubServices.setPrimaryKey(SubServiceId);

		return qrcMstSubServices;
	}

	/**
	 * Removes the qrc mst sub services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SubServiceId the primary key of the qrc mst sub services
	 * @return the qrc mst sub services that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstSubServicesException if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices remove(int SubServiceId)
		throws NoSuchQrcMstSubServicesException, SystemException {
		return remove((Serializable)SubServiceId);
	}

	/**
	 * Removes the qrc mst sub services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc mst sub services
	 * @return the qrc mst sub services that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstSubServicesException if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices remove(Serializable primaryKey)
		throws NoSuchQrcMstSubServicesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcMstSubServices qrcMstSubServices = (QrcMstSubServices)session.get(QrcMstSubServicesImpl.class,
					primaryKey);

			if (qrcMstSubServices == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcMstSubServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcMstSubServices);
		}
		catch (NoSuchQrcMstSubServicesException nsee) {
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
	protected QrcMstSubServices removeImpl(QrcMstSubServices qrcMstSubServices)
		throws SystemException {
		qrcMstSubServices = toUnwrappedModel(qrcMstSubServices);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcMstSubServices)) {
				qrcMstSubServices = (QrcMstSubServices)session.get(QrcMstSubServicesImpl.class,
						qrcMstSubServices.getPrimaryKeyObj());
			}

			if (qrcMstSubServices != null) {
				session.delete(qrcMstSubServices);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcMstSubServices != null) {
			clearCache(qrcMstSubServices);
		}

		return qrcMstSubServices;
	}

	@Override
	public QrcMstSubServices updateImpl(
		com.ifl.rapid.customer.model.QrcMstSubServices qrcMstSubServices)
		throws SystemException {
		qrcMstSubServices = toUnwrappedModel(qrcMstSubServices);

		boolean isNew = qrcMstSubServices.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcMstSubServices.isNew()) {
				session.save(qrcMstSubServices);

				qrcMstSubServices.setNew(false);
			}
			else {
				session.merge(qrcMstSubServices);
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

		EntityCacheUtil.putResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstSubServicesImpl.class, qrcMstSubServices.getPrimaryKey(),
			qrcMstSubServices);

		return qrcMstSubServices;
	}

	protected QrcMstSubServices toUnwrappedModel(
		QrcMstSubServices qrcMstSubServices) {
		if (qrcMstSubServices instanceof QrcMstSubServicesImpl) {
			return qrcMstSubServices;
		}

		QrcMstSubServicesImpl qrcMstSubServicesImpl = new QrcMstSubServicesImpl();

		qrcMstSubServicesImpl.setNew(qrcMstSubServices.isNew());
		qrcMstSubServicesImpl.setPrimaryKey(qrcMstSubServices.getPrimaryKey());

		qrcMstSubServicesImpl.setSubServiceId(qrcMstSubServices.getSubServiceId());
		qrcMstSubServicesImpl.setSubServiceName(qrcMstSubServices.getSubServiceName());
		qrcMstSubServicesImpl.setSubServiceUrl(qrcMstSubServices.getSubServiceUrl());
		qrcMstSubServicesImpl.setServiceId(qrcMstSubServices.getServiceId());
		qrcMstSubServicesImpl.setIsActive(qrcMstSubServices.getIsActive());
		qrcMstSubServicesImpl.setCreatedBy(qrcMstSubServices.getCreatedBy());
		qrcMstSubServicesImpl.setCreatedDate(qrcMstSubServices.getCreatedDate());
		qrcMstSubServicesImpl.setModifiedBy(qrcMstSubServices.getModifiedBy());
		qrcMstSubServicesImpl.setModifiedDate(qrcMstSubServices.getModifiedDate());

		return qrcMstSubServicesImpl;
	}

	/**
	 * Returns the qrc mst sub services with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst sub services
	 * @return the qrc mst sub services
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstSubServicesException if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcMstSubServicesException, SystemException {
		QrcMstSubServices qrcMstSubServices = fetchByPrimaryKey(primaryKey);

		if (qrcMstSubServices == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcMstSubServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcMstSubServices;
	}

	/**
	 * Returns the qrc mst sub services with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcMstSubServicesException} if it could not be found.
	 *
	 * @param SubServiceId the primary key of the qrc mst sub services
	 * @return the qrc mst sub services
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstSubServicesException if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices findByPrimaryKey(int SubServiceId)
		throws NoSuchQrcMstSubServicesException, SystemException {
		return findByPrimaryKey((Serializable)SubServiceId);
	}

	/**
	 * Returns the qrc mst sub services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst sub services
	 * @return the qrc mst sub services, or <code>null</code> if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcMstSubServices qrcMstSubServices = (QrcMstSubServices)EntityCacheUtil.getResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstSubServicesImpl.class, primaryKey);

		if (qrcMstSubServices == _nullQrcMstSubServices) {
			return null;
		}

		if (qrcMstSubServices == null) {
			Session session = null;

			try {
				session = openSession();

				qrcMstSubServices = (QrcMstSubServices)session.get(QrcMstSubServicesImpl.class,
						primaryKey);

				if (qrcMstSubServices != null) {
					cacheResult(qrcMstSubServices);
				}
				else {
					EntityCacheUtil.putResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstSubServicesImpl.class, primaryKey,
						_nullQrcMstSubServices);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcMstSubServicesModelImpl.ENTITY_CACHE_ENABLED,
					QrcMstSubServicesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcMstSubServices;
	}

	/**
	 * Returns the qrc mst sub services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SubServiceId the primary key of the qrc mst sub services
	 * @return the qrc mst sub services, or <code>null</code> if a qrc mst sub services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstSubServices fetchByPrimaryKey(int SubServiceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)SubServiceId);
	}

	/**
	 * Returns all the qrc mst sub serviceses.
	 *
	 * @return the qrc mst sub serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstSubServices> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc mst sub serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst sub serviceses
	 * @param end the upper bound of the range of qrc mst sub serviceses (not inclusive)
	 * @return the range of qrc mst sub serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstSubServices> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc mst sub serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstSubServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst sub serviceses
	 * @param end the upper bound of the range of qrc mst sub serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc mst sub serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstSubServices> findAll(int start, int end,
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

		List<QrcMstSubServices> list = (List<QrcMstSubServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCMSTSUBSERVICES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCMSTSUBSERVICES;

				if (pagination) {
					sql = sql.concat(QrcMstSubServicesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcMstSubServices>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcMstSubServices>(list);
				}
				else {
					list = (List<QrcMstSubServices>)QueryUtil.list(q,
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
	 * Removes all the qrc mst sub serviceses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcMstSubServices qrcMstSubServices : findAll()) {
			remove(qrcMstSubServices);
		}
	}

	/**
	 * Returns the number of qrc mst sub serviceses.
	 *
	 * @return the number of qrc mst sub serviceses
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

				Query q = session.createQuery(_SQL_COUNT_QRCMSTSUBSERVICES);

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
	 * Initializes the qrc mst sub services persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcMstSubServices")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcMstSubServices>> listenersList = new ArrayList<ModelListener<QrcMstSubServices>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcMstSubServices>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcMstSubServicesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCMSTSUBSERVICES = "SELECT qrcMstSubServices FROM QrcMstSubServices qrcMstSubServices";
	private static final String _SQL_COUNT_QRCMSTSUBSERVICES = "SELECT COUNT(qrcMstSubServices) FROM QrcMstSubServices qrcMstSubServices";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcMstSubServices.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcMstSubServices exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcMstSubServicesPersistenceImpl.class);
	private static QrcMstSubServices _nullQrcMstSubServices = new QrcMstSubServicesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcMstSubServices> toCacheModel() {
				return _nullQrcMstSubServicesCacheModel;
			}
		};

	private static CacheModel<QrcMstSubServices> _nullQrcMstSubServicesCacheModel =
		new CacheModel<QrcMstSubServices>() {
			@Override
			public QrcMstSubServices toEntityModel() {
				return _nullQrcMstSubServices;
			}
		};
}