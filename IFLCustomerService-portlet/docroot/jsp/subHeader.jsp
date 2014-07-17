<%@ include file="/jsp/init.jsp" %>

<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<script src="/IFLService-theme/js/owl.carousel.js"></script>
<link rel="stylesheet" type="text/css" href="/IFLService-theme/css/owl.carousel.css">
<portlet:renderURL var="getHeaderContent" windowState="<%= LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="action" value="getHeaderContent" />
</portlet:renderURL>

<div id="ajaxDiv"></div>  


<script>
$(function() {

$.ajax({
	url : '<%=getHeaderContent%>&<portlet:namespace/>serviceId=2',
	method : 'POST',
	success : function(result) {
		$('#ajaxDiv').html(result);
		
	}, error : function(errObj) {
		
	}
});

$.ajax({
	url : '<%=getHeaderContent%>&<portlet:namespace/>serviceId=6',
	method : 'POST',
	success : function(res) {
		$('#ajaxDiv').html(res);
		
	}, error : function(errObj) {
		
	}
});


});

</script>