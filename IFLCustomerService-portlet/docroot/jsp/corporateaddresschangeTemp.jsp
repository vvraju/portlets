
<%@ include file="/jsp/addressChangeDocuments.jsp"%>
<portlet:defineObjects />

<portlet:renderURL var="addressChangeConfirm">
	<portlet:param name="action" value="addressChangeConfirm" />
</portlet:renderURL>

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
<style>
.labelfont{
font-size: 12px; ! important
}
</style>

<script src="/IFLService-theme/js/js-dev/corporateaddressChange.js"></script>


<script>
	var addressChangeUrlObj = {};
	

	addressChangeUrlObj.getPersonalDetails		= '<%= getPersonalDetails %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getContactDetails		= '<%= getContactDetails %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getPermanentAddress		= '<%= getPermanentAddress %>&<portlet:namespace/>custId=';
	addressChangeUrlObj.getCommunicationAddress	= '<%= getCommunicationAddress %>&<portlet:namespace/>custId=';
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
	addressChangeUrlObj.addressChangeConfirm 	= '<%= addressChangeConfirm%>';
	addressChangeUrlObj.getCityStatenamesByPin =  '<%= getCityStateByPincode %>&<portlet:namespace/>';
	addressChangeUrlObj.updateCommunicationAddress=  '<%= updateCommunicationAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.updatePermanentAddress=  '<%= updatePermanentAddress %>&<portlet:namespace/>';
	addressChangeUrlObj.updateOfficeAddress=  '<%= updateOfficeAddress %>&<portlet:namespace/>';
</script>

<div class="addressChangeConfirmCont" style="display:none;">
	<%@ include file="/jsp/addressChangeConfirmTemplate.jsp"%>
</div>


<div id="personalDiv" style="display:none;" >
					<div class="row-fluid"><h1 style="font-size:16px;color:#ffb2ae;">Personal Details</h1>
					 </div>	
					 <div class="row-fluid" style="width:100%;background-color:#f5f5f7;padding:0px 10px;border-top:1px solid #ccc;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:5px 0px;">Old Personal Details</p></div>
					    <div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:5px 5px;">New Personal Details</p></div></div>
					<div class="row-fluid" style="width:100%;background-color:#f5f5f7;padding:0px 10px;border-bottom:1px solid #ccc;">
					
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:10px;"><br></p>
						<label style="font-size: 12px; !important"  class="personal"> First Name</label>
						<input type="text" id="custFirstName" name="custFirstName"  readonly="readonly"/>
						<div class="clr"> </div><br>
				<label style="font-size: 12px; !important"  class="personal"> Middile Name</label>
						<input type="text" id="custMiddleName" name="custMiddleName" readonly="readonly"/>
						<div class="clr"> </div><br>
						
				<label style="font-size: 12px; !important"  class="personal"> Last Name</label>
						<input type="text" id="custLastName" name="custLastName" readonly="readonly"/>
						<div class="clr"> </div><br>
						
						<br>
						<div class="clr"> </div>
						
						<label style="font-size: 12px; !important"  class="personal">Date Of Birth</label>
						<input type="text" id="custDob" name="custDob" readonly="readonly"/>
						<div class="clr"> </div><br>
						
						<br>
						<div class="clr"> </div>
						
										
					 </div>					
				
					<div class="form_sub3 personal" style="width:48%;background-color:#f5f5f7;padding-left:6px;"> 
					<form id="frmPersonalDetails" name="frmPersonalDetails">
					   					    
					   <br>
		    <label style="font-size: 12px; margin: 5px 0px -20px 0px; !important">Select Request:</label>
		    <select id="selAddrType" name="selAddrType" style="">
		    	
			   
			    <option value="change">Change</option>
			     <option value="correction">Correction</option>
		    </select>
		<div class="clr"> </div><br>
						<label style="font-size: 12px; !important"  class="personal"> First Name</label>
						<input type="text" id="custFirstNameTemp" name="custFirstNameTemp" placeholder="Enter First Name." onkeypress="return isAlphaKey(event)"  />
						<div class="clr"> </div><br>
				<label style="font-size: 12px; !important"  class="personal"> Middile Name</label>
						<input type="text" id="custMiddleNameTemp" name="custMiddleNameTemp" placeholder="Enter Middle Name." onkeypress="return isAlphaKey(event)"   />
						<div class="clr"> </div><br>
						
				<label style="font-size: 12px; !important"  class="personal"> Last Name</label>
						<input type="text" id="custLastNameTemp" name="custLastNameTemp" placeholder="Enter Last Name." onkeypress="return isAlphaKey(event)"  />
						<div class="clr"> </div><br>
						
					
						<div class="clr"> </div>
						
						<label style="font-size: 12px; !important"  class="personal">Date Of Birth</label>
						<input type="text" class="DOBclas" id="custDobTemp" name="custDobTemp"  class="field-required pickupDt" placeholder="Enter Date Of Birth" />
						
						<div class="clr"> </div><br>
						
						<br>
						<div class="clr"> </div>
						</form>
                       </div>		
                      <div class="clr"> </div>
                      
			
 </div>	
 	<div style="display:none;" class="addrChangeDocs" target="personal" id="personaladdrDocsTab"> 	</div>		
 <div class="row-fluid" align="center" id="personalDivButtons">
					<div class="span7"></div>
						<div class="pull-right submitBtnDiv" style="" >
						
						<div class="" target="" style="text-align: center;padding: 15px 0px;">
	  	
	  		<a class="form-btn btn resetAllfileds" style="border: none;"> Reset </a>
	  			<a href="javascript:void(0);" target="personal" class="btn addrBtnSubmit" style="border: none;"> Update </a>
	  			
	  	</div>
						
									
					
					</div>
					
					
					</div>
							</div>			
					
					
