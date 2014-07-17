<%@ include file="/jsp/init.jsp" %>

<%@ include file="/jsp/addressChangeDocuments.jsp"%>


<portlet:renderURL var="addressChangeConfirm" >
	<portlet:param name="action" value="addressChangeConfirm" />
</portlet:renderURL>

<portlet:renderURL var="contactChangeConfirm" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="contactChangeConfirm" />
</portlet:renderURL>
<portlet:resourceURL>
	<portlet:param name="" value=""/>
</portlet:resourceURL>

<portlet:resourceURL id="getPersonalDetails" var="getPersonalDetails" />
<portlet:resourceURL id="getContactDetails" var="getContactDetails" />
<portlet:resourceURL id="getPermanentAddress" var="getPermanentAddress" />
<portlet:resourceURL id="getCommunicationAddress" var="getCommunicationAddress" />
<portlet:resourceURL id="getOfficeAddress" var="getOfficeAddress" />
<portlet:resourceURL id="getFamilyDetails" var="getFamilyDetails" />
<portlet:resourceURL id="getAddressType" var="getAddressType" />
<portlet:resourceURL id="getAllBranches" var="getAllBranches" />
<portlet:resourceURL id="updateContactDetails" var="updateContactDetails" />
<portlet:resourceURL id="updatePersonalDetails" var="updatePersonalDetails" />
<portlet:resourceURL id="updateCommunicationAddress" var="updateCommunicationAddress" />
<portlet:resourceURL id="otpCheck" var="otpCheck" />
<portlet:resourceURL id="updateFamilyDetails" var="updateFamilyDetails" />
<portlet:resourceURL id="getCityStateByPincode" var="getCityStateByPincode" />
<portlet:resourceURL id="updatePermanentAddress" var="updatePermanentAddress" />
<portlet:resourceURL id="updateCommunicationAddress" var="updateCommunicationAddress" />
<portlet:resourceURL id="updateOfficeAddress" var="updateOfficeAddress" />
<portlet:resourceURL id="getUpadtedDateTime" var="getUpadtedDateTime" />
<portlet:resourceURL id="getRelationDetails" var="getRelationDetails" />
<portlet:resourceURL id="getCustomerPolicies" var="getCustomerPolicies" />
<portlet:resourceURL id="getCommunicationDetailsByPolicyId" var="getCommunicationDetailsByPolicyId" />
<portlet:resourceURL id="getCityDetails" var="getCityDetails" />
<portlet:resourceURL id="getStateDetails" var="getStateDetails" />
<portlet:renderURL var="getCityDetailsByStateId">
	<portlet:param name="action" value="getCityDetailsByStateId" />
</portlet:renderURL>

<script src="/IFLService-theme/js/js-dev/addressChange.js"></script>


<script>
	var addressChangeUrlObj = {};
	

	addressChangeUrlObj.getPersonalDetails		= '<%= getPersonalDetails %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getContactDetails		= '<%= getContactDetails %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getPermanentAddress		= '<%= getPermanentAddress %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getCommunicationAddress	= '<%= getCommunicationAddress %>&<portlet:namespace/>policyNo=';
	addressChangeUrlObj.getOfficeAddress		= '<%= getOfficeAddress %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getFamilyDetails		= '<%= getFamilyDetails %>&<portlet:namespace/>custId=';	
	addressChangeUrlObj.getAddressType			= '<%= getAddressType %>&<portlet:namespace/>';
	addressChangeUrlObj.getAllBranches			= '<%= getAllBranches %>&<portlet:namespace/>';
	addressChangeUrlObj.updateContactDetails	= '<%= updateContactDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.otpCheck				= '<%= otpCheck %>&<portlet:namespace/>';
	addressChangeUrlObj.updatePersonalDetails	= '<%= updatePersonalDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.updateCommunicationAddress	= '<%= updateCommunicationAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.updateFamilyDetails	= '<%= updateFamilyDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.portletNamespace		= '<portlet:namespace/>';
	addressChangeUrlObj.addressChangeConfirm 	= '<%= addressChangeConfirm%>&<portlet:namespace/>historyId=';
	addressChangeUrlObj.getCityStatenamesByPin =  '<%= getCityStateByPincode %>&<portlet:namespace/>';
	addressChangeUrlObj.updateCommunicationAddress=  '<%= updateCommunicationAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.updatePermanentAddress=  '<%= updatePermanentAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.updateOfficeAddress=  '<%= updateOfficeAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.getUpadtedDateTime=  '<%= getUpadtedDateTime %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getFamilyRealtions=  '<%= getRelationDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.getCustomerPolicies=  '<%= getCustomerPolicies %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getCommunicationDetailsByPolicyId=  '<%= getCommunicationDetailsByPolicyId %>&<portlet:namespace/>';
	addressChangeUrlObj.contactChangeConfirm 	= '<%= contactChangeConfirm%>&<portlet:namespace/>';
	addressChangeUrlObj.getCityDetails			= '<%= getCityDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.getStateDetails			= '<%= getStateDetails %>&<portlet:namespace/>';
	addressChangeUrlObj.getCityDetailsByStateId			= '<%= getCityDetailsByStateId %>&<portlet:namespace/>stated=';
	
