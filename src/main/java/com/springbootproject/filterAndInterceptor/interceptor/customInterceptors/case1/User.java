package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.case1;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void getUser() {
        System.out.println("This is called from User bean");
    }
}
