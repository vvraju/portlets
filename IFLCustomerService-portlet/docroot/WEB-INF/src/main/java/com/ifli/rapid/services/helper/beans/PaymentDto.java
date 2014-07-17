package com.ifli.rapid.services.helper.beans;

import java.io.Serializable;

public class PaymentDto implements Serializable {

	private static final long serialVersionUID = 8524310019839723889L;
	// parameters required for savePayment
	/*private String contactId;*///also use for paymentGatewayIntegration
    private String policyNo;
    private String applicationNo;//also use for paymentGatewayIntegration
    private String premiumAmount;//also use for paymentGatewayIntegration
	private String requestTypeId;
	private String paymentOptionId;
	private String paymentMethodId;
	private String paymentOptionTypeId;
	private String paymentMethodDetailsId;
	private Boolean isBobRequest;
	private String paymentResponse;
	private String paymentId;
	private String requestType;
	private String redirectURL;
	
	//These three parameters are used for savePayByPhone Service
	private String contactId;
	private String payType;
	private String mobile;
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getRequestTypeId() {
		return requestTypeId;
	}
	public void setRequestTypeId(String requestTypeId) {
		this.requestTypeId = requestTypeId;
	}
	public String getPaymentOptionId() {
		return paymentOptionId;
	}
	public void setPaymentOptionId(String paymentOptionId) {
		this.paymentOptionId = paymentOptionId;
	}
	public String getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public String getPaymentOptionTypeId() {
		return paymentOptionTypeId;
	}
	public void setPaymentOptionTypeId(String paymentOptionTypeId) {
		this.paymentOptionTypeId = paymentOptionTypeId;
	}
	public String getPaymentMethodDetailsId() {
		return paymentMethodDetailsId;
	}
	public void setPaymentMethodDetailsId(String paymentMethodDetailsId) {
		this.paymentMethodDetailsId = paymentMethodDetailsId;
	}
	public Boolean getIsBobRequest() {
		return isBobRequest;
	}
	public void setIsBobRequest(Boolean isBobRequest) {
		this.isBobRequest = isBobRequest;
	}
	public String getPaymentResponse() {
		return paymentResponse;
	}
	public void setPaymentResponse(String paymentResponse) {
		this.paymentResponse = paymentResponse;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRedirectURL() {
		return redirectURL;
	}
	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
