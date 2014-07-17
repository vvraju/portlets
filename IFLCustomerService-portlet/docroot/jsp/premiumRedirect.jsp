<%@ include file="/jsp/init.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="clr"> </div>

<div class="row-fluid">

 <%@ include file="/jsp/subHeader.jsp"%></div>  

<div> 
	<div class="toptab tab1content">
	<div class="row-fluid">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" style="color: #02a9f7" id="prsPolicy" >Select Policy</li>
       <li class="pipe" id="pallocation">Allocation</li>
        <li class="pipe" id="pconfirm">Confirmation</li>
         <li class="pipe" id="packnwldg">Acknowlegement</li>
      
   </ul>
 </div>
</div> 
	   <%--  <h3 id="predirectHeading"><liferay-ui:message key="services.home.list.transactonline.sublist.premiumredirect" /></h3>
	    <h3 id="predirectConfirm" style="display: none;"><liferay-ui:message key="services.home.list.transactonline.sublist.premiumredirectconfirm" /></h3>
	    
	    <p class="marginclas" id="premiumRedirectContent"> <liferay-ui:message key="services.fundswitch.heading.predirectcontent" /> </p>
	 --%>    
	    <p style="margin-top:10px;margin-bottom:15px;text-align: justify;display: none;" id="premiumredirectTracker">
	    <liferay-ui:message key="services.fundswitch.heading.predirecttrackercontent" /><span style="color: #666;font-weight:bold;" id="srNum">.</span> 
	    <liferay-ui:message key="services.fundswitch.heading.predirecttrackersrnum" /></p>
	    
	</div>
    <div class="mytab2cn tab2content"  id="prDetailsDisplay">
    	<div class="form_sub selectPolicyCont">   
    	<label><liferay-ui:message key="services.fundswitch.policyno" /></label> 						       
	        <select class="field-required" name="selectPolicy" id="selectPolicy" >
				<option value=""><liferay-ui:message key="services.fundswitch.policyno.select" /></option>	
			</select>  
			<input type="button" id="predirectGo" name="pGo" value="GO" class="btn"/>  
			<div class="clr"> </div> 	
 	    </div>
  
       <div class="form_sub fundswitchform middlefield" >            
        <aui:input type="email" name="txtEmail" id="txtEmailId" label="E-mail ID" value="" disabled="disabled" placeholder="modekar@gmail.com" readonly="true"></aui:input>
         <p class="sub_text" style="margin-top:-5px;"> 
        <liferay-ui:message key="services.fundswitch.mail.confirm" /></p>
        <div class="clr"></div>
       
    </div>
    
    
   
    <div class="form_sub fundswitchform mobile" style="text-align:right">        
        <aui:input type="text" name="txtPhNo" id="txtPhNum" label="Mobile" value="" disabled="disabled"  placeholder="09854761159" readonly="true"></aui:input>
        <div class="clr"> </div>     
    </div>  
     <div class="clr"> </div> 
      <div id="remFieldsShow" style="display: none;">
    
    <div class="form_sub  fundswitchformtwo">     	
        <aui:input type="text" name="txtPolicyStatus" label="Policy Status" id="txtPolicyStatusp" placeholder="" readonly="true"></aui:input>
        <div class="clr"> </div>
    </div>           
        
    <div class="form_sub  fundswitchformtwo middlefield">         
         <aui:input type="text" name="txtProductName" id="txtProductNamep" label="Product Name" placeholder="" readonly="true"></aui:input>
        <div class="clr"> </div>
    </div>
    <div class="form_sub fundswitchform mobile" style="text-align:right">    
         <div class="clr"> </div>
         <span class="sub_text1"> <a href="#"> <liferay-ui:message key="services.fundswitch.fundperformance" />  </a> </span>                     
    </div>
    
    </div> 
     <div class="clr"> </div> 
    
    </div>
    
    <div id="premiumRedirectionTemplate">
    	<%@ include file="/jsp/premiumRedirectTemplate.jsp"%>
    </div>
    	
</div>
<div class="tab1content">
<div class="row-fluid">
<div class="span12 premiumborder" id="premiumborder" style="disply:block;">
</div>
</div>
</div>
<div class="errorDialog"></div>

<script src="/IFLService-theme/js/js-dev/premiumRedirect.js"></script>

<script>
AUI().ready(function(A) {
	
	sessionStorage.corporatePremiumRedirect = "false";
	
	premiumRedirect.setUp();
	
	
	/*A.one("#<portlet:namespace/>selectPolicy").on('change',function(){		
		var selVal = A.one("#<portlet:namespace/>selectPolicy").get("value");
		//console.log('policy change event:' + selVal );
		
		getPolicyFunds();
	});
	
	$('#btnPRSubmit').click(function(){		
		displayConfirmPage();		
	});
	
	
	$("#btnConfirm").on('click',function(){
		saveDetails();		
	});
	
	function getPolicyFunds(){
		$('#premiumRedirectionCon').show();
	}
	
	function displayConfirmPage(){
		$('#premiumRedirectionCon').hide();
		$('#confirmPremiumRedirection').show();	
	}*/
	//loadJSP('premiumRedirectTemplate.html','premiumRedirectionTemplate');
});
</script>



