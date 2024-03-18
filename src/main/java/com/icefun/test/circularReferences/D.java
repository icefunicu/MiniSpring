package com.icefun.test.circularReferences;

import com.icefun.spring.anno.Lazy;


//@Component("d")
public class D implements CDInterface {

    // 采用 JDK 动态代理，注入的类型需要是接口类型

    private CDInterface c;

    // 采用 JDK 动态代理
    public D(@Lazy CDInterface c) {

    }
}
