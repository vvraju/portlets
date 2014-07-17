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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class ServiceMasterSoap implements Serializable {
	public static ServiceMasterSoap toSoapModel(ServiceMaster model) {
		ServiceMasterSoap soapModel = new ServiceMasterSoap();

		soapModel.setSERVICE_MASTER_ID(model.getSERVICE_MASTER_ID());
		soapModel.setSERVICE_MASTER_NAME(model.getSERVICE_MASTER_NAME());
		soapModel.setSERVICE_MASTER_DESC(model.getSERVICE_MASTER_DESC());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());

		return soapModel;
	}

	public static ServiceMasterSoap[] toSoapModels(ServiceMaster[] models) {
		ServiceMasterSoap[] soapModels = new ServiceMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceMasterSoap[][] toSoapModels(ServiceMaster[][] models) {
		ServiceMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceMasterSoap[] toSoapModels(List<ServiceMaster> models) {
		List<ServiceMasterSoap> soapModels = new ArrayList<ServiceMasterSoap>(models.size());

		for (ServiceMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceMasterSoap[soapModels.size()]);
	}

	public ServiceMasterSoap() {
	}

	public int getPrimaryKey() {
		return _SERVICE_MASTER_ID;
	}

	public void setPrimaryKey(int pk) {
		setSERVICE_MASTER_ID(pk);
	}

	public int getSERVICE_MASTER_ID() {
		return _SERVICE_MASTER_ID;
	}

	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_SERVICE_MASTER_ID = SERVICE_MASTER_ID;
	}

	public String getSERVICE_MASTER_NAME() {
		return _SERVICE_MASTER_NAME;
	}

	public void setSERVICE_MASTER_NAME(String SERVICE_MASTER_NAME) {
		_SERVICE_MASTER_NAME = SERVICE_MASTER_NAME;
	}

	public String getSERVICE_MASTER_DESC() {
		return _SERVICE_MASTER_DESC;
	}

	public void setSERVICE_MASTER_DESC(String SERVICE_MASTER_DESC) {
		_SERVICE_MASTER_DESC = SERVICE_MASTER_DESC;
	}

	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;
	}

	private int _SERVICE_MASTER_ID;
	private String _SERVICE_MASTER_NAME;
	private String _SERVICE_MASTER_DESC;
	private String _ACTIVE_FLAG;
}