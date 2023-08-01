package com.elifintizam.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@MyInterceptor
public class InterceptorRealWork {

    @AroundInvoke
    public Object log(InvocationContext context) {
        System.out.println("First step: " + context.getMethod().getName());

        boolean isLogin = false; // interceptor variable
        Object isContinue = null; // if interceptor doesn't work, continue

        if(isLogin){
            System.out.println("Login!");
            return null;
        }else{
            try{
                isContinue = context.proceed(); // Devam etmesini sağlar
                System.out.println("Second step: " + isContinue);
            } catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;

        }


    }
}
