<%@ include file="/jsp/init.jsp" %>
<portlet:resourceURL var="getDataURL">

</portlet:resourceURL>


<portlet:renderURL var="topupOnlinePaymentOptions">
	<portlet:param name="action" value="topupOnlinePaymentOptions" />
</portlet:renderURL>
<script src="/IFLService-theme/js/js-dev/payment.js"></script>
<script>
	sessionStorage.customerId = 1;
</script>

<div
	style="width: 100%; float: left; border-top: 0px solid #CCCCCC; border-bottom: 0px solid #CCCCCC; position: relative;margin-top:-10px;border-top:opx !important;">
	<!-- leftsidebar style start from here -->

	<div class="b-content" style="display:none;">
		<div class="row-fluid">
			<div class="span12 other-recommended">
				<div class="span3 routesheading"
					style="height: 100px !important; background-color: #d2d3d5;">
					<span
						style="vertical-align: middle; color: #ffffff; display: block; text-align: center; padding-top: 0px; font-size: 32px;"><liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.payment" /></span>
					<span
						style="vertical-align: middle; color: #ffffff; display: block; text-align: center; padding-top: 10px; font-size: 18px;"><liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.options" /></span>
				</div>

				<div class="visible-desktop"
					style="float: left; padding: 6px 25px 6px 0; background-color: #fff;">
					<img alt="arrow"
						src="<liferay-ui:message key="services.home.image.sidearrow" />" />
				</div>

				<div class="span8 routesheading routesheadingIE"
					style="width: 75%; height: 100px !important; text-align: left; padding-left: 2px; margin: 0; padding-top: 10px; color: #7a7f92; font: 12px arial; overflow: hidden;">
					<p>
						<liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.payment.description" />
					</p>
				</div>
			</div>
		</div>
	</div>

	<div class="clr"></div>



	<div style="width: 100%;">
		<div class="b-content top-other-recommended" id="landingPage">
			<!-- <div style="width:100%;height:auto;"> -->
			<!-- slider images and heading start from here -->
			<div class="row-fluid">
				<!-- span10 -->
				<div class="span8 services-offered">
					<div class="row-fluid">
						<div class="clsPaymentOptionsDyanmicDELTE"></div>
						<div class="clsPaymentOptionsDyanmicMain" style="display:none;">
						<h6 style="color:#26b6f3;padding-left:15px;">Select Method Of Payment</h6>
						<div class="clsPaymentOptionsDyanmic span12" >
							</div>
					</div></div>
				</div>

				<div class="span4 payrightblockcontainer" 
					style="height: 390px; margin: 0;display: none;">
					<div class="sliderImages span12" id="Home_CE1">
						<div class="slider-wrap">
							<div class="slider4">
								<img
									src="<liferay-ui:message key="services.home.slider.image.health" />" />
							</div>
						</div>
					</div>

					<div class="slider1" id="slider1_container"
						style="position: relative; height: 400px; overflow: hidden;">
						<!-- Loading Screen -->
						<div style="position: absolute; top: 0px; left: 0px;" u="loading">
							<div
								style="filter: alpha(opacity = 70); opacity: 0.7; position: absolute; display: block; background-color: #000; top: 0px; left: 0px; width: 100%; height: 100%;">&nbsp;</div>
							<div
								style="position: absolute; display: block; background: url(img/loading.gif) no-repeat center center; top: 0px; left: 0px; width: 100%; height: 100%;">&nbsp;</div>
						</div>

						<!-- Slides Container -->

						<div id="sliderimagesdiv">
							<div class="span4" id="slidestyle"
								style="position: absolute; width: 530px; height: 390px; top: 0px; left: 0px; overflow: hidden;"
								u="slides">
								<div>
									<img
										src="<liferay-ui:message key="services.home.slider.image.happy" />"
										u="image" class="sliderimges" />
								</div>

								<div>
									<img
										src="<liferay-ui:message key="services.home.slider.image.health" />"
										u="image" class="sliderimges" />
								</div>

								<div>
									<img
										src="<liferay-ui:message key="services.home.slider.image.security" />"
										u="image" class="sliderimges" />
								</div>

								<div>
									<img
										src="<liferay-ui:message key="services.home.slider.image.savngs" />"
										u="image" class="sliderimges" />
								</div>

								<div>
									<img
										src="<liferay-ui:message key="services.home.slider.image.wealth" />"
										u="image" class="sliderimges" />
								</div>
							</div>
						</div>

						<div>
							<img id="Home_CE1"
								src="<liferay-ui:message key="services.home.slider.image.happy" />"
								style="position: absolute; height: 390px; top: 0px; left: 0px; overflow: hidden; display: none" />
						</div>

						<div>
							<img id="Home_CE1"
								src="<liferay-ui:message key="services.home.slider.image.health" />"
								style="position: absolute; height: 390px; top: 0px; left: 0px; overflow: hidden; display: none" />
						</div>

						<div>
							<img id="Home_CE2"
								src="<liferay-ui:message key="services.home.slider.image.security" />"
								style="position: absolute; height: 390px; top: 0px; left: 0px; overflow: hidden; display: none" />
						</div>

						<div>
							<img id="Home_CE3"
								src="<liferay-ui:message key="services.home.slider.image.savngs" />"
								style="position: absolute; height: 390px; top: 0px; left: 0px; overflow: hidden; display: none" />
						</div>

						<div>
							<img id="Home_CE4"
								src="<liferay-ui:message key="services.home.slider.image.wealth" />"
								style="position: absolute; height: 390px; top: 0px; left: 0px; overflow: hidden; display: none" />
						</div>
						<!-- Navigator Skin Begin -->

						<div class="slider1-N"
							style="position: absolute; bottom: 4px; right: 6px;"
							u="navigator">
							<div
								style="POSITION: absolute; WIDTH: 22px; HEIGHT: 22px; text-align: center; line-height: 22px; color: White; font-size: 14px;"
								u="prototype">
								<numbertemplate></numbertemplate>
							</div>
						</div>
						<!-- Navigator Skin End -->
						<!-- DirectionNavigator Skin Begin -->
						<!-- Arrow Left -->
						<!-- Arrow Right -->
						<!-- DirectionNavigator Skin End -->
						<a href="http://www.jssor.com" style="display: none">Slider
							jQuery</a>
						<!-- overlaid color images of the same as above -->
					</div>

					<div class="clr">&nbsp;</div>
					<!-- Jssor Slider End -->
				</div>
			</div>
		</div>
	</div>
