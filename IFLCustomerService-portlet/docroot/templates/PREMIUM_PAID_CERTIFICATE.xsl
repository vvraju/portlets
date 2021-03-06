﻿<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<?xsl-test-case type="text/xml" href=".\PREMIUM_PAID_CERTIFICATE.xml"
      ?>
<xslt:stylesheet xmlns:date="http://exslt.org/dates-and-times" xmlns:str="http://exslt.org/strings" xmlns:xslt="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xf="http://www.ecrion.com/xf/1.0" xmlns:xc="http://www.ecrion.com/2008/xc" xmlns:xfd="http://www.ecrion.com/xfd/1.0" xmlns:svg="http://www.w3.org/2000/svg" xmlns:msxsl="urn:schemas-microsoft-com:xslt" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" extension-element-prefixes="date str">
<xslt:output indent="yes" encoding="utf-8"/>
<xslt:param name="XFCrtLocalDate">2011-03-18</xslt:param>
<xslt:param name="XFCrtLocalTime">21:54:00</xslt:param>
<xslt:param name="XFCrtLocalDateTime">2011-03-18T21:54:00</xslt:param>
<xslt:param name="XFCrtUTCDate">2011-03-18</xslt:param>
<xslt:param name="XFCrtUTCTime">16:24:00</xslt:param>
<xslt:param name="XFCrtUTCDateTime">2011-03-18T16:24:00</xslt:param>
<xslt:param name="XFOutputFormat"/>
<!--
		This stylesheet was generated for a 'en_US' Translation ID. 
		The Translation ID applies to both the whole text in a document and the locale-long and locale-short date formats.
	  -->
<!-- ============================ RAW XSL =============================== -->
<!-- =========================== SCRIPTS ================================ -->
<!-- ========================= ROOT TEMPLATE =========================== -->
<xsl:template match="/">
<fo:root>
<fo:layout-master-set>
		<fo:simple-page-master master-name="Letter Page" page-width="8.500in" page-height="11.000in">
			<fo:region-body region-name="xsl-region-body" margin="1.200in 0.500in 1.200in 0.700in"/>
			<fo:region-before region-name="xsl-region-before" display-align="after" extent="115.200px"/>
			<fo:region-after region-name="xsl-region-after" extent="1.200in"/>
			<fo:region-start region-name="xsl-region-start" extent="0.700in"/>
			<fo:region-end region-name="xsl-region-end" extent="0.700in"/>
		</fo:simple-page-master>
	</fo:layout-master-set>
<fo:page-sequence master-reference="Letter Page">
<fo:static-content flow-name="xsl-region-after" font-size="12pt" font-family="Times">
			<fo:block><fo:table border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(50.000)" column-number="1"/>
<fo:table-column column-width="proportional-column-width(50.000)" column-number="2"/>
<fo:table-body>
<fo:table-row display-align="middle">
<fo:table-cell padding="0.000pt" text-align="left"><fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="bold" font-style="normal">IndiaFirst Life Insurance Company Ltd.</fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="bold" font-style="normal"> </fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="normal" font-style="normal">301, 'B' Wing, The Qube,</fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="normal" font-style="normal">Infinity Park, Dindoshi - Film City Road, </fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="normal" font-style="normal">Malad (East), Mumbai 400 097 </fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="normal" font-style="normal">T +91 22 3325 9500 F +91 22 33259595 </fo:block>
<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-size="8pt" font-weight="normal" font-style="normal">www.indiafirstlife.com</fo:block></fo:table-cell>
<fo:table-cell padding="0.000pt" text-align="left">
<fo:block text-align="right">
<fo:external-graphic src="url(http://192.168.0.46:9090/MyTest-portlet/images/jvlogo.JPG)">
</fo:external-graphic>
</fo:block>
</fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table> </fo:block>
		</fo:static-content>
<fo:static-content flow-name="xsl-region-before" font-size="12pt" font-family="Times">
			<fo:block text-align="right" end-indent="-0.210in">
<fo:external-graphic src="url(http://192.168.0.46:9090/MyTest-portlet/images/newlogo.jpg)" content-width="1.279in" scaling="uniform" content-height="0.832in">
</fo:external-graphic>
</fo:block>
		</fo:static-content>
<fo:static-content flow-name="xsl-region-end" font-size="12pt" font-family="Times">
			<fo:block> </fo:block>
		</fo:static-content>
<fo:static-content flow-name="xsl-region-start" font-size="12pt" font-family="Times">
			<fo:block> </fo:block>
		</fo:static-content>
<fo:flow flow-name="xsl-region-body" font-family="Times" font-size="12pt">
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="bold" font-size="10pt" text-align="center" font-style="normal"> </fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="bold" font-size="10pt" text-align="center" font-style="normal"> </fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="bold" font-size="10pt" text-align="center" font-style="normal">PREMIUM PAID CERTIFICATE FOR THE YEAR <fo:inline>
<xsl:value-of select="/LRNWR/Financial_Year"/>
</fo:inline></fo:block>
			<fo:block font-family="Helvetica" font-weight="bold" font-size="11pt" text-align="left"> </fo:block>
			<fo:block font-family="Helvetica" font-weight="bold" font-size="11pt" text-align="left"><fo:inline text-decoration="no-line-through" font-size="10pt" font-family="Helvetica" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Generation_Date"/>
