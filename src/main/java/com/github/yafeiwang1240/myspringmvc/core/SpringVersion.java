package com.github.yafeiwang1240.myspringmvc.core;

/**
 * version
 *
 * @author wangyafei
 */
public class SpringVersion {

    /**
     * Return the full version string of the present Spring codebase,
     * or {@code null} if it cannot be determined.
     * @see Package#getImplementationVersion()
     */
    public static String getVersion() {
        Package pkg = SpringVersion.class.getPackage();
        return (pkg != null ? pkg.getImplementationVersion() : null);
    }

}
