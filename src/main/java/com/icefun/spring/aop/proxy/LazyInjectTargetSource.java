package com.icefun.spring.aop.proxy;

import com.icefun.spring.MiniApplicationContext;


// 用于构造方法注入时的延迟注入 有可能注入的是个多例 bean，所以每次都从容器中获取，不能缓存起来  做对象池和多例
public class LazyInjectTargetSource implements TargetSource {

    private final MiniApplicationContext applicationContext;
    private final String beanName;

    public LazyInjectTargetSource(MiniApplicationContext applicationContext, String beanName) {
        this.applicationContext = applicationContext;
        this.beanName = beanName;
    }

    @Override
    public Object getTarget() throws Exception {
        return applicationContext.getBean(beanName);
    }
}
