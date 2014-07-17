<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <portlet:renderURL var="fundSwitch">
	<portlet:param name="action" value="fundSwitch" />
</portlet:renderURL> --%>
<portlet:renderURL var="addPersonalDetails">
	<portlet:param name="action" value="upadatePersonalDetails" />
</portlet:renderURL>
<portlet:renderURL var="addContactDetails">
	<portlet:param name="action" value="upadateContactDetails" />
</portlet:renderURL>
<portlet:renderURL var="addFamilyDetails">
	<portlet:param name="action" value="updateFamilyDetails" />
</portlet:renderURL>
<portlet:renderURL var="addcommunication">
	<portlet:param name="action" value="updateCommunication" />
</portlet:renderURL>
<portlet:renderURL var="addOffice">
	<portlet:param name="action" value="updateCommunication" />
</portlet:renderURL>
<portlet:renderURL var="addPermanent">
	<portlet:param name="action" value="updateCommunication" />
</portlet:renderURL>
<portlet:renderURL var="uploadDocuments">
	<portlet:param name="action" value="uploadDocuments" />
</portlet:renderURL>
<portlet:resourceURL id="updatecommunicationaddress"
	var="updatecommunicationaddressUrl" />
<portlet:renderURL var="takephoto">
	<portlet:param name="action" value="takephoto" />
</portlet:renderURL>

<%@ include file="/jsp/subHeader.jsp"%>

