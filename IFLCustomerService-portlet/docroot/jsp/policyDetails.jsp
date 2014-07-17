<%@ include file="/jsp/init.jsp" %>

<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>

<%@ include file="/jsp/subHeader.jsp"%> 

<div class="clr"></div>

<div id="" class="tab2content">	
 <liferay-portlet:runtime portletName="56"></liferay-portlet:runtime>
   <div class="clear"></div><br />
    
    <table width="100%" cellspacing="0" cellpadding="0" border="1" style="margin-left:9px;">
	<tr >
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">Product Name</td>
		<td class="table_colum" valign="middle" bgcolor="#eff7fa" align="center">Policy Number</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Status</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Premium Date</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Total Premium<br />Installment</td>
		<!-- <td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Fund Details</td> -->
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Sum Assured</td>
		<!-- <td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Payment<br />Summary</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa" align="center">Financial<br />Consultant</td> -->
	</tr>
	<c:forEach items="${policyDetails}" var="ppolicy">
	
	<tr style="border-bottom:1pt solid #ccc;">
		
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.productName}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.policyNo}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.policyStatus}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.premiumDueDate}</td>
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.premiumAmount}</td>
		<!-- <td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center"></td> -->
		<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${ppolicy.sumAssured}</td>
	   <!--  <td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center"></td>
	    <td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center"></td> -->
	
	
	</tr>
		</c:forEach>
	
		
</table><br />


</div>



<script>

AUI().ready(function(A) {
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .my_policy_details').addClass('active');
	
	sessionStorage.corporateFundSwitch = "false";
	
	fundSwitch.initWindow();
	fundSwitch.setUp();	
	
});


</script>
