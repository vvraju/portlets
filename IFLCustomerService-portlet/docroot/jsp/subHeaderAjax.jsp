
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="b-content">
<div class="row-fluid">
<div class="span12 contentstart" style="padding-left: 0px; height: auto; background-color: #E7E8E9; margin-left: 0px;"><!--<div class="heading-top-span">-->
<div class="span3 routesheading nroutesheading"><span style="vertical-align: middle;"><span class="tabheading">SERVICES</span><span class="tabtext"> OFFERED BY US.</span> </span></div>


<div class="span9 leftsubheader" style="background-color: #E7E8E8; margin-left:0;">
 <ul id="flexiselDemo1">

<c:forEach items="${service}" var="serviceNames"  varStatus="servicecount">
 <c:choose>
<c:when test="${servicecount.count eq 1}">
	<li class="hidentools">
	<div class="span12 rightarrowroutes text-left flexdemolist">
	<div class="subheadertext" id="chplan1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 90px;">
	<p class="icon_images"><span class="Myaccount"><span class="tabs_text1">${serviceNames.serviceName}</span></span></p>
	</div>

	<div class="routesdiv flexdemolisthover" id="chplan2" style="display: none;border-left:1px solid #cccccc;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>

	<div class="clr">&nbsp;</div>
	</li>
</c:when>
<c:when test="${servicecount.count eq 2}">
	<li class="hidentools">
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="amplan1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images">
	<span class="transactonline">
	
	<span class="tabs_text2">${serviceNames.serviceName}</span></span>
	</p></div>

	<div class="routesdiv flexdemolisthover" id="amplan2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName} </a> </span></div>
	</div>
	</li>
</c:when>
<c:when test="${servicecount.count eq 3}">
	<li>
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="plans1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images" ><img height="42px" src="/IFLService-theme/images/services_images/claim.png" width="50px" /></p>
	<span class="tabs_text">${serviceNames.serviceName}</span></div>

	<div class="routesdiv flexdemolisthover" id="plans2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="text-align: center; outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>
	</li>
</c:when>
<c:when test="${servicecount.count eq 4}">
	<li>
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="happiness1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images"><img alt="fund performance" height="43px" src="/IFLService-theme/images/services_images/only_india_first.png" width="42px" /></p>
	<span class="tabs_text">${serviceNames.serviceName}</span></div>

	<div class="routesdiv flexdemolisthover" id="happiness2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>
	</li>
</c:when>
<c:when test="${servicecount.count eq 5}">
<li>
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="happiness1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images"><img alt="fund performance" height="43px" src="/IFLService-theme/images/services_images/icon-info-centerblack.png" width="42px" /></p>
	<span class="tabs_text">${serviceNames.serviceName}</span></div>

	<div class="routesdiv flexdemolisthover" id="happiness2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>
	</li>
</c:when>
<c:when test="${servicecount.count eq 6}">
<li>
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="happiness1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images"><span class="toolsanddownloads">
	<span class="tabs_text6">${serviceNames.serviceName}</span></span></p></div>

	<div class="routesdiv flexdemolisthover" id="happiness2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>
	</li>
</c:when>
<c:otherwise>
<li>
	<div class="span12 text-left flexdemolist">
	<div class="subheadertext" id="happiness1" style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px;height: 125px;">
	<p class="icon_images"><img alt="fund performance" height="43px" src="/IFLService-theme/images/services_images/icon-tools-downloadsblack.png" width="42px" /></p>
	<span class="tabs_text">${serviceNames.serviceName}</span></div>

	<div class="routesdiv flexdemolisthover" id="happiness2" style="display: none;"><span><a class="mouseText" href="javascript:void(0);" style="outline: none; text-decoration: none;">${serviceNames.serviceName}</a> </span></div>
	</div>
	</li>

</c:otherwise>
</c:choose>
</c:forEach>
</ul> 
</div>
</div>
</div>
</div>

<div class="b-content">
<div class="row-fluid">
<div class="topnav_tabs">
<div class="owl-carousel owl-theme" id="owl-demo">

