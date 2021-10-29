package com.wang.springframework;

/**
 * @author wjh
 * @version 1.0
 * BeansException
 * @date 2021/10/26 21:06
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
