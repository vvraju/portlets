<%@ include file="/jsp/init.jsp" %>

<portlet:resourceURL id="getFundMasters" var="getFundMasters" />
<portlet:resourceURL id="getUlipPoliciesByCustId" var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFunds" var="getPolicyFunds" />
<portlet:resourceURL id="saveFundswitch" var="saveFundswitch" />

<portlet:renderURL var="fundSwitchHome">
	<portlet:param name="action" value="fundSwitchHome" />
</portlet:renderURL> 


<script src="/IFLService-theme/js/js-dev/fundSwitch.js"></script>
<script src="/IFLService-theme/js/js-dev/uploaddocuements.js"></script>
<script>
	var fundSwitchURLObj = {};
	fundSwitchURLObj.getUlipPoliciesByCustId= '<%= getUlipPoliciesByCustId %>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	fundSwitchURLObj.getFundMasters 		= '<%= getFundMasters %>&<portlet:namespace/>';
	fundSwitchURLObj.getCustomer			= '<%= getCustomer %>&<portlet:namespace/>custId=';
	fundSwitchURLObj.getPolicyFunds			= '<%= getPolicyFunds %>&<portlet:namespace/>policyNum=';
	fundSwitchURLObj.saveFundswitch			= '<%= saveFundswitch %>&<portlet:namespace/>jsonKey=';
		
	fundSwitchURLObj.portletNamespace		= '<portlet:namespace/>';
	
	
	
</script>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>

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

<div id="corporatePolicyDetails" class="declarationSection " style="display:none">
<div class="row-fluid" id="fundswitchhead" style="display:none;"><h1 style="font-size:16px;color:#ffb2ae;">Fund Switch</h1></div>
	<div class="" style="margin-top:-2%" id="noteblock">	
		<p calss="fdpara">
			I Nilesh Modekar here by confirm that I have understood all relevant policy provision before submitting this request UI perspiciatis unde omnis iste natus error sit voluptatem
	        accusantium doloremque laudantium, totam remas aperium, eaque ipsa quae ab illo inventone veritatis et quasi architecto beatae vitae dicta sunt explicabo.	
		</p><br>
	</div>
			
	<div class="clr"> </div>
	<div style="width:100%;float:left;display:inline-block;">
	<div class="corportfund" style="float:left;display:inline-block;width:60%; color: #666;"><span class="corportefund" style="padding-left:10px;">Policy No.:&nbsp;</span><span id="lblPolicyNum" class="lbldeclarationSection" style="color: #666;"></span> </div>
  
  <div class="policynamefd" style="">Policy Name:&nbsp;<span id="lblPolicyName" style="width:auto;padding-left:0px;cursor: text; color: #666;"> </span> 
 </div>
 </div>
  
  	<div class="clr"> </div>
  	<div class="fundswitch_table">        
		<div id="fundDetails">
					</div>	
 		<div class="clr"> </div>
 		<div  id="uploadcomments">
 		
 		</div>
 <div id="commentsDiv" style="width: 133%;margin-top: 10px;display: none;"  >
			<jsp:include page="/jsp/uploadDocuments.jsp"></jsp:include>
			</div>
 		<div class="table_heading left" style="padding:0px;" id="acceptTermsAndConditions"> <input type="checkbox" id="chkAccept" name="chkAccept" /> <p class="accept"> I Accept <a href="#"  class="fundswitchterms" data-toggle="modal" data-target="#tandcModal" id="fsTandcModal" >Terms and Conditions</a> </p> </div>
 		<div class="table_heading right" style="padding-right:80px;display:none;" id="fscorporateButttons" >
 		 <input type="button" class="btn" name="btnProceed" id="btnProceedcorporate" value="Submit" /> <input type="button" class="btn" id="btnReset" name="btnReset" value="Reset" /> <input type="button" class="btn" id="btnCancel" name="btnCancel" value="View Docs" /></div> 
	
	    <div class="table_heading right" style="margin-bottom:30px;" id="fsserviceButttons">	    
	    <input type="button" class="btn" id="fundswitchBtnCancel" name="fundswitchBtnCancel" value="Cancel"/>   
	    <input type="button" class="btn" name="btnProceed" id="btnProceed" value="Proceed" /><br><br></div>	
	</div>
	
	<div id="fundSwitchNote" style="margin-left:10px"><br><br>

