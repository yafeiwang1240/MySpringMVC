package com.github.yafeiwang1240.myspringmvc.servlet.support;

import com.github.yafeiwang1240.myspringmvc.context.AfterListener;
import com.github.yafeiwang1240.myspringmvc.context.ApplicationListener;
import com.github.yafeiwang1240.myspringmvc.context.event.ContextStartedEvent;

import java.util.List;


public class AfterApplicationListener implements ApplicationListener<ContextStartedEvent> {

    private ContextStartedEvent event;

    private List<AfterListener> afterListeners;

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        this.event = event;
    }

}
