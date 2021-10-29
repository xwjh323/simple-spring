package com.wang.springframework.factory.support;

import com.wang.springframework.BeansException;
import com.wang.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author wjh
 * @version 1.0
 * InstantiationStrategy
 * @date 2021/10/29 18:32
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args)throws BeansException;
}
