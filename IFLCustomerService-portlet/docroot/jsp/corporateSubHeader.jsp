  <link href="/IFLService-theme/css/corporate.css" rel="stylesheet" type="text/css" />


<portlet:defineObjects />

<portlet:resourceURL var="getDataURL">

</portlet:resourceURL>

<portlet:renderURL var="fundSwitchHome">
	<portlet:param name="action" value="fundSwitchHome" />
</portlet:renderURL>

<portlet:renderURL var="premiumRedirect">
	<portlet:param name="action" value="premiumRedirect" />
</portlet:renderURL>

<portlet:renderURL var="customerDetails">
	<portlet:param name="action" value="customerDetails" />
</portlet:renderURL>

<style>
.corporateSubHeader {
	color: grey;
}

.corporateSubHeader.active {
	color: #26B6F3;
}
</style>

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<div class="b-content">
	<div class="row-fluid">
		<div class="span12 contentstart"
			style="padding-left: 0px; height: auto; background-color: #E7E8E9; margin-left: 0px;">

			<!--<div class="heading-top-span">-->
			<div class="span3 routesheading nroutesheading">

				<span style="vertical-align: middle;"> <span
					class="tabheading" style="margin-top:10px;">Workbench </span>

				</span>

			</div>
			<!--</div>-->

			<div class="span9 leftsubheader leftsubheaderIE" style="background-color: #E7E8E8; margin-left: 0;">
				<ul id="flexiselDemo1" class="flexdemoIE">
					<li>
						<div class="span12 rightarrowroutes text-left flexdemolist">
							<div id="chplan1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px; height: 90px;">

								<p class="icon_images">
									<img
										src="/IFLService-theme/images/services_images/workflow_img_active.png"
										width="53px" height="46px" />
								</p>


								<span class="tabs_text blue" style="color:#FF9C9C;"> Workflow </span>
							</div>

							<div id="chplan2" class="routesdiv flexdemolisthover"
								style="display: none; border-left: 1px solid #cccccc;">

								<span> <a href="javascript:void(0);" class="mouseTextcorporate"
									style="outline: none;">Select your product as per your need
										as reflected in categories mentioned below</a>

								</span>
							</div>



						</div>
						<div class="clr"></div>

					</li>
					<li>
						<div class="span12 text-left flexdemolist">
							<div id="amplan1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px; height: 125px;">
								<p class="icon_images">
									<img
										src="/IFLService-theme/images/services_images/calendar_img.png"
										width="41px" height="39px" />
								</p>


								<span class="tabs_text"> My Planner</span>
							</div>

							<div id="amplan2" class="routesdiv flexdemolisthover"
								style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseTextcorporate"
									style="outline: none;"> Select your product as per the
										amount and you want to invest</a>

								</span>
							</div>

						</div>
					</li>
					<li>
						<div class="span12 text-left flexdemolist">
							<div id="plans1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px; height: 125px;">
								<p class="icon_images">
									<img
										src="/IFLService-theme/images/services_images/activities_img.png"
										width="38px" height="41px" />
								</p>


								<span class="tabs_text"> My Activities </span>

							</div>

							<div id="plans2" class="routesdiv flexdemolisthover"
								style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseTextcorporate"
									style="text-align: center; outline: none;">Select from all
										the India first plan</a>

								</span>
							</div>
						</div>
					</li>

					<li>
						<div class="span12 text-left flexdemolist">
							<div id="happiness1" class="subheadertext"
								style="float: left; font-size: 60px; padding-left: 5px; padding-right: 5px; height: 125px;">

								<p class="icon_images">
									<img src="/IFLService-theme/images/services_images/alerts.png"
										width="42px" height="43px" alt="fund performance" />
								</p>


								<span class="tabs_text"> Alerts</span>

							</div>
							<div id="happiness2" class="routesdiv flexdemolisthover"
								style="display: none;">
								<span> <a href="javascript:void(0);" class="mouseTextcorporate"
									style="outline: none;"> Use for Happiness Meter tool to get
										a plan recommended by us</a>

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

<div class="b-content" style="display:none;">
	<div class="row-fluid">
		<div class="topnav_tabs">
			<ul>
				<li><div class="tab1">
						<span class="fund_switch_nav srSubHeader "><span id="FS"
							class="corporateSubHeader active">Fund Switch</span></span>
					</div></li>
				<li>
					<div class="tab2">
						<span id="TU" class="corporateSubHeader">Top Up</span>
					</div>
				</li>
				<li><div class="tab3">
						<a href="javascript:void(0);" style="text-decoration: none;"><span
							id="PR" class="corporateSubHeader">Premium Redirection</span></a>
					</div></li>
				<li><div class="tab4">
						<a href="javascript:void(0);" style="text-decoration: none;"><span
							id="USR" class="corporateSubHeader"> Unit Statement
								Request</span> </a>
					</div></li>
				<li><div class="tab5">
						<a href="javascript:void(0);" style="text-decoration: none;"><span
							id="CP" class="corporateSubHeader"> Change Personal
								Details </span></a>
					</div></li>

			</ul>
		</div>
	</div>
</div>


<div class="b-content">
	<div class="row-fluid">
		<div class="topnav_tabs">
			<ul>
				<li id="queuetab"><div class="tab1">
				<!-- 		<span class="fund_switch_nav">My Queue</span> -->
					<span class="top_up"><img src="/IFLService-theme/images/myqueuegray.png" style="padding-right:4px;"/>My Queue</span> 
				
					</div></li>
				<li id="grouptab">
					<div class="tab2">
						<span class="top_up"><img src="/IFLService-theme/images/groupqueuegray.png" style="padding-right:4px;"/>Group Queue </span>
					</div>
				</li>
				<li id="profileTab" style="display:none;width:38.7%;text-align:left;padding-left:20px;" >
					<div class="tab2">
						<span class="top_up" style="font-size:14px;"><img src="/IFLService-theme/images/customerimg.png" style="float:left;padding-right:2px;"/>Customer Profile 360&#176;</span>
					</div>
				</li>
				<li id="casestart"><div class="tab3" style="width: 100%; ">
						
						<span class="top_up2" style=""><a href="#">Case Start </a> </span>
						
				<!-- 		<span class="premium_redirect">Case Start</span> -->
					</div></li>
					
				<li id="customertab">
					<div class="tab2">
						<a href="<%=customerDetails%>" style="text-decoration: none;"><span class="top_up"><img src="/IFLService-theme/images/groupqueuegray.png" style="padding-right:4px;"/>Customer Details </span></a>
					</div>
				</li>

			</ul>
		</div>
	</div>
</div>
<script>

 

AUI().ready(function(A) {
	
	$('.topnav_tabs .top_up').addClass('active');
	$('#casestart .top_up a').addClass('active');
	
	
				
});




</script>
