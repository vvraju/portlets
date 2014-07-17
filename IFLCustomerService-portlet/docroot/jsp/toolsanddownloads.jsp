<%@ include file="/jsp/init.jsp" %>

<%@ include file="/jsp/subHeader.jsp" %>
<div class="b-content">
<br><br><br>
<div class="toolsbrad">
<div class="row-fluid tooltot">
<div class="span3 toollist" >

<%-- <liferay-portlet:runtime portletName="56" queryString="upperContent" defaultPreferences=""></liferay-portlet:runtime>  --%>

<%-- <liferay-ui:journal-article articleId="10729" groupId="10591" showTitle="true" articlePage="" languageId="en_us"></liferay-ui:journal-article> --%>

<table border="1" class="toolisttab" >
<tr>
<th bgcolor="red">Premium Receipt</th> </tr>
<tr><td style="text-align: center" class="renewal">

<aui:a href="#" id="renewalNoticeDownload"><ul><li>Renewal Notice</li></ul></aui:a></td></tr>

<tr><td style="text-align: center" class="premiumReceiptsDiv">
<aui:a href="#" id="premiumReceipts"><ul><li>Premium Receipts</li></ul></aui:a></td></tr>

<tr><td style="text-align: center" class="premiumPaidCertsDIV">
<aui:a href="#" id="premiumPaidCerts"><ul><li>Premium Paid Certificate</li></ul></aui:a></td></tr>

<tr><td style="text-align: center" class="unitStatementsDIv">
<aui:a href="#" id="unitStatements"><ul><li>Unit statement</li></ul></aui:a></td></tr>

</table>
</div>

<div  class="leftmagin span9" id="renewalNoticeDownloadDiv" style="" >
	<%@ include file="/jsp/renewalNoticeDownload.jsp" %>
</div>

<div class="leftmagin span9" id="premiumReceiptsDiv" style="display:none;" >
	<%@ include file="/jsp/premiumReceiptsDownload.jsp" %>
	
</div>
<div class="leftmagin span9" id="premiumPaidCertsDIV" style="display:none;" >
	<%@ include file="/jsp/premiumPaidCertificateDownload.jsp" %>

</div>
<div  class="leftmagin span9" id="unitStatementsDIv" style="display:none;" >
<%@ include file="/jsp/unitStatementDownload.jsp" %>
</div>
</div>
</div>
</div>

<div id="trackerDetailsDisply"></div>
<div class="b-content">
  <div class="row-fluid">
  <div class="span12 toolsbordr"></div>
  </div>
</div>

<div class="msg" ></div>

<%-- <liferay-portlet:runtime portletName="56"></liferay-portlet:runtime>  --%>

<script>
$(document).ready(function() {$('tr .renewal').addClass('active'); });
$("#<portlet:namespace/>renewalNoticeDownload").click(function(){
	$('td').removeClass('active');
	$('tr .renewal').addClass('active');
	
	$('#renewalNoticeDownloadDiv').show();
	$('#premiumReceiptsDiv').hide();
	$('#premiumPaidCertsDIV').hide();
	$('#unitStatementsDIv').hide();
	
});

$("#<portlet:namespace/>premiumReceipts").click(function(){
	$('td').removeClass('active');
	$('tr .premiumReceiptsDiv').addClass('active');
	$('#renewalNoticeDownloadDiv').hide();
	$('#premiumReceiptsDiv').show();
	$('#premiumPaidCertsDIV').hide();
	$('#unitStatementsDIv').hide();
	
	
});



$("#<portlet:namespace/>premiumPaidCerts").click(function(){
	$('td').removeClass('active');
	$('tr .premiumPaidCertsDIV').addClass('active');
	$('#renewalNoticeDownloadDiv').hide();
	$('#premiumReceiptsDiv').hide();
	$('#premiumPaidCertsDIV').show();
	$('#unitStatementsDIv').hide();
	
	
	
});


$("#<portlet:namespace/>unitStatements").click(function(){
	$('td').removeClass('active');
	$('tr .unitStatementsDIv').addClass('active');
	$('#renewalNoticeDownloadDiv').hide();
	$('#premiumReceiptsDiv').hide();
	$('#premiumPaidCertsDIV').hide();
	$('#unitStatementsDIv').show();
	
			
});
	
	function showDialog(msg){
		 $(".msg").html('<p>'+msg+'</p>');
		$(".msg").dialog({
			title : "Message",
			width : '300',
			modal : true,
			closeOnEscape: false,
			resizable : false,					
			buttons : [{
				text : "OK",
				width : 'auto',
				click : function() {
					$(this).dialog("close");										
				}
			}]
		});	
	
};




</script>

