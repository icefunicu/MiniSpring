package com.icefun.spring.interfaces;

/**
 * 三级缓存 对象工厂
 */

@FunctionalInterface
public interface ObjectFactory<T> {
    T getObject() throws RuntimeException;
}
