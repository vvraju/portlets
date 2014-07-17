<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />


<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<!-- PayByPhone Start Here-->
	<div class="span5 topuptilesrgt" style="height: 450px;">

				<div class="row-fluid" style=" float: left;">
					<div class="span6 topupsquare" style="margin-left:0px; float: left;" >

						<div>

							<div class="payleft  leftsubmenu2 leftsubmenuimg"
								style="background-color:  #FF9C9C;;position: relative;" id="Div7">
							
								<img
									src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.ivr" />"><br>
								
								<span style="text-align:left;display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;left:15px;bottom:15px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response" /></span>
							</div>


						</div>
						<!-- calling on mouseover -->
						<div>

							<div class="payleftclr  leftsubmenu2" style="display:none;position: relative;cursor: pointer;" id="Div7clr">
								<span style="position:absolute;right:15px;top:15px;">
								
								<img src="/IFLService-theme/images/services_images/IVR_c_services.png"></span>
									
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;">IVR mouseover<br/>Voice Response</span>
							
							    <span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							
							
							
							</div>


						</div>

					</div>
					<div class="span6 topupsquare" style="margin-left:0px; float: left;" >

						<div>
							<div class="payleft  leftsubmenu2 leftsubmenuimg"
								style="background-color: #FFDCDC;position: relative;" id="Div8">
								
								<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.imps" />"><br>
							
								<span style="text-align:left;display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;bottom:15px;left:15px;">
								<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.imps.mobile" />
								</span>
							
							</div>

						</div>
						
						<!-- calling on mouse over -->
						
						
						<div>
							<div class="payleftclr  leftsubmenu2"
								style="display:none;position: relative;border-right:1px solid #ccc;cursor: pointer;"  id="Div8clr">
								<span style="position:absolute;right:15px;top:15px;">
								<img src="/IFLService-theme/images/services_images/IMPS_c_services.png"></span>
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;;">IMPS - <br />(testing Payment)</span>
							<span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							
							</div>

						</div>
						
					</div>
				</div>

				<div class="row-fluid" style="float: left;position: relative;">
					<div class=" span6 topupsquare" style="margin-left:0px; float: left;" >

						<div>

							<div class="payleft leftsubmenu3 leftsubmenuimg" style="background-color: #FFDCDC;" id="Div9">
								<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.image.mobile.application" />"><br>
								<span style="text-align:left;display: block;color: #ffffff;font-size: 16px;font-family: arial;position:absolute;bottom:15px;left:15px;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.mobile.application" /></span>
							</div>


						</div>
					<!-- calling on mouuse over -->
						<div>

							<div class="payleftclr leftsubmenu3"
								style="display:none;position: relative;cursor: pointer;"  id="Div9clr">
								<span style="position:absolute;right:15px;top:15px;">
								<img src="/IFLService-theme/images/services_images/mobile_app_c_services.png"></span>
								<span style="position:absolute;left:15px;top:15px;color: #FF9C9C;font-size: 16px;font-family: arial;text-align:left;">IMPS - <br />Mobile Payment</span>
							
							<span style="position: absolute;top:65px;left:15px;padding-right:10px;font:12px/18px arial;color:#666;text-align:left;">Lorem Ipsum is simply dummy text of the printing and typesetting industry</span>
							</div>

						</div>
					</div>
					<div class="span6 rightimg topupsquare" style="margin-left:0px; float: left;">

						<div>

							<div class="leftsubmenu2">
								<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.image.services.imagebox" />">
							</div>


						</div>

					</div>
				</div>

			</div>

			<!-- IVR DIV Starts -->
			<div class="span7 leftsidedrop touptileright" style="height: 450px;">


				<div class="row-fluid">
					<span style="color:#FF9C9C;font:16px/18px arial;">
						<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response.sub" />
					</span>
					<p class="default-p"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.ivr.voice.response.sub.description" /></p>
				</div>
				<div class="row-fluid" style="padding: 10px 0;">
					<div class="" style="padding-bottom: 20px">
						<%-- <span class="paybyphonelink"><a
							href="downloadapplication.html?filepath=RAPID.DOCTYPE.paybyphone.ivr"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.standing.instruction.click.here" />
							</a> <liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.toknow.process" /></span> --%>
					</div>
						<div class="row-fluid">
								<label class="control-label"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.phone.for.callback" /><span class="required">*</span>
								</label>
							
							
								<input name="mobilenumber" class="form-control" maxlength="10"
									required number="true" value="" />
							
						</div>
					
					</div>
						<div class="row-fluid">
								<input type="submit" value="Submit" id="submitVal"
									class="btn center-block" />
						</div>

				</div>


			<!-- IVR Div END Here  -->