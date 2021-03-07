/**
 *
 */
package fr.lsi.openmoney.domain.exception;

import fr.lsi.openmoney.domain.generic.GenericConstant;

/**
 * Class of exceptions
 *
 * @author Laurent SION
 *
 */
public class OpenMoneyException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -7694757065622241716L;

	/**
	 * Message pour le retour
	 */
	private String message;

	/**
	 * Information pour le retour
	 */
	private String information;

	/**
	 * Code retour
	 */
	private Integer code;

	/**
	 * Constructor
	 */
	public OpenMoneyException() {
		this.message = GenericConstant.RETURN_GENERIC_ERROR_MESSAGE;
		this.code = GenericConstant.RETURN_GENERIC_ERROR_CODE;
		this.information = GenericConstant.RETURN_GENERIC_ERROR_INFO;
	}

	/**
	 * @return the message
	 */
	@Override
	public final String getMessage() {
		return this.message;
	}

	/**
	 * @param message the message to set
	 */
	public final void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the information
	 */
	public final String getInformation() {
		return this.information;
	}

	/**
	 * @param information the information to set
	 */
	public final void setInformation(final String information) {
		this.information = information;
	}

	/**
	 * @return the code
	 */
	public final Integer getCode() {
		return this.code;
	}

	/**
	 * @param code the code to set
	 */
	public final void setCode(final Integer code) {
		this.code = code;
	}

}
