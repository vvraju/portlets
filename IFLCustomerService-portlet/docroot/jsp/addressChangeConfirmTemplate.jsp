<%@ include file="/jsp/init.jsp" %>

<portlet:resourceURL id="getPersonalDetails" var="getPersonalDetails" />
<portlet:resourceURL id="getContactDetails" var="getContactDetails" />
<portlet:resourceURL id="getPermanentAddress" var="getPermanentAddress" />
<portlet:resourceURL id="getCommunicationAddress" var="getCommunicationAddress" />
<portlet:resourceURL id="getOfficeAddress" var="getOfficeAddress" />
<portlet:resourceURL id="getFamilyDetails" var="getFamilyDetails" />
<portlet:resourceURL id="getAddressType" var="getAddressType" />
<portlet:resourceURL id="getAllBranches" var="getAllBranches" />
<portlet:resourceURL id="getTempContactDetails" var="getTempContactDetails" />
<portlet:resourceURL id="confirmRequest" var="confirmRequest" />
<portlet:resourceURL id="getPersonalDetailsFromTemp" var="getPersonalDetailsFromTemp" />
<portlet:resourceURL id="getTempPermanentAddress" var="getTempPermanentAddress" />
<portlet:resourceURL id="getTempOfficeAddress" var="getTempOfficeAddress" />
<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>
<script>



	var addressConfirmUrlObj = {};
	
	addressConfirmUrlObj.getPersonalDetails		= '<%= getPersonalDetails %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getContactDetails		= '<%= getContactDetails %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getPermanentAddress		= '<%= getPermanentAddress %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getCommunicationAddress	= '<%= getCommunicationAddress %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getOfficeAddress		= '<%= getOfficeAddress %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getFamilyDetails		= '<%= getFamilyDetails %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getAddressType			= '<%= getAddressType %>&<portlet:namespace/>';
	addressConfirmUrlObj.getAllBranches			= '<%= getAllBranches %>&<portlet:namespace/>';
	addressConfirmUrlObj.getTempContactDetails		= '<%= getTempContactDetails %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.confirmRequest		= '<%= confirmRequest %>&<portlet:namespace/>custId=' + sessionStorage.customerId +'&subType='+sessionStorage.addressChangeConfirmSection;
	addressConfirmUrlObj.getPersonalDetailsFromTemp		= '<%= getPersonalDetailsFromTemp %>&<portlet:namespace/>custId=' + sessionStorage.customerId;
	addressConfirmUrlObj.getTempPermanentAddress		= '<%= getTempPermanentAddress %>&<portlet:namespace/>custId=' + sessionStorage.customerId ;
	addressConfirmUrlObj.getTempOfficeAddress		= '<%= getTempOfficeAddress %>&<portlet:namespace/>custId=' + sessionStorage.customerId ;

	
</script> 

<%
	Calendar calendar = Calendar.getInstance();
	
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	String dateNow = format.format(calendar.getTime());
	String timeNow = timeFormat.format(calendar.getTime());
	
	int dayLimit = calendar.get(Calendar.HOUR_OF_DAY);
	
	Calendar approvalDate = Calendar.getInstance();
	
	if(dayLimit>14){
		approvalDate.add(Calendar.DATE, 1);	
	}
	
	String approvalDateNow = format.format(approvalDate.getTime());
	String approvalTimeNow = timeFormat.format(approvalDate.getTime());
	
	Calendar calendar1 = Calendar.getInstance();
	calendar1.add(Calendar.DATE, 5);
	
	SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
	String lastDate = newFormat.format(calendar1.getTime());
 %>
 
 <script>
 $(function(){
 
	 var currentTime = new Date()
		var hours = currentTime.getHours()
		var minutes = currentTime.getMinutes()

		if (minutes < 10)
		minutes = "0" + minutes

		var suffix = "AM";
		if (hours >= 12) {
		suffix = "PM";
		hours = hours - 12;
		}
		if (hours == 0) {
		hours = 12;
		}
		var timess= hours + ":" + minutes + " " + suffix ;
		//document.write("<b>" + hours + ":" + minutes + " " + suffix + "</b>")
	    $("#cTime").append(timess);
  
 });
 </script>
 

