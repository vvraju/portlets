package com.ifli.rapid.services.util;

/**
 * The Class Constants.
 */
public class Constants {

	public static final String BENEFIT_ILLUSTRATION = "benefit-illutration";

	public static final String ROUTES_PLAN_PATH = "3";

	public static final String ROUTES_NEED_PATH = "1";

	public static final String ROUTES_HAPPINESSMETER_PATH = "4";

	public static final String ROUTES_AMOUNT_PATH = "2";

	public static final String LOGICGRID_HAPPINESSMETER = "2";

	public static final String LOGICGRID_AMOUNT = "1";

	/*Product Type Start*/
	public static final String PRODUCT_TYPE_TRADITIONAL = "Traditional";

	//public static final String PRODUCT_TYPE_ULIP = "Unit Linked";
	public static final String PRODUCT_TYPE_ULIP = "Unit Linked";

	public static final String PRODUCT_TYPE_HEALTH = "Health";
	/*Product Type End*/

	public static final String PREMIUM_TYPE = "Regular Premium";

	public static final int UNITLINKED_AGE = 45;

	public static final Double FORMULA_VALUE_LESS_UNITLINKED_AGE = 10.0;

	public static final Double FORMULA_VALUE_DUE_LESS_UNITLINKED_AGE = 0.5;

	public static final Double FORMULA_VALUE_GREATER_UNITLINKED_AGE = 7.0;

	public static final Double FORMULA_VALUE_DUE_GREATER_UNITLINKED_AGE = 0.25;
	public static final String YEARS = "years";
	public static final String MONTHS = "months";
	public static final String DAYS = "days";

	// Properties Files Names
	public static final String RESOURCE_BUNDLE_NAME = "env-rapid";

	// Constants for SMS Service
	public static final Integer SMS_SUCCESS_CODE = 1;
	public static final Integer SMS_FAILURE_CODE = 0;
	public static final String SMS_SERVICE_NS_KEY = "ifl.sms.service.namespace";
	public static final String SMS_SERVICE_URI_KEY = "ifl.sms.service.uri";
	public static final String SMS_SOAP_NS_REQ_PREFIX = "ifl";
	public static final String SMS_SOAP_NS_RESP_PREFIX = "NS1";
	public static final String SMS_SOAP_BODY_NODENAME_REQUEST_MESSAGE = "REQUEST_MSG";
	public static final String SMS_SOAP_BODY_NODENAME_RESPONSE_MSG = "RESPONSE_MSG";
	public static final String SMS_SOAP_BODY_NODENAME_TEXT = "TEXT";
	public static final String SMS_SOAP_BODY_NODENAME_PH_NO = "PH_NO";
	public static final String SMS_SOAP_BODY_NODENAME_MSGID = "MsgID";
	public static final String SMS_SOAP_BODY_NODENAME_STATUS = "Status";
	public static final String SMS_SOAP_BODY_NODENAME_ERROR_CODE = "ErrorCode";

	/* Constants For Bi starts*/
	public static final String DEATH_BENEFIT1 = "In the unfortunate event of death or permanent disability of the insured due to accident during the term of the policy, the Fund Value and sum of all outstanding future Premium(s) will be paid and plan terminates.";
	public static final String DEATH_BENEFIT2 = "In the unfortunate event of death or permanent disability of the insured due to accident during the term of the policy, sum of all future premiums will be credited to the Fund by the Company. The Fund value will be paid at maturity.";
	/*public static final String PAYMENT_FREQ_YEARLY="Yearly";
	public static final String PAYMENT_FREQ_MONTHLY="Monthly";
	public static final String PAYMENT_FREQ_HALF_YEARLY="Half Yearly";
	public static final String PAYMENT_FREQ_QUATERLY="Quaterly"*/;
	/* Constants For Bi Ends*/

