
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<portlet:defineObjects />
<theme:defineObjects />
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<portlet:resourceURL id="getAllBranches" var="getAllBranches" />
<portlet:resourceURL id="getAddressType" var="getAddressType" />
<portlet:resourceURL id="getBranchDetailsByCode"
	var="getBranchDetailsByCode" />
<portlet:resourceURL id="getAddressByAddressType"
	var="getAddressByAddressType" />
<portlet:resourceURL id="getDocsByName" var="getDocsByName" />
<portlet:resourceURL id="savePickUpDetails" var="savePickUpDetails" />
<portlet:renderURL var="uploadDocuments">
	<portlet:param name="action" value="uploadDocuments" />
</portlet:renderURL>
<portlet:renderURL var="takephoto" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="takephoto" />
</portlet:renderURL>


<portlet:renderURL var="previewPhoto"
	windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="previewPhoto" />
</portlet:renderURL>
<script>
	var uploaddocumentUrl = {};
	uploaddocumentUrl.getAllBranches= '<%= getAllBranches %>&<portlet:namespace/>'; 
	uploaddocumentUrl.getAddressType 		= '<%= getAddressType %>&<portlet:namespace/>';
	uploaddocumentUrl.getBranchDetailsByCode			= '<%= getBranchDetailsByCode %>&<portlet:namespace/>';
	uploaddocumentUrl.getAddressByAddressType			= '<%= getAddressByAddressType %>&<portlet:namespace/>policyNum=';
	uploaddocumentUrl.getDocsByName			= '<%= getDocsByName %>&<portlet:namespace/>';
	
	uploaddocumentUrl.savePickUpDetails			= '<%= savePickUpDetails %>&<portlet:namespace/>';
	uploaddocumentUrl.uploadDocuments			= '<%= uploadDocuments %>&<portlet:namespace/>';
	uploaddocumentUrl.takephoto			= '<%= takephoto %>&<portlet:namespace/>';
	uploaddocumentUrl.portletNamespace		= '<portlet:namespace/>';
	
	
	uploaddocumentUrl.getCustomerId = function() {
		
			return profile360.customerId;
		
	};
