package com.wang.springframework.factory.config;

/**
 * @author wjh
 * @version 1.0
 * BeanDefinition
 * @date 2021/10/26 20:52
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