</div>

<div style="clear: both;"></div>
<script>
	AUI()
			.ready(
					function(A) {

						$('.clsPaymentOptionsDyanmic')
								.on(
										'click',
										'.paymentOptionsCont',
										function() {
											//console.log("getPaymentOptionTypes");
											//alert($(this).attr('rel'));
											$('.topUpPaymentOptionStep2').hide();
											$('.clsPaymentOptionsDyanmicMain').show();
											$('#landingPage').show();
											$('.topUpPaymentOption').hide();
											$("#payByPhone").hide();
											$("#autoDebit").hide();
											$("#dropBox").hide();
											$("#cashorCheckPickup").hide();

											$(".paymentclrimg").each(function() {
												
												$(this).attr("src","/IFLService-theme/images/services_images/"+$(this).attr('title')+".png");
												
											  });
											$(this).find("img").attr('src','/IFLService-theme/images/services_images/'+$(this).find("img").attr('title')+'_clr.png');
											
											if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.OP') {
												
												 topUp
														.getPaymentOptionTypes(this);
												 $('.topUpPaymentOption').show();
												getPaymentModes();
											} else if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.PBP') {
												$("#payByPhone").show();
												
												
											} else if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.AD') {
												$("#autoDebit").show();
												
											} else if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.POC') {
												$("#postorCourier").show();
												
											} else if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.CCP') {

												$("#cashorCheckPickup").show();
												
											} else if ($(this).attr('rel') == 'RAPID.PAYMENTOPTION.DB') {
												$("#dropBox").show();
												

											} else {
												//$( ".errorDialog" ).html('<p>Under Development</p>');
												$(".errorDialog")
														.dialog(
																{
																	title : "Top Up - Payment Options",
																	width : 'auto',
																	modal : true,
																	buttons : [ {
																		text : "OK",
																		width : 'auto',
																		click : function() {
																			$(
																					this)
																					.dialog(
																							"close");
																		}
																	} ]
																});
											}
										});
						

						function getPaymentModes(){
						
							$.ajax({
								url:topUpURLObj.getPaymentModes,
								method:'POST',
								async:false,
								success: function(res){
									var result = $.parseJSON(res);
									var tempHtml = '';
									
									for(var i=0;i<result.length;i++){				
										tempHtml += '<input name="topUpRadioCardType" type="radio"  label="" rel="'+ result[i]._PaymentMethodKey +'"  value="'+ result[i]._PaymentMethodID +'"/><label>'+ result[i]._PaymentMethodKey +'</label>';
									}
									$('.paymentModes').html(tempHtml);			
								//	$('.topUpPaymentOptionStep1').hide();
								$('.topupPaymentCont').show();
									$('.topUpPaymentOptionStep2').show();
									$('.topupOnlinePaymentOptionsCont').show();
									$("input[name=topUpRadioCardType]:radio").change(function () {
										getPaymentModeTypes($(this).val(),$(this).attr('rel'));
									});
									
								},
								error: function(errObj){
								}
							});
							
						}
						
						
					
					});
	
	
