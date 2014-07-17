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

import com.ifli.rapid.NoSuchPaymentOptionMasterException;
import com.ifli.rapid.model.PaymentOptionMaster;
import com.ifli.rapid.model.impl.PaymentOptionMasterImpl;
import com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl;

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
 * The persistence implementation for the payment option master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMasterPersistence
 * @see PaymentOptionMasterUtil
 * @generated
 */
public class PaymentOptionMasterPersistenceImpl extends BasePersistenceImpl<PaymentOptionMaster>
	implements PaymentOptionMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentOptionMasterUtil} to access the payment option master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentOptionMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentOptionMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentOptionMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentOptionMasterPersistenceImpl() {
		setModelClass(PaymentOptionMaster.class);
	}

	/**
	 * Caches the payment option master in the entity cache if it is enabled.
	 *
	 * @param paymentOptionMaster the payment option master
	 */
	@Override
	public void cacheResult(PaymentOptionMaster paymentOptionMaster) {
		EntityCacheUtil.putResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterImpl.class, paymentOptionMaster.getPrimaryKey(),
			paymentOptionMaster);

		paymentOptionMaster.resetOriginalValues();
	}

	/**
	 * Caches the payment option masters in the entity cache if it is enabled.
	 *
	 * @param paymentOptionMasters the payment option masters
	 */
	@Override
	public void cacheResult(List<PaymentOptionMaster> paymentOptionMasters) {
		for (PaymentOptionMaster paymentOptionMaster : paymentOptionMasters) {
			if (EntityCacheUtil.getResult(
						PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentOptionMasterImpl.class,
						paymentOptionMaster.getPrimaryKey()) == null) {
				cacheResult(paymentOptionMaster);
			}
			else {
				paymentOptionMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment option masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentOptionMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentOptionMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment option master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentOptionMaster paymentOptionMaster) {
		EntityCacheUtil.removeResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterImpl.class, paymentOptionMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentOptionMaster> paymentOptionMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentOptionMaster paymentOptionMaster : paymentOptionMasters) {
			EntityCacheUtil.removeResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentOptionMasterImpl.class,
				paymentOptionMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment option master with the primary key. Does not add the payment option master to the database.
	 *
	 * @param PaymentOptionId the primary key for the new payment option master
	 * @return the new payment option master
	 */
	@Override
	public PaymentOptionMaster create(String PaymentOptionId) {
		PaymentOptionMaster paymentOptionMaster = new PaymentOptionMasterImpl();

		paymentOptionMaster.setNew(true);
		paymentOptionMaster.setPrimaryKey(PaymentOptionId);

		return paymentOptionMaster;
	}

	/**
	 * Removes the payment option master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PaymentOptionId the primary key of the payment option master
	 * @return the payment option master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster remove(String PaymentOptionId)
		throws NoSuchPaymentOptionMasterException, SystemException {
		return remove((Serializable)PaymentOptionId);
	}

	/**
	 * Removes the payment option master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment option master
	 * @return the payment option master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster remove(Serializable primaryKey)
		throws NoSuchPaymentOptionMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentOptionMaster paymentOptionMaster = (PaymentOptionMaster)session.get(PaymentOptionMasterImpl.class,
					primaryKey);

			if (paymentOptionMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentOptionMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentOptionMaster);
		}
		catch (NoSuchPaymentOptionMasterException nsee) {
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
	protected PaymentOptionMaster removeImpl(
		PaymentOptionMaster paymentOptionMaster) throws SystemException {
		paymentOptionMaster = toUnwrappedModel(paymentOptionMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentOptionMaster)) {
				paymentOptionMaster = (PaymentOptionMaster)session.get(PaymentOptionMasterImpl.class,
						paymentOptionMaster.getPrimaryKeyObj());
			}

			if (paymentOptionMaster != null) {
				session.delete(paymentOptionMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentOptionMaster != null) {
			clearCache(paymentOptionMaster);
		}

		return paymentOptionMaster;
	}

	@Override
	public PaymentOptionMaster updateImpl(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws SystemException {
		paymentOptionMaster = toUnwrappedModel(paymentOptionMaster);

		boolean isNew = paymentOptionMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentOptionMaster.isNew()) {
				session.save(paymentOptionMaster);

				paymentOptionMaster.setNew(false);
			}
			else {
				session.merge(paymentOptionMaster);
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

		EntityCacheUtil.putResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionMasterImpl.class, paymentOptionMaster.getPrimaryKey(),
			paymentOptionMaster);

		return paymentOptionMaster;
	}

	protected PaymentOptionMaster toUnwrappedModel(
		PaymentOptionMaster paymentOptionMaster) {
		if (paymentOptionMaster instanceof PaymentOptionMasterImpl) {
			return paymentOptionMaster;
		}

		PaymentOptionMasterImpl paymentOptionMasterImpl = new PaymentOptionMasterImpl();

		paymentOptionMasterImpl.setNew(paymentOptionMaster.isNew());
		paymentOptionMasterImpl.setPrimaryKey(paymentOptionMaster.getPrimaryKey());

		paymentOptionMasterImpl.setPaymentOptionId(paymentOptionMaster.getPaymentOptionId());
		paymentOptionMasterImpl.setPaymentOptionKey(paymentOptionMaster.getPaymentOptionKey());
		paymentOptionMasterImpl.setIsActive(paymentOptionMaster.isIsActive());
		paymentOptionMasterImpl.setCreatedBy(paymentOptionMaster.getCreatedBy());
		paymentOptionMasterImpl.setCreatedDate(paymentOptionMaster.getCreatedDate());
		paymentOptionMasterImpl.setModifiedBy(paymentOptionMaster.getModifiedBy());
		paymentOptionMasterImpl.setModifiedDate(paymentOptionMaster.getModifiedDate());
		paymentOptionMasterImpl.setPriority(paymentOptionMaster.getPriority());
		paymentOptionMasterImpl.setPaymentOptionDesc(paymentOptionMaster.getPaymentOptionDesc());
		paymentOptionMasterImpl.setIsProcessPayment(paymentOptionMaster.isIsProcessPayment());

		return paymentOptionMasterImpl;
	}

	/**
	 * Returns the payment option master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment option master
	 * @return the payment option master
	 * @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentOptionMasterException, SystemException {
		PaymentOptionMaster paymentOptionMaster = fetchByPrimaryKey(primaryKey);

		if (paymentOptionMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentOptionMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentOptionMaster;
	}

	/**
	 * Returns the payment option master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionMasterException} if it could not be found.
	 *
	 * @param PaymentOptionId the primary key of the payment option master
	 * @return the payment option master
	 * @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster findByPrimaryKey(String PaymentOptionId)
		throws NoSuchPaymentOptionMasterException, SystemException {
		return findByPrimaryKey((Serializable)PaymentOptionId);
	}

	/**
	 * Returns the payment option master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment option master
	 * @return the payment option master, or <code>null</code> if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentOptionMaster paymentOptionMaster = (PaymentOptionMaster)EntityCacheUtil.getResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentOptionMasterImpl.class, primaryKey);

		if (paymentOptionMaster == _nullPaymentOptionMaster) {
			return null;
		}

		if (paymentOptionMaster == null) {
			Session session = null;

			try {
				session = openSession();

				paymentOptionMaster = (PaymentOptionMaster)session.get(PaymentOptionMasterImpl.class,
						primaryKey);

				if (paymentOptionMaster != null) {
					cacheResult(paymentOptionMaster);
				}
				else {
					EntityCacheUtil.putResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentOptionMasterImpl.class, primaryKey,
						_nullPaymentOptionMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentOptionMasterModelImpl.ENTITY_CACHE_ENABLED,
					PaymentOptionMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentOptionMaster;
	}

	/**
	 * Returns the payment option master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PaymentOptionId the primary key of the payment option master
	 * @return the payment option master, or <code>null</code> if a payment option master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionMaster fetchByPrimaryKey(String PaymentOptionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PaymentOptionId);
	}

	/**
	 * Returns all the payment option masters.
	 *
	 * @return the payment option masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment option masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment option masters
	 * @param end the upper bound of the range of payment option masters (not inclusive)
	 * @return the range of payment option masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment option masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment option masters
	 * @param end the upper bound of the range of payment option masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment option masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionMaster> findAll(int start, int end,
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

		List<PaymentOptionMaster> list = (List<PaymentOptionMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTOPTIONMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTOPTIONMASTER;

				if (pagination) {
					sql = sql.concat(PaymentOptionMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentOptionMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentOptionMaster>(list);
				}
				else {
					list = (List<PaymentOptionMaster>)QueryUtil.list(q,
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
	 * Removes all the payment option masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentOptionMaster paymentOptionMaster : findAll()) {
			remove(paymentOptionMaster);
		}
	}

	/**
	 * Returns the number of payment option masters.
	 *
	 * @return the number of payment option masters
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTOPTIONMASTER);

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
	 * Initializes the payment option master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentOptionMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentOptionMaster>> listenersList = new ArrayList<ModelListener<PaymentOptionMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentOptionMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentOptionMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTOPTIONMASTER = "SELECT paymentOptionMaster FROM PaymentOptionMaster paymentOptionMaster";
	private static final String _SQL_COUNT_PAYMENTOPTIONMASTER = "SELECT COUNT(paymentOptionMaster) FROM PaymentOptionMaster paymentOptionMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentOptionMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentOptionMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentOptionMasterPersistenceImpl.class);
	private static PaymentOptionMaster _nullPaymentOptionMaster = new PaymentOptionMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentOptionMaster> toCacheModel() {
				return _nullPaymentOptionMasterCacheModel;
			}
		};

	private static CacheModel<PaymentOptionMaster> _nullPaymentOptionMasterCacheModel =
		new CacheModel<PaymentOptionMaster>() {
			@Override
			public PaymentOptionMaster toEntityModel() {
				return _nullPaymentOptionMaster;
			}
		};
}