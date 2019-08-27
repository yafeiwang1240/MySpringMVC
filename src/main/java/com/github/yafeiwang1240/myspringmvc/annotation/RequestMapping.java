package com.github.yafeiwang1240.myspringmvc.annotation;

import com.github.yafeiwang1240.myspringmvc.enums.RequestMethod;

import java.lang.annotation.*;

/**
 * 映射表
 * @author wangyafei
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {

    String[] value() default {};

    RequestMethod[] method() default {};

    String[] params() default {};

    String[] headers() default {};

    String[] consumes() default {};

    String[] produces() default {};
}
