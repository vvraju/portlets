
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>

<div style="font-size: 13px;padding: 0px 0px 30px 35px;">
<div class="row-fluid">
 <div class="span12">
   <ul class="fundnav">
      <li class="pipe">Know about</li>
      <li class="pipe" id="toppolicy" >Select Policy</li>
       <li class="pipe" id="topallocation">Allocation</li>
        <li class="pipe" id="topcnfrm">Confirmation</li>
        <li class="pipe" id="toppayment">Payment</li>
         <li class="pipe" style="color: #02a9f7" id="topacknwldg">Acknowlegement</li>
      
   </ul>
 </div>
</div>
	<h3 style="color:#0aa8f2;"><liferay-ui:message key="services.topup.heading.payment.confirmation" /></h3>
	<p><liferay-ui:message key="services.renewalnotice.tracker.text.description.para1" /> </p>
	<p><liferay-ui:message key="services.renewalnotice.tracker.text.description.para2" /> </p>
</div>
<div class="topupPaymentConfirmation" style="display:none;margin-left:60px;;width:100%;line-height:45px;height:28px;vertial-align:middle;" >
    
    	           	 	 		
		<div style="border: 0px;border-style: ridge;">
		<img alt="" src="<liferay-ui:message key="services.topup.heading.topup.image.payment.successful" />" style="float:left;"/>
			<p>
				<b style="font-size: 19px;margin-left: 6px;line-height:29px;"><liferay-ui:message key="services.topup.heading.topup.payment.successful" /></b>
			</p>
		</div>
    <br>
    </div>
