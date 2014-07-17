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

import com.ifli.rapid.model.ProofDocs;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the proof docs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ProofDocsPersistenceImpl
 * @see ProofDocsUtil
 * @generated
 */
public interface ProofDocsPersistence extends BasePersistence<ProofDocs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProofDocsUtil} to access the proof docs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the proof docs in the entity cache if it is enabled.
	*
	* @param proofDocs the proof docs
	*/
	public void cacheResult(com.ifli.rapid.model.ProofDocs proofDocs);

	/**
	* Caches the proof docses in the entity cache if it is enabled.
	*
	* @param proofDocses the proof docses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ProofDocs> proofDocses);

	/**
	* Creates a new proof docs with the primary key. Does not add the proof docs to the database.
	*
	* @param ID the primary key for the new proof docs
	* @return the new proof docs
	*/
	public com.ifli.rapid.model.ProofDocs create(long ID);

	/**
	* Removes the proof docs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the proof docs
	* @return the proof docs that was removed
	* @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ProofDocs remove(long ID)
		throws com.ifli.rapid.NoSuchProofDocsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ProofDocs updateImpl(
		com.ifli.rapid.model.ProofDocs proofDocs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proof docs with the primary key or throws a {@link com.ifli.rapid.NoSuchProofDocsException} if it could not be found.
	*
	* @param ID the primary key of the proof docs
	* @return the proof docs
	* @throws com.ifli.rapid.NoSuchProofDocsException if a proof docs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ProofDocs findByPrimaryKey(long ID)
		throws com.ifli.rapid.NoSuchProofDocsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proof docs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the proof docs
	* @return the proof docs, or <code>null</code> if a proof docs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ProofDocs fetchByPrimaryKey(long ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the proof docses.
	*
	* @return the proof docses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ProofDocs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.ProofDocs> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.ProofDocs> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the proof docses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of proof docses.
	*
	* @return the number of proof docses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}