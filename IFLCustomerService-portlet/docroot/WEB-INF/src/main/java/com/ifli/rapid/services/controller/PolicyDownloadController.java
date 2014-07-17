package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.POLICY_DOC_TYPES;
import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.RENEWAL_PREMIUM;
import com.ifli.rapid.service.POLICY_DOC_TYPESLocalServiceUtil;
import com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PolicyListdto;
import com.ifli.rapid.services.helper.beans.PolicyYears;
import com.ifli.rapid.services.helper.beans.UnitStatementBean;
import com.ifli.rapid.services.service.CustomerService;
import com.ifli.rapid.services.util.CommonUtils;
import com.ifli.rapid.services.util.GeneratePDF;
import com.ifli.rapid.services.util.GenerateXML;
import com.ifli.rapid.services.util.JsonHelper;
import com.ifli.rapid.services.util.PolicyUtil;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.util.PortalUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.ParseException;

import javax.mail.internet.InternetAddress;
import javax.portlet.PortalContext;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Satya Kola
 * 
 */
@Controller
@RequestMapping("VIEW")
public class PolicyDownloadController {
	
	public static final long USER_ID=50000768l;
	public static final long POLICY_ID=10000119L;
	private Log _log=LogFactoryUtil.getLog(PolicyDownloadController.class);
	         
			@RenderMapping(params = "action=policyHome")
			public String policyHome(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
				_log.info("======== In Download Policy Controller  =============");
					String status="error";
					try {
					
						PolicyInfo policylist=PolicyInfoLocalServiceUtil.getPolicyInfo(""+POLICY_ID);
						String poldate=policylist.getPOLICY_DATE();
						List<String> fyears=PolicyUtil.getYears(poldate);
						List<POLICY_DOC_TYPES> doctypes=POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPESs(0,POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPESsCount());
						model.addAttribute("doctypes", doctypes);
						Calendar cal=Calendar.getInstance();
						int curyear=cal.get(Calendar.YEAR);
						int prevyear=curyear-1;
						int nextyear=curyear+1;
						model.addAttribute("fyears", fyears);
						model.addAttribute("prevyear", ""+prevyear+"-"+curyear);
						model.addAttribute("curryear", ""+curyear+"-"+nextyear);
						model.addAttribute("nextyear", ""+nextyear+"-"+(nextyear+1));
						model.addAttribute("policylist", policylist);
						status= "userpolicy";
					
					} catch ( SystemException e) {
						// TODO Auto-generated catch block
						
						e.printStackTrace();
						model.addAttribute("errorMsg", "Unable to  fetch the data from policy info");
						status= "error";
					}catch(Exception e)
					{
						e.printStackTrace();
						model.addAttribute("errorMsg", "Unable to  fetch the data from policy info");
						status= "error";
						
					}
					
					return status;
				}

			
		
			@ResourceMapping(value="policysearchURL")
			public void getPolicyList(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException{
				//model.addAttribute("showdiv", "show");
				String status="error";
				try
				{
					String doctype=resourceRequest.getParameter("cust_doctype").trim();
					System.out.println(doctype);
					String policyno=resourceRequest.getParameter("cust_policynum").trim();
					String fyear=resourceRequest.getParameter("cust_fincyear").trim();
					
					int year=Integer.parseInt(fyear);
					String fromdate="%"+fyear;
					String todate="%"+(year+1);
					
					POLICY_DOC_TYPES doc=POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPES(Integer.parseInt(doctype));
					
					String docflag="notype";
					if(doc.getDOC_NAME().equals("Premium Paid Certificate"))
					{
						String fy=fyear+"-"+(year+1);
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policyno, fy);
						
						resourceRequest.setAttribute("ppdetails", pplist);
						docflag="pp";
						
					}else if(doc.getDOC_NAME().equals("Renewal Premium Receipt"))
					{
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, fromdate);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, todate);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						//model.addAttribute("rprdetails", rplist);
						
						docflag="renewal";
						
					}else if(doc.getDOC_NAME().equals("Unit Statement"))
					{
						
						List<UnitStatementBean> ulist=PolicyUtil.getUnitStmtByPolicyid(policyno, fyear, fyear);
						if(ulist.size() !=0)
						{
						//model.addAttribute("doctype", doctype);
						//model.addAttribute("policyno", policyno);
						//model.addAttribute("fyear", fyear);
						docflag="us";
						}else
						{
							docflag="notype";
						}
						
					}else
					{
						docflag="notype";
					}
						
					
					
