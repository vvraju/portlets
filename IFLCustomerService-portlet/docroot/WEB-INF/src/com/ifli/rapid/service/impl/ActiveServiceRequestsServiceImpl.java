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

package com.ifli.rapid.service.impl;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.PolicyFund;
import com.ifli.rapid.model.PolicyFundSwitchCounter;
import com.ifli.rapid.model.PolicyFundSwitchDetails;
import com.ifli.rapid.model.PolicyFundSwitchDetailsModel;
import com.ifli.rapid.model.QRCStatus;
import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;
import com.ifli.rapid.service.base.ActiveServiceRequestsServiceBaseImpl;
import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The implementation of the active service requests remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.ifli.rapid.service.ActiveServiceRequestsService} interface.
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author Satya Kola
 * @see com.ifli.rapid.service.base.ActiveServiceRequestsServiceBaseImpl
 * @see com.ifli.rapid.service.ActiveServiceRequestsServiceUtil
 */
public class ActiveServiceRequestsServiceImpl extends
		ActiveServiceRequestsServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.ifli.rapid.service.ActiveServiceRequestsServiceUtil} to access the
	 * active service requests remote service.
	 */
	String regExp = ".*[^0-9].*";

	public Map<String, String> getFundSwitchDetails(String srId) {
		String serviceJson = "";

		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		ActiveServiceRequests serviceRequestDetails = null;
		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());
				
				DynamicQuery query = DynamicQueryFactoryUtil.forClass(com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl.class);
				query.add(PropertyFactoryUtil.forName("QRC_ASR_ID").eq(qrcId));
				
                    List<PolicyFundSwitchDetails> policyFundList= policyFundSwitchDetailsLocalService.dynamicQuery(query);
                    
                    PolicyFundSwitchDetails policyFund=null;
                    if(policyFundList!=null&&policyFundList.size()!=0){
                    	policyFund=policyFundList.get(0);
                    }
                    
                  
				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));
				
				if(policyFund!=null){
					
					serviceRequestMap.put("policyId",policyFund.getPOLICY_ID());
				}

				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateFundSwitchData(String updateJson) {

		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);

			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updateFS_PSDecision(String updateJson) {

		String serviceJson = "";
		try {

			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();
			Map jsonData = parser.parseJson(updateJson);

			String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
			String srId = jsonData.get("SRID").toString();

			String processId = jsonData.get("processId").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

				serviceJson = "PSTeamdecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (processId.isEmpty() || processId == null) {

				serviceJson = "processId field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {

				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(PSTeamdecision);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
					// Need serviceRequestID property for relation shi[p
					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getPRData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updatePRData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updatePR_PSDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getTUData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateTUData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return serviceJson;

	}

	public String updateTU_PSDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getAUData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateAUData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updateAU_PSDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getNCData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateNCData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return serviceJson;

	}

	public String updateNC_PSDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getEPData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateEPData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updateEP_PSDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getDOBData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateDOBCData(String updateJson) {
		String serviceJson = "";
		try {
			JsonParserFactory factory = JsonParserFactory.getInstance();
			JSONParser parser = factory.newJsonParser();

			Map jsonData = parser.parseJson(updateJson);
			String laDecison = jsonData.get("LADecision").toString();

			String srId = jsonData.get("SRID").toString();

			String policyId = jsonData.get("PolicyID").toString();
			String flag = jsonData.get("flag").toString();
			serviceJson = "Fail";
			Integer qrcId = 0;
			if (laDecison.isEmpty() || laDecison == null) {

				serviceJson = "LADecision field required";
			} else if (srId.isEmpty() || srId == null) {

				serviceJson = "SR Id field required";

			} else if (policyId.isEmpty() || policyId == null) {

				serviceJson = "PolicyId field required";
			} else if (flag.isEmpty() || flag == null) {

				serviceJson = "Flag field required";
			} else if (srId.matches(regExp)) {

				serviceJson = "SRID field should be numeric";

			} else {
				qrcId = Integer.parseInt(srId);
				try {
					ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
							.getActiveServiceRequests(qrcId);

					QRCStatus qurcStatus = QRCStatusLocalServiceUtil
							.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

					qurcStatus.setSTATUS_DESC(laDecison);
					qurcStatus.setACTIVE_FLAG(flag);
					qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));

					qurcStatus = QRCStatusLocalServiceUtil
							.updateQRCStatus(qurcStatus);

					if (qurcStatus.getSTATUS_DESC().endsWith(laDecison)) {
						serviceJson = "Success";

					}

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			serviceJson = "You are missing some fields";
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updateDOBCDecision(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String flag = jsonData.get("flag").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (flag.isEmpty() || flag == null) {

			serviceJson = "Flag field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public String updateDOBCStatus(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PSTeamdecision").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String flag = jsonData.get("flag").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (flag.isEmpty() || flag == null) {

			serviceJson = "Flag field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return serviceJson;
	}

	public Map<String, String> getPRUSData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updatePRUSStatus(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PRTrans_Status").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return serviceJson;
	}

	public Map<String, String> getRNData(String srId) {
		Map<String, String> serviceRequestMap = new HashMap<String, String>();

		String serviceJson = "";

		if (srId == null || srId.isEmpty()) {
			serviceJson = "Sr Id  field is required";
		} else if (srId.equals("0")) {
			serviceJson = "Sr Id  is greater than zero";

		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";
		} else {
			try {
				Integer qrcId = Integer.parseInt(srId);
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);
				QRCStatus qrcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				serviceRequestMap.put("srId",
						String.valueOf(serviceRequestDetails.getPrimaryKey()));
				serviceRequestMap.put("cust_sr_number",
						serviceRequestDetails.getCUST_SR_NUMBER());
				serviceRequestMap.put("status", qrcStatus.getSTATUS_DESC());
				serviceRequestMap.put("date", String
						.valueOf(serviceRequestDetails.getINSERTED_DATE()));

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return serviceRequestMap;
	}

	public String updateRNStatus(String updateJson) {
		JsonParserFactory factory = JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(updateJson);

		String PSTeamdecision = jsonData.get("PRTrans_Status").toString();
		String srId = jsonData.get("SRID").toString();

		String processId = jsonData.get("processId").toString();
		String serviceJson = "Fail";
		Integer qrcId = 0;
		if (PSTeamdecision.isEmpty() || PSTeamdecision == null) {

			serviceJson = "PSTeamdecision field required";
		} else if (srId.isEmpty() || srId == null) {

			serviceJson = "SR Id field required";
			qrcId = Integer.parseInt(srId);
		} else if (processId.isEmpty() || processId == null) {

			serviceJson = "processId field required";
		} else if (srId.matches(regExp)) {

			serviceJson = "SRID field should be numeric";

		} else {
			try {
				ActiveServiceRequests serviceRequestDetails = ActiveServiceRequestsLocalServiceUtil
						.getActiveServiceRequests(qrcId);

				QRCStatus qurcStatus = QRCStatusLocalServiceUtil
						.getQRCStatus(serviceRequestDetails.getSTATUS_ID());

				qurcStatus.setSTATUS_DESC(PSTeamdecision);
				qurcStatus.setQRC_ASR_ID(Integer.parseInt(srId));
				// Need serviceRequestID property for relation shi[p
				qurcStatus = QRCStatusLocalServiceUtil
						.updateQRCStatus(qurcStatus);

				if (qurcStatus.getSTATUS_DESC().endsWith(PSTeamdecision)) {
					serviceJson = "Success";

				}

			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return serviceJson;
	}

}