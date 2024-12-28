package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.case2;

import org.springframework.stereotype.Component;

@Component
public class User2 {
    @MyCustomAnnotation(name = "user2")
    public void getUser() {
        System.out.println("This is called from User2 bean.....");
    }
}