<div class="row-fluid servcebox">
 
	<div class="span12 trackreq_con">
	
		<div class="span5 left_tab">
			
				<div class="trackreq"> <h4> <liferay-ui:message key="services.premiumredirect.fundtracker.trackrequest" /> </h4></div>
				  <div class="row-fluid">
				
	            <div class="span12 left_details takeyour-request"> 
	             <div class="span7 servetrcimgdiv">	
				      
					  <img src="<liferay-ui:message key="services.renewalnotice.tracker.image.categoryplan" />"> 
					  </div>
						
				        <div class="span5 detailslist "> 
							  <p> <liferay-ui:message key="services.premiumredirect.fundtracker.type" />:<span id="custTypeName"></span> </p> 

							 <p> <liferay-ui:message key="services.premiumredirect.fundtracker.requestid" />: <span id="custSRNum"></span> </p>

						     <p> <liferay-ui:message key="services.fundswitch.template.date" />:  <span id="custSRDate"></span></p>

						     <p> <liferay-ui:message key="services.fundswitch.template.time" />:  <span id="custSRTime"></span></p>
			           </div>
					   <div class="clear"></div>
			
		       </div>
		       </div>
     </div>
		

				
		<div class="span7 tabs_right" style="margin-left:0px;">
		<div class="row-fluid">
		<div class="span12">
		   <div class="row-fluid">
		   <!-- <div class="span12 trackreq">  -->
		   <div class="span12 "> 
		    <div class="row-fluid">
		     <div class="span2 mytotbox" style="width:13% !important;margin-left:0px;border-left:1px solid #ccc;">
		       <div class="row-fluid services">
		         <ul class="right-arrow1">
				<li> <a style="padding-left: 3px;"> <liferay-ui:message key="services.premiumredirect.fundtracker.approval" /></a>   </li>
				</ul>
		      
		       </div>
		       
		         <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				<li style="position: relative;">
		  
		  <a class="tabshowdiv tooltip1"  id="tab11" href="#" > <em class="innbdr" > </em> </a>
			<div 
					style="top:60px; z-index: 9999; position: absolute; display:none; width:350px; height:100px; border: 1px solid #ccc; background-color: #f8f8f8;">
						
						<div style='float:right;width:340px; height:100px;text-align:left; font-size:11px;font-family:arial; line-height: 1.75;'>
						<div style="padding-top: 10px;"> <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; "><span id="tooltext"> </span> Order has been placed. </strong><br>Sunday 5th march | 02:45 pm | Payment approved</div> </div>
					
					<div style="clear: both;"></div>
			</div> </li>
				</ul>
		         </div>
		       </div>
		       
		     </div>
		     <div class="span2 mytotbox"  style="margin-left:0px;">
		       <div class="row-fluid  services">
		         <ul class="right-arrow1">
				<li> <a class="arrow_img service_img2"> <liferay-ui:message key="services.premiumredirect.fundtracker.processing" /> </a></li>
				</ul>
		      
		       </div>
		       <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				<li style="position: relative;">
			<a class="tabshowdiv tooltip2 "  id="tab22"  href="#"> <em class="innbdr" > </em> </a>
			
			<a class="tabshowdiv tooltips " id="tab33" href="#"> <em class="innbdr" > </em> </a>
			<div 
					style="top:60px; z-index: 9999; position: absolute; display:none; width:350px; height:100px; border: 1px solid #ccc; background-color: #f8f8f8;">
						
						<div style='float:right;width:340px; height:100px;text-align:left; font-size:11px;font-family:arial;line-height: 1.75;'>
						<div style="padding-top: 10px;"> <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900;"><span id="tooltext1"> </span> Order has been placed. </strong><br>Sunday 5th march | 02:45 pm | Payment approved</div> </div>
					
					<div style="clear: both;"></div>
			</div>
		</li>
				</ul>
		         </div>
		       </div>
		     </div>
		     <div class="span2 mytotbox"  style="margin-left:0px;">
		       <div class="row-fluid services">
		         <ul class="right-arrow1">
				<li> <a class="arrow_img service_img3"> <liferay-ui:message key="services.premiumredirect.fundtracker.confirmation" /> </a>  </li>
				</ul>
		      
		       </div>
		       
		         <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				<li style="position: relative;">
			<a class="tabshowdiv tooltip1 " id="tab44"  href="#"> <em class="innbdr" > </em> </a>
			<div id=""
					style="top:60px; z-index: 9999; position: absolute; display:none; width:350px; height:100px; border: 1px solid #ccc; background-color: #f8f8f8;">
						
						<div style='float:right;width:340px; height:100px;text-align:left; font-size:11px;font-family:arial;line-height: 1.75;'>
						<div style="padding-top: 10px;"> <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900;"><span id="tooltext2"> </span> Order has been placed. </strong><br>Sunday 5th march | 02:45 pm | Payment approved</div> </div>
					
					<div style="clear: both;"></div>
			</div>
		</li>
				</ul>
		         </div>
		       </div>
		       
		     </div>
		     <div class="span2 mytotbox"  style="margin-left:0px;">
		       <div class="row-fluid services">
		         <ul class="right-arrow1">
				<li class="span12 letter_insu_desk"> <a class="span12 arrow_img service_img4" style="padding:0px;"> <liferay-ui:message key="services.premiumredirect.fundtracker.letterissuance" /></a>  </li>
				</ul>
		      
		       </div>
		       
		         <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				 <li style="position: relative;">
			<a class=" tooltip1 tabshowdiv" id="tab55" href="#"> <em class="innbdr" > </em> </a>
			<div id="target4"
					style="top:60px; z-index: 9999; position: absolute; display:none; width:350px; height:100px; border: 1px solid #ccc; background-color: #f8f8f8;">
						
						<div style='float:right;width:340px; height:100px;text-align:left; font-size:11px;font-family:arial;line-height: 1.75;'>
						<div style="padding-top: 10px;"> <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900;"><span id="tooltext3"> </span> Order has been placed. </strong><br>Sunday 5th march | 02:45 pm | Payment approved</div> </div>
					
					<div style="clear: both;"></div>
			</div>
		</li>
				</ul>
		         </div>
		       </div>
		       
		     </div>
		     <div class="span2 mytotbox"  style="margin-left:0px;">
		       <div class="row-fluid services">
		         <ul class="right-arrow1">
					<li> <a class="arrow_img service_img5">  <liferay-ui:message key="services.premiumredirect.fundtracker.shipping" /> </a> </li>
				</ul>
		      
		       </div>
		       
		         <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				<li style="position: relative;">
			<a class="tabshowdiv tooltip3 " id="tab66"href="#"> <em class="innbdr" > </em> </a>

			<a class="tabshowdiv tooltips" id="tab77"  href="#"> <em class="innbdr" > </em></a>
			<a class="tabshowdiv tooltips" id="tab88" href="#"> <em class="innbdr" > </em></a>
			<div id="target5"
					style="top:60px; z-index: 9999; position: absolute; display:none; width:350px; height:100px; border: 1px solid #ccc; background-color: #f8f8f8;">
						
						<div style='float:right;width:340px; height:100px;text-align:left; font-size:11px;font-family:arial;line-height: 1.75;'>
						<div style="padding-top: 10px;"> <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900;"><span id="tooltext4"> </span> Order has been placed. </strong><br>Sunday 5th march | 02:45 pm | Payment approved</div> </div>
					
					<div style="clear: both;"></div>
			</div>
		</li>
		
				</ul>
		         </div>
		       </div>
		       
		     </div>
		     <div class="span2 mytotbox"  style="width:20% !important;margin-left:0px;">
		       <div class="row-fluid services">
		         <ul class="right-arrow1 ">
				<li > <a class="arrow_img service_img6"> <liferay-ui:message key="services.premiumredirect.fundtracker.delivery" />  </a>   </li>
				</ul>
		      
		       </div>
		       
		         <div class="row-fluid ">
		         <div class="span12 tooltips">
		         <ul class="ttip">
				<li  class="Delivery">
			<span class="lidate">
				<a class="tooltips helptip" href="#"><span class="question">&nbsp;?&nbsp;</span>
		<img src="images/icon-help.png" width="12" title="help">
		<span>
		<liferay-ui:message key="services.premiumredirect.fundtracker.fundswitchapproval.datetime" /><span class="question">&nbsp;?&nbsp;</span></span>
	   </a>

			</span>
		</li>
				</ul>
		         </div>
		       </div>
		       
		     </div>
		   
         </div>
         </div>
         </div>
       

	

		<div class="clear"></div>
	</div>
	</div>
	<div class="row-fluid">
	 <div class="span10">
	<!-- first tab -->

				<div class="opendivnew opendiv" id="tab11div"
					style="">
					<div style="position: absolute; top: -17px; left:8%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						 <strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>


				</div>

				<!-- two tab -->


				<div class="opendiv" id="tab22div"
					style="">
					<div style="position: absolute; top: -17px; left:24%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
					
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext1" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>


				</div>


				<!-- three tab -->


				<div class="opendiv" id="tab33div"
					style="">
					<div style="position: absolute; top: -17px; left:29%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext2" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>


				</div>




				<!-- four tab -->


				<div class="opendiv" id="tab44div"
					style="">
					<div style="position: absolute; top: -17px; left:46%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext3" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>

				</div>

				<!-- five tab -->

				<div class="opendiv" id="tab55div"
					style="">
					<div style="position: absolute; top: -17px; left:68%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						
							<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext4" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>

				</div>


				<!-- six tab -->

				<div class="opendiv" id="tab66div"
					style="">
					<div style="position: absolute; top: -17px; left:83%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext5" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>
				</div>
				<div class="opendiv" id="tab77div"
					style="">
					<div style="position: absolute; top: -17px; left:87%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext6" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>
				</div>
				<div class="opendiv" id="tab88div"
					style="">
					<div style="position: absolute; top: -17px; left:92%;">
						<img src="/IFLService-theme/images/services_images/tooltiparrow.png" />
					</div>

					<div style="padding: 7px 10px 0px 20px;">
						
						<strong style="font-size:14px;font-family:arial;color:#0AA8F2;font-weight:900; ">
						  <h6 id="tooltext6" style=""> </h6> <h6 style="padding-right:20px;">Order has been placed.</h6> 
						  </strong>
						  <h5>Sunday 5th march | 02:45 pm | Payment approved</h5>
					</div>
				</div>
				</div>
            <div class="span2"></div>
	
	</div></div>
