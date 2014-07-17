<%@ include file="/jsp/init.jsp" %>
<<portlet:defineObjects/>

<script type="text/javascript" src="<%=renderRequest.getContextPath() %>/js/jquery_1.10.2.js"></script>
<script  type="text/javascript" src="<%=renderRequest.getContextPath() %>/js/jSignature.js"></script>


 <script type="text/javascript">
 $(document).ready(function() {
   $("#signature").jSignature({color:"#00f",lineWidth:2, width:300,height:150});
   
   $('#clear').click(function(){
	   $("#signature").jSignature('clear');
   });
   
   $('#save-image').click(function(){
		 //alert('in click');
		 
		var data= $("#signature").jSignature("getData");
		//alert(data)
		var i=new Image();
		i.src=data;
		//alert(data);
		$("#savedimg").html(i);
		
	 });
 });

 </script>
 <div class="tab1content" style="min-height:292px;_height:292px;height:auto;"> 
 
  <b>Digital Signature</b>
  <br/>
  <br/>
 
 <div >
 
 <div style="width:400px;height:200px;border: 1px solid black" id="signature" ></div>
 
 
 </div>
 <p>
 <button id="clear"> Clear </button>
 <button id="save-image" >Save</button> </p>
 
 <div id="savedimg"></div></div>