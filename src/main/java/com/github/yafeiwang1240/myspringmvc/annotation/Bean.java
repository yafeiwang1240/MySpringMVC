package com.github.yafeiwang1240.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * bean
 * @author wangyafei
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bean {

    String[] name() default {};
}
