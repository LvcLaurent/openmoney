package fr.lsi.openmoney.domain.generic;

import fr.lsi.openmoney.domain.exception.OpenMoneyException;

public interface Validator<T> {

	/**
	 * interface for validator
	 *
	 * @param object
	 * @throws JarvisException
	 */
	void isValid(T object) throws OpenMoneyException;

}
