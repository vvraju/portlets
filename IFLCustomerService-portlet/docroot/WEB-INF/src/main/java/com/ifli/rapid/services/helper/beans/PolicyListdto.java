package com.ifli.rapid.services.helper.beans;

public class PolicyListdto {

	
	private String policynum;
	private String doctype;
	private String finyear;
	private String downloadPath;
	
	public String getDownloadPath() {
		return downloadPath;
	}
	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}
	public String getPolicynum() {
		return policynum;
	}
	public void setPolicynum(String policynum) {
		this.policynum = policynum;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public String getFinyear() {
		return finyear;
	}
	public void setFinyear(String finyear) {
		this.finyear = finyear;
	}
	
}
