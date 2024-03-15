package com.icefun.test;

import com.icefun.spring.interfaces.BeanPostProcessor;


//@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("[[[[[[   TestMSG   BeanPostProcessor-postProcessBeforeInitialization-初始化前: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("[[[[[[   TestMSG   BeanPostProcessor-postProcessAfterInitialization-初始化后: " + beanName);
        return bean;
    }
}
