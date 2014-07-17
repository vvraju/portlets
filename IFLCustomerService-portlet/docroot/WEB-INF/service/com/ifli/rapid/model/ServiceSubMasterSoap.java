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
public class ServiceSubMasterSoap implements Serializable {
	public static ServiceSubMasterSoap toSoapModel(ServiceSubMaster model) {
		ServiceSubMasterSoap soapModel = new ServiceSubMasterSoap();

		soapModel.setSUBMASTER_ID(model.getSUBMASTER_ID());
		soapModel.setSUBMASTER_NAME(model.getSUBMASTER_NAME());
		soapModel.setSUBMASTER_URL(model.getSUBMASTER_URL());
		soapModel.setSERVICE_MASTER_ID(model.getSERVICE_MASTER_ID());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());

		return soapModel;
	}

	public static ServiceSubMasterSoap[] toSoapModels(ServiceSubMaster[] models) {
		ServiceSubMasterSoap[] soapModels = new ServiceSubMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceSubMasterSoap[][] toSoapModels(
		ServiceSubMaster[][] models) {
		ServiceSubMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceSubMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceSubMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceSubMasterSoap[] toSoapModels(
		List<ServiceSubMaster> models) {
		List<ServiceSubMasterSoap> soapModels = new ArrayList<ServiceSubMasterSoap>(models.size());

		for (ServiceSubMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceSubMasterSoap[soapModels.size()]);
	}

	public ServiceSubMasterSoap() {
	}

	public int getPrimaryKey() {
		return _SUBMASTER_ID;
	}

	public void setPrimaryKey(int pk) {
		setSUBMASTER_ID(pk);
	}

	public int getSUBMASTER_ID() {
		return _SUBMASTER_ID;
	}

	public void setSUBMASTER_ID(int SUBMASTER_ID) {
		_SUBMASTER_ID = SUBMASTER_ID;
	}

	public String getSUBMASTER_NAME() {
		return _SUBMASTER_NAME;
	}

	public void setSUBMASTER_NAME(String SUBMASTER_NAME) {
		_SUBMASTER_NAME = SUBMASTER_NAME;
	}

	public String getSUBMASTER_URL() {
		return _SUBMASTER_URL;
	}

	public void setSUBMASTER_URL(String SUBMASTER_URL) {
		_SUBMASTER_URL = SUBMASTER_URL;
	}

	public int getSERVICE_MASTER_ID() {
		return _SERVICE_MASTER_ID;
	}

	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_SERVICE_MASTER_ID = SERVICE_MASTER_ID;
	}

	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;
	}

	private int _SUBMASTER_ID;
	private String _SUBMASTER_NAME;
	private String _SUBMASTER_URL;
	private int _SERVICE_MASTER_ID;
	private String _ACTIVE_FLAG;
}