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

import com.ifli.rapid.NoSuchPolicyInfoException;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.impl.PolicyInfoImpl;
import com.ifli.rapid.model.impl.PolicyInfoModelImpl;

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
 * The persistence implementation for the policy info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyInfoPersistence
 * @see PolicyInfoUtil
 * @generated
 */
public class PolicyInfoPersistenceImpl extends BasePersistenceImpl<PolicyInfo>
	implements PolicyInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyInfoUtil} to access the policy info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoModelImpl.FINDER_CACHE_ENABLED, PolicyInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoModelImpl.FINDER_CACHE_ENABLED, PolicyInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyInfoPersistenceImpl() {
		setModelClass(PolicyInfo.class);
	}

	/**
	 * Caches the policy info in the entity cache if it is enabled.
	 *
	 * @param policyInfo the policy info
	 */
	@Override
	public void cacheResult(PolicyInfo policyInfo) {
		EntityCacheUtil.putResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoImpl.class, policyInfo.getPrimaryKey(), policyInfo);

		policyInfo.resetOriginalValues();
	}

	/**
	 * Caches the policy infos in the entity cache if it is enabled.
	 *
	 * @param policyInfos the policy infos
	 */
	@Override
	public void cacheResult(List<PolicyInfo> policyInfos) {
		for (PolicyInfo policyInfo : policyInfos) {
			if (EntityCacheUtil.getResult(
						PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
						PolicyInfoImpl.class, policyInfo.getPrimaryKey()) == null) {
				cacheResult(policyInfo);
			}
			else {
				policyInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyInfo policyInfo) {
		EntityCacheUtil.removeResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoImpl.class, policyInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PolicyInfo> policyInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyInfo policyInfo : policyInfos) {
			EntityCacheUtil.removeResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
				PolicyInfoImpl.class, policyInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy info with the primary key. Does not add the policy info to the database.
	 *
	 * @param POLICY_ID the primary key for the new policy info
	 * @return the new policy info
	 */
	@Override
	public PolicyInfo create(String POLICY_ID) {
		PolicyInfo policyInfo = new PolicyInfoImpl();

		policyInfo.setNew(true);
		policyInfo.setPrimaryKey(POLICY_ID);

		return policyInfo;
	}

	/**
	 * Removes the policy info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param POLICY_ID the primary key of the policy info
	 * @return the policy info that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo remove(String POLICY_ID)
		throws NoSuchPolicyInfoException, SystemException {
		return remove((Serializable)POLICY_ID);
	}

	/**
	 * Removes the policy info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy info
	 * @return the policy info that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo remove(Serializable primaryKey)
		throws NoSuchPolicyInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyInfo policyInfo = (PolicyInfo)session.get(PolicyInfoImpl.class,
					primaryKey);

			if (policyInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyInfo);
		}
		catch (NoSuchPolicyInfoException nsee) {
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
	protected PolicyInfo removeImpl(PolicyInfo policyInfo)
		throws SystemException {
		policyInfo = toUnwrappedModel(policyInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyInfo)) {
				policyInfo = (PolicyInfo)session.get(PolicyInfoImpl.class,
						policyInfo.getPrimaryKeyObj());
			}

			if (policyInfo != null) {
				session.delete(policyInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyInfo != null) {
			clearCache(policyInfo);
		}

		return policyInfo;
	}

	@Override
	public PolicyInfo updateImpl(com.ifli.rapid.model.PolicyInfo policyInfo)
		throws SystemException {
		policyInfo = toUnwrappedModel(policyInfo);

		boolean isNew = policyInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyInfo.isNew()) {
				session.save(policyInfo);

				policyInfo.setNew(false);
			}
			else {
				session.merge(policyInfo);
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

		EntityCacheUtil.putResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
			PolicyInfoImpl.class, policyInfo.getPrimaryKey(), policyInfo);

		return policyInfo;
	}

	protected PolicyInfo toUnwrappedModel(PolicyInfo policyInfo) {
		if (policyInfo instanceof PolicyInfoImpl) {
			return policyInfo;
		}

		PolicyInfoImpl policyInfoImpl = new PolicyInfoImpl();

		policyInfoImpl.setNew(policyInfo.isNew());
		policyInfoImpl.setPrimaryKey(policyInfo.getPrimaryKey());

		policyInfoImpl.setPOLICY_ID(policyInfo.getPOLICY_ID());
		policyInfoImpl.setCUSTOMER_ID(policyInfo.getCUSTOMER_ID());
		policyInfoImpl.setPRODUCT_ID(policyInfo.getPRODUCT_ID());
		policyInfoImpl.setPOLICY_DATE(policyInfo.getPOLICY_DATE());
		policyInfoImpl.setNEXT_PREMIUM_DUEDATE(policyInfo.getNEXT_PREMIUM_DUEDATE());
		policyInfoImpl.setPOLICY_HOLDER1_FIRST_NAME(policyInfo.getPOLICY_HOLDER1_FIRST_NAME());
		policyInfoImpl.setPOLICY_HOLDER1_MIDDLE_NAME(policyInfo.getPOLICY_HOLDER1_MIDDLE_NAME());
		policyInfoImpl.setPOLICY_HOLDER1_LAST_NAME(policyInfo.getPOLICY_HOLDER1_LAST_NAME());
		policyInfoImpl.setSUM_ASSURED(policyInfo.getSUM_ASSURED());
		policyInfoImpl.setPOLICY_HOLDER2_FIRST_NAME(policyInfo.getPOLICY_HOLDER2_FIRST_NAME());
		policyInfoImpl.setPOLICY_HOLDER2_MIDDLE_NAME(policyInfo.getPOLICY_HOLDER2_MIDDLE_NAME());
		policyInfoImpl.setPOLICY_HOLDER2_LAST_NAME(policyInfo.getPOLICY_HOLDER2_LAST_NAME());
		policyInfoImpl.setCHILD_FIRST_NAME(policyInfo.getCHILD_FIRST_NAME());
		policyInfoImpl.setCHILD_DOB(policyInfo.getCHILD_DOB());
		policyInfoImpl.setCHILD_LAST_NAME(policyInfo.getCHILD_LAST_NAME());
		policyInfoImpl.setCURRENT_STATUS(policyInfo.getCURRENT_STATUS());
		policyInfoImpl.setPREMIUM_AMOUNT(policyInfo.getPREMIUM_AMOUNT());
		policyInfoImpl.setFREQUENCY(policyInfo.getFREQUENCY());
		policyInfoImpl.setBRANCH_CODE(policyInfo.getBRANCH_CODE());
		policyInfoImpl.setLG_CODE(policyInfo.getLG_CODE());
		policyInfoImpl.setAPPLICATION_NUMBER(policyInfo.getAPPLICATION_NUMBER());
		policyInfoImpl.setAPPLICATION_DATE(policyInfo.getAPPLICATION_DATE());
		policyInfoImpl.setPOLICY_HOLDER1_TITLE(policyInfo.getPOLICY_HOLDER1_TITLE());
		policyInfoImpl.setCRO_NAME(policyInfo.getCRO_NAME());
		policyInfoImpl.setCRO_NUMBER(policyInfo.getCRO_NUMBER());
		policyInfoImpl.setBRANCH_NAME(policyInfo.getBRANCH_NAME());
		policyInfoImpl.setPRODUCT_NAME(policyInfo.getPRODUCT_NAME());
		policyInfoImpl.setREQUIREMENT_FLAG(policyInfo.getREQUIREMENT_FLAG());
		policyInfoImpl.setTERM(policyInfo.getTERM());
		policyInfoImpl.setMATURITY_DATE(policyInfo.getMATURITY_DATE());
		policyInfoImpl.setAMOUNT_DEPOSITED(policyInfo.getAMOUNT_DEPOSITED());
		policyInfoImpl.setTOTAL_DUE_AMT(policyInfo.getTOTAL_DUE_AMT());
		policyInfoImpl.setCHANNEL_TYPE(policyInfo.getCHANNEL_TYPE());
		policyInfoImpl.setLIFE_ASSURED_NAME(policyInfo.getLIFE_ASSURED_NAME());
		policyInfoImpl.setLIFE_ASSURED_DOB(policyInfo.getLIFE_ASSURED_DOB());
		policyInfoImpl.setPOLICY_HOLDER1_EMAIL(policyInfo.getPOLICY_HOLDER1_EMAIL());
		policyInfoImpl.setPOLICY_HOLDER1_ADD1(policyInfo.getPOLICY_HOLDER1_ADD1());
		policyInfoImpl.setPOLICY_HOLDER1_ADD2(policyInfo.getPOLICY_HOLDER1_ADD2());
		policyInfoImpl.setPOLICY_HOLDER1_CONTACT1(policyInfo.getPOLICY_HOLDER1_CONTACT1());
		policyInfoImpl.setPOLICY_HOLDER1_CONTACT2(policyInfo.getPOLICY_HOLDER1_CONTACT2());
		policyInfoImpl.setPOLICY_HOLDER1_DOB(policyInfo.getPOLICY_HOLDER1_DOB());
		policyInfoImpl.setRISK_COMMENCEMENT_DATE(policyInfo.getRISK_COMMENCEMENT_DATE());

		return policyInfoImpl;
	}

	/**
	 * Returns the policy info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy info
	 * @return the policy info
	 * @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyInfoException, SystemException {
		PolicyInfo policyInfo = fetchByPrimaryKey(primaryKey);

		if (policyInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyInfo;
	}

	/**
	 * Returns the policy info with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyInfoException} if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the policy info
	 * @return the policy info
	 * @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo findByPrimaryKey(String POLICY_ID)
		throws NoSuchPolicyInfoException, SystemException {
		return findByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns the policy info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy info
	 * @return the policy info, or <code>null</code> if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyInfo policyInfo = (PolicyInfo)EntityCacheUtil.getResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
				PolicyInfoImpl.class, primaryKey);

		if (policyInfo == _nullPolicyInfo) {
			return null;
		}

		if (policyInfo == null) {
			Session session = null;

			try {
				session = openSession();

				policyInfo = (PolicyInfo)session.get(PolicyInfoImpl.class,
						primaryKey);

				if (policyInfo != null) {
					cacheResult(policyInfo);
				}
				else {
					EntityCacheUtil.putResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
						PolicyInfoImpl.class, primaryKey, _nullPolicyInfo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyInfoModelImpl.ENTITY_CACHE_ENABLED,
					PolicyInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyInfo;
	}

	/**
	 * Returns the policy info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the policy info
	 * @return the policy info, or <code>null</code> if a policy info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyInfo fetchByPrimaryKey(String POLICY_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns all the policy infos.
	 *
	 * @return the policy infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy infos
	 * @param end the upper bound of the range of policy infos (not inclusive)
	 * @return the range of policy infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy infos
	 * @param end the upper bound of the range of policy infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyInfo> findAll(int start, int end,
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

		List<PolicyInfo> list = (List<PolicyInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYINFO;

				if (pagination) {
					sql = sql.concat(PolicyInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyInfo>(list);
				}
				else {
					list = (List<PolicyInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the policy infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyInfo policyInfo : findAll()) {
			remove(policyInfo);
		}
	}

	/**
	 * Returns the number of policy infos.
	 *
	 * @return the number of policy infos
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

				Query q = session.createQuery(_SQL_COUNT_POLICYINFO);

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
	 * Initializes the policy info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyInfo>> listenersList = new ArrayList<ModelListener<PolicyInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyInfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyInfoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYINFO = "SELECT policyInfo FROM PolicyInfo policyInfo";
	private static final String _SQL_COUNT_POLICYINFO = "SELECT COUNT(policyInfo) FROM PolicyInfo policyInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyInfo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyInfoPersistenceImpl.class);
	private static PolicyInfo _nullPolicyInfo = new PolicyInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyInfo> toCacheModel() {
				return _nullPolicyInfoCacheModel;
			}
		};

	private static CacheModel<PolicyInfo> _nullPolicyInfoCacheModel = new CacheModel<PolicyInfo>() {
			@Override
			public PolicyInfo toEntityModel() {
				return _nullPolicyInfo;
			}
		};
}