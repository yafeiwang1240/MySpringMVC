package com.github.yafeiwang1240.myspringmvc.annotation;

import java.lang.annotation.*;

/**
 * 依赖注入
 * @author wangyafei
 */
@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {

    boolean required() default true;

}
