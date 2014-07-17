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
 * This class is a wrapper for {@link FundMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see FundMaster
 * @generated
 */
public class FundMasterWrapper implements FundMaster, ModelWrapper<FundMaster> {
	public FundMasterWrapper(FundMaster fundMaster) {
		_fundMaster = fundMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return FundMaster.class;
	}

	@Override
	public String getModelClassName() {
		return FundMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_NAME", getFUND_NAME());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		String FUND_NAME = (String)attributes.get("FUND_NAME");

		if (FUND_NAME != null) {
			setFUND_NAME(FUND_NAME);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}
	}

	/**
	* Returns the primary key of this fund master.
	*
	* @return the primary key of this fund master
	*/
	@Override
	public int getPrimaryKey() {
		return _fundMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this fund master.
	*
	* @param primaryKey the primary key of this fund master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_fundMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the f u n d_ i d of this fund master.
	*
	* @return the f u n d_ i d of this fund master
	*/
	@Override
	public int getFUND_ID() {
		return _fundMaster.getFUND_ID();
	}

	/**
	* Sets the f u n d_ i d of this fund master.
	*
	* @param FUND_ID the f u n d_ i d of this fund master
	*/
	@Override
	public void setFUND_ID(int FUND_ID) {
		_fundMaster.setFUND_ID(FUND_ID);
	}

	/**
	* Returns the f u n d_ n a m e of this fund master.
	*
	* @return the f u n d_ n a m e of this fund master
	*/
	@Override
	public java.lang.String getFUND_NAME() {
		return _fundMaster.getFUND_NAME();
	}

	/**
	* Sets the f u n d_ n a m e of this fund master.
	*
	* @param FUND_NAME the f u n d_ n a m e of this fund master
	*/
	@Override
	public void setFUND_NAME(java.lang.String FUND_NAME) {
		_fundMaster.setFUND_NAME(FUND_NAME);
	}

	/**
	* Returns the f u n d_ c o d e of this fund master.
	*
	* @return the f u n d_ c o d e of this fund master
	*/
	@Override
	public java.lang.String getFUND_CODE() {
		return _fundMaster.getFUND_CODE();
	}

	/**
	* Sets the f u n d_ c o d e of this fund master.
	*
	* @param FUND_CODE the f u n d_ c o d e of this fund master
	*/
	@Override
	public void setFUND_CODE(java.lang.String FUND_CODE) {
		_fundMaster.setFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this fund master.
	*
	* @return the i n s e r t e d_ d a t e of this fund master
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _fundMaster.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this fund master.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this fund master
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_fundMaster.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this fund master.
	*
	* @return the i n s e r t e d_ b y of this fund master
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _fundMaster.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this fund master.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this fund master
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_fundMaster.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this fund master.
	*
	* @return the u p d a t e d_ d a t e of this fund master
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _fundMaster.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this fund master.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this fund master
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_fundMaster.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this fund master.
	*
	* @return the u p d a t e d_ b y of this fund master
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _fundMaster.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this fund master.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this fund master
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_fundMaster.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _fundMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fundMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fundMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fundMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fundMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fundMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fundMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fundMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fundMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fundMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fundMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FundMasterWrapper((FundMaster)_fundMaster.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.FundMaster fundMaster) {
		return _fundMaster.compareTo(fundMaster);
	}

	@Override
	public int hashCode() {
		return _fundMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.FundMaster> toCacheModel() {
		return _fundMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.FundMaster toEscapedModel() {
		return new FundMasterWrapper(_fundMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.FundMaster toUnescapedModel() {
		return new FundMasterWrapper(_fundMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fundMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fundMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fundMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FundMasterWrapper)) {
			return false;
		}

		FundMasterWrapper fundMasterWrapper = (FundMasterWrapper)obj;

		if (Validator.equals(_fundMaster, fundMasterWrapper._fundMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FundMaster getWrappedFundMaster() {
		return _fundMaster;
	}

	@Override
	public FundMaster getWrappedModel() {
		return _fundMaster;
	}

	@Override
	public void resetOriginalValues() {
		_fundMaster.resetOriginalValues();
	}

	private FundMaster _fundMaster;
}