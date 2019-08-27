package com.github.yafeiwang1240.myspringmvc.core;

public abstract class NestedRuntimeException extends RuntimeException {

    /**
     * Construct a {@code NestedRuntimeException} with the specified detail message.
     * @param msg the detail message
     */
    public NestedRuntimeException(String msg) {
        super(msg);
    }

    /**
     * Construct a {@code NestedRuntimeException} with the specified detail message
     * and nested exception.
     * @param msg the detail message
     * @param cause the nested exception
     */
    public NestedRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
