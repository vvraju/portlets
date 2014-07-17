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

import com.ifli.rapid.NoSuchQRCTypeMasterException;
import com.ifli.rapid.model.QRCTypeMaster;
import com.ifli.rapid.model.impl.QRCTypeMasterImpl;
import com.ifli.rapid.model.impl.QRCTypeMasterModelImpl;

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
 * The persistence implementation for the q r c type master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCTypeMasterPersistence
 * @see QRCTypeMasterUtil
 * @generated
 */
public class QRCTypeMasterPersistenceImpl extends BasePersistenceImpl<QRCTypeMaster>
	implements QRCTypeMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QRCTypeMasterUtil} to access the q r c type master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QRCTypeMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCTypeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterModelImpl.FINDER_CACHE_ENABLED,
			QRCTypeMasterImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QRCTypeMasterPersistenceImpl() {
		setModelClass(QRCTypeMaster.class);
	}

	/**
	 * Caches the q r c type master in the entity cache if it is enabled.
	 *
	 * @param qrcTypeMaster the q r c type master
	 */
	@Override
	public void cacheResult(QRCTypeMaster qrcTypeMaster) {
		EntityCacheUtil.putResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterImpl.class, qrcTypeMaster.getPrimaryKey(),
			qrcTypeMaster);

		qrcTypeMaster.resetOriginalValues();
	}

	/**
	 * Caches the q r c type masters in the entity cache if it is enabled.
	 *
	 * @param qrcTypeMasters the q r c type masters
	 */
	@Override
	public void cacheResult(List<QRCTypeMaster> qrcTypeMasters) {
		for (QRCTypeMaster qrcTypeMaster : qrcTypeMasters) {
			if (EntityCacheUtil.getResult(
						QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCTypeMasterImpl.class, qrcTypeMaster.getPrimaryKey()) == null) {
				cacheResult(qrcTypeMaster);
			}
			else {
				qrcTypeMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q r c type masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QRCTypeMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QRCTypeMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q r c type master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QRCTypeMaster qrcTypeMaster) {
		EntityCacheUtil.removeResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterImpl.class, qrcTypeMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QRCTypeMaster> qrcTypeMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QRCTypeMaster qrcTypeMaster : qrcTypeMasters) {
			EntityCacheUtil.removeResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCTypeMasterImpl.class, qrcTypeMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q r c type master with the primary key. Does not add the q r c type master to the database.
	 *
	 * @param QRC_TYPE_ID the primary key for the new q r c type master
	 * @return the new q r c type master
	 */
	@Override
	public QRCTypeMaster create(int QRC_TYPE_ID) {
		QRCTypeMaster qrcTypeMaster = new QRCTypeMasterImpl();

		qrcTypeMaster.setNew(true);
		qrcTypeMaster.setPrimaryKey(QRC_TYPE_ID);

		return qrcTypeMaster;
	}

	/**
	 * Removes the q r c type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_TYPE_ID the primary key of the q r c type master
	 * @return the q r c type master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster remove(int QRC_TYPE_ID)
		throws NoSuchQRCTypeMasterException, SystemException {
		return remove((Serializable)QRC_TYPE_ID);
	}

	/**
	 * Removes the q r c type master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q r c type master
	 * @return the q r c type master that was removed
	 * @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster remove(Serializable primaryKey)
		throws NoSuchQRCTypeMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QRCTypeMaster qrcTypeMaster = (QRCTypeMaster)session.get(QRCTypeMasterImpl.class,
					primaryKey);

			if (qrcTypeMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQRCTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcTypeMaster);
		}
		catch (NoSuchQRCTypeMasterException nsee) {
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
	protected QRCTypeMaster removeImpl(QRCTypeMaster qrcTypeMaster)
		throws SystemException {
		qrcTypeMaster = toUnwrappedModel(qrcTypeMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcTypeMaster)) {
				qrcTypeMaster = (QRCTypeMaster)session.get(QRCTypeMasterImpl.class,
						qrcTypeMaster.getPrimaryKeyObj());
			}

			if (qrcTypeMaster != null) {
				session.delete(qrcTypeMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcTypeMaster != null) {
			clearCache(qrcTypeMaster);
		}

		return qrcTypeMaster;
	}

	@Override
	public QRCTypeMaster updateImpl(
		com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster)
		throws SystemException {
		qrcTypeMaster = toUnwrappedModel(qrcTypeMaster);

		boolean isNew = qrcTypeMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcTypeMaster.isNew()) {
				session.save(qrcTypeMaster);

				qrcTypeMaster.setNew(false);
			}
			else {
				session.merge(qrcTypeMaster);
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

		EntityCacheUtil.putResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
			QRCTypeMasterImpl.class, qrcTypeMaster.getPrimaryKey(),
			qrcTypeMaster);

		return qrcTypeMaster;
	}

	protected QRCTypeMaster toUnwrappedModel(QRCTypeMaster qrcTypeMaster) {
		if (qrcTypeMaster instanceof QRCTypeMasterImpl) {
			return qrcTypeMaster;
		}

		QRCTypeMasterImpl qrcTypeMasterImpl = new QRCTypeMasterImpl();

		qrcTypeMasterImpl.setNew(qrcTypeMaster.isNew());
		qrcTypeMasterImpl.setPrimaryKey(qrcTypeMaster.getPrimaryKey());

		qrcTypeMasterImpl.setQRC_TYPE_ID(qrcTypeMaster.getQRC_TYPE_ID());
		qrcTypeMasterImpl.setTYPE_DESC(qrcTypeMaster.getTYPE_DESC());
		qrcTypeMasterImpl.setACTIVE_FLAG(qrcTypeMaster.getACTIVE_FLAG());
		qrcTypeMasterImpl.setINSERTED_DATE(qrcTypeMaster.getINSERTED_DATE());
		qrcTypeMasterImpl.setINSERTED_BY(qrcTypeMaster.getINSERTED_BY());
		qrcTypeMasterImpl.setUPDATED_DATE(qrcTypeMaster.getUPDATED_DATE());
		qrcTypeMasterImpl.setUPDATED_BY(qrcTypeMaster.getUPDATED_BY());
		qrcTypeMasterImpl.setDELETED_DATE(qrcTypeMaster.getDELETED_DATE());
		qrcTypeMasterImpl.setDELETED_BY(qrcTypeMaster.getDELETED_BY());

		return qrcTypeMasterImpl;
	}

	/**
	 * Returns the q r c type master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c type master
	 * @return the q r c type master
	 * @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQRCTypeMasterException, SystemException {
		QRCTypeMaster qrcTypeMaster = fetchByPrimaryKey(primaryKey);

		if (qrcTypeMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQRCTypeMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcTypeMaster;
	}

	/**
	 * Returns the q r c type master with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCTypeMasterException} if it could not be found.
	 *
	 * @param QRC_TYPE_ID the primary key of the q r c type master
	 * @return the q r c type master
	 * @throws com.ifli.rapid.NoSuchQRCTypeMasterException if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster findByPrimaryKey(int QRC_TYPE_ID)
		throws NoSuchQRCTypeMasterException, SystemException {
		return findByPrimaryKey((Serializable)QRC_TYPE_ID);
	}

	/**
	 * Returns the q r c type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c type master
	 * @return the q r c type master, or <code>null</code> if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QRCTypeMaster qrcTypeMaster = (QRCTypeMaster)EntityCacheUtil.getResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
				QRCTypeMasterImpl.class, primaryKey);

		if (qrcTypeMaster == _nullQRCTypeMaster) {
			return null;
		}

		if (qrcTypeMaster == null) {
			Session session = null;

			try {
				session = openSession();

				qrcTypeMaster = (QRCTypeMaster)session.get(QRCTypeMasterImpl.class,
						primaryKey);

				if (qrcTypeMaster != null) {
					cacheResult(qrcTypeMaster);
				}
				else {
					EntityCacheUtil.putResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
						QRCTypeMasterImpl.class, primaryKey, _nullQRCTypeMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QRCTypeMasterModelImpl.ENTITY_CACHE_ENABLED,
					QRCTypeMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcTypeMaster;
	}

	/**
	 * Returns the q r c type master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_TYPE_ID the primary key of the q r c type master
	 * @return the q r c type master, or <code>null</code> if a q r c type master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTypeMaster fetchByPrimaryKey(int QRC_TYPE_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_TYPE_ID);
	}

	/**
	 * Returns all the q r c type masters.
	 *
	 * @return the q r c type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTypeMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q r c type masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c type masters
	 * @param end the upper bound of the range of q r c type masters (not inclusive)
	 * @return the range of q r c type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTypeMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q r c type masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTypeMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c type masters
	 * @param end the upper bound of the range of q r c type masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q r c type masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTypeMaster> findAll(int start, int end,
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

		List<QRCTypeMaster> list = (List<QRCTypeMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCTYPEMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCTYPEMASTER;

				if (pagination) {
					sql = sql.concat(QRCTypeMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QRCTypeMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCTypeMaster>(list);
				}
				else {
					list = (List<QRCTypeMaster>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the q r c type masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QRCTypeMaster qrcTypeMaster : findAll()) {
			remove(qrcTypeMaster);
		}
	}

	/**
	 * Returns the number of q r c type masters.
	 *
	 * @return the number of q r c type masters
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

				Query q = session.createQuery(_SQL_COUNT_QRCTYPEMASTER);

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
	 * Initializes the q r c type master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.QRCTypeMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QRCTypeMaster>> listenersList = new ArrayList<ModelListener<QRCTypeMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QRCTypeMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QRCTypeMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCTYPEMASTER = "SELECT qrcTypeMaster FROM QRCTypeMaster qrcTypeMaster";
	private static final String _SQL_COUNT_QRCTYPEMASTER = "SELECT COUNT(qrcTypeMaster) FROM QRCTypeMaster qrcTypeMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcTypeMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QRCTypeMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QRCTypeMasterPersistenceImpl.class);
	private static QRCTypeMaster _nullQRCTypeMaster = new QRCTypeMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QRCTypeMaster> toCacheModel() {
				return _nullQRCTypeMasterCacheModel;
			}
		};

	private static CacheModel<QRCTypeMaster> _nullQRCTypeMasterCacheModel = new CacheModel<QRCTypeMaster>() {
			@Override
			public QRCTypeMaster toEntityModel() {
				return _nullQRCTypeMaster;
			}
		};
}