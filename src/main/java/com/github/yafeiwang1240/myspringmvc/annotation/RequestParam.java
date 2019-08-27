package com.github.yafeiwang1240.myspringmvc.annotation;

import com.github.yafeiwang1240.myspringmvc.web.bind.ValueConstants;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {

    /**
     * The name of the request parameter to bind to.
     */
    String value() default "";

    /**
     * Whether the parameter is required.
     * <p>Default is {@code true}, leading to an exception thrown in case
     * of the parameter missing in the request. Switch this to {@code false}
     * if you prefer a {@code null} in case of the parameter missing.
     * <p>Alternatively, provide a {@link #defaultValue() defaultValue},
     * which implicitly sets this flag to {@code false}.
     */
    boolean required() default true;

    /**
     * The default value to use as a fallback when the request parameter value
     * is not provided or empty. Supplying a default value implicitly sets
     * {@link #required()} to false.
     */
    String defaultValue() default ValueConstants.DEFAULT_NONE;

}
