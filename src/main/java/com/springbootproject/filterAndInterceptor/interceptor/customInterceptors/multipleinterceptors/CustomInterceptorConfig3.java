package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.multipleinterceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * request before reaching to specific controller class
 */
@Configuration
public class CustomInterceptorConfig3 implements WebMvcConfigurer {
    @Autowired
    MyCustomInterceptor3 myCustomInterceptor3;
    @Autowired
    MyCustomInterceptor4 myCustomInterceptor4;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myCustomInterceptor3)
                .addPathPatterns("/api/custom34/*")
                .excludePathPatterns("/api/updateuser", "/api/deleteuser");
        registry.addInterceptor(myCustomInterceptor4)
                .addPathPatterns("/api/custom34/*")
                .excludePathPatterns("/api/updateuser", "/api/deleteuser");
    }
}
