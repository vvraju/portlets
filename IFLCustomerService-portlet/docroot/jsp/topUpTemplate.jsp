<%@ include file="/jsp/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>


<portlet:resourceURL id="getFundMasters" var="getFundMasters" />
<portlet:resourceURL id="getUlipPoliciesByCustId" var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getPoliciesByCustId" var="getPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFunds" var="getPolicyFunds" />
<portlet:resourceURL id="getPolicyInfoById" var="getPolicyInfoById" />
<portlet:resourceURL id="getPaymentModes" var="getPaymentModes" />
<portlet:resourceURL id="getPaymentModeTypes" var="getPaymentModeTypes" />
<portlet:resourceURL id="getPolicyFundsByPolicyId" var="getPolicyFundsByPolicyId" />
<portlet:resourceURL id="savePrePayment" var="savePrePayment" /> 
<portlet:resourceURL id="getPaymentOptions" var="getPaymentOptions" />
<portlet:resourceURL id="getPaymentOptionTypes" var="getPaymentOptionTypes" />
<portlet:resourceURL id="getNavHistory" var="getNavHistory" />
<portlet:resourceURL id="saveTopup" var="saveTopup" />


<portlet:renderURL var="topupUploadDocs" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="topupUploadDocs" />
</portlet:renderURL>

<portlet:renderURL var="previewtopupPolicyDoc" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="previewtopupPolicyDoc" />
</portlet:renderURL>

<portlet:renderURL var="PaymentResponse">
	<portlet:param name="action" value="PaymentResponse" />
</portlet:renderURL>


<portlet:renderURL var="topUpPayment">
	<portlet:param name="action" value="topUpPayment" />
</portlet:renderURL>

<portlet:renderURL var="topUp">
	<portlet:param name="action" value="topUp" />
</portlet:renderURL>

<script src="/IFLService-theme/js/js-dev/topUp.js"></script>

<script>
	var topUpURLObj = {};
	topUpURLObj.getPoliciesByCustId= '<%= getPoliciesByCustId %>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	topUpURLObj.getFundMasters 		= '<%= getFundMasters %>&<portlet:namespace/>';
	topUpURLObj.getCustomer			= '<%= getCustomer %>&<portlet:namespace/>custId=1';
	topUpURLObj.getPolicyFunds		= '<%= getPolicyFunds %>&<portlet:namespace/>policyNum=';	
	topUpURLObj.topUpPayment		= '<%= topUpPayment %>';
	topUpURLObj.getPolicyInfoById	= '<%= getPolicyInfoById %>&<portlet:namespace/>policyNum=';
	topUpURLObj.getPaymentModes		= '<%= getPaymentModes %>&<portlet:namespace/>';
	topUpURLObj.getPaymentModeTypes	= '<%= getPaymentModeTypes %>&<portlet:namespace/>PaymentMethodID=';
	topUpURLObj.getPolicyFundsByPolicyId = '<%= getPolicyFundsByPolicyId %>&<portlet:namespace/>policyNum=';
	topUpURLObj.savePrePayment			= '<%= savePrePayment %>';
	topUpURLObj.getPaymentOptions		= '<%= getPaymentOptions %>&<portlet:namespace/>';
	topUpURLObj.getPaymentOptionTypes	= '<%= getPaymentOptionTypes %>&<portlet:namespace/>PaymentOptionId=';
	topUpURLObj.PaymentResponse			= '<%= PaymentResponse %>&<portlet:namespace/>';
	topUpURLObj.getNavHistory			= '<%= getNavHistory %>&<portlet:namespace/>';
	topUpURLObj.saveTopup				= '<%= saveTopup %>&<portlet:namespace/>';
	topUpURLObj.portletNamespace		= '<portlet:namespace/>';
	
