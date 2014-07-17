package com.ifli.rapid.services.util;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.QRCStatus;
import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.model.QRCTypeMaster;
import com.ifli.rapid.model.Recommended_Products;
import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.QRCTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil;
import com.ifli.rapid.services.controller.RenewalNoticeController;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.flotsam.xeger.Xeger;

public class ServiceUtils {

	protected Log _log = LogFactoryUtil.getLog(RenewalNoticeController.class);

	@SuppressWarnings("unchecked")
	public String getRenewalDetails(String productid) {

		List<PolicyInfo> renewalDetailsList = new ArrayList<PolicyInfo>();
		_log.info("ldetails==list====" + renewalDetailsList);
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(PolicyInfo.class)
				.add(PropertyFactoryUtil.forName("POLICY_ID").eq(productid));

		try {
			renewalDetailsList = RENEWAL_PREMIUMLocalServiceUtil
					.dynamicQuery(dq);
			_log.info("emailid=========" + renewalDetailsList);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return "renewalDetailsList";
	}

	public static String randomOTP() throws Exception {
		String regex = "([0-9]{6})";
		Xeger generator = new Xeger(regex);
		String string = generator.generate();
		String result = shuffle(string);
		System.out.println("result===" + result);
		return result;
	}

	private static String shuffle(String input) {
		List<Character> characters = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			characters.add(c);
		}
		StringBuilder output = new StringBuilder(input.length());
		while (characters.size() != 0) {
			int randPicker = (int) (Math.random() * characters.size());
			output.append(characters.remove(randPicker));
		}
		return output.toString();
	}

	public String getRecommendedProducts(String productId) {

		List<Recommended_Products> rproductsList = new ArrayList<Recommended_Products>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				Recommended_Products.class).add(
				PropertyFactoryUtil.forName("PRODUCT_ID").eq(productId));

		return "rproductsList";
	}

	public List<ActiveServiceRequests> getActiveReqDetails(int custId) {

		List<ActiveServiceRequests> qrcList = new ArrayList<ActiveServiceRequests>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				ActiveServiceRequests.class).add(
				PropertyFactoryUtil.forName("CUSTOMER_ID").eq(custId));

		try {
			qrcList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrcList;
	}

	public List<PolicyInfo> getPolicyInfo(String pid) {

		List<PolicyInfo> pList = new ArrayList<PolicyInfo>();
		_log.info("ldetails==list====" + pList);
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(PolicyInfo.class)
				.add(PropertyFactoryUtil.forName("POLICY_ID").eq(pid));
		try {
			pList = PolicyInfoLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return pList;
	}

	@SuppressWarnings("unchecked")
	public Map<String, String> getTypeMaster() {

		Map<String, String> qrctypeListMap = new HashMap<String, String>();

		try {
			List<QRCTypeMaster> qrctypeList = QRCTypeMasterLocalServiceUtil
					.getQRCTypeMasters(0, QRCTypeMasterLocalServiceUtil
							.getQRCTypeMastersCount());

			if (qrctypeList != null) {
				for (QRCTypeMaster qrctype : qrctypeList) {
					qrctypeListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getTYPE_DESC());

				}

			}

		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrctypeListMap;
	}

	public Map<String, String> getSubTypeMaster() {

		Map<String, String> qrcsubtypeListMap = new HashMap<String, String>();
		try {
			List<QRCSubTypeMaster> qrcsubtypeList = QRCSubTypeMasterLocalServiceUtil
					.getQRCSubTypeMasters(0, QRCSubTypeMasterLocalServiceUtil
							.getQRCSubTypeMastersCount());

			if (qrcsubtypeList != null) {
				for (QRCSubTypeMaster qrctype : qrcsubtypeList) {
					qrcsubtypeListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getSUB_TYPE_DESC());

				}

			}

		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrcsubtypeListMap;
	}

	public Map<String, String> getStatusMaster() {

		Map<String, String> qrcstatusListMap = new HashMap<String, String>();
		try {
			List<QRCStatus> qrcstatusList = QRCStatusLocalServiceUtil
					.getQRCStatuses(0,
							QRCStatusLocalServiceUtil.getQRCStatusesCount());

			if (qrcstatusList != null) {
				for (QRCStatus qrctype : qrcstatusList) {
					qrcstatusListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getSTATUS_DESC());

				}

			}

		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrcstatusListMap;
	}

	public List<ActiveServiceRequests> getActiveServiceReqs(String srNo) {

		List<ActiveServiceRequests> qrcList = new ArrayList<ActiveServiceRequests>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				ActiveServiceRequests.class).add(
				PropertyFactoryUtil.forName("CUST_SR_NUMBER").eq(srNo));

		try {
			qrcList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrcList;
	}

	public List<ActiveServiceRequests> getActiveReqsrNum(String srNum) {

		List<ActiveServiceRequests> qrcsrList = new ArrayList<ActiveServiceRequests>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				ActiveServiceRequests.class).add(
				PropertyFactoryUtil.forName("CUST_SR_NUMBER").eq(srNum));

		try {
			qrcsrList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return qrcsrList;
	}

	public String getAllqrcDetails(int srNo) {

		
		Map<String, String> qrctypeListMap = new HashMap<String, String>();
		
		Map<String, String> qrcsubtypeListMap = new HashMap<String, String>();
		
		Map<String, String> qrcstatusListMap = new HashMap<String, String>();
		
		List<ActiveServiceRequests> alldetailsList = new ArrayList<ActiveServiceRequests>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				ActiveServiceRequests.class).add(
				PropertyFactoryUtil.forName("QRC_ASR_ID").eq(srNo));

		try {
			
			List<QRCTypeMaster> qrctypeList = QRCTypeMasterLocalServiceUtil
					.getQRCTypeMasters(0, QRCTypeMasterLocalServiceUtil
							.getQRCTypeMastersCount());
			
			List<QRCSubTypeMaster> qrcsubtypeList = QRCSubTypeMasterLocalServiceUtil
					.getQRCSubTypeMasters(0, QRCSubTypeMasterLocalServiceUtil
							.getQRCSubTypeMastersCount());
			
			List<QRCStatus> qrcstatusList = QRCStatusLocalServiceUtil
					.getQRCStatuses(0,
							QRCStatusLocalServiceUtil.getQRCStatusesCount());

			if (qrcsubtypeList != null) {
				for (QRCSubTypeMaster qrctype : qrcsubtypeList) {
					qrcsubtypeListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getSUB_TYPE_DESC());

				}

			}else if(qrctypeList != null){
				
				for (QRCTypeMaster qrctype : qrctypeList) {
					qrctypeListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getTYPE_DESC());

				}
				
			}else if(qrcstatusList != null) {
				for (QRCStatus qrctype : qrcstatusList) {
					qrcstatusListMap.put("" + qrctype.getPrimaryKey(),
							qrctype.getSTATUS_DESC());

				}
			
			}		
			
			
			alldetailsList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(dq);
			System.out.println("list==="+alldetailsList);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		
		return "alldetailsList";
	}
	
	public List<Customer> getCustomerDetails(int custId) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				Customer.class).add(
				PropertyFactoryUtil.forName("CUSTOMER_ID").eq(custId));

		try {
			customerList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return customerList;
	}

}
