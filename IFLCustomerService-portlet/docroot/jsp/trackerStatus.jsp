<%@ include file="/jsp/init.jsp"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>


 <portlet:renderURL var="trackerStatusDetails" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="trackerStatusDetails" />
</portlet:renderURL> 

<portlet:renderURL var="getAllQrcDetails" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="action" value="getAllQrcDetails" />
</portlet:renderURL> 



<div class="errorDialog"></div>
<div class="row-fluid"> <%@ include file="/jsp/subHeader.jsp"%> </div>
<div class="clr"></div>
<div class="toptab tab1content" style="height: auto;">
	<div class="b-content">
		<div class="row-fluid tkerbrdradjst">
			

        <div id="trackeFields">
             <h3 style="color:#0aa8f2;">Tracker Status</h3><br/><br/>
             
			<div class="selctbtnIE form_sub fundswitchform selctbtn">
				<label>Select</label>
				 <select name="selectPolicy" id="selectPolicy">
					<option value=""><liferay-ui:message key="services.fundswitch.policyno.select" /></option>
					<option value="query">Query</option>
					<option value="req">Request</option>
					<option value="cmplnt">Complaint</option>
					<option value="pno" id="poloicyNum">Policy No</option>
					<option value="srid" id="srId">SR ID</option>
				</select>

				<div class="clr"></div>
			</div>

			<div class="span6 form_sub fundswitchform " id="showPolicyno" style="display: none;">
			<label>Policy No</label>
				<input type="text" name="policyNo" id="policyNo" value=""/>
				<input type="submit"  id="TrckrSearchBtn" name="TrckrSearchBtn" value="Search" class="TrckrSearch btn"/>
				<div class="clr"></div>
            
			</div>
			
			<div class="span2 form_sub fundswitchform" id="radioPolicyno" style="display: none;">
			 <label ><input type="radio" name="gender"  value="" id="dispalyPDetails"/>Policy No</label>
				
			<label>	<input type="radio"  name="gender" value="Search"  id="dispalyAllDetails"/> All</label>
			<%-- <aui:field-wrapper>	
			<aui:input checked="" inlineLabel="right" name="gender" type="radio" value="pdetails" label="Policy No"  id="dispalyPDetails" class="pDetails"/>
			 
		  	
            <aui:input checked="" inlineLabel="right" name="gender" type="radio" value="pall" label="All"  id="dispalyAllDetails"/>
            </aui:field-wrapper> --%>
            
            <div class="clr"></div>
			</div>
			
			<div class="span5 form_sub" style="display: none;" id="pNoField">
			
			<div id="reTextFiled">
			<input type="text" name="reqId" id="reqId" value=""/>
			</div>
			
			<input type="submit" id="TrckrreqSearchBtn" name="TrckrreqSearchBtn" value="Search" class="TrckrSearch btn"/>
			</div>
			
			<div id="sbtn" style="display: none;">
			<!-- <input type="hidden" name="trkrlistId" id="trkrlistId" value=""/> -->
			<input type="submit"  id="TrckrallreqSearchBtn" name="TrckrallreqSearchBtn" value="Search" class="TrckrSearch btn"/>
			</div>
			
			<div class="span6 form_sub fundswitchform" id="showSrId" style="display: none;">
			<label>SR Id</label>
				<input type="text" name="qrcId" id="qrcId" value=""/>
				<input type="submit" id="srSearchBtn" name="TSearch" value="Search" class="TrckrSearch btn"/>
				<div class="clr"></div>
            
			</div>
			
			
			</div>
	              
			
			

       </div>
		</div>
	</div>





<div class="row-fluid">
<div class="span12">
<div id="trackerDetailsDisply"></div>
</div>
</div>
<div class="b-content">
  <div class="row-fluid">
  <div class="span12 trackerstatus"></div>
  </div>
</div>


