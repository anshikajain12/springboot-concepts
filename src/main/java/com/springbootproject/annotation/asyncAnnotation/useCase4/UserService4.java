package com.springbootproject.annotation.asyncAnnotation.useCase4;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService4 {
    @Async
    public void asyncMethodOfOwnThreadPool() {
        System.out.println("inside own java one thread pool executor method: " + Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
