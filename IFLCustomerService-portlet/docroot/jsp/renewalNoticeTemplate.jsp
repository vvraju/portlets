
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:resourceURL id="getFundMasters" var="getFundMasters" />
<portlet:resourceURL id="getUlipPoliciesByCustId" var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFunds" var="getPolicyFunds" />
<portlet:resourceURL id="saveFundswitch" var="saveFundswitch" />
<portlet:resourceURL id="getPolicyInfoById" var="getPolicyInfoById" />
<portlet:resourceURL id="getPolicyYearsById" var="getPolicyYearsById" />

<portlet:resourceURL id="getRenewalNotice" var="getRenewalNotice" >
</portlet:resourceURL>
<portlet:renderURL var="renewalNoticeHome">
	<portlet:param name="action" value="renewalNoticeHome" />
</portlet:renderURL>
<portlet:resourceURL id="emailRNpolicyURL" var="emailRNpolicyURL"></portlet:resourceURL>
<script src="/IFLService-theme/js/js-dev/renewalNotice.js"></script>

<script>
	var renewalNoticeURLObj = {};
	renewalNoticeURLObj.getUlipPoliciesByCustId= '<%= getUlipPoliciesByCustId %>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	renewalNoticeURLObj.getFundMasters 		= '<%= getFundMasters %>&<portlet:namespace/>';
	renewalNoticeURLObj.getCustomer			= '<%= getCustomer %>&<portlet:namespace/>custId=1';
	renewalNoticeURLObj.getPolicyFunds		= '<%= getPolicyFunds %>&<portlet:namespace/>policyNum=';
	renewalNoticeURLObj.getPolicyInfoById	= '<%= getPolicyInfoById %>&<portlet:namespace/>policyNum=';
	renewalNoticeURLObj.getPolicyYears		='<%=getPolicyYearsById%>&<portlet:namespace/>policyNum=';
	renewalNoticeURLObj.getEmailPolicyUrl	= '<%=emailRNpolicyURL%>';
	
	renewalNoticeURLObj.portletNamespace		= '<portlet:namespace/>';
</script>

    
    
    <div class="RNPolicyDtails" style="display:none;">
	    <div class="form_sub noDefault"> 
	    <label class="" style="">Policy Status</label>    	
	        <input type="text" name="RNtxtPolicyStatus" id="RNtxtPolicyStatus" placeholder="Inforce" readonly="readonly" style="width:130px;" />       
	    </div>           
	        
	  
	 	    <div class="form_sub noDefault" style="text-align:center">  
	 	    <label class="" style="">Product Name</label>       
	         <input type="text" name="RNtxtProductName" id="RNtxtProductName"  placeholder="India first mediclaim plan" readonly="readonly" style="width:130px;"/>
	      
	    </div>
	        <div class="form_sub noDefault rightfield">
	        <label class="" >Next Premium Due Date</label>
	         <input type="text" name="RNtxtDueDate" id="RNtxtDueDate"  readonly="readonly" style="width:130px;" />
		
		

		</div>
		
		

	    <div class="clr"> </div>

		 <br>
	    <div class="form_sub noDefault" style="text-align:left;margin-top:20px;width:100%;">

	<!--     <div class="form_sub noDefault  form_subdef" style="text-align: center;">
 -->
	   <%--  <label class="control-label"><liferay-ui:message key="services.renewalnotice.nextpremiumduedate" /> --%>
	       
	      <aui:select label="Financial Year" name="RNpol_fincyear" id="RNpol_fincyear">
		<aui:option value="0" selected="true"><liferay-ui:message key="services.downloadpolicy.selectrequireddetails.selectyear" /> </aui:option>
		</aui:select>
	    
	    </div> 
	    
	    
	   
	    
	    <div class="table_heading right submitBtns"> 	   
	    	<aui:button name="btnRNProceed" id="btnRNProceed" value="Submit"></aui:button>
	    	<a href="<%=renewalNoticeHome%>" class="btn">Cancel</a>
	    </div>
	    
	    <div class="clr"> </div>	    
	    
	    <div class="RNPolicyForm" style="display:none;">
	    	<div class="clr"> </div>
	    	<div class="table_heading left" style="margin-top:10px;">
	    		<label class="Rnlbl"><liferay-ui:message key="services.renewalnotice.renewalnoticeform" /></label>
	    	</div>
	    	<div class="right DownloadPrintBtns"> 	   
		    	<aui:button name="btnRNDownload" id="btnRNDownload" value="Download" onClick="<%=getRenewalNotice.toString()%>"></aui:button>
		    	<aui:button name="btnRNEmail" id="btnRNEmail" value="&nbsp;&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;" ></aui:button>
		    	<aui:button name="btnRNPrint" value="&nbsp;&nbsp;&nbsp;Print&nbsp;&nbsp;&nbsp;" onclick="callPrint();"/>
		    </div>
	    	<div class="clr"> </div> <br />
	    	<div class="span10 printable" style="margin-left: 9px;">
	    		<iframe  src = "/IFLService-theme/images/my.pdf" height = 800px class="span11" id="iframeprint"  accesskey="true"></iframe >
	    	</div>
	    	
	    	<div class="clr"> </div>
	    	<%-- <div class="table_heading right DownloadPrintBtns"> 	   
		    	<aui:button name="btnRNOk" id="btnRNOk" value="Confirm"></aui:button>
		    	<aui:button name="btnRNOk" id="btnRNOk" value="Cancel"></aui:button>		    	 
		    </div> --%>
	    </div>
	    
	    <div class="clr"> </div>
	    	    	   
	    <div class="RNTracker" style="display:none;">
			<%@ include file="/jsp/serviceTracker.jsp"%>
		</div>        
	</div>
	
	<script type="text/javascript">

/* $('#iframeprint').load(function(){
	
	callPrint("iframeprint");
	
}); */

	  //initiates print once content has been loaded into iframe
	  function callPrint(iframeId) {
	   
	      $('#iframeprint').focus();

	      var iframeObject = document.getElementById('iframeprint');
	      //iframeObject=window.open('/IFLService-theme/images/my.pdf','iframeObject','width=500,height=600');
	      iframeObject.contentWindow.print();
	      
	      
	  }
	  

</script>