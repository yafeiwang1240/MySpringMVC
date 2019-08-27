package com.github.yafeiwang1240.myspringmvc.context;

/**
 * application context
 */
public interface ApplicationContext {

    public <T> T getBean(Class<T> requiredType);

    public void setBean(Object bean);
}
