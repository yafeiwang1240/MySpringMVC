package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.context.WebApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

/**
 * Static Web Application Context {@link StaticWebApplicationContext}
 *
 * @author wangyafei
 */
public class StaticWebApplicationContext extends StaticApplicationContext implements WebApplicationContext {

    private ServletContext servletContext;

    private ServletConfig servletConfig;

    private String namespace;

    private static StaticWebApplicationContext instance;

    public static StaticWebApplicationContext getInstance() {
        if (instance == null) {
            synchronized (StaticWebApplicationContext.class) {
                if (instance == null) {
                    instance = new StaticWebApplicationContext();
                }
            }
        }
        return instance;
    }

    @Override
    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void setServletConfig(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
