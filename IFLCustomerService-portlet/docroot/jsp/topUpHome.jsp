<%@ include file="/jsp/init.jsp" %>
<portlet:renderURL var="topUp">
	<portlet:param name="action" value="topUp" />
</portlet:renderURL>

<%@ include file="/jsp/subHeader.jsp"%>
<liferay-portlet:runtime portletName="56"></liferay-portlet:runtime>

<%-- <div class="b-content"> 	 
    <div class="row-fluid"> 
		<div class="span12">
	        <div class="span3 profile-list-alerts-big nprofile-list-alerts-big" style="background:#b1d8e7;height: 180px;">
				<div class="">				
					<span style="height:auto;">
						<p class="icon_images" style=""> <img src="/IFLService-theme/images/services_images/top_up.png" style="" width="" height=""> </p>
						
					</span>
					<span class="Topsingle">Top Up</span>					
				</div>	
				<div class="clr"></div>                
			</div>

			<div class="span9 span9-margin-left rightsisiexplanation">
				<div class="tab_con_right tab2content" style="width:auto; margin:19px 10px 34px 10px;"> 
				<h3>Top Up</h3>
					<p class="marginclas"> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. </p>
					<p class="marginclas" > Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p> 
					<div style="height:10px;margin-top:-20px;"> </div>
					 <a href="/web/services/topupaction" rel="/web/services/topupaction" target="_self" class="btn right" target="6" style="margin-top:19px;margin-right:12px;"> Action </a>					  				
				</div>
			</div>
		</div>
    </div>
</div>  --%>

 <%@ include file="/jsp/subFooter.jsp"%> 

<div class="errorDialog"></div>
