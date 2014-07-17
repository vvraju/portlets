 <%@ include file="/jsp/init.jsp"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/IFLService-theme/js/js-dev/jquery.slimscroll.js"></script>
<portlet:resourceURL var="getDataURL">

</portlet:resourceURL>

<portlet:renderURL var="fundSwitchHome">
	<portlet:param name="action" value="fundSwitchHome" />
</portlet:renderURL> 

<portlet:renderURL var="premiumRedirectHome">
	<portlet:param name="action" value="premiumRedirectHome" />
</portlet:renderURL>

<portlet:renderURL var="topUpHome">
	<portlet:param name="action" value="topUpHome" />
</portlet:renderURL>

<portlet:renderURL var="renewalNoticeHome">
	<portlet:param name="action" value="renewalNoticeHome" />
</portlet:renderURL>

<portlet:renderURL var="addressChangeHome">
	<portlet:param name="action" value="addressChangeHome" />
</portlet:renderURL>

<portlet:renderURL var="addressChange">
	<portlet:param name="action" value="addressChange" />
</portlet:renderURL>

<portlet:renderURL var="changeOfAddressHome">
	<portlet:param name="action" value="changeOfAddressHome" />
</portlet:renderURL>
<portlet:renderURL var="userpolicyHome">
	<portlet:param name="action" value="userpolicyHome" />
</portlet:renderURL>

<portlet:renderURL var="renewalPremiumReceiptHome">
	<portlet:param name="action" value="renewalPremiumReceiptHome" />
</portlet:renderURL>

<portlet:renderURL var="digitalSignURL">
	<portlet:param name="action" value="digitalSignPage" />
</portlet:renderURL>

<portlet:renderURL var="myPolicyDetails">
	<portlet:param name="action" value="myPolicyDetails" />
</portlet:renderURL>


<script>
	sessionStorage.customerId = 1;
</script>
 

<div style="width: 100%;">
<div class="b-content top-other-recommended"><!-- <div style="width:100%;height:auto;"> --><!-- slider images and heading start from here -->
<div class="row-fluid"><!-- span10 -->
<div class="span8 services-offered">
<div class="row-fluid">

<c:forEach items="${serviceNames}" var="serviceNames" varStatus="count">
<c:if test="${count.count eq 1}">
<div class="solutionleftsqaure1 span3">
<div class="productsleftdivcolor span12" id="myAccSec">
<div class="span12" id="myAccSecImg1" style="height:inherit;position:relative;display:block;background-color:#b1d8e7;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.image.myaccount"/>" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 22px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE span12 solutionleftsideboxeshover payleftclr" id="myAccSecImg2" style="padding:0;">
<div class="leftsideboxeshoverimg" style="background:#b9e6f9; color:#ffffff; padding:4px; display:block; width:85%; padding:10px 20px;font-size: 15px;"><img src="<liferay-ui:message key="services.home.image.myaccount"/>" width="20" class="home1stsuareicon" style="padding-right:8px;"/>${serviceNames.serviceName}</div>

<div class="solutionleftsideboxeshovertext" >
<div class="query-request2 myProfile" id="myprofileScrollDiv" style="padding-bottom:1px;clear:both;display:block;">
<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" varStatus="num">

<a class="odd" href="${subNames.subMasterUrl}" rel="${subNames.subMasterUrl}"><img src="/IFLService-theme/images/serviceleftarrow.png" style="padding-right:8px;"/>
${subNames.subMasterName} </a> 
   </c:forEach>
   </div>
