<%@ include file="/jsp/init.jsp" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:resourceURL id="getFundMasters" var="getFundMasters" />
<portlet:resourceURL id="getUlipPoliciesByCustId" var="getUlipPoliciesByCustId" />
<portlet:resourceURL id="getCustomer" var="getCustomer" />
<portlet:resourceURL id="getPolicyFunds" var="getPolicyFunds" />
<portlet:resourceURL id="saveFundswitch" var="saveFundswitch" />
<portlet:resourceURL id="getPolicyInfoById" var="getPolicyInfoById" />
<script src="/IFLService-theme/js/js-dev/renewalPremiumReceipt.js"></script>

<script>
	var renewalPNURLObj = {};
	renewalPNURLObj.getUlipPoliciesByCustId= '<%= getUlipPoliciesByCustId %>&<portlet:namespace/>custId=1'; //TODO:  change the custID param
	renewalPNURLObj.getFundMasters 		= '<%= getFundMasters %>&<portlet:namespace/>';
	renewalPNURLObj.getCustomer			= '<%= getCustomer %>&<portlet:namespace/>custId=1';
	renewalPNURLObj.getPolicyFunds			= '<%= getPolicyFunds %>&<portlet:namespace/>policyNum=';	
	renewalPNURLObj.getPolicyInfoById		= '<%= getPolicyInfoById %>&<portlet:namespace/>policyNum=';	
	renewalPNURLObj.portletNamespace		= '<portlet:namespace/>';
</script>

    <div class="RPNPolicyDtails" style="display:none;">
	    <div class="form_sub noDefault">     	
	        <aui:input type="text" name="RPNtxtPolicyStatus" label="Policy Status" id="RPNtxtPolicyStatus" placeholder="Inforce"></aui:input>
	        <div class="clr"> </div>
	    </div>           
	        
	    <div class="form_sub noDefault" style="text-align:center">         
	         <aui:input type="text" name="RPNtxtProductName" id="RPNtxtProductName" label="Product Name" placeholder="India first mediclaim plan"></aui:input>
	        <div class="clr"> </div>
	    </div>
	    
	    <div class="clr"> </div>
	     	    
	    <div class="RPNPolicyForm" style="display:none;">
	    	<div class="clr"> </div>
	    	<h5>Please select the required details</h5>
	    	<div class="form_sub noDefault">
		    	<aui:select name="RPRYear" id="RPRYear" label="Financial Year">
		    		<aui:option>select</aui:option>
		    		<aui:option>2013-14</aui:option>
		    		<aui:option>2012-13</aui:option>
		    	</aui:select>       
	    	</div>
	    	<div class="clr"> </div>
	    	<div style="display:none;" class="RPReceiptsList">
	    		<table width="100%" border="0" cellspacing="0" cellpadding="0">
	    			<tr>
	    				<td colspan="3" align="center" valign="middle" bgcolor="#eff7fa" class="table_colum_last">
	    					List of Receipts
	    				</td>
	    			</tr>
	    			<tr>
	    				<td align="center" valign="middle" class="table_colum">1</td>
	    				<td align="center" valign="middle" class="table_colum_last"><a href="#" class="receiptLink">Renewal Premium Receipt - 2/2014</td>
	    			</tr>
	    			<tr>
	    				<td align="center" valign="middle" class="table_colum">2</td>
	    				<td align="center" valign="middle" class="table_colum_last"><a href="#" class="receiptLink">Renewal Premium Receipt - 6/2013</td>
	    			</tr>
	    			<tr>
	    				<td colspan="2" align="center" valign="middle" class="table_colum_last">&nbsp;</td>	    				
	    			</tr>
	    		</table>
	    	</div>    
	    </div>
	    <div class="clr"> </div>
	    <div class="RPNPolicyReceipts" style="display:none;">
	    	<div class="clr"> </div>
	    	<div class="table_heading left" style="margin-top:10px;">
	    		<label class="Rnlbl">Renewal Premium Recipt</label>
	    	</div>
	    	<div class="table_heading right DownloadPrintBtns"> 	   
		    	<aui:button name="btnRPNDownload" id="btnRPNDownload" value="Download"></aui:button>
		    	<aui:button id="btnRPNPrint" name="btnRPNPrint" value="Print"></aui:button>  
		    </div>
	    	<div class="clr"> </div>
	    	<div class="RPNFormCont span12">
	    		<embed src = "/IFLService-theme/images/pdf-sample.pdf" height = 800px class="span11">
	    	</div>
	    	<div class="clr"> </div>	    	
	    </div>
	    
	    <div class="clr"> </div>
	    	    	   
	    <div class="RPNTracker" style="display:none;">
			<%@ include file="/jsp/serviceTracker.jsp"%>
		</div>        
	</div>