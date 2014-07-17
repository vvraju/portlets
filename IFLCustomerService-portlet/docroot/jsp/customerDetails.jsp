<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/jsp/init.jsp"%>


<portlet:renderURL var="customerDetails">
	<portlet:param name="action" value="customerDetails" />
</portlet:renderURL>
<portlet:renderURL var="corporate" >
	<portlet:param name="action" value="corporate" />
</portlet:renderURL>

<div class="row-fluid"><%@ include file="/jsp/corporateSubHeader.jsp"%></div>
<div class="clr"></div>
<div class="tab1content"><br>
<div class="row-fluid" id="custFileds">
       <div class="form_sub fundswitchform " >
			<label>Policy Id</label>
				<input type="text" name="policyId" id="policyId" value=""/>
				
				<div class="clr"></div>
			</div>
			
			<div class="clr"></div>
			 <div class="form_sub fundswitchform" >
			<label>Name</label>
				<input type="text" name="cName" id="cName" value=""/>
				
				<div class="clr"></div>
			</div>
			<div class="clr"></div>
			<div class="form_sub " >   
			<label>Mobile</label>     
        <input type="text" name="txtPhNo" id="mobileNum" value="" maxlength="10" />
        <div class="clr"> </div>     
    </div>
			  <div class="clr"> </div>  
			
			 <div class="form_sub fundswitchform ">
			<label>Email Id</label>
				<input type="text" name="emailId" id="emailId" value=""/>
				
				<div class="clr"></div>
			</div>
			
			<div class="clr"></div>
			<div class="form_sub">
			<input type="submit"  Class="btn custSearchBtn" id="custSearchBtn" name="custSearchBtn" value="Search" />
			</div>
			<div class="clr"></div>
</div>
</div>
<!-- <div id="customerDetailsDisply"></div> -->

<div id="customerDetailsDisply" class="tab2content custTable">
	<liferay-portlet:runtime portletName="56"></liferay-portlet:runtime>
	<div class="clear"></div>
	<br />
<c:if test="${not empty policyList}">
	<table width="100%" cellspacing="0" cellpadding="0" border="1"
		style="margin-left: 9px;">
		<tr>
		    
			<td class="table_colum" valign="middle" bgcolor="#eff7fa"
				align="center">Policy ID</td>
				<td class="table_colum" valign="middle" bgcolor="#eff7fa"
				align="center">Customer Name</td>
			<td class="table_colum" valign="middle" bgcolor="#eff7fa"
				align="center">Product Name</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
				align="center">Current Status</td>
						
		</tr>

			<tr style="border-bottom: 1pt solid #ccc;">

				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center"><input type="checkbox" id="chkcustPid" name="chkAccept" /><span id="policyId">${policyList.POLICY_ID}</span></td>
					
					<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center"><span id="fName">${policyList.POLICY_HOLDER1_FIRST_NAME}</span></td>
					
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${policyList.PRODUCT_NAME}</td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${policyList.CURRENT_STATUS} </td>
				
		   </tr>


	</table>
	
	</c:if>
	
	<br />
     <div class="table_heading right" style=" display: none;" id="custcorporateButttons">
     <input type="button"  id="custQueryBtn" name="custSearchBtn" value="Query" class="btn"/>
     <a href="<%=corporate%>?reqtype=FS&policyId=${policyList.POLICY_ID}"><input type="button"  id="custRequestBtn" name="custSearchBtn" value="Request" class="btn"/></a>
     <input type="button"  id="custComplaintBtn" name="custSearchBtn" value="Complaint" class="btn"/>
    
     </div>

</div>



<div class="errorDialog"></div>
<script>
$(function(){
	

$('#custSearchBtn').click(function(){
	$("#custFileds").hide();
	
	var policyId=$('#policyId').val();
	//var fname=$('#fName').val();
	window.location='<%=customerDetails%>&policyId='+policyId;
	
	
<%--  $.ajax({
	url : '<%=getCustomerDetails%>',
	method : 'GET',
	data:{policyId:policyId},
	success : function(result) {
		alert(result);
		$(".custTable").show();
		$("#customerDetailsDisply").html(result);
		
	}

});
 --%>  
});
 
 $("#chkcustPid").click(function(){
		$("#custcorporateButttons").show();
		
	});

		
}); 


</script>
<script>

 

AUI().ready(function(A) {
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .my_profile').addClass('active');
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .Myaccount').addClass('active');
	
	
				
});




</script>