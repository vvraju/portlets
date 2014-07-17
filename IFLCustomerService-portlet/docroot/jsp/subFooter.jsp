\<%@ include file="/jsp/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>


<portlet:renderURL var="getRecommendedProducts" windowState="<%=LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="action" value="getRecommendedProducts" />
</portlet:renderURL>

<div class="b-content">
<div class="row-fluid">
<!-- height 125px; -->
 <div class="span12" style="padding-left: 0px; height: auto; background-color: #ffffff; border: 1px solid #CCCCCC; margin-left: 0px;">

					<div class="span3 subfooternroutes routesheading" style="height:142px !important;margin-left:0px !important;">

				<span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 15px; font-size: 43px;"><liferay-ui:message key="services.home.products.other" /></span> <span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 10px; font-size: 18px;"><liferay-ui:message key="services.home.products.recommended" /></span>
					<span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 6px; font-size: 26px;"> <liferay-ui:message key="services.home.products.products" /></span>
			</div>

			<div class="span9 span-img-btm-slide subfooternspan-img-btm-slide subfooternspan-img-btm-slideIE" style="margin-left:0px;" id="carousaldiv">
				
				
				

			</div>
			
			<div class="clearfix"></div>

		</div>
	
	</div>		
</div>
				

<script type="text/javascript">
$(function() {
	$.ajax({
		url : '<%=getRecommendedProducts%>',
		method : 'POST',
		success : function(result) {
			$("#carousaldiv").html(result);
		}
	
});

});

</script>