</div>
</div>
<div class="clr"></div>
<script type="text/javascript">
		$(document).ready(function() {
              
              $("a#tab11").css("background-color", "#26b6f3");
            
			
			$('.tabshowdiv').mouseover(function() {
				$(".tabshowdiv").removeClass("coloredImg");
				var id = this.id;
				$(this).addClass("coloredImg");
				$('.opendiv').hide();
				$('#' + id + 'div').show();
				$("a#tab11").css("background-color", "#949494");
				
				
			});
			$('.tabshowdiv').mouseout(function() {
				$(".tabshowdiv").removeClass("coloredImg");
				var id = this.id;
				$(this).addClass("coloredImg");
				$('.opendiv').hide();
				$('#' + id + 'div').hide(5000);
				
				
			});
			  setTimeout(function (){
	 				 $(".opendivnew").css("display", "block");},2000)
			
			
		});
	</script>

<script>
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
	
   /*  $(document).ready(function() {
	
    	//var containerimg = $("#target1");
		
	$("#toggle1").mouseenter(function(event) {
		var containerimg = $("#target1");
			event.preventDefault();
			if (containerimg.is(":visible")) {
				containerimg.slideUp(200);
			} else {
				containerimg.slideDown(200);
			}
		});
		$("#toggle1").mouseleave(function(event) {
			var containerimg = $("#target1");
			event.preventDefault();
			containerimg.slideUp(200);
		});

    $("#toggle2").mouseenter(function(event) {
    	var containerimg = $("#target2");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle2").mouseleave(function(event) {
		var containerimg = $("#target2");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	
	$("#toggle3").mouseenter(function(event) {
		var containerimg = $("#target2");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle3").mouseleave(function(event) {
		var containerimg = $("#target2");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	$("#toggle4").mouseenter(function(event) {
		var containerimg = $("#target3");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle4").mouseleave(function(event) {
		var containerimg = $("#target3");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	$("#toggle5").mouseenter(function(event) {
		var containerimg = $("#target4");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle5").mouseleave(function(event) {
		var containerimg = $("#target4");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	$("#toggle6").mouseenter(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle6").mouseleave(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	$("#toggle7").mouseenter(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle7").mouseleave(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		containerimg.slideUp(200);
	});
	$("#toggle8").mouseenter(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		if (containerimg.is(":visible")) {
			containerimg.slideUp(200);
		} else {
			containerimg.slideDown(200);
		}
	});
	$("#toggle8").mouseleave(function(event) {
		var containerimg = $("#target5");
		event.preventDefault();
		containerimg.slideUp(200);
	});

}); */
</script>

<!-- <script>
$(document).ready(function(){
	$('.firstTT').tooltipster({
		position: 'bottom-left',		
		content: '<span><strong>Your Fund Switch Order has been placed. </strong><br>  | Payment approved</span>'		
	});
	
	/*$('.firstTT').tooltipster('show');
	$('.firstTT').addClass('blue-active-box');
	
	$('#custSRNum').text(sessionStorage.custSRNum);*/
});
</script> -->

<div class="clr"></div>
<!-- <style>
.tooltipster-content  {
	background-color:#f0f0f0 !important;
}

.aui .tooltipster-fade-show {
	opacity: 1 !important;
	border: 2px solid #c9c9c9 !important;
}
</style> -->