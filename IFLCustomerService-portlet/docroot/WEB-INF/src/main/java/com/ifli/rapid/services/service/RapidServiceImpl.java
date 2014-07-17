/**
 * 
 */
package com.ifli.rapid.services.service;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author allvy user
 * 
 */
public class RapidServiceImpl {

	public List<CommonModel> getRecommendedProducts() {

		BaseService service = new BaseService();

		String data = service
				.executeGet(RAPIDContants.GET_RECOMMENDED_PRODUCTS);

		Gson gson = new Gson();
		Map<String, String> recomendedProductList = new HashMap<String, String>();
		recomendedProductList = gson.fromJson(data,
				recomendedProductList.getClass());
		CommonModel model = new CommonModel();

		List<CommonModel> modelList = new ArrayList<CommonModel>();

		for (String key : recomendedProductList.keySet()) {
			model = new CommonModel();

			model.setProductKey(key);
			model.setProductId(recomendedProductList.get(key));
			model.setImgUrl(ResourceManager.getLabels(key + ".mostPopular"));
			model.setProductName(ResourceManager.getLabels(key + ".name"));

			modelList.add(model);
		}

		return modelList;

	}

	public CommonModel getCityAndState(String pincode) {

		BaseService service = new BaseService();

		String data = service
				.executeGet(RAPIDContants.GET_CITY_STATE + pincode);

		Gson gson = new Gson();

		CommonModel model = new CommonModel();

		Map<String, LinkedTreeMap<String, LinkedTreeMap<String, String>>> cityStateMainMap = new LinkedTreeMap<String, LinkedTreeMap<String, LinkedTreeMap<String, String>>>();

		cityStateMainMap = gson.fromJson(data, cityStateMainMap.getClass());

		if (cityStateMainMap != null && cityStateMainMap.size() != 0) {

			LinkedTreeMap<String, LinkedTreeMap<String, String>> cityStateSubMap = cityStateMainMap
					.get(pincode);

			LinkedTreeMap<String, String> StateMap = cityStateSubMap
					.get("state");
			LinkedTreeMap<String, String> cityMap = cityStateSubMap.get("city");
			if (StateMap != null & StateMap.size() != 0) {

				model.setStateId(StateMap.get("id"));
				model.setStateName(StateMap.get("name"));
			}
			if (cityMap != null & cityMap.size() != 0) {

				model.setCityId(cityMap.get("id"));
				model.setCityName(cityMap.get("name"));
			}

		}

		return model;

	}

	public CommonModel getBranchDetails() {

		BaseService service = new BaseService();

		String data = service.executeGet(RAPIDContants.GET_BRANCH_DETAILS);

		Gson gson = new Gson();

		CommonModel model = new CommonModel();

		Map<String, List<LinkedTreeMap<String, String>>> cityStateMainMap = new LinkedTreeMap<String, List<LinkedTreeMap<String, String>>>();

		cityStateMainMap = gson.fromJson(data, cityStateMainMap.getClass());

		if (cityStateMainMap != null && cityStateMainMap.size() != 0) {

			List<LinkedTreeMap<String, String>> branchDetailsList = cityStateMainMap
					.get(RAPIDContants.BranchesCons);

			for (LinkedTreeMap<String, String> branchMap : branchDetailsList) {

				System.out.println(branchMap.get("Name"));
				System.out.println(branchMap.get("Id"));
				System.out.println(branchMap.get("Code"));
			}

		}

		return model;

	}
	/**
	 * get teh policy details based on policy Id
	 * @return
	 */

	public CommonModel getPolicyDetails(String policyId) {

		BaseService service = new BaseService();

		String data = service.executeGet(RAPIDContants.GET_POLICY_DETAILS);

		Gson gson = new Gson();

		CommonModel model = new CommonModel();

		LinkedTreeMap<String, Object> policyDetails = new LinkedTreeMap<String, Object>();

		policyDetails = gson.fromJson(data, policyDetails.getClass());

		if (policyDetails != null && policyDetails.size() != 0) {
			System.out.println("policyNo============"+policyDetails.get("policyNo"));  
			System.out.println("policyHolderName============"+policyDetails.get("policyHolderName")); 
			System.out.println("dateOfBirth============"+policyDetails.get("dateOfBirth")); 
			System.out.println("productKey============"+policyDetails.get("productKey")); 
			System.out.println("firstPremiumAmount============"+policyDetails.get("firstPremiumAmount")); 
			System.out.println("ageExtraAmount============"+policyDetails.get("ageExtraAmount")); 
			System.out.println("amount============"+policyDetails.get("amount")); 
			System.out.println("isProductRider============"+policyDetails.get("isProductRider")); 
			System.out.println("isQuoteRider============"+policyDetails.get("isQuoteRider")); 
			
			
		}

		return model;

	}
	
	public void getFundPerformance(){
		
		BaseService service = new BaseService();

		String data = service.executeGet(RAPIDContants.	GET_POLICY_PERFORMANCE);

		Gson gson = new Gson();

		CommonModel model = new CommonModel();

		List<LinkedTreeMap<String, Object>> fundDetails = new ArrayList<LinkedTreeMap<String, Object>>();

		fundDetails = gson.fromJson(data, fundDetails.getClass());

		if (fundDetails != null && fundDetails.size() != 0) {
			
			LinkedTreeMap<String, Object> fuindperformanceMin= fundDetails.get(0);
			
			
			System.out.println("fundId============"+fuindperformanceMin.get("fundId"));  
			System.out.println("fundName============"+fuindperformanceMin.get("fundName")); 
			System.out.println("fundBenchmark============"+fuindperformanceMin.get("fundBenchmark")); 
			
			
			
			
		}

	}

public void getCustomerAddress(){
		
		BaseService service = new BaseService();

		String data = service.executeGet(RAPIDContants.GET_CUSTOMER_ADDRESS);

		Gson gson = new Gson();

		CommonModel model = new CommonModel();

		Map<String, String> fundDetails = new LinkedTreeMap<String, String>();
		
		fundDetails = gson.fromJson(data, fundDetails.getClass());

		if (fundDetails != null && fundDetails.size() != 0) {
			
			
			
			
			System.out.println("addressLine1============"+fundDetails.get("addressLine1"));  
			System.out.println("addressLine2============"+fundDetails.get("addressLine2")); 
			System.out.println("addressLine3============"+fundDetails.get("addressLine3")); 
			System.out.println("state============"+fundDetails.get("state")); 
			System.out.println("city============"+fundDetails.get("city")); 
			
			System.out.println("pinCode============"+fundDetails.get("pinCode")); 
			
			
			
			
		}

	}

public void getPolicyBaseFunds(){
	
	BaseService service = new BaseService();

	String data = service.executeGet(RAPIDContants.GET_POLICY_BASE_FUNDS);

	Gson gson = new Gson();

	CommonModel model = new CommonModel();

	Map<String, Object> fundDetails = new LinkedTreeMap<String, Object>();
	
	fundDetails = gson.fromJson(data, fundDetails.getClass());

	if (fundDetails != null && fundDetails.size() != 0) {
			
		System.out.println("================================QuoteDetails============");
		System.out.println(fundDetails.get("QuoteDetails"));  
		
		
		
	}

}


	
}
