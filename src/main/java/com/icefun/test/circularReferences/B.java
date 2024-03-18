package com.icefun.test.circularReferences;

import com.icefun.spring.anno.Autowired;
import com.icefun.spring.interfaces.DisposableBean;



// A B 循环引用 需要至少有一个是单例Bean

//@Component("b")
//@Scope("prototype")
public class B implements DisposableBean {
    @Autowired
    private A a;

    @Override
    public void destroy() throws Exception {
        System.out.println("B destroy...");
    }
}
