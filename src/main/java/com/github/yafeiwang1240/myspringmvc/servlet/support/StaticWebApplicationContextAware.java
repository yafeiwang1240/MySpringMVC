package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.beans.BeansException;
import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;
import com.github.yafeiwang1240.myspringmvc.context.ApplicationContextAware;

/**
 * static default Application Context Aware
 *
 * @author wangyafei
 */
public class StaticWebApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        StaticWebApplicationContextAware.applicationContext = applicationContext;
    }


    public static <T> T getBean(Class<T> requiredType) {
        return applicationContext.getBean(requiredType);
    }

    public static void setBean(Object bean) {
        if (applicationContext.getBean(bean.getClass()) != null) {
            throw new IllegalArgumentException("bean容器已存在该对象实例");
        }
        applicationContext.setBean(bean);
    }
}
