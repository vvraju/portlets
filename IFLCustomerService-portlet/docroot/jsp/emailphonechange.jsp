<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />
<portlet:renderURL var="emailphoneupdateUrl">
	<portlet:param name="action" value="emailphoneupdate" />
</portlet:renderURL>
<portlet:renderURL var="otpCheckUrl">
	<portlet:param name="action" value="otpCheck" />
</portlet:renderURL>


<div>
	<c:if test="${success!=''}">${success}</c:if>
</div>
<c:if test="${success==''}">
<aui:form id="fm" action="${emailphoneupdateUrl}" method="post">

	<!-- onchange="javascript:showTeams(this.value)"; -->
	<aui:select class="field-required" name="emailphone" id="emailphone"
		label="Select Email/ Phone to change:">
		<aui:option value="">Select One</aui:option>
		<aui:option value="Email">Email</aui:option>
		<aui:option value="Phone">Phone</aui:option>
	</aui:select>

	<div id="email-div" style="display: none">
		<aui:input name="email" id="email"
			value="${customer.CUSTOMER_EMAIL_ADDR}" type="text">
			<aui:validator name="required" />
		</aui:input>
	</div>
	<div id="phone-div" style="display: none">
		<aui:input name="phone" id="phone" value="${customer.PHONE_NUMBER_1}"
			type="text">
			<aui:validator name="required" />
		</aui:input>
	</div>
	<aui:button type="submit" name="save" value="Change" />
</aui:form></c:if>
<c:if test="${success!=''}">
<aui:form id="fm1" action="${otpCheckUrl}" method="post">
<aui:input name="emailphone" type="hidden" id="emailphone" value="${emailphone}"></aui:input>
<aui:input name="email" type="hidden" id="email" value="${email}"></aui:input>
<aui:input name="phone" type="hidden" id="phone" value="${phone}"></aui:input>

<aui:input name="otp" id="otp" type="text">
			<aui:validator name="required" />
		</aui:input>
		<aui:button type="submit" name="save" value="Confirm" />
</aui:form>

</c:if>

<script type="text/javascript">
	
</script>

<aui:script>



function showTeams(val){
	//alert("selected value : "+val);
	if(val=="Phone"){
		document.getElementById("phone-div").style.display='block';
		document.getElementById("email-div").style.display='none';
	}
	if(val=="Email"){
		document.getElementById("email-div").style.display='block';
		document.getElementById("phone-div").style.display='none';
	}
};



</aui:script>

<aui:script>
 AUI().use('aui-base',function(A) {
A.one("#<portlet:namespace />emailphone").on('change',function(){
var selectedValue = A.one('#<portlet:namespace />emailphone').get('value');
alert(selectedValue);
if(selectedValue=="Phone"){
alert('1'+A.one('#phone-div').getStyle());
A.one('#phone-div').setStyle('display','block');
A.one('#<portlet:namespace />email-div').setStyle('display','none');
}
if(selectedValue=="Email"){
alert('2');
A.one('#<portlet:namespace />phone-div').setStyle('display','none');
A.one('#<portlet:namespace />email-div').setStyle('display','block');
}
});
});
</aui:script>
