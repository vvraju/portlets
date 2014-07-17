<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />




<portlet:resourceURL id="policysearchURL" var="policysearchURL">

</portlet:resourceURL>
<portlet:resourceURL id="downloadpolicyURL" var="downloadpolicyURL">

</portlet:resourceURL>

<portlet:resourceURL id="emailpolicyURL" var="emailpolicyURL"></portlet:resourceURL>
<portlet:resourceURL id="printpolicyURL" var="printpolicyURL"></portlet:resourceURL>

<portlet:resourceURL id="downloadpolicysearch"
	var="downloadpolicysearch" />
<portlet:resourceURL id="getUlipPoliciesByCustId"
	var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFunds" var="getPolicyFunds" />
<portlet:resourceURL id="saveFundswitch" var="saveFundswitch" />
<portlet:resourceURL id="getPolicyYearsById" var="getPolicyYearsById" />
<portlet:resourceURL id="getPoliciesInfo" var="getPoliciesInfo" />
<portlet:resourceURL id="getDocumentsInfo" var="getDocumentsInfo" />

<script>
	var downloadPolicyURLObj = {};
	downloadPolicyURLObj.getUlipPoliciesByCustId= '<%=getUlipPoliciesByCustId%>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	
	downloadPolicyURLObj.getCustomer			= '<%=getCustomer%>&<portlet:namespace/>custId=1';
	
	downloadPolicyURLObj.getPolicyYears		='<%=getPolicyYearsById%>&<portlet:namespace/>policyNum=';
	downloadPolicyURLObj.portletNamespace		= '<portlet:namespace/>';
	downloadPolicyURLObj.getDocumentList	= '<%=downloadpolicysearch%>&<portlet:namespace/>';
	downloadPolicyURLObj.getDownloadUrl	= '<%=downloadpolicyURL%>';
	downloadPolicyURLObj.getEmailPolicyUrl	= '<%=emailpolicyURL%>';
	downloadPolicyURLObj.getPrintPolicyUrl	= '<%=printpolicyURL%>';
	downloadPolicyURLObj.getPoliciesInfo	= '<%=getPoliciesInfo%>&<portlet:namespace/>policyNum=';
	downloadPolicyURLObj.getDocumentsInfo	= '<%=getDocumentsInfo%>';
	
</script>


<div class="tab1content" >
<div class="form_sub">

	<aui:select label="Policy No" name="cust_policynum"
		id="cust_policynum">
		<aui:option value="0" selected="true"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.selectpolicy" /> </aui:option>
		<aui:option value="${policylist.POLICY_ID}"> ${policylist.POLICY_ID} </aui:option>

	</aui:select>
	<div class="clr"></div>
</div>

<div class="form_sub middlefield">

	<aui:select label="Document Type" name="cust_doctype" id="cust_doctype">
		<aui:option value="0" selected="true"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.selectdocument" /> </aui:option>

		<c:forEach items="${doctypes}" var="doctype">
			<aui:option value="${doctype.ID}">${doctype.DOC_NAME}</aui:option>
		</c:forEach>

	</aui:select>
	<div class="clr"></div>
</div>

<div class="form_sub rightfield">
<div id="policyNum">
	<aui:select label="Financial Year" name="cust_fincyear"
		id="cust_fincyear">
		<aui:option value="0" selected="true"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.selectyear" /> </aui:option>

		<%--  <c:forEach items="${fyears}" var="fyear">
	     <aui:option value="${fyear}" >${fyear}</aui:option>  
	     </c:forEach> --%>

	</aui:select>
</div>
</div>
<div id="downloadPbtns" style="display: none;">
<aui:button-row cssClass="button-class">

	<aui:button type="button" name="downloadpolicylist" value="Submit"
		id="downloadpolicylist"></aui:button>
	<aui:button name="downloadPBtnCancel" value="Cancel"
		id="downloadPBtnCancel"></aui:button>
</aui:button-row>

</div>
</div>
<%-- </aui:form> --%>

 

<div class="tab2content" style="display:none;" >

	<h4 class="heading" style="padding-top: 90px;"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.policylistdetails" /></h4>

	<div id="downloadPolicyTableId" style="clear:both;"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.norecordsfound" /></div>


</div>



<script src="/IFLService-theme/js/js-dev/downloadpolicy.js"></script>


<script>

AUI().ready(function(A) {
$('.topnav_tabs span').removeClass('active');
$('.topnav_tabs .download_policy').addClass('active');	

});

$("#policyNum").change(function(){
	$("#downloadPbtns").show();
});
</script>

