package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.servlet.HandlerExecutionChain;
import com.github.yafeiwang1240.myspringmvc.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class VirtualHandlerMapping implements HandlerMapping {

    public Map<String, Map<String, HandlerExecutionChain>> mapping = new HashMap<>();

    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        return null;
    }
}
