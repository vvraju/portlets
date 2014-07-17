package com.ifli.rapid.services.util;

import com.ifli.rapid.services.helper.beans.MailAccountBean;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;
public class MyScheduler implements MessageListener {
	
	private int rapid1count=1;
	private boolean isNew;
	List<MailAccountBean> accounts=new ArrayList<MailAccountBean>();
	public Map< String, String> acclist=new HashMap<String, String>();
	
	public MyScheduler()
	{
		isNew=false;
	}

	 public void receive(Message arg0) throws MessageListenerException {  
	       // TODO Auto-generated method stub : your job code  
	       //Write code : what you want to execute on timely basis.  
		 System.out.println("----------------Calling Rapid schedular ----------");
		 loadAccounts();
		 for(MailAccountBean bean:accounts)
		 {
			 createSRequest(bean);
		 }
		 
		
		
	   }


private void createSRequest(MailAccountBean acc) {
	 try {
		 Properties props = new Properties();
		 props.setProperty("mail.store.protocol", "imaps");
		 Session session = Session.getInstance(props, null);
		 Store store = session.getStore();
		 store.connect("imap.gmail.com",acc.getAccname(),acc.getPwd());
     
		 Folder inbox = store.getFolder("INBOX");
		 inbox.open(Folder.READ_ONLY);
		 props.setProperty("mail.store.protocol", "imaps");
		 int localcount=inbox.getMessageCount();
		 
		 if(isNew)
		 	{
			 javax.mail.Message [] msgs= inbox.getMessages(rapid1count+1, localcount);
			 if(localcount >rapid1count)
			 {
	        	for(javax.mail.Message msg:msgs)
	        	{
	        	   	System.out.println("SENT DATE:" + msg.getSentDate());
		            System.out.println("SUBJECT:" + msg.getSubject());
		            System.out.println("CONTENT:" + msg.getContent());
	        	}
	        	rapid1count=localcount;
            }else
            {
            	
            	System.out.println("NO new mails Found");
            }
       	           
    
		}else
		{
			rapid1count=localcount;
			isNew=true;
		}
	 } catch (Exception mex) {
            mex.printStackTrace();
        }
	}



	private void loadAccounts() {
		
		acclist.put("rapidserviceinfo@gmail.com", "rapid1234");
		MailAccountBean bean=new MailAccountBean();
		bean.setAccname("rapidserviceinfo@gmail.com");
		bean.setId(1);
		bean.setPwd("rapid1234");
		accounts.add(bean);
	}  
	
}
