package com.github.yafeiwang1240.myspringmvc.context.event;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;

public class ContextStartedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextStartedEvent.
     * @param source the {@code ApplicationContext} that has been started
     * (must not be {@code null})
     */
    public ContextStartedEvent(ApplicationContext source) {
        super(source);
    }

}