<%@ include file="/jsp/init.jsp" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:resourceURL id="getAddressType" var="getAddressType" />

<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>

<portlet:renderURL var="changeOfAddressHome">
	<portlet:param name="action" value="changeOfAddressHome" />
</portlet:renderURL>

<div class="clr"></div>
<%-- <div><%@ include file="/jsp/subHeader.jsp"%></div> --%>
<!-- <div class="clr"></div>

<div id="" class="tab2content">	
	<h3>Change of Address</h3>
	<p class="marginclas"> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. </p>
    
    <div class="clear"></div>
</div> -->

<br/>
<div class="tab2content">
<div class="row-fluid">
	<div class="chngepara span4">
	    <p><b>Select any one of the below address options&nbsp;:</b></p></div>
	    <div class="span8 paraoptions">
		    <input type="radio" name="coaAddrType" target="communication" class="coaAddrType" value="Communication" checked />Communication<br>
		    <input type="radio" name="coaAddrType" target="permanent" class="coaAddrType" value="Permanent" />Permanent<br>
		    <input type="radio" name="coaAddrType" target="occupation" class="coaAddrType" value="Office" />Office<br/>
		    <!--  <input type="radio" name="coaAddrType" target="personal" class="coaAddrType" value="peronaldetails" id="personalRadio" style="display: none;">Personal Details<br/>
		      <input type="radio" name="coaAddrType" target="contact" class="coaAddrType" value="contactdetails" id="contactRadio" style="display: none;"/>Contact Details<br/>
	    --> </div> 
	    <div class="clr"></div> 
	
	    <div style="margin-left:10px;display: none;" id="requestTypeDiv" >
		    <b>Select change of address type:</b>
		    <select id="selCOAAddrType" name="selCOAAddrType" style="margin-left:10px;">
		        <option value="">Select</option>
		    	<option value="change">Change</option>
			    <option value="correction">Correction</option>
			    
		    </select>
		</div> 
		<div class="chngepara span4" style="margin-left:0px;">
	    </div>
	    <div class="span8 paraoptions" >
		    <div class="" target="" style="padding: 15px 0px;">
	  		<a href="<%=changeOfAddressHome %>" class="btn">Cancel</a>
	  		<a href="javascript:void(0);" class="btn coaContinue"> Continue </a>
	  	</div>
	  	</div> 
	    <div class="clr"></div> 
		
	
	
	
</div>
</div>

<script>
var pathname = window.location.pathname;
if(pathname=="/web/corporate/home"){
	
	$('#requestTypeDiv').show();
}

	$('.coaContinue').click(function(){
		sessionStorage.coaParam = $('input[name=coaAddrType]:checked').attr('target');
		
		
		if(sessionStorage.corporateAddressChange == "true"&&'${param.coaParam}'==''){
			
			
			if($('#selCOAAddrType').val()=='correction'){
			if(sessionStorage.coaParam=="permanent"){
				var addrType = 'permanentAddr';			
				$('#permanentHead').text("Correction of Communication Address");
				$('#' + addrType + 'PincodeTemp').val($('#' + addrType + 'Pincode').val());
				$('#' + addrType + 'StateTemp').val($('#' + addrType + 'State'));
				$('#' + addrType + 'CityTemp').val($('#' + addrType + 'City'));	
				$('#' + addrType + 'StateIdTemp').val($('#' + addrType + 'StateId').val());
				$('#' + addrType + 'CityIdTemp').val($('#' + addrType + 'CityId').val());	
	            $('#' + addrType + 'Line1Temp').val( $('#' + addrType + 'Line1').val());
				$('#' + addrType + 'Line2Temp').val($('#' + addrType + 'Line2').val());
				$('#' + addrType + 'Line3Temp').val($('#' + addrType + 'Line3').val());
				
				
			}else if(sessionStorage.coaParam=="communication"){
				
				$('#communicationHead').text("Correction of Communication Address");
				var addrType = 'commAddr';		
				$('#' + addrType + 'PincodeTemp').val($('#' + addrType + 'Pincode').val());
				$('#' + addrType + 'StateTemp').val($('#' + addrType + 'State').val());
				$('#' + addrType + 'CityTemp').val($('#' + addrType + 'City').val());	
				$('#' + addrType + 'StateIdTemp').val($('#' + addrType + 'StateId').val());
				$('#' + addrType + 'CityIdTemp').val($('#' + addrType + 'CityId').val());	
	            $('#' + addrType + 'Line1Temp').val( $('#' + addrType + 'Line1').val());
				$('#' + addrType + 'Line2Temp').val($('#' + addrType + 'Line2').val());
				$('#' + addrType + 'Line3Temp').val($('#' + addrType + 'Line3').val());
				
				
			}else if(sessionStorage.coaParam=="occupation"){
				$('#occupationHead').text("Correction of Office Address");
				var addrType = 'officeAddr';
				
				 $('#' + addrType + 'PincodeTemp').val( $('#' + addrType + 'Pincode').val());
				
				$('#' + addrType + 'StateTemp').val($('#' + addrType + 'State').val());
				
				$('#' + addrType + 'CityTemp').val($('#' + addrType + 'City').val());	
				
				$('#' + addrType + 'StateIdTemp').val($('#' + addrType + 'StateId').val());
				
				$('#' + addrType + 'CityIdTemp').val($('#' + addrType + 'CityId').val());	
				
				 $('#' + addrType + 'Line1Temp').val($('#' + addrType + 'Line1').val());
				 $('#' + addrType + 'Line2Temp').val( $('#' + addrType + 'Line2').val());
				
				 $('#' + addrType + 'Line3Temp').val( $('#' + addrType + 'Line3').val());
				
				$('#' + addrType + 'AddressTypeId').val($('#' + addrType + 'AddressTypeId').val());
				
				$('#' + addrType + 'NameTemp').val($('#' + addrType + 'Name').val());
				
				$('#' + addrType + 'DesigTemp').val($('#' + addrType + 'Desig').val());
				
				$('#' + addrType + 'DepartTemp').val($('#' + addrType + 'Depart').val());
				
				$('#' + addrType + 'AddressType').val($('#' + addrType + 'AddressType').val());
				
			}
			}
			
			
			$('#corporateAddressChangeContainer').hide();
			$('#corporateMyProfileContainer').show();
			
			$('#communicationDiv').hide();
			$('#permanentDiv').hide();
			$('#occupationDiv').hide();
			$('#personalDiv').hide();
			$('#contactDiv').hide();
			
			$('#'+$('input[name=coaAddrType]:checked').attr('target')+'Div').show();
			
			
			
			
			
			//addressChange.initWindow();
			//addressChange.setUp();
		} else {
			window.location = '/web/services/myprofile?coaParam=' + sessionStorage.coaParam;
		}		
	});
	
	$('.coaCancel').click(function(){
		location.reload();
	});
</script>