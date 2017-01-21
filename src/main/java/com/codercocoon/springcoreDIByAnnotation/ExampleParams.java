package com.codercocoon.springcoreDIByAnnotation;

import org.springframework.stereotype.Component;

/**
 * This class simulates generating some parameters for the examples : code and
 * description.
 * 
 * @author contact@codercocoon.com
 *
 */
@Component
public class ExampleParams {

	/**
	 * This method simulates generating some code.
	 * 
	 * @return a string of the code generated.
	 */
	public String generateCode() {
		return "Some code generated !";
	}

	/**
	 * This method simulates generating a description.
	 * 
	 * @return a string of the description generated.
	 */
	public String generateDescription() {
		return "Description generated !";
	}
}