<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/jsp/init.jsp" %>


<portlet:resourceURL id="updateConfirmContactDetails" var="updateConfirmContactDetails" />
<style>
.aui .modal.fade.in {
top: 35%;
}
</style>
<script>



	var addressConfirmUrlObj = {};
	
	
	addressConfirmUrlObj.updateContactDetails		= '<%= updateConfirmContactDetails %>&<portlet:namespace/>';
	
</script> 

<%
	Calendar calendar = Calendar.getInstance();
	
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	String dateNow = format.format(calendar.getTime());
	String timeNow = timeFormat.format(calendar.getTime());
	
	int dayLimit = calendar.get(Calendar.HOUR_OF_DAY);
	
	Calendar approvalDate = Calendar.getInstance();
	
	if(dayLimit>14){
		approvalDate.add(Calendar.DATE, 1);	
	}
	
	String approvalDateNow = format.format(approvalDate.getTime());
	String approvalTimeNow = timeFormat.format(approvalDate.getTime());
	
	Calendar calendar1 = Calendar.getInstance();
	calendar1.add(Calendar.DATE, 5);
	
	SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
	String lastDate = newFormat.format(calendar1.getTime());
 %>
 
 <script>
 $(function(){
 
	 var currentTime = new Date()
		var hours = currentTime.getHours()
		var minutes = currentTime.getMinutes()

		if (minutes < 10)
		minutes = "0" + minutes

		var suffix = "AM";
		if (hours >= 12) {
		suffix = "PM";
		hours = hours - 12;
		}
		if (hours == 0) {
		hours = 12;
		}
		var timess= hours + ":" + minutes + " " + suffix ;
		//document.write("<b>" + hours + ":" + minutes + " " + suffix + "</b>")
	    $("#cTime").append(timess);
  
 });
 </script>
 

	<div class="b-content Email_corporate"> 	 
    <div class="row-fluid" id="addressChangeConfirmCont"> 
		<div class="span12">
	        

			
				<div class="toptab tab_con_right tab2content span12" style="margin:0px;"> 
					<div class="row-fluid tableconfirm">
					<div class="span2"></div>
					<div class="span8 tablediv">
			                    	<div class="row-fluid botmbordercls">
			                    		<input type="hidden" id="custId" name="custId" value="${customer.custId}" />
			                    	</div>
			                    	<div class="row-fluid botmbordercls">
			                    		<div class="span5" style="border-left: 1px solid #ccc;"> <span >New Email</span></div>
			                    		<div class="span7 " style="border-left: 1px solid #ccc; border-right: 1px solid #ccc;"><span id="email">${customer.email}</span></div>
			                    	</div>
			                    	<%-- <div class="row-fluid botmbordercls">
			                    		<div class="span5" style="border-left: 1px solid #ccc;"> <p>Tel.(Off)</p></div>
			                    		<div class="span7 " style="border-left: 1px solid #ccc; border-right: 1px solid #ccc;"><p>${tempCustomer.PHONE_NUMBER_2}</p></div>
			                    	</div>
			                    	<div class="row-fluid botmbordercls">
			                    		<div class="span5" style="border-left: 1px solid #ccc;"> <p>Tel.(Res)</p></div>
			                    		<div class="span7 " style="border-left: 1px solid #ccc; border-right: 1px solid #ccc;"><p>${tempCustomer.PHONE_NUMBER_3}</p></div>
			                    	</div> --%>
			                    	<div class="row-fluid botmbordercls">
			                    		<div class="span5" style="border-left: 1px solid #ccc;"> <span>New Mobile</span></div>
			                    		<div class="span7 " style="border-left: 1px solid #ccc; border-right: 1px solid #ccc;"><span id="mobile">${customer.mobile}</span></div>
			                    	</div>
			          </div>
			          <div class="span12">
						   <div class="row-fluid" align="center">
						    <div class="span7"></div>
							<div class="span5 Emailcls" style="margin-bottom:30px;float:right;">	
							<a href="/web/services/myprofile" class="btn right Ecancel" rel="/web/services/myprofile"> Cancel </a>
							<a href="javascript:void(0);" id="confirmContactDetails" class="btn right" > Confirm </a> 
							</div> </div> </div>
			          </div>
			          
			      </div>
			      </div>
			      </div>
			      </div>


<script>
$(function(){
 
 $('#confirmContactDetails').click(function(){
	 var inputObj = {};
		inputObj.custId = $('#custId').val();		
		inputObj.email=$('#email').text();
		inputObj.mobile=$('#mobile').text();
	 $.ajax({
		 	url : addressConfirmUrlObj.updateContactDetails+'jsonkey='+JSON.stringify(inputObj),
		 	method : 'POST',
		 	success : function(result){
		 		var res =$.parseJSON(result);
		 		$(confirmcontact).modal('hide');
		 		if(res.success != undefined )
		 			{
		 			$(".errorDialog").html('<p>'+ res.success +'</p>');
		 			}
		 		else{
		 			$(".errorDialog").html('<p>'+ result.error +'</p>');
		 			}
		 		
				$(".errorDialog").dialog({
					title : "Update Details",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,
					close: function() {
						$(this).dialog("close");								
					},
					buttons : [{
						text : "OK",
						width : 'auto',
						click : function() {
							$(this).dialog("close");
							
						}
					}]
				});
		 	}
	 });
	 
	 
 });
 
});
	
</script>
