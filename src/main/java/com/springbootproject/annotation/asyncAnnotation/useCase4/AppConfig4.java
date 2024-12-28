package com.springbootproject.annotation.asyncAnnotation.useCase4;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * creating our own custom threadPoolTaskExecutor(java one)
 */
@Configuration
public class AppConfig4 implements AsyncConfigurer {
    private ThreadPoolExecutor poolExecutor;

    @Override
    public synchronized Executor getAsyncExecutor() {
        if (poolExecutor == null) {
            int minPoolSize = 2;
            int maxPoolSize = 4;
            int queueSize = 3;
            ThreadPoolExecutor poolTaskExecutor = new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), new CustomThreadFactory4());
        }
        return poolExecutor;
    }

    class CustomThreadFactory4 implements ThreadFactory {
        private final AtomicInteger threadNo = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("MyCustomThread-" + threadNo.getAndIncrement());
            return thread;
        }
    }
}
