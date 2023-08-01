package com.elifintizam.aop.interceptor;

@MyInterceptor
public class Login {
    public String isLoginMethod(String data) {
        return "isLogin: " + data;
    }
}
