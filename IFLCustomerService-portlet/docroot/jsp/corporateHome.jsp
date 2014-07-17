<%@ include file="/jsp/init.jsp" %>
<div class="clear"></div>
<%@ include file="/jsp/corporateSubHeader.jsp"%>
<div class="clear"></div>

<portlet:resourceURL id="getPolicyYearsById" var="getPolicyYearsById" />

<script>
	var corporatePolicyURLObj = {};
	
	
	corporatePolicyURLObj.getPolicyYears		='<%=getPolicyYearsById%>&<portlet:namespace/>policyNum=';
</script>


<div class="b-content">
	<div class="clearfix"></div>

	<div class="row-fluid" style="border-top: 1px solid #bcbec0;">
		<div class="span5" id="caseStartMenuSubMenu">
			<div class="span6 col-sm-5 profile-list-alerts-big">
				<div>
					<a href="javascript:void(0);">
						<div class="maintilesbox">
							<img
								src="/IFLService-theme/images/services_images/icon-query.png"  style="padding-top: 32px;"/>
							<div class="innertilestext">Query</div>
						</div>

					</a>
				</div>

				<div>
					<a href="javascript:void(0);">
						<div class="maintilesbox" style="background-color:#fff;">
							<img
								src="/IFLService-theme/images/services_images/icon-request-active.png" style="padding-top: 32px;"/>
						<div class="innertilestext" style="color: #ff9c9c;">Request</div>
						</div>
					</a>
				</div>

			
				<div>
					<a href="javascript:void(0);">
						<div class="maintilesbox">
							<img
								src="/IFLService-theme/images/services_images/icon-complaint.png"  style="padding-top: 32px;"/>
								
							<div class="innertilestext">Complaint</div>
						</div>

					</a>
				</div>

				<!-- 
				<div>
					<a href="javascript:void(0);">
						<span class="active" style="background-color: #fff;color: #ff9c9c;">
							<em class="icon-request"></em>
							Request
						</span>
					</a>
				</div>
				
				<div>
					<a href="javascript:void(0);">
						<span>
							<em class="icon-complaint"></em>
							Complaint
						</span>
					</a>	
				</div> -->
				<div class="clr"></div>
			</div>

			<div class="span6 query-request" style="margin: 0px;">
				<div>
					<a href="javascript:void(0);"> Bonus </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="CP"> Change
						Personal Details </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="EP"> Change
						Email/Phone </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="FS"> Fund
						Switch </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="PR"> Premium
						Redirection </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="AC"> Address Change
					</a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="TU"> Top Up </a>
				</div>
				<div>
					<a href="javascript:void(0);" class="submenu" rel="RN"> Renewal Notice
					</a>
				</div>
				<!-- <div>
					<a href="javascript:void(0);" class="submenu" rel="RPR"> Renewal
						Premium Receipt </a>
				</div> -->
				<div>
					<a href="javascript:void(0);" class="submenu" rel="UPT">Download
						Policy </a>
				</div>
				
			</div>
		</div>

		<div class="span5" id="profile360" style="display: none;margin-left:0px !important;">
			<%@ include file="/jsp/profile360.jsp"%>
		</div>

		<div class="span7" id="caseAccordion">


			<div id="caseAccToggler" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="casedetailsDiv">
					<a href="javascript:void(0);">Case Detail</a>
				</h4>

				<div class="content toggler-content-collapsed tab1content"
					style="height: auto; overflow: hidden;">
					<div class="form_sub3" style="width: 49%;">
						<label> Policy No.</label> <input type="text" id="txtPolicyNo"
							name="txtPolicyNo" maxlength="8" min="0" value="${policyId}">
						<div class="clr"></div>

						<label> Product Name</label> <input type="text" name="text"
							 value="${pName}" placeholder="Product Name" disabled>
						<div class="clr"></div>

						<label> Sum Assured </label> <input type="text" name="text"
							 value="${sAssured}" placeholder="Sum Assured" disabled>
						<div class="clr"></div>
					</div>

					<div class="form_sub3" style="width: 49%; margin-left: 2%;">
						<label> Application No.</label> <input type="text" name="text"
							placeholder="Application No." disabled>
						<div class="clr"></div>

						<label> Policy Status</label> <input type="text" name="text"
							 value="${pStatus}" placeholder="Policy Status" disabled>
						<div class="clr"></div>

					</div>

					<div class="clr"></div>
					<hr>

					<div class="form_sub3" style="width: 49%;">

						<label> Source</label> <select disabled>
							<option>Sales/Customer/IGMS</option>
							<option>select</option>
						</select>
						<div class="clr"></div>

						<label> Channel</label> <select disabled>
							<option>Email/Walk-in</option>
							<option>select</option>
						</select>
						<div class="clr"></div>

						<label> Call Type</label> <select disabled>
							<option>select</option>
						</select>
						<div class="clr"></div>

					</div>

					<div class="form_sub3" style="width: 49%; margin-left: 2%;">
						<label> Category</label> <select disabled>
							<option>select</option>
						</select>
						<div class="clr"></div>

						<label> Priority </label> <select>
							<option>select</option>
						</select>
						<div class="clr"></div>

						<label>Sub Type</label> <select>
							<option>select</option>
						</select>
						<div class="clr"></div>
					</div>

					<div class="clr"></div>

					<div class="form_sub3" style="width: 100%;">
						<label>Case Details</label>
						<textarea name="" cols="90" rows="4" disabled></textarea>
					</div>

					<div class="clr"></div>

					<div style="width: 100%; text-align: center; float: left;">
						<input type="button" name="searchPolicyBtn" id="searchPolicyBtn"
							value="Search" class="form-btn btn">
					</div>
				</div>

				<h4 class="header toggler-header-collapsed caseDecisionAcc">
					<a href="javascript:void(0);">Case Decision</a>
				</h4>
				<div class="content toggler-content-collapsed caseDecisionCon"
					style="height: auto;">
					<div id="userPolicyContainer" style="display: none;">
					<jsp:include page="/jsp/userpolicyTemplate.jsp"/>
					
					
					</div>
					<!-- Start Fund Switch -->
					<div id="corporateFundSwitchContainer" style="display: none;">
						<jsp:include page="/jsp/fundSwitchTemplate.jsp"/>
					</div>
					<!-- End of FS -->