</div>
</div>
</div>
<div class="clr"></div>
</div>
</c:if>
<c:if test="${count.count eq 2}">
<div class="solutionleftsqaure2 span3">
<div class="productsleftdivcolor span12" id="transOnlineIcon">
<div class="span12" id="transOnlineIconImg1" style="height:inherit;position:relative;display:block;background-color:#83c8e5;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.list.image.transactonline" />" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 33px;line-height:25px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE transonlinescroll  span12 solutionleftsideboxeshover payleftclr" id="transOnlineIconImg2" style="padding:0;"><!-- <a href="categoryplans.html?catId=1" style="text-decoration: none; cursor: pointer; border: 0px;"> -->
<div class="leftsideboxeshoverimg leftsideboxeshoverimgIE" style="background:#b9e6f9; color:#ffffff; padding:4px; display:block; width:85%; padding:10px 20px;font-size: 15px;"><img src="<liferay-ui:message key="services.home.list.image.transactonline" />" width="20" class="home1stsuareicon" style="padding-right:8px;"/>${serviceNames.serviceName}</div>

<div class="solutionleftsideboxeshovertext">
<div class="transact2 query-request2 transactOnline" id="scrollDiv" style="padding-bottom:1px;clear:both;display:block;">
<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" >
<a class="" href="${subNames.subMasterUrl}" rel="${subNames.subMasterUrl}">${subNames.subMasterName} </a> 

   </c:forEach> 
   
   </div>
</div>
</div>
</div>
<div class="clr"></div>
</div>
</c:if>
<c:if test="${count.count eq 3}">
<div class="solutionleftsqaure3 span3">
<div class="productsleftdivcolor span12" id="claimDeskIcon">
<div class="span10" id="claimDeskIconImg1" style="height:inherit;position:relative;display:block;background-color:#a1d9d6;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.list.image.claimdesk"  />" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 30px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE span12 solutionleftsideboxeshover payleftclr" id="claimDeskIconImg2">
<div class="leftsideboxeshoverimg"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;"><img src="<liferay-ui:message key="services.home.list.image.active.claimdesk"  />" /> </a></div>

<div class="solutionleftsideboxeshoverhdgtitle"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceName}</a></div>
&nbsp;
<c:choose>
      <c:when test="${serviceNames.serviceSubnamesBeanList ne null}">
			<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" >
			<a class="odd" href="#" rel="<%=myPolicyDetails%>">${subNames.subMasterName} </a> 
			   </c:forEach>
		</c:when>
		<c:otherwise>
		<div class="solutionleftsideboxeshovertext" style="padding-top:10px;"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceDesc}</a></div>
		</c:otherwise>
</c:choose>

</div>
</div>
<div class="clr"></div>
</div>
</c:if>
<c:if test="${count.count eq 4}">
<div class="solutionleftsqaure4 span3">
<div class="productsleftdivcolor span12" id="indiaFirstIcon">
<div class="span12" id="indiaFirstIconImg1" style="height:inherit;position:relative;display:block;background-color:#83c8e5;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.list.image.onlyatindiafirst"  />" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 45px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE span12 solutionleftsideboxeshover payleftclr" id="indiaFirstIconImg2">
<div class="leftsideboxeshoverimg" style="padding-left:10px;"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;"><img src="<liferay-ui:message key="services.home.list.image.active.onlyatindiafirst"  />" /> </a></div>

<div class="solutionleftsideboxeshoverhdgtitle"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceName}</a></div>
&nbsp;
<c:choose>
      <c:when test="${serviceNames.serviceSubnamesBeanList ne null}">
			<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" >
			<a class="odd" href="#" rel="<%=myPolicyDetails%>">${subNames.subMasterName} </a> 
			   </c:forEach>
		</c:when>
		<c:otherwise>
		<div class="solutionleftsideboxeshovertext" style="padding-top:10px;"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceDesc}</a></div>
		</c:otherwise>
</c:choose>
</div>
</div>
<div class="clr"></div>
</div>
</c:if>
<c:if test="${count.count eq 5}">
<div class="solutionleftsqaure5 span3">
<div class="productsleftdivcolor span12" id="informationIcon">
<div class="span12" id="informationIconimg1" style="height:inherit;position:relative;display:block;background-color:#a1d9d6;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.list.image.infocenter" />" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 30px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE span12 solutionleftsideboxeshover payleftclr" id="informationIconimg2">
<div class="leftsideboxeshoverimg" style="padding-left:10px;"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;"><img src="<liferay-ui:message key="services.home.list.image.active.infocenter" />" /> </a></div>

