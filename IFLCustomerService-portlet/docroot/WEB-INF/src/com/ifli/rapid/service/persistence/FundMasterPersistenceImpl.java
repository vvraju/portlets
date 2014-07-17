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

import com.ifli.rapid.NoSuchFundMasterException;
import com.ifli.rapid.model.FundMaster;
import com.ifli.rapid.model.impl.FundMasterImpl;
import com.ifli.rapid.model.impl.FundMasterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the fund master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see FundMasterPersistence
 * @see FundMasterUtil
 * @generated
 */
public class FundMasterPersistenceImpl extends BasePersistenceImpl<FundMaster>
	implements FundMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FundMasterUtil} to access the fund master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FundMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterModelImpl.FINDER_CACHE_ENABLED, FundMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterModelImpl.FINDER_CACHE_ENABLED, FundMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_FUND_CODE = new FinderPath(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterModelImpl.FINDER_CACHE_ENABLED, FundMasterImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByFUND_CODE",
			new String[] { String.class.getName() },
			FundMasterModelImpl.FUND_CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FUND_CODE = new FinderPath(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFUND_CODE",
			new String[] { String.class.getName() });

	/**
	 * Returns the fund master where FUND_CODE = &#63; or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	 *
	 * @param FUND_CODE the f u n d_ c o d e
	 * @return the matching fund master
	 * @throws com.ifli.rapid.NoSuchFundMasterException if a matching fund master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster findByFUND_CODE(String FUND_CODE)
		throws NoSuchFundMasterException, SystemException {
		FundMaster fundMaster = fetchByFUND_CODE(FUND_CODE);

		if (fundMaster == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("FUND_CODE=");
			msg.append(FUND_CODE);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFundMasterException(msg.toString());
		}

		return fundMaster;
	}

	/**
	 * Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param FUND_CODE the f u n d_ c o d e
	 * @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster fetchByFUND_CODE(String FUND_CODE)
		throws SystemException {
		return fetchByFUND_CODE(FUND_CODE, true);
	}

	/**
	 * Returns the fund master where FUND_CODE = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param FUND_CODE the f u n d_ c o d e
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching fund master, or <code>null</code> if a matching fund master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster fetchByFUND_CODE(String FUND_CODE,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { FUND_CODE };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FUND_CODE,
					finderArgs, this);
		}

		if (result instanceof FundMaster) {
			FundMaster fundMaster = (FundMaster)result;

			if (!Validator.equals(FUND_CODE, fundMaster.getFUND_CODE())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_FUNDMASTER_WHERE);

			boolean bindFUND_CODE = false;

			if (FUND_CODE == null) {
				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_1);
			}
			else if (FUND_CODE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_3);
			}
			else {
				bindFUND_CODE = true;

				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFUND_CODE) {
					qPos.add(FUND_CODE);
				}

				List<FundMaster> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUND_CODE,
						finderArgs, list);
				}
				else {
					FundMaster fundMaster = list.get(0);

					result = fundMaster;

					cacheResult(fundMaster);

					if ((fundMaster.getFUND_CODE() == null) ||
							!fundMaster.getFUND_CODE().equals(FUND_CODE)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUND_CODE,
							finderArgs, fundMaster);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUND_CODE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FundMaster)result;
		}
	}

	/**
	 * Removes the fund master where FUND_CODE = &#63; from the database.
	 *
	 * @param FUND_CODE the f u n d_ c o d e
	 * @return the fund master that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster removeByFUND_CODE(String FUND_CODE)
		throws NoSuchFundMasterException, SystemException {
		FundMaster fundMaster = findByFUND_CODE(FUND_CODE);

		return remove(fundMaster);
	}

	/**
	 * Returns the number of fund masters where FUND_CODE = &#63;.
	 *
	 * @param FUND_CODE the f u n d_ c o d e
	 * @return the number of matching fund masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFUND_CODE(String FUND_CODE) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FUND_CODE;

		Object[] finderArgs = new Object[] { FUND_CODE };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FUNDMASTER_WHERE);

			boolean bindFUND_CODE = false;

			if (FUND_CODE == null) {
				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_1);
			}
			else if (FUND_CODE.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_3);
			}
			else {
				bindFUND_CODE = true;

				query.append(_FINDER_COLUMN_FUND_CODE_FUND_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFUND_CODE) {
					qPos.add(FUND_CODE);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FUND_CODE_FUND_CODE_1 = "fundMaster.FUND_CODE IS NULL";
	private static final String _FINDER_COLUMN_FUND_CODE_FUND_CODE_2 = "fundMaster.FUND_CODE = ?";
	private static final String _FINDER_COLUMN_FUND_CODE_FUND_CODE_3 = "(fundMaster.FUND_CODE IS NULL OR fundMaster.FUND_CODE = '')";

	public FundMasterPersistenceImpl() {
		setModelClass(FundMaster.class);
	}

	/**
	 * Caches the fund master in the entity cache if it is enabled.
	 *
	 * @param fundMaster the fund master
	 */
	@Override
	public void cacheResult(FundMaster fundMaster) {
		EntityCacheUtil.putResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterImpl.class, fundMaster.getPrimaryKey(), fundMaster);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUND_CODE,
			new Object[] { fundMaster.getFUND_CODE() }, fundMaster);

		fundMaster.resetOriginalValues();
	}

	/**
	 * Caches the fund masters in the entity cache if it is enabled.
	 *
	 * @param fundMasters the fund masters
	 */
	@Override
	public void cacheResult(List<FundMaster> fundMasters) {
		for (FundMaster fundMaster : fundMasters) {
			if (EntityCacheUtil.getResult(
						FundMasterModelImpl.ENTITY_CACHE_ENABLED,
						FundMasterImpl.class, fundMaster.getPrimaryKey()) == null) {
				cacheResult(fundMaster);
			}
			else {
				fundMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fund masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FundMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FundMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fund master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FundMaster fundMaster) {
		EntityCacheUtil.removeResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterImpl.class, fundMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(fundMaster);
	}

	@Override
	public void clearCache(List<FundMaster> fundMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FundMaster fundMaster : fundMasters) {
			EntityCacheUtil.removeResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
				FundMasterImpl.class, fundMaster.getPrimaryKey());

			clearUniqueFindersCache(fundMaster);
		}
	}

	protected void cacheUniqueFindersCache(FundMaster fundMaster) {
		if (fundMaster.isNew()) {
			Object[] args = new Object[] { fundMaster.getFUND_CODE() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUND_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUND_CODE, args,
				fundMaster);
		}
		else {
			FundMasterModelImpl fundMasterModelImpl = (FundMasterModelImpl)fundMaster;

			if ((fundMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FUND_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fundMaster.getFUND_CODE() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUND_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FUND_CODE, args,
					fundMaster);
			}
		}
	}

	protected void clearUniqueFindersCache(FundMaster fundMaster) {
		FundMasterModelImpl fundMasterModelImpl = (FundMasterModelImpl)fundMaster;

		Object[] args = new Object[] { fundMaster.getFUND_CODE() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUND_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUND_CODE, args);

		if ((fundMasterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_FUND_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { fundMasterModelImpl.getOriginalFUND_CODE() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FUND_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FUND_CODE, args);
		}
	}

	/**
	 * Creates a new fund master with the primary key. Does not add the fund master to the database.
	 *
	 * @param FUND_ID the primary key for the new fund master
	 * @return the new fund master
	 */
	@Override
	public FundMaster create(int FUND_ID) {
		FundMaster fundMaster = new FundMasterImpl();

		fundMaster.setNew(true);
		fundMaster.setPrimaryKey(FUND_ID);

		return fundMaster;
	}

	/**
	 * Removes the fund master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FUND_ID the primary key of the fund master
	 * @return the fund master that was removed
	 * @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster remove(int FUND_ID)
		throws NoSuchFundMasterException, SystemException {
		return remove((Serializable)FUND_ID);
	}

	/**
	 * Removes the fund master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fund master
	 * @return the fund master that was removed
	 * @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster remove(Serializable primaryKey)
		throws NoSuchFundMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FundMaster fundMaster = (FundMaster)session.get(FundMasterImpl.class,
					primaryKey);

			if (fundMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFundMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fundMaster);
		}
		catch (NoSuchFundMasterException nsee) {
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
	protected FundMaster removeImpl(FundMaster fundMaster)
		throws SystemException {
		fundMaster = toUnwrappedModel(fundMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fundMaster)) {
				fundMaster = (FundMaster)session.get(FundMasterImpl.class,
						fundMaster.getPrimaryKeyObj());
			}

			if (fundMaster != null) {
				session.delete(fundMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fundMaster != null) {
			clearCache(fundMaster);
		}

		return fundMaster;
	}

	@Override
	public FundMaster updateImpl(com.ifli.rapid.model.FundMaster fundMaster)
		throws SystemException {
		fundMaster = toUnwrappedModel(fundMaster);

		boolean isNew = fundMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (fundMaster.isNew()) {
				session.save(fundMaster);

				fundMaster.setNew(false);
			}
			else {
				session.merge(fundMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FundMasterModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
			FundMasterImpl.class, fundMaster.getPrimaryKey(), fundMaster);

		clearUniqueFindersCache(fundMaster);
		cacheUniqueFindersCache(fundMaster);

		return fundMaster;
	}

	protected FundMaster toUnwrappedModel(FundMaster fundMaster) {
		if (fundMaster instanceof FundMasterImpl) {
			return fundMaster;
		}

		FundMasterImpl fundMasterImpl = new FundMasterImpl();

		fundMasterImpl.setNew(fundMaster.isNew());
		fundMasterImpl.setPrimaryKey(fundMaster.getPrimaryKey());

		fundMasterImpl.setFUND_ID(fundMaster.getFUND_ID());
		fundMasterImpl.setFUND_NAME(fundMaster.getFUND_NAME());
		fundMasterImpl.setFUND_CODE(fundMaster.getFUND_CODE());
		fundMasterImpl.setINSERTED_DATE(fundMaster.getINSERTED_DATE());
		fundMasterImpl.setINSERTED_BY(fundMaster.getINSERTED_BY());
		fundMasterImpl.setUPDATED_DATE(fundMaster.getUPDATED_DATE());
		fundMasterImpl.setUPDATED_BY(fundMaster.getUPDATED_BY());

		return fundMasterImpl;
	}

	/**
	 * Returns the fund master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fund master
	 * @return the fund master
	 * @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFundMasterException, SystemException {
		FundMaster fundMaster = fetchByPrimaryKey(primaryKey);

		if (fundMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFundMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fundMaster;
	}

	/**
	 * Returns the fund master with the primary key or throws a {@link com.ifli.rapid.NoSuchFundMasterException} if it could not be found.
	 *
	 * @param FUND_ID the primary key of the fund master
	 * @return the fund master
	 * @throws com.ifli.rapid.NoSuchFundMasterException if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster findByPrimaryKey(int FUND_ID)
		throws NoSuchFundMasterException, SystemException {
		return findByPrimaryKey((Serializable)FUND_ID);
	}

	/**
	 * Returns the fund master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fund master
	 * @return the fund master, or <code>null</code> if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FundMaster fundMaster = (FundMaster)EntityCacheUtil.getResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
				FundMasterImpl.class, primaryKey);

		if (fundMaster == _nullFundMaster) {
			return null;
		}

		if (fundMaster == null) {
			Session session = null;

			try {
				session = openSession();

				fundMaster = (FundMaster)session.get(FundMasterImpl.class,
						primaryKey);

				if (fundMaster != null) {
					cacheResult(fundMaster);
				}
				else {
					EntityCacheUtil.putResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
						FundMasterImpl.class, primaryKey, _nullFundMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FundMasterModelImpl.ENTITY_CACHE_ENABLED,
					FundMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fundMaster;
	}

	/**
	 * Returns the fund master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FUND_ID the primary key of the fund master
	 * @return the fund master, or <code>null</code> if a fund master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FundMaster fetchByPrimaryKey(int FUND_ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)FUND_ID);
	}

	/**
	 * Returns all the fund masters.
	 *
	 * @return the fund masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FundMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fund masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FundMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fund masters
	 * @param end the upper bound of the range of fund masters (not inclusive)
	 * @return the range of fund masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FundMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fund masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FundMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fund masters
	 * @param end the upper bound of the range of fund masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fund masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FundMaster> findAll(int start, int end,
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

		List<FundMaster> list = (List<FundMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUNDMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUNDMASTER;

				if (pagination) {
					sql = sql.concat(FundMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FundMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FundMaster>(list);
				}
				else {
					list = (List<FundMaster>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the fund masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FundMaster fundMaster : findAll()) {
			remove(fundMaster);
		}
	}

	/**
	 * Returns the number of fund masters.
	 *
	 * @return the number of fund masters
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

				Query q = session.createQuery(_SQL_COUNT_FUNDMASTER);

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
	 * Initializes the fund master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.FundMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FundMaster>> listenersList = new ArrayList<ModelListener<FundMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FundMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FundMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUNDMASTER = "SELECT fundMaster FROM FundMaster fundMaster";
	private static final String _SQL_SELECT_FUNDMASTER_WHERE = "SELECT fundMaster FROM FundMaster fundMaster WHERE ";
	private static final String _SQL_COUNT_FUNDMASTER = "SELECT COUNT(fundMaster) FROM FundMaster fundMaster";
	private static final String _SQL_COUNT_FUNDMASTER_WHERE = "SELECT COUNT(fundMaster) FROM FundMaster fundMaster WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fundMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FundMaster exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FundMaster exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FundMasterPersistenceImpl.class);
	private static FundMaster _nullFundMaster = new FundMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FundMaster> toCacheModel() {
				return _nullFundMasterCacheModel;
			}
		};

	private static CacheModel<FundMaster> _nullFundMasterCacheModel = new CacheModel<FundMaster>() {
			@Override
			public FundMaster toEntityModel() {
				return _nullFundMaster;
			}
		};
}