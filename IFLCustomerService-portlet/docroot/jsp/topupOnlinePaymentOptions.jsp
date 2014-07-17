<%@ include file="/jsp/init.jsp" %>


<portlet:renderURL var="topUp">
	<portlet:param name="action" value="topUp" />
</portlet:renderURL>


<div style="width:100%; float:left; border-bottom:0px solid #CCCCCC;position: relative;">

	<div class="b-content" style="border-bottom:1px solid #bdbcc1;display:none;">
		<div class="row-fluid">
			<div class="span12 other-recommended">
				<div class="span3 routesheading" style="height:100px !important; background-color:#d2d3d5;">
					<span style="vertical-align: middle; color: #ffffff; display: block; text-align: center; padding-top: 0px; margin-top:-16px;font-size: 32px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.payment" /></span> 
					<span style="vertical-align: middle; color: #ffffff; display: block; text-align: center; padding-top: 10px; font-size: 18px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.options" /></span></div>
			
				<div class="visible-desktop" style="float:left; padding:6px 25px 6px 0"><img alt="arrow" src="<liferay-ui:message key="services.home.image.sidearrow" />" /></div>
			
				<div class="span8 routesheading routesheadingIE" style="height:100px !important; text-align:left; width:75%;padding-left:2px; margin:0;  padding-top:10px; color:#7a7f92; font:12px arial; overflow:hidden;">
				<p><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.payment.option.text" /></p>
				</div>
			</div>
		</div>
	</div>

	<div class="clr"></div>

	<div style="width: 100%;">
		<div class="b-content top-other-recommended"><!-- <div style="width:100%;height:auto;"> --><!-- slider images and heading start from here -->
			<div class="row-fluid"><!-- span10 -->
				<!-- <div class="span5 services-offered">
					<div class="row-fluid">
						<div class="clstopupOnlinePaymentOptons"></div>
					</div>
				</div>
 -->
				<div class="span12 leftsidedrop" style="height: auto;position: relative;margin-left:0px !important;"> 
					
					<div id="payTopupPremiumCont"  class="topUpPaymentOption " style="color: #0AA8F2;display:none;border-top:1px solid #CCCCCC;">
				 	<h4><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online" /></h4>
						<p class="sub_text">
							<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.subtext" /> 
						</p> 
							
						<%-- <div class="topUpPaymentOptionStep1">							
							<div>
								<aui:input id="topUpTxtPayPolNum" name="topUpTxtPayPolNum" label="Policy Number" readonly="true"></aui:input>
								<aui:input id="topUpTxtPayDtDOB" name="topUpTxtPayDtDOB" label="DOB of Life Assured" readonly="true"></aui:input>
								<aui:input id="topUpTxtPayProdName" name="topUpTxtPayProdName" label="Product Name" readonly="true"></aui:input>
								<aui:input id="topUpTxtPayTopupAmt" name="topUpTxtPayTopupAmt" label="Topup Amount" onkeypress="return isNumberKey(event)"></aui:input>										
								 
							</div>								
							<div class="topbtnclas">
								<aui:button id="topUpPayBtnProceed" name="topUpPayBtnProceed" type="button" value="Proceed"></aui:button>  
							</div>							
						</div> --%>
						
						<div class="topUpPaymentOptionStep2" style="display:none;">							
							<div class="paymentModes">							
								
							</div>
							
							<div class="paymentModesTypes">							
								
							</div>
							
							<div>
								<aui:button id="topUpPayBtnSubmit" name="topUpPayBtnSubmit" value="Submit"></aui:button>  
							</div>						 
						</div>
					</div>	
					
					<div class="span12" style="margin-left:0px;">
					 
					  <div class="row-fluid payTrackCont" style="margin-top: 11%;display: none;">
					     <div class="span3 payfootermenu2"><p class="topupbtnactive enterDetail"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.enterdetails" /></p></div>
					     <div class="span3 payfootermenu" style="height:46px;"><p class="topupbtn confirmDetail"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.confirmdetails" /></p> </div>
					     <div class="span3 payfootermenu" style="background-image:none;height:46px;"><p class="topupbtn payDetail"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.pay" /></p> </div>	
					  </div>
					
					</div>			
				</div>
			</div>
		</div>
	</div>

	<div class="clr"></div>		
</div>

<form id="goPayForm" method="POST" name='goPayForm' action="">
 <input type="hidden" name="msg" id="msg" value="" />
</form>
<div class="clr"></div>	

