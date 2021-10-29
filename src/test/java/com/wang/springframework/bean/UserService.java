package com.wang.springframework.bean;

/**
 * @author wjh
 * @version 1.0
 * UserService
 * @date 2021/10/26 20:59
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }
    public void queryUserInfo(){
        System.out.println("查询用户信息"+name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
