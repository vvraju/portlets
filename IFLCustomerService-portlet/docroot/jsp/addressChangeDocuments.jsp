<%@ include file="/jsp/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<portlet:resourceURL id="getAllBranches" var="getAllBranches" />
<portlet:resourceURL id="getAddressType" var="getAddressType" />
<portlet:resourceURL id="getBranchDetailsByCode"
	var="getBranchDetailsByCode" />
<portlet:resourceURL id="getAddressByAddressType"
	var="getAddressByAddressType" />
<portlet:resourceURL id="getDocsByName" var="getDocsByName" />
<portlet:resourceURL id="savePickUpDetails" var="savePickUpDetails" />
<portlet:renderURL var="uploadDocuments" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="uploadDocuments" />
</portlet:renderURL>
<portlet:renderURL var="takephoto" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="takephoto" />
</portlet:renderURL>
<portlet:resourceURL id="saveNewAddress" var="saveNewAddress" />

<portlet:renderURL var="previewPhoto"
	windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="previewPhoto" />
</portlet:renderURL>

<portlet:resourceURL id="getCityDetailsByStateId" var="getCityDetailsByStateId" />

<div id="addressChangeDocsTab" style="display: none;">
	<ul class="nav nav-tabs">
		<li  class="active tab-selected"><a href="#uploadNow" id="uploadlink">Upload Now ${size}</a></li>
		<li><a href="#pickUpReq" id="pickuplink">Pickup Required</a></li>
		<li><a href="#branchVisit" id="branchlink">Branch Visit</a></li>
	</ul>

	<div class="tab-content">
		<div id="uploadNow" class="tab-pane">

			<div class="row-fluid" >
				<form name="uploadform" id="uploadform"
					enctype="multipart/form-data" title="" >
					<span class="addDocument"> Add Document&nbsp;&nbsp; 1.&nbsp;&nbsp;<select
						class="picupselect" id="PickupSelDocType" name="PickupSelDocType" target="">

					</select><input type="hidden"
						id="flag" name="flag" title=""/>
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg" class="imgInp" name="uploadbtn" title=""/></span> <input
						type="hidden" id="cust" name="cust" title=""/> <input type="hidden"
						id="doctype" name="doctype" title=""/> <a id="capture"
						name="capture" class="capture" style="cursor: pointer;" title="">Capture</a>
					</span> 
					<span class="" id="add" style="cursor: pointer; padding-left: 15px; padding-right: 15px;">Add</span>
					<a id="preview" class="addDocLink" style="cursor: pointer;" title="">&nbsp; </a>
					
					<span id="fname" style="display: inline-block;height: 15px;color: #00aaff;" ></span>
				</form>
				
				<form name="uploadform" id="uploadform1"
					enctype="multipart/form-data" title="1" style="display: none; padding-left: 81px;">
					<span class="addDocument">&nbsp;&nbsp;2.&nbsp;&nbsp; <select
						class="picupselect" id="PickupSelDocType1" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg1" class="imgInp" name="uploadbtn" title="1"/></span> 
							<input type="hidden" id="cust1" name="cust" title="1"/> 
							<input type="hidden" id="doctype1" name="doctype" title="1"/> 
							 <a id="capture1" name="capture" class="capture" style="cursor: pointer;" title="1">Capture</a>
					</span> 
					<span class="remove" id="remove1" style="cursor: pointer; padding-left: 15px; padding-right: 15px;">Remove</span>
					<a id="preview1" class="addDocLink" style="cursor: pointer;" title="1">&nbsp; </a>
					 <span id="fname1" style="display: inline-block;height: 15px;color: #00aaff;"></span>
				</form>
				
				<form name="uploadform" id="uploadform2"
					enctype="multipart/form-data" title="2" style="display: none; padding-left: 81px;">
					<span class="addDocument">&nbsp;&nbsp;3.&nbsp;&nbsp; <select
						class="picupselect" id="PickupSelDocType2" name="PickupSelDocType">

					</select>
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg2" class="imgInp" name="uploadbtn" title="2"/></span> 
							<input type="hidden" id="cust2" name="cust" title="2"/> 
							<input type="hidden" id="doctype2" name="doctype" title="2"/> 
							 <a id="capture2" name="capture" class="capture" style="cursor: pointer;" title="2">Capture</a>
					</span> 
					<span class="remove" id="remove2" style="cursor: pointer; padding-left: 15px; padding-right: 15px;">Remove</span>
					<a id="preview2" class="addDocLink" style="cursor: pointer;" title="2">&nbsp;</a>
					 <span id="fname2" style="display: inline-block;height: 15px;color: #00aaff;"></span>
				</form>
				 
				 <form name="uploadform" id="uploadform3"
					enctype="multipart/form-data" title="3" style="display: none; padding-left: 81px;">
					<span class="addDocument"> &nbsp;&nbsp;4.&nbsp;&nbsp; <select
						class="picupselect" id="PickupSelDocType3" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg3" class="imgInp" name="uploadbtn" title="3"/></span> 
							<input type="hidden" id="cust3" name="cust" title="3"/> 
							<input type="hidden" id="doctype3" name="doctype" title="3"/> 
							 <a id="capture3" name="capture" class="capture" style="cursor: pointer;" title="3">Capture</a>
					</span> 
					<span class="remove" id="remove3" style="cursor: pointer; padding-left: 15px; padding-right: 15px;">Remove</span>
					<a id="preview3" class="addDocLink" style="cursor: pointer;" title="3">&nbsp;</a>
					<span id="fname3" style="display: inline-block;height: 15px;color: #00aaff;"></span>
				</form>
				
				<form name="uploadform" id="uploadform4"
					enctype="multipart/form-data" title="4" style="display: none; padding-left: 81px;">
					<span class="addDocument"> &nbsp;&nbsp;5.&nbsp;&nbsp; <select
						class="picupselect" id="PickupSelDocType4" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg4" class="imgInp" name="uploadbtn" title="4"/></span> 
							<input type="hidden" id="cust4" name="cust" title="4"/> 
							<input type="hidden" id="doctype4" name="doctype" title="4"/> 
							 <a id="capture4" name="capture" class="capture" style="cursor: pointer;" title="4">Capture</a>
					</span> 
					<span class="remove" id="remove4" style="cursor: pointer; padding-left: 15px; padding-right: 15px;">Remove</span>
					<a id="preview4" class="addDocLink" style="cursor: pointer;" title="4">&nbsp;</a>
					<span id="fname4" style="display: inline-block;height: 15px; color: #00aaff;"></span>
				</form>
				
				<!-- <form name="uploadform" id="uploadform5"
					enctype="multipart/form-data" title="5" style="display: none;">
					<span class="addDocument"> Add Document <select
						class="picupselect" id="PickupSelDocType5" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg5" class="imgInp" name="uploadbtn" title="5"/></span> 
							<input type="hidden" id="cust5" name="cust" title="5"/> 
							<input type="hidden" id="doctype5" name="doctype" title="5"/> 
							 <a id="capture5" name="capture" class="capture" style="cursor: pointer;" title="5">Capture</a>
					</span> <a id="preview5" class="addDocLink" style="cursor: pointer;" title="5">Preview</a>
					<span class="" id="add" style="cursor: pointer; padding-left: 10px;">Add</span> <br>
				</form> -->
			</div>
			<div class="row-fluid">
		
				<div class="control-group">

					<label class="uploadlabel" style="width: 50%;"><input
						type="checkbox" id="terms" name="terms" value="1"></input> I agree the <a href="#" class="fundswitchterms" data-toggle="modal" data-target="#tandcModal" id="acTandcModal">Terms and Conditions</a></label>
				</div>
				<!-- <input type="button" class="btn btn-default pull-right"
					value="submit" id="uploadsubmit" name="uploadsubmit"></input> -->
			</div>


		</div>


		<div id="pickUpReq" style="padding: 0px 0px 10px 10px;">
			<b>Select Address Below To Pickup The Documents at Mentioned
				Address : </b>
			<div class="row-fluid totdiv">
				<br>
				<div class="span5 corporateside">

					<div class="">
						<label class="pickuplabel">Select Address</label> <select
							class="picupselect" id="PickupSelAddrType"
							name="PickupSelAddrType">

						</select>
					</div>
					
					
					
					<div id="newaddresdiv" style="display: none; height: auto; padding-bottom: 5px">
					
					<div >
						<label class="pickuplabel">Pincode</label>
						<input type="text" class="picupselect"
							 id="newpin" name="newpin" maxlength="6"></input>

					</div>
					<div >
						<label class="pickuplabel"> City</label> 
						<input type="text" class="picupselect"
							 id="newcity" name="newcity" maxlength="35" readonly="readonly"></input>
							 <input type="hidden"
							 id="newcityId" name="newcityId"></input>
					</div>
					<div class="">
						<label class="pickuplabel"> State</label> 
						<input type="text" class="picupselect"
							 id="newstate" name="newstate" maxlength="35" readonly="readonly"></input>
						<input type="hidden"
							 id="newstateId" name="newstateId"></input>
					</div>
					
					<div class="">
						<label class="pickuplabel ">Address Line1</label>
						<input type="text" class="picupselect"
							 id="newaddress1" name="newaddress1" maxlength="35"></input>

					</div>
					<div class="">
						<label class="pickuplabel"> Address Line2</label> <input type="text"
							class="picupselect" id="newaddress2" name="newaddress2" maxlength="35"></input>
					</div>
					<div class="">
						<label class="pickuplabel "> Address Line3</label> 
						<input type="text" class="picupselect"
							 id="newaddress3" name="newaddress3" maxlength="35"></input>
					</div>
					<br>
				</div>
				
				
				
				
					<div class="">
						<label class="pickuplabel"> Date</label> <input type="text"
							class="picupselect pickupDt" id="" name="" readonly="readonly"></input>
					</div>
					<div class="">
						<label class="pickuplabel"> Time</label> <select
							class="picupselect" id="picuptime" name="picuptime">
							<option value="">select</option>
							<option value="08:00">08:00</option>
							<option value="08:30">08:30</option>
							<option value="09:00">09:00</option>
							<option value="09:00">09:30</option>
							<option value="10:00">10:00</option>
							<option value="10:30">10:30</option>
							<option value="11:00">11:00</option>
							<option value="11:30">11:30</option>
							<option value="12:00">12:00</option>
							<option value="12:30">12:30</option>
							<option value="13:00">13:00</option>
							<option value="13:30">13:30</option>
							<option value="14:00">14:00</option>
							<option value="14:30">14:30</option>
							<option value="15:00">15:00</option>
							<option value="15:30">15:30</option>
							<option value="16:00">16:00</option>
							<option value="16:30">16:30</option>
							<option value="17:00">17:00</option>
						</select>
					</div>
				</div>
				<div class="span6" id="addresdiv">
					<p>Our BM agent will visit at below specified adress and time
					</p>
				<!-- 	<p style="border: 1px solid #666; height: 150px;">
						<b>Selected Address&nbsp;&nbsp;:</b>&nbsp; <span id="addrDocsPickupSelAddr" style="padding-left: 40px;"></span><br> 
							<span id="addrDocsPickupSelAddr1"
							style="padding-left: 40px;"></span><br>
							<span id="addrDocsPickupSelAddr2"></span><br>
							<span id="addrDocsPickupSelAddr3"></span><br>
							<span>Date&nbsp;&nbsp;&nbsp;</span><span style="padding-left:1px;">:</span>&nbsp; <span
							id="addrDocsPickupSelDate"></span><br> <span>Time&nbsp;&nbsp;&nbsp;</span><span>:</span>&nbsp; <span
							id="addrDocsPickupSelTime"></span>
					</p> -->
					
					<div class="b-content">