<script>
AUI().ready(function(A) {
	
		
		
		
				
	
		/* $('#<portlet:namespace/>topUpPayBtnProceed').click(function(){
			
			if($.trim($('#<portlet:namespace/>topUpTxtPayTopupAmt').val()) <= '5000'){			
				$( ".errorDialog" ).html('<p>Enter Top Up Amount</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			} else if($.trim($('#<portlet:namespace/>topUpTxtPayTopupAmt').val()) <= 5000){
				
				$( ".errorDialog" ).html('<p>minimum amount is 5000</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			}else {
				alert("ddd");
				$('.payTrackCont p').removeClass('topupbtnactive');
				$('.payTrackCont p').addClass('topupbtn').not('.confirmDetail');
				$('.confirmDetail').addClass('topupbtnactive');
				getPaymentModes();
			}			
		}); */
	
		$('#<portlet:namespace/>topUpPayBtnSubmit').click(function(){

			var inputObj = {};
			
			inputObj.contactId = sessionStorage.customerId; //TODO
			inputObj.paymentMethodId = $("input:radio[name=topUpRadioCardType]:checked").val();
			inputObj.paymentMethodDetailsId = $("input:radio[name=topUpRadioCardPaymentType]:checked").val();
			inputObj.paymentOptionId = sessionStorage.PaymentOptionId;
			inputObj.paymentOptionTypeId = sessionStorage.paymentOptionTypesId;
			inputObj.policyNo = $("#"+ topUpURLObj.portletNamespace +"selectTopUpPolicy").val();
			inputObj.premiumAmount = $('#<portlet:namespace/>topUpTxtPayTopupAmt').val();
			
			if(typeof(inputObj.paymentMethodId) == 'undefined' || typeof(inputObj.paymentMethodDetailsId) == 'undefined'){
				$( ".errorDialog" ).html('<p>Please enter details</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up - Payment Options",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			} else {
				$.ajax({
					url:topUpURLObj.savePrePayment + '&jsonKey=' + JSON.stringify(inputObj),
					method:'POST',
					async:false,
					success: function(res){
						var result = $.parseJSON(res);
						console.log("save prepayment" + result);
						console.log("result.paymentURL:" + result.paymentURL);
						if(typeof(result.paymentURL) != 'undefined'){
							//window.location = result.paymentURL;	
							console.log("if");
							
							sessionStorage.confirmationsuccess = true;
							  sessionStorage.selectedPolicyVal = $("#"+ topUpURLObj.portletNamespace +"selectTopUpPolicy").val();
							  $('.topupOnlinePaymentOptionsCont').hide();
							  $('.selectPolicyCont').show();							 
							  $('#topupbordertop').show();
							  $('#toppolicy').attr('style', 'color:#666');
							  $('#topallocation').attr('style', 'color:#666');
							  $('#topcnfrm').attr('style', 'color:#666');
							  $('#toppayment').attr('style', 'color:#666');
							  $('#topacknwldgtrkr').attr('style', 'color:#02a9f7');
							  /*  $('#goPayForm').attr('action',result.paymentURL);
							$('#msg').val(result.paymentRequest);
							$('#goPayForm').submit();  */  
						  
							 $('#goPayForm').attr('action',topUpURLObj.PaymentResponse);						
							$('#goPayForm').submit();	
						}				
					}
				});
			}
		});
		
		
		$('#<portlet:namespace/>topUpPayBtnProceed').click(function(){
			var amout=$.trim($('#<portlet:namespace/>topUpTxtPayTopupAmt').val());
			topUp.tpolicyAmount=amout;
			if( amout== ''){			
				$( ".errorDialog" ).html('<p>Enter Top Up Amount</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			}  else if((policyplanflag == 'Education Plan' || policyplanflag == 'Savings Plan') && amout <= 4999){
				
				$( ".errorDialog" ).html('<p>minimum amount is 5000</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			}else if(policyplanflag == 'Future Plan' && amout <= 1999){
				
				$( ".errorDialog" ).html('<p>minimum amount is 5000</p>');
				$( ".errorDialog" ).dialog({
					title:"Top Up",
					width: 'auto',
					modal: true,
					buttons: [{
						text: "OK",
						width: 'auto',
					    click: function() {
					    	$( this ).dialog( "close" );
					    }
					}]
				});
			}  else {
				//getPaymentModes();   repalced with belwo function.it is useful after confirm when set the allocation amount
				
				
			//	topUp.getNavHistory();
				 $("#"+ topUpURLObj.portletNamespace +"selectTopUpPolicy option[value=" + sessionStorage.selectedPolicyVal + "]").prop('selected', true);
			 $("#"+ topUpURLObj.portletNamespace +"selectTopUpPolicy").prop("disabled", true);
			 //$('#<portlet:namespace/>topUpTxtPayTopupAmt').val(sessionStorage.premiumAmountVal);
			 
			 sessionStorage.premiumAmountVal = '1';//$('#'+topUpURLObj.portletNamespace+'topUpTxtPayTopupAmt').val();
				 $('#PolicyDetailsDiv').hide();
			 $('#topUpBtns').hide();

				topUp.getPolicyFundsByPolicyId(topUp.getSelectedPolicy());	
				
		var topupFundAllocType = $("input:radio[name=topupFundAllocType]:checked").val();

				
				if(topupFundAllocType=="" || topupFundAllocType==undefined){
					topupFundAllocType = 'exist';
					
				}
				if(topupFundAllocType == 'exist' || topupFundAllocType =='new' ){
					$('.topupExistingAllocFundsSelect').hide();
					$('.topupExistingAllocFunds').show();
					$('#topupbordertop').show();
					 $('#tpallc').show();
					 $('#topprocedbordr').hide();
					 $('#toppolicy').attr('style', 'color:#666');
					 $('#topallocation').attr('style', 'color:#02a9f7');
					topUp.displayFundsExistOrNew();
				}
			}			
		});
	});
	

function getPaymentModeTypes(PaymentMethodID, paymentMode){
	$.ajax({
		url:topUpURLObj.getPaymentModeTypes + PaymentMethodID,
		method:'POST',
		async:false,
		success: function(res){
			var result = $.parseJSON(res);
			var tempHtml = '';
			
			tempHtml += '<p><b>Please select your '+ paymentMode +' and click on "submit"</b></p>';
			
			for(var i=0;i<result.length;i++){				
				tempHtml += '<input name="topUpRadioCardPaymentType" type="radio"  label=""  value="'+ result[i]._Id +'"/><label>'+ result[i]._Description +'</label>';
			}
			
			$('.paymentModesTypes').html(tempHtml);
			
		},
		error: function(errObj){
		}
	});
}



</script>