package com.icefun.spring.interfaces;

import com.icefun.spring.MiniApplicationContext;

/**
 * 将 applicationContext 传递给 bean  某个bean 实现了这个接口，就能得到它的 applicationContext
 *
 */

public interface ApplicationContextAware {
    void setApplicationContext(MiniApplicationContext applicationContext);
}
