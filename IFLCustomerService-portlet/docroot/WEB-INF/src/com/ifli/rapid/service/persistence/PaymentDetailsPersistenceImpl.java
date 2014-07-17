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

import com.ifli.rapid.NoSuchPaymentDetailsException;
import com.ifli.rapid.model.PaymentDetails;
import com.ifli.rapid.model.impl.PaymentDetailsImpl;
import com.ifli.rapid.model.impl.PaymentDetailsModelImpl;

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
 * The persistence implementation for the payment details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentDetailsPersistence
 * @see PaymentDetailsUtil
 * @generated
 */
public class PaymentDetailsPersistenceImpl extends BasePersistenceImpl<PaymentDetails>
	implements PaymentDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentDetailsUtil} to access the payment details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsModelImpl.FINDER_CACHE_ENABLED,
			PaymentDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsModelImpl.FINDER_CACHE_ENABLED,
			PaymentDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentDetailsPersistenceImpl() {
		setModelClass(PaymentDetails.class);
	}

	/**
	 * Caches the payment details in the entity cache if it is enabled.
	 *
	 * @param paymentDetails the payment details
	 */
	@Override
	public void cacheResult(PaymentDetails paymentDetails) {
		EntityCacheUtil.putResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsImpl.class, paymentDetails.getPrimaryKey(),
			paymentDetails);

		paymentDetails.resetOriginalValues();
	}

	/**
	 * Caches the payment detailses in the entity cache if it is enabled.
	 *
	 * @param paymentDetailses the payment detailses
	 */
	@Override
	public void cacheResult(List<PaymentDetails> paymentDetailses) {
		for (PaymentDetails paymentDetails : paymentDetailses) {
			if (EntityCacheUtil.getResult(
						PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PaymentDetailsImpl.class, paymentDetails.getPrimaryKey()) == null) {
				cacheResult(paymentDetails);
			}
			else {
				paymentDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentDetails paymentDetails) {
		EntityCacheUtil.removeResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsImpl.class, paymentDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentDetails> paymentDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentDetails paymentDetails : paymentDetailses) {
			EntityCacheUtil.removeResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PaymentDetailsImpl.class, paymentDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment details with the primary key. Does not add the payment details to the database.
	 *
	 * @param PaymentId the primary key for the new payment details
	 * @return the new payment details
	 */
	@Override
	public PaymentDetails create(int PaymentId) {
		PaymentDetails paymentDetails = new PaymentDetailsImpl();

		paymentDetails.setNew(true);
		paymentDetails.setPrimaryKey(PaymentId);

		return paymentDetails;
	}

	/**
	 * Removes the payment details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PaymentId the primary key of the payment details
	 * @return the payment details that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentDetailsException if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails remove(int PaymentId)
		throws NoSuchPaymentDetailsException, SystemException {
		return remove((Serializable)PaymentId);
	}

	/**
	 * Removes the payment details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment details
	 * @return the payment details that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentDetailsException if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails remove(Serializable primaryKey)
		throws NoSuchPaymentDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentDetails paymentDetails = (PaymentDetails)session.get(PaymentDetailsImpl.class,
					primaryKey);

			if (paymentDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentDetails);
		}
		catch (NoSuchPaymentDetailsException nsee) {
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
	protected PaymentDetails removeImpl(PaymentDetails paymentDetails)
		throws SystemException {
		paymentDetails = toUnwrappedModel(paymentDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentDetails)) {
				paymentDetails = (PaymentDetails)session.get(PaymentDetailsImpl.class,
						paymentDetails.getPrimaryKeyObj());
			}

			if (paymentDetails != null) {
				session.delete(paymentDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentDetails != null) {
			clearCache(paymentDetails);
		}

		return paymentDetails;
	}

	@Override
	public PaymentDetails updateImpl(
		com.ifli.rapid.model.PaymentDetails paymentDetails)
		throws SystemException {
		paymentDetails = toUnwrappedModel(paymentDetails);

		boolean isNew = paymentDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentDetails.isNew()) {
				session.save(paymentDetails);

				paymentDetails.setNew(false);
			}
			else {
				session.merge(paymentDetails);
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

		EntityCacheUtil.putResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PaymentDetailsImpl.class, paymentDetails.getPrimaryKey(),
			paymentDetails);

		return paymentDetails;
	}

	protected PaymentDetails toUnwrappedModel(PaymentDetails paymentDetails) {
		if (paymentDetails instanceof PaymentDetailsImpl) {
			return paymentDetails;
		}

		PaymentDetailsImpl paymentDetailsImpl = new PaymentDetailsImpl();

		paymentDetailsImpl.setNew(paymentDetails.isNew());
		paymentDetailsImpl.setPrimaryKey(paymentDetails.getPrimaryKey());

		paymentDetailsImpl.setPaymentId(paymentDetails.getPaymentId());
		paymentDetailsImpl.setPremiumFrequencyID(paymentDetails.getPremiumFrequencyID());
		paymentDetailsImpl.setTransactionStatusID(paymentDetails.getTransactionStatusID());
		paymentDetailsImpl.setRequestTypeID(paymentDetails.getRequestTypeID());
		paymentDetailsImpl.setPaymentOptionId(paymentDetails.getPaymentOptionId());
		paymentDetailsImpl.setPaymentMethodID(paymentDetails.getPaymentMethodID());
		paymentDetailsImpl.setProductID(paymentDetails.getProductID());
		paymentDetailsImpl.setProposalId(paymentDetails.getProposalId());
		paymentDetailsImpl.setPremiumAmount(paymentDetails.getPremiumAmount());
		paymentDetailsImpl.setBankName(paymentDetails.getBankName());
		paymentDetailsImpl.setCreditCardNo(paymentDetails.getCreditCardNo());
		paymentDetailsImpl.setCardType(paymentDetails.getCardType());
		paymentDetailsImpl.setNameAsCard(paymentDetails.getNameAsCard());
		paymentDetailsImpl.setCVVNo(paymentDetails.getCVVNo());
		paymentDetailsImpl.setCardExpiryDate(paymentDetails.getCardExpiryDate());
		paymentDetailsImpl.setCreatedBy(paymentDetails.getCreatedBy());
		paymentDetailsImpl.setCreatedDate(paymentDetails.getCreatedDate());
		paymentDetailsImpl.setModifiedBy(paymentDetails.getModifiedBy());
		paymentDetailsImpl.setModifiedDate(paymentDetails.getModifiedDate());
		paymentDetailsImpl.setChequePickupRequestId(paymentDetails.getChequePickupRequestId());
		paymentDetailsImpl.setTransactionReferenceNo(paymentDetails.getTransactionReferenceNo());
		paymentDetailsImpl.setBillDeskMerchantId(paymentDetails.getBillDeskMerchantId());
		paymentDetailsImpl.setBobMerchantTxnId(paymentDetails.getBobMerchantTxnId());
		paymentDetailsImpl.setPaymentReceiptNo(paymentDetails.getPaymentReceiptNo());

		return paymentDetailsImpl;
	}

	/**
	 * Returns the payment details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment details
	 * @return the payment details
	 * @throws com.ifli.rapid.NoSuchPaymentDetailsException if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentDetailsException, SystemException {
		PaymentDetails paymentDetails = fetchByPrimaryKey(primaryKey);

		if (paymentDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentDetails;
	}

	/**
	 * Returns the payment details with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentDetailsException} if it could not be found.
	 *
	 * @param PaymentId the primary key of the payment details
	 * @return the payment details
	 * @throws com.ifli.rapid.NoSuchPaymentDetailsException if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails findByPrimaryKey(int PaymentId)
		throws NoSuchPaymentDetailsException, SystemException {
		return findByPrimaryKey((Serializable)PaymentId);
	}

	/**
	 * Returns the payment details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment details
	 * @return the payment details, or <code>null</code> if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentDetails paymentDetails = (PaymentDetails)EntityCacheUtil.getResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PaymentDetailsImpl.class, primaryKey);

		if (paymentDetails == _nullPaymentDetails) {
			return null;
		}

		if (paymentDetails == null) {
			Session session = null;

			try {
				session = openSession();

				paymentDetails = (PaymentDetails)session.get(PaymentDetailsImpl.class,
						primaryKey);

				if (paymentDetails != null) {
					cacheResult(paymentDetails);
				}
				else {
					EntityCacheUtil.putResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PaymentDetailsImpl.class, primaryKey,
						_nullPaymentDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentDetailsModelImpl.ENTITY_CACHE_ENABLED,
					PaymentDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentDetails;
	}

	/**
	 * Returns the payment details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PaymentId the primary key of the payment details
	 * @return the payment details, or <code>null</code> if a payment details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentDetails fetchByPrimaryKey(int PaymentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PaymentId);
	}

	/**
	 * Returns all the payment detailses.
	 *
	 * @return the payment detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment detailses
	 * @param end the upper bound of the range of payment detailses (not inclusive)
	 * @return the range of payment detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment detailses
	 * @param end the upper bound of the range of payment detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentDetails> findAll(int start, int end,
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

		List<PaymentDetails> list = (List<PaymentDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTDETAILS;

				if (pagination) {
					sql = sql.concat(PaymentDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentDetails>(list);
				}
				else {
					list = (List<PaymentDetails>)QueryUtil.list(q,
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
	 * Removes all the payment detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentDetails paymentDetails : findAll()) {
			remove(paymentDetails);
		}
	}

	/**
	 * Returns the number of payment detailses.
	 *
	 * @return the number of payment detailses
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTDETAILS);

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
	 * Initializes the payment details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentDetails>> listenersList = new ArrayList<ModelListener<PaymentDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTDETAILS = "SELECT paymentDetails FROM PaymentDetails paymentDetails";
	private static final String _SQL_COUNT_PAYMENTDETAILS = "SELECT COUNT(paymentDetails) FROM PaymentDetails paymentDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentDetailsPersistenceImpl.class);
	private static PaymentDetails _nullPaymentDetails = new PaymentDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentDetails> toCacheModel() {
				return _nullPaymentDetailsCacheModel;
			}
		};

	private static CacheModel<PaymentDetails> _nullPaymentDetailsCacheModel = new CacheModel<PaymentDetails>() {
			@Override
			public PaymentDetails toEntityModel() {
				return _nullPaymentDetails;
			}
		};
}