<div class="solutionleftsideboxeshoverhdgtitle"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceName}</a></div>
&nbsp;
<c:choose>
      <c:when test="${serviceNames.serviceSubnamesBeanList ne null}">
			<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" >
			<a class="odd" href="#" rel="<%=myPolicyDetails%>">${subNames.subMasterName} </a> 
			   </c:forEach>
		</c:when>
		<c:otherwise>
		<div class="solutionleftsideboxeshovertext" style="padding-top:10px;"><a href="#" style="text-decoration: none; cursor: pointer; border: 0px;">${serviceNames.serviceDesc}</a></div>
		</c:otherwise>
</c:choose>
</div>
</div>
<div class="clr"></div>
</div>
</c:if>
<c:if test="${count.count eq 6}">
<div class="solutionleftsqaure6 span3">
<div class="productsleftdivcolor span12" id="toolsDownloadIcon">
<div class="span12" id="toolsDownloadIconImg1" style="height:inherit;position:relative;display:block;background-color:#6ed0f7;">
<div class="leftsideboxes"><img src="<liferay-ui:message key="services.home.list.image.toolsdownloads" />" /></div>

<div style="display: block; color: #ffffff; font-size: 22px; font-family: arial; padding-left: 25px; margin-top: 42px;line-height:25px;">${serviceNames.serviceName}</div>
</div>

<div class="productsleftdivwhite productsleftdivwhiteIE span12 solutionleftsideboxeshover payleftclr" id="toolsDownloadIconImg2" style="padding:0;">
<div class="leftsideboxeshoverimg" style="background:#b9e6f9; color:#ffffff; padding:4px; display:block; width:86%; padding:10px 20px;font-size: 15px;"><img src="<liferay-ui:message key="services.home.image.myaccount"/>" width="20" class="home1stsuareicon" style="padding-right:8px;"/>${serviceNames.serviceName}</div>

<div class="solutionleftsideboxeshovertext" >
<div class="query-request2 myProfile" id="toolsanddownloadsScrollDiv" style="padding-bottom:1px;clear:both;display:block;">
<c:forEach items="${serviceNames.serviceSubnamesBeanList}" var="subNames" varStatus="num">

<a class="odd" href="${subNames.subMasterUrl}" rel="${subNames.subMasterUrl}"><img src="/IFLService-theme/images/serviceleftarrow.png" style="padding-right:8px;"/>
${subNames.subMasterName} </a> 

   </c:forEach>
   </div>
</div>
</div>
</div>
<div class="clr"></div>
</div>
</c:if>

</c:forEach>


</div>
</div>

<div class="span4 payrightblockcontainer payrightblockcontainerIE" style="height:387px; margin:0;">
<div class="sliderImages sliderImagesIE span12" id="Home_CE1">
<div class="slider-wrap">
<div class="slider4"><img src="<liferay-ui:message key="services.home.slider.image.health" />" /></div>
</div>
</div>

<div class="sliderImages sliderImagesIE span12" id="Home_CE2">
<div class="slider-wrap">
<div class="slider4"><img src="<liferay-ui:message key="services.home.slider.image.security" />" /></div>
</div>
</div>

<div class="sliderImages sliderImagesIE span12" id="Home_CE3">
<div class="slider-wrap">
<div class="slider4"><img src="<liferay-ui:message key="services.home.slider.image.savngs" />" /></div>
</div>
</div>

<div class="sliderImages sliderImagesIE span12" id="Home_CE4">
<div class="slider-wrap">
<div class="slider4"><img src="<liferay-ui:message key="services.home.slider.image.wealth" />" /></div>
</div>
</div>