<span style="color: #0aa8f2">Note:</span><br/>
<ul style="color:#666;list-style-type: disc;margin-left:16px;"><li >Enter the percentage you would like to switch fro ncurrnt fund allocation to target fund allocation  by entering in the row of the current fund.<br/>
     For Eg: IFG 20% of the equity fund needs to be transferred to index tracker fund , then enter 20 in the equity fund row under indextracker column. </li>
     <li>Total fund switch amount will be calculated and in Total Switch amount cell. Minimum switch amount per transcation needs t be Rs5000/-</li>
      <li>On Successful Switch,the rtequired numkber of units wil be liquidated of the source fund at the appliable rate unit value ofthat fund and new units  Will be bought in the desired fund at applicable value</li>
       <li>Fund switch request  received before 3.00pm on bussiness days will be given as same days NAV. Request received after 3.00pm and on non bussiness ays will be given next business days NAV</li>
        <li>One Fund switch is allowed per day</li>
         <li>Click on submit button to submit the request. You will get confirmation window to confirm  your trancation</li>
     </ul>

<!-- <p style="text-align: justify;">&#149 Enter the percentage you would like to switch fro ncurrnt fund allocation to target fund allocation  by entering in the row of the current fund.<br/>
     &nbsp;&nbsp;For Eg: IFG 20% of the equity fund needs to be transferred to index tracker fund , then enter 20 in the equity fund row under indextracker column.<br/>

&#149 Total fund switch amount will be calculated and in Total Switch amount cell. Minimum switch amount per transcation needs t be Rs5000/-<br/>

&#149 On Successful Switch,the rtequired numkber of units wil be liquidated of the source fund at the appliable rate unit value ofthat fund and new units  Will be bought in the desired fund at applicable value<br/>

&#149 Fund switch request  received before 3.00pm on bussiness days will be given as same days NAV. Request received after 3.00pm and on non bussiness ays will be given next business days NAV<br/>  

&#149 One Fund switch is allowed per day <br/>

&#149 Click on submit button to submit the request. You will get confirmation window to confirm  your trancation<br/>
</p> -->

</div>
</div>


<div class="span12 borderbotm2" id="fndbottomborder2" style="display: none;">&nbsp</div>
 
<div id="corporateFundSwitchConfirm" style="display:none" class="fundSwitchConfirmContainer">
	<div class="" style="margin-top:-2%">
		
		<div style="display:block;width:100%;float:left;">
		<p style="width:20%;float:left;display:inline-block;">
		
		Date:&nbsp;<span id="lblDate" style="font-weight:normal;cursor: text;" class="lbl"><%=dateNow %><br><br></span> 
		
		Time:&nbsp;<span id="lblTime" style="font-weight:normal;cursor: text;" class="lbl"> </span><br><br>
		
		</p>
		</div>
		
		
		<p class="margin2">Please see below the Fund Switch details as submitted by you. To execute the transaction kindly click on confirm button.If you want to edit the details kindly click on edit button.<br />
           Request once confirmed can't be reversed. </p>
		<br><br>
	</div>
	
	 <div class="clr"> </div> 
	<div>
        <div class="span12">
			<div class="row-fluid">
				<div class="span3"></div>
				<div class="span6" id="fundSwitchConfirmTbl"></div>
				<div class="span3"></div>
			</div>
			<div class="clr"></div>
			
			<div class="row-fluid bottommargin">
				<div class="span3"></div>
				<div class="span6 table_heading right " style="">
				<input type="button"
						name="btnEdit" id="btnEdit" value="Edit" class="btn" />
					<input type="button" name="btnConfirm" id="btnConfirm"
						value="Confirm" class="btn cnfrmbtn" /> 
				</div>
				<div class="span3"></div>
			 </div>
		</div>
 	</div>
 </div>




<div class="modal fade" id="fstandcModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
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

<script>
uploadDocs.init();

$(function(){
	
	$("#btnProceed").click(function(){
		
		$("#fndbottomborder2").show();
		
	});
	
	$(".cnfrmbtn").click(function(){
		
		$("#fndbottomborder2").hide();
		
	});
	
	$("#fsTandcModal").click(function(){
	$.ajax({
		url : '<%=termsAndConditions%>',
		method : 'POST',
		success : function(result) {
			$('#fstandcModal').modal('show'); 
		}
	
    });
	});
});

</script>
