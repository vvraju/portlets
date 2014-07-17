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
public class QrcTrnServiceRequestsSoap implements Serializable {
	public static QrcTrnServiceRequestsSoap toSoapModel(
		QrcTrnServiceRequests model) {
		QrcTrnServiceRequestsSoap soapModel = new QrcTrnServiceRequestsSoap();

		soapModel.setServiceRequestId(model.getServiceRequestId());
		soapModel.setContactId(model.getContactId());
		soapModel.setSrId(model.getSrId());
		soapModel.setProcessId(model.getProcessId());
		soapModel.setSource(model.getSource());
		soapModel.setChannel(model.getChannel());
		soapModel.setPriority(model.getPriority());
		soapModel.setPolicyNo(model.getPolicyNo());
		soapModel.setCaseDetails(model.getCaseDetails());
		soapModel.setIsManual(model.getIsManual());
		soapModel.setIsLAUpdated(model.getIsLAUpdated());
		soapModel.setComments(model.getComments());
		soapModel.setIsSignVerified(model.getIsSignVerified());
		soapModel.setRequestId(model.getRequestId());
		soapModel.setAssignedTo(model.getAssignedTo());
		soapModel.setCreatedContactId(model.getCreatedContactId());
		soapModel.setHistoryId(model.getHistoryId());
		soapModel.setAddressTypeId(model.getAddressTypeId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static QrcTrnServiceRequestsSoap[] toSoapModels(
		QrcTrnServiceRequests[] models) {
		QrcTrnServiceRequestsSoap[] soapModels = new QrcTrnServiceRequestsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnServiceRequestsSoap[][] toSoapModels(
		QrcTrnServiceRequests[][] models) {
		QrcTrnServiceRequestsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcTrnServiceRequestsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcTrnServiceRequestsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnServiceRequestsSoap[] toSoapModels(
		List<QrcTrnServiceRequests> models) {
		List<QrcTrnServiceRequestsSoap> soapModels = new ArrayList<QrcTrnServiceRequestsSoap>(models.size());

		for (QrcTrnServiceRequests model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcTrnServiceRequestsSoap[soapModels.size()]);
	}

	public QrcTrnServiceRequestsSoap() {
	}

	public int getPrimaryKey() {
		return _ServiceRequestId;
	}

	public void setPrimaryKey(int pk) {
		setServiceRequestId(pk);
	}

	public int getServiceRequestId() {
		return _ServiceRequestId;
	}

	public void setServiceRequestId(int ServiceRequestId) {
		_ServiceRequestId = ServiceRequestId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public String getSrId() {
		return _SrId;
	}

	public void setSrId(String SrId) {
		_SrId = SrId;
	}

	public String getProcessId() {
		return _ProcessId;
	}

	public void setProcessId(String ProcessId) {
		_ProcessId = ProcessId;
	}

	public String getSource() {
		return _Source;
	}

	public void setSource(String Source) {
		_Source = Source;
	}

	public String getChannel() {
		return _Channel;
	}

	public void setChannel(String Channel) {
		_Channel = Channel;
	}

	public String getPriority() {
		return _Priority;
	}

	public void setPriority(String Priority) {
		_Priority = Priority;
	}

	public String getPolicyNo() {
		return _PolicyNo;
	}

	public void setPolicyNo(String PolicyNo) {
		_PolicyNo = PolicyNo;
	}

	public String getCaseDetails() {
		return _CaseDetails;
	}

	public void setCaseDetails(String CaseDetails) {
		_CaseDetails = CaseDetails;
	}

	public String getIsManual() {
		return _IsManual;
	}

	public void setIsManual(String IsManual) {
		_IsManual = IsManual;
	}

	public String getIsLAUpdated() {
		return _IsLAUpdated;
	}

	public void setIsLAUpdated(String IsLAUpdated) {
		_IsLAUpdated = IsLAUpdated;
	}

	public String getComments() {
		return _Comments;
	}

	public void setComments(String Comments) {
		_Comments = Comments;
	}

	public String getIsSignVerified() {
		return _IsSignVerified;
	}

	public void setIsSignVerified(String IsSignVerified) {
		_IsSignVerified = IsSignVerified;
	}

	public int getRequestId() {
		return _RequestId;
	}

	public void setRequestId(int RequestId) {
		_RequestId = RequestId;
	}

	public int getAssignedTo() {
		return _AssignedTo;
	}

	public void setAssignedTo(int AssignedTo) {
		_AssignedTo = AssignedTo;
	}

	public int getCreatedContactId() {
		return _CreatedContactId;
	}

	public void setCreatedContactId(int CreatedContactId) {
		_CreatedContactId = CreatedContactId;
	}

	public int getHistoryId() {
		return _HistoryId;
	}

	public void setHistoryId(int HistoryId) {
		_HistoryId = HistoryId;
	}

	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	public void setAddressTypeId(int AddressTypeId) {
		_AddressTypeId = AddressTypeId;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
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

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	private int _ServiceRequestId;
	private int _ContactId;
	private String _SrId;
	private String _ProcessId;
	private String _Source;
	private String _Channel;
	private String _Priority;
	private String _PolicyNo;
	private String _CaseDetails;
	private String _IsManual;
	private String _IsLAUpdated;
	private String _Comments;
	private String _IsSignVerified;
	private int _RequestId;
	private int _AssignedTo;
	private int _CreatedContactId;
	private int _HistoryId;
	private int _AddressTypeId;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}