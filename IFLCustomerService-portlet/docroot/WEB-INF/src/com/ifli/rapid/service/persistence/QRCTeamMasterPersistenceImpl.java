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

import com.ifli.rapid.NoSuchQRCTeamMasterException;
import com.ifli.rapid.model.QRCTeamMaster;
import com.ifli.rapid.model.impl.QRCTeamMasterImpl;
import com.ifli.rapid.model.impl.QRCTeamMasterModelImpl;

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
 * The persistence implementation for the q r c team master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCTeamMasterPersistence
 * @see QRCTeamMasterUtil
 * @generated
 */
public class QRCTeamMasterPersistenceImpl extends BasePersistenceImpl<QRCTeamMaster>
	implements QRCTeamMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QRCTeamMasterUtil} to access the q r c team master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QRCTeamMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCTeamMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCTeamMasterImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QRCTeamMasterPersistenceImpl() {
		setModelClass(QRCTeamMaster.class);
	}

	/**
	 * Caches the q r c team master in the entity cache if it is enabled.
	 *
	 * @param qrcTeamMaster the q r c team master
	 */
	@Override
	public void cacheResult(QRCTeamMaster qrcTeamMaster) {
		EntityCacheUtil.putResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterImpl.class, qrcTeamMaster.getPrimaryKey(),
			qrcTeamMaster);

		qrcTeamMaster.resetOriginalValues();
	}

	/**
	 * Caches the q r c team masters in the entity cache if it is enabled.
	 *
	 * @param qrcTeamMasters the q r c team masters
	 */
	@Override
	public void cacheResult(List<QRCTeamMaster> qrcTeamMasters) {
		for (QRCTeamMaster qrcTeamMaster : qrcTeamMasters) {
			if (EntityCacheUtil.getResult(
						QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCTeamMasterImpl.class, qrcTeamMaster.getPrimaryKey()) == null) {
				cacheResult(qrcTeamMaster);
			}
			else {
				qrcTeamMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q r c team masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QRCTeamMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QRCTeamMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q r c team master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QRCTeamMaster qrcTeamMaster) {
		EntityCacheUtil.removeResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterImpl.class, qrcTeamMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QRCTeamMaster> qrcTeamMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QRCTeamMaster qrcTeamMaster : qrcTeamMasters) {
			EntityCacheUtil.removeResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCTeamMasterImpl.class, qrcTeamMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q r c team master with the primary key. Does not add the q r c team master to the database.
	 *
	 * @param QRC_TM_ID the primary key for the new q r c team master
	 * @return the new q r c team master
	 */
	@Override
	public QRCTeamMaster create(int QRC_TM_ID) {
		QRCTeamMaster qrcTeamMaster = new QRCTeamMasterImpl();

		qrcTeamMaster.setNew(true);
		qrcTeamMaster.setPrimaryKey(QRC_TM_ID);

		return qrcTeamMaster;
	}

	/**
	 * Removes the q r c team master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_TM_ID the primary key of the q r c team master
	 * @return the q r c team master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCTeamMasterException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster remove(int QRC_TM_ID)
		throws NoSuchQRCTeamMasterException, SystemException {
		return remove((Serializable)QRC_TM_ID);
	}

	/**
	 * Removes the q r c team master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q r c team master
	 * @return the q r c team master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCTeamMasterException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster remove(Serializable primaryKey)
		throws NoSuchQRCTeamMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QRCTeamMaster qrcTeamMaster = (QRCTeamMaster)session.get(QRCTeamMasterImpl.class,
					primaryKey);

			if (qrcTeamMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQRCTeamMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcTeamMaster);
		}
		catch (NoSuchQRCTeamMasterException nsee) {
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
	protected QRCTeamMaster removeImpl(QRCTeamMaster qrcTeamMaster)
		throws SystemException {
		qrcTeamMaster = toUnwrappedModel(qrcTeamMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcTeamMaster)) {
				qrcTeamMaster = (QRCTeamMaster)session.get(QRCTeamMasterImpl.class,
						qrcTeamMaster.getPrimaryKeyObj());
			}

			if (qrcTeamMaster != null) {
				session.delete(qrcTeamMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcTeamMaster != null) {
			clearCache(qrcTeamMaster);
		}

		return qrcTeamMaster;
	}

	@Override
	public QRCTeamMaster updateImpl(
		com.ifli.rapid.model.QRCTeamMaster qrcTeamMaster)
		throws SystemException {
		qrcTeamMaster = toUnwrappedModel(qrcTeamMaster);

		boolean isNew = qrcTeamMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcTeamMaster.isNew()) {
				session.save(qrcTeamMaster);

				qrcTeamMaster.setNew(false);
			}
			else {
				session.merge(qrcTeamMaster);
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

		EntityCacheUtil.putResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTeamMasterImpl.class, qrcTeamMaster.getPrimaryKey(),
			qrcTeamMaster);

		return qrcTeamMaster;
	}

	protected QRCTeamMaster toUnwrappedModel(QRCTeamMaster qrcTeamMaster) {
		if (qrcTeamMaster instanceof QRCTeamMasterImpl) {
			return qrcTeamMaster;
		}

		QRCTeamMasterImpl qrcTeamMasterImpl = new QRCTeamMasterImpl();

		qrcTeamMasterImpl.setNew(qrcTeamMaster.isNew());
		qrcTeamMasterImpl.setPrimaryKey(qrcTeamMaster.getPrimaryKey());

		qrcTeamMasterImpl.setQRC_TM_ID(qrcTeamMaster.getQRC_TM_ID());
		qrcTeamMasterImpl.setTM_DESC(qrcTeamMaster.getTM_DESC());
		qrcTeamMasterImpl.setACTIVE_FLAG(qrcTeamMaster.getACTIVE_FLAG());
		qrcTeamMasterImpl.setINSERTED_DATE(qrcTeamMaster.getINSERTED_DATE());
		qrcTeamMasterImpl.setINSERTED_BY(qrcTeamMaster.getINSERTED_BY());
		qrcTeamMasterImpl.setUPDATED_DATE(qrcTeamMaster.getUPDATED_DATE());
		qrcTeamMasterImpl.setUPDATED_BY(qrcTeamMaster.getUPDATED_BY());
		qrcTeamMasterImpl.setDELETED_DATE(qrcTeamMaster.getDELETED_DATE());
		qrcTeamMasterImpl.setDELETED_BY(qrcTeamMaster.getDELETED_BY());

		return qrcTeamMasterImpl;
	}

	/**
	 * Returns the q r c team master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c team master
	 * @return the q r c team master
	 * @throws com.ifli.rapid.NoSuchQRCTeamMasterException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQRCTeamMasterException, SystemException {
		QRCTeamMaster qrcTeamMaster = fetchByPrimaryKey(primaryKey);

		if (qrcTeamMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQRCTeamMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcTeamMaster;
	}

	/**
	 * Returns the q r c team master with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCTeamMasterException} if it could not be found.
	 *
	 * @param QRC_TM_ID the primary key of the q r c team master
	 * @return the q r c team master
	 * @throws com.ifli.rapid.NoSuchQRCTeamMasterException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster findByPrimaryKey(int QRC_TM_ID)
		throws NoSuchQRCTeamMasterException, SystemException {
		return findByPrimaryKey((Serializable)QRC_TM_ID);
	}

	/**
	 * Returns the q r c team master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c team master
	 * @return the q r c team master, or <code>null</code> if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QRCTeamMaster qrcTeamMaster = (QRCTeamMaster)EntityCacheUtil.getResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCTeamMasterImpl.class, primaryKey);

		if (qrcTeamMaster == _nullQRCTeamMaster) {
			return null;
		}

		if (qrcTeamMaster == null) {
			Session session = null;

			try {
				session = openSession();

				qrcTeamMaster = (QRCTeamMaster)session.get(QRCTeamMasterImpl.class,
						primaryKey);

				if (qrcTeamMaster != null) {
					cacheResult(qrcTeamMaster);
				}
				else {
					EntityCacheUtil.putResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCTeamMasterImpl.class, primaryKey, _nullQRCTeamMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QRCTeamMasterModelImpl.ENTITY_CACHE_ENABLED,
					QRCTeamMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcTeamMaster;
	}

	/**
	 * Returns the q r c team master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_TM_ID the primary key of the q r c team master
	 * @return the q r c team master, or <code>null</code> if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster fetchByPrimaryKey(int QRC_TM_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_TM_ID);
	}

	/**
	 * Returns all the q r c team masters.
	 *
	 * @return the q r c team masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTeamMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q r c team masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c team masters
	 * @param end the upper bound of the range of q r c team masters (not inclusive)
	 * @return the range of q r c team masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTeamMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q r c team masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c team masters
	 * @param end the upper bound of the range of q r c team masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q r c team masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTeamMaster> findAll(int start, int end,
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

		List<QRCTeamMaster> list = (List<QRCTeamMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCTEAMMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCTEAMMASTER;

				if (pagination) {
					sql = sql.concat(QRCTeamMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QRCTeamMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCTeamMaster>(list);
				}
				else {
					list = (List<QRCTeamMaster>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the q r c team masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QRCTeamMaster qrcTeamMaster : findAll()) {
			remove(qrcTeamMaster);
		}
	}

	/**
	 * Returns the number of q r c team masters.
	 *
	 * @return the number of q r c team masters
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

				Query q = session.createQuery(_SQL_COUNT_QRCTEAMMASTER);

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
	 * Initializes the q r c team master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.QRCTeamMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QRCTeamMaster>> listenersList = new ArrayList<ModelListener<QRCTeamMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QRCTeamMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QRCTeamMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCTEAMMASTER = "SELECT qrcTeamMaster FROM QRCTeamMaster qrcTeamMaster";
	private static final String _SQL_COUNT_QRCTEAMMASTER = "SELECT COUNT(qrcTeamMaster) FROM QRCTeamMaster qrcTeamMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcTeamMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QRCTeamMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QRCTeamMasterPersistenceImpl.class);
	private static QRCTeamMaster _nullQRCTeamMaster = new QRCTeamMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QRCTeamMaster> toCacheModel() {
				return _nullQRCTeamMasterCacheModel;
			}
		};

	private static CacheModel<QRCTeamMaster> _nullQRCTeamMasterCacheModel = new CacheModel<QRCTeamMaster>() {
			@Override
			public QRCTeamMaster toEntityModel() {
				return _nullQRCTeamMaster;
			}
		};
}