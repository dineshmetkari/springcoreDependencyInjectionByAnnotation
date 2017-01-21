package com.codercocoon.test.springcoreDIByAnnotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codercocoon.springcoreDIByAnnotation.ApplicationConfig;
import com.codercocoon.springcoreDIByAnnotation.Example;

/**
 * Test class instead Java-based config.
 * 
 * @author contact@codercocoon.com
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class ApplicationJavaConfigTest {

	@Autowired
	private ApplicationContext contextJavaConfig;

	/**
	 * This test case checks if the example has a generated description.
	 */
	@Test
	public void testExampleDescriptionJavaConfig() {
		Example ex = contextJavaConfig.getBean(Example.class);
		Assert.assertFalse(ex.getParams().generateDescription().isEmpty());
	}

	/**
	 * This test case checks if the example has a generated code.
	 */
	@Test
	public void testExampleCodeJavaConfig() {
		Example ex = contextJavaConfig.getBean(Example.class);
		Assert.assertFalse(ex.getParams().generateCode().isEmpty());
	}

	/**
	 * This test case checks if the example has a category.
	 */
	@Test
	public void testExampleCategoryJavaConfig() {
		Example ex = contextJavaConfig.getBean(Example.class);
		Assert.assertFalse(ex.getCategory().toString().isEmpty());
	}
}
