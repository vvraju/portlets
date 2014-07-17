<%@page import="com.ifli.rapid.services.helper.beans.PaymentDto"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:renderURL var="topUp">
	<portlet:param name="action" value="topUp" />
</portlet:renderURL>

<%
	PaymentDto payDto = (PaymentDto)request.getAttribute("paymentDto");
	if(payDto == null){
		payDto = new PaymentDto();
	}
%>

<script>
	window.location = '<%=topUp %>&success=true';
	sessionStorage.selectedPolicyVal = '<%=payDto.getPolicyNo()%>';
	sessionStorage.premiumAmountVal = '<%=payDto.getPremiumAmount()%>';
</script>