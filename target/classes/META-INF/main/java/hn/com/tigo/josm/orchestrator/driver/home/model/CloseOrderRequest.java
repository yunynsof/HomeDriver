package hn.com.tigo.josm.orchestrator.driver.home.model;

/**
 * CloseOrderRequest Object class needed to map the request objects.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 09-01-2022 02:25:25 PM 2022
 */
public class CloseOrderRequest {
	
	/** Attribute that determine basicRequest. */
	private BasicRequest basicRequest;

	/** Attribute that determine additionals. */
	private Additionals additionals;

	/**
	 * Sets the basic request.
	 *
	 * @param basicRequest the new basic request
	 */
	public void setBasicRequest(BasicRequest basicRequest) {
		this.basicRequest = basicRequest;
	}

	/**
	 * Gets the basic request.
	 *
	 * @return the basic request
	 */
	public BasicRequest getBasicRequest() {
		return this.basicRequest;
	}

	/**
	 * Sets the additionals.
	 *
	 * @param additionals the new additionals
	 */
	public void setAdditionals(Additionals additionals) {
		this.additionals = additionals;
	}

	/**
	 * Gets the additionals.
	 *
	 * @return the additionals
	 */
	public Additionals getAdditionals() {
		return this.additionals;
	}

}
