<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<div class="clr"> </div>

<%-- <%@ include file="/jsp/subHeader.jsp"%> --%>

<div class="clr"> </div>
<div class="toptab tab1content"> 
   <%--  <h3> <liferay-ui:message key="services.home.list.transactonline.sublist.renewalnotice" /> </h3>
    <p class="marginclas"> <liferay-ui:message key="services.renewalnotice.heading.description" /></p><br>

    --%> <div class="form_sub"> 
    	    
    	<aui:select name="RNselectPolicy" id="RNselectPolicy" label="Policy No.">
    		<aui:option><liferay-ui:message key="services.fundswitch.policyno.select" /></aui:option>
    	</aui:select>       
    	    
        <div class="clr"> </div>
    </div>
    
       <div class="middlefield form_sub" >            
        <aui:input type="email" name="RNtxtEmail" id="RNtxtEmail" label="E-mail ID" value="" disabled="disabled" placeholder="modekar@gmail.com" readonly="true"></aui:input>
         <p class="sub_text" style="margin-top:-5px;"> <liferay-ui:message key="services.fundswitch.mail.confirm" /></p>
        <div class="clr"> </div>
       
    </div>
    <div class="form_sub rightfield" style="text-align:right">        
        <aui:input type="number" name="RNtxtPhNo" id="RNtxtPhNo" label="Mobile" value="" disabled="disabled"  placeholder="09854761159" readonly="true"></aui:input>
        <div class="clr"> </div>     
    </div>
    
    
    
    
    <div class="clr"> </div>     
		
	<div id="RenewalNoticeTemplate">
		<%@ include file="/jsp/renewalNoticeTemplate.jsp"%>
	</div>        
	
</div>
<div class="clr"> </div>

<div class="errorDialog"></div>

<script>

AUI().ready(function(A) {
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .renewal_notice_nav').addClass('active');
	
	sessionStorage.corporateRenewalNotice = "false";
	
	renewalNotice.initWindow();
	renewalNotice.setUp();		
});
</script>