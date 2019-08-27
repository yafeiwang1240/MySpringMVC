package com.github.yafeiwang1240.myspringmvc.context.event;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {

    /**
     * Creates a new ContextClosedEvent.
     * @param source the {@code ApplicationContext} that has been closed
     * (must not be {@code null})
     */
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }

}
