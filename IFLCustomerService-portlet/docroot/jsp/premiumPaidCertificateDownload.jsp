

<div class="span12"><br/>

<h3 class="tools_heading" style="color: #0aa8f2;">  Premium Paid Certificates  </h3>
<br>

<div class="row-fluid">

	<div class="span6 toolsrenewal">
	<aui:select name="ppFinancialYear" label="Financial Year" id="ppFyear">
	<aui:option value="0">Select Financial Year</aui:option>
	<aui:option value="2008">2007-2008</aui:option>
	<aui:option value="2009">2008-2009</aui:option>
	<aui:option value="2010">2010-2011</aui:option>
	<aui:option value="2011">2011-2012</aui:option>
	<aui:option value="2012">2012-2013</aui:option>
	<aui:option value="2013">2013-2014</aui:option>
	<aui:option value="2014">2014-2015</aui:option>

</aui:select>
</div>
<div class="span6 toolsrenewal toolsrenewalpaid">
<aui:select name="ppDate" label="Date"  id="ppDate">
	<aui:option value="0" >Select Policy Date</aui:option>
</aui:select>

</div>

<br/>
<br/>
<br/>

			<div class="span10 prpaiddonld">
			<aui:button-row>
			<aui:button name="ppSubmit" value="Submit" id="ppSubmit"></aui:button>
			<aui:button name="ppClear" value="Clear" id="ppClear"></aui:button>
			
			</aui:button-row>
			
			</div>

</div>


<br/>
	    	<div class="ppspan10printable" style="display:none;margin-left: 9px;">
	    		<div class="right DownloadPrintBtns"> 	   
		    	<aui:button name="btnPPDownload" id="btnPPDownload" value="Download" />
		    	<aui:button name="btnPPEmail" id="btnPPEmail" value="&nbsp;&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;" ></aui:button>
		    	<aui:button name="btnPPPrint" value="&nbsp;&nbsp;&nbsp;Print&nbsp;&nbsp;&nbsp;"/>
		    </div>
	    	<div class="clr"> </div>
	    	
	    	<br/>
	    		<iframe src="/IFLCustomerService-portlet/docs/Premium Paid Certificate.pdf" height = 600px class="span11" id="PPiframeprint"  accesskey="true"></iframe >
	    		
	    	</div>
	    	
	    	<div class="clr"> </div>
</div>

<portlet:resourceURL id="getFinancialYears" var="getFinancialYears"></portlet:resourceURL>
<portlet:resourceURL id="downloadReceipts" var="downloadReceipts" />
<script>
 $(function(){
	$('#<portlet:namespace/>ppFyear').change(function(){
		
		
		var sHtml='<option value="0" >--Select Policy Created date ---</option>';
		sHtml+='<option value="2008" >25-03-2008 </option>';
		sHtml+='<option value="2009" >15-10-2007 </option>';
		sHtml+='<option value="2010" >9-03-2010</option>';
		sHtml+='<option value="2011" >25-03-2011 </option>';
		sHtml+='<option value="2012" >25-03-2012 </option>';
		sHtml+='<option value="2013" >25-03-2013 </option>';
		sHtml+='<option value="2014" >25-03-2014 </option>';
		
		$('#<portlet:namespace/>ppDate').empty();
		$('#<portlet:namespace/>ppDate').append(sHtml);
		
	});
	
	$('#<portlet:namespace/>ppSubmit').click(function(){
		
		
		var rfy=$('#<portlet:namespace/>ppFyear').val();
		var rnd=$('#<portlet:namespace/>ppDate').val();
		if(rfy==null || rfy==0  || rfy=='undefined' ){
			//alert('Please Select Financial Year');
			var error='Please Select Financial Year';
			showDialog(error);
			return false;
		}
		if(rnd==null || rnd==0 || rnd=='undefined' ){
			//alert('Please Select Policy Date');
			var error='Please Select Policy Date';
			showDialog(error);
			return false;
		}
		$('.ppspan10printable').show();
		
	});
	
	 $('#<portlet:namespace/>btnPPDownload').click(function(){
			
		 var fname=$("#PPiframeprint").attr('src');
		 var url='<%=downloadReceipts%>'+'&page=premiumPaidCertificates&fileName='+fname;
		window.location=url;
		
	}); 
	 
	 $('#<portlet:namespace/>btnPPEmail').click(function(){
			
		 $.ajax({
			 url:'${sendEmail}',
			 data:{'page':'premiumPaidCertificates'},
			 cache:false,
			 success:function(result){
				 showDialog(result);
				 
			 }
			 
		 });
		 
		
	});
	
	$('#<portlet:namespace/>btnPPPrint').click(function(){
		//alert('in print');
		/* var pdf=$('#iframeprint').focus();
		pdf.contentWindow.print(); */
		$('#PPiframeprint')[0].contentWindow.print();
	});
	
	$('#<portlet:namespace/>ppClear').click(function(){

		$('.ppspan10printable').hide();
		
	});
	
});




</script>