/**
 *
 */
package fr.lsi.openmoney.domain.generic;

/**
 * Default exit request
 *
 * @author Laurent SION
 *
 */
public class GenericOut {

	/**
	 * message
	 */
	private String message;

	/**
	 * code
	 */
	private Integer code;

	/**
	 * info
	 */
	private String info;

	/**
	 * Constructeur GenericOut
	 */
	public GenericOut() {
		super();
	}

	/**
	 * Constructor with arguments
	 *
	 * @param message return message
	 * @param info    return info
	 * @param code    return code
	 */
	public GenericOut(final String message, final String info, final Integer code) {
		this();
		this.message = message;
		this.info = info;
		this.code = code;
	}

	/**
	 * @return the message
	 */
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

	/**
	 * @return the info
	 */
	public final String getInfo() {
		return this.info;
	}

	/**
	 * @param info the info to set
	 */
	public final void setInfo(final String info) {
		this.info = info;
	}

}