<div class="row-fluid tabborder">
<div class="span12">
 <div class="row-fluid">
  
  <div class="span5 "><p class="pselect">Selected</p><p>Address</p></div>
  <div class="span7 leftside_box" >
  <div class="row-fluid">
  <div class="span12 lineborder"><span id="addrDocsPickupSelPincode"></span> </div>
   <div class="span12 lineborder"><span id="addrDocsPickupSelCity"></span></div>
    <div class="span12 lineborder"><span id="addrDocsPickupSelState"></span></div>
     <div class="span12 lineborder"><span id="addrDocsPickupSelAddr1"></span></div>
      <div class="span12 lineborder"><span id="addrDocsPickupSelAddr2"></span></div>
       <div class="span12 lineborder"><span id="addrDocsPickupSelAddr3"></span></div>
  </div>
  
  </div>
  
  
 </div>
 <div class="row-fluid">
  <div class="span5 bottomtab"><p>Date</p></div>
  <div class="span7 leftside_box ">
  <div class="row-fluid"><div class="span12 lineborder"><span id="addrDocsPickupSelDate"></span></div></div>
  </div>
 </div>
 <div class="row-fluid">
  <div class="span5"><p>Time</p></div>
  <div class="span7 leftside_box">
  <div class="row-fluid"><div class="span12 lineborderl lineborder"><span id="addrDocsPickupSelTime"></span></div></div>
  </div>
 </div>
