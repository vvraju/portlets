/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.QRCStatus;
import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.model.QRCTypeMaster;
import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.QRCTypeMasterLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.CustomerBean;
import com.ifli.rapid.services.util.JsonHelper;
import com.ifli.rapid.services.util.ServiceUtils;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.cxf.common.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Subba Rao Ch
 *
 */
@Controller
@RequestMapping("VIEW")
public class ServiceRequestController {
	private static final int CUST_ID = 1;
	private Log logger = LogFactoryUtil.getLog(CustomerController.class);

	private SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmssddMMyy");

	@SuppressWarnings("unchecked")
	@ResourceMapping("getLatestQRCs")
	public void getLatestQRCs(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");

		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;

		Map<String, Object> map = new HashMap<String, Object>();

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(ActiveServiceRequests.class);
			query.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(Integer.parseInt(custId)));
			query.addOrder(OrderFactoryUtil.desc("INSERTED_DATE"));

			List<ActiveServiceRequests> asrList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(query);

			if (asrList == null) {
				asrList = new ArrayList<ActiveServiceRequests>();
			}

			List<QRCTypeMaster> typeMasters = QRCTypeMasterLocalServiceUtil.getQRCTypeMasters(range, range);
			List<QRCSubTypeMaster> subtypeMasters = QRCSubTypeMasterLocalServiceUtil.getQRCSubTypeMasters(range, range);
			List<QRCStatus> statusMasters = QRCStatusLocalServiceUtil.getQRCStatuses(range, range);

			map.put("qrcList", asrList);
			map.put("typeMasters", typeMasters);
			map.put("subtypeMasters", subtypeMasters);
			map.put("statusMasters", statusMasters);

			response.getWriter().write(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error("Exception in ServiceRequestController - getLatestQRCs() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@ResourceMapping("checkTodayTransactionExist")
	public void checkTodayTransactionExist(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");
		int typeId = Integer.parseInt(request.getParameter("typeId"));
		int subTypeId = Integer.parseInt(request.getParameter("subTypeId"));

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(Calendar.HOUR, 0);
		date1.set(Calendar.MINUTE, 0);
		date1.set(Calendar.SECOND, 0);
		date1.set(Calendar.MILLISECOND, 0);

		date2.set(Calendar.HOUR, 23);
		date2.set(Calendar.MINUTE, 59);
		date2.set(Calendar.SECOND, 59);
		date2.set(Calendar.MILLISECOND, 999);

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(ActiveServiceRequests.class);
			query.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(Integer.parseInt(custId)));
			query.add(PropertyFactoryUtil.forName("TYPE_ID").eq(typeId));
			query.add(PropertyFactoryUtil.forName("SUB_TYPE_ID").eq(subTypeId)); 
			query.add(PropertyFactoryUtil.forName("INSERTED_DATE").ge(date1.getTime()));
			query.add(PropertyFactoryUtil.forName("INSERTED_DATE").le(date2.getTime()));

			List<ActiveServiceRequests> asrList = ActiveServiceRequestsLocalServiceUtil.dynamicQuery(query);

			boolean isExist = false;

			if (asrList != null && !asrList.isEmpty()) {
				isExist = true;
			}

			response.getWriter().write(JsonHelper.toJson(isExist));
		} catch (Exception e) {
			logger.error("Exception in ServiceRequestController - checkTodayTransactionExist() : " + e.getMessage(), e);
		}
	}

