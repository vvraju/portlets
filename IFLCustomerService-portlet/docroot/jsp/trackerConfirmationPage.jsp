<%@ include file="/jsp/init.jsp" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>


<%
	Calendar calendar = Calendar.getInstance();
	
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	String dateNow = format.format(calendar.getTime());
	String timeNow = timeFormat.format(calendar.getTime());
	
	int dayLimit = calendar.get(Calendar.HOUR_OF_DAY);
	
	Calendar approvalDate = Calendar.getInstance();
	
	if(dayLimit>14){
		approvalDate.add(Calendar.DATE, 1);	
	}
	
	String approvalDateNow = format.format(approvalDate.getTime());
	String approvalTimeNow = timeFormat.format(approvalDate.getTime());
	
	Calendar calendar1 = Calendar.getInstance();
	calendar1.add(Calendar.DATE, 5);
	
	SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
	String lastDate = newFormat.format(calendar1.getTime());
 %>

<div style="font-size: 13px;padding: 0px 0px 30px 35px;">

	<h3 style="color:#0aa8f2;">Tracker Status Confirmation</h3>
	<p style="margin-top:10px;margin-bottom:15px;text-align: justify;display: block;">
	    <liferay-ui:message key="services.fundswitch.heading.content" /><span style="color: #666;font-weight:bold;">&nbsp;${customerBean.srNumbr}</span> 
	    <liferay-ui:message key="services.fundswitch.heading.trackersrnum" /></p>
</div>

<div class="row-fluid servcebox">
<%--  <div class="topupPaymentConfirmation" style="display:none;margin-left:60px;;width:100%;line-height:45px;height:28px;vertial-align:middle;" >
    
    	           	 	 		
		<div style="border: 0px;border-style: ridge;">
		<img alt="" src="<liferay-ui:message key="services.topup.heading.topup.image.payment.successful" />" style="float:left;"/>
			<p>
				<b style="font-size: 19px;margin-left: 6px;line-height:29px;"><liferay-ui:message key="services.topup.heading.topup.payment.successful" /></b>
			</p>
		</div>
    <br>
    </div> --%>
	<div class="span12 trackreq_con">
	
		<div class="span5 left_tab">
			
				<div class="trackreq"> <h4> <liferay-ui:message key="services.premiumredirect.fundtracker.trackrequest" /> </h4></div>
				  <div class="row-fluid">
				
	            <div class="span12 left_details takeyour-request"> 
	             <div class="span7 servetrcimgdiv">	
				      
					  <img src="<liferay-ui:message key="services.renewalnotice.tracker.image.categoryplan" />"> 
					  </div>
						
				        <div class="span5 detailslist "> 
							  <p> <liferay-ui:message key="services.premiumredirect.fundtracker.type" />:  <span id="custTypeName">${customerBean.typeDesc}</span> </p> 

							 <p> <liferay-ui:message key="services.premiumredirect.fundtracker.requestid" />: <span id="custSRNum">${customerBean.srNumbr}</span> </p>

						     <p> <liferay-ui:message key="services.fundswitch.template.date" />:  <span id="custSRDate"><%=dateNow %></span></p>

						     <p> <liferay-ui:message key="services.fundswitch.template.time" />:  <span id="trckrSRTime"></span></p>
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
		     <div class="span2 mytotbox" style="width:13% !important ;margin-left:0px;border-left:1px solid #ccc;">
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
			<span class="lidate"><%=dateNow%>
				
		
		</span>
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
					style=" ">
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
					style="  ">
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
					style="  ">
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
					style=" ">
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
					style="  ">
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
					style="  ">
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
					style="   ">
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
			
			
	
		
		 
			 var currentTime = new Date();
				var hours = currentTime.getHours();
				var minutes = currentTime.getMinutes();

				if (minutes < 10)
				minutes = "0" + minutes

				var suffix = "AM";
				if (hours >= 12) {
				suffix = "PM";
				hours = hours - 12;
				}
				if (hours == 0) {
				hours = 12;
				}
				var timess= hours + ":" + minutes + " " + suffix ;
				//document.write("<b>" + hours + ":" + minutes + " " + suffix + "</b>")
			    $("#trckrSRTime").append(timess);
		  
		 });
		
		
		
	</script>

<script>
	$('.topnav_tabs span').removeClass('active');
	$('.topnav_tabs .fund_switch_nav').addClass('active');
	
   
</script>


<div class="clr"></div>


