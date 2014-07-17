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

import com.ifl.rapid.customer.NoSuchQrcTrnOtpException;
import com.ifl.rapid.customer.model.QrcTrnOtp;
import com.ifl.rapid.customer.model.impl.QrcTrnOtpImpl;
import com.ifl.rapid.customer.model.impl.QrcTrnOtpModelImpl;

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
 * The persistence implementation for the qrc trn otp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnOtpPersistence
 * @see QrcTrnOtpUtil
 * @generated
 */
public class QrcTrnOtpPersistenceImpl extends BasePersistenceImpl<QrcTrnOtp>
	implements QrcTrnOtpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcTrnOtpUtil} to access the qrc trn otp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcTrnOtpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpModelImpl.FINDER_CACHE_ENABLED, QrcTrnOtpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpModelImpl.FINDER_CACHE_ENABLED, QrcTrnOtpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcTrnOtpPersistenceImpl() {
		setModelClass(QrcTrnOtp.class);
	}

	/**
	 * Caches the qrc trn otp in the entity cache if it is enabled.
	 *
	 * @param qrcTrnOtp the qrc trn otp
	 */
	@Override
	public void cacheResult(QrcTrnOtp qrcTrnOtp) {
		EntityCacheUtil.putResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpImpl.class, qrcTrnOtp.getPrimaryKey(), qrcTrnOtp);

		qrcTrnOtp.resetOriginalValues();
	}

	/**
	 * Caches the qrc trn otps in the entity cache if it is enabled.
	 *
	 * @param qrcTrnOtps the qrc trn otps
	 */
	@Override
	public void cacheResult(List<QrcTrnOtp> qrcTrnOtps) {
		for (QrcTrnOtp qrcTrnOtp : qrcTrnOtps) {
			if (EntityCacheUtil.getResult(
						QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnOtpImpl.class, qrcTrnOtp.getPrimaryKey()) == null) {
				cacheResult(qrcTrnOtp);
			}
			else {
				qrcTrnOtp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc trn otps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcTrnOtpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcTrnOtpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc trn otp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcTrnOtp qrcTrnOtp) {
		EntityCacheUtil.removeResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpImpl.class, qrcTrnOtp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcTrnOtp> qrcTrnOtps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcTrnOtp qrcTrnOtp : qrcTrnOtps) {
			EntityCacheUtil.removeResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnOtpImpl.class, qrcTrnOtp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc trn otp with the primary key. Does not add the qrc trn otp to the database.
	 *
	 * @param Otp_Id the primary key for the new qrc trn otp
	 * @return the new qrc trn otp
	 */
	@Override
	public QrcTrnOtp create(int Otp_Id) {
		QrcTrnOtp qrcTrnOtp = new QrcTrnOtpImpl();

		qrcTrnOtp.setNew(true);
		qrcTrnOtp.setPrimaryKey(Otp_Id);

		return qrcTrnOtp;
	}

	/**
	 * Removes the qrc trn otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Otp_Id the primary key of the qrc trn otp
	 * @return the qrc trn otp that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnOtpException if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp remove(int Otp_Id)
		throws NoSuchQrcTrnOtpException, SystemException {
		return remove((Serializable)Otp_Id);
	}

	/**
	 * Removes the qrc trn otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc trn otp
	 * @return the qrc trn otp that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnOtpException if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp remove(Serializable primaryKey)
		throws NoSuchQrcTrnOtpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcTrnOtp qrcTrnOtp = (QrcTrnOtp)session.get(QrcTrnOtpImpl.class,
					primaryKey);

			if (qrcTrnOtp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcTrnOtpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcTrnOtp);
		}
		catch (NoSuchQrcTrnOtpException nsee) {
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
	protected QrcTrnOtp removeImpl(QrcTrnOtp qrcTrnOtp)
		throws SystemException {
		qrcTrnOtp = toUnwrappedModel(qrcTrnOtp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcTrnOtp)) {
				qrcTrnOtp = (QrcTrnOtp)session.get(QrcTrnOtpImpl.class,
						qrcTrnOtp.getPrimaryKeyObj());
			}

			if (qrcTrnOtp != null) {
				session.delete(qrcTrnOtp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcTrnOtp != null) {
			clearCache(qrcTrnOtp);
		}

		return qrcTrnOtp;
	}

	@Override
	public QrcTrnOtp updateImpl(
		com.ifl.rapid.customer.model.QrcTrnOtp qrcTrnOtp)
		throws SystemException {
		qrcTrnOtp = toUnwrappedModel(qrcTrnOtp);

		boolean isNew = qrcTrnOtp.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcTrnOtp.isNew()) {
				session.save(qrcTrnOtp);

				qrcTrnOtp.setNew(false);
			}
			else {
				session.merge(qrcTrnOtp);
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

		EntityCacheUtil.putResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnOtpImpl.class, qrcTrnOtp.getPrimaryKey(), qrcTrnOtp);

		return qrcTrnOtp;
	}

	protected QrcTrnOtp toUnwrappedModel(QrcTrnOtp qrcTrnOtp) {
		if (qrcTrnOtp instanceof QrcTrnOtpImpl) {
			return qrcTrnOtp;
		}

		QrcTrnOtpImpl qrcTrnOtpImpl = new QrcTrnOtpImpl();

		qrcTrnOtpImpl.setNew(qrcTrnOtp.isNew());
		qrcTrnOtpImpl.setPrimaryKey(qrcTrnOtp.getPrimaryKey());

		qrcTrnOtpImpl.setOtp_Id(qrcTrnOtp.getOtp_Id());
		qrcTrnOtpImpl.setOtp(qrcTrnOtp.getOtp());
		qrcTrnOtpImpl.setContactId(qrcTrnOtp.getContactId());
		qrcTrnOtpImpl.setCreatedBy(qrcTrnOtp.getCreatedBy());
		qrcTrnOtpImpl.setCreatedDate(qrcTrnOtp.getCreatedDate());
		qrcTrnOtpImpl.setModifiedBy(qrcTrnOtp.getModifiedBy());
		qrcTrnOtpImpl.setModifiedDate(qrcTrnOtp.getModifiedDate());
		qrcTrnOtpImpl.setIsActive(qrcTrnOtp.getIsActive());

		return qrcTrnOtpImpl;
	}

	/**
	 * Returns the qrc trn otp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn otp
	 * @return the qrc trn otp
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnOtpException if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcTrnOtpException, SystemException {
		QrcTrnOtp qrcTrnOtp = fetchByPrimaryKey(primaryKey);

		if (qrcTrnOtp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcTrnOtpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcTrnOtp;
	}

	/**
	 * Returns the qrc trn otp with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcTrnOtpException} if it could not be found.
	 *
	 * @param Otp_Id the primary key of the qrc trn otp
	 * @return the qrc trn otp
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnOtpException if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp findByPrimaryKey(int Otp_Id)
		throws NoSuchQrcTrnOtpException, SystemException {
		return findByPrimaryKey((Serializable)Otp_Id);
	}

	/**
	 * Returns the qrc trn otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn otp
	 * @return the qrc trn otp, or <code>null</code> if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcTrnOtp qrcTrnOtp = (QrcTrnOtp)EntityCacheUtil.getResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnOtpImpl.class, primaryKey);

		if (qrcTrnOtp == _nullQrcTrnOtp) {
			return null;
		}

		if (qrcTrnOtp == null) {
			Session session = null;

			try {
				session = openSession();

				qrcTrnOtp = (QrcTrnOtp)session.get(QrcTrnOtpImpl.class,
						primaryKey);

				if (qrcTrnOtp != null) {
					cacheResult(qrcTrnOtp);
				}
				else {
					EntityCacheUtil.putResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnOtpImpl.class, primaryKey, _nullQrcTrnOtp);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcTrnOtpModelImpl.ENTITY_CACHE_ENABLED,
					QrcTrnOtpImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcTrnOtp;
	}

	/**
	 * Returns the qrc trn otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Otp_Id the primary key of the qrc trn otp
	 * @return the qrc trn otp, or <code>null</code> if a qrc trn otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnOtp fetchByPrimaryKey(int Otp_Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Otp_Id);
	}

	/**
	 * Returns all the qrc trn otps.
	 *
	 * @return the qrc trn otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnOtp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc trn otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn otps
	 * @param end the upper bound of the range of qrc trn otps (not inclusive)
	 * @return the range of qrc trn otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnOtp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc trn otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn otps
	 * @param end the upper bound of the range of qrc trn otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc trn otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnOtp> findAll(int start, int end,
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

		List<QrcTrnOtp> list = (List<QrcTrnOtp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCTRNOTP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCTRNOTP;

				if (pagination) {
					sql = sql.concat(QrcTrnOtpModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcTrnOtp>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcTrnOtp>(list);
				}
				else {
					list = (List<QrcTrnOtp>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the qrc trn otps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcTrnOtp qrcTrnOtp : findAll()) {
			remove(qrcTrnOtp);
		}
	}

	/**
	 * Returns the number of qrc trn otps.
	 *
	 * @return the number of qrc trn otps
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

				Query q = session.createQuery(_SQL_COUNT_QRCTRNOTP);

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
	 * Initializes the qrc trn otp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcTrnOtp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcTrnOtp>> listenersList = new ArrayList<ModelListener<QrcTrnOtp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcTrnOtp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcTrnOtpImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCTRNOTP = "SELECT qrcTrnOtp FROM QrcTrnOtp qrcTrnOtp";
	private static final String _SQL_COUNT_QRCTRNOTP = "SELECT COUNT(qrcTrnOtp) FROM QrcTrnOtp qrcTrnOtp";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcTrnOtp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcTrnOtp exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcTrnOtpPersistenceImpl.class);
	private static QrcTrnOtp _nullQrcTrnOtp = new QrcTrnOtpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcTrnOtp> toCacheModel() {
				return _nullQrcTrnOtpCacheModel;
			}
		};

	private static CacheModel<QrcTrnOtp> _nullQrcTrnOtpCacheModel = new CacheModel<QrcTrnOtp>() {
			@Override
			public QrcTrnOtp toEntityModel() {
				return _nullQrcTrnOtp;
			}
		};
}