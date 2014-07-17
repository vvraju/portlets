<%@ include file="/jsp/init.jsp" %>
<b style="font-size: 20px;font-family: serif;font-style: oblique;">Customers</b>

<aui:script>
</aui:script>

<portlet:renderURL var="editCustomerURL">
<portlet:param name="action" value="editCustomer"/>
</portlet:renderURL>
<table border="1" style="border: 1px solid black" >
<tr bordercolor="black" bgcolor="cyan">
<th>Id</th>
<th>CustomerName
</th>
<th>Actions</th>
</tr>
<c:forEach items="${customers}" var="customer">
<tr bordercolor="white">
<td>${customer.fooId}</td>
<td>${customer.name}</td>
<td><aui:a href="${editCustomerURL}" onClick="editData{}">Edit</aui:a></td>
</tr>


</c:forEach>


</table>

<br>
<portlet:renderURL var="home"/>
<aui:a href="${home }"> Home</aui:a>
<br>
<portlet:renderURL var="customerURL">
	<portlet:param name="action" value="customer" />
</portlet:renderURL>
<aui:a href="${customerURL }">Click Here for Customer Page</aui:a>