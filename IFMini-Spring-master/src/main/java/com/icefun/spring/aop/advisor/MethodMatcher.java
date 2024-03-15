package com.icefun.spring.aop.advisor;

import java.lang.reflect.Method;


// 判断哪些方法需要被拦截
public interface MethodMatcher {
    // 判断哪些方法需要被拦截
    boolean matches(Method method, Class<?> targetClass);
}
