package com.ifli.rapid.services.service;

import com.ifl.rapid.customer.model.City;
import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;
import com.ifl.rapid.customer.model.LocMstBranchLocation;
import com.ifl.rapid.customer.model.State;
import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.FamilyRelations;
import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.CustomerBean;
import com.ifli.rapid.services.helper.beans.CustomerFamilyBean;
import com.ifli.rapid.services.helper.beans.CustomerVO;
import com.ifli.rapid.services.util.JsonHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Component;

@Component
public interface IFLCustomerService {

	public Config_Mst_GenericMaster getGenericMasterData(String masterType,String masterKey);
	
	
	public CustomerVO getCustomerPersonalDetails(int contactId);
	
	public CustomerVO getCustomerPermanantDetails(int contactId);
	
	public CustomerVO getCustomerOfficeDetails(int contactId);
	
	public CustomerVO getCustomerCommunicationDetails(String policyNo);
	
	public List<CustomerFamilyBean>  getCustomerFamilyDetails(int contactId);
	
	public String  saveHistoryDetails(QrcHistoryModel qrcHistoryObj);
	
	public String getCityName(int cityId);
	
	public String getStateName(int stateId);
	
	public CustomerBean getContactDetailsByCustomerId(int custId) throws Exception;
	
	public void updateContactDetails(CustomerBean customerBean) throws Exception;
	
	public void otpCreate(String otp,int custId) throws Exception;
	
	public Map otpCheck(String otp,int custId) throws Exception;
	
	public Map updateConfirmContactDetails(String jsonData) throws Exception;
	
	public CustomerVO getHistoryDetails(Integer historyId);
	
    public List<City> getCityDetails();
	
	public List<State> getStateDetails();
	
	/*public List<LocMstBranchLocation> getBranchName(int branchId);*/ 
	
	public List<FamilyRelations> getAllFamilyRelations();
	
	public String updateCustomerFamilyDetails(String jsonString,int contactId);
	
	public List<City> getCityNamesByStateId(int stateId); 
	
	public List<Config_Mst_GenericMaster> getGenericMastersByMasterTypeAndMasterKey(String masterType,String masterKey);
	
	public List<Config_Mst_GenericMaster> getGenericMastersByMasterType(String masterType);

	public List<BranchDetails>  getAllBranches();
	
	
    public int getBrancLocationDetails(int cityId, int stateId, int pinno);
	
	public List<LocMstBranchLocation> getBranchDetails(int locationId);
}
