package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.web.WebApplicationInitializer;
import com.github.yafeiwang1240.myspringmvc.web.config.RootConfigurer;
import com.github.yafeiwang1240.myspringmvc.web.config.WebMvcConfigurer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * AbstractDispatcherServletInitializer
 *
 * @author wangyafei
 */
public abstract class AbstractDispatcherServletInitializer implements WebApplicationInitializer {

    private ServletContext servletContext;

    public final void onStartup(ServletContext servletContext) throws ServletException {
        this.servletContext = servletContext;
    }

    protected abstract Class<RootConfigurer>[] getRootConfigClasses();

    protected abstract Class<WebMvcConfigurer>[] getServletConfigClasses() ;

    protected abstract Class<Filter>[] getServletFilters();
}
