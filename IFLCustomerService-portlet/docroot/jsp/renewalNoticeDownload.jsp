

<div class="span12"><br/>
<h3 class="tools_heading" style="color: #0aa8f2;">  Renewal Notice  </h3>
<br>

<div class="row-fluid">

	<div class="span6 toolsrenewal">
	<aui:select name="rnFinancialYear" label="Financial Year" id="rnFyear">
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
<div class="span6 toolsrenewal toolsrenewalleft">
<aui:select name="rnDate" label="Date"  id="rnDate">
	<aui:option value="0" >Select Policy Date</aui:option>
</aui:select>

</div>

<br/>
<br/>
<br/>

<div class="span11 renewalbtns">
<aui:button-row>
<aui:button name="rnSubmit" value="Submit" id="rnSubmit"></aui:button>
<aui:button name="rnClear" value="Clear" id="rnClear"></aui:button>

</aui:button-row>

</div>

</div>


<br/>
	    	<div class="span10printable" style="display:none;margin-left: 9px;">
	    		<div class="right DownloadPrintBtns"> 	   
		    	<aui:button name="btnRNDownload" id="btnRNDownload" value="Download" />
		    	<aui:button name="btnRNEmail" id="btnRNEmail" value="&nbsp;&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;" ></aui:button>
		    	<aui:button name="btnRNPrint" value="&nbsp;&nbsp;&nbsp;Print&nbsp;&nbsp;&nbsp;"/>
		    </div>
	    	<div class="clr"> </div>
	    	
	    	<br/>
	    		<iframe src="/IFLCustomerService-portlet/docs/Renewal Premium Receipt.pdf" height = 600px class="span11" id="rniframeprint"  accesskey="true"></iframe >
	    		
	    	</div>
	    	
	    	<div class="clr"> </div>
</div>

<portlet:resourceURL id="getFinancialYears" var="getFinancialYears"></portlet:resourceURL>
<portlet:resourceURL id="downloadReceipts" var="downloadReceipts" />
<portlet:resourceURL id="sendEmail" var="sendEmail" />

<script>
 $(function(){
	$('#<portlet:namespace/>rnFyear').change(function(){
		
		
		var sHtml='<option value="0" >--Select Policy Created date ---</option>';
		sHtml+='<option value="2008" >25-03-2008 </option>';
		sHtml+='<option value="2009" >15-10-2007 </option>';
		sHtml+='<option value="2010" >9-03-2010</option>';
		sHtml+='<option value="2011" >25-03-2011 </option>';
		sHtml+='<option value="2012" >25-03-2012 </option>';
		sHtml+='<option value="2013" >25-03-2013 </option>';
		sHtml+='<option value="2014" >25-03-2014 </option>';
		
		$('#<portlet:namespace/>rnDate').empty();
		$('#<portlet:namespace/>rnDate').append(sHtml);
		
	});
	
	$('#<portlet:namespace/>rnSubmit').click(function(){
		
		var rfy=$('#<portlet:namespace/>rnFyear').val();
		var rnd=$('#<portlet:namespace/>rnDate').val();
		if(rfy==null || rfy==0  || rfy=='undefined' ){
			//alert('Please Select Financial Year');
			var error='Please Select Financial Year';
			showDialog(error);
			return false;
		}
		if(rnd==null || rnd==0 || rnd=='undefined' ){
			var error='Please Select Policy Date';
			showDialog(error);
			//alert('Please Select Policy Date');
			return false;
		}
		$('.span10printable').show();
	});
	
	$('#<portlet:namespace/>rnClear').click(function(){
		
		//$('#<portlet:namespace/>prFinancialYear').empty();
		$('#<portlet:namespace/>rnDate').empty();
		$('.span10printable').hide();
	});
	
	 $('#<portlet:namespace/>btnRNDownload').click(function(){
			
		 var fname=$("#rniframeprint").attr('src');
		 var url='<%=downloadReceipts%>'+'&page=renewalNotice&fileName='+fname;
		window.location=url;
		
	}); 
	 
	 $('#<portlet:namespace/>btnRNEmail').click(function(){
			
		 $.ajax({
			 url:'${sendEmail}',
			 data:{'page':'renewalNotice'},
			 cache:false,
			 success:function(result){
				 showDialog(result);	
				 
			 }
			 
		 });
		 
		
	});
	 
	
	$('#<portlet:namespace/>btnRNPrint').click(function(){
		//alert('in print');
		/* var pdf=$('#iframeprint').focus();
		pdf.contentWindow.print(); */
		$('#rniframeprint')[0].contentWindow.print();
	});
	
});




</script>