<!-- Start Address Change Receipt -->
					<div id="corporateAddressChangeContainer" style="display: none;">
						<jsp:include page="/jsp/changeOfAddress.jsp"/>
					</div>
					<!-- End Address Change  -->

				 <!-- Start Address Change Receipt -->
					<div id="corporateMyProfileContainer" style="display: none;">
						
						<jsp:include page="/jsp/corporateaddresschangeTemp.jsp"></jsp:include>
					</div> 
					<!-- End Address Change  -->
					<!-- Start Premium Redirection -->
					<div id="corporatePremiumRedirectContainer" style="display: none;">
					<jsp:include page="/jsp/premiumRedirectTemplate.jsp"/>
					</div>
					<!-- End Premium Redirection -->

					<!-- Start Renewal Notice -->
					<div id="corporateRenewalNoticeContainer" style="display: none;">
						
						<jsp:include page="/jsp/renewalNoticeTemplate.jsp"/>
					</div>
					<!-- End Renewal Notice -->

					<!-- Start Renewal Premium Receipt -->
					<div id="corporateRenewalPremiumReceiptContainer"
						style="display: none;">
						<jsp:include page="/jsp/renewalPremiumReceiptTemplate.jsp"/>
					</div>
					<!-- End Renewal Premium  -->

					

					<!-- Start TopUp -->
					<div id="corporateTopUpContainer" style="display: none;">
				     <div id="caseAccTogglerAuto" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="autodebitDiv">
					<a href="javascript:void(0);">Auto Debit</a>
				</h4>
	
				<div class="content toggler-content-collapsed caseDecisionCon">
					<div id="autoDebitContainer" style="height: auto;">
						<jsp:include page="/jsp/autoDebit.jsp"/>
					</div>

				</div>
				
		</div>
				
		<div id="caseAccTogglerDrop" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="dropboxDiv">
					<a href="javascript:void(0);">Drop Box</a>
				</h4>

	
				<div class="content toggler-content-collapsed caseDecisionCon">
					<div id="dropBoxContainer">
						<jsp:include page="/jsp/dropBox.jsp"/>
					</div>

				</div>
				
		</div>
				
		<div id="caseAccTogglerPay" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="paybyphoneDiv">
					<a href="javascript:void(0);">Pay By Phone</a>
				</h4>

	
				<div class="content toggler-content-collapsed caseDecisionCon">
					<div id="payByPhoneContainer" >
						<jsp:include page="/jsp/payByPhone.jsp"/>
					</div>

				</div>
				
		</div>
				
				
		<div id="caseAccTogglerCheck" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="cashpickDiv">
					<a href="javascript:void(0);">Cash / Check Pickup</a>
				</h4>

	
				<div class="content toggler-content-collapsed caseDecisionCon">
					<div id="cashorCheckContainer" style="height: auto;">
						<jsp:include page="/jsp/cashorCheckPickup.jsp"/>
					</div>

				</div>
				
		</div>
				
		<div id="caseAccTogglerPost" style="margin-left: 10px;">
				<h4 class="header toggler-header-collapsed caseStartAcc"
					id="postcourierDiv">
					<a href="javascript:void(0);">Post or Courier</a>
				</h4>

	
				<div class="content toggler-content-collapsed caseDecisionCon">
					<div id="postorCourierContainer" style="height: auto;">
						<jsp:include page="/jsp/postorCourier.jsp"/>
					</div>

				</div>
				
		</div>
					</div>

					<!-- End TopUp -->
							

			<div class="clear">&nbsp;</div>

		</div>
		
				
	</div>
	
	
	
		
	
	
	<div class="clr"></div>
	
	
