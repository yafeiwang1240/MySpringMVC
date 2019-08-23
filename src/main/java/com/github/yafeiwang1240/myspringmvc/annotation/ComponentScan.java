package com.github.yafeiwang1240.myspringmvc.annotation;

import com.github.yafeiwang1240.myspringmvc.enums.FilterType;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ComponentScan {

    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Filter[] includeFilters() default {};

    Filter[] excludeFilters() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({})
    @interface Filter {

        FilterType type() default FilterType.ANNOTATION;

        Class<?>[] value() default {};

        Class<?>[] classes() default {};

        String[] pattern() default {};

    }
}
