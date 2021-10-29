package com.wang.springframework.factory.config;

/**
 * @author wjh
 * @version 1.0
 * SingletonBeanRegistry
 * @date 2021/10/26 21:05
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
