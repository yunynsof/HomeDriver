package hn.com.tigo.josm.orchestrator.driver.home.model;

/**
 * JsonRequest Object class needed to map the request objects.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 09-01-2022 02:25:34 PM 2022
 */
public class JsonRequest {

	/** Attribute that determine CreateOrderRequest. */
	private CreateOrderRequest CreateOrderRequest;
	
	/** Attribute that determine CloseOrderRequest. */
	private CloseOrderRequest CloseOrderRequest;
	
	/** Attribute that determine CancelOrderRequest. */
	private CancelOrderRequest CancelOrderRequest;
	
	/** Attribute that determine UninstallOrderRequest. */
	private UninstallOrderRequest UninstallOrderRequest;

	/**
	 * Sets the creates the order request.
	 *
	 * @param CreateOrderRequest the new creates the order request
	 */
	public void setCreateOrderRequest(CreateOrderRequest CreateOrderRequest) {
		this.CreateOrderRequest = CreateOrderRequest;
	}

	/**
	 * Gets the creates the order request.
	 *
	 * @return the creates the order request
	 */
	public CreateOrderRequest getCreateOrderRequest() {
		return this.CreateOrderRequest;
	}

	/**
	 * Gets the close order request.
	 *
	 * @return the close order request
	 */
	public CloseOrderRequest getCloseOrderRequest() {
		return CloseOrderRequest;
	}

	/**
	 * Sets the close order request.
	 *
	 * @param closeOrderRequest the new close order request
	 */
	public void setCloseOrderRequest(CloseOrderRequest closeOrderRequest) {
		CloseOrderRequest = closeOrderRequest;
	}

	/**
	 * Gets the cancel order request.
	 *
	 * @return the cancel order request
	 */
	public CancelOrderRequest getCancelOrderRequest() {
		return CancelOrderRequest;
	}

	/**
	 * Sets the cancel order request.
	 *
	 * @param cancelOrderRequest the new cancel order request
	 */
	public void setCancelOrderRequest(CancelOrderRequest cancelOrderRequest) {
		CancelOrderRequest = cancelOrderRequest;
	}

	/**
	 * Gets the uninstall order request.
	 *
	 * @return the uninstall order request
	 */
	public UninstallOrderRequest getUninstallOrderRequest() {
		return UninstallOrderRequest;
	}

	/**
	 * Sets the uninstall order request.
	 *
	 * @param uninstallOrderRequest the new uninstall order request
	 */
	public void setUninstallOrderRequest(UninstallOrderRequest uninstallOrderRequest) {
		UninstallOrderRequest = uninstallOrderRequest;
	}
	
	
}
