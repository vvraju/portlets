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

package com.ifli.rapid.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ConfirmDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see ConfirmDetails
 * @generated
 */
public class ConfirmDetailsWrapper implements ConfirmDetails,
	ModelWrapper<ConfirmDetails> {
	public ConfirmDetailsWrapper(ConfirmDetails confirmDetails) {
		_confirmDetails = confirmDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return ConfirmDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ConfirmDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("Approval_Status", getApproval_Status());
		attributes.put("Comments", getComments());
		attributes.put("Sign_Flag", getSign_Flag());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String Approval_Status = (String)attributes.get("Approval_Status");

		if (Approval_Status != null) {
			setApproval_Status(Approval_Status);
		}

		String Comments = (String)attributes.get("Comments");

		if (Comments != null) {
			setComments(Comments);
		}

		String Sign_Flag = (String)attributes.get("Sign_Flag");

		if (Sign_Flag != null) {
			setSign_Flag(Sign_Flag);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}
	}

	/**
	* Returns the primary key of this confirm details.
	*
	* @return the primary key of this confirm details
	*/
	@Override
	public int getPrimaryKey() {
		return _confirmDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this confirm details.
	*
	* @param primaryKey the primary key of this confirm details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_confirmDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this confirm details.
	*
	* @return the i d of this confirm details
	*/
	@Override
	public int getID() {
		return _confirmDetails.getID();
	}

	/**
	* Sets the i d of this confirm details.
	*
	* @param ID the i d of this confirm details
	*/
	@Override
	public void setID(int ID) {
		_confirmDetails.setID(ID);
	}

	/**
	* Returns the q r c_ a s r_ i d of this confirm details.
	*
	* @return the q r c_ a s r_ i d of this confirm details
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _confirmDetails.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this confirm details.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this confirm details
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_confirmDetails.setQRC_ASR_ID(QRC_ASR_ID);
	}

	/**
	* Returns the approval_ status of this confirm details.
	*
	* @return the approval_ status of this confirm details
	*/
	@Override
	public java.lang.String getApproval_Status() {
		return _confirmDetails.getApproval_Status();
	}

	/**
	* Sets the approval_ status of this confirm details.
	*
	* @param Approval_Status the approval_ status of this confirm details
	*/
	@Override
	public void setApproval_Status(java.lang.String Approval_Status) {
		_confirmDetails.setApproval_Status(Approval_Status);
	}

	/**
	* Returns the comments of this confirm details.
	*
	* @return the comments of this confirm details
	*/
	@Override
	public java.lang.String getComments() {
		return _confirmDetails.getComments();
	}

	/**
	* Sets the comments of this confirm details.
	*
	* @param Comments the comments of this confirm details
	*/
	@Override
	public void setComments(java.lang.String Comments) {
		_confirmDetails.setComments(Comments);
	}

	/**
	* Returns the sign_ flag of this confirm details.
	*
	* @return the sign_ flag of this confirm details
	*/
	@Override
	public java.lang.String getSign_Flag() {
		return _confirmDetails.getSign_Flag();
	}

	/**
	* Sets the sign_ flag of this confirm details.
	*
	* @param Sign_Flag the sign_ flag of this confirm details
	*/
	@Override
	public void setSign_Flag(java.lang.String Sign_Flag) {
		_confirmDetails.setSign_Flag(Sign_Flag);
	}

	/**
	* Returns the created by of this confirm details.
	*
	* @return the created by of this confirm details
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _confirmDetails.getCreatedBy();
	}

	/**
	* Sets the created by of this confirm details.
	*
	* @param CreatedBy the created by of this confirm details
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_confirmDetails.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this confirm details.
	*
	* @return the created date of this confirm details
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _confirmDetails.getCreatedDate();
	}

	/**
	* Sets the created date of this confirm details.
	*
	* @param CreatedDate the created date of this confirm details
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_confirmDetails.setCreatedDate(CreatedDate);
	}

	@Override
	public boolean isNew() {
		return _confirmDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_confirmDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _confirmDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_confirmDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _confirmDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _confirmDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_confirmDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _confirmDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_confirmDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_confirmDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_confirmDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConfirmDetailsWrapper((ConfirmDetails)_confirmDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.ConfirmDetails confirmDetails) {
		return _confirmDetails.compareTo(confirmDetails);
	}

	@Override
	public int hashCode() {
		return _confirmDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ConfirmDetails> toCacheModel() {
		return _confirmDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ConfirmDetails toEscapedModel() {
		return new ConfirmDetailsWrapper(_confirmDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ConfirmDetails toUnescapedModel() {
		return new ConfirmDetailsWrapper(_confirmDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _confirmDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _confirmDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_confirmDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConfirmDetailsWrapper)) {
			return false;
		}

		ConfirmDetailsWrapper confirmDetailsWrapper = (ConfirmDetailsWrapper)obj;

		if (Validator.equals(_confirmDetails,
					confirmDetailsWrapper._confirmDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConfirmDetails getWrappedConfirmDetails() {
		return _confirmDetails;
	}

	@Override
	public ConfirmDetails getWrappedModel() {
		return _confirmDetails;
	}

	@Override
	public void resetOriginalValues() {
		_confirmDetails.resetOriginalValues();
	}

	private ConfirmDetails _confirmDetails;
}