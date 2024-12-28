package com.springbootproject.annotation.asyncAnnotation.useCase3;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService3 {
    @Async("myThreadPoolExecutor3")
    public void asyncMethodOfOwnThreadPool() {

        System.out.println("inside own java one thread pool executor method: " + Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
