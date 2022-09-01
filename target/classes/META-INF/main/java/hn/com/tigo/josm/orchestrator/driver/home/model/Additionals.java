package hn.com.tigo.josm.orchestrator.driver.home.model;

import java.util.List;

/**
 * Additionals Object class needed to map the request objects.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 09-01-2022 02:25:12 PM 2022
 */
public class Additionals {

	/** Attribute that determine additional. */
	private List<Additional> additional;

	/**
	 * Sets the additional.
	 *
	 * @param additional the new additional
	 */
	public void setAdditional(List<Additional> additional) {
		this.additional = additional;
	}

	/**
	 * Gets the additional.
	 *
	 * @return the additional
	 */
	public List<Additional> getAdditional() {
		return this.additional;
	}

}
