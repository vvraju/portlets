<%@ include file="/jsp/init.jsp" %>

<div class="clr"> </div>
<div class="row-fluid">
 <%@ include file="/jsp/subHeader.jsp"%> </div>
<div class="clr"> </div>
<div class="toptab tab1content" style="height:auto;">
<div class="row-fluid">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" style="color: #02a9f7" id="sPolicy" >Select Policy</li>
       <li class="pipe" id="allocation">Allocation</li>
        <li class="pipe" id="Cnfrm">Confirmation</li>
         <li class="pipe" id="acknwldg">Acknowlegement</li>
      
   </ul>
 </div>
</div>
    <h3 id="fswitchHeading"> <liferay-ui:message key="services.home.list.transactonline.sublist.fundswitch" /> </h3>
    <h3 id="fswitchConfirm" style="display: none;"> <liferay-ui:message key="services.home.list.transactonline.sublist.fundswitchconfirm" /> </h3>
    
    <p style="margin-top:10px;margin-bottom:15px;text-align: justify;" id="fswMainContent"> <liferay-ui:message key="services.fundswitch.heading.maincontent" /></p>
    
    <p style="margin-top:10px;margin-bottom:15px;text-align: justify;display: none;" id="fundswitchtracker">
	    <liferay-ui:message key="services.fundswitch.heading.content" /><span style="color: #666;font-weight:bold;" id="fswsrNum"></span> 
	    <liferay-ui:message key="services.fundswitch.heading.trackersrnum" /></p>
    
    
    <p style="margin-top:10px;margin-bottom:15px;text-align: justify;display: none;" id=""> <liferay-ui:message key="services.fundswitch.heading.content" /></p>

   <div id="fswDisplayFields">

    <div class="form_sub fundswitchform"> 
    	<label><liferay-ui:message key="services.fundswitch.policyno" /></label>
    	<select name="selectPolicy" id="selectPolicy">
    		<option value=""><liferay-ui:message key="services.fundswitch.policyno.select" /></option>
    	</select>
    	<input type="submit" id="Go" name="Go" value="GO" class="btn"/>
    	
    	<!--<aui:select class="field-required" name="selectPolicy" id="selectPolicy" label="Policy No.">
			<aui:option value="">Select</aui:option>
			<aui:option value="policy1">Policy1</aui:option>
			<aui:option value="policy2">Policy2</aui:option>
		</aui:select>-->
                	        
        <div class="clr"> </div>
    </div>
    
    
    
    <div class="form_sub fundswitchform middlefield" >            
        <aui:input type="email" name="txtEmail" id="txtEmail" label="E-mail ID" value="" disabled="disabled" placeholder="modekar@gmail.com" readonly="true"></aui:input>
        <p class="sub_text" style="margin-top:-5px;"> 
        <liferay-ui:message key="services.fundswitch.mail.confirm" /></p>
        <div class="clr"></div>
        
    </div>
   
    
    
   
    <div class="form_sub fundswitchform mobile" style="text-align:right">        
        <aui:input type="text" name="txtPhNo" id="txtPhNo" label="Mobile" value="" disabled="disabled"  placeholder="09854761159" readonly="true"></aui:input>
        <div class="clr"> </div>     
    </div>
    
    <div class="clr"> </div>     
    
    <div id="remainidFieldsShow" style="display: none;">
    
    <div class="form_sub  fundswitchformtwo">     	
        <aui:input type="text" name="txtPolicyStatus" label="Policy Status" id="txtPolicyStatus" placeholder="Inforce" readonly="true"></aui:input>
        <div class="clr"> </div>
    </div>           
        
    <div class="form_sub  fundswitchformtwo middlefield" style="text-align:right">         
         <aui:input type="text" name="txtProductName" id="txtProductName" label="Product Name" placeholder="India first mediclaim plan" readonly="true"></aui:input>
        <div class="clr"> </div>
    </div>
    <div class="form_sub fundswitchform mobile" style="text-align:right">    
         <div class="clr"> </div>
         <span class="sub_text1"> <a href="#"> <liferay-ui:message key="services.fundswitch.fundperformance" />  </a> </span>                     
    </div>
    
    </div>
  
    <div id="fsw-content"> 
   <p style="padding-left: 8px;"><br>
    &#149 Please check your mobile no and email id is registered in our system, else kindly register the same here<br/>
    &#149 Only Ulip policies in inforce status are available to do a fund swithc<br/>
    &#149 The NAV shall be declared by the Company on a daily basis except on Bank holidays, Exchange holidays, Saturdays, Sundays and the days when the Corporate<br />
    &nbsp;Office is closed.
  </p>
   </div>
   
   </div>
   
<div class="clr"> </div>
<div class="span12 borderbotm" id="fndbottomborder">&nbsp</div>

<div class="border-top noDefault declarationSection"> </div>
<div class="noDefault declarationSection"> 
    <h4><liferay-ui:message key="services.fundswitch.declaration" /> </h4>
   
</div>

<div id="fundSwitchTemplate">
	<%@ include file="/jsp/fundSwitchTemplate.jsp"%>
</div>

<div class="clr noDefault"> </div>
<div class="border-top noDefault"> </div>
<div class="errorDialog"></div>
</div>
<div id="fundSwitchTracker" style="display:none;width:auto;" >
	<%@ include file="/jsp/fundSwitchTracker.jsp"%>
</div>

<script>

AUI().ready(function(A) {
	/* $('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
	$('#amplan1 span').addClass('active'); */
	
	sessionStorage.corporateFundSwitch = "false";
	
	fundSwitch.initWindow();
	fundSwitch.setUp();	
	uploadDocs.init();

		
	/*A.one("#<portlet:namespace/>selectPolicy").on('change',function(){		
		var selVal = A.one("#<portlet:namespace/>selectPolicy").get("value");
		//console.log('policy change event:' + selVal );
		
		displayFundDetailsSection();
	});
	
	$("#btnProceed").on('click',function(){
		validateFundSwitchDetails();		
	});
	
	
	$("#btnConfirm").on('click',function(){
		saveDetails();		
	});
	
	function displayFundDetailsSection(){
		//console.log("In displayFundDetailsSection");
		$('#corporatePolicyDetails').show();
		$('#fundDetails').show();			
	}
	
	function validateFundSwitchDetails(){
		//console.log("In validateFundSwitchDetails");
		$('.declarationSection').hide();
		$('.fundSwitchConfirmContainer').show();
		$('#fundSwitchConfirmTbl').show();
	}
	
	function saveDetails(){
		$('#fundSwitchTracker').show();
	}*/
	
	
});
</script>
