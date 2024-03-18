package com.icefun.test.Service;

import com.icefun.spring.anno.Autowired;
import com.icefun.spring.anno.Component;
import com.icefun.spring.anno.Scope;
import com.icefun.spring.interfaces.BeanNameAware;
import com.icefun.spring.interfaces.InitializingBean;



@Component("userService")
@Scope("prototype")
public class UserService implements BeanNameAware, InitializingBean {

    @Autowired
    private OrderService orderService;

    public OrderService getOrderService() {
        System.out.println(orderService);
        return orderService;
    }

    // BeanNameAware
    @Override
    public void setBeanName(String beanName) {
        System.out.println("[[[[[[   TestMSG   BeanNameAware-setBeanName-设置BeanName:" + this.getClass().getName() + " " + beanName);
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() {
        System.out.println("[[[[[[   TestMSG   InitializingBean-afterPropertiesSet-初始化:" + this.getClass().getName());
    }
}