</div>

<div class="clr"></div>

<div class="errorDialog"></div>

<div class="clr"></div>

<script>
AUI().ready(function(A) {
	
	 function setDefault(){
				
		if('${reqtype}'!=''){
		sessionStorage.subMenu = reqType;
		}
		$(".submenu").each(function() {
		     if( this.rel==sessionStorage.subMenu){
		    	 $(this).attr('class','submenu active');
		    	 $('.caseStartAcc').click();
		     }
		  }); 
	} 
	
	YUI().use('aui-toggler', function(Y) {
		new Y.TogglerDelegate({	      
	        animated: true,
	        closeAllOnExpand: true,
	        container: '#caseAccToggler',
	        content: '.content',
	        expanded: true,
	        header: '.header',
	        transition: {
	          duration: 0.2,
	          easing: 'cubic-bezier(0, 0.1, 0, 1)'
	        },
	        toggle:setDefault()
		});
	});
	
	
	
	
		
	YUI().use(function(Y){
		$('.query-request a').click(function(){
			$('.query-request a').removeClass('active');
   			$(this).addClass('active');
   			sessionStorage.subMenu = $(this).attr("rel");
   			caseSearchBtn = true; //which will enable accordion in case start
   			$('.caseAccToggler .content').hide(); //Hide/close all containers
   			//$('#casedetailsDiv').addClass('header caseStartAcc toggler-header toggler-header-expanded');
   			if($('.caseStartAcc').attr('class')!='header caseStartAcc toggler-header toggler-header-expanded'){
   			$('.caseStartAcc').click();
   			}
   			$('#txtPolicyNo').val('');
   			
   			$('#corporateFundSwitchContainer').hide();       		
       		$('#corporatePremiumRedirectContainer').hide();
       		$('#corporateTopUpContainer').hide();	       		
       		$('#corporateRenewalNoticeContainer').hide();
       		$('#corporateRenewalPremiumReceiptContainer').hide();
       		$('#corporateMyProfileContainer').hide();
       		$('#corporateAddressChangeContainer').hide();
       		$('#userPolicyContainer').hide();
       		if(sessionStorage.subMenu=='TU'){
       		$('#topUpItems').show();
       		}else{
           		$('#topUpItems').hide();
           		}
		});
		
		
		YUI().use('aui-toggler', function(Y) {
			new Y.TogglerDelegate({	      
		        animated: true,
		        closeAllOnExpand: true,
		        container: '#caseAccTogglerAuto',
		        content: '.content',
		        expanded: true,
		        header: '.header',
		        transition: {
		          duration: 0.2,
		          easing: 'cubic-bezier(0, 0.1, 0, 1)'
		        },
		        toggle:setDefault()
			});
		});
	
		
		
		
		
		
		YUI().use('aui-toggler', function(Y) {
			new Y.TogglerDelegate({	      
		        animated: true,
		        closeAllOnExpand: true,
		        container: '#caseAccTogglerDrop',
		        content: '.content',
		        expanded: true,
		        header: '.header',
		        transition: {
		          duration: 0.2,
		          easing: 'cubic-bezier(0, 0.1, 0, 1)'
		        },
		        toggle:setDefault()
			});
		});
		
		
		YUI().use('aui-toggler', function(Y) {
			new Y.TogglerDelegate({	      
		        animated: true,
		        closeAllOnExpand: true,
		        container: '#caseAccTogglerPay',
		        content: '.content',
		        expanded: true,
		        header: '.header',
		        transition: {
		          duration: 0.2,
		          easing: 'cubic-bezier(0, 0.1, 0, 1)'
		        },
		        toggle:setDefault()
			});
		});
		
		YUI().use('aui-toggler', function(Y) {
			new Y.TogglerDelegate({	      
		        animated: true,
		        closeAllOnExpand: true,
		        container: '#caseAccTogglerPost',
		        content: '.content',
		        expanded: true,
		        header: '.header',
		        transition: {
		          duration: 0.2,
		          easing: 'cubic-bezier(0, 0.1, 0, 1)'
		        },
		        toggle:setDefault()
			});
		});
		
		YUI().use('aui-toggler', function(Y) {
			new Y.TogglerDelegate({	      
		        animated: true,
		        closeAllOnExpand: true,
		        container: '#caseAccTogglerCheck',
		        content: '.content',
		        expanded: true,
		        header: '.header',
		        transition: {
		          duration: 0.2,
		          easing: 'cubic-bezier(0, 0.1, 0, 1)'
		        },
		        toggle:setDefault()
			});
		});
		
		
		
			
		$(document).keypress(function(event) {
		    var keycode = (event.keyCode ? event.keyCode : event.which);
		    if (keycode == '13') {
		        $('#searchPolicyBtn').click();
		    }
		});
		
		
		$('#searchPolicyBtn').click(function(){
			//console.log('search');
			var policyNo=$('#txtPolicyNo').val();
			if(policyNo!=''){
				
				var policyYearsDetailsURL 	= corporatePolicyURLObj.getPolicyYears + policyNo;
				
				if(policyNo !="")
					{
				$.ajax({
					url:policyYearsDetailsURL,
					method:'POST',	
					async:false,
					success: function(res){
						
						if(res!=''){
							
						searchPolicy();
						var result = $.parseJSON(res);
						$("#"+ downloadPolicyURLObj.portletNamespace +"cust_fincyear").empty();
						var sel = $("#"+ downloadPolicyURLObj.portletNamespace +"cust_fincyear");
						 sel.append('<option value="0" selected="true">Select year</option>');
					    for (var i=0; i<result.length; i++) {
					      sel.append('<option value="' + result[i].id+ '">' + result[i].val+ '</option>');
					    }
						
						}else{
							$( ".errorDialog" ).html('<p>Please enter valid Policy No.</p>');
							$( ".errorDialog" ).dialog({
								title:"Error",
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
							$('#txtPolicyNo').focus()
						}
					}
					
				});
					}else
						{
						$( ".errorDialog" ).html('<p>Please enter valid Policy No.</p>');
						$( ".errorDialog" ).dialog({
							title:"Error",
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
					
						}
				
				
  			
			}else{
				$( ".errorDialog" ).html('<p>Please enter valid Policy No.</p>');
				$( ".errorDialog" ).dialog({
					title:"Error",
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
				
				
				$('#txtPolicyNo').focus();
			}
  		});
		
	
function searchPolicy(){

			
  			var searhPolicyTxt = $('#txtPolicyNo').val();    			
  			
  			$('.caseDecisionAcc').click();
      		if(sessionStorage.subMenu == 'FS'){ //open FS
      			$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateFundSwitch = "true";
      				        		        		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateFundSwitchContainer').show();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       		$('#corporatePolicyDetails').show();
	       		$('#corporateFundSwitchConfirm').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#fundSwitchTracker').hide();
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	       	
	       		
	       			$('#commentsDiv').show();
	       			$('#noteblock').hide();
	       			$('#acceptTermsAndConditions').empty();
	       			$('#fscorporateButttons').show();
	       			$('#fsserviceButttons').hide();
	       			$('#fundswitchhead').show();
	       			$('#fundSwitchNote').hide();
       		        $('#noteblock').hide();
       		 	fundSwitch.initWindow();
	       		fundSwitch.setUp();
       		
      		} else if(sessionStorage.subMenu == 'PR'){ //open PR
      			
      			$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporatePremiumRedirect = "true";
      			
	       		$('#corporateFundSwitchContainer').hide();
	       		$('#corporateTopUpContainer').hide();
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporatePremiumRedirectContainer').show();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       	
	       		$('#confirmPremiumRedirection').hide();
	       		$('#premiumRedirectTracker').hide(); 
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	    		$('#premiumRedirectionCon').show();
	       		$('#premiumcommentsDiv').show();
	       		$('#premiumredirecthead').show();
	       		$('#premiumredirectacceptterms').empty();
	       		$('#prcorporateButtons').show();
       			$('#prserviceButtons').hide();
	       		premiumRedirect.setUp();
	       		
      		} else if(sessionStorage.subMenu == 'TU'){ //open TopUp
      			//$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateTopUp = "true";
      			
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       		$('#corporateTopUpContainer').show();
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	           		$('#topUpItems').show();
	    		$('#profileTab').show();
	       		//topUp.initWindow();
	       		//topUp.setUp();
      		} else if(sessionStorage.subMenu == 'RN'){ //open Renewal Notice
      			//$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateRenewalNotice = "true";
      			
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();	       	
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       		$('#corporateRenewalNoticeContainer').show();
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	       		renewalNotice.initWindow();
	       		renewalNotice.setUp();
      		} 	else if(sessionStorage.subMenu == 'RPR'){ //open Renewal Premium Receipt
      			//$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateRenewalPremiumReceipt = "true";
      			
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();	       		
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').show();
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	       		renewalPremiumReceipt.initWindow();
	       		renewalPremiumReceipt.setUp();
      		} 	else if(sessionStorage.subMenu == 'AC'){ //Address Change
      			//$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateAddressChange = "true";
      		
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();	       		
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#userPolicyContainer').hide();
	       		$('#corporateAddressChangeContainer').show();	       			       	
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	    		$('#addresscommentsDiv').show();
	    		addressChange.initWindow();
				addressChange.setUp();
      		} 	
      		
      		else if(sessionStorage.subMenu == 'EP' || sessionStorage.subMenu == 'CP'){ //Address Change
      			//$('#lblAddrChangeStatus').hide();
      			sessionStorage.corporateAddressChange = "true";
      			if(sessionStorage.subMenu == 'EP'){
      				sessionStorage.coaParam = 'contact';
      				$('#communicationDiv').hide();
      				$('#permanentDiv').hide();
      				$('#occupationDiv').hide();
      				$('#personalDiv').hide();
      				
      				$('#contactDiv').show();
      				
      			} else {
      				sessionStorage.coaParam = 'personal'; 
      				$('#communicationDiv').hide();
      				$('#permanentDiv').hide();
      				$('#occupationDiv').hide();
      				$('#personalDiv').show();
      				$('#contactDiv').hide();
      		
      			}
      			$('#userPolicyContainer').hide();
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();	       		
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporateMyProfileContainer').show();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#addresscommentsDiv').show();
	       		$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
	       		addressChange.initWindow();
				addressChange.setUp();
      		} 	else if(sessionStorage.subMenu == 'UPT'){ //Download Policy
      			
      			$('#queuetab').hide();
	    		$('#grouptab').hide();
	    		$('#profileTab').show();
      		
	       		$('#corporateFundSwitchContainer').hide();       		
	       		$('#corporatePremiumRedirectContainer').hide();
	       		$('#corporateTopUpContainer').hide();	       		
	       		$('#corporateRenewalNoticeContainer').hide();
	       		$('#corporateRenewalPremiumReceiptContainer').hide();
	       		$('#corporateMyProfileContainer').hide();
	       		$('#corporateAddressChangeContainer').hide();
	       		$('#userPolicyContainer').show();
	       	$('#<portlet:namespace/>cust_policynum').empty();
	       
	       	
	       	var sel = $("#<portlet:namespace/>cust_policynum");
			
	        sel.append('<option value="0">Select Policy Number</option>');
		      sel.append('<option value="' +$('#txtPolicyNo').val()+ '">' + $('#txtPolicyNo').val()+ '</option>');
		      $('#<portlet:namespace/>cust_policynum').val($('#txtPolicyNo').val());
      		} 	
      		
      		sessionStorage.corporateDownloadPolicy ='true';
      		downloadpolicy.initWindow();
      		downloadpolicy.setUp();
   		}
	});
	

	
});		
</script>
