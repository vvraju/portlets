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

import com.ifli.rapid.NoSuchRenewalDetailsException;
import com.ifli.rapid.model.RenewalDetails;
import com.ifli.rapid.model.impl.RenewalDetailsImpl;
import com.ifli.rapid.model.impl.RenewalDetailsModelImpl;

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
 * The persistence implementation for the renewal details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RenewalDetailsPersistence
 * @see RenewalDetailsUtil
 * @generated
 */
public class RenewalDetailsPersistenceImpl extends BasePersistenceImpl<RenewalDetails>
	implements RenewalDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RenewalDetailsUtil} to access the renewal details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RenewalDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsModelImpl.FINDER_CACHE_ENABLED,
			RenewalDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsModelImpl.FINDER_CACHE_ENABLED,
			RenewalDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RenewalDetailsPersistenceImpl() {
		setModelClass(RenewalDetails.class);
	}

	/**
	 * Caches the renewal details in the entity cache if it is enabled.
	 *
	 * @param renewalDetails the renewal details
	 */
	@Override
	public void cacheResult(RenewalDetails renewalDetails) {
		EntityCacheUtil.putResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsImpl.class, renewalDetails.getPrimaryKey(),
			renewalDetails);

		renewalDetails.resetOriginalValues();
	}

	/**
	 * Caches the renewal detailses in the entity cache if it is enabled.
	 *
	 * @param renewalDetailses the renewal detailses
	 */
	@Override
	public void cacheResult(List<RenewalDetails> renewalDetailses) {
		for (RenewalDetails renewalDetails : renewalDetailses) {
			if (EntityCacheUtil.getResult(
						RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
						RenewalDetailsImpl.class, renewalDetails.getPrimaryKey()) == null) {
				cacheResult(renewalDetails);
			}
			else {
				renewalDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all renewal detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RenewalDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RenewalDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the renewal details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RenewalDetails renewalDetails) {
		EntityCacheUtil.removeResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsImpl.class, renewalDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RenewalDetails> renewalDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RenewalDetails renewalDetails : renewalDetailses) {
			EntityCacheUtil.removeResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
				RenewalDetailsImpl.class, renewalDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new renewal details with the primary key. Does not add the renewal details to the database.
	 *
	 * @param POLICY_ID the primary key for the new renewal details
	 * @return the new renewal details
	 */
	@Override
	public RenewalDetails create(long POLICY_ID) {
		RenewalDetails renewalDetails = new RenewalDetailsImpl();

		renewalDetails.setNew(true);
		renewalDetails.setPrimaryKey(POLICY_ID);

		return renewalDetails;
	}

	/**
	 * Removes the renewal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param POLICY_ID the primary key of the renewal details
	 * @return the renewal details that was removed
	 * @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails remove(long POLICY_ID)
		throws NoSuchRenewalDetailsException, SystemException {
		return remove((Serializable)POLICY_ID);
	}

	/**
	 * Removes the renewal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the renewal details
	 * @return the renewal details that was removed
	 * @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails remove(Serializable primaryKey)
		throws NoSuchRenewalDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RenewalDetails renewalDetails = (RenewalDetails)session.get(RenewalDetailsImpl.class,
					primaryKey);

			if (renewalDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRenewalDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(renewalDetails);
		}
		catch (NoSuchRenewalDetailsException nsee) {
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
	protected RenewalDetails removeImpl(RenewalDetails renewalDetails)
		throws SystemException {
		renewalDetails = toUnwrappedModel(renewalDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(renewalDetails)) {
				renewalDetails = (RenewalDetails)session.get(RenewalDetailsImpl.class,
						renewalDetails.getPrimaryKeyObj());
			}

			if (renewalDetails != null) {
				session.delete(renewalDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (renewalDetails != null) {
			clearCache(renewalDetails);
		}

		return renewalDetails;
	}

	@Override
	public RenewalDetails updateImpl(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws SystemException {
		renewalDetails = toUnwrappedModel(renewalDetails);

		boolean isNew = renewalDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (renewalDetails.isNew()) {
				session.save(renewalDetails);

				renewalDetails.setNew(false);
			}
			else {
				session.merge(renewalDetails);
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

		EntityCacheUtil.putResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RenewalDetailsImpl.class, renewalDetails.getPrimaryKey(),
			renewalDetails);

		return renewalDetails;
	}

	protected RenewalDetails toUnwrappedModel(RenewalDetails renewalDetails) {
		if (renewalDetails instanceof RenewalDetailsImpl) {
			return renewalDetails;
		}

		RenewalDetailsImpl renewalDetailsImpl = new RenewalDetailsImpl();

		renewalDetailsImpl.setNew(renewalDetails.isNew());
		renewalDetailsImpl.setPrimaryKey(renewalDetails.getPrimaryKey());

		renewalDetailsImpl.setPOLICY_ID(renewalDetails.getPOLICY_ID());
		renewalDetailsImpl.setEMAIL_ID(renewalDetails.getEMAIL_ID());
		renewalDetailsImpl.setMOBILE_NUMBER(renewalDetails.getMOBILE_NUMBER());
		renewalDetailsImpl.setPOLICY_STATUS(renewalDetails.getPOLICY_STATUS());
		renewalDetailsImpl.setPRODUCT_NAME(renewalDetails.getPRODUCT_NAME());
		renewalDetailsImpl.setDATE(renewalDetails.getDATE());
		renewalDetailsImpl.setPOLICY_EXPIRY_DATE(renewalDetails.getPOLICY_EXPIRY_DATE());

		return renewalDetailsImpl;
	}

	/**
	 * Returns the renewal details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the renewal details
	 * @return the renewal details
	 * @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRenewalDetailsException, SystemException {
		RenewalDetails renewalDetails = fetchByPrimaryKey(primaryKey);

		if (renewalDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRenewalDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return renewalDetails;
	}

	/**
	 * Returns the renewal details with the primary key or throws a {@link com.ifli.rapid.NoSuchRenewalDetailsException} if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the renewal details
	 * @return the renewal details
	 * @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails findByPrimaryKey(long POLICY_ID)
		throws NoSuchRenewalDetailsException, SystemException {
		return findByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns the renewal details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the renewal details
	 * @return the renewal details, or <code>null</code> if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RenewalDetails renewalDetails = (RenewalDetails)EntityCacheUtil.getResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
				RenewalDetailsImpl.class, primaryKey);

		if (renewalDetails == _nullRenewalDetails) {
			return null;
		}

		if (renewalDetails == null) {
			Session session = null;

			try {
				session = openSession();

				renewalDetails = (RenewalDetails)session.get(RenewalDetailsImpl.class,
						primaryKey);

				if (renewalDetails != null) {
					cacheResult(renewalDetails);
				}
				else {
					EntityCacheUtil.putResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
						RenewalDetailsImpl.class, primaryKey,
						_nullRenewalDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RenewalDetailsModelImpl.ENTITY_CACHE_ENABLED,
					RenewalDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return renewalDetails;
	}

	/**
	 * Returns the renewal details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the renewal details
	 * @return the renewal details, or <code>null</code> if a renewal details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RenewalDetails fetchByPrimaryKey(long POLICY_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns all the renewal detailses.
	 *
	 * @return the renewal detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RenewalDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the renewal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of renewal detailses
	 * @param end the upper bound of the range of renewal detailses (not inclusive)
	 * @return the range of renewal detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RenewalDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the renewal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of renewal detailses
	 * @param end the upper bound of the range of renewal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of renewal detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RenewalDetails> findAll(int start, int end,
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

		List<RenewalDetails> list = (List<RenewalDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RENEWALDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RENEWALDETAILS;

				if (pagination) {
					sql = sql.concat(RenewalDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RenewalDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RenewalDetails>(list);
				}
				else {
					list = (List<RenewalDetails>)QueryUtil.list(q,
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
	 * Removes all the renewal detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RenewalDetails renewalDetails : findAll()) {
			remove(renewalDetails);
		}
	}

	/**
	 * Returns the number of renewal detailses.
	 *
	 * @return the number of renewal detailses
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

				Query q = session.createQuery(_SQL_COUNT_RENEWALDETAILS);

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
	 * Initializes the renewal details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.RenewalDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RenewalDetails>> listenersList = new ArrayList<ModelListener<RenewalDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RenewalDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RenewalDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RENEWALDETAILS = "SELECT renewalDetails FROM RenewalDetails renewalDetails";
	private static final String _SQL_COUNT_RENEWALDETAILS = "SELECT COUNT(renewalDetails) FROM RenewalDetails renewalDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "renewalDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RenewalDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RenewalDetailsPersistenceImpl.class);
	private static RenewalDetails _nullRenewalDetails = new RenewalDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RenewalDetails> toCacheModel() {
				return _nullRenewalDetailsCacheModel;
			}
		};

	private static CacheModel<RenewalDetails> _nullRenewalDetailsCacheModel = new CacheModel<RenewalDetails>() {
			@Override
			public RenewalDetails toEntityModel() {
				return _nullRenewalDetails;
			}
		};
}