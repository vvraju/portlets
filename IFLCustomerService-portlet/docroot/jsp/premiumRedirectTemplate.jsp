<%@ include file="/jsp/init.jsp" %>


<portlet:resourceURL id="getFundMasters" var="getFundMasters" />
<portlet:resourceURL id="getUlipPoliciesByCustId" var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFundsForPremRedir" var="getPolicyFundsForPremRedir" />
<portlet:resourceURL id="savePremRedir" var="savePremRedir" />
<portlet:renderURL var="premiumRedirectHome">
	<portlet:param name="action" value="premiumRedirectHome" />
</portlet:renderURL>
<portlet:defineObjects />

<script>
	var premiumRedirectURLObj = {};
	premiumRedirectURLObj.getUlipPoliciesByCustId= '<%= getUlipPoliciesByCustId %>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	premiumRedirectURLObj.getFundMasters 		= '<%= getFundMasters %>&<portlet:namespace/>';
	premiumRedirectURLObj.getCustomer			= '<%= getCustomer %>&<portlet:namespace/>custId=1';
	premiumRedirectURLObj.getPolicyFundsForPremRedir= '<%= getPolicyFundsForPremRedir %>&<portlet:namespace/>policyNum=';
	premiumRedirectURLObj.savePremRedir			= '<%= savePremRedir %>&<portlet:namespace/>jsonKey=';
		
	premiumRedirectURLObj.portletNamespace		= '<portlet:namespace/>'; //TODO: make it as global
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

<div id="premiumRedirectionCon" style="display:none;" class="tab1content">
   <div class="row-fluid" id="premiumredirecthead" style="display:none;"><h1 style="font-size:16px;color:#ffb2ae;">Premium Redirection</h1></div>
   	
   	<div class="span4" style="margin-left:0px;"><label style="width:auto;" class="lbl cor_lbl"><liferay-ui:message key="services.premiumredirect.template.premiumamount" /></label>&nbsp;<span id="selPremiumAmt" name="selPremiumAmt"></span></div>
   	<div class="policynamefd" style=""><span style="float:right;">Policy Name:&nbsp;<span id="policyName" style="width:auto;padding-left:0px;cursor: text; color: #666;"> </span> </span>
 </div>
   	
   	<div class="clearfix"></div>
   	        
	<div class="span12 corpremiem" style="margin-left:10px;">
   		<div id="premiumRedirectionTableCont">
   		   		</div>
	</div>
	<div class="clr"> </div>  
	<div class="row-fluid">
	<div class="table_heading left" id="premiumredirectacceptterms"> <input type="checkbox" id="chkPRAccept" name="chkPRAccept" /> <p class="accept" style="margin-top: -17px;font-size: 11px;margin-left: 10px;"> I Accept <a href="#"  class="fundswitchterms" data-toggle="modal" data-target="#tandcModal" id="prTandcModal" >Terms and Conditions</a> </p> </div>	
	
		
	<%-- <div id="premiumcommentsDiv" style="width: 133%;margin-top: 10px;display: none;"  >
	<jsp:include page="/jsp/premiumuploadDocuments.jsp"></jsp:include>
	</div> --%>

	<div class="table_heading right" style="margin-bottom:30px;display:none;" id="prcorporateButtons">
	
	<input type="button" id="btnPRSubmitcorporate" name="btnPRSubmit" value="Submit" class="btn" />		
	<input type="button" class="btn" id="btnPRCancel1" name="btnPRCancel" value="Reset" />
	 <input type="button" class="btn" id="btnPRCancel" name="btnPRCancel" value="View Docs" />
	</div>	
	
	<div class="table_heading right" style="margin-bottom:30px;" id="prserviceButtons">
	<input type="button" id="pRedirectBtnCancel" name="pRedirectBtnCancel" value="Cancel" class="btn" />
	<input type="button" id="btnPRSubmit" name="btnPRSubmit" value="Proceed" class="btn" />		
	
	</div>	</div>	
</div>
<div class="clr"> </div>  

<div class="border-top noDefault declarationSection" style="display: none;" id="landborderbottom"> </div>

<div id="confirmPremiumRedirection" class="tab1content"style="display:none;">
	
	<!-- <div id="corporateFundSwitchConfirm" style="display:none" class="fundSwitchConfirmContainer tab1content"> -->
	<div class="" style="margin-top:2%">
		
		<div style="display:block;width:100%;float:left;">
		<p style="width:20%;float:left;display:inline-block;">
		
		Date:&nbsp;<span id="lblDate" style="font-weight:normal;cursor: text;" class="lbl"><%=dateNow %><br><br></span> 
		
		Time:&nbsp;<span id="lTime" style="font-weight:normal;cursor: text;" class="lbl"> </span><br><br>
		
		</p>
		</div>
		
		
		<p>Please see below the Fund Switch details as submitted by you. To execute the transaction kindly click on confirm button.If you want to edit the details kindly click on edit button.<br />
           Request once confirmed can't be reversed. </p>
		<br><br>
	</div>
	
	 <div class="clr"> </div> 
	<div>
	

<div class="span12">
	<div class="row-fluid">	
	<div class="span3"></div>	 
	<div id="confirmPremiumRedirectionTbl" class="span6"></div>
	<div class="span3"></div>

	</div>
	 
	<div class="clr"></div>

   <div class="row-fluid">
    <div class="span3"></div>
	<div class="span6 table_heading right corporateright" style="margin-bottom:30px;">	
	<input type="button" id="btnPRConfCancel" name="btnPRConfCancel" value="Edit" class="btn" style="margin-left:84px;"/>
	<input type="button" id="btnSavePR" name="btnSavePR" value="Confirm" class="btn" />	
	</div>
	</div>
	</div>
	</div>
</div>
<div class="tab1content">
<div class="row-fluid"><div class="span12 prm_alcatn_confrm" id="prm_alcatn_confrm" style="display:none;"></div></div></div>
<div style="display:none;margin-top:20px;" class="col-md-10" id="premiumRedirectTracker">
<%@ include file="/jsp/fundSwitchTracker.jsp"%>
</div>

<div class="modal fade" id="prtandcModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header termspopup">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="color:#fff">x</button>
           <h5 class="modal-title" id="myModalLabel" style="text-align: center;">Terms and Conditions</h5>
            </div>
            <div class="modal-body">
                <%@ include file="/jsp/termsandconditions.jsp"%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
               
        </div>
    </div>
  </div>
</div>

<script src="/IFLService-theme/js/js-dev/premiumRedirect.js"></script> 
<script>
//premiumUploadDocs.init();
</script>

<script>

$(function(){
		
	$("#prTandcModal").click(function(){
		$.ajax({
			url : '<%=termsAndConditions%>',
			method : 'POST',
			success : function(result) {
				$('#prtandcModal').modal('show'); 
			}
		
	    });
		});
	
	
});

</script>