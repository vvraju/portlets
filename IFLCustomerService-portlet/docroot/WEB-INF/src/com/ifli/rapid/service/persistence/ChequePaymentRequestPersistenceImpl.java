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

import com.ifli.rapid.NoSuchChequePaymentRequestException;
import com.ifli.rapid.model.ChequePaymentRequest;
import com.ifli.rapid.model.impl.ChequePaymentRequestImpl;
import com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl;

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
 * The persistence implementation for the cheque payment request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ChequePaymentRequestPersistence
 * @see ChequePaymentRequestUtil
 * @generated
 */
public class ChequePaymentRequestPersistenceImpl extends BasePersistenceImpl<ChequePaymentRequest>
	implements ChequePaymentRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ChequePaymentRequestUtil} to access the cheque payment request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ChequePaymentRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			ChequePaymentRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestModelImpl.FINDER_CACHE_ENABLED,
			ChequePaymentRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ChequePaymentRequestPersistenceImpl() {
		setModelClass(ChequePaymentRequest.class);
	}

	/**
	 * Caches the cheque payment request in the entity cache if it is enabled.
	 *
	 * @param chequePaymentRequest the cheque payment request
	 */
	@Override
	public void cacheResult(ChequePaymentRequest chequePaymentRequest) {
		EntityCacheUtil.putResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestImpl.class,
			chequePaymentRequest.getPrimaryKey(), chequePaymentRequest);

		chequePaymentRequest.resetOriginalValues();
	}

	/**
	 * Caches the cheque payment requests in the entity cache if it is enabled.
	 *
	 * @param chequePaymentRequests the cheque payment requests
	 */
	@Override
	public void cacheResult(List<ChequePaymentRequest> chequePaymentRequests) {
		for (ChequePaymentRequest chequePaymentRequest : chequePaymentRequests) {
			if (EntityCacheUtil.getResult(
						ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
						ChequePaymentRequestImpl.class,
						chequePaymentRequest.getPrimaryKey()) == null) {
				cacheResult(chequePaymentRequest);
			}
			else {
				chequePaymentRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cheque payment requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ChequePaymentRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ChequePaymentRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cheque payment request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ChequePaymentRequest chequePaymentRequest) {
		EntityCacheUtil.removeResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestImpl.class, chequePaymentRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ChequePaymentRequest> chequePaymentRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ChequePaymentRequest chequePaymentRequest : chequePaymentRequests) {
			EntityCacheUtil.removeResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
				ChequePaymentRequestImpl.class,
				chequePaymentRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cheque payment request with the primary key. Does not add the cheque payment request to the database.
	 *
	 * @param ServiceRequestID the primary key for the new cheque payment request
	 * @return the new cheque payment request
	 */
	@Override
	public ChequePaymentRequest create(String ServiceRequestID) {
		ChequePaymentRequest chequePaymentRequest = new ChequePaymentRequestImpl();

		chequePaymentRequest.setNew(true);
		chequePaymentRequest.setPrimaryKey(ServiceRequestID);

		return chequePaymentRequest;
	}

	/**
	 * Removes the cheque payment request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ServiceRequestID the primary key of the cheque payment request
	 * @return the cheque payment request that was removed
	 * @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest remove(String ServiceRequestID)
		throws NoSuchChequePaymentRequestException, SystemException {
		return remove((Serializable)ServiceRequestID);
	}

	/**
	 * Removes the cheque payment request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cheque payment request
	 * @return the cheque payment request that was removed
	 * @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest remove(Serializable primaryKey)
		throws NoSuchChequePaymentRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ChequePaymentRequest chequePaymentRequest = (ChequePaymentRequest)session.get(ChequePaymentRequestImpl.class,
					primaryKey);

			if (chequePaymentRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchChequePaymentRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(chequePaymentRequest);
		}
		catch (NoSuchChequePaymentRequestException nsee) {
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
	protected ChequePaymentRequest removeImpl(
		ChequePaymentRequest chequePaymentRequest) throws SystemException {
		chequePaymentRequest = toUnwrappedModel(chequePaymentRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(chequePaymentRequest)) {
				chequePaymentRequest = (ChequePaymentRequest)session.get(ChequePaymentRequestImpl.class,
						chequePaymentRequest.getPrimaryKeyObj());
			}

			if (chequePaymentRequest != null) {
				session.delete(chequePaymentRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (chequePaymentRequest != null) {
			clearCache(chequePaymentRequest);
		}

		return chequePaymentRequest;
	}

	@Override
	public ChequePaymentRequest updateImpl(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws SystemException {
		chequePaymentRequest = toUnwrappedModel(chequePaymentRequest);

		boolean isNew = chequePaymentRequest.isNew();

		Session session = null;

		try {
			session = openSession();

			if (chequePaymentRequest.isNew()) {
				session.save(chequePaymentRequest);

				chequePaymentRequest.setNew(false);
			}
			else {
				session.merge(chequePaymentRequest);
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

		EntityCacheUtil.putResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
			ChequePaymentRequestImpl.class,
			chequePaymentRequest.getPrimaryKey(), chequePaymentRequest);

		return chequePaymentRequest;
	}

	protected ChequePaymentRequest toUnwrappedModel(
		ChequePaymentRequest chequePaymentRequest) {
		if (chequePaymentRequest instanceof ChequePaymentRequestImpl) {
			return chequePaymentRequest;
		}

		ChequePaymentRequestImpl chequePaymentRequestImpl = new ChequePaymentRequestImpl();

		chequePaymentRequestImpl.setNew(chequePaymentRequest.isNew());
		chequePaymentRequestImpl.setPrimaryKey(chequePaymentRequest.getPrimaryKey());

		chequePaymentRequestImpl.setServiceRequestID(chequePaymentRequest.getServiceRequestID());
		chequePaymentRequestImpl.setServiceRequestMasterId(chequePaymentRequest.getServiceRequestMasterId());
		chequePaymentRequestImpl.setDescription(chequePaymentRequest.getDescription());
		chequePaymentRequestImpl.setContactId(chequePaymentRequest.getContactId());
		chequePaymentRequestImpl.setStartPreferedTime(chequePaymentRequest.getStartPreferedTime());
		chequePaymentRequestImpl.setEndPreferedTime(chequePaymentRequest.getEndPreferedTime());
		chequePaymentRequestImpl.setPreferedDate(chequePaymentRequest.getPreferedDate());

		return chequePaymentRequestImpl;
	}

	/**
	 * Returns the cheque payment request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cheque payment request
	 * @return the cheque payment request
	 * @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchChequePaymentRequestException, SystemException {
		ChequePaymentRequest chequePaymentRequest = fetchByPrimaryKey(primaryKey);

		if (chequePaymentRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchChequePaymentRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return chequePaymentRequest;
	}

	/**
	 * Returns the cheque payment request with the primary key or throws a {@link com.ifli.rapid.NoSuchChequePaymentRequestException} if it could not be found.
	 *
	 * @param ServiceRequestID the primary key of the cheque payment request
	 * @return the cheque payment request
	 * @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest findByPrimaryKey(String ServiceRequestID)
		throws NoSuchChequePaymentRequestException, SystemException {
		return findByPrimaryKey((Serializable)ServiceRequestID);
	}

	/**
	 * Returns the cheque payment request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cheque payment request
	 * @return the cheque payment request, or <code>null</code> if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ChequePaymentRequest chequePaymentRequest = (ChequePaymentRequest)EntityCacheUtil.getResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
				ChequePaymentRequestImpl.class, primaryKey);

		if (chequePaymentRequest == _nullChequePaymentRequest) {
			return null;
		}

		if (chequePaymentRequest == null) {
			Session session = null;

			try {
				session = openSession();

				chequePaymentRequest = (ChequePaymentRequest)session.get(ChequePaymentRequestImpl.class,
						primaryKey);

				if (chequePaymentRequest != null) {
					cacheResult(chequePaymentRequest);
				}
				else {
					EntityCacheUtil.putResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
						ChequePaymentRequestImpl.class, primaryKey,
						_nullChequePaymentRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ChequePaymentRequestModelImpl.ENTITY_CACHE_ENABLED,
					ChequePaymentRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return chequePaymentRequest;
	}

	/**
	 * Returns the cheque payment request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ServiceRequestID the primary key of the cheque payment request
	 * @return the cheque payment request, or <code>null</code> if a cheque payment request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChequePaymentRequest fetchByPrimaryKey(String ServiceRequestID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ServiceRequestID);
	}

	/**
	 * Returns all the cheque payment requests.
	 *
	 * @return the cheque payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChequePaymentRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cheque payment requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cheque payment requests
	 * @param end the upper bound of the range of cheque payment requests (not inclusive)
	 * @return the range of cheque payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChequePaymentRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cheque payment requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cheque payment requests
	 * @param end the upper bound of the range of cheque payment requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cheque payment requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChequePaymentRequest> findAll(int start, int end,
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

		List<ChequePaymentRequest> list = (List<ChequePaymentRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CHEQUEPAYMENTREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHEQUEPAYMENTREQUEST;

				if (pagination) {
					sql = sql.concat(ChequePaymentRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ChequePaymentRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ChequePaymentRequest>(list);
				}
				else {
					list = (List<ChequePaymentRequest>)QueryUtil.list(q,
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
	 * Removes all the cheque payment requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ChequePaymentRequest chequePaymentRequest : findAll()) {
			remove(chequePaymentRequest);
		}
	}

	/**
	 * Returns the number of cheque payment requests.
	 *
	 * @return the number of cheque payment requests
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

				Query q = session.createQuery(_SQL_COUNT_CHEQUEPAYMENTREQUEST);

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
	 * Initializes the cheque payment request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ChequePaymentRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ChequePaymentRequest>> listenersList = new ArrayList<ModelListener<ChequePaymentRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ChequePaymentRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ChequePaymentRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CHEQUEPAYMENTREQUEST = "SELECT chequePaymentRequest FROM ChequePaymentRequest chequePaymentRequest";
	private static final String _SQL_COUNT_CHEQUEPAYMENTREQUEST = "SELECT COUNT(chequePaymentRequest) FROM ChequePaymentRequest chequePaymentRequest";
	private static final String _ORDER_BY_ENTITY_ALIAS = "chequePaymentRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ChequePaymentRequest exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ChequePaymentRequestPersistenceImpl.class);
	private static ChequePaymentRequest _nullChequePaymentRequest = new ChequePaymentRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ChequePaymentRequest> toCacheModel() {
				return _nullChequePaymentRequestCacheModel;
			}
		};

	private static CacheModel<ChequePaymentRequest> _nullChequePaymentRequestCacheModel =
		new CacheModel<ChequePaymentRequest>() {
			@Override
			public ChequePaymentRequest toEntityModel() {
				return _nullChequePaymentRequest;
			}
		};
}