package com.github.yafeiwang1240.myspringmvc.context;

import com.github.yafeiwang1240.myspringmvc.beans.BeansException;
import com.github.yafeiwang1240.myspringmvc.beans.factory.Aware;

/**
 * application context aware
 *
 * @author wangyafei
 */
public interface ApplicationContextAware extends Aware {

    /**
     * Set the ApplicationContext that this object runs in.
     * Normally this call will be used to initialize the object.
     * <p>Invoked after population of normal bean properties but before an init callback such
     */
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
