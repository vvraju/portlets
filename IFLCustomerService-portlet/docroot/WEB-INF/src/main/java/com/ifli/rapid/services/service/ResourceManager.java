/**
 * 
 */
package com.ifli.rapid.services.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Indrajit Pingale
 * 
 * @created on 31-Oct-2013 3:24:04 pm
 */
public class ResourceManager {
	 @Autowired
	private static Properties prop = new Properties();
	private static Properties serviceurlprop = new Properties();
    private static InputStream inputStreamservice=null;
    private static final  String  IO_EXCEPTION="IOException";
   

	/**
	 * @param key
	 * @return
	 */
public static String getLabels(String key) {

		String value = null;
		try {
			InputStream inputStream = ResourceManager.class.getClassLoader()
					.getResourceAsStream("resource_en.properties");
			prop.load(inputStream);

			value = prop.getProperty(key);

		} catch (IOException ex) {
		}

		if (value != null){
			return value;
		}else{
			return key;
		}
	}
	
	public static String getServiceURL(String key) {

		String value = null;
		try {
			if(inputStreamservice==null){
			 inputStreamservice = ResourceManager.class.getClassLoader()
					.getResourceAsStream("serviceurls.properties");
			 serviceurlprop.load(inputStreamservice);
			}
			
			value = serviceurlprop.getProperty(key);

		} catch (IOException ex) {
		}

		if (value != null){
			return value;
		}else{
			return key;
		}
	}


}
