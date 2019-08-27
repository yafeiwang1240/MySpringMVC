package com.github.yafeiwang1240.myspringmvc.context;

import javax.servlet.ServletContext;

/**
 * Web Application Context {@link WebApplicationContext}
 *
 * @author wangyafei
 */
public interface WebApplicationContext extends ApplicationContext {
    public ServletContext getServletContext();
}
