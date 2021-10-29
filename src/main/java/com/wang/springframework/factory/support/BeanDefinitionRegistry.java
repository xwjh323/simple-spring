package com.wang.springframework.factory.support;

import com.wang.springframework.factory.config.BeanDefinition;

/**
 * @author wjh
 * @version 1.0
 * BeanDefinitionRegistry
 * @date 2021/10/26 21:05
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
