package org.specs2.spring.web;

import java.lang.annotation.*;

/**
 * @author janm
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WebContextConfiguration {

	String webXml() default "/WEB-INF/web.xml";

	String[] webContextLocations() default {};

	String[] contextLocations() default {};

	boolean useSpringSecurity() default false;


}
