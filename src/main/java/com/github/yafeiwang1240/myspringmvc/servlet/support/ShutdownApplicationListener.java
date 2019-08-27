package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.context.ApplicationListener;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextStoppedEvent;

public class ShutdownApplicationListener implements ApplicationListener<ContextStoppedEvent> {

    private ContextStoppedEvent event;

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        this.event = event;
    }


}