</div>
</div>
</div>
					
					
					
				</div>
				
				
				<!-- <input
						type="button" class="btn default" value="Submit" id="savepickup" ></input> -->
						<input
						type="button" class="btn default" value="Reset" id="resetpickup" style="display: none;"></input>

			</div>




		</div>



		<div id="" class="tab-pane">
			<b></b>
			<div class="row-fluid">
			
			<div class="span4 proflibranch"> 
			
			<label>Pincode</label>
			
    		<input type="text" name="pincode" id="pincode"/>
    	    
			<div class="clr"> </div> 
			
			</div>
			
			<div class="span4 proflibranch"> 
			
			<label>State</label>
			
			<select name="state" id="state" class="branchstate">
    		    <option value="">Select One</option>		
    	    </select>
			<div class="clr"> </div> 
			
			</div>
		
			
			<div class="span4 proflibranch"> 
			
			<label>City</label>
			
			<select name="city" class="city" id="city">
			    <option value="">Select One</option>	
    	    </select>
			<div class="clr"> </div> 
			
			</div>
			
			<div class="clr"> </div> 
			<br>
			<div class="span6 proflibranch" >
			
			<label>Branch Name / Area</label>
			
			<textarea rows="" cols=""></textarea>
			<div class="clr"> </div> 
			
			</div>
			
			
			<a  class="btn default" value="" id="submitbranchvisit">Search</a>
			
			<div class="clr"> </div> 
			
			
			
			
				<!-- <div class="span5" >
					<select class="picupselect" id="branchVisitOffice"
						name="branchVisitOffice">


					</select>
				</div>
				<div class="span6" id="branchdetailsshow" style="display: none;">
					<p> Branch Working Hrs</p>
					<div id="branchdetails"></div>
					
				</div> -->

			</div>
			<!--  <input type="button"
				class="btn default" value="Submit" id="savebranchvisit" name="savebranchvisit"></input> -->
		</div>

		<div class="modal fade" id="takephotodiv" align="center" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
			style="">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myModalLabel">Uploaded
							Document</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="capturepopup"></div>

					</div>

				</div>
			</div>
		</div>

		<div class="modal fade" id="capturephotodiv" align="center"
			tabindex="-1" role="dialog" aria-labelledby="myLabel"
			aria-hidden="true">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myLabel">Capture Photo</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="popup"></div>

					</div>

				</div>
			</div>
		</div>
	</div>

</div>
<div class="modal fade" id="takephotodiv" align="center" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
			style="">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myModalLabel">Uploaded
							Document</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="capturepopup"></div>

					</div>

				</div>
			</div>
		</div>

		<div class="modal fade" id="capturephotodiv" align="center"
			tabindex="-1" role="dialog" aria-labelledby="myLabel"
			aria-hidden="true">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myLabel">Capture Photo</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="popup"></div>

					</div>

				</div>
			</div>
		</div>
		
		
		
<script> 

$(function(){
	
	 
});


function addressChangeDocs () {};

