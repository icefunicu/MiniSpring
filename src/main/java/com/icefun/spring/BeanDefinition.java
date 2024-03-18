package com.icefun.spring;

/**
 * Bean的定义
 */

public class BeanDefinition {

    private Class clazz;
    private String scope;

    // 是否为单例对象
    public boolean isSingleton() {
        return "singleton".equals(scope);
    }

    public Class getClazz() {
        return clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "BeanDefinition{" +
                "clazz=" + clazz +
                ", scope='" + scope + '\'' +
                '}';
    }
}
