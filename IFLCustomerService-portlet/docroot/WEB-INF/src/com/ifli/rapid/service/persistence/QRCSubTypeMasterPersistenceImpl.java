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

import com.ifli.rapid.NoSuchQRCSubTypeMasterException;
import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.model.impl.QRCSubTypeMasterImpl;
import com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl;

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
 * The persistence implementation for the q r c sub type master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCSubTypeMasterPersistence
 * @see QRCSubTypeMasterUtil
 * @generated
 */
public class QRCSubTypeMasterPersistenceImpl extends BasePersistenceImpl<QRCSubTypeMaster>
	implements QRCSubTypeMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QRCSubTypeMasterUtil} to access the q r c sub type master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QRCSubTypeMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCSubTypeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCSubTypeMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QRCSubTypeMasterPersistenceImpl() {
		setModelClass(QRCSubTypeMaster.class);
	}

	/**
	 * Caches the q r c sub type master in the entity cache if it is enabled.
	 *
	 * @param qrcSubTypeMaster the q r c sub type master
	 */
	@Override
	public void cacheResult(QRCSubTypeMaster qrcSubTypeMaster) {
		EntityCacheUtil.putResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterImpl.class, qrcSubTypeMaster.getPrimaryKey(),
			qrcSubTypeMaster);

		qrcSubTypeMaster.resetOriginalValues();
	}

	/**
	 * Caches the q r c sub type masters in the entity cache if it is enabled.
	 *
	 * @param qrcSubTypeMasters the q r c sub type masters
	 */
	@Override
	public void cacheResult(List<QRCSubTypeMaster> qrcSubTypeMasters) {
		for (QRCSubTypeMaster qrcSubTypeMaster : qrcSubTypeMasters) {
			if (EntityCacheUtil.getResult(
						QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCSubTypeMasterImpl.class,
						qrcSubTypeMaster.getPrimaryKey()) == null) {
				cacheResult(qrcSubTypeMaster);
			}
			else {
				qrcSubTypeMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q r c sub type masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QRCSubTypeMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QRCSubTypeMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q r c sub type master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QRCSubTypeMaster qrcSubTypeMaster) {
		EntityCacheUtil.removeResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterImpl.class, qrcSubTypeMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QRCSubTypeMaster> qrcSubTypeMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QRCSubTypeMaster qrcSubTypeMaster : qrcSubTypeMasters) {
			EntityCacheUtil.removeResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCSubTypeMasterImpl.class, qrcSubTypeMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q r c sub type master with the primary key. Does not add the q r c sub type master to the database.
	 *
	 * @param QRC_SUB_TYPE_ID the primary key for the new q r c sub type master
	 * @return the new q r c sub type master
	 */
	@Override
	public QRCSubTypeMaster create(int QRC_SUB_TYPE_ID) {
		QRCSubTypeMaster qrcSubTypeMaster = new QRCSubTypeMasterImpl();

		qrcSubTypeMaster.setNew(true);
		qrcSubTypeMaster.setPrimaryKey(QRC_SUB_TYPE_ID);

		return qrcSubTypeMaster;
	}

	/**
	 * Removes the q r c sub type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_SUB_TYPE_ID the primary key of the q r c sub type master
	 * @return the q r c sub type master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCSubTypeMasterException if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster remove(int QRC_SUB_TYPE_ID)
		throws NoSuchQRCSubTypeMasterException, SystemException {
		return remove((Serializable)QRC_SUB_TYPE_ID);
	}

	/**
	 * Removes the q r c sub type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q r c sub type master
	 * @return the q r c sub type master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCSubTypeMasterException if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster remove(Serializable primaryKey)
		throws NoSuchQRCSubTypeMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QRCSubTypeMaster qrcSubTypeMaster = (QRCSubTypeMaster)session.get(QRCSubTypeMasterImpl.class,
					primaryKey);

			if (qrcSubTypeMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQRCSubTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcSubTypeMaster);
		}
		catch (NoSuchQRCSubTypeMasterException nsee) {
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
	protected QRCSubTypeMaster removeImpl(QRCSubTypeMaster qrcSubTypeMaster)
		throws SystemException {
		qrcSubTypeMaster = toUnwrappedModel(qrcSubTypeMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcSubTypeMaster)) {
				qrcSubTypeMaster = (QRCSubTypeMaster)session.get(QRCSubTypeMasterImpl.class,
						qrcSubTypeMaster.getPrimaryKeyObj());
			}

			if (qrcSubTypeMaster != null) {
				session.delete(qrcSubTypeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcSubTypeMaster != null) {
			clearCache(qrcSubTypeMaster);
		}

		return qrcSubTypeMaster;
	}

	@Override
	public QRCSubTypeMaster updateImpl(
		com.ifli.rapid.model.QRCSubTypeMaster qrcSubTypeMaster)
		throws SystemException {
		qrcSubTypeMaster = toUnwrappedModel(qrcSubTypeMaster);

		boolean isNew = qrcSubTypeMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcSubTypeMaster.isNew()) {
				session.save(qrcSubTypeMaster);

				qrcSubTypeMaster.setNew(false);
			}
			else {
				session.merge(qrcSubTypeMaster);
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

		EntityCacheUtil.putResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCSubTypeMasterImpl.class, qrcSubTypeMaster.getPrimaryKey(),
			qrcSubTypeMaster);

		return qrcSubTypeMaster;
	}

	protected QRCSubTypeMaster toUnwrappedModel(
		QRCSubTypeMaster qrcSubTypeMaster) {
		if (qrcSubTypeMaster instanceof QRCSubTypeMasterImpl) {
			return qrcSubTypeMaster;
		}

		QRCSubTypeMasterImpl qrcSubTypeMasterImpl = new QRCSubTypeMasterImpl();

		qrcSubTypeMasterImpl.setNew(qrcSubTypeMaster.isNew());
		qrcSubTypeMasterImpl.setPrimaryKey(qrcSubTypeMaster.getPrimaryKey());

		qrcSubTypeMasterImpl.setQRC_SUB_TYPE_ID(qrcSubTypeMaster.getQRC_SUB_TYPE_ID());
		qrcSubTypeMasterImpl.setQRC_TYPE_ID(qrcSubTypeMaster.getQRC_TYPE_ID());
		qrcSubTypeMasterImpl.setSUB_TYPE_DESC(qrcSubTypeMaster.getSUB_TYPE_DESC());
		qrcSubTypeMasterImpl.setACTIVE_FLAG(qrcSubTypeMaster.getACTIVE_FLAG());
		qrcSubTypeMasterImpl.setINSERTED_DATE(qrcSubTypeMaster.getINSERTED_DATE());
		qrcSubTypeMasterImpl.setINSERTED_BY(qrcSubTypeMaster.getINSERTED_BY());
		qrcSubTypeMasterImpl.setUPDATED_DATE(qrcSubTypeMaster.getUPDATED_DATE());
		qrcSubTypeMasterImpl.setUPDATED_BY(qrcSubTypeMaster.getUPDATED_BY());
		qrcSubTypeMasterImpl.setDELETED_DATE(qrcSubTypeMaster.getDELETED_DATE());
		qrcSubTypeMasterImpl.setDELETED_BY(qrcSubTypeMaster.getDELETED_BY());

		return qrcSubTypeMasterImpl;
	}

	/**
	 * Returns the q r c sub type master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c sub type master
	 * @return the q r c sub type master
	 * @throws com.ifli.rapid.NoSuchQRCSubTypeMasterException if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQRCSubTypeMasterException, SystemException {
		QRCSubTypeMaster qrcSubTypeMaster = fetchByPrimaryKey(primaryKey);

		if (qrcSubTypeMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQRCSubTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcSubTypeMaster;
	}

	/**
	 * Returns the q r c sub type master with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCSubTypeMasterException} if it could not be found.
	 *
	 * @param QRC_SUB_TYPE_ID the primary key of the q r c sub type master
	 * @return the q r c sub type master
	 * @throws com.ifli.rapid.NoSuchQRCSubTypeMasterException if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster findByPrimaryKey(int QRC_SUB_TYPE_ID)
		throws NoSuchQRCSubTypeMasterException, SystemException {
		return findByPrimaryKey((Serializable)QRC_SUB_TYPE_ID);
	}

	/**
	 * Returns the q r c sub type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c sub type master
	 * @return the q r c sub type master, or <code>null</code> if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QRCSubTypeMaster qrcSubTypeMaster = (QRCSubTypeMaster)EntityCacheUtil.getResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCSubTypeMasterImpl.class, primaryKey);

		if (qrcSubTypeMaster == _nullQRCSubTypeMaster) {
			return null;
		}

		if (qrcSubTypeMaster == null) {
			Session session = null;

			try {
				session = openSession();

				qrcSubTypeMaster = (QRCSubTypeMaster)session.get(QRCSubTypeMasterImpl.class,
						primaryKey);

				if (qrcSubTypeMaster != null) {
					cacheResult(qrcSubTypeMaster);
				}
				else {
					EntityCacheUtil.putResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCSubTypeMasterImpl.class, primaryKey,
						_nullQRCSubTypeMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QRCSubTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
					QRCSubTypeMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcSubTypeMaster;
	}

	/**
	 * Returns the q r c sub type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_SUB_TYPE_ID the primary key of the q r c sub type master
	 * @return the q r c sub type master, or <code>null</code> if a q r c sub type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCSubTypeMaster fetchByPrimaryKey(int QRC_SUB_TYPE_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_SUB_TYPE_ID);
	}

	/**
	 * Returns all the q r c sub type masters.
	 *
	 * @return the q r c sub type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCSubTypeMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q r c sub type masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c sub type masters
	 * @param end the upper bound of the range of q r c sub type masters (not inclusive)
	 * @return the range of q r c sub type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCSubTypeMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q r c sub type masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCSubTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c sub type masters
	 * @param end the upper bound of the range of q r c sub type masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q r c sub type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCSubTypeMaster> findAll(int start, int end,
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

		List<QRCSubTypeMaster> list = (List<QRCSubTypeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCSUBTYPEMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCSUBTYPEMASTER;

				if (pagination) {
					sql = sql.concat(QRCSubTypeMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QRCSubTypeMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCSubTypeMaster>(list);
				}
				else {
					list = (List<QRCSubTypeMaster>)QueryUtil.list(q,
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
	 * Removes all the q r c sub type masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QRCSubTypeMaster qrcSubTypeMaster : findAll()) {
			remove(qrcSubTypeMaster);
		}
	}

	/**
	 * Returns the number of q r c sub type masters.
	 *
	 * @return the number of q r c sub type masters
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

				Query q = session.createQuery(_SQL_COUNT_QRCSUBTYPEMASTER);

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
	 * Initializes the q r c sub type master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.QRCSubTypeMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QRCSubTypeMaster>> listenersList = new ArrayList<ModelListener<QRCSubTypeMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QRCSubTypeMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QRCSubTypeMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCSUBTYPEMASTER = "SELECT qrcSubTypeMaster FROM QRCSubTypeMaster qrcSubTypeMaster";
	private static final String _SQL_COUNT_QRCSUBTYPEMASTER = "SELECT COUNT(qrcSubTypeMaster) FROM QRCSubTypeMaster qrcSubTypeMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcSubTypeMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QRCSubTypeMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QRCSubTypeMasterPersistenceImpl.class);
	private static QRCSubTypeMaster _nullQRCSubTypeMaster = new QRCSubTypeMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QRCSubTypeMaster> toCacheModel() {
				return _nullQRCSubTypeMasterCacheModel;
			}
		};

	private static CacheModel<QRCSubTypeMaster> _nullQRCSubTypeMasterCacheModel = new CacheModel<QRCSubTypeMaster>() {
			@Override
			public QRCSubTypeMaster toEntityModel() {
				return _nullQRCSubTypeMaster;
			}
		};
}