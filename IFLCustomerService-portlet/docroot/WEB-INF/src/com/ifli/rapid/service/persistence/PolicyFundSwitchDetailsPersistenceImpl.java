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

import com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException;
import com.ifli.rapid.model.PolicyFundSwitchDetails;
import com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl;
import com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl;

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
 * The persistence implementation for the policy fund switch details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetailsPersistence
 * @see PolicyFundSwitchDetailsUtil
 * @generated
 */
public class PolicyFundSwitchDetailsPersistenceImpl extends BasePersistenceImpl<PolicyFundSwitchDetails>
	implements PolicyFundSwitchDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyFundSwitchDetailsUtil} to access the policy fund switch details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyFundSwitchDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyFundSwitchDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyFundSwitchDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyFundSwitchDetailsPersistenceImpl() {
		setModelClass(PolicyFundSwitchDetails.class);
	}

	/**
	 * Caches the policy fund switch details in the entity cache if it is enabled.
	 *
	 * @param policyFundSwitchDetails the policy fund switch details
	 */
	@Override
	public void cacheResult(PolicyFundSwitchDetails policyFundSwitchDetails) {
		EntityCacheUtil.putResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsImpl.class,
			policyFundSwitchDetails.getPrimaryKey(), policyFundSwitchDetails);

		policyFundSwitchDetails.resetOriginalValues();
	}

	/**
	 * Caches the policy fund switch detailses in the entity cache if it is enabled.
	 *
	 * @param policyFundSwitchDetailses the policy fund switch detailses
	 */
	@Override
	public void cacheResult(
		List<PolicyFundSwitchDetails> policyFundSwitchDetailses) {
		for (PolicyFundSwitchDetails policyFundSwitchDetails : policyFundSwitchDetailses) {
			if (EntityCacheUtil.getResult(
						PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundSwitchDetailsImpl.class,
						policyFundSwitchDetails.getPrimaryKey()) == null) {
				cacheResult(policyFundSwitchDetails);
			}
			else {
				policyFundSwitchDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy fund switch detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyFundSwitchDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyFundSwitchDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy fund switch details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyFundSwitchDetails policyFundSwitchDetails) {
		EntityCacheUtil.removeResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsImpl.class,
			policyFundSwitchDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PolicyFundSwitchDetails> policyFundSwitchDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyFundSwitchDetails policyFundSwitchDetails : policyFundSwitchDetailses) {
			EntityCacheUtil.removeResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundSwitchDetailsImpl.class,
				policyFundSwitchDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy fund switch details with the primary key. Does not add the policy fund switch details to the database.
	 *
	 * @param FUND_SWITCH_ID the primary key for the new policy fund switch details
	 * @return the new policy fund switch details
	 */
	@Override
	public PolicyFundSwitchDetails create(int FUND_SWITCH_ID) {
		PolicyFundSwitchDetails policyFundSwitchDetails = new PolicyFundSwitchDetailsImpl();

		policyFundSwitchDetails.setNew(true);
		policyFundSwitchDetails.setPrimaryKey(FUND_SWITCH_ID);

		return policyFundSwitchDetails;
	}

	/**
	 * Removes the policy fund switch details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FUND_SWITCH_ID the primary key of the policy fund switch details
	 * @return the policy fund switch details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails remove(int FUND_SWITCH_ID)
		throws NoSuchPolicyFundSwitchDetailsException, SystemException {
		return remove((Serializable)FUND_SWITCH_ID);
	}

	/**
	 * Removes the policy fund switch details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy fund switch details
	 * @return the policy fund switch details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails remove(Serializable primaryKey)
		throws NoSuchPolicyFundSwitchDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyFundSwitchDetails policyFundSwitchDetails = (PolicyFundSwitchDetails)session.get(PolicyFundSwitchDetailsImpl.class,
					primaryKey);

			if (policyFundSwitchDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyFundSwitchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyFundSwitchDetails);
		}
		catch (NoSuchPolicyFundSwitchDetailsException nsee) {
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
	protected PolicyFundSwitchDetails removeImpl(
		PolicyFundSwitchDetails policyFundSwitchDetails)
		throws SystemException {
		policyFundSwitchDetails = toUnwrappedModel(policyFundSwitchDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyFundSwitchDetails)) {
				policyFundSwitchDetails = (PolicyFundSwitchDetails)session.get(PolicyFundSwitchDetailsImpl.class,
						policyFundSwitchDetails.getPrimaryKeyObj());
			}

			if (policyFundSwitchDetails != null) {
				session.delete(policyFundSwitchDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyFundSwitchDetails != null) {
			clearCache(policyFundSwitchDetails);
		}

		return policyFundSwitchDetails;
	}

	@Override
	public PolicyFundSwitchDetails updateImpl(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails)
		throws SystemException {
		policyFundSwitchDetails = toUnwrappedModel(policyFundSwitchDetails);

		boolean isNew = policyFundSwitchDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyFundSwitchDetails.isNew()) {
				session.save(policyFundSwitchDetails);

				policyFundSwitchDetails.setNew(false);
			}
			else {
				session.merge(policyFundSwitchDetails);
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

		EntityCacheUtil.putResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchDetailsImpl.class,
			policyFundSwitchDetails.getPrimaryKey(), policyFundSwitchDetails);

		return policyFundSwitchDetails;
	}

	protected PolicyFundSwitchDetails toUnwrappedModel(
		PolicyFundSwitchDetails policyFundSwitchDetails) {
		if (policyFundSwitchDetails instanceof PolicyFundSwitchDetailsImpl) {
			return policyFundSwitchDetails;
		}

		PolicyFundSwitchDetailsImpl policyFundSwitchDetailsImpl = new PolicyFundSwitchDetailsImpl();

		policyFundSwitchDetailsImpl.setNew(policyFundSwitchDetails.isNew());
		policyFundSwitchDetailsImpl.setPrimaryKey(policyFundSwitchDetails.getPrimaryKey());

		policyFundSwitchDetailsImpl.setFUND_SWITCH_ID(policyFundSwitchDetails.getFUND_SWITCH_ID());
		policyFundSwitchDetailsImpl.setPOLICY_ID(policyFundSwitchDetails.getPOLICY_ID());
		policyFundSwitchDetailsImpl.setQRC_ASR_ID(policyFundSwitchDetails.getQRC_ASR_ID());
		policyFundSwitchDetailsImpl.setFUND_FROM(policyFundSwitchDetails.getFUND_FROM());
		policyFundSwitchDetailsImpl.setFUND_TO(policyFundSwitchDetails.getFUND_TO());
		policyFundSwitchDetailsImpl.setPRECENTAGE_OF_UNITS(policyFundSwitchDetails.getPRECENTAGE_OF_UNITS());
		policyFundSwitchDetailsImpl.setINSERTED_DATE(policyFundSwitchDetails.getINSERTED_DATE());
		policyFundSwitchDetailsImpl.setINSERTED_BY(policyFundSwitchDetails.getINSERTED_BY());
		policyFundSwitchDetailsImpl.setUPDATED_DATE(policyFundSwitchDetails.getUPDATED_DATE());
		policyFundSwitchDetailsImpl.setUPDATED_BY(policyFundSwitchDetails.getUPDATED_BY());

		return policyFundSwitchDetailsImpl;
	}

	/**
	 * Returns the policy fund switch details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund switch details
	 * @return the policy fund switch details
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyFundSwitchDetailsException, SystemException {
		PolicyFundSwitchDetails policyFundSwitchDetails = fetchByPrimaryKey(primaryKey);

		if (policyFundSwitchDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyFundSwitchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyFundSwitchDetails;
	}

	/**
	 * Returns the policy fund switch details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException} if it could not be found.
	 *
	 * @param FUND_SWITCH_ID the primary key of the policy fund switch details
	 * @return the policy fund switch details
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails findByPrimaryKey(int FUND_SWITCH_ID)
		throws NoSuchPolicyFundSwitchDetailsException, SystemException {
		return findByPrimaryKey((Serializable)FUND_SWITCH_ID);
	}

	/**
	 * Returns the policy fund switch details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund switch details
	 * @return the policy fund switch details, or <code>null</code> if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyFundSwitchDetails policyFundSwitchDetails = (PolicyFundSwitchDetails)EntityCacheUtil.getResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundSwitchDetailsImpl.class, primaryKey);

		if (policyFundSwitchDetails == _nullPolicyFundSwitchDetails) {
			return null;
		}

		if (policyFundSwitchDetails == null) {
			Session session = null;

			try {
				session = openSession();

				policyFundSwitchDetails = (PolicyFundSwitchDetails)session.get(PolicyFundSwitchDetailsImpl.class,
						primaryKey);

				if (policyFundSwitchDetails != null) {
					cacheResult(policyFundSwitchDetails);
				}
				else {
					EntityCacheUtil.putResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundSwitchDetailsImpl.class, primaryKey,
						_nullPolicyFundSwitchDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyFundSwitchDetailsModelImpl.ENTITY_CACHE_ENABLED,
					PolicyFundSwitchDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyFundSwitchDetails;
	}

	/**
	 * Returns the policy fund switch details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FUND_SWITCH_ID the primary key of the policy fund switch details
	 * @return the policy fund switch details, or <code>null</code> if a policy fund switch details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchDetails fetchByPrimaryKey(int FUND_SWITCH_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)FUND_SWITCH_ID);
	}

	/**
	 * Returns all the policy fund switch detailses.
	 *
	 * @return the policy fund switch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy fund switch detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy fund switch detailses
	 * @param end the upper bound of the range of policy fund switch detailses (not inclusive)
	 * @return the range of policy fund switch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy fund switch detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy fund switch detailses
	 * @param end the upper bound of the range of policy fund switch detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy fund switch detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchDetails> findAll(int start, int end,
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

		List<PolicyFundSwitchDetails> list = (List<PolicyFundSwitchDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYFUNDSWITCHDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYFUNDSWITCHDETAILS;

				if (pagination) {
					sql = sql.concat(PolicyFundSwitchDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyFundSwitchDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyFundSwitchDetails>(list);
				}
				else {
					list = (List<PolicyFundSwitchDetails>)QueryUtil.list(q,
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
	 * Removes all the policy fund switch detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyFundSwitchDetails policyFundSwitchDetails : findAll()) {
			remove(policyFundSwitchDetails);
		}
	}

	/**
	 * Returns the number of policy fund switch detailses.
	 *
	 * @return the number of policy fund switch detailses
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

				Query q = session.createQuery(_SQL_COUNT_POLICYFUNDSWITCHDETAILS);

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
	 * Initializes the policy fund switch details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyFundSwitchDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyFundSwitchDetails>> listenersList = new ArrayList<ModelListener<PolicyFundSwitchDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyFundSwitchDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyFundSwitchDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYFUNDSWITCHDETAILS = "SELECT policyFundSwitchDetails FROM PolicyFundSwitchDetails policyFundSwitchDetails";
	private static final String _SQL_COUNT_POLICYFUNDSWITCHDETAILS = "SELECT COUNT(policyFundSwitchDetails) FROM PolicyFundSwitchDetails policyFundSwitchDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyFundSwitchDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyFundSwitchDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyFundSwitchDetailsPersistenceImpl.class);
	private static PolicyFundSwitchDetails _nullPolicyFundSwitchDetails = new PolicyFundSwitchDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyFundSwitchDetails> toCacheModel() {
				return _nullPolicyFundSwitchDetailsCacheModel;
			}
		};

	private static CacheModel<PolicyFundSwitchDetails> _nullPolicyFundSwitchDetailsCacheModel =
		new CacheModel<PolicyFundSwitchDetails>() {
			@Override
			public PolicyFundSwitchDetails toEntityModel() {
				return _nullPolicyFundSwitchDetails;
			}
		};
}