$(function(){
	var currentdate = new Date(); 
	var date = "" + currentdate.getDate() + "-"
	                + (currentdate.getMonth()+1)  + "-" 
	                + currentdate.getFullYear();
	 var time =""    + currentdate.getHours() + ":"  
	                + currentdate.getMinutes() + ":" 
	                + currentdate.getSeconds(); 
	                
   /*  var ampm =""    + hours >= 12 ? 'pm' : 'am';
	                hours = hours % 12;
	                hours = hours ? hours : 12; // the hour '0' should be '12'
	                minutes = minutes < 10 ? '0'+minutes : minutes;
	                var strTime = date + ' ' + hours + ':' + minutes + ' ' + ampm;
	                return strTime;  */
	                
	                $("#date").append(date);
	                $("#time").append(time);
	                
});
</script>

 <%@ include file="/jsp/subHeader.jsp"%> 

<div class="tab1content topUpMainCont"> 

   <!--  Confirmation message -->
   <!-- div class =topupPaymentConfirmation is changed into     topupPaymentConfirmationDELETE        -->
    
    
    
    <!--  Today nav start -->
    <div class="topupTodayNav" style="display:none;">
    	<div class="span3">&nbsp;</div>
    	<div class="span6 topUpNavTbl">
	    	
	    		   			
	    </div>
	    <div class="span3">&nbsp;</div>
	    <div class="clear"></div>
	    <div class="span3">&nbsp;</div>      	  	 		
 		<div class="span6 table_heading center" style="margin-left:0px;"> 
 			<%-- <aui:button id="topUpNAVCancel" name="topUpNAVCancel" value="Cancel"></aui:button>   --%>
 			<aui:button name="topUpNAVProceed" id="topUpNAVProceed" value="Proceed" style="float:right;"></aui:button> 
 		</div> 
 		<div class="span3">&nbsp;</div>
 		 <div class="clear"></div>
 		<div class="topupTodayNav">
	 		<p>
				<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.submitdetails.nav" />
			</p>
		</div>
			    
    </div>
    <!--  end of today nav -->
        
    <div class="clr"> </div><br>
    <div class="row-fluid" style="display: none;" id="tpallc">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" style="color: #02a9f7" id="toppolicy" >Select Policy</li>
       <li class="pipe" id="topallocation">Allocation</li>
        <li class="pipe" id="topcnfrm">Confirmation</li>
        <li class="pipe" id="toppayment">Payment</li>
         <li class="pipe" id="topacknwldg">Acknowlegement</li>
      
   </ul>
 </div>