</script>


<div class="addressChangeConfirmCont" style="display:none;">
	<%@ include file="/jsp/addressChangeConfirmTemplate.jsp"%>
</div>

<div id="" class="tab2content addrWhole" style="margin:0px;">
<div  align="right" style="margin-right:30px;">Last Update on <span id="updatedTime"></span></div>
	<!--  personal  details -->
	<div class="row-fluid">
	<div class="span12">
	
		<div class="span2 img_border">
			<img src="/IFLService-theme/images/personal.png" >
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust"    >
		    
			<h2 class="addrChange_trigger" target="personal">
				<a href="#"><b>Personal Details</b></a>
				<a href="javascript:void(0);" target="personal" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="personal" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			</h2>
		    <div  target="personal" class="addrChange_container">	
		    	<form id="frmPersonalDetails" name="personalss">
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0"  target="personal"> 
		    		<!-- <tr style="display:none" class="changeTypeRow" target="personal">
		    			<td class="table_colum" style="width:20%;">Type</td>
		    			<td class="table_colum_last inputVal">
		    				<select id="selChangeType" name="selChangeType">
		    				<option value="">Select</option>		    					
		    					<option value="change">Change</option>
		    					<option value="correction">Correction</option>
		    				</select>
		    			</td>
		    		</tr>   --> 		    	
		    		<tr>
		    			<td class="table_colum" style="width:20%;">First Name</td>
		    			<td class="table_colum_last inputVal">		    				
		    				<span id="custFirstName" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Middle Name</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="custMiddleName" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Last Name</td>
		    			<td class="table_colum_last inputVal" >
		    				<span id="custLastName" target="text" length="35" ></span>
		    			</td>
		    		</tr>
   		
		    		</table>    	
		    				
		    				<table width="100%" border="0" cellspacing="0" cellpadding="0" target="personaldob" > 
		    		
		    		
		    		<tr >
		    		
		    			<td class="table_colum_last_row_last" style="width:20%;">Date&nbsp;of&nbsp;Birth</td>
		    			<td class="table_colum_last_row_last inputVal" style="border-right: none;" >

		    				<span id="custDob" target="date" ></span>
		    				
		    			</td>
		    			<td class="table_colum_last_row_last"  style="border-left: none;" >
		    				<div class="col-md-10 addrChange_trigger" target="personaldob" style="text-align: center;display: block;text-align: right;">
					    		<a href="javascript:void(0);" target="personaldob" class="btn addrBtnEdit" >Edit</a><a href="javascript:void(0);" target="personaldob" class="btn addrBtnCancel" style="display:none;">Cancel</a>
					    	</div>
		    			</td>
		    		</tr>
		    		
		    				</table>  	
		    				<table width="100%" border="0" cellspacing="0" cellpadding="0" target="personalgender" > 
		    		
		    		
		    		<tr >
		    		
		    			<td class="table_colum_last_row_last" style="width:20%;">Gender</td>
		    			<td class="table_colum_last_row_last inputVal" style="border-right: none;" >
                        <!-- <label><input type="radio" value="Male" id="genderM" name="gender"/>Male&nbsp;</label>
                        <label><input type="radio" value="Female" id="genderF" name="gender"/>Female</label> -->
		    			 <label><input type="radio" value="Male" name="gender" id="genderM"  value="Male"> Male</label>
                         <label><input type="radio" name="gender" value="Female" id="genderF"> Female</label>
		    			
		    			
		    			</td>
		    			<td class="table_colum_last_row_last"  style="border-left: none;" >
		    				<div class="col-md-10 addrChange_trigger" target="personalgender" style="text-align: center;display: block;text-align: right;">
					    		<a href="javascript:void(0);" target="personalgender" class="btn addrBtnEdit" >Edit</a><a href="javascript:void(0);" target="personalgender" class="btn addrBtnCancel" style="display:none;">Cancel</a>
					    	</div>
		    			</td>
		    		</tr>
		    		
		    				</table>  
		    				<table width="100%" border="0" cellspacing="0" cellpadding="0" target="personalpan" > 
		    		
		    		
		    		<tr >
		    		
		    			<td class="table_colum_last_row_last" style="width:20%;">Pancard&nbsp;No</td>
		    			<td class="table_colum_last_row_last inputVal" style="border-right: none;" >

		    				
		    				<span id="pancard" target="text" length="10" ></span>
		    			</td>
		    			<td class="table_colum_last_row_last"  style="border-left: none;" >
		    				<div class="col-md-10 addrChange_trigger" target="personalpan" style="text-align: center;display: block;text-align: right;">
					    		<a href="javascript:void(0);" target="personalpan" class="btn addrBtnEdit" >Edit</a><a href="javascript:void(0);" target="personalpan" class="btn addrBtnCancel" style="display:none;">Cancel</a>
					    	</div>
		    			</td>
		    		</tr>
		    		
		    				</table>  
		    	</form>
		  	
		  		<div class="clear"></div> 	
		  	<div style="display:none;" class="addrChangeDocs" target="personal" id="personaladdrDocsTab">		  			
		  	</div>
		  		<div style="display:none;" class="addrChangeDocs" target="personaldob" id="personaldobaddrDocsTab">		  			
		  	</div>
		  		<div style="display:none;" class="addrChangeDocs" target="personalgender" id="personalgenderaddrDocsTab">		  			
		  	</div>
		  		<div style="display:none;" class="addrChangeDocs" target="personalpan" id="personalpanaddrDocsTab">		  			
		  	</div>
		  	  	<div class="clear"></div>
		  	<div class="col-md-10 submitBtnDiv" target="personal" style="text-align: center;display: none;">
					    		<a href="javascript:void(0);" target="personal" class="btn addrBtnSubmit"> Submit </a>
					    	</div>
					    	<div class="clear"></div>
					 <div class="col-md-10 submitBtnDiv" target="personaldob" style="text-align: center;display: none;">
					    		<a href="javascript:void(0);" target="personaldob"  class="btn addrBtnSubmit" >Submit</a>
					    	</div>   
					    	 <div class="col-md-10 submitBtnDiv" target="personalgender" style="text-align: center;display: none;">
					    		<a href="javascript:void(0);" target="personalgender"  class="btn addrBtnSubmit" >Submit</a>
					    	</div> 
					    	 <div class="col-md-10 submitBtnDiv" target="personalpan" style="text-align: center;display: none;">
					    		<a href="javascript:void(0);" target="personalpan"  class="btn addrBtnSubmit" >Submit</a>
					    	</div> 
					    	
		  	</div>	 
		  
			
					    	
					    	
		 </div>
		<div class="clear"></div>
		<br>
	</div>
	<br> 
	</div>
	 <!--  personal  details end  -->
	 
	 <div class="row-fluid">
	 
	 <!--  contact  details-->
	 <div class="span12">
		 <div class="span2 img_border">
			<img src="/IFLService-theme/images/contact.png" >
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust"    >
		    
			<h2 class="addrChange_trigger" target="contact">
				<a href="#"><b>Contact Details</b></a>
				<a href="javascript:void(0);" target="contact" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="contact" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			</h2>
			
		    <div class="addrChange_container" target="contact">	
		    	<form id="frmContact" name="contactss">
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0" target="contact">    		    	
		    		<tr>
		    			<td class="table_colum" style="width:20%;">Email<span id="emailcount" style="display: none;"></span></td>
		    			<td class="table_colum_last inputVal">
		    				<span id="custEmail" target="text" length="35">test@test.com</span>
		    				<a id="addemailId"  style="display:none;cursor: pointer;text-decoration: none; padding-left: 10px; font-size: 18px;">+</a>
		    			</td>
		    		</tr>
		    		<tr id="telrow">
		    			<td class="table_colum">Tel. (Off)</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="custOfficeNum" target="number" length="10"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Tel. (Res.)</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="custHomeNum" target="number" length="10"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum_last_row_last">Mobile<span id="mobilecount" style="display: none;"></span></td>
		    			<td class="table_colum_last_row_last inputVal">
		    				<span id="custMobile" target="number" length="10"></span>
		    				<a id="addmobile"  style="display:none; cursor: pointer; text-decoration: none; padding-left: 10px; font-size: 18px;">+</a>
		    			</td>
		    		</tr>
		    		<!-- <tr>
		    			<td class="table_colum_last_row_last" style="padding-left:5px;">Fax</td>
		    			<td class="table_colum_last_row_last inputVal" style="padding:2px 5px;">
		    				<span id="custFax" target="text" length="35"></span>
		    			</td>
		    		</tr> -->
		    		<tr id="mobileadd">
		    			<td colspan="2">
		    			<div class="col-md-10 submitBtnDiv" target="contact" style="text-align: center;display: none;padding: 15px;">
		    		<a href="javascript:void(0);" target="contact" class="btn addrBtnSubmit"> Submit </a>
		    	</div>		</td>
		    		</tr>
		    	</table>
		    	</form>
		    	
		  	</div>
		  	
		  	<div style="display:none;text-align:center;" class="contactOTPCont" target="contact">
		  		<div class="OTPA">
			  		<p style="display:initial;">Please enter the OTP that sent to your registered Mobile &nbsp;&nbsp;
			  		<!-- OTP has been generated and sent to your registered Mobile Number -->
			  		</p>
			  		<input type="text" name="txtContactOTP" id="txtContactOTP" />
		  		</div>
		  		<div style="margin:20px 0px 10px 0px">
		  			<input type="button" class="btn" name="btnOTPSubmit" id="btnOTPSubmit" value="Submit" />
		  		</div>
		  	</div>		  		
		 </div>
		<div class="clear"></div>
		<br>
	</div>	
	</div>	
	 <!-- contact details end -->
	 
	  <div class="row-fluid">
	 
	  <!--  permanent  details-->
	 <div class="span12">
		 <div class="span2 img_border">
			<img src="/IFLService-theme/images/permenentadress.jpg">
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust"    >
		    
			<h2 class="addrChange_trigger" target="permanent" id="permanentdetails">
				<a href="#"><b>Permanent Address</b></a>
				<a href="javascript:void(0);" target="permanent" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="permanent" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			</h2>
		    <div class="addrChange_container">	
		    <form id="frmPermanent" name="frmPermanent">
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0" target="permanent">  
		    	<!-- <tr style="display:none" class="permanentAddrchangeTypeRow" targer="permanent">
		    			<td class="table_colum" style="width:20%;">Type</td>
		    			<td class="table_colum_last inputVal">
		    				<select id="permanentAddrselChangeType" name="permanentAddrselChangeType">
		    				<option value="">Select</option>		    					
		    					<option value="change">Change</option>
		    					<option value="correction">Correction</option>
		    				</select>
		    			</td>
		    		</tr>   -->  		    	
		    		<tr>
		    			<td class="table_colum" style="width:20%;">Pincode</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="permanentAddrPincode" target="text" length="6"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">City</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="permanentAddrCity" target="readonly" length="35" ></span>
		    				<span id="permanentAddrCityId" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">State</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="permanentAddrState" target="readonly" length="35"></span>
		    				<span id="permanentAddrStateId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="permanentAddrAddressTypeId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="permanentAddrAddressId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="permanentAddrAddressType" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line1</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="permanentAddrLine1" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line2</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="permanentAddrLine2" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum_last_row_last">Address Line3</td>
		    			<td class="table_colum_last_row_last inputVal" style="padding:2px 5px;">
		    				<span id="permanentAddrLine3" target="text" length="35"></span>
		    			</td>
		    		</tr>
		   
		    	<!-- 	<tr>
		    			<td class="table_colum_last_row_last" style="padding-left:5px;">Landline</td>
		    			<td class="table_colum_last_row_last inputVal" style="padding:2px 5px;">
		    				<span id="permanentAddrLandLine" target="text"></span>
		    			</td>
		    		</tr> -->
		    	</table>
		    	</form>
		    	<div style="display:none;" class="addrChangeDocs" target="permanent" id="permanentaddrDocsTab">
		  		
		  				  		
		  	</div> 	
		  	 <div class="col-md-10 submitBtnDiv" target="permanent" style="text-align: center;display: none;padding: 15px;">
		    		<a id="submitPermanentAddr" href="javascript:void(0);" target="permanent" class="btn addrBtnSubmit"> Submit </a>
		    	</div> 
		  	</div>
		  	
		  	
		 </div>
		<div class="clear"></div>
		<br>
	</div>
	</div>		
	 <!-- permanent details end -->
	 
	   <div class="row-fluid">
	 
	  <!--  communication  details-->
	 <div class="span12">
		 <div class="span2 img_border">
			<img src="/IFLService-theme/images/communication.png"  >
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust"    >
		    
			<h2 class="addrChange_trigger" target="communication" id="communicationdetails">
				<a href="#"><b>Communication Address </b><label class="comunicationlab">Policy No :</label><select class="cpnos" name="cpnos" id="cpnos" style="width:100px;">
			    			</select></a>
				
				<a href="javascript:void(0);" target="communication" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="communication" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			
			
			</h2>
			
		    <div class="addrChange_container">	
		     	<table width="100%" border="0" cellspacing="0" cellpadding="0" target="communication">    
		    		<!-- <tr style="display:none" class="commAddrchangeTypeRow" targer="communication">
		    			<td class="table_colum" style="width:20%;">Type</td>
		    			<td class="table_colum_last inputVal">
		    				<select id="commAddrselChangeType" name="commAddrselChangeType">	
		    				<option value="">Select</option>	    					
		    					<option value="change">Change</option>
		    					<option value="correction">Correction</option>
		    				</select>
		    			</td>
		    		</tr>  -->
		    		
		    		<!-- <tr id="cdpno" style="">
			    		<td class="table_colum" style="width:20%;">Policy No</td>
			    		<td class="table_colum_last inputVal">
			    			<select name="cpnos" id="cpnos">
			    			</select>
			    		</td>
		    		
		    		</tr> -->
		    	 	<tr>
		    			<td class="table_colum" style="width:20%;">Pincode</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="commAddrPincode" target="text" length="6"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">City</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="commAddrCity" target="readonly" length="35"></span>
		    				<span id="commAddrCityId" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">State</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="commAddrState"  target="readonly" length="35"></span>
		    				<span id="commAddrStateId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="commAddrAddressTypeId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="commAddrAddressId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="commAddrAddressType" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line1</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="commAddrLine1" target="text"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line2</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="commAddrLine2" target="text"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum_last_row_last">Address Line3</td>
		    			<td class="table_colum_last_row_last inputVal" style="padding:2px 5px;">
		    				<span id="commAddrLine3" target="text"></span>
		    			</td>
		    		</tr>
		        	</table>
		    	
		    	<div style="display:none;" class="addrChangeDocs" target="communication" id="communicationaddrDocsTab">
		  		
		  			  		
		  	</div> 	
		  	<div class="col-md-10 submitBtnDiv" target="communication" style="text-align: center;display: none;padding: 15px;">
		    		<a id="submitCommAddr" href="javascript:void(0);" target="communication" class="btn addrBtnSubmit"> Submit </a>
		    	</div>	
		  	</div>	  
		  	
		 </div>
		<div class="clear"></div>
		<br>
	</div>	
	</div>		
	 <!-- communication details end -->
	 
	 
	 <div class="row-fluid">
	 
	  <!--  occupation  details-->
	 <div class="span12">
		 <div class="span2 img_border">
			<img src="/IFLService-theme/images/occupation.png">
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust">
		    
			<h2 class="addrChange_trigger" target="occupation" id="occupationdetails">
				<a href="#"><b>Occupation/Service Details</b></a>
				<a href="javascript:void(0);" target="occupation" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="occupation" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			</h2>
		    <div class="addrChange_container">	
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0" target="occupation">    	
		    <!-- 	<tr style="display:none" class="officeAddrchangeTypeRow" target="occupation">
		    			<td class="table_colum" style="width:20%;">Type</td>
		    			<td class="table_colum_last inputVal">
		    				<select id="officeAddrselChangeType" name="officeAddrselChangeType">
		    				<option value="">Select</option>		    					
		    					<option value="change">Change</option>
		    					<option value="correction">Correction</option>
		    				</select>
		    			</td>
		    		</tr>	 -->    	
		    		<tr>
		    			<td class="table_colum" style="width:20%;">Office/Business Name</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrName" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Designation</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrDesig" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Department</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrDepart" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Pincode</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrPincode" target="text" length="6"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">City</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrCity" target="readonly" length="35"></span>
		    				<span id="officeAddrCityId" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">State</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrState" target="readonly" length="35"></span>
		    				<span id="officeAddrStateId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="officeAddrAddressTypeId" target="hidden" style="display:none;color:white;"></span>
		    				<span id="officeAddrAddressId" target="hidden" style="display:none;color:white;"></span>
		    		        <span id="officeAddrAddressType" target="hidden" style="display:none;color:white;"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line1</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrLine1" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum">Address Line2</td>
		    			<td class="table_colum_last inputVal">
		    				<span id="officeAddrLine2" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td class="table_colum_last_row_last">Address Line3</td>
		    			<td class="table_colum_last_row_last inputVal" style="padding:2px 5px;">
		    				<span id="officeAddrLine3" target="text" length="35"></span>
		    			</td>
		    		</tr>
		    
		    	</table>
		    	<div style="display:none;" class="addrChangeDocs" target="occupation" id="occupationaddrDocsTab">		  		
		 </div>
		 <div class="col-md-10 submitBtnDiv" target="occupation" style="text-align: center;display: none;padding: 15px;">
		    		<a href="javascript:void(0);" target="occupation" class="btn addrBtnSubmit"> Submit </a>
		    	</div>
		<div class="clear"></div>
		  	</div>	
		  		
	</div>	
	</div>		
	 <!-- occupation details end -->
	 <div class="clear"></div><br><br>
	  <div class="row-fluid">
	 
	  <!--  family details-->
	 <div class="span12">
		 <div class="span2 img_border">
			<img src="/IFLService-theme/images/family.png" >
			<div class="img_middle_border"> </div>
		</div>
	     		
	
		<div class="span10 right_accordian_content addrChange_trigger_adjust" >
		    
			<h2 class="addrChange_trigger" target="family">
				<a href="#"><b>Family Details</b></a>
				<a href="javascript:void(0);" target="family" class="btn right addrBtnEdit" style="display:none;"> Edit </a>
				<a href="javascript:void(0);" target="family" class="btn right addrBtnCancel" style="display:none;"> Cancel </a>
			</h2>
		    <div class="addrChange_container"  target="family">
		    	<div class="familyCont"></div>	
		    	<div class="col-md-10 submitBtnDiv" target="family" style="text-align: center;display: none;padding-bottom: 15px; padding-right: 10px; float: right;">
		    	<a href="javascript:void(0);" name="Addmore" id="addrelation" ><h3>+</h3></a>
		    	</div>
		    	<br>
		    	<div class="col-md-10 submitBtnDiv" target="family" style="text-align: center;display: none;padding: 15px;">
		    		<a href="javascript:void(0);" target="family" class="btn addrBtnSubmit"> Submit </a>
		    	</div>
		  	</div>	  	
		 </div>
		<div class="clear"></div>
		<br>
	</div>	
	</div>		
	 <!-- family details end -->
	 
	 
