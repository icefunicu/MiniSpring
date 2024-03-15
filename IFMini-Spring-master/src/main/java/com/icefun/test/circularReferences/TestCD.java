package com.icefun.test.circularReferences;

import com.icefun.spring.MiniApplicationContext;
import com.icefun.test.config.AppConfig;


public class TestCD {
    public static void main(String[] args) {
        MiniApplicationContext applicationContext = new MiniApplicationContext(AppConfig.class);

        C c = applicationContext.getBean("c", C.class);
        D d = applicationContext.getBean("d", D.class);

    }
}
