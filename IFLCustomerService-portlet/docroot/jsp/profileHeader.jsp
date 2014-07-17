<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<script src="/IFLService-theme/js/owl.carousel.js"></script>
<link rel="stylesheet" type="text/css" href="/IFLService-theme/css/owl.carousel.css">
<portlet:resourceURL var="getDataURL">

</portlet:resourceURL>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:renderURL var="fundSwitchHome">
	<portlet:param name="action" value="fundSwitchHome" />
</portlet:renderURL>
<portlet:renderURL var="premiumRedirectHome">
	<portlet:param name="action" value="premiumRedirectHome" />
</portlet:renderURL>
<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>
<portlet:renderURL var="myPolicyDetails">
	<portlet:param name="action" value="myPolicyDetails" />
</portlet:renderURL>
<portlet:renderURL var="changePersonalDetailsHome">
	<portlet:param name="action" value="changePersonalDetailsHome" />
</portlet:renderURL>
<div class="b-content">
<div class="row-fluid">
<div class="span12 contentstart" style="border-bottom:1px  solid #ccc;padding-left: 0px; height: auto; background-color: #E7E8E9; margin-left: 0px;">
			
            <!--<div class="heading-top-span">-->
				<div class="span3 routesheading nroutesheading">

				<span style="vertical-align: middle;"> <span class="tabheading"><liferay-ui:message key="services.home.title"/></span><span class="tabtext"> <liferay-ui:message key="services.home.subtitle"/> </span>
                                    
                                </span> 
                           
			</div>
			<!--</div>-->
            
			<div class="span9 leftsubheader" style="background-color: #E7E8E8; margin-left:0;">
				<ul id="flexiselDemo1">
					<li>
						<div class="span12 rightarrowroutes text-left flexdemolist">
							<div id="chplan1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 90px;">
								
								<p class="icon_images"> <img src="<liferay-ui:message key="services.fundswitch.subheader.image.myaccount"/>" width="38px" height="44px" /> </p>
								
								
								<span class="tabs_text "> My Account</span>
							</div>

							<div id="chplan2" class="routesdiv flexdemolisthover" style="display: none;border-left:1px solid #cccccc;">

								<span> <a href="javascript:void(0);" class="mouseText"
									style="outline: none; text-decoration: none;"> <liferay-ui:message key="services.fundswitch.subheader.slectproductasurneed"/></a>

								</span>
							</div>
                                                    
                                           

						</div>
                                             <div class="clr"> </div>
                                            
					</li>
					<li>
						<div class="span12 text-left flexdemolist">
							<div id="amplan1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
						     <p class="icon_images"> <img src="<liferay-ui:message key="services.fundswitch.subheader.image.claim"/>" width="50px" height="42px" /> </p>
								
								
								<span class="tabs_text"> <liferay-ui:message key="services.fundswitch.subheader.claimdesk"/></span>
							</div>

							<div id="amplan2" class="routesdiv flexdemolisthover" style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseText"
									style="outline: none; text-decoration: none;"> <liferay-ui:message key="services.fundswitch.subheader.claimdesk.desc"/></a>

								</span>
							</div>

						</div>
					</li>
					<li>
						<div class="span12 text-left flexdemolist">
							<div id="plans1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
								 <p class="icon_images"> <img src="<liferay-ui:message key="services.fundswitch.subheader.image.onlyindiafirst"/>" width="54px" height="32px" /> </p>
								
								
								<span class="tabs_text"> <liferay-ui:message key="services.fundswitch.subheader.onlyindiafirst"/> </span>

							</div>

							<div id="plans2" class="routesdiv flexdemolisthover" style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseText"
									style="text-align: center; outline: none; text-decoration: none;"><liferay-ui:message key="services.fundswitch.subheader.onlyindiafirst.desc"/></a>

								</span>
							</div>
						</div>
					</li>
					
			
					
					<li>
						<div class="span12 text-left flexdemolist">
							<div id="happiness1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
								
                                 <p class="icon_images"> <img src="<liferay-ui:message key="services.fundswitch.subheader.image.fundperformance"/>" width="42px" height="43px"  alt="fund performance" /> </p>
								
								
								<span class="tabs_text"> <liferay-ui:message key="services.fundswitch.subheader.fundperformance"/></span>

							</div>
							<div id="happiness2" class="routesdiv flexdemolisthover" style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseText"
									style="outline: none; text-decoration: none;"> <liferay-ui:message key="services.fundswitch.subheader.fundperformance.desc"/></a>

								</span>
							</div>
						</div>
					</li>
					
				</ul>

			</div>
			
			<div class="clearfix"></div>
                        
                       
                       

		</div>

