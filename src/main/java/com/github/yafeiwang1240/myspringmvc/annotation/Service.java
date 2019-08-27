package com.github.yafeiwang1240.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 服务层
 * @author wangyafei
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {

    String value() default "";
}
