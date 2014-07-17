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
 * This class is a wrapper for {@link NavHistory}.
 * </p>
 *
 * @author Satya Kola
 * @see NavHistory
 * @generated
 */
public class NavHistoryWrapper implements NavHistory, ModelWrapper<NavHistory> {
	public NavHistoryWrapper(NavHistory navHistory) {
		_navHistory = navHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return NavHistory.class;
	}

	@Override
	public String getModelClassName() {
		return NavHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NAV_HISTORY_ID", getNAV_HISTORY_ID());
		attributes.put("DATE", getDATE());
		attributes.put("NAV", getNAV());
		attributes.put("SALE_PRICE", getSALE_PRICE());
		attributes.put("PURCHASE_PRICE", getPURCHASE_PRICE());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("FUND_NAME", getFUND_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NAV_HISTORY_ID = (Long)attributes.get("NAV_HISTORY_ID");

		if (NAV_HISTORY_ID != null) {
			setNAV_HISTORY_ID(NAV_HISTORY_ID);
		}

		Date DATE = (Date)attributes.get("DATE");

		if (DATE != null) {
			setDATE(DATE);
		}

		Double NAV = (Double)attributes.get("NAV");

		if (NAV != null) {
			setNAV(NAV);
		}

		Double SALE_PRICE = (Double)attributes.get("SALE_PRICE");

		if (SALE_PRICE != null) {
			setSALE_PRICE(SALE_PRICE);
		}

		Double PURCHASE_PRICE = (Double)attributes.get("PURCHASE_PRICE");

		if (PURCHASE_PRICE != null) {
			setPURCHASE_PRICE(PURCHASE_PRICE);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		String FUND_NAME = (String)attributes.get("FUND_NAME");

		if (FUND_NAME != null) {
			setFUND_NAME(FUND_NAME);
		}
	}

	/**
	* Returns the primary key of this nav history.
	*
	* @return the primary key of this nav history
	*/
	@Override
	public long getPrimaryKey() {
		return _navHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nav history.
	*
	* @param primaryKey the primary key of this nav history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_navHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the n a v_ h i s t o r y_ i d of this nav history.
	*
	* @return the n a v_ h i s t o r y_ i d of this nav history
	*/
	@Override
	public long getNAV_HISTORY_ID() {
		return _navHistory.getNAV_HISTORY_ID();
	}

	/**
	* Sets the n a v_ h i s t o r y_ i d of this nav history.
	*
	* @param NAV_HISTORY_ID the n a v_ h i s t o r y_ i d of this nav history
	*/
	@Override
	public void setNAV_HISTORY_ID(long NAV_HISTORY_ID) {
		_navHistory.setNAV_HISTORY_ID(NAV_HISTORY_ID);
	}

	/**
	* Returns the d a t e of this nav history.
	*
	* @return the d a t e of this nav history
	*/
	@Override
	public java.util.Date getDATE() {
		return _navHistory.getDATE();
	}

	/**
	* Sets the d a t e of this nav history.
	*
	* @param DATE the d a t e of this nav history
	*/
	@Override
	public void setDATE(java.util.Date DATE) {
		_navHistory.setDATE(DATE);
	}

	/**
	* Returns the n a v of this nav history.
	*
	* @return the n a v of this nav history
	*/
	@Override
	public double getNAV() {
		return _navHistory.getNAV();
	}

	/**
	* Sets the n a v of this nav history.
	*
	* @param NAV the n a v of this nav history
	*/
	@Override
	public void setNAV(double NAV) {
		_navHistory.setNAV(NAV);
	}

	/**
	* Returns the s a l e_ p r i c e of this nav history.
	*
	* @return the s a l e_ p r i c e of this nav history
	*/
	@Override
	public double getSALE_PRICE() {
		return _navHistory.getSALE_PRICE();
	}

	/**
	* Sets the s a l e_ p r i c e of this nav history.
	*
	* @param SALE_PRICE the s a l e_ p r i c e of this nav history
	*/
	@Override
	public void setSALE_PRICE(double SALE_PRICE) {
		_navHistory.setSALE_PRICE(SALE_PRICE);
	}

	/**
	* Returns the p u r c h a s e_ p r i c e of this nav history.
	*
	* @return the p u r c h a s e_ p r i c e of this nav history
	*/
	@Override
	public double getPURCHASE_PRICE() {
		return _navHistory.getPURCHASE_PRICE();
	}

	/**
	* Sets the p u r c h a s e_ p r i c e of this nav history.
	*
	* @param PURCHASE_PRICE the p u r c h a s e_ p r i c e of this nav history
	*/
	@Override
	public void setPURCHASE_PRICE(double PURCHASE_PRICE) {
		_navHistory.setPURCHASE_PRICE(PURCHASE_PRICE);
	}

	/**
	* Returns the f u n d_ c o d e of this nav history.
	*
	* @return the f u n d_ c o d e of this nav history
	*/
	@Override
	public java.lang.String getFUND_CODE() {
		return _navHistory.getFUND_CODE();
	}

	/**
	* Sets the f u n d_ c o d e of this nav history.
	*
	* @param FUND_CODE the f u n d_ c o d e of this nav history
	*/
	@Override
	public void setFUND_CODE(java.lang.String FUND_CODE) {
		_navHistory.setFUND_CODE(FUND_CODE);
	}

	/**
	* Returns the f u n d_ n a m e of this nav history.
	*
	* @return the f u n d_ n a m e of this nav history
	*/
	@Override
	public java.lang.String getFUND_NAME() {
		return _navHistory.getFUND_NAME();
	}

	/**
	* Sets the f u n d_ n a m e of this nav history.
	*
	* @param FUND_NAME the f u n d_ n a m e of this nav history
	*/
	@Override
	public void setFUND_NAME(java.lang.String FUND_NAME) {
		_navHistory.setFUND_NAME(FUND_NAME);
	}

	@Override
	public boolean isNew() {
		return _navHistory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_navHistory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _navHistory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_navHistory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _navHistory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _navHistory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_navHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _navHistory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_navHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_navHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_navHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NavHistoryWrapper((NavHistory)_navHistory.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.NavHistory navHistory) {
		return _navHistory.compareTo(navHistory);
	}

	@Override
	public int hashCode() {
		return _navHistory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.NavHistory> toCacheModel() {
		return _navHistory.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.NavHistory toEscapedModel() {
		return new NavHistoryWrapper(_navHistory.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.NavHistory toUnescapedModel() {
		return new NavHistoryWrapper(_navHistory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _navHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _navHistory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_navHistory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NavHistoryWrapper)) {
			return false;
		}

		NavHistoryWrapper navHistoryWrapper = (NavHistoryWrapper)obj;

		if (Validator.equals(_navHistory, navHistoryWrapper._navHistory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NavHistory getWrappedNavHistory() {
		return _navHistory;
	}

	@Override
	public NavHistory getWrappedModel() {
		return _navHistory;
	}

	@Override
	public void resetOriginalValues() {
		_navHistory.resetOriginalValues();
	}

	private NavHistory _navHistory;
}