</fo:inline></fo:block>
			<fo:block font-family="Helvetica" font-weight="bold" font-size="11pt" text-align="left"><fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/OwnerName"/>
</fo:inline></fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/Addrs1"/>
</fo:inline></fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/Addrs2"/>
</fo:inline></fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/Addrs3"/>
</fo:inline></fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/Addrs4"/>
</fo:inline></fo:block>
			<fo:block text-decoration="no-underline no-line-through" font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/Addrs5"/>
</fo:inline><fo:inline font-weight="normal" font-size="10pt"> - <fo:inline>
<xsl:value-of select="/LRNWR/Postcode"/>
</fo:inline></fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"><fo:inline font-size="10pt">
<xsl:value-of select="/LRNWR/MobilePhoneNo"/>
</fo:inline></fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"><fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Email_ID"/>
</fo:inline></fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal" font-size="10pt">Client ID : <fo:inline>
<xsl:value-of select="/LRNWR/Client_ID"/>
</fo:inline></fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">This is to certify that the following payment have been received by us towards the insurance policies held by <fo:inline>

</fo:inline></fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="10pt"  text-align="left" font-style="normal"><xsl:value-of select="/LRNWR/OwnerName"/></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal">
<fo:table table-layout="fixed" width="100%" border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(16.340)" column-number="1"/>
<fo:table-column column-width="proportional-column-width(14.286)" column-number="2"/>
<fo:table-column column-width="proportional-column-width(13.992)" column-number="3"/>
<fo:table-column column-width="proportional-column-width(13.406)" column-number="4"/>
<fo:table-column column-width="proportional-column-width(15.165)" column-number="5"/>
<fo:table-column column-width="proportional-column-width(13.699)" column-number="6"/>
<fo:table-column column-width="proportional-column-width(13.112)" column-number="7"/>
<fo:table-header>
<fo:table-row>
                <fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" font-weight="bold" text-align="center" font-family="Helvetica" font-size="10pt" font-style="normal">Plan Name / Rider</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" font-weight="bold" text-align="center" font-family="Helvetica" font-size="10pt" font-style="normal">Policy No</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" text-align="center" font-weight="bold" font-family="Helvetica" font-size="10pt" font-style="normal">Inst. Premium (Rs.)</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" text-align="center" font-weight="bold" font-family="Helvetica" font-size="10pt" font-style="normal">Premium Frequency</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" font-weight="bold" text-align="center" font-family="Helvetica" font-size="10pt" font-style="normal">Sum Assured (Rs.)</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" font-weight="bold" text-align="center" font-family="Helvetica" font-size="10pt" font-style="normal">Premium Paid</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-decoration="no-underline no-line-through" text-align="center" font-weight="bold" font-family="Helvetica" font-size="10pt" font-style="normal">Tax deduction- Section of IT Act, 1961</fo:block>
                </fo:table-cell></fo:table-row>
</fo:table-header>
<fo:table-body>

<xsl:if test="/LRNWR/Each/Contract_Type_Desc/text()!='IFL MoneyBack Health Plan' ">
<xsl:for-each select="/LRNWR/Each">
<fo:table-row>

                <fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Contract_Type_Desc/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="ContrNo/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Installment_Prem/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Billing_Frequency/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Sum_Assured/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Total_Pre_Paid/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding="2pt">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="Coverage/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell></fo:table-row>
</xsl:for-each>

 </xsl:if>

 <xsl:if test="/LRNWR/Each/Contract_Type_Desc/text()='IFL MoneyBack Health Plan' ">
 <fo:table-row>
                <fo:table-cell border="1pt solid black" padding-top="10px">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
IndiaFirst Money Back Health Insurance Plan
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding-top="15px">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Each/ContrNo/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding-top="15px">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Each/Installment_Prem/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding-top="15px">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Each/Billing_Frequency/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" padding-top="15px">
                  <fo:block text-align="center">
<fo:inline text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:value-of select="/LRNWR/Each/Sum_Assured/text()"/>
</fo:inline>
</fo:block>
                </fo:table-cell><fo:table-cell border="1pt solid black" >
<xsl:for-each select="/LRNWR/Each">                 
<fo:block text-align="center" font-size="10pt">
<xsl:if test="Coverage/text()=&quot;80C&quot;">
<fo:table table-layout="fixed" width="100%" border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(16.340)" column-number="1"/>
<fo:table-body>
<fo:table-row>
   <fo:table-cell border-bottom-style="solid" padding-bottom="5px" padding-top="5px">
   <fo:block>
	<xsl:value-of select="Total_Pre_Paid/text()"/>
	</fo:block>
	</fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table>
</xsl:if> 
<xsl:if test="Coverage/text()=&quot;80D&quot;">
<fo:table table-layout="fixed" width="100%" border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(16.340)" column-number="1"/>
<fo:table-body>
<fo:table-row>
   <fo:table-cell padding-bottom="5px" padding-top="5px">
   <fo:block>
	<xsl:value-of select="Total_Pre_Paid/text()"/>
	</fo:block>
	</fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table>
