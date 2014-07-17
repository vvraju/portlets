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

import com.ifli.rapid.NoSuchProofDocsException;
import com.ifli.rapid.model.ProofDocs;
import com.ifli.rapid.model.impl.ProofDocsImpl;
import com.ifli.rapid.model.impl.ProofDocsModelImpl;

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
 * The persistence implementation for the proof docs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ProofDocsPersistence
 * @see ProofDocsUtil
 * @generated
 */
public class ProofDocsPersistenceImpl extends BasePersistenceImpl<ProofDocs>
	implements ProofDocsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProofDocsUtil} to access the proof docs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProofDocsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsModelImpl.FINDER_CACHE_ENABLED, ProofDocsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsModelImpl.FINDER_CACHE_ENABLED, ProofDocsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProofDocsPersistenceImpl() {
		setModelClass(ProofDocs.class);
	}

	/**
	 * Caches the proof docs in the entity cache if it is enabled.
	 *
	 * @param proofDocs the proof docs
	 */
	@Override
	public void cacheResult(ProofDocs proofDocs) {
		EntityCacheUtil.putResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsImpl.class, proofDocs.getPrimaryKey(), proofDocs);

		proofDocs.resetOriginalValues();
	}

	/**
	 * Caches the proof docses in the entity cache if it is enabled.
	 *
	 * @param proofDocses the proof docses
	 */
	@Override
	public void cacheResult(List<ProofDocs> proofDocses) {
		for (ProofDocs proofDocs : proofDocses) {
			if (EntityCacheUtil.getResult(
						ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
						ProofDocsImpl.class, proofDocs.getPrimaryKey()) == null) {
				cacheResult(proofDocs);
			}
			else {
				proofDocs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all proof docses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProofDocsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProofDocsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the proof docs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProofDocs proofDocs) {
		EntityCacheUtil.removeResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsImpl.class, proofDocs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProofDocs> proofDocses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProofDocs proofDocs : proofDocses) {
			EntityCacheUtil.removeResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
				ProofDocsImpl.class, proofDocs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new proof docs with the primary key. Does not add the proof docs to the database.
	 *
	 * @param ID the primary key for the new proof docs
	 * @return the new proof docs
	 */
	@Override
	public ProofDocs create(long ID) {
		ProofDocs proofDocs = new ProofDocsImpl();

		proofDocs.setNew(true);
		proofDocs.setPrimaryKey(ID);

		return proofDocs;
	}

	/**
	 * Removes the proof docs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the proof docs
	 * @return the proof docs that was removed
	 * @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs remove(long ID)
		throws NoSuchProofDocsException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the proof docs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the proof docs
	 * @return the proof docs that was removed
	 * @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs remove(Serializable primaryKey)
		throws NoSuchProofDocsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProofDocs proofDocs = (ProofDocs)session.get(ProofDocsImpl.class,
					primaryKey);

			if (proofDocs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProofDocsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(proofDocs);
		}
		catch (NoSuchProofDocsException nsee) {
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
	protected ProofDocs removeImpl(ProofDocs proofDocs)
		throws SystemException {
		proofDocs = toUnwrappedModel(proofDocs);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(proofDocs)) {
				proofDocs = (ProofDocs)session.get(ProofDocsImpl.class,
						proofDocs.getPrimaryKeyObj());
			}

			if (proofDocs != null) {
				session.delete(proofDocs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (proofDocs != null) {
			clearCache(proofDocs);
		}

		return proofDocs;
	}

	@Override
	public ProofDocs updateImpl(com.ifli.rapid.model.ProofDocs proofDocs)
		throws SystemException {
		proofDocs = toUnwrappedModel(proofDocs);

		boolean isNew = proofDocs.isNew();

		Session session = null;

		try {
			session = openSession();

			if (proofDocs.isNew()) {
				session.save(proofDocs);

				proofDocs.setNew(false);
			}
			else {
				session.merge(proofDocs);
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

		EntityCacheUtil.putResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
			ProofDocsImpl.class, proofDocs.getPrimaryKey(), proofDocs);

		return proofDocs;
	}

	protected ProofDocs toUnwrappedModel(ProofDocs proofDocs) {
		if (proofDocs instanceof ProofDocsImpl) {
			return proofDocs;
		}

		ProofDocsImpl proofDocsImpl = new ProofDocsImpl();

		proofDocsImpl.setNew(proofDocs.isNew());
		proofDocsImpl.setPrimaryKey(proofDocs.getPrimaryKey());

		proofDocsImpl.setID(proofDocs.getID());
		proofDocsImpl.setDOC_TYPE(proofDocs.getDOC_TYPE());
		proofDocsImpl.setDOC_NAME(proofDocs.getDOC_NAME());

		return proofDocsImpl;
	}

	/**
	 * Returns the proof docs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the proof docs
	 * @return the proof docs
	 * @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProofDocsException, SystemException {
		ProofDocs proofDocs = fetchByPrimaryKey(primaryKey);

		if (proofDocs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProofDocsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return proofDocs;
	}

	/**
	 * Returns the proof docs with the primary key or throws a {@link com.ifli.rapid.NoSuchProofDocsException} if it could not be found.
	 *
	 * @param ID the primary key of the proof docs
	 * @return the proof docs
	 * @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs findByPrimaryKey(long ID)
		throws NoSuchProofDocsException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the proof docs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the proof docs
	 * @return the proof docs, or <code>null</code> if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProofDocs proofDocs = (ProofDocs)EntityCacheUtil.getResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
				ProofDocsImpl.class, primaryKey);

		if (proofDocs == _nullProofDocs) {
			return null;
		}

		if (proofDocs == null) {
			Session session = null;

			try {
				session = openSession();

				proofDocs = (ProofDocs)session.get(ProofDocsImpl.class,
						primaryKey);

				if (proofDocs != null) {
					cacheResult(proofDocs);
				}
				else {
					EntityCacheUtil.putResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
						ProofDocsImpl.class, primaryKey, _nullProofDocs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProofDocsModelImpl.ENTITY_CACHE_ENABLED,
					ProofDocsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return proofDocs;
	}

	/**
	 * Returns the proof docs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the proof docs
	 * @return the proof docs, or <code>null</code> if a proof docs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProofDocs fetchByPrimaryKey(long ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the proof docses.
	 *
	 * @return the proof docses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProofDocs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the proof docses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProofDocsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of proof docses
	 * @param end the upper bound of the range of proof docses (not inclusive)
	 * @return the range of proof docses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProofDocs> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the proof docses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProofDocsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of proof docses
	 * @param end the upper bound of the range of proof docses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of proof docses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProofDocs> findAll(int start, int end,
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

		List<ProofDocs> list = (List<ProofDocs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROOFDOCS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROOFDOCS;

				if (pagination) {
					sql = sql.concat(ProofDocsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProofDocs>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProofDocs>(list);
				}
				else {
					list = (List<ProofDocs>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the proof docses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProofDocs proofDocs : findAll()) {
			remove(proofDocs);
		}
	}

	/**
	 * Returns the number of proof docses.
	 *
	 * @return the number of proof docses
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

				Query q = session.createQuery(_SQL_COUNT_PROOFDOCS);

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
	 * Initializes the proof docs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ProofDocs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProofDocs>> listenersList = new ArrayList<ModelListener<ProofDocs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProofDocs>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProofDocsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROOFDOCS = "SELECT proofDocs FROM ProofDocs proofDocs";
	private static final String _SQL_COUNT_PROOFDOCS = "SELECT COUNT(proofDocs) FROM ProofDocs proofDocs";
	private static final String _ORDER_BY_ENTITY_ALIAS = "proofDocs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProofDocs exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProofDocsPersistenceImpl.class);
	private static ProofDocs _nullProofDocs = new ProofDocsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProofDocs> toCacheModel() {
				return _nullProofDocsCacheModel;
			}
		};

	private static CacheModel<ProofDocs> _nullProofDocsCacheModel = new CacheModel<ProofDocs>() {
			@Override
			public ProofDocs toEntityModel() {
				return _nullProofDocs;
			}
		};
}