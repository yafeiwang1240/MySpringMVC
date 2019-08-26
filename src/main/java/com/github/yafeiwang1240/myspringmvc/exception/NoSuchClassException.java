package com.github.yafeiwang1240.myspringmvc.exception;

public class NoSuchClassException extends Exception {

    public NoSuchClassException(String msg) {
        super(msg);
    }

    public NoSuchClassException(String msg, Throwable t) {
        super(msg, t);
    }
}
