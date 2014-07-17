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

import com.ifl.rapid.customer.NoSuchQrcMstServicesException;
import com.ifl.rapid.customer.model.QrcMstServices;
import com.ifl.rapid.customer.model.impl.QrcMstServicesImpl;
import com.ifl.rapid.customer.model.impl.QrcMstServicesModelImpl;

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
 * The persistence implementation for the qrc mst services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstServicesPersistence
 * @see QrcMstServicesUtil
 * @generated
 */
public class QrcMstServicesPersistenceImpl extends BasePersistenceImpl<QrcMstServices>
	implements QrcMstServicesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcMstServicesUtil} to access the qrc mst services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcMstServicesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesModelImpl.FINDER_CACHE_ENABLED,
			QrcMstServicesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesModelImpl.FINDER_CACHE_ENABLED,
			QrcMstServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcMstServicesPersistenceImpl() {
		setModelClass(QrcMstServices.class);
	}

	/**
	 * Caches the qrc mst services in the entity cache if it is enabled.
	 *
	 * @param qrcMstServices the qrc mst services
	 */
	@Override
	public void cacheResult(QrcMstServices qrcMstServices) {
		EntityCacheUtil.putResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesImpl.class, qrcMstServices.getPrimaryKey(),
			qrcMstServices);

		qrcMstServices.resetOriginalValues();
	}

	/**
	 * Caches the qrc mst serviceses in the entity cache if it is enabled.
	 *
	 * @param qrcMstServiceses the qrc mst serviceses
	 */
	@Override
	public void cacheResult(List<QrcMstServices> qrcMstServiceses) {
		for (QrcMstServices qrcMstServices : qrcMstServiceses) {
			if (EntityCacheUtil.getResult(
						QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstServicesImpl.class, qrcMstServices.getPrimaryKey()) == null) {
				cacheResult(qrcMstServices);
			}
			else {
				qrcMstServices.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc mst serviceses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcMstServicesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcMstServicesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc mst services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcMstServices qrcMstServices) {
		EntityCacheUtil.removeResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesImpl.class, qrcMstServices.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcMstServices> qrcMstServiceses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcMstServices qrcMstServices : qrcMstServiceses) {
			EntityCacheUtil.removeResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstServicesImpl.class, qrcMstServices.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc mst services with the primary key. Does not add the qrc mst services to the database.
	 *
	 * @param ServiceId the primary key for the new qrc mst services
	 * @return the new qrc mst services
	 */
	@Override
	public QrcMstServices create(int ServiceId) {
		QrcMstServices qrcMstServices = new QrcMstServicesImpl();

		qrcMstServices.setNew(true);
		qrcMstServices.setPrimaryKey(ServiceId);

		return qrcMstServices;
	}

	/**
	 * Removes the qrc mst services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ServiceId the primary key of the qrc mst services
	 * @return the qrc mst services that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices remove(int ServiceId)
		throws NoSuchQrcMstServicesException, SystemException {
		return remove((Serializable)ServiceId);
	}

	/**
	 * Removes the qrc mst services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc mst services
	 * @return the qrc mst services that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices remove(Serializable primaryKey)
		throws NoSuchQrcMstServicesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcMstServices qrcMstServices = (QrcMstServices)session.get(QrcMstServicesImpl.class,
					primaryKey);

			if (qrcMstServices == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcMstServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcMstServices);
		}
		catch (NoSuchQrcMstServicesException nsee) {
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
	protected QrcMstServices removeImpl(QrcMstServices qrcMstServices)
		throws SystemException {
		qrcMstServices = toUnwrappedModel(qrcMstServices);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcMstServices)) {
				qrcMstServices = (QrcMstServices)session.get(QrcMstServicesImpl.class,
						qrcMstServices.getPrimaryKeyObj());
			}

			if (qrcMstServices != null) {
				session.delete(qrcMstServices);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcMstServices != null) {
			clearCache(qrcMstServices);
		}

		return qrcMstServices;
	}

	@Override
	public QrcMstServices updateImpl(
		com.ifl.rapid.customer.model.QrcMstServices qrcMstServices)
		throws SystemException {
		qrcMstServices = toUnwrappedModel(qrcMstServices);

		boolean isNew = qrcMstServices.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcMstServices.isNew()) {
				session.save(qrcMstServices);

				qrcMstServices.setNew(false);
			}
			else {
				session.merge(qrcMstServices);
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

		EntityCacheUtil.putResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstServicesImpl.class, qrcMstServices.getPrimaryKey(),
			qrcMstServices);

		return qrcMstServices;
	}

	protected QrcMstServices toUnwrappedModel(QrcMstServices qrcMstServices) {
		if (qrcMstServices instanceof QrcMstServicesImpl) {
			return qrcMstServices;
		}

		QrcMstServicesImpl qrcMstServicesImpl = new QrcMstServicesImpl();

		qrcMstServicesImpl.setNew(qrcMstServices.isNew());
		qrcMstServicesImpl.setPrimaryKey(qrcMstServices.getPrimaryKey());

		qrcMstServicesImpl.setServiceId(qrcMstServices.getServiceId());
		qrcMstServicesImpl.setServiceName(qrcMstServices.getServiceName());
		qrcMstServicesImpl.setDescription(qrcMstServices.getDescription());
		qrcMstServicesImpl.setCreatedBy(qrcMstServices.getCreatedBy());
		qrcMstServicesImpl.setCreatedDate(qrcMstServices.getCreatedDate());
		qrcMstServicesImpl.setModifiedBy(qrcMstServices.getModifiedBy());
		qrcMstServicesImpl.setModifiedDate(qrcMstServices.getModifiedDate());
		qrcMstServicesImpl.setIsActive(qrcMstServices.getIsActive());

		return qrcMstServicesImpl;
	}

	/**
	 * Returns the qrc mst services with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst services
	 * @return the qrc mst services
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcMstServicesException, SystemException {
		QrcMstServices qrcMstServices = fetchByPrimaryKey(primaryKey);

		if (qrcMstServices == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcMstServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcMstServices;
	}

	/**
	 * Returns the qrc mst services with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcMstServicesException} if it could not be found.
	 *
	 * @param ServiceId the primary key of the qrc mst services
	 * @return the qrc mst services
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices findByPrimaryKey(int ServiceId)
		throws NoSuchQrcMstServicesException, SystemException {
		return findByPrimaryKey((Serializable)ServiceId);
	}

	/**
	 * Returns the qrc mst services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst services
	 * @return the qrc mst services, or <code>null</code> if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcMstServices qrcMstServices = (QrcMstServices)EntityCacheUtil.getResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstServicesImpl.class, primaryKey);

		if (qrcMstServices == _nullQrcMstServices) {
			return null;
		}

		if (qrcMstServices == null) {
			Session session = null;

			try {
				session = openSession();

				qrcMstServices = (QrcMstServices)session.get(QrcMstServicesImpl.class,
						primaryKey);

				if (qrcMstServices != null) {
					cacheResult(qrcMstServices);
				}
				else {
					EntityCacheUtil.putResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstServicesImpl.class, primaryKey,
						_nullQrcMstServices);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcMstServicesModelImpl.ENTITY_CACHE_ENABLED,
					QrcMstServicesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcMstServices;
	}

	/**
	 * Returns the qrc mst services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ServiceId the primary key of the qrc mst services
	 * @return the qrc mst services, or <code>null</code> if a qrc mst services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstServices fetchByPrimaryKey(int ServiceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ServiceId);
	}

	/**
	 * Returns all the qrc mst serviceses.
	 *
	 * @return the qrc mst serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstServices> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc mst serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst serviceses
	 * @param end the upper bound of the range of qrc mst serviceses (not inclusive)
	 * @return the range of qrc mst serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstServices> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc mst serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst serviceses
	 * @param end the upper bound of the range of qrc mst serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc mst serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstServices> findAll(int start, int end,
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

		List<QrcMstServices> list = (List<QrcMstServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCMSTSERVICES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCMSTSERVICES;

				if (pagination) {
					sql = sql.concat(QrcMstServicesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcMstServices>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcMstServices>(list);
				}
				else {
					list = (List<QrcMstServices>)QueryUtil.list(q,
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
	 * Removes all the qrc mst serviceses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcMstServices qrcMstServices : findAll()) {
			remove(qrcMstServices);
		}
	}

	/**
	 * Returns the number of qrc mst serviceses.
	 *
	 * @return the number of qrc mst serviceses
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

				Query q = session.createQuery(_SQL_COUNT_QRCMSTSERVICES);

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
	 * Initializes the qrc mst services persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcMstServices")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcMstServices>> listenersList = new ArrayList<ModelListener<QrcMstServices>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcMstServices>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcMstServicesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCMSTSERVICES = "SELECT qrcMstServices FROM QrcMstServices qrcMstServices";
	private static final String _SQL_COUNT_QRCMSTSERVICES = "SELECT COUNT(qrcMstServices) FROM QrcMstServices qrcMstServices";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcMstServices.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcMstServices exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcMstServicesPersistenceImpl.class);
	private static QrcMstServices _nullQrcMstServices = new QrcMstServicesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcMstServices> toCacheModel() {
				return _nullQrcMstServicesCacheModel;
			}
		};

	private static CacheModel<QrcMstServices> _nullQrcMstServicesCacheModel = new CacheModel<QrcMstServices>() {
			@Override
			public QrcMstServices toEntityModel() {
				return _nullQrcMstServices;
			}
		};
}