</script>

<!-- Auto Debit Code Start Here-->
<div class="b-content" style="display: none;" id="autoDebit">

	<div style="width: 100%; height: 450px;">

		<div class="row-fluid" style="">

			<div class="span5 topuptilesrgt" style="height: 450px;">

				<div class="row-fluid" style="width: 100%; float: left;">

					<div class="span6 topupsquare"
						style="margin-left: 0px; float: left">


						<div>

							<div class="payleft leftsubmenu2 leftsubmenuimg"
								style="background-color: #83c8e5; position: relative;" id="Div1">

								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.standing.instruction" />"
									style="padding-top: 48px;" /> <span
									style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
										key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction" /></span>

							</div>


						</div>

						<!-- Calling mouse over -->

						<div class="payleftclr leftsubmenu2"
							style="background-color: #ffffff; position: relative; display: none;"
							id="Div1clr">

							<span style="position: absolute; right: 15px; top: 15px;">
								<img
								src="/IFLService-theme/images/services_images/standing-Instr_c_services.png" />
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">Standing
								Instruction</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>
						</div>


					</div>


					<div class="span6" style="margin-left: 0px; float: left">



						<div>
							<div class="payleft leftsubmenu2 leftsubmenuimg"
								style="background-color: #B9E6F9; position: relative;" id="Div2">
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.ecs" />"><br>
								<span
									style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
										key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.services.ecs" /></span>
							</div>

						</div>
						<!-- Calling mouse over -->

						<div class="payleftclr leftsubmenu2"
							style="background-color: #ffffff; position: relative; display: none"
							id="Div2clr">
							<span style="position: absolute; right: 15px; top: 15px;">
								<img
								src="/IFLService-theme/images/services_images/ECS_c_services.png">
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">ECS
								Electronic <br />Clearing Services
							</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>
						</div>


					</div>
				</div>
				<div class="row-fluid" style="float: left;">
					<div class="span6 topupsquare"
						style="margin-left: 0px; float: left">

						<div>

							<div class="payleft leftsubmenu3 leftsubmenuimg"
								style="background-color: #B9E6F9; position: relative;" id="Div3">
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.derectdebit" />"><br>
								<span
									style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
										key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.services.derectdebit" /></span>
							</div>


						</div>
						<!-- Calling mouse over -->

						<div class="payleftclr leftsubmenu3"
							style="background-color: #ffffff; position: relative;display: none;"
							id="Div3clr">
							<span style="position: absolute; right: 15px; top: 15px;">
								<img
								src="/IFLService-theme/images/services_images/directdebit_c_services.png">
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">Direct
								Debit</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>
						</div>


					</div>
					<div class="span6 rightimg topupsquare"
						style="margin-left: 0px; float: left">




						<div class="leftsubmenu2">
							<img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.imagebox" />">
						</div>







					</div>
				</div>



			</div>




			<div class="span7 leftsidedrop touptileright" style="height: 450px;"
				id="siInrDiv">

				<div style="color: #0AA8F2;">
					<h4>
						<liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.sub.standing.instruction" />
					</h4>
					<p class="default-p">
						<liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.description" />
					</p>
					<p>
						<%-- <span class="paybyphonelink"><a
							href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" />
						</a> <liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.todownload" /></span> --%>
					</p>
				</div>

			</div>

			<div class="span7 leftsidedrop touptileright"
				style="height: 450px; display: none;" id="ecsInrDiv">

				<div style="color: #0AA8F2;">
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
				style="height: 450px; display: none;" id="dbInrDiv">

				<div style="color: #0AA8F2;">
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




		</div>
	</div>
