package com.ifli.rapid.services.helper.beans;

public class PolicyYears {

	
	private int id;
	private String val;
	private String policyNo;
	private String productName;
	private String policyStatus;
	private String premiumDueDate;
	private String premiumAmount;
	private String sumAssured;
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPremiumDueDate() {
		return premiumDueDate;
	}
	public void setPremiumDueDate(String premiumDueDate) {
		this.premiumDueDate = premiumDueDate;
	}
	public String getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(String sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
}
