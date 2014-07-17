/**
 * 
 */
package com.ifli.rapid.services.service;

import com.ifli.rapid.services.helper.beans.CustomerMailBean;

import java.util.List;

/**
 * @author allvy user
 *
 */
public class QrcHistoryModel {

	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String custId;
	private String type;
	private String success;
	private String error;
	private String changeType;
	private String email;
	private String mobile;
	private String ofcPhone;
	private String resPhone;
	private String city;
	private String State;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String pincode;
	private String cityId;
	private String StateId;
	private String addrTypeId;
	private String addrId;
	private String status;
	private String typeDesc;
	private String subTypeDesc;
	private String policyNo;
	private String enterDate;
	private String srNumbr;
	private String sources;
	private String product;
	private String ageing;
	private String srTime;
	private String email1;
	private String email2;
	private String email3;
	private String email4;
	private String email5;
	private String mobile1;
	private String mobile2;
	private String mobile3;
	private String mobile4;
	private String mobile5;
	private List<CustomerMailBean> mailList;
	private List<CustomerMailBean> mobileList;
	
	
	
	
	private String oldFirstName;
	private String oldMiddleName;
	private String oldLastName;
	private String oldDob;
	private String oldCustId;
	private String oldEmail;
	private String oldMobile;
	private String oldOfcPhone;
	private String oldResPhone;
	private String oldCity;
	private String oldState;
	private String oldAddrLine1;
	private String oldAddrLine2;
	private String oldAddrLine3;
	private String oldPincode;
	private String oldCityId;
	private String oldStateId;
	private String oldAddrTypeId;
	private String oldAddrId;
	private String oldStatus;
	private String oldTypeDesc;
	private String oldSubTypeDesc;
	private String oldPolicyNo;
	private String oldEnterDate;
	private String oldEmail1;
	private String oldEmail2;
	private String oldEmail3;
	private String oldEmail4;
	private String oldEmail5;
	private String oldMobile1;
	private String oldMobile2;
	private String oldMobile3;
	private String oldMobile4;
	private String oldMobile5;
	
	private String pickUpPinCode;

	private String pickUpCity;
	private String pickUpState;
	private String pickUpCityId;
	private String pickUpStateId;
	private String pickUpAddressLine1;
	private String pickUpAddressLine2;
	private String pickUpAddressLine3;
	
	



	private String isNewAddress;
	
	public String getIsNewAddress() {
		return isNewAddress;
	}
	public void setIsNewAddress(String isNewAddress) {
		this.isNewAddress = isNewAddress;
	}
	
	public String getPickUpPinCode() {
		return pickUpPinCode;
	}
	public void setPickUpPinCode(String pickUpPinCode) {
		this.pickUpPinCode = pickUpPinCode;
	}
	public String getPickUpCity() {
		return pickUpCity;
	}
	public void setPickUpCity(String pickUpCity) {
		this.pickUpCity = pickUpCity;
	}
	public String getPickUpState() {
		return pickUpState;
	}
	public void setPickUpState(String pickUpState) {
		this.pickUpState = pickUpState;
	}
	public String getPickUpCityId() {
		return pickUpCityId;
	}
	public void setPickUpCityId(String pickUpCityId) {
		this.pickUpCityId = pickUpCityId;
	}
	public String getPickUpStateId() {
		return pickUpStateId;
	}
	public void setPickUpStateId(String pickUpStateId) {
		this.pickUpStateId = pickUpStateId;
	}
	public String getPickUpAddressLine1() {
		return pickUpAddressLine1;
	}
	public void setPickUpAddressLine1(String pickUpAddressLine1) {
		this.pickUpAddressLine1 = pickUpAddressLine1;
	}
	public String getPickUpAddressLine2() {
		return pickUpAddressLine2;
	}
	public void setPickUpAddressLine2(String pickUpAddressLine2) {
		this.pickUpAddressLine2 = pickUpAddressLine2;
	}
	public String getPickUpAddressLine3() {
		return pickUpAddressLine3;
	}
	public void setPickUpAddressLine3(String pickUpAddressLine3) {
		this.pickUpAddressLine3 = pickUpAddressLine3;
	}
	
	
	
