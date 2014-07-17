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

import com.ifli.rapid.NoSuchQRCUserException;
import com.ifli.rapid.model.QRCUser;
import com.ifli.rapid.model.impl.QRCUserImpl;
import com.ifli.rapid.model.impl.QRCUserModelImpl;

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
 * The persistence implementation for the q r c user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCUserPersistence
 * @see QRCUserUtil
 * @generated
 */
public class QRCUserPersistenceImpl extends BasePersistenceImpl<QRCUser>
	implements QRCUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QRCUserUtil} to access the q r c user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QRCUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserModelImpl.FINDER_CACHE_ENABLED, QRCUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserModelImpl.FINDER_CACHE_ENABLED, QRCUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QRCUserPersistenceImpl() {
		setModelClass(QRCUser.class);
	}

	/**
	 * Caches the q r c user in the entity cache if it is enabled.
	 *
	 * @param qrcUser the q r c user
	 */
	@Override
	public void cacheResult(QRCUser qrcUser) {
		EntityCacheUtil.putResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserImpl.class, qrcUser.getPrimaryKey(), qrcUser);

		qrcUser.resetOriginalValues();
	}

	/**
	 * Caches the q r c users in the entity cache if it is enabled.
	 *
	 * @param qrcUsers the q r c users
	 */
	@Override
	public void cacheResult(List<QRCUser> qrcUsers) {
		for (QRCUser qrcUser : qrcUsers) {
			if (EntityCacheUtil.getResult(
						QRCUserModelImpl.ENTITY_CACHE_ENABLED,
						QRCUserImpl.class, qrcUser.getPrimaryKey()) == null) {
				cacheResult(qrcUser);
			}
			else {
				qrcUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q r c users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QRCUserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QRCUserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q r c user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QRCUser qrcUser) {
		EntityCacheUtil.removeResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserImpl.class, qrcUser.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QRCUser> qrcUsers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QRCUser qrcUser : qrcUsers) {
			EntityCacheUtil.removeResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
				QRCUserImpl.class, qrcUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q r c user with the primary key. Does not add the q r c user to the database.
	 *
	 * @param QRC_USER_ID the primary key for the new q r c user
	 * @return the new q r c user
	 */
	@Override
	public QRCUser create(int QRC_USER_ID) {
		QRCUser qrcUser = new QRCUserImpl();

		qrcUser.setNew(true);
		qrcUser.setPrimaryKey(QRC_USER_ID);

		return qrcUser;
	}

	/**
	 * Removes the q r c user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_USER_ID the primary key of the q r c user
	 * @return the q r c user that was removed
	 * @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser remove(int QRC_USER_ID)
		throws NoSuchQRCUserException, SystemException {
		return remove((Serializable)QRC_USER_ID);
	}

	/**
	 * Removes the q r c user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q r c user
	 * @return the q r c user that was removed
	 * @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser remove(Serializable primaryKey)
		throws NoSuchQRCUserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QRCUser qrcUser = (QRCUser)session.get(QRCUserImpl.class, primaryKey);

			if (qrcUser == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQRCUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcUser);
		}
		catch (NoSuchQRCUserException nsee) {
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
	protected QRCUser removeImpl(QRCUser qrcUser) throws SystemException {
		qrcUser = toUnwrappedModel(qrcUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcUser)) {
				qrcUser = (QRCUser)session.get(QRCUserImpl.class,
						qrcUser.getPrimaryKeyObj());
			}

			if (qrcUser != null) {
				session.delete(qrcUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcUser != null) {
			clearCache(qrcUser);
		}

		return qrcUser;
	}

	@Override
	public QRCUser updateImpl(com.ifli.rapid.model.QRCUser qrcUser)
		throws SystemException {
		qrcUser = toUnwrappedModel(qrcUser);

		boolean isNew = qrcUser.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcUser.isNew()) {
				session.save(qrcUser);

				qrcUser.setNew(false);
			}
			else {
				session.merge(qrcUser);
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

		EntityCacheUtil.putResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
			QRCUserImpl.class, qrcUser.getPrimaryKey(), qrcUser);

		return qrcUser;
	}

	protected QRCUser toUnwrappedModel(QRCUser qrcUser) {
		if (qrcUser instanceof QRCUserImpl) {
			return qrcUser;
		}

		QRCUserImpl qrcUserImpl = new QRCUserImpl();

		qrcUserImpl.setNew(qrcUser.isNew());
		qrcUserImpl.setPrimaryKey(qrcUser.getPrimaryKey());

		qrcUserImpl.setQRC_USER_ID(qrcUser.getQRC_USER_ID());
		qrcUserImpl.setUSER_NAME(qrcUser.getUSER_NAME());
		qrcUserImpl.setTEAM_ID(qrcUser.getTEAM_ID());
		qrcUserImpl.setUSER_DETAILS(qrcUser.getUSER_DETAILS());
		qrcUserImpl.setACTIVE_FLAG(qrcUser.getACTIVE_FLAG());
		qrcUserImpl.setINSERTED_DATE(qrcUser.getINSERTED_DATE());
		qrcUserImpl.setINSERTED_BY(qrcUser.getINSERTED_BY());
		qrcUserImpl.setUPDATED_DATE(qrcUser.getUPDATED_DATE());
		qrcUserImpl.setUPDATED_BY(qrcUser.getUPDATED_BY());
		qrcUserImpl.setDELETED_DATE(qrcUser.getDELETED_DATE());
		qrcUserImpl.setDELETED_BY(qrcUser.getDELETED_BY());

		return qrcUserImpl;
	}

	/**
	 * Returns the q r c user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c user
	 * @return the q r c user
	 * @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQRCUserException, SystemException {
		QRCUser qrcUser = fetchByPrimaryKey(primaryKey);

		if (qrcUser == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQRCUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcUser;
	}

	/**
	 * Returns the q r c user with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCUserException} if it could not be found.
	 *
	 * @param QRC_USER_ID the primary key of the q r c user
	 * @return the q r c user
	 * @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser findByPrimaryKey(int QRC_USER_ID)
		throws NoSuchQRCUserException, SystemException {
		return findByPrimaryKey((Serializable)QRC_USER_ID);
	}

	/**
	 * Returns the q r c user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c user
	 * @return the q r c user, or <code>null</code> if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QRCUser qrcUser = (QRCUser)EntityCacheUtil.getResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
				QRCUserImpl.class, primaryKey);

		if (qrcUser == _nullQRCUser) {
			return null;
		}

		if (qrcUser == null) {
			Session session = null;

			try {
				session = openSession();

				qrcUser = (QRCUser)session.get(QRCUserImpl.class, primaryKey);

				if (qrcUser != null) {
					cacheResult(qrcUser);
				}
				else {
					EntityCacheUtil.putResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
						QRCUserImpl.class, primaryKey, _nullQRCUser);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QRCUserModelImpl.ENTITY_CACHE_ENABLED,
					QRCUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcUser;
	}

	/**
	 * Returns the q r c user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_USER_ID the primary key of the q r c user
	 * @return the q r c user, or <code>null</code> if a q r c user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCUser fetchByPrimaryKey(int QRC_USER_ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_USER_ID);
	}

	/**
	 * Returns all the q r c users.
	 *
	 * @return the q r c users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCUser> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q r c users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c users
	 * @param end the upper bound of the range of q r c users (not inclusive)
	 * @return the range of q r c users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCUser> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q r c users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c users
	 * @param end the upper bound of the range of q r c users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q r c users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCUser> findAll(int start, int end,
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

		List<QRCUser> list = (List<QRCUser>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCUSER;

				if (pagination) {
					sql = sql.concat(QRCUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QRCUser>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCUser>(list);
				}
				else {
					list = (List<QRCUser>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the q r c users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QRCUser qrcUser : findAll()) {
			remove(qrcUser);
		}
	}

	/**
	 * Returns the number of q r c users.
	 *
	 * @return the number of q r c users
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

				Query q = session.createQuery(_SQL_COUNT_QRCUSER);

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
	 * Initializes the q r c user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.QRCUser")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QRCUser>> listenersList = new ArrayList<ModelListener<QRCUser>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QRCUser>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QRCUserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCUSER = "SELECT qrcUser FROM QRCUser qrcUser";
	private static final String _SQL_COUNT_QRCUSER = "SELECT COUNT(qrcUser) FROM QRCUser qrcUser";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QRCUser exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QRCUserPersistenceImpl.class);
	private static QRCUser _nullQRCUser = new QRCUserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QRCUser> toCacheModel() {
				return _nullQRCUserCacheModel;
			}
		};

	private static CacheModel<QRCUser> _nullQRCUserCacheModel = new CacheModel<QRCUser>() {
			@Override
			public QRCUser toEntityModel() {
				return _nullQRCUser;
			}
		};
}