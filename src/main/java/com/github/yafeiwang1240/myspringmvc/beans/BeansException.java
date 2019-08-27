package com.github.yafeiwang1240.myspringmvc.beans;

import com.github.yafeiwang1240.myspringmvc.core.NestedRuntimeException;

public class BeansException extends NestedRuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
