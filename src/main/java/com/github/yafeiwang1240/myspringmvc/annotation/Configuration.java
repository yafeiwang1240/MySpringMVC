package com.github.yafeiwang1240.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 初始化
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Configuration {

    String value() default "";
}
