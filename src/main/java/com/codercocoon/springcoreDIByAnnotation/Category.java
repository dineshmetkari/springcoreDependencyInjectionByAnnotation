package com.codercocoon.springcoreDIByAnnotation;

import org.springframework.stereotype.Component;

/**
 * This class represents the category of examples, category will be setted by
 * default as "Category title".
 * 
 * @author contact@codercocoon.com
 *
 */
@Component
public class Category {
	private String title = "Category title";

	public String toString() {
		return title;
	}
}