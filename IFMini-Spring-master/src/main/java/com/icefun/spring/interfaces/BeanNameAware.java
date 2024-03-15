package com.icefun.spring.interfaces;

/**
 * 将 beanName 传递给 bean  某个bean 实现了这个接口，就能得到它的 beanName
 *
 */

public interface BeanNameAware {
    void setBeanName(String beanName);
}