</div>
<div class="modal fade" id="confirmcontact" align="center"
			tabindex="-1" role="dialog" aria-labelledby="myLabel"
			aria-hidden="true">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myLabel">Confirm Details</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="contactpopup"></div>

					</div>

				</div>
			</div>
		</div>


<script>
sessionStorage.addressChangeConfirmSection = '';
var coaParam = getParameterByName("coaParam", $(location).attr('href'));
if(coaParam == ''){
	coaParam = sessionStorage.coaParam;
}

if(coaParam != ''){		
	if(coaParam=="occupation"){
		document.getElementById('occupationdetails').scrollIntoView(true);
	}else if(coaParam=="communication"){
		document.getElementById('communicationdetails').scrollIntoView(true);
	}else if(coaParam=="permanent"){
		document.getElementById('permanentdetails').scrollIntoView(true);
	}
	
	}	
</script>

<script type="text/javascript">
    function customRadio(radioName){
        var radioButton = $('input[name="'+ radioName +'"]');
        $(radioButton).each(function(){
            $(this).wrap( "<span class='custom-radio'></span>" );
            if($(this).is(':checked')){
                $(this).parent().addClass("selected");
            }
        });
        $(radioButton).click(function(){
            if($(this).is(':checked')){
                $(this).parent().addClass("selected");
            }
            $(radioButton).not(this).each(function(){
                $(this).parent().removeClass("selected");
            });
        });
    }
    $(document).ready(function (){
    	
        customRadio("gender");
        customRadio("search-engine");          
        customRadio("confirm");
        
    });
    
    
    
</script>