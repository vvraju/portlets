
<%@ include file="/jsp/subHeader.jsp" %> 
<div class="clr"></div>
<div class="b-content">
<div class="Profile_head tab2content" style="margin-top:10px;"> 
    <h3>My Profile</h3>
    
    <div class="clear"></div> <br><br>              
</div>
</div>

<%@ include file="/jsp/addressChangeTemplate.jsp"%>
 

<div class="clr" style="padding-bottom:20px;"></div>
<div class="errorDialog"></div>


<script>
AUI().ready(function(A) {
	
	
	sessionStorage.corporateAddressChange = "false";
	
	addressChange.initWindow();
	addressChange.setUp();
	sessionStorage.corporateAddressChange="false";
				
});

</script>
