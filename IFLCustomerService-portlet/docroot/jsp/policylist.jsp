<%
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<portlet:resourceURL id="downloadpolicyURL" var="downloadpolicyURL" >

</portlet:resourceURL>
<%-- <portlet:actionURL var="downloadpolicyURL" name="downloadPolicyReport">
</portlet:actionURL>  --%>
<portlet:renderURL var="policysearchURL" >

</portlet:renderURL>


<div class="tab1content"> 
<br>

<aui:form action="${policysearchURL}" method="post" name="search" id="pofm">
<div class="form_sub">

	<aui:select label="Document Type"   name="cust_doctype">
    	 <aui:option value="0" selected="true">Select Document </aui:option>
    	 
    	  <c:forEach items="${doctypes}" var="doctype">
    	  <aui:option value="${doctype.ID}">${doctype.DOC_NAME}</aui:option>  
    	   </c:forEach>  
	     <%-- <aui:option value="Renewal Premium Receipt">Renewal Premium Receipt</aui:option>  
	     <aui:option value="Anniversary Statement">Anniversary Statement</aui:option>  
	     <aui:option value="Premium Paid Certificate">Premium Paid Certificate</aui:option> 
	     <aui:option value="Scanned Medical Record">Scanned Medical Record</aui:option>   --%>
	       
       	</aui:select>
       	<div class="clr"> </div>
    </div>
       	
       	<div class="form_sub">
       	<aui:select label="Policy Number"   name="cust_policynum" >
    	 <aui:option value="0" selected="true">Select PolicyNumber </aui:option>
    	 <aui:option value="${policylist.POLICY_ID}"> ${policylist.POLICY_ID} </aui:option>  
         <%-- <c:forEach items="${policylist}" var="pol_list">
	     	<aui:option value="${pol_list.POLICY_ID}"> ${pol_list.POLICY_ID} </aui:option>  
         </c:forEach>  --%>
       	</aui:select>
       	
       	<div class="clr"> </div>
    </div>
    
    <div class="form_sub">
       	<aui:select label="Financial Year"   name="cust_fincyear">
    	 <aui:option value="0" selected="true">Select Year </aui:option>
    	 
    	  <c:forEach items="${fyears}" var="fyear">
	     <aui:option value="${fyear}" >${fyear}</aui:option>  
	     </c:forEach>
	     <%-- <aui:option value="${curryear}" >${curryear}</aui:option>  
	     <aui:option value="${nextyear}" >${nextyear}</aui:option>   --%>
       	</aui:select>
      <div class="clr"> </div>
    </div> 	
	<aui:button-row class="form_sub">
		<aui:button type="submit" name="Submit"  value="Submit" ></aui:button>
		<aui:button type="reset" name="clear"  value="Clear"  onClick="return resetFunction()"></aui:button>
	</aui:button-row>
</aui:form>

</div>

<div class="clr"> </div>
<div class="tab1content">

<h3>Policy List Details</h3>

<b>${welcomemsg1} </b>
<b>${welcomemsg2} </b>
<b>${welcomemsg} </b>
<br>
	
	

	
	
 <table width="68%" cellspacing="0" cellpadding="0" border="1">
	<tr >
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">Year</td>
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">Document Type</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Actions</td>
	</tr>
	<c:if test="${docflag == 'pp'}">

		<c:forEach items="${ppdetails}" var="ppolicy">
	<tr>
		
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">${ppolicy.financial_Year}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">${doctype}</td>
		
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center"><aui:a href="${downloadpolicyURL}&policynum=${ppolicy.contrNo}&fyear=${ppolicy.financial_Year}&doctype=${doctype}" helpMessage="click here" label="Download" target="_blank" onClick="<%=downloadpolicyURL.toString()%>" ></aui:a></td>
	</tr>
		</c:forEach>
	</c:if>
		
		<c:if test="${docflag == 'renewal'}">
		<c:forEach items="${rprdetails}" var="renedetail">
	<tr>
		
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">${renedetail.receipt_Date}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">${doctype}</td>

		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center"><aui:a href="${downloadpolicyURL}&policynum=${renedetail.contrNo}&fyear=${renedetail.receipt_Date}&doctype=${doctype}" helpMessage="click here" label="Download" target="_blank" onClick="<%=downloadpolicyURL.toString()%>" ></aui:a></td>
	</tr>
		</c:forEach>
		</c:if>
		
		<c:if test="${docflag == 'us'}">
		
	<tr>
		
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">${fyear}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">${doctype}</td>
		
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center"><aui:a href="${downloadpolicyURL}&policynum=${policyno}&fyear=${fyear}&doctype=${doctype}" helpMessage="click here" label="Download" target="_blank" onClick="<%=downloadpolicyURL.toString()%>" ></aui:a></td>
	</tr>
		
		</c:if>
		
		<c:if test="${docflag == 'notype'}">
		<c:forEach items="${renedetails}" var="renedetail">
	<tr>
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">NO Data </td>
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center"></td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center"></td>
	</tr>
		</c:forEach>
		</c:if>
</table> 


</div>
       	
       	
	<%-- <aui:button-row >
		
		<aui:button  name="Back"  value="Back" onClick="<%=policysearchURL.toString()%>"></aui:button>
	</aui:button-row> --%>
	
<script>
AUI().ready(function(A) {
$('.topnav_tabs span').removeClass('active');
$('.topnav_tabs .download_policy').addClass('active');	
});
</script>
