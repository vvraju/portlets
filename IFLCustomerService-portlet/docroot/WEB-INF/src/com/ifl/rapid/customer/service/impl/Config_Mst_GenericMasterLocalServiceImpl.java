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

package com.ifl.rapid.customer.service.impl;

import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;
import com.ifl.rapid.customer.service.base.Config_Mst_GenericMasterLocalServiceBaseImpl;
import com.ifl.rapid.customer.service.persistence.Config_Mst_GenericMasterUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the config_ mst_ generic master local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.base.Config_Mst_GenericMasterLocalServiceBaseImpl
 * @see com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil
 */
public class Config_Mst_GenericMasterLocalServiceImpl
	extends Config_Mst_GenericMasterLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil} to access the config_ mst_ generic master local service.
	 */
	
	
	/**
	* Returns the config_ mst_ generic master where GenericMasterId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param GenericMasterId the generic master ID
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByGenericMasterId(
		int GenericMasterId)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return Config_Mst_GenericMasterUtil.findByGenericMasterId(GenericMasterId);
	}
	
	/**
	* Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	*
	* @param MasterType the master type
	* @param MasterKey the master key
	* @return the matching config_ mst_ generic master
	* @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	* @throws SystemException if a system exception occurred
	*/
	public  com.ifl.rapid.customer.model.Config_Mst_GenericMaster findByMasterTypeAndMasterKey(
		java.lang.String MasterType, java.lang.String MasterKey)
		throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return Config_Mst_GenericMasterUtil
				   .findByMasterTypeAndMasterKey(MasterType, MasterKey);
	}

	@Override
	public List<Config_Mst_GenericMaster> findByMasterType(String MasterType)
			throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}
}