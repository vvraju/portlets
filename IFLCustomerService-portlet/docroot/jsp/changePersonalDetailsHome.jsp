

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>

<%@ include file="/jsp/subHeader.jsp"%>

<div class="b-content"> 	 
    <div class="row-fluid"> 
		<div class="span12">
	        <div class="span3 profile-list-alerts-big nprofile-list-alerts-big" style="background:#b1d8e7;">
				<div class="">				
					<span style="height:auto;">
						<p class="icon_images" style=""> <img src="/IFLService-theme/images/services_images/icon-premiumRedirect.png" width="53px" height="46px"> </p>
						
					</span>	
					<span class="AddressChangesingle">Change Name / DOB</span>				
				</div>	
				<div class="clr"></div>                
			</div>

			<div class="span9 span9-margin-left rightsisiexplanation">
				<div class="tab_con_right tab2content" style="width:auto; margin:19px 10px 34px 10px;"> 
				<h3>Change Name / DOB</h3>
					<p class="marginclas"> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. </p>
					<p style="padding:0px 10px 0px 10px;"> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>
					<div style="height:10px;margin-top:-20px;"> </div>
					 <a href="<%=addressChange %>&coaParam=personal" target="_self" class="btn right" target="6" style="margin-bottom:10px;margin-right:12px;"> Action </a>	
					 				  				
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
	$('.topnav_tabs .change_personal_details').addClass('active');	
});
</script>