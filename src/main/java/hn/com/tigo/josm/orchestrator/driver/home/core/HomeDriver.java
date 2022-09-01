package hn.com.tigo.josm.orchestrator.driver.home.core;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;

/**
 * This class is used to instantiate and execute the driver and thus be able to use the operations.
 * 
 * @author Laurent G. Cáceres
 * @version 1.0.0
 * @since 10/08/2022
 */
public class HomeDriver {

	
	/** Attribute that determine serviceEndpoint. */
	private final String serviceEndpoint;
	
	/**
	 * Instantiates a new home driver.
	 *
	 * @param serviceEndpoint the service endpoint
	 */
	public HomeDriver(final String serviceEndpoint) {
		this.serviceEndpoint = serviceEndpoint;
	}

	
	/**
	 * Execute driver.
	 *
	 * @param abstractDriver the abstract driver
	 * @return the task response type
	 * @throws AdapterException the adapter exception
	 */
	public TaskResponseType executeDriver(final AbstractDriver abstractDriver) throws AdapterException {
		abstractDriver.setEndpoint(serviceEndpoint);
		return abstractDriver.execute();
	}

}