	// Constants for OmniDocs service
	public static final String OMNIDOCS_UPLOAD_SERVICE_URI_KEY = "ifl.omnidocs.upload.service.uri";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_CHILD_NODENAME_TEMPLATE_NAME = "templateName";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_CHILD_NODENAME_DATA_CLASSFIELD_INDEXNAMES = "dataClassFieldIndexNames";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_CHILD_NODENAME_DATA_CLASSFIELD_INDEXVALUES = "dataClassFieldIndexValues";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_CHILD_NODENAME_DOCUMENT_LIST = "documentList";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_CHILD_NODENAME_DOC_LIST = "docList";
	public static final String OMNIDOCS_UPLOAD_SERVICE_NS_KEY_PREFIX = "ifl";
	public static final String OMNIDOCS_UPLOAD_SERVICE_NS_KEY_SUFFIX = "ifl.omnidocs.upload.service.namespace.suffix";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_ROOT_NODENAME_SUFFIX = "Push_Req";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_ROOT_NODENAME_PREFIX = "ifl";
	public static final String OMNIDOCS_UPLOAD_SOAP_BODY_RESPONSE_COLUMN_NAME = "STATUS";
	public static final String OMNIDOCS_DOWNLOAD_SERVICE_NS_KEY_PREFIX = "web";
	public static final String OMNIDOCS_DOWNLOAD_SERVICE_NS_KEY_SUFFIX = "ifl.omnidocs.download.service.namespace.suffix";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_ROOT_NODENAME_GET_DOCUMENT = "getDocument";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_CHILD_NODENAME_APPLICATION_NO = "applicationNo";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_CHILD_NODENAME_POLICY_NO = "policyNo";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_CHILD_NODENAME_DOCUMENT_TYPE = "documentType";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_CHILD_NODENAME_DATACLASS_NAME = "dataClassName";
	public static final String OMNIDOCS_DOWNLOAD_SERVICE_URI_KEY = "ifl.omnidocs.download.service.uri";
	public static final String OMNIDOCS_DOWNLOAD_SOAP_BODY_RESPONSE_COLUMN_NAME = "ns:return";
	public static final String OMNIDOCS_UPLOAD_DOCUMENT_LOCATION_PREFIX = "ifl.omnidocs.local.document.location.prefix";
	public static final String OMNIDOCS_DOWNLOAD_SERVICE_ERROR_RESPONSE = "Specified documents were not found";

	// entry for metadata
	public static final String METADATA_FOR_GENERICMASTER = "VARCHAR";
	public static final String METADATA_FOR_GENERICMASTER_FIELD = "mst_type";

	public static final String HQL_GET_APPLICATION_DOCUMENTS = "FROM ApplicationDocument WHERE ApplicationFormId = ''{0}'' AND Active = {1}";

	public static final String TEMP_CREATED_BY = "FWW";
	public static final String TEMP_MODIFED_BY = "FWW";

	/* Dynamic Constants Starts */

	public static final String DYNAMIC_BI_FORM = "BI";
	public static final String DYNAMIC_APP_FROM = "APP_FORM";
	public static final String STATUS_APPROVED = "APPROVED";
	public static final String STATUS_SUBMITTED = "SUBMITTED";
	public static final String STATUS_REJECTED = "REJECTED";
	public static final String STATUS_DRAFT = "DRAFT";
	public static final String DYNAMIC_APP_FORM_PERSONAL_PAGE_NO = "1";
	public static final String DYNAMIC_APP_FORM_ADDITIONAL_PAGE_NO = "2";

	/* Dynamic Constants End */

	public static final String DOWNLOAD_DOCUMENTS_DATACLASS = "Policy";

	/* Status - refers to status in ApplicationForm table */
	public static final String APPLICATION_FORM_STATUS = "DONE";

	public static final String KEY_ERROR_MSG_BAD_REQUEST = "ifl.error.msg.bad_request";

	public static final String MASTER_KEY_FOR_COMMUNICTION_ADDRESS="communication";

	public static final String HAPPINESSMETER_LIFE_STAGE = "Life Stage";
	public static final String AGE_PROOF = "RAPID.PROOFTYPE.AGEPR";
	public static final Double AGE_EXTRA_AMOUNT_FORMULAVALUE = 0.0015;

	public static final String PRODUCT_KEY_SMART_SAVE = "rapid.product.product9";
	public static final String PRODUCT_KEY_SIMPLE_BENIFIT = "rapid.product.product2";
	public static final String PRODUCT_KEY_MONEY_BALANCE = "rapid.product.product1";


	//Messages

	public static final String PARAMETER_IS_NULL = "Parameter is NULL";
	public static final String SMS_NOT_SEND = "SMS not send ";
	public static final String ERROR = "Error";
	public static final String SUCCESS = "Success";
	public static final String STATUS = "status";
	public static final String MESSAGE = "message";
	public static final String SMS_SEND_SUCCESSFULLY = "SMS send successfully";
	public static final String DATA_CLASS_NAME = "Policy";

}