					//model.addAttribute("docflag", docflag);
					//model.addAttribute("doctype", doc.getDOC_NAME());
					//model.addAttribute("fyear", fyear);
					//model.addAttribute("welcomemsg1", "Welcome to Liferay Spring MVC Portlet1111111$$$$$$$"+doctype);
					//model.addAttribute("welcomemsg2", "Welcome to Liferay Spring MVC Portlet22222222%%%%%%%"+fyear);
					//model.addAttribute("success", "");
					status="policylist";
				}catch(Exception e)
				{
					e.printStackTrace();
					//model.addAttribute("errorMsg", "Unable to  view the data from policy info");
					status= "error";
				}
				//return new ModelAndView(status);
				resourceResponse.setContentType("text/json");
				PrintWriter pw=resourceResponse.getWriter();
				pw.write("hi");
			}
			
			
			@ResourceMapping(value="downloadpolicysearch")
			public void downloadpolicysearch(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException{
				//model.addAttribute("showdiv", "show");
				String status="error";
				List<PolicyListdto> outlist=new ArrayList<PolicyListdto>();
				try
				{
					//data:{policyid:polid,doctype:doctype,fyear:fyear},
					
					String policyno=resourceRequest.getParameter("policyid");
					String doctype=resourceRequest.getParameter("doctype");
					String fyear=resourceRequest.getParameter("fyear");
					
					
					int year=0;
					if(fyear!=null&&!fyear.isEmpty()){
						year=Integer.parseInt(fyear);
						
					}
							
							
					String fromdate="%"+fyear;
					String todate="%"+(year+1);
					
					String docname="";
					POLICY_DOC_TYPES doc=null;
					if(doctype!=null){
					 doc=POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPES(Integer.parseInt(doctype));
					 docname=doc.getDOC_NAME();
					
					}
					
					if(doc.getDOC_NAME().equals("Premium Paid Certificate"))
					{
						String fy=fyear+"-"+(year+1);
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policyno, fy);
						for(PREMIUM_PAID_CERTIFICATE ppc:pplist)
						{
							PolicyListdto dto=new PolicyListdto();
							dto.setDoctype(docname);
							dto.setPolicynum(ppc.getContrNo());
							dto.setFinyear(ppc.getFinancial_Year());
						//dto.setDownloadPath(resourceRequest.getContextPath());
							outlist.add(dto);
							dto=null;
						}
						resourceRequest.setAttribute("ppdetails", pplist);
						
						
					}else if(doc.getDOC_NAME().equals("Renewal Premium Receipt"))
					{
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, fromdate);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, todate);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						if(rplist!=null&&rplist.size()!=0){
						for(RENEWAL_PREMIUM ren:rplist)
						{
							PolicyListdto dto=new PolicyListdto();
							dto.setDoctype(docname);
							dto.setPolicynum(ren.getContrNo());
							dto.setFinyear(ren.getReceipt_Date());
							outlist.add(dto);
							dto=null;
						}
						}
						//model.addAttribute("rprdetails", rplist);
						//docflag="renewal";
						
					}else if(doc.getDOC_NAME().equals("Unit Statement"))
					{
						//belwo is for testign should be removed later
						PolicyListdto dto=new PolicyListdto();
						dto.setDoctype(docname);
						dto.setPolicynum(policyno);
						dto.setFinyear(fyear);
						outlist.add(dto);
						
						
						/*List<UnitStatementBean> ulist=PolicyUtil.getUnitStmtByPolicyid(policyno, fyear, fyear);
						if(ulist.size() !=0)
						{
							
							for(UnitStatementBean usb:ulist)
							{
								PolicyListdto dto=new PolicyListdto();
								dto.setDoctype(docname);
								dto.setPolicynum(policyno);
								dto.setFinyear(fyear);
								outlist.add(dto);
								dto=null;
							}
							
							
							
						//model.addAttribute("doctype", doctype);
						//model.addAttribute("policyno", policyno);
						//model.addAttribute("fyear", fyear);
						//docflag="us";
						}else
						{
							//docflag="notype";
						}
						*/
					}else
					{
						//docflag="notype";
					}
						
					
					
					//model.addAttribute("docflag", docflag);
					//model.addAttribute("doctype", doc.getDOC_NAME());
					//model.addAttribute("fyear", fyear);
					//model.addAttribute("welcomemsg1", "Welcome to Liferay Spring MVC Portlet1111111$$$$$$$"+doctype);
					//model.addAttribute("welcomemsg2", "Welcome to Liferay Spring MVC Portlet22222222%%%%%%%"+fyear);
					//model.addAttribute("success", "");
					status="policylist";
				}catch(Exception e)
				{
					e.printStackTrace();
					//model.addAttribute("errorMsg", "Unable to  view the data from policy info");
					status= "error";
				}
				//return new ModelAndView(status);
				resourceResponse.setContentType("text/json");
				resourceResponse.getWriter().write(JsonHelper.toJson(outlist));
			}
			
			
			
			/*@ActionMapping(params="action=getPolicyList")
			public void getPolicyList(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
				System.out.println("-----------------getting policy list-------------");
				model.addAttribute("showdiv", "show");
				String status="error";
				try
				{
					String doctype=renderRequest.getParameter("cust_doctype").trim();
					String policyno=renderRequest.getParameter("cust_policynum").trim();
					String fyear=renderRequest.getParameter("cust_fincyear").trim();
					
					int year=Integer.parseInt(fyear);
					String fromdate="%"+fyear;
					String todate="%"+(year+1);
					
					POLICY_DOC_TYPES doc=POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPES(Integer.parseInt(doctype));
					
					String docflag="notype";
					if(doc.getDOC_NAME().equals("Premium Paid Certificate"))
					{
						String fy=fyear+"-"+(year+1);
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policyno, fy);
						
						renderRequest.setAttribute("ppdetails", pplist);
						docflag="pp";
						
					}else if(doc.getDOC_NAME().equals("Renewal Premium Receipt"))
					{
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, fromdate);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policyno, todate);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						model.addAttribute("rprdetails", rplist);
						
						docflag="renewal";
						
					}else if(doc.getDOC_NAME().equals("Unit Statement"))
					{
						
						List<UnitStatementBean> ulist=PolicyUtil.getUnitStmtByPolicyid(policyno, fyear, fyear);
						if(ulist.size() !=0)
						{
						model.addAttribute("doctype", doctype);
						model.addAttribute("policyno", policyno);
						model.addAttribute("fyear", fyear);
						docflag="us";
						}else
						{
							docflag="notype";
						}
						
					}else
					{
						docflag="notype";
					}
						
					
					
					model.addAttribute("docflag", docflag);
					model.addAttribute("doctype", doc.getDOC_NAME());
					model.addAttribute("fyear", fyear);
					//model.addAttribute("welcomemsg1", "Welcome to Liferay Spring MVC Portlet1111111$$$$$$$"+doctype);
					//model.addAttribute("welcomemsg2", "Welcome to Liferay Spring MVC Portlet22222222%%%%%%%"+fyear);
					model.addAttribute("success", "");
					status="policylist";
				}catch(Exception e)
				{
					e.printStackTrace();
					model.addAttribute("errorMsg", "Unable to  view the data from policy info");
					status= "error";
				}
				//return new ModelAndView(status);
				
			}
			*/
			@ResourceMapping(value="getPolicyYearsById")
			public void getPolicyYearsById(ResourceRequest resourceRequest,ResourceResponse resourceResponse)
			{
				try {
					String policyid=resourceRequest.getParameter("policyNum");
					String rndownload=resourceRequest.getParameter("rndownload");
					List<PolicyYears> fyears=null;
				_log.info(" =====In  getPolicyYearsById Method =========="+policyid+rndownload);
				PolicyInfo policylist=PolicyInfoLocalServiceUtil.getPolicyInfo(policyid);
				String poldate=policylist.getPOLICY_DATE();
				
				if(rndownload!=null){
					fyears=PolicyUtil.getFinancialYearsVales(poldate);
					String jsonString=JsonHelper.toJson(fyears);
					resourceResponse.getWriter().write(jsonString);
				}else{
					fyears=PolicyUtil.getYearsVales(poldate);
					resourceResponse.getWriter().write(JsonHelper.toJson(fyears));
				}
				
				
				} catch (IOException e) {
					e.printStackTrace();
				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
				
			}
			
			@ResourceMapping("downloadpolicyURL")
		    public void serveResource(ResourceRequest resourceRequest, ResourceResponse res) throws PortletException, IOException {
				_log.info("In serveResource: ResourceURL");
				_log.info("------------calling downloadpolicyURL----------------");
				String policynumber=resourceRequest.getParameter("policynum");
				String doctype=resourceRequest.getParameter("doctype");
				String fyear=resourceRequest.getParameter("fyear");
				
				_log.info(policynumber+"-------------------"+doctype+"-----------------------------------------"+fyear);
				PortletContext context=resourceRequest.getPortletSession().getPortletContext();
				String pdfile="D:/agent_welcome12.pdf";
				try {
					
					if(doctype.equalsIgnoreCase("Premium Paid Certificate"))
					{
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policynumber, fyear);
						String xml = null;
						xml=GenerateXML.generatePremiumPaidCertificateXML(pplist);
						
						//System.out.println("-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/PREMIUM_PAID_CERTIFICATE.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
					}else if(doctype.equalsIgnoreCase("Renewal Premium Receipt"))
					{
						System.out.println("calling Renewal Premium Receipt");
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						
						String xml = null;
						xml=GenerateXML.generateRenewalPremiumXML(rplist);
						
						
						//System.out.println(rplist+"-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/HPRMRCP1.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
						
					}else if(doctype.equalsIgnoreCase("Unit Statement"))
					{
						 pdfile=context.getRealPath("/images/10145190_UnitStmt.pdf");
					}else
					{
						
					}
			        //String filename = "D:/agent_welcome12.pdf";
			       
		                res.setContentType("application/pdf");
		                res.addProperty(HttpHeaders.CACHE_CONTROL, "max-age=3600, must-revalidate");
		                res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename="+ pdfile);
		                //Use this to directly download the file
		                //res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"attachment");
		                OutputStream out = res.getPortletOutputStream();
		                //out.write(pdfContentVO.getPdfData());
		              File f=new File(pdfile);
		              FileInputStream fileInputStream = new FileInputStream(f);
		               
		                out.write(FileUtil.getBytes(fileInputStream));
		                out.flush();
		               out.close();
		            } catch (SystemException e1) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e1);
						e1.printStackTrace();
					
		            } catch (Exception e) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e);
		            }
		      
		    }
			@ResourceMapping("printpolicyURL")
		    public void printpolicyURL(ResourceRequest resourceRequest, ResourceResponse res) throws PortletException, IOException {
				_log.info("In printpolicyURL: ResourceURL");
		       System.out.println("------------calling printpolicyURL----------------");
		     
				String policynumber=resourceRequest.getParameter("policynum");
				String doctype=resourceRequest.getParameter("doctype");
				String fyear=resourceRequest.getParameter("fyear");
				
				System.out.println(policynumber+"-------------------"+doctype+"-----------------------------------------"+fyear);
				PortletContext context=resourceRequest.getPortletSession().getPortletContext();
				String pdfile="D:/agent_welcome12.pdf";
				try {
					
					if(doctype.equalsIgnoreCase("Premium Paid Certificate"))
					{
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policynumber, fyear);
						String xml = null;
						xml=GenerateXML.generatePremiumPaidCertificateXML(pplist);
						
						//System.out.println("-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/PREMIUM_PAID_CERTIFICATE.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
					}else if(doctype.equalsIgnoreCase("Renewal Premium Receipt"))
					{
						System.out.println("calling Renewal Premium Receipt");
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						
						String xml = null;
						xml=GenerateXML.generateRenewalPremiumXML(rplist);
						
						
						//System.out.println(rplist+"-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/HPRMRCP1.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
						
					}else if(doctype.equalsIgnoreCase("Unit Statement"))
					{
						 pdfile=context.getRealPath("/images/10145190_UnitStmt.pdf");
					}else
					{
						
					}
			        //String filename = "D:/agent_welcome12.pdf";
			       
		                res.setContentType("application/pdf");
		                res.addProperty(HttpHeaders.CACHE_CONTROL, "max-age=3600, must-revalidate");
		                res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"filename="+ pdfile);
		                //Use this to directly download the file
		                //res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"attachment");
		                OutputStream out = res.getPortletOutputStream();
		                //out.write(pdfContentVO.getPdfData());
		              File f=new File(pdfile);
		              FileInputStream fileInputStream = new FileInputStream(f);
		               
		                out.write(FileUtil.getBytes(fileInputStream));
		                out.flush();
		               out.close();
		            } catch (SystemException e1) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e1);
						e1.printStackTrace();
					
		            } catch (Exception e) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e);
		            }
		      
		    }
			@ResourceMapping("emailpolicyURL")
		    public void emailpolicyURL(ResourceRequest resourceRequest, ResourceResponse res) throws PortletException, IOException {
				_log.info("In emailpolicyURL: ResourceURL");
				 System.out.println("------------calling emailpolicyURL----------------");
				  Map<String, Object> map = new HashMap<String, Object>();
				String policynumber=resourceRequest.getParameter("policynum");
				String doctype=resourceRequest.getParameter("doctype");
				String fyear=resourceRequest.getParameter("fyear");
				
				System.out.println(policynumber+"-------------------"+doctype+"-----------------------------------------"+fyear);
				PortletContext context=resourceRequest.getPortletSession().getPortletContext();
				String pdfile="D:/agent_welcome12.pdf";
				try {
					
					if(doctype.equalsIgnoreCase("Premium Paid Certificate"))
					{
						List<PREMIUM_PAID_CERTIFICATE> pplist=PREMIUM_PAID_CERTIFICATELocalServiceUtil.findByPolicyAndYear(policynumber, fyear);
						String xml = null;
						xml=GenerateXML.generatePremiumPaidCertificateXML(pplist);
						
						//System.out.println("-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/PREMIUM_PAID_CERTIFICATE.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
					}else if(doctype.equalsIgnoreCase("Renewal Premium Receipt"))
					{
						System.out.println("calling Renewal Premium Receipt");
						List<RENEWAL_PREMIUM> rplist1=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist2=RENEWAL_PREMIUMLocalServiceUtil.findByPolicyAndReceipt_Date(policynumber, fyear);
						List<RENEWAL_PREMIUM> rplist=new ArrayList<RENEWAL_PREMIUM>();
						rplist.addAll(rplist1);
						rplist.addAll(rplist2);
						
						String xml = null;
						xml=GenerateXML.generateRenewalPremiumXML(rplist);
						
						
						//System.out.println(rplist+"-----------"+xml);
						if (xml !=null)
						{
							
							String xslfile=context.getRealPath("/templates/HPRMRCP1.xsl");
							pdfile=policynumber+"_PremiumPaid.pdf";
							new GeneratePDF().createPremiumPaidPDF(xml, xslfile, pdfile);
						}
						
					}else if(doctype.equalsIgnoreCase("Unit Statement"))
					{
						 pdfile=context.getRealPath("/images/10145190_UnitStmt.pdf");
					}else
					{
						
					}
			        //String filename = "D:/agent_welcome12.pdf";
				 	MailMessage mailMessage = new MailMessage();
					mailMessage.setTo(new InternetAddress("nagasatya777@gmail.com"));
					mailMessage.setFrom(new InternetAddress("nagasatya777@gmail.com"));
					mailMessage.setBody("Please find Your "+doctype +" attached.");
					mailMessage.setSubject(doctype +" Statement");
					mailMessage.addFileAttachment(new File(pdfile));
					
					MailServiceUtil.sendEmail(mailMessage);
					map.put("success", "Email sent successfully");
					
		               
		               
		               
					res.getWriter().write(JsonHelper.toJson(map));
						
		            } catch (SystemException e1) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e1);
						e1.printStackTrace();
					
		            } catch (Exception e) {
		            	_log.info("Error in " + getClass().getName() + "\n" + e);
		            }
		      
		    }
			
			@RenderMapping(params="action=userpolicyHome")
			public String renewalNotice(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
				
				return "userPolicyHome";
			}
			
			@ResourceMapping(value="getPoliciesInfo")
			public void getPoliciesInfo(ResourceRequest resourceRequest,ResourceResponse resourceResponse)
			{
				
				try {
				String policyid=resourceRequest.getParameter("policyNum").trim();
				_log.info(" =====In  getPoliciesInfo Method =========="+policyid);
				
				if(policyid==null){
					policyid=""+POLICY_ID;
					
				}
				
				DynamicQuery query = DynamicQueryFactoryUtil.forClass(com.ifli.rapid.model.impl.PolicyInfoImpl.class);
				
				
                    List<PolicyInfo> policyInfoList= PolicyInfoLocalServiceUtil.dynamicQuery(query);
			
				
				resourceResponse.getWriter().write(JsonHelper.toJson(policyInfoList));
				} catch (IOException e) {
					e.printStackTrace();
				}catch (SystemException e) {
					e.printStackTrace();
				}
				
			}
			
			@ResourceMapping(value="getDocumentsInfo")
			public void getDocumentsInfo(ResourceRequest resourceRequest,ResourceResponse resourceResponse)
			{
				try {
				
				
                    List<POLICY_DOC_TYPES> doctypes=POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPESs(0,POLICY_DOC_TYPESLocalServiceUtil.getPOLICY_DOC_TYPESsCount());
				
				resourceResponse.getWriter().write(JsonHelper.toJson(doctypes));
				} catch (IOException e) {
					e.printStackTrace();
				}catch (SystemException e) {
					e.printStackTrace();
				}
				
			}
			
			
			@ResourceMapping(value="getCustomerPolicies")
			public void renewalNoticeDownloadPage(ResourceRequest req,ResourceResponse res,Model model){
				_log.info(" ======  In getCustomerPolicies ========   ");
				
				/*try {
					List<PolicyInfo> orgList = PolicyInfoLocalServiceUtil.getPolicyInfos(0, PolicyInfoLocalServiceUtil.getPolicyInfosCount());
					List<String> rdetails=new ArrayList<String>();
					
					for(PolicyInfo p:orgList){
						String dateChange=p.getNEXT_PREMIUM_DUEDATE();
						String pdob=p.getPOLICY_HOLDER1_DOB();
						rdetails.add(p.getPOLICY_ID());
						
						try {
							p.setNEXT_PREMIUM_DUEDATE(CommonUtils.changeDateFormat(dateChange));
							p.setPOLICY_HOLDER1_DOB(CommonUtils.changeDateFormat(pdob));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					*/
				Integer contactId=1;
				List<PolicyYears> policyDetailsList;
				try {
					policyDetailsList = new CustomerService().getPoliciesList(contactId);
					res.getWriter().write(JsonHelper.toJson(policyDetailsList));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
			

			@ResourceMapping(value="getPremiumReceiptDoc")
			public void getPremiumReceiptDoc(ResourceRequest req,ResourceResponse res) throws IOException{
				
				_log.info("======== in Get Premium Receipt Doc ===========");
				//String fileName= req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() +"/docs/APPSC Results 2014.pdf";
				String fileName="/IFLService-theme/images/my.pdf";
				
				res.getWriter().write(fileName);
			}
			
			@SuppressWarnings("resource")
			@ResourceMapping(value="downloadReceipts")
			public void downloadReceipts(ResourceRequest req,ResourceResponse res) throws IOException{
				
				_log.info("======== in Download Receipts  ===========");
				PortletContext context=req.getPortletSession().getPortletContext();
				String fileName="";
				
				res.setContentType("application/pdf");
		       
				String page=req.getParameter("page");
				String fName=req.getParameter("fileName");
				
				if(page.equalsIgnoreCase("renewalNotice")){
					
					fileName=context.getRealPath("/docs/Renewal Premium Receipt.pdf");
					res.addProperty("Content-disposition", "atachment; filename=Renewal Premium Receipt.pdf");
					
				}else if(page.equalsIgnoreCase("premiumReceipts")){
					
					fileName=context.getRealPath("/docs/my.pdf");
					res.addProperty("Content-disposition", "atachment; filename=my.pdf");
					
				}else if(page.equalsIgnoreCase("premiumPaidCertificates")){
					
					fileName=context.getRealPath("/docs/Premium Paid Certificate.pdf");
					res.addProperty("Content-disposition", "atachment; filename=Premium Paid Certificate.pdf");
					
				}else{
					fileName=context.getRealPath("/docs/my.pdf");
					res.addProperty("Content-disposition", "atachment; filename=unit Statment.pdf");
				}
				
				//Getting file Path from Context
				
				File file = new File(fileName);
				BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
				byte[] buffer = new byte[8192];
				
		         
		        //Writing file to output
		        
		         
		        OutputStream out = res.getPortletOutputStream();
		        for (int length = 0; (length = input.read(buffer)) > 0;) {
					out.write(buffer, 0, length);
					}
		        out.flush();
		        out.close();
			}
			
			
			@ResourceMapping(value="sendEmail")
			public void sendEmail(ResourceRequest req,ResourceResponse res) throws IOException{
				
				_log.info(" ====== in Sending Email Action ==========");
				String msg="";
				String page=req.getParameter("page");
				_log.info(" ====== Request Param  ==========" +page);
				if(page!=null){
					msg="Email Sent Successfully";
					res.getWriter().write(msg);
				}else{
					msg="Email Sent Failure";
					res.getWriter().write(msg);
				}
			
			}
				
			
}
