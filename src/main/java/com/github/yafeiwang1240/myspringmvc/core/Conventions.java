package com.github.yafeiwang1240.myspringmvc.core;

import com.github.yafeiwang1240.myspringmvc.utils.Assert;
import com.github.yafeiwang1240.myspringmvc.utils.ClassUtils;

import java.io.Externalizable;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Conventions
 *
 * @author wangyafei
 */
public abstract class Conventions {
    /**
     * Suffix added to names when using arrays.
     */
    private static final String PLURAL_SUFFIX = "List";

    /**
     * Set of interfaces that are supposed to be ignored
     * when searching for the 'primary' interface of a proxy.
     */
    private static final Set<Class<?>> IGNORED_INTERFACES;

    static {
        IGNORED_INTERFACES = Collections.unmodifiableSet(new HashSet<Class<?>>(
                Arrays.<Class<?>>asList(Serializable.class, Externalizable.class, Cloneable.class, Comparable.class)));
    }


    public static String getVariableName(Object value) {
        Assert.notNull(value, "Value must not be null");
        Class<?> valueClass;
        boolean pluralize = false;

        if (value.getClass().isArray()) {
            valueClass = value.getClass().getComponentType();
            pluralize = true;
        }
        else if (value instanceof Collection) {
            Collection<?> collection = (Collection<?>) value;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Cannot generate variable name for an empty Collection");
            }
            Object valueToCheck = peekAhead(collection);
            valueClass = getClassForValue(valueToCheck);
            pluralize = true;
        }
        else {
            valueClass = getClassForValue(value);
        }

        String name = ClassUtils.getShortNameAsProperty(valueClass);
        return (pluralize ? pluralize(name) : name);
    }

    /**
     * Pluralize the given name.
     */
    private static String pluralize(String name) {
        return name + PLURAL_SUFFIX;
    }

    /**
     * Retrieves the {@code Class} of an element in the {@code Collection}.
     * The exact element for which the {@code Class} is retrieved will depend
     * on the concrete {@code Collection} implementation.
     */
    private static <E> E peekAhead(Collection<E> collection) {
        Iterator<E> it = collection.iterator();
        if (!it.hasNext()) {
            throw new IllegalStateException(
                    "Unable to peek ahead in non-empty collection - no element found");
        }
        E value = it.next();
        if (value == null) {
            throw new IllegalStateException(
                    "Unable to peek ahead in non-empty collection - only null element found");
        }
        return value;
    }

    /**
     * Determines the class to use for naming a variable that contains
     * the given value.
     * <p>Will return the class of the given value, except when
     * encountering a JDK proxy, in which case it will determine
     * the 'primary' interface implemented by that proxy.
     * @param value the value to check
     * @return the class to use for naming a variable
     */
    private static Class<?> getClassForValue(Object value) {
        Class<?> valueClass = value.getClass();
        if (Proxy.isProxyClass(valueClass)) {
            Class<?>[] ifcs = valueClass.getInterfaces();
            for (Class<?> ifc : ifcs) {
                if (!IGNORED_INTERFACES.contains(ifc)) {
                    return ifc;
                }
            }
        }
        else if (valueClass.getName().lastIndexOf('$') != -1 && valueClass.getDeclaringClass() == null) {
            // '$' in the class name but no inner class -
            // assuming it's a special subclass (e.g. by OpenJPA)
            valueClass = valueClass.getSuperclass();
        }
        return valueClass;
    }
}