	private List<CustomerMailBean> oldMailList;
	private List<CustomerMailBean> oldMobileList;
	private String gender;
	private String oldGender;
	
	private String pancard;	
	private String oldPancard;
	
	private String designation;
	private String oldDesignation;
	
	private String department;
	
	private String oldDepartment;
	
	private String off_Business_Name;
	
	private String oldOff_Business_Name;
	
	
	private String family_Mem_Name;
	private String family_Mem_Relation;
	private String family_Mem_Age;
	private String family_Mem_Dependent;
	private String oldFamily_Mem_Name;
	private String oldFamily_Mem_Relation;
	private String oldFamily_Mem_Age;
	private String oldFamily_Mem_Dependent;
	private String fundName;
	private String navValue;
	private String numUnits;
	private String fundValue;
	private String PremiumRedirection;
	private String NewAllocation;
	private String PremiumAmountAllocation;
    private Integer contactId;
	private Integer createdContactId;
	private Integer createdBy;
	private String requestType;
	private String oldRequestType;
	private String changeRequestType;
	
	private String caseDetails;
	
    private String channel;
	
	private String comments;
	
	private String isSignVerified;
	
	private String requestId;
	
	private String source;
	
	private String category;
	
	private String callType;
	
	private String callSubType;
	
	
	private String isManual;
	
