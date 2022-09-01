package hn.com.tigo.josm.orchestrator.driver.home.model;

/**
 * BasicRequest Object class needed to map the request objects.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 09-01-2022 02:25:17 PM 2022
 */
public class BasicRequest {

	/** Attribute that determine externalApplicationID. */
	private String externalApplicationID;

	/** Attribute that determine externalTransactionID. */
	private String externalTransactionID;

	/** Attribute that determine utiReference. */
	private String utiReference;

	/**
	 * Sets the external application ID.
	 *
	 * @param externalApplicationID the new external application ID
	 */
	public void setExternalApplicationID(String externalApplicationID) {
		this.externalApplicationID = externalApplicationID;
	}

	/**
	 * Gets the external application ID.
	 *
	 * @return the external application ID
	 */
	public String getExternalApplicationID() {
		return this.externalApplicationID;
	}

	/**
	 * Sets the external transaction ID.
	 *
	 * @param externalTransactionID the new external transaction ID
	 */
	public void setExternalTransactionID(String externalTransactionID) {
		this.externalTransactionID = externalTransactionID;
	}

	/**
	 * Gets the external transaction ID.
	 *
	 * @return the external transaction ID
	 */
	public String getExternalTransactionID() {
		return this.externalTransactionID;
	}

	/**
	 * Sets the uti reference.
	 *
	 * @param utiReference the new uti reference
	 */
	public void setUtiReference(String utiReference) {
		this.utiReference = utiReference;
	}

	/**
	 * Gets the uti reference.
	 *
	 * @return the uti reference
	 */
	public String getUtiReference() {
		return this.utiReference;
	}

}
