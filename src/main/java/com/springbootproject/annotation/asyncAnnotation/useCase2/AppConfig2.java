package com.springbootproject.annotation.asyncAnnotation.useCase2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * creating our own custom threadPoolTaskExecutor
 */
@Configuration
public class AppConfig2 {
    @Bean(name = "myThreadPoolExecutor2")
    public Executor taskPoolExecutor() {
        int minPoolSize = 2;
        int maxPoolSize = 4;
        int queueSize = 3;
        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(minPoolSize);
        poolTaskExecutor.setMaxPoolSize(maxPoolSize);
        poolTaskExecutor.setQueueCapacity(queueSize);
        poolTaskExecutor.setThreadNamePrefix("MyThread-");
        poolTaskExecutor.initialize();
        return poolTaskExecutor;
    }
}
