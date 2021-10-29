package com.wang.springframework;

import com.wang.springframework.bean.UserService;
import com.wang.springframework.factory.BeanFactory;
import com.wang.springframework.factory.config.BeanDefinition;
import com.wang.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author wjh
 * @version 1.0
 * ApiTest
 * @date 2021/10/26 20:58
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
//        BeanFactory beanFactory = new BeanFactory();
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        beanFactory.registerBeanDefinition("userService",beanDefinition);
//
//        UserService userService = (UserService)beanFactory.getBean("userService");
//        userService.queryUserInfo();
    }

    @Test
    public void test_BeanFactory1() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

    @Test
    public void test_BeanFactory2() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "WANG");
        userService.queryUserInfo();
    }


}