<div class="slider1 slider1IE" id="slider1_container" style="position: relative; height:400px; overflow: hidden;"><!-- Loading Screen -->
	<div style="position: absolute; top: 0px; left: 0px;" u="loading">
		<div style="filter: alpha(opacity = 70); opacity: 0.7; position: absolute; display: block; background-color: #000; top: 0px; left: 0px; width: 100%; height: 100%;">&nbsp;</div>		
		<div style="position: absolute; display: block; background: url(img/loading.gif) no-repeat center center; top: 0px; left: 0px; width: 100%; height: 100%;">&nbsp;</div>
	</div>
	
	<!-- Slides Container -->

	<div id="sliderimagesdiv">
		<div class="span4 sliders slider1IE" id="slidestyle" style="position: absolute; width: 530px; height: 390px; top: 0px; left: 0px; overflow: hidden;" u="slides">
			<div><img src="<liferay-ui:message key="services.home.slider.image.happy" />" u="image" class="sliderimges" /></div>
			
			<div><img src="<liferay-ui:message key="services.home.slider.image.health" />" u="image" class="sliderimges" /></div>
			
			<div><img src="<liferay-ui:message key="services.home.slider.image.security" />" u="image" class="sliderimges"/></div>
			
			<div><img src="<liferay-ui:message key="services.home.slider.image.savngs" />" u="image" class="sliderimges"/></div>
			
			<div><img src="<liferay-ui:message key="services.home.slider.image.wealth" />" u="image" class="sliderimges"/></div>
		</div>
	</div>
 
	<div><img id="Home_CE1" src="<liferay-ui:message key="services.home.slider.image.happy" />" style="position: absolute; height:390px; top: 0px; left: 0px; overflow: hidden; display: none" /></div>
	
	<div><img id="Home_CE1" src="<liferay-ui:message key="services.home.slider.image.health" />" style="position: absolute; height:390px; top: 0px; left: 0px; overflow: hidden; display: none" /></div>
	
	<div><img id="Home_CE2" src="<liferay-ui:message key="services.home.slider.image.security" />" style="position: absolute; height:390px; top: 0px; left: 0px; overflow: hidden; display: none" /></div>
	
	<div><img id="Home_CE3" src="<liferay-ui:message key="services.home.slider.image.savngs" />" style="position: absolute; height:390px; top: 0px; left: 0px; overflow: hidden; display: none" /></div>
	
	<div><img id="Home_CE4" src="<liferay-ui:message key="services.home.slider.image.wealth" />" style="position: absolute; height:390px; top: 0px; left: 0px; overflow: hidden; display: none" /></div> 
	<!-- Navigator Skin Begin -->

	<div class="slider1-N" style="position: absolute; bottom: 4px; right: 6px;" u="navigator">
		<div style="POSITION: absolute; WIDTH: 22px; HEIGHT: 22px; text-align: center; line-height: 22px; color: White; font-size: 14px;" u="prototype"><numbertemplate></numbertemplate></div>
	</div>
<!-- Navigator Skin End --><!-- DirectionNavigator Skin Begin --><!-- Arrow Left --><!-- Arrow Right --><!-- DirectionNavigator Skin End --><a href="http://www.jssor.com" style="display: none">Slider jQuery</a> <!-- overlaid color images of the same as above --></div>
<!-- Jssor Slider End --></div>
</div>
</div>

</div>



