package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.servlet.HandlerExecutionChain;

import javax.servlet.http.HttpServletRequest;

/**
 * StaticHandlerMapping {@link StaticHandlerMapping}
 *
 * @author wangyafei
 */
public class StaticHandlerMapping {

    public static VirtualHandlerMapping handlerMapping = new VirtualHandlerMapping();

    /**
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        return handlerMapping.getHandler(request);
    }

}
