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

import com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException;
import com.ifli.rapid.model.PolicyPremRedirectionDetails;
import com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl;
import com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl;

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
 * The persistence implementation for the policy prem redirection details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetailsPersistence
 * @see PolicyPremRedirectionDetailsUtil
 * @generated
 */
public class PolicyPremRedirectionDetailsPersistenceImpl
	extends BasePersistenceImpl<PolicyPremRedirectionDetails>
	implements PolicyPremRedirectionDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyPremRedirectionDetailsUtil} to access the policy prem redirection details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyPremRedirectionDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyPremRedirectionDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsModelImpl.FINDER_CACHE_ENABLED,
			PolicyPremRedirectionDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public PolicyPremRedirectionDetailsPersistenceImpl() {
		setModelClass(PolicyPremRedirectionDetails.class);
	}

	/**
	 * Caches the policy prem redirection details in the entity cache if it is enabled.
	 *
	 * @param policyPremRedirectionDetails the policy prem redirection details
	 */
	@Override
	public void cacheResult(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		EntityCacheUtil.putResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsImpl.class,
			policyPremRedirectionDetails.getPrimaryKey(),
			policyPremRedirectionDetails);

		policyPremRedirectionDetails.resetOriginalValues();
	}

	/**
	 * Caches the policy prem redirection detailses in the entity cache if it is enabled.
	 *
	 * @param policyPremRedirectionDetailses the policy prem redirection detailses
	 */
	@Override
	public void cacheResult(
		List<PolicyPremRedirectionDetails> policyPremRedirectionDetailses) {
		for (PolicyPremRedirectionDetails policyPremRedirectionDetails : policyPremRedirectionDetailses) {
			if (EntityCacheUtil.getResult(
						PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyPremRedirectionDetailsImpl.class,
						policyPremRedirectionDetails.getPrimaryKey()) == null) {
				cacheResult(policyPremRedirectionDetails);
			}
			else {
				policyPremRedirectionDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy prem redirection detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyPremRedirectionDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyPremRedirectionDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy prem redirection details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		EntityCacheUtil.removeResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsImpl.class,
			policyPremRedirectionDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PolicyPremRedirectionDetails> policyPremRedirectionDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyPremRedirectionDetails policyPremRedirectionDetails : policyPremRedirectionDetailses) {
			EntityCacheUtil.removeResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyPremRedirectionDetailsImpl.class,
				policyPremRedirectionDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy prem redirection details with the primary key. Does not add the policy prem redirection details to the database.
	 *
	 * @param PREM_REDIRECTION_ID the primary key for the new policy prem redirection details
	 * @return the new policy prem redirection details
	 */
	@Override
	public PolicyPremRedirectionDetails create(int PREM_REDIRECTION_ID) {
		PolicyPremRedirectionDetails policyPremRedirectionDetails = new PolicyPremRedirectionDetailsImpl();

		policyPremRedirectionDetails.setNew(true);
		policyPremRedirectionDetails.setPrimaryKey(PREM_REDIRECTION_ID);

		return policyPremRedirectionDetails;
	}

	/**
	 * Removes the policy prem redirection details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PREM_REDIRECTION_ID the primary key of the policy prem redirection details
	 * @return the policy prem redirection details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails remove(int PREM_REDIRECTION_ID)
		throws NoSuchPolicyPremRedirectionDetailsException, SystemException {
		return remove((Serializable)PREM_REDIRECTION_ID);
	}

	/**
	 * Removes the policy prem redirection details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy prem redirection details
	 * @return the policy prem redirection details that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails remove(Serializable primaryKey)
		throws NoSuchPolicyPremRedirectionDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyPremRedirectionDetails policyPremRedirectionDetails = (PolicyPremRedirectionDetails)session.get(PolicyPremRedirectionDetailsImpl.class,
					primaryKey);

			if (policyPremRedirectionDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyPremRedirectionDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyPremRedirectionDetails);
		}
		catch (NoSuchPolicyPremRedirectionDetailsException nsee) {
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
	protected PolicyPremRedirectionDetails removeImpl(
		PolicyPremRedirectionDetails policyPremRedirectionDetails)
		throws SystemException {
		policyPremRedirectionDetails = toUnwrappedModel(policyPremRedirectionDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyPremRedirectionDetails)) {
				policyPremRedirectionDetails = (PolicyPremRedirectionDetails)session.get(PolicyPremRedirectionDetailsImpl.class,
						policyPremRedirectionDetails.getPrimaryKeyObj());
			}

			if (policyPremRedirectionDetails != null) {
				session.delete(policyPremRedirectionDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyPremRedirectionDetails != null) {
			clearCache(policyPremRedirectionDetails);
		}

		return policyPremRedirectionDetails;
	}

	@Override
	public PolicyPremRedirectionDetails updateImpl(
		com.ifli.rapid.model.PolicyPremRedirectionDetails policyPremRedirectionDetails)
		throws SystemException {
		policyPremRedirectionDetails = toUnwrappedModel(policyPremRedirectionDetails);

		boolean isNew = policyPremRedirectionDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyPremRedirectionDetails.isNew()) {
				session.save(policyPremRedirectionDetails);

				policyPremRedirectionDetails.setNew(false);
			}
			else {
				session.merge(policyPremRedirectionDetails);
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

		EntityCacheUtil.putResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremRedirectionDetailsImpl.class,
			policyPremRedirectionDetails.getPrimaryKey(),
			policyPremRedirectionDetails);

		return policyPremRedirectionDetails;
	}

	protected PolicyPremRedirectionDetails toUnwrappedModel(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		if (policyPremRedirectionDetails instanceof PolicyPremRedirectionDetailsImpl) {
			return policyPremRedirectionDetails;
		}

		PolicyPremRedirectionDetailsImpl policyPremRedirectionDetailsImpl = new PolicyPremRedirectionDetailsImpl();

		policyPremRedirectionDetailsImpl.setNew(policyPremRedirectionDetails.isNew());
		policyPremRedirectionDetailsImpl.setPrimaryKey(policyPremRedirectionDetails.getPrimaryKey());

		policyPremRedirectionDetailsImpl.setPREM_REDIRECTION_ID(policyPremRedirectionDetails.getPREM_REDIRECTION_ID());
		policyPremRedirectionDetailsImpl.setPOLICY_ID(policyPremRedirectionDetails.getPOLICY_ID());
		policyPremRedirectionDetailsImpl.setTRANSACTION_AUDIT_ID(policyPremRedirectionDetails.getTRANSACTION_AUDIT_ID());
		policyPremRedirectionDetailsImpl.setFUND_CODE(policyPremRedirectionDetails.getFUND_CODE());
		policyPremRedirectionDetailsImpl.setALLOCATION_PERCENTAGE(policyPremRedirectionDetails.getALLOCATION_PERCENTAGE());
		policyPremRedirectionDetailsImpl.setSENT_TO_ODS_FLAG(policyPremRedirectionDetails.getSENT_TO_ODS_FLAG());
		policyPremRedirectionDetailsImpl.setINSERTED_DATE(policyPremRedirectionDetails.getINSERTED_DATE());
		policyPremRedirectionDetailsImpl.setINSERTED_BY(policyPremRedirectionDetails.getINSERTED_BY());
		policyPremRedirectionDetailsImpl.setUPDATED_DATE(policyPremRedirectionDetails.getUPDATED_DATE());
		policyPremRedirectionDetailsImpl.setUPDATED_BY(policyPremRedirectionDetails.getUPDATED_BY());

		return policyPremRedirectionDetailsImpl;
	}

	/**
	 * Returns the policy prem redirection details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy prem redirection details
	 * @return the policy prem redirection details
	 * @throws com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchPolicyPremRedirectionDetailsException, SystemException {
		PolicyPremRedirectionDetails policyPremRedirectionDetails = fetchByPrimaryKey(primaryKey);

		if (policyPremRedirectionDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyPremRedirectionDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyPremRedirectionDetails;
	}

	/**
	 * Returns the policy prem redirection details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException} if it could not be found.
	 *
	 * @param PREM_REDIRECTION_ID the primary key of the policy prem redirection details
	 * @return the policy prem redirection details
	 * @throws com.ifli.rapid.NoSuchPolicyPremRedirectionDetailsException if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails findByPrimaryKey(
		int PREM_REDIRECTION_ID)
		throws NoSuchPolicyPremRedirectionDetailsException, SystemException {
		return findByPrimaryKey((Serializable)PREM_REDIRECTION_ID);
	}

	/**
	 * Returns the policy prem redirection details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy prem redirection details
	 * @return the policy prem redirection details, or <code>null</code> if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		PolicyPremRedirectionDetails policyPremRedirectionDetails = (PolicyPremRedirectionDetails)EntityCacheUtil.getResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
				PolicyPremRedirectionDetailsImpl.class, primaryKey);

		if (policyPremRedirectionDetails == _nullPolicyPremRedirectionDetails) {
			return null;
		}

		if (policyPremRedirectionDetails == null) {
			Session session = null;

			try {
				session = openSession();

				policyPremRedirectionDetails = (PolicyPremRedirectionDetails)session.get(PolicyPremRedirectionDetailsImpl.class,
						primaryKey);

				if (policyPremRedirectionDetails != null) {
					cacheResult(policyPremRedirectionDetails);
				}
				else {
					EntityCacheUtil.putResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
						PolicyPremRedirectionDetailsImpl.class, primaryKey,
						_nullPolicyPremRedirectionDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyPremRedirectionDetailsModelImpl.ENTITY_CACHE_ENABLED,
					PolicyPremRedirectionDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyPremRedirectionDetails;
	}

	/**
	 * Returns the policy prem redirection details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PREM_REDIRECTION_ID the primary key of the policy prem redirection details
	 * @return the policy prem redirection details, or <code>null</code> if a policy prem redirection details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremRedirectionDetails fetchByPrimaryKey(
		int PREM_REDIRECTION_ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)PREM_REDIRECTION_ID);
	}

	/**
	 * Returns all the policy prem redirection detailses.
	 *
	 * @return the policy prem redirection detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremRedirectionDetails> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy prem redirection detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy prem redirection detailses
	 * @param end the upper bound of the range of policy prem redirection detailses (not inclusive)
	 * @return the range of policy prem redirection detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremRedirectionDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy prem redirection detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy prem redirection detailses
	 * @param end the upper bound of the range of policy prem redirection detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy prem redirection detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremRedirectionDetails> findAll(int start, int end,
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

		List<PolicyPremRedirectionDetails> list = (List<PolicyPremRedirectionDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYPREMREDIRECTIONDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYPREMREDIRECTIONDETAILS;

				if (pagination) {
					sql = sql.concat(PolicyPremRedirectionDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyPremRedirectionDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyPremRedirectionDetails>(list);
				}
				else {
					list = (List<PolicyPremRedirectionDetails>)QueryUtil.list(q,
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
	 * Removes all the policy prem redirection detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyPremRedirectionDetails policyPremRedirectionDetails : findAll()) {
			remove(policyPremRedirectionDetails);
		}
	}

	/**
	 * Returns the number of policy prem redirection detailses.
	 *
	 * @return the number of policy prem redirection detailses
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

				Query q = session.createQuery(_SQL_COUNT_POLICYPREMREDIRECTIONDETAILS);

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
	 * Initializes the policy prem redirection details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyPremRedirectionDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyPremRedirectionDetails>> listenersList = new ArrayList<ModelListener<PolicyPremRedirectionDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyPremRedirectionDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyPremRedirectionDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYPREMREDIRECTIONDETAILS = "SELECT policyPremRedirectionDetails FROM PolicyPremRedirectionDetails policyPremRedirectionDetails";
	private static final String _SQL_COUNT_POLICYPREMREDIRECTIONDETAILS = "SELECT COUNT(policyPremRedirectionDetails) FROM PolicyPremRedirectionDetails policyPremRedirectionDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyPremRedirectionDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyPremRedirectionDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyPremRedirectionDetailsPersistenceImpl.class);
	private static PolicyPremRedirectionDetails _nullPolicyPremRedirectionDetails =
		new PolicyPremRedirectionDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyPremRedirectionDetails> toCacheModel() {
				return _nullPolicyPremRedirectionDetailsCacheModel;
			}
		};

	private static CacheModel<PolicyPremRedirectionDetails> _nullPolicyPremRedirectionDetailsCacheModel =
		new CacheModel<PolicyPremRedirectionDetails>() {
			@Override
			public PolicyPremRedirectionDetails toEntityModel() {
				return _nullPolicyPremRedirectionDetails;
			}
		};
}