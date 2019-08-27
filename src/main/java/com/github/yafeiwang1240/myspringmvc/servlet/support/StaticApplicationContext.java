package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Static Application Context
 *
 * @author wangyafei
 */
public class StaticApplicationContext implements ApplicationContext {

    private Map<Class<?>, Object> beanCache = new HashMap<>();

    private Map<Class<?>, Object> assignCache = new HashMap<>();

    public <T> T getBean(Class<T> requiredType) {
        if (beanCache.containsKey(requiredType)) {
            return (T) beanCache.get(requiredType);
        }
        if (assignCache.containsKey(requiredType)) {
            return (T) assignCache.get(requiredType);
        }
        for (Map.Entry<Class<?>, Object> entry : beanCache.entrySet()) {
            if (requiredType.isAssignableFrom(entry.getKey())) {
                assignCache.put(requiredType, entry.getValue());
                return (T) entry.getValue();
            }
        }
        return null;
    }

    public void setBean(Object bean) {
        if (bean == null) {
            return;
        }
        beanCache.put(bean.getClass(), bean);
    }
}
