package org.theta.joobase.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author ranger
 * @date Jul 12, 2017
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JooQuery {
	String value();

	JooParameterPolicy parameterPolicy() default JooParameterPolicy.ByOrder;
}