</div>
    
    <div class="topupExistingAllocFundsSubHeader" style="display:none;">
    
    	<div class="table_heading left"> <liferay-ui:message key="services.fundswitch.policyno" />:&nbsp;<label id="" class="lbl" style="padding-left:20px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.policynumber" /></label> </div>
		
	  	<div class="table_heading right"> <liferay-ui:message key="services.fundswitch.declaration.policyname" />:&nbsp;&nbsp;&nbsp;&nbsp;<label id="" style="width:auto;padding-left:0px;" class="lbl"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.mediclaim" /> </label> </div>
	  	<div class="clr"> </div>
    </div>
    
    <div class="clr"> </div>
    
    <div class="topupExistingAllocFundsSelect" style="display:none;">    	
	  	<div class="">        
			<div class="topupAllocFunds">
			
				
			</div>
							
	 		<div class="clr"> </div>  
	 		<%-- <div style="margin-top:30px;">		 		
	 			<div class="span8 radiobtn">
	 				<p style="display:in-line;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.from.two" />:
	 				<span class="span6" style="display:block;float:right;"><input type="radio" name="topupFundAllocType" value="exist" /><label><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.first.option" /></label><br>
	 				<input type="radio" name="topupFundAllocType" value="new"  /><label><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.second.option" /></label></span></p>
	 				
	 			</div>
	 			
 				
		 			
		 		<div class="table_heading right">
		 			<aui:button name="btnTopupExistCont" id="btnTopupExistCont" value="Continue"></aui:button> 
		 			<aui:button id="btnTopupExistCancel" name="btnTopupExistCancel" value="Cancel"></aui:button>  		 			
		 		</div>
	 		</div>  --%>
		</div>
    </div>
    
    <div class="clr"> </div>
    
    <div class="topupExistingAllocFunds" style="display:none"> 
    <div style="margin-top:30px;">		 		
	 			<div class="span8 radiobtn">
	 				<p style="display:in-line;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.from.two" />:
	 				<span class="span6" style="display:block;float:right;"><%-- <input type="radio" name="topupFundAllocType" value="exist" /><label><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.first.option" /></label><br> --%>
	 				<input type="radio" name="topupFundAllocType" value="new" id="topupFundAllocType_ID" /><label><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.select.option.second.option" /></label></span></p>
	 				
	 			</div>
	 			
		 		
	 		</div> 
    	<div class="topupAllocFundsExistOrNew">
	    	
		</div>
		
		<div class="clr"> </div>
		
		
		<div style="margin-top:30px;">		 			 			
		 		<div class="table_heading right">
		 			<aui:button name="btnTopupFundSubmit" id="btnTopupFundSubmit" value="Submit"></aui:button> 
		 			<aui:button id="btnTopupFundCancel" name="btnTopupFundCancel" value="Cancel"></aui:button>  		 			
		 		</div>
	 		</div> 	
    </div>
    <div class="clr"> </div>
    
    <div style="display:none" class="topUpConfirmContainer">
   
	<div class="">
		<p> 
		<liferay-ui:message key="services.fundswitch.template.date" />:&nbsp;<label id="" style="font-weight:normal;" class="lbl"><span id="date"></span></label> <br>
		<liferay-ui:message key="services.fundswitch.template.time" />:&nbsp;<label id="" style="font-weight:normal;" class="lbl"><span id="time"></span></label></p>
		
		<p><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.see.submitted,fundswitch.details" /> </p>
		
	</div>
	
	 <div class="clr"> </div> 
	<div>
         
		<div class="topUpConfirmCont">
			
		</div>							
		<div class="clr"> </div>      	

		<div class="table_heading right" style="margin-top:30px;" id="btnTopupConfirmDiv"> 
			<aui:button name="btnTopupConfirm" id="btnTopupConfirm" value="Confirm"></aui:button> 
		 	<aui:button id="btnTopupConfirmCancel" name="btnTopupConfirmCancel" value="Cancel"></aui:button> 
		</div> 
		<div class="clr"> </div>      	
 	</div>
 	

<!--  	below is for uploading image if above 50000/10000000 -->
 	<div style="display:none" class="topUpuploadImage">
<form name="uploadform" id="uploadform" enctype="multipart/form-data" title="">
	<b id="topupuploadimagetext"> Pan Card/Imcome STMT</b><span class="addDocument">
		<span id="file_browse_wrapper"><input type="file" id="uploadTopupImg" class="imgInp" name="uploadTopupImg" title=""/></span>
		 <input	type="hidden" id="cust" name="cust" title=""/> 
		 <input type="hidden" id="doctype" name="doctype" title=""/> 
		
	</span> <a id="topuppreview" class="addDocLink" style="cursor: pointer;" title="">Preview</a>
	
</form>



<div class="modal fade" id="takephotodiv" align="center" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="">
			<div class="modal-dialog modalpmain-div">
				<div class="modal-content" style="border: 1px solid #cccccc;">
					<div class="modal-header header-div">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title title-text" id="myModalLabel">Uploaded Document</h4>
					</div>

					<div class="modal-body">
						<div class="row" id="capturepopup"></div>

					</div>

				</div>
			</div>
		</div>
<script>
$('#uploadTopupImg').change(function(){
	
	var topamount=topUp.topUpAmt;
	var polid=tpolicyNumber;
	var pamounmt=tpolicyAmount;
	var doctype='Pancard';
	if(pamounmt <=49999)
		{
		doctype="IncomeStmt";
		}
	
	//alert(cust+pamounmt+doctype+pickup+"  sessoinamunt   "+sessoinamunt+"topamount"+topamount);
	$('#uploadform').ajaxSubmit({
		 type:"POST",
           url:'${topupUploadDocs}&<portlet:namespace/>policyId='+polid+'&docType='+doctype,
           data:$('#uploadform').serialize(),
           cache:false,
           success: function(data){
           	/* $('#'+elId).find('#capturepopup').html(data);
           	$('#'+elId).find('#takephotodiv').modal(); */
        	 tisUploaded='true';
             }
   	 });
	
	});
