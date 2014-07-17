
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:renderURL var="policyHome">
	<portlet:param name="action" value="policyHome" />
</portlet:renderURL>

<%@ include file="/jsp/subHeader.jsp"%>

<div class="b-content"> 	 
    <div class="row-fluid"> 
		<div class="span12">
	        <div class="span3 profile-list-alerts-big nprofile-list-alerts-big" style="background:#b1d8e7;height: 180px;">
				<div class="">				
					<span style="height:auto;">
						<p class="icon_images" style=""> <img src="<liferay-ui:message key="services.downloadpolicy.header.image.downloadhome" />" width="53px" height="46px" style="margin-top:11%;"> </p>
						
					</span>		
					<span class="Downloadsingle"><liferay-ui:message key="services.downloadpolicy.header.downloadhome" /></span>			
				</div>	
				<div class="clr"></div>                
			</div>

			<div class="span9 span9-margin-left rightsisiexplanation">
				<div class="tab_con_right tab2content" style="width:auto; margin:19px 10px 25px 10px;"> 
				<h3><liferay-ui:message key="services.downloadpolicy.header.downloadpolicyreports" /></h3>
					<p class="marginclas"><liferay-ui:message key="services.downloadpolicy.header.description.para1" /> </p>
					<p class="marginclas" style="padding:0px 10px 10px 10px;"> <liferay-ui:message key="services.downloadpolicy.header.description.para2" /></p> 
					<div style="height:10px;margin-top:-20px;"> </div>
						 <a href="/web/services/downloadpolicyactions" rel="<%=policyHome %>" target="_self" class="btn right" target="6" style="margin-bottom:10px;margin-right:12px;margin-top:10px;"> <liferay-ui:message key="services.downloadpolicy.action" /> </a>
			</div>
			</div>
		</div>
    </div>
</div>

<%@ include file="/jsp/subFooter.jsp"%>

<div class="errorDialog"></div>
<script>
AUI().ready(function(A) {
	
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .download_policy').addClass('active');	
});
</script>