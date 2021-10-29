package com.wang.springframework.factory;

import com.wang.springframework.BeansException;
import com.wang.springframework.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wjh
 * @version 1.0
 * BeanFactory
 * @date 2021/10/26 20:53
 */
public interface BeanFactory {


    public abstract Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