<div class="b-content Email_corporate"> 	 
    <div class="row-fluid" id="addressChangeConfirmCont"> 
		<div class="span12">
	        

			
				<div class="toptab tab_con_right tab2content span12" style="margin:0px;"> 
					<h3><span id="replace">Address Change</span>  </h3>
					<br>
					
					<p>Thank you, please click on "Cancel" to cancel transaction or click on "Confirm" to proceed further.</p><br/>
					
					<div class="border-top noDefault declarationSection" style="display: block;"> </div><br>
					
					<div style="display:block;width:100%;float:left;">
		<p style="width:20%;float:left;display:inline-block;">
		
		Date:&nbsp;<span id="lblDate" style="font-weight:normal;cursor: text;" class="lbl"><%=dateNow %><br><br></span> 
		
		Time:&nbsp;<span id="cTime" style="font-weight:normal;cursor: text;" class="lbl"></span><br><br>
		
		</p>
		</div>
				<div class="row-fluid tableconfirm">
				<div class="span2"></div>
				<div class="span8 tablediv">
					    <div class="span6 ">
					    <div class="row-fluid hearrow">
					    <div class="span12"><p class="heade">Old <span id="replace1">Address</span> Details</p></div>
					    </div>
					    <div class="row-fluid " >
					    <div class="span12 contetborder" id="addrConfirmOldAddr">
				
					     </div>
					      </div>
					    
					    
					    </div>
					    
					   <div class="span6 lefttab">
					    <div class="row-fluid hearrow hearrow2">
					    <div class="span12 "><p class="heade">New <span id="replace2">Address</span> Details</p></div>
					    </div>
					    <div class="row-fluid " > 
					    <div class="span12 contetborder1" id="addrConfirmChangeAddr">
				
					    </div>
					    </div>
					    </div>
					     </div>
					    </div>
					
						
					<div class="clr"></div>	
					<br>				
				</div>
				<div id="addresscommentsDiv" style="width: 133%; display: none;" >
				<div class="form_sub3 commentsbox" >
						<label style="width:15%;float:left;">Comments&nbsp;&nbsp;&nbsp;</label>
						<textarea name="comments" cols="90" rows="4" style="width:84%;" id="addressscomments"></textarea>
						<div class="clr"> </div>	
					
					</div>
					<div class="form_sub3" style="width:50%;">
						<br>
						<label class="signverfd" style="width:20%;float:left;">Sign Verified</label> 
						<label style="width:20%;float:left"><input type="radio" style="float:left;margin:0 0 0;" value="Y" id="addressssign_verifyY" name="sign_verify"></input>Yes</label>
						<label style="width:20%;float:left"><input type="radio" style="float:left;margin:0 0 0;" value="N" id="addressssign_verifyN" name="sign_verify"></input>No</label>
						<div class="clr"> </div>	
						
					</div><div class="clr"> </div>	
					<div class="form_sub3" style="width: 49%;">
						
						<label style="width:20%;float:left;">Approval&nbsp;Status</label> <select name="approvalStatus" id="addresssapprovalStatus">
							<option value="A">Approved</option>
							<option value="D">Disapproved</option>
						</select>
						
						
						
						
					</div>
	
	
				
	
					<div class="clr"> </div>
				
	</div>
					
				
				
			<div class="span12">
   <div class="row-fluid" align="center">
    <div class="span7"></div>
	<div class="span5 Emailcls" style="margin-bottom:30px;float:right;">	
	<a href="javascript:void(0);" class="btn right Ecancel" rel="<%=addressChange%>" id="cancelConfirm"> Cancel </a>
	<a href="javascript:void(0);" rel="confirmRequest" class="btn right  Econfirm showTracker" > Confirm </a> 
	</div> </div> </div>	

		</div>
    </div>
    </div>
    
    <div class="toptab tab1content" style="height: auto;">
    <h3 id="addresschangeHeading" style="display: none;"> <liferay-ui:message key="services.changename.heading.tracker.chnageconfirm" /> </h3>
    <p style="margin-top:10px;margin-bottom:15px;text-align: justify;display: none;" id="personalDetailstracker">
	    <liferay-ui:message key="services.changename.heading.addresstrackercontent" /><span style="color: #666;font-weight:bold;" id="personalReqNum"></span> 
	    <liferay-ui:message key="services.changename.heading.addresstrackersrnum" /></p> 
	</div>   
    <div id="addressChangeTracker" style="display:none;margin-top:30px;width:auto;margin-bottom:30px;" class="tab1content">
		<%@ include file="/jsp/fundSwitchTracker.jsp"%>
	</div>
	
	<div id="confirmContact" style="display:none;margin-top:20px;width:auto;text-align: center;font-size: 20px;" class="tab1content">
		Details Updated Successfully.
	</div>


