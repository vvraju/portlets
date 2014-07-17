<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />


<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<!-- Cash or Check Picukup Start Here-->
	
	<div class="span12" style="height: 450px;">
	<div class="row-fluid">
		<div class="span5 rightimg courierimg"style=" float: left;">
			<div>

			
					
						<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.slider.sliderimage1" />"><br>
						
					

			</div>

</div>
			<div class="span7 leftsidedrop" style=" float: left;">

             <div class="row-fluid" style="height:353px;">
				<div style="color: #0AA8F2;">
					<span style="color:#FF9C9C;font:16px/18px arial;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.cash.or.check.pickup" /></span>
				</div>
				<p><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.payment.types.description" /></p>
						<div class="row-fluid cash">
								<label class="span5" style="display:inline;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.policy.or.application.number"/>
								</label>
								<input type="text" name="policynumber"
									maxlength="15" minlength="5" required />
							</div>
						<div class="row-fluid cash">
								<label class="span5" style="display:inline;"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.dob.lifeassured" /> <span class="required">*</span>
								</label>
								<input type="text" class="form-control" id="checkdate"
									name="dateVal" required value="" readonly="readonly">
							
								<img src="<liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.calender.image" />"
									class="imagecalendar" id="cdob" />
							
							
						</div>
						<div class="row-fluid" align="center">
								<input type="submit" id="submitdetailsval" value="Submit"
									class="btn" />
						</div>
                   </div>
				
				<div class="span12">
			<div class="payfootermenu" id="footenter"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.online.enterdetails" /></div>
			<div class="payfootermenu" id="footconfirm"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.fix.date.time" /></div>
			<div class="payfootermenu payfootermenu_noimg" id="footpay"><liferay-ui:message key="services.topup.heading.topup.payment.fundswitch.plan.pay.topup.dropbox.view.confirmation.pay" /></div>
		</div>
			
			</div>
			

	</div>


</div>

<!-- Cash or Check Picukup End Here-->
