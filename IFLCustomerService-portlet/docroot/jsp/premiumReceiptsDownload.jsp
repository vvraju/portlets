



<%@page import="javax.portlet.RenderRequest"%>
<style>
.policyButtons{
float: right;
}

</style>

<script type="text/javascript">

</script>



<div class="RNPolicyDtails"	style=""><br>

<h3 class="tools_heading"  style="color: #0aa8f2;">  Premium Receipts </h3>
<br>
<div class="span12">
       <div class="span4" style="">
	<aui:select label="Policy No" name="policyno" id="prPolicyNo">
		<aui:option value="0">Select Policy Number </aui:option>
		<%-- <c:forEach items="${rdetails }" var="policyInfo">
			<aui:option value="${policyInfo }">${policyInfo}</aui:option>
		</c:forEach> --%>


	</aui:select>
    </div>
	     
		<div class="span4" style="">
			<aui:select label="Financial Year" name="financialyear"
				id="prFinancialYear">
				<aui:option value="0">Select Financial Year</aui:option>
			</aui:select>
		</div>


		<div class="span4" style="">
			<aui:select label="Policy Date" name="pdate" id="prdate">
			</aui:select>
		</div>
		</div>
		<div class="clr"></div>
		<br>
		<div class="span12 prrecednld">
		<aui:button-row>
			<aui:button value="Submit" cssClass="sbutton"></aui:button>
			<aui:button type="clear" id="clearid" value="Clear"></aui:button>
		</aui:button-row>
		</div>
	
	<%-- <aui:select name=""></aui:select> --%>
	
	
	<div class="clr"> </div> <br />
	    	
	    	<div class="prspan10printable" style="margin-left: 9px;">
	    	<div class="right DownloadPrintBtns"> 	   
		    	<aui:button name="btnPRDownload" id="btnPRDownload" value="Download" />
		    	<aui:button name="btnPREmail" id="btnPREmail" value="&nbsp;&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;" ></aui:button>
		    	<aui:button name="btnPRPrint" value="&nbsp;&nbsp;&nbsp;Print&nbsp;&nbsp;&nbsp;"/>
		    </div>
	    	<div class="clr"> </div>
	    	
	    	<div class="pdfFile"></div>
	    	<br/>
	    		<iframe src="" height = 600px class="span11" id="iframeprint"  accesskey="true"></iframe >
	    		
	    	</div>
	    	
	    	<div class="clr"> </div>

</div>

<portlet:resourceURL id="getPolicyYearsById" var="getPolicyYearsById" />
<portlet:resourceURL id="getCustomerPolicies" var="getCustomerPolicies" />
<portlet:resourceURL id="getPremiumReceiptDoc" var="getPremiumReceiptDoc" />
<portlet:resourceURL id="downloadReceipts" var="downloadReceipts" />
<script>
$(function(){
	
	$('.prspan10printable').hide();
	$.get('${getCustomerPolicies}',function(result){
		data = $.parseJSON(result);
		$.each(data, function(i, item) {

			 var fy = '<option value="'+item+'">'+ item + '</option>';
			$('#<portlet:namespace/>prPolicyNo').append(fy);
			$('#<portlet:namespace/>unPolicyNo').append(fy);
			
			//$('#<portlet:namespace/>pdate').append(pd); */
		});
	});
	
	
	$('#<portlet:namespace/>prPolicyNo').change(function(){
		var pno=$('#<portlet:namespace/>prPolicyNo').val();
		var url='<%=getPolicyYearsById%>';
					$.ajax({
						method : 'GET',
						url : url,
						data : {'policyNum' : pno,'rndownload' : 'yes'},
						cache : false,
						success : function(result) {
							data = $.parseJSON(result);
							$('#<portlet:namespace/>prFinancialYear').empty();
							$('#<portlet:namespace/>prdate').empty();
							$.each(data, function(i, item) {

								var fy = '<option value="'+item['id']+'">'+ item['val'] + '</option>';
								var pd ='<option value="'+item['id']+'">'+ item['id'] + '</option>';
								$('#<portlet:namespace/>prFinancialYear').append(fy);
								$('#<portlet:namespace/>prdate').append(pd);
							});

						}

					});
				});

	
	$('.sbutton').click(function(){
		//alert("submit button click");
		var pno=$('#<portlet:namespace/>prPolicyNo').val();
		var fy=$('#<portlet:namespace/>prFinancialYear').val();
		var pdate=$('#<portlet:namespace/>prdate').val();
		if(pno==' ' || pno==0|| pno==null){
			//alert('Select Policy No  ');
			var error='Please Select Policy No';
			showDialog(error);
			return false;
		}
		
		if(fy==' '|| fy==null || fy==0){
			//alert('Select Financial Year or Change the Policy No');
			var error='Change the Policy No then Select Financial Year';
			showDialog(error);
			return false;
		}
		if(pdate==' '|| pdate==null){
			//alert('Select Policy Date ');
			var error='Please Select Policy Date';
			showDialog(error);
			return false;
		}
		
		
		$.ajax({
			method:'GET',
			url:'${getPremiumReceiptDoc}',
			contentType:'json',
			cache:false,
			success:function(rs){
				$('#iframeprint').attr('src',rs);
				$('.prspan10printable').show();
			},
		});
		
		
	});
	
	$('#clearid').click(function(){
		
		$('#<portlet:namespace/>prFinancialYear').empty();
		$('#<portlet:namespace/>prpdate').empty();
		$('.prspan10printable').hide();
	});
	
	 $('#<portlet:namespace/>btnPRDownload').click(function(){
		
		 var fname=$("#iframeprint").attr('src');
		 var url='<%=downloadReceipts%>'+'&page=premiumReceipts&fileName='+fname;
		window.location=url;
		
	}); 
	 
	 $('#<portlet:namespace/>btnPREmail').click(function(){
			
		 $.ajax({
			 url:'${sendEmail}',
			 data:{'page':'premiumReceipts'},
			 cache:false,
			 success:function(result){
				
				 showDialog(result);	
				 
			 }
			 
		 });
		 
		
	});
	
	$('#<portlet:namespace/>btnPRPrint').click(function(){
		//alert('in print');
		/* var pdf=$('#iframeprint').focus();
		pdf.contentWindow.print(); */
		$('#iframeprint')[0].contentWindow.print();
	});
	
	
	
	
	});
</script>