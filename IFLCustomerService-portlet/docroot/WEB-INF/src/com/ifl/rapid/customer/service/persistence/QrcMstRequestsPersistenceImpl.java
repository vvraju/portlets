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

import com.ifl.rapid.customer.NoSuchQrcMstRequestsException;
import com.ifl.rapid.customer.model.QrcMstRequests;
import com.ifl.rapid.customer.model.impl.QrcMstRequestsImpl;
import com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl;

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
 * The persistence implementation for the qrc mst requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstRequestsPersistence
 * @see QrcMstRequestsUtil
 * @generated
 */
public class QrcMstRequestsPersistenceImpl extends BasePersistenceImpl<QrcMstRequests>
	implements QrcMstRequestsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcMstRequestsUtil} to access the qrc mst requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcMstRequestsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsModelImpl.FINDER_CACHE_ENABLED,
			QrcMstRequestsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsModelImpl.FINDER_CACHE_ENABLED,
			QrcMstRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcMstRequestsPersistenceImpl() {
		setModelClass(QrcMstRequests.class);
	}

	/**
	 * Caches the qrc mst requests in the entity cache if it is enabled.
	 *
	 * @param qrcMstRequests the qrc mst requests
	 */
	@Override
	public void cacheResult(QrcMstRequests qrcMstRequests) {
		EntityCacheUtil.putResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsImpl.class, qrcMstRequests.getPrimaryKey(),
			qrcMstRequests);

		qrcMstRequests.resetOriginalValues();
	}

	/**
	 * Caches the qrc mst requestses in the entity cache if it is enabled.
	 *
	 * @param qrcMstRequestses the qrc mst requestses
	 */
	@Override
	public void cacheResult(List<QrcMstRequests> qrcMstRequestses) {
		for (QrcMstRequests qrcMstRequests : qrcMstRequestses) {
			if (EntityCacheUtil.getResult(
						QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstRequestsImpl.class, qrcMstRequests.getPrimaryKey()) == null) {
				cacheResult(qrcMstRequests);
			}
			else {
				qrcMstRequests.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc mst requestses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcMstRequestsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcMstRequestsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc mst requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcMstRequests qrcMstRequests) {
		EntityCacheUtil.removeResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsImpl.class, qrcMstRequests.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcMstRequests> qrcMstRequestses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcMstRequests qrcMstRequests : qrcMstRequestses) {
			EntityCacheUtil.removeResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstRequestsImpl.class, qrcMstRequests.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc mst requests with the primary key. Does not add the qrc mst requests to the database.
	 *
	 * @param RequestId the primary key for the new qrc mst requests
	 * @return the new qrc mst requests
	 */
	@Override
	public QrcMstRequests create(int RequestId) {
		QrcMstRequests qrcMstRequests = new QrcMstRequestsImpl();

		qrcMstRequests.setNew(true);
		qrcMstRequests.setPrimaryKey(RequestId);

		return qrcMstRequests;
	}

	/**
	 * Removes the qrc mst requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param RequestId the primary key of the qrc mst requests
	 * @return the qrc mst requests that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests remove(int RequestId)
		throws NoSuchQrcMstRequestsException, SystemException {
		return remove((Serializable)RequestId);
	}

	/**
	 * Removes the qrc mst requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc mst requests
	 * @return the qrc mst requests that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests remove(Serializable primaryKey)
		throws NoSuchQrcMstRequestsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcMstRequests qrcMstRequests = (QrcMstRequests)session.get(QrcMstRequestsImpl.class,
					primaryKey);

			if (qrcMstRequests == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcMstRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcMstRequests);
		}
		catch (NoSuchQrcMstRequestsException nsee) {
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
	protected QrcMstRequests removeImpl(QrcMstRequests qrcMstRequests)
		throws SystemException {
		qrcMstRequests = toUnwrappedModel(qrcMstRequests);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcMstRequests)) {
				qrcMstRequests = (QrcMstRequests)session.get(QrcMstRequestsImpl.class,
						qrcMstRequests.getPrimaryKeyObj());
			}

			if (qrcMstRequests != null) {
				session.delete(qrcMstRequests);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcMstRequests != null) {
			clearCache(qrcMstRequests);
		}

		return qrcMstRequests;
	}

	@Override
	public QrcMstRequests updateImpl(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests)
		throws SystemException {
		qrcMstRequests = toUnwrappedModel(qrcMstRequests);

		boolean isNew = qrcMstRequests.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcMstRequests.isNew()) {
				session.save(qrcMstRequests);

				qrcMstRequests.setNew(false);
			}
			else {
				session.merge(qrcMstRequests);
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

		EntityCacheUtil.putResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcMstRequestsImpl.class, qrcMstRequests.getPrimaryKey(),
			qrcMstRequests);

		return qrcMstRequests;
	}

	protected QrcMstRequests toUnwrappedModel(QrcMstRequests qrcMstRequests) {
		if (qrcMstRequests instanceof QrcMstRequestsImpl) {
			return qrcMstRequests;
		}

		QrcMstRequestsImpl qrcMstRequestsImpl = new QrcMstRequestsImpl();

		qrcMstRequestsImpl.setNew(qrcMstRequests.isNew());
		qrcMstRequestsImpl.setPrimaryKey(qrcMstRequests.getPrimaryKey());

		qrcMstRequestsImpl.setRequestId(qrcMstRequests.getRequestId());
		qrcMstRequestsImpl.setCategory(qrcMstRequests.getCategory());
		qrcMstRequestsImpl.setCallType(qrcMstRequests.getCallType());
		qrcMstRequestsImpl.setCallSubType(qrcMstRequests.getCallSubType());
		qrcMstRequestsImpl.setKeyword(qrcMstRequests.getKeyword());
		qrcMstRequestsImpl.setIsActive(qrcMstRequests.getIsActive());
		qrcMstRequestsImpl.setCreatedBy(qrcMstRequests.getCreatedBy());
		qrcMstRequestsImpl.setCreatedDate(qrcMstRequests.getCreatedDate());
		qrcMstRequestsImpl.setModifiedDate(qrcMstRequests.getModifiedDate());
		qrcMstRequestsImpl.setModifiedBy(qrcMstRequests.getModifiedBy());

		return qrcMstRequestsImpl;
	}

	/**
	 * Returns the qrc mst requests with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst requests
	 * @return the qrc mst requests
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcMstRequestsException, SystemException {
		QrcMstRequests qrcMstRequests = fetchByPrimaryKey(primaryKey);

		if (qrcMstRequests == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcMstRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcMstRequests;
	}

	/**
	 * Returns the qrc mst requests with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcMstRequestsException} if it could not be found.
	 *
	 * @param RequestId the primary key of the qrc mst requests
	 * @return the qrc mst requests
	 * @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests findByPrimaryKey(int RequestId)
		throws NoSuchQrcMstRequestsException, SystemException {
		return findByPrimaryKey((Serializable)RequestId);
	}

	/**
	 * Returns the qrc mst requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc mst requests
	 * @return the qrc mst requests, or <code>null</code> if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcMstRequests qrcMstRequests = (QrcMstRequests)EntityCacheUtil.getResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
				QrcMstRequestsImpl.class, primaryKey);

		if (qrcMstRequests == _nullQrcMstRequests) {
			return null;
		}

		if (qrcMstRequests == null) {
			Session session = null;

			try {
				session = openSession();

				qrcMstRequests = (QrcMstRequests)session.get(QrcMstRequestsImpl.class,
						primaryKey);

				if (qrcMstRequests != null) {
					cacheResult(qrcMstRequests);
				}
				else {
					EntityCacheUtil.putResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
						QrcMstRequestsImpl.class, primaryKey,
						_nullQrcMstRequests);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcMstRequestsModelImpl.ENTITY_CACHE_ENABLED,
					QrcMstRequestsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcMstRequests;
	}

	/**
	 * Returns the qrc mst requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param RequestId the primary key of the qrc mst requests
	 * @return the qrc mst requests, or <code>null</code> if a qrc mst requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcMstRequests fetchByPrimaryKey(int RequestId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)RequestId);
	}

	/**
	 * Returns all the qrc mst requestses.
	 *
	 * @return the qrc mst requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstRequests> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc mst requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst requestses
	 * @param end the upper bound of the range of qrc mst requestses (not inclusive)
	 * @return the range of qrc mst requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstRequests> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc mst requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc mst requestses
	 * @param end the upper bound of the range of qrc mst requestses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc mst requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcMstRequests> findAll(int start, int end,
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

		List<QrcMstRequests> list = (List<QrcMstRequests>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCMSTREQUESTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCMSTREQUESTS;

				if (pagination) {
					sql = sql.concat(QrcMstRequestsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcMstRequests>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcMstRequests>(list);
				}
				else {
					list = (List<QrcMstRequests>)QueryUtil.list(q,
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
	 * Removes all the qrc mst requestses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcMstRequests qrcMstRequests : findAll()) {
			remove(qrcMstRequests);
		}
	}

	/**
	 * Returns the number of qrc mst requestses.
	 *
	 * @return the number of qrc mst requestses
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

				Query q = session.createQuery(_SQL_COUNT_QRCMSTREQUESTS);

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
	 * Initializes the qrc mst requests persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcMstRequests")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcMstRequests>> listenersList = new ArrayList<ModelListener<QrcMstRequests>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcMstRequests>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcMstRequestsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCMSTREQUESTS = "SELECT qrcMstRequests FROM QrcMstRequests qrcMstRequests";
	private static final String _SQL_COUNT_QRCMSTREQUESTS = "SELECT COUNT(qrcMstRequests) FROM QrcMstRequests qrcMstRequests";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcMstRequests.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcMstRequests exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcMstRequestsPersistenceImpl.class);
	private static QrcMstRequests _nullQrcMstRequests = new QrcMstRequestsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcMstRequests> toCacheModel() {
				return _nullQrcMstRequestsCacheModel;
			}
		};

	private static CacheModel<QrcMstRequests> _nullQrcMstRequestsCacheModel = new CacheModel<QrcMstRequests>() {
			@Override
			public QrcMstRequests toEntityModel() {
				return _nullQrcMstRequests;
			}
		};
}