package com.icefun.test.aop;

import com.icefun.spring.MiniApplicationContext;
import com.icefun.test.config.AppConfig;



public class PostServiceTest {
    public static void main(String[] args) {
        MiniApplicationContext applicationContext = new MiniApplicationContext(AppConfig.class);
        PostService postService = applicationContext.getBean("postService", PostService.class);
        postService.post();
    }
}
