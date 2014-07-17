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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException;
import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;
import com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormImpl;
import com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl;

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
 * The persistence implementation for the apply trn application form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationFormPersistence
 * @see ApplyTrnApplicationFormUtil
 * @generated
 */
public class ApplyTrnApplicationFormPersistenceImpl extends BasePersistenceImpl<ApplyTrnApplicationForm>
	implements ApplyTrnApplicationFormPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplyTrnApplicationFormUtil} to access the apply trn application form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplyTrnApplicationFormImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_QUOTEID = new FinderPath(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByQuoteId", new String[] { String.class.getName() },
			ApplyTrnApplicationFormModelImpl.QUOTEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUOTEID = new FinderPath(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuoteId",
			new String[] { String.class.getName() });

	/**
	 * Returns the apply trn application form where QuoteId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException} if it could not be found.
	 *
	 * @param QuoteId the quote ID
	 * @return the matching apply trn application form
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a matching apply trn application form could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm findByQuoteId(String QuoteId)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		ApplyTrnApplicationForm applyTrnApplicationForm = fetchByQuoteId(QuoteId);

		if (applyTrnApplicationForm == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("QuoteId=");
			msg.append(QuoteId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchApplyTrnApplicationFormException(msg.toString());
		}

		return applyTrnApplicationForm;
	}

	/**
	 * Returns the apply trn application form where QuoteId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param QuoteId the quote ID
	 * @return the matching apply trn application form, or <code>null</code> if a matching apply trn application form could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm fetchByQuoteId(String QuoteId)
		throws SystemException {
		return fetchByQuoteId(QuoteId, true);
	}

	/**
	 * Returns the apply trn application form where QuoteId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param QuoteId the quote ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching apply trn application form, or <code>null</code> if a matching apply trn application form could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm fetchByQuoteId(String QuoteId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { QuoteId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_QUOTEID,
					finderArgs, this);
		}

		if (result instanceof ApplyTrnApplicationForm) {
			ApplyTrnApplicationForm applyTrnApplicationForm = (ApplyTrnApplicationForm)result;

			if (!Validator.equals(QuoteId, applyTrnApplicationForm.getQuoteId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_APPLYTRNAPPLICATIONFORM_WHERE);

			boolean bindQuoteId = false;

			if (QuoteId == null) {
				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_1);
			}
			else if (QuoteId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_3);
			}
			else {
				bindQuoteId = true;

				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindQuoteId) {
					qPos.add(QuoteId);
				}

				List<ApplyTrnApplicationForm> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUOTEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ApplyTrnApplicationFormPersistenceImpl.fetchByQuoteId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ApplyTrnApplicationForm applyTrnApplicationForm = list.get(0);

					result = applyTrnApplicationForm;

					cacheResult(applyTrnApplicationForm);

					if ((applyTrnApplicationForm.getQuoteId() == null) ||
							!applyTrnApplicationForm.getQuoteId().equals(QuoteId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUOTEID,
							finderArgs, applyTrnApplicationForm);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUOTEID,
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
			return (ApplyTrnApplicationForm)result;
		}
	}

	/**
	 * Removes the apply trn application form where QuoteId = &#63; from the database.
	 *
	 * @param QuoteId the quote ID
	 * @return the apply trn application form that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm removeByQuoteId(String QuoteId)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		ApplyTrnApplicationForm applyTrnApplicationForm = findByQuoteId(QuoteId);

		return remove(applyTrnApplicationForm);
	}

	/**
	 * Returns the number of apply trn application forms where QuoteId = &#63;.
	 *
	 * @param QuoteId the quote ID
	 * @return the number of matching apply trn application forms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuoteId(String QuoteId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUOTEID;

		Object[] finderArgs = new Object[] { QuoteId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLYTRNAPPLICATIONFORM_WHERE);

			boolean bindQuoteId = false;

			if (QuoteId == null) {
				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_1);
			}
			else if (QuoteId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_3);
			}
			else {
				bindQuoteId = true;

				query.append(_FINDER_COLUMN_QUOTEID_QUOTEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindQuoteId) {
					qPos.add(QuoteId);
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

	private static final String _FINDER_COLUMN_QUOTEID_QUOTEID_1 = "applyTrnApplicationForm.QuoteId IS NULL";
	private static final String _FINDER_COLUMN_QUOTEID_QUOTEID_2 = "applyTrnApplicationForm.QuoteId = ?";
	private static final String _FINDER_COLUMN_QUOTEID_QUOTEID_3 = "(applyTrnApplicationForm.QuoteId IS NULL OR applyTrnApplicationForm.QuoteId = '')";

	public ApplyTrnApplicationFormPersistenceImpl() {
		setModelClass(ApplyTrnApplicationForm.class);
	}

	/**
	 * Caches the apply trn application form in the entity cache if it is enabled.
	 *
	 * @param applyTrnApplicationForm the apply trn application form
	 */
	@Override
	public void cacheResult(ApplyTrnApplicationForm applyTrnApplicationForm) {
		EntityCacheUtil.putResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class,
			applyTrnApplicationForm.getPrimaryKey(), applyTrnApplicationForm);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUOTEID,
			new Object[] { applyTrnApplicationForm.getQuoteId() },
			applyTrnApplicationForm);

		applyTrnApplicationForm.resetOriginalValues();
	}

	/**
	 * Caches the apply trn application forms in the entity cache if it is enabled.
	 *
	 * @param applyTrnApplicationForms the apply trn application forms
	 */
	@Override
	public void cacheResult(
		List<ApplyTrnApplicationForm> applyTrnApplicationForms) {
		for (ApplyTrnApplicationForm applyTrnApplicationForm : applyTrnApplicationForms) {
			if (EntityCacheUtil.getResult(
						ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
						ApplyTrnApplicationFormImpl.class,
						applyTrnApplicationForm.getPrimaryKey()) == null) {
				cacheResult(applyTrnApplicationForm);
			}
			else {
				applyTrnApplicationForm.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all apply trn application forms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApplyTrnApplicationFormImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApplyTrnApplicationFormImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the apply trn application form.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApplyTrnApplicationForm applyTrnApplicationForm) {
		EntityCacheUtil.removeResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class,
			applyTrnApplicationForm.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(applyTrnApplicationForm);
	}

	@Override
	public void clearCache(
		List<ApplyTrnApplicationForm> applyTrnApplicationForms) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApplyTrnApplicationForm applyTrnApplicationForm : applyTrnApplicationForms) {
			EntityCacheUtil.removeResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
				ApplyTrnApplicationFormImpl.class,
				applyTrnApplicationForm.getPrimaryKey());

			clearUniqueFindersCache(applyTrnApplicationForm);
		}
	}

	protected void cacheUniqueFindersCache(
		ApplyTrnApplicationForm applyTrnApplicationForm) {
		if (applyTrnApplicationForm.isNew()) {
			Object[] args = new Object[] { applyTrnApplicationForm.getQuoteId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_QUOTEID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUOTEID, args,
				applyTrnApplicationForm);
		}
		else {
			ApplyTrnApplicationFormModelImpl applyTrnApplicationFormModelImpl = (ApplyTrnApplicationFormModelImpl)applyTrnApplicationForm;

			if ((applyTrnApplicationFormModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_QUOTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applyTrnApplicationForm.getQuoteId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_QUOTEID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUOTEID, args,
					applyTrnApplicationForm);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ApplyTrnApplicationForm applyTrnApplicationForm) {
		ApplyTrnApplicationFormModelImpl applyTrnApplicationFormModelImpl = (ApplyTrnApplicationFormModelImpl)applyTrnApplicationForm;

		Object[] args = new Object[] { applyTrnApplicationForm.getQuoteId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUOTEID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUOTEID, args);

		if ((applyTrnApplicationFormModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_QUOTEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					applyTrnApplicationFormModelImpl.getOriginalQuoteId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUOTEID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUOTEID, args);
		}
	}

	/**
	 * Creates a new apply trn application form with the primary key. Does not add the apply trn application form to the database.
	 *
	 * @param ApplicationFormId the primary key for the new apply trn application form
	 * @return the new apply trn application form
	 */
	@Override
	public ApplyTrnApplicationForm create(String ApplicationFormId) {
		ApplyTrnApplicationForm applyTrnApplicationForm = new ApplyTrnApplicationFormImpl();

		applyTrnApplicationForm.setNew(true);
		applyTrnApplicationForm.setPrimaryKey(ApplicationFormId);

		return applyTrnApplicationForm;
	}

	/**
	 * Removes the apply trn application form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ApplicationFormId the primary key of the apply trn application form
	 * @return the apply trn application form that was removed
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm remove(String ApplicationFormId)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		return remove((Serializable)ApplicationFormId);
	}

	/**
	 * Removes the apply trn application form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the apply trn application form
	 * @return the apply trn application form that was removed
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm remove(Serializable primaryKey)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ApplyTrnApplicationForm applyTrnApplicationForm = (ApplyTrnApplicationForm)session.get(ApplyTrnApplicationFormImpl.class,
					primaryKey);

			if (applyTrnApplicationForm == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplyTrnApplicationFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(applyTrnApplicationForm);
		}
		catch (NoSuchApplyTrnApplicationFormException nsee) {
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
	protected ApplyTrnApplicationForm removeImpl(
		ApplyTrnApplicationForm applyTrnApplicationForm)
		throws SystemException {
		applyTrnApplicationForm = toUnwrappedModel(applyTrnApplicationForm);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(applyTrnApplicationForm)) {
				applyTrnApplicationForm = (ApplyTrnApplicationForm)session.get(ApplyTrnApplicationFormImpl.class,
						applyTrnApplicationForm.getPrimaryKeyObj());
			}

			if (applyTrnApplicationForm != null) {
				session.delete(applyTrnApplicationForm);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (applyTrnApplicationForm != null) {
			clearCache(applyTrnApplicationForm);
		}

		return applyTrnApplicationForm;
	}

	@Override
	public ApplyTrnApplicationForm updateImpl(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm)
		throws SystemException {
		applyTrnApplicationForm = toUnwrappedModel(applyTrnApplicationForm);

		boolean isNew = applyTrnApplicationForm.isNew();

		Session session = null;

		try {
			session = openSession();

			if (applyTrnApplicationForm.isNew()) {
				session.save(applyTrnApplicationForm);

				applyTrnApplicationForm.setNew(false);
			}
			else {
				session.merge(applyTrnApplicationForm);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplyTrnApplicationFormModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnApplicationFormImpl.class,
			applyTrnApplicationForm.getPrimaryKey(), applyTrnApplicationForm);

		clearUniqueFindersCache(applyTrnApplicationForm);
		cacheUniqueFindersCache(applyTrnApplicationForm);

		return applyTrnApplicationForm;
	}

	protected ApplyTrnApplicationForm toUnwrappedModel(
		ApplyTrnApplicationForm applyTrnApplicationForm) {
		if (applyTrnApplicationForm instanceof ApplyTrnApplicationFormImpl) {
			return applyTrnApplicationForm;
		}

		ApplyTrnApplicationFormImpl applyTrnApplicationFormImpl = new ApplyTrnApplicationFormImpl();

		applyTrnApplicationFormImpl.setNew(applyTrnApplicationForm.isNew());
		applyTrnApplicationFormImpl.setPrimaryKey(applyTrnApplicationForm.getPrimaryKey());

		applyTrnApplicationFormImpl.setApplicationFormId(applyTrnApplicationForm.getApplicationFormId());
		applyTrnApplicationFormImpl.setQuoteId(applyTrnApplicationForm.getQuoteId());
		applyTrnApplicationFormImpl.setApplicationRefNo(applyTrnApplicationForm.getApplicationRefNo());
		applyTrnApplicationFormImpl.setSeqGenerator(applyTrnApplicationForm.getSeqGenerator());
		applyTrnApplicationFormImpl.setLTRFFormRefNo(applyTrnApplicationForm.getLTRFFormRefNo());
		applyTrnApplicationFormImpl.setPremiumAmount(applyTrnApplicationForm.getPremiumAmount());
		applyTrnApplicationFormImpl.setIsMedicalRequired(applyTrnApplicationForm.getIsMedicalRequired());
		applyTrnApplicationFormImpl.setShortPremium(applyTrnApplicationForm.getShortPremium());
		applyTrnApplicationFormImpl.setPremiumDueDate(applyTrnApplicationForm.getPremiumDueDate());
		applyTrnApplicationFormImpl.setPolicyNo(applyTrnApplicationForm.getPolicyNo());
		applyTrnApplicationFormImpl.setPolicyElapsedDate(applyTrnApplicationForm.getPolicyElapsedDate());
		applyTrnApplicationFormImpl.setPolicyIssueDate(applyTrnApplicationForm.getPolicyIssueDate());
		applyTrnApplicationFormImpl.setStatus(applyTrnApplicationForm.getStatus());
		applyTrnApplicationFormImpl.setCompletion(applyTrnApplicationForm.getCompletion());
		applyTrnApplicationFormImpl.setIsLapsed(applyTrnApplicationForm.getIsLapsed());
		applyTrnApplicationFormImpl.setNextPremiumDueDate(applyTrnApplicationForm.getNextPremiumDueDate());
		applyTrnApplicationFormImpl.setPolicyStatus(applyTrnApplicationForm.getPolicyStatus());
		applyTrnApplicationFormImpl.setIsActive(applyTrnApplicationForm.getIsActive());
		applyTrnApplicationFormImpl.setCreatedBy(applyTrnApplicationForm.getCreatedBy());
		applyTrnApplicationFormImpl.setCreatedDate(applyTrnApplicationForm.getCreatedDate());
		applyTrnApplicationFormImpl.setModifiedDate(applyTrnApplicationForm.getModifiedDate());
		applyTrnApplicationFormImpl.setModifiedBy(applyTrnApplicationForm.getModifiedBy());

		return applyTrnApplicationFormImpl;
	}

	/**
	 * Returns the apply trn application form with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply trn application form
	 * @return the apply trn application form
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		ApplyTrnApplicationForm applyTrnApplicationForm = fetchByPrimaryKey(primaryKey);

		if (applyTrnApplicationForm == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplyTrnApplicationFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return applyTrnApplicationForm;
	}

	/**
	 * Returns the apply trn application form with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException} if it could not be found.
	 *
	 * @param ApplicationFormId the primary key of the apply trn application form
	 * @return the apply trn application form
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnApplicationFormException if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm findByPrimaryKey(String ApplicationFormId)
		throws NoSuchApplyTrnApplicationFormException, SystemException {
		return findByPrimaryKey((Serializable)ApplicationFormId);
	}

	/**
	 * Returns the apply trn application form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply trn application form
	 * @return the apply trn application form, or <code>null</code> if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ApplyTrnApplicationForm applyTrnApplicationForm = (ApplyTrnApplicationForm)EntityCacheUtil.getResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
				ApplyTrnApplicationFormImpl.class, primaryKey);

		if (applyTrnApplicationForm == _nullApplyTrnApplicationForm) {
			return null;
		}

		if (applyTrnApplicationForm == null) {
			Session session = null;

			try {
				session = openSession();

				applyTrnApplicationForm = (ApplyTrnApplicationForm)session.get(ApplyTrnApplicationFormImpl.class,
						primaryKey);

				if (applyTrnApplicationForm != null) {
					cacheResult(applyTrnApplicationForm);
				}
				else {
					EntityCacheUtil.putResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
						ApplyTrnApplicationFormImpl.class, primaryKey,
						_nullApplyTrnApplicationForm);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApplyTrnApplicationFormModelImpl.ENTITY_CACHE_ENABLED,
					ApplyTrnApplicationFormImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return applyTrnApplicationForm;
	}

	/**
	 * Returns the apply trn application form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ApplicationFormId the primary key of the apply trn application form
	 * @return the apply trn application form, or <code>null</code> if a apply trn application form with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnApplicationForm fetchByPrimaryKey(String ApplicationFormId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ApplicationFormId);
	}

	/**
	 * Returns all the apply trn application forms.
	 *
	 * @return the apply trn application forms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnApplicationForm> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apply trn application forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apply trn application forms
	 * @param end the upper bound of the range of apply trn application forms (not inclusive)
	 * @return the range of apply trn application forms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnApplicationForm> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the apply trn application forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnApplicationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apply trn application forms
	 * @param end the upper bound of the range of apply trn application forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of apply trn application forms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnApplicationForm> findAll(int start, int end,
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

		List<ApplyTrnApplicationForm> list = (List<ApplyTrnApplicationForm>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPLYTRNAPPLICATIONFORM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLYTRNAPPLICATIONFORM;

				if (pagination) {
					sql = sql.concat(ApplyTrnApplicationFormModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApplyTrnApplicationForm>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApplyTrnApplicationForm>(list);
				}
				else {
					list = (List<ApplyTrnApplicationForm>)QueryUtil.list(q,
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
	 * Removes all the apply trn application forms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ApplyTrnApplicationForm applyTrnApplicationForm : findAll()) {
			remove(applyTrnApplicationForm);
		}
	}

	/**
	 * Returns the number of apply trn application forms.
	 *
	 * @return the number of apply trn application forms
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

				Query q = session.createQuery(_SQL_COUNT_APPLYTRNAPPLICATIONFORM);

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
	 * Initializes the apply trn application form persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.ApplyTrnApplicationForm")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ApplyTrnApplicationForm>> listenersList = new ArrayList<ModelListener<ApplyTrnApplicationForm>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ApplyTrnApplicationForm>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApplyTrnApplicationFormImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPLYTRNAPPLICATIONFORM = "SELECT applyTrnApplicationForm FROM ApplyTrnApplicationForm applyTrnApplicationForm";
	private static final String _SQL_SELECT_APPLYTRNAPPLICATIONFORM_WHERE = "SELECT applyTrnApplicationForm FROM ApplyTrnApplicationForm applyTrnApplicationForm WHERE ";
	private static final String _SQL_COUNT_APPLYTRNAPPLICATIONFORM = "SELECT COUNT(applyTrnApplicationForm) FROM ApplyTrnApplicationForm applyTrnApplicationForm";
	private static final String _SQL_COUNT_APPLYTRNAPPLICATIONFORM_WHERE = "SELECT COUNT(applyTrnApplicationForm) FROM ApplyTrnApplicationForm applyTrnApplicationForm WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "applyTrnApplicationForm.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApplyTrnApplicationForm exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ApplyTrnApplicationForm exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApplyTrnApplicationFormPersistenceImpl.class);
	private static ApplyTrnApplicationForm _nullApplyTrnApplicationForm = new ApplyTrnApplicationFormImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ApplyTrnApplicationForm> toCacheModel() {
				return _nullApplyTrnApplicationFormCacheModel;
			}
		};

	private static CacheModel<ApplyTrnApplicationForm> _nullApplyTrnApplicationFormCacheModel =
		new CacheModel<ApplyTrnApplicationForm>() {
			@Override
			public ApplyTrnApplicationForm toEntityModel() {
				return _nullApplyTrnApplicationForm;
			}
		};
}