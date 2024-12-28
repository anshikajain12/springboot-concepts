package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.multipleinterceptors;

import org.springframework.stereotype.Component;

@Component
public class UserDD {
    public void getUser() {
        System.out.println("This is called from UserDD bean");
    }
}
