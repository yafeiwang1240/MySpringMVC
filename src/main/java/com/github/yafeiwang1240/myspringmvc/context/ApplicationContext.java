package com.github.yafeiwang1240.myspringmvc.context;

import java.util.HashMap;
import java.util.Map;

/**
 * application context
 */
public class ApplicationContext {

    private Map<Class<?>, Object> beanCache = new HashMap<>();

    public <T> T getBean(Class<T> requiredType) {
        if (!beanCache.containsKey(requiredType)) {
            return null;
        }
        return (T) beanCache.get(requiredType);
    }

    public void setBean(Object bean) {
        if (bean == null) {
            return;
        }
        beanCache.put(bean.getClass(), bean);
    }
}
