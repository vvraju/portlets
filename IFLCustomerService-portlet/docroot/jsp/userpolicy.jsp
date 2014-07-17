<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />

<%-- 
<%@ include file="/jsp/subHeader.jsp"%> --%>
<%-- 
<div class="clr"> </div>
<div class="toptab tab1content"> 
<h3><liferay-ui:message key="services.downloadpolicy.selectrequireddetails" /> </h3>
<p class="marginclas"> <liferay-ui:message key="services.downloadpolicy.selectrequireddetails.description.para" /></p>
<br>

<aui:form action="${policysearchURL}" method="post" name="search" id="pofm">

</div> --%>
<div class="errorDialog"></div>
<div id="userPolicyTemplate">
		<%@ include file="/jsp/userpolicyTemplate.jsp"%>
	</div>
	
	
	
<script>



AUI().ready(function(A) {
	
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .download_policy').addClass('active');	
	
	sessionStorage.corporateRenewalNotice = "false";
	downloadpolicy.setUp();
	downloadpolicy.initWindow();
});
</script>


