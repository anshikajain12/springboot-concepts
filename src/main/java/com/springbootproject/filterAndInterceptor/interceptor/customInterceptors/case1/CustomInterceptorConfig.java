package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * request before reaching to specific controller class
 */
@Configuration
public class CustomInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    MyCustomInterceptor myCustomInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myCustomInterceptor)
                .addPathPatterns("/api/custom/*")
                .excludePathPatterns("/api/updateuser", "/api/deleteuser");
    }
}
