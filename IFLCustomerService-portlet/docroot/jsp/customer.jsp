<%@ include file="/jsp/init.jsp" %>



<div style="color: green; font-size: 14px">

	<b> ${success} </b>
</div>


<!-- This is the <b>IFLCustomer</b> Spring MVC portlet. -->

<portlet:renderURL var="home"/>
<aui:a href="${home }"> Home</aui:a>
<br>

<portlet:renderURL var="addCustomerURL" >
<portlet:param name="action" value="addCustomer"/>
</portlet:renderURL>

<portlet:resourceURL var="getDataURL" />


<aui:form action="${addCustomerURL}">
	<aui:input name="name" type="text" label="Enter Name" />
	<aui:button type="submit" value="Submit" />
</aui:form>

<br>
<portlet:renderURL var="showCustomersURL">
<portlet:param name="action" value="showCustomers"/>
</portlet:renderURL>
<aui:a href="${showCustomersURL}">Show Customers</aui:a>

