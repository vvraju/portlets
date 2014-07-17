

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:resourceURL id="searchPolicy" var="searchPolicy" />
<portlet:resourceURL id="getPoliciesByCustId" var="getPoliciesByCustId" />
<portlet:resourceURL id="getLatestQRCs" var="getLatestQRCs" />
<script src="/IFLService-theme/js/js-dev/jquery.slimscroll.js"></script>
<script>
	var profile360URLObj = {};
	profile360URLObj.searchPolicy			= '<%= searchPolicy %>&<portlet:namespace/>policyNum='; 
	profile360URLObj.getPoliciesByCustId 	= '<%= getPoliciesByCustId %>&<portlet:namespace/>custId=';// + commonObj.custId;
	profile360URLObj.getLatestQRCs			= '<%= getLatestQRCs %>&<portlet:namespace/>custId=';//+ commonObj.custId;
</script>

<script>


$(function() {
	$('#scrollDiv').slimscroll({
		height : '150px'
	});
	
});

</script>
	<div class="profilecase1" style="border-right:1px solid #bcbec0;">
		<div class="profile_info">
        	<p class="img-responsive" style="line-height:0;"> <img src="/IFLService-theme/images/services_images/profile_pic.png"  alt="Profile picture" style="line-height:0;" /> </p>
        </div>
    
    
        
        <div class="profilecase2">
       	
       	<div style="width:73%;float:left;">
        <div class="profile_info_dtls">
        	<table width="100%" border="0" cellspacing="1" cellpadding="2">
              <tr>
                <td>Name:</td>
                <td class="personName"></td>
              </tr>
              <tr>
                <td>Birth Date:</td>
                <td class="personBDate"></td>
              </tr>
              <tr>
                <td>Email:	</td>
                <td class="personEmail"></td>
              </tr>
              <tr>
                <td>Mobile:</td>
                <td class="personMobile"></td>
              </tr>
              <tr>
                <td>Language:</td>
                <td class="personLang"></td>
              </tr>
              <tr>
                <td>Role:</td>
                <td class="personRole"></td>
              </tr>
            </table>
        </div>
        </div>
            <div class="span3">
                <div class="like_button tabs_text pink" style="font-size:12px;text-align:center;"> <p class="img-responsive"> <img src="/IFLService-theme/images/services_images/like_button.png"  alt="Profile picture" /> </p> Share <br> of Wallet </div>
            </div>        
        	
            <div class="clear"></div>
        
        <div class="row-fluid profile-list-alerts" style="border-top:1px solid #c2c2c2;">
        	
        	<div class="span12 tabs">
            
            	<div class="profilerighttab">
                	<a href="#allEvents" rel="EV" class="active">
					<span>
                    	<em class="icon_latest_events"></em>
                        Latest Events
                    </span>
					</a>
                </div>
                
              
                <div class="profilerighttab">
                	<a href="#allPolicies" rel="AP">
					<span style="height:58px;">
                    	<em class="icon_policies"></em>
                        All Policies
                    </span>
					</a>
                </div>
              
                
                <div class="profilerighttab">
					<a href="#tab3" rel="BM">
                	<span style="height:58px;background:rgba(255, 255, 255, .4);">
                    	<em class="icon_BMdetails"></em>
                        BM Details
                    </span>
					</a>
                </div>
                
                
                <div class="profilerighttab">
					<a href="#tab4" rel="AL">
                 <span style="height:58px;">
                    	<em class="icon_alerts"></em>
                        Alerts
                    </span>
					</a>
                </div>
			
				<div class="clr"></div>
                
            </div>
            
            
            
            
        </div>
        
        </div>
        
        
        
        
        
        
        
        <div class="clear"></div>
        <div id="scrollDiv" style="height:130px !important; border-top:4px solid #FF797A;">
		<div id="allEvents" style="display: block;">
		</div>
		
		

		<div id="allPolicies" style="display: none;">
			
		</div>
        
		<div id="tab3" style="display: none;">
			<h3 class="prfilecorporate">BM</h3>
			<p class="corporateprgp">Suspendisse potenti. Morbi laoreet magna vitae est mollis ultricies. Mauris eget enim ac justo eleifend malesuada. Proin non consectetur est. Integer semper laoreet porta. Praesent facilisis leo nec libero tincidunt blandit.</p>
		</div>

		<div id="tab4" style="display: none;">
			<h3 class="prfilecorporate">Alerts</h3>
			<p class="corporateprgp">Suspendisse potenti. Morbi laoreet magna vitae est mollis ultricies.</p>
		</div>

   </div>
   
   
   
   
   
   
        
        <div class="profile-status">
        	<span>Profile Completion </span>
            <div class="progress profile-status-bar" style="background-color:#bcbec0;margin-top: 8px;margin-left: 5px;">
            	<div class="bar" style="width: 20%;background-image:linear-gradient(to bottom, #ff8687, #ff8687)"></div></div>
            <span style="margin-top:5px;">30% Complete</span>
        </div>
        <div class="clear"></div>
        <div class="row-fluid" style="border-top:1px solid #8a8b8d;border-bottom:1px solid #8a8b8d;">
        	<div class="span12">
            	<div class="span3 text-center profile-icons">
                	<div><img src="/IFLService-theme/images/services_images/icon-ppl.png"  alt="" /></div>
                </div>
                <div class="span3 text-center profile-icons">
                	<div ><img src="/IFLService-theme/images/services_images/icon-ppl-plus.png"  alt="" /></div>
                </div>
                <div class="span3 text-center profile-icons">
                	<div><img src="/IFLService-theme/images/services_images/icon-time.png"  alt="" /></div>
                </div>
                <div class="span3 text-center profile-icons">
                	<div ><img src="/IFLService-theme/images/services_images/icon-ppl-globe.png"  alt="" /></div>
                </div>
            </div>
        </div>       
    </div>
    <input type="hidden" name="customerId" id="customerId" />
    
    <script src="/IFLService-theme/js/js-dev/profile360.js"></script>