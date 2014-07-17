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

import com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException;
import com.ifli.rapid.model.PaymentTransactionStatusMaster;
import com.ifli.rapid.model.impl.PaymentTransactionStatusMasterImpl;
import com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl;

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
 * The persistence implementation for the payment transaction status master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMasterPersistence
 * @see PaymentTransactionStatusMasterUtil
 * @generated
 */
public class PaymentTransactionStatusMasterPersistenceImpl
	extends BasePersistenceImpl<PaymentTransactionStatusMaster>
	implements PaymentTransactionStatusMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentTransactionStatusMasterUtil} to access the payment transaction status master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentTransactionStatusMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentTransactionStatusMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentTransactionStatusMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public PaymentTransactionStatusMasterPersistenceImpl() {
		setModelClass(PaymentTransactionStatusMaster.class);
	}

	/**
	 * Caches the payment transaction status master in the entity cache if it is enabled.
	 *
	 * @param paymentTransactionStatusMaster the payment transaction status master
	 */
	@Override
	public void cacheResult(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		EntityCacheUtil.putResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterImpl.class,
			paymentTransactionStatusMaster.getPrimaryKey(),
			paymentTransactionStatusMaster);

		paymentTransactionStatusMaster.resetOriginalValues();
	}

	/**
	 * Caches the payment transaction status masters in the entity cache if it is enabled.
	 *
	 * @param paymentTransactionStatusMasters the payment transaction status masters
	 */
	@Override
	public void cacheResult(
		List<PaymentTransactionStatusMaster> paymentTransactionStatusMasters) {
		for (PaymentTransactionStatusMaster paymentTransactionStatusMaster : paymentTransactionStatusMasters) {
			if (EntityCacheUtil.getResult(
						PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentTransactionStatusMasterImpl.class,
						paymentTransactionStatusMaster.getPrimaryKey()) == null) {
				cacheResult(paymentTransactionStatusMaster);
			}
			else {
				paymentTransactionStatusMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment transaction status masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentTransactionStatusMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentTransactionStatusMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment transaction status master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		EntityCacheUtil.removeResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterImpl.class,
			paymentTransactionStatusMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PaymentTransactionStatusMaster> paymentTransactionStatusMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentTransactionStatusMaster paymentTransactionStatusMaster : paymentTransactionStatusMasters) {
			EntityCacheUtil.removeResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentTransactionStatusMasterImpl.class,
				paymentTransactionStatusMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment transaction status master with the primary key. Does not add the payment transaction status master to the database.
	 *
	 * @param TransactionStatusID the primary key for the new payment transaction status master
	 * @return the new payment transaction status master
	 */
	@Override
	public PaymentTransactionStatusMaster create(int TransactionStatusID) {
		PaymentTransactionStatusMaster paymentTransactionStatusMaster = new PaymentTransactionStatusMasterImpl();

		paymentTransactionStatusMaster.setNew(true);
		paymentTransactionStatusMaster.setPrimaryKey(TransactionStatusID);

		return paymentTransactionStatusMaster;
	}

	/**
	 * Removes the payment transaction status master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TransactionStatusID the primary key of the payment transaction status master
	 * @return the payment transaction status master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster remove(int TransactionStatusID)
		throws NoSuchPaymentTransactionStatusMasterException, SystemException {
		return remove((Serializable)TransactionStatusID);
	}

	/**
	 * Removes the payment transaction status master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment transaction status master
	 * @return the payment transaction status master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster remove(Serializable primaryKey)
		throws NoSuchPaymentTransactionStatusMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentTransactionStatusMaster paymentTransactionStatusMaster = (PaymentTransactionStatusMaster)session.get(PaymentTransactionStatusMasterImpl.class,
					primaryKey);

			if (paymentTransactionStatusMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentTransactionStatusMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentTransactionStatusMaster);
		}
		catch (NoSuchPaymentTransactionStatusMasterException nsee) {
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
	protected PaymentTransactionStatusMaster removeImpl(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws SystemException {
		paymentTransactionStatusMaster = toUnwrappedModel(paymentTransactionStatusMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentTransactionStatusMaster)) {
				paymentTransactionStatusMaster = (PaymentTransactionStatusMaster)session.get(PaymentTransactionStatusMasterImpl.class,
						paymentTransactionStatusMaster.getPrimaryKeyObj());
			}

			if (paymentTransactionStatusMaster != null) {
				session.delete(paymentTransactionStatusMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentTransactionStatusMaster != null) {
			clearCache(paymentTransactionStatusMaster);
		}

		return paymentTransactionStatusMaster;
	}

	@Override
	public PaymentTransactionStatusMaster updateImpl(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws SystemException {
		paymentTransactionStatusMaster = toUnwrappedModel(paymentTransactionStatusMaster);

		boolean isNew = paymentTransactionStatusMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentTransactionStatusMaster.isNew()) {
				session.save(paymentTransactionStatusMaster);

				paymentTransactionStatusMaster.setNew(false);
			}
			else {
				session.merge(paymentTransactionStatusMaster);
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

		EntityCacheUtil.putResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentTransactionStatusMasterImpl.class,
			paymentTransactionStatusMaster.getPrimaryKey(),
			paymentTransactionStatusMaster);

		return paymentTransactionStatusMaster;
	}

	protected PaymentTransactionStatusMaster toUnwrappedModel(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		if (paymentTransactionStatusMaster instanceof PaymentTransactionStatusMasterImpl) {
			return paymentTransactionStatusMaster;
		}

		PaymentTransactionStatusMasterImpl paymentTransactionStatusMasterImpl = new PaymentTransactionStatusMasterImpl();

		paymentTransactionStatusMasterImpl.setNew(paymentTransactionStatusMaster.isNew());
		paymentTransactionStatusMasterImpl.setPrimaryKey(paymentTransactionStatusMaster.getPrimaryKey());

		paymentTransactionStatusMasterImpl.setTransactionStatusID(paymentTransactionStatusMaster.getTransactionStatusID());
		paymentTransactionStatusMasterImpl.setStatusCode(paymentTransactionStatusMaster.getStatusCode());
		paymentTransactionStatusMasterImpl.setStatusName(paymentTransactionStatusMaster.getStatusName());
		paymentTransactionStatusMasterImpl.setStatusDesc(paymentTransactionStatusMaster.getStatusDesc());
		paymentTransactionStatusMasterImpl.setIsActive(paymentTransactionStatusMaster.isIsActive());
		paymentTransactionStatusMasterImpl.setCreatedBy(paymentTransactionStatusMaster.getCreatedBy());
		paymentTransactionStatusMasterImpl.setCreatedDate(paymentTransactionStatusMaster.getCreatedDate());
		paymentTransactionStatusMasterImpl.setModifiedBy(paymentTransactionStatusMaster.getModifiedBy());
		paymentTransactionStatusMasterImpl.setModifiedDate(paymentTransactionStatusMaster.getModifiedDate());

		return paymentTransactionStatusMasterImpl;
	}

	/**
	 * Returns the payment transaction status master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment transaction status master
	 * @return the payment transaction status master
	 * @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchPaymentTransactionStatusMasterException, SystemException {
		PaymentTransactionStatusMaster paymentTransactionStatusMaster = fetchByPrimaryKey(primaryKey);

		if (paymentTransactionStatusMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentTransactionStatusMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentTransactionStatusMaster;
	}

	/**
	 * Returns the payment transaction status master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException} if it could not be found.
	 *
	 * @param TransactionStatusID the primary key of the payment transaction status master
	 * @return the payment transaction status master
	 * @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster findByPrimaryKey(
		int TransactionStatusID)
		throws NoSuchPaymentTransactionStatusMasterException, SystemException {
		return findByPrimaryKey((Serializable)TransactionStatusID);
	}

	/**
	 * Returns the payment transaction status master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment transaction status master
	 * @return the payment transaction status master, or <code>null</code> if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		PaymentTransactionStatusMaster paymentTransactionStatusMaster = (PaymentTransactionStatusMaster)EntityCacheUtil.getResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentTransactionStatusMasterImpl.class, primaryKey);

		if (paymentTransactionStatusMaster == _nullPaymentTransactionStatusMaster) {
			return null;
		}

		if (paymentTransactionStatusMaster == null) {
			Session session = null;

			try {
				session = openSession();

				paymentTransactionStatusMaster = (PaymentTransactionStatusMaster)session.get(PaymentTransactionStatusMasterImpl.class,
						primaryKey);

				if (paymentTransactionStatusMaster != null) {
					cacheResult(paymentTransactionStatusMaster);
				}
				else {
					EntityCacheUtil.putResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentTransactionStatusMasterImpl.class, primaryKey,
						_nullPaymentTransactionStatusMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentTransactionStatusMasterModelImpl.ENTITY_CACHE_ENABLED,
					PaymentTransactionStatusMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentTransactionStatusMaster;
	}

	/**
	 * Returns the payment transaction status master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TransactionStatusID the primary key of the payment transaction status master
	 * @return the payment transaction status master, or <code>null</code> if a payment transaction status master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentTransactionStatusMaster fetchByPrimaryKey(
		int TransactionStatusID) throws SystemException {
		return fetchByPrimaryKey((Serializable)TransactionStatusID);
	}

	/**
	 * Returns all the payment transaction status masters.
	 *
	 * @return the payment transaction status masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentTransactionStatusMaster> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment transaction status masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment transaction status masters
	 * @param end the upper bound of the range of payment transaction status masters (not inclusive)
	 * @return the range of payment transaction status masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentTransactionStatusMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment transaction status masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment transaction status masters
	 * @param end the upper bound of the range of payment transaction status masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment transaction status masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentTransactionStatusMaster> findAll(int start, int end,
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

		List<PaymentTransactionStatusMaster> list = (List<PaymentTransactionStatusMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTTRANSACTIONSTATUSMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTTRANSACTIONSTATUSMASTER;

				if (pagination) {
					sql = sql.concat(PaymentTransactionStatusMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentTransactionStatusMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentTransactionStatusMaster>(list);
				}
				else {
					list = (List<PaymentTransactionStatusMaster>)QueryUtil.list(q,
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
	 * Removes all the payment transaction status masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentTransactionStatusMaster paymentTransactionStatusMaster : findAll()) {
			remove(paymentTransactionStatusMaster);
		}
	}

	/**
	 * Returns the number of payment transaction status masters.
	 *
	 * @return the number of payment transaction status masters
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTTRANSACTIONSTATUSMASTER);

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
	 * Initializes the payment transaction status master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentTransactionStatusMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentTransactionStatusMaster>> listenersList =
					new ArrayList<ModelListener<PaymentTransactionStatusMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentTransactionStatusMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentTransactionStatusMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTTRANSACTIONSTATUSMASTER = "SELECT paymentTransactionStatusMaster FROM PaymentTransactionStatusMaster paymentTransactionStatusMaster";
	private static final String _SQL_COUNT_PAYMENTTRANSACTIONSTATUSMASTER = "SELECT COUNT(paymentTransactionStatusMaster) FROM PaymentTransactionStatusMaster paymentTransactionStatusMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentTransactionStatusMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentTransactionStatusMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentTransactionStatusMasterPersistenceImpl.class);
	private static PaymentTransactionStatusMaster _nullPaymentTransactionStatusMaster =
		new PaymentTransactionStatusMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentTransactionStatusMaster> toCacheModel() {
				return _nullPaymentTransactionStatusMasterCacheModel;
			}
		};

	private static CacheModel<PaymentTransactionStatusMaster> _nullPaymentTransactionStatusMasterCacheModel =
		new CacheModel<PaymentTransactionStatusMaster>() {
			@Override
			public PaymentTransactionStatusMaster toEntityModel() {
				return _nullPaymentTransactionStatusMaster;
			}
		};
}