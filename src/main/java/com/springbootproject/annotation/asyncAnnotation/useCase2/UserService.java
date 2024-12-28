package com.springbootproject.annotation.asyncAnnotation.useCase2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService {
//    @Async
//    public void asyncMethodOfOwnThreadPool() {
//        System.out.println("inside own thread pool executor method: " + Thread.currentThread().getName());
//    }

    @Async("myThreadPoolExecutor2")
    public void asyncMethodOfOwnThreadPool() {

        System.out.println("inside own thread pool executor method: " + Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