$('#topuppreview').click(function(){
	var topamount=topUp.topUpAmt;
	var polid=tpolicyNumber;
	var pamounmt=tpolicyAmount;
	var doctype='Pancard';
	if(pamounmt <=49999)
		{
		doctype="IncomeStmt";
		}

	//alert(cust+pamounmt+doctype+pickup+"  sessoinamunt   "+sessoinamunt+"topamount"+topamount);
	  $.ajax({
		type:"POST",
		   url:'${previewtopupPolicyDoc}&<portlet:namespace/>policyId='+polid+'&docType='+doctype,
		   success: function(data){
		   	$('#capturepopup').html(data);
		   	$('#takephotodiv').modal();
		     }
		});  
});
</script>

<script src="${pageContext.request.contextPath}/js/jquery.form.js"
	type="text/javascript"></script>
</div>

<!-- upload image end here -->

  </div>
    
    <div class="clr"> </div>
  	<div id="topUpBtns" style="display:none;" class="selectPolicyCont">
  		<!--         	  
 		<div class="table_heading left" style="padding:0px;"> 
 			<aui:input type="checkbox" id="topUpCheckbox" name="" label=""></aui:input> 
 			<p class="accept"> I Accept <a href="#">Terms and Conditions</a> </p> 
 		</div> -->
 		<div class="table_heading right"> 
 			<aui:button id="topUpBtnCancel" name="topUpBtnCancel" value="Cancel"></aui:button>  
 			<aui:button name="topUpBtnProceed" id="topUpBtnProceed" value="Pay Top Up"></aui:button> </div> 
	</div>
<div id="PolicyDetailsDiv" style="display: none;">	
<div class="row-fluid">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" style="color: #02a9f7" id="tPolicy" >Select Policy</li>
       <li class="pipe" id="tallocation">Allocation</li>
       <li class="pipe" id="tcnfrm">Confirmation</li>
        <li class="pipe" id="tcnfrm">Payment</li>
         <li class="pipe" id="tacknwldg">Acknowledgement</li>
      
   </ul>
 </div>
</div>	
 <h3> <liferay-ui:message key="services.topup.heading.topup" /> </h3>
    <p class="marginclas"> <liferay-ui:message key="services.topup.heading.topup.description" /></p><br>					
							<div class="form_sub"> 
								<aui:input id="topUpTxtPayPolNum" name="topUpTxtPayPolNum" label="Policy Number" readonly="true"></aui:input>
								</div>
							<div class="form_sub DOBAssured"> 
								<aui:input id="topUpTxtPayDtDOB" name="topUpTxtPayDtDOB" label="DOB of Life Assured" readonly="true"></aui:input>
								</div>
								<div class="form_sub productname"> 
								<aui:input id="topUpTxtPayProdName" name="topUpTxtPayProdName" label="Product Name" readonly="true"></aui:input>
								</div>
								<div class="form_sub"> 
								<aui:input id="topUpTxtPayTopupAmt" name="topUpTxtPayTopupAmt" label="Topup Amount" onkeypress="return isNumberKey(event)"></aui:input>										
								 </div>
														
							<div class="topbtnclas right" >
								<aui:button id="topUpPayBtnProceed" name="topUpPayBtnProceed" type="button" value="Proceed"></aui:button>  
							</div>	
							</div>						
	<div class="clr"> </div>
</div>
<div class="row-fluid">
<div class="span12 topprocedbordr" id="topprocedbordr" style="display: none;"></div>
</div>

<div class="topUpTracker" style="display:none;">
	<%@ include file="/jsp/serviceTracker.jsp"%>
</div>


<div class="clr"> </div>
<div class="topupOnlinePaymentOptionsCont" style="display:none;">
	<%@ include file="/jsp/topUpPayment.jsp"%>
</div>

<div class="clr"> </div>
<div class="topupPaymentCont" style="display:none;margin-top:-20px;">
	<%@ include file="/jsp/topupOnlinePaymentOptions.jsp"%>
</div>
