package com.icefun.test.circularReferences;

import com.icefun.spring.anno.Autowired;



//@Component("c")
public class C implements CDInterface{
    // 采用 JDK 动态代理，注入的类型需要是接口类型
    @Autowired
    private CDInterface d;
}
