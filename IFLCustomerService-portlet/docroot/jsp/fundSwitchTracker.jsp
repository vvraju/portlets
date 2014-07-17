<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>

<div class="row-fluid servcebox">
	<div class="span12 trackreq_con">
		
		<div class="span5 left_tab">
			
			
				<div class="trackreq"> <P class="trackheading">
				<liferay-ui:message key="services.premiumredirect.fundtracker.trackrequest" /></P></div>
				 
				  <div class="row-fluid">
				
	            <div class="span12 left_details takeyour-request"> 
	             <div class="span7 servetrcimgdiv">	
				      
					  <img src="<liferay-ui:message key="services.renewalnotice.tracker.image.categoryplan" />"> 
					  </div>
						
				        <div class="span5 detailslist "> 
							  <p style="font-weight:bold;"> <liferay-ui:message key="services.premiumredirect.fundtracker.type" />: <span id="custTypeName"></span> </p> 

							 <p style="font-weight:bold;"> <liferay-ui:message key="services.premiumredirect.fundtracker.requestid" />: <span id="custSRNum"></span> </p>

						     <p style="font-weight:bold;"> <liferay-ui:message key="services.fundswitch.template.date" />:  <span id="custSRDate"></span></p>

						     <p style="font-weight:bold;"> <liferay-ui:message key="services.fundswitch.template.time" />:  <span id="custSRTime"></span></p>
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
				<a class="tooltips helptip" href="#"><b class="question">&nbsp;?&nbsp;</b>
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
					style=" ">
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
					style=" ">
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
					style=" ">
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
					style=" ">
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
<div class="row-fluid">
  <div class="span12 trackborder">
  </div>
</div>


<script>
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
</script>

<script>
$(document).ready(function(){
	
	
	
	$(document).ready(function() {
		
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

});
	
	/*$('.firstTT').tooltipster('show');
	$('.firstTT').addClass('blue-active-box');
	
	$('#custSRNum').text(sessionStorage.custSRNum);*/
});
</script>
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


<div class="clr"></div>