</xsl:if> 
</fo:block>
</xsl:for-each>
                </fo:table-cell>
<fo:table-cell border="1pt solid black" >
<xsl:for-each select="/LRNWR/Each"> 

<fo:block text-align="center" text-decoration="no-line-through" font-family="Helvetica" font-size="10pt" font-weight="normal" font-style="normal">
<xsl:if test="Coverage/text()=&quot;80C&quot;">
<fo:table table-layout="fixed" width="100%" border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(16.340)" column-number="1"/>
<fo:table-body>
<fo:table-row>
   <fo:table-cell border-bottom-style="solid" padding-bottom="5px" padding-top="5px">
   <fo:block>
	<xsl:value-of select="Coverage/text()"/>
	</fo:block>
	</fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table>
</xsl:if> 
<xsl:if test="Coverage/text()=&quot;80D&quot;">
<fo:table table-layout="fixed" width="100%" border-collapse="collapse">
<fo:table-column column-width="proportional-column-width(16.340)" column-number="1"/>
<fo:table-body>
<fo:table-row>
   <fo:table-cell padding-bottom="5px" padding-top="5px">
   <fo:block>
	<xsl:value-of select="Coverage/text()"/>
	</fo:block>
	</fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table>
</xsl:if> 
</fo:block>
</xsl:for-each>
 </fo:table-cell></fo:table-row>
 </xsl:if>
</fo:table-body>
</fo:table>
</fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">We confirm the receipt of total amount of Rs. <fo:inline>
<xsl:value-of select="/LRNWR/Total_Installment"/>
</fo:inline>  for the financial year  <fo:inline>
<xsl:value-of select="/LRNWR/Financial_Year"/>
</fo:inline>.</fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="bold" font-family="Helvetica" font-size="10pt" font-style="normal">Terms and Conditions</fo:inline></fo:block>

<fo:block padding-top="10px">
<fo:table table-layout="fixed"  border-collapse="collapse">
<fo:table-column column-width="10px" column-number="1"/>
<fo:table-column column-width="520px" column-number="1"/>
<fo:table-body>
<fo:table-row>
   <fo:table-cell padding-top="5px"  padding="2pt">
  <fo:block  font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal">*
  </fo:block>
   </fo:table-cell>
   <fo:table-cell  padding="2pt" >
   <xsl:if test="/LRNWR/Each/Contract_Type_Desc/text()='IFL MoneyBack Health Plan' ">
<fo:block  text-align="justify" font-family="Helvetica" font-weight="normal" font-size="8pt"  font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">Insurance premiums are eligible for tax deductions under Section 80C/80CCC(1)/80D of Income Tax (IT) Act 1961,as applicable.</fo:inline></fo:block>
</xsl:if> 

<xsl:if test="/LRNWR/Each/Contract_Type_Desc/text()!='IFL MoneyBack Health Plan' ">
<fo:block  text-align="justify" font-family="Helvetica" font-weight="normal" font-size="8pt"  font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">Insurance premiums are eligible for tax deductions under Section 80C/80CCC(1)/80D of Income Tax (IT) Act 1961,as applicable.</fo:inline></fo:block>
</xsl:if> 
   </fo:table-cell>
</fo:table-row>
<fo:table-row>
   <fo:table-cell padding-top="5px"  padding="2pt">
   <fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal">*
  </fo:block>
   </fo:table-cell>
   <fo:table-cell   padding="2pt" text-align="justify">
   <fo:block text-align="justify" font-family="Helvetica" font-weight="normal" font-size="8pt"  font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">Please note that all benefits payable under policy, are subject to tax laws and other financial enactments as they may exist from time to time. You are recommended to consult your tax advisor.</fo:inline></fo:block>
   </fo:table-cell>
</fo:table-row>
<fo:table-row>
   <fo:table-cell padding-top="5px"  padding="2pt">
   <fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal">*
  </fo:block>
   </fo:table-cell>
   <fo:table-cell  padding="2pt" text-align="justify">
   <fo:block text-align="justify" font-family="Helvetica" font-weight="normal" font-size="8pt"  font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">This is a computer Generated Letter, no signature required.</fo:inline></fo:block>
   </fo:table-cell>
</fo:table-row>
<fo:table-row>
   <fo:table-cell padding-top="5px" padding="2pt">
   <fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal">*
  </fo:block>
   </fo:table-cell>
   <fo:table-cell  padding="2pt" text-align="justify">
   <fo:block text-align="justify" font-family="Helvetica" font-weight="normal" font-size="8pt"  font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">This receipt is issued subject to clearance of Cheque/ECS, if applicable.</fo:inline></fo:block>
   </fo:table-cell>
</fo:table-row>
</fo:table-body>
</fo:table> 
</fo:block>




<fo:block text-align="justify" padding-top="12px" font-family="Helvetica" font-weight="normal" font-size="8pt" font-style="normal">
<fo:inline text-decoration="no-underline no-line-through"  font-size="10pt" font-style="normal">Insurance is the subject matter of solicitation.</fo:inline>

</fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="justify" font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">IndiaFirst Life Insurance Company Ltd 301, 'B' Wing, The Qube, Infinity Park, Dindoshi - Film City Road, Malad (East), Mumbai - 400 097. IRDA Reg No -143</fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="justify" font-style="normal"><fo:inline text-decoration="no-underline no-line-through" font-weight="normal" font-family="Helvetica" font-size="10pt" font-style="normal">Please contact us for any further information, on 1800-209-8700 or email us at customer.first@indiafirstlife.com or visit us at www.indiafirstlife.com.</fo:inline></fo:block>
<fo:block font-family="Helvetica" font-weight="normal" font-size="8pt" text-align="left" font-style="normal"><fo:inline font-weight="normal"> </fo:inline></fo:block>
		</fo:flow>
</fo:page-sequence>
</fo:root>
</xsl:template>
<!-- ========================= NUMBER FORMATS ========================= -->
<!-- ========================= EXSLT TEMPLATES [str.padding.template.xsl] ========================= -->
<xslt:template name="str:padding">
<xslt:param name="length" select="0"/>
<xslt:param name="chars" select="' '"/>
<xslt:choose>
<xslt:when test="not($length) or not($chars)"/>
<xslt:otherwise>
<xslt:variable name="string" select="concat($chars, $chars, $chars, $chars, $chars,                                        $chars, $chars, $chars, $chars, $chars)"/>
<xslt:choose>
<xslt:when test="string-length($string) &gt;= $length">
<xslt:value-of select="substring($string, 1, $length)"/>
</xslt:when>
<xslt:otherwise>
<xslt:call-template name="str:padding">
<xslt:with-param name="length" select="$length"/>
<xslt:with-param name="chars" select="$string"/>
</xslt:call-template>
</xslt:otherwise>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:template>
<!-- ========================= EXSLT TEMPLATES [date.format-date.template.xsl] ========================= -->
<xslt:template name="date:_get-days-elapsed">
<xslt:param name="month"/>
<xslt:choose>
<xslt:when test="$month = 1">0</xslt:when>
<xslt:when test="$month = 2">31</xslt:when>
<xslt:when test="$month = 3">59</xslt:when>
<xslt:when test="$month = 4">90</xslt:when>
<xslt:when test="$month = 5">120</xslt:when>
<xslt:when test="$month = 6">151</xslt:when>
<xslt:when test="$month = 7">181</xslt:when>
<xslt:when test="$month = 8">212</xslt:when>
<xslt:when test="$month = 9">243</xslt:when>
<xslt:when test="$month = 10">273</xslt:when>
<xslt:when test="$month = 11">304</xslt:when>
<xslt:when test="$month = 12">334</xslt:when>
<xslt:otherwise>365</xslt:otherwise>
</xslt:choose>
</xslt:template>
<xslt:template name="date:_get-month">
<xslt:param name="month"/>
<xslt:param name="lang-id" select="'en_US'"/>
<xslt:choose>
<xslt:when test="$lang-id = 'fr_FR'">
<xslt:choose>
<xslt:when test="$month = 1">Janvier;Jan</xslt:when>
<xslt:when test="$month = 2">Février;Fév</xslt:when>
<xslt:when test="$month = 3">Mars;Mar</xslt:when>
<xslt:when test="$month = 4">Avril;Avr</xslt:when>
<xslt:when test="$month = 5">Mai;Mai</xslt:when>
<xslt:when test="$month = 6">Juin;Jui</xslt:when>
<xslt:when test="$month = 7">Juillet;Juil</xslt:when>
<xslt:when test="$month = 8">Août;Aoû</xslt:when>
<xslt:when test="$month = 9">Septembre;Sep</xslt:when>
<xslt:when test="$month = 10">Octobre;Oct</xslt:when>
<xslt:when test="$month = 11">Novembre;Nov</xslt:when>
<xslt:when test="$month = 12">Décembre;Déc</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'de_AT' or $lang-id = 'de_DE' or $lang-id = 'de_CH'">
<xslt:choose>
<xslt:when test="$month = 1">Januar;Jan</xslt:when>
<xslt:when test="$month = 2">Februar;Feb</xslt:when>
<xslt:when test="$month = 3">März;Mär</xslt:when>
<xslt:when test="$month = 4">April;Apr</xslt:when>
<xslt:when test="$month = 5">Dürfen;Dür</xslt:when>
<xslt:when test="$month = 6">Juni;Jun</xslt:when>
<xslt:when test="$month = 7">Juli;Jul</xslt:when>
<xslt:when test="$month = 8">August;Aug</xslt:when>
<xslt:when test="$month = 9">September;Sep</xslt:when>
<xslt:when test="$month = 10">Oktober;Okt</xslt:when>
<xslt:when test="$month = 11">November;Nov</xslt:when>
<xslt:when test="$month = 12">Dezember;Dez</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'es_ES'">
<xslt:choose>
<xslt:when test="$month = 1">Enero;Ene</xslt:when>
<xslt:when test="$month = 2">Febrero;Feb</xslt:when>
<xslt:when test="$month = 3">Marzo;Mar</xslt:when>
<xslt:when test="$month = 4">Abril;Abr</xslt:when>
<xslt:when test="$month = 5">Mayo;May</xslt:when>
<xslt:when test="$month = 6">Junio;Jun</xslt:when>
<xslt:when test="$month = 7">Julio;Jul</xslt:when>
<xslt:when test="$month = 8">Agosto;Ago</xslt:when>
<xslt:when test="$month = 9">Septiembre;Sep</xslt:when>
<xslt:when test="$month = 10">Octubre;Oct</xslt:when>
<xslt:when test="$month = 11">Noviembre;Nov</xslt:when>
<xslt:when test="$month = 12">Diciembre;Dic</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'nl_NL'">
<xslt:choose>
<xslt:when test="$month = 1">januari;jan</xslt:when>
<xslt:when test="$month = 2">februari;feb</xslt:when>
<xslt:when test="$month = 3">maart;maa</xslt:when>
<xslt:when test="$month = 4">april;apr</xslt:when>
<xslt:when test="$month = 5">mei;mei</xslt:when>
<xslt:when test="$month = 6">juni;jun</xslt:when>
<xslt:when test="$month = 7">juli;jul</xslt:when>
<xslt:when test="$month = 8">augustus;aug</xslt:when>
<xslt:when test="$month = 9">september;sep</xslt:when>
<xslt:when test="$month = 10">oktober;okt</xslt:when>
<xslt:when test="$month = 11">november;nov</xslt:when>
<xslt:when test="$month = 12">december;dec</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:otherwise>
<xslt:choose>
<xslt:when test="$month = 1">January;Jan</xslt:when>
<xslt:when test="$month = 2">February;Feb</xslt:when>
<xslt:when test="$month = 3">March;Mar</xslt:when>
<xslt:when test="$month = 4">April;Apr</xslt:when>
<xslt:when test="$month = 5">May;May</xslt:when>
<xslt:when test="$month = 6">June;Jun</xslt:when>
<xslt:when test="$month = 7">July;Jul</xslt:when>
<xslt:when test="$month = 8">August;Aug</xslt:when>
<xslt:when test="$month = 9">September;Sep</xslt:when>
<xslt:when test="$month = 10">October;Oct</xslt:when>
<xslt:when test="$month = 11">November;Nov</xslt:when>
<xslt:when test="$month = 12">December;Dec</xslt:when>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:template>
<xslt:template name="date:_get-day">
<xslt:param name="day"/>
<xslt:param name="lang-id" select="'en_US'"/>
<xslt:choose>
<xslt:when test="$lang-id = 'fr_FR'">
<xslt:choose>
<xslt:when test="$day = 1">Dimanche;Dim</xslt:when>
<xslt:when test="$day = 2">Lundi;Lun</xslt:when>
<xslt:when test="$day = 3">Mardi;Mar</xslt:when>
<xslt:when test="$day = 4">Mercredi;Mer</xslt:when>
<xslt:when test="$day = 5">Jeudi;Jeu</xslt:when>
<xslt:when test="$day = 6">Vendredi;Ven</xslt:when>
<xslt:when test="$day = 7">Samedi;Sam</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'de_AT' or $lang-id = 'de_DE' or $lang-id = 'de_CH'">
<xslt:choose>
<xslt:when test="$day = 1">Sonntag;Son</xslt:when>
<xslt:when test="$day = 2">Montag;Mon</xslt:when>
<xslt:when test="$day = 3">Dienstag;Die</xslt:when>
<xslt:when test="$day = 4">Mittwoch;Mit</xslt:when>
<xslt:when test="$day = 5">Donnerstag;Don</xslt:when>
<xslt:when test="$day = 6">Freitag;Fre</xslt:when>
<xslt:when test="$day = 7">Samstag;Sam</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'es_ES'">
<xslt:choose>
<xslt:when test="$day = 1">Domingo;Dom</xslt:when>
<xslt:when test="$day = 2">Lunes;Lun</xslt:when>
<xslt:when test="$day = 3">Martes;Mar</xslt:when>
<xslt:when test="$day = 4">Miércoles;Mié</xslt:when>
<xslt:when test="$day = 5">Jueves;Jue</xslt:when>
<xslt:when test="$day = 6">Viernes;Vie</xslt:when>
<xslt:when test="$day = 7">Sábado;Sáb</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="$lang-id = 'nl_NL'">
<xslt:choose>
<xslt:when test="$day = 1">zondag;zon</xslt:when>
<xslt:when test="$day = 2">maandag;maa</xslt:when>
<xslt:when test="$day = 3">dinsdag;din</xslt:when>
<xslt:when test="$day = 4">woensdag;woe</xslt:when>
<xslt:when test="$day = 5">donderdag;don</xslt:when>
<xslt:when test="$day = 6">vrijdag;vri</xslt:when>
<xslt:when test="$day = 7">zaterdag;zat</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:otherwise>
<xslt:choose>
<xslt:when test="$day = 1">Sunday;Sun</xslt:when>
<xslt:when test="$day = 2">Monday;Mon</xslt:when>
<xslt:when test="$day = 3">Tuesday;Tue</xslt:when>
<xslt:when test="$day = 4">Wednesday;Wed</xslt:when>
<xslt:when test="$day = 5">Thursday;Thu</xslt:when>
<xslt:when test="$day = 6">Friday;Fri</xslt:when>
<xslt:when test="$day = 7">Saturday;Sat</xslt:when>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:template>
<xslt:template name="date:format-date">
<xslt:param name="date-time"/>
<xslt:param name="pattern"/>
<xslt:param name="lang-id"/>
<xslt:variable name="formatted">
<xslt:choose>
<xslt:when test="starts-with($date-time, '---')">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="'NaN'"/>
<xslt:with-param name="month" select="'NaN'"/>
<xslt:with-param name="day" select="number(substring($date-time, 4, 2))"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="starts-with($date-time, '--')">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="'NaN'"/>
<xslt:with-param name="month" select="number(substring($date-time, 3, 2))"/>
<xslt:with-param name="day" select="number(substring($date-time, 6, 2))"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="neg" select="starts-with($date-time, '-')"/>
<xslt:variable name="no-neg">
<xslt:choose>
<xslt:when test="$neg or starts-with($date-time, '+')">
<xslt:value-of select="substring($date-time, 2)"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="$date-time"/>
</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:variable name="no-neg-length" select="string-length($no-neg)"/>
<xslt:variable name="timezone">
<xslt:choose>
<xslt:when test="substring($no-neg, $no-neg-length) = 'Z'">Z</xslt:when>
<xslt:otherwise>
<xslt:variable name="tz" select="substring($no-neg, $no-neg-length - 5)"/>
<xslt:if test="(substring($tz, 1, 1) = '-' or                                      substring($tz, 1, 1) = '+') and                                    substring($tz, 4, 1) = ':'">
<xslt:value-of select="$tz"/>
</xslt:if>
</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:if test="not(string($timezone)) or                           $timezone = 'Z' or                            (substring($timezone, 2, 2) &lt;= 23 and                            substring($timezone, 5, 2) &lt;= 59)">
<xslt:variable name="dt" select="substring($no-neg, 1, $no-neg-length - string-length($timezone))"/>
<xslt:variable name="dt-length" select="string-length($dt)"/>
<xslt:choose>
<xslt:when test="substring($dt, 3, 1) = ':' and                                   substring($dt, 6, 1) = ':'">
<xslt:variable name="hour" select="substring($dt, 1, 2)"/>
<xslt:variable name="min" select="substring($dt, 4, 2)"/>
<xslt:variable name="sec" select="substring($dt, 7)"/>
<xslt:if test="$hour &lt;= 23 and                                    $min &lt;= 59 and                                    $sec &lt;= 60">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="'NaN'"/>
<xslt:with-param name="month" select="'NaN'"/>
<xslt:with-param name="day" select="'NaN'"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$min"/>
<xslt:with-param name="second" select="$sec"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:if>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="year" select="substring($dt, 1, 4) * (($neg * -2) + 1)"/>
<xslt:choose>
<xslt:when test="not(number($year))"/>
<xslt:when test="$dt-length = 4">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="substring($dt, 5, 1) = '-'">
<xslt:variable name="month" select="substring($dt, 6, 2)"/>
<xslt:choose>
<xslt:when test="not($month &lt;= 12)"/>
<xslt:when test="$dt-length = 7">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="substring($dt, 8, 1) = '-'">
<xslt:variable name="day" select="substring($dt, 9, 2)"/>
<xslt:if test="$day &lt;= 31">
<xslt:choose>
<xslt:when test="$dt-length = 10">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="substring($dt, 11, 1) = 'T' and                                                        substring($dt, 14, 1) = ':' and                                                        substring($dt, 17, 1) = ':'">
<xslt:variable name="hour" select="substring($dt, 12, 2)"/>
<xslt:variable name="min" select="substring($dt, 15, 2)"/>
<xslt:variable name="sec" select="substring($dt, 18)"/>
<xslt:if test="$hour &lt;= 23 and                                                         $min &lt;= 59 and                                                         $sec &lt;= 60">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$min"/>
<xslt:with-param name="second" select="$sec"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:if>
</xslt:when>
</xslt:choose>
</xslt:if>
</xslt:when>
</xslt:choose>
</xslt:when>
<xslt:when test="string(number(substring($dt,5,1)))!='NaN'">
<xslt:variable name="month" select="substring($dt, 5, 2)"/>
<xslt:choose>
<xslt:when test="not($month &lt;= 12)"/>
<xslt:when test="$dt-length = 6">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="day" select="substring($dt, 7, 2)"/>
<xslt:if test="$day &lt;= 31">
<xslt:choose>
<xslt:when test="$dt-length = 8">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="substring($dt, 9, 1) = 'T' and  substring($dt, 12, 1) = ':' and  substring($dt, 15, 1) = ':'">
<xslt:variable name="hour" select="substring($dt, 10, 2)"/>
<xslt:variable name="min" select="substring($dt, 13, 2)"/>
<xslt:variable name="sec" select="substring($dt, 16)"/>
<xslt:if test="$hour &lt;= 23 and                                                         $min &lt;= 59 and                                                         $sec &lt;= 60">
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$min"/>
<xslt:with-param name="second" select="$sec"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="$pattern"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:if>
</xslt:when>
</xslt:choose>
</xslt:if>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:if>
</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:value-of select="$formatted"/>
</xslt:template>
<xslt:template name="date:_format-date">
<xslt:param name="year"/>
<xslt:param name="month" select="1"/>
<xslt:param name="day" select="1"/>
<xslt:param name="hour" select="0"/>
<xslt:param name="minute" select="0"/>
<xslt:param name="second" select="0"/>
<xslt:param name="timezone" select="'Z'"/>
<xslt:param name="pattern" select="''"/>
<xslt:param name="lang-id" select="'en_US'"/>
<xslt:variable name="char" select="substring($pattern, 1, 1)"/>
<xslt:choose>
<xslt:when test="not($pattern)"/>
<xslt:when test="$char = &quot;'&quot;">
<xslt:choose>
<xslt:when test="substring($pattern, 2, 1) = &quot;'&quot;">
<xslt:text>'</xslt:text>
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$minute"/>
<xslt:with-param name="second" select="$second"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="substring($pattern, 3)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="literal-value" select="substring-before(substring($pattern, 2), &quot;'&quot;)"/>
<xslt:value-of select="$literal-value"/>
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$minute"/>
<xslt:with-param name="second" select="$second"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="substring($pattern, string-length($literal-value) + 2)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="not(contains('abcdefghjiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ', $char))">
<xslt:value-of select="$char"/>
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$minute"/>
<xslt:with-param name="second" select="$second"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="substring($pattern, 2)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="not(contains('GyMdhHmsSEDFwWakKz', $char))">
<xslt:message>
              Invalid token in format string: <xslt:value-of select="$char"/></xslt:message>
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$minute"/>
<xslt:with-param name="second" select="$second"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="substring($pattern, 2)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="next-different-char" select="substring(translate($pattern, $char, ''), 1, 1)"/>
<xslt:variable name="pattern-length">
<xslt:choose>
<xslt:when test="$next-different-char">
<xslt:value-of select="string-length(substring-before($pattern, $next-different-char))"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="string-length($pattern)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:choose>
<xslt:when test="$char = 'G'">
<xslt:choose>
<xslt:when test="string($year) = 'NaN'"/>
<xslt:when test="$year &gt; 0">AD</xslt:when>
<xslt:otherwise>BC</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'M'">
<xslt:choose>
<xslt:when test="string($month) = 'NaN'"/>
<xslt:when test="$pattern-length &gt;= 3">
<xslt:variable name="month-node">
<xslt:call-template name="date:_get-month">
<xslt:with-param name="month" select="number($month)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:variable>
<xslt:choose>
<xslt:when test="$pattern-length &gt;= 4">
<xslt:value-of select="substring-before(normalize-space($month-node), ';')"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="substring-after(normalize-space($month-node), ';')"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$pattern-length = 2">
<xslt:value-of select="format-number($month, '00')"/>
</xslt:when>
<xslt:when test="$pattern-length = 1">
<xslt:value-of select="format-number($month, '0')"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="$month"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'E'">
<xslt:choose>
<xslt:when test="string($year) = 'NaN' or string($month) = 'NaN' or string($day) = 'NaN'"/>
<xslt:otherwise>
<xslt:variable name="month-days">
<xslt:call-template name="date:_get-days-elapsed">
<xslt:with-param name="month" select="number($month)"/>
</xslt:call-template>
</xslt:variable>
<xslt:variable name="days" select="number($month-days) + $day + boolean(((not($year mod 4) and $year mod 100) or not($year mod 400)) and $month &gt; 2)"/>
<xslt:variable name="y-1" select="$year - 1"/>
<xslt:variable name="dow" select="(($y-1 + floor($y-1 div 4) -                                              floor($y-1 div 100) + floor($y-1 div 400) +                                              $days)                                              mod 7) + 1"/>
<xslt:variable name="day-node">
<xslt:call-template name="date:_get-day">
<xslt:with-param name="day" select="number($dow)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:variable>
<xslt:choose>
<xslt:when test="$pattern-length &gt;= 4">
<xslt:value-of select="substring-before(normalize-space($day-node),';')"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="substring-after(normalize-space($day-node),';')"/>
</xslt:otherwise>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'a'">
<xslt:choose>
<xslt:when test="string($hour) = 'NaN'"/>
<xslt:when test="$hour &gt;= 12">PM</xslt:when>
<xslt:otherwise>AM</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'z'">
<xslt:choose>
<xslt:when test="$timezone = 'Z'">UTC</xslt:when>
<xslt:otherwise>
                    UTC<xslt:value-of select="$timezone"/></xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:otherwise>
<xslt:variable name="padding">
<xslt:choose>
<xslt:when test="$pattern-length &gt; 10">
<xslt:call-template name="str:padding">
<xslt:with-param name="length" select="$pattern-length"/>
<xslt:with-param name="chars" select="'0'"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="substring('0000000000', 1, $pattern-length)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:choose>
<xslt:when test="$char = 'y'">
<xslt:choose>
<xslt:when test="string($year) = 'NaN'"/>
<xslt:when test="$pattern-length &gt; 2">
<xslt:value-of select="format-number($year, $padding)"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="format-number(substring($year, string-length($year) - 1), $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'd'">
<xslt:choose>
<xslt:when test="string($day) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number($day, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'h'">
<xslt:variable name="h" select="$hour mod 12"/>
<xslt:choose>
<xslt:when test="string($hour) = 'NaN'"/>
<xslt:when test="$h">
<xslt:value-of select="format-number($h, $padding)"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="format-number(12, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'H'">
<xslt:choose>
<xslt:when test="string($hour) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number($hour, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'k'">
<xslt:choose>
<xslt:when test="string($hour) = 'NaN'"/>
<xslt:when test="$hour">
<xslt:value-of select="format-number($hour, $padding)"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="format-number(24, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'K'">
<xslt:choose>
<xslt:when test="string($hour) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number($hour mod 12, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'm'">
<xslt:choose>
<xslt:when test="string($minute) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number($minute, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 's'">
<xslt:choose>
<xslt:when test="string($second) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number($second, $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'S'">
<xslt:choose>
<xslt:when test="string($second) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="format-number(substring-after($second, '.'), $padding)"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="$char = 'F'">
<xslt:choose>
<xslt:when test="string($day) = 'NaN'"/>
<xslt:otherwise>
<xslt:value-of select="floor($day div 7) + 1"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
<xslt:when test="string($year) = 'NaN' or string($month) = 'NaN' or string($day) = 'NaN'"/>
<xslt:otherwise>
<xslt:variable name="month-days">
<xslt:call-template name="date:_get-days-elapsed">
<xslt:with-param name="month" select="number($month)"/>
</xslt:call-template>
</xslt:variable>
<xslt:variable name="days" select="number($month-days) + $day + boolean(((not($year mod 4) and $year mod 100) or not($year mod 400)) and $month &gt; 2)"/>
<xslt:choose>
<xslt:when test="$char = 'D'">
<xslt:value-of select="format-number($days, $padding)"/>
</xslt:when>
<xslt:when test="$char = 'w'">
<xslt:call-template name="date:_week-in-year">
<xslt:with-param name="days" select="$days"/>
<xslt:with-param name="year" select="$year"/>
</xslt:call-template>
</xslt:when>
<xslt:when test="$char = 'W'">
<xslt:variable name="y-1" select="$year - 1"/>
<xslt:variable name="day-of-week" select="(($y-1 + floor($y-1 div 4) -                                                   floor($y-1 div 100) + floor($y-1 div 400) +                                                   $days)                                                    mod 7) + 1"/>
<xslt:choose>
<xslt:when test="($day - $day-of-week) mod 7">
<xslt:value-of select="floor(($day - $day-of-week) div 7) + 2"/>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="floor(($day - $day-of-week) div 7) + 1"/>
</xslt:otherwise>
</xslt:choose>
</xslt:when>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
<xslt:call-template name="date:_format-date">
<xslt:with-param name="year" select="$year"/>
<xslt:with-param name="month" select="$month"/>
<xslt:with-param name="day" select="$day"/>
<xslt:with-param name="hour" select="$hour"/>
<xslt:with-param name="minute" select="$minute"/>
<xslt:with-param name="second" select="$second"/>
<xslt:with-param name="timezone" select="$timezone"/>
<xslt:with-param name="pattern" select="substring($pattern, $pattern-length + 1)"/>
<xslt:with-param name="lang-id" select="$lang-id"/>
</xslt:call-template>
</xslt:otherwise>
</xslt:choose>
</xslt:template>
<xslt:template name="date:_week-in-year">
<xslt:param name="days"/>
<xslt:param name="year"/>
<xslt:variable name="y-1" select="$year - 1"/>
<xslt:variable name="day-of-week" select="($y-1 + floor($y-1 div 4) -                           floor($y-1 div 100) + floor($y-1 div 400) +                           $days)                           mod 7"/>
<xslt:variable name="dow">
<xslt:choose>
<xslt:when test="$day-of-week">
<xslt:value-of select="$day-of-week"/>
</xslt:when>
<xslt:otherwise>7</xslt:otherwise>
</xslt:choose>
</xslt:variable>
<xslt:variable name="start-day" select="($days - $dow + 7) mod 7"/>
<xslt:variable name="week-number" select="floor(($days - $dow + 7) div 7)"/>
<xslt:choose>
<xslt:when test="$start-day &gt;= 4">
<xslt:value-of select="$week-number + 1"/>
</xslt:when>
<xslt:otherwise>
<xslt:choose>
<xslt:when test="not($week-number)">
<xslt:call-template name="date:_week-in-year">
<xslt:with-param name="days" select="365 + ((not($y-1 mod 4) and $y-1 mod 100) or not($y-1 mod 400))"/>
<xslt:with-param name="year" select="$y-1"/>
</xslt:call-template>
</xslt:when>
<xslt:otherwise>
<xslt:value-of select="$week-number"/>
</xslt:otherwise>
</xslt:choose>
</xslt:otherwise>
</xslt:choose>
</xslt:template>
<!-- ========================= END OF STYLESHEET ========================= -->
</xslt:stylesheet>
