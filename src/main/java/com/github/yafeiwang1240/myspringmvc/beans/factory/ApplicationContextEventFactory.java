package com.github.yafeiwang1240.myspringmvc.beans.factory;

import com.github.yafeiwang1240.myspringmvc.context.event.ContextClosedEvent;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextRefreshedEvent;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextStartedEvent;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextStoppedEvent;
import com.github.yafeiwang1240.myspringmvc.servlet.support.StaticWebApplicationContext;

/**
 *
 * @author wangyafei
 */
public class ApplicationContextEventFactory {

    /**
     * new Context Refreshed Event
     * @return
     */
    public static ContextRefreshedEvent newContextRefreshedEvent() {
        return new ContextRefreshedEvent(StaticWebApplicationContext.getInstance());
    }

    /**
     * new Context Started Event
     * @return
     */
    public static ContextStartedEvent newContextStartedEvent() {
        return new ContextStartedEvent(StaticWebApplicationContext.getInstance());
    }

    /**
     * new Context Stopped Event
     * @return
     */
    public static ContextStoppedEvent newContextStoppedEvent() {
        return new ContextStoppedEvent(StaticWebApplicationContext.getInstance());
    }

    /**
     * new Context Closed Event
     * @return
     */
    public static ContextClosedEvent newContextClosedEvent() {
        return new ContextClosedEvent(StaticWebApplicationContext.getInstance());
    }
}
