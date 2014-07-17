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

import com.ifli.rapid.NoSuchConfirmDetailsException;
import com.ifli.rapid.model.ConfirmDetails;
import com.ifli.rapid.model.impl.ConfirmDetailsImpl;
import com.ifli.rapid.model.impl.ConfirmDetailsModelImpl;

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
 * The persistence implementation for the confirm details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ConfirmDetailsPersistence
 * @see ConfirmDetailsUtil
 * @generated
 */
public class ConfirmDetailsPersistenceImpl extends BasePersistenceImpl<ConfirmDetails>
	implements ConfirmDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConfirmDetailsUtil} to access the confirm details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConfirmDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsModelImpl.FINDER_CACHE_ENABLED,
			ConfirmDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsModelImpl.FINDER_CACHE_ENABLED,
			ConfirmDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ConfirmDetailsPersistenceImpl() {
		setModelClass(ConfirmDetails.class);
	}

	/**
	 * Caches the confirm details in the entity cache if it is enabled.
	 *
	 * @param confirmDetails the confirm details
	 */
	@Override
	public void cacheResult(ConfirmDetails confirmDetails) {
		EntityCacheUtil.putResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsImpl.class, confirmDetails.getPrimaryKey(),
			confirmDetails);

		confirmDetails.resetOriginalValues();
	}

	/**
	 * Caches the confirm detailses in the entity cache if it is enabled.
	 *
	 * @param confirmDetailses the confirm detailses
	 */
	@Override
	public void cacheResult(List<ConfirmDetails> confirmDetailses) {
		for (ConfirmDetails confirmDetails : confirmDetailses) {
			if (EntityCacheUtil.getResult(
						ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ConfirmDetailsImpl.class, confirmDetails.getPrimaryKey()) == null) {
				cacheResult(confirmDetails);
			}
			else {
				confirmDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all confirm detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConfirmDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConfirmDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the confirm details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConfirmDetails confirmDetails) {
		EntityCacheUtil.removeResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsImpl.class, confirmDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConfirmDetails> confirmDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConfirmDetails confirmDetails : confirmDetailses) {
			EntityCacheUtil.removeResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ConfirmDetailsImpl.class, confirmDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new confirm details with the primary key. Does not add the confirm details to the database.
	 *
	 * @param ID the primary key for the new confirm details
	 * @return the new confirm details
	 */
	@Override
	public ConfirmDetails create(int ID) {
		ConfirmDetails confirmDetails = new ConfirmDetailsImpl();

		confirmDetails.setNew(true);
		confirmDetails.setPrimaryKey(ID);

		return confirmDetails;
	}

	/**
	 * Removes the confirm details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the confirm details
	 * @return the confirm details that was removed
	 * @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails remove(int ID)
		throws NoSuchConfirmDetailsException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the confirm details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the confirm details
	 * @return the confirm details that was removed
	 * @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails remove(Serializable primaryKey)
		throws NoSuchConfirmDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConfirmDetails confirmDetails = (ConfirmDetails)session.get(ConfirmDetailsImpl.class,
					primaryKey);

			if (confirmDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConfirmDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(confirmDetails);
		}
		catch (NoSuchConfirmDetailsException nsee) {
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
	protected ConfirmDetails removeImpl(ConfirmDetails confirmDetails)
		throws SystemException {
		confirmDetails = toUnwrappedModel(confirmDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(confirmDetails)) {
				confirmDetails = (ConfirmDetails)session.get(ConfirmDetailsImpl.class,
						confirmDetails.getPrimaryKeyObj());
			}

			if (confirmDetails != null) {
				session.delete(confirmDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (confirmDetails != null) {
			clearCache(confirmDetails);
		}

		return confirmDetails;
	}

	@Override
	public ConfirmDetails updateImpl(
		com.ifli.rapid.model.ConfirmDetails confirmDetails)
		throws SystemException {
		confirmDetails = toUnwrappedModel(confirmDetails);

		boolean isNew = confirmDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (confirmDetails.isNew()) {
				session.save(confirmDetails);

				confirmDetails.setNew(false);
			}
			else {
				session.merge(confirmDetails);
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

		EntityCacheUtil.putResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmDetailsImpl.class, confirmDetails.getPrimaryKey(),
			confirmDetails);

		return confirmDetails;
	}

	protected ConfirmDetails toUnwrappedModel(ConfirmDetails confirmDetails) {
		if (confirmDetails instanceof ConfirmDetailsImpl) {
			return confirmDetails;
		}

		ConfirmDetailsImpl confirmDetailsImpl = new ConfirmDetailsImpl();

		confirmDetailsImpl.setNew(confirmDetails.isNew());
		confirmDetailsImpl.setPrimaryKey(confirmDetails.getPrimaryKey());

		confirmDetailsImpl.setID(confirmDetails.getID());
		confirmDetailsImpl.setQRC_ASR_ID(confirmDetails.getQRC_ASR_ID());
		confirmDetailsImpl.setApproval_Status(confirmDetails.getApproval_Status());
		confirmDetailsImpl.setComments(confirmDetails.getComments());
		confirmDetailsImpl.setSign_Flag(confirmDetails.getSign_Flag());
		confirmDetailsImpl.setCreatedBy(confirmDetails.getCreatedBy());
		confirmDetailsImpl.setCreatedDate(confirmDetails.getCreatedDate());

		return confirmDetailsImpl;
	}

	/**
	 * Returns the confirm details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the confirm details
	 * @return the confirm details
	 * @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConfirmDetailsException, SystemException {
		ConfirmDetails confirmDetails = fetchByPrimaryKey(primaryKey);

		if (confirmDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConfirmDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return confirmDetails;
	}

	/**
	 * Returns the confirm details with the primary key or throws a {@link com.ifli.rapid.NoSuchConfirmDetailsException} if it could not be found.
	 *
	 * @param ID the primary key of the confirm details
	 * @return the confirm details
	 * @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails findByPrimaryKey(int ID)
		throws NoSuchConfirmDetailsException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the confirm details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the confirm details
	 * @return the confirm details, or <code>null</code> if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConfirmDetails confirmDetails = (ConfirmDetails)EntityCacheUtil.getResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ConfirmDetailsImpl.class, primaryKey);

		if (confirmDetails == _nullConfirmDetails) {
			return null;
		}

		if (confirmDetails == null) {
			Session session = null;

			try {
				session = openSession();

				confirmDetails = (ConfirmDetails)session.get(ConfirmDetailsImpl.class,
						primaryKey);

				if (confirmDetails != null) {
					cacheResult(confirmDetails);
				}
				else {
					EntityCacheUtil.putResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ConfirmDetailsImpl.class, primaryKey,
						_nullConfirmDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConfirmDetailsModelImpl.ENTITY_CACHE_ENABLED,
					ConfirmDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return confirmDetails;
	}

	/**
	 * Returns the confirm details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the confirm details
	 * @return the confirm details, or <code>null</code> if a confirm details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmDetails fetchByPrimaryKey(int ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the confirm detailses.
	 *
	 * @return the confirm detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the confirm detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ConfirmDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of confirm detailses
	 * @param end the upper bound of the range of confirm detailses (not inclusive)
	 * @return the range of confirm detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the confirm detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ConfirmDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of confirm detailses
	 * @param end the upper bound of the range of confirm detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of confirm detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmDetails> findAll(int start, int end,
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

		List<ConfirmDetails> list = (List<ConfirmDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONFIRMDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONFIRMDETAILS;

				if (pagination) {
					sql = sql.concat(ConfirmDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConfirmDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConfirmDetails>(list);
				}
				else {
					list = (List<ConfirmDetails>)QueryUtil.list(q,
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
	 * Removes all the confirm detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConfirmDetails confirmDetails : findAll()) {
			remove(confirmDetails);
		}
	}

	/**
	 * Returns the number of confirm detailses.
	 *
	 * @return the number of confirm detailses
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

				Query q = session.createQuery(_SQL_COUNT_CONFIRMDETAILS);

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
	 * Initializes the confirm details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ConfirmDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConfirmDetails>> listenersList = new ArrayList<ModelListener<ConfirmDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConfirmDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ConfirmDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONFIRMDETAILS = "SELECT confirmDetails FROM ConfirmDetails confirmDetails";
	private static final String _SQL_COUNT_CONFIRMDETAILS = "SELECT COUNT(confirmDetails) FROM ConfirmDetails confirmDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "confirmDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConfirmDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConfirmDetailsPersistenceImpl.class);
	private static ConfirmDetails _nullConfirmDetails = new ConfirmDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConfirmDetails> toCacheModel() {
				return _nullConfirmDetailsCacheModel;
			}
		};

	private static CacheModel<ConfirmDetails> _nullConfirmDetailsCacheModel = new CacheModel<ConfirmDetails>() {
			@Override
			public ConfirmDetails toEntityModel() {
				return _nullConfirmDetails;
			}
		};
}