</div>

	<!-- Auto Debit Code End Here-->

	<!-- Drop Box Code Start Here-->

	<div class="b-content" style="display: none;" id="dropBox">
		<div style="width: 100%; height: 450px;">
			<div class="row-fluid" style="">
				<div class="span5 topuptilesrgt" style="height: 450px;">

					<div class="row-fluid" style="float: left;">
						<div class="span6 topupsquare"
							style="margin-left: 0px; float: left;">

							<div>

								<div class="payleft leftsubmenu2 leftsubmenuimg"
									style="background-color: #83c8e5; position: relative;"
									id="Div4">
									<img
										src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.dropbox" />"><br>
									<span
										style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
											key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.indiafirst" /></span>
								</div>


							</div>
							<!-- Calling mouse over -->

							<div class="payleftclr leftsubmenu2"
								style="background-color: #ffffff; position: relative; display: none;"
								id="Div4clr">
								<span style="position: absolute; right: 15px; top: 15px;">
									<img
									src="/IFLService-theme/images/services_images/dropboxIFL_c_services.png">
								</span> <span
									style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">IndiaFirst
									Life</span> <span
									style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
									Ipsum is simply dummy text of the printing and typesetting
									industry</span>
							</div>

						</div>



						<div class="span6 topupsquare"
							style="margin-left: 0px; float: left">

							<div>
								<div class="payleft leftsubmenu2 leftsubmenuimg"
									style="background-color: #B9E6F9; position: relative;"
									id="Div5">
									<img
										src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.dropbox.dropboxbob" />"><br>
									<span
										style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
											key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.bankofbaroda" /></span>
								</div>

							</div>
							<!-- Calling mouse over -->

							<div class="payleftclr leftsubmenu2"
								style="background-color: #ffffff; position: relative; display: none;"
								id="Div5clr">
								<span style="position: absolute; right: 15px; top: 15px;">
									<img
									src="/IFLService-theme/images/services_images/dropboxbob_c_services.png">
								</span> <span
									style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">Bank
									of Baroda</span> <span
									style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
									Ipsum is simply dummy text of the printing and typesetting
									industry</span>
							</div>

						</div>
					</div>

					<div class="row-fluid" style="float: left;">
						<div class="span6 topupsquare"
							style="margin-left: 0px; float: left;">

							<div>

								<div class="payleft leftsubmenu3 leftsubmenuimg"
									style="background-color: #B9E6F9; position: relative;"
									id="Div6">
									<img
										src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.ab" />"><br>
									<span
										style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
											key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.andhrabank" /></span>
								</div>


							</div>

							<!-- Calling mouse over -->
							<div class="payleftclr leftsubmenu3"
								style="background-color: #ffffff; position: relative; display: none;"
								id="Div6clr">
								<span style="position: absolute; right: 15px; top: 15px;">
									<img
									src="/IFLService-theme/images/services_images/dropboxAB_c_services.png">
								</span> <span
									style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">Andhra
									Bank</span> <span
									style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
									Ipsum is simply dummy text of the printing and typesetting
									industry</span>
							</div>

						</div>
						<div class="span6 rightimg topupsquare"
							style="margin-left: 0px; float: left;">

							<div class="leftsubmenu2">


								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.imagebox" />">



							</div>

						</div>
					</div>

				</div>

				<div class="span7 leftsidedrop touptileright" style="height: 450px;"
					id="iflInrDiv">


					<div class="row-fluid">
						<div style="color: #0AA8F2;">
							<h4>
								<liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.indiafirst" />
							</h4>
							<p class="default-p">
								<liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.indiafirstlife.description" />
							</p>
							<%-- <span class="paybyphonelink"><a href="" target="_blank"
								style="outline: none;"><liferay-ui:message
										key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" /></a>
								<liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.indiafirstlife.tolocate.ifl" /></span> --%>
						</div>

					</div>

				</div>


				<div class="span7 leftsidedrop touptileright"
					style="height: 450px; display: none;" id="bobInrDiv">

					<div class="row-fluid">
						<div style="color: #0AA8F2;">
							<h4>Bank of Baroda</h4>

							<p class="default-p">Description about BOB Given by the
								IndiaFirst Life insurance In Mumbai for Rapid.Description about
								BOB Given by the IndiaFirst Life insurance In Mumbai for Rapid.
								Description about BOB Given by the IndiaFirst Life insurance In
								Mumbai for Rapid.Description about BOB Given by the IndiaFirst
								Life insurance In Mumbai for Rapid. Description about BOB Given
								by the IndiaFirst Life insurance In Mumbai for Rapid.
								Description about BOB Given by the IndiaFirst Life insurance In
								Mumbai for Rapid.Description about BOB Given by the IndiaFirst
								Life insurance In Mumbai for Rapid. Description about BOB Given
								by the IndiaFirst Life insurance In Mumbai for Rapid.</p>

						</div>


					</div>

				</div>


				<div class="span7 leftsidedrop touptileright"
					style="height: 450px; display: none;" id="anbInrDiv">

					<div class="row-fluid">
						<div style="color: #0AA8F2;">
							<h4>Andhra Bank</h4>

							<p class="default-p">Description about Andhra Bank Given by
								the IndiaFirst Life insurance In Mumbai for Rapid.Description
								about Direct Debit Given by the IndiaFirst Life insurance In
								Mumbai for Rapid. Description about Andhra Bank Given by the
								IndiaFirst Life insurance In Mumbai for Rapid. Description about
								Direct Debit Given by the IndiaFirst Life insurance In Mumbai
								for Rapid. Description about Andhra Bank Given by the IndiaFirst
								Life insurance In Mumbai for Rapid. Description about Direct
								Debit Given by the IndiaFirst Life insurance In Mumbai for
								Rapid. Description about Andhra Bank Given by the IndiaFirst
								Life insurance In Mumbai for Rapid. Description about Direct
								Debit Given by the IndiaFirst Life insurance In Mumbai for
								Rapid.</p>

						</div>


					</div>

				</div>

			</div>
		</div>
	</div>

	<!-- Drop Box Code End Here-->



	<!-- Post or Courier Start Here-->
	<div class="row-fluid" style="display: none;" id="postorCourier">
		<div class="span12">
			<div class="row-fluid">
				<div class="span5 rightimg courierimg" style="float: left;">

					<div>


						<img
							src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.slider.sliderimage1" />"><br>



					</div>

				</div>



				<div class="span7 leftsidedrop" style="float: left;">
					<div style="color: #0AA8F2;">
						<h4>
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.post.address" />
						</h4>
					</div>

					<div class="paybyphonetext">
						<p>
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.post.address.ifl.mumbai" />
						<p>
					</div>

					<div class="">
						<span class="paybyphonelink"><a href="" target="_blank"
							style="outline: none; color: #0AA8F2;"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" /></a>
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.tolocate.post.courier" />"
						</span>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Post or Courier End Here-->



	<!-- Cash or Check Picukup Start Here-->
	<div class="row-fluid" style="display: none; border-top: 1px solid #CCCCCC;" id="cashorCheckPickup">

		<div class="span12" style="height: 450px;">
			<div class="row-fluid">
				<div class="span5 rightimg courierimg" style="float: left;margin-left: 26px;">
					<div>



						<img
							src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.slider.sliderimage1" />"><br>



					</div>

				</div>
				<div class="span7 leftsidedrop" style="float: left;">

					<div class="row-fluid" style="height: 353px;">
						<div style="color: #0AA8F2;">
							<h4>
								<liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.cash.or.check.pickup" />
							</h4>
						</div>
						<p>
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.payment.types.description" />
						</p>
						<div class="row-fluid cash">
							<label class="span5" style="display: inline;"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.policy.or.application.number" />
							</label> <input type="text" name="policynumber" maxlength="15"
								minlength="5" required />
						</div>
						<div class="row-fluid cash">
							<label class="span5" style="display: inline;"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.dob.lifeassured" />
								<span class="required">*</span> </label> <input type="text"
								class="form-control" id="checkdate" name="dateVal" required
								value="" readonly="readonly"> <img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.calender.image" />"
								class="imagecalendar" id="cdob" />


						</div>
						<div class="row-fluid" align="center">
							<input type="submit" id="submitdetailsval" value="Submit"
								class="btn" />
						</div>
					</div>

					<div class="span12">
						<div class="payfootermenu" id="footenter">
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.enterdetails" />
						</div>
						<div class="payfootermenu" id="footconfirm">
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.fix.date.time" />
						</div>
						<div class="payfootermenu payfootermenu_noimg" id="footpay">
							<liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.view.confirmation.pay" />
						</div>
					</div>

				</div>


			</div>


		</div>
	</div>


