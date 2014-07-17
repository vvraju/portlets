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

import com.ifli.rapid.NoSuchPincodeDetailsException;
import com.ifli.rapid.model.PincodeDetails;
import com.ifli.rapid.model.impl.PincodeDetailsImpl;
import com.ifli.rapid.model.impl.PincodeDetailsModelImpl;

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
 * The persistence implementation for the pincode details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PincodeDetailsPersistence
 * @see PincodeDetailsUtil
 * @generated
 */
public class PincodeDetailsPersistenceImpl extends BasePersistenceImpl<PincodeDetails>
	implements PincodeDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PincodeDetailsUtil} to access the pincode details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PincodeDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsModelImpl.FINDER_CACHE_ENABLED,
			PincodeDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsModelImpl.FINDER_CACHE_ENABLED,
			PincodeDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PincodeDetailsPersistenceImpl() {
		setModelClass(PincodeDetails.class);
	}

	/**
	 * Caches the pincode details in the entity cache if it is enabled.
	 *
	 * @param pincodeDetails the pincode details
	 */
	@Override
	public void cacheResult(PincodeDetails pincodeDetails) {
		EntityCacheUtil.putResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsImpl.class, pincodeDetails.getPrimaryKey(),
			pincodeDetails);

		pincodeDetails.resetOriginalValues();
	}

	/**
	 * Caches the pincode detailses in the entity cache if it is enabled.
	 *
	 * @param pincodeDetailses the pincode detailses
	 */
	@Override
	public void cacheResult(List<PincodeDetails> pincodeDetailses) {
		for (PincodeDetails pincodeDetails : pincodeDetailses) {
			if (EntityCacheUtil.getResult(
						PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PincodeDetailsImpl.class, pincodeDetails.getPrimaryKey()) == null) {
				cacheResult(pincodeDetails);
			}
			else {
				pincodeDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pincode detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PincodeDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PincodeDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pincode details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PincodeDetails pincodeDetails) {
		EntityCacheUtil.removeResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsImpl.class, pincodeDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PincodeDetails> pincodeDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PincodeDetails pincodeDetails : pincodeDetailses) {
			EntityCacheUtil.removeResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PincodeDetailsImpl.class, pincodeDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pincode details with the primary key. Does not add the pincode details to the database.
	 *
	 * @param PIN_ID the primary key for the new pincode details
	 * @return the new pincode details
	 */
	@Override
	public PincodeDetails create(int PIN_ID) {
		PincodeDetails pincodeDetails = new PincodeDetailsImpl();

		pincodeDetails.setNew(true);
		pincodeDetails.setPrimaryKey(PIN_ID);

		return pincodeDetails;
	}

	/**
	 * Removes the pincode details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PIN_ID the primary key of the pincode details
	 * @return the pincode details that was removed
	 * @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails remove(int PIN_ID)
		throws NoSuchPincodeDetailsException, SystemException {
		return remove((Serializable)PIN_ID);
	}

	/**
	 * Removes the pincode details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pincode details
	 * @return the pincode details that was removed
	 * @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails remove(Serializable primaryKey)
		throws NoSuchPincodeDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PincodeDetails pincodeDetails = (PincodeDetails)session.get(PincodeDetailsImpl.class,
					primaryKey);

			if (pincodeDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPincodeDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pincodeDetails);
		}
		catch (NoSuchPincodeDetailsException nsee) {
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
	protected PincodeDetails removeImpl(PincodeDetails pincodeDetails)
		throws SystemException {
		pincodeDetails = toUnwrappedModel(pincodeDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pincodeDetails)) {
				pincodeDetails = (PincodeDetails)session.get(PincodeDetailsImpl.class,
						pincodeDetails.getPrimaryKeyObj());
			}

			if (pincodeDetails != null) {
				session.delete(pincodeDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pincodeDetails != null) {
			clearCache(pincodeDetails);
		}

		return pincodeDetails;
	}

	@Override
	public PincodeDetails updateImpl(
		com.ifli.rapid.model.PincodeDetails pincodeDetails)
		throws SystemException {
		pincodeDetails = toUnwrappedModel(pincodeDetails);

		boolean isNew = pincodeDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pincodeDetails.isNew()) {
				session.save(pincodeDetails);

				pincodeDetails.setNew(false);
			}
			else {
				session.merge(pincodeDetails);
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

		EntityCacheUtil.putResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PincodeDetailsImpl.class, pincodeDetails.getPrimaryKey(),
			pincodeDetails);

		return pincodeDetails;
	}

	protected PincodeDetails toUnwrappedModel(PincodeDetails pincodeDetails) {
		if (pincodeDetails instanceof PincodeDetailsImpl) {
			return pincodeDetails;
		}

		PincodeDetailsImpl pincodeDetailsImpl = new PincodeDetailsImpl();

		pincodeDetailsImpl.setNew(pincodeDetails.isNew());
		pincodeDetailsImpl.setPrimaryKey(pincodeDetails.getPrimaryKey());

		pincodeDetailsImpl.setPIN_ID(pincodeDetails.getPIN_ID());
		pincodeDetailsImpl.setCITY_ID(pincodeDetails.getCITY_ID());
		pincodeDetailsImpl.setSTATE_ID(pincodeDetails.getSTATE_ID());
		pincodeDetailsImpl.setPIN_CODE(pincodeDetails.getPIN_CODE());

		return pincodeDetailsImpl;
	}

	/**
	 * Returns the pincode details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pincode details
	 * @return the pincode details
	 * @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPincodeDetailsException, SystemException {
		PincodeDetails pincodeDetails = fetchByPrimaryKey(primaryKey);

		if (pincodeDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPincodeDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pincodeDetails;
	}

	/**
	 * Returns the pincode details with the primary key or throws a {@link com.ifli.rapid.NoSuchPincodeDetailsException} if it could not be found.
	 *
	 * @param PIN_ID the primary key of the pincode details
	 * @return the pincode details
	 * @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails findByPrimaryKey(int PIN_ID)
		throws NoSuchPincodeDetailsException, SystemException {
		return findByPrimaryKey((Serializable)PIN_ID);
	}

	/**
	 * Returns the pincode details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pincode details
	 * @return the pincode details, or <code>null</code> if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PincodeDetails pincodeDetails = (PincodeDetails)EntityCacheUtil.getResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PincodeDetailsImpl.class, primaryKey);

		if (pincodeDetails == _nullPincodeDetails) {
			return null;
		}

		if (pincodeDetails == null) {
			Session session = null;

			try {
				session = openSession();

				pincodeDetails = (PincodeDetails)session.get(PincodeDetailsImpl.class,
						primaryKey);

				if (pincodeDetails != null) {
					cacheResult(pincodeDetails);
				}
				else {
					EntityCacheUtil.putResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PincodeDetailsImpl.class, primaryKey,
						_nullPincodeDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PincodeDetailsModelImpl.ENTITY_CACHE_ENABLED,
					PincodeDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pincodeDetails;
	}

	/**
	 * Returns the pincode details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PIN_ID the primary key of the pincode details
	 * @return the pincode details, or <code>null</code> if a pincode details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PincodeDetails fetchByPrimaryKey(int PIN_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PIN_ID);
	}

	/**
	 * Returns all the pincode detailses.
	 *
	 * @return the pincode detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PincodeDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pincode detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PincodeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pincode detailses
	 * @param end the upper bound of the range of pincode detailses (not inclusive)
	 * @return the range of pincode detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PincodeDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pincode detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PincodeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pincode detailses
	 * @param end the upper bound of the range of pincode detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pincode detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PincodeDetails> findAll(int start, int end,
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

		List<PincodeDetails> list = (List<PincodeDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PINCODEDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PINCODEDETAILS;

				if (pagination) {
					sql = sql.concat(PincodeDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PincodeDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PincodeDetails>(list);
				}
				else {
					list = (List<PincodeDetails>)QueryUtil.list(q,
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
	 * Removes all the pincode detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PincodeDetails pincodeDetails : findAll()) {
			remove(pincodeDetails);
		}
	}

	/**
	 * Returns the number of pincode detailses.
	 *
	 * @return the number of pincode detailses
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

				Query q = session.createQuery(_SQL_COUNT_PINCODEDETAILS);

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
	 * Initializes the pincode details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PincodeDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PincodeDetails>> listenersList = new ArrayList<ModelListener<PincodeDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PincodeDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PincodeDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PINCODEDETAILS = "SELECT pincodeDetails FROM PincodeDetails pincodeDetails";
	private static final String _SQL_COUNT_PINCODEDETAILS = "SELECT COUNT(pincodeDetails) FROM PincodeDetails pincodeDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pincodeDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PincodeDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PincodeDetailsPersistenceImpl.class);
	private static PincodeDetails _nullPincodeDetails = new PincodeDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PincodeDetails> toCacheModel() {
				return _nullPincodeDetailsCacheModel;
			}
		};

	private static CacheModel<PincodeDetails> _nullPincodeDetailsCacheModel = new CacheModel<PincodeDetails>() {
			@Override
			public PincodeDetails toEntityModel() {
				return _nullPincodeDetails;
			}
		};
}