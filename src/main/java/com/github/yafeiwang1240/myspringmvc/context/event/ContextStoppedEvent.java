package com.github.yafeiwang1240.myspringmvc.context.event;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;

public class ContextStoppedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextStoppedEvent.
     * @param source the {@code ApplicationContext} that has been stopped
     * (must not be {@code null})
     */
    public ContextStoppedEvent(ApplicationContext source) {
        super(source);
    }

}
