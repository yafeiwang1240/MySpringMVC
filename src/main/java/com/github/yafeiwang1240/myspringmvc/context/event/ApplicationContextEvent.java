package com.github.yafeiwang1240.myspringmvc.context.event;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationContext;
import com.github.yafeiwang1240.myspringmvc.context.ApplicationEvent;

/**
 * Application Context Event
 * @author wangyafei
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Create a new ContextStartedEvent.
     * @param source the {@code ApplicationContext} that the event is raised for
     * (must not be {@code null})
     */
    public ApplicationContextEvent(ApplicationContext source) {
        super(source);
    }

    /**
     * Get the {@code ApplicationContext} that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
