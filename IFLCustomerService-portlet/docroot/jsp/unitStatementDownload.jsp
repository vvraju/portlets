
<h3 class="tools_heading" style="color: #0aa8f2;">  Unit Statement </h3>

<br>

<div style="">



	<div class="unitstament span6">
		<aui:select name="unPolicyNo" label="Policy No" id="unPolicyNo">
			<aui:option value="0">Select Policy No</aui:option>
		</aui:select>
	</div>
	<div class="unitstament span6" style="">
		<aui:select name="unFinancialYear" label="Financial Year" id="unFinYear">
			<aui:option value="0">Select Financial Year</aui:option>
		</aui:select>
	</div>
	<div class="row-fluid">
	<div class="unitstament span6" style="">
		<aui:input type="text" name="unFromDate" label="From Date" id="unFromDate">
		</aui:input>
	</div>
	<div class="unitstament span6" style="">
			<aui:input type="text" name="unToDate" label="To Date" id="unToDate">
			</aui:input>

			
		</div>
		</div>
		<div class="clr"></div>
		<div class="span12 unitbuttons">
		<aui:button-row>
			<aui:button name="unSubmit" id="unSubmit" value="Submit"></aui:button>
			<aui:button name="unClear" id="unClear" value="Clear"></aui:button>
	
	</aui:button-row>
	</div>



		<div class="unspan10printable" style="display:none;margin-left: 9px;">
	    	<div class="right DownloadPrintBtns"> 	   
		    	<aui:button name="btnUNDownload" id="btnUNDownload" value="Download" />
		    	<aui:button name="btnUNEmail" id="btnUNEmail" value="&nbsp;&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;" ></aui:button>
		    	<aui:button name="btnUNPrint" value="&nbsp;&nbsp;&nbsp;Print&nbsp;&nbsp;&nbsp;"/>
		    </div>
	    	<div class="clr"> </div>
	    	
	    	<div class="pdfFile"></div>
	    	<br/>
	    		<iframe src="/IFLService-theme/images/my.pdf" height = 600px class="span11" id="uniframeprint"  accesskey="true"></iframe >
	    		
	    	</div>
	    	
	    	<div class="clr"> </div>
</div>

<script>
$(function(){
	$('#<portlet:namespace/>unFromDate').datepicker({
		showOn : "both",
		buttonImage : "/IFLService-theme/images/calender.png",
		changeMonth : true,
		changeYear : true,
		dateFormat : 'dd-mm-yy',
		yearRange: "2009:c",
		maxDate: 0,
		
		
	});
	
	$('#<portlet:namespace/>unToDate').datepicker({
		showOn : "both",
		buttonImage : "/IFLService-theme/images/calender.png",
		changeMonth : true,
		changeYear : true,
		dateFormat : 'dd-mm-yy',
		yearRange : '2009:c',
		maxDate: 0,
	});
});

$('#<portlet:namespace/>unPolicyNo').change(function(){
	var pno=$('#<portlet:namespace/>unPolicyNo').val();
	var url='<%=getPolicyYearsById%>';
	$.ajax({
		method : 'GET',
		url : url,
		data : {'policyNum' : pno,'rndownload' : 'yes'},
		cache : false,
		success : function(result) {
			data = $.parseJSON(result);
			$('#<portlet:namespace/>unFinYear').empty();
			$.each(data, function(i, item) {

				var fy = '<option value="'+item['id']+'">'+ item['val'] + '</option>';
				$('#<portlet:namespace/>unFinYear').append(fy);
			});

		}

	});
	
});

$('#<portlet:namespace/>unSubmit').click(function(){
	var pno=$('#<portlet:namespace/>unPolicyNo').val();
	var pfy=$('#<portlet:namespace/>unFinYear').val();
	var pfd=$('#<portlet:namespace/>unFromDate').val();
	var ptd=$('#<portlet:namespace/>unToDate').val();
	
	if(pno==0 || pno==null || pno=='undefined'){
		//alert('Please Select Policy No');
		var error='Please Select Policy No';
		showDialog(error);
		$('.unspan10printable').hide();
		return false;
	}
	if(pfy==0 || pfy==null || pfy=='undefined'){
		//alert('Please Select Policy Date');
		var error='Please Select Policy Date';
		showDialog(error);
		$('.unspan10printable').hide();
		return false;
	}
	if(pfd==0 || pfd==null || pfd=='undefined'){
		//alert('Please Select From Date');
		var error='Please Select From Date';
		showDialog(error);
		$('.unspan10printable').hide();
		return false;
	}
	if(ptd==0 || ptd==null || ptd=='undefined'){
		//alert('Please Select To Date');
		var error='Please Select To Date';
		showDialog(error);
		$('.unspan10printable').hide();
		return false;
	}
	
	/* var fromDate=new Date(pfd);
	var toDate=new Date(ptd);
	 */
	
	 if(Date.parse(pfd)=='NAN' || Date.parse(ptd)=='NAN' || Date.parse(pfd)=='undefined'|| Date.parse(ptd)=='undefined' ){
		 //alert('Select a Date less than or Today');
		 var error='Select a Date less than or Today';
			showDialog(error);
		 $('.unspan10printable').hide();
		 return false;
	 }
	
	//alert(pfd.split("-"));
	
	  
	if((Date.parse(pfd))>= (Date.parse(ptd))){
		//alert("From Date Should be less than To Date");
		var error='From Date Should be less than To Date';
		showDialog(error);
		$('.unspan10printable').hide();
		return false;
	}
	
	
	$('.unspan10printable').show();
	
	
});

$('#<portlet:namespace/>btnUNDownload').click(function(){
	
	 var fname=$("#uniframeprint").attr('src');
	 var url='<%=downloadReceipts%>'+'&page=unitStatement&fileName='+fname;
	window.location=url;
	
}); 

$('#<portlet:namespace/>btnUNEmail').click(function(){
	
	 $.ajax({
		 url:'${sendEmail}',
		 data:{'page':'unitStatement'},
		 cache:false,
		 success:function(result){
			 showDialog(result);	
			 
		 }
		 
	 });
	 
	
});

$('#<portlet:namespace/>btnUNPrint').click(function(){
	//alert('in print');
	/* var pdf=$('#iframeprint').focus();
	pdf.contentWindow.print(); */
	$('#uniframeprint')[0].contentWindow.print();
	return false;
});


$('#<portlet:namespace/>unClear').click(function(){

	$('.unspan10printable').hide();
	$('#<portlet:namespace/>unFromDate').val('');
	$('#<portlet:namespace/>unToDate').val('');
	
});


AUI().ready(function(A) {
	
	
	
	$('.unitstament .control-label').addClass('span4');
	
	
				
});
</script>