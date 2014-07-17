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

import com.ifli.rapid.NoSuchPolicyTopupDetailsException;
import com.ifli.rapid.model.PolicyTopupDetails;
import com.ifli.rapid.model.impl.PolicyTopupDetailsImpl;
import com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl;

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
 * The persistence implementation for the policy topup details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyTopupDetailsPersistence
 * @see PolicyTopupDetailsUtil
 * @generated
 */
public class PolicyTopupDetailsPersistenceImpl extends BasePersistenceImpl<PolicyTopupDetails>
	implements PolicyTopupDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyTopupDetailsUtil} to access the policy topup details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyTopupDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyTopupDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyTopupDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyTopupDetailsPersistenceImpl() {
		setModelClass(PolicyTopupDetails.class);
	}

	/**
	 * Caches the policy topup details in the entity cache if it is enabled.
	 *
	 * @param policyTopupDetails the policy topup details
	 */
	@Override
	public void cacheResult(PolicyTopupDetails policyTopupDetails) {
		EntityCacheUtil.putResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsImpl.class, policyTopupDetails.getPrimaryKey(),
			policyTopupDetails);

		policyTopupDetails.resetOriginalValues();
	}

	/**
	 * Caches the policy topup detailses in the entity cache if it is enabled.
	 *
	 * @param policyTopupDetailses the policy topup detailses
	 */
	@Override
	public void cacheResult(List<PolicyTopupDetails> policyTopupDetailses) {
		for (PolicyTopupDetails policyTopupDetails : policyTopupDetailses) {
			if (EntityCacheUtil.getResult(
						PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyTopupDetailsImpl.class,
						policyTopupDetails.getPrimaryKey()) == null) {
				cacheResult(policyTopupDetails);
			}
			else {
				policyTopupDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy topup detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyTopupDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyTopupDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy topup details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyTopupDetails policyTopupDetails) {
		EntityCacheUtil.removeResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsImpl.class, policyTopupDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PolicyTopupDetails> policyTopupDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyTopupDetails policyTopupDetails : policyTopupDetailses) {
			EntityCacheUtil.removeResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyTopupDetailsImpl.class, policyTopupDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy topup details with the primary key. Does not add the policy topup details to the database.
	 *
	 * @param TOPUP_ID the primary key for the new policy topup details
	 * @return the new policy topup details
	 */
	@Override
	public PolicyTopupDetails create(int TOPUP_ID) {
		PolicyTopupDetails policyTopupDetails = new PolicyTopupDetailsImpl();

		policyTopupDetails.setNew(true);
		policyTopupDetails.setPrimaryKey(TOPUP_ID);

		return policyTopupDetails;
	}

	/**
	 * Removes the policy topup details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TOPUP_ID the primary key of the policy topup details
	 * @return the policy topup details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails remove(int TOPUP_ID)
		throws NoSuchPolicyTopupDetailsException, SystemException {
		return remove((Serializable)TOPUP_ID);
	}

	/**
	 * Removes the policy topup details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy topup details
	 * @return the policy topup details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails remove(Serializable primaryKey)
		throws NoSuchPolicyTopupDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyTopupDetails policyTopupDetails = (PolicyTopupDetails)session.get(PolicyTopupDetailsImpl.class,
					primaryKey);

			if (policyTopupDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyTopupDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyTopupDetails);
		}
		catch (NoSuchPolicyTopupDetailsException nsee) {
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
	protected PolicyTopupDetails removeImpl(
		PolicyTopupDetails policyTopupDetails) throws SystemException {
		policyTopupDetails = toUnwrappedModel(policyTopupDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyTopupDetails)) {
				policyTopupDetails = (PolicyTopupDetails)session.get(PolicyTopupDetailsImpl.class,
						policyTopupDetails.getPrimaryKeyObj());
			}

			if (policyTopupDetails != null) {
				session.delete(policyTopupDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyTopupDetails != null) {
			clearCache(policyTopupDetails);
		}

		return policyTopupDetails;
	}

	@Override
	public PolicyTopupDetails updateImpl(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws SystemException {
		policyTopupDetails = toUnwrappedModel(policyTopupDetails);

		boolean isNew = policyTopupDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyTopupDetails.isNew()) {
				session.save(policyTopupDetails);

				policyTopupDetails.setNew(false);
			}
			else {
				session.merge(policyTopupDetails);
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

		EntityCacheUtil.putResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyTopupDetailsImpl.class, policyTopupDetails.getPrimaryKey(),
			policyTopupDetails);

		return policyTopupDetails;
	}

	protected PolicyTopupDetails toUnwrappedModel(
		PolicyTopupDetails policyTopupDetails) {
		if (policyTopupDetails instanceof PolicyTopupDetailsImpl) {
			return policyTopupDetails;
		}

		PolicyTopupDetailsImpl policyTopupDetailsImpl = new PolicyTopupDetailsImpl();

		policyTopupDetailsImpl.setNew(policyTopupDetails.isNew());
		policyTopupDetailsImpl.setPrimaryKey(policyTopupDetails.getPrimaryKey());

		policyTopupDetailsImpl.setTOPUP_ID(policyTopupDetails.getTOPUP_ID());
		policyTopupDetailsImpl.setPOLICY_ID(policyTopupDetails.getPOLICY_ID());
		policyTopupDetailsImpl.setQRC_ASR_ID(policyTopupDetails.getQRC_ASR_ID());
		policyTopupDetailsImpl.setFUND_ID(policyTopupDetails.getFUND_ID());
		policyTopupDetailsImpl.setFUND_VALUE(policyTopupDetails.getFUND_VALUE());
		policyTopupDetailsImpl.setTOPUP_VALUE(policyTopupDetails.getTOPUP_VALUE());
		policyTopupDetailsImpl.setTOT_VALUE(policyTopupDetails.getTOT_VALUE());
		policyTopupDetailsImpl.setTOPUP_PERCENTAGE(policyTopupDetails.getTOPUP_PERCENTAGE());
		policyTopupDetailsImpl.setCreatedBy(policyTopupDetails.getCreatedBy());
		policyTopupDetailsImpl.setCreatedDate(policyTopupDetails.getCreatedDate());
		policyTopupDetailsImpl.setModifiedBy(policyTopupDetails.getModifiedBy());
		policyTopupDetailsImpl.setModifiedDate(policyTopupDetails.getModifiedDate());

		return policyTopupDetailsImpl;
	}

	/**
	 * Returns the policy topup details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy topup details
	 * @return the policy topup details
	 * @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyTopupDetailsException, SystemException {
		PolicyTopupDetails policyTopupDetails = fetchByPrimaryKey(primaryKey);

		if (policyTopupDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyTopupDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyTopupDetails;
	}

	/**
	 * Returns the policy topup details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyTopupDetailsException} if it could not be found.
	 *
	 * @param TOPUP_ID the primary key of the policy topup details
	 * @return the policy topup details
	 * @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails findByPrimaryKey(int TOPUP_ID)
		throws NoSuchPolicyTopupDetailsException, SystemException {
		return findByPrimaryKey((Serializable)TOPUP_ID);
	}

	/**
	 * Returns the policy topup details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy topup details
	 * @return the policy topup details, or <code>null</code> if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyTopupDetails policyTopupDetails = (PolicyTopupDetails)EntityCacheUtil.getResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyTopupDetailsImpl.class, primaryKey);

		if (policyTopupDetails == _nullPolicyTopupDetails) {
			return null;
		}

		if (policyTopupDetails == null) {
			Session session = null;

			try {
				session = openSession();

				policyTopupDetails = (PolicyTopupDetails)session.get(PolicyTopupDetailsImpl.class,
						primaryKey);

				if (policyTopupDetails != null) {
					cacheResult(policyTopupDetails);
				}
				else {
					EntityCacheUtil.putResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyTopupDetailsImpl.class, primaryKey,
						_nullPolicyTopupDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyTopupDetailsModelImpl.ENTITY_CACHE_ENABLED,
					PolicyTopupDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyTopupDetails;
	}

	/**
	 * Returns the policy topup details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TOPUP_ID the primary key of the policy topup details
	 * @return the policy topup details, or <code>null</code> if a policy topup details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyTopupDetails fetchByPrimaryKey(int TOPUP_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)TOPUP_ID);
	}

	/**
	 * Returns all the policy topup detailses.
	 *
	 * @return the policy topup detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyTopupDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy topup detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy topup detailses
	 * @param end the upper bound of the range of policy topup detailses (not inclusive)
	 * @return the range of policy topup detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyTopupDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy topup detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy topup detailses
	 * @param end the upper bound of the range of policy topup detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy topup detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyTopupDetails> findAll(int start, int end,
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

		List<PolicyTopupDetails> list = (List<PolicyTopupDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYTOPUPDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYTOPUPDETAILS;

				if (pagination) {
					sql = sql.concat(PolicyTopupDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyTopupDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyTopupDetails>(list);
				}
				else {
					list = (List<PolicyTopupDetails>)QueryUtil.list(q,
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
	 * Removes all the policy topup detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyTopupDetails policyTopupDetails : findAll()) {
			remove(policyTopupDetails);
		}
	}

	/**
	 * Returns the number of policy topup detailses.
	 *
	 * @return the number of policy topup detailses
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

				Query q = session.createQuery(_SQL_COUNT_POLICYTOPUPDETAILS);

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
	 * Initializes the policy topup details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyTopupDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyTopupDetails>> listenersList = new ArrayList<ModelListener<PolicyTopupDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyTopupDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyTopupDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYTOPUPDETAILS = "SELECT policyTopupDetails FROM PolicyTopupDetails policyTopupDetails";
	private static final String _SQL_COUNT_POLICYTOPUPDETAILS = "SELECT COUNT(policyTopupDetails) FROM PolicyTopupDetails policyTopupDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyTopupDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyTopupDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyTopupDetailsPersistenceImpl.class);
	private static PolicyTopupDetails _nullPolicyTopupDetails = new PolicyTopupDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyTopupDetails> toCacheModel() {
				return _nullPolicyTopupDetailsCacheModel;
			}
		};

	private static CacheModel<PolicyTopupDetails> _nullPolicyTopupDetailsCacheModel =
		new CacheModel<PolicyTopupDetails>() {
			@Override
			public PolicyTopupDetails toEntityModel() {
				return _nullPolicyTopupDetails;
			}
		};
}