<div style="clear:both;"></div>
<div class="b-content">
<div class="row-fluid">
<!-- height 125px; -->
 <div class="span12" style="padding-left: 0px; height: auto; background-color: #ffffff; border: 1px solid #CCCCCC; margin-left: 0px;">

					<div class="span3 subfooternroutes routesheading" style="height:142px !important;margin-left:0px !important;">

				<span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 15px; font-size: 43px;"><liferay-ui:message key="services.home.products.other" /></span> <span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 10px; font-size: 18px;"><liferay-ui:message key="services.home.products.recommended" /></span>
					<span
					style="vertical-align: middle; color: rgb(192, 188, 181); display: block; text-align: center; padding-top: 6px; font-size: 26px;"> <liferay-ui:message key="services.home.products.products" /></span>
			</div>
		<div class="span9 span-img-btm-slide subfooternspan-img-btm-slide subfooternspan-img-btm-slideIE" style="margin-left:0px;">
				<ul id="flexiselDemo2" class="services_scroll_bottom services_scroll_bottomIE">
					<c:forEach items="${recommendedProducts}" var="rProducts" varStatus="rp">
					<c:choose><c:when test='${rp.count eq 1}'>
						<li>
						<div class="span12 rightarrowroutes text-left flexdemolist ">
							<img src="${rProducts.imgUrl}" />
							<span>${rProducts.productName}</span>
						</div>
					</li>
					</c:when>
					
					<c:otherwise>
					<li>
						<div class="span12  text-left flexdemolist ">
							<img src="${rProducts.imgUrl}" />
							<span>${rProducts.productName}</span>
						</div>
					</li></c:otherwise></c:choose>
					</c:forEach>
					</ul>

			</div>
	
			<div class="clearfix"></div>

		</div>
	
	</div>	

</div>

