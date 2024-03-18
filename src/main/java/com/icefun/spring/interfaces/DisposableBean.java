package com.icefun.spring.interfaces;

/**
 * 对象销毁
 */

public interface DisposableBean {
    void destroy() throws Exception;
}