<div class="b-content">
	<div class="row-fluid">
		<div class="span12">
			<div class="span3 profile-list-alerts-big"
				style="background: #b1d8e7; height: 180px;">
				<div class="">
					<span style="height: auto;"> </span>
				</div>
				<div class="clr"></div>
			</div>

			<div class="span9 span9-margin-left">
				<div class="tab_con_right tab2content"
					style="width: auto; margin: 3px 10px;">
					<h3>My Profile</h3>
					<div id="personal">
						<table border="1">
							<tr>
								<td align="center">Personal Details</td>
								<td align="right"><input type="button" id="editpersonal"
									name="Edit" value="Edit" class="btn" />
							</tr>
							<tr>
								<td>FIRST NAME:</td>
								<td>${customerDetails.CUSTOMER_FIRST_NAME}</td>
							</tr>
							<tr>
								<td>MIDDLE NAME:</td>
								<td>${customerDetails.CUSTOMER_MIDDLE_NAME}</td>
							</tr>
							<tr>
								<td>LAST NAME:</td>
								<td>${customerDetails.CUSTOMER_LAST_NAME}</td>
							</tr>
							<tr>
								<td>DOB:</td>
								<td>${customerDetails.CUSTOMER_DATE_OF_BIRTH}</td>
							</tr>
						</table>
					</div>

					<div style="display: none;" id="personaledit">
						<aui:form action="${updatecommunicationaddressUrl}" name="pfm" id="pfm"
							method="post">
							<h4>Personal Details</h4>

							<div>
								<aui:input type="text"
									value="${customerDetails.CUSTOMER_FIRST_NAME}" name="fname"
									label="First Name"></aui:input>
							</div>
							<br>

							<div>
								<aui:input type="text"
									value="${customerDetails.CUSTOMER_MIDDLE_NAME}" name="mname"
									label="Middle Name"></aui:input>
							</div>
							<br>

							<div>
								<aui:input type="text"
									value="${customerDetails.CUSTOMER_LAST_NAME}" name="lname"
									label="Last Name"></aui:input>
							</div>
							<br>

							<div>
								<aui:input type="text"
									value="${customerDetails.CUSTOMER_DATE_OF_BIRTH}" name="dob"
									id="dob" cssClass="dob" label="DOB" />
							</div>
							<br>

							<div>
								<aui:button type="button" name="savepersonal" value="Save"
									id="savepersonal" />
								&nbsp;
								<aui:button type="button" id="pdcancel" name="pdcancel"
									value="Cancel" label=" " />
							</div>
							<br>
						</aui:form>
					</div>

					<div id="contact">
						<table border="1">
							<tr>
								<td align="center">Contact Details</td>
								<td align="right"><input type="button" id="editcontact"
									name="editcontact" value="Edit" class="btn" />
							</tr>
							<tr>
								<td>EMAIL-ID:</td>
								<td>${customerDetails.CUSTOMER_EMAIL_ADDR}</td>
							</tr>
							<tr>
								<td>TEL (Ofc):</td>
								<td>${customerDetails.PHONE_NUMBER_1}</td>
							</tr>
							<tr>
								<td>TEL (Res):</td>
								<td>${customerDetails.PHONE_NUMBER_2}</td>
							</tr>
							<tr>
								<td>MOBILE:</td>
								<td>${customerDetails.PHONE_NUMBER_3}</td>
							</tr>
						</table>
					</div>
					<div style="display: none;" id="contactedit">
						<aui:form action="${addContactDetails}" name="contactform"
							id="contactform" method="post">
							<h4>Contact Details</h4>
							<div>
								<aui:input type="text"
									value="${customerDetails.CUSTOMER_EMAIL_ADDR}" name="email"
									id="email" label="Email ID" />
							</div>
							<br>
							<div>
								<aui:input type="text" value="${customerDetails.PHONE_NUMBER_1}"
									name="ofctel" id="ofctel" label="TEL (Ofc)" />
							</div>
							<br>
							<div>
								<aui:input type="text" value="${customerDetails.PHONE_NUMBER_2}"
									name="restel" id="restel" label="TEL (Res)" />
							</div>
							<br>
							<div>
								<aui:input type="text" value="${customerDetails.PHONE_NUMBER_3}"
									name="mobile" id="mobile" label="Mobile" />
							</div>
							<br>
							<div>
								<aui:button type="submit" name="savecontact" value="Save"
									id="savecontact" />
								&nbsp;
								<aui:button type="button" id="ccancel" name="ccancel"
									value="Cancel" label=" " />
							</div>
							<br>

						</aui:form>
					</div>


					<c:forEach items="${customerDetailsList}" var="cdl">
						<c:if test="${cdl.ADDRESS_TYPE_ID eq 1 }">
							<div id="communication">
								<table border="1">
									<tr>
										<td colspan="2" align="CENTER"><b>Communication</b></td>
										<td align="right"><input type="button" id="editcomm"
											name="editcomm" value="Edit" class="btn" />
									</tr>
									<tr>
										<td>ADDRESS LINE 1:</td>
										<td>${cdl.ADDRESS_LINE_1}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 2:</td>
										<td>${cdl.ADDRESS_LINE_2}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 3:</td>
										<td>${cdl.ADDRESS_LINE_3}</td>
									</tr>
									<tr>
										<td>CITY:</td>
										<td>${cdl.CITY}</td>
									</tr>
									<tr>
										<td>DISTRICT:</td>
										<td>${cdl.DISTRICT}</td>
									</tr>
									<tr>
										<td>STATE:</td>
										<td>${cdl.STATE}</td>
									</tr>
									<tr>
										<td>COUNTRY:</td>
										<td>${cdl.COUNTRY}</td>
									</tr>
									<tr>
										<td>PIN CODE:</td>
										<td>${cdl.PIN_CODE}</td>
									</tr>
								</table>
							</div>

							<div id="editcommunication" style="display: none;">
								<aui:form action="" name="communciationform"
									id="communciationform">
									<aui:input type="hidden" value="${cdl.CUSTOMER_ADDRESS_ID}"
										name="comid" />
									<h4>Communication</h4>

									<div>
										<aui:input type="text" value="${cdl.ADDRESS_LINE_1}"
											name="commaddr1" id="comaddr1" label="Address Line1" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.ADDRESS_LINE_2}"
											name="commaddr2" id="comaddr2" label="Address Line2" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.ADDRESS_LINE_3}"
											name="commaddr3" id="comaddr3" label="Address Line3" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.CITY}" name="commcity"
											label="City" id="commcity" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.DISTRICT}" name="commdist"
											label="District" id="commdist" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.STATE}" name="commstate"
											label="State" id="commstate" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.COUNTRY}"
											name="commcountry" label="Country" id="commcountry" />
									</div>
									<br>
									<div>
										<aui:input type="text" value="${cdl.PIN_CODE}" name="commpin"
											label="Pin code" id="commpin" />
									</div>
									<br>
									<div>
										<aui:button type="button" name="savecontact" value="Save"
											id="savecommunication" onClick="return sss()" />
										&nbsp;
										<aui:button type="button" id="communicationcancel"
											name="communicationcancel" value="Cancel" label=" " />
									</div>
								</aui:form>
							</div>
						</c:if>
						<c:if test="${cdl.ADDRESS_TYPE_ID eq 2 }">
							<div id="office">
								<table>
									<tr>
										<td colspan="2" align="CENTER"><b>Office</b></td>
										<td align="right"><input type="button" id="editofc"
											name="editofc" value="Edit" class="btn" />
									</tr>
									<tr>
										<td>ADDRESS LINE 1:</td>
										<td>${cdl.ADDRESS_LINE_1}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 2:</td>
										<td>${cdl.ADDRESS_LINE_2}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 3:</td>
										<td>${cdl.ADDRESS_LINE_3}</td>
									</tr>
									<tr>
										<td>CITY:</td>
										<td>${cdl.CITY}</td>
									</tr>
									<tr>
										<td>DISTRICT:</td>
										<td>${cdl.DISTRICT}</td>
									</tr>
									<tr>
										<td>STATE:</td>
										<td>${cdl.STATE}</td>
									</tr>
									<tr>
										<td>COUNTRY:</td>
										<td>${cdl.COUNTRY}</td>
									</tr>
									<tr>
										<td>PIN CODE:</td>
										<td>${cdl.PIN_CODE}</td>
									</tr>
								</table>
							</div>
							<div id="editoffice" style="display: none;">
								<aui:form action="${addOffice}" name="fm">
									<table>
										<tr>
											<td colspan="2" align="CENTER"><b>Office</b></td>
										</tr>
										<tr>
											<td><aui:input type="hidden"
													value="${cdl.CUSTOMER_ADDRESS_ID}" name="comid" /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 1:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_1}"
													name="oaddr1" label=" " /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 2:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_2}"
													name="oaddr2" label=" " /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 3:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_3}"
													name="oaddr3" label=" " /></td>
										</tr>
										<tr>
											<td>CITY:</td>
											<td><aui:input type="text" value="${cdl.CITY}"
													name="ocity" label=" " /></td>
										</tr>
										<tr>
											<td>DISTRICT:</td>
											<td><aui:input type="text" value="${cdl.DISTRICT}"
													name="odist" label=" " /></td>
										</tr>
										<tr>
											<td>STATE:</td>
											<td><aui:input type="text" value="${cdl.STATE}"
													name="ostate" label=" " /></td>
										</tr>
										<tr>
											<td>COUNTRY:</td>
											<td><aui:input type="text" value="${cdl.COUNTRY}"
													name="ocountry" label=" " /></td>
										</tr>
										<tr>
											<td>PIN CODE:</td>
											<td><aui:input type="text" value="${cdl.PIN_CODE}"
													name="compin" label=" " /></td>
										</tr>
										<tr>
											<td><aui:button type="submit" id="saveoffice"
													name="save" value="Save" /></td>
											<td><aui:button type="button" id="officecancel"
													name="officecancel" value="Cancel" label=" " /></td>
										</tr>
									</table>
								</aui:form>
							</div>
						</c:if>
						<c:if test="${cdl.ADDRESS_TYPE_ID eq 3 }">
							<div id="permanent">
								<table>
									<tr>
										<td colspan="2" align="CENTER"><b>Permanent</b></td>
										<td align="right"><input type="button" id="editperm"
											name="editperm" value="Edit" class="btn" />
									</tr>
									<tr>
										<td>ADDRESS LINE 1:</td>
										<td>${cdl.ADDRESS_LINE_1}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 2:</td>
										<td>${cdl.ADDRESS_LINE_2}</td>
									</tr>
									<tr>
										<td>ADDRESS LINE 3:</td>
										<td>${cdl.ADDRESS_LINE_3}</td>
									</tr>
									<tr>
										<td>CITY:</td>
										<td>${cdl.CITY}</td>
									</tr>
									<tr>
										<td>DISTRICT:</td>
										<td>${cdl.DISTRICT}</td>
									</tr>
									<tr>
										<td>STATE:</td>
										<td>${cdl.STATE}</td>
									</tr>
									<tr>
										<td>COUNTRY:</td>
										<td>${cdl.COUNTRY}</td>
									</tr>
									<tr>
										<td>PIN CODE:</td>
										<td>${cdl.PIN_CODE}</td>
									</tr>
								</table>
							</div>
							<div id="editpermanent" style="display: none;">
								<aui:form action="${addPermanent}" name="fm">
									<table>
										<tr>
											<td colspan="2" align="CENTER"><b>Communication</b></td>
										</tr>
										<tr>
											<td><aui:input type="hidden"
													value="${cdl.CUSTOMER_ADDRESS_ID}" name="comid" /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 1:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_1}"
													name="paddr1" label=" " /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 2:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_2}"
													name="paddr2" label=" " /></td>
										</tr>
										<tr>
											<td>ADDRESS LINE 3:</td>
											<td><aui:input type="text" value="${cdl.ADDRESS_LINE_3}"
													name="paddr3" label=" " /></td>
										</tr>
										<tr>
											<td>CITY:</td>
											<td><aui:input type="text" value="${cdl.CITY}"
													name="pcity" label=" " /></td>
										</tr>
										<tr>
											<td>DISTRICT:</td>
											<td><aui:input type="text" value="${cdl.DISTRICT}"
													name="pdist" label=" " /></td>
										</tr>
										<tr>
											<td>STATE:</td>
											<td><aui:input type="text" value="${cdl.STATE}"
													name="pstate" label=" " /></td>
										</tr>
										<tr>
											<td>COUNTRY:</td>
											<td><aui:input type="text" value="${cdl.COUNTRY}"
													name="pcountry" label=" " /></td>
										</tr>
										<tr>
											<td>PIN CODE:</td>
											<td><aui:input type="text" value="${cdl.PIN_CODE}"
													name="ppin" label=" " /></td>
										</tr>
										<tr>
											<td><aui:button type="submit" id="savepermanent"
													name="save" value="Save" label=" " /></td>
											<td><aui:button type="button" id="permanentcancel"
													name="permanentcancel" value="Cancel" label=" " /></td>
										</tr>
									</table>
								</aui:form>
							</div>
						</c:if>

					</c:forEach>

					<div id="familydetails">
						<table>
							<tr>
								<td align="center">Family Details</td>
								<td align="right"><input type="button" id="editfamily"
									name="editfamily" value="Edit" class="btn" />
							</tr>
							<c:forEach items="${customerFamilyDetails}" var="cfd">
								<tr>
									<td>NAME OF PERSON:</td>
									<td>${cfd.PERSON_NAME}</td>
								</tr>
								<tr>
									<td>RELATION:</td>
									<td>${cfd.RELATION}</td>
								</tr>
								<tr>
									<td>DEPENDENT:</td>
									<td>${cfd.DEPENDENT}</td>
								</tr>
								<tr>
									<td>AGE:</td>
									<td>${cfd.AGE}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<div id="editfamilydetails" style="display: none;">
						<aui:form action="${addFamilyDetails}" name="fm">
							<table>
								<c:forEach items="${customerFamilyDetails}" var="cfd">
									<tr>

										<td><aui:input type="hidden"
												value="${cfd.CUSTOMER_FAMILY_ID}" name="familyId" /></td>
									</tr>
									<tr>
										<td>NAME OF PERSON:</td>
										<td><aui:input type="text" value="${cfd.PERSON_NAME}"
												name="personname" label=" " /></td>
									</tr>
									<tr>
										<td>RELATION:</td>
										<td><aui:input type="text" value="${cfd.RELATION}"
												name="relation" label=" " /></td>
									</tr>
									<tr>
										<td>DEPENDENT:</td>
										<td><aui:input type="text" value="${cfd.DEPENDENT}"
												name="dependent" label=" " /></td>
									</tr>
									<tr>
										<td>AGE:</td>
										<td><aui:input type="text" value="${cfd.AGE}" name="age"
												label=" " /></td>
									</tr>
								</c:forEach>
								<tr>
									<td><aui:button type="submit" id="savefamily" name="save"
											value="Save" label=" " /></td>
									<td><aui:button type="button" id="familycancel"
											name="familycancel" value="Cancel" label=" " /></td>
								</tr>
							</table>
						</aui:form>







					</div>

					<aui:form name="uploadform" action="${uploadDocuments}"
						enctype="multipart/form-data">
						<table>
							<tr>

								<td>Uploading Documents</td>
							</tr>
							<tr>
								<td>Upload document</td>
								<td><aui:input type="file" name="file1" /></td>
							</tr>

						</table>
					</aui:form>
					<div id="uploadedimage"></div>
				</div>
				<div>
					<aui:form name="takephoto" action="${takephoto}" id="takephoto">
					takephoto:					
					<aui:input type="submit" name="submit"></aui:input>
					</aui:form>
				</div>

			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
