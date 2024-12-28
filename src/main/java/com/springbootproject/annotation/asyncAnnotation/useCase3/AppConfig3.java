package com.springbootproject.annotation.asyncAnnotation.useCase3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * creating our own custom threadPoolTaskExecutor(java one)
 */
@Configuration
public class AppConfig3 {
    @Bean(name = "myThreadPoolExecutor3")
    public Executor taskPoolExecutor() {
        int minPoolSize = 2;
        int maxPoolSize = 4;
        int queueSize = 3;
        ThreadPoolExecutor poolTaskExecutor = new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), new CustomThreadFactory());
        return poolTaskExecutor;
    }

    class CustomThreadFactory implements ThreadFactory {
        private final AtomicInteger threadNo = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("MyCustomThread-" + threadNo.getAndIncrement());
            return thread;
        }
    }
}