<c:forEach items="${serviceNames}" var="subNames"  varStatus="count">
<%-- 	<div class="item"><span class="" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName} </a></span></div>
 --%> 
 <c:choose>
 <c:when test="${subNames.serviceId=='1'}">
  <c:choose><c:when test="${count.count eq 1}">
	<div class="item"><span class="my_policy_details" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName} </a></span></div>
</c:when>
<c:when test="${count.count eq 2}">
	<div class="item"><span class="my_profile" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 3}">
	<div class="item"><span class="my_elocker" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 4}">
	<div class="item"><span class="my_insurance_meter" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 5}">
	<div class="item"><span class="my_portfolio" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>

<c:otherwise>
	<div class="item"><span style="color: #6d6e72;cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>

</c:otherwise>    
 </c:choose>
 </c:when>
 
 <c:when test="${subNames.serviceId=='2'}">
 
 <c:choose>
 <c:when test="${count.count eq 1}">
	<div class="item"><span class="fund_switch_nav" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName} </a></span></div>
</c:when>
<c:when test="${count.count eq 2}">
	<div class="item"><span class="premium_redirect" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 3}">
	<div class="item"><span class="top_up_nav" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 4}">
	<div class="item"><span class="online_premium_payment" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 5}">
	<div class="item"><span class="other_services" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 6}">
	<div class="item"><span class="tracker_status" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:otherwise>
	<div class="item"><span style="color: #6d6e72;cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>

</c:otherwise>
</c:choose> 
</c:when>


<c:when test="${subNames.serviceId=='6'}">
 
 <c:choose>
 <c:when test="${count.count eq 1}">
	<div class="item"><span class="fund_switch_nav" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName} </a></span></div>
</c:when>
<c:when test="${count.count eq 2}">
	<div class="item"><span class="premium_redirect" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 3}">
	<div class="item"><span class="top_up_nav" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:when test="${count.count eq 4}">
	<div class="item"><span class="online_premium_payment" style="cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>
</c:when>
<c:otherwise>
	<div class="item"><span style="color: #6d6e72;cursor: pointer;"><a href="${subNames.subMasterUrl}">${subNames.subMasterName}</a></span></div>

</c:otherwise>
</c:choose>
</c:when> 
</c:choose>
</c:forEach>
</div>
</div>
</div>
</div>
<script>
$(function() {

$("#owl-demo").owlCarousel({
	 items : 5,
	    itemsCustom : false,
	    itemsDesktop : [1024,5],
	    itemsDesktopSmall : [1024,5],
	    itemsTablet: [768,2],
	    itemsTabletSmall: false,
	    itemsMobile : [479,1],responsiveBaseWidth : '#owl-demo',
	}); 
$("#flexiselDemo1").flexisel({
	enableResponsiveBreakpoints : true,

	clone : false,
	responsiveBreakpoints : {
		portrait : {
			changePoint : 480,
			visibleItems : 1
			
		},
		landscape : {
			changePoint : 640,
			visibleItems : 2
		},
		tablet : {
			changePoint : 768,
			visibleItems : 3
		}
	}
}); 
});


</script>

<script>
var pathname = window.location.pathname;
if((pathname=="/web/services/fundswitch") || (pathname=="/web/services/fundswitchactions")){
	
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
	$('#amplan1 span').addClass('active');
}
else if((pathname=="/web/services/premiumredirect") || (pathname=="/web/services/premiumredirectaction")){
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .premium_redirect').addClass('active');
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .transactonline').addClass('active');}
else if((pathname=="/web/services/topup") || (pathname=="/web/services/topupaction")){
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .top_up_nav').addClass('active');
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .transactonline').addClass('active');}
else if(pathname=="/web/services/myprofile"){
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .my_profile').addClass('active');
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .Myaccount').addClass('active');}
else if(pathname=="/web/services/toolsanddownloads"){
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
	$('.leftsubheader span').removeClass('active');
	$('.leftsubheader .toolsanddownloads').addClass('active');
	$("li.hidentools").css("display","none");
	
	}
</script>


