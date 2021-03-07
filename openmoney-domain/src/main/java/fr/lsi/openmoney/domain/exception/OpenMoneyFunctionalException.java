/**
 *
 */
package fr.lsi.openmoney.domain.exception;

/**
 * For Functional exceptions
 *
 * @author Laurent SION
 *
 */
public class OpenMoneyFunctionalException extends OpenMoneyException {

	/**
	 * ID class
	 */
	private static final long serialVersionUID = 5028656413507694340L;

	/**
	 * Constructor of a functional exception
	 *
	 * @param status
	 * @param message
	 * @param information
	 * @param code
	 */
	public OpenMoneyFunctionalException(final String message, final String information, final Integer code) {
		this.setCode(code);
		this.setInformation(information);
		this.setMessage(message);
	}

}
