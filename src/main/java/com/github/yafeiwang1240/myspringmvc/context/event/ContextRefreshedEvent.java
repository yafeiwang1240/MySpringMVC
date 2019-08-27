package com.github.yafeiwang1240.myspringmvc.context.event;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;

public class ContextRefreshedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextRefreshedEvent.
     * @param source the {@code ApplicationContext} that has been initialized
     * or refreshed (must not be {@code null})
     */
    public ContextRefreshedEvent(ApplicationContext source) {
        super(source);
    }

}
