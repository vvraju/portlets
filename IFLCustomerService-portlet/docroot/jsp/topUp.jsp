<%@ include file="/jsp/init.jsp" %>

<div class="row-fluid"><%@ include file="/jsp/subHeader.jsp"%></div>
<div class="clr"> </div>
<div class="toptab tab1content selectPolicyCont selectPolicyContIE">

<div class="row-fluid">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" style="color: #02a9f7" id="tpolicy" >Select Policy</li>
       <li class="pipe" id="tallocation">Allocation</li>
        <li class="pipe" id="tcnfrm">Confirmation</li>
        <li class="pipe" id="tpayment">Payment</li>
         <li class="pipe" id="tacknwldg">Ackonwlegement</li>
      
   </ul>
 </div>
</div>

    <%-- <h3> <liferay-ui:message key="services.topup.heading.topup" /> </h3>
    <p class="marginclas"> <liferay-ui:message key="services.topup.heading.topup.description" /></p><br> --%>

    <div class="form_sub"> 
    	<label><liferay-ui:message key="services.fundswitch.policyno" /></label> 	
    	<select name="selectTopUpPolicy" id="selectTopUpPolicy" >
    		<option value=""><liferay-ui:message key="services.fundswitch.policyno.select" /></option>
    	</select> 
    	<input type="button" id="topupGo" name="pGo" value="GO" class="btn"/>     
        <div class="clr"> </div>
    </div>
    
    <div class="form_sub middlefield">            
        <aui:input type="email" name="topUpTxtEmail" id="topUpTxtEmail" label="E-mail ID" value="" disabled="disabled" placeholder="modekar@gmail.com" readonly="true"></aui:input>
        <p class="sub_text" style="margin-top:-5px;"> <liferay-ui:message key="services.fundswitch.mail.confirm" /></p>
        <div class="clr"> </div>
       
    </div>
    <div class="form_sub form_subIE mobile" style="text-align:right">        
        <aui:input type="text" name="topUpTxtPhNo" id="topUpTxtPhNo" label="Mobile" value="" disabled="disabled"  placeholder="09854761159" readonly="true"></aui:input>
        <div class="clr"> </div>     
    </div>
    
    <div class="clr"> </div>
</div>
<div class="clr"> </div>
<div class="row-fluid">
<div class="span12 topupborder" id="topupborder">

</div>
</div>

<div id="topUpTemplate">
	<%@ include file="/jsp/topUpTemplate.jsp"%>
</div>
<div class="clr"> </div>
<div class="clr noDefault"> </div>
<div class="topupbordertop noDefault" id="topupbordertop" style="display: none;"> </div>
<div class="errorDialog"></div>

<script>

AUI().ready(function(A) {
	sessionStorage.corporateTopUp = "false";
	
	topUp.initWindow();
	topUp.setUp();
	
	 //if it is true, show todays fund Nav
	  if(sessionStorage.showTodayNav == 'true'){
		  topUp.getNavHistory();
	  } /* else {
	   $('.topupTodayNav').hide();
	   $('.topupPaymentConfirmation').hide();
	   //$('#topUpBtns').show();
	  } */
	  if("${param.success}"=="true"){
		  
		   $('.topupTodayNav').hide();
		   $('.topupPaymentConfirmation').hide();
		   $('.selectPolicyCont').hide();
		   $('.topupPaymentConfirmation').show();
		   $('.topUpTracker').show();
		   $('#topupborder').hide();
		   topUp.saveTopUpValues();
	  }
	 
	 
});
	
</script>
