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

import com.ifli.rapid.NoSuchBranchDetailsException;
import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.impl.BranchDetailsImpl;
import com.ifli.rapid.model.impl.BranchDetailsModelImpl;

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
 * The persistence implementation for the branch details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see BranchDetailsPersistence
 * @see BranchDetailsUtil
 * @generated
 */
public class BranchDetailsPersistenceImpl extends BasePersistenceImpl<BranchDetails>
	implements BranchDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BranchDetailsUtil} to access the branch details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BranchDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsModelImpl.FINDER_CACHE_ENABLED,
			BranchDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsModelImpl.FINDER_CACHE_ENABLED,
			BranchDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BranchDetailsPersistenceImpl() {
		setModelClass(BranchDetails.class);
	}

	/**
	 * Caches the branch details in the entity cache if it is enabled.
	 *
	 * @param branchDetails the branch details
	 */
	@Override
	public void cacheResult(BranchDetails branchDetails) {
		EntityCacheUtil.putResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsImpl.class, branchDetails.getPrimaryKey(),
			branchDetails);

		branchDetails.resetOriginalValues();
	}

	/**
	 * Caches the branch detailses in the entity cache if it is enabled.
	 *
	 * @param branchDetailses the branch detailses
	 */
	@Override
	public void cacheResult(List<BranchDetails> branchDetailses) {
		for (BranchDetails branchDetails : branchDetailses) {
			if (EntityCacheUtil.getResult(
						BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
						BranchDetailsImpl.class, branchDetails.getPrimaryKey()) == null) {
				cacheResult(branchDetails);
			}
			else {
				branchDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all branch detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BranchDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BranchDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the branch details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BranchDetails branchDetails) {
		EntityCacheUtil.removeResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsImpl.class, branchDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BranchDetails> branchDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BranchDetails branchDetails : branchDetailses) {
			EntityCacheUtil.removeResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
				BranchDetailsImpl.class, branchDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new branch details with the primary key. Does not add the branch details to the database.
	 *
	 * @param BRANCH_ID the primary key for the new branch details
	 * @return the new branch details
	 */
	@Override
	public BranchDetails create(int BRANCH_ID) {
		BranchDetails branchDetails = new BranchDetailsImpl();

		branchDetails.setNew(true);
		branchDetails.setPrimaryKey(BRANCH_ID);

		return branchDetails;
	}

	/**
	 * Removes the branch details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param BRANCH_ID the primary key of the branch details
	 * @return the branch details that was removed
	 * @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails remove(int BRANCH_ID)
		throws NoSuchBranchDetailsException, SystemException {
		return remove((Serializable)BRANCH_ID);
	}

	/**
	 * Removes the branch details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the branch details
	 * @return the branch details that was removed
	 * @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails remove(Serializable primaryKey)
		throws NoSuchBranchDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BranchDetails branchDetails = (BranchDetails)session.get(BranchDetailsImpl.class,
					primaryKey);

			if (branchDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBranchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(branchDetails);
		}
		catch (NoSuchBranchDetailsException nsee) {
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
	protected BranchDetails removeImpl(BranchDetails branchDetails)
		throws SystemException {
		branchDetails = toUnwrappedModel(branchDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(branchDetails)) {
				branchDetails = (BranchDetails)session.get(BranchDetailsImpl.class,
						branchDetails.getPrimaryKeyObj());
			}

			if (branchDetails != null) {
				session.delete(branchDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (branchDetails != null) {
			clearCache(branchDetails);
		}

		return branchDetails;
	}

	@Override
	public BranchDetails updateImpl(
		com.ifli.rapid.model.BranchDetails branchDetails)
		throws SystemException {
		branchDetails = toUnwrappedModel(branchDetails);

		boolean isNew = branchDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (branchDetails.isNew()) {
				session.save(branchDetails);

				branchDetails.setNew(false);
			}
			else {
				session.merge(branchDetails);
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

		EntityCacheUtil.putResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			BranchDetailsImpl.class, branchDetails.getPrimaryKey(),
			branchDetails);

		return branchDetails;
	}

	protected BranchDetails toUnwrappedModel(BranchDetails branchDetails) {
		if (branchDetails instanceof BranchDetailsImpl) {
			return branchDetails;
		}

		BranchDetailsImpl branchDetailsImpl = new BranchDetailsImpl();

		branchDetailsImpl.setNew(branchDetails.isNew());
		branchDetailsImpl.setPrimaryKey(branchDetails.getPrimaryKey());

		branchDetailsImpl.setBRANCH_ID(branchDetails.getBRANCH_ID());
		branchDetailsImpl.setLOCATION_ID(branchDetails.getLOCATION_ID());
		branchDetailsImpl.setBRANCH_NAME(branchDetails.getBRANCH_NAME());
		branchDetailsImpl.setBRANCH_OPENING_TIME(branchDetails.getBRANCH_OPENING_TIME());
		branchDetailsImpl.setBRANCH_CLOSING_TIME(branchDetails.getBRANCH_CLOSING_TIME());
		branchDetailsImpl.setADDRESS_FIRST_LINE(branchDetails.getADDRESS_FIRST_LINE());
		branchDetailsImpl.setADDRESS_SECOND_LINE(branchDetails.getADDRESS_SECOND_LINE());
		branchDetailsImpl.setCITY(branchDetails.getCITY());
		branchDetailsImpl.setSTATE(branchDetails.getSTATE());
		branchDetailsImpl.setPIN(branchDetails.getPIN());
		branchDetailsImpl.setPRIMARY_CONTACT_NO(branchDetails.getPRIMARY_CONTACT_NO());
		branchDetailsImpl.setOTHER_CONTACT_NO(branchDetails.getOTHER_CONTACT_NO());
		branchDetailsImpl.setFAX_NUMBER(branchDetails.getFAX_NUMBER());
		branchDetailsImpl.setBRANCH_CODE(branchDetails.getBRANCH_CODE());
		branchDetailsImpl.setWORK_TIMINGS(branchDetails.getWORK_TIMINGS());

		return branchDetailsImpl;
	}

	/**
	 * Returns the branch details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch details
	 * @return the branch details
	 * @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBranchDetailsException, SystemException {
		BranchDetails branchDetails = fetchByPrimaryKey(primaryKey);

		if (branchDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBranchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return branchDetails;
	}

	/**
	 * Returns the branch details with the primary key or throws a {@link com.ifli.rapid.NoSuchBranchDetailsException} if it could not be found.
	 *
	 * @param BRANCH_ID the primary key of the branch details
	 * @return the branch details
	 * @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails findByPrimaryKey(int BRANCH_ID)
		throws NoSuchBranchDetailsException, SystemException {
		return findByPrimaryKey((Serializable)BRANCH_ID);
	}

	/**
	 * Returns the branch details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch details
	 * @return the branch details, or <code>null</code> if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BranchDetails branchDetails = (BranchDetails)EntityCacheUtil.getResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
				BranchDetailsImpl.class, primaryKey);

		if (branchDetails == _nullBranchDetails) {
			return null;
		}

		if (branchDetails == null) {
			Session session = null;

			try {
				session = openSession();

				branchDetails = (BranchDetails)session.get(BranchDetailsImpl.class,
						primaryKey);

				if (branchDetails != null) {
					cacheResult(branchDetails);
				}
				else {
					EntityCacheUtil.putResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
						BranchDetailsImpl.class, primaryKey, _nullBranchDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BranchDetailsModelImpl.ENTITY_CACHE_ENABLED,
					BranchDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return branchDetails;
	}

	/**
	 * Returns the branch details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param BRANCH_ID the primary key of the branch details
	 * @return the branch details, or <code>null</code> if a branch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BranchDetails fetchByPrimaryKey(int BRANCH_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)BRANCH_ID);
	}

	/**
	 * Returns all the branch detailses.
	 *
	 * @return the branch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BranchDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the branch detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.BranchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branch detailses
	 * @param end the upper bound of the range of branch detailses (not inclusive)
	 * @return the range of branch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BranchDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the branch detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.BranchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branch detailses
	 * @param end the upper bound of the range of branch detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of branch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BranchDetails> findAll(int start, int end,
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

		List<BranchDetails> list = (List<BranchDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BRANCHDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BRANCHDETAILS;

				if (pagination) {
					sql = sql.concat(BranchDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BranchDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BranchDetails>(list);
				}
				else {
					list = (List<BranchDetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the branch detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BranchDetails branchDetails : findAll()) {
			remove(branchDetails);
		}
	}

	/**
	 * Returns the number of branch detailses.
	 *
	 * @return the number of branch detailses
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

				Query q = session.createQuery(_SQL_COUNT_BRANCHDETAILS);

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
	 * Initializes the branch details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.BranchDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BranchDetails>> listenersList = new ArrayList<ModelListener<BranchDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BranchDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BranchDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BRANCHDETAILS = "SELECT branchDetails FROM BranchDetails branchDetails";
	private static final String _SQL_COUNT_BRANCHDETAILS = "SELECT COUNT(branchDetails) FROM BranchDetails branchDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "branchDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BranchDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BranchDetailsPersistenceImpl.class);
	private static BranchDetails _nullBranchDetails = new BranchDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BranchDetails> toCacheModel() {
				return _nullBranchDetailsCacheModel;
			}
		};

	private static CacheModel<BranchDetails> _nullBranchDetailsCacheModel = new CacheModel<BranchDetails>() {
			@Override
			public BranchDetails toEntityModel() {
				return _nullBranchDetails;
			}
		};
}