<script>
 $('#cancelConfirm').click(function(){
	
	var sectin = sessionStorage.addressChangeConfirmSection;
	
	
	if($('#'+sectin+'Div').length<=0){
		window.location = $(this).attr('rel')+'&coaParam='+sectin;		
	}
	$('#addressChangeConfirmCont').hide();
	$('#'+sectin+'Div').show();
	$('#'+sectin+'DivButtons').show();
}); 
	function addressChangeConfirm(){
		$('.topnav_tabs span').removeClass('active');
		$('.topnav_tabs .my_profile').addClass('active');
		
		//define structure to display in sectionwise
		var strucObj = {};
		
		var sectin = sessionStorage.addressChangeConfirmSection;
		
		if(sectin=='contact'){
			strucObj = {"contact": [
			                    	{"label":"Email<span>:</span>","value":"_CUSTOMER_EMAIL_ADDR"},
			                    	{"label":"Tel.(Off)<span>:</span>","value":"_PHONE_NUMBER_2"},
			                    	{"label":"Tel.(Res)<span>:</span>","value":"_PHONE_NUMBER_3"},
			                    	{"label":"Mobile<span>:</span>","value":"_PHONE_NUMBER_1"}
			                   ]
						};
			
			
		
		//get old address details
		$.ajax({
			url : addressConfirmUrlObj.getContactDetails,
			method : 'POST',
			success : function(result) {
				//console.log("contact details:"+ result);
				var custData = $.parseJSON(result);
				var tempHtml = '';
				for(var i=0;i<strucObj[sectin].length;i++){
					var temp = 	strucObj[sectin][i];				
					if(typeof(custData[temp.value]) != 'undefined'){
						tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7 ">' + custData[temp.value] + "</p></div></div>";
					} else {
						tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
					}
				}
				$('#addrConfirmOldAddr').html(tempHtml);
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
		
		
		//get changed address details
		$.ajax({
			url : addressConfirmUrlObj.getTempContactDetails,
			method : 'POST',
			success : function(result) {
				//console.log("contact temp details:"+ result);
				var custData = $.parseJSON(result);
				var tempHtml = '';
				for(var i=0;i<strucObj[sectin].length;i++){
					var temp = 	strucObj[sectin][i];				
					if(typeof(custData[temp.value]) != 'undefined'){
						tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
									} else {
						tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
					}
				}
				$('#addrConfirmChangeAddr').html(tempHtml);
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
		$('#replace').text("Email/Mobile");
		$('#replace1').text("Email/Mobile");
		$('#replace2').text("Email/Mobile");
		}else if(sectin=='personal' || sectin=='personaldob' || sectin=='personalgender' || sectin=='personalpan'){
			if(sectin=='personal'){
			strucObj = {"personal": [
			   	                    	{"label":"First Name","value":"FirstName"},
			   	                    	{"label":"Middle Name","value":"MiddleName"},
			   	                    	{"label":"Last Name","value":"LastName"},
			   	                    	
			   	                   ]
						}
			$('#replace').text("Name Change");
			$('#replace1').text("Name Change");
			$('#replace2').text("Name Change");
			}else if(sectin=='personalgender'){
				strucObj = {"personalgender": [
				   	                    	
				   	                    	{"label":"Gender","value":"_GENDER"},
				   	                   ]
							}
				$('#replace').text("Gender Change");
				$('#replace1').text("Gender Change");
				$('#replace2').text("Gender Change");
				}
			else if(sectin=='personaldob'){
				strucObj = {"personaldob": [
				   	                    	
				   	                    	{"label":"DOB","value":"_CUSTOMER_DATE_OF_BIRTH"},
				   	                   ]
							}
				$('#replace').text("DOB Change");
				$('#replace1').text("DOB Change");
				$('#replace2').text("DOB Change");
				}
			
			else if(sectin=='personalpan'){
				strucObj = {"personalpan": [
				   	                    	
				   	                    	{"label":"Pancard","value":"_PANCARD"}
				   	                   ]
							}
				$('#replace').text("Pancard Change");
				$('#replace1').text("Pancard Change");
				$('#replace2').text("Pancard Change");
				}
			//get old address details
			$.ajax({
				url : addressConfirmUrlObj.getPersonalDetails,
				method : 'POST',
				success : function(result) {
					
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
										} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmOldAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			
			
			//get changed address details
			$.ajax({
				url : addressConfirmUrlObj.getPersonalDetailsFromTemp,
				method : 'POST',
				success : function(result) {
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];				
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
										} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmChangeAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			
		}else if(sectin=='permanent'){
			strucObj = {"permanent": [
			   	                    	{"label":"Pincode","value":"Pincode"},
			   	                    	{"label":"City","value":"City"},
			   	                    	{"label":"State","value":"State"},
			   	                    	{"label":"Address Line1","value":"AddressLine1"},
			   	                    	{"label":"Address Line2","value":"AddressLine2"},
			   	                    	{"label":"Address Line3","value":"AddressLine3"}
			   	                   ]
						}
			//get old address details
			$.ajax({
				url : addressConfirmUrlObj.getPermanentAddress+ '&addressType=Permanent',
				method : 'POST',
				success : function(result) {
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];				
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
													} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmOldAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			
			
			//get changed address details
			$.ajax({
				url : addressConfirmUrlObj.getTempPermanentAddress+'&addressType=Permanent',
				method : 'POST',
				success : function(result) {
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];				
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
									} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmChangeAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			$('#replace').text("Permanent Address");
			$('#replace1').text("Permanent Address");
			$('#replace2').text("Permanent Address");
		}else if(sectin=='communication'){
			strucObj = {"communication": [
			   	                    	{"label":"Pincode","value":"Pincode"},
			   	                    	{"label":"City","value":"City"},
			   	                    	{"label":"State","value":"State"},
			   	                    	{"label":"Address Line1","value":"AddressLine1"},
			   	                    	{"label":"Address Line2","value":"AddressLine2"},
			   	                    	{"label":"Address Line3","value":"AddressLine3"}
			   	                   ]
						}
			//get old address details
			$.ajax({
				url : addressConfirmUrlObj.getPermanentAddress+ '&addressType=Communication',
				method : 'POST',
				success : function(result) {
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];				
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
												} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmOldAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			
			
			//get changed address details
			$.ajax({
				url : addressConfirmUrlObj.getTempPermanentAddress+ '&addressType=Communication',
				method : 'POST',
				success : function(result) {
					//console.log("personal details:"+ result);
					var custData = $.parseJSON(result);
					var tempHtml = '';
					for(var i=0;i<strucObj[sectin].length;i++){
						var temp = 	strucObj[sectin][i];				
						if(typeof(custData[temp.value]) != 'undefined'){
							tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
									} else {
							tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
						}
					}
					$('#addrConfirmChangeAddr').html(tempHtml);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			$('#replace').text("Communication Address");
			$('#replace1').text("Communication Address");
			$('#replace2').text("Communication Address");
		}else if(sectin=='occupation'){
			strucObj = {"occupation": [
											{"label":"Office/Business Name","value":"OfficeName"},
											{"label":"Designation","value":"Designation"},
											{"label":"Department","value":"department"},
				   	                    	{"label":"Pincode","value":"Pincode"},
				   	                    	{"label":"City","value":"City"},
				   	                    	{"label":"State","value":"State"},
				   	                    	{"label":"Address Line1","value":"AddressLine1"},
				   	                    	{"label":"Address Line2","value":"AddressLine2"},
				   	                    	{"label":"Address Line3","value":"AddressLine3"}
				   	                   ]
							}
			//get old address details
				$.ajax({
					url : addressConfirmUrlObj.getOfficeAddress+ '&addressType=Office',
					method : 'POST',
					success : function(result) {
						//console.log("personal details:"+ result);
						var custData = $.parseJSON(result);
						var tempHtml = '';
						for(var i=0;i<strucObj[sectin].length;i++){
							var temp = 	strucObj[sectin][i];				
							if(typeof(custData[temp.value]) != 'undefined'){
								tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
														} else {
								tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
							}
						}
						$('#addrConfirmOldAddr').html(tempHtml);
					}, error : function(errObj) {
						//console.log(errObj);
					}
				});
				
				
				//get changed address details
				$.ajax({
					url : addressConfirmUrlObj.getTempOfficeAddress+ '&addressType=Office',
					method : 'POST',
					success : function(result) {
						//console.log("personal details:"+ result);
						var custData = $.parseJSON(result);
						var tempHtml = '';
						for(var i=0;i<strucObj[sectin].length;i++){
							var temp = 	strucObj[sectin][i];				
							if(typeof(custData[temp.value]) != 'undefined'){
								tempHtml += '<div class="row-fluid botmbordercls"><div class="span5"> <p>' + temp.label + '</p></div><div class="span7">' + custData[temp.value] + "</p></div></div>";
											} else {
								tempHtml += '<b>' + temp.label + '</b>:' + '' + "<br>";
							}
						}
						$('#addrConfirmChangeAddr').html(tempHtml);
					}, error : function(errObj) {
						//console.log(errObj);
					}
				});
				$('#replace').text("Occupation/Service Details");
				$('#replace1').text("Occupation/Service Details");
				$('#replace2').text("Occupation/Service Details");
			}
	}
	
	AUI().ready(function(A) {		
	$('.showTracker').click(function(){
		
		
		var signverify="";
		if($('#addressssign_verifyY').is(":checked")){
			
			signverify="Y";
		
		}else if($('#addressssign_verifyN').is(":checked")){
			signverify="N";
		}else{
			
			signverify="off";
		}
		
	/* 	if($('#addressscomments').val()!=''){
			alert("Please mention comments");
		
		}else if(signverify=='off'){
			
			alert("Please check sign verification");
		}else if(signverify=='off'){
			
			alert("Please check sign verification");
		}else{
		 */
		 
		$.ajax({
			url : addressConfirmUrlObj.confirmRequest+'&comments='+$('#addressscomments').val()+'&approvalStatus='+$('#addresssapprovalStatus').val()+'&addressssignflag='+signverify+'&historyId=${historyId}',
			method : 'POST',
			success : function(result) {
			
				//console.log("Confirm details:"+ result);
				var sectin = sessionStorage.addressChangeConfirmSection;
			//if(sectin=='contact'){
				/*$('#confirmContact').show();
				$('#addressChangeConfirmCont').hide();
			} else{*/
				if(sessionStorage.corporateAddressChange == "false"){
					if(sectin=='contact'){
						$('#confirmContact').show();
						$('#addressChangeConfirmCont').hide();
					} else{
					$('#addressChangeConfirmCont').hide();
					$('#addressChangeTracker').show();
					$('#addresschangeHeading').show();
					}
					var curDtTime = new Date();	
					$('#custTypeName').text('Address Change');
					$('#custSRNum').text(result);
					$('#personalReqNum').text(result);//TODO
					$('#custSRDate').text(getDate(curDtTime));
					$('#custSRTime').text(getTimeHrsMins(curDtTime));				
					$('.lidate').text('By ' + getDate(curDtTime));
					if(sectin=='personal'){
						$('#pesrsonaldetails').show();
						$('#personalDetailstracker').show();
						$('#custTypeName').text('Name/DOB Change');
						$('#tooltext').text("Your Name/DOB Change");
						$('#tooltext1').text("Your Name/DOB Change");
						$('#tooltext2').text("Your Name/DOB Change");
						$('#tooltext3').text("Your Name/DOB Change");
						$('#tooltext4').text("Your Name/DOB Change");
					}else {					
						if(sectin=='contact'){
							$('#personalDetailstracker').hide();
						}else
							$('#personalDetailstracker').show();
						$('#custTypeName').text('Address Change');
						$('#tooltext').text("Your Address Change");
						$('#tooltext1').text("Your Address Change");
						$('#tooltext2').text("Your Address Change");
						$('#tooltext3').text("Your Address Change");
						$('#tooltext4').text("Your Address Change");
					}
				} else {
					$(".errorDialog").html('<p>Request has been successfully created</p>');
					$(".errorDialog").dialog({
						title : "Address Change",
						width : 'auto',
						modal : true,
						closeOnEscape: false,
						resizable : false,
						close: function() {
							$(this).dialog("close");
							window.location = '';					
						},
						buttons : [{
							text : "Close",
							width : 'auto',
							click : function() {
								$(this).dialog("close");
								window.location = '';						
							}
						}]
					});
				}
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
		//}
	});
		
	if(sessionStorage.corporateAddressChange == "false"){
		addressChangeConfirm();
	}	
});



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
    	
        customRadio("sign_verify");
        
        
    })
</script>