<div id="contactDiv"  style="display:none">
					<div class="row-fluid"><h1 style="font-size:16px;color:#ffb2ae;">Contact Details</h1>
					 </div>	
					 <div class="row-fluid" style="width:100%;background-color:#f5f5f7;padding:0px 10px;border-top:1px solid #ccc;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:5px 0px;">Old Contact Details</p></div>
					    <div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:5px 5px;">New Contact Details</p></div></div>
					<div class="row-fluid" style="width:100%;background-color:#f5f5f7;padding:0px 10px;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:0px;"><br></p>
						<label> Email&nbsp;:</label>
						<input type="text" id="custEmail" name="custEmail" >
						<div class="clr"> </div><br>
				
						<label> Tel.(Off)&nbsp;:</label>
						<input type="text" id="custOfficeNum" name="custOfficeNum" />
						<div class="clr"> </div><br>
				<label> Tel.(Res)&nbsp;:</label>
						<input type="text" id="custHomeNum" name="custHomeNum" />
						<div class="clr"> </div><br>
						
				<label> Mobile&nbsp;:</label>
						<input type="text" id="custMobile" name="custMobile" />
						<div class="clr"> </div><br>
						
						<br>
						<div class="clr"> </div>
						
						<!-- <label>Fax.</label>
						<input type="text" id="custFax" name="custFax" />
						<div class="clr"> </div><br>
						 -->
						<br>
						<div class="clr"> </div>

						

										
					 </div>					
				
					<div class="form_sub3 frmContact" style="width:48%;background-color:#f5f5f7;border-left:1px solid #ccc;padding-left:6px;" > 
						<form id="frmContact" name="frmContact">
					    <p style="padding:0px;"><br></p>
					<label> Email&nbsp;:</label>
						<input type="text" id="custEmailTemp" name="custEmailTemp" placeholder="Enter Email"  onblur="return validateField('email',this.id);"/>
						<div class="clr"> </div><br>
				
						<label> Tel.(Off)&nbsp;:</label>
						<input type="text" id="custOfficeNumTemp" maxlength="10" name="custOfficeNumTemp"  placeholder="Enter Office No." onkeypress="return isNumberKey(event)"/>
						<div class="clr"> </div><br>
				<label> Tel.(Res)&nbsp;:</label>
						<input type="text" id="custHomeNumTemp"  maxlength="10" name="custHomeNumTemp" placeholder="Enter Resident No." onkeypress="return isNumberKey(event)"/>
						<div class="clr"> </div><br>
						
				<label> Mobile&nbsp;:</label>
						<input type="text" id="custMobileTemp" maxlength="10" name="custMobileTemp" placeholder="Enter Mobile No." onkeypress="return isNumberKey(event)"/>
						<div class="clr"> </div><br>
						
						
						<div class="clr"> </div>
						
					<!-- 	<label>Fax.</label>
						<input type="text" id="custFaxTemp" name="custFaxTemp" >
						<div class="clr"> </div><br> -->
						
						<br>
						<div class="clr"> </div>
						
						 <div class="row-fluid" align="center">
				
						<div class="span12 pull-right submitBtnDiv" >
					<div class="" target="" style="float:right;">
	  	
	  		<a class="form-btn btn resetAllfileds" style="border: none;"> Reset </a>
	  			<a href="javascript:void(0);" target="contact" class="btn addrBtnSubmit" style="border: none;"> Update </a>
	  			
	  	</div>
					
					
					</div>
					</div>	
