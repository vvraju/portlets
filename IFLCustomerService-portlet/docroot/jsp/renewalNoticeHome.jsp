
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:renderURL var="renewalNotice">
	<portlet:param name="action" value="renewalNotice" />
</portlet:renderURL>

<%-- <%@ include file="/jsp/subHeader.jsp"%>
 --%>
<div class="b-content"> 	 
    <div class="row-fluid"> 
		<div class="span12">
	        <div class="span3 profile-list-alerts-big nprofile-list-alerts-big" style="background:#b1d8e7;">
				<div class="">				
					<span style="height:auto;">
						<p class="icon_images" style=""> <img src="/IFLService-theme/images/services_images/RenewalNoticeBig.png" width="53px" height="46px" style="margin-top:10%;"> </p>
						
					</span>
					<span class="Renewalsingleline">Renewal Notice</span>					
				</div>	
				<div class="clr"></div>                
			</div>

			<div class="span9 span9-margin-left rightsisiexplanation">
				<div class="tab_con_right tab2content" style="width:auto; margin:19px 10px 34px 10px;"> 
				<h3>Renewal Notice</h3>
					<p class="marginclas"> 
                       'Fund Switch' is a transaction ,  which changes the allocation of the existing funds as per the request received.When you place a request
                        for switch, we transfer your units from current funds to the desired fund.The change is applicable only to the existing fund allocation,
                        and your future premiums continue to be allocated in the same proportion as it exists today, before you place your switch request. </p>
					<p class="marginclas"> Free Fund Switch is allowed FOUR times in a policy year , but cannot be carried forward to the next year. For any additional switch in a
                        policy year , Rs.100 would be charged per switch.

                   </p> 
					<div style="height:10px;margin-top:-20px;"> </div>
					 <a href="/web/services/renewalnoticeaction" rel="/web/services/renewalnoticeaction" target="_self" class="btn right" target="6" style="margin-right:12px;margin-top:19px;"> Action </a>					  				
				</div>
			</div>
		</div>
    </div>
</div>

<%-- <%@ include file="/jsp/subFooter.jsp"%> --%>

<div class="errorDialog"></div>
<script>
AUI().ready(function(A) {
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .renewal_notice_nav').addClass('active');	
});
</script>