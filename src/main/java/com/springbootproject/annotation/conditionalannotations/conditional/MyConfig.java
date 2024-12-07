package com.springbootproject.annotation.conditionalannotations.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(name = "Conditional")
    @Conditional(MyCondition.class)
    public MyBean myBean() {
        return new MyBean();
    }
}
