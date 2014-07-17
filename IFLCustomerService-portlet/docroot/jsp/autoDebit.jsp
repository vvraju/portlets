<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

<script src="/IFLService-theme/js/js-dev/payment.js"></script>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<!-- Auto Debit Code Start Here-->
	
	<!-- <div style="width: 100%; height: 450px;">

		<div class="row-fluid" style=""> -->
		
			<div class="span5 topuptilesrgt" style="height: 450px;">

				<div class="row-fluid" style="float: left;">
					
					<div class="span6 topupsquare" style="margin-left:0px;float: left">


						<div>

							<div class="payleft leftsubmenu2 leftsubmenuimg" style="background-color:#FF9C9C;;position:relative;" id="sDiv1">
								
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.standing.instruction" />" style="padding-top:48px;"/>
								
								<span style="text-align:left;display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;bottom:15px;left:15px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction" /></span>
							
							</div>


						</div>
						
						<!-- Calling mouse over -->
						
						<div class="payleftclr leftsubmenu2" style="background-color:#ffffff;position:relative;display: none;cursor: pointer;" id="sDiv1clr">
								
								<span style="position:absolute;right:15px;top:15px;">
								<img src="/IFLService-theme/images/services_images/standing-Instr_c_services.png"/></span>
								
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;">Standing Instruction</span>
							
							<span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							</div>


					</div>

					
					<div class="span6" style="margin-left:0px;float: left">

				

						<div>
							<div class="payleft leftsubmenu2 leftsubmenuimg" style="background-color: #FFDCDC;position:relative;" id="eDiv2">
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.ecs" />"><br>
								<span style="text-align:left;display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;bottom:15px;left:15px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.services.ecs" /></span>
							</div>

                       </div>
						<!-- Calling mouse over -->

                            <div class="payleftclr leftsubmenu2" style="background-color: #ffffff;position:relative;display: none;cursor: pointer;" id="eDiv2clr">
                            <span style="position:absolute;right:15px;top:15px;">
								<img src="/IFLService-theme/images/services_images/ECS_c_services.png"></span>
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;">ECS Electronic <br/>Clearing Services</span>
							<span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							</div>


					</div>
				</div>
				<div class="row-fluid" style=" float: left;">
					<div class="span6 topupsquare" style="margin-left:0px;float: left">

						<div>

							<div class="payleft leftsubmenu3 leftsubmenuimg" style="background-color: #FFDCDC;position: relative;" id="dDiv3">
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.derectdebit" />"><br>
								<span style="text-align:left;  display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;bottom:15px;left:15px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.services.derectdebit" /></span>
							</div>


						</div>
						<!-- Calling mouse over -->
						
						<div class="payleftclr leftsubmenu3" style="background-color: #ffffff;position: relative;display: none;cursor: pointer;" id="dDiv3clr">
						<span style="position:absolute;right:15px;top:15px;">
								<img src="/IFLService-theme/images/services_images/directdebit_c_services.png"></span>
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;">Direct Debit</span>
							<span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							</div>


					</div>
					<div class="span6 rightimg topupsquare" style="margin-left:0px;float: left">


						

							<div class="leftsubmenu2">
								<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.imagebox" />">
							</div>


						




					</div>
				</div>



			</div>

			
			
			
			<div class="span7 leftsidedrop touptileright" style="height: 450px;" id="sInrDiv">

				<div style="color: #0AA8F2;">
					
				<span style="color:#FF9C9C;font:16px/18px arial;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.sub.standing.instruction" /></span>
					
					
					<p class="default-p"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.description" /></p>
					<%-- <p>
						<span class="paybyphonelink"><a
							href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" />  </a>  <liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.todownload" /></span>
					</p> --%>
				</div>




			</div>
			
			<div class="span7 leftsidedrop touptileright"
				style="height: 450px; display: none;" id="eInrDiv">

				<div style="color: #FF9C9C;">
					<h4>ECS Electronic Clearing Services</h4>
				</div>


				<p class="default-p">Description about ECS Given by the
					IndiaFirst Life insurance In Mumbai for Rapid.Description about ECS
					Given by the IndiaFirst Life insurance In Mumbai for Rapid.
					Description about ECS Given by the IndiaFirst Life insurance In
					Mumbai for Rapid.Description about ECS Given by the IndiaFirst Life
					insurance In Mumbai for Rapid. Description about ECS Given by the
					IndiaFirst Life insurance In Mumbai for Rapid. Description about
					ECS Given by the IndiaFirst Life insurance In Mumbai for
					Rapid.Description about ECS Given by the IndiaFirst Life insurance
					In Mumbai for Rapid. Description about ECS Given by the IndiaFirst
					Life insurance In Mumbai for Rapid.</p>
				<!-- <div class="row" style="padding-bottom: 30px;">
						<div class="col-md-10">
							<span class="paybyphonelink"><a href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><spring:message code="rapid.payment.ecs.chere" /></a> 
							<spring:message code="rapid.payment.ecs.cheretext" /></span>
						</div>
					</div> -->
			</div>

			<div class="span7 leftsidedrop touptileright"
				style="height: 450px; display: none;" id="dInrDiv">

				<div style="color: #FF9C9C;">
					<h4>Direct Debit</h4>
				</div>

				<p class="default-p">Description about Direct Debit Given by the
					IndiaFirst Life insurance In Mumbai for Rapid.Description about
					Direct Debit Given by the IndiaFirst Life insurance In Mumbai for
					Rapid. Description about Direct Debit Given by the IndiaFirst Life
					insurance In Mumbai for Rapid. Description about Direct Debit Given
					by the IndiaFirst Life insurance In Mumbai for Rapid. Description
					about Direct Debit Given by the IndiaFirst Life insurance In Mumbai
					for Rapid. Description about Direct Debit Given by the IndiaFirst
					Life insurance In Mumbai for Rapid. Description about Direct Debit
					Given by the IndiaFirst Life insurance In Mumbai for Rapid.
					Description about Direct Debit Given by the IndiaFirst Life
					insurance In Mumbai for Rapid.</p>


			</div>


		<!-- </div>
	</div> -->

<!-- Auto Debit Code End Here-->

<script>
	$(function() {
	
		/* $("#eDiv2clr").click(function() {
			$("#eInrDiv").show();
			$("#sInrDiv").hide();
			$("#Div3clr").hide();
		});
		$("#sDiv1clr").click(function() {
			$("#sInrDiv").show();
			$("#eInrDiv").hide();
			$("#dInrDiv").hide();
		});

		$("#dDiv3clr").click(function() {
			$("#dInrDiv").show();
			$("#ecsInrDiv").hide();
			$("#siInrDiv").hide();
		}); */
	
});

</script>