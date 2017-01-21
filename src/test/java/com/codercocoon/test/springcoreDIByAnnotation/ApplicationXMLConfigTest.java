package com.codercocoon.test.springcoreDIByAnnotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codercocoon.springcoreDIByAnnotation.Example;

/**
 * Test class instead XML-based config.
 * 
 * @author contact@codercocoon.com
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ApplicationXMLConfigTest {

	@Autowired
	private ApplicationContext contextXMLConfig;

	/**
	 * This test case checks if the example has a generated description.
	 */
	@Test
	public void testExampleDescriptionXMLConfig() {
		Example ex = contextXMLConfig.getBean(Example.class);
		Assert.assertFalse(ex.getParams().generateDescription().isEmpty());
	}

	/**
	 * This test case checks if the example has a generated code.
	 */
	@Test
	public void testExampleCodeXMLConfig() {
		Example ex = contextXMLConfig.getBean(Example.class);
		Assert.assertFalse(ex.getParams().generateCode().isEmpty());
	}

	/**
	 * This test case checks if the example has a category.
	 */
	@Test
	public void testExampleCategoryXMLConfig() {
		Example ex = contextXMLConfig.getBean(Example.class);
		Assert.assertFalse(ex.getCategory().toString().isEmpty());
	}
}
