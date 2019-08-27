package com.github.yafeiwang1240.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 数据层
 * @author wangyafei
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Repository {

    String value() default "";
}
