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

package com.ifl.rapid.customer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class LocMstBranchLocationSoap implements Serializable {
	public static LocMstBranchLocationSoap toSoapModel(
		LocMstBranchLocation model) {
		LocMstBranchLocationSoap soapModel = new LocMstBranchLocationSoap();

		soapModel.setBranchId(model.getBranchId());
		soapModel.setBranchName(model.getBranchName());
		soapModel.setBranchOpeningTime(model.getBranchOpeningTime());
		soapModel.setBranchClosingTime(model.getBranchClosingTime());
		soapModel.setAddressFirstLine(model.getAddressFirstLine());
		soapModel.setAddressSecondLine(model.getAddressSecondLine());
		soapModel.setPrimaryContactNo(model.getPrimaryContactNo());
		soapModel.setOtherContactNo(model.getOtherContactNo());
		soapModel.setFaxNumber(model.getFaxNumber());
		soapModel.setLocationId(model.getLocationId());
		soapModel.setLocationId_old(model.getLocationId_old());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setBranchCode(model.getBranchCode());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static LocMstBranchLocationSoap[] toSoapModels(
		LocMstBranchLocation[] models) {
		LocMstBranchLocationSoap[] soapModels = new LocMstBranchLocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocMstBranchLocationSoap[][] toSoapModels(
		LocMstBranchLocation[][] models) {
		LocMstBranchLocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LocMstBranchLocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocMstBranchLocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocMstBranchLocationSoap[] toSoapModels(
		List<LocMstBranchLocation> models) {
		List<LocMstBranchLocationSoap> soapModels = new ArrayList<LocMstBranchLocationSoap>(models.size());

		for (LocMstBranchLocation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocMstBranchLocationSoap[soapModels.size()]);
	}

	public LocMstBranchLocationSoap() {
	}

	public int getPrimaryKey() {
		return _BranchId;
	}

	public void setPrimaryKey(int pk) {
		setBranchId(pk);
	}

	public int getBranchId() {
		return _BranchId;
	}

	public void setBranchId(int BranchId) {
		_BranchId = BranchId;
	}

	public String getBranchName() {
		return _BranchName;
	}

	public void setBranchName(String BranchName) {
		_BranchName = BranchName;
	}

	public String getBranchOpeningTime() {
		return _BranchOpeningTime;
	}

	public void setBranchOpeningTime(String BranchOpeningTime) {
		_BranchOpeningTime = BranchOpeningTime;
	}

	public String getBranchClosingTime() {
		return _BranchClosingTime;
	}

	public void setBranchClosingTime(String BranchClosingTime) {
		_BranchClosingTime = BranchClosingTime;
	}

	public String getAddressFirstLine() {
		return _AddressFirstLine;
	}

	public void setAddressFirstLine(String AddressFirstLine) {
		_AddressFirstLine = AddressFirstLine;
	}

	public String getAddressSecondLine() {
		return _AddressSecondLine;
	}

	public void setAddressSecondLine(String AddressSecondLine) {
		_AddressSecondLine = AddressSecondLine;
	}

	public String getPrimaryContactNo() {
		return _PrimaryContactNo;
	}

	public void setPrimaryContactNo(String PrimaryContactNo) {
		_PrimaryContactNo = PrimaryContactNo;
	}

	public String getOtherContactNo() {
		return _OtherContactNo;
	}

	public void setOtherContactNo(String OtherContactNo) {
		_OtherContactNo = OtherContactNo;
	}

	public String getFaxNumber() {
		return _FaxNumber;
	}

	public void setFaxNumber(String FaxNumber) {
		_FaxNumber = FaxNumber;
	}

	public int getLocationId() {
		return _LocationId;
	}

	public void setLocationId(int LocationId) {
		_LocationId = LocationId;
	}

	public String getLocationId_old() {
		return _LocationId_old;
	}

	public void setLocationId_old(String LocationId_old) {
		_LocationId_old = LocationId_old;
	}

	public double getLongitude() {
		return _Longitude;
	}

	public void setLongitude(double Longitude) {
		_Longitude = Longitude;
	}

	public double getLatitude() {
		return _Latitude;
	}

	public void setLatitude(double Latitude) {
		_Latitude = Latitude;
	}

	public String getBranchCode() {
		return _BranchCode;
	}

	public void setBranchCode(String BranchCode) {
		_BranchCode = BranchCode;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public Date getCreatedDate() {
		return _CreatedDate;
	}

	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
		_IsActive = IsActive;
	}

	private int _BranchId;
	private String _BranchName;
	private String _BranchOpeningTime;
	private String _BranchClosingTime;
	private String _AddressFirstLine;
	private String _AddressSecondLine;
	private String _PrimaryContactNo;
	private String _OtherContactNo;
	private String _FaxNumber;
	private int _LocationId;
	private String _LocationId_old;
	private double _Longitude;
	private double _Latitude;
	private String _BranchCode;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}