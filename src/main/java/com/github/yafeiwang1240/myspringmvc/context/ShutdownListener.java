package com.github.yafeiwang1240.myspringmvc.context;

import java.util.EventListener;

public interface ShutdownListener extends EventListener {

    /**
     * Handle an application event.
     */
    void onApplicationEvent();

}
