<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<div class="clr"> </div>

<%@ include file="/jsp/subHeader.jsp"%>

<div class="clr"> </div>
<div class="tab1content"> 
    <h3> Renewal Premium Receipt </h3>
    <p> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>

    <div class="form_sub"> 
    	    
    	<aui:select name="RPRselectPolicy" id="RPRselectPolicy" label="Policy No.">
    		<aui:option>Select</aui:option>
    	</aui:select>       
    	    
        <div class="clr"> </div>
    </div>
    
    <div class="form_sub" style="text-align:center">            
        <aui:input type="email" name="RPRtxtEmail" id="RPRtxtEmail" label="Email ID" value="" disabled="disabled" placeholder="modekar@gmail.com"></aui:input>
        <div class="clr"> </div>
        <p class="sub_text" style="margin-top:-16px;"> Your confirmation will be send on this ID</p>
    </div>
    
    <div class="form_sub" style="text-align:right">        
        <aui:input type="number" name="RPRtxtPhNo" id="RPRtxtPhNo" label="Mobile Number" value="" disabled="disabled"  placeholder="09854761159"></aui:input>
        <div class="clr"> </div>     
    </div>
    
    <div class="clr"> </div>     
		
	<div id="RenewalPremiumReceiptTemplate">
		<%@ include file="/jsp/renewalPremiumReceiptTemplate.jsp"%>
	</div>        
	
</div>
<div class="clr"> </div>

<div class="errorDialog"></div>

<script>

AUI().ready(function(A) {
	/*$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');*/
	
	sessionStorage.corporateRenewalPremiumReceipt = "false";
	
	renewalPremiumReceipt.initWindow();
	renewalPremiumReceipt.setUp();		
});
</script>