</form>
						
                       </div>		
                       <div class="clr"> </div>
                       <div style="display:none;text-align:center;" class="contactOTPCont" target="contact">
		  		<div class="OTPA">
			  		<p style="display:initial;">Please enter the OTP that sent to your registered Mobile: &nbsp;&nbsp;</p>
			  		<input type="text" name="txtContactOTP" id="txtContactOTP" />
		  		</div>
		  		<div style="margin:20px 0px 10px 0px">
		  			<input type="button" class="btn" name="btnOTPSubmit" id="btnOTPSubmit" value="Submit" />
		  		</div>
		  	</div>		
							
 </div>	
							
							
					</div>
<div id="permanentDiv" style="display:none">
					<div class="row-fluid"><h1 style="font-size:16px;color:#ffb2ae;" id="permanentHead">Change Of Address (Permenent Address)</h1>
					 </div>	
					 <div class="row-fluid" style="width:94%;background-color:#f5f5f7;padding:0px 10px;border-top:1px solid #ccc;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:5px 0px;">Old Permanent Address</p></div>
					    <div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:5px 5px;">New Permanent Address</p></div></div>
					<div class="row-fluid" style="width:94%;background-color:#f5f5f7;padding:0px 10px;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:0px;"><br></p>
						<label> Pin Code.</label>
						<input type="text" id="permanentAddrPincode" name="permanentAddrPincode"  readonly="readonly"/>
						<div class="clr"> </div><br>
				
						<label> City</label>  <input type="text" id="permanentAddrCity" name="permanentAddrCity" readonly="readonly"/>
						<input type="hidden" id="permanentAddrCityId" name="permanentAddrCityId" readonly="readonly"/>
						<div class="clr"> </div><br>
				
						<label>State</label> <input type="text" id="permanentAddrState" name="permanentAddrState" readonly="readonly"/>
						<input type="hidden" id="permanentAddrStateId" name="permanentAddrStateId"readonly="readonly" />
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="permanentAddrLine1" id="permanentAddrLine1" readonly="readonly"/>
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="permanentAddrLine2" id="permanentAddrLine2" readonly="readonly"/><br>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="permanentAddrLine3" id="permanentAddrLine3" readonly="readonly"/><br>
						
						
							
						

										
					 </div>					
				
					<div class="form_sub3 permanent" style="width:48%;background-color:#f5f5f7;padding-left:6px;"> 
					    <p style="padding:0px;"><br></p>
					    
					    <input type="hidden" id="permanentAddrAddressTypeId" name="permanentAddrAddressTypeId" />
					    <input type="hidden" id="permanentAddrAddressId" name="permanentAddrAddressId" />
						<label> Pin Code.</label>
						<input type="text" id="permanentAddrPincodeTemp" name="permanentAddrPincodeTemp" placeholder="Enter Pincode" onkeypress="return isNumberKey(event)"/>
						<div class="clr"> </div><br>
				
						<label> City</label> <input type="text" id="permanentAddrCityTemp" name="permanentAddrCityTemp" placeholder="Enter City" onkeypress="return isAlphaKey(event)" readonly="readonly" />
						<input type="hidden" id="permanentAddrCityIdTemp" name="permanentAddrCityIdTemp" />
						<div class="clr"> </div><br>
				
						<label>State</label> <input type="text" id="permanentAddrStateTemp" name="permanentAddrStateTemp" placeholder="Enter State" onkeypress="return isAlphaKey(event)" readonly="readonly" />
						<input type="hidden" id="permanentAddrStateIdTemp" name="permanentAddrStateIdTemp" />
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="permanentAddrLine1Temp" id="permanentAddrLine1Temp" placeholder="Enter Address Line1"/>
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="permanentAddrLine2Temp" id="permanentAddrLine2Temp" placeholder="Enter Address Line2"/><br>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="permanentAddrLine3Temp" id="permanentAddrLine3Temp" placeholder="Enter Address Line3"/><br>
						
                       </div>		
                       
						 
 </div>	
 	<div style="display:none;" class="addrChangeDocs" target="permanent" id="permanentaddrDocsTab">	  				  		
		  	</div> 
  <div class="row-fluid" align="center" id="permanentDivButtons">
					<div class="span7"></div>
						<div class="span5 pull-right submitBtnDiv" style="padding-right:20px;" target="permanent"><div class="" target="" style="text-align: center;padding: 15px;">
	  	
	  		<a class="form-btn btn resetAllfileds" style="border: none;"> Reset </a>
	  			<a href="javascript:void(0);" target="permanent" class="btn addrBtnSubmit" style="border: none;"> Update </a>
	  			
	  	</div></div>
					</div>		
										
					</div>