<!-- Cash or Check Picukup End Here-->



<!-- PayByPhone Start Here-->
<div class="b-content" style="">
	<div class="row-fluid" style="display: none; border-top: 1px solid #CCCCCC;" id="payByPhone">
		<div class="span5 topuptilesrgt" style="height: 450px;">

			<div class="row-fluid" style="float: left;">
				<div class="span6 topupsquare innerDiv"
					style="margin-left: 0px; float: left;" id="Div1">

					<div>

						<div class="payleft  leftsubmenu2 leftsubmenuimg"
							style="background-color: #83c8e5; position: relative;" id="Div7">

							<img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.ivr" />"><br>

							<span
								style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; left: 15px; bottom: 15px;"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response" /></span>
						</div>


					</div>
					<!-- calling on mouseover -->
					<div>

						<div class="payleftclr  leftsubmenu2"
							style="display: none; position: relative;" id="Div7clr">
							<span style="position: absolute; right: 15px; top: 15px;">

								<img
								src="/IFLService-theme/images/services_images/IVR_c_services.png">
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">IVR
								mouseover<br />Voice Response
							</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>



						</div>


					</div>

				</div>
				<div class="span6 topupsquare"
					style="margin-left: 0px; float: left;">

					<div>
						<div class="payleft  leftsubmenu2 leftsubmenuimg"
							style="background-color: #B9E6F9; position: relative;" id="Div8">

							<img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.imps" />"><br>

							<span
								style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;">
								<liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.imps.mobile" />
							</span>

						</div>

					</div>

					<!-- calling on mouse over -->


					<div>
						<div class="payleftclr  leftsubmenu2"
							style="display: none; position: relative; border-right: 1px solid #ccc;"
							id="Div8clr">
							<span style="position: absolute; right: 15px; top: 15px;">
								<img
								src="/IFLService-theme/images/services_images/IMPS_c_services.png">
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">IMPS
								- <br />(testing Payment)
							</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>

						</div>

					</div>

				</div>
			</div>

			<div class="row-fluid" style="float: left; position: relative;">
				<div class=" span6 topupsquare"
					style="margin-left: 0px; float: left;">

					<div>

						<div class="payleft leftsubmenu3 leftsubmenuimg"
							style="background-color: #B9E6F9;" id="Div9">
							<img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.mobile.application" />"><br>
							<span
								style="text-align: left; display: block; color: #ffffff; font-size: 16px; font-family: arial; position: absolute; bottom: 15px; left: 15px;"><liferay-ui:message
									key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.mobile.application" /></span>
						</div>


					</div>
					<!-- calling on mouuse over -->
					<div>

						<div class="payleftclr leftsubmenu3"
							style="display: none; position: relative;" id="Div9clr">
							<span style="position: absolute; right: 15px; top: 15px;">
								<img
								src="/IFLService-theme/images/services_images/mobile_app_c_services.png">
							</span> <span
								style="position: absolute; left: 15px; top: 15px; color: #83c8e5; font-size: 16px; font-family: arial; text-align: left;">IMPS
								- <br />Mobile Payment
							</span> <span
								style="position: absolute; top: 65px; left: 15px; padding-right: 10px; font: 12px/18px arial; color: #666; text-align: left;">Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry</span>
						</div>

					</div>
				</div>
				<div class="span6 rightimg topupsquare"
					style="margin-left: 0px; float: left;">

					<div>

						<div class="leftsubmenu2">
							<img
								src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.imagebox" />" class="lastimg">
						</div>


					</div>

				</div>
			</div>

		</div>

		<!-- IVR DIV Starts -->
		<div class="span7 leftsidedrop touptileright"
			style="height: 450px; display: block;" id="ivrInrDiv">


			<div class="row-fluid">
				<div style="color: #0AA8F2;">
					<h4>
						<liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response.sub" />
					</h4>
				</div>
				<p class="default-p">
					<liferay-ui:message
						key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response.sub.description" />
				</p>
			</div>
			<div class="row-fluid" style="padding: 10px 0;">
				<div class="" style="padding-bottom: 20px">
					<%-- <span class="paybyphonelink"><a
						href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><liferay-ui:message
								key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" />
					</a> <liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.toknow.process" /></span> --%>
				</div>
				<div class="row-fluid">
					<label class="control-label"><liferay-ui:message
							key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.phone.for.callback" /><span
						class="required">*</span> </label> <input name="mobilenumber"
						class="form-control" maxlength="10" required number="true"
						value="" />

				</div>

			</div>
			<div class="row-fluid">
				<input type="submit" value="Submit" id="submitVal"
					class="btn center-block" />
			</div>

		</div>

		<!-- IVR Div END Here  -->

		<!-- IMPS  Div START Here  -->
		<div class="span7 leftsidedrop touptileright"
			style="height: 450px; display: none;" id="impsInrDiv">

			<div class="row-fluid">
				<div style="color: #0AA8F2;">
					<h4>IMPS - (Mobile Payment)</h4>
				</div>
			</div>

			<p class="default-p">You can now pay your premium through our
				Interactive Voice Response System available 24x7.</p>
			<p>Our customer care executive are trained in various languages.</p>
			<p>This service also provides round the clock information on your
				due date payment status, premium status, NAV etc..</p>

			<div class="row-fluid">
				<input type="button" value="Proceed" class="btn center-block" />
			</div>

		</div>
		<!-- IMPS  Div END Here  -->
		<!-- Mobile Application DIV Starts -->
		<div class="span7 leftsidedrop touptileright"
			style="height: 450px; display: none;" id="mobieInrDiv">

			<div class="row-fluid">
				<div style="color: #0AA8F2;">
					<h4>Mobile Application</h4>
				</div>
			</div>

			<p class="default-p">Mobile Application Related Data By India
				First LifeInsurance Company lmtd Mobile Application Related Data By
				India First LifeInsurance Company lmtd Mobile Application Related
				Data By India First LifeInsurance Company lmtd Mobile Application
				Related Data By India First LifeInsurance Company lmtd Mobile
				Application Related Data By India First LifeInsurance Company
				lmtdMobile Application Related Data By India First LifeInsurance
				Company lmtd Mobile Application Related Data By India First
				LifeInsurance Company lmtdMobile Application Related Data By India
				First LifeInsurance Company lmtd Mobile Application Related Data By
				India First LifeInsurance Company lmtdMobile Application Related
				Data By India First LifeInsurance Company lmtd.
			<p>


				<!-- <div class="row" style="padding-bottom: 30px;">
				<div class="col-md-10">
					<span class="paybyphonelink"><a
						href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><spring:message
								code="rapid.payment.chere" /></a> <spring:message
							code="rapid.payment.chere.text" /></span>
				</div>
			</div> -->
		</div>
		<!-- Mobile Application DIV Starts -->

	</div>
