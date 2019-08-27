package com.github.yafeiwang1240.myspringmvc.beans.factory;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;
import com.github.yafeiwang1240.myspringmvc.servlet.support.StaticWebApplicationContextAware;

/**
 * StaticWebApplicationContextAware init {@link StaticWebApplicationContextAware}
 */
public class StaticWebApplicationContextAwareFactory {

    /**
     * init
     *
     * @param applicationContext
     */
    public static void initStaticWebApplicationContextAware(ApplicationContext applicationContext) {
        StaticWebApplicationContextAware aware = new StaticWebApplicationContextAware();
        aware.setApplicationContext(applicationContext);
    }
}
