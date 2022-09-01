package hn.com.tigo.josm.orchestrator.driver.home.utils;

/**
 * This class contains the necessary constants for all processes within HomeDriver.
 * 
 * @author Laurent G. Cáceres
 * @version 1.0.0
 * @since 10/08/2022
 */
public class HomeConstantsDriver {

	/** Attribute that determine a Constant of STATIC_URL. */
	public static final String STATIC_URL = "http://192.168.105.47:8003/home/tigo/hn/digital/homeotcreator/v1?wsdl";
	
	/** Attribute that determine a Constant of CONFIG_NAME. */
	public static final String CONFIG_NAME = "Home";
	 
	/** The Constant QUERY_BALANCE_METHOD. */
	public final static String CREATE_REQUEST_METHOD = "crearRequestHttp";

	/** The Constant ERROR_GENERATE_JAXCONTEXT_CLASS. */
	public final static String ERROR_GENERATE_JAXCONTEXT_CLASS = "Error on Jax Context Class";

	/** Attribute that determine the Constant TITLE_ERROR. */
	public static final String TITLE_ERROR = "ERROR";

	/** Attribute that determine the Constant TITLE_SUCCESSFUL. */
	public static final String TITLE_SUCCESSFUL = "SUCCESSFUL";

	/** Attribute that determine the Constant TITLE_SUCCESSFUL_NO_IDENTIFY. */
	public static final String TITLE_SUCCESSFUL_NO_IDENTIFY = "SUCCESSFUL NO IDENTIFIED";

	/** Attribute that determine the Constant TITLE_SUCCESSFUL_NO_IDENTIFY. */
	public static final String JSON_RESPONSE = "JSON_RESPONSE";

	/** Attribute that determine the Constant HTTP_CODE. */
	public static final String HTTP_CODE = "HTTP_CODE";

	/** Attribute that determine the Constant TITLE_SUCCESSFUL_NO_IDENTIFY. */
	public static final String NO_DATA_FOUND = "ORA-01403: no data found";

	/** Attribute that determine the Constant CODE_SUCCESSFUL. */
	public static final int CODE_SUCCESSFUL = 0;

	/** The Constant ERROR_TOKEN. */
	public final static String ERROR_TOKEN = " - Error: ";

	/** The Constant CREATE_RESPONSE_METHOD. */
	public final static String CREATE_RESPONSE_METHOD = "crearResponseHttp";

	/** The Constant ERROR_CODE. */
	public final static int ERROR_CODE = -1;

	/** The Constant ERROR_MESSAGE. */
	public final static String ERROR_MESSAGE = "A processing error by invoking the service has occurred.";

	/** The Constant ERROR_MESSAGE_PARAM. */
	public final static String ERROR_MESSAGE_PARAM = "Invalid parameters only one is allowed";

	/** Attribute that determine a Constant of RESPONSE_DESCRIPTION. */
	public static final String RESPONSE_DESCRIPTION = "description";
	
	/** The Constant PARAM_JSON_QUERY_CUSTOMER_INFO. */
	public static final String PARAM_JSON_RESPONSE = "JSON_RESPONSE";
	
	/** The SUCCESS_PARAM. */
	public final static String SUCCESS_PARAM = "Operation successfully.";
	
	/** Attribute that determine a Constant of JAXBCONTEXT. */
	public static final String JAXBCONTEXT = "com.tigo.commons.basicrequest.v1.schema:com.tigo.commons.generalresponse.v1.schema:com.tigo.commons.resources.additional.v1.schema:com.tigo.commons.resources.servicehome:com.tigo.commons.resources.servicehome.v1.schema:com.tigo.enterprise.resources.parameters.simple.v1.schema";



}
