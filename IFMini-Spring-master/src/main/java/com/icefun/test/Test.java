package com.icefun.test;

import com.icefun.spring.MiniApplicationContext;
import com.icefun.test.Service.OrderService;
import com.icefun.test.Service.UserService;
import com.icefun.test.config.AppConfig;

/**
 * 测试类
 *

 */

public class Test {
    public static void main(String[] args) {
        MiniApplicationContext applicationContext = new MiniApplicationContext(AppConfig.class);

        UserService userService = applicationContext.getBean("userService", UserService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        System.out.println(userService);
        System.out.println(orderService);
    }
}