</div>
</div>
<div class="b-content">
<div class="row-fluid">
<div class="topnav_tabs">
   <div id="owl-demo" class="owl-carousel owl-theme">

        <div class="item profilehead" > <span class="my_policy_details" onClick="getTabPage('PD');" style="cursor: pointer;"><liferay-ui:message key="services.home.sublist.mypolicydetails" /></span>  </div>
        <div class="item profilehead"><span class="my_profile"  onClick="getTabPage('AC');" style="cursor: pointer;"><liferay-ui:message key="services.home.sublist.myprofile" /></span></div> 
        <div class="item profilehead"><span class="my_elocker"   style="cursor: pointer;"><liferay-ui:message key="services.home.sublist.myelocker" /></span></div>
        <div class="item profilehead"><span class="my_insurance_meter" style="cursor: pointer;"><liferay-ui:message key="services.home.sublist.myinsurancemeter" /></span> </div> 
       	<div class="item profilehead" ><span class="my_portfolio"><liferay-ui:message key="services.home.sublist.myportfolio" /></span></div>
        
        <div class="item addresshead" > <span class="fund_switch_nav" onClick="getTabPage('FS');" style="cursor: pointer;"><liferay-ui:message key="services.home.list.transactonline.sublist.fundswitch" /></span>  </div>
        <div class="item addresshead"><span class="top_up_nav" onClick="getTabPage('TP');" style="cursor: pointer;"> <liferay-ui:message key="services.home.list.transactonline.sublist.topup" /> </span></div> 
        <div class="item addresshead"><span class="premium_redirect"  onClick="getTabPage('PR');" style="cursor: pointer;"><liferay-ui:message key="services.home.list.transactonline.sublist.premiumredirect" /></span></div>
        <div class="item addresshead"><span class="renewal_notice_nav" style="cursor: pointer;" onClick="getTabPage('RN');"><liferay-ui:message key="services.fundswitch.subheader.renewalnotice" />  </span> </div> 
       	<div class="item addresshead" ><span class="download_policy" style="cursor: pointer;" onClick="getTabPage('DWP')"><liferay-ui:message key="services.home.list.transactonline.sublist.downloadpolicy" /></span></div>
        <div class="item addresshead"><span class="change_address_details_nav"> <a href="<%=changePersonalDetailsHome %>&coaParam=address" style="color: #6d6e72;"><liferay-ui:message key="services.home.list.transactonline.sublist.changeaddress" /></a>	</span></div>
        <div class="item addresshead"><span class="change_personal_details_nav"><a href="<%=addressChange %>&coaParam=personal" style="color: #6d6e72;"><liferay-ui:message key="services.home.list.transactonline.sublist.changepersonaldetails" /></a></span></div>
        <div class="item addresshead"><span class="change_contact_details_nav"><a href="<%=addressChange %>&coaParam=contact" style="color: #6d6e72;"><liferay-ui:message key="services.home.list.transactonline.sublist.changemailphone" /></a></span></div>
        
  </div>
</div>    
</div>
</div>
<script>
if('${param.subhead}'=='profile'){
	$('.profilehead').show();
	$('.addresshead').hide();
}else{
	$('.addresshead').show();
	
	$('.profilehead').hide();
}


if('${param.coaParam}'=='personal'){
	
	$('.change_personal_details_nav').attr("change_personal_details_nav active");
}else if('${param.coaParam}'=='contact'){
	
	$('.change_contact_details_nav').attr("change_contact_details_nav active");
	
}else if('${param.coaParam}'=='address' || '${param.coaParam}'=="communication" || '${param.coaParam}'=="permanent" || '${param.coaParam}'=="occupation"){
	
	$('.change_address_details_nav').attr("change_address_details_nav active");
}


	function getTabPage(param){
		if(param == 'PD'){
			window.location = "<%= myPolicyDetails %>";
		} else {
			if(param == 'AC'){
				window.location = "<%= addressChange %>";
			}
		}
	}

$(document).ready(function() {
//$("#owl-demo").owlCarousel({items : 6,scrollPerPage: true,responsiveBaseWidth : '#owl-demo'});
$("#owl-demo").owlCarousel({
	 items : 5,
	    itemsCustom : false,
	    itemsDesktop : [1366,5],
	    itemsDesktopSmall : [1024,5],
	    itemsTablet: [768,2],
	    itemsTabletSmall: false,
	    itemsMobile : [479,1],responsiveBaseWidth : '#owl-demo',
	});
});

</script>
