/**
 * 
 */
package com.ifli.rapid.services.service;

/**
 * @author allvy user
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * The Class BaseService.
 * 
 * @author Indrajit Pingale
 * @created on Nov 6, 2013
 */
public class BaseService {
    /** The rest template. */
    private RestTemplate restTemplate = new RestTemplate();

    /** The service url. */
    private String SERVICE_URL ="http://10.1.4.134:8080/rapid-service-db-refactor/rest/";

    /**
     * Execute get.
     * 
     * @param serviceName
     *            the service name
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String executeGet(String serviceName) {
    	String status="";
      	status= restTemplate.getForObject(RAPIDContants.SERVICE_URL + serviceName,
                String.class);
    	   	
        return status;
    }

    /**
     * Execute post.
     * 
     * @param serviceName
     *            the service name
     * @param urlVars
     *            the url vars
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String executePost(String serviceName, Map<String, String> urlVars)
            throws IOException {
        ResponseEntity<String> entity = restTemplate.postForEntity(SERVICE_URL
                + serviceName, null, String.class, urlVars);

        return entity.getBody();
    }

    /**
     * Gets the rest template.
     * 
     * @return the restTemplate
     */
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    /**
     * Sets the rest template.
     * 
     * @param restTemplate
     *            the restTemplate to set
     */
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Execute post json.
     * 
     * @param serviceName
     *            the service name
     * @param referenceModel
     *            the reference model
     * @return the reference model
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */

    @SuppressWarnings("unchecked")
    public void executePostJson(String serviceName) throws IOException {

        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

        // Prepare header
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(acceptableMediaTypes);

       /* HttpEntity<ReferenceModel> entity = new HttpEntity<ReferenceModel>(
                referenceModel, headers);
        restTemplate.getMessageConverters().add(
                new MappingJacksonHttpMessageConverter());
        restTemplate.getMessageConverters().add(
                new StringHttpMessageConverter());

        // Send the request as POST
        try {
            ResponseEntity<String> result = restTemplate.exchange(SERVICE_URL
                    + serviceName, org.springframework.http.HttpMethod.POST,
                    entity, String.class);

            String referenceModeldata = result.getBody();

            Map<String, LinkedHashMap<String, String>> contactDetails = new LinkedHashMap<String, LinkedHashMap<String, String>>();
            Gson gson = new Gson();

            contactDetails = gson.fromJson(referenceModeldata,
                    contactDetails.getClass());

        } catch (Exception e) {
        }
*/
    }

}