<script>
AUI().ready(function(A) {
	sessionStorage.coaParam = '';
	
	$(".transactOnline a").click(function(e){
		//console.log("in anchor");
	    //e.preventDefault();//this will prevent the link trying to navigate to another page
	    var href = $(this).attr("rel");
	    //when update has finished, navigate to the other page
	    
	     /* if($(this).attr("target") != ''){ 
	    	sessionStorage.coaParam = $(this).attr("target"); 
	    	href = href + '&coaParam=' + $(this).attr("target");
	     } */
	     window.location = href;
	     return false;
	});
	
	
	$(".myProfile a").click(function(e){
		e.preventDefault();//this will prevent the link trying to navigate to another page
	    var href = $(this).attr("rel");	 
	    window.location = href;
	    return false;
	});
	
	var noOfimage=4;
	
    $('#myAccSec').mouseover(function(){			
		//$('#sliderFrame1').hide();   							
		$('#myAccSecImg2').show();
		$('#myAccSecImg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){					
			if(i==1){
			//alert($('#Home_CE'+i).width()+"  "+$('#Home_CE'+i).height());
				$('#Home_CE'+i).show();
				//$('#Home_CE'+i).css("width",$('#Home_CE'+i).width());
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());							
			}else{						
				$('#Home_CE'+i).hide();							
			}
		}
	});

	$('#myAccSec').mouseout(function(){
		$('#myAccSecImg2').hide();
		$('#myAccSecImg1').show();
		
		for(var i=1;i<=parseInt(noOfimage);i++){			
			$('#Home_CE'+i).hide();
		}			
					
		$('#sliderimagesdiv').show();
		//$('#sliderFrame1').show();			
	});
	
	
	$('#transOnlineIcon').mouseover(function(){
		$('#transOnlineIconImg2').show();
		$('#transOnlineIconImg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){
			if(i==2){			
				$('#Home_CE'+i).show();
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());				
			}else{			
				$('#Home_CE'+i).hide();				
			}
		}
	});
		
	$('#transOnlineIcon').mouseout(function(){
		$('#transOnlineIconImg2').hide();
		$('#transOnlineIconImg1').show();			
		for(var i=1;i<=parseInt(noOfimage);i++){					
			$('#Home_CE'+i).hide();
		}			
		$('#sliderimagesdiv').show();			
	});
	
	$('#claimDeskIcon').mouseover(function(){			
		$('#claimDeskIconImg2').show();
		$('#claimDeskIconImg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){					
			if(i==3){			
				$('#Home_CE'+i).show();			
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());				
			}else{			
				$('#Home_CE'+i).hide();				
			}
		}
	});
		
	$('#claimDeskIcon').mouseout(function(){
		$('#claimDeskIconImg2').hide();
		$('#claimDeskIconImg1').show();	
		for(var i=1;i<=parseInt(noOfimage);i++){			
			$('#Home_CE'+i).hide();
		}			
		$('#sliderimagesdiv').show();	
	});
	
	$('#indiaFirstIcon').mouseover(function(){		
		$('#indiaFirstIconImg2').show();
		$('#indiaFirstIconImg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){
			if(i==4){
				$('#Home_CE'+i).show();				
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());				
			}else{			
				$('#Home_CE'+i).hide();				
			}
		}
	});
		
	$('#indiaFirstIcon').mouseout(function(){
		$('#indiaFirstIconImg2').hide();
		$('#indiaFirstIconImg1').show();	
		for(var i=1;i<=parseInt(noOfimage);i++){			
			$('#Home_CE'+i).hide();
		}								
		$('#sliderimagesdiv').show();	
	});
	
	$('#informationIcon').mouseover(function(){		
		$('#informationIconimg2').show();
		$('#informationIconimg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){					
			if(i==4){			
				$('#Home_CE'+i).show();				
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());				
			}else{			
				$('#Home_CE'+i).hide();				
			}
		}
	});
		
	$('#informationIcon').mouseout(function(){
		$('#informationIconimg2').hide();
		$('#informationIconimg1').show();
		for(var i=1;i<=parseInt(noOfimage);i++){			
			$('#Home_CE'+i).hide();
		}			
		$('#sliderimagesdiv').show();
	});
	
	$('#toolsDownloadIcon').mouseover(function(){
		$('#toolsDownloadIconImg2').show();
		$('#toolsDownloadIconImg1').hide();
		$('#sliderimagesdiv').hide();
		for(var i=1;i<=parseInt(noOfimage);i++){					
			if(i==4){
				$('#Home_CE'+i).show();
				$('#Home_CE'+i).css("height",$('#Home_CE'+i).height());				
			}else{			
				$('#Home_CE'+i).hide();				
			}
		}
	});
		
	$('#toolsDownloadIcon').mouseout(function(){
		$('#toolsDownloadIconImg2').hide();
		$('#toolsDownloadIconImg1').show();	
		for(var i=1;i<=parseInt(noOfimage);i++){			
			$('#Home_CE'+i).hide();
		}								
		$('#sliderimagesdiv').show();	
	});

	/* other recommended products section */
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
	
	$(".productsleftdivwhite").click(function(){
		 window.location=$(this).find("a").attr("href");
		 return false;
	});
	
	$("#slider1_container").css("width",$('#slider1_container').width());
	$("#slider1_container").css("height",$('#slider1_container').height());

	//Transition parameters for jssor slider - fly right random style
	var _SlideshowTransitions = [
		//Fly Right Random
		{$Duration:1000,$Delay:70,$Cols:6,$Rows:4,$FlyDirection:1,$Easing:{$Left:$JssorEasing$.$EaseInCubic,$Opacity:$JssorEasing$.$EaseOutQuad},$Opacity:2}
	];

	 //end of transition parameters

	$('#slider1_container').jssorSlider({
		$AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
		$AutoPlayInterval: 2000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
		$SlideDuration: 300,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
		$DragOrientation: 0,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

		$SlideshowOptions: {                                //[Optional] Options to specify and enable slideshow or not
			$Class: $JssorSlideshowRunner$,                 //[Required] Class to create instance of slideshow
			$Transitions: _SlideshowTransitions,            //[Required] An array of slideshow transitions to play slideshow
			$TransitionsOrder: 1,                           //[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random
			$ShowLink: true                                    //[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false
		},
		/*
		$DirectionNavigatorOptions: {
			$Class: $JssorDirectionNavigator$,              //[Requried] Class to create direction navigator instance
			$ChanceToShow: 0                                //[Required] 0 Never, 1 Mouse Over, 2 Always
		},*/

		$NavigatorOptions: {                                //[Optional] Options to specify and enable navigator or not
			$Class: $JssorNavigator$,                       //[Required] Class to create navigator instance
			$ChanceToShow: 0,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
			$SpacingX: 5                                    //[Optional] Horizontal space between each item in pixel, default value is 0
		}
	});

	//responsive code begin
	//you can remove responsive code if you don't want the slider scales while window resizes
	function ScaleSlider() {
		var parentWidth = $('#slider1_container').parent().width();

		if (parentWidth) {
			var jssor_slider1 = $('#slider1_container').data('jssorSlider');
			jssor_slider1.$SetScaleWidth(parentWidth);
		}
		else
			window.setTimeout(ScaleSlider, 30);	
	}

	//Scale slider after document ready
	ScaleSlider();

	if (!navigator.userAgent.match(/(iPhone|iPod|iPad|BlackBerry|IEMobile)/)) {
	   // alert(ScaleSlider);
		//Capture window resize event
		$(window).bind('resize', ScaleSlider);
	}
	//responsive code end
	
	$('#Home_CE1').hide();
	$('#Home_CE2').hide();
	$('#Home_CE3').hide();
	$('#Home_CE4').hide();	
});

