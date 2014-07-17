
<%@ include file="/jsp/init.jsp"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
 <portlet:renderURL var="trackerStatusDetails" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="trackerStatusDetails" />
</portlet:renderURL> 

<portlet:renderURL var="trackerStatusPage">
	<portlet:param name="action" value="trackerStatusPage" />
</portlet:renderURL> 

<div class="b-content">
<div class="row-fluid">


<div id="trackerDetailsDisply" class="tab2content" style="display: block;">
	<liferay-portlet:runtime portletName="56"></liferay-portlet:runtime>
	<div class="clear"></div>
	<br />

	<table width="100%" cellspacing="0" cellpadding="0" border="1"
		style="margin-left: 9px;">
		<tr>
			<td class="table_colum" valign="middle" bgcolor="#eff7fa"
				align="center">Date</td>
			<td class="table_colum" valign="middle" bgcolor="#eff7fa"
				align="center">SR ID</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
				align="center">Type</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
				align="center">Sub-Type</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
				align="center">Status</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
			 align="center">Surces</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
				align="center">Policy No</td>
			<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
			 align="center">Product</td>
		<td class="table_colum_last" valign="middle" bgcolor="#eff7fa"
		 align="center">Ageing</td>
		</tr>
		<c:forEach items="${customerList}" var="trackerDetails">

			<tr style="border-bottom: 1pt solid #ccc;">

				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${trackerDetails.enterDate}</td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center"><a href="#" data-type="${trackerDetails.typeDesc}" class="srno">${trackerDetails.srNumbr}</a></td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center"><span id="type">${trackerDetails.typeDesc}</span></td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${trackerDetails.subTypeDesc}</td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${trackerDetails.status} </td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center"></td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff"
					align="center">${trackerDetails.policyNo}</td>
				<td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center">${trackerDetails.product}</td>
	    <td class="table_colum_last" valign="middle" bgcolor="#ffffff" align="center"></td>


			</tr>
		</c:forEach>


	</table>
	<br />


</div>
</div>
</div>

<script>

$(function(){
	

$(".srno").on('click' ,function(){
	
var srNumVal=$(this).text();
var typeVal=$(this).attr("data-type");	

$.ajax({
	url : '<%=trackerStatusPage%>',
	method : 'GET',
	data:{srNum:srNumVal,type:typeVal},
	success : function(result) {
		$("#trackeFields").hide();
		$("#trackerDetailsDisply").html(result);
	}

});

});
});	
</script>