<div id="communicationDiv"  style="display:none;" >
 <input type="hidden" name="commAddrcustomer_address_id" id="commAddrcustomer_address_id" />
		     <input type="hidden" name="commAddraddress_type_id" id="commAddraddress_type_id" />
					<div class="row-fluid"><h1 style="font-size:16px;color:#ffb2ae;" id="communicationHead">Change Of Address (Communication Address)</h1>
					 </div>	
					 <div class="row-fluid" style="background-color:#f5f5f7;padding:0px 10px;border-top:1px solid #ccc;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:5px 0px;">Old Communication Address</p></div>
					    <div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:5px 5px;">New Communication Address</p></div></div>
					<div class="row-fluid" style="background-color:#f5f5f7;padding:0px 10px;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:0px;"><br></p>
						<label> Pin Code.</label>
						<input type="text" id="commAddrPincode" name="commAddrPincode" readonly="readonly"/>
						<div class="clr"> </div><br>
				
						<label> City</label><input type="text" id="commAddrCity" name="commAddrCity" readonly="readonly"/>
						<input type="hidden" id="commAddrCityId" name="commAddrCityId" />
						<div class="clr"> </div><br>
				
						<label>State</label><input type="text" id="commAddrState" name="commAddrState" readonly="readonly" />
						<input type="hidden" id="commAddrStateId" name="commAddrStateId" readonly="readonly" />
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="commAddrLine1"  id="commAddrLine1"  readonly="readonly"/>
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="commAddrLine2"  id="commAddrLine2"  readonly="readonly"/>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="commAddrLine3"  id="commAddrLine3"  readonly="readonly"/>
												

										
					 </div>					
				
					<div class="form_sub3 communication" style="width:48%;background-color:#f5f5f7;padding-left:6px;"> 
					    <p style="padding:0px;"><br></p>
					    <input type="hidden" id="commAddrAddressTypeId" name="commAddrAddressTypeId" />
					    <input type="hidden" id="commAddrAddressId" name="commAddrAddressId" />
						<label> Pin Code.</label>
						<input type="text" id="commAddrPincodeTemp" name="commAddrPincodeTemp" placeholder="Enter Pincode" onkeypress="return isNumberKey(event)"/>
						<div class="clr"> </div><br>
				
						<label> City</label>  <input type="text" id="commAddrCityTemp" name="commAddrCityTemp" placeholder="Enter City" onkeypress="return isAlphaKey(event)" readonly="readonly" />
								<input type="hidden" id="commAddrCityIdTemp" name="commAddrCityIdTemp" />
						<div class="clr"> </div><br>
				
						<label>State</label> <input type="text" id="commAddrStateTemp" name="commAddrStateTemp" placeholder="Enter State" onkeypress="return isAlphaKey(event)"  readonly="readonly"/>
								<input type="hidden" id="commAddrStateIdTemp" name="commAddrStateIdTemp" />
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="commAddrLine1"  id="commAddrLine1Temp" placeholder="Enter Address Line1"/>
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="commAddrLine2"  id="commAddrLine2Temp" placeholder="Enter Address Line2"/>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="commAddrLine3"  id="commAddrLine3Temp" placeholder="Enter Address Line3"/>
						
						</div>
	 <div class="row-fluid" align="center" id="communicationDivButtons">
					<div class="span7"></div>
						<div class="pull-right submitBtnDiv" style="padding:15px 19px 15px 0px;" target="communication">
					
	  	
	  		<a class="form-btn btn resetAllfileds" style="border: none;"> Reset </a>
	  			<a href="javascript:void(0);" target="communication" class="btn addrBtnSubmit" style="border: none;"> Submit </a>
	  			
	  	</div>
					</div>
 </div>	
 
 <div style="display:none;" class="addrChangeDocs" target="communication" id="communicationaddrDocsTab">
		  		 		
		  	</div> 	
  			</div>
					
					