function validateForm(){

		var file1=$("#<portlet:namespace />file1").val();
		$.ajax({
			url:'${uploadDocuments}',
			type: 'GET',
			dataType:'text',
			cache:false,
			data:{file1: file1},
			success:function(data){
			
			}
		});
	}
function sss(){
	AUI().use('aui-form-validator',
			  function(B) {
			    var rules = {
			            <portlet:namespace/>commstate: {
			        required: true
			        
			      }
			    };
			    var fieldStrings = {};
			    new B.FormValidator(
			      {
			        boundingBox: '#<portlet:namespace/>communciationform',
			        fieldStrings: fieldStrings,
			        rules: rules,
			        showAllMessages: true
			     
			      }
			      
			    );
			  }
			);

	
	
}
	$(function() {
		
		$('#<portlet:namespace/>file1').change(function(){
			
			 $("#<portlet:namespace/>uploadform").ajaxSubmit({
				 type:"POST",
		            url:"${uploadDocuments}",
		            data:$("#<portlet:namespace/>uploadform").serialize(),
		            cache:false,
		            success: function(data){
		              
		            	$('#uploadedimage').html(data);
		              }
		    	
		    	
		    	 });	

		 
		// $("#<portlet:namespace/>uploadform").submit();
		});

		
		$('#takePhotoclick').click(function(){
			$.ajax({
			    type: 'POST',
			    // make sure you respect the same origin policy with this url:
			    // http://en.wikipedia.org/wiki/Same_origin_policy
			    url: 'takephoto',
			    data: { 
			        
			    },
			    success: function(result){
				  
			        $('#capturepopup').html(result);
			        $('#imagePath').val(true);
			       // $('#previewDiv').modal('toggle');
			        $('#takephotodiv').modal();
			    }
			});	 
		});

	$('#editpersonal').click(function() {
		$('#personal').hide();
		$('#personaledit').show();
	});
	$('#<portlet:namespace />pdcancel').click(function() {
		$('#personal').show();
		$('#personaledit').hide();
	});
	
	$('#editcontact').click(function() {
		$('#contact').hide();
		$('#contactedit').show();
	});
	
	$('#<portlet:namespace />ccancel').click(function() {
		$('#contact').show();
		$('#contactedit').hide();
	});
	$('#editfamily').click(function() {
		$('#familydetails').hide();
		$('#editfamilydetails').show();
	});
	$('#<portlet:namespace />familycancel').click(function() {
		$('#familydetails').show();
		$('#editfamilydetails').hide();
	});
	$('#editcomm').click(function() {
		$('#communication').hide();
		$('#editcommunication').show();
	});
	
	$('#<portlet:namespace />communicationcancel').click(function() {
		$('#communication').show();
		$('#editcommunication').hide();
	});
	
	$('#editofc').click(function() {
		$('#office').hide();
		$('#editoffice').show();
	});
	$('#<portlet:namespace />officecancel').click(function() {
		$('#office').show();
		$('#editoffice').hide();
	});
	$('#editperm').click(function() {
		$('#permanent').hide();
		$('#editpermanent').show();
	});
	$('#<portlet:namespace />permanentcancel').click(function() {
		$('#permanent').show();
		$('#editpermanent').hide();
	});
	$('#<portlet:namespace />savepersonal').click(function() {
		alert("sss");
		 if ($("#<portlet:namespace />pfm").valid()) {
			 $.ajax({
				 type: "POST",
				 url: "<%=updatecommunicationaddressUrl.toString()%>",
						data : {
							commstate : "ddd"
						},
						success : function(data) {
							jQuery("#discode_div").html(data);
						}
					});
        } else {
            alert('form is not valid');
        }
	
	
		});
	
	$("#<portlet:namespace />pfm").validate({ // initialize the plugin
        rules: {
        	fname: {
                required: true
            },
            mname: {
                required: true
            },
            lname: {
            	required: true
            }
            
            
        },
        submitHandler: function (form) { // for demo
            alert('valid form submitted'); // for demo
          // return false; // for demo
        }
    });

    $('#button').click(function() {
        if ($('#myform').valid()) {
            alert('form is valid - not submitted');
        } else {
            alert('form is not valid');
        }
    });
	});
