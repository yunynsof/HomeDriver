package hn.com.tigo.josm.orchestrator.driver.home.test;

import javax.ejb.embeddable.EJBContainer;

import org.apache.log4j.Logger;

import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.driver.home.core.HomeDriver;


public class AbstractTest {

	/** Attribute that determine container. */
	protected static EJBContainer container;

	/** Attribute that determine driver. */
	protected static HomeDriver driver;

	/** Attribute that determine a Constant of LOGGER. */
	protected static final transient Logger LOGGER = Logger.getLogger(AbstractTest.class);
	
	/** Attribute that determine endpoint. */
	final String ip = "http://192.168.105.47:8003/home/tigo/hn/digital/homeotcreator/v1?wsdl";

	/**
	 * Instantiates a new abstract test.
	 *
	 * @throws AdapterException the adapter exception
	 */
	public AbstractTest() throws AdapterException {
		driver = new HomeDriver(ip);
	}

}
