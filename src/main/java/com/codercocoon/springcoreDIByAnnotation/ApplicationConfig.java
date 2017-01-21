package com.codercocoon.springcoreDIByAnnotation;

import org.springframework.context.annotation.ComponentScan;

/**
 * This a spring configuration class, in the case that it returns some beans,
 * then it must have @Configuration annotation. No need for this example.
 * 
 * @author contact@codercocoon.com
 *
 */

@ComponentScan(value = { "com.codercocoon.springcoreDIByAnnotation" })
public class ApplicationConfig {

}