</script>
<div class="form_sub3 commentsbox" >
						<label style="width:15%;float:left;">Comments&nbsp;&nbsp;&nbsp;</label>
						<textarea name="comments" cols="90" rows="4" style="width:84%;" id="comments"></textarea>
						<div class="clr"> </div>	
					
					</div>
					<div class="clr"> </div>	
					<div class="form_sub3" style="width:50%;">
						
						<label class="signverfd" style="width:20%;float:left;">Sign Verified</label> 
						<label style="width:20%;float:left;"><input type="radio" style="float:left;margin:0 0 0;" value="Y" name="sv" id="signverifyY"></input>Yes</label>
						<label style="width:20%;float:left"><input type="radio" style="float:left;margin:0 0 0;" value="N" name="sv" id="signverifyN"></input>No</label>
						<div class="clr"> </div>	
						
					</div>
					
	
				
	
					<div class="clr"> </div>
				
	
 		<div class="row-fluid" >
				
				
				
				
				 
				 
				
			
			
				<form name="uploadform" id="uploadform"
					enctype="multipart/form-data" title="">
					<span class="addDocument">Add Document&nbsp;&nbsp;1<select
						class="picupselect" id="PickupSelDocType" name="PickupSelDocType" target="">

					</select>
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg" class="imgInp uploadimage" name="uploadbtn" title=""/></span> <input
						type="hidden" id="cust" name="cust" title=""/> <input type="hidden"
						id="doctype" name="doctype" title=""/> <a id="capture"
						name="capture" class="capture" style="cursor: pointer;" title="">Capture</a>
					</span> 
					<span class="add"   style="cursor: pointer; padding-left: 10px;" >Add</span>
					<a id="preview" class="addDocLink" style="cursor: pointer;" title="">&nbsp;</a>
					 <br>
				</form>
				
				<form name="uploadform" id="uploadform1"
					enctype="multipart/form-data" title="1" style="display: none;">
					<span class="addDocument" style="padding-left: 58px;"> 2<select
						class="picupselect" id="PickupSelDocType1" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg1" class="imgInp uploadimage" name="uploadbtn" title="1"/></span> 
							<input type="hidden" id="cust1" name="cust" title="1"/> 
							<input type="hidden" id="doctype1" name="doctype" title="1"/> 
							 <a id="capture1" name="capture" class="capture" style="cursor: pointer;" title="1">Capture</a>
					</span> 
					<span class="removeDiv" id="1" style="cursor: pointer; padding-left: 10px;">Remove</span>
					<a id="preview1" class="addDocLink" style="cursor: pointer;" title="1">&nbsp;</a>
					 <br>
				</form>
				
				<form name="uploadform" id="uploadform2"
					enctype="multipart/form-data" title="2" style="display: none;">
					<span class="addDocument" style="padding-left: 58px;"> 3 <select
						class="picupselect" id="PickupSelDocType2" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg2" class="imgInp uploadimage" name="uploadbtn" title="2"/></span> 
							<input type="hidden" id="cust2" name="cust" title="2"/> 
							<input type="hidden" id="doctype2" name="doctype" title="2"/> 
							 <a id="capture2" name="capture" class="capture" style="cursor: pointer;" title="2">Capture</a>
					</span>
					<span class="removeDiv" id="2" style="cursor: pointer; padding-left: 10px;">Remove</span>
					 <a id="preview2" class="addDocLink" style="cursor: pointer;" title="2">&nbsp;</a>
					 <br>
				</form>
				 
				 <form name="uploadform" id="uploadform3"
					enctype="multipart/form-data" title="3" style="display: none;">
					<span class="addDocument" style="padding-left: 58px;"> 4 <select
						class="picupselect" id="PickupSelDocType3" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg3" class="imgInp uploadimage" name="uploadbtn" title="3"/></span> 
							<input type="hidden" id="cust3" name="cust" title="3"/> 
							<input type="hidden" id="doctype3" name="doctype" title="3"/> 
							 <a id="capture3" name="capture" class="capture" style="cursor: pointer;" title="3">Capture</a>
					</span> 
					<span class="removeDiv" id="3" style="cursor: pointer; padding-left: 10px;">Remove</span>
					<a id="preview3" class="addDocLink" style="cursor: pointer;" title="3">&nbsp;</a>
					  <br>
				</form>
				
				<form name="uploadform" id="uploadform4"
					enctype="multipart/form-data" title="4" style="display: none;">
					<span class="addDocument" style="padding-left: 58px;"> 5 <select
						class="picupselect" id="PickupSelDocType4" name="PickupSelDocType">

					</select> 
						<span id="file_browse_wrapper"><input type="file"
							id="uploadImg4" class="imgInp uploadimage" name="uploadbtn" title="4"/></span> 
							<input type="hidden" id="cust4" name="cust" title="4"/> 
							<input type="hidden" id="doctype4" name="doctype" title="4"/> 
							 <a id="capture4" name="capture" class="capture" style="cursor: pointer;" title="4">Capture</a>
					</span> 
					<span class="removeDiv" id="4" style="cursor: pointer; padding-left: 10px;">Remove</span>
					<a id="preview4" class="addDocLink" style="cursor: pointer;" title="4">&nbsp;</a>
					 <br>
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
			
<!-- 	
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
		</div> -->

<script> 


function uploadDocs () {};

uploadDocs.elId = '';

