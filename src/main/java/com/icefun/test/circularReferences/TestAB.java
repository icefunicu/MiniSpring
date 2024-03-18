package com.icefun.test.circularReferences;

import com.icefun.spring.MiniApplicationContext;
import com.icefun.test.config.AppConfig;



public class TestAB {
    public static void main(String[] args) {
        MiniApplicationContext applicationContext = new MiniApplicationContext(AppConfig.class);

        A a = applicationContext.getBean("a", A.class);
        B b = applicationContext.getBean("b", B.class);

        applicationContext.destroyBean("a", a);

        A a1 = applicationContext.getBean("a", A.class);
        B b1 = applicationContext.getBean("b", B.class);

        applicationContext.close();
    }
}
