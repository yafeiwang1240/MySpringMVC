package com.github.yafeiwang1240.myspringmvc.beans.factory;

import com.github.yafeiwang1240.myspringmvc.servlet.support.StaticWebApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

/**
 * StaticWebApplicationContext factory
 *
 * @author wangyafei
 */
public class StaticWebApplicationContextFactory {

    /**
     * 获取单例
     * @param servletContext
     * @param servletConfig
     * @param namespace
     * @return
     */
    public static StaticWebApplicationContext staticWebApplicationContextInstance(
            ServletContext servletContext, ServletConfig servletConfig, String namespace) {
        StaticWebApplicationContext context = StaticWebApplicationContext.getInstance();
        context.setNamespace(namespace);
        context.setServletConfig(servletConfig);
        context.setServletContext(servletContext);
        return context;
    }
}
