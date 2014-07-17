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

import com.ifl.rapid.customer.NoSuchQrcTrnHistoryException;
import com.ifl.rapid.customer.model.QrcTrnHistory;
import com.ifl.rapid.customer.model.impl.QrcTrnHistoryImpl;
import com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl;

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
 * The persistence implementation for the qrc trn history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnHistoryPersistence
 * @see QrcTrnHistoryUtil
 * @generated
 */
public class QrcTrnHistoryPersistenceImpl extends BasePersistenceImpl<QrcTrnHistory>
	implements QrcTrnHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcTrnHistoryUtil} to access the qrc trn history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcTrnHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryModelImpl.FINDER_CACHE_ENABLED,
			QrcTrnHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryModelImpl.FINDER_CACHE_ENABLED,
			QrcTrnHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcTrnHistoryPersistenceImpl() {
		setModelClass(QrcTrnHistory.class);
	}

	/**
	 * Caches the qrc trn history in the entity cache if it is enabled.
	 *
	 * @param qrcTrnHistory the qrc trn history
	 */
	@Override
	public void cacheResult(QrcTrnHistory qrcTrnHistory) {
		EntityCacheUtil.putResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryImpl.class, qrcTrnHistory.getPrimaryKey(),
			qrcTrnHistory);

		qrcTrnHistory.resetOriginalValues();
	}

	/**
	 * Caches the qrc trn histories in the entity cache if it is enabled.
	 *
	 * @param qrcTrnHistories the qrc trn histories
	 */
	@Override
	public void cacheResult(List<QrcTrnHistory> qrcTrnHistories) {
		for (QrcTrnHistory qrcTrnHistory : qrcTrnHistories) {
			if (EntityCacheUtil.getResult(
						QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnHistoryImpl.class, qrcTrnHistory.getPrimaryKey()) == null) {
				cacheResult(qrcTrnHistory);
			}
			else {
				qrcTrnHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc trn histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcTrnHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcTrnHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc trn history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcTrnHistory qrcTrnHistory) {
		EntityCacheUtil.removeResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryImpl.class, qrcTrnHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcTrnHistory> qrcTrnHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcTrnHistory qrcTrnHistory : qrcTrnHistories) {
			EntityCacheUtil.removeResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnHistoryImpl.class, qrcTrnHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc trn history with the primary key. Does not add the qrc trn history to the database.
	 *
	 * @param HistoryId the primary key for the new qrc trn history
	 * @return the new qrc trn history
	 */
	@Override
	public QrcTrnHistory create(int HistoryId) {
		QrcTrnHistory qrcTrnHistory = new QrcTrnHistoryImpl();

		qrcTrnHistory.setNew(true);
		qrcTrnHistory.setPrimaryKey(HistoryId);

		return qrcTrnHistory;
	}

	/**
	 * Removes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param HistoryId the primary key of the qrc trn history
	 * @return the qrc trn history that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory remove(int HistoryId)
		throws NoSuchQrcTrnHistoryException, SystemException {
		return remove((Serializable)HistoryId);
	}

	/**
	 * Removes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc trn history
	 * @return the qrc trn history that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory remove(Serializable primaryKey)
		throws NoSuchQrcTrnHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcTrnHistory qrcTrnHistory = (QrcTrnHistory)session.get(QrcTrnHistoryImpl.class,
					primaryKey);

			if (qrcTrnHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcTrnHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcTrnHistory);
		}
		catch (NoSuchQrcTrnHistoryException nsee) {
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
	protected QrcTrnHistory removeImpl(QrcTrnHistory qrcTrnHistory)
		throws SystemException {
		qrcTrnHistory = toUnwrappedModel(qrcTrnHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcTrnHistory)) {
				qrcTrnHistory = (QrcTrnHistory)session.get(QrcTrnHistoryImpl.class,
						qrcTrnHistory.getPrimaryKeyObj());
			}

			if (qrcTrnHistory != null) {
				session.delete(qrcTrnHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcTrnHistory != null) {
			clearCache(qrcTrnHistory);
		}

		return qrcTrnHistory;
	}

	@Override
	public QrcTrnHistory updateImpl(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws SystemException {
		qrcTrnHistory = toUnwrappedModel(qrcTrnHistory);

		boolean isNew = qrcTrnHistory.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcTrnHistory.isNew()) {
				session.save(qrcTrnHistory);

				qrcTrnHistory.setNew(false);
			}
			else {
				session.merge(qrcTrnHistory);
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

		EntityCacheUtil.putResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnHistoryImpl.class, qrcTrnHistory.getPrimaryKey(),
			qrcTrnHistory);

		return qrcTrnHistory;
	}

	protected QrcTrnHistory toUnwrappedModel(QrcTrnHistory qrcTrnHistory) {
		if (qrcTrnHistory instanceof QrcTrnHistoryImpl) {
			return qrcTrnHistory;
		}

		QrcTrnHistoryImpl qrcTrnHistoryImpl = new QrcTrnHistoryImpl();

		qrcTrnHistoryImpl.setNew(qrcTrnHistory.isNew());
		qrcTrnHistoryImpl.setPrimaryKey(qrcTrnHistory.getPrimaryKey());

		qrcTrnHistoryImpl.setHistoryId(qrcTrnHistory.getHistoryId());
		qrcTrnHistoryImpl.setContactId(qrcTrnHistory.getContactId());
		qrcTrnHistoryImpl.setCreatedContactId(qrcTrnHistory.getCreatedContactId());
		qrcTrnHistoryImpl.setRequestType(qrcTrnHistory.getRequestType());
		qrcTrnHistoryImpl.setChangeRequestType(qrcTrnHistory.getChangeRequestType());
		qrcTrnHistoryImpl.setPickupDate(qrcTrnHistory.getPickupDate());
		qrcTrnHistoryImpl.setPickupTime(qrcTrnHistory.getPickupTime());
		qrcTrnHistoryImpl.setXMLData(qrcTrnHistory.getXMLData());
		qrcTrnHistoryImpl.setAddressTypeId(qrcTrnHistory.getAddressTypeId());
		qrcTrnHistoryImpl.setBranchId(qrcTrnHistory.getBranchId());
		qrcTrnHistoryImpl.setIsActive(qrcTrnHistory.getIsActive());
		qrcTrnHistoryImpl.setCreatedBy(qrcTrnHistory.getCreatedBy());
		qrcTrnHistoryImpl.setCreatedDate(qrcTrnHistory.getCreatedDate());
		qrcTrnHistoryImpl.setModifiedDate(qrcTrnHistory.getModifiedDate());
		qrcTrnHistoryImpl.setModifiedBy(qrcTrnHistory.getModifiedBy());

		return qrcTrnHistoryImpl;
	}

	/**
	 * Returns the qrc trn history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn history
	 * @return the qrc trn history
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcTrnHistoryException, SystemException {
		QrcTrnHistory qrcTrnHistory = fetchByPrimaryKey(primaryKey);

		if (qrcTrnHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcTrnHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcTrnHistory;
	}

	/**
	 * Returns the qrc trn history with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcTrnHistoryException} if it could not be found.
	 *
	 * @param HistoryId the primary key of the qrc trn history
	 * @return the qrc trn history
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory findByPrimaryKey(int HistoryId)
		throws NoSuchQrcTrnHistoryException, SystemException {
		return findByPrimaryKey((Serializable)HistoryId);
	}

	/**
	 * Returns the qrc trn history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn history
	 * @return the qrc trn history, or <code>null</code> if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcTrnHistory qrcTrnHistory = (QrcTrnHistory)EntityCacheUtil.getResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnHistoryImpl.class, primaryKey);

		if (qrcTrnHistory == _nullQrcTrnHistory) {
			return null;
		}

		if (qrcTrnHistory == null) {
			Session session = null;

			try {
				session = openSession();

				qrcTrnHistory = (QrcTrnHistory)session.get(QrcTrnHistoryImpl.class,
						primaryKey);

				if (qrcTrnHistory != null) {
					cacheResult(qrcTrnHistory);
				}
				else {
					EntityCacheUtil.putResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnHistoryImpl.class, primaryKey, _nullQrcTrnHistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcTrnHistoryModelImpl.ENTITY_CACHE_ENABLED,
					QrcTrnHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcTrnHistory;
	}

	/**
	 * Returns the qrc trn history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param HistoryId the primary key of the qrc trn history
	 * @return the qrc trn history, or <code>null</code> if a qrc trn history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnHistory fetchByPrimaryKey(int HistoryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)HistoryId);
	}

	/**
	 * Returns all the qrc trn histories.
	 *
	 * @return the qrc trn histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc trn histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn histories
	 * @param end the upper bound of the range of qrc trn histories (not inclusive)
	 * @return the range of qrc trn histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc trn histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn histories
	 * @param end the upper bound of the range of qrc trn histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc trn histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnHistory> findAll(int start, int end,
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

		List<QrcTrnHistory> list = (List<QrcTrnHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCTRNHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCTRNHISTORY;

				if (pagination) {
					sql = sql.concat(QrcTrnHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcTrnHistory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcTrnHistory>(list);
				}
				else {
					list = (List<QrcTrnHistory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the qrc trn histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcTrnHistory qrcTrnHistory : findAll()) {
			remove(qrcTrnHistory);
		}
	}

	/**
	 * Returns the number of qrc trn histories.
	 *
	 * @return the number of qrc trn histories
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

				Query q = session.createQuery(_SQL_COUNT_QRCTRNHISTORY);

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
	 * Initializes the qrc trn history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcTrnHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcTrnHistory>> listenersList = new ArrayList<ModelListener<QrcTrnHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcTrnHistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcTrnHistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCTRNHISTORY = "SELECT qrcTrnHistory FROM QrcTrnHistory qrcTrnHistory";
	private static final String _SQL_COUNT_QRCTRNHISTORY = "SELECT COUNT(qrcTrnHistory) FROM QrcTrnHistory qrcTrnHistory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcTrnHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcTrnHistory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcTrnHistoryPersistenceImpl.class);
	private static QrcTrnHistory _nullQrcTrnHistory = new QrcTrnHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcTrnHistory> toCacheModel() {
				return _nullQrcTrnHistoryCacheModel;
			}
		};

	private static CacheModel<QrcTrnHistory> _nullQrcTrnHistoryCacheModel = new CacheModel<QrcTrnHistory>() {
			@Override
			public QrcTrnHistory toEntityModel() {
				return _nullQrcTrnHistory;
			}
		};
}