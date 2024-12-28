package com.springbootproject.annotation.asyncAnnotation.useCase1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserDetails {
    @Async
    public void asyncMethodTest() {
        System.out.println("Inside the async Method: " + Thread.currentThread().getName());
    }
}
