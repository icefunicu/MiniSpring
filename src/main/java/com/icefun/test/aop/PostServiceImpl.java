package com.icefun.test.aop;

import com.icefun.spring.anno.Component;



@Component("postService")
public class PostServiceImpl implements PostService {
    @Override
    public void post() {
        System.out.println("post........");
    }
}