	public int saveServiceRequest(ActiveServiceRequests serviceRequest) {
		Date date = new Date();

		String srNumber = "SR" + dateFormat.format(date);
		serviceRequest.setCUST_SR_NUMBER(srNumber);
		serviceRequest.setUPDATED_DATE(date);
		
		try {
			if (serviceRequest.getQRC_ASR_ID() > 0) {
				ActiveServiceRequestsLocalServiceUtil.updateActiveServiceRequests(serviceRequest);
			} else {
				serviceRequest.setINSERTED_DATE(date);
				ActiveServiceRequestsLocalServiceUtil.addActiveServiceRequests(serviceRequest);
			}
			
			if(serviceRequest.getPrimaryKey()!=0){
		QRCStatus qrcStatus=QRCStatusLocalServiceUtil.createQRCStatus(serviceRequest.getPrimaryKey());
		qrcStatus.setACTIVE_FLAG("true");
		qrcStatus.setNew(true);	
		qrcStatus.setSTATUS_DESC("open");
		qrcStatus.setQRC_ASR_ID(serviceRequest.getPrimaryKey());		
		QRCStatus  qrcStatusNew=QRCStatusLocalServiceUtil.addQRCStatus(qrcStatus);
		serviceRequest.setSTATUS_ID(qrcStatusNew.getPrimaryKey());
		ActiveServiceRequestsLocalServiceUtil.updateActiveServiceRequests(serviceRequest);
			}
			
		} catch (SystemException e) {
			logger.error("Exception in ServiceRequestController - saveServiceRequest() : " + e.getMessage(), e);
		}

		return serviceRequest.getPrimaryKey();
	}
	@RenderMapping(params="action=trackerStatusDetails")
	public String trackerDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model) throws PortalException{
		ServiceUtils serviceutil = new ServiceUtils();
		String pNum = renderRequest.getParameter("policyNo");
		String reqId = renderRequest.getParameter("reqId");
		String trkrlistId = renderRequest.getParameter("trkrlistId");
		System.out.println("trkrlistId"+trkrlistId);
		String qrcId = renderRequest.getParameter("qrcId");
		Map<String,String> typeListMap = serviceutil.getTypeMaster();
		
        Map<String,String> subtypeListMap = serviceutil.getSubTypeMaster();
        Map<String,String> statusListMap = serviceutil.getStatusMaster();
		
		List<PolicyInfo> pCustId =serviceutil.getPolicyInfo(pNum);
		List<PolicyInfo> reqTypeList = serviceutil.getPolicyInfo(reqId);
		List<ActiveServiceRequests> qrcscrList = serviceutil.getActiveReqsrNum(qrcId);
		//List<ActiveServiceRequests> reqTypeList = serviceutil.getActiveReqsrNum(reqId);
		
		List<ActiveServiceRequests> qrcArcList=new ArrayList<ActiveServiceRequests>();
		
		List<CustomerBean> customerList=new ArrayList<CustomerBean>();
		if( pNum !=null &&!StringUtils.isEmpty(pNum) ){
		for(PolicyInfo pi:pCustId){
			int cid=pi.getCUSTOMER_ID();
			qrcArcList = serviceutil.getActiveReqDetails(cid);
			
			for(ActiveServiceRequests activeServiceReq:qrcArcList){
				CustomerBean customerBean=new CustomerBean();
				
				customerBean.setCustId(String.valueOf(activeServiceReq.getCUSTOMER_ID()));
				customerBean.setSrNumbr(activeServiceReq.getCUST_SR_NUMBER());
				customerBean.setStatus(statusListMap.get(""+activeServiceReq.getSTATUS_ID()));
				customerBean.setTypeDesc(typeListMap.get(""+activeServiceReq.getTYPE_ID()));
				customerBean.setSubTypeDesc(subtypeListMap.get(""+activeServiceReq.getSUB_TYPE_ID()));
				customerBean.setAgeing("");
				customerBean.setPolicyNo(pNum);
				customerBean.setProduct(pi.getPRODUCT_NAME());
				customerBean.setEnterDate(activeServiceReq.getINSERTED_DATE().toString());
				
				
				customerList.add(customerBean);
						
			}
			
		}
		}
		else if( qrcId !=null && !StringUtils.isEmpty(qrcId) ){
		for(ActiveServiceRequests asr:qrcscrList){
			CustomerBean customerBean=new CustomerBean();
			
			customerBean.setCustId(String.valueOf(asr.getCUSTOMER_ID()));
			customerBean.setSrNumbr(asr.getCUST_SR_NUMBER());
			customerBean.setStatus(statusListMap.get(""+asr.getSTATUS_ID()));
			customerBean.setTypeDesc(typeListMap.get(""+asr.getTYPE_ID()));
			customerBean.setSubTypeDesc(subtypeListMap.get(""+asr.getSUB_TYPE_ID()));
			customerBean.setAgeing("");
			customerBean.setPolicyNo(pNum);
			//customerBean.setProduct(pCustId.get(0).getPRODUCT_NAME());
			customerBean.setEnterDate(asr.getINSERTED_DATE().toString());
			
			
			customerList.add(customerBean);
			
		}
		}
		else if( reqId !=null &&!StringUtils.isEmpty(reqId) ){
			for(PolicyInfo reqType:reqTypeList){
				int cid=reqType.getCUSTOMER_ID();
				qrcArcList = serviceutil.getActiveReqDetails(cid);
				
				for(ActiveServiceRequests activeServiceReq:qrcArcList){
					CustomerBean customerBean=new CustomerBean();
					
					customerBean.setCustId(String.valueOf(activeServiceReq.getCUSTOMER_ID()));
					customerBean.setSrNumbr(activeServiceReq.getCUST_SR_NUMBER());
					customerBean.setStatus(statusListMap.get(""+activeServiceReq.getSTATUS_ID()));
					customerBean.setTypeDesc(typeListMap.get(""+activeServiceReq.getTYPE_ID()));
					customerBean.setSubTypeDesc(subtypeListMap.get(""+activeServiceReq.getSUB_TYPE_ID()));
					customerBean.setAgeing("");
					customerBean.setPolicyNo(pNum);
					customerBean.setProduct(reqType.getPRODUCT_NAME());
					customerBean.setEnterDate(activeServiceReq.getINSERTED_DATE().toString());
					
					
					customerList.add(customerBean);
							
				}
				
			}
			}else{
					
		}
			
		model.addAttribute("customerList", customerList);					
		return "trackerDetails";
	}
	@RenderMapping(params="action=trackerStatusPage")
	public ModelAndView trackerPageDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model) throws PortalException{
		
		String srNum=renderRequest.getParameter("srNum");
		ServiceUtils serviceutil = new ServiceUtils();
		
		List<ActiveServiceRequests>  activeServiceReqList=serviceutil.getActiveServiceReqs(srNum);
		Map<String,String> typeListMap = serviceutil.getTypeMaster();
		
		for(ActiveServiceRequests activeServiceReq:activeServiceReqList){
			CustomerBean customerBean=new CustomerBean();
			
			customerBean.setCustId(String.valueOf(activeServiceReq.getCUSTOMER_ID()));
			customerBean.setSrNumbr(activeServiceReq.getCUST_SR_NUMBER());
			customerBean.setTypeDesc(typeListMap.get(""+activeServiceReq.getTYPE_ID()));
			customerBean.setSrTime(activeServiceReq.getINSERTED_DATE().getHours()+":"+activeServiceReq.getINSERTED_DATE().getMinutes()+":"+activeServiceReq.getINSERTED_DATE().getSeconds());
			customerBean.setEnterDate(activeServiceReq.getINSERTED_DATE().getDate()+"-"+(activeServiceReq.getINSERTED_DATE().getMonth()+1)+"-"+activeServiceReq.getINSERTED_DATE().getYear());
			model.addAttribute("customerBean",customerBean);
			
					
		}
		
		model.addAttribute("srNum", renderRequest.getParameter("srNum"));
		model.addAttribute("type", renderRequest.getParameter("type"));
		return new ModelAndView("trackerConfirmationPage");
	}
	@RenderMapping(params="action=getAllQrcDetails")
	public String getAllqrcDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model) throws PortalException, SystemException{
		System.out.println("enter-----allllllllll");
		String trkrlistId=renderRequest.getParameter("trkrlistId");
		ServiceUtils serviceutil = new ServiceUtils();
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		List<CustomerBean> customerDetails=new ArrayList<CustomerBean>();
		List<PolicyInfo> reqallList = serviceutil.getPolicyInfo(trkrlistId);
		Map<String,String> typeListMap = serviceutil.getTypeMaster();
        Map<String,String> subtypeListMap = serviceutil.getSubTypeMaster();
        Map<String,String> statusListMap = serviceutil.getStatusMaster();
		List<ActiveServiceRequests> activeServiceReqList=ActiveServiceRequestsLocalServiceUtil.getActiveServiceRequestses(range, range);
		System.out.println("enterlist----allllllllll"+activeServiceReqList);
		
		for(PolicyInfo reqType:reqallList){
			int custid=reqType.getCUSTOMER_ID();
			activeServiceReqList = serviceutil.getActiveReqDetails(custid);
		for(ActiveServiceRequests qrcall:activeServiceReqList){
			
			CustomerBean customerBean=new CustomerBean();
			
			customerBean.setCustId(String.valueOf(qrcall.getCUSTOMER_ID()));
			customerBean.setSrNumbr(qrcall.getCUST_SR_NUMBER());
			customerBean.setStatus(statusListMap.get(""+qrcall.getSTATUS_ID()));
			System.out.println("sts"+qrcall.getSTATUS_ID());
			customerBean.setTypeDesc(typeListMap.get(""+qrcall.getTYPE_ID()));
			System.out.println("type"+qrcall.getTYPE_ID());
			customerBean.setSubTypeDesc(subtypeListMap.get(""+qrcall.getSUB_TYPE_ID()));
			System.out.println("stype"+qrcall.getSUB_TYPE_ID());
			customerBean.setAgeing("");
			//customerBean.setPolicyNo(pNum);
			//customerBean.setProduct(pCustId.get(0).getPRODUCT_NAME());
			//customerBean.setEnterDate(qrcall.getINSERTED_DATE().toString());
			
			
			customerDetails.add(customerBean);
			
		}
		
		}
		
		
        model.addAttribute("customerDetails", activeServiceReqList);
		
		return "trackerDetails";
	}
	
}