</script>

<%@ include file="/jsp/subFooter.jsp"%>
<div class="errorDialog"></div>




<script>
	$(function() {
		$("#<portlet:namespace />dob").datepicker({
			showOn : "both",
			buttonImage : "/IFLService-theme/images/calender.png",
			changeMonth : true,
			changeYear : true,
			dateFormat : 'dd-mm-yy',
			yearRange : 'c-50:c'
		});

	});
	AUI().ready(function(A) {

		$('.topnav_tabs span').removeClass('active');
		$('.topnav_tabs .fund_switch_nav').addClass('active');
	});

	<aui:script>
/* 	AUI().use('aui-form-validator', function(A) {

		//define rules for fields
		var rules = {
			<portlet:namespace/>fname : {
				required : true,
				alphanum : true
			},
			<portlet:namespace/>lname : {
				required : true,
				alphanum : true
			},
			<portlet:namespace/>dob : {
				required : true
			}
		};
			var fieldStrings = {};
		new A.FormValidator({
			boundingBox : '#<portlet:namespace/>pfm',
			fieldStrings : fieldStrings,
			rules : rules,
			showAllMessages : true
		});
	}); */

	AUI().use('aui-form-validator', function(B) {
		var rules = {
			<portlet:namespace/>email : {
				required : true,
				email : true
			},
			<portlet:namespace/>mobile : {
				required : true,
				digits : true
			}
		};
		var fieldStrings = {};
		new B.FormValidator({
			boundingBox : '#<portlet:namespace/>contactform',
			fieldStrings : fieldStrings,
			rules : rules,
			showAllMessages : true
		});
	});

	</aui:script>
</script>

<script src="${ctxPath}/js/jquery.form.js" type="text/javascript"></script>