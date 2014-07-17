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

package com.ifli.rapid.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProofDocsLocalService}.
 *
 * @author Satya Kola
 * @see ProofDocsLocalService
 * @generated
 */
public class ProofDocsLocalServiceWrapper implements ProofDocsLocalService,
	ServiceWrapper<ProofDocsLocalService> {
	public ProofDocsLocalServiceWrapper(
		ProofDocsLocalService proofDocsLocalService) {
		_proofDocsLocalService = proofDocsLocalService;
	}

	/**
	* Adds the proof docs to the database. Also notifies the appropriate model listeners.
	*
	* @param proofDocs the proof docs
	* @return the proof docs that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs addProofDocs(
		com.ifli.rapid.model.ProofDocs proofDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.addProofDocs(proofDocs);
	}

	/**
	* Creates a new proof docs with the primary key. Does not add the proof docs to the database.
	*
	* @param ID the primary key for the new proof docs
	* @return the new proof docs
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs createProofDocs(long ID) {
		return _proofDocsLocalService.createProofDocs(ID);
	}

	/**
	* Deletes the proof docs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the proof docs
	* @return the proof docs that was removed
	* @throws PortalException if a proof docs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs deleteProofDocs(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.deleteProofDocs(ID);
	}

	/**
	* Deletes the proof docs from the database. Also notifies the appropriate model listeners.
	*
	* @param proofDocs the proof docs
	* @return the proof docs that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs deleteProofDocs(
		com.ifli.rapid.model.ProofDocs proofDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.deleteProofDocs(proofDocs);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _proofDocsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProofDocsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProofDocsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ifli.rapid.model.ProofDocs fetchProofDocs(long ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.fetchProofDocs(ID);
	}

	/**
	* Returns the proof docs with the primary key.
	*
	* @param ID the primary key of the proof docs
	* @return the proof docs
	* @throws PortalException if a proof docs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs getProofDocs(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.getProofDocs(ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.ifli.rapid.model.ProofDocs> getProofDocses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.getProofDocses(start, end);
	}

	/**
	* Returns the number of proof docses.
	*
	* @return the number of proof docses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProofDocsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.getProofDocsesCount();
	}

	/**
	* Updates the proof docs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param proofDocs the proof docs
	* @return the proof docs that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProofDocs updateProofDocs(
		com.ifli.rapid.model.ProofDocs proofDocs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proofDocsLocalService.updateProofDocs(proofDocs);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _proofDocsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_proofDocsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _proofDocsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProofDocsLocalService getWrappedProofDocsLocalService() {
		return _proofDocsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProofDocsLocalService(
		ProofDocsLocalService proofDocsLocalService) {
		_proofDocsLocalService = proofDocsLocalService;
	}

	@Override
	public ProofDocsLocalService getWrappedService() {
		return _proofDocsLocalService;
	}

	@Override
	public void setWrappedService(ProofDocsLocalService proofDocsLocalService) {
		_proofDocsLocalService = proofDocsLocalService;
	}

	private ProofDocsLocalService _proofDocsLocalService;
}