<script>
	$(function() {
		
			 
		 $("#selectPolicy").change(function() {
			 
			 if($("#selectPolicy").val()=='pno'){
				 $("#showPolicyno").show();
				 $("#showSrId").hide();
				 $("#radioPolicyno").hide();
				 $("#trackersrDetailsDisply").html('');
			 }else if($("#selectPolicy").val()=='srid'){
				 $("#showPolicyno").hide();
				 $("#showSrId").show();
				 $("#radioPolicyno").hide();
			 }else if(($("#selectPolicy").val()=='req')){
				 $("#showPolicyno").hide();
				 $("#showSrId").hide();
				 $("#radioPolicyno").show();
				
			 }
			 $("#trackerDetailsDisply").html('');
			 
		 });
		 
		 $('#dispalyPDetails').click(function(){
			 $('#pNoField').show();
			 $('#sbtn').hide();
			 
		 });
		 $('#dispalyAllDetails').click(function(){
		
			 $('#sbtn').show();
			 $('#pNoField').hide();
			 
		 });
		 
		 
	 $('#TrckrSearchBtn').click(function(){
		 $("div").removeClass("tkerbrdradjst");
		 
			var policyNo=$('#policyNo').val();
			
		
			if($('#policyNo').val()==''){
				$(".errorDialog").html('<p>Please Enter Ploicy Number</p>');
				$(".errorDialog").dialog({
					title : "Tracker Status",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,
					close: function() {
						$(this).dialog("close");
					},
					buttons : [{
						text : "Close",
						width : 'auto',
						click : function() {
							$(this).dialog("close");
						}
					}]
				});
				
			}else {
				
		
		 $.ajax({
			url : '<%=trackerStatusDetails%>',
			method : 'GET',
			data:{policyNo:policyNo},
			success : function(result) {
				$("#trackerDetailsDisply").html(result);
			}
		
	});
		  
			}	
	}); 
		
		
		
		
	 $('#srSearchBtn').click(function(){
		
			var qrcId=$('#qrcId').val();
			if($('#qrcId').val()==''){
				$(".errorDialog").html('<p>Please Enter SR ID Number</p>');
				$(".errorDialog").dialog({
					title : "Tracker Status",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,
					close: function() {
						$(this).dialog("close");
					},
					buttons : [{
						text : "Close",
						width : 'auto',
						click : function() {
							$(this).dialog("close");
						}
					}]
				});
				
			}else {
				
		
		 $.ajax({
			url : '<%=trackerStatusDetails%>',
			method : 'GET',
			data:{qrcId:qrcId},
			success : function(result) {
				$("#trackerDetailsDisply").html(result);
			}
		
	});
		  
			}	
	}); 
	 
	 $('#TrckrreqSearchBtn').click(function(){
		 
		 $("div").removeClass("tkerbrdradjst");
			var reqId=$('#reqId').val();
		
			if($('#reqId').val()==''){
				$(".errorDialog").html('<p>Please Enter Policy Number</p>');
				$(".errorDialog").dialog({
					title : "Tracker Status",
					width : 'auto',
					modal : true,
					closeOnEscape: false,
					resizable : false,
					close: function() {
						$(this).dialog("close");
					},
					buttons : [{
						text : "Close",
						width : 'auto',
						click : function() {
							$(this).dialog("close");
						}
					}]
				});
				
			}else {
				
		
		 $.ajax({
			url : '<%=trackerStatusDetails%>',
			method : 'GET',
			data:{reqId:reqId},
			success : function(result) {
				$("#trackerDetailsDisply").html(result);
			}
		
	});
		  
			}	
	}); 
	 
	 
	 <%--  $('#TrckrallreqSearchBtn').click(function(){
		 alert("enetererwerere");
		 $.ajax({
			url : '<%=getAllQrcDetails%>',
			method : 'GET',
			success : function(res) {
				alert(res);
				$("#trackerDetailsDisply").html(res);
			}
		
	});
	
	}); --%>
		
});
</script>
<script type="text/javascript">
    function customRadio(radioName){
        var radioButton = $('input[name="'+ radioName +'"]');
        $(radioButton).each(function(){
            $(this).wrap( "<span class='custom-radio'></span>" );
            if($(this).is(':checked')){
                $(this).parent().addClass("selected");
            }
        });
        $(radioButton).click(function(){
            if($(this).is(':checked')){
                $(this).parent().addClass("selected");
            }
            $(radioButton).not(this).each(function(){
                $(this).parent().removeClass("selected");
            });
        });
    }
    $(document).ready(function (){
    	
        customRadio("gender");
        
        
    })
</script>
<script>
AUI().ready(function(A) {
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .tracker_status').addClass('active');	
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .transactonline').addClass('active');
});
</script>