addressChangeDocs.elId = '';
var pincoderegexp=/^[0-9]{6}$/;
var re1 =/^[a-zA-Z]+$/;
addressChangeDocs.init = function(elId){
	$('#' + this.elId).html($('#addressChangeDocsTab').html());
	YUI().use(
	  'aui-tabview',
	  function(Y) {
	    new Y.TabView(
	      {
	        srcNode: '#'+ elId,
	        type:'pills'
	      }
	    ).render();
	  }
	);
	
	var tmpId = 'cls' + elId + 'pickupDt';
	
	$('#'+elId).find('.pickupDt').attr('id',tmpId);
	
	$('#'+elId).find('#branchVisitOffice').change(function(){
		addressChangeDocs.getBranchDetails(elId);
	});
	$('#'+elId).find('#PickupSelAddrType').change(function(){
		addressChangeDocs.getAddressDetails(elId);
	});
	
	$('#'+elId).find('#' + tmpId).datepicker({
		showOn : "both",
		buttonImage : "/IFLService-theme/images/calender.png",
		changeMonth : true,
		changeYear : true,
		dateFormat : 'dd-mm-yy',
		//yearRange : '+50:c',
		minDate: 1
	});
	
	$('#'+elId).find('#' + tmpId).change(function(){
		var date= $('#'+elId).find('#' + tmpId).val();
		$('#'+elId).find("#addrDocsPickupSelDate").html(date);
	});
	$('#'+elId).find('#picuptime').change(function(){
		var date= $('#'+elId).find('#picuptime').val();
		$('#'+elId).find("#addrDocsPickupSelTime").html(date);
	});
	$('#'+elId).find('#resetpickup').click(function(){
		$('#'+elId).find('#newpin').val("");
		$('#'+elId).find('#newcity').val("");
		$('#'+elId).find('#newstate').val("");
		$('#'+elId).find('#newaddress1').val("");
		$('#'+elId).find('#newaddress2').val("");
		$('#'+elId).find('#newaddress3').val("");
		$('#'+elId).find("#addrDocsPickupSelDate").html('');
		$('#'+elId).find("#addrDocsPickupSelTime").html('');
		$('#'+elId).find("#addrDocsPickupSelAddr1").html('');
		$('#'+elId).find("#addrDocsPickupSelAddr2").html('');
		$('#'+elId).find("#addrDocsPickupSelAddr3").html('');
		$('#'+elId).find("#addrDocsPickupSelAddr").html('');
		$('#'+elId).find('#picuptime').val("");
		  $('#'+elId).find('#' + tmpId).val("");
	});
	$('#'+elId).find('#savepickup').click(function(){
		var type="";
		
		var inputObj = {};
		inputObj.custId = addressChange.getCustomerId();	
		inputObj.reqSubType 	='pickup';
		if(elId=='personaladdrDocsTab'){
			inputObj.subType	= 'Name/Dob Change';
			type="personal";
		}else if(elId=='permanentaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="permanent";
		}else if(elId=='communicationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="communication";
		}else if(elId=='occupationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="occupation";
		}
		
		var msg="";
		if($('#'+elId).find('#PickupSelAddrType').val()==''){
			msg=msg+"Please select Address type<BR>";
		}
		if($('#'+elId).find('#PickupSelAddrType').val()=='4'){
					

			if($('#'+elId).find('#newpin').val()==''){
				msg=msg+"Please enter Pincode<BR>";
			}else if(!pincoderegexp.test($('#'+elId).find('#newpin').val())){
				msg=msg+"Pincode must be numeric! Please remove spaces and any characters<BR>";
			}if(($('#'+elId).find('#newcity').val()=='') && ($('#'+elId).find('#newstate').val()=='')){
				msg=msg+"Please enter valid Pincode<BR>";
			}/* if($('#'+elId).find('#newstate').val()==''){
				msg=msg+"Please enter State name<BR>";
			} */if($('#'+elId).find('#newaddress1').val()==''){
				msg=msg+"Please enter Address Line1<BR>";
			}else if($('#'+elId).find('#newaddress1').val().charAt(0)==' '){
				msg=msg+"Address Line1 name must be Alphabets! Please remove spaces<BR>";
			}
					if(msg==""){
					inputObj.addrTypeId =$('#'+elId).find('#PickupSelAddrType').val();
					inputObj.pin 	= $('#'+elId).find('#newpin').val();
					inputObj.city 	= $('#'+elId).find('#newcity').val();
					inputObj.state 	= $('#'+elId).find('#newstate').val();
					inputObj.cityId = $('#'+elId).find('#newcityId').val();
					inputObj.stateId = $('#'+elId).find('#newstateId').val();
					inputObj.addr1 	= $('#'+elId).find('#newaddress1').val();
					inputObj.addr2 	= $('#'+elId).find('#newaddress2').val();
					inputObj.addr3 	= $('#'+elId).find('#newaddress3').val();
					
					
					}
					
		}
		if($('#'+elId).find('#picuptime').val()==''){
			msg=msg+"Please select Pick Up Time<BR>";
		}if($('#'+elId).find('#'+tmpId).val()==''){
			msg=msg+"Please select Pick Up Date<BR>";
		}
		
		
		
		
		if(msg==""){
		inputObj.addrTypeId =$('#'+elId).find('#PickupSelAddrType').val();
		inputObj.pickupTime 	= $('#'+elId).find('#picuptime').val();
		inputObj.pickupDate 	= $('#'+elId).find('#' + tmpId).val();
	
		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			//data: JSON.stringify(inputObj),
			url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				//var res =$.parseJSON(result);
				//console.log("save pickup details:" + res);
				if(typeof(res.success) != 'undefined'){
					$('#'+type+'Div').hide();
					$('.addrChangeDocs[target='+type+']').hide();
					addressChange.showConfirmationPage(type,res.historyId);
					$('#addressChangeConfirmCont').show();
				}
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
		}else{

			$(".errorDialog").html('<p>'+ msg +'</p>');
			$(".errorDialog").dialog({
				title : "Invalid Details",
				width : 'auto',
				modal : true,
				closeOnEscape: false,
				resizable : false,					
				buttons : [{
					text : "Close",
					width : 'auto',
					click : function() {
						$(this).dialog("close");										
					}
				}]
			});	
			
		}
	});
	
	$('#'+elId).find('#savebranchvisit').click(function(){
		var inputObj = {};
		inputObj.custId = addressChange.getCustomerId();	
		inputObj.reqSubType 	='branchvisit';
		if(elId=='personaladdrDocsTab'){
			inputObj.subType	= 'Name/Dob Change';
			type="personal";
		}else if(elId=='permanentaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="permanent";
		}else if(elId=='communicationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="communication";
		}else if(elId=='occupationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="occupation";
		}
		inputObj.branchId 	= $('#'+elId).find('#branchVisitOffice').val();
		//alert(inputObj.branchId);
		//alert(inputObj.custId+"=>"+inputObj.reqSubType+"=>"+inputObj.subType+"=>"+inputObj.addrTypeId+"=>"+inputObj.pickupTime+"=>"+inputObj.pickupDate);
		//$('#custFax').text()
		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			//data: JSON.stringify(inputObj),
			url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				//var res =$.parseJSON(result);
				//console.log("save Branch details:" + res);
				if(typeof(res.success) != 'undefined'){
					
					addressChange.showConfirmationPage(type);
					$('#'+type+'Div').hide();
					$('.addrChangeDocs[target='+type+']').hide();
					$('#addressChangeConfirmCont').show();
				}
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
		
	});
	
	$('#'+elId).find('#uploadsubmit').click(function(){
		var inputObj = {};
		inputObj.custId = addressChange.getCustomerId();	
		inputObj.reqSubType 	='upload';
		if(elId=='personaladdrDocsTab'){
			inputObj.subType	= 'Name/Dob Change';
			type="personal";
			
			addressChange.submitValues(this);
			
		}else if(elId=='permanentaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="permanent";
		}else if(elId=='communicationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="communication";
		}else if(elId=='occupationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="occupation";
		}
		
		
		//alert(inputObj.branchId);
		//alert(inputObj.custId+"=>"+inputObj.reqSubType+"=>"+inputObj.subType+"=>"+inputObj.addrTypeId+"=>"+inputObj.pickupTime+"=>"+inputObj.pickupDate);
		//$('#custFax').text()
	if ($('#terms:checked').length =='1') {
		$('#'+type+'Div').hide();
		if($('#'+elId).find('#flag').val()==1){
		$('.addrChangeDocs[target='+type+']').hide();
			$.ajax({		
				dataType: "json",
				contentType: 'application/json',
				//data: JSON.stringify(inputObj),
				url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
				method:'POST',
				success : function(res) {
					//var res =$.parseJSON(result);
					//console.log("save Branch details:" + res);
					if(typeof(res.success) != 'undefined'){
						addressChange.showConfirmationPage(type);
						$('#addressChangeConfirmCont').show();
					}
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			}else{
				$(".errorDialog").html('<p>Please Upload document or capture image .</p>');
				$(".errorDialog").dialog({
					title : "Invalid Details",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,					
					buttons : [{
						text : "Close",
						width : 'auto',
						click : function() {
							$(this).dialog("close");	
										
						}
					}]
				});	
			}
		}else{
			$(".errorDialog").html('<p>Please select terms and condition.</p>');
			$(".errorDialog").dialog({
				title : "Invalid Details",
				width : 'auto',
				modal : true,
				closeOnEscape: false,
				resizable : false,					
				buttons : [{
					text : "Close",
					width : 'auto',
					click : function() {
						$(this).dialog("close");	
									
					}
				}]
			});	
		}
		
	});
	
	
	
	
	
	$('#'+elId).find('.imgInp').change(function(){
		var id=$(this).attr('title');
		var pickup=$('#'+elId).find('#PickupSelDocType'+id).val();
		$('#'+elId).find('#flag').val(1);
		if(pickup==''){
			alert("Please select Document type");
			return false;
		}
		var id=$(this).attr('title');
		
		var main = ($('#'+elId).find('#uploadImg'+id)[0].files[0].size);
		
		var pos = ($('#'+elId).find('#uploadImg'+id).val()).lastIndexOf('.');
		
		 var  ext = ($('#'+elId).find('#uploadImg'+id).val()).substring(pos + 1);
		if(ext != "jpg" && ext != "gif"
		   && ext != "jpeg" && ext != "JPG"	&& ext != "GIF" && ext != "JPEG" && ext != "png" && ext != "PNG" && ext !='pdf' && ext !='PDF' )
		{
			alert("Please Upload image or pdf only");
			return false;
		}else if(main>2097152){
			alert("Image or Pdf size should be less than 2MB");
			return false;
		}
		
		$('#'+elId).find('#cust'+id).val(addressChange.getCustomerId());
		if(elId=='personaladdrDocsTab'){
			$('#'+elId).find('#doctype'+id).val("Name");
		}else{
			$('#'+elId).find('#doctype'+id).val("Address");
		}
		$('#'+elId).find('#uploadform'+id).ajaxSubmit({
			 type:"POST",
	            url:"${uploadDocuments}",
	            data:$('#'+elId).find('#uploadform'+id).serialize(),
	            cache:false,
	            success: function(data){
	            	 $('#'+elId).find('#fname'+id).html(data);
	            	 /*$('#'+elId).find('#takephotodiv').modal(); */
	              }
	    	 });
	});
	
	
	
	
$('#'+elId).find('.capture').click(function(){
	var id=$(this).attr('title');
	var cust=addressChange.getCustomerId();
	$('#'+elId).find('#flag').val(1);
	var doctype;
	if(elId=='personaladdrDocsTab'){
		doctype="Name";
	}else{
		doctype="Address";
	}
	var pickup=$('#'+elId).find('#PickupSelDocType'+id).val();
	if(pickup==""){
		alert("Please select Document type");
		return false;
	}
	$.ajax({
			 type:"POST",
	            url:'${takephoto}&<portlet:namespace/>cust='+cust+'&PickupSelDocType='+pickup+'&doctype='+doctype,
	            success: function(data){
	            	$('#'+elId).find('#popup').html(data);
	            	
	            	$('.modal-content').css({ 'display':'block'});
	            	
	            	
    			 	$('.modal-backdrop').addClass("modal-backdrop fade in");
    			 	$('.modal').css({ 'display':'block'});
    			 	$('#'+elId).find('#capturephotodiv').modal();
	              }
	    	 });
	});
	
$('#'+elId).find('.addDocLink').click(function(){
	var id=$(this).attr('title');
	var cust=addressChange.getCustomerId();
	var doctype;
	if(elId=='personaladdrDocsTab'){
		doctype="Name";
	}else{
		doctype="Address";
	}
	var pickup=$('#'+elId).find('#PickupSelDocType'+id).val();
	if(pickup==""){
		alert("Please select Document type");
		return false;
	}
	$.ajax({
			 type:"POST",
	            url:'${previewPhoto}&<portlet:namespace/>cust='+cust+'&PickupSelDocType='+pickup+'&doctype='+doctype,
	            success: function(data){
	            	$('#'+elId).find('#capturepopup').html(data);
	            	$('#'+elId).find('#takephotodiv').modal();
	              }
	    	 });
	});
	
	var i=1;
 $('#'+elId).find('#add').click(function(){
	 $('#'+elId).find('#uploadform'+i).show();
	 if(i>4){
		 alert('You cannot add more than 5 ');
		 return false;
	 }
	 i=i+1;
}); 
 
 $('#'+elId).find('#PickupSelDocType').change(function(){
	 $('#'+elId).find('#flag').val(0);
	});
 $('#'+elId).find('#PickupSelDocType1').change(function(){
	 $('#'+elId).find('#flag').val(0);
	});
 $('#'+elId).find('#PickupSelDocType2').change(function(){
	 $('#'+elId).find('#flag').val(0);
	});
 $('#'+elId).find('#PickupSelDocType3').change(function(){
	 $('#'+elId).find('#flag').val(0);
	});
 $('#'+elId).find('#PickupSelDocType4').change(function(){
	 $('#'+elId).find('#flag').val(0);
	});
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 
  $('#'+elId).find('#newpin').blur(function(){
	 var pincode= $('#'+elId).find('#newpin').val();
		
		$.ajax({
			url : addressChangeUrlObj.getCityStatenamesByPin+'pincode='+pincode,
			method : 'POST',
			success : function(result) {
				var custData = $.parseJSON(result);
				if(custData.error!=undefined){
					$('#'+elId).find('#newcity').val('');
					$('#'+elId).find('#newstate').val('');
					$('#'+elId).find('#newcityId').val('');
				    $('#'+elId).find('#newstateId').val('');
					    $(".errorDialog").html('<p> Please enter valid pincode </p>');
						$(".errorDialog").dialog({
							title : "Invalid Pincode",
							width : 'auto',
							modal : true,
							closeOnEscape: false,
							resizable : false,					
							buttons : [{
								text : "OK",
								width : 'auto',
								click : function() {
									$(this).dialog("close");	
															
								}
							}]
						});
				}else{
				$('#'+elId).find('#newcity').val(custData.cityName);
				$('#'+elId).find('#newstate').val(custData.stateName);
				$('#'+elId).find('#newcityId').val(custData.cityId);
			    $('#'+elId).find('#newstateId').val(custData.stateId);
					
				$('#'+elId).find("#addrDocsPickupSelPincode").html(pincode);
				$('#'+elId).find("#addrDocsPickupSelCity").html(custData.cityName);
				$('#'+elId).find("#addrDocsPickupSelState").html(custData.stateName);
				
				
				}
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
  });
  $('#'+elId).find('#newcity').on("change",function(){
	  
	  var tempHtml = '';
		tempHtml +=','+$('#'+elId).find('#newcity').val();
		$('#'+elId).find("#addrDocsPickupSelAddr").append(tempHtml);
	  
  });
 $('#'+elId).find('#newstate').on("change",function(){
	  
	  var tempHtml = '';
		tempHtml +=','+$('#'+elId).find('#newstate').val();
		$('#'+elId).find("#addrDocsPickupSelAddr").append(tempHtml);
	  
  });
 $('#'+elId).find('#newaddress1').on("change",function(){
	 $('#'+elId).find('#addrDocsPickupSelAddr1').empty();
	 var tempHtml = '<br>';
		tempHtml +='<span >'+$('#'+elId).find('#newaddress1').val();
		tempHtml +='</span>';
		$('#'+elId).find("#addrDocsPickupSelAddr1").append(tempHtml);
 });
 $('#'+elId).find('#newaddress2').on("change",function(){
	 $('#'+elId).find('#addrDocsPickupSelAddr2').empty();
	  var tempHtml = '';
	  tempHtml +='<span > '+$('#'+elId).find('#newaddress2').val()+'</span>';
		$('#'+elId).find("#addrDocsPickupSelAddr2").append(tempHtml);
	  
 });
 $('#'+elId).find('#newaddress3').on("change",function(){
	 $('#'+elId).find('#addrDocsPickupSelAddr3').empty();
	  var tempHtml = '';
	  tempHtml +='<span >'+$('#'+elId).find('#newaddress3').val()+"</span>";
		$('#'+elId).find("#addrDocsPickupSelAddr3").append(tempHtml);
	  
 });
 
 $('#'+elId).find('#uploadlink').click(function(){
	  
	  $('#'+elId).find('#PickupSelAddrType').val("");
	  $('#'+elId).find('#picuptime').val("");
	  $('#'+elId).find('#' + tmpId).val("");
	  $('#'+elId).find('#branchVisitOffice').val("");
	  $('#'+elId).find("#addrDocsPickupSelAddr").html("");
	  $('#'+elId).find("#addrDocsPickupSelDate").html("");
	  $('#'+elId).find("#addrDocsPickupSelTime").html("");
	  $('#'+elId).find('#branchdetailsshow').hide();
	  $('#'+elId).find('#branchdetails').html(" ");
	  $('#'+elId).find('#newaddresdiv').hide();
});
 $('#'+elId).find('#pickuplink').click(function(){
	  
	  $('#'+elId).find('#PickupSelDocType').val("");
	  $('#'+elId).find('#branchVisitOffice').val("");
	  $('#'+elId).find('#branchdetails').html(" ");
	  $('#'+elId).find('#uploadform1').hide();
	  $('#'+elId).find('#uploadform2').hide();
	  $('#'+elId).find('#uploadform3').hide();
	  $('#'+elId).find('#uploadform4').hide();
	  $('#'+elId).find('#branchdetailsshow').hide();
	  $('#'+elId).find('#newaddresdiv').hide();
	  i=1;
});
 $('#'+elId).find('#branchlink').click(function(){
	  
	  $('#'+elId).find('#PickupSelDocType').val("");
	  $('#'+elId).find('#PickupSelAddrType').val("");
	  $('#'+elId).find('#picuptime').val("");
	  $('#'+elId).find('#' + tmpId).val("");
	  $('#'+elId).find("#addrDocsPickupSelAddr").html("");
	  $('#'+elId).find("#addrDocsPickupSelDate").html("");
	  $('#'+elId).find("#addrDocsPickupSelTime").html("");
	  $('#'+elId).find('#uploadform1').hide();
	  $('#'+elId).find('#uploadform2').hide();
	  $('#'+elId).find('#uploadform3').hide();
	  $('#'+elId).find('#uploadform4').hide();
	  i=1;
});
 
 
 $('#'+elId).find('#remove1').click(function(){
		
		$('#'+elId).find('#uploadform1').hide();
		i=1;
		});
 $('#'+elId).find('#remove2').click(function(){
		
		$('#'+elId).find('#uploadform2').hide();
		i=2;
		});
 $('#'+elId).find('#remove3').click(function(){
		
		$('#'+elId).find('#uploadform3').hide();
		i=3;
		});
 $('#'+elId).find('#remove4').click(function(){
		
		$('#'+elId).find('#uploadform4').hide();
		i=4;
		});
 
 
 
 $('#'+elId).find('.branchstate').change(function() {
	
	var state = $(this).val();
	$.ajax({		
		url:'<%= getCityDetailsByStateId %>&<portlet:namespace/>state='+state,
		method:'POST',
		success : function(data) {
			var result=$.parseJSON(data);
			$('#'+elId).find('.city').empty();
		    var cityClass=	$('#'+elId).find('.city');
		    for (var i=0; i<result.length; i++) {
		    	
		    	cityClass.append('<option value="' + result[i]._CityId+ '">' + result[i]._CityName + '</option>');
		    }
		}
	});
	
	
	
	}); 
 
}




addressChangeDocs.getAllBranches = function(elId) {
	
	$.ajax({
		url : '<%= getAllBranches %>&<portlet:namespace/>',
		method : 'POST',
		success : function(result) {
			var custData = $.parseJSON(result);
			//addressChange.allBranches = custData;
			var sel = $("#branchVisitOffice");
		    sel.empty();
		    $('#'+elId).find("#branchVisitOffice").append('<option value="">Select Branch</option>');
		    for (var i=0; i<custData.length; i++) {
		    	$('#'+elId).find("#branchVisitOffice").append('<option value="' + custData[i]._BRANCH_ID + '">' + custData[i]._BRANCH_NAME + '</option>');
		    }
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};

addressChangeDocs.getAddressTypes = function(elId) {
	
	$.ajax({
		url : '<%= getAddressType %>&<portlet:namespace/>',
		method : 'POST',
		success : function(result) {
			var custData = $.parseJSON(result);
			//addressChange.addressTypes = custData;
			var sel = $("#PickupSelAddrType");
		    sel.empty();
		    $('#'+elId).find("#PickupSelAddrType").append('<option value="">Select Address</option>');
		    //$('#'+elId).find("#PickupSelAddrType").append('<option value="newaddress">New Address</option>');
		    for (var i=0; i<custData.length; i++) {
		    	$('#'+elId).find("#PickupSelAddrType").append('<option value="' + custData[i]._ADDRESS_TYPE_ID + '">' + custData[i]._ADDRESS_TYPE_DESC + '</option>');
		    }
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};

addressChangeDocs.getBranchDetails = function(elId) {
	var branchcode= $('#'+elId).find('#branchVisitOffice').val();
	if(branchcode==''){
		$('#'+elId).find('#branchdetailsshow').hide();
	}else{
	$('#'+elId).find('#branchdetailsshow').show();
		$.ajax({
			url : '<%= getBranchDetailsByCode %>&<portlet:namespace/>branchCode='+branchcode,
			method : 'POST',
			success : function(result) {
				var custData = $.parseJSON(result);
				
				var tempHtml = '';
				tempHtml +='<p class="branchvistpara">'+custData.openingTime + 'AM - ' + custData.closingTime +'PM</p>';
				tempHtml +='<p class="branchvistpara"><u>Branch Address:</u><br>'+custData.branchName +',<br>' + custData.address1 +',<br>' + custData.address2+',<br>' + custData.city +',<br>' + custData.state +',<br>' + custData.pin   +'</p>';
				tempHtml +='';
				//<p class="branchvistpara">10:00Am - 4:00Am </p>
			     // <p class="branchvistpara"><u>Branch Address:</u><br>IFL , Road NO.12 ,<br>Banjara Hills ,<br>Hyderabad 500026.</p>
				$('#'+elId).find("#branchdetails").html(tempHtml);
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
	}
};

addressChangeDocs.getAddressDetails = function(elId) {
	
	var addressType= $('#'+elId).find('#PickupSelAddrType').val();
	$('#'+elId).find("#addrDocsPickupSelDate").html('');
	$('#'+elId).find("#addrDocsPickupSelTime").html('');
	$('#'+elId).find('#resetpickup').hide();
	$('#'+elId).find("#addrDocsPickupSelPincode").html('');
	$('#'+elId).find("#addrDocsPickupSelCity").html('');
	$('#'+elId).find("#addrDocsPickupSelState").html('');
	$('#'+elId).find("#addrDocsPickupSelAddr1").html('');
	$('#'+elId).find("#addrDocsPickupSelAddr2").html('');
	$('#'+elId).find("#addrDocsPickupSelAddr3").html('');
	if(addressType=='4'){
		$('#'+elId).find('#resetpickup').show();
		$('#'+elId).find('#newaddresdiv').show();
		$('#'+elId).find("#addrDocsPickupSelAddr").html('');
		}else{
			$('#'+elId).find("#addrDocsPickupSelPincode").html('');
			$('#'+elId).find("#addrDocsPickupSelCity").html('');
			$('#'+elId).find("#addrDocsPickupSelState").html('');
			$('#'+elId).find("#addrDocsPickupSelAddr1").html('');
			$('#'+elId).find("#addrDocsPickupSelAddr2").html('');
			$('#'+elId).find("#addrDocsPickupSelAddr3").html('');
			$('#'+elId).find('#newaddresdiv').hide();
			$.ajax({
				url : '<%= getAddressByAddressType %>&<portlet:namespace/>custId=' + sessionStorage.customerId +'&<portlet:namespace/>addressType='+addressType,
				method : 'POST',
				success : function(result) {
					var custAddressData = $.parseJSON(result);
					
					//var tempHtml = '<br>';
					//tempHtml +='<span style="padding-left:120px;">'+custAddressData._ADDRESS_LINE_1;
					//tempHtml +=', '+custAddressData._ADDRESS_LINE_2;
					//tempHtml +=', '+custAddressData._ADDRESS_LINE_3+"</span><br>";
					//tempHtml +='<span style="padding-left:120px;">'+custAddressData._CITY;
					//tempHtml +=', '+custAddressData._STATE;
					//tempHtml +=', '+custAddressData._PIN_CODE+"</span><br>";
					//tempHtml +='';
					//<p class="branchvistpara">10:00Am - 4:00Am </p>
				     // <p class="branchvistpara"><u>Branch Address:</u><br>IFL , Road NO.12 ,<br>Banjara Hills ,<br>Hyderabad 500026.</p>
					//$('#'+elId).find("#addrDocsPickupSelAddr").html(tempHtml);
					
					$('#'+elId).find("#addrDocsPickupSelPincode").html(custAddressData._PIN_CODE);
					$('#'+elId).find("#addrDocsPickupSelCity").html(custAddressData._CITY);
					$('#'+elId).find("#addrDocsPickupSelState").html(custAddressData._STATE);
					$('#'+elId).find("#addrDocsPickupSelAddr1").html(custAddressData._ADDRESS_LINE_1);
					$('#'+elId).find("#addrDocsPickupSelAddr2").html(custAddressData._ADDRESS_LINE_2);
					$('#'+elId).find("#addrDocsPickupSelAddr3").html(custAddressData._ADDRESS_LINE_3);
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
		}
};

addressChangeDocs.getDocumentNames = function(elId) {
	var docName;
		if(elId=='personaladdrDocsTab'){
			docName= "Name";
		}else{
			docName= "Address";
		}
	
	$.ajax({
		url : '<%= getDocsByName %>&<portlet:namespace/>docName='+docName,
		method : 'POST',
		success : function(result) {
			var custData = $.parseJSON(result);
			
			var sel = $("#PickupSelDocType");
		    sel.empty();
		    $('#'+elId).find("#PickupSelDocType").append('<option value="">Select Document</option>');
		    $('#'+elId).find("#PickupSelDocType1").append('<option value="">Select Document</option>');
		    $('#'+elId).find("#PickupSelDocType2").append('<option value="">Select Document</option>');
		    $('#'+elId).find("#PickupSelDocType3").append('<option value="">Select Document</option>');
		    $('#'+elId).find("#PickupSelDocType4").append('<option value="">Select Document</option>');
		   /*  $('#'+elId).find("#PickupSelDocType5").append('<option value="">Select Document</option>');  */
		    
		    for (var i=0; i<custData.length; i++) {
		    	$('#'+elId).find("#PickupSelDocType").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
		    	$('#'+elId).find("#PickupSelDocType1").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
			     $('#'+elId).find("#PickupSelDocType2").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
			    $('#'+elId).find("#PickupSelDocType3").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
			    $('#'+elId).find("#PickupSelDocType4").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
			   /*  $('#'+elId).find("#PickupSelDocType5").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>'); */ 
		    	
		    }
		    
		   
		   
		    
		    
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
	
	
	
		
addressChangeDocs.uploadDocuments = function(elId,inputObj){	
	var type="";
		inputObj.custId = addressChange.getCustomerId();	
		inputObj.reqSubType 	='upload';
		if(elId=='personaladdrDocsTab'){
			inputObj.subType	= 'Name Change';
			type="personal";
			url=addressChangeUrlObj.updatePersonalDetails;
		}else if(elId=='personaldobaddrDocsTab'){
			inputObj.subType	= 'Dob Change';
			type="personaldob";
			url=addressChangeUrlObj.updatePersonalDetails;
		}else if(elId=='personalgenderaddrDocsTab'){
			inputObj.subType	= 'Gender Change';
			type="personalgender";
			url=addressChangeUrlObj.updatePersonalDetails;
		}else if(elId=='personalpanaddrDocsTab'){
			inputObj.subType	= 'Pancard Change';
			type="personalpan";
			url=addressChangeUrlObj.updatePersonalDetails;
		}else if(elId=='permanentaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="permanent";
			url=addressChangeUrlObj.updatePermanentAddress;
		}else if(elId=='communicationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="communication";
			url=addressChangeUrlObj.updatePermanentAddress;
		}else if(elId=='occupationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="occupation";
			
			url=addressChangeUrlObj.updateOfficeAddress;
			
		}
		
	if ($('#terms:checked').length =='1') {
		$('#'+type+'Div').hide();
		if($('#'+elId).find('#flag').val()==1){
		$('.addrChangeDocs[target='+type+']').hide();
			$.ajax({		
				dataType: "json",
				contentType: 'application/json',
				//data: JSON.stringify(inputObj),
				url:url + 'jsonKey=' + JSON.stringify(inputObj),
				method:'POST',
				success : function(res) {
					//var res =$.parseJSON(result);
					//console.log("save Branch details:" + res);
					if(typeof(res.success) != 'undefined'){
						
						addressChange.showConfirmationPage(type,res.historyId);
						$('#addressChangeConfirmCont').show();
					}else{
						$(".errorDialog").html('<p>'+ res.error +'</p>');
						$(".errorDialog").dialog({
							title : "Error",
							width : 'auto',
							modal : true,
							closeOnEscape: false,
							resizable : false,					
							buttons : [{
								text : "OK",
								width : 'auto',
								click : function() {
									$(this).dialog("close");										
								}
							}]
						});	
					}
				}, error : function(errObj) {
					//console.log(errObj);
				}
			});
			}else{
				$(".errorDialog").html('<p>Please Upload document or capture image .</p>');
				$(".errorDialog").dialog({
					title : "Invalid Details",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,					
					buttons : [{
						text : "Close",
						width : 'auto',
						click : function() {
							$(this).dialog("close");	
										
						}
					}]
				});	
			}
		}else{
			$(".errorDialog").html('<p>Please select terms and condition.</p>');
			$(".errorDialog").dialog({
				title : "Invalid Details",
				width : 'auto',
				modal : true,
				closeOnEscape: false,
				resizable : false,					
				buttons : [{
					text : "Close",
					width : 'auto',
					click : function() {
						$(this).dialog("close");	
									
					}
				}]
			});	
		}
		
		
	}
	
addressChangeDocs.savepickup = function(elId,inputObj){	
var type="";
var tmpId = 'cls' + elId + 'pickupDt';
inputObj.custId = addressChange.getCustomerId();	
inputObj.reqSubType 	='pickup';
if(elId=='personaladdrDocsTab'){
	inputObj.subType	= 'Name Change';
	type="personal";
	url=addressChangeUrlObj.updatePersonalDetails;
}else if(elId=='personaldobaddrDocsTab'){
	inputObj.subType	= 'Dob Change';
	type="personaldob";
	url=addressChangeUrlObj.updatePersonalDetails;
}else if(elId=='personalgenderaddrDocsTab'){
	inputObj.subType	= 'Gender Change';
	type="personalgender";
	url=addressChangeUrlObj.updatePersonalDetails;
}else if(elId=='personalpanaddrDocsTab'){
	inputObj.subType	= 'Pancard Change';
	type="personalpan";
	url=addressChangeUrlObj.updatePersonalDetails;
}else if(elId=='permanentaddrDocsTab'){
	inputObj.subType	= 'Address Change';
	type="permanent";
	url=addressChangeUrlObj.updatePermanentAddress;
}else if(elId=='communicationaddrDocsTab'){
	inputObj.subType	= 'Address Change';
	type="communication";
	url=addressChangeUrlObj.updatePermanentAddress;
}else if(elId=='occupationaddrDocsTab'){
	inputObj.subType	= 'Address Change';
	type="occupation";
	
	url=addressChangeUrlObj.updateOfficeAddress;
	
}

var msg="";
if($('#'+elId).find('#PickupSelAddrType').val()==''){
	msg=msg+"Please select Address type<BR>";
}
if($('#'+elId).find('#PickupSelAddrType').val()=='4'){
			

	if($('#'+elId).find('#newpin').val()==''){
		msg=msg+"Please enter Pincode<BR>";
	}else if(!pincoderegexp.test($('#'+elId).find('#newpin').val())){
		msg=msg+"Pincode must be numeric! Please remove spaces and any characters<BR>";
	}if(($('#'+elId).find('#newcity').val()=='') && ($('#'+elId).find('#newstate').val()=='')){
		msg=msg+"Please enter valid Pincode<BR>";
	}/* if($('#'+elId).find('#newstate').val()==''){
		msg=msg+"Please enter State name<BR>";
	} */if($('#'+elId).find('#newaddress1').val()==''){
		msg=msg+"Please enter Address Line1<BR>";
	}else if($('#'+elId).find('#newaddress1').val().charAt(0)==' '){
		msg=msg+"Address Line1 name must be Alphabets! Please remove spaces<BR>";
	}
			if(msg==""){
			inputObj.pickAddrTypeId =$('#'+elId).find('#PickupSelAddrType').val();
			inputObj.newPincode 	= $('#'+elId).find('#newpin').val();
			inputObj.newCity 	= $('#'+elId).find('#newcity').val();
			inputObj.newState 	= $('#'+elId).find('#newstate').val();
			inputObj.newCityId = $('#'+elId).find('#newcityId').val();
			inputObj.newStateId = $('#'+elId).find('#newstateId').val();
			inputObj.newAddr1 	= $('#'+elId).find('#newaddress1').val();
			inputObj.newAddr2 	= $('#'+elId).find('#newaddress2').val();
			inputObj.newAddr3 	= $('#'+elId).find('#newaddress3').val();
			
			
			}
			
}
if($('#'+elId).find('#picuptime').val()==''){
	msg=msg+"Please select Pick Up Time<BR>";
}if($('#'+elId).find('#'+tmpId).val()==''){
	msg=msg+"Please select Pick Up Date<BR>";
}




if(msg==""){
inputObj.addrTypeId =$('#'+elId).find('#PickupSelAddrType').val();
inputObj.pickupTime 	= $('#'+elId).find('#picuptime').val();
inputObj.pickupDate 	= $('#'+elId).find('#' + tmpId).val();

$.ajax({		
	dataType: "json",
	contentType: 'application/json',
	//data: JSON.stringify(inputObj),
	url:url + 'jsonKey=' + JSON.stringify(inputObj),
	method:'POST',
	success : function(res) {
		
		if(typeof(res.success) != 'undefined'){
			$('#'+type+'Div').hide();
			$('.addrChangeDocs[target='+type+']').hide();
			addressChange.showConfirmationPage(type,res.historyId);
			$('#addressChangeConfirmCont').show();
			
		}else{
			
			$(".errorDialog").html('<p>'+ res.error +'</p>');
			$(".errorDialog").dialog({
				title : "Error",
				width : 'auto',
				modal : true,
				closeOnEscape: false,
				resizable : false,					
				buttons : [{
					text : "OK",
					width : 'auto',
					click : function() {
						$(this).dialog("close");										
					}
				}]
			});	
		}
	}, error : function(errObj) {
		//console.log(errObj);
	}
});
}else{

	$(".errorDialog").html('<p>'+ msg +'</p>');
	$(".errorDialog").dialog({
		title : "Invalid Details",
		width : 'auto',
		modal : true,
		closeOnEscape: false,
		resizable : false,					
		buttons : [{
			text : "Close",
			width : 'auto',
			click : function() {
				$(this).dialog("close");										
			}
		}]
	});	
	
}

}
	
	
addressChangeDocs.savebranchvisit = function(elId,inputObj){	
		
	var url='';
		
		inputObj.custId = addressChange.getCustomerId();	
		inputObj.reqSubType 	='branchvisit';
		if(elId=='personaladdrDocsTab'){
			inputObj.subType	= 'Name Change';
			type="personal";
			url=addressChangeUrlObj.updatePersonalDetails; 
		}else if(elId=='personaldobaddrDocsTab'){
			inputObj.subType	= 'Dob Change';
			type="personaldob";
			url=addressChangeUrlObj.updatePersonalDetails; 
		}else if(elId=='personalgenderaddrDocsTab'){
			inputObj.subType	= 'Gender Change';
			type="personalgender";
			url=addressChangeUrlObj.updatePersonalDetails; 
		}else if(elId=='personalpanaddrDocsTab'){
			inputObj.subType	= 'Pancard Change';
			type="personalpan";
			url=addressChangeUrlObj.updatePersonalDetails; 
		}else if(elId=='permanentaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="permanent";
			url=addressChangeUrlObj.updatePermanentAddress;
		}else if(elId=='communicationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="communication";
			url=addressChangeUrlObj.updatePermanentAddress;
		}else if(elId=='occupationaddrDocsTab'){
			inputObj.subType	= 'Address Change';
			type="occupation";
			url=addressChangeUrlObj.updateOfficeAddress;
		}
		inputObj.branchId 	= $('#'+elId).find('#branchVisitOffice').val();
		
		if($('#'+elId).find('#branchVisitOffice').val()==""){
			
			$(".errorDialog").html('<p>Please select branch office</p>');
			$(".errorDialog").dialog({
				title : "Error",
				width : 'auto',
				modal : true,
				closeOnEscape: false,
				resizable : false,					
				buttons : [{
					text : "Close",
					width : 'auto',
					click : function() {
						$(this).dialog("close");										
					}
				}]
			});	
		}else{
		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			url:url+ 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				if(typeof(res.success) != 'undefined'){
					
					addressChange.showConfirmationPage(type,res.historyId);
					$('#'+type+'Div').hide();
					$('.addrChangeDocs[target='+type+']').hide();
					$('#addressChangeConfirmCont').show();
				}else{
				
				$(".errorDialog").html('<p>'+ res.error +'</p>');
				$(".errorDialog").dialog({
					title : "Error",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,					
					buttons : [{
						text : "OK",
						width : 'auto',
						click : function() {
							$(this).dialog("close");										
						}
					}]
				});	
				
				}
			}, error : function(errObj) {
				//console.log(errObj);
			}
		});
	}
	
}
	
};


</script>

<script src="${pageContext.request.contextPath}/js/jquery.form.js"
	type="text/javascript"></script>