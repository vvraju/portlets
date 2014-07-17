package com.ifli.rapid.services.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class GeneratePDF {

	
	public void createPremiumPaidPDF(String xmlFile,String xsltemplate,String pdfoutput)  {
		OutputStream out = null;
		try {
		
		File xslt = new File(xsltemplate);
		File pdf = new File(pdfoutput);
		InputStream is = new ByteArrayInputStream(xmlFile.getBytes());
		
		// configure fopFactory as desired
		FopFactory fopFactory = FopFactory.newInstance();
		
		FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
		// configure foUserAgent as desired
		
		// Setup output
		out = new java.io.FileOutputStream(pdf);
		out = new java.io.BufferedOutputStream(out);

		// Construct fop with desired output format
		Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF,foUserAgent,out);
		
		// Setup XSLT
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory
		.newTransformer(new StreamSource(xslt));
		
		Source srcXml = new StreamSource(is);
		// Resulting SAX events (the generated FO) must be piped through to FOP
		Result res = new SAXResult(fop.getDefaultHandler());
		
		// Start XSLT transformation and FOP processing
		transformer.transform(srcXml, res);
		out.close();
		} catch (IOException ioex) {
		ioex.printStackTrace();
		} catch (FOPException fopex) {
		fopex.printStackTrace();
		} catch (TransformerException tansex) {
		tansex.printStackTrace();
		}
		
	}

	

}
