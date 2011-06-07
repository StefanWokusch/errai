package org.jboss.errai.ioc.rebind.ioc.codegen.meta;

import com.google.gwt.core.ext.typeinfo.JClassType;
import org.jboss.errai.ioc.rebind.ioc.codegen.meta.impl.MetaType;

/**
 * @author Mike Brock <cbrock@redhat.com>
 */
public abstract class MetaClass implements HasAnnotations, MetaType, MetaGenericDeclaration {
    public abstract String getName();

    public abstract String getFullyQualifedName();

    public abstract MetaMethod[] getMethods();

    public abstract MetaMethod[] getDeclaredMethods();

    public abstract MetaMethod getMethod(String name, Class... parameters);

    public abstract MetaMethod getMethod(String name, MetaClass... parameters);

    public abstract MetaMethod getBestMatchingMethod(String name, Class... parameters);

    public abstract MetaMethod getBestMatchingMethod(String name, MetaClass... parameters);

    public abstract MetaMethod getDeclaredMethod(String name, Class... parameters);

    public abstract MetaMethod getDeclaredMethod(String name, MetaClass... parameters);

    public abstract MetaField[] getFields();

    public abstract MetaField[] getDeclaredFields();

    public abstract MetaField getField(String name);

    public abstract MetaField getDeclaredField(String name);

    public abstract MetaConstructor[] getConstructors();

    public abstract MetaConstructor[] getDeclaredConstructors();

    public abstract MetaConstructor getConstructor(Class... parameters);

    public abstract MetaConstructor getConstructor(MetaClass... parameters);

    public abstract MetaConstructor getBestMatchingConstructor(Class... parameters);

    public abstract MetaConstructor getBestMatchingConstructor(MetaClass... parameters);

    public abstract MetaConstructor getDeclaredConstructor(Class... parameters);

    public abstract MetaParameterizedType getParameterizedType();

    public abstract MetaClass[] getInterfaces();

    public abstract MetaClass getSuperClass();

    public abstract MetaClass getComponentType();

    public abstract boolean isAssignableFrom(MetaClass clazz);

    public abstract boolean isAssignableTo(MetaClass clazz);

    public abstract boolean isAssignableFrom(Class clazz);

    public abstract boolean isAssignableTo(Class clazz);

    public abstract boolean isAssignableFrom(JClassType clazz);

    public abstract boolean isAssignableTo(JClassType clazz);

    public abstract boolean isInterface();

    public abstract boolean isAbstract();

    public abstract boolean isArray();

    public abstract boolean isEnum();

    public abstract boolean isAnnotation();

    public abstract boolean isPublic();

    public abstract boolean isPrivate();

    public abstract boolean isProtected();

    public abstract boolean isFinal();

    public abstract boolean isStatic();

    public abstract Class<?> asClass();
    
    public abstract MetaClass box();
    
    public abstract MetaClass unbox();
}
