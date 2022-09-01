package hn.com.tigo.josm.orchestrator.driver.home.core;

import org.apache.log4j.Logger;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.ParameterType;
import hn.com.tigo.josm.common.adapter.dto.TaskRequestType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;

/**
 * This class is used to centralize variables and methods necessary for the operations classes.
 * 
 * @author Laurent G. Cáceres
 * @version 1.0.0
 * @since 10/08/2022
 */
public abstract class AbstractDriver {

	/** The Constant LOGGER. */
	protected static final Logger LOGGER = Logger.getLogger(AbstractDriver.class);

	/** Attribute that determine taskType. */
	protected TaskRequestType taskType;

	/** Attribute that determine endpoint. */
	protected String endpoint;

	/**
	 * Instantiates a new abstract driver.
	 */
	public AbstractDriver() {

	}


	/**
	 * Validate service response.
	 *
	 * @param responseDriver
	 *            the response driver
	 * @return the task response type
	 * @throws AdapterException
	 *             the adapter exception
	 */
	protected TaskResponseType validateResponse(final TaskResponseType responseDriver) throws AdapterException {
		if (responseDriver.getResponseCode() != 0) {
			LOGGER.error(responseDriver.getResponseDescription());
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, responseDriver.getResponseDescription(),
					String.valueOf(responseDriver.getResponseCode()), null);
		}

		return responseDriver;
	}

	/**
	 * Creates the response.
	 *
	 * @param responseCode
	 *            the response code
	 * @param responseDescription
	 *            the response description
	 * @param param
	 *            the param
	 * @return the task response type
	 */
	protected TaskResponseType createDriverToAdapterResponse(final String responseCode,
			final String responseDescription, final ParameterArray param) {
		final TaskResponseType response = new TaskResponseType();
		response.setResponseCode(Integer.parseInt(responseCode));
		response.setResponseDescription(responseDescription);
		response.setParameters(param);
		return response;
	}


	/**
	 * Builds the new parameter for the ParameterArray class.
	 *
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * @return the parameter type
	 */
	protected ParameterType buildNewParameter(final String name, final String value) {
		final ParameterType parameter = new ParameterType();
		parameter.setName(name);
		parameter.setValue(value);
		return parameter;
	}

	/**
	 * Method that allows to execute a specific driver.
	 *
	 * @return the task response type
	 * @throws AdapterException
	 *             the adapter exception
	 */
	public abstract TaskResponseType execute() throws AdapterException;


	/**
	 * Sets the endpoint.
	 *
	 * @param endpoint
	 *            the new endpoint
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

}
