package com.codercocoon.springcoreDIByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example class : we suppose that each example has a category, and some
 * parameters : description and code.
 * 
 * @author contact@codercocoon.com
 *
 */
@Component
public class Example {

	private ExampleParams params;
	private Category category;

	/**
	 * constructor-based dependency injection.
	 * 
	 * @param _params
	 *            : ExampleParams bean will be searched by its type and will be
	 *            injected automatically to params attribute.
	 */
	@Autowired
	public Example(ExampleParams _params) {
		this.params = _params;
	}

	/**
	 * Setter-based dependency injection.
	 * 
	 * @param category
	 *            : Category bean be searched by its type and will be injected
	 *            automatically to category attribute.
	 */
	@Autowired
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * params getter method.
	 * 
	 * @return parameters of the example.
	 */
	public ExampleParams getParams() {
		return params;
	}

	/**
	 * category getter method.
	 * 
	 * @return category of the example.
	 */
	public Category getCategory() {
		return category;
	}
}