</div>







<script>
	$(function() {
		$("#Div7clr").click(function() {
			$("#ivrInrDiv").show();
			$("#impsInrDiv").hide();
			$("#mobieInrDiv").hide();
		});
		$("#Div8clr").click(function() {
			$("#impsInrDiv").show();
			$("#ivrInrDiv").hide();
			$("#mobieInrDiv").hide();
		});

		$("#Div9clr").click(function() {
			$("#mobieInrDiv").show();
			$("#ivrInrDiv").hide();
			$("#impsInrDiv").hide();
		});

		$("#Div2clr").click(function() {
			$("#ecsInrDiv").show();
			$("#siInrDiv").hide();
			$("#Div3clr").hide();
		});
		$("#Div1clr").click(function() {
			$("#siInrDiv").show();
			$("#ecsInrDiv").hide();
			$("#dbInrDiv").hide();
		});

		$("#Div3clr").click(function() {
			$("#dbInrDiv").show();
			$("#ecsInrDiv").hide();
			$("#siInrDiv").hide();
		});

		$("#Div4clr").click(function() {
			$("#iflInrDiv").show();
			$("#bobInrDiv").hide();
			$("#anbInrDiv").hide();

		});

		$("#Div5clr").click(function() {
			$("#iflInrDiv").hide();
			$("#bobInrDiv").show();
			$("#anbInrDiv").hide();
		});

		$("#Div6clr").click(function() {
			$("#iflInrDiv").hide();
			$("#bobInrDiv").hide();
			$("#anbInrDiv").show();
		});

	});
</script>

