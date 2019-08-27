package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationListener;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextStartedEvent;

public class ApplicationContextAwareListener implements ApplicationListener<ContextStartedEvent> {

    private ContextStartedEvent event;

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        this.event = event;
    }
}