uploadDocs.init = function(elId){	
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
	
	$('.pickupDt').attr('id',tmpId);
	$('#branchVisitOffice').change(function(){
		uploadDocs.getBranchDetails(elId);
	});
	$('#PickupSelAddrType').change(function(){
		uploadDocs.getAddressDetails(elId);
	});
	
	$('#' + tmpId).datepicker({
		showOn : "both",
		buttonImage : "/IFLService-theme/images/calender.png",
		changeMonth : true,
		changeYear : true,
		dateFormat : 'yy-mm-dd',
		yearRange : 'c-50:c'
	});
	
	$('#' + tmpId).change(function(){
		var date= $('#' + tmpId).val();
		$("#addrDocsPickupSelDate").html(date);
	});
	$('#picuptime').change(function(){
		var date= $('#picuptime').val();
		$("#addrDocsPickupSelTime").html(date);
	});
	
	$('#savepickup').click(function(){
		var type="";
		
		var inputObj = {};
		inputObj.custId = uploaddocumentUrl.getCustomerId();	
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
		inputObj.addrTypeId =$('#PickupSelAddrType').val();
		inputObj.pickupTime 	= $('#picuptime').val();
		inputObj.pickupDate 	= $('#' + tmpId).val();

		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				if(typeof(res.success) != 'undefined'){
					$('#'+type+'Div').hide();
					$('.addrChangeDocs[target='+type+']').hide();
					addressChange.showConfirmationPage(type);
					$('#addressChangeConfirmCont').show();
				}
			}, error : function(errObj) {
			}
		});
		
	});
	
	$('#savebranchvisit').click(function(){
		var inputObj = {};
		inputObj.custId = uploaddocumentUrl.getCustomerId();	
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
		inputObj.branchId 	= $('#branchVisitOffice').val();
		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				if(typeof(res.success) != 'undefined'){
					
					addressChange.showConfirmationPage(type);
					$('#'+type+'Div').hide();
					$('.addrChangeDocs[target='+type+']').hide();
					$('#addressChangeConfirmCont').show();
				}
			}, error : function(errObj) {
			}
		});
		
	});
	
	$('#uploadsubmit').click(function(){
		var inputObj = {};
		inputObj.custId = uploaddocumentUrl.getCustomerId();	
		inputObj.reqSubType 	='upload';
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
		
		$('#'+type+'Div').hide();
		$('.addrChangeDocs[target='+type+']').hide();
	if ($('#terms:checked').length =='1') {
		$.ajax({		
			dataType: "json",
			contentType: 'application/json',
			url:'<%= savePickUpDetails %>&<portlet:namespace/>' + 'jsonKey=' + JSON.stringify(inputObj),
			method:'POST',
			success : function(res) {
				if(typeof(res.success) != 'undefined'){
					addressChange.showConfirmationPage(type);
					$('#addressChangeConfirmCont').show();
				}
			}, error : function(errObj) {
			}
		});
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
	
	
	
	
	$('.uploadimage').change(function(){
		var id=$(this).attr('title');
		var pickup=$('#PickupSelDocType'+id).val();
		if(pickup==''){
			alert("Please select Document type");
			return false;
		}
		var id=$(this).attr('title');
		$('#cust'+id).val(uploaddocumentUrl.getCustomerId());
		if(elId=='personaladdrDocsTab'){
			$('#doctype'+id).val("Name");
		}else{
			$('#doctype'+id).val("Address");
		}
		$('#uploadform'+id).ajaxSubmit({
			 type:"POST",
	            url:"${uploadDocuments}",
	            data:$('#uploadform'+id).serialize(),
	            cache:false,
	            success: function(data){
	            	/* $('#capturepopup').html(data);
	            	$('#takephotodiv').modal(); */
	              }
	    	 });
	});
	
	
	
	
$('.capture').click(function(){
	var id=$(this).attr('title');
	var cust=uploaddocumentUrl.getCustomerId();
	var doctype;
	if(elId=='personaladdrDocsTab'){
		doctype="Name";
	}else{
		doctype="Address";
	}
	var pickup=$('#PickupSelDocType'+id).val();
	if(pickup==""){
		alert("Please select Document type");
		return false;
	}
	$.ajax({
			 type:"POST",
	            url:'${takephoto}&<portlet:namespace/>cust='+cust+'&PickupSelDocType='+pickup+'&doctype='+doctype,
	            success: function(data){
	            	$('#popup').html(data);
	            	
	            	$('.modal-content').css({ 'display':'block'});
	            	
	            	
    			 	$('.modal-backdrop').addClass("modal-backdrop fade in");
    			 	$('.modal').css({ 'display':'block'});
    			 	$('#capturephotodiv').modal();
	              }
	    	 });
	});
	
$('.addDocLink').click(function(){
	var id=$(this).attr('title');
	
	var cust=uploaddocumentUrl.getCustomerId();
	var doctype="Address";
	var pickup=$('#PickupSelDocType'+id).val();
	if(pickup==""){
		alert("Please select Document type");
		return false;
	}
	$.ajax({
			 type:"POST",
	            url:'${previewPhoto}&<portlet:namespace/>cust='+cust+'&PickupSelDocType='+pickup+'&doctype='+doctype,
	            success: function(data){
	            	$('.modal-backdrop').addClass("");
	            	$('#capturepopup').html(data);
	            	
	            	$('#takephotodiv').modal();
	           }
	    	 });
	});
	
	var i=1;
	var j=0;
 $('.add').click(function(){
	 i=1;
	 j=0;
	 $(".removeDiv").each(function() {
		 if(i==1){
			
		 if($('#uploadform'+this.id).is(':hidden')){
			 $('#uploadform'+this.id).show();
			 i=2;
			 j=1;
		 }
		 }
	  });
	 
	 if(j==0){
		 alert('You cannot add more than 5 ');
		 return false;
	 }
}); 
 
 $('.removeDiv').click(function(){
		var k=$(this).attr('id');
	 $('#uploadform'+k).hide();
	 
	
}); 
 
}




uploadDocs.getAllBranches = function(elId) {
	
	$.ajax({
		url : '<%= getAllBranches %>&<portlet:namespace/>',
		method : 'POST',
		success : function(result) {
			var custData = $.parseJSON(result);
			//addressChange.allBranches = custData;
			var sel = $("#branchVisitOffice");
		    sel.empty();
		    $("#branchVisitOffice").append('<option value="">Select Branch</option>');
		    for (var i=0; i<custData.length; i++) {
		    	$("#branchVisitOffice").append('<option value="' + custData[i]._BRANCH_ID + '">' + custData[i]._BRANCH_NAME + '</option>');
		    }
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};

uploadDocs.getAddressTypes = function(elId) {
	alert(elId);
	$.ajax({
		url : '<%= getAddressType %>&<portlet:namespace/>',
		method : 'POST',
		success : function(result) {
			var custData = $.parseJSON(result);
			//addressChange.addressTypes = custData;
			var sel = $("#PickupSelAddrType");
		    sel.empty();
		    $("#PickupSelAddrType").append('<option value="">Select Address</option>');
		    for (var i=0; i<custData.length; i++) {
		    	$("#PickupSelAddrType").append('<option value="' + custData[i]._ADDRESS_TYPE_ID + '">' + custData[i]._ADDRESS_TYPE_DESC + '</option>');
		    }
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};

uploadDocs.getBranchDetails = function(elId) {
	var branchcode= $('#branchVisitOffice').val();
	
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
			$("#branchdetails").html(tempHtml);
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};

uploadDocs.getAddressDetails = function(elId) {
	var addressType= $('#PickupSelAddrType').val();
	
	$.ajax({
		url : '<%= getAddressByAddressType %>&<portlet:namespace/>custId=' + sessionStorage.customerId +'&<portlet:namespace/>addressType='+addressType,
		method : 'POST',
		success : function(result) {
			var custAddressData = $.parseJSON(result);
			
			var tempHtml = '<br>';
			tempHtml +='<span style="padding-left:120px;">'+custAddressData._ADDRESS_LINE_1;
			tempHtml +=', '+custAddressData._ADDRESS_LINE_2;
			tempHtml +=', '+custAddressData._ADDRESS_LINE_3+"</span><br>";
			tempHtml +='<span style="padding-left:120px;">'+custAddressData._CITY;
			tempHtml +=', '+custAddressData._STATE;
			tempHtml +=', '+custAddressData._PIN_CODE+"</span><br>";
			tempHtml +='';
			//<p class="branchvistpara">10:00Am - 4:00Am </p>
		     // <p class="branchvistpara"><u>Branch Address:</u><br>IFL , Road NO.12 ,<br>Banjara Hills ,<br>Hyderabad 500026.</p>
			$("#addrDocsPickupSelAddr").html(tempHtml);
		}, error : function(errObj) {
			//console.log(errObj);
		}
	});
};



var docName="Address";
$.ajax({
	url : '<%= getDocsByName %>&<portlet:namespace/>docName='+docName,
	method : 'POST',
	success : function(result) {
		var custData = $.parseJSON(result);
		
		var sel = $("#PickupSelDocType");
	    sel.empty();
	   
	    $("#PickupSelDocType").append('<option value="">Select Document</option>');
	    $("#PickupSelDocType1").append('<option value="">Select Document</option>');
	    $("#PickupSelDocType2").append('<option value="">Select Document</option>');
	    $("#PickupSelDocType3").append('<option value="">Select Document</option>');
	    $("#PickupSelDocType4").append('<option value="">Select Document</option>');
	   /*  $("#PickupSelDocType5").append('<option value="">Select Document</option>');  */
	    
	    for (var i=0; i<custData.length; i++) {
	    	
	    	$("#PickupSelDocType").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
	    	$("#PickupSelDocType1").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
		     $("#PickupSelDocType2").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
		    $("#PickupSelDocType3").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
		    $("#PickupSelDocType4").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>');
		   /*  $("#PickupSelDocType5").append('<option value="' + custData[i]._ID + '">' + custData[i]._DOC_NAME + '</option>'); */ 
	    	
	    }
	    
	   
	   
	    
	    
	}, error : function(errObj) {
		//console.log(errObj);
	}
});

</script>
<script src="/IFLService-theme/js/js-dev/uploaddocuements.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery.form.js"
	type="text/javascript"></script>