	private String pickupDate;
	private String pickupTime;
	private int branchId;
	
	
	public String getIsManual() {
		return isManual;
	}
	public void setIsManual(String isManual) {
		this.isManual = isManual;
	}
	public String getCaseDetails() {
		return caseDetails;
	}
	public void setCaseDetails(String caseDetails) {
		this.caseDetails = caseDetails;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getIsSignVerified() {
		return isSignVerified;
	}
	public void setIsSignVerified(String isSignVerified) {
		this.isSignVerified = isSignVerified;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getCallSubType() {
		return callSubType;
	}
	public void setCallSubType(String callSubType) {
		this.callSubType = callSubType;
	}
	
	public String getChangeRequestType() {
		return changeRequestType;
	}
	public void setChangeRequestType(String changeRequestType) {
		this.changeRequestType = changeRequestType;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public Integer getCreatedContactId() {
		return createdContactId;
	}
	public void setCreatedContactId(Integer createdContactId) {
		this.createdContactId = createdContactId;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	
	
	public String getAllocation() {
		return allocation;
	}
	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}
	private String allocation;
	
	public String getPremiumRedirection() {
		return PremiumRedirection;
	}
	public void setPremiumRedirection(String premiumRedirection) {
		PremiumRedirection = premiumRedirection;
	}
	public String getNewAllocation() {
		return NewAllocation;
	}
	public void setNewAllocation(String newAllocation) {
		NewAllocation = newAllocation;
	}
	public String getPremiumAmountAllocation() {
		return PremiumAmountAllocation;
	}
	public void setPremiumAmountAllocation(String premiumAmountAllocation) {
		PremiumAmountAllocation = premiumAmountAllocation;
	}


	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getNavValue() {
		return navValue;
	}
	public void setNavValue(String navValue) {
		this.navValue = navValue;
	}
	public String getNumUnits() {
		return numUnits;
	}
	public void setNumUnits(String numUnits) {
		this.numUnits = numUnits;
	}
	public String getFundValue() {
		return fundValue;
	}
	public void setFundValue(String fundValue) {
		this.fundValue = fundValue;
	}

	
	
	public String getOldFamily_Mem_Name() {
		return oldFamily_Mem_Name;
	}
	public void setOldFamily_Mem_Name(String oldFamily_Mem_Name) {
		this.oldFamily_Mem_Name = oldFamily_Mem_Name;
	}
	public String getOldFamily_Mem_Relation() {
		return oldFamily_Mem_Relation;
	}
	public void setOldFamily_Mem_Relation(String oldFamily_Mem_Relation) {
		this.oldFamily_Mem_Relation = oldFamily_Mem_Relation;
	}
	public String getOldFamily_Mem_Age() {
		return oldFamily_Mem_Age;
	}
	public void setOldFamily_Mem_Age(String oldFamily_Mem_Age) {
		this.oldFamily_Mem_Age = oldFamily_Mem_Age;
	}
	public String getOldFamily_Mem_Dependent() {
		return oldFamily_Mem_Dependent;
	}
	public void setOldFamily_Mem_Dependent(String oldFamily_Mem_Dependent) {
		this.oldFamily_Mem_Dependent = oldFamily_Mem_Dependent;
	}
	
	
	public String getFamily_Mem_Name() {
		return family_Mem_Name;
	}
	public void setFamily_Mem_Name(String family_Mem_Name) {
		this.family_Mem_Name = family_Mem_Name;
	}
	public String getFamily_Mem_Relation() {
		return family_Mem_Relation;
	}
	public void setFamily_Mem_Relation(String family_Mem_Relation) {
		this.family_Mem_Relation = family_Mem_Relation;
	}
	public String getFamily_Mem_Age() {
		return family_Mem_Age;
	}
	public void setFamily_Mem_Age(String family_Mem_Age) {
		this.family_Mem_Age = family_Mem_Age;
	}
	public String getFamily_Mem_Dependent() {
		return family_Mem_Dependent;
	}
	public void setFamily_Mem_Dependent(String family_Mem_Dependent) {
		this.family_Mem_Dependent = family_Mem_Dependent;
	}

	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOldDesignation() {
		return oldDesignation;
	}
	public void setOldDesignation(String oldDesignation) {
		this.oldDesignation = oldDesignation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOldDepartment() {
		return oldDepartment;
	}
	public void setOldDepartment(String oldDepartment) {
		this.oldDepartment = oldDepartment;
	}
	public String getOff_Business_Name() {
		return off_Business_Name;
	}
	public void setOff_Business_Name(String off_Business_Name) {
		this.off_Business_Name = off_Business_Name;
	}
	public String getOldOff_Business_Name() {
		return oldOff_Business_Name;
	}
	public void setOldOff_Business_Name(String oldOff_Business_Name) {
		this.oldOff_Business_Name = oldOff_Business_Name;
	}
	
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getOldPancard() {
		return oldPancard;
	}
	public void setOldPancard(String oldPancard) {
		this.oldPancard = oldPancard;
	}

	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOldGender() {
		return oldGender;
	}
	public void setOldGender(String oldGender) {
		this.oldGender = oldGender;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getChangeType() {
		return changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOfcPhone() {
		return ofcPhone;
	}
	public void setOfcPhone(String ofcPhone) {
		this.ofcPhone = ofcPhone;
	}
	public String getResPhone() {
		return resPhone;
	}
	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getAddrLine3() {
		return addrLine3;
	}
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getStateId() {
		return StateId;
	}
	public void setStateId(String stateId) {
		StateId = stateId;
	}
	public String getAddrTypeId() {
		return addrTypeId;
	}
	public void setAddrTypeId(String addrTypeId) {
		this.addrTypeId = addrTypeId;
	}
	public String getAddrId() {
		return addrId;
	}
	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public String getSubTypeDesc() {
		return subTypeDesc;
	}
	public void setSubTypeDesc(String subTypeDesc) {
		this.subTypeDesc = subTypeDesc;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getSrNumbr() {
		return srNumbr;
	}
	public void setSrNumbr(String srNumbr) {
		this.srNumbr = srNumbr;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAgeing() {
		return ageing;
	}
	public void setAgeing(String ageing) {
		this.ageing = ageing;
	}
	public String getSrTime() {
		return srTime;
	}
	public void setSrTime(String srTime) {
		this.srTime = srTime;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmail3() {
		return email3;
	}
	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	public String getEmail4() {
		return email4;
	}
	public void setEmail4(String email4) {
		this.email4 = email4;
	}
	public String getEmail5() {
		return email5;
	}
	public void setEmail5(String email5) {
		this.email5 = email5;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getMobile3() {
		return mobile3;
	}
	public void setMobile3(String mobile3) {
		this.mobile3 = mobile3;
	}
	public String getMobile4() {
		return mobile4;
	}
	public void setMobile4(String mobile4) {
		this.mobile4 = mobile4;
	}
	public String getMobile5() {
		return mobile5;
	}
	public void setMobile5(String mobile5) {
		this.mobile5 = mobile5;
	}
	public List<CustomerMailBean> getMailList() {
		return mailList;
	}
	public void setMailList(List<CustomerMailBean> mailList) {
		this.mailList = mailList;
	}
	public List<CustomerMailBean> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<CustomerMailBean> mobileList) {
		this.mobileList = mobileList;
	}
	public String getOldFirstName() {
		return oldFirstName;
	}
	public void setOldFirstName(String oldFirstName) {
		this.oldFirstName = oldFirstName;
	}
	public String getOldMiddleName() {
		return oldMiddleName;
	}
	public void setOldMiddleName(String oldMiddleName) {
		this.oldMiddleName = oldMiddleName;
	}
	public String getOldLastName() {
		return oldLastName;
	}
	public void setOldLastName(String oldLastName) {
		this.oldLastName = oldLastName;
	}
	public String getOldDob() {
		return oldDob;
	}
	public void setOldDob(String oldDob) {
		this.oldDob = oldDob;
	}
	public String getOldCustId() {
		return oldCustId;
	}
	public void setOldCustId(String oldCustId) {
		this.oldCustId = oldCustId;
	}
	public String getOldEmail() {
		return oldEmail;
	}
	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}
	public String getOldMobile() {
		return oldMobile;
	}
	public void setOldMobile(String oldMobile) {
		this.oldMobile = oldMobile;
	}
	public String getOldOfcPhone() {
		return oldOfcPhone;
	}
	public void setOldOfcPhone(String oldOfcPhone) {
		this.oldOfcPhone = oldOfcPhone;
	}
	public String getOldResPhone() {
		return oldResPhone;
	}
	public void setOldResPhone(String oldResPhone) {
		this.oldResPhone = oldResPhone;
	}
	public String getOldCity() {
		return oldCity;
	}
	public void setOldCity(String oldCity) {
		this.oldCity = oldCity;
	}
	public String getOldState() {
		return oldState;
	}
	public void setOldState(String oldState) {
		this.oldState = oldState;
	}
	public String getOldAddrLine1() {
		return oldAddrLine1;
	}
	public void setOldAddrLine1(String oldAddrLine1) {
		this.oldAddrLine1 = oldAddrLine1;
	}
	public String getOldAddrLine2() {
		return oldAddrLine2;
	}
	public void setOldAddrLine2(String oldAddrLine2) {
		this.oldAddrLine2 = oldAddrLine2;
	}
	public String getOldAddrLine3() {
		return oldAddrLine3;
	}
	public void setOldAddrLine3(String oldAddrLine3) {
		this.oldAddrLine3 = oldAddrLine3;
	}
	public String getOldPincode() {
		return oldPincode;
	}
	public void setOldPincode(String oldPincode) {
		this.oldPincode = oldPincode;
	}
	public String getOldCityId() {
		return oldCityId;
	}
	public void setOldCityId(String oldCityId) {
		this.oldCityId = oldCityId;
	}
	public String getOldStateId() {
		return oldStateId;
	}
	public void setOldStateId(String oldStateId) {
		this.oldStateId = oldStateId;
	}
	public String getOldAddrTypeId() {
		return oldAddrTypeId;
	}
	public void setOldAddrTypeId(String oldAddrTypeId) {
		this.oldAddrTypeId = oldAddrTypeId;
	}
	public String getOldAddrId() {
		return oldAddrId;
	}
	public void setOldAddrId(String oldAddrId) {
		this.oldAddrId = oldAddrId;
	}
	public String getOldStatus() {
		return oldStatus;
	}
	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}
	public String getOldTypeDesc() {
		return oldTypeDesc;
	}
	public void setOldTypeDesc(String oldTypeDesc) {
		this.oldTypeDesc = oldTypeDesc;
	}
	public String getOldSubTypeDesc() {
		return oldSubTypeDesc;
	}
	public void setOldSubTypeDesc(String oldSubTypeDesc) {
		this.oldSubTypeDesc = oldSubTypeDesc;
	}
	public String getOldPolicyNo() {
		return oldPolicyNo;
	}
	public void setOldPolicyNo(String oldPolicyNo) {
		this.oldPolicyNo = oldPolicyNo;
	}
	public String getOldEnterDate() {
		return oldEnterDate;
	}
	public void setOldEnterDate(String oldEnterDate) {
		this.oldEnterDate = oldEnterDate;
	}
	public String getOldEmail1() {
		return oldEmail1;
	}
	public void setOldEmail1(String oldEmail1) {
		this.oldEmail1 = oldEmail1;
	}
	public String getOldEmail2() {
		return oldEmail2;
	}
	public void setOldEmail2(String oldEmail2) {
		this.oldEmail2 = oldEmail2;
	}
	public String getOldEmail3() {
		return oldEmail3;
	}
	public void setOldEmail3(String oldEmail3) {
		this.oldEmail3 = oldEmail3;
	}
	public String getOldEmail4() {
		return oldEmail4;
	}
	public void setOldEmail4(String oldEmail4) {
		this.oldEmail4 = oldEmail4;
	}
	public String getOldEmail5() {
		return oldEmail5;
	}
	public void setOldEmail5(String oldEmail5) {
		this.oldEmail5 = oldEmail5;
	}
	public String getOldMobile1() {
		return oldMobile1;
	}
	public void setOldMobile1(String oldMobile1) {
		this.oldMobile1 = oldMobile1;
	}
	public String getOldMobile2() {
		return oldMobile2;
	}
	public void setOldMobile2(String oldMobile2) {
		this.oldMobile2 = oldMobile2;
	}
	public String getOldMobile3() {
		return oldMobile3;
	}
	public void setOldMobile3(String oldMobile3) {
		this.oldMobile3 = oldMobile3;
	}
	public String getOldMobile4() {
		return oldMobile4;
	}
	public void setOldMobile4(String oldMobile4) {
		this.oldMobile4 = oldMobile4;
	}
	public String getOldMobile5() {
		return oldMobile5;
	}
	public void setOldMobile5(String oldMobile5) {
		this.oldMobile5 = oldMobile5;
	}
	public List<CustomerMailBean> getOldMailList() {
		return oldMailList;
	}
	public void setOldMailList(List<CustomerMailBean> oldMailList) {
		this.oldMailList = oldMailList;
	}
	public List<CustomerMailBean> getOldMobileList() {
		return oldMobileList;
	}
	public void setOldMobileList(List<CustomerMailBean> oldMobileList) {
		this.oldMobileList = oldMobileList;
	}
	/**
	 * @return the oldRequestType
	 */
	public String getOldRequestType() {
		return oldRequestType;
	}
	/**
	 * @param oldRequestType the oldRequestType to set
	 */
	public void setOldRequestType(String oldRequestType) {
		this.oldRequestType = oldRequestType;
	}
	/**
	 * @return the pickupDate
	 */
	public String getPickupDate() {
		return pickupDate;
	}
	/**
	 * @return the pickupTime
	 */
	public String getPickupTime() {
		return pickupTime;
	}
	/**
	 * @return the branchId
	 */
	public int getBranchId() {
		return branchId;
	}
	/**
	 * @param pickupDate the pickupDate to set
	 */
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	/**
	 * @param pickupTime the pickupTime to set
	 */
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	
	
}