<div id="occupationDiv" style="display:none">
					<div class="row-fluid"><h1 style="font-size:16px;color:#ffb2ae;" id="occupationHead">Change Of Office Address (Office Address)</h1>
					 </div>	
					 <div class="row-fluid" style="width:94%;background-color:#f5f5f7;padding:0px 10px;border-top:1px solid #ccc;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:5px 0px;">Old Office Address</p></div>
					    <div class="form_sub3" style="width:48%;background-color:#f5f5f7;padding-right:6px;"> 
					    <p style="padding:5px 5px;">New Office Address</p></div></div>
					<div class="row-fluid" style="width:94%;background-color:#f5f5f7;padding:0px 10px;border-bottom:1px solid #ccc;">
					<div class="form_sub3" style="width:48%;background-color:#f5f5f7;border-right:1px solid #ccc;padding-right:6px;"> 
					    <p style="padding:0px;"><br></p>
					    
					    <label> Office/Bussiness Name.</label>
						<input type="text" id="officeAddrName" name="officeAddrName" readonly="readonly"/>
						<div class="clr"> </div><br>
						
						<label> Designation.</label>
						<input type="text" id="officeAddrDesig" name="officeAddrDesig" readonly="readonly"/>
						<div class="clr"> </div><br>
						
						<label> Department</label>
						<input type="text" id="officeAddrDepart" name="officeAddrDepart" readonly="readonly"/>
						<div class="clr"> </div><br>
					    
					    
						<label> Pin Code.</label>
						<input type="text" id="officeAddrPincode" name="officeAddrPincode" readonly="readonly"/>
						<div class="clr"> </div><br>
				
						<label> City</label> <input type="text" id="officeAddrCity" name="officeAddrCity" readonly="readonly"/>
						<input type="hidden" id="officeAddrCityId" name="officeAddrCityId" />
						<div class="clr"> </div><br>
				
						<label>State</label> <input type="text" id="officeAddrState" name="officeAddrState" readonly="readonly"/>
						<input type="hidden" id="officeAddrStateId" name="officeAddrStateId" readonly="readonly"/>
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="officeAddrLine1"  id="officeAddrLine1" readonly="readonly"/>
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="officeAddrLine2"  id="officeAddrLine2" readonly="readonly"/><br>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="officeAddrLine3"  id="officeAddrLine3"  readonly="readonly"/><br>
						
									
					 </div>					
				
					<div class="form_sub3 office" style="width:48%;background-color:#f5f5f7;padding-left:6px;"> 
					    <p style="padding:0px;"><br></p>
					    <input type="hidden" id="officeAddrAddressType" name="officeAddrAddressType" />
					     <input type="hidden" id="officeAddrAddressTypeId" name="officeAddrAddressTypeId" />
					    <input type="hidden" id="officeAddrAddressId" name="officeAddrAddressId" />
						 <label> Office/Bussiness Name.</label>
						<input type="text" id="officeAddrNameTemp" name="officeAddrNameTemp" placeholder="Pelase enter Office/Business Name" onkeypress="return isAlphaKey(event)" />
						<div class="clr"> </div><br>
						
						<label> Designation.</label>
						<input type="text" id="officeAddrDesigTemp" name="officeAddrDesigTemp" placeholder="Enter Designation" onkeypress="return isAlphaKey(event)" />
						<div class="clr"> </div><br>
						
						<label> Department</label>
						<input type="text" id="officeAddrDepartTemp" name="officeAddrDepartTemp" placeholder="Enter Department Name" onkeypress="return isAlphaKey(event)" />
						<div class="clr"> </div><br>
					    
					    
						<label> Pin Code.</label>
						<input type="text" id="officeAddrPincodeTemp" name="officeAddrPincodeTemp" placeholder="Enter Pincode" onkeypress="return isNumberKey(event)">
						<div class="clr"> </div><br>
				
						<label> City</label> <input type="text" id="officeAddrCityTemp" name="officeAddrCityTemp" placeholder="Enter City" onkeypress="return isAlphaKey(event)" readonly="readonly"/>
						<input type="hidden" id="officeAddrCityIdTemp" name="officeAddrCityIdTemp" />
						<div class="clr"> </div><br>
				
						<label>State</label> <input type="text" id="officeAddrStateTemp" name="officeAddrStateTemp" placeholder="Enter State" onkeypress="return isAlphaKey(event)"  readonly="readonly" />
						<input type="hidden" id="officeAddrStateIdTemp" name="officeAddrStateIdTemp" />
						<div class="clr"> </div><br>	
						<label>Address</label>
						<input type="text" name="officeAddrLine1Temp"  id="officeAddrLine1Temp" placeholder="Enter Address Line1">
						<div class="clr"> </div><br>
						<label></label>
						<input type="text" name="officeAddrLine2Temp"  id="officeAddrLine2Temp" placeholder="Enter Address Line2"><br>
						<div class="clr"> </div><br>
						<label> </label>
						<input type="text" name="officeAddrLine3Temp"  id="officeAddrLine3Temp"  placeholder="Enter Address Line3"><br>
						</div>
		  				
 </div>	
 <div style="display:none;" class="addrChangeDocs" target="occupation" id="occupationaddrDocsTab">	</div>  	
  <div class="row-fluid" align="center" id="occupationDivButtons">
					<div class="span7"></div>
						
						
						<div class="span5 pull-right submitBtnDiv" style="padding:15px;" target="occupation">
	  	
	  		<a class="form-btn btn resetAllfileds" style="border: none;"> Reset </a>
	  			<a href="javascript:void(0);" target="occupation" class="btn addrBtnSubmit" style="border: none;"> Update </a>
	  			
	  	</div></div>
	  	
					</div>		
										
					
					<div class="clr"></div>
						
					
						
						<div class="clr"> </div>	
						

				<!-- 	<div class="form_sub3" style="width: 100%;">
						<label style="width:15%;float:left;">Comments</label>
						<textarea name="" cols="90" rows="4" style="width:81%;margin-right:10px;"></textarea>
						<div class="clr"> </div>	
					
						
						<div class="clr"> </div>	
						
					</div>
					<div class="form_sub3" style="width:100%;">
						
						<label style="width:20%;float:left;">Sign Verified</label> 
						<label style="width:20%;float:left"><input type="radio" style="float:left;"></input>Yes</label>
						<label style="width:20%;float:left"><input type="radio" style="float:left;"></input>No</label>
						<div class="clr"> </div>	
						
					</div>
					<div class="form_sub3" style="width: 49%;">
						
						<label style="width:20%;float:left;">Select</label> <select >
							<option></option>
							<option></option>
						</select>
						<div class="clr"> </div>	
						
					</div>
	
					<div class="clr"> </div>
				
					<div style="width:100%;text-align:center;float:left;padding-right:10px;">
						<input type="button" name=""  value="Submit" class="form-btn btn" style="float:right">
					</div>
 -->
 
<script>
sessionStorage.addressChangeConfirmSection = '';
$('#selAddrType').change(function(){
	
	if($('#selAddrType').val()=='correction'){
		$('#custFirstNameTemp').val($('#custFirstName').val());
		$('#custMiddleNameTemp').val($('#custMiddleName').val());
	$('#custLastNameTemp').val($('#custLastName').val());
		 $('#custDobTemp').val($('#custDob').val());
		
	}else{
		
		$('#custFirstNameTemp').val();
		$('#custMiddleNameTemp').val();
	$('#custLastNameTemp').val();
		 $('#custDobTemp').val();
		
	}
	
});

$('.resetAllfileds').click(function(){
	
	$(".personal input:text").each(function() {
	      this.value = "";
	  });
	
	$(".permanent input:text").each(function() {
	      this.value = "";
	  });
	$(".communication input:text").each(function() {
	      this.value = "";
	  });
	$(".office input:text").each(function() {
	      this.value = "";
	  });
	$(".frmContact input").each(function() {
	      this.value = "";
	  });
});
</script>

 