$(function() {
	$('#scrollDiv').slimscroll({
		height : '153px'
	});
	
	$('#myprofileScrollDiv').slimscroll({
		height : '162px'
	});
	
	$('#toolsanddownloadsScrollDiv').slimscroll({
		height : '162px'
	});
	
});

</script>

<!-- <script>$("#slider1_container").css("width",$('#slider1_container').width());
$("#slider1_container").css("height",$('#slider1_container').height());

//Transition parameters for jssor slider - fly right random style
var _SlideshowTransitions = [
	//Fly Right Random
	{$Duration:1000,$Delay:70,$Cols:6,$Rows:4,$FlyDirection:1,$Easing:{$Left:$JssorEasing$.$EaseInCubic,$Opacity:$JssorEasing$.$EaseOutQuad},$Opacity:2}
];

 //end of transition parameters

$('#slider1_container').jssorSlider({
	$AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
	$AutoPlayInterval: 2000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
	$SlideDuration: 300,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
	$DragOrientation: 0,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

	$SlideshowOptions: {                                //[Optional] Options to specify and enable slideshow or not
		$Class: $JssorSlideshowRunner$,                 //[Required] Class to create instance of slideshow
		$Transitions: _SlideshowTransitions,            //[Required] An array of slideshow transitions to play slideshow
		$TransitionsOrder: 1,                           //[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random
		$ShowLink: true                                    //[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false
	},
	/*
	$DirectionNavigatorOptions: {
		$Class: $JssorDirectionNavigator$,              //[Requried] Class to create direction navigator instance
		$ChanceToShow: 0                                //[Required] 0 Never, 1 Mouse Over, 2 Always
	},*/

	$NavigatorOptions: {                                //[Optional] Options to specify and enable navigator or not
		$Class: $JssorNavigator$,                       //[Required] Class to create navigator instance
		$ChanceToShow: 0,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
		$SpacingX: 5                                    //[Optional] Horizontal space between each item in pixel, default value is 0
	}
});

//responsive code begin
//you can remove responsive code if you don't want the slider scales while window resizes
function ScaleSlider() {
	var parentWidth = $('#slider1_container').parent().width();

	if (parentWidth) {
		var jssor_slider1 = $('#slider1_container').data('jssorSlider');
		jssor_slider1.$SetScaleWidth(parentWidth);
	}
	else
		window.setTimeout(ScaleSlider, 30);	
}

//Scale slider after document ready
ScaleSlider();

if (!navigator.userAgent.match(/(iPhone|iPod|iPad|BlackBerry|IEMobile)/)) {
   // alert(ScaleSlider);
	//Capture window resize event
	$(window).bind('resize', ScaleSlider);
}
//responsive code end

$('#Home_CE1').show();
$('#Home_CE2').show();
$('#Home_CE3').show();
$('#Home_